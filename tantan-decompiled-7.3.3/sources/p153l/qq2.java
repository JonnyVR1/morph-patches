package p153l;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import p153l.iam;
import p153l.l6t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qq2<V extends iam<P>, P extends l6t<V>> implements u1m<V, P> {

    /* JADX INFO: renamed from: a */
    public dum f158940a;

    /* JADX INFO: renamed from: b */
    public P f158941b;

    /* JADX INFO: renamed from: c */
    public V f158942c;

    public qq2(dum dumVar) {
        this.f158940a = dumVar;
    }

    /* JADX INFO: renamed from: d */
    public View m177477d(l6t<V> l6tVar, BLiveOperationItem bLiveOperationItem) {
        V v2 = (V) m177478e();
        this.f158942c = v2;
        if (!NullChecker.m82486a(v2)) {
            return null;
        }
        P pMo194023b = mo194023b(bLiveOperationItem);
        this.f158941b = pMo194023b;
        pMo194023b.mo52715C(this.f158942c);
        l6tVar.m153103z2(this.f158941b);
        mo194024c(bLiveOperationItem);
        return (View) this.f158942c;
    }

    /* JADX INFO: renamed from: e */
    public V m177478e() {
        KeyEvent.Callback callbackInflate = LayoutInflater.from(this.f158940a.f90815a).inflate(mo194022a(), (ViewGroup) null);
        if (callbackInflate instanceof iam) {
            return (V) callbackInflate;
        }
        return null;
    }
}
