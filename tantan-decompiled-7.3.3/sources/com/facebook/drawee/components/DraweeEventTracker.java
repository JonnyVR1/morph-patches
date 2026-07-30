package com.facebook.drawee.components;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public class DraweeEventTracker {

    /* JADX INFO: renamed from: b */
    public static final DraweeEventTracker f6328b = new DraweeEventTracker();

    /* JADX INFO: renamed from: c */
    public static boolean f6329c = true;

    /* JADX INFO: renamed from: a */
    public final Queue<Event> f6330a = new ArrayBlockingQueue(20);

    public enum Event {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    /* JADX INFO: renamed from: a */
    public static DraweeEventTracker m8254a() {
        return f6329c ? new DraweeEventTracker() : f6328b;
    }

    /* JADX INFO: renamed from: b */
    public void m8255b(Event event) {
        if (f6329c) {
            for (int i = 5; !this.f6330a.offer(event) && i > 0; i--) {
                this.f6330a.poll();
            }
        }
    }

    public String toString() {
        return this.f6330a.toString();
    }
}
