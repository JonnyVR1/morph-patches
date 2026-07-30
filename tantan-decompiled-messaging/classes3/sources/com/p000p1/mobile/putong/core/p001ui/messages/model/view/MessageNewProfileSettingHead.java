package com.p000p1.mobile.putong.core.p001ui.messages.model.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.model.MessageNewProfileSettingViewModel;
import com.p000p1.mobile.putong.core.p001ui.messages.model.view.MessageNewProfileSettingHead;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.jjb0;
import l.lsi0;
import l.q6z;
import l.qib0;
import l.rw6;
import l.t100;
import l.ura;
import l.xdl0;
import l.y19;
import l.ysz;
import org.spongycastle.asn1.eac.EACTags;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageNewProfileSettingHead extends VRelative {

    /* JADX INFO: renamed from: d */
    public MessageNewProfileSettingHead f2026d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f2027e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2028f;

    /* JADX INFO: renamed from: g */
    public GradientBgButton f2029g;

    /* JADX INFO: renamed from: h */
    public VText f2030h;

    /* JADX INFO: renamed from: i */
    public VImage f2031i;

    /* JADX INFO: renamed from: j */
    public boolean f2032j;

    public MessageNewProfileSettingHead(Context context) {
        super(context);
        this.f2032j = false;
    }

    /* JADX INFO: renamed from: H */
    private void m2662H(Conversation conversation, User user) {
        if ((!NullChecker.a(conversation) || !conversation.isAnonymous()) && !this.f2032j) {
            qib0.G.Q0(this.f2028f, rw6.b(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA));
        } else {
            this.f2032j = true;
            qib0.G.I0(this.f2028f, user.getAnonymousUrl(), t100.d(110.0f), t100.d(110.0f));
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2663p(User user, Act act, MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, View view) {
        if (y19.H()) {
            if (!NullChecker.a(user) || user.inactivated) {
                lsi0.j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                lsi0.j("对方账号异常");
                return;
            }
        }
        act.startActivity(CoreModule.K().Ar(act, messageNewProfileSettingViewModel.f7032b.x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: B */
    public void m2664B(final MessageNewProfileSettingViewModel messageNewProfileSettingViewModel, final User user, int i) {
        final Act act = messageNewProfileSettingViewModel.act();
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        act.setTitle("");
        m2667z(user);
        m2665I(act, user);
        xdl0.E0(this.f2026d, new View.OnClickListener() { // from class: l.xsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MessageNewProfileSettingHead.m2663p(user, act, messageNewProfileSettingViewModel, view);
            }
        });
        if (y19.H() && (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
            qib0.G.Y0(this.f2028f, c3c0.k1);
            return;
        }
        if (NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
            m2662H(conversationXe, user);
            return;
        }
        if (ura.e().d().c() && user.onlineMatchLocked()) {
            CoreModule.P().a().dc(this.f2028f, rw6.a(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA), i);
            return;
        }
        if (messageNewProfileSettingViewModel.f7032b.u0()) {
            CoreModule.P().a().dc(this.f2028f, rw6.a(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA), i);
        } else if (CoreModule.P().b().Yg() && user.isLoveBuzz()) {
            q6z.INSTANCE.a(this.f2028f, rw6.a(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA), i);
        } else {
            m2662H(conversationXe, user);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m2665I(Act act, User user) {
        Drawable drawable;
        if (jjb0.b()) {
            this.f2030h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.b0.b.showUserVerificationLogo(act, user, this.f2031i);
        } else if (user.isPicVerificationVerified()) {
            if (ura.e().d().O() && user.isIdAndPicBothVerified()) {
                drawable = act.getResources().getDrawable(c3c0.E6);
            } else {
                drawable = user.isPicVerificationVerified() ? act.getResources().getDrawable(c3c0.n6) : null;
            }
            if (NullChecker.a(drawable)) {
                drawable.setBounds(0, 0, t100.d(16.0f), t100.d(16.0f));
                this.f2030h.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2666q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m2666q(View view) {
        ysz.a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m2667z(User user) {
        if (NullChecker.a(user)) {
            this.f2030h.setText(user.name);
            CharSequence charSequenceY7 = CoreModule.c.e0.y7(((DbObject) user).id);
            if (!TextUtils.isEmpty(charSequenceY7)) {
                this.f2030h.setText(charSequenceY7);
                return;
            }
            if (TextUtils.isEmpty(charSequenceY7) && y19.H()) {
                if (!NullChecker.a(user) || user.inactivated) {
                    this.f2030h.setText("已注销");
                } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                    this.f2030h.setText("昵称已重置");
                }
            }
        }
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2032j = false;
    }

    public MessageNewProfileSettingHead(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2032j = false;
    }
}
