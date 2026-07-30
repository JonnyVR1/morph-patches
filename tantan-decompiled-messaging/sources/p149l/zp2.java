package p149l;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import p149l.k4t;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zp2<V extends s7m<P>, P extends k4t<V>> implements zyl<V, P> {

    /* JADX INFO: renamed from: a */
    public bsm f204169a;

    /* JADX INFO: renamed from: b */
    public P f204170b;

    /* JADX INFO: renamed from: c */
    public V f204171c;

    public zp2(bsm bsmVar) {
        this.f204169a = bsmVar;
    }

    /* JADX INFO: renamed from: d */
    public View m219605d(k4t<V> k4tVar, BLiveOperationItem bLiveOperationItem) {
        V v2 = (V) m219606e();
        this.f204171c = v2;
        if (!NullChecker.m81303a(v2)) {
            return null;
        }
        P pMo171107b = mo171107b(bLiveOperationItem);
        this.f204170b = pMo171107b;
        pMo171107b.mo51532C(this.f204171c);
        k4tVar.m144512z2(this.f204170b);
        mo171108c(bLiveOperationItem);
        return (View) this.f204171c;
    }

    /* JADX INFO: renamed from: e */
    public V m219606e() {
        KeyEvent.Callback callbackInflate = LayoutInflater.from(this.f204169a.f77095a).inflate(mo171106a(), (ViewGroup) null);
        if (callbackInflate instanceof s7m) {
            return (V) callbackInflate;
        }
        return null;
    }
}
