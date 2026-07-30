package p153l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class ik20 {

    /* JADX INFO: renamed from: a */
    public static vx3<String, Drawable.ConstantState> f115319a = new vx3<>();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ruf0 m140251a(ck20 ck20Var) {
        return ck20Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ck20 m140252b(String str, Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return null;
        }
        ck20 ck20Var = new ck20(bitmap.copy(bitmap.getConfig(), false));
        f115319a.m203833c(str, ck20Var.getConstantState());
        return ck20Var;
    }

    /* JADX INFO: renamed from: d */
    public static String m140254d(String str) {
        return niw.m163315e(str);
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<ruf0> m140255e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return C22421c.create(new ek20());
        }
        final String strM140254d = m140254d(str);
        Drawable.ConstantState constantStateM203831a = f115319a.m203831a(strM140254d);
        return constantStateM203831a != null ? C22421c.just((ck20) constantStateM203831a.newDrawable().mutate()) : izs.m142855f("context_livingAct", str, i).map(new qcj() { // from class: l.fk20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ik20.m140252b(strM140254d, (Bitmap) obj);
            }
        }).filter(new qcj() { // from class: l.gk20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ck20) obj) != null);
            }
        }).take(1).map(new qcj() { // from class: l.hk20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ik20.m140251a((ck20) obj);
            }
        }).observeOn(fo0.m126432a());
    }
}
