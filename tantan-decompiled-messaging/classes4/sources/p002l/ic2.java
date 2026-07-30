package p002l;

import android.os.Handler;
import android.os.HandlerThread;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.avk;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.gkh0;
import l.j760;
import l.mkd0;
import l.p3g0;
import l.vwb;
import l.w9j;
import l.x9j;
import p002l.wml;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ic2<T extends wml<R>, R> {

    /* JADX INFO: renamed from: a */
    public HandlerThread f13133a;

    /* JADX INFO: renamed from: b */
    public Handler f13134b;

    /* JADX INFO: renamed from: c */
    public c4g0 f13135c;

    /* JADX INFO: renamed from: d */
    public List<T> f13136d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public T f13137e;

    /* JADX INFO: renamed from: f */
    public b<T> f13138f;

    /* JADX INFO: renamed from: g */
    public int f13139g;

    public ic2(p3g0<T, T> p3g0Var) {
        b<T> bVarB = b.b();
        this.f13138f = bVarB;
        this.f13139g = 0;
        this.f13135c = p3g0Var.subscribe(bVarB);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Boolean m15076a(wml wmlVar, wml wmlVar2) {
        Object tapType = wmlVar.getTapType();
        Object tapType2 = wmlVar2.getTapType();
        return (tapType == null || tapType2 == null) ? Boolean.FALSE : Boolean.valueOf(tapType.equals(tapType2));
    }

    /* JADX INFO: renamed from: g */
    public final void m15082g() {
        gkh0.j("[live]msg_observer_handler", "BackgroundTapSubject add subs，count：" + this.f13139g);
        if (this.f13139g == 0 && this.f13133a == null) {
            HandlerThread handlerThread = new HandlerThread("BackgroundTapThread");
            this.f13133a = handlerThread;
            handlerThread.start();
            this.f13134b = new Handler(this.f13133a.getLooper());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15083h() {
        this.f13139g--;
        gkh0.j("[live]msg_observer_handler", "BackgroundTapSubject remove subs，count：" + this.f13139g);
        if (this.f13139g == 0) {
            HandlerThread handlerThread = this.f13133a;
            if (handlerThread != null) {
                handlerThread.quit();
                this.f13133a = null;
            }
            if (this.f13134b != null) {
                this.f13134b = null;
            }
            mkd0.z(this.f13135c);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m15084i(wml wmlVar) {
        this.f13138f.onNext(wmlVar);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ wml m15085j(j760 j760Var) {
        c cVar = (c) j760Var.b;
        final T t = (T) j760Var.a;
        if (t == null) {
            return null;
        }
        if (cVar == c.k || cVar == c.j) {
            if (!t.equals(this.f13137e)) {
                vwb.d0(this.f13136d, new w9j() { // from class: l.fc2
                    public final Object call(Object obj) {
                        return ic2.m15076a(t, (wml) obj);
                    }
                });
                if (this.f13136d.size() == 32) {
                    this.f13136d.remove(0);
                    CrashHelper.c(new IllegalArgumentException("tap size is too small"));
                }
                this.f13136d.add(t);
            }
            return null;
        }
        if (cVar != c.i) {
            return null;
        }
        if (!this.f13136d.contains(t)) {
            this.f13137e = t;
            return t;
        }
        ArrayList arrayList = new ArrayList(this.f13136d);
        this.f13136d.clear();
        vwb.z(arrayList, new e30() { // from class: l.gc2
            public final void call(Object obj) {
                this.f11355a.m15084i((wml) obj);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m15086k() {
        e51.M(new Runnable() { // from class: l.hc2
            @Override // java.lang.Runnable
            public final void run() {
                this.f11964a.m15083h();
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public rx.c<T> m15087l(Act act) {
        m15082g();
        this.f13139g++;
        return rx.c.combineLatest(this.f13138f, act.lifecycle(), new x9j() { // from class: l.bc2
            public final Object call(Object obj, Object obj2) {
                return new j760((wml) obj, (c) obj2);
            }
        }).observeOn(avk.a(this.f13134b)).map(new w9j() { // from class: l.cc2
            public final Object call(Object obj) {
                return this.f8585a.m15085j((j760) obj);
            }
        }).doOnUnsubscribe(new d30() { // from class: l.dc2
            public final void call() {
                this.f9158a.m15086k();
            }
        }).filter(new w9j() { // from class: l.ec2
            public final Object call(Object obj) {
                return Boolean.valueOf(((wml) obj) != null);
            }
        });
    }
}
