package p006l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.bh0;
import l.cwf0;
import l.e30;
import l.e51;
import l.f30;
import l.i0e;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.xh0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v2e0 extends kxd0 {

    /* JADX INFO: renamed from: l.v2e0$a */
    public class ViewOnClickListenerC1370a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f24094a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f24095b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f24096c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f24097d;

        public ViewOnClickListenerC1370a(Act act, String str, String str2, String str3) {
            this.f24094a = act;
            this.f24095b = str;
            this.f24096c = str2;
            this.f24097d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.r("e_agree", "p_paip_choose_avatar_switch_pop");
            v2e0.this.m25714m(this.f24094a, this.f24095b, this.f24096c, this.f24097d);
        }
    }

    /* JADX INFO: renamed from: l.v2e0$b */
    public class ViewOnClickListenerC1371b implements View.OnClickListener {
        public ViewOnClickListenerC1371b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.r("e_cancel", "p_paip_choose_avatar_switch_pop");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m25707f(String str, String str2, Act act, String str3, String str4) {
        if (!TextUtils.equals(str4, "true")) {
            e51.H(act, new Runnable() { // from class: l.s2e0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f1534c.f3631f0.m4580Fo();
                }
            }, 500L);
            return;
        }
        User userM21487oa = CoreModule.f1534c.f3628e0.m21487oa(str);
        if (NullChecker.a(userM21487oa)) {
            if (TextUtils.isEmpty(str2)) {
                bh0.c(act, userM21487oa, str3);
                return;
            }
            j2e0.m17248m(act, Uri.parse("tantan://webview?url=" + str2));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m25708g(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25710i(Throwable th) {
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        String str = mapM26160f.get("uid");
        String str2 = mapM26160f.get("from");
        if (TextUtils.isEmpty(str2)) {
            str2 = "other";
        }
        String str3 = mapM26160f.get("url");
        Act act = (Act) w2e0Var.m26156b();
        if (m25715n(act, str, str2, str3)) {
            m25717p(act, str2, str, str3);
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m25714m(final Act act, final String str, final String str2, final String str3) {
        act.duringCreated(CoreModule.f1534c.f3606W1.m16796k3(true)).subscribe(mkd0.H(new e30() { // from class: l.t2e0
            public final void call(Object obj) {
                this.f21846a.m25716o(act, str, str2, str3, (roj0) obj);
            }
        }, new e30() { // from class: l.u2e0
            public final void call(Object obj) {
                v2e0.m25708g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m25715n(Act act, String str, String str2, String str3) {
        String aiPictureStatus = CoreModule.f1534c.f3628e0.m21483na().getAiPictureStatus();
        if (!TextUtils.equals(aiPictureStatus, AccountMakeupPageAdapter.MakeupItem.NONE) && !TextUtils.equals(aiPictureStatus, "false")) {
            return true;
        }
        final cwf0 cwf0VarC = i0e.c("p_paip_choose_avatar_switch_pop", Dialog.class.getName());
        xh0.a aVar = new xh0.a(act);
        aVar.j("是否同时允许好友为你美化\n头像照片").f("不允许").h(false).c(new ViewOnClickListenerC1371b()).r("允许").o(new ViewOnClickListenerC1370a(act, str2, str, str3)).n(new DialogInterface.OnShowListener() { // from class: l.q2e0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.r2e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        aVar.a().g();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m25716o(Act act, String str, String str2, String str3, roj0 roj0Var) {
        m25717p(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public final void m25717p(final Act act, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Conversation conversationM5146zp = CoreModule.f1534c.f3631f0.m5146zp(str2);
        if (conversationM5146zp == null || TEnum.equals(conversationM5146zp.status, "dismissed")) {
            osi0.g("已解除配对，无法查看");
            return;
        }
        User userM21487oa = CoreModule.f1534c.f3628e0.m21487oa(str2);
        if (userM21487oa == null) {
            return;
        }
        if (userM21487oa.isAccountCancellation()) {
            osi0.g("对方已注销");
        } else {
            act.duringCreated(CoreModule.f1534c.f3606W1.m16797l3(str2, "queryAuth")).subscribe(mkd0.H(new e30() { // from class: l.o2e0
                public final void call(Object obj) {
                    v2e0.m25707f(str2, str3, act, str, (String) obj);
                }
            }, new e30() { // from class: l.p2e0
                public final void call(Object obj) {
                    v2e0.m25710i((Throwable) obj);
                }
            }));
        }
    }
}
