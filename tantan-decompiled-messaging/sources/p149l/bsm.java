package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.tantan.live.eventbus.LiveEventBus;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class bsm<D extends ho2> {

    /* JADX INFO: renamed from: a */
    public final Act f77095a;

    /* JADX INFO: renamed from: b */
    public mht f77096b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f77097c;

    /* JADX INFO: renamed from: d */
    public final boolean f77098d;

    /* JADX INFO: renamed from: e */
    public String f77099e;

    /* JADX INFO: renamed from: f */
    public LiveBaseFrag f77100f;

    /* JADX INFO: renamed from: g */
    public mcr f77101g;

    /* JADX INFO: renamed from: h */
    public D f77102h;

    /* JADX INFO: renamed from: l */
    public LiveEventBus f77106l;

    /* JADX INFO: renamed from: i */
    public xuy f77103i = new xuy();

    /* JADX INFO: renamed from: j */
    public w4t f77104j = new w4t(this);

    /* JADX INFO: renamed from: k */
    public s6s f77105k = new s6s(this);

    /* JADX INFO: renamed from: m */
    public sun0 f77107m = new sun0(this);

    /* JADX INFO: renamed from: n */
    public a0m0<?> f77108n = new a0m0<>(this);

    public bsm(LiveBaseFrag liveBaseFrag, D d, mcr mcrVar, boolean z, LiveEventBus liveEventBus) {
        this.f77100f = liveBaseFrag;
        this.f77095a = liveBaseFrag.act();
        this.f77102h = d;
        this.f77101g = mcrVar;
        this.f77098d = z;
        this.f77106l = liveEventBus;
    }

    /* JADX INFO: renamed from: a */
    public void m103722a(mht mhtVar, ViewGroup viewGroup) {
        this.f77096b = mhtVar;
        this.f77097c = viewGroup;
        if ((mhtVar instanceof xun0) || (mhtVar instanceof pho0)) {
            this.f77107m.init();
        } else if (mhtVar instanceof kap0) {
            this.f77108n.init();
        } else {
            this.f77104j.init();
        }
    }
}
