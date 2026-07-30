package p153l;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.newui.appeal.AppealProgressAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class t4e0 extends o5e0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m189258f(Act act, Throwable th) {
        o1j0.m165651y("系统异常，请稍后再试~");
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m189259g(Act act, AppealInfo appealInfo) {
        act.progressDismiss();
        if (!NullChecker.m82486a(appealInfo) || !appealInfo.needAppeal) {
            o1j0.m165651y((!NullChecker.m82486a(appealInfo) || TextUtils.isEmpty(appealInfo.needAppealDescription)) ? "系统异常，请稍后再试~" : appealInfo.needAppealDescription);
        } else if (TextUtils.equals(appealInfo.status, "inProgress")) {
            act.startActivity(AppealProgressAct.m37175a2(act, false));
        } else {
            new dyf(act).show();
        }
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (!ConnectivityReceiver.m82467g()) {
            o1j0.m165651y("暂无网络，请稍后再试~");
            return;
        }
        final Act act = (Act) abe0Var.m96739b();
        act.progress(R$string.f18632L5, true);
        act.duringCreated(CoreModule.f18264c.f20381e0.m116543aa().take(1).flatMap(new qcj() { // from class: l.q4e0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20381e0.f89012D0;
            }
        }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.r4e0
            @Override // p153l.y20
            public final void call(Object obj) {
                t4e0.m189259g(act, (AppealInfo) obj);
            }
        }, new y20() { // from class: l.s4e0
            @Override // p153l.y20
            public final void call(Object obj) {
                t4e0.m189258f(act, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.o5e0
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
