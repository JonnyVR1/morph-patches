package p149l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class v2e0 extends kxd0 {

    /* JADX INFO: renamed from: l.v2e0$a */
    public class ViewOnClickListenerC20568a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f179533a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f179534b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f179535c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f179536d;

        public ViewOnClickListenerC20568a(Act act, String str, String str2, String str3) {
            this.f179533a = act;
            this.f179534b = str;
            this.f179535c = str2;
            this.f179536d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220396r("e_agree", "p_paip_choose_avatar_switch_pop");
            v2e0.this.m196780m(this.f179533a, this.f179534b, this.f179535c, this.f179536d);
        }
    }

    /* JADX INFO: renamed from: l.v2e0$b */
    public class ViewOnClickListenerC20569b implements View.OnClickListener {
        public ViewOnClickListenerC20569b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220396r("e_cancel", "p_paip_choose_avatar_switch_pop");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m196773f(String str, String str2, Act act, String str3, String str4) {
        if (!TextUtils.equals(str4, "true")) {
            e51.m114743H(act, new Runnable() { // from class: l.s2e0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                }
            }, 500L);
            return;
        }
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        if (NullChecker.m81303a(userM169524oa)) {
            if (TextUtils.isEmpty(str2)) {
                bh0.m101753c(act, userM169524oa, str3);
                return;
            }
            j2e0.m139446m(act, Uri.parse("tantan://webview?url=" + str2));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m196774g(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m196776i(Throwable th) {
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        String str = mapM201098f.get(Oauth2AccessToken.KEY_UID);
        String str2 = mapM201098f.get("from");
        if (TextUtils.isEmpty(str2)) {
            str2 = "other";
        }
        String str3 = mapM201098f.get("url");
        Act act = (Act) w2e0Var.m201094b();
        if (m196781n(act, str, str2, str3)) {
            m196783p(act, str2, str, str3);
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m196780m(final Act act, final String str, final String str2, final String str3) {
        act.duringCreated(CoreModule.f17545c.f19617W1.m137467k3(true)).subscribe(mkd0.m154956H(new e30() { // from class: l.t2e0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167460a.m196782o(act, str, str2, str3, (roj0) obj);
            }
        }, new e30() { // from class: l.u2e0
            @Override // p149l.e30
            public final void call(Object obj) {
                v2e0.m196774g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m196781n(Act act, String str, String str2, String str3) {
        String aiPictureStatus = CoreModule.f17545c.f19639e0.m169520na().getAiPictureStatus();
        if (!TextUtils.equals(aiPictureStatus, "none") && !TextUtils.equals(aiPictureStatus, "false")) {
            return true;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_paip_choose_avatar_switch_pop", Dialog.class.getName());
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j("是否同时允许好友为你美化\n头像照片").m208727f("不允许").m208729h(false).m208724c(new ViewOnClickListenerC20569b()).m208739r("允许").m208736o(new ViewOnClickListenerC20568a(act, str2, str, str3)).m208735n(new DialogInterface.OnShowListener() { // from class: l.q2e0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.r2e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        c21150a.m208722a().m208721g();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m196782o(Act act, String str, String str2, String str3, roj0 roj0Var) {
        m196783p(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public final void m196783p(final Act act, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(str2);
        if (conversationM33216zp == null || TEnum.equals(conversationM33216zp.status, "dismissed")) {
            osi0.m165783g("已解除配对，无法查看");
            return;
        }
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str2);
        if (userM169524oa == null) {
            return;
        }
        if (userM169524oa.isAccountCancellation()) {
            osi0.m165783g("对方已注销");
        } else {
            act.duringCreated(CoreModule.f17545c.f19617W1.m137468l3(str2, "queryAuth")).subscribe(mkd0.m154956H(new e30() { // from class: l.o2e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    v2e0.m196773f(str2, str3, act, str, (String) obj);
                }
            }, new e30() { // from class: l.p2e0
                @Override // p149l.e30
                public final void call(Object obj) {
                    v2e0.m196776i((Throwable) obj);
                }
            }));
        }
    }
}
