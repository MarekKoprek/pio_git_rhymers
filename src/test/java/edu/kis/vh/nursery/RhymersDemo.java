package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

class RhymersDemo {

    private static String REJECTED_MESSAGE = "total rejected is ";
	private static int J_MAX = 3;
	private static int I_MAX = 15;

	public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        
        DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
                factory.getFIFORhymer(), factory.getHanoiRhymer()};
        
        for (int i = 1; i < I_MAX; i++)
            for (int j = 0; j < J_MAX; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < I_MAX; i++)
            rhymers[3].countIn(rn.nextInt(20));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println(REJECTED_MESSAGE
                + ((HanoiRhymer) rhymers[3]).reportRejected());
        
    }
    
}