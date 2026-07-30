package p002l;

import android.view.View;
import l.d1q;
import l.v050;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class awt extends d1q<View> {

    /* JADX INFO: renamed from: a */
    public final CharSequence f7909a;

    public awt(CharSequence charSequence) {
        this.f7909a = charSequence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return v050.a(this.f7909a, ((awt) obj).f7909a);
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f7909a});
    }

    /* JADX INFO: renamed from: o */
    public int m10084o() {
        return t6c0.f20083y3;
    }

    /* JADX INFO: renamed from: u */
    public void m10085u(View view) {
        super.u(view);
        view.findViewById(g5c0.f10849G6).setText(this.f7909a);
    }
}
