package com.p046p1.mobile.putong.core.p053ui.messages.model.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageNewProfileSettingViewModel;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageNewProfileSettingHead;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.c3c0;
import p149l.jjb0;
import p149l.lsi0;
import p149l.q6z;
import p149l.qib0;
import p149l.rw6;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.y19;
import p149l.ysz;

/* JADX INFO: loaded from: classes3.dex */
public class MessageNewProfileSettingHead extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f32135d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f32136e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32137f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f32138g;

    /* JADX INFO: renamed from: h */
    public VText f32139h;

    /* JADX INFO: renamed from: i */
    public VImage f32140i;

    /* JADX INFO: renamed from: j */
    public boolean f32141j;

    public MessageNewProfileSettingHead(Context context) {
        super(context);
        this.f32141j = false;
    }

    /* JADX INFO: renamed from: H */
    private void m49515H(Conversation conversation, User user) {
        if ((!NullChecker.m81303a(conversation) || !conversation.isAnonymous()) && !this.f32141j) {
            qib0.f154691G.m102341Q0(this.f32137f, rw6.m181386b(user).calculatedWidth(110));
        } else {
            this.f32141j = true;
            qib0.f154691G.m102325I0(this.f32137f, user.getAnonymousUrl(), t100.m186890d(110.0f), t100.m186890d(110.0f));
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m49516p(User user, Act act, MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, View view) {
        if (y19.m212148H()) {
            if (!NullChecker.m81303a(user) || user.inactivated) {
                lsi0.m151580j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                lsi0.m151580j("对方账号异常");
                return;
            }
        }
        act.startActivity(CoreModule.m29932K().mo30673Ar(act, messageNewProfileSettingViewModel.f160470b.m138698x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: B */
    public void m49517B(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, int i) {
        final Act act = messageNewProfileSettingViewModel.act();
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        act.setTitle("");
        m49520z(user);
        m49518I(act, user);
        xdl0.m208329E0(this.f32135d, new View.OnClickListener() { // from class: l.xsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageNewProfileSettingHead.m49516p(user, act, messageNewProfileSettingViewModel, view);
            }
        });
        if (y19.m212148H() && (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            qib0.f154691G.m102354Y0(this.f32137f, c3c0.f78784k1);
            return;
        }
        if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
            m49515H(conversationM32856Xe, user);
            return;
        }
        if (ura.m195053e().m195057d().mo33808c() && user.onlineMatchLocked()) {
            CoreModule.m29935P().m94651a().mo33481dc(this.f32137f, rw6.m181385a(user).calculatedWidth(110), i);
            return;
        }
        if (messageNewProfileSettingViewModel.f160470b.m138697u0()) {
            CoreModule.m29935P().m94651a().mo33481dc(this.f32137f, rw6.m181385a(user).calculatedWidth(110), i);
        } else if (CoreModule.m29935P().m94652b().mo35107Yg() && user.isLoveBuzz()) {
            q6z.INSTANCE.m173182a(this.f32137f, rw6.m181385a(user).calculatedWidth(110), i);
        } else {
            m49515H(conversationM32856Xe, user);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m49518I(Act act, User user) {
        Drawable drawable;
        if (jjb0.m141784b()) {
            this.f32139h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, this.f32140i);
        } else if (user.isPicVerificationVerified()) {
            if (ura.m195053e().m195057d().mo33730O() && user.isIdAndPicBothVerified()) {
                drawable = act.getResources().getDrawable(c3c0.f78510E6);
            } else {
                drawable = user.isPicVerificationVerified() ? act.getResources().getDrawable(c3c0.f78816n6) : null;
            }
            if (NullChecker.m81303a(drawable)) {
                drawable.setBounds(0, 0, t100.m186890d(16.0f), t100.m186890d(16.0f));
                this.f32139h.setCompoundDrawables(null, null, drawable, null);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49519q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m49519q(View view) {
        ysz.m215991a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m49520z(User user) {
        if (NullChecker.m81303a(user)) {
            this.f32139h.setText(user.name);
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
            if (!TextUtils.isEmpty(strM169561y7)) {
                this.f32139h.setText(strM169561y7);
                return;
            }
            if (TextUtils.isEmpty(strM169561y7) && y19.m212148H()) {
                if (!NullChecker.m81303a(user) || user.inactivated) {
                    this.f32139h.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f32139h.setText("昵称已重置");
                }
            }
        }
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32141j = false;
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32141j = false;
    }
}
