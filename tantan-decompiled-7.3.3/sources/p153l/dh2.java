package p153l;

import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dh2<V extends View> extends d3q<V> {

    /* JADX INFO: renamed from: a */
    public final LiveMessage f88411a;

    /* JADX INFO: renamed from: b */
    public final yql f88412b;

    /* JADX INFO: renamed from: c */
    public boolean f88413c;

    public dh2(LiveMessage liveMessage, yql yqlVar) {
        this.f88411a = liveMessage;
        this.f88412b = yqlVar;
    }

    /* JADX INFO: renamed from: H */
    public boolean m115780H() {
        return this.f88413c;
    }

    /* JADX INFO: renamed from: I */
    public void m115781I(boolean z) {
        this.f88413c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dh2 dh2Var = (dh2) obj;
            if (k950.m148863a(this.f88411a, dh2Var.f88411a) && k950.m148863a(this.f88412b, dh2Var.f88412b) && k950.m148863a(Boolean.valueOf(this.f88413c), Boolean.valueOf(dh2Var.f88413c))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return k950.m148864b(this.f88411a, this.f88412b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.d3q
    /* JADX INFO: renamed from: w */
    public void mo72183w(V v2) {
        super.mo72183w(v2);
        if (v2 instanceof arl) {
            ((arl) v2).mo73677M();
        }
        if (this instanceof arl) {
            ((arl) this).mo73677M();
        }
    }
}
