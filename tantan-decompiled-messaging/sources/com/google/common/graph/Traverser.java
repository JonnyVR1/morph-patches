package com.google.common.graph;

import java.util.Deque;
import p149l.o9j0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Traverser<N> {

    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t) {
                deque.addFirst(t);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t) {
                deque.addLast(t);
            }
        };

        public abstract <T> void insertInto(Deque<T> deque, T t);

        /* synthetic */ InsertionOrder(o9j0 o9j0Var) {
            this();
        }
    }
}
