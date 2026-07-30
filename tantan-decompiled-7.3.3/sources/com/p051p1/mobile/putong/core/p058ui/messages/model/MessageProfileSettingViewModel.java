package com.p051p1.mobile.putong.core.p058ui.messages.model;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageNicknameSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageProfileSettingAct;
import com.p051p1.mobile.putong.core.p058ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SetTickleAct;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.br5;
import p153l.f810;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.ibc0;
import p153l.iq2;
import p153l.jxd0;
import p153l.jyb;
import p153l.nfz;
import p153l.nrb0;
import p153l.o1j0;
import p153l.pf60;
import p153l.qa00;
import p153l.t400;
import p153l.uqb0;
import p153l.ux6;
import p153l.w30;
import p153l.x20;
import p153l.xtj0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageProfileSettingViewModel extends iq2 {

    /* JADX INFO: renamed from: A */
    public VText f32743A;

    /* JADX INFO: renamed from: B */
    public RelativeLayout f32744B;

    /* JADX INFO: renamed from: C */
    public VText f32745C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f32746D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f32747E;

    /* JADX INFO: renamed from: F */
    public w30 f32748F;

    /* JADX INFO: renamed from: G */
    public boolean f32749G;

    /* JADX INFO: renamed from: H */
    public jxd0 f32750H;

    /* JADX INFO: renamed from: I */
    public boolean f32751I;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f32752c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f32753d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32754e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f32755f;

    /* JADX INFO: renamed from: g */
    public VText f32756g;

    /* JADX INFO: renamed from: h */
    public VImage f32757h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f32758i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f32759j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f32760k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f32761l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f32762m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f32763n;

    /* JADX INFO: renamed from: o */
    public VSwitchButton f32764o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f32765p;

    /* JADX INFO: renamed from: q */
    public View f32766q;

    /* JADX INFO: renamed from: r */
    public ImageView f32767r;

    /* JADX INFO: renamed from: s */
    public VText f32768s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f32769t;

    /* JADX INFO: renamed from: u */
    public VText f32770u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f32771v;

    /* JADX INFO: renamed from: w */
    public VText f32772w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f32773x;

    /* JADX INFO: renamed from: y */
    public VText f32774y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f32775z;

    public MessageProfileSettingViewModel(MessageProfileSettingAct messageProfileSettingAct) {
        super(messageProfileSettingAct);
        this.f32749G = false;
        this.f32750H = new jxd0("click_special_enter", Boolean.FALSE);
        this.f32751I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m50478N(View view) {
        MessageProfileSettingAct messageProfileSettingAct = this.f116326a;
        messageProfileSettingAct.startActivity(SetTickleAct.m56214b2(messageProfileSettingAct, this.f116327b.m123852x0(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m50479Q(View view) {
        i4g0.m138520r("e_search_chat_history", this.f116326a.pageId());
        this.f116326a.startActivity(CoreModule.m30933P().m143405a().mo34582rj(this.f116326a, this.f116327b.m123852x0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m50480R() {
        this.f116327b.m123849O0();
        this.f116326a.lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m50481S(View view) {
        CoreModule.m30933P().m143405a().mo34498eo(this.f116326a, this.f116327b.m123852x0(), new x20() { // from class: l.r400
            @Override // p153l.x20
            public final void call() {
                this.f161132a.m50480R();
            }
        }, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m50482T(View view) {
        xtj0.m213099b(this.f116326a, this.f116327b.m123852x0(), OMSDialogPositon.p_chat_view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m50483U(View view) {
        this.f116326a.startActivity(CoreModule.m30930K().toReportAct(this.f116326a, this.f116327b.m123852x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageProfileSettingViewModel.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (h39.m133419H() && i == -1) {
                    MessageProfileSettingViewModel.this.getAct().lambda$debugItems$19();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m50484V(View view) {
        i4g0.m138523u("e_special_remind_entrance", "p_chat_setting", pf60.m172085a("is_special_remind_on", Boolean.valueOf(this.f32768s.getTag() instanceof Boolean ? ((Boolean) this.f32768s.getTag()).booleanValue() : false)));
        this.f116326a.startActivity(MessageSpecialNotifyAct.m50264h2(this.f116326a, this.f116327b.m123852x0()));
        this.f32750H.put(Boolean.TRUE);
        bnl0.m105524M(this.f32766q, false);
    }

    @Override // p153l.iq2, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116326a;
    }

    /* JADX INFO: renamed from: G */
    public View m50493G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t400.m189137b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final void m50494H(final User user) {
        bnl0.m105524M(this.f32760k, false);
        bnl0.m105524M(this.f32761l, false);
        if (!gta.m132210e().m132214d().mo34878l() || user.isTeamAccount() || this.f116327b.m123841C0()) {
            return;
        }
        bnl0.m105524M(this.f32760k, true);
        bnl0.m105524M(this.f32761l, true);
        bnl0.m105509E0(this.f32760k, new View.OnClickListener() { // from class: l.s400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166048a.m50499M(view);
            }
        });
        bnl0.m105509E0(this.f32761l, new View.OnClickListener() { // from class: l.h400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107718a.m50498L(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m50495I(Conversation conversation) {
        if (NullChecker.m82486a(conversation) && conversation.isSeeUpgradedConv()) {
            int childCount = this.f32758i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                bnl0.m105524M(this.f32758i.getChildAt(i), false);
            }
            bnl0.m105524M(this.f32760k, true);
            bnl0.m105524M(this.f32761l, true);
            bnl0.m105524M(this.f32771v, true);
            bnl0.m105524M(this.f32746D, true);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m50496J(View view) {
        this.f32748F.m204614b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m50497K(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        String string = c22660a.f210081a.toString();
        boolean zEquals = this.f116326a.getResources().getString(R$string.f21532K1).equals(string);
        MessageProfileSettingAct messageProfileSettingAct = this.f116326a;
        if (zEquals) {
            i4g0.m138520r("e_choose_background_picture", messageProfileSettingAct.pageId());
            m141558n();
            this.f32748F.m204614b();
        } else if (messageProfileSettingAct.getResources().getString(R$string.f21842v).equals(string)) {
            i4g0.m138520r("e_cancel_background", this.f116326a.pageId());
            this.f116327b.m123848N0(null);
            this.f116326a.lambda$debugItems$19();
        }
        this.f32748F.m204614b();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m50498L(User user, View view) {
        i4g0.m138520r("e_edit_background", this.f116326a.pageId());
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (conversationM33859Xe == null) {
            return;
        }
        if (jyb.m147479J(conversationM33859Xe.localChatBg)) {
            m141558n();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f116326a.getResources().getString(R$string.f21532K1));
        arrayList.add(this.f116326a.getResources().getString(R$string.f21842v));
        w30.C21001b c21001b = new w30.C21001b(this.f116326a);
        c21001b.m204657I(this.f116326a.getResources().getString(R$string.f21658a)).m204669U(new View.OnClickListener() { // from class: l.i400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f112804a.m50496J(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.j400
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f118230a.m50497K(vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        this.f32748F = w30VarM204654F;
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50499M(View view) {
        i4g0.m138520r("e_edit_nickname", this.f116326a.pageId());
        MessageProfileSettingAct messageProfileSettingAct = this.f116326a;
        messageProfileSettingAct.startActivity(MessageNicknameSettingAct.m50085a2(messageProfileSettingAct, this.f116327b.m123852x0()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m50500O(User user, View view) {
        i4g0.m138520r("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        if (!CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            CoreModule.m30933P().m143405a().mo34524i6(this.f116326a, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        } else {
            MessageProfileSettingAct messageProfileSettingAct = this.f116326a;
            messageProfileSettingAct.startActivity(SetNicknameAct.m42817Z1(messageProfileSettingAct, user.f56859id));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m50501P(User user, View view) {
        if (h39.m133419H()) {
            if (!NullChecker.m82486a(user) || user.inactivated) {
                o1j0.m165636j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                o1j0.m165636j("对方账号异常");
                return;
            }
        }
        this.f116326a.startActivity(CoreModule.m30930K().mo31676Ar(getAct(), this.f116327b.m123852x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: W */
    public final void m50502W(Conversation conversation, User user) {
        if ((!NullChecker.m82486a(conversation) || !conversation.isAnonymous()) && !this.f32749G) {
            uqb0.f180374G.m127125Q0(this.f32754e, ux6.m198404b(user).calculatedWidth(110));
        } else {
            this.f32749G = true;
            uqb0.f180374G.m127109I0(this.f32754e, user.getAnonymousUrl(), qa00.m175859d(110.0f), qa00.m175859d(110.0f));
        }
    }

    /* JADX INFO: renamed from: X */
    public void m50503X(User user) {
        Drawable drawable;
        if (nrb0.m164466b()) {
            this.f32756g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), user, this.f32757h);
        } else if (user.isPicVerificationVerified()) {
            if (gta.m132210e().m132214d().mo34733O() && user.isIdAndPicBothVerified()) {
                drawable = this.f116326a.getResources().getDrawable(ibc0.f113785E6);
            } else {
                drawable = user.isPicVerificationVerified() ? this.f116326a.getResources().getDrawable(ibc0.f114091n6) : null;
            }
            if (NullChecker.m82486a(drawable)) {
                drawable.setBounds(0, 0, qa00.m175859d(16.0f), qa00.m175859d(16.0f));
                this.f32756g.setCompoundDrawables(null, null, drawable, null);
            }
        }
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: d */
    public void mo50442d(final User user, int i) {
        this.f116326a.setTitle("");
        mo50444k(user);
        m50503X(user);
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(user.f56859id);
        if (h39.m133419H() && (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            uqb0.f180374G.m127138Y0(this.f32754e, ibc0.f114059k1);
        } else if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
            m50502W(conversationM33859Xe, user);
        } else if ((gta.m132210e().m132214d().mo34811c() && user.onlineMatchLocked()) || this.f116327b.m123851u0()) {
            CoreModule.m30933P().m143405a().mo34484dc(this.f32754e, ux6.m198403a(user).calculatedWidth(110), i);
        } else if (CoreModule.m30933P().m143406b().mo36110Yg() && user.isLoveBuzz()) {
            nfz.INSTANCE.m162961a(this.f32754e, ux6.m198403a(user).calculatedWidth(110), i);
        } else {
            m50502W(conversationM33859Xe, user);
        }
        if (!CoreModule.f18276o.m132214d().mo34673D() || user.isTeamAccount() || this.f116327b.m123841C0()) {
            bnl0.m105524M(this.f32762m, false);
        } else {
            bnl0.m105524M(this.f32762m, true);
            bnl0.m105509E0(this.f32762m, new View.OnClickListener() { // from class: l.g400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102052a.m50478N(view);
                }
            });
        }
        if (!user.isTeamAccount()) {
            bnl0.m105524M(this.f32769t, true);
            VText vText = this.f32770u;
            MessageProfileSettingAct messageProfileSettingAct = this.f116326a;
            vText.setText(f810.m124512a(messageProfileSettingAct, messageProfileSettingAct.string(R$string.f21849v6)));
            bnl0.m105509E0(this.f32769t, new View.OnClickListener() { // from class: l.k400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123805a.m50500O(user, view);
                }
            });
        }
        this.f32752c.setOnClickListener(new View.OnClickListener() { // from class: l.l400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129924a.m50501P(user, view);
            }
        });
        m50494H(user);
        boolean zM133432U = h39.m133432U();
        RelativeLayout relativeLayout = this.f32759j;
        if (zM133432U) {
            bnl0.m105524M(relativeLayout, true);
            i4g0.m138526x("e_search_chat_history", this.f116326a.pageId());
            bnl0.m105509E0(this.f32759j, new View.OnClickListener() { // from class: l.m400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134725a.m50479Q(view);
                }
            });
        } else {
            bnl0.m105524M(relativeLayout, false);
        }
        if (m141555c(user, conversationM33859Xe)) {
            bnl0.m105524M(this.f32773x, false);
            bnl0.m105524M(this.f32775z, false);
        } else if (m141557f(user) || br5.m106044o(conversationM33859Xe, user)) {
            bnl0.m105524M(this.f32773x, false);
        } else {
            this.f32773x.setOnClickListener(new View.OnClickListener() { // from class: l.n400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140051a.m50481S(view);
                }
            });
        }
        boolean z = (user.f56859id.equals(CoreModule.m30929H().userId()) || user.isTeamAccount()) ? false : true;
        CoreModule.m30932N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            CoreModule.f18264c.f20384f0.m33859Xe(this.f116327b.m123852x0());
        }
        if (z) {
            this.f32743A.setText(getAct().getString(R$string.f21856w5));
            this.f32775z.setOnClickListener(new View.OnClickListener() { // from class: l.o400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144877a.m50482T(view);
                }
            });
        } else {
            bnl0.m105524M(this.f32775z, false);
        }
        bnl0.m105524M(this.f32744B, false);
        bnl0.m105524M(this.f32747E, false);
        RelativeLayout relativeLayout2 = this.f32746D;
        if (z) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.p400
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150484a.m50483U(view);
                }
            });
        } else {
            bnl0.m105524M(relativeLayout2, false);
        }
        bnl0.m105524M(this.f32763n, false);
        m50495I(conversationM33859Xe);
        bnl0.m105509E0(this.f32765p, new View.OnClickListener() { // from class: l.q400
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155509a.m50484V(view);
            }
        });
        this.f32756g.setMaxWidth(bnl0.m105592y0() - (qa00.m175859d(60.0f) * 2));
    }

    @Override // p153l.iq2, p153l.iam
    public void destroy() {
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: i */
    public void mo50504i(boolean z) {
        this.f32768s.setText(z ? "已开启" : "已关闭");
        this.f32768s.setTag(Boolean.valueOf(z));
        bnl0.m105524M(this.f32766q, !this.f32750H.get().booleanValue());
        if (this.f32751I) {
            return;
        }
        this.f32751I = true;
        i4g0.m138492A("e_special_remind_entrance", "p_chat_setting", pf60.m172085a("is_special_remind_on", Boolean.valueOf(z)));
    }

    @Override // p153l.iq2, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m50493G(layoutInflater, viewGroup);
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: k */
    public void mo50444k(User user) {
        if (NullChecker.m82486a(user)) {
            this.f32756g.setText(user.name);
            String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
            if (!TextUtils.isEmpty(strM116634y7)) {
                this.f32756g.setText(strM116634y7);
                return;
            }
            if (TextUtils.isEmpty(strM116634y7) && h39.m133419H()) {
                if (!NullChecker.m82486a(user) || user.inactivated) {
                    this.f32756g.setText("已注销");
                } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                    this.f32756g.setText("昵称已重置");
                }
            }
        }
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: l */
    public void mo50445l(boolean z) {
        this.f32743A.setText((!z || h39.m133427P()) ? getAct().getString(R$string.f21856w5) : "熄灭信号");
        if (z) {
            bnl0.m105524M(this.f32773x, false);
            bnl0.m105524M(this.f32762m, false);
        }
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: m */
    public void mo50505m(boolean z) {
        bnl0.m105524M(this.f32765p, z);
    }

    @Override // p153l.iq2
    /* JADX INFO: renamed from: p */
    public void mo50446p(boolean z) {
        VText vText = this.f32745C;
        if (z) {
            vText.setText(App.f16088e.getString(R$string.f21751k2));
        } else {
            vText.setText(App.f16088e.getString(R$string.f21509H2));
        }
    }
}
