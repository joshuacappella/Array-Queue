/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.joshuacappella.array.queue;

/**
 *
 * @author Joshua Cappella
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E> {

    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/

    // static variable  ///copied from slides
    private static final int DEFAULT_SIZE = 50;
    
    // instance variables   ///copied from slides
    private E[] qArray; 
    // private int size = 0; ///critical, from slides for queues

    // constructors ///copied from slides
    public ArrayQueue () {
        this (DEFAULT_SIZE);
    }
    public ArrayQueue (int newCapacity) {
        qArray = (E[]) new Object[newCapacity]; 
    }

    /**
     *
     * @param element
     */
    @Override
    public void enqueue(E element) {
        /* if (size == qArray.length){
            E[] newArray = (E[]) new Object[qArray.length * 2];
            for (int i=0; i < size; i++) { 
                newArray[i] = qArray[(front + i) % qArray.length]; 
            }
            qArray = newArray;
            front = 0;
        } */ ///critical for implementation, from slides
    }

    /**
     *
     * @return
     */
    @Override
    public E dequeue() {
        System.out.println("dequeue() not yet implemented");
        return null;
    }

    /**
     *
     * @return
     * @throws com.joshuacappella.array.queue.QueueEmptyException
     */
    @Override
    public E front() {
        System.out.println("front() not yet implemented");
        return null;
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        System.out.println("size() not yet implemented");
        return 0;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        System.out.println("isEmpty() not yet implemented");
        return false;
    }
}
