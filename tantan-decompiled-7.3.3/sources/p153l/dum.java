package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.tantan.live.eventbus.LiveEventBus;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class dum<D extends oo2> {

    /* JADX INFO: renamed from: a */
    public final Act f90815a;

    /* JADX INFO: renamed from: b */
    public njt f90816b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f90817c;

    /* JADX INFO: renamed from: d */
    public final boolean f90818d;

    /* JADX INFO: renamed from: e */
    public String f90819e;

    /* JADX INFO: renamed from: f */
    public LiveBaseFrag f90820f;

    /* JADX INFO: renamed from: g */
    public ner f90821g;

    /* JADX INFO: renamed from: h */
    public D f90822h;

    /* JADX INFO: renamed from: l */
    public LiveEventBus f90826l;

    /* JADX INFO: renamed from: i */
    public u3z f90823i = new u3z();

    /* JADX INFO: renamed from: j */
    public x6t f90824j = new x6t(this);

    /* JADX INFO: renamed from: k */
    public t8s f90825k = new t8s(this);

    /* JADX INFO: renamed from: m */
    public w3o0 f90827m = new w3o0(this);

    /* JADX INFO: renamed from: n */
    public e9m0<?> f90828n = new e9m0<>(this);

    public dum(LiveBaseFrag liveBaseFrag, D d, ner nerVar, boolean z, LiveEventBus liveEventBus) {
        this.f90820f = liveBaseFrag;
        this.f90815a = liveBaseFrag.act();
        this.f90822h = d;
        this.f90821g = nerVar;
        this.f90818d = z;
        this.f90826l = liveEventBus;
    }

    /* JADX INFO: renamed from: a */
    public void m118163a(njt njtVar, ViewGroup viewGroup) {
        this.f90816b = njtVar;
        this.f90817c = viewGroup;
        if ((njtVar instanceof b4o0) || (njtVar instanceof tqo0)) {
            this.f90827m.init();
        } else if (njtVar instanceof ojp0) {
            this.f90828n.init();
        } else {
            this.f90824j.init();
        }
    }
}
