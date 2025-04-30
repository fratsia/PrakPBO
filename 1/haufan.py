class Node():
    def __init__(self):
        self.kiri=None
        self.kanan=None

class Data():
    def __init__(self, data:str):
        data=data.lower()
        self.freq={}
        keys=set(data)
        for char in keys:
            jumlah=data.count(char)
            self.freq[char]=jumlah

        self.freq=dict(sorted(self.freq.items(), key=lambda item: item[1]))

        print(self.freq)

teks="NAIK DELMAN"
Data(teks)
