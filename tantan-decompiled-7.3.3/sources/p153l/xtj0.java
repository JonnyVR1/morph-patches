package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class xtj0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f196226a = {"是否解除配对", "解除配对将同时取消喜欢", "解除配对", "取消"};

    /* JADX INFO: renamed from: b */
    public static final String[] f196227b = {"是否解除配对", "解除配对将同时取消关注", "解除配对", "取消"};

    /* JADX INFO: renamed from: c */
    public static final String[] f196228c = {"是否确认取消关注", "取消关注将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: d */
    public static final String[] f196229d = {"是否确认取消喜欢", "取消喜欢将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: e */
    public static final CharSequence f196230e = "解除配对";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m213098a(Act act) {
        if (act instanceof MessageProfileSettingAct) {
            act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m213099b(Act act, String str, String str2) {
        m213100c(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m213100c(Act act, String str, String str2, boolean z) {
        m213101d(act, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m213101d(final Act act, String str, String str2, th0 th0Var) {
        CoreModule.m30930K().confirmThenUnmatch(act, str, null, null, new x20() { // from class: l.wtj0
            @Override // p153l.x20
            public final void call() {
                xtj0.m213098a(act);
            }
        }, str2);
        if (NullChecker.m82486a(th0Var)) {
            th0Var.m191137c();
        }
    }
}
