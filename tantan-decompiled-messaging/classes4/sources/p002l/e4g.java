package p002l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import l.hxs;
import l.imf0;
import l.jo0;
import l.ogw;
import l.vb20;
import l.w9j;
import l.ww3;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e4g {

    /* JADX INFO: renamed from: a */
    public static final ww3<String, Drawable.ConstantState> f9575a = new ww3<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ imf0 m12180a(imf0 imf0Var) {
        return imf0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ imf0 m12182c(nvp nvpVar, String str, String str2, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        if (nvpVar.m19118m()) {
            z3g z3gVar = new z3g(nvpVar, bitmapCopy);
            z3gVar.m27059j(str);
            z3gVar.m27058i(nvpVar.m19116k());
            f9575a.c(str2, z3gVar.getConstantState());
            return z3gVar;
        }
        if (!nvpVar.m19119n()) {
            return null;
        }
        v4n0 v4n0Var = new v4n0(nvpVar, bitmapCopy);
        v4n0Var.m23747f(str);
        f9575a.c(str2, v4n0Var.getConstantState());
        return v4n0Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m12183d(String str, String str2) {
        return ogw.e(str + str2);
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public static c<imf0> m12184e(nvp nvpVar) {
        String strM19112g = nvpVar.m19112g();
        return !TextUtils.isEmpty(strM19112g) ? m12185f(nvpVar, strM19112g, nvpVar.m19115j()) : c.error(new NullPointerException("cannot find background or icon for fanbase Medals!"));
    }

    /* JADX INFO: renamed from: f */
    public static c<imf0> m12185f(final nvp nvpVar, String str, final String str2) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            return c.create(new vb20());
        }
        final String strM12183d = m12183d(nvpVar.m19114i() + nvpVar.m19109d() + nvpVar.m19110e() + nvpVar.m19113h(), str);
        Drawable.ConstantState constantState = (Drawable.ConstantState) f9575a.a(strM12183d);
        if (constantState == null) {
            return hxs.e("context_livingAct", str).map(new w9j() { // from class: l.b4g
                public final Object call(Object obj2) {
                    return e4g.m12182c(nvpVar, str2, strM12183d, (Bitmap) obj2);
                }
            }).filter(new w9j() { // from class: l.c4g
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((imf0) obj2) != null);
                }
            }).take(1).map(new w9j() { // from class: l.d4g
                public final Object call(Object obj2) {
                    return e4g.m12180a((imf0) obj2);
                }
            }).observeOn(jo0.a());
        }
        if (nvpVar.m19118m()) {
            z3g z3gVar = (z3g) constantState.newDrawable().mutate();
            z3gVar.m27060k(nvpVar.m19111f());
            z3gVar.m27059j(str2);
            z3gVar.m27058i(nvpVar.m19116k());
            obj = z3gVar;
        } else if (nvpVar.m19119n()) {
            v4n0 v4n0Var = (v4n0) constantState.newDrawable().mutate();
            v4n0Var.m23748g(nvpVar.m19111f());
            v4n0Var.m23747f(str2);
            obj = v4n0Var;
        } else {
            obj = null;
        }
        return c.just(obj);
    }
}
