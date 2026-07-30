package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import l.k4t;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class zp2<V extends s7m<P>, P extends k4t<V>> implements zyl<V, P> {

    /* JADX INFO: renamed from: a */
    public bsm f23530a;

    /* JADX INFO: renamed from: b */
    public P f23531b;

    /* JADX INFO: renamed from: c */
    public V f23532c;

    public zp2(bsm bsmVar) {
        this.f23530a = bsmVar;
    }

    /* JADX INFO: renamed from: d */
    public View m27461d(k4t<V> k4tVar, BLiveOperationItem bLiveOperationItem) {
        V v = (V) m27462e();
        this.f23532c = v;
        if (!NullChecker.a(v)) {
            return null;
        }
        P pMo20650b = mo20650b(bLiveOperationItem);
        this.f23531b = pMo20650b;
        pMo20650b.C(this.f23532c);
        k4tVar.z2(this.f23531b);
        mo20651c(bLiveOperationItem);
        return this.f23532c;
    }

    /* JADX INFO: renamed from: e */
    public V m27462e() {
        V vInflate = LayoutInflater.from(this.f23530a.f8332a).inflate(mo20649a(), (ViewGroup) null);
        if (vInflate instanceof s7m) {
            return vInflate;
        }
        return null;
    }
}
