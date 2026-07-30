package p002l;

import android.graphics.drawable.Drawable;
import l.d1q;
import l.v050;
import l.yb2;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zbs extends d1q<VText> {

    /* JADX INFO: renamed from: a */
    public final String f23331a;

    /* JADX INFO: renamed from: b */
    public boolean f23332b;

    public zbs(String str, boolean z) {
        this.f23331a = str;
        this.f23332b = z;
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m27156u(VText vText) {
        super.u(vText);
        vText.setText(this.f23331a);
        if (this.f23332b) {
            vText.setTextColor(-436207616);
            vText.setBackgroundDrawable(yb2.i(117440512, 16));
        } else {
            vText.setTextColor(1291845632);
            vText.setBackgroundDrawable((Drawable) null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zbs zbsVar = (zbs) obj;
            if (this.f23332b == zbsVar.f23332b && v050.a(this.f23331a, zbsVar.f23331a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return v050.b(new Object[]{this.f23331a, Boolean.valueOf(this.f23332b)});
    }

    /* JADX INFO: renamed from: o */
    public int m27155o() {
        return t6c0.f19979q3;
    }
}
