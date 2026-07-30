package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class e4g {

    /* JADX INFO: renamed from: a */
    public static final ww3<String, Drawable.ConstantState> f89277a = new ww3<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ imf0 m114677a(imf0 imf0Var) {
        return imf0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ imf0 m114679c(nvp nvpVar, String str, String str2, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        if (nvpVar.m161719m()) {
            z3g z3gVar = new z3g(nvpVar, bitmapCopy);
            z3gVar.m217040j(str);
            z3gVar.m217039i(nvpVar.m161717k());
            f89277a.m205842c(str2, z3gVar.getConstantState());
            return z3gVar;
        }
        if (!nvpVar.m161720n()) {
            return null;
        }
        v4n0 v4n0Var = new v4n0(nvpVar, bitmapCopy);
        v4n0Var.m197048f(str);
        f89277a.m205842c(str2, v4n0Var.getConstantState());
        return v4n0Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m114680d(String str, String str2) {
        return ogw.m164284e(str + str2);
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public static C22306c<imf0> m114681e(nvp nvpVar) {
        String strM161713g = nvpVar.m161713g();
        return !TextUtils.isEmpty(strM161713g) ? m114682f(nvpVar, strM161713g, nvpVar.m161716j()) : C22306c.error(new NullPointerException("cannot find background or icon for fanbase Medals!"));
    }

    /* JADX INFO: renamed from: f */
    public static C22306c<imf0> m114682f(final nvp nvpVar, String str, final String str2) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new vb20());
        }
        final String strM114680d = m114680d(nvpVar.m161715i() + nvpVar.m161710d() + nvpVar.m161711e() + nvpVar.m161714h(), str);
        Drawable.ConstantState constantStateM205840a = f89277a.m205840a(strM114680d);
        if (constantStateM205840a == null) {
            return hxs.m133392e("context_livingAct", str).map(new w9j() { // from class: l.b4g
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return e4g.m114679c(nvpVar, str2, strM114680d, (Bitmap) obj2);
                }
            }).filter(new w9j() { // from class: l.c4g
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((imf0) obj2) != null);
                }
            }).take(1).map(new w9j() { // from class: l.d4g
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return e4g.m114677a((imf0) obj2);
                }
            }).observeOn(jo0.m142408a());
        }
        if (nvpVar.m161719m()) {
            z3g z3gVar = (z3g) constantStateM205840a.newDrawable().mutate();
            z3gVar.m217041k(nvpVar.m161712f());
            z3gVar.m217040j(str2);
            z3gVar.m217039i(nvpVar.m161717k());
            obj = z3gVar;
        } else if (nvpVar.m161720n()) {
            v4n0 v4n0Var = (v4n0) constantStateM205840a.newDrawable().mutate();
            v4n0Var.m197049g(nvpVar.m161712f());
            v4n0Var.m197048f(str2);
            obj = v4n0Var;
        } else {
            obj = null;
        }
        return C22306c.just(obj);
    }
}
