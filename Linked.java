class Linked {
    public static void main(String[] args) {
        Node nodeA = new Node(6);
        Node nodeB = new Node(3);
        Node nodeC = new Node(4);
        Node nodeD = new Node(2);
        Node nodeE = new Node(1);

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println(nodeA);
    }
    
}