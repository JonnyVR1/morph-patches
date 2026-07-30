package p006l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.lsi0;
import l.mkd0;
import l.pwf;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pwd0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21773f(Act act, Throwable th) {
        lsi0.y("系统异常，请稍后再试~");
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m21774g(Act act, AppealInfo appealInfo) {
        act.progressDismiss();
        if (!NullChecker.a(appealInfo) || !appealInfo.needAppeal) {
            lsi0.y((!NullChecker.a(appealInfo) || TextUtils.isEmpty(appealInfo.needAppealDescription)) ? "系统异常，请稍后再试~" : appealInfo.needAppealDescription);
        } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.Z1(act, false));
        } else {
            new pwf(act).show();
        }
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!ConnectivityReceiver.g()) {
            lsi0.y("暂无网络，请稍后再试~");
            return;
        }
        final Act actM26156b = w2e0Var.m26156b();
        actM26156b.progress(R$string.f1831J5, true);
        actM26156b.duringCreated(CoreModule.f1534c.f3628e0.m21433aa().take(1).flatMap(new w9j() { // from class: l.mwd0
            public final Object call(Object obj) {
                return CoreModule.f1534c.f3628e0.f18767D0;
            }
        }).take(1)).subscribe(mkd0.H(new e30() { // from class: l.nwd0
            public final void call(Object obj) {
                pwd0.m21774g(actM26156b, (AppealInfo) obj);
            }
        }, new e30() { // from class: l.owd0
            public final void call(Object obj) {
                pwd0.m21773f(actM26156b, (Throwable) obj);
            }
        }));
    }

    @Override // p006l.kxd0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
