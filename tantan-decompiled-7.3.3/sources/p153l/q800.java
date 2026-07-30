package p153l;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreProviderInterface;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzMessageHeadView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageMarryHeaderLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseHeadView;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchNewUiHeadView;
import com.p051p1.mobile.putong.core.p058ui.view.MessageKnowHimLayout;
import com.p051p1.mobile.putong.core.p058ui.view.MessageMatchTimeLayout;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class q800 implements rdz<User, yxz> {

    /* JADX INFO: renamed from: A */
    public VImage f156014A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f156015B;

    /* JADX INFO: renamed from: C */
    public VText f156016C;

    /* JADX INFO: renamed from: D */
    public VText f156017D;

    /* JADX INFO: renamed from: E */
    public ViewStub f156018E;

    /* JADX INFO: renamed from: F */
    public ViewStub f156019F;

    /* JADX INFO: renamed from: G */
    public VText f156020G;

    /* JADX INFO: renamed from: H */
    public VText f156021H;

    /* JADX INFO: renamed from: I */
    public View f156022I;

    /* JADX INFO: renamed from: J */
    public clz<User, yxz> f156023J;

    /* JADX INFO: renamed from: K */
    public MessagesAct f156024K;

    /* JADX INFO: renamed from: L */
    public iwl f156025L;

    /* JADX INFO: renamed from: Q */
    public OnlineMatchBaseHeadView f156030Q;

    /* JADX INFO: renamed from: S */
    public LoveBuzzMessageHeadView f156032S;

    /* JADX INFO: renamed from: a */
    public FrameLayout f156035a;

    /* JADX INFO: renamed from: b */
    public VProgressBar f156036b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f156037c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f156038d;

    /* JADX INFO: renamed from: e */
    public MessageMatchTimeLayout f156039e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f156040f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f156041g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f156042h;

    /* JADX INFO: renamed from: i */
    public VText f156043i;

    /* JADX INFO: renamed from: j */
    public VText f156044j;

    /* JADX INFO: renamed from: k */
    public MessageUserHeaderLayout f156045k;

    /* JADX INFO: renamed from: l */
    public MessageKnowHimLayout f156046l;

    /* JADX INFO: renamed from: m */
    public MessageMarryHeaderLayout f156047m;

    /* JADX INFO: renamed from: n */
    public ViewStub f156048n;

    /* JADX INFO: renamed from: o */
    public ViewStub f156049o;

    /* JADX INFO: renamed from: p */
    public ViewStub f156050p;

    /* JADX INFO: renamed from: q */
    public TextView f156051q;

    /* JADX INFO: renamed from: r */
    public LinearLayout f156052r;

    /* JADX INFO: renamed from: s */
    public TextView f156053s;

    /* JADX INFO: renamed from: t */
    public VText f156054t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f156055u;

    /* JADX INFO: renamed from: v */
    public VText f156056v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f156057w;

    /* JADX INFO: renamed from: x */
    public VImage f156058x;

    /* JADX INFO: renamed from: y */
    public VText f156059y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f156060z;

    /* JADX INFO: renamed from: M */
    public boolean f156026M = false;

    /* JADX INFO: renamed from: N */
    public boolean f156027N = false;

    /* JADX INFO: renamed from: O */
    public boolean f156028O = false;

    /* JADX INFO: renamed from: P */
    public boolean f156029P = false;

    /* JADX INFO: renamed from: R */
    public int f156031R = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: T */
    public x20 f156033T = new x20() { // from class: l.j800
        @Override // p153l.x20
        public final void call() {
            o3z.m165900p();
        }
    };

    /* JADX INFO: renamed from: U */
    public boolean f156034U = false;

    public q800(String str) {
        CoreModule.f18264c.f20384f0.f20593D1.get().getClass();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m175730p(Throwable th) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Boolean m175731q(boolean[] zArr, C4470c c4470c) {
        boolean z = false;
        if (c4470c == C4470c.f16267i && zArr[0]) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m175733A(View view) {
        this.f156024K.m50152S2("header", this.f156023J.mo111034r3());
    }

    /* JADX INFO: renamed from: B */
    public final void m175734B(String str) {
        if (this.f156034U) {
            return;
        }
        UserPrivilege userPrivilegeM146426x4 = CoreModule.f18264c.f20297C0.m146426x4(SummarizedPrivilegesId.get("quickchatPeek"));
        sfj0.m185601h("e_quickchat_peek", this.f156023J.pageId(), sfj0.C20032a.m185616i("is_privileged", NullChecker.m82486a(userPrivilegeM146426x4) && NullChecker.m82486a(userPrivilegeM146426x4.content) && userPrivilegeM146426x4.content.remaining > 0), sfj0.C20032a.m185615h("moments_user_id", str));
        this.f156034U = true;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: a */
    public void mo175735a() {
        bnl0.m105524M(this.f156055u, false);
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: b */
    public void mo120537b(MessagesAct messagesAct, iwl iwlVar, clz<User, yxz> clzVar) {
        this.f156023J = clzVar;
        this.f156024K = messagesAct;
        this.f156025L = iwlVar;
        this.f156022I = m175740s(p9r.m171370a(messagesAct), iwlVar.getRealView());
        this.f156042h.setVisibility(0);
        this.f156043i.setTypeface(lyh0.m156283c(2));
        this.f156044j.setVisibility(8);
        this.f156045k.m51199U(clzVar);
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: c */
    public MessageUserHeaderLayout mo175736c() {
        return this.f156045k;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: d */
    public VText mo175737d() {
        return this.f156021H;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: e */
    public void mo169750e() {
        if (NullChecker.m82486a(this.f156045k)) {
            this.f156045k.m51224t0(NullChecker.m82486a(this.f156023J) ? this.f156023J.pageId() : "");
        }
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: f */
    public ViewStub mo175738f() {
        return this.f156049o;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: g */
    public View mo120538g() {
        return this.f156022I;
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: h */
    public void mo169751h(vg60<Message> vg60Var) {
        clz<User, yxz> clzVar = this.f156023J;
        boolean zM111000k4 = clzVar.m111000k4(clzVar.mo111034r3());
        VProgressBar vProgressBar = this.f156036b;
        if (zM111000k4) {
            bnl0.m105524M(vProgressBar, false);
            bnl0.m105524M(this.f156038d, true);
        } else {
            bnl0.m105524M(vProgressBar, vg60Var.m201221c());
            bnl0.m105524M(this.f156038d, !vg60Var.m201221c());
        }
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: i */
    public void mo175739i() {
        bnl0.m105524M(this.f156055u, true);
        o3z.m165899l(this.f156024K, this.f156056v, this.f156023J.mo111034r3());
        bnl0.m105509E0(this.f156055u, new View.OnClickListener() { // from class: l.p800
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150982a.m175733A(view);
            }
        });
    }

    @Override // p153l.rdz
    /* JADX INFO: renamed from: j */
    public void mo169752j() {
        bnl0.m105524M(this.f156047m, false);
        if (this.f156024K.m50141D2()) {
            bnl0.m105524M(this.f156045k, false);
            bnl0.m105524M(this.f156047m, true);
        } else if (CoreModule.m30933P().m143412i().mo180446c() && this.f156023J.m111029q3().onlineMatch()) {
            bnl0.m105524M(this.f156045k, false);
            if (this.f156030Q == null) {
                this.f156030Q = (OnlineMatchNewUiHeadView) this.f156048n.inflate();
            }
            this.f156030Q.mo51491b(this.f156023J.m110932W5(), this.f156023J.m111029q3(), this.f156023J.m110994j3());
        } else if (CoreModule.m30933P().m143406b().mo36110Yg() && NullChecker.m82486a(this.f156023J.f82482k) && "lovebuzz".equals(this.f156023J.f82482k.convType)) {
            bnl0.m105524M(this.f156045k, false);
            if (this.f156032S == null) {
                this.f156032S = (LoveBuzzMessageHeadView) this.f156050p.inflate();
            }
            this.f156032S.m48398m(this.f156023J.m111029q3(), CoreModule.m30933P().m143406b().mo36129v6(this.f156023J.f82482k), CoreModule.m30933P().m143406b().mo36108Wr(this.f156023J.f82482k));
        }
        this.f156014A.setImageResource(ibc0.f114050j1);
        this.f156060z.setBackgroundResource(ibc0.f113920U0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x01cb  */
    @Override // p153l.rdz
    /* JADX INFO: renamed from: k */
    public void mo120539k() {
        CharSequence charSequenceM175787S;
        final User userM111029q3 = this.f156023J.m111029q3();
        User userM110932W5 = this.f156023J.m110932W5();
        if (CoreModule.m30933P().m143410g().mo36090yc() || CoreModule.m30933P().m143410g().mo36057d9()) {
            if (m175745x() && this.f156023J.m111029q3().userActivityInfo == null) {
                bnl0.m105524M(this.f156046l, false);
            } else {
                this.f156046l.setPage(2);
                this.f156046l.setLocked(!m175745x());
                this.f156046l.m57328g(this.f156023J.m111029q3().userActivityInfo, this.f156023J.m111029q3().isFemale());
            }
        }
        this.f156043i.setTextColor(this.f156024K.getResources().getColor(g9c0.f102821k));
        this.f156044j.setTextColor(this.f156024K.getResources().getColor(g9c0.f102821k));
        this.f156042h.setBackgroundColor(0);
        if (((yxz) this.f156023J.m143372e0().mo50158l().m111048t7()).f202025M1) {
            this.f156042h.setBackground(this.f156024K.getDrawable(ibc0.f113900R4));
            this.f156043i.setTextColor(this.f156024K.getResources().getColor(g9c0.f102810a0));
            this.f156044j.setTextColor(this.f156024K.getResources().getColor(g9c0.f102810a0));
        }
        ruy ruyVarMo50143F = this.f156023J.m143372e0().mo50143F();
        ruyVarMo50143F.mo127924x0(userM111029q3);
        if (CoreModule.m30933P().m143406b().mo36110Yg() && NullChecker.m82486a(this.f156023J.f82482k) && "lovebuzz".equals(this.f156023J.f82482k.convType) && NullChecker.m82486a(this.f156032S)) {
            this.f156032S.m48393h(userM111029q3, ruyVarMo50143F.mo127908k0(), CoreModule.m30933P().m143406b().mo36108Wr(this.f156023J.f82482k));
        }
        if (CoreModule.m30933P().m143412i().mo180446c() && userM111029q3.onlineMatchLocked()) {
            int iMo127910l0 = ruyVarMo50143F.mo127910l0();
            this.f156045k.m51182F0(userM111029q3, iMo127910l0);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView = this.f156030Q;
            if (onlineMatchBaseHeadView != null) {
                onlineMatchBaseHeadView.mo51492c(userM110932W5, userM111029q3);
                this.f156030Q.mo51490a(userM111029q3, iMo127910l0);
            }
            m175734B(userM111029q3.f56859id);
        } else if (this.f156023J.m110896P2()) {
            int iMo127910l1 = ruyVarMo50143F.mo127910l0();
            this.f156045k.m51184G0(userM111029q3, iMo127910l1);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView2 = this.f156030Q;
            if (onlineMatchBaseHeadView2 != null) {
                onlineMatchBaseHeadView2.mo51492c(userM110932W5, userM111029q3);
                this.f156030Q.mo51490a(userM111029q3, iMo127910l1);
            }
        } else {
            this.f156045k.setFpAnonymityIncludeSelfImage(userM111029q3);
            OnlineMatchBaseHeadView onlineMatchBaseHeadView3 = this.f156030Q;
            if (onlineMatchBaseHeadView3 != null) {
                onlineMatchBaseHeadView3.mo51492c(userM110932W5, userM111029q3);
                this.f156030Q.mo51490a(userM111029q3, 100);
            }
        }
        Conversation conversationM110994j3 = this.f156023J.m110994j3();
        boolean zM82486a = NullChecker.m82486a(conversationM110994j3);
        VText vText = this.f156043i;
        if (zM82486a) {
            vText.setText(pzi0.m174442G(conversationM110994j3.createdTime));
        } else {
            vText.setText(pzi0.m174442G(uqb0.f180376H.guessedCurrentServerTime()));
        }
        if (!User.isTeamAccount(this.f156023J.mo111034r3())) {
            if (CoreModule.f18264c.f20303E0.m141060B3(userM111029q3)) {
                charSequenceM175787S = "-";
            } else {
                charSequenceM175787S = q8g0.m175787S(userM111029q3.location, true, new ForegroundColorSpan(this.f156024K.getResources().getColor(g9c0.f102804V)));
                if (TextUtils.isEmpty(charSequenceM175787S)) {
                    charSequenceM175787S = "-";
                }
            }
            if (CoreModule.m30933P().m143412i().mo180336I1(this.f156023J.m111029q3()) && NullChecker.m82486a(this.f156023J.m110932W5()) && !TextUtils.isEmpty(this.f156023J.m110932W5().location.region.city)) {
                charSequenceM175787S = this.f156023J.m110932W5().location.region.city;
            }
            if (!this.f156026M) {
                this.f156026M = true;
                i4g0.m138493B("e_distance_and_active_info", this.f156023J.pageId(), jyb.m147494Y("moments_user_id", userM111029q3.f56859id), jyb.m147494Y("distance", "" + userM111029q3.location.distance), jyb.m147494Y("is_hidden", TextUtils.equals(charSequenceM175787S.toString(), "-") ? "1" : "0"), jyb.m147494Y("lastactivity_time", c17.f79338h.format(userM111029q3.location.updatedTime)));
            }
            if (CoreModule.m30933P().m143412i().mo180325G1()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f156054t.getLayoutParams();
                int i = qa00.f156293F;
                layoutParams.setMargins(i, qa00.f156330q, i, qa00.f156323j);
                this.f156054t.setLayoutParams(layoutParams);
                this.f156054t.setMaxLines(3);
                this.f156054t.setGravity(17);
            }
            if (NullChecker.m82486a(conversationM110994j3) && CoreModule.m30933P().m143412i().mo180557x() && TEnum.equals(conversationM110994j3.status, "dismissed")) {
                this.f156054t.setVisibility(0);
                this.f156054t.setText(userM111029q3.isFemale() ? R$string.f21829t2 : R$string.f21821s2);
            } else if (userM111029q3.onlineMatch()) {
                this.f156054t.setVisibility(8);
            } else {
                long j = Long.parseLong(userM111029q3.f56859id);
                if (NullChecker.m82486a(userM111029q3.localRelationship) && TEnum.equals(userM111029q3.localRelationship.state, "matched") && userM111029q3.localRelationship.status.contains(MatchFrom.get("boosted"))) {
                    this.f156054t.setVisibility(0);
                    this.f156054t.setText(this.f156024K.getString(R$string.f21473C6));
                } else if (NullChecker.m82486a(userM111029q3.localRelationship) && TEnum.equals(userM111029q3.localRelationship.state, "matched") && userM111029q3.localRelationship.status.contains(MatchFrom.get(MatchFrom.boostBadge)) && j % 3 == 0) {
                    this.f156054t.setVisibility(0);
                    this.f156054t.setText(this.f156024K.getString(R$string.f21809q6));
                } else {
                    this.f156054t.setVisibility(8);
                }
            }
        }
        this.f156045k.m51229y0(this.f156024K, this.f156023J, userM110932W5, userM111029q3);
        if (CoreModule.m30933P().m143412i().mo180446c() && this.f156025L.getHeaderViewsCountHook() != 0) {
            clz<User, yxz> clzVar = this.f156023J;
            if (!clzVar.m111000k4(clzVar.mo111034r3())) {
                if (userM111029q3.onlineMatchLocked()) {
                    bnl0.m105524M(this.f156052r, false);
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView4 = this.f156030Q;
                    if (onlineMatchBaseHeadView4 != null) {
                        onlineMatchBaseHeadView4.mo51493d(true);
                    }
                } else {
                    OnlineMatchBaseHeadView onlineMatchBaseHeadView5 = this.f156030Q;
                    if (onlineMatchBaseHeadView5 != null) {
                        onlineMatchBaseHeadView5.mo51493d(false);
                    }
                }
            }
        }
        if (CoreModule.m30933P().m143412i().mo180535s4()) {
            clz<User, yxz> clzVar2 = this.f156023J;
            if (!clzVar2.m111000k4(clzVar2.mo111034r3())) {
                bnl0.m105524M(this.f156052r, false);
            }
        }
        if (IntlCountryCodeController.m29117n()) {
            Boolean boolM222761e = this.f156023J.mo110998j7().m222761e();
            if (NullChecker.m82486a(boolM222761e) && boolM222761e.booleanValue()) {
                bnl0.m105524M(this.f156060z, true);
                if (!this.f156029P) {
                    ((yxz) this.f156023J.m111048t7()).m217835L3(this.f156033T);
                    this.f156029P = true;
                }
            } else {
                bnl0.m105524M(this.f156060z, false);
            }
        }
        if (CoreModule.m30933P().m143412i().mo180296B()) {
            if (CoreModule.m30933P().m143412i().mo180515o4(conversationM110994j3)) {
                this.f156045k.m51186H0();
                bnl0.m105524M(this.f156015B, true);
                this.f156016C.setText(userM111029q3.isFemale() ? R$string.f21534K3 : R$string.f21542L3);
            } else {
                bnl0.m105524M(this.f156015B, false);
            }
        }
        if (this.f156031R < 5 && !this.f156024K.m50142E2() && conversationM110994j3.userMessageCount == 0 && !conversationM110994j3.localHasMessage && TextUtils.equals(conversationM110994j3.convType, "default") && TEnum.equals(conversationM110994j3.status, "default")) {
            bnl0.m105524M(this.f156020G, true);
            VText vText2 = this.f156020G;
            int i2 = qa00.f156328o;
            vText2.setPadding(i2, 0, i2, 0);
            CoreProviderInterface coreProviderInterfaceM132214d = gta.m132210e().m132214d();
            this.f156020G.setText(q8g0.m175770B(this.f156024K, ((coreProviderInterfaceM132214d.mo34801ak() || coreProviderInterfaceM132214d.mo34690Fl() || coreProviderInterfaceM132214d.mo34759Ua()) && !userM111029q3.isPicVerificationVerified()) ? "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，同时注意识别对方信息真实性，感谢你的理解和支持" : "聊天过程中请遵守平台规范和社交礼仪，共同维护《探探平台行为规范》，感谢你的理解和支持", "《探探平台行为规范》", ebe0.m120159a("http://lp.tantanapp.com/rule_zh_cn/")));
            this.f156020G.setLinkTextColor(Color.parseColor("#fe7e1d"));
            this.f156020G.setMovementMethod(LinkMovementMethod.getInstance());
            ConversationCounterTypeSp.messageSensitiveTipsShowUser.set(this.f156023J.mo111034r3(), 1);
            CoreModule.f18264c.f20384f0.f20590C1.put(Long.valueOf(pzi0.m174454o()));
            CoreModule.f18264c.f20384f0.f20593D1.put(Integer.valueOf(this.f156031R + 1));
        } else if (!CoreModule.m30933P().m143412i().mo180293A1() || C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na()) || User.isTeamAccount(this.f156023J.mo111034r3())) {
            bnl0.m105524M(this.f156020G, false);
        } else {
            bnl0.m105524M(this.f156020G, true);
            this.f156020G.setText(q8g0.m175796b0("测测社交性格，帮你匹配最契合的伙伴！\n立即测试", jyb.m147507f0("立即测试"), Color.parseColor("#fe7e1d"), Typeface.DEFAULT));
            i4g0.m138492A("e_character_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("guide_type", "word"));
            final boolean[] zArr = {false};
            bnl0.m105509E0(this.f156020G, new View.OnClickListener() { // from class: l.k800
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124345a.m175746y(zArr, userM111029q3, view);
                }
            });
            this.f156024K.lifecycle().filter(new qcj() { // from class: l.l800
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return q800.m175731q(zArr, (C4470c) obj);
                }
            }).flatMap(new qcj() { // from class: l.m800
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                }
            }).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.n800
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140643a.m175747z((uxj0) obj);
                }
            }, new y20() { // from class: l.o800
                @Override // p153l.y20
                public final void call(Object obj) {
                    q800.m175730p((Throwable) obj);
                }
            }));
        }
        if (this.f156024K.m50141D2()) {
            bnl0.m105524M(this.f156020G, false);
        }
        if (CoreModule.m30933P().m143412i().mo34386O8()) {
            this.f156045k.m51228x0(userM111029q3, userM110932W5);
        }
        if (bnl0.m105529O0(this.f156047m)) {
            this.f156047m.m51136j(userM111029q3);
        }
        if (!this.f156023J.m111003k7()) {
            vnb.m201946M(this.f156040f, true);
            vnb.m201946M(this.f156039e, false);
        } else {
            this.f156039e.m57336V(conversationM110994j3, this.f156023J.m111029q3(), this.f156023J.m110932W5());
            vnb.m201946M(this.f156040f, false);
            vnb.m201946M(this.f156039e, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public View m175740s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r800.m180173b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: t */
    public void m175741t(boolean z) {
        if (z && bnl0.m105529O0(this.f156052r)) {
            bnl0.m105524M(this.f156052r, false);
        }
    }

    /* JADX INFO: renamed from: u */
    public VDraweeView m175742u() {
        return this.f156045k.getImageSmall();
    }

    /* JADX INFO: renamed from: v */
    public MessageKnowHimLayout m175743v() {
        return this.f156046l;
    }

    /* JADX INFO: renamed from: w */
    public FrameLayout m175744w() {
        return this.f156045k.getTickleAnimContent();
    }

    /* JADX INFO: renamed from: x */
    public final boolean m175745x() {
        if (CoreModule.m30933P().m143410g().mo36090yc()) {
            return joa.m146353C3();
        }
        if (CoreModule.m30933P().m143410g().mo36057d9()) {
            return joa.m146361M3();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m175746y(boolean[] zArr, User user, View view) {
        zArr[0] = true;
        i4g0.m138523u("e_character_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("guide_type", "word"));
        C4900o.m35347r3(this.f156024K, user, C4900o.m35348s3(C4900o.f20811U, "", false, "im_word"));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m175747z(uxj0 uxj0Var) {
        bnl0.m105524M(this.f156020G, !C4900o.m35345m3(CoreModule.f18264c.f20381e0.m116593na()));
    }
}
