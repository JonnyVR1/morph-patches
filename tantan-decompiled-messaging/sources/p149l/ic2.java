package p149l;

import android.os.Handler;
import android.os.HandlerThread;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.wml;

/* JADX INFO: loaded from: classes4.dex */
public class ic2<T extends wml<R>, R> {

    /* JADX INFO: renamed from: a */
    public HandlerThread f112419a;

    /* JADX INFO: renamed from: b */
    public Handler f112420b;

    /* JADX INFO: renamed from: c */
    public c4g0 f112421c;

    /* JADX INFO: renamed from: d */
    public List<T> f112422d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public T f112423e;

    /* JADX INFO: renamed from: f */
    public C22393b<T> f112424f;

    /* JADX INFO: renamed from: g */
    public int f112425g;

    public ic2(p3g0<T, T> p3g0Var) {
        C22393b<T> c22393bM221521b = C22393b.m221521b();
        this.f112424f = c22393bM221521b;
        this.f112425g = 0;
        this.f112421c = p3g0Var.subscribe(c22393bM221521b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m135315a(wml wmlVar, wml wmlVar2) {
        Object tapType = wmlVar.getTapType();
        Object tapType2 = wmlVar2.getTapType();
        return (tapType == null || tapType2 == null) ? Boolean.FALSE : Boolean.valueOf(tapType.equals(tapType2));
    }

    /* JADX INFO: renamed from: g */
    public final void m135321g() {
        gkh0.m126627j("[live]msg_observer_handler", "BackgroundTapSubject add subs，count：" + this.f112425g);
        if (this.f112425g == 0 && this.f112419a == null) {
            HandlerThread handlerThread = new HandlerThread("BackgroundTapThread");
            this.f112419a = handlerThread;
            handlerThread.start();
            this.f112420b = new Handler(this.f112419a.getLooper());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m135322h() {
        this.f112425g--;
        gkh0.m126627j("[live]msg_observer_handler", "BackgroundTapSubject remove subs，count：" + this.f112425g);
        if (this.f112425g == 0) {
            HandlerThread handlerThread = this.f112419a;
            if (handlerThread != null) {
                handlerThread.quit();
                this.f112419a = null;
            }
            if (this.f112420b != null) {
                this.f112420b = null;
            }
            mkd0.m154992z(this.f112421c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m135323i(wml wmlVar) {
        this.f112424f.m132487l(wmlVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wml m135324j(j760 j760Var) {
        C4319c c4319c = (C4319c) j760Var.f116565b;
        final T t = (T) j760Var.f116564a;
        if (t == null) {
            return null;
        }
        if (c4319c == C4319c.f15550k || c4319c == C4319c.f15549j) {
            if (!t.equals(this.f112423e)) {
                vwb.m200320d0(this.f112422d, new w9j() { // from class: l.fc2
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ic2.m135315a(t, (wml) obj);
                    }
                });
                if (this.f112422d.size() == 32) {
                    this.f112422d.remove(0);
                    CrashHelper.m81296c(new IllegalArgumentException("tap size is too small"));
                }
                this.f112422d.add(t);
            }
            return null;
        }
        if (c4319c != C4319c.f15548i) {
            return null;
        }
        if (!this.f112422d.contains(t)) {
            this.f112423e = t;
            return t;
        }
        ArrayList arrayList = new ArrayList(this.f112422d);
        this.f112422d.clear();
        vwb.m200354z(arrayList, new e30() { // from class: l.gc2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101980a.m135323i((wml) obj);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m135325k() {
        e51.m114748M(new Runnable() { // from class: l.hc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f106990a.m135322h();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public C22306c<T> m135326l(Act act) {
        m135321g();
        this.f112425g++;
        return C22306c.combineLatest(this.f112424f, act.lifecycle(), new x9j() { // from class: l.bc2
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((wml) obj, (C4319c) obj2);
            }
        }).observeOn(avk.m99199a(this.f112420b)).map(new w9j() { // from class: l.cc2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f80196a.m135324j((j760) obj);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.dc2
            @Override // p149l.d30
            public final void call() {
                this.f85362a.m135325k();
            }
        }).filter(new w9j() { // from class: l.ec2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((wml) obj) != null);
            }
        });
    }
}
