package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
class EventBus implements Subscriber, Publisher {
    private final Executor defaultExecutor;

    @GuardedBy("this")
    private final Map<Class<?>, ConcurrentHashMap<EventHandler<Object>, Executor>> handlerMap = new HashMap();

    @GuardedBy("this")
    private Queue<Event<?>> pendingEvents = new ArrayDeque();

    public EventBus(Executor executor) {
        this.defaultExecutor = executor;
    }

    private synchronized Set<Map.Entry<EventHandler<Object>, Executor>> getHandlers(Event<?> event) {
        ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap;
        try {
            concurrentHashMap = this.handlerMap.get(event.getType());
        } catch (Throwable th) {
            throw th;
        }
        return concurrentHashMap == null ? Collections.EMPTY_SET : concurrentHashMap.entrySet();
    }

    public void enablePublishingAndFlushPending() {
        Queue<Event<?>> queue;
        synchronized (this) {
            try {
                queue = this.pendingEvents;
                if (queue != null) {
                    this.pendingEvents = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator<Event<?>> it = queue.iterator();
            while (it.hasNext()) {
                publish(it.next());
            }
        }
    }

    @Override // com.google.firebase.events.Publisher
    public void publish(final Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            try {
                Queue<Event<?>> queue = this.pendingEvents;
                if (queue != null) {
                    queue.add(event);
                    return;
                }
                for (final Map.Entry<EventHandler<Object>, Executor> entry : getHandlers(event)) {
                    entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((EventHandler) entry.getKey()).handle(event);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        try {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.handlerMap.containsKey(cls)) {
                this.handlerMap.put(cls, new ConcurrentHashMap<>());
            }
            this.handlerMap.get(cls).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.handlerMap.containsKey(cls)) {
            ConcurrentHashMap<EventHandler<Object>, Executor> concurrentHashMap = this.handlerMap.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.handlerMap.remove(cls);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.defaultExecutor, eventHandler);
    }
}
