package com.p051p1.mobile.putong.core.p058ui.messages.model.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageNewProfileSettingViewModel;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageNewProfileSettingHead;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.gta;
import p153l.h39;
import p153l.ibc0;
import p153l.nfz;
import p153l.nrb0;
import p153l.o1j0;
import p153l.qa00;
import p153l.uqb0;
import p153l.ux6;
import p153l.v100;

/* JADX INFO: loaded from: classes4.dex */
public class MessageNewProfileSettingHead extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f32983d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f32984e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32985f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f32986g;

    /* JADX INFO: renamed from: h */
    public VText f32987h;

    /* JADX INFO: renamed from: i */
    public VImage f32988i;

    /* JADX INFO: renamed from: j */
    public boolean f32989j;

    public MessageNewProfileSettingHead(Context context) {
        super(context);
        this.f32989j = false;
    }

    /* JADX INFO: renamed from: H */
    private void m50698H(Conversation conversation, User user) {
        if ((!NullChecker.m82486a(conversation) || !conversation.isAnonymous()) && !this.f32989j) {
            uqb0.f180374G.m127125Q0(this.f32985f, ux6.m198404b(user).calculatedWidth(110));
        } else {
            this.f32989j = true;
            uqb0.f180374G.m127109I0(this.f32985f, user.getAnonymousUrl(), qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m50699p(User user, Act act, MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, View view) {
        if (h39.m133419H()) {
            if (!NullChecker.m82486a(user) || user.inactivated) {
                o1j0.m165636j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                o1j0.m165636j("对方账号异常");
                return;
            }
        }
        act.startActivity(CoreModule.m30930K().mo31676Ar(act, messageNewProfileSettingViewModel.f116327b.m123852x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: B */
    public void m50700B(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, int i) {
        final Act act = messageNewProfileSettingViewModel.act();
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        act.setTitle("");
        m50703z(user);
        m50701I(act, user);
        bnl0.m105509E0(this.f32983d, new View.OnClickListener() { // from class: l.u100
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageNewProfileSettingHead.m50699p(user, act, messageNewProfileSettingViewModel, view);
            }
        });
        if (h39.m133419H() && (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            uqb0.f180374G.m127138Y0(this.f32985f, ibc0.f114059k1);
            return;
        }
        if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
            m50698H(conversationM33859Xe, user);
            return;
        }
        if (gta.m132210e().m132214d().mo34811c() && user.onlineMatchLocked()) {
            CoreModule.m30933P().m143405a().mo34484dc(this.f32985f, ux6.m198403a(user).calculatedWidth(110), i);
            return;
        }
        if (messageNewProfileSettingViewModel.f116327b.m123851u0()) {
            CoreModule.m30933P().m143405a().mo34484dc(this.f32985f, ux6.m198403a(user).calculatedWidth(110), i);
        } else if (CoreModule.m30933P().m143406b().mo36110Yg() && user.isLoveBuzz()) {
            nfz.INSTANCE.m162961a(this.f32985f, ux6.m198403a(user).calculatedWidth(110), i);
        } else {
            m50698H(conversationM33859Xe, user);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m50701I(Act act, User user) {
        Drawable drawable;
        if (nrb0.m164466b()) {
            this.f32987h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, this.f32988i);
        } else if (user.isPicVerificationVerified()) {
            if (gta.m132210e().m132214d().mo34733O() && user.isIdAndPicBothVerified()) {
                drawable = act.getResources().getDrawable(ibc0.f113785E6);
            } else {
                drawable = user.isPicVerificationVerified() ? act.getResources().getDrawable(ibc0.f114091n6) : null;
            }
            if (NullChecker.m82486a(drawable)) {
                drawable.setBounds(0, 0, qa00.m175859d(16.0f), qa00.m175859d(16.0f));
                this.f32987h.setCompoundDrawables(null, null, drawable, null);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50702q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m50702q(View view) {
        v100.m198964a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m50703z(User user) {
        if (NullChecker.m82486a(user)) {
            this.f32987h.setText(user.name);
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
            if (!TextUtils.isEmpty(strM116634y7)) {
                this.f32987h.setText(strM116634y7);
                return;
            }
            if (TextUtils.isEmpty(strM116634y7) && h39.m133419H()) {
                if (!NullChecker.m82486a(user) || user.inactivated) {
                    this.f32987h.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f32987h.setText("昵称已重置");
                }
            }
        }
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32989j = false;
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32989j = false;
    }
}
