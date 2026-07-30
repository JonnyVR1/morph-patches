package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class q260 extends fk2 {

    /* JADX INFO: renamed from: c */
    public final BLiveOperationItem f155284c;

    /* JADX INFO: renamed from: d */
    public final LiveMessage f155285d;

    /* JADX INFO: renamed from: e */
    public final Boolean f155286e;

    /* JADX INFO: renamed from: f */
    public final BLiveOperationItemPopUpDrawer f155287f;

    /* JADX INFO: renamed from: g */
    public final bnl0.C16067g f155288g;

    /* JADX INFO: renamed from: h */
    public final String f155289h;

    /* JADX INFO: renamed from: i */
    public final boolean f155290i;

    /* JADX INFO: renamed from: j */
    public final boolean f155291j;

    /* JADX INFO: renamed from: l.q260$a */
    public static class C19505a extends gk2 {

        /* JADX INFO: renamed from: c */
        public BLiveOperationItem f155292c;

        /* JADX INFO: renamed from: d */
        public LiveMessage f155293d;

        /* JADX INFO: renamed from: e */
        public Boolean f155294e;

        /* JADX INFO: renamed from: f */
        public BLiveOperationItemPopUpDrawer f155295f;

        /* JADX INFO: renamed from: g */
        public bnl0.C16067g f155296g;

        /* JADX INFO: renamed from: h */
        public String f155297h;

        /* JADX INFO: renamed from: i */
        public boolean f155298i;

        /* JADX INFO: renamed from: j */
        public boolean f155299j;

        public C19505a(int i) {
            super(i);
            this.f155299j = true;
        }

        /* JADX INFO: renamed from: a */
        public q260 m175002a() {
            return new q260(this);
        }

        /* JADX INFO: renamed from: b */
        public C19505a m175003b(boolean z) {
            this.f155298i = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19505a m175004c(LiveMessage liveMessage) {
            this.f155293d = liveMessage;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19505a m175005d(BLiveOperationItem bLiveOperationItem) {
            this.f155292c = bLiveOperationItem;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19505a m175006e(String str) {
            this.f155297h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19505a m175007f(BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
            this.f155295f = bLiveOperationItemPopUpDrawer;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C19505a m175008g(bnl0.C16067g c16067g) {
            this.f155296g = c16067g;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19505a m175009h(boolean z) {
            this.f155299j = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19505a m175010i(boolean z) {
            this.f155294e = Boolean.valueOf(z);
            return this;
        }
    }

    public q260(C19505a c19505a) {
        super(c19505a);
        this.f155284c = c19505a.f155292c;
        this.f155285d = c19505a.f155293d;
        this.f155286e = c19505a.f155294e;
        this.f155287f = c19505a.f155295f;
        this.f155288g = c19505a.f155296g;
        this.f155289h = c19505a.f155297h;
        this.f155290i = c19505a.f155298i;
        this.f155291j = c19505a.f155299j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m174990b() {
        return this.f155290i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m174991c() {
        return this.f155291j;
    }

    /* JADX INFO: renamed from: d */
    public LiveMessage m174992d() {
        return this.f155285d;
    }

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem m174993e() {
        return this.f155284c;
    }

    /* JADX INFO: renamed from: f */
    public String m174994f() {
        return this.f155289h;
    }

    /* JADX INFO: renamed from: g */
    public BLiveOperationItemPopUpDrawer m174995g() {
        return this.f155287f;
    }

    /* JADX INFO: renamed from: h */
    public bnl0.C16067g m174996h() {
        return this.f155288g;
    }

    /* JADX INFO: renamed from: i */
    public Boolean m174997i() {
        return this.f155286e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m174998j() {
        return this.f155284c.isGiftRedPacket();
    }

    /* JADX INFO: renamed from: k */
    public boolean m174999k() {
        return this.f155284c.enableEntranceAnim();
    }

    /* JADX INFO: renamed from: l */
    public boolean m175000l() {
        return this.f155284c.isTurboCardEvent();
    }

    /* JADX INFO: renamed from: m */
    public boolean m175001m() {
        return this.f155284c.isTurboCoupon();
    }
}
