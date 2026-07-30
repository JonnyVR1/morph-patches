package com.xiaomi.push;

import java.util.LinkedList;

/* JADX INFO: renamed from: com.xiaomi.push.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14727a {

    /* JADX INFO: renamed from: a */
    private LinkedList<a> f61637a = new LinkedList<>();

    /* JADX INFO: renamed from: com.xiaomi.push.a$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        private static final C14727a f61638d = new C14727a();

        /* JADX INFO: renamed from: a */
        public int f61639a;

        /* JADX INFO: renamed from: b */
        public String f61640b;

        /* JADX INFO: renamed from: c */
        public Object f61641c;

        public a(int i, Object obj) {
            this.f61639a = i;
            this.f61641c = obj;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C14727a m85451b() {
        return a.f61638d;
    }

    /* JADX INFO: renamed from: d */
    private void m85452d() {
        if (this.f61637a.size() > 100) {
            this.f61637a.removeFirst();
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized int m85453a() {
        return this.f61637a.size();
    }

    /* JADX INFO: renamed from: c */
    public synchronized LinkedList<a> m85454c() {
        LinkedList<a> linkedList;
        linkedList = this.f61637a;
        this.f61637a = new LinkedList<>();
        return linkedList;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m85455e(Object obj) {
        this.f61637a.add(new a(0, obj));
        m85452d();
    }
}
