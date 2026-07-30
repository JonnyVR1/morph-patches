package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class s5g {

    /* JADX INFO: renamed from: a */
    public static final vx3<String, Drawable.ConstantState> f166362a = new vx3<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ruf0 m184660a(ruf0 ruf0Var) {
        return ruf0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ruf0 m184662c(nxp nxpVar, String str, String str2, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        if (nxpVar.m165219m()) {
            n5g n5gVar = new n5g(nxpVar, bitmapCopy);
            n5gVar.m161720j(str);
            n5gVar.m161719i(nxpVar.m165217k());
            f166362a.m203833c(str2, n5gVar.getConstantState());
            return n5gVar;
        }
        if (!nxpVar.m165220n()) {
            return null;
        }
        zdn0 zdn0Var = new zdn0(nxpVar, bitmapCopy);
        zdn0Var.m219350f(str);
        f166362a.m203833c(str2, zdn0Var.getConstantState());
        return zdn0Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m184663d(String str, String str2) {
        return niw.m163315e(str + str2);
    }

    @MainThread
    /* JADX INFO: renamed from: e */
    public static C22421c<ruf0> m184664e(nxp nxpVar) {
        String strM165213g = nxpVar.m165213g();
        return !TextUtils.isEmpty(strM165213g) ? m184665f(nxpVar, strM165213g, nxpVar.m165216j()) : C22421c.error(new NullPointerException("cannot find background or icon for fanbase Medals!"));
    }

    /* JADX INFO: renamed from: f */
    public static C22421c<ruf0> m184665f(final nxp nxpVar, String str, final String str2) {
        Object obj;
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new ek20());
        }
        final String strM184663d = m184663d(nxpVar.m165215i() + nxpVar.m165210d() + nxpVar.m165211e() + nxpVar.m165214h(), str);
        Drawable.ConstantState constantStateM203831a = f166362a.m203831a(strM184663d);
        if (constantStateM203831a == null) {
            return izs.m142854e("context_livingAct", str).map(new qcj() { // from class: l.p5g
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return s5g.m184662c(nxpVar, str2, strM184663d, (Bitmap) obj2);
                }
            }).filter(new qcj() { // from class: l.q5g
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((ruf0) obj2) != null);
                }
            }).take(1).map(new qcj() { // from class: l.r5g
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return s5g.m184660a((ruf0) obj2);
                }
            }).observeOn(fo0.m126432a());
        }
        if (nxpVar.m165219m()) {
            n5g n5gVar = (n5g) constantStateM203831a.newDrawable().mutate();
            n5gVar.m161721k(nxpVar.m165212f());
            n5gVar.m161720j(str2);
            n5gVar.m161719i(nxpVar.m165217k());
            obj = n5gVar;
        } else if (nxpVar.m165220n()) {
            zdn0 zdn0Var = (zdn0) constantStateM203831a.newDrawable().mutate();
            zdn0Var.m219351g(nxpVar.m165212f());
            zdn0Var.m219350f(str2);
            obj = zdn0Var;
        } else {
            obj = null;
        }
        return C22421c.just(obj);
    }
}
