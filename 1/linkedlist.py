class Node():
    def __init__(self,data):
        self.data=data
        self.next=None

class LinkedList():
    def __init__(self):
        self.head=None

    def addNode(self,data):
        newnode=Node(data)
        if self.head is None:
            self.head=newnode
        else:
            current=self.head
            while current.next:
                current=current.next
            current.next=newnode

    def display(self):
        current=self.head
        while current:
            print(current.data, end=' ')
            current=current.next

linkedlist=LinkedList()
linkedlist.addNode('halo')
linkedlist.addNode("p")
linkedlist.addNode('owh')
linkedlist.display()