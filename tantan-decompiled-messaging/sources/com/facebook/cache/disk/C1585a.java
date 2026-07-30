package com.facebook.cache.disk;

import p149l.q1f;

/* JADX INFO: renamed from: com.facebook.cache.disk.a */
/* JADX INFO: loaded from: classes.dex */
public class C1585a implements q1f {

    /* JADX INFO: renamed from: com.facebook.cache.disk.a$a */
    public class a implements InterfaceC1589e {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC1586b.a aVar, InterfaceC1586b.a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    @Override // p149l.q1f
    public InterfaceC1589e get() {
        return new a();
    }
}
