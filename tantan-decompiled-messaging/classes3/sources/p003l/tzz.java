package p003l;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.messages.view.MessageMarryHeaderLayout;
import com.p1.mobile.putong.core.ui.messages.view.MessageUserHeaderLayout;
import com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchBaseHeadView;
import com.p1.mobile.putong.core.ui.view.MessageKnowHimLayout;
import com.p1.mobile.putong.core.ui.view.MessageMatchTimeLayout;
import com.p1.mobile.putong.data.MatchFrom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.a3e0;
import l.c3c0;
import l.hmb;
import l.i0g0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.o6j0;
import l.o7r;
import l.q860;
import l.qib0;
import l.roj0;
import l.t100;
import l.uly;
import l.ura;
import l.utl;
import l.uzz;
import l.vwb;
import l.xdl0;
import l.xma;
import l.zvf0;
import l.zz6;
import org.eclipse.jetty.servlet.ServletHandler;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VProgressBar;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class tzz implements u4z<User, bpz> {

    /* JADX INFO: renamed from: A */
    public VImage f7830A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f7831B;

    /* JADX INFO: renamed from: C */
    public VText f7832C;

    /* JADX INFO: renamed from: D */
    public VText f7833D;

    /* JADX INFO: renamed from: E */
    public ViewStub f7834E;

    /* JADX INFO: renamed from: F */
    public ViewStub f7835F;

    /* JADX INFO: renamed from: G */
    public VText f7836G;

    /* JADX INFO: renamed from: H */
    public VText f7837H;

    /* JADX INFO: renamed from: I */
    public View f7838I;

    /* JADX INFO: renamed from: J */
    public fcz<User, bpz> f7839J;

    /* JADX INFO: renamed from: K */
    public MessagesAct f7840K;

    /* JADX INFO: renamed from: L */
    public utl f7841L;

    /* JADX INFO: renamed from: Q */
    public OnlineMatchBaseHeadView f7846Q;

    /* JADX INFO: renamed from: S */
    public LoveBuzzMessageHeadView f7848S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f7851a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f7852b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7853c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f7854d;

    /* JADX INFO: renamed from: e */
    public MessageMatchTimeLayout f7855e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f7856f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7857g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f7858h;

    /* JADX INFO: renamed from: i */
    public VText f7859i;

    /* JADX INFO: renamed from: j */
    public VText f7860j;

    /* JADX INFO: renamed from: k */
    public MessageUserHeaderLayout f7861k;

    /* JADX INFO: renamed from: l */
    public MessageKnowHimLayout f7862l;

    /* JADX INFO: renamed from: m */
    public MessageMarryHeaderLayout f7863m;

    /* JADX INFO: renamed from: n */
    public ViewStub f7864n;

    /* JADX INFO: renamed from: o */
    public ViewStub f7865o;

    /* JADX INFO: renamed from: p */
    public ViewStub f7866p;

    /* JADX INFO: renamed from: q */
    public TextView f7867q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f7868r;

    /* JADX INFO: renamed from: s */
    public TextView f7869s;

    /* JADX INFO: renamed from: t */
    public VText f7870t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f7871u;

    /* JADX INFO: renamed from: v */
    public VText f7872v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f7873w;

    /* JADX INFO: renamed from: x */
    public VImage f7874x;

    /* JADX INFO: renamed from: y */
    public VText f7875y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f7876z;

    /* JADX INFO: renamed from: M */
    public boolean f7842M = false;

    /* JADX INFO: renamed from: N */
    public boolean f7843N = false;

    /* JADX INFO: renamed from: O */
    public boolean f7844O = false;

    /* JADX INFO: renamed from: P */
    public boolean f7845P = false;

    /* JADX INFO: renamed from: R */
    public int f7847R = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: T */
    public d30 f7849T = new d30() { // from class: l.mzz
        @Override // p003l.d30
        public final void call() {
            ruy.m7383p();
        }
    };

    /* JADX INFO: renamed from: U */
    public boolean f7850U = false;

    public tzz(String str) {
        ((Integer) CoreModule.c.f0.D1.get()).getClass();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8067p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m8068q(boolean[] zArr, c cVar) {
        boolean z = false;
        if (cVar == c.i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m8070A(View view) {
        this.f7840K.m2060R2("header", this.f7839J.m4295r3());
    }

    /* JADX INFO: renamed from: B */
    public final void m8071B(String str) {
        if (this.f7850U) {
            return;
        }
        UserPrivilege userPrivilegeW4 = CoreModule.c.C0.w4(SummarizedPrivilegesId.get("quickchatPeek"));
        o6j0.h("e_quickchat_peek", this.f7839J.pageId(), new o6j0.a[]{o6j0.a.i("is_privileged", NullChecker.a(userPrivilegeW4) && NullChecker.a(userPrivilegeW4.content) && userPrivilegeW4.content.remaining > 0), o6j0.a.h("moments_user_id", str)});
        this.f7850U = true;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: a */
    public void mo8072a() {
        xdl0.M(this.f7871u, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.u4z
    /* JADX INFO: renamed from: b */
    public void mo4918b(MessagesAct messagesAct, utl utlVar, fcz<User, bpz> fczVar) {
        this.f7839J = fczVar;
        this.f7840K = messagesAct;
        this.f7841L = utlVar;
        this.f7838I = m8077s(o7r.a(messagesAct), utlVar.getRealView());
        this.f7858h.setVisibility(0);
        this.f7859i.setTypeface(eqh0.m3924c(2));
        this.f7860j.setVisibility(8);
        this.f7861k.U(fczVar);
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: c */
    public MessageUserHeaderLayout mo8073c() {
        return this.f7861k;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: d */
    public VText mo8074d() {
        return this.f7837H;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: e */
    public void mo7352e() {
        if (NullChecker.a(this.f7861k)) {
            this.f7861k.t0(NullChecker.a(this.f7839J) ? this.f7839J.pageId() : "");
        }
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: f */
    public ViewStub mo8075f() {
        return this.f7865o;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: g */
    public View mo4919g() {
        return this.f7838I;
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: h */
    public void mo7353h(q860<Message> q860Var) {
        fcz<User, bpz> fczVar = this.f7839J;
        boolean zM4261k4 = fczVar.m4261k4(fczVar.m4295r3());
        VProgressBar vProgressBar = this.f7852b;
        if (zM4261k4) {
            xdl0.M(vProgressBar, false);
            xdl0.M(this.f7854d, true);
        } else {
            xdl0.M(vProgressBar, q860Var.c());
            xdl0.M(this.f7854d, !q860Var.c());
        }
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: i */
    public void mo8076i() {
        xdl0.M(this.f7871u, true);
        ruy.m7382l(this.f7840K, this.f7872v, this.f7839J.m4295r3());
        xdl0.E0(this.f7871u, new View.OnClickListener() { // from class: l.szz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7373a.m8070A(view);
            }
        });
    }

    @Override // p003l.u4z
    /* JADX INFO: renamed from: j */
    public void mo7354j() {
        xdl0.M(this.f7863m, false);
        if (this.f7840K.m2049C2()) {
            xdl0.M(this.f7861k, false);
            xdl0.M(this.f7863m, true);
        } else if (CoreModule.P().i().c() && this.f7839J.m4290q3().onlineMatch()) {
            xdl0.M(this.f7861k, false);
            if (this.f7846Q == null) {
                this.f7846Q = this.f7864n.inflate();
            }
            this.f7846Q.b(this.f7839J.m4191W5(), this.f7839J.m4290q3(), this.f7839J.m4255j3());
        } else if (CoreModule.P().b().Yg() && NullChecker.a(this.f7839J.f3551k) && "lovebuzz".equals(this.f7839J.f3551k.convType)) {
            xdl0.M(this.f7861k, false);
            if (this.f7848S == null) {
                this.f7848S = (LoveBuzzMessageHeadView) this.f7866p.inflate();
            }
            this.f7848S.m244m(this.f7839J.m4290q3(), CoreModule.P().b().v6(this.f7839J.f3551k), CoreModule.P().b().Wr(this.f7839J.f3551k));
        }
        this.f7830A.setImageResource(c3c0.j1);
        this.f7876z.setBackgroundResource(c3c0.U0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01cb  */
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
    @Override // p003l.u4z
    /* JADX INFO: renamed from: k */
    public void mo4920k() {
        CharSequence charSequenceS;
        final User userM4290q3 = this.f7839J.m4290q3();
        User userM4191W5 = this.f7839J.m4191W5();
        if (CoreModule.P().g().yc() || CoreModule.P().g().d9()) {
            if (m8082x() && this.f7839J.m4290q3().userActivityInfo == null) {
                xdl0.M(this.f7862l, false);
            } else {
                this.f7862l.setPage(2);
                this.f7862l.setLocked(!m8082x());
                this.f7862l.g(this.f7839J.m4290q3().userActivityInfo, this.f7839J.m4290q3().isFemale());
            }
        }
        this.f7859i.setTextColor(this.f7840K.getResources().getColor(a1c0.k));
        this.f7860j.setTextColor(this.f7840K.getResources().getColor(a1c0.k));
        this.f7858h.setBackgroundColor(0);
        if (((bpz) this.f7839J.m6497e0().mo2066l().m4309t7()).f2427M1) {
            this.f7858h.setBackground(this.f7840K.getDrawable(c3c0.R4));
            this.f7859i.setTextColor(this.f7840K.getResources().getColor(a1c0.a0));
            this.f7860j.setTextColor(this.f7840K.getResources().getColor(a1c0.a0));
        }
        uly ulyVarMo2051E = this.f7839J.m6497e0().mo2051E();
        ulyVarMo2051E.x0(userM4290q3);
        if (CoreModule.P().b().Yg() && NullChecker.a(this.f7839J.f3551k) && "lovebuzz".equals(this.f7839J.f3551k.convType) && NullChecker.a(this.f7848S)) {
            this.f7848S.m239h(userM4290q3, ulyVarMo2051E.k0(), CoreModule.P().b().Wr(this.f7839J.f3551k));
        }
        if (CoreModule.P().i().c() && userM4290q3.onlineMatchLocked()) {
            int iL0 = ulyVarMo2051E.l0();
            this.f7861k.F0(userM4290q3, iL0);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView = this.f7846Q;
            if (onlineMatchBaseHeadView != null) {
                onlineMatchBaseHeadView.c(userM4191W5, userM4290q3);
                this.f7846Q.a(userM4290q3, iL0);
            }
            m8071B(((DbObject) userM4290q3).id);
        } else if (this.f7839J.m4155P2()) {
            int iL1 = ulyVarMo2051E.l0();
            this.f7861k.G0(userM4290q3, iL1);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView2 = this.f7846Q;
            if (onlineMatchBaseHeadView2 != null) {
                onlineMatchBaseHeadView2.c(userM4191W5, userM4290q3);
                this.f7846Q.a(userM4290q3, iL1);
            }
        } else {
            this.f7861k.setFpAnonymityIncludeSelfImage(userM4290q3);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView3 = this.f7846Q;
            if (onlineMatchBaseHeadView3 != null) {
                onlineMatchBaseHeadView3.c(userM4191W5, userM4290q3);
                this.f7846Q.a(userM4290q3, 100);
            }
        }
        Conversation conversationM4255j3 = this.f7839J.m4255j3();
        boolean zA = NullChecker.a(conversationM4255j3);
        AppCompatTextView appCompatTextView = this.f7859i;
        if (zA) {
            appCompatTextView.setText(mqi0.G(conversationM4255j3.createdTime));
        } else {
            appCompatTextView.setText(mqi0.G(qib0.H.guessedCurrentServerTime()));
        }
        if (!User.isTeamAccount(this.f7839J.m4295r3())) {
            if (CoreModule.c.E0.B3(userM4290q3)) {
                charSequenceS = "-";
            } else {
                charSequenceS = i0g0.S(userM4290q3.location, true, new ForegroundColorSpan(this.f7840K.getResources().getColor(a1c0.V)));
                if (TextUtils.isEmpty(charSequenceS)) {
                    charSequenceS = "-";
                }
            }
            if (CoreModule.P().i().I1(this.f7839J.m4290q3()) && NullChecker.a(this.f7839J.m4191W5()) && !TextUtils.isEmpty(this.f7839J.m4191W5().location.region.city)) {
                charSequenceS = this.f7839J.m4191W5().location.region.city;
            }
            if (!this.f7842M) {
                this.f7842M = true;
                zvf0.B("e_distance_and_active_info", this.f7839J.pageId(), new j760[]{vwb.Y("moments_user_id", ((DbObject) userM4290q3).id), vwb.Y("distance", "" + userM4290q3.location.distance), vwb.Y("is_hidden", TextUtils.equals(charSequenceS.toString(), "-") ? "1" : "0"), vwb.Y("lastactivity_time", zz6.h.format(userM4290q3.location.updatedTime))});
            }
            if (CoreModule.P().i().G1()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7870t.getLayoutParams();
                int i = t100.F;
                layoutParams.setMargins(i, t100.q, i, t100.j);
                this.f7870t.setLayoutParams(layoutParams);
                this.f7870t.setMaxLines(3);
                this.f7870t.setGravity(17);
            }
            if (NullChecker.a(conversationM4255j3) && CoreModule.P().i().x() && TEnum.equals(conversationM4255j3.status, "dismissed")) {
                this.f7870t.setVisibility(0);
                this.f7870t.setText(userM4290q3.isFemale() ? R.string.t2 : R.string.s2);
            } else if (userM4290q3.onlineMatch()) {
                this.f7870t.setVisibility(8);
            } else {
                long j = Long.parseLong(((DbObject) userM4290q3).id);
                if (NullChecker.a(userM4290q3.localRelationship) && TEnum.equals(userM4290q3.localRelationship.state, "matched") && userM4290q3.localRelationship.status.contains(MatchFrom.get("boosted"))) {
                    this.f7870t.setVisibility(0);
                    this.f7870t.setText(this.f7840K.getString(R.string.C6));
                } else if (NullChecker.a(userM4290q3.localRelationship) && TEnum.equals(userM4290q3.localRelationship.state, "matched") && userM4290q3.localRelationship.status.contains(MatchFrom.get("boostBadge")) && j % 3 == 0) {
                    this.f7870t.setVisibility(0);
                    this.f7870t.setText(this.f7840K.getString(R.string.q6));
                } else {
                    this.f7870t.setVisibility(8);
                }
            }
        }
        this.f7861k.y0(this.f7840K, this.f7839J, userM4191W5, userM4290q3);
        if (CoreModule.P().i().c() && this.f7841L.getHeaderViewsCountHook() != 0) {
            fcz<User, bpz> fczVar = this.f7839J;
            if (!fczVar.m4261k4(fczVar.m4295r3())) {
                if (userM4290q3.onlineMatchLocked()) {
                    xdl0.M(this.f7868r, false);
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView4 = this.f7846Q;
                    if (onlineMatchBaseHeadView4 != null) {
                        onlineMatchBaseHeadView4.d(true);
                    }
                } else {
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView5 = this.f7846Q;
                    if (onlineMatchBaseHeadView5 != null) {
                        onlineMatchBaseHeadView5.d(false);
                    }
                }
            }
        }
        if (CoreModule.P().i().s4()) {
            fcz<User, bpz> fczVar2 = this.f7839J;
            if (!fczVar2.m4261k4(fczVar2.m4295r3())) {
                xdl0.M(this.f7868r, false);
            }
        }
        if (IntlCountryCodeController.n()) {
            Boolean boolM9972e = this.f7839J.m4259j7().m9972e();
            if (NullChecker.a(boolM9972e) && boolM9972e.booleanValue()) {
                xdl0.M(this.f7876z, true);
                if (!this.f7845P) {
                    ((bpz) this.f7839J.m4309t7()).m3071L3(this.f7849T);
                    this.f7845P = true;
                }
            } else {
                xdl0.M(this.f7876z, false);
            }
        }
        if (CoreModule.P().i().B()) {
            if (CoreModule.P().i().o4(conversationM4255j3)) {
                this.f7861k.H0();
                xdl0.M(this.f7831B, true);
                this.f7832C.setText(userM4290q3.isFemale() ? R.string.K3 : R.string.L3);
            } else {
                xdl0.M(this.f7831B, false);
            }
        }
        if (this.f7847R < 5 && !this.f7840K.m2050D2() && conversationM4255j3.userMessageCount == 0 && !conversationM4255j3.localHasMessage && TextUtils.equals(conversationM4255j3.convType, ServletHandler.__DEFAULT_SERVLET) && TEnum.equals(conversationM4255j3.status, ServletHandler.__DEFAULT_SERVLET)) {
            xdl0.M(this.f7836G, true);
            AppCompatTextView appCompatTextView2 = this.f7836G;
            int i2 = t100.o;
            appCompatTextView2.setPadding(i2, 0, i2, 0);
            CoreProviderInterface coreProviderInterfaceD = ura.e().d();
            this.f7836G.setText(i0g0.B(this.f7840K, ((coreProviderInterfaceD.ak() || coreProviderInterfaceD.Fl() || coreProviderInterfaceD.Ua()) && !userM4290q3.isPicVerificationVerified()) ? "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，同时注意识别对方信息真实性，感谢你的理解和支持" : "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，感谢你的理解和支持", new String[]{"《探探平台行为规范》", a3e0.a("http://lp.tantanapp.com/rule_zh_cn/")}));
            this.f7836G.setLinkTextColor(Color.parseColor("#fe7e1d"));
            this.f7836G.setMovementMethod(LinkMovementMethod.getInstance());
            ConversationCounterTypeSp.messageSensitiveTipsShowUser.set(this.f7839J.m4295r3(), 1);
            CoreModule.c.f0.C1.put(Long.valueOf(mqi0.o()));
            CoreModule.c.f0.D1.put(Integer.valueOf(this.f7847R + 1));
        } else if (!CoreModule.P().i().A1() || o.m3(CoreModule.c.e0.na()) || User.isTeamAccount(this.f7839J.m4295r3())) {
            xdl0.M(this.f7836G, false);
        } else {
            xdl0.M(this.f7836G, true);
            this.f7836G.setText(i0g0.b0("测测社交性格，帮你匹配最契合的伙伴！\n立即测试", vwb.f0(new String[]{"立即测试"}), Color.parseColor("#fe7e1d"), Typeface.DEFAULT));
            zvf0.A("e_character_guide", "p_chat_view", new j760[]{vwb.Y("guide_type", "word")});
            final boolean[] zArr = {false};
            xdl0.E0(this.f7836G, new View.OnClickListener() { // from class: l.nzz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6005a.m8083y(zArr, userM4290q3, view);
                }
            });
            this.f7840K.lifecycle().filter(new w9j() { // from class: l.ozz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return tzz.m8068q(zArr, (c) obj);
                }
            }).flatMap(new w9j() { // from class: l.pzz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return CoreModule.c.e0.W9(CoreModule.H().userId());
                }
            }).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.qzz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6750a.m8084z((roj0) obj);
                }
            }, new e30() { // from class: l.rzz
                @Override // p003l.e30
                public final void call(Object obj) {
                    tzz.m8067p((Throwable) obj);
                }
            }));
        }
        if (this.f7840K.m2049C2()) {
            xdl0.M(this.f7836G, false);
        }
        if (CoreModule.P().i().O8()) {
            this.f7861k.x0(userM4290q3, userM4191W5);
        }
        if (xdl0.O0(this.f7863m)) {
            this.f7863m.j(userM4290q3);
        }
        if (!this.f7839J.m4264k7()) {
            hmb.M(this.f7856f, true);
            hmb.M(this.f7855e, false);
        } else {
            this.f7855e.V(conversationM4255j3, this.f7839J.m4290q3(), this.f7839J.m4191W5());
            hmb.M(this.f7856f, false);
            hmb.M(this.f7855e, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public View m8077s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uzz.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t */
    public void m8078t(boolean z) {
        if (z && xdl0.O0(this.f7868r)) {
            xdl0.M(this.f7868r, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public VDraweeView m8079u() {
        return this.f7861k.getImageSmall();
    }

    /* JADX INFO: renamed from: v */
    public MessageKnowHimLayout m8080v() {
        return this.f7862l;
    }

    /* JADX INFO: renamed from: w */
    public FrameLayout m8081w() {
        return this.f7861k.getTickleAnimContent();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m8082x() {
        if (CoreModule.P().g().yc()) {
            return xma.B3();
        }
        if (CoreModule.P().g().d9()) {
            return xma.L3();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m8083y(boolean[] zArr, User user, View view) {
        zArr[0] = true;
        zvf0.u("e_character_guide", "p_chat_view", new j760[]{vwb.Y("guide_type", "word")});
        o.r3(this.f7840K, user, o.s3(o.U, "", false, "im_word"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m8084z(roj0 roj0Var) {
        xdl0.M(this.f7836G, !o.m3(CoreModule.c.e0.na()));
    }
}
