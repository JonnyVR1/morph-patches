package com.p051p1.mobile.putong.core.p058ui.quickaudio;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import io.agora.rtc2.internal.AudioRoutingController;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c30;
import p153l.c4s;
import p153l.jyb;
import p153l.kfe;
import p153l.mj2;
import p153l.pee;
import p153l.spl0;
import p153l.th0;
import p153l.w2c0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u00019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u0006J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\u0006J\u000f\u0010\"\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\"\u0010\u0006J)\u0010(\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\b*\u0010\u0006J\r\u0010+\u001a\u00020\u0007¢\u0006\u0004\b+\u0010\u0006J\r\u0010,\u001a\u00020\u0007¢\u0006\u0004\b,\u0010\u0006J\r\u0010-\u001a\u00020\u0014¢\u0006\u0004\b-\u0010\u0016J\r\u0010.\u001a\u00020\u0014¢\u0006\u0004\b.\u0010\u0016J\r\u0010/\u001a\u00020\u0014¢\u0006\u0004\b/\u0010\u0016J\r\u00100\u001a\u00020\u0014¢\u0006\u0004\b0\u0010\u0016J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u0010\u0016J\r\u00102\u001a\u00020\u0014¢\u0006\u0004\b2\u0010\u0016J\r\u00103\u001a\u00020\u0014¢\u0006\u0004\b3\u0010\u0016R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct;", "Lcom/p1/mobile/putong/app/PutongMvpAct;", "Ll/pee;", "Ll/mj2;", "Ll/w2c0;", "<init>", "()V", "", "setTransparentStatusBar", "Landroid/os/Bundle;", "sis", "preCreateView", "(Landroid/os/Bundle;)V", "e2", "()Ll/pee;", "g2", "()Ll/mj2;", "", "pageId", "()Ljava/lang/String;", "", "shouldSwitchToTransparentStatus", "()Z", "Landroid/view/View;", "kotlin.jvm.PlatformType", "E", "()Landroid/view/View;", "q", "stop", "Landroid/animation/Animator;", c4s.C_ZONE, "()Landroid/animation/Animator;", "w", "onBackPressed", "initPageHelper", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroyLifecycle", "p2", "d2", "h2", "k2", "o2", "n2", "l2", "m2", "i2", "Ll/th0;", "e", "Ll/th0;", "continueQuickChatPartyDialog", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class DropDownAct extends PutongMvpAct<pee, mj2> implements w2c0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public th0 continueQuickChatPartyDialog;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.DropDownAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013¨\u0006\u001d"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/DropDownAct$a;", "", "<init>", "()V", "Landroid/content/Context;", SocialConstants.PARAM_ACT, "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "", Active.TYPE, "from", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "", "isHideBotBtn", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Landroid/content/Intent;", "FROM_QUICKCHAT_CONVERSATION_ENTRY", "Ljava/lang/String;", "FROM_VOICE_QUICKCHAT_PARTY", "FROM_TEXT_QUICKCHAT_PARTY", "FROM_QUICKCHAT_FAKE", "FROM_SVIP_PAY_SUCCESS", "FROM_SVIP_PAY_SUCCESS_NEW", "", "REQUEST_QUICKCHAT_PARTY_CODE", "I", "FROM_AUDIO_QUICK_CHAT_GUIDE", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m55643a(@Nullable Context act) {
            return m55644b(act, null, "messages_view");
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m55644b(@Nullable Context act, @Nullable String active, @Nullable String from) {
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
        public final Intent m55645c(@Nullable Context act, @Nullable String active, @Nullable String from, @Nullable Boolean isHideBotBtn) {
            Intent intentM55644b = m55644b(act, active, from);
            if (isHideBotBtn != null) {
                intentM55644b.putExtra("hie_bot_btn", isHideBotBtn.booleanValue());
            }
            return intentM55644b;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m55628Z1(DropDownAct dropDownAct, View view) {
        v v2 = dropDownAct.f17892d;
        if (v2 instanceof kfe) {
            boolean zM149458O0 = ((kfe) v2).m149458O0();
            v v3 = dropDownAct.f17892d;
            if (zM149458O0) {
                v3.getClass();
                ((kfe) v3).mo149477f();
                return;
            }
            v3.getClass();
            if (((kfe) v3).m149457N0()) {
                v v4 = dropDownAct.f17892d;
                v4.getClass();
                ((kfe) v4).mo149475e();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a2 */
    public static final Intent m55629a2(@Nullable Context context) {
        return INSTANCE.m55643a(context);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b2 */
    public static final Intent m55630b2(@Nullable Context context, @Nullable String str, @Nullable String str2) {
        return INSTANCE.m55644b(context, str, str2);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c2 */
    public static final Intent m55631c2(@Nullable Context context, @Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        return INSTANCE.m55645c(context, str, str2, bool);
    }

    @Override // p153l.w2c0
    @NotNull
    /* JADX INFO: renamed from: C */
    public Animator mo42795C() {
        AnimatorSet animatorSetM158562i = ((mj2) this.f17892d).m158562i();
        animatorSetM158562i.getClass();
        return animatorSetM158562i;
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: E */
    public View mo42796E() {
        return ((mj2) this.f17892d).mo149482j();
    }

    /* JADX INFO: renamed from: d2 */
    public final void m55632d2() {
        th0 th0Var;
        th0 th0Var2 = this.continueQuickChatPartyDialog;
        if (th0Var2 == null || !th0Var2.m191138d() || (th0Var = this.continueQuickChatPartyDialog) == null) {
            return;
        }
        th0Var.m191137c();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public pee mo29671X1() {
        return new pee(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    @NotNull
    /* JADX INFO: renamed from: g2, reason: merged with bridge method [inline-methods] */
    public mj2 mo29672Y1() {
        return new kfe(this);
    }

    /* JADX INFO: renamed from: h2 */
    public final boolean m55635h2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149449G0();
    }

    /* JADX INFO: renamed from: i2 */
    public final boolean m55636i2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149450H0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        String stringExtra = this.act.getIntent().getStringExtra("from");
        if (stringExtra != null) {
            this.pageHelper.m152781p(jyb.m147494Y("quickchat_from", stringExtra));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final boolean m55637k2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149452J0();
    }

    /* JADX INFO: renamed from: l2 */
    public final boolean m55638l2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149451I0();
    }

    /* JADX INFO: renamed from: m2 */
    public final boolean m55639m2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149456M0();
    }

    /* JADX INFO: renamed from: n2 */
    public final boolean m55640n2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149457N0();
    }

    /* JADX INFO: renamed from: o2 */
    public final boolean m55641o2() {
        v v2 = this.f17892d;
        if (!(v2 instanceof kfe)) {
            return false;
        }
        v2.getClass();
        return ((kfe) v2).m149458O0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (spl0.m187365Q() && 1911 == requestCode) {
            if (!m55641o2()) {
                m55642p2();
            } else {
                if (CoreModule.m30930K().mo31725Qf()) {
                    return;
                }
                m55642p2();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((mj2) this.f17892d).mo149469b().booleanValue()) {
            super.onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        if (spl0.m187365Q()) {
            m55632d2();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final void m55642p2() {
        th0 th0VarM191142a = new th0.C20312a(this.act).m191160s("想跟其他人聊聊？").m191151j("继续极速约会，说不定下一个人就能和你擦出火花").m191147f("取消").m191149h(false).m191159r("继续").m191156o(new View.OnClickListener() { // from class: l.aee
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DropDownAct.m55628Z1(this.f70786a, view);
            }
        }).m191142a();
        this.continueQuickChatPartyDialog = th0VarM191142a;
        if (th0VarM191142a != null) {
            th0VarM191142a.m191141g();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_quickchat";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        setSwipeBackEnable(false);
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: q */
    public View mo42797q() {
        return ((mj2) this.f17892d).mo149486m();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
        if (NullChecker.m82486a(getSupportActionBar())) {
            c30 supportActionBar = getSupportActionBar();
            supportActionBar.getClass();
            supportActionBar.mo102168A(0.0f);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // p153l.w2c0
    public void stop() {
        ((mj2) this.f17892d).mo149491p();
    }

    @Override // p153l.w2c0
    /* JADX INFO: renamed from: w */
    public void mo42798w() {
    }
}
