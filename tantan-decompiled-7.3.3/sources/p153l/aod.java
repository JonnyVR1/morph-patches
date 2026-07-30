package p153l;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class aod implements rce {

    /* JADX INFO: renamed from: a */
    public final Resources f72442a;

    /* JADX INFO: renamed from: b */
    public final rce f72443b;

    public aod(Resources resources, rce rceVar) {
        this.f72442a = resources;
        this.f72443b = rceVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m99066c(ib5 ib5Var) {
        return (ib5Var.mo104390x() == 1 || ib5Var.mo104390x() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99067d(ib5 ib5Var) {
        return (ib5Var.mo104388V() == 0 || ib5Var.mo104388V() == -1) ? false : true;
    }

    @Override // p153l.rce
    /* JADX INFO: renamed from: a */
    public boolean mo99068a(db5 db5Var) {
        return true;
    }

    @Override // p153l.rce
    /* JADX INFO: renamed from: b */
    public Drawable mo99069b(db5 db5Var) {
        try {
            if (i9j.m139099d()) {
                i9j.m139097a("DefaultDrawableFactory#createDrawable");
            }
            if (!(db5Var instanceof ib5)) {
                rce rceVar = this.f72443b;
                if (rceVar == null || !rceVar.mo99068a(db5Var)) {
                    if (i9j.m139099d()) {
                        i9j.m139098b();
                    }
                    return null;
                }
                Drawable drawableMo99069b = this.f72443b.mo99069b(db5Var);
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                return drawableMo99069b;
            }
            ib5 ib5Var = (ib5) db5Var;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f72442a, ib5Var.mo96697b0());
            if (!m99067d(ib5Var) && !m99066c(ib5Var)) {
                if (i9j.m139099d()) {
                    i9j.m139098b();
                }
                return bitmapDrawable;
            }
            a660 a660Var = new a660(bitmapDrawable, ib5Var.mo104388V(), ib5Var.mo104390x());
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            return a660Var;
        } catch (Throwable th) {
            if (i9j.m139099d()) {
                i9j.m139098b();
            }
            throw th;
        }
    }
}
