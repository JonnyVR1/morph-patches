package com.p046p1.mobile.putong.core.p053ui.messages.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageNicknameSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageProfileSettingAct;
import com.p046p1.mobile.putong.core.p053ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p046p1.mobile.putong.core.p053ui.settings.SetTickleAct;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.c3c0;
import p149l.c40;
import p149l.d30;
import p149l.hpd0;
import p149l.j760;
import p149l.jjb0;
import p149l.lsi0;
import p149l.q6z;
import p149l.qib0;
import p149l.rp2;
import p149l.rw6;
import p149l.t100;
import p149l.ukj0;
import p149l.ura;
import p149l.vwb;
import p149l.vz00;
import p149l.wvz;
import p149l.xdl0;
import p149l.xp5;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageProfileSettingViewModel extends rp2 {

    /* JADX INFO: renamed from: A */
    public VText f31895A;

    /* JADX INFO: renamed from: B */
    public RelativeLayout f31896B;

    /* JADX INFO: renamed from: C */
    public VText f31897C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f31898D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f31899E;

    /* JADX INFO: renamed from: F */
    public c40 f31900F;

    /* JADX INFO: renamed from: G */
    public boolean f31901G;

    /* JADX INFO: renamed from: H */
    public hpd0 f31902H;

    /* JADX INFO: renamed from: I */
    public boolean f31903I;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f31904c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f31905d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f31906e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f31907f;

    /* JADX INFO: renamed from: g */
    public VText f31908g;

    /* JADX INFO: renamed from: h */
    public VImage f31909h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f31910i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f31911j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f31912k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f31913l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f31914m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f31915n;

    /* JADX INFO: renamed from: o */
    public VSwitchButton f31916o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f31917p;

    /* JADX INFO: renamed from: q */
    public View f31918q;

    /* JADX INFO: renamed from: r */
    public ImageView f31919r;

    /* JADX INFO: renamed from: s */
    public VText f31920s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f31921t;

    /* JADX INFO: renamed from: u */
    public VText f31922u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f31923v;

    /* JADX INFO: renamed from: w */
    public VText f31924w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f31925x;

    /* JADX INFO: renamed from: y */
    public VText f31926y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f31927z;

    public MessageProfileSettingViewModel(MessageProfileSettingAct messageProfileSettingAct) {
        super(messageProfileSettingAct);
        this.f31901G = false;
        this.f31902H = new hpd0("click_special_enter", Boolean.FALSE);
        this.f31903I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m49295N(View view) {
        MessageProfileSettingAct messageProfileSettingAct = this.f160469a;
        messageProfileSettingAct.startActivity(SetTickleAct.m55031a2(messageProfileSettingAct, this.f160470b.m138698x0(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m49296Q(View view) {
        zvf0.m220396r("e_search_chat_history", this.f160469a.pageId());
        this.f160469a.startActivity(CoreModule.m29935P().m94651a().mo33579rj(this.f160469a, this.f160470b.m138698x0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m49297R() {
        this.f160470b.m138695O0();
        this.f160469a.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m49298S(View view) {
        CoreModule.m29935P().m94651a().mo33495eo(this.f160469a, this.f160470b.m138698x0(), new d30() { // from class: l.uvz
            @Override // p149l.d30
            public final void call() {
                this.f178578a.m49297R();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m49299T(View view) {
        ukj0.m194174b(this.f160469a, this.f160470b.m138698x0(), OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m49300U(View view) {
        this.f160469a.startActivity(CoreModule.m29932K().toReportAct(this.f160469a, this.f160470b.m138698x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageProfileSettingViewModel.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (y19.m212148H() && i == -1) {
                    MessageProfileSettingViewModel.this.getAct().lambda$debugItems$19();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m49301V(View view) {
        zvf0.m220399u("e_special_remind_entrance", "p_chat_setting", j760.m140076a("is_special_remind_on", Boolean.valueOf(this.f31920s.getTag() instanceof Boolean ? ((Boolean) this.f31920s.getTag()).booleanValue() : false)));
        this.f160469a.startActivity(MessageSpecialNotifyAct.m49081g2(this.f160469a, this.f160470b.m138698x0()));
        this.f31902H.put(Boolean.TRUE);
        xdl0.m208344M(this.f31918q, false);
    }

    @Override // p149l.rp2, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160469a;
    }

    /* JADX INFO: renamed from: G */
    public View m49310G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wvz.m205789b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final void m49311H(final User user) {
        xdl0.m208344M(this.f31912k, false);
        xdl0.m208344M(this.f31913l, false);
        if (!ura.m195053e().m195057d().mo33875l() || user.isTeamAccount() || this.f160470b.m138687C0()) {
            return;
        }
        xdl0.m208344M(this.f31912k, true);
        xdl0.m208344M(this.f31913l, true);
        xdl0.m208329E0(this.f31912k, new View.OnClickListener() { // from class: l.vvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183282a.m49316M(view);
            }
        });
        xdl0.m208329E0(this.f31913l, new View.OnClickListener() { // from class: l.kvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124812a.m49315L(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m49312I(Conversation conversation) {
        if (NullChecker.m81303a(conversation) && conversation.isSeeUpgradedConv()) {
            int childCount = this.f31910i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                xdl0.m208344M(this.f31910i.getChildAt(i), false);
            }
            xdl0.m208344M(this.f31912k, true);
            xdl0.m208344M(this.f31913l, true);
            xdl0.m208344M(this.f31923v, true);
            xdl0.m208344M(this.f31898D, true);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m49313J(View view) {
        this.f31900F.m105113b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m49314K(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        String string = c22545a.f209159a.toString();
        boolean zEquals = this.f160469a.getResources().getString(R$string.f20790K1).equals(string);
        MessageProfileSettingAct messageProfileSettingAct = this.f160469a;
        if (zEquals) {
            zvf0.m220396r("e_choose_background_picture", messageProfileSettingAct.pageId());
            m180293n();
            this.f31900F.m105113b();
        } else if (messageProfileSettingAct.getResources().getString(R$string.f21100v).equals(string)) {
            zvf0.m220396r("e_cancel_background", this.f160469a.pageId());
            this.f160470b.m138694N0(null);
            this.f160469a.lambda$debugItems$19();
        }
        this.f31900F.m105113b();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m49315L(User user, View view) {
        zvf0.m220396r("e_edit_background", this.f160469a.pageId());
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (conversationM32856Xe == null) {
            return;
        }
        if (vwb.m200296J(conversationM32856Xe.localChatBg)) {
            m180293n();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f160469a.getResources().getString(R$string.f20790K1));
        arrayList.add(this.f160469a.getResources().getString(R$string.f21100v));
        c40.C16057b c16057b = new c40.C16057b(this.f160469a);
        c16057b.m105156I(this.f160469a.getResources().getString(R$string.f20916a)).m105168U(new View.OnClickListener() { // from class: l.lvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f130217a.m49313J(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.mvz
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f136007a.m49314K(vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        this.f31900F = c40VarM105153F;
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m49316M(View view) {
        zvf0.m220396r("e_edit_nickname", this.f160469a.pageId());
        MessageProfileSettingAct messageProfileSettingAct = this.f160469a;
        messageProfileSettingAct.startActivity(MessageNicknameSettingAct.m48902Z1(messageProfileSettingAct, this.f160470b.m138698x0()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m49317O(User user, View view) {
        zvf0.m220396r("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        if (!CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            CoreModule.m29935P().m94651a().mo33521i6(this.f160469a, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        } else {
            MessageProfileSettingAct messageProfileSettingAct = this.f160469a;
            messageProfileSettingAct.startActivity(SetNicknameAct.m41806Y1(messageProfileSettingAct, user.f56011id));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m49318P(User user, View view) {
        if (y19.m212148H()) {
            if (!NullChecker.m81303a(user) || user.inactivated) {
                lsi0.m151580j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                lsi0.m151580j("对方账号异常");
                return;
            }
        }
        this.f160469a.startActivity(CoreModule.m29932K().mo30673Ar(getAct(), this.f160470b.m138698x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: W */
    public final void m49319W(Conversation conversation, User user) {
        if ((!NullChecker.m81303a(conversation) || !conversation.isAnonymous()) && !this.f31901G) {
            qib0.f154691G.m102341Q0(this.f31906e, rw6.m181386b(user).calculatedWidth(110));
        } else {
            this.f31901G = true;
            qib0.f154691G.m102325I0(this.f31906e, user.getAnonymousUrl(), t100.m186890d(110.0f), t100.m186890d(110.0f));
        }
    }

    /* JADX INFO: renamed from: X */
    public void m49320X(User user) {
        Drawable drawable;
        if (jjb0.m141784b()) {
            this.f31908g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.f154713b0.f139231b.showUserVerificationLogo(getContext(), user, this.f31909h);
        } else if (user.isPicVerificationVerified()) {
            if (ura.m195053e().m195057d().mo33730O() && user.isIdAndPicBothVerified()) {
                drawable = this.f160469a.getResources().getDrawable(c3c0.f78510E6);
            } else {
                drawable = user.isPicVerificationVerified() ? this.f160469a.getResources().getDrawable(c3c0.f78816n6) : null;
            }
            if (NullChecker.m81303a(drawable)) {
                drawable.setBounds(0, 0, t100.m186890d(16.0f), t100.m186890d(16.0f));
                this.f31908g.setCompoundDrawables(null, null, drawable, null);
            }
        }
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: d */
    public void mo49259d(final User user, int i) {
        this.f160469a.setTitle("");
        mo49261k(user);
        m49320X(user);
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(user.f56011id);
        if (y19.m212148H() && (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            qib0.f154691G.m102354Y0(this.f31906e, c3c0.f78784k1);
        } else if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
            m49319W(conversationM32856Xe, user);
        } else if ((ura.m195053e().m195057d().mo33808c() && user.onlineMatchLocked()) || this.f160470b.m138697u0()) {
            CoreModule.m29935P().m94651a().mo33481dc(this.f31906e, rw6.m181385a(user).calculatedWidth(110), i);
        } else if (CoreModule.m29935P().m94652b().mo35107Yg() && user.isLoveBuzz()) {
            q6z.INSTANCE.m173182a(this.f31906e, rw6.m181385a(user).calculatedWidth(110), i);
        } else {
            m49319W(conversationM32856Xe, user);
        }
        if (!CoreModule.f17557o.m195057d().mo33670D() || user.isTeamAccount() || this.f160470b.m138687C0()) {
            xdl0.m208344M(this.f31914m, false);
        } else {
            xdl0.m208344M(this.f31914m, true);
            xdl0.m208329E0(this.f31914m, new View.OnClickListener() { // from class: l.jvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120004a.m49295N(view);
                }
            });
        }
        if (!user.isTeamAccount()) {
            xdl0.m208344M(this.f31921t, true);
            VText vText = this.f31922u;
            MessageProfileSettingAct messageProfileSettingAct = this.f160469a;
            vText.setText(vz00.m200681a(messageProfileSettingAct, messageProfileSettingAct.string(R$string.f21107v6)));
            xdl0.m208329E0(this.f31921t, new View.OnClickListener() { // from class: l.nvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140859a.m49317O(user, view);
                }
            });
        }
        this.f31904c.setOnClickListener(new View.OnClickListener() { // from class: l.ovz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145898a.m49318P(user, view);
            }
        });
        m49311H(user);
        boolean zM212161U = y19.m212161U();
        RelativeLayout relativeLayout = this.f31911j;
        if (zM212161U) {
            xdl0.m208344M(relativeLayout, true);
            zvf0.m220402x("e_search_chat_history", this.f160469a.pageId());
            xdl0.m208329E0(this.f31911j, new View.OnClickListener() { // from class: l.pvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151521a.m49296Q(view);
                }
            });
        } else {
            xdl0.m208344M(relativeLayout, false);
        }
        if (m180290c(user, conversationM32856Xe)) {
            xdl0.m208344M(this.f31925x, false);
            xdl0.m208344M(this.f31927z, false);
        } else if (m180292f(user) || xp5.m210475o(conversationM32856Xe, user)) {
            xdl0.m208344M(this.f31925x, false);
        } else {
            this.f31925x.setOnClickListener(new View.OnClickListener() { // from class: l.qvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156645a.m49298S(view);
                }
            });
        }
        boolean z = (user.f56011id.equals(CoreModule.m29931H().userId()) || user.isTeamAccount()) ? false : true;
        CoreModule.m29934N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            CoreModule.f17545c.f19642f0.m32856Xe(this.f160470b.m138698x0());
        }
        if (z) {
            this.f31895A.setText(getAct().getString(R$string.f21114w5));
            this.f31927z.setOnClickListener(new View.OnClickListener() { // from class: l.rvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161291a.m49299T(view);
                }
            });
        } else {
            xdl0.m208344M(this.f31927z, false);
        }
        xdl0.m208344M(this.f31896B, false);
        xdl0.m208344M(this.f31899E, false);
        RelativeLayout relativeLayout2 = this.f31898D;
        if (z) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.svz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166603a.m49300U(view);
                }
            });
        } else {
            xdl0.m208344M(relativeLayout2, false);
        }
        xdl0.m208344M(this.f31915n, false);
        m49312I(conversationM32856Xe);
        xdl0.m208329E0(this.f31917p, new View.OnClickListener() { // from class: l.tvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172354a.m49301V(view);
            }
        });
        this.f31908g.setMaxWidth(xdl0.m208412y0() - (t100.m186890d(60.0f) * 2));
    }

    @Override // p149l.rp2, p149l.s7m
    public void destroy() {
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: i */
    public void mo49321i(boolean z) {
        this.f31920s.setText(z ? "已开启" : "已关闭");
        this.f31920s.setTag(Boolean.valueOf(z));
        xdl0.m208344M(this.f31918q, !this.f31902H.get().booleanValue());
        if (this.f31903I) {
            return;
        }
        this.f31903I = true;
        zvf0.m220368A("e_special_remind_entrance", "p_chat_setting", j760.m140076a("is_special_remind_on", Boolean.valueOf(z)));
    }

    @Override // p149l.rp2, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m49310G(layoutInflater, viewGroup);
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: k */
    public void mo49261k(User user) {
        if (NullChecker.m81303a(user)) {
            this.f31908g.setText(user.name);
            String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
            if (!TextUtils.isEmpty(strM169561y7)) {
                this.f31908g.setText(strM169561y7);
                return;
            }
            if (TextUtils.isEmpty(strM169561y7) && y19.m212148H()) {
                if (!NullChecker.m81303a(user) || user.inactivated) {
                    this.f31908g.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f31908g.setText("昵称已重置");
                }
            }
        }
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: l */
    public void mo49262l(boolean z) {
        this.f31895A.setText((!z || y19.m212156P()) ? getAct().getString(R$string.f21114w5) : "熄灭信号");
        if (z) {
            xdl0.m208344M(this.f31925x, false);
            xdl0.m208344M(this.f31914m, false);
        }
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: m */
    public void mo49322m(boolean z) {
        xdl0.m208344M(this.f31917p, z);
    }

    @Override // p149l.rp2
    /* JADX INFO: renamed from: p */
    public void mo49263p(boolean z) {
        VText vText = this.f31897C;
        if (z) {
            vText.setText(App.f15369e.getString(R$string.f21009k2));
        } else {
            vText.setText(App.f15369e.getString(R$string.f20767H2));
        }
    }
}
