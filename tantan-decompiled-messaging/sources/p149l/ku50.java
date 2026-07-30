package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class ku50 extends xj2 {

    /* JADX INFO: renamed from: c */
    public final BLiveOperationItem f124646c;

    /* JADX INFO: renamed from: d */
    public final LiveMessage f124647d;

    /* JADX INFO: renamed from: e */
    public final Boolean f124648e;

    /* JADX INFO: renamed from: f */
    public final BLiveOperationItemPopUpDrawer f124649f;

    /* JADX INFO: renamed from: g */
    public final xdl0.C21104g f124650g;

    /* JADX INFO: renamed from: h */
    public final String f124651h;

    /* JADX INFO: renamed from: i */
    public final boolean f124652i;

    /* JADX INFO: renamed from: j */
    public final boolean f124653j;

    /* JADX INFO: renamed from: l.ku50$a */
    public static class C18083a extends yj2 {

        /* JADX INFO: renamed from: c */
        public BLiveOperationItem f124654c;

        /* JADX INFO: renamed from: d */
        public LiveMessage f124655d;

        /* JADX INFO: renamed from: e */
        public Boolean f124656e;

        /* JADX INFO: renamed from: f */
        public BLiveOperationItemPopUpDrawer f124657f;

        /* JADX INFO: renamed from: g */
        public xdl0.C21104g f124658g;

        /* JADX INFO: renamed from: h */
        public String f124659h;

        /* JADX INFO: renamed from: i */
        public boolean f124660i;

        /* JADX INFO: renamed from: j */
        public boolean f124661j;

        public C18083a(int i) {
            super(i);
            this.f124661j = true;
        }

        /* JADX INFO: renamed from: a */
        public ku50 m147256a() {
            return new ku50(this);
        }

        /* JADX INFO: renamed from: b */
        public C18083a m147257b(boolean z) {
            this.f124660i = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C18083a m147258c(LiveMessage liveMessage) {
            this.f124655d = liveMessage;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C18083a m147259d(BLiveOperationItem bLiveOperationItem) {
            this.f124654c = bLiveOperationItem;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C18083a m147260e(String str) {
            this.f124659h = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C18083a m147261f(BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
            this.f124657f = bLiveOperationItemPopUpDrawer;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C18083a m147262g(xdl0.C21104g c21104g) {
            this.f124658g = c21104g;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C18083a m147263h(boolean z) {
            this.f124661j = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C18083a m147264i(boolean z) {
            this.f124656e = Boolean.valueOf(z);
            return this;
        }
    }

    public ku50(C18083a c18083a) {
        super(c18083a);
        this.f124646c = c18083a.f124654c;
        this.f124647d = c18083a.f124655d;
        this.f124648e = c18083a.f124656e;
        this.f124649f = c18083a.f124657f;
        this.f124650g = c18083a.f124658g;
        this.f124651h = c18083a.f124659h;
        this.f124652i = c18083a.f124660i;
        this.f124653j = c18083a.f124661j;
    }

    /* JADX INFO: renamed from: b */
    public boolean m147244b() {
        return this.f124652i;
    }

    /* JADX INFO: renamed from: c */
    public boolean m147245c() {
        return this.f124653j;
    }

    /* JADX INFO: renamed from: d */
    public LiveMessage m147246d() {
        return this.f124647d;
    }

    /* JADX INFO: renamed from: e */
    public BLiveOperationItem m147247e() {
        return this.f124646c;
    }

    /* JADX INFO: renamed from: f */
    public String m147248f() {
        return this.f124651h;
    }

    /* JADX INFO: renamed from: g */
    public BLiveOperationItemPopUpDrawer m147249g() {
        return this.f124649f;
    }

    /* JADX INFO: renamed from: h */
    public xdl0.C21104g m147250h() {
        return this.f124650g;
    }

    /* JADX INFO: renamed from: i */
    public Boolean m147251i() {
        return this.f124648e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m147252j() {
        return this.f124646c.isGiftRedPacket();
    }

    /* JADX INFO: renamed from: k */
    public boolean m147253k() {
        return this.f124646c.enableEntranceAnim();
    }

    /* JADX INFO: renamed from: l */
    public boolean m147254l() {
        return this.f124646c.isTurboCardEvent();
    }

    /* JADX INFO: renamed from: m */
    public boolean m147255m() {
        return this.f124646c.isTurboCoupon();
    }
}
