package p153l;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class zae0 extends o5e0 {

    /* JADX INFO: renamed from: l.zae0$a */
    public class ViewOnClickListenerC21785a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f203552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f203553b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f203554c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f203555d;

        public ViewOnClickListenerC21785a(Act act, String str, String str2, String str3) {
            this.f203552a = act;
            this.f203553b = str;
            this.f203554c = str2;
            this.f203555d = str3;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138520r("e_agree", "p_paip_choose_avatar_switch_pop");
            zae0.this.m219120m(this.f203552a, this.f203553b, this.f203554c, this.f203555d);
        }
    }

    /* JADX INFO: renamed from: l.zae0$b */
    public class ViewOnClickListenerC21786b implements View.OnClickListener {
        public ViewOnClickListenerC21786b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138520r("e_cancel", "p_paip_choose_avatar_switch_pop");
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m219113f(String str, String str2, Act act, String str3, String str4) {
        if (!TextUtils.equals(str4, "true")) {
            l51.m152888H(act, new Runnable() { // from class: l.wae0
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                }
            }, 500L);
            return;
        }
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        if (NullChecker.m82486a(userM116597oa)) {
            if (TextUtils.isEmpty(str2)) {
                xg0.m210872c(act, userM116597oa, str3);
                return;
            }
            nae0.m162083m(act, Uri.parse("tantan://webview?url=" + str2));
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m219114g(Throwable th) {
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m219116i(Throwable th) {
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        String str = mapM96743f.get(Oauth2AccessToken.KEY_UID);
        String str2 = mapM96743f.get("from");
        if (TextUtils.isEmpty(str2)) {
            str2 = "other";
        }
        String str3 = mapM96743f.get("url");
        Act act = (Act) abe0Var.m96739b();
        if (m219121n(act, str, str2, str3)) {
            m219123p(act, str2, str, str3);
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m219120m(final Act act, final String str, final String str2, final String str3) {
        act.duringCreated(CoreModule.f18264c.f20359W1.m159487k3(true)).subscribe(psd0.m173597H(new y20() { // from class: l.xae0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193019a.m219122o(act, str, str2, str3, (uxj0) obj);
            }
        }, new y20() { // from class: l.yae0
            @Override // p153l.y20
            public final void call(Object obj) {
                zae0.m219114g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public final boolean m219121n(Act act, String str, String str2, String str3) {
        String aiPictureStatus = CoreModule.f18264c.f20381e0.m116593na().getAiPictureStatus();
        if (!TextUtils.equals(aiPictureStatus, "none") && !TextUtils.equals(aiPictureStatus, "false")) {
            return true;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_paip_choose_avatar_switch_pop", Dialog.class.getName());
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j("是否同时允许好友为你美化\n头像照片").m191147f("不允许").m191149h(false).m191144c(new ViewOnClickListenerC21786b()).m191159r("允许").m191156o(new ViewOnClickListenerC21785a(act, str2, str, str3)).m191155n(new DialogInterface.OnShowListener() { // from class: l.uae0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.vae0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        c20312a.m191142a().m191141g();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m219122o(Act act, String str, String str2, String str3, uxj0 uxj0Var) {
        m219123p(act, str, str2, str3);
    }

    /* JADX INFO: renamed from: p */
    public final void m219123p(final Act act, final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(str2);
        if (conversationM34219zp == null || TEnum.equals(conversationM34219zp.status, "dismissed")) {
            r1j0.m179420g("已解除配对，无法查看");
            return;
        }
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str2);
        if (userM116597oa == null) {
            return;
        }
        if (userM116597oa.isAccountCancellation()) {
            r1j0.m179420g("对方已注销");
        } else {
            act.duringCreated(CoreModule.f18264c.f20359W1.m159488l3(str2, "queryAuth")).subscribe(psd0.m173597H(new y20() { // from class: l.sae0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zae0.m219113f(str2, str3, act, str, (String) obj);
                }
            }, new y20() { // from class: l.tae0
                @Override // p153l.y20
                public final void call(Object obj) {
                    zae0.m219116i((Throwable) obj);
                }
            }));
        }
    }
}
