package p002l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p1.mobile.android.app.Act;
import com.tantan.live.eventbus.LiveEventBus;
import l.a0m0;
import l.kap0;
import l.mcr;
import l.pho0;
import l.sun0;
import l.xun0;
import l.xuy;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bsm<D extends ho2> {

    /* JADX INFO: renamed from: a */
    public final Act f8332a;

    /* JADX INFO: renamed from: b */
    public mht f8333b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f8334c;

    /* JADX INFO: renamed from: d */
    public final boolean f8335d;

    /* JADX INFO: renamed from: e */
    public String f8336e;

    /* JADX INFO: renamed from: f */
    public LiveBaseFrag f8337f;

    /* JADX INFO: renamed from: g */
    public mcr f8338g;

    /* JADX INFO: renamed from: h */
    public D f8339h;

    /* JADX INFO: renamed from: l */
    public LiveEventBus f8343l;

    /* JADX INFO: renamed from: i */
    public xuy f8340i = new xuy();

    /* JADX INFO: renamed from: j */
    public w4t f8341j = new w4t(this);

    /* JADX INFO: renamed from: k */
    public s6s f8342k = new s6s(this);

    /* JADX INFO: renamed from: m */
    public sun0 f8344m = new sun0(this);

    /* JADX INFO: renamed from: n */
    public a0m0<?> f8345n = new a0m0<>(this);

    public bsm(LiveBaseFrag liveBaseFrag, D d, mcr mcrVar, boolean z, LiveEventBus liveEventBus) {
        this.f8337f = liveBaseFrag;
        this.f8332a = liveBaseFrag.act();
        this.f8339h = d;
        this.f8338g = mcrVar;
        this.f8335d = z;
        this.f8343l = liveEventBus;
    }

    /* JADX INFO: renamed from: a */
    public void m10575a(mht mhtVar, ViewGroup viewGroup) {
        this.f8333b = mhtVar;
        this.f8334c = viewGroup;
        if ((mhtVar instanceof xun0) || (mhtVar instanceof pho0)) {
            this.f8344m.init();
        } else if (mhtVar instanceof kap0) {
            this.f8345n.init();
        } else {
            this.f8341j.init();
        }
    }
}
