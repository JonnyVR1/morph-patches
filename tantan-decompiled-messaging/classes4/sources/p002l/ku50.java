package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ku50 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final BLiveOperationItem f14513c;

    /* JADX INFO: renamed from: d */
    public final LiveMessage f14514d;

    /* JADX INFO: renamed from: e */
    public final Boolean f14515e;

    /* JADX INFO: renamed from: f */
    public final BLiveOperationItemPopUpDrawer f14516f;

    /* JADX INFO: renamed from: g */
    public final xdl0.g f14517g;

    /* JADX INFO: renamed from: h */
    public final String f14518h;

    /* JADX INFO: renamed from: i */
    public final boolean f14519i;

    /* JADX INFO: renamed from: j */
    public final boolean f14520j;

    /* JADX INFO: renamed from: l.ku50$a */
    public static class C0652a extends yj2 {

        /* JADX INFO: renamed from: c */
        public BLiveOperationItem f14521c;

        /* JADX INFO: renamed from: d */
        public LiveMessage f14522d;

        /* JADX INFO: renamed from: e */
        public Boolean f14523e;

        /* JADX INFO: renamed from: f */
        public BLiveOperationItemPopUpDrawer f14524f;

        /* JADX INFO: renamed from: g */
        public xdl0.g f14525g;

        /* JADX INFO: renamed from: h */
        public String f14526h;

        /* JADX INFO: renamed from: i */
        public boolean f14527i;

        /* JADX INFO: renamed from: j */
        public boolean f14528j;

        public C0652a(int i) {
            super(i);
            this.f14528j = true;
        }

        /* JADX INFO: renamed from: a */
        public ku50 m16799a() {
            return new ku50(this);
        }

        /* JADX INFO: renamed from: b */
        public C0652a m16800b(boolean z) {
            this.f14527i = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0652a m16801c(LiveMessage liveMessage) {
            this.f14522d = liveMessage;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0652a m16802d(BLiveOperationItem bLiveOperationItem) {
            this.f14521c = bLiveOperationItem;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0652a m16803e(String str) {
            this.f14526h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0652a m16804f(BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
            this.f14524f = bLiveOperationItemPopUpDrawer;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0652a m16805g(xdl0.g gVar) {
            this.f14525g = gVar;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0652a m16806h(boolean z) {
            this.f14528j = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0652a m16807i(boolean z) {
            this.f14523e = Boolean.valueOf(z);
            return this;
        }
    }

    public ku50(C0652a c0652a) {
        super(c0652a);
        this.f14513c = c0652a.f14521c;
        this.f14514d = c0652a.f14522d;
        this.f14515e = c0652a.f14523e;
        this.f14516f = c0652a.f14524f;
        this.f14517g = c0652a.f14525g;
        this.f14518h = c0652a.f14526h;
        this.f14519i = c0652a.f14527i;
        this.f14520j = c0652a.f14528j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m16787b() {
        return this.f14519i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m16788c() {
        return this.f14520j;
    }

    /* JADX INFO: renamed from: d */
    public LiveMessage m16789d() {
        return this.f14514d;
    }

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem m16790e() {
        return this.f14513c;
    }

    /* JADX INFO: renamed from: f */
    public String m16791f() {
        return this.f14518h;
    }

    /* JADX INFO: renamed from: g */
    public BLiveOperationItemPopUpDrawer m16792g() {
        return this.f14516f;
    }

    /* JADX INFO: renamed from: h */
    public xdl0.g m16793h() {
        return this.f14517g;
    }

    /* JADX INFO: renamed from: i */
    public Boolean m16794i() {
        return this.f14515e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m16795j() {
        return this.f14513c.isGiftRedPacket();
    }

    /* JADX INFO: renamed from: k */
    public boolean m16796k() {
        return this.f14513c.enableEntranceAnim();
    }

    /* JADX INFO: renamed from: l */
    public boolean m16797l() {
        return this.f14513c.isTurboCardEvent();
    }

    /* JADX INFO: renamed from: m */
    public boolean m16798m() {
        return this.f14513c.isTurboCoupon();
    }
}
