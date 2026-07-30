package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.account.NewAccountSecureAct;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.LinkAction;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class h3e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m133464e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m133465f(String str, Context context, CommonData commonData) {
        if (TextUtils.equals(str, "bindPhone")) {
            if (NullChecker.m82486a(commonData.mobile) && TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
                context.startActivity(CoreModule.m30929H().mo29160Qa(context, VerifyReason.get(VerifyReason.bind_mobile), LinkAction.deeplink));
                return;
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
                return;
            }
        }
        if (TextUtils.equals(str, "bindEmail")) {
            if (TextUtils.isEmpty(commonData.email)) {
                CoreModule.m30929H().mo29166ji(context, false, LinkAction.deeplink, commonData.email);
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
            }
        }
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        final String strReplaceFirst = TextUtils.isEmpty(abe0Var.m96744g()) ? "" : abe0Var.m96744g().replaceFirst("/", "");
        final Context contextM96739b = abe0Var.m96739b();
        if (TextUtils.isEmpty(strReplaceFirst)) {
            return;
        }
        CoreModule.f18264c.f20369a0.m188266r3().filter(new qcj() { // from class: l.e3e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a((CommonData) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.f3e0
            @Override // p153l.y20
            public final void call(Object obj) {
                h3e0.m133465f(strReplaceFirst, contextM96739b, (CommonData) obj);
            }
        }, new y20() { // from class: l.g3e0
            @Override // p153l.y20
            public final void call(Object obj) {
                h3e0.m133464e((Throwable) obj);
            }
        }));
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
