package p149l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class pwd0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m171736f(Act act, Throwable th) {
        lsi0.m151595y("系统异常，请稍后再试~");
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m171737g(Act act, AppealInfo appealInfo) {
        act.progressDismiss();
        if (!NullChecker.m81303a(appealInfo) || !appealInfo.needAppeal) {
            lsi0.m151595y((!NullChecker.m81303a(appealInfo) || TextUtils.isEmpty(appealInfo.needAppealDescription)) ? "系统异常，请稍后再试~" : appealInfo.needAppealDescription);
        } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.m36172Z1(act, false));
        } else {
            new pwf(act).show();
        }
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!ConnectivityReceiver.m81284g()) {
            lsi0.m151595y("暂无网络，请稍后再试~");
            return;
        }
        final Act act = (Act) w2e0Var.m201094b();
        act.progress(R$string.f17842J5, true);
        act.duringCreated(CoreModule.f17545c.f19639e0.m169470aa().take(1).flatMap(new w9j() { // from class: l.mwd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19639e0.f149155D0;
            }
        }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.nwd0
            @Override // p149l.e30
            public final void call(Object obj) {
                pwd0.m171737g(act, (AppealInfo) obj);
            }
        }, new e30() { // from class: l.owd0
            @Override // p149l.e30
            public final void call(Object obj) {
                pwd0.m171736f(act, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.kxd0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
