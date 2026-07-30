package p002l;

import android.view.View;
import android.widget.TextView;
import l.d1q;
import l.hxs;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ybs extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final String f22788a;

    /* JADX INFO: renamed from: b */
    public final String f22789b;

    public ybs(String str, String str2) {
        this.f22788a = str;
        this.f22789b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ybs ybsVar = (ybs) obj;
            if (v050.a(this.f22788a, ybsVar.f22788a) && v050.a(this.f22789b, ybsVar.f22789b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f22788a, this.f22789b});
    }

    /* JADX INFO: renamed from: o */
    public int m26498o() {
        return t6c0.f19966p3;
    }

    /* JADX INFO: renamed from: u */
    public void m26499u(View view) {
        super.u(view);
        hxs.s("context_single_room", view.findViewById(g5c0.f11084g1), this.f22788a);
        ((TextView) view.findViewById(g5c0.f10849G6)).setText(this.f22789b);
    }
}
