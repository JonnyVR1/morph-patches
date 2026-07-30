package p149l;

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
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageMarryHeaderLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseHeadView;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchNewUiHeadView;
import com.p046p1.mobile.putong.core.p053ui.view.MessageKnowHimLayout;
import com.p046p1.mobile.putong.core.p053ui.view.MessageMatchTimeLayout;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class tzz implements u4z<User, bpz> {

    /* JADX INFO: renamed from: A */
    public VImage f172771A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f172772B;

    /* JADX INFO: renamed from: C */
    public VText f172773C;

    /* JADX INFO: renamed from: D */
    public VText f172774D;

    /* JADX INFO: renamed from: E */
    public ViewStub f172775E;

    /* JADX INFO: renamed from: F */
    public ViewStub f172776F;

    /* JADX INFO: renamed from: G */
    public VText f172777G;

    /* JADX INFO: renamed from: H */
    public VText f172778H;

    /* JADX INFO: renamed from: I */
    public View f172779I;

    /* JADX INFO: renamed from: J */
    public fcz<User, bpz> f172780J;

    /* JADX INFO: renamed from: K */
    public MessagesAct f172781K;

    /* JADX INFO: renamed from: L */
    public utl f172782L;

    /* JADX INFO: renamed from: Q */
    public OnlineMatchBaseHeadView f172787Q;

    /* JADX INFO: renamed from: S */
    public LoveBuzzMessageHeadView f172789S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f172792a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f172793b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f172794c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f172795d;

    /* JADX INFO: renamed from: e */
    public MessageMatchTimeLayout f172796e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f172797f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f172798g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f172799h;

    /* JADX INFO: renamed from: i */
    public VText f172800i;

    /* JADX INFO: renamed from: j */
    public VText f172801j;

    /* JADX INFO: renamed from: k */
    public MessageUserHeaderLayout f172802k;

    /* JADX INFO: renamed from: l */
    public MessageKnowHimLayout f172803l;

    /* JADX INFO: renamed from: m */
    public MessageMarryHeaderLayout f172804m;

    /* JADX INFO: renamed from: n */
    public ViewStub f172805n;

    /* JADX INFO: renamed from: o */
    public ViewStub f172806o;

    /* JADX INFO: renamed from: p */
    public ViewStub f172807p;

    /* JADX INFO: renamed from: q */
    public TextView f172808q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f172809r;

    /* JADX INFO: renamed from: s */
    public TextView f172810s;

    /* JADX INFO: renamed from: t */
    public VText f172811t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f172812u;

    /* JADX INFO: renamed from: v */
    public VText f172813v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f172814w;

    /* JADX INFO: renamed from: x */
    public VImage f172815x;

    /* JADX INFO: renamed from: y */
    public VText f172816y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f172817z;

    /* JADX INFO: renamed from: M */
    public boolean f172783M = false;

    /* JADX INFO: renamed from: N */
    public boolean f172784N = false;

    /* JADX INFO: renamed from: O */
    public boolean f172785O = false;

    /* JADX INFO: renamed from: P */
    public boolean f172786P = false;

    /* JADX INFO: renamed from: R */
    public int f172788R = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: T */
    public d30 f172790T = new d30() { // from class: l.mzz
        @Override // p149l.d30
        public final void call() {
            ruy.m181217p();
        }
    };

    /* JADX INFO: renamed from: U */
    public boolean f172791U = false;

    public tzz(String str) {
        CoreModule.f17545c.f19642f0.f19851D1.get().getClass();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m191234p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m191235q(boolean[] zArr, C4319c c4319c) {
        boolean z = false;
        if (c4319c == C4319c.f15548i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m191237A(View view) {
        this.f172781K.m48968R2("header", this.f172780J.mo120828r3());
    }

    /* JADX INFO: renamed from: B */
    public final void m191238B(String str) {
        if (this.f172791U) {
            return;
        }
        UserPrivilege userPrivilegeM210113w4 = CoreModule.f17545c.f19555C0.m210113w4(SummarizedPrivilegesId.get("quickchatPeek"));
        o6j0.m162864h("e_quickchat_peek", this.f172780J.pageId(), o6j0.C18854a.m162879i("is_privileged", NullChecker.m81303a(userPrivilegeM210113w4) && NullChecker.m81303a(userPrivilegeM210113w4.content) && userPrivilegeM210113w4.content.remaining > 0), o6j0.C18854a.m162878h("moments_user_id", str));
        this.f172791U = true;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: a */
    public void mo191239a() {
        xdl0.m208344M(this.f172812u, false);
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: b */
    public void mo129344b(MessagesAct messagesAct, utl utlVar, fcz<User, bpz> fczVar) {
        this.f172780J = fczVar;
        this.f172781K = messagesAct;
        this.f172782L = utlVar;
        this.f172779I = m191244s(o7r.m163037a(messagesAct), utlVar.getRealView());
        this.f172799h.setVisibility(0);
        this.f172800i.setTypeface(eqh0.m117752c(2));
        this.f172801j.setVisibility(8);
        this.f172802k.m50016U(fczVar);
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: c */
    public MessageUserHeaderLayout mo191240c() {
        return this.f172802k;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: d */
    public VText mo191241d() {
        return this.f172778H;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: e */
    public void mo180267e() {
        if (NullChecker.m81303a(this.f172802k)) {
            this.f172802k.m50041t0(NullChecker.m81303a(this.f172780J) ? this.f172780J.pageId() : "");
        }
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: f */
    public ViewStub mo191242f() {
        return this.f172806o;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: g */
    public View mo129345g() {
        return this.f172779I;
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: h */
    public void mo180268h(q860<Message> q860Var) {
        fcz<User, bpz> fczVar = this.f172780J;
        boolean zM120794k4 = fczVar.m120794k4(fczVar.mo120828r3());
        VProgressBar vProgressBar = this.f172793b;
        if (zM120794k4) {
            xdl0.m208344M(vProgressBar, false);
            xdl0.m208344M(this.f172795d, true);
        } else {
            xdl0.m208344M(vProgressBar, q860Var.m173343c());
            xdl0.m208344M(this.f172795d, !q860Var.m173343c());
        }
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: i */
    public void mo191243i() {
        xdl0.m208344M(this.f172812u, true);
        ruy.m181216l(this.f172781K, this.f172813v, this.f172780J.mo120828r3());
        xdl0.m208329E0(this.f172812u, new View.OnClickListener() { // from class: l.szz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167088a.m191237A(view);
            }
        });
    }

    @Override // p149l.u4z
    /* JADX INFO: renamed from: j */
    public void mo180269j() {
        xdl0.m208344M(this.f172804m, false);
        if (this.f172781K.m48957C2()) {
            xdl0.m208344M(this.f172802k, false);
            xdl0.m208344M(this.f172804m, true);
        } else if (CoreModule.m29935P().m94658i().mo158354c() && this.f172780J.m120823q3().onlineMatch()) {
            xdl0.m208344M(this.f172802k, false);
            if (this.f172787Q == null) {
                this.f172787Q = (OnlineMatchNewUiHeadView) this.f172805n.inflate();
            }
            this.f172787Q.mo50308b(this.f172780J.m120726W5(), this.f172780J.m120823q3(), this.f172780J.m120788j3());
        } else if (CoreModule.m29935P().m94652b().mo35107Yg() && NullChecker.m81303a(this.f172780J.f96919k) && "lovebuzz".equals(this.f172780J.f96919k.convType)) {
            xdl0.m208344M(this.f172802k, false);
            if (this.f172789S == null) {
                this.f172789S = (LoveBuzzMessageHeadView) this.f172807p.inflate();
            }
            this.f172789S.m47215m(this.f172780J.m120823q3(), CoreModule.m29935P().m94652b().mo35126v6(this.f172780J.f96919k), CoreModule.m29935P().m94652b().mo35105Wr(this.f172780J.f96919k));
        }
        this.f172771A.setImageResource(c3c0.f78775j1);
        this.f172817z.setBackgroundResource(c3c0.f78645U0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01cb  */
    @Override // p149l.u4z
    /* JADX INFO: renamed from: k */
    public void mo129346k() {
        CharSequence charSequenceM133852S;
        final User userM120823q3 = this.f172780J.m120823q3();
        User userM120726W5 = this.f172780J.m120726W5();
        if (CoreModule.m29935P().m94656g().mo35087yc() || CoreModule.m29935P().m94656g().mo35054d9()) {
            if (m191249x() && this.f172780J.m120823q3().userActivityInfo == null) {
                xdl0.m208344M(this.f172803l, false);
            } else {
                this.f172803l.setPage(2);
                this.f172803l.setLocked(!m191249x());
                this.f172803l.m56145g(this.f172780J.m120823q3().userActivityInfo, this.f172780J.m120823q3().isFemale());
            }
        }
        this.f172800i.setTextColor(this.f172781K.getResources().getColor(a1c0.f67157k));
        this.f172801j.setTextColor(this.f172781K.getResources().getColor(a1c0.f67157k));
        this.f172799h.setBackgroundColor(0);
        if (((bpz) this.f172780J.m156455e0().mo48974l().m120842t7()).f76692M1) {
            this.f172799h.setBackground(this.f172781K.getDrawable(c3c0.f78625R4));
            this.f172800i.setTextColor(this.f172781K.getResources().getColor(a1c0.f67146a0));
            this.f172801j.setTextColor(this.f172781K.getResources().getColor(a1c0.f67146a0));
        }
        uly ulyVarMo48959E = this.f172780J.m156455e0().mo48959E();
        ulyVarMo48959E.mo137249x0(userM120823q3);
        if (CoreModule.m29935P().m94652b().mo35107Yg() && NullChecker.m81303a(this.f172780J.f96919k) && "lovebuzz".equals(this.f172780J.f96919k.convType) && NullChecker.m81303a(this.f172789S)) {
            this.f172789S.m47210h(userM120823q3, ulyVarMo48959E.mo137233k0(), CoreModule.m29935P().m94652b().mo35105Wr(this.f172780J.f96919k));
        }
        if (CoreModule.m29935P().m94658i().mo158354c() && userM120823q3.onlineMatchLocked()) {
            int iMo137235l0 = ulyVarMo48959E.mo137235l0();
            this.f172802k.m49999F0(userM120823q3, iMo137235l0);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView = this.f172787Q;
            if (onlineMatchBaseHeadView != null) {
                onlineMatchBaseHeadView.mo50309c(userM120726W5, userM120823q3);
                this.f172787Q.mo50307a(userM120823q3, iMo137235l0);
            }
            m191238B(userM120823q3.f56011id);
        } else if (this.f172780J.m120690P2()) {
            int iMo137235l1 = ulyVarMo48959E.mo137235l0();
            this.f172802k.m50001G0(userM120823q3, iMo137235l1);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView2 = this.f172787Q;
            if (onlineMatchBaseHeadView2 != null) {
                onlineMatchBaseHeadView2.mo50309c(userM120726W5, userM120823q3);
                this.f172787Q.mo50307a(userM120823q3, iMo137235l1);
            }
        } else {
            this.f172802k.setFpAnonymityIncludeSelfImage(userM120823q3);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView3 = this.f172787Q;
            if (onlineMatchBaseHeadView3 != null) {
                onlineMatchBaseHeadView3.mo50309c(userM120726W5, userM120823q3);
                this.f172787Q.mo50307a(userM120823q3, 100);
            }
        }
        Conversation conversationM120788j3 = this.f172780J.m120788j3();
        boolean zM81303a = NullChecker.m81303a(conversationM120788j3);
        VText vText = this.f172800i;
        if (zM81303a) {
            vText.setText(mqi0.m155932G(conversationM120788j3.createdTime));
        } else {
            vText.setText(mqi0.m155932G(qib0.f154693H.guessedCurrentServerTime()));
        }
        if (!User.isTeamAccount(this.f172780J.mo120828r3())) {
            if (CoreModule.f17545c.f19561E0.m203772B3(userM120823q3)) {
                charSequenceM133852S = "-";
            } else {
                charSequenceM133852S = i0g0.m133852S(userM120823q3.location, true, new ForegroundColorSpan(this.f172781K.getResources().getColor(a1c0.f67140V)));
                if (TextUtils.isEmpty(charSequenceM133852S)) {
                    charSequenceM133852S = "-";
                }
            }
            if (CoreModule.m29935P().m94658i().mo158244I1(this.f172780J.m120823q3()) && NullChecker.m81303a(this.f172780J.m120726W5()) && !TextUtils.isEmpty(this.f172780J.m120726W5().location.region.city)) {
                charSequenceM133852S = this.f172780J.m120726W5().location.region.city;
            }
            if (!this.f172783M) {
                this.f172783M = true;
                zvf0.m220369B("e_distance_and_active_info", this.f172780J.pageId(), vwb.m200311Y("moments_user_id", userM120823q3.f56011id), vwb.m200311Y("distance", "" + userM120823q3.location.distance), vwb.m200311Y("is_hidden", TextUtils.equals(charSequenceM133852S.toString(), "-") ? "1" : "0"), vwb.m200311Y("lastactivity_time", zz6.f205780h.format(userM120823q3.location.updatedTime)));
            }
            if (CoreModule.m29935P().m94658i().mo158233G1()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f172811t.getLayoutParams();
                int i = t100.f167231F;
                layoutParams.setMargins(i, t100.f167268q, i, t100.f167261j);
                this.f172811t.setLayoutParams(layoutParams);
                this.f172811t.setMaxLines(3);
                this.f172811t.setGravity(17);
            }
            if (NullChecker.m81303a(conversationM120788j3) && CoreModule.m29935P().m94658i().mo158465x() && TEnum.equals(conversationM120788j3.status, "dismissed")) {
                this.f172811t.setVisibility(0);
                this.f172811t.setText(userM120823q3.isFemale() ? R$string.f21087t2 : R$string.f21079s2);
            } else if (userM120823q3.onlineMatch()) {
                this.f172811t.setVisibility(8);
            } else {
                long j = Long.parseLong(userM120823q3.f56011id);
                if (NullChecker.m81303a(userM120823q3.localRelationship) && TEnum.equals(userM120823q3.localRelationship.state, "matched") && userM120823q3.localRelationship.status.contains(MatchFrom.get("boosted"))) {
                    this.f172811t.setVisibility(0);
                    this.f172811t.setText(this.f172781K.getString(R$string.f20731C6));
                } else if (NullChecker.m81303a(userM120823q3.localRelationship) && TEnum.equals(userM120823q3.localRelationship.state, "matched") && userM120823q3.localRelationship.status.contains(MatchFrom.get(MatchFrom.boostBadge)) && j % 3 == 0) {
                    this.f172811t.setVisibility(0);
                    this.f172811t.setText(this.f172781K.getString(R$string.f21067q6));
                } else {
                    this.f172811t.setVisibility(8);
                }
            }
        }
        this.f172802k.m50046y0(this.f172781K, this.f172780J, userM120726W5, userM120823q3);
        if (CoreModule.m29935P().m94658i().mo158354c() && this.f172782L.getHeaderViewsCountHook() != 0) {
            fcz<User, bpz> fczVar = this.f172780J;
            if (!fczVar.m120794k4(fczVar.mo120828r3())) {
                if (userM120823q3.onlineMatchLocked()) {
                    xdl0.m208344M(this.f172809r, false);
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView4 = this.f172787Q;
                    if (onlineMatchBaseHeadView4 != null) {
                        onlineMatchBaseHeadView4.mo50310d(true);
                    }
                } else {
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView5 = this.f172787Q;
                    if (onlineMatchBaseHeadView5 != null) {
                        onlineMatchBaseHeadView5.mo50310d(false);
                    }
                }
            }
        }
        if (CoreModule.m29935P().m94658i().mo158443s4()) {
            fcz<User, bpz> fczVar2 = this.f172780J;
            if (!fczVar2.m120794k4(fczVar2.mo120828r3())) {
                xdl0.m208344M(this.f172809r, false);
            }
        }
        if (IntlCountryCodeController.m28118n()) {
            Boolean boolM221515e = this.f172780J.mo120792j7().m221515e();
            if (NullChecker.m81303a(boolM221515e) && boolM221515e.booleanValue()) {
                xdl0.m208344M(this.f172817z, true);
                if (!this.f172786P) {
                    ((bpz) this.f172780J.m120842t7()).m103191L3(this.f172790T);
                    this.f172786P = true;
                }
            } else {
                xdl0.m208344M(this.f172817z, false);
            }
        }
        if (CoreModule.m29935P().m94658i().mo158204B()) {
            if (CoreModule.m29935P().m94658i().mo158423o4(conversationM120788j3)) {
                this.f172802k.m50003H0();
                xdl0.m208344M(this.f172772B, true);
                this.f172773C.setText(userM120823q3.isFemale() ? R$string.f20792K3 : R$string.f20800L3);
            } else {
                xdl0.m208344M(this.f172772B, false);
            }
        }
        if (this.f172788R < 5 && !this.f172781K.m48958D2() && conversationM120788j3.userMessageCount == 0 && !conversationM120788j3.localHasMessage && TextUtils.equals(conversationM120788j3.convType, "default") && TEnum.equals(conversationM120788j3.status, "default")) {
            xdl0.m208344M(this.f172777G, true);
            VText vText2 = this.f172777G;
            int i2 = t100.f167266o;
            vText2.setPadding(i2, 0, i2, 0);
            CoreProviderInterface coreProviderInterfaceM195057d = ura.m195053e().m195057d();
            this.f172777G.setText(i0g0.m133835B(this.f172781K, ((coreProviderInterfaceM195057d.mo33798ak() || coreProviderInterfaceM195057d.mo33687Fl() || coreProviderInterfaceM195057d.mo33756Ua()) && !userM120823q3.isPicVerificationVerified()) ? "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，同时注意识别对方信息真实性，感谢你的理解和支持" : "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，感谢你的理解和支持", "《探探平台行为规范》", a3e0.m94685a("http://lp.tantanapp.com/rule_zh_cn/")));
            this.f172777G.setLinkTextColor(Color.parseColor("#fe7e1d"));
            this.f172777G.setMovementMethod(LinkMovementMethod.getInstance());
            ConversationCounterTypeSp.messageSensitiveTipsShowUser.set(this.f172780J.mo120828r3(), 1);
            CoreModule.f17545c.f19642f0.f19848C1.put(Long.valueOf(mqi0.m155944o()));
            CoreModule.f17545c.f19642f0.f19851D1.put(Integer.valueOf(this.f172788R + 1));
        } else if (!CoreModule.m29935P().m94658i().mo158201A1() || C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na()) || User.isTeamAccount(this.f172780J.mo120828r3())) {
            xdl0.m208344M(this.f172777G, false);
        } else {
            xdl0.m208344M(this.f172777G, true);
            this.f172777G.setText(i0g0.m133861b0("测测社交性格，帮你匹配最契合的伙伴！\n立即测试", vwb.m200324f0("立即测试"), Color.parseColor("#fe7e1d"), Typeface.DEFAULT));
            zvf0.m220368A("e_character_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("guide_type", "word"));
            final boolean[] zArr = {false};
            xdl0.m208329E0(this.f172777G, new View.OnClickListener() { // from class: l.nzz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141268a.m191250y(zArr, userM120823q3, view);
                }
            });
            this.f172781K.lifecycle().filter(new w9j() { // from class: l.ozz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return tzz.m191235q(zArr, (C4319c) obj);
                }
            }).flatMap(new w9j() { // from class: l.pzz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                }
            }).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.qzz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157121a.m191251z((roj0) obj);
                }
            }, new e30() { // from class: l.rzz
                @Override // p149l.e30
                public final void call(Object obj) {
                    tzz.m191234p((Throwable) obj);
                }
            }));
        }
        if (this.f172781K.m48957C2()) {
            xdl0.m208344M(this.f172777G, false);
        }
        if (CoreModule.m29935P().m94658i().mo33383O8()) {
            this.f172802k.m50045x0(userM120823q3, userM120726W5);
        }
        if (xdl0.m208349O0(this.f172804m)) {
            this.f172804m.m49953j(userM120823q3);
        }
        if (!this.f172780J.m120797k7()) {
            hmb.m131701M(this.f172797f, true);
            hmb.m131701M(this.f172796e, false);
        } else {
            this.f172796e.m56153V(conversationM120788j3, this.f172780J.m120823q3(), this.f172780J.m120726W5());
            hmb.m131701M(this.f172797f, false);
            hmb.m131701M(this.f172796e, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public View m191244s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uzz.m196457b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t */
    public void m191245t(boolean z) {
        if (z && xdl0.m208349O0(this.f172809r)) {
            xdl0.m208344M(this.f172809r, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public VDraweeView m191246u() {
        return this.f172802k.getImageSmall();
    }

    /* JADX INFO: renamed from: v */
    public MessageKnowHimLayout m191247v() {
        return this.f172803l;
    }

    /* JADX INFO: renamed from: w */
    public FrameLayout m191248w() {
        return this.f172802k.getTickleAnimContent();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m191249x() {
        if (CoreModule.m29935P().m94656g().mo35087yc()) {
            return xma.m210039B3();
        }
        if (CoreModule.m29935P().m94656g().mo35054d9()) {
            return xma.m210047L3();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m191250y(boolean[] zArr, User user, View view) {
        zArr[0] = true;
        zvf0.m220399u("e_character_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("guide_type", "word"));
        C4749o.m34344r3(this.f172781K, user, C4749o.m34345s3(C4749o.f20069U, "", false, "im_word"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m191251z(roj0 roj0Var) {
        xdl0.m208344M(this.f172777G, !C4749o.m34342m3(CoreModule.f17545c.f19639e0.m169520na()));
    }
}
