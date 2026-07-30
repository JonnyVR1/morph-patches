package p149l;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class vmd implements nbe {

    /* JADX INFO: renamed from: a */
    public final Resources f182098a;

    /* JADX INFO: renamed from: b */
    public final nbe f182099b;

    public vmd(Resources resources, nbe nbeVar) {
        this.f182098a = resources;
        this.f182099b = nbeVar;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m198934c(ia5 ia5Var) {
        return (ia5Var.mo135134x() == 1 || ia5Var.mo135134x() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m198935d(ia5 ia5Var) {
        return (ia5Var.mo135132U() == 0 || ia5Var.mo135132U() == -1) ? false : true;
    }

    @Override // p149l.nbe
    /* JADX INFO: renamed from: a */
    public boolean mo146384a(da5 da5Var) {
        return true;
    }

    @Override // p149l.nbe
    /* JADX INFO: renamed from: b */
    public Drawable mo146385b(da5 da5Var) {
        try {
            if (o6j.m162852d()) {
                o6j.m162850a("DefaultDrawableFactory#createDrawable");
            }
            if (!(da5Var instanceof ia5)) {
                nbe nbeVar = this.f182099b;
                if (nbeVar == null || !nbeVar.mo146384a(da5Var)) {
                    if (o6j.m162852d()) {
                        o6j.m162851b();
                    }
                    return null;
                }
                Drawable drawableMo146385b = this.f182099b.mo146385b(da5Var);
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                return drawableMo146385b;
            }
            ia5 ia5Var = (ia5) da5Var;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f182098a, ia5Var.mo95529a0());
            if (!m198935d(ia5Var) && !m198934c(ia5Var)) {
                if (o6j.m162852d()) {
                    o6j.m162851b();
                }
                return bitmapDrawable;
            }
            vx50 vx50Var = new vx50(bitmapDrawable, ia5Var.mo135132U(), ia5Var.mo135134x());
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            return vx50Var;
        } catch (Throwable th) {
            if (o6j.m162852d()) {
                o6j.m162851b();
            }
            throw th;
        }
    }
}
