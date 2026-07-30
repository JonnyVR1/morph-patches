package p149l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class zb20 {

    /* JADX INFO: renamed from: a */
    public static ww3<String, Drawable.ConstantState> f202417a = new ww3<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ imf0 m217817a(tb20 tb20Var) {
        return tb20Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ tb20 m217818b(String str, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        tb20 tb20Var = new tb20(bitmap.copy(bitmap.getConfig(), false));
        f202417a.m205842c(str, tb20Var.getConstantState());
        return tb20Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m217820d(String str) {
        return ogw.m164284e(str);
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<imf0> m217821e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return C22306c.create(new vb20());
        }
        final String strM217820d = m217820d(str);
        Drawable.ConstantState constantStateM205840a = f202417a.m205840a(strM217820d);
        return constantStateM205840a != null ? C22306c.just((tb20) constantStateM205840a.newDrawable().mutate()) : hxs.m133393f("context_livingAct", str, i).map(new w9j() { // from class: l.wb20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zb20.m217818b(strM217820d, (Bitmap) obj);
            }
        }).filter(new w9j() { // from class: l.xb20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tb20) obj) != null);
            }
        }).take(1).map(new w9j() { // from class: l.yb20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zb20.m217817a((tb20) obj);
            }
        }).observeOn(jo0.m142408a());
    }
}
