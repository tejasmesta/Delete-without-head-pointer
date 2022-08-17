class Solution
{
    void deleteNode(Node del)
    {
         // Your code here
         Node n = del.next;
         del.data = n.data;
         del.next = n.next;
    }
}
