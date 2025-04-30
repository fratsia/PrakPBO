import heapq
from collections import defaultdict, Counter

# Node untuk pohon Huffman
class HuffmanNode:
    def __init__(self, char=None, freq=0):
        self.char = char
        self.freq = freq
        self.left = None
        self.right = None
    
    def __lt__(self, other):  # Untuk priority queue (min-heap)
        return self.freq < other.freq

# Bangun pohon Huffman
def build_huffman_tree(text):
    freq = Counter(text)
    heap = [HuffmanNode(char, f) for char, f in freq.items()]
    heapq.heapify(heap)

    while len(heap) > 1:
        node1 = heapq.heappop(heap)
        node2 = heapq.heappop(heap)

        merged = HuffmanNode(freq=node1.freq + node2.freq)
        merged.left = node1
        merged.right = node2
        heapq.heappush(heap, merged)

    return heap[0]  # Root tree

# Buat kamus kode Huffman dari tree
def build_codes(root):
    codes = {}
    def generate_code(node, current_code=""):
        if node is None:
            return
        if node.char is not None:
            codes[node.char] = current_code
        generate_code(node.left, current_code + "0")
        generate_code(node.right, current_code + "1")
    generate_code(root)
    return codes

# Encode teks menggunakan kode Huffman
def huffman_encode(text, codes):
    return ''.join(codes[char] for char in text)

# ✅ Contoh penggunaan:
text = "BIG_BOB_BITES_BANANAS"
root = build_huffman_tree(text)
codes = build_codes(root)
encoded_text = huffman_encode(text, codes)

# Output
print("Teks asli:", text)
print("Kode Huffman:", codes)
print("Teks terkompresi:", encoded_text)
