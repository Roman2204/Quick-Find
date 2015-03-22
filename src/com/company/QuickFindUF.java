package com.company;

public class QuickFindUF
{
    private int[] id;

    public QuickFindUF(int N)
    {
        id = new int[N];
        for (int i = 0; i < N; i ++)
            id[i] = i;
    }

    public boolean connected (int p, int q)
    {
        return id[p] == id[q];
    }

    public void union (int p, int q)
    {
        int pid = id[p];
        int qid = id[q];

        for (int i = 0; i < id.length; i ++)
            if ( id[i] == pid )
                id[i] = qid;
    }

    public void printIDs ()
    {
        System.out.print("id[]:");
        for (int i = 0; i < id.length; i++)
            System.out.print(" " + id[i]);
        System.out.println();
    }


    public static void main(String[] args)
    {
        /* Quick Find demo from Coursera */
        QuickFindUF QuickFind1 = new QuickFindUF(10);
        QuickFind1.printIDs();
        QuickFind1.union(4, 3);
        QuickFind1.union(3, 8);
        QuickFind1.union(6, 5);
        QuickFind1.union(9, 4);
        QuickFind1.union(2, 1);
        QuickFind1.printIDs();
        System.out.println("connected(8, 9) = " + QuickFind1.connected(8, 9));
        System.out.println("connected(5, 0) = " + QuickFind1.connected(5, 0));
        QuickFind1.union(5, 0);
        QuickFind1.union(7, 2);
        QuickFind1.union(6, 1);
        QuickFind1.printIDs();
    }
}
