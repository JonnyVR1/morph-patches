package p149l;

import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.core.p053ui.settings.IntlPersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.IntlGender;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class wg90 extends jg90 {

    /* JADX INFO: renamed from: E0 */
    public VLinear f186155E0;

    /* JADX INFO: renamed from: F0 */
    public VText f186156F0;

    /* JADX INFO: renamed from: G0 */
    public VLinear f186157G0;

    /* JADX INFO: renamed from: H0 */
    public VDraweeView f186158H0;

    /* JADX INFO: renamed from: I0 */
    public VText f186159I0;

    /* JADX INFO: renamed from: J0 */
    public VLinear f186160J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f186161K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f186162L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f186163M0;

    /* JADX INFO: renamed from: N0 */
    public ag90 f186164N0;

    /* JADX INFO: renamed from: O0 */
    public BubbleInfo f186165O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f186166P0;

    /* JADX INFO: renamed from: X */
    public VText f186167X;

    /* JADX INFO: renamed from: Y */
    public LinearLayout f186168Y;

    /* JADX INFO: renamed from: Z */
    public VLinear f186169Z;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f186170k0;

    /* JADX INFO: renamed from: p0 */
    public VText f186171p0;

    /* JADX INFO: renamed from: l.wg90$a */
    public class C20871a extends ym2 {
        public C20871a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) wg90.this.f186164N0.f69339w.getLayoutParams();
            int i = t100.f167266o;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            wg90.this.f186164N0.f69339w.setLayoutParams(layoutParams);
        }
    }

    public wg90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f186161K0 = false;
        this.f186162L0 = false;
        this.f186163M0 = false;
        this.f186164N0 = new ag90();
    }

    /* JADX INFO: renamed from: C0 */
    private void m203001C0() {
        final User userMo51069K2;
        if (mo52800O().mo51119m0() || (userMo51069K2 = mo52800O().mo51069K2()) == null) {
            return;
        }
        m131821p().duringCreated(CoreModule.m29934N().mo60400vm(userMo51069K2.f56011id)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.tg90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170069a.m203017D0((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.ug90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176363a.m203018E0((Throwable) obj);
            }
        }));
        xdl0.m208329E0(this.f186169Z, new View.OnClickListener() { // from class: l.vg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181355a.m203019F0(userMo51069K2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m203002G0(Boolean bool) {
        m203001C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m203003H0(Boolean bool) {
        m203001C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m203004I0(View view) {
        mo52800O().startActivity(IntlPersonalDetailsAct.INSTANCE.m55003a(mo52800O().act(), "profile"));
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m203015A0(Conversation conversation) {
        ConversationStatus conversationStatus;
        return (conversation == null || (conversationStatus = conversation.status) == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m203016B0() {
        if (mo52800O().mo51069K2() == null || mo52800O().mo51119m0()) {
            return;
        }
        boolean z = false;
        xdl0.m208344M(this.f186157G0, false);
        VLinear vLinear = this.f186160J0;
        if (xdl0.m208349O0(this.f186169Z) && !m96413I()) {
            z = true;
        }
        xdl0.m208344M(vLinear, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m203017D0(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            xdl0.m208344M(this.f186169Z, false);
            xdl0.m208344M(this.f186160J0, xdl0.m208349O0(this.f186157G0) && !m96413I());
            return;
        }
        zvf0.m220368A("e_other_state", mo52800O().pageId(), vwb.m200311Y("state_id", bubbleInfo.f38730id), vwb.m200311Y("owner_id", bubbleInfo.owner.f38803id));
        this.f186165O0 = bubbleInfo;
        xdl0.m208344M(this.f186169Z, true);
        xdl0.m208344M(this.f186160J0, !m96413I());
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f186170k0;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167268q;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
        this.f186171p0.getPaint().setFakeBoldText(true);
        this.f186171p0.setText(bubbleInfo.emotion.text);
        this.f186166P0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m203018E0(Throwable th) {
        boolean z = false;
        xdl0.m208344M(this.f186169Z, false);
        VLinear vLinear = this.f186160J0;
        if (xdl0.m208349O0(this.f186157G0) && !m96413I()) {
            z = true;
        }
        xdl0.m208344M(vLinear, z);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m203019F0(User user, View view) {
        if (this.f186165O0 == null) {
            return;
        }
        zvf0.m220399u("e_other_state", mo52800O().pageId(), vwb.m200311Y("state_id", this.f186165O0.f38730id), vwb.m200311Y("owner_id", this.f186165O0.owner.f38803id));
        if (!this.f186165O0.checkStateTimeIsValid()) {
            lsi0.m151580j("状态已结束");
            return;
        }
        if (mo52800O().mo51075P1()) {
            CoreModule.m29934N().mo60270Dk(mo52800O().act(), mo52800O().userId(), this.f186165O0.f38730id, mo52800O().pageId());
            return;
        }
        if (m203015A0(CoreModule.f17545c.f19642f0.m33216zp(user.f56011id))) {
            FeedService feedServiceM29934N = CoreModule.m29934N();
            Act act = mo52800O().act();
            BubbleInfo bubbleInfo = this.f186165O0;
            feedServiceM29934N.mo60317Sg(act, bubbleInfo.f38730id, bubbleInfo.owner.f38803id, true, mo52800O().pageId());
            return;
        }
        CoreService coreServiceM29932K = CoreModule.m29932K();
        Act act2 = mo52800O().act();
        BubbleInfo bubbleInfo2 = this.f186165O0;
        coreServiceM29932K.mo30738Yn(act2, bubbleInfo2.owner.f38803id, bubbleInfo2.f38730id, OMSDialogPositon.p_suggest_user_profile_info_view, null, false, "");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m203020J0(User user, View view) {
        CertificationUtil.m58151j(mo52800O().act(), user);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m203021K0(User user, View view) {
        if (g6a.m124570s() || ogl0.m164235N()) {
            zvf0.m220396r("e_sayhi_first", OMSDialogPositon.p_suggest_user_profile_info_view);
        } else {
            zvf0.m220396r("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view);
        }
        if (mo52800O().mo52136O1()) {
            mo52800O().mo51113j3(153);
            return;
        }
        if (ogl0.m164235N()) {
            C8360d.a aVar = new C8360d.a(user.f56011id, mo52800O().pageId());
            aVar.m45918o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar.m45907d().channel = Channel.get(Channel.confession);
            de80.INSTANCE.m111180b(mo52800O().act(), aVar);
            return;
        }
        if (!g6a.m124570s()) {
            C8360d.a aVar2 = new C8360d.a(user.f56011id, mo52800O().pageId());
            aVar2.m45918o("p_profile,greet");
            C8360d.m45892a(mo52800O().act(), aVar2);
        } else {
            C8360d.a aVar3 = new C8360d.a(user.f56011id, mo52800O().pageId());
            aVar3.m45918o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar3.m45907d().channel = Channel.get(Channel.confession);
            C8360d.m45894c(mo52800O().act(), aVar3);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m203022L0(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.m208344M(this.f186164N0.f69338v, false);
            return;
        }
        this.f186164N0.f69338v.m59638i0(false);
        xdl0.m208344M(this.f186164N0.f69338v, true);
        this.f186164N0.f69338v.m59640k0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m203023M0() {
        if (mo52800O().mo51119m0()) {
            xdl0.m208344M(this.f186164N0.f69301C, true);
            xdl0.m208345M0(this.f186168Y, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f117746M.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, u4c0.f173874J4);
            this.f117746M.setLayoutParams(layoutParams);
            xdl0.m208344M(this.f117739F, false);
            xdl0.m208344M(this.f186164N0.f69342z, true);
            Settings settings = mo52800O().mo52295me().settings;
            IntlGender intlGender = settings == null ? null : settings.getSettingGroup().gender.newGender;
            Gender gender = mo52800O().mo52295me().gender;
            if (!NullChecker.m81303a(settings) || !qib0.f154713b0.f139230a.mo28172rq(settings.getSettingGroup()) || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            this.f186164N0.f69342z.setBackgroundColor(m203030y0(intlGender));
            this.f186164N0.f69299A.setBackground(m203031z0(intlGender));
            this.f186164N0.f69300B.setText(mo52800O().mo52295me().age + "");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m203024N0(final User user) {
        boolean z = false;
        if ((!ogl0.m164242U() && !g6a.m124570s() && !ogl0.m164235N()) || xdl0.m208349O0(this.f186164N0.f69331o) || user == null || ((NullChecker.m81303a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) || user.isMe())) {
            xdl0.m208344M(this.f186164N0.f69332p, false);
            return;
        }
        Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(user.f56011id);
        if (m203015A0(conversationM33216zp) || (NullChecker.m81303a(conversationM33216zp) && conversationM33216zp.isQuickChatConv())) {
            xdl0.m208344M(this.f186164N0.f69332p, false);
            return;
        }
        xdl0.m208344M(this.f186164N0.f69332p, true);
        xdl0.m208344M(this.f186164N0.f69330n, false);
        xdl0.m208359W(this.f186164N0.f69319c, t100.m186890d(80.0f));
        xdl0.m208359W(this.f186164N0.f69302D, t100.m186890d(80.0f));
        if (!this.f186163M0) {
            this.f186163M0 = true;
            if (g6a.m124570s() || ogl0.m164235N()) {
                zvf0.m220402x("e_sayhi_first", OMSDialogPositon.p_suggest_user_profile_info_view);
            } else {
                zvf0.m220402x("e_send_message", OMSDialogPositon.p_suggest_user_profile_info_view);
            }
        }
        if (!mqi0.m155928C(mqi0.m155944o(), CoreModule.f17545c.f19678r0.f20043x0.get().longValue())) {
            CoreModule.f17545c.f19678r0.f20043x0.put(Long.valueOf(mqi0.m155944o()));
            z = true;
        }
        if (!this.f186164N0.f69332p.isAnimating()) {
            SVGALoader.with(mo52800O().act()).from("https://auto.tancdn.com/v1/raw/aca16610-5843-4b4e-84bc-7fab29787e5e14.pdf").autoPlay(z).repeatCount(1).into(this.f186164N0.f69332p);
        }
        xdl0.m208329E0(this.f186164N0.f69332p, new View.OnClickListener() { // from class: l.mg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133662a.m203021K0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m203025O0(User user) {
        List<SettingGroups> list;
        if (qp8.m175817b()) {
            xdl0.m208344M(this.f186164N0.f69339w, false);
            xdl0.m208344M(this.f186164N0.f69331o, false);
            Settings settings = user.settings;
            if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || user.settings.settingGroups.get(0).live == null || user.settings.settingGroups.get(0).live.hideProfileWealthTag.booleanValue()) {
                return;
            }
            UserWealthGradeConfig userWealthGradeConfigMo67219Gj = CoreModule.m29936Q().mo67219Gj(user.settings.settingGroups.get(0).live.wealthGrade, false);
            if (TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
                return;
            }
            boolean z = userWealthGradeConfigMo67219Gj.openNewIcon;
            ag90 ag90Var = this.f186164N0;
            if (!z) {
                xdl0.m208344M(ag90Var.f69339w, true);
                qib0.f154691G.m102333M0(this.f186164N0.f69339w, userWealthGradeConfigMo67219Gj.wealthIconUrl, new C20871a());
                return;
            }
            xdl0.m208344M(ag90Var.f69331o, true);
            xdl0.m208344M(this.f186164N0.f69330n, false);
            qib0.f154691G.m102356Z0(this.f186164N0.f69331o, userWealthGradeConfigMo67219Gj.wealthIconUrl);
            xdl0.m208359W(this.f186164N0.f69319c, t100.m186890d(80.0f));
            xdl0.m208359W(this.f186164N0.f69302D, t100.m186890d(80.0f));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m203026P0(User user, VText vText) {
        String strM141270a0 = m141270a0(user);
        if (TextUtils.equals("p_tantanx_card", mo52800O().from()) && !TextUtils.isEmpty(strM141270a0)) {
            String[] strArrSplit = strM141270a0.split("·");
            if (strArrSplit.length > 0) {
                strM141270a0 = strArrSplit[0].trim();
            }
        }
        if (lqa.m150977o() && us90.m195178b().m195179a(CoreModule.f17545c.f19639e0.m169527p9(), user)) {
            strM141270a0 = TextUtils.isEmpty(strM141270a0) ? us90.m195178b().m195180c(user) : String.format("%s · %s", strM141270a0, us90.m195178b().m195180c(user));
            vText.setMaxLines(2);
        } else {
            vText.setMaxLines(1);
        }
        if (NullChecker.m81304b(user.profile) && NullChecker.m81304b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (mo52800O().mo51075P1() && NullChecker.m81303a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM141270a0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM141270a0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM141270a0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM141270a0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM141270a0)) {
            m96420Q(vText, 8);
        } else {
            vText.setText(strM141270a0);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m203027d0(User user) {
        return Boolean.valueOf(mo52800O().mo51075P1() && !mo52800O().mo51119m0());
    }

    @Override // p149l.jg90
    /* JADX INFO: renamed from: g0 */
    public void mo141274g0(boolean z) {
        mo52800O().mo51069K2();
        mo52800O().mo51075P1();
    }

    @Override // p149l.jg90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        ag90 ag90Var = this.f186164N0;
        m96409E(ag90Var.f69303E, ag90Var.f69302D);
        if (User.isTeamAccount(mo52800O().userId())) {
            m96420Q(this.f186164N0.f69303E, 8);
        }
        if (CoreModule.m29934N().mo60294M8()) {
            m203001C0();
            m131821p().duringCreated(CoreModule.m29934N().mo60362jb()).subscribe(mkd0.m154955G(new e30() { // from class: l.ng90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138849a.m203002G0((Boolean) obj);
                }
            }));
            m131821p().duringCreated(CoreModule.m29934N().mo60351f9()).subscribe(mkd0.m154955G(new e30() { // from class: l.og90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143830a.m203003H0((Boolean) obj);
                }
            }));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, t100.m186890d(40.0f));
        layoutParams.addRule(8, u4c0.f173809F7);
        layoutParams.addRule(11);
        layoutParams.setMargins(t100.m186890d(10.0f), 0, 0, 0);
        this.f186167X.setLayoutParams(layoutParams);
        m131821p().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).filter(new w9j() { // from class: l.pg90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148628a.m203027d0((User) obj);
            }
        }).map(new w9j() { // from class: l.qg90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.rg90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159232a.m141275h0(((Boolean) obj).booleanValue());
            }
        }));
        if (mo52800O().mo51119m0()) {
            this.f117757u.setBackground(CoreModule.f17544b.getResources().getDrawable(x2c0.f190313ku));
            this.f117757u.setOnClickListener(new View.OnClickListener() { // from class: l.sg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f164377a.m203004I0(view2);
                }
            });
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.jg90, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.jg90
    /* JADX INFO: renamed from: l0 */
    public void mo141279l0(User user) {
        m96420Q(this.f186164N0.f69340x, 8);
    }

    @Override // p149l.jg90, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM98600b = asm.m98600b(mo52800O().act(), f6c0.f95929o9, viewGroup, false);
        this.f186164N0.m96294a(viewM98600b);
        ag90 ag90Var = this.f186164N0;
        this.f117757u = ag90Var.f69317a;
        this.f117758v = ag90Var.f69318b;
        this.f117746M = ag90Var.f69302D;
        this.f186167X = ag90Var.f69330n;
        this.f117760x = ag90Var.f69322f;
        this.f117739F = ag90Var.f69325i;
        this.f117740G = ag90Var.f69341y;
        this.f117748O = ag90Var.f69304F;
        this.f117749P = ag90Var.f69305G;
        this.f117750Q = ag90Var.f69306H;
        this.f117761y = ag90Var.f69323g;
        this.f117762z = ag90Var.f69324h;
        this.f186168Y = ag90Var.f69333q;
        this.f186169Z = ag90Var.f69311M;
        this.f186170k0 = ag90Var.f69312N;
        this.f186171p0 = ag90Var.f69313O;
        this.f186155E0 = ag90Var.f69307I;
        this.f186156F0 = ag90Var.f69309K;
        this.f186157G0 = ag90Var.f69314P;
        this.f186158H0 = ag90Var.f69315Q;
        this.f186159I0 = ag90Var.f69316R;
        this.f186160J0 = ag90Var.f69310L;
        return viewM98600b;
    }

    @Override // p149l.jg90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        ag90 ag90Var;
        ag90 ag90Var2;
        ag90 ag90Var3;
        final User userMo51069K2 = mo52800O().mo51069K2();
        if (userMo51069K2 == null) {
            return;
        }
        xdl0.m208344M(this.f186164N0.f69334r, false);
        this.f186164N0.f69322f.setText(userMo51069K2.name);
        this.f186164N0.f69322f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f186164N0.f69325i.setText(String.valueOf(userMo51069K2.age));
        xdl0.m208344M(this.f186164N0.f69325i, !userMo51069K2.isHideAgeFromSVipWithOutMe());
        m203026P0(userMo51069K2, this.f186164N0.f69303E);
        mo141274g0(mo52800O().mo51119m0());
        mo141279l0(userMo51069K2);
        xdl0.m208344M(this.f186164N0.f69335s, false);
        xdl0.m208344M(this.f186164N0.f69336t, false);
        if (CoreModule.f17557o.m195057d().mo33937ve(userMo51069K2)) {
            xdl0.m208368c0(this.f186164N0.f69337u, t100.m186890d(4.0f));
            xdl0.m208344M(this.f186164N0.f69337u, true);
            this.f186164N0.f69337u.setImageDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189699Rc));
        } else if (u59.m191810S() && userMo51069K2.isSVIP()) {
            xdl0.m208368c0(this.f186164N0.f69337u, t100.m186890d(4.0f));
            xdl0.m208344M(this.f186164N0.f69337u, true);
            this.f186164N0.f69337u.setBackgroundDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189668Qc));
        } else {
            boolean zIsVIP = userMo51069K2.isVIP();
            ag90 ag90Var4 = this.f186164N0;
            if (zIsVIP) {
                xdl0.m208368c0(ag90Var4.f69337u, t100.m186890d(4.0f));
                xdl0.m208344M(this.f186164N0.f69337u, true);
                VipNewUtils.m57507d(mo52800O().act(), this.f186164N0.f69337u, "vip");
                this.f186164N0.f69337u.setBackgroundDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189730Sc));
            } else {
                xdl0.m208344M(ag90Var4.f69337u, false);
            }
        }
        if ((userMo51069K2.isSVIP() && userMo51069K2.isHideIconFromSVip()) || (userMo51069K2.isVIP() && userMo51069K2.gpHideVip())) {
            xdl0.m208344M(this.f186164N0.f69337u, false);
            xdl0.m208344M(this.f186164N0.f69336t, false);
        }
        boolean zIsPicVerificationVerified = userMo51069K2.isPicVerificationVerified();
        ag90 ag90Var5 = this.f186164N0;
        if (zIsPicVerificationVerified) {
            xdl0.m208344M(ag90Var5.f69328l, false);
            xdl0.m208344M(this.f186164N0.f69326j, true);
        } else {
            xdl0.m208344M(ag90Var5.f69328l, false);
            xdl0.m208344M(this.f186164N0.f69326j, false);
        }
        m203028w0(mo52800O().mo51069K2());
        if (userMo51069K2.isMe()) {
            if (userMo51069K2.isHideIconFromSVipWithMe() || userMo51069K2.gpHideVip()) {
                xdl0.m208344M(this.f186164N0.f69336t, false);
                xdl0.m208344M(this.f186164N0.f69337u, false);
            }
            if (userMo51069K2.isHideAgeFromSVip()) {
                xdl0.m208344M(this.f186164N0.f69325i, false);
            }
        }
        m203025O0(userMo51069K2);
        m203024N0(userMo51069K2);
        LinearLayout linearLayout = this.f186168Y;
        xdl0.m208344M(linearLayout, xdl0.m208351P0(linearLayout) > 0);
        m203023M0();
        m203022L0(userMo51069K2);
        int iM189648f = tm90.m189643d().m189648f(userMo51069K2);
        if (iM189648f == -1 || xdl0.m208349O0(this.f186164N0.f69326j)) {
            this.f186164N0.f69327k.setVisibility(8);
        } else {
            this.f186164N0.f69327k.setVisibility(0);
            tm90.m189643d().m189652j(iM189648f, this.f186164N0.f69327k, false);
        }
        if (tm90.m189643d().m189649g(userMo51069K2) && !xdl0.m208349O0(this.f186164N0.f69337u)) {
            xdl0.m208344M(this.f186164N0.f69337u, true);
            if (u59.m191810S() && userMo51069K2.isSVIP()) {
                this.f186164N0.f69337u.setBackgroundDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189668Qc));
            } else {
                VipNewUtils.m57507d(mo52800O().act(), this.f186164N0.f69337u, "vip");
                this.f186164N0.f69337u.setBackgroundDrawable(CoreModule.f17544b.getResources().getDrawable(x2c0.f189993ar));
            }
        }
        if (m96413I()) {
            int childCount = this.f186164N0.f69318b.getChildCount();
            int i = 0;
            while (true) {
                ag90Var = this.f186164N0;
                if (i >= childCount) {
                    break;
                }
                View childAt = ag90Var.f69318b.getChildAt(i);
                ag90 ag90Var6 = this.f186164N0;
                xdl0.m208344M(childAt, childAt == ag90Var6.f69319c || childAt == ag90Var6.f69302D);
                i++;
            }
            int childCount2 = ag90Var.f69321e.getChildCount();
            int i2 = 0;
            while (true) {
                ag90Var2 = this.f186164N0;
                if (i2 >= childCount2) {
                    break;
                }
                View childAt2 = ag90Var2.f69321e.getChildAt(i2);
                ag90 ag90Var7 = this.f186164N0;
                xdl0.m208344M(childAt2, childAt2 == ag90Var7.f69322f || childAt2 == ag90Var7.f69325i);
                i2++;
            }
            ag90Var2.f69322f.setText(userMo51069K2.publicId);
            this.f186164N0.f69325i.setText((userMo51069K2.isHideAgeFromSVip() || userMo51069K2.age.intValue() <= 0 || userMo51069K2.isHideAgeForTeamAccount()) ? "" : Integer.toString(userMo51069K2.age.intValue()));
            int childCount3 = this.f186164N0.f69302D.getChildCount();
            int i3 = 0;
            while (true) {
                ag90Var3 = this.f186164N0;
                if (i3 >= childCount3) {
                    break;
                }
                View childAt3 = ag90Var3.f69302D.getChildAt(i3);
                xdl0.m208344M(childAt3, childAt3 == this.f186164N0.f69303E);
                i3++;
            }
            ag90Var3.f69303E.setText(m96411G());
            xdl0.m208368c0(this.f117757u, t100.m186890d(500.0f));
        } else {
            xdl0.m208368c0(this.f117757u, 0);
        }
        if (lqa.m150977o() || !us90.m195178b().m195179a(CoreModule.f17545c.f19639e0.m169527p9(), userMo51069K2)) {
            xdl0.m208344M(this.f186155E0, false);
        } else {
            xdl0.m208344M(this.f186155E0, true);
            xdl0.m208335H0(this.f186156F0, us90.m195178b().m195180c(userMo51069K2));
            if (!this.f186161K0) {
                this.f186161K0 = true;
                zvf0.m220368A("e_like_person", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("receivedlikes", userMo51069K2.profile.receivedLikes));
            }
        }
        m203016B0();
        if (jjb0.m141784b()) {
            xdl0.m208344M(this.f186164N0.f69326j, false);
            xdl0.m208344M(this.f186164N0.f69327k, false);
            xdl0.m208344M(this.f186164N0.f69328l, false);
            xdl0.m208344M(this.f186164N0.f69340x, false);
            View viewM58147f = CertificationUtil.m58147f(mo52800O().act(), userMo51069K2, CertificationUtil.CertificationIconStyle.PROFILE);
            if (viewM58147f == null) {
                View viewFindViewById = this.f186168Y.findViewById(u4c0.f174104X0);
                if (NullChecker.m81303a(viewFindViewById)) {
                    this.f186168Y.removeView(viewFindViewById);
                    return;
                }
                return;
            }
            xdl0.m208329E0(viewM58147f, new View.OnClickListener() { // from class: l.lg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127965a.m203020J0(userMo51069K2, view);
                }
            });
            ((LinearLayout.LayoutParams) viewM58147f.getLayoutParams()).setMargins(0, 0, t100.m186890d(5.0f), 0);
            if (this.f186168Y.findViewById(u4c0.f174104X0) != null) {
                return;
            }
            this.f186168Y.addView(viewM58147f, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m203028w0(User user) {
        m203029x0();
        xdl0.m208368c0(this.f186164N0.f69318b, t100.m186890d(this.f186166P0 ? 6.0f : 8.0f));
        if (user.isMe()) {
            a1m a1mVarMo52800O = mo52800O();
            ag90 ag90Var = this.f186164N0;
            a1mVarMo52800O.mo51060G(ag90Var.f69326j, ag90Var.f69328l);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m203029x0() {
        xdl0.m208368c0(this.f186164N0.f69318b, t100.m186890d(0.0f));
        xdl0.m208370d0(this.f186164N0.f69318b, t100.m186890d(20.0f));
    }

    /* JADX INFO: renamed from: y0 */
    public final int m203030y0(IntlGender intlGender) {
        int color = mo52800O().act().getColor(w0c0.f183752B);
        if (TEnum.equals(intlGender, "male")) {
            return mo52800O().act().getColor(w0c0.f183857j);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo52800O().act().getColor(w0c0.f183860k) : color;
    }

    /* JADX INFO: renamed from: z0 */
    public final Drawable m203031z0(IntlGender intlGender) {
        Drawable drawable = mo52800O().act().getDrawable(x2c0.f190720xl);
        if (TEnum.equals(intlGender, "male")) {
            return mo52800O().act().getDrawable(x2c0.f190656vl);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo52800O().act().getDrawable(x2c0.f190688wl) : drawable;
    }

    @Override // p149l.ah90, p149l.hn2
    /* JADX INFO: renamed from: r */
    public void mo52832r(View view) {
    }
}
