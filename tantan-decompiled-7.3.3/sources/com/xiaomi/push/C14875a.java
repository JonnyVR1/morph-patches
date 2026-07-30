package com.xiaomi.push;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.xiaomi.push.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14875a {

    /* JADX INFO: renamed from: a */
    private LinkedList<a> f62484a = new LinkedList<>();

    /* JADX INFO: renamed from: com.xiaomi.push.a$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        private static final C14875a f62485d = new C14875a();

        /* JADX INFO: renamed from: a */
        public int f62486a;

        /* JADX INFO: renamed from: b */
        public String f62487b;

        /* JADX INFO: renamed from: c */
        public Object f62488c;

        public a(int i, Object obj) {
            this.f62486a = i;
            this.f62488c = obj;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C14875a m86622b() {
        return a.f62485d;
    }

    /* JADX INFO: renamed from: d */
    private void m86623d() {
        if (this.f62484a.size() > 100) {
            this.f62484a.removeFirst();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m86624a() {
        return this.f62484a.size();
    }

    /* JADX INFO: renamed from: c */
    public synchronized LinkedList<a> m86625c() {
        LinkedList<a> linkedList;
        linkedList = this.f62484a;
        this.f62484a = new LinkedList<>();
        return linkedList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m86626e(Object obj) {
        this.f62484a.add(new a(0, obj));
        m86623d();
    }
}
