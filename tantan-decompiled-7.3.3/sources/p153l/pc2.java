package p153l;

import android.os.Handler;
import android.os.HandlerThread;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.hpl;

/* JADX INFO: loaded from: classes4.dex */
public class pc2<T extends hpl<R>, R> {

    /* JADX INFO: renamed from: a */
    public HandlerThread f151512a;

    /* JADX INFO: renamed from: b */
    public Handler f151513b;

    /* JADX INFO: renamed from: c */
    public kcg0 f151514c;

    /* JADX INFO: renamed from: d */
    public List<T> f151515d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public T f151516e;

    /* JADX INFO: renamed from: f */
    public C22508b<T> f151517f;

    /* JADX INFO: renamed from: g */
    public int f151518g;

    public pc2(wbg0<T, T> wbg0Var) {
        C22508b<T> c22508bM222767b = C22508b.m222767b();
        this.f151517f = c22508bM222767b;
        this.f151518g = 0;
        this.f151514c = wbg0Var.subscribe(c22508bM222767b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m171619a(hpl hplVar, hpl hplVar2) {
        Object tapType = hplVar.getTapType();
        Object tapType2 = hplVar2.getTapType();
        return (tapType == null || tapType2 == null) ? Boolean.FALSE : Boolean.valueOf(tapType.equals(tapType2));
    }

    /* JADX INFO: renamed from: g */
    public final void m171625g() {
        nsh0.m164608j("[live]msg_observer_handler", "BackgroundTapSubject add subs，count：" + this.f151518g);
        if (this.f151518g == 0 && this.f151512a == null) {
            HandlerThread handlerThread = new HandlerThread("BackgroundTapThread");
            this.f151512a = handlerThread;
            handlerThread.start();
            this.f151513b = new Handler(this.f151512a.getLooper());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m171626h() {
        this.f151518g--;
        nsh0.m164608j("[live]msg_observer_handler", "BackgroundTapSubject remove subs，count：" + this.f151518g);
        if (this.f151518g == 0) {
            HandlerThread handlerThread = this.f151512a;
            if (handlerThread != null) {
                handlerThread.quit();
                this.f151512a = null;
            }
            if (this.f151513b != null) {
                this.f151513b = null;
            }
            psd0.m173633z(this.f151514c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m171627i(hpl hplVar) {
        this.f151517f.m137019l(hplVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ hpl m171628j(pf60 pf60Var) {
        C4470c c4470c = (C4470c) pf60Var.f152157b;
        final T t = (T) pf60Var.f152156a;
        if (t == null) {
            return null;
        }
        if (c4470c == C4470c.f16269k || c4470c == C4470c.f16268j) {
            if (!t.equals(this.f151516e)) {
                jyb.m147503d0(this.f151515d, new qcj() { // from class: l.mc2
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return pc2.m171619a(t, (hpl) obj);
                    }
                });
                if (this.f151515d.size() == 32) {
                    this.f151515d.remove(0);
                    CrashHelper.m82479c(new IllegalArgumentException("tap size is too small"));
                }
                this.f151515d.add(t);
            }
            return null;
        }
        if (c4470c != C4470c.f16267i) {
            return null;
        }
        if (!this.f151515d.contains(t)) {
            this.f151516e = t;
            return t;
        }
        ArrayList arrayList = new ArrayList(this.f151515d);
        this.f151515d.clear();
        jyb.m147537z(arrayList, new y20() { // from class: l.nc2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141305a.m171627i((hpl) obj);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m171629k() {
        l51.m152893M(new Runnable() { // from class: l.oc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f146644a.m171626h();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C22421c<T> m171630l(Act act) {
        m171625g();
        this.f151518g++;
        return C22421c.combineLatest(this.f151517f, act.lifecycle(), new rcj() { // from class: l.ic2
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((hpl) obj, (C4470c) obj2);
            }
        }).observeOn(qxk.m178605a(this.f151513b)).map(new qcj() { // from class: l.jc2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f120018a.m171628j((pf60) obj);
            }
        }).doOnUnsubscribe(new x20() { // from class: l.kc2
            @Override // p153l.x20
            public final void call() {
                this.f125016a.m171629k();
            }
        }).filter(new qcj() { // from class: l.lc2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((hpl) obj) != null);
            }
        });
    }
}
