package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import p153l.fk2;
import p153l.gk2;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12995a extends fk2 {

    /* JADX INFO: renamed from: c */
    public final String f51003c;

    /* JADX INFO: renamed from: d */
    public final String f51004d;

    /* JADX INFO: renamed from: e */
    public final String f51005e;

    /* JADX INFO: renamed from: f */
    public GiftTrayData f51006f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.a$a */
    public static class a extends gk2 {

        /* JADX INFO: renamed from: c */
        public String f51007c;

        /* JADX INFO: renamed from: d */
        public String f51008d;

        /* JADX INFO: renamed from: e */
        public String f51009e;

        /* JADX INFO: renamed from: f */
        public GiftTrayData f51010f;

        public a(int i) {
            super(i);
        }

        /* JADX INFO: renamed from: e */
        public C12995a m75451e() {
            return new C12995a(this);
        }

        /* JADX INFO: renamed from: f */
        public a m75452f(GiftTrayData giftTrayData) {
            this.f51010f = giftTrayData;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public BLiveEffect f51011a;

        /* JADX INFO: renamed from: b */
        public GiftTrayData f51012b;
    }

    public C12995a(a aVar) {
        super(aVar);
        this.f51003c = aVar.f51007c;
        this.f51004d = aVar.f51008d;
        this.f51005e = aVar.f51009e;
        this.f51006f = aVar.f51010f;
    }
}
