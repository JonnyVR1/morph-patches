package com.facebook.cache.disk;

import p153l.v2f;

/* JADX INFO: renamed from: com.facebook.cache.disk.a */
/* JADX INFO: loaded from: classes.dex */
public class C1608a implements v2f {

    /* JADX INFO: renamed from: com.facebook.cache.disk.a$a */
    public class a implements InterfaceC1612e {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC1609b.a aVar, InterfaceC1609b.a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            return timestamp2 == timestamp ? 0 : 1;
        }
    }

    @Override // p153l.v2f
    public InterfaceC1612e get() {
        return new a();
    }
}
