package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.account.NewAccountSecureAct;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.LinkAction;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class dvd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m113775e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m113776f(String str, Context context, CommonData commonData) {
        if (TextUtils.equals(str, "bindPhone")) {
            if (NullChecker.m81303a(commonData.mobile) && TextUtils.isEmpty(commonData.mobile.mobileNumber)) {
                context.startActivity(CoreModule.m29931H().mo28161Qa(context, VerifyReason.get(VerifyReason.bind_mobile), LinkAction.deeplink));
                return;
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
                return;
            }
        }
        if (TextUtils.equals(str, "bindEmail")) {
            if (TextUtils.isEmpty(commonData.email)) {
                CoreModule.m29931H().mo28167ji(context, false, LinkAction.deeplink, commonData.email);
            } else {
                context.startActivity(new Intent(context, (Class<?>) NewAccountSecureAct.class));
            }
        }
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        final String strReplaceFirst = TextUtils.isEmpty(w2e0Var.m201099g()) ? "" : w2e0Var.m201099g().replaceFirst("/", "");
        final Context contextM201094b = w2e0Var.m201094b();
        if (TextUtils.isEmpty(strReplaceFirst)) {
            return;
        }
        CoreModule.f17545c.f19627a0.m171570r3().filter(new w9j() { // from class: l.avd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a((CommonData) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bvd0
            @Override // p149l.e30
            public final void call(Object obj) {
                dvd0.m113776f(strReplaceFirst, contextM201094b, (CommonData) obj);
            }
        }, new e30() { // from class: l.cvd0
            @Override // p149l.e30
            public final void call(Object obj) {
                dvd0.m113775e((Throwable) obj);
            }
        }));
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
