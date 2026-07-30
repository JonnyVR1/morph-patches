package com.p000p1.mobile.putong.core.p001ui.messages.model;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageNicknameSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageProfileSettingAct;
import com.p000p1.mobile.putong.core.p001ui.messages.chatheat.MessageSpecialNotifyAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p1.mobile.putong.core.ui.settings.SetTickleAct;
import com.p1.mobile.putong.core.ui.view.GradientBgButton;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c3c0;
import l.c40;
import l.hpd0;
import l.j760;
import l.jjb0;
import l.lsi0;
import l.q6z;
import l.qib0;
import l.rw6;
import l.t100;
import l.ukj0;
import l.ura;
import l.vwb;
import l.vz00;
import l.wvz;
import l.xdl0;
import l.xp5;
import l.y19;
import l.zvf0;
import org.spongycastle.asn1.eac.EACTags;
import p003l.d30;
import p003l.rp2;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VListCell;
import p028v.VSwitchButton;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageProfileSettingViewModel extends rp2 {

    /* JADX INFO: renamed from: A */
    public VText f1786A;

    /* JADX INFO: renamed from: B */
    public RelativeLayout f1787B;

    /* JADX INFO: renamed from: C */
    public VText f1788C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f1789D;

    /* JADX INFO: renamed from: E */
    public RelativeLayout f1790E;

    /* JADX INFO: renamed from: F */
    public c40 f1791F;

    /* JADX INFO: renamed from: G */
    public boolean f1792G;

    /* JADX INFO: renamed from: H */
    public hpd0 f1793H;

    /* JADX INFO: renamed from: I */
    public boolean f1794I;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f1795c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f1796d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f1797e;

    /* JADX INFO: renamed from: f */
    public GradientBgButton f1798f;

    /* JADX INFO: renamed from: g */
    public VText f1799g;

    /* JADX INFO: renamed from: h */
    public VImage f1800h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1801i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f1802j;

    /* JADX INFO: renamed from: k */
    public RelativeLayout f1803k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f1804l;

    /* JADX INFO: renamed from: m */
    public RelativeLayout f1805m;

    /* JADX INFO: renamed from: n */
    public RelativeLayout f1806n;

    /* JADX INFO: renamed from: o */
    public VSwitchButton f1807o;

    /* JADX INFO: renamed from: p */
    public RelativeLayout f1808p;

    /* JADX INFO: renamed from: q */
    public View f1809q;

    /* JADX INFO: renamed from: r */
    public ImageView f1810r;

    /* JADX INFO: renamed from: s */
    public VText f1811s;

    /* JADX INFO: renamed from: t */
    public RelativeLayout f1812t;

    /* JADX INFO: renamed from: u */
    public VText f1813u;

    /* JADX INFO: renamed from: v */
    public RelativeLayout f1814v;

    /* JADX INFO: renamed from: w */
    public VText f1815w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f1816x;

    /* JADX INFO: renamed from: y */
    public VText f1817y;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f1818z;

    public MessageProfileSettingViewModel(MessageProfileSettingAct messageProfileSettingAct) {
        super(messageProfileSettingAct);
        this.f1792G = false;
        this.f1793H = new hpd0("click_special_enter", Boolean.FALSE);
        this.f1794I = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m2424N(View view) {
        PutongMvpAct putongMvpAct = this.f7031a;
        putongMvpAct.startActivity(SetTickleAct.a2(putongMvpAct, this.f7032b.x0(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m2425Q(View view) {
        zvf0.r("e_search_chat_history", this.f7031a.pageId());
        this.f7031a.startActivity(CoreModule.P().a().rj(this.f7031a, this.f7032b.x0()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m2426R() {
        this.f7032b.O0();
        this.f7031a.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m2427S(View view) {
        CoreModule.P().a().eo(this.f7031a, this.f7032b.x0(), new d30() { // from class: l.uvz
            @Override // p003l.d30
            public final void call() {
                this.f8112a.m2426R();
            }
        }, (d30) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m2428T(View view) {
        ukj0.b(this.f7031a, this.f7032b.x0(), "p_chat_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m2429U(View view) {
        this.f7031a.startActivity(CoreModule.K().toReportAct(this.f7031a, this.f7032b.x0(), true, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.messages.model.MessageProfileSettingViewModel.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (y19.H() && i == -1) {
                    MessageProfileSettingViewModel.this.act().finish();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m2430V(View view) {
        zvf0.u("e_special_remind_entrance", "p_chat_setting", new j760[]{j760.a("is_special_remind_on", Boolean.valueOf(this.f1811s.getTag() instanceof Boolean ? ((Boolean) this.f1811s.getTag()).booleanValue() : false))});
        this.f7031a.startActivity(MessageSpecialNotifyAct.m2179g2(this.f7031a, this.f7032b.x0()));
        this.f1793H.put(Boolean.TRUE);
        xdl0.M(this.f1809q, false);
    }

    @Override // p003l.rp2
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo2385C0() {
        return this.f7031a;
    }

    /* JADX INFO: renamed from: G */
    public View m2439G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wvz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final void m2440H(final User user) {
        xdl0.M(this.f1803k, false);
        xdl0.M(this.f1804l, false);
        if (!ura.e().d().l() || user.isTeamAccount() || this.f7032b.C0()) {
            return;
        }
        xdl0.M(this.f1803k, true);
        xdl0.M(this.f1804l, true);
        xdl0.E0(this.f1803k, new View.OnClickListener() { // from class: l.vvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8449a.m2445M(view);
            }
        });
        xdl0.E0(this.f1804l, new View.OnClickListener() { // from class: l.kvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5086a.m2444L(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m2441I(Conversation conversation) {
        if (NullChecker.a(conversation) && conversation.isSeeUpgradedConv()) {
            int childCount = this.f1801i.getChildCount();
            for (int i = 0; i < childCount; i++) {
                xdl0.M(this.f1801i.getChildAt(i), false);
            }
            xdl0.M(this.f1803k, true);
            xdl0.M(this.f1804l, true);
            xdl0.M(this.f1814v, true);
            xdl0.M(this.f1789D, true);
        }
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m2442J(View view) {
        this.f1791F.b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2443K(VListCell vListCell, VListCell.C1338a c1338a, int i) {
        String string = c1338a.f12784a.toString();
        boolean zEquals = this.f7031a.getResources().getString(R.string.K1).equals(string);
        MessageProfileSettingAct messageProfileSettingAct = this.f7031a;
        if (zEquals) {
            zvf0.r("e_choose_background_picture", messageProfileSettingAct.pageId());
            m7365n();
            this.f1791F.b();
        } else if (messageProfileSettingAct.getResources().getString(R.string.v).equals(string)) {
            zvf0.r("e_cancel_background", this.f7031a.pageId());
            this.f7032b.N0((Picture) null);
            this.f7031a.finish();
        }
        this.f1791F.b();
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m2444L(User user, View view) {
        zvf0.r("e_edit_background", this.f7031a.pageId());
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if (conversationXe == null) {
            return;
        }
        if (vwb.J(conversationXe.localChatBg)) {
            m7365n();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f7031a.getResources().getString(R.string.K1));
        arrayList.add(this.f7031a.getResources().getString(R.string.v));
        c40.b bVar = new c40.b(this.f7031a);
        bVar.I(this.f7031a.getResources().getString(R.string.a)).U(new View.OnClickListener() { // from class: l.lvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f5434a.m2442J(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.mvz
            /* JADX INFO: renamed from: a */
            public final void m6503a(VListCell vListCell, VListCell.C1338a c1338a, int i) {
                this.f5784a.m2443K(vListCell, c1338a, i);
            }
        });
        c40 c40VarF = bVar.F();
        this.f1791F = c40VarF;
        c40VarF.f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m2445M(View view) {
        zvf0.r("e_edit_nickname", this.f7031a.pageId());
        PutongMvpAct putongMvpAct = this.f7031a;
        putongMvpAct.startActivity(MessageNicknameSettingAct.m1990Z1(putongMvpAct, this.f7032b.x0()));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m2446O(User user, View view) {
        zvf0.r("e_message_page_set_nickname", "p_chat_view");
        if (!CoreModule.c.e0.p9().isVIP()) {
            CoreModule.P().a().i6(this.f7031a, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        } else {
            PutongMvpAct putongMvpAct = this.f7031a;
            putongMvpAct.startActivity(SetNicknameAct.Y1(putongMvpAct, ((DbObject) user).id));
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m2447P(User user, View view) {
        if (y19.H()) {
            if (!NullChecker.a(user) || user.inactivated) {
                lsi0.j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                lsi0.j("对方账号异常");
                return;
            }
        }
        this.f7031a.startActivity(CoreModule.K().Ar(act(), this.f7032b.x0(), "conversation_view", false));
    }

    /* JADX INFO: renamed from: W */
    public final void m2448W(Conversation conversation, User user) {
        if ((!NullChecker.a(conversation) || !conversation.isAnonymous()) && !this.f1792G) {
            qib0.G.Q0(this.f1797e, rw6.b(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA));
        } else {
            this.f1792G = true;
            qib0.G.I0(this.f1797e, user.getAnonymousUrl(), t100.d(110.0f), t100.d(110.0f));
        }
    }

    /* JADX INFO: renamed from: X */
    public void m2449X(User user) {
        Drawable drawable;
        if (jjb0.b()) {
            this.f1799g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            qib0.b0.b.showUserVerificationLogo(mo2385C0(), user, this.f1800h);
        } else if (user.isPicVerificationVerified()) {
            if (ura.e().d().O() && user.isIdAndPicBothVerified()) {
                drawable = this.f7031a.getResources().getDrawable(c3c0.E6);
            } else {
                drawable = user.isPicVerificationVerified() ? this.f7031a.getResources().getDrawable(c3c0.n6) : null;
            }
            if (NullChecker.a(drawable)) {
                drawable.setBounds(0, 0, t100.d(16.0f), t100.d(16.0f));
                this.f1799g.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p003l.rp2
    /* JADX INFO: renamed from: d */
    public void mo2387d(final User user, int i) {
        this.f7031a.setTitle("");
        mo2390k(user);
        m2449X(user);
        Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) user).id);
        if (y19.H() && (!NullChecker.a(user) || user.inactivated || user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
            qib0.G.Y0(this.f1797e, c3c0.k1);
        } else if (NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
            m2448W(conversationXe, user);
        } else if ((ura.e().d().c() && user.onlineMatchLocked()) || this.f7032b.u0()) {
            CoreModule.P().a().dc(this.f1797e, rw6.a(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA), i);
        } else if (CoreModule.P().b().Yg() && user.isLoveBuzz()) {
            q6z.INSTANCE.a(this.f1797e, rw6.a(user).calculatedWidth(EACTags.APPLICATION_RELATED_DATA), i);
        } else {
            m2448W(conversationXe, user);
        }
        if (!CoreModule.o.d().D() || user.isTeamAccount() || this.f7032b.C0()) {
            xdl0.M(this.f1805m, false);
        } else {
            xdl0.M(this.f1805m, true);
            xdl0.E0(this.f1805m, new View.OnClickListener() { // from class: l.jvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4744a.m2424N(view);
                }
            });
        }
        if (!user.isTeamAccount()) {
            xdl0.M(this.f1812t, true);
            AppCompatTextView appCompatTextView = this.f1813u;
            MessageProfileSettingAct messageProfileSettingAct = this.f7031a;
            appCompatTextView.setText(vz00.a(messageProfileSettingAct, messageProfileSettingAct.string(R.string.v6)));
            xdl0.E0(this.f1812t, new View.OnClickListener() { // from class: l.nvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5985a.m2446O(user, view);
                }
            });
        }
        this.f1795c.setOnClickListener(new View.OnClickListener() { // from class: l.ovz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6251a.m2447P(user, view);
            }
        });
        m2440H(user);
        boolean zU = y19.U();
        RelativeLayout relativeLayout = this.f1802j;
        if (zU) {
            xdl0.M(relativeLayout, true);
            zvf0.x("e_search_chat_history", this.f7031a.pageId());
            xdl0.E0(this.f1802j, new View.OnClickListener() { // from class: l.pvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6532a.m2425Q(view);
                }
            });
        } else {
            xdl0.M(relativeLayout, false);
        }
        if (m7362c(user, conversationXe)) {
            xdl0.M(this.f1816x, false);
            xdl0.M(this.f1818z, false);
        } else if (m7364f(user) || xp5.o(conversationXe, user)) {
            xdl0.M(this.f1816x, false);
        } else {
            this.f1816x.setOnClickListener(new View.OnClickListener() { // from class: l.qvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6714a.m2427S(view);
                }
            });
        }
        boolean z = (((DbObject) user).id.equals(CoreModule.H().userId()) || user.isTeamAccount()) ? false : true;
        CoreModule.N().isMatchedByRelationship(user);
        user.unilateralBlock();
        if (NullChecker.a(CoreModule.c)) {
            CoreModule.c.f0.Xe(this.f7032b.x0());
        }
        if (z) {
            this.f1786A.setText(act().getString(R.string.w5));
            this.f1818z.setOnClickListener(new View.OnClickListener() { // from class: l.rvz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7097a.m2428T(view);
                }
            });
        } else {
            xdl0.M(this.f1818z, false);
        }
        xdl0.M(this.f1787B, false);
        xdl0.M(this.f1790E, false);
        RelativeLayout relativeLayout2 = this.f1789D;
        if (z) {
            relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: l.svz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7343a.m2429U(view);
                }
            });
        } else {
            xdl0.M(relativeLayout2, false);
        }
        xdl0.M(this.f1806n, false);
        m2441I(conversationXe);
        xdl0.E0(this.f1808p, new View.OnClickListener() { // from class: l.tvz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7809a.m2430V(view);
            }
        });
        this.f1799g.setMaxWidth(xdl0.y0() - (t100.d(60.0f) * 2));
    }

    @Override // p003l.rp2
    public void destroy() {
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: i */
    public void mo2450i(boolean z) {
        this.f1811s.setText(z ? "已开启" : "已关闭");
        this.f1811s.setTag(Boolean.valueOf(z));
        xdl0.M(this.f1809q, !((Boolean) this.f1793H.get()).booleanValue());
        if (this.f1794I) {
            return;
        }
        this.f1794I = true;
        zvf0.A("e_special_remind_entrance", "p_chat_setting", new j760[]{j760.a("is_special_remind_on", Boolean.valueOf(z))});
    }

    @Override // p003l.rp2
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2439G(layoutInflater, viewGroup);
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: k */
    public void mo2390k(User user) {
        if (NullChecker.a(user)) {
            this.f1799g.setText(user.name);
            CharSequence charSequenceY7 = CoreModule.c.e0.y7(((DbObject) user).id);
            if (!TextUtils.isEmpty(charSequenceY7)) {
                this.f1799g.setText(charSequenceY7);
                return;
            }
            if (TextUtils.isEmpty(charSequenceY7) && y19.H()) {
                if (!NullChecker.a(user) || user.inactivated) {
                    this.f1799g.setText("已注销");
                } else if (user.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN"))) {
                    this.f1799g.setText("昵称已重置");
                }
            }
        }
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: l */
    public void mo2391l(boolean z) {
        this.f1786A.setText((!z || y19.P()) ? act().getString(R.string.w5) : "熄灭信号");
        if (z) {
            xdl0.M(this.f1816x, false);
            xdl0.M(this.f1805m, false);
        }
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: m */
    public void mo2451m(boolean z) {
        xdl0.M(this.f1808p, z);
    }

    @Override // p003l.rp2
    /* JADX INFO: renamed from: p */
    public void mo2392p(boolean z) {
        AppCompatTextView appCompatTextView = this.f1788C;
        if (z) {
            appCompatTextView.setText(App.e.getString(R.string.k2));
        } else {
            appCompatTextView.setText(App.e.getString(R.string.H2));
        }
    }
}
