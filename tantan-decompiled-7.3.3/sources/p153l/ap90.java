package p153l;

import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.core.p058ui.settings.IntlPersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.IntlGender;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ap90 extends no90 {

    /* JADX INFO: renamed from: E0 */
    public VLinear f72695E0;

    /* JADX INFO: renamed from: F0 */
    public VText f72696F0;

    /* JADX INFO: renamed from: G0 */
    public VLinear f72697G0;

    /* JADX INFO: renamed from: H0 */
    public VDraweeView f72698H0;

    /* JADX INFO: renamed from: I0 */
    public VText f72699I0;

    /* JADX INFO: renamed from: J0 */
    public VLinear f72700J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f72701K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f72702L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f72703M0;

    /* JADX INFO: renamed from: N0 */
    public eo90 f72704N0;

    /* JADX INFO: renamed from: O0 */
    public BubbleInfo f72705O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f72706P0;

    /* JADX INFO: renamed from: X */
    public VText f72707X;

    /* JADX INFO: renamed from: Y */
    public LinearLayout f72708Y;

    /* JADX INFO: renamed from: Z */
    public VLinear f72709Z;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f72710k0;

    /* JADX INFO: renamed from: p0 */
    public VText f72711p0;

    /* JADX INFO: renamed from: l.ap90$a */
    public class C15765a extends fn2 {
        public C15765a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ap90.this.f72704N0.f94918w.getLayoutParams();
            int i = qa00.f156328o;
            layoutParams.height = i;
            layoutParams.width = (int) ((qimVar.getWidth() / qimVar.getHeight()) * i);
            ap90.this.f72704N0.f94918w.setLayoutParams(layoutParams);
        }
    }

    public ap90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f72701K0 = false;
        this.f72702L0 = false;
        this.f72703M0 = false;
        this.f72704N0 = new eo90();
    }

    /* JADX INFO: renamed from: C0 */
    private void m99268C0() {
        final User userMo52252K2;
        if (mo53983O().mo52302m0() || (userMo52252K2 = mo53983O().mo52252K2()) == null) {
            return;
        }
        m168321p().duringCreated(CoreModule.m30932N().mo61584vm(userMo52252K2.f56859id)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.xo90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195565a.m99284D0((BubbleInfo) obj);
            }
        }, new y20() { // from class: l.yo90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200963a.m99285E0((Throwable) obj);
            }
        }));
        bnl0.m105509E0(this.f72709Z, new View.OnClickListener() { // from class: l.zo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f205305a.m99286F0(userMo52252K2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m99269G0(Boolean bool) {
        m99268C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m99270H0(Boolean bool) {
        m99268C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m99271I0(View view) {
        mo53983O().startActivity(IntlPersonalDetailsAct.INSTANCE.m56186a(mo53983O().act(), "profile"));
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m99282A0(Conversation conversation) {
        ConversationStatus conversationStatus;
        return (conversation == null || (conversationStatus = conversation.status) == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m99283B0() {
        if (mo53983O().mo52252K2() == null || mo53983O().mo52302m0()) {
            return;
        }
        boolean z = false;
        bnl0.m105524M(this.f72697G0, false);
        VLinear vLinear = this.f72700J0;
        if (bnl0.m105529O0(this.f72709Z) && !m121838I()) {
            z = true;
        }
        bnl0.m105524M(vLinear, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m99284D0(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            bnl0.m105524M(this.f72709Z, false);
            bnl0.m105524M(this.f72700J0, bnl0.m105529O0(this.f72697G0) && !m121838I());
            return;
        }
        i4g0.m138492A("e_other_state", mo53983O().pageId(), jyb.m147494Y("state_id", bubbleInfo.f39578id), jyb.m147494Y("owner_id", bubbleInfo.owner.f39651id));
        this.f72705O0 = bubbleInfo;
        bnl0.m105524M(this.f72709Z, true);
        bnl0.m105524M(this.f72700J0, !m121838I());
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f72710k0;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156330q;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
        this.f72711p0.getPaint().setFakeBoldText(true);
        this.f72711p0.setText(bubbleInfo.emotion.text);
        this.f72706P0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m99285E0(Throwable th) {
        boolean z = false;
        bnl0.m105524M(this.f72709Z, false);
        VLinear vLinear = this.f72700J0;
        if (bnl0.m105529O0(this.f72697G0) && !m121838I()) {
            z = true;
        }
        bnl0.m105524M(vLinear, z);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m99286F0(User user, View view) {
        if (this.f72705O0 == null) {
            return;
        }
        i4g0.m138523u("e_other_state", mo53983O().pageId(), jyb.m147494Y("state_id", this.f72705O0.f39578id), jyb.m147494Y("owner_id", this.f72705O0.owner.f39651id));
        if (!this.f72705O0.checkStateTimeIsValid()) {
            o1j0.m165636j("状态已结束");
            return;
        }
        if (mo53983O().mo52258P1()) {
            CoreModule.m30932N().mo61454Dk(mo53983O().act(), mo53983O().userId(), this.f72705O0.f39578id, mo53983O().pageId());
            return;
        }
        if (m99282A0(CoreModule.f18264c.f20384f0.m34219zp(user.f56859id))) {
            FeedService feedServiceM30932N = CoreModule.m30932N();
            Act act = mo53983O().act();
            BubbleInfo bubbleInfo = this.f72705O0;
            feedServiceM30932N.mo61501Sg(act, bubbleInfo.f39578id, bubbleInfo.owner.f39651id, true, mo53983O().pageId());
            return;
        }
        CoreService coreServiceM30930K = CoreModule.m30930K();
        Act act2 = mo53983O().act();
        BubbleInfo bubbleInfo2 = this.f72705O0;
        coreServiceM30930K.mo31741Yn(act2, bubbleInfo2.owner.f39651id, bubbleInfo2.f39578id, OMSDialogPositon.p_suggest_user_profile_info_view, null, false, "");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m99287J0(User user, View view) {
        CertificationUtil.m59334j(mo53983O().act(), user);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m99288K0(User user, View view) {
        if (s7a.m184990s() || spl0.m187362N()) {
            i4g0.m138520r("e_sayhi_first", OMSDialogPositon.p_suggest_user_profile_info_view);
        } else {
            i4g0.m138520r("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        if (mo53983O().mo53319O1()) {
            mo53983O().mo52296j3(153);
            return;
        }
        if (spl0.m187362N()) {
            C8523d.a aVar = new C8523d.a(user.f56859id, mo53983O().pageId());
            aVar.m47101o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar.m47090d().channel = Channel.get(Channel.confession);
            km80.INSTANCE.m150415b(mo53983O().act(), aVar);
            return;
        }
        if (!s7a.m184990s()) {
            C8523d.a aVar2 = new C8523d.a(user.f56859id, mo53983O().pageId());
            aVar2.m47101o("p_profile,greet");
            C8523d.m47075a(mo53983O().act(), aVar2);
        } else {
            C8523d.a aVar3 = new C8523d.a(user.f56859id, mo53983O().pageId());
            aVar3.m47101o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar3.m47090d().channel = Channel.get(Channel.confession);
            C8523d.m47077c(mo53983O().act(), aVar3);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m99289L0(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            bnl0.m105524M(this.f72704N0.f94917v, false);
            return;
        }
        this.f72704N0.f94917v.m60822i0(false);
        bnl0.m105524M(this.f72704N0.f94917v, true);
        this.f72704N0.f94917v.m60824k0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m99290M0() {
        if (mo53983O().mo52302m0()) {
            bnl0.m105524M(this.f72704N0.f94880C, true);
            bnl0.m105525M0(this.f72708Y, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f142953M.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, adc0.f69996L4);
            this.f142953M.setLayoutParams(layoutParams);
            bnl0.m105524M(this.f142946F, false);
            bnl0.m105524M(this.f72704N0.f94921z, true);
            Settings settings = mo53983O().mo53478me().settings;
            IntlGender intlGender = settings == null ? null : settings.getSettingGroup().gender.newGender;
            Gender gender = mo53983O().mo53478me().gender;
            if (!NullChecker.m82486a(settings) || !uqb0.f180396b0.f170324a.mo29171rq(settings.getSettingGroup()) || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            this.f72704N0.f94921z.setBackgroundColor(m99299y0(intlGender));
            this.f72704N0.f94878A.setBackground(m99300z0(intlGender));
            this.f72704N0.f94879B.setText(mo53983O().mo53478me().age + "");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m99291N0(final User user) {
        boolean z = false;
        if ((!spl0.m187369U() && !s7a.m184990s() && !spl0.m187362N()) || bnl0.m105529O0(this.f72704N0.f94910o) || user == null || ((NullChecker.m82486a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) || user.isMe())) {
            bnl0.m105524M(this.f72704N0.f94911p, false);
            return;
        }
        Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(user.f56859id);
        if (m99282A0(conversationM34219zp) || (NullChecker.m82486a(conversationM34219zp) && conversationM34219zp.isQuickChatConv())) {
            bnl0.m105524M(this.f72704N0.f94911p, false);
            return;
        }
        bnl0.m105524M(this.f72704N0.f94911p, true);
        bnl0.m105524M(this.f72704N0.f94909n, false);
        bnl0.m105539W(this.f72704N0.f94898c, qa00.m175859d(80.0f));
        bnl0.m105539W(this.f72704N0.f94881D, qa00.m175859d(80.0f));
        if (!this.f72703M0) {
            this.f72703M0 = true;
            if (s7a.m184990s() || spl0.m187362N()) {
                i4g0.m138526x("e_sayhi_first", OMSDialogPositon.p_suggest_user_profile_info_view);
            } else {
                i4g0.m138526x("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view);
            }
        }
        if (!pzi0.m174438C(pzi0.m174454o(), CoreModule.f18264c.f20420r0.f20785x0.get().longValue())) {
            CoreModule.f18264c.f20420r0.f20785x0.put(Long.valueOf(pzi0.m174454o()));
            z = true;
        }
        if (!this.f72704N0.f94911p.isAnimating()) {
            SVGALoader.with(mo53983O().act()).from("https://auto.tancdn.com/v1/raw/aca16610-5843-4b4e-84bc-7fab29787e5e14.pdf").autoPlay(z).repeatCount(1).into(this.f72704N0.f94911p);
        }
        bnl0.m105509E0(this.f72704N0.f94911p, new View.OnClickListener() { // from class: l.qo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158714a.m99288K0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m99292O0(User user) {
        List<SettingGroups> list;
        if (vq8.m202358b()) {
            bnl0.m105524M(this.f72704N0.f94918w, false);
            bnl0.m105524M(this.f72704N0.f94910o, false);
            Settings settings = user.settings;
            if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null || user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
                return;
            }
            UserWealthGradeConfig userWealthGradeConfigMo68402Gj = CoreModule.m30934Q().mo68402Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
                return;
            }
            boolean z = userWealthGradeConfigMo68402Gj.openNewIcon;
            eo90 eo90Var = this.f72704N0;
            if (!z) {
                bnl0.m105524M(eo90Var.f94918w, true);
                uqb0.f180374G.m127117M0(this.f72704N0.f94918w, userWealthGradeConfigMo68402Gj.wealthIconUrl, new C15765a());
                return;
            }
            bnl0.m105524M(eo90Var.f94910o, true);
            bnl0.m105524M(this.f72704N0.f94909n, false);
            uqb0.f180374G.m127140Z0(this.f72704N0.f94910o, userWealthGradeConfigMo68402Gj.wealthIconUrl);
            bnl0.m105539W(this.f72704N0.f94898c, qa00.m175859d(80.0f));
            bnl0.m105539W(this.f72704N0.f94881D, qa00.m175859d(80.0f));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m99293P0(User user, VText vText) {
        String strM164103a0 = m164103a0(user);
        if (TextUtils.equals("p_tantanx_card", mo53983O().from()) && !TextUtils.isEmpty(strM164103a0)) {
            String[] strArrSplit = strM164103a0.split("·");
            if (strArrSplit.length > 0) {
                strM164103a0 = strArrSplit[0].trim();
            }
        }
        if (xra.m212796o() && y0a0.m213839b().m213840a(CoreModule.f18264c.f20381e0.m116600p9(), user)) {
            strM164103a0 = TextUtils.isEmpty(strM164103a0) ? y0a0.m213839b().m213841c(user) : String.format("%s · %s", strM164103a0, y0a0.m213839b().m213841c(user));
            vText.setMaxLines(2);
        } else {
            vText.setMaxLines(1);
        }
        if (NullChecker.m82487b(user.profile) && NullChecker.m82487b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (mo53983O().mo52258P1() && NullChecker.m82486a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM164103a0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM164103a0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM164103a0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM164103a0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM164103a0)) {
            m121845Q(vText, 8);
        } else {
            vText.setText(strM164103a0);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m99294d0(User user) {
        return Boolean.valueOf(mo53983O().mo52258P1() && !mo53983O().mo52302m0());
    }

    @Override // p153l.no90
    /* JADX INFO: renamed from: g0 */
    public void mo99295g0(boolean z) {
        mo53983O().mo52252K2();
        mo53983O().mo52258P1();
    }

    @Override // p153l.no90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        eo90 eo90Var = this.f72704N0;
        m121834E(eo90Var.f94882E, eo90Var.f94881D);
        if (User.isTeamAccount(mo53983O().userId())) {
            m121845Q(this.f72704N0.f94882E, 8);
        }
        if (CoreModule.m30932N().mo61478M8()) {
            m99268C0();
            m168321p().duringCreated(CoreModule.m30932N().mo61546jb()).subscribe(psd0.m173596G(new y20() { // from class: l.ro90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f164166a.m99269G0((Boolean) obj);
                }
            }));
            m168321p().duringCreated(CoreModule.m30932N().mo61535f9()).subscribe(psd0.m173596G(new y20() { // from class: l.so90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169860a.m99270H0((Boolean) obj);
                }
            }));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, qa00.m175859d(40.0f));
        layoutParams.addRule(8, adc0.f69931H7);
        layoutParams.addRule(11);
        layoutParams.setMargins(qa00.m175859d(10.0f), 0, 0, 0);
        this.f72707X.setLayoutParams(layoutParams);
        m168321p().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).filter(new qcj() { // from class: l.to90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175372a.m99294d0((User) obj);
            }
        }).map(new qcj() { // from class: l.uo90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.vo90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185017a.m164107h0(((Boolean) obj).booleanValue());
            }
        }));
        if (mo53983O().mo52302m0()) {
            this.f142964u.setBackground(CoreModule.f18263b.getResources().getDrawable(dbc0.f86775Yu));
            this.f142964u.setOnClickListener(new View.OnClickListener() { // from class: l.wo90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f190018a.m99271I0(view2);
                }
            });
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.no90, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.no90
    /* JADX INFO: renamed from: l0 */
    public void mo99296l0(User user) {
        m121845Q(this.f72704N0.f94919x, 8);
    }

    @Override // p153l.no90, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM112693b = cum.m112693b(mo53983O().act(), kec0.f126102v9, viewGroup, false);
        this.f72704N0.m121737a(viewM112693b);
        eo90 eo90Var = this.f72704N0;
        this.f142964u = eo90Var.f94896a;
        this.f142965v = eo90Var.f94897b;
        this.f142953M = eo90Var.f94881D;
        this.f72707X = eo90Var.f94909n;
        this.f142967x = eo90Var.f94901f;
        this.f142946F = eo90Var.f94904i;
        this.f142947G = eo90Var.f94920y;
        this.f142955O = eo90Var.f94883F;
        this.f142956P = eo90Var.f94884G;
        this.f142957Q = eo90Var.f94885H;
        this.f142968y = eo90Var.f94902g;
        this.f142969z = eo90Var.f94903h;
        this.f72708Y = eo90Var.f94912q;
        this.f72709Z = eo90Var.f94890M;
        this.f72710k0 = eo90Var.f94891N;
        this.f72711p0 = eo90Var.f94892O;
        this.f72695E0 = eo90Var.f94886I;
        this.f72696F0 = eo90Var.f94888K;
        this.f72697G0 = eo90Var.f94893P;
        this.f72698H0 = eo90Var.f94894Q;
        this.f72699I0 = eo90Var.f94895R;
        this.f72700J0 = eo90Var.f94889L;
        return viewM112693b;
    }

    @Override // p153l.no90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        eo90 eo90Var;
        eo90 eo90Var2;
        eo90 eo90Var3;
        final User userMo52252K2 = mo53983O().mo52252K2();
        if (userMo52252K2 == null) {
            return;
        }
        bnl0.m105524M(this.f72704N0.f94913r, false);
        this.f72704N0.f94901f.setText(userMo52252K2.name);
        this.f72704N0.f94901f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f72704N0.f94904i.setText(String.valueOf(userMo52252K2.age));
        bnl0.m105524M(this.f72704N0.f94904i, !userMo52252K2.isHideAgeFromSVipWithOutMe());
        m99293P0(userMo52252K2, this.f72704N0.f94882E);
        mo99295g0(mo53983O().mo52302m0());
        mo99296l0(userMo52252K2);
        bnl0.m105524M(this.f72704N0.f94914s, false);
        bnl0.m105524M(this.f72704N0.f94915t, false);
        if (CoreModule.f18276o.m132214d().mo34940ve(userMo52252K2)) {
            bnl0.m105548c0(this.f72704N0.f94916u, qa00.m175859d(4.0f));
            bnl0.m105524M(this.f72704N0.f94916u, true);
            this.f72704N0.f94916u.setImageDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86565Sc));
        } else if (d79.m114661T() && userMo52252K2.isSVIP()) {
            bnl0.m105548c0(this.f72704N0.f94916u, qa00.m175859d(4.0f));
            bnl0.m105524M(this.f72704N0.f94916u, true);
            this.f72704N0.f94916u.setBackgroundDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86533Rc));
        } else {
            boolean zIsVIP = userMo52252K2.isVIP();
            eo90 eo90Var4 = this.f72704N0;
            if (zIsVIP) {
                bnl0.m105548c0(eo90Var4.f94916u, qa00.m175859d(4.0f));
                bnl0.m105524M(this.f72704N0.f94916u, true);
                VipNewUtils.m58690d(mo53983O().act(), this.f72704N0.f94916u, "vip");
                this.f72704N0.f94916u.setBackgroundDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86597Tc));
            } else {
                bnl0.m105524M(eo90Var4.f94916u, false);
            }
        }
        if ((userMo52252K2.isSVIP() && userMo52252K2.isHideIconFromSVip()) || (userMo52252K2.isVIP() && userMo52252K2.gpHideVip())) {
            bnl0.m105524M(this.f72704N0.f94916u, false);
            bnl0.m105524M(this.f72704N0.f94915t, false);
        }
        boolean zIsPicVerificationVerified = userMo52252K2.isPicVerificationVerified();
        eo90 eo90Var5 = this.f72704N0;
        if (zIsPicVerificationVerified) {
            bnl0.m105524M(eo90Var5.f94907l, false);
            bnl0.m105524M(this.f72704N0.f94905j, true);
        } else {
            bnl0.m105524M(eo90Var5.f94907l, false);
            bnl0.m105524M(this.f72704N0.f94905j, false);
        }
        m99297w0(mo53983O().mo52252K2());
        if (userMo52252K2.isMe()) {
            if (userMo52252K2.isHideIconFromSVipWithMe() || userMo52252K2.gpHideVip()) {
                bnl0.m105524M(this.f72704N0.f94915t, false);
                bnl0.m105524M(this.f72704N0.f94916u, false);
            }
            if (userMo52252K2.isHideAgeFromSVip()) {
                bnl0.m105524M(this.f72704N0.f94904i, false);
            }
        }
        m99292O0(userMo52252K2);
        m99291N0(userMo52252K2);
        LinearLayout linearLayout = this.f72708Y;
        bnl0.m105524M(linearLayout, bnl0.m105531P0(linearLayout) > 0);
        m99290M0();
        m99289L0(userMo52252K2);
        int iM213127f = xu90.m213122d().m213127f(userMo52252K2);
        if (iM213127f == -1 || bnl0.m105529O0(this.f72704N0.f94905j)) {
            this.f72704N0.f94906k.setVisibility(8);
        } else {
            this.f72704N0.f94906k.setVisibility(0);
            xu90.m213122d().m213131j(iM213127f, this.f72704N0.f94906k, false);
        }
        if (xu90.m213122d().m213128g(userMo52252K2) && !bnl0.m105529O0(this.f72704N0.f94916u)) {
            bnl0.m105524M(this.f72704N0.f94916u, true);
            if (d79.m114661T() && userMo52252K2.isSVIP()) {
                this.f72704N0.f94916u.setBackgroundDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86533Rc));
            } else {
                VipNewUtils.m58690d(mo53983O().act(), this.f72704N0.f94916u, "vip");
                this.f72704N0.f94916u.setBackgroundDrawable(CoreModule.f18263b.getResources().getDrawable(dbc0.f86452Or));
            }
        }
        if (m121838I()) {
            int childCount = this.f72704N0.f94897b.getChildCount();
            int i = 0;
            while (true) {
                eo90Var = this.f72704N0;
                if (i >= childCount) {
                    break;
                }
                View childAt = eo90Var.f94897b.getChildAt(i);
                eo90 eo90Var6 = this.f72704N0;
                bnl0.m105524M(childAt, childAt == eo90Var6.f94898c || childAt == eo90Var6.f94881D);
                i++;
            }
            int childCount2 = eo90Var.f94900e.getChildCount();
            int i2 = 0;
            while (true) {
                eo90Var2 = this.f72704N0;
                if (i2 >= childCount2) {
                    break;
                }
                View childAt2 = eo90Var2.f94900e.getChildAt(i2);
                eo90 eo90Var7 = this.f72704N0;
                bnl0.m105524M(childAt2, childAt2 == eo90Var7.f94901f || childAt2 == eo90Var7.f94904i);
                i2++;
            }
            eo90Var2.f94901f.setText(userMo52252K2.publicId);
            this.f72704N0.f94904i.setText((userMo52252K2.isHideAgeFromSVip() || userMo52252K2.age.intValue() <= 0 || userMo52252K2.isHideAgeForTeamAccount()) ? "" : Integer.toString(userMo52252K2.age.intValue()));
            int childCount3 = this.f72704N0.f94881D.getChildCount();
            int i3 = 0;
            while (true) {
                eo90Var3 = this.f72704N0;
                if (i3 >= childCount3) {
                    break;
                }
                View childAt3 = eo90Var3.f94881D.getChildAt(i3);
                bnl0.m105524M(childAt3, childAt3 == this.f72704N0.f94882E);
                i3++;
            }
            eo90Var3.f94882E.setText(m121836G());
            bnl0.m105548c0(this.f142964u, qa00.m175859d(500.0f));
        } else {
            bnl0.m105548c0(this.f142964u, 0);
        }
        if (xra.m212796o() || !y0a0.m213839b().m213840a(CoreModule.f18264c.f20381e0.m116600p9(), userMo52252K2)) {
            bnl0.m105524M(this.f72695E0, false);
        } else {
            bnl0.m105524M(this.f72695E0, true);
            bnl0.m105515H0(this.f72696F0, y0a0.m213839b().m213841c(userMo52252K2));
            if (!this.f72701K0) {
                this.f72701K0 = true;
                i4g0.m138492A("e_like_person", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("receivedlikes", userMo52252K2.profile.receivedLikes));
            }
        }
        m99283B0();
        if (nrb0.m164466b()) {
            bnl0.m105524M(this.f72704N0.f94905j, false);
            bnl0.m105524M(this.f72704N0.f94906k, false);
            bnl0.m105524M(this.f72704N0.f94907l, false);
            bnl0.m105524M(this.f72704N0.f94919x, false);
            View viewM59330f = CertificationUtil.m59330f(mo53983O().act(), userMo52252K2, CertificationUtil.CertificationIconStyle.PROFILE);
            if (viewM59330f == null) {
                View viewFindViewById = this.f72708Y.findViewById(adc0.f70195X0);
                if (NullChecker.m82486a(viewFindViewById)) {
                    this.f72708Y.removeView(viewFindViewById);
                    return;
                }
                return;
            }
            bnl0.m105509E0(viewM59330f, new View.OnClickListener() { // from class: l.po90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f153381a.m99287J0(userMo52252K2, view);
                }
            });
            ((LinearLayout.LayoutParams) viewM59330f.getLayoutParams()).setMargins(0, 0, qa00.m175859d(5.0f), 0);
            if (this.f72708Y.findViewById(adc0.f70195X0) != null) {
                return;
            }
            this.f72708Y.addView(viewM59330f, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m99297w0(User user) {
        m99298x0();
        bnl0.m105548c0(this.f72704N0.f94897b, qa00.m175859d(this.f72706P0 ? 6.0f : 8.0f));
        if (user.isMe()) {
            t3m t3mVarMo53983O = mo53983O();
            eo90 eo90Var = this.f72704N0;
            t3mVarMo53983O.mo52243G(eo90Var.f94905j, eo90Var.f94907l);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m99298x0() {
        bnl0.m105548c0(this.f72704N0.f94897b, qa00.m175859d(0.0f));
        bnl0.m105550d0(this.f72704N0.f94897b, qa00.m175859d(20.0f));
    }

    /* JADX INFO: renamed from: y0 */
    public final int m99299y0(IntlGender intlGender) {
        int color = mo53983O().act().getColor(c9c0.f80321B);
        if (TEnum.equals(intlGender, "male")) {
            return mo53983O().act().getColor(c9c0.f80427j);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo53983O().act().getColor(c9c0.f80430k) : color;
    }

    /* JADX INFO: renamed from: z0 */
    public final Drawable m99300z0(IntlGender intlGender) {
        Drawable drawable = mo53983O().act().getDrawable(dbc0.f87191lm);
        if (TEnum.equals(intlGender, "male")) {
            return mo53983O().act().getDrawable(dbc0.f87125jm);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo53983O().act().getDrawable(dbc0.f87158km) : drawable;
    }

    @Override // p153l.ep90, p153l.on2
    /* JADX INFO: renamed from: r */
    public void mo54015r(View view) {
    }
}
