/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.joshuacappella.array.queue;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * While there are no dedicated constructor tests, both the default constructor
 * and user-specified size constructor are tested in several of the tests.
 * @author Joshua Cappella
 */
public class QueueTest {
    
    public QueueTest() { 
    }
    
    /**
    * Test of simple enqueue, dequeue, and front methods
    */
    @Test
    public void testSimple() throws InvalidDataException, QueueEmptyException{
        System.out.println("Test of enqueue");
        ArrayQueue first = new ArrayQueue<Integer>(1);
        first.enqueue(1);
        assertEquals(first.front(), 1);
        assertEquals(first.dequeue(), 1);
    }

    /**
     * Test of enqueue method's InvalidDataException, of class Queue.
     */
    @Test
    public void testInvalidDataException() throws InvalidDataException{
        System.out.println("Test of InvalidDataException");
        ArrayQueue second = new ArrayQueue<Boolean>();
        InvalidDataException thrown = assertThrows(
           InvalidDataException.class,
            () -> second.enqueue(null));
        assertTrue(thrown.getMessage().contentEquals("Null input cannot"
                + " be enqueued."));
    }

    /**
     * Test of dequeue's QueueEmptyException method, of class Queue.
     */
    @Test
    public void testQueueEmptyException1() throws QueueEmptyException{
        System.out.println("Test of InvalidDataException thrown from dequeue");
        ArrayQueue third = new ArrayQueue<String>();
        QueueEmptyException thrown = assertThrows(
           QueueEmptyException.class,
            () -> third.dequeue());
        assertTrue(thrown.getMessage().contentEquals("Since queue is "
                + "empty, no element can be obtained."));
    }

    /**
     * Test of front's QueueEmptyException method, of class Queue.
     */
    @Test
    public void testQueueEmptyException2() throws QueueEmptyException{
        System.out.println("Test of InvalidDataException thrown from front");
        ArrayQueue fourth = new ArrayQueue<String>();
        QueueEmptyException thrown = assertThrows(
           QueueEmptyException.class,
            () -> fourth.front());
        assertTrue(thrown.getMessage().contentEquals("Front of queue "
                + "is not accessible, since queue is empty."));
    }
    
    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty1() {
        System.out.println("Test of size method");
        ArrayQueue fifth = new ArrayQueue<String>();
        fifth.enqueue("thing1");
        fifth.dequeue();
        assertEquals(fifth.isEmpty(), true);
    }
    
    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty2() {
        System.out.println("Test of size method");
        ArrayQueue sixth = new ArrayQueue<String>();
        sixth.enqueue("Swimming");
        sixth.enqueue("in");
        sixth.enqueue("Cedar");
        sixth.enqueue("Lake");
        sixth.enqueue("is");
        sixth.enqueue("fun");
        assertEquals(sixth.isEmpty(), false);
    }

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        System.out.println("Test of size method");
        ArrayQueue seventh = new ArrayQueue<String>();
        seventh.enqueue("Cycling");
        seventh.enqueue("underwater");
        seventh.enqueue("is");
        seventh.enqueue("a");
        seventh.enqueue("great");
        seventh.enqueue("adventure");
        assertEquals(seventh.size(), 6);
    }
    
    /**
     * Test of looping in arrayQueue.
     */
    @Test
    public void testLoop() {
        System.out.println("Test of size method");
        ArrayQueue eighth = new ArrayQueue<String>(3);
        eighth.enqueue("Cycling");
        eighth.dequeue();
        eighth.enqueue("is");
        eighth.enqueue("better");
        eighth.enqueue("than");
        eighth.dequeue();
        eighth.dequeue();
        eighth.enqueue("programming");
        assertEquals(eighth.front(), "than");
        assertEquals(eighth.size(), 2);
    }
    
    /**
     * Test of increasing array size.
     */
    @Test
    public void testSizeIncrease() {
        System.out.println("Test of size method");
        ArrayQueue ninth = new ArrayQueue<String>(2);
        ninth.enqueue("Sleep");
        ninth.enqueue("sounds");
        ninth.enqueue("really");
        ninth.dequeue();
        ninth.enqueue("nice");
        ninth.enqueue("right");
        ninth.enqueue("now");
        assertEquals(ninth.front(), "sounds");
        assertEquals(ninth.size(), 5);
    }
}
