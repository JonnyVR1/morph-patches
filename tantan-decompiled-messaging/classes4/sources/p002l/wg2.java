package p002l;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import l.d1q;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class wg2<V extends View> extends d1q<V> {

    /* JADX INFO: renamed from: a */
    public final LiveMessage f21724a;

    /* JADX INFO: renamed from: b */
    public final nol f21725b;

    /* JADX INFO: renamed from: c */
    public boolean f21726c;

    public wg2(LiveMessage liveMessage, nol nolVar) {
        this.f21724a = liveMessage;
        this.f21725b = nolVar;
    }

    /* JADX INFO: renamed from: H */
    public boolean m24560H() {
        return this.f21726c;
    }

    /* JADX INFO: renamed from: I */
    public void m24561I(boolean z) {
        this.f21726c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wg2 wg2Var = (wg2) obj;
            if (v050.a(this.f21724a, wg2Var.f21724a) && v050.a(this.f21725b, wg2Var.f21725b) && v050.a(Boolean.valueOf(this.f21726c), Boolean.valueOf(wg2Var.f21726c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f21724a, this.f21725b});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public void m24562w(V v) {
        super.w(v);
        if (v instanceof pol) {
            ((pol) v).mo5986M();
        }
        if (this instanceof pol) {
            ((pol) this).mo5986M();
        }
    }
}
