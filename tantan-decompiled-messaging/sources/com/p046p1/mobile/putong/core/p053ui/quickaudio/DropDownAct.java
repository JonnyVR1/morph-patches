package com.p046p1.mobile.putong.core.p053ui.quickaudio;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.ej2;
import p149l.gee;
import p149l.i30;
import p149l.lde;
import p149l.ogl0;
import p149l.sub0;
import p149l.vwb;
import p149l.xh0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\u0006J)\u0010(\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0006J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\u0006J\r\u0010-\u001a\u00020\u0014¢\u0006\u0004\b-\u0010\u0016J\r\u0010.\u001a\u00020\u0014¢\u0006\u0004\b.\u0010\u0016J\r\u0010/\u001a\u00020\u0014¢\u0006\u0004\b/\u0010\u0016J\r\u00100\u001a\u00020\u0014¢\u0006\u0004\b0\u0010\u0016J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u0010\u0016J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u0010\u0016J\r\u00103\u001a\u00020\u0014¢\u0006\u0004\b3\u0010\u0016R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/lde;", "Ll/ej2;", "Ll/sub0;", "<init>", "()V", "", "setTransparentStatusBar", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "d2", "()Ll/lde;", "e2", "()Ll/ej2;", "", "pageId", "()Ljava/lang/String;", "", "shouldSwitchToTransparentStatus", "()Z", "Landroid/view/View;", "kotlin.jvm.PlatformType", b2s.C_ZONE, "()Landroid/view/View;", "p", "stop", "Landroid/animation/Animator;", "B", "()Landroid/animation/Animator;", "w", "onBackPressed", "initPageHelper", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyLifecycle", "o2", "c2", "g2", "i2", "n2", "m2", "k2", "l2", "h2", "Ll/xh0;", "e", "Ll/xh0;", "continueQuickChatPartyDialog", "Companion", "a", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class DropDownAct extends PutongMvpAct<lde, ej2> implements sub0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public xh0 continueQuickChatPartyDialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.DropDownAct$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct$a;", "", "<init>", "()V", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", Active.TYPE, "from", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "isHideBotBtn", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Landroid/content/Intent;", "FROM_QUICKCHAT_CONVERSATION_ENTRY", "Ljava/lang/String;", "FROM_VOICE_QUICKCHAT_PARTY", "FROM_TEXT_QUICKCHAT_PARTY", "FROM_QUICKCHAT_FAKE", "FROM_SVIP_PAY_SUCCESS", "FROM_SVIP_PAY_SUCCESS_NEW", "", "REQUEST_QUICKCHAT_PARTY_CODE", "I", "FROM_AUDIO_QUICK_CHAT_GUIDE", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m54460a(@Nullable Context act) {
            return m54461b(act, null, "messages_view");
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m54461b(@Nullable Context act, @Nullable String active, @Nullable String from) {
            Intent intent = new Intent(act, (Class<?>) DropDownAct.class);
            if (active != null) {
                intent.putExtra(Active.TYPE, active);
            }
            if (from != null) {
                intent.putExtra("from", from);
            }
            return intent;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final Intent m54462c(@Nullable Context act, @Nullable String active, @Nullable String from, @Nullable Boolean isHideBotBtn) {
            Intent intentM54461b = m54461b(act, active, from);
            if (isHideBotBtn != null) {
                intentM54461b.putExtra("hie_bot_btn", isHideBotBtn.booleanValue());
            }
            return intentM54461b;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m54445Y1(DropDownAct dropDownAct, View view) {
        v v2 = dropDownAct.f17173d;
        if (v2 instanceof gee) {
            boolean zM125732O0 = ((gee) v2).m125732O0();
            v v3 = dropDownAct.f17173d;
            if (zM125732O0) {
                v3.getClass();
                ((gee) v3).mo116758f();
                return;
            }
            v3.getClass();
            if (((gee) v3).m125731N0()) {
                v v4 = dropDownAct.f17173d;
                v4.getClass();
                ((gee) v4).mo116757e();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public static final Intent m54446Z1(@Nullable Context context) {
        return INSTANCE.m54460a(context);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a2 */
    public static final Intent m54447a2(@Nullable Context context, @Nullable String str, @Nullable String str2) {
        return INSTANCE.m54461b(context, str, str2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b2 */
    public static final Intent m54448b2(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return INSTANCE.m54462c(context, str, str2, bool);
    }

    @Override // p149l.sub0
    @NotNull
    /* JADX INFO: renamed from: B */
    public Animator mo41784B() {
        AnimatorSet animatorSetM116759i = ((ej2) this.f17173d).m116759i();
        animatorSetM116759i.getClass();
        return animatorSetM116759i;
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: C */
    public View mo41785C() {
        return ((ej2) this.f17173d).mo116760j();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m54449c2() {
        xh0 xh0Var;
        xh0 xh0Var2 = this.continueQuickChatPartyDialog;
        if (xh0Var2 == null || !xh0Var2.m208718d() || (xh0Var = this.continueQuickChatPartyDialog) == null) {
            return;
        }
        xh0Var.m208717c();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public lde mo28672V1() {
        return new lde(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public ej2 mo28673X1() {
        return new gee(this);
    }

    /* JADX INFO: renamed from: g2 */
    public final boolean m54452g2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125723G0();
    }

    /* JADX INFO: renamed from: h2 */
    public final boolean m54453h2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125724H0();
    }

    /* JADX INFO: renamed from: i2 */
    public final boolean m54454i2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125726J0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = this.act.getIntent().getStringExtra("from");
        if (stringExtra != null) {
            this.pageHelper.m109040p(vwb.m200311Y("quickchat_from", stringExtra));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m54455k2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125725I0();
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m54456l2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125730M0();
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m54457m2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125731N0();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m54458n2() {
        v v2 = this.f17173d;
        if (!(v2 instanceof gee)) {
            return false;
        }
        v2.getClass();
        return ((gee) v2).m125732O0();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m54459o2() {
        xh0 xh0VarM208722a = new xh0.C21150a(this.act).m208740s("想跟其他人聊聊？").m208731j("继续极速约会，说不定下一个人就能和你擦出火花").m208727f("取消").m208729h(false).m208739r("继续").m208736o(new View.OnClickListener() { // from class: l.wce
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DropDownAct.m54445Y1(this.f185678a, view);
            }
        }).m208722a();
        this.continueQuickChatPartyDialog = xh0VarM208722a;
        if (xh0VarM208722a != null) {
            xh0VarM208722a.m208721g();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (ogl0.m164238Q() && 1911 == requestCode) {
            if (!m54458n2()) {
                m54459o2();
            } else {
                if (CoreModule.m29932K().mo30722Qf()) {
                    return;
                }
                m54459o2();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((ej2) this.f17173d).mo116754b().booleanValue()) {
            super.onBackPressed();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (ogl0.m164238Q()) {
            m54449c2();
        }
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: p */
    public View mo41786p() {
        return ((ej2) this.f17173d).mo116763m();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_quickchat";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.m81303a(getSupportActionBar())) {
            i30 supportActionBar = getSupportActionBar();
            supportActionBar.getClass();
            supportActionBar.mo134111A(0.0f);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p149l.sub0
    public void stop() {
        ((ej2) this.f17173d).mo116765p();
    }

    @Override // p149l.sub0
    /* JADX INFO: renamed from: w */
    public void mo41787w() {
    }
}
