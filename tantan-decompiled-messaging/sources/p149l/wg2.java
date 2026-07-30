package p149l;

import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wg2<V extends View> extends d1q<V> {

    /* JADX INFO: renamed from: a */
    public final LiveMessage f186132a;

    /* JADX INFO: renamed from: b */
    public final nol f186133b;

    /* JADX INFO: renamed from: c */
    public boolean f186134c;

    public wg2(LiveMessage liveMessage, nol nolVar) {
        this.f186132a = liveMessage;
        this.f186133b = nolVar;
    }

    /* JADX INFO: renamed from: H */
    public boolean m202998H() {
        return this.f186134c;
    }

    /* JADX INFO: renamed from: I */
    public void m202999I(boolean z) {
        this.f186134c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            wg2 wg2Var = (wg2) obj;
            if (v050.m196470a(this.f186132a, wg2Var.f186132a) && v050.m196470a(this.f186133b, wg2Var.f186133b) && v050.m196470a(Boolean.valueOf(this.f186134c), Boolean.valueOf(wg2Var.f186134c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.m196471b(this.f186132a, this.f186133b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.d1q
    /* JADX INFO: renamed from: w */
    public void mo71000w(V v2) {
        super.mo71000w(v2);
        if (v2 instanceof pol) {
            ((pol) v2).mo72494M();
        }
        if (this instanceof pol) {
            ((pol) this).mo72494M();
        }
    }
}
