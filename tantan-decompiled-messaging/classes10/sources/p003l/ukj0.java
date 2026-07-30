package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessageProfileSettingAct;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.xh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ukj0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f7761a = {"是否解除配对", "解除配对将同时取消喜欢", "解除配对", "取消"};

    /* JADX INFO: renamed from: b */
    public static final String[] f7762b = {"是否解除配对", "解除配对将同时取消关注", "解除配对", "取消"};

    /* JADX INFO: renamed from: c */
    public static final String[] f7763c = {"是否确认取消关注", "取消关注将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: d */
    public static final String[] f7764d = {"是否确认取消喜欢", "取消喜欢将同时解除配对", "确认", "再想想"};

    /* JADX INFO: renamed from: e */
    public static final CharSequence f7765e = "解除配对";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9746a(Act act) {
        if (act instanceof MessageProfileSettingAct) {
            act.finish();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9747b(Act act, String str, String str2) {
        m9748c(act, str, str2, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m9748c(Act act, String str, String str2, boolean z) {
        m9749d(act, str, str2, null);
    }

    /* JADX INFO: renamed from: d */
    public static void m9749d(final Act act, String str, String str2, xh0 xh0Var) {
        CoreModule.K().confirmThenUnmatch(act, str, null, null, new d30() { // from class: l.tkj0
            public final void call() {
                ukj0.m9746a(act);
            }
        }, str2);
        if (NullChecker.a(xh0Var)) {
            xh0Var.c();
        }
    }
}
