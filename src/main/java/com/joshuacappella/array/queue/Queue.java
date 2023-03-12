/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.joshuacappella.array.queue;

/**
 *
 * @author Joshua Cappella
 */
public interface Queue<E> { 
    public void enqueue (E element) throws InvalidDataException; 
    public E dequeue () throws QueueEmptyException; 
    public E front () throws QueueEmptyException; 
    public int size(); 
    public boolean isEmpty(); 
} 