package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class ukj0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f176936a = {"是否解除配对", "解除配对将同时取消喜欢", "解除配对", "取消"};

    /* JADX INFO: renamed from: b */
    public static final String[] f176937b = {"是否解除配对", "解除配对将同时取消关注", "解除配对", "取消"};

    /* JADX INFO: renamed from: c */
    public static final String[] f176938c = {"是否确认取消关注", "取消关注将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: d */
    public static final String[] f176939d = {"是否确认取消喜欢", "取消喜欢将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: e */
    public static final CharSequence f176940e = "解除配对";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m194173a(Act act) {
        if (act instanceof MessageProfileSettingAct) {
            act.lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m194174b(Act act, String str, String str2) {
        m194175c(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m194175c(Act act, String str, String str2, boolean z) {
        m194176d(act, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m194176d(final Act act, String str, String str2, xh0 xh0Var) {
        CoreModule.m29932K().confirmThenUnmatch(act, str, null, null, new d30() { // from class: l.tkj0
            @Override // p149l.d30
            public final void call() {
                ukj0.m194173a(act);
            }
        }, str2);
        if (NullChecker.m81303a(xh0Var)) {
            xh0Var.m208717c();
        }
    }
}
