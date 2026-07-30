package p009l;

import android.graphics.Bitmap;
import l.bq2;
import l.k760;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class diq extends bq2 {

    /* JADX INFO: renamed from: c */
    public bc70 f11851c;

    /* JADX INFO: renamed from: d */
    public String f11852d;

    public diq(bc70 bc70Var, String str) {
        this.f11851c = bc70Var;
        this.f11852d = str;
    }

    /* JADX INFO: renamed from: e */
    public void m13347e(Bitmap bitmap) {
        k760 k760VarA;
        super.e(bitmap);
        if (this.f11851c == null || (k760VarA = k760.b(bitmap).a()) == null) {
            return;
        }
        this.f11851c.m11933a(this.f11852d, k760VarA.h(-2302756));
    }
}
