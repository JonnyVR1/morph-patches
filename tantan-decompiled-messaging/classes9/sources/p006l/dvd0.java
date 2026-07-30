package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.account.NewAccountSecureAct;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class dvd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14305e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14306f(String str, Context context, CommonData commonData) {
        if (TextUtils.equals(str, "bindPhone")) {
            if (NullChecker.a(commonData.mobile) && TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
                context.startActivity(CoreModule.m1850H().mo56Qa(context, VerifyReason.get("bind_mobile"), "deeplink"));
                return;
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
                return;
            }
        }
        if (TextUtils.equals(str, "bindEmail")) {
            if (TextUtils.isEmpty(commonData.email)) {
                CoreModule.m1850H().mo62ji(context, false, "deeplink", commonData.email);
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
            }
        }
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m26161g()) ? "" : w2e0Var.m26161g().replaceFirst("/", "");
        final Context contextM26156b = w2e0Var.m26156b();
        if (TextUtils.isEmpty(strReplaceFirst)) {
            return;
        }
        CoreModule.f1534c.f3616a0.m21762r3().filter(new w9j() { // from class: l.avd0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((CommonData) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bvd0
            public final void call(Object obj) {
                dvd0.m14306f(strReplaceFirst, contextM26156b, (CommonData) obj);
            }
        }, new e30() { // from class: l.cvd0
            public final void call(Object obj) {
                dvd0.m14305e((Throwable) obj);
            }
        }));
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
