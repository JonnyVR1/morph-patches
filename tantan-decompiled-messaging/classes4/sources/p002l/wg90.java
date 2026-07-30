package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.core.ui.settings.IntlPersonalDetailsAct;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.CoreService;
import com.p1.mobile.putong.data.BubbleInfo;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.ConversationStatus;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.IntlGender;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.asm;
import l.bkb0;
import l.e30;
import l.f6c0;
import l.g6a;
import l.j760;
import l.jjb0;
import l.lqa;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.ngm;
import l.ogl0;
import l.qib0;
import l.qp8;
import l.t100;
import l.u4c0;
import l.u59;
import l.us90;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.ym2;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wg90 extends jg90 {

    /* JADX INFO: renamed from: E0 */
    public VLinear f21727E0;

    /* JADX INFO: renamed from: F0 */
    public VText f21728F0;

    /* JADX INFO: renamed from: G0 */
    public VLinear f21729G0;

    /* JADX INFO: renamed from: H0 */
    public VDraweeView f21730H0;

    /* JADX INFO: renamed from: I0 */
    public VText f21731I0;

    /* JADX INFO: renamed from: J0 */
    public VLinear f21732J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f21733K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f21734L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f21735M0;

    /* JADX INFO: renamed from: N0 */
    public ag90 f21736N0;

    /* JADX INFO: renamed from: O0 */
    public BubbleInfo f21737O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f21738P0;

    /* JADX INFO: renamed from: X */
    public VText f21739X;

    /* JADX INFO: renamed from: Y */
    public LinearLayout f21740Y;

    /* JADX INFO: renamed from: Z */
    public VLinear f21741Z;

    /* JADX INFO: renamed from: k0 */
    public VDraweeView f21742k0;

    /* JADX INFO: renamed from: p0 */
    public VText f21743p0;

    /* JADX INFO: renamed from: l.wg90$a */
    public class C0882a extends ym2 {
        public C0882a() {
        }

        /* JADX INFO: renamed from: h */
        public void m24594h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) wg90.this.f21736N0.f7584w.getLayoutParams();
            int i = t100.o;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            wg90.this.f21736N0.f7584w.setLayoutParams(layoutParams);
        }
    }

    public wg90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f21733K0 = false;
        this.f21734L0 = false;
        this.f21735M0 = false;
        this.f21736N0 = new ag90();
    }

    /* JADX INFO: renamed from: C0 */
    private void m24563C0() {
        final User userMo1517K2;
        if (mo3351O().mo1570m0() || (userMo1517K2 = mo3351O().mo1517K2()) == null) {
            return;
        }
        m14461p().duringCreated(CoreModule.N().vm(((DbObject) userMo1517K2).id)).take(1).subscribe(mkd0.H(new e30() { // from class: l.tg90
            public final void call(Object obj) {
                this.f20225a.m24579D0((BubbleInfo) obj);
            }
        }, new e30() { // from class: l.ug90
            public final void call(Object obj) {
                this.f20629a.m24580E0((Throwable) obj);
            }
        }));
        xdl0.E0(this.f21741Z, new View.OnClickListener() { // from class: l.vg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21116a.m24581F0(userMo1517K2, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m24564G0(Boolean bool) {
        m24563C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public /* synthetic */ void m24565H0(Boolean bool) {
        m24563C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public /* synthetic */ void m24566I0(View view) {
        mo3351O().startActivity(IntlPersonalDetailsAct.Companion.a(mo3351O().act(), "profile"));
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m24577A0(Conversation conversation) {
        ConversationStatus conversationStatus;
        return (conversation == null || (conversationStatus = conversation.status) == null || TEnum.equals(conversationStatus, "dismissed") || TEnum.equals(conversation.status, "deleted") || TEnum.equals(conversation.status, "blocked")) ? false : true;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m24578B0() {
        if (mo3351O().mo1517K2() == null || mo3351O().mo1570m0()) {
            return;
        }
        boolean z = false;
        xdl0.M(this.f21729G0, false);
        VLinear vLinear = this.f21732J0;
        if (xdl0.O0(this.f21741Z) && !m9644I()) {
            z = true;
        }
        xdl0.M(vLinear, z);
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m24579D0(BubbleInfo bubbleInfo) {
        if (bubbleInfo == null) {
            xdl0.M(this.f21741Z, false);
            xdl0.M(this.f21732J0, xdl0.O0(this.f21729G0) && !m9644I());
            return;
        }
        zvf0.A("e_other_state", mo3351O().pageId(), new j760[]{vwb.Y("state_id", bubbleInfo.id), vwb.Y("owner_id", bubbleInfo.owner.id)});
        this.f21737O0 = bubbleInfo;
        xdl0.M(this.f21741Z, true);
        xdl0.M(this.f21732J0, !m9644I());
        bkb0 bkb0Var = qib0.G;
        VDraweeView vDraweeView = this.f21742k0;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.q;
        bkb0Var.I0(vDraweeView, str, i, i);
        this.f21743p0.getPaint().setFakeBoldText(true);
        this.f21743p0.setText(bubbleInfo.emotion.text);
        this.f21738P0 = true;
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m24580E0(Throwable th) {
        boolean z = false;
        xdl0.M(this.f21741Z, false);
        VLinear vLinear = this.f21732J0;
        if (xdl0.O0(this.f21729G0) && !m9644I()) {
            z = true;
        }
        xdl0.M(vLinear, z);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m24581F0(User user, View view) {
        if (this.f21737O0 == null) {
            return;
        }
        zvf0.u("e_other_state", mo3351O().pageId(), new j760[]{vwb.Y("state_id", this.f21737O0.id), vwb.Y("owner_id", this.f21737O0.owner.id)});
        if (!this.f21737O0.checkStateTimeIsValid()) {
            lsi0.j("状态已结束");
            return;
        }
        if (mo3351O().mo1523P1()) {
            CoreModule.N().Dk(mo3351O().act(), mo3351O().userId(), this.f21737O0.id, mo3351O().pageId());
            return;
        }
        if (m24577A0(CoreModule.c.f0.zp(((DbObject) user).id))) {
            FeedService feedServiceN = CoreModule.N();
            Act act = mo3351O().act();
            BubbleInfo bubbleInfo = this.f21737O0;
            feedServiceN.Sg(act, bubbleInfo.id, bubbleInfo.owner.id, true, mo3351O().pageId());
            return;
        }
        CoreService coreServiceK = CoreModule.K();
        Act act2 = mo3351O().act();
        BubbleInfo bubbleInfo2 = this.f21737O0;
        coreServiceK.Yn(act2, bubbleInfo2.owner.id, bubbleInfo2.id, "p_suggest_user_profile_info_view", (String) null, false, "");
    }

    /* JADX INFO: renamed from: J0 */
    public final /* synthetic */ void m24582J0(User user, View view) {
        CertificationUtil.j(mo3351O().act(), user);
    }

    /* JADX INFO: renamed from: K0 */
    public final /* synthetic */ void m24583K0(User user, View view) {
        if (g6a.s() || ogl0.N()) {
            zvf0.r("e_sayhi_first", "p_suggest_user_profile_info_view");
        } else {
            zvf0.r("e_send_message", "p_suggest_user_profile_info_view");
        }
        if (mo3351O().mo2665O1()) {
            mo3351O().mo1564j3(153);
            return;
        }
        if (ogl0.N()) {
            d.a aVar = new d.a(((DbObject) user).id, mo3351O().pageId());
            aVar.o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar.d().channel = Channel.get("confession");
            de80.INSTANCE.m11769b(mo3351O().act(), aVar);
            return;
        }
        if (!g6a.s()) {
            d.a aVar2 = new d.a(((DbObject) user).id, mo3351O().pageId());
            aVar2.o("p_profile,greet");
            d.a(mo3351O().act(), aVar2);
        } else {
            d.a aVar3 = new d.a(((DbObject) user).id, mo3351O().pageId());
            aVar3.o("p_suggest_user_profile_info_view,e_sayhi_first,click");
            aVar3.d().channel = Channel.get("confession");
            d.c(mo3351O().act(), aVar3);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m24584L0(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.M(this.f21736N0.f7583v, false);
            return;
        }
        this.f21736N0.f7583v.i0(false);
        xdl0.M(this.f21736N0.f7583v, true);
        this.f21736N0.f7583v.k0();
    }

    /* JADX INFO: renamed from: M0 */
    public final void m24585M0() {
        if (mo3351O().mo1570m0()) {
            xdl0.M(this.f21736N0.f7546C, true);
            xdl0.M0(this.f21740Y, false);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13743M.getLayoutParams();
            layoutParams.removeRule(3);
            layoutParams.addRule(3, u4c0.J4);
            this.f13743M.setLayoutParams(layoutParams);
            xdl0.M(this.f13736F, false);
            xdl0.M(this.f21736N0.f7587z, true);
            Settings settings = mo3351O().mo2827me().settings;
            IntlGender intlGender = settings == null ? null : settings.getSettingGroup().gender.newGender;
            Gender gender = mo3351O().mo2827me().gender;
            if (!NullChecker.a(settings) || !qib0.b0.a.rq(settings.getSettingGroup()) || intlGender == null) {
                intlGender = IntlGender.get(gender.toString());
            }
            this.f21736N0.f7587z.setBackgroundColor(m24592y0(intlGender));
            this.f21736N0.f7544A.setBackground(m24593z0(intlGender));
            this.f21736N0.f7545B.setText(mo3351O().mo2827me().age + "");
        }
    }

    /* JADX INFO: renamed from: N0 */
    public final void m24586N0(final User user) {
        boolean z = false;
        if ((!ogl0.U() && !g6a.s() && !ogl0.N()) || xdl0.O0(this.f21736N0.f7576o) || user == null || ((NullChecker.a(user.localRelationship) && TEnum.equals(user.localRelationship.state, "matched")) || user.isMe())) {
            xdl0.M(this.f21736N0.f7577p, false);
            return;
        }
        Conversation conversationZp = CoreModule.c.f0.zp(((DbObject) user).id);
        if (m24577A0(conversationZp) || (NullChecker.a(conversationZp) && conversationZp.isQuickChatConv())) {
            xdl0.M(this.f21736N0.f7577p, false);
            return;
        }
        xdl0.M(this.f21736N0.f7577p, true);
        xdl0.M(this.f21736N0.f7575n, false);
        xdl0.W(this.f21736N0.f7564c, t100.d(80.0f));
        xdl0.W(this.f21736N0.f7547D, t100.d(80.0f));
        if (!this.f21735M0) {
            this.f21735M0 = true;
            if (g6a.s() || ogl0.N()) {
                zvf0.x("e_sayhi_first", "p_suggest_user_profile_info_view");
            } else {
                zvf0.x("e_send_message", "p_suggest_user_profile_info_view");
            }
        }
        if (!mqi0.C(mqi0.o(), ((Long) CoreModule.c.r0.x0.get()).longValue())) {
            CoreModule.c.r0.x0.put(Long.valueOf(mqi0.o()));
            z = true;
        }
        if (!this.f21736N0.f7577p.isAnimating()) {
            SVGALoader.with(mo3351O().act()).from("https://auto.tancdn.com/v1/raw/aca16610-5843-4b4e-84bc-7fab29787e5e14.pdf").autoPlay(z).repeatCount(1).into(this.f21736N0.f7577p);
        }
        xdl0.E0(this.f21736N0.f7577p, new View.OnClickListener() { // from class: l.mg90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15377a.m24583K0(user, view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m24587O0(User user) {
        List list;
        if (qp8.b()) {
            xdl0.M(this.f21736N0.f7584w, false);
            xdl0.M(this.f21736N0.f7576o, false);
            Settings settings = user.settings;
            if (settings == null || (list = settings.settingGroups) == null || list.isEmpty() || user.settings.settingGroups.get(0) == null || ((SettingGroups) user.settings.settingGroups.get(0)).live == null || ((SettingGroups) user.settings.settingGroups.get(0)).live.hideProfileWealthTag.booleanValue()) {
                return;
            }
            UserWealthGradeConfig userWealthGradeConfigGj = CoreModule.Q().Gj(((SettingGroups) user.settings.settingGroups.get(0)).live.wealthGrade, false);
            if (TextUtils.isEmpty(userWealthGradeConfigGj.wealthIconUrl)) {
                return;
            }
            boolean z = userWealthGradeConfigGj.openNewIcon;
            ag90 ag90Var = this.f21736N0;
            if (!z) {
                xdl0.M(ag90Var.f7584w, true);
                qib0.G.M0(this.f21736N0.f7584w, userWealthGradeConfigGj.wealthIconUrl, new C0882a());
                return;
            }
            xdl0.M(ag90Var.f7576o, true);
            xdl0.M(this.f21736N0.f7575n, false);
            qib0.G.Z0(this.f21736N0.f7576o, userWealthGradeConfigGj.wealthIconUrl);
            xdl0.W(this.f21736N0.f7564c, t100.d(80.0f));
            xdl0.W(this.f21736N0.f7547D, t100.d(80.0f));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m24588P0(User user, VText vText) {
        String strM15892a0 = m15892a0(user);
        if (TextUtils.equals("p_tantanx_card", mo3351O().from()) && !TextUtils.isEmpty(strM15892a0)) {
            String[] strArrSplit = strM15892a0.split("·");
            if (strArrSplit.length > 0) {
                strM15892a0 = strArrSplit[0].trim();
            }
        }
        if (lqa.o() && us90.b().a(CoreModule.c.e0.p9(), user)) {
            strM15892a0 = TextUtils.isEmpty(strM15892a0) ? us90.b().c(user) : String.format("%s · %s", strM15892a0, us90.b().c(user));
            vText.setMaxLines(2);
        } else {
            vText.setMaxLines(1);
        }
        if (NullChecker.b(user.profile) && NullChecker.b(user.profile.studies)) {
            Studies studies = user.profile.studies;
            if (studies.active && studies.verified && !TextUtils.isEmpty(studies.school)) {
                if (mo3351O().mo1523P1() && NullChecker.a(user.settings) && user.settings.hideSchoolName()) {
                    if (TextUtils.isEmpty(strM15892a0)) {
                        vText.setText("");
                        return;
                    } else {
                        vText.setText(strM15892a0);
                        return;
                    }
                }
                boolean zIsEmpty = TextUtils.isEmpty(strM15892a0);
                Profile profile = user.profile;
                if (zIsEmpty) {
                    vText.setText(profile.studies.school);
                    return;
                }
                vText.setText(profile.studies.school + "  " + strM15892a0);
                return;
            }
        }
        if (TextUtils.isEmpty(strM15892a0)) {
            m9651Q(vText, 8);
        } else {
            vText.setText(strM15892a0);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ Boolean m24589d0(User user) {
        return Boolean.valueOf(mo3351O().mo1523P1() && !mo3351O().mo1570m0());
    }

    @Override // p002l.jg90
    /* JADX INFO: renamed from: g0 */
    public void mo15896g0(boolean z) {
        mo3351O().mo1517K2();
        mo3351O().mo1523P1();
    }

    @Override // p002l.jg90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        ag90 ag90Var = this.f21736N0;
        m9640E(ag90Var.f7548E, ag90Var.f7547D);
        if (User.isTeamAccount(mo3351O().userId())) {
            m9651Q(this.f21736N0.f7548E, 8);
        }
        if (CoreModule.N().M8()) {
            m24563C0();
            m14461p().duringCreated(CoreModule.N().jb()).subscribe(mkd0.G(new e30() { // from class: l.ng90
                public final void call(Object obj) {
                    this.f16015a.m24564G0((Boolean) obj);
                }
            }));
            m14461p().duringCreated(CoreModule.N().f9()).subscribe(mkd0.G(new e30() { // from class: l.og90
                public final void call(Object obj) {
                    this.f16561a.m24565H0((Boolean) obj);
                }
            }));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, t100.d(40.0f));
        layoutParams.addRule(8, u4c0.F7);
        layoutParams.addRule(11);
        layoutParams.setMargins(t100.d(10.0f), 0, 0, 0);
        this.f21739X.setLayoutParams(layoutParams);
        m14461p().duringCreated(CoreModule.c.e0.o9()).filter(new w9j() { // from class: l.pg90
            public final Object call(Object obj) {
                return this.f17260a.m24589d0((User) obj);
            }
        }).map(new w9j() { // from class: l.qg90
            public final Object call(Object obj) {
                User user = (User) obj;
                return Boolean.valueOf((user.membership.hideActivityTime && user.isVIP()) ? false : true);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.rg90
            public final void call(Object obj) {
                this.f18502a.m15897h0(((Boolean) obj).booleanValue());
            }
        }));
        if (mo3351O().mo1570m0()) {
            this.f13754u.setBackground(CoreModule.b.getResources().getDrawable(x2c0.ku));
            this.f13754u.setOnClickListener(new View.OnClickListener() { // from class: l.sg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f19009a.m24566I0(view2);
                }
            });
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.jg90, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.jg90
    /* JADX INFO: renamed from: l0 */
    public void mo15901l0(User user) {
        m9651Q(this.f21736N0.f7585x, 8);
    }

    @Override // p002l.jg90, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewB = asm.b(mo3351O().act(), f6c0.o9, viewGroup, false);
        this.f21736N0.m9614a(viewB);
        ag90 ag90Var = this.f21736N0;
        this.f13754u = ag90Var.f7562a;
        this.f13755v = ag90Var.f7563b;
        this.f13743M = ag90Var.f7547D;
        this.f21739X = ag90Var.f7575n;
        this.f13757x = ag90Var.f7567f;
        this.f13736F = ag90Var.f7570i;
        this.f13737G = ag90Var.f7586y;
        this.f13745O = ag90Var.f7549F;
        this.f13746P = ag90Var.f7550G;
        this.f13747Q = ag90Var.f7551H;
        this.f13758y = ag90Var.f7568g;
        this.f13759z = ag90Var.f7569h;
        this.f21740Y = ag90Var.f7578q;
        this.f21741Z = ag90Var.f7556M;
        this.f21742k0 = ag90Var.f7557N;
        this.f21743p0 = ag90Var.f7558O;
        this.f21727E0 = ag90Var.f7552I;
        this.f21728F0 = ag90Var.f7554K;
        this.f21729G0 = ag90Var.f7559P;
        this.f21730H0 = ag90Var.f7560Q;
        this.f21731I0 = ag90Var.f7561R;
        this.f21732J0 = ag90Var.f7555L;
        return viewB;
    }

    @Override // p002l.jg90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        ag90 ag90Var;
        ag90 ag90Var2;
        ag90 ag90Var3;
        final User userMo1517K2 = mo3351O().mo1517K2();
        if (userMo1517K2 == null) {
            return;
        }
        xdl0.M(this.f21736N0.f7579r, false);
        this.f21736N0.f7567f.setText(userMo1517K2.name);
        this.f21736N0.f7567f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f21736N0.f7570i.setText(String.valueOf(userMo1517K2.age));
        xdl0.M(this.f21736N0.f7570i, !userMo1517K2.isHideAgeFromSVipWithOutMe());
        m24588P0(userMo1517K2, this.f21736N0.f7548E);
        mo15896g0(mo3351O().mo1570m0());
        mo15901l0(userMo1517K2);
        xdl0.M(this.f21736N0.f7580s, false);
        xdl0.M(this.f21736N0.f7581t, false);
        if (CoreModule.o.d().ve(userMo1517K2)) {
            xdl0.c0(this.f21736N0.f7582u, t100.d(4.0f));
            xdl0.M(this.f21736N0.f7582u, true);
            this.f21736N0.f7582u.setImageDrawable(CoreModule.b.getResources().getDrawable(x2c0.Rc));
        } else if (u59.S() && userMo1517K2.isSVIP()) {
            xdl0.c0(this.f21736N0.f7582u, t100.d(4.0f));
            xdl0.M(this.f21736N0.f7582u, true);
            this.f21736N0.f7582u.setBackgroundDrawable(CoreModule.b.getResources().getDrawable(x2c0.Qc));
        } else {
            boolean zIsVIP = userMo1517K2.isVIP();
            ag90 ag90Var4 = this.f21736N0;
            if (zIsVIP) {
                xdl0.c0(ag90Var4.f7582u, t100.d(4.0f));
                xdl0.M(this.f21736N0.f7582u, true);
                VipNewUtils.d(mo3351O().act(), this.f21736N0.f7582u, "vip");
                this.f21736N0.f7582u.setBackgroundDrawable(CoreModule.b.getResources().getDrawable(x2c0.Sc));
            } else {
                xdl0.M(ag90Var4.f7582u, false);
            }
        }
        if ((userMo1517K2.isSVIP() && userMo1517K2.isHideIconFromSVip()) || (userMo1517K2.isVIP() && userMo1517K2.gpHideVip())) {
            xdl0.M(this.f21736N0.f7582u, false);
            xdl0.M(this.f21736N0.f7581t, false);
        }
        boolean zIsPicVerificationVerified = userMo1517K2.isPicVerificationVerified();
        ag90 ag90Var5 = this.f21736N0;
        if (zIsPicVerificationVerified) {
            xdl0.M(ag90Var5.f7573l, false);
            xdl0.M(this.f21736N0.f7571j, true);
        } else {
            xdl0.M(ag90Var5.f7573l, false);
            xdl0.M(this.f21736N0.f7571j, false);
        }
        m24590w0(mo3351O().mo1517K2());
        if (userMo1517K2.isMe()) {
            if (userMo1517K2.isHideIconFromSVipWithMe() || userMo1517K2.gpHideVip()) {
                xdl0.M(this.f21736N0.f7581t, false);
                xdl0.M(this.f21736N0.f7582u, false);
            }
            if (userMo1517K2.isHideAgeFromSVip()) {
                xdl0.M(this.f21736N0.f7570i, false);
            }
        }
        m24587O0(userMo1517K2);
        m24586N0(userMo1517K2);
        LinearLayout linearLayout = this.f21740Y;
        xdl0.M(linearLayout, xdl0.P0(linearLayout) > 0);
        m24585M0();
        m24584L0(userMo1517K2);
        int iM23013f = tm90.m23008d().m23013f(userMo1517K2);
        if (iM23013f == -1 || xdl0.O0(this.f21736N0.f7571j)) {
            this.f21736N0.f7572k.setVisibility(8);
        } else {
            this.f21736N0.f7572k.setVisibility(0);
            tm90.m23008d().m23017j(iM23013f, this.f21736N0.f7572k, false);
        }
        if (tm90.m23008d().m23014g(userMo1517K2) && !xdl0.O0(this.f21736N0.f7582u)) {
            xdl0.M(this.f21736N0.f7582u, true);
            if (u59.S() && userMo1517K2.isSVIP()) {
                this.f21736N0.f7582u.setBackgroundDrawable(CoreModule.b.getResources().getDrawable(x2c0.Qc));
            } else {
                VipNewUtils.d(mo3351O().act(), this.f21736N0.f7582u, "vip");
                this.f21736N0.f7582u.setBackgroundDrawable(CoreModule.b.getResources().getDrawable(x2c0.ar));
            }
        }
        if (m9644I()) {
            int childCount = this.f21736N0.f7563b.getChildCount();
            int i = 0;
            while (true) {
                ag90Var = this.f21736N0;
                if (i >= childCount) {
                    break;
                }
                VLinear childAt = ag90Var.f7563b.getChildAt(i);
                ag90 ag90Var6 = this.f21736N0;
                xdl0.M(childAt, childAt == ag90Var6.f7564c || childAt == ag90Var6.f7547D);
                i++;
            }
            int childCount2 = ag90Var.f7566e.getChildCount();
            int i2 = 0;
            while (true) {
                ag90Var2 = this.f21736N0;
                if (i2 >= childCount2) {
                    break;
                }
                VText childAt2 = ag90Var2.f7566e.getChildAt(i2);
                ag90 ag90Var7 = this.f21736N0;
                xdl0.M(childAt2, childAt2 == ag90Var7.f7567f || childAt2 == ag90Var7.f7570i);
                i2++;
            }
            ag90Var2.f7567f.setText(userMo1517K2.publicId);
            this.f21736N0.f7570i.setText((userMo1517K2.isHideAgeFromSVip() || userMo1517K2.age.intValue() <= 0 || userMo1517K2.isHideAgeForTeamAccount()) ? "" : Integer.toString(userMo1517K2.age.intValue()));
            int childCount3 = this.f21736N0.f7547D.getChildCount();
            int i3 = 0;
            while (true) {
                ag90Var3 = this.f21736N0;
                if (i3 >= childCount3) {
                    break;
                }
                VText childAt3 = ag90Var3.f7547D.getChildAt(i3);
                xdl0.M(childAt3, childAt3 == this.f21736N0.f7548E);
                i3++;
            }
            ag90Var3.f7548E.setText(m9642G());
            xdl0.c0(this.f13754u, t100.d(500.0f));
        } else {
            xdl0.c0(this.f13754u, 0);
        }
        if (lqa.o() || !us90.b().a(CoreModule.c.e0.p9(), userMo1517K2)) {
            xdl0.M(this.f21727E0, false);
        } else {
            xdl0.M(this.f21727E0, true);
            xdl0.H0(this.f21728F0, us90.b().c(userMo1517K2));
            if (!this.f21733K0) {
                this.f21733K0 = true;
                zvf0.A("e_like_person", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("receivedlikes", userMo1517K2.profile.receivedLikes)});
            }
        }
        m24578B0();
        if (jjb0.b()) {
            xdl0.M(this.f21736N0.f7571j, false);
            xdl0.M(this.f21736N0.f7572k, false);
            xdl0.M(this.f21736N0.f7573l, false);
            xdl0.M(this.f21736N0.f7585x, false);
            View viewF = CertificationUtil.f(mo3351O().act(), userMo1517K2, CertificationUtil.CertificationIconStyle.PROFILE);
            if (viewF == null) {
                View viewFindViewById = this.f21740Y.findViewById(u4c0.X0);
                if (NullChecker.a(viewFindViewById)) {
                    this.f21740Y.removeView(viewFindViewById);
                    return;
                }
                return;
            }
            xdl0.E0(viewF, new View.OnClickListener() { // from class: l.lg90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14846a.m24582J0(userMo1517K2, view);
                }
            });
            ((LinearLayout.LayoutParams) viewF.getLayoutParams()).setMargins(0, 0, t100.d(5.0f), 0);
            if (this.f21740Y.findViewById(u4c0.X0) != null) {
                return;
            }
            this.f21740Y.addView(viewF, 0);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m24590w0(User user) {
        m24591x0();
        xdl0.c0(this.f21736N0.f7563b, t100.d(this.f21738P0 ? 6.0f : 8.0f));
        if (user.isMe()) {
            a1m a1mVarMo3351O = mo3351O();
            ag90 ag90Var = this.f21736N0;
            a1mVarMo3351O.mo1508G(ag90Var.f7571j, ag90Var.f7573l);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m24591x0() {
        xdl0.c0(this.f21736N0.f7563b, t100.d(0.0f));
        xdl0.d0(this.f21736N0.f7563b, t100.d(20.0f));
    }

    /* JADX INFO: renamed from: y0 */
    public final int m24592y0(IntlGender intlGender) {
        int color = mo3351O().act().getColor(w0c0.B);
        if (TEnum.equals(intlGender, "male")) {
            return mo3351O().act().getColor(w0c0.j);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo3351O().act().getColor(w0c0.k) : color;
    }

    /* JADX INFO: renamed from: z0 */
    public final Drawable m24593z0(IntlGender intlGender) {
        Drawable drawable = mo3351O().act().getDrawable(x2c0.xl);
        if (TEnum.equals(intlGender, "male")) {
            return mo3351O().act().getDrawable(x2c0.vl);
        }
        return TEnum.equals(intlGender, "nonbinary") ? mo3351O().act().getDrawable(x2c0.wl) : drawable;
    }

    @Override // p002l.ah90, p002l.hn2
    /* JADX INFO: renamed from: r */
    public void mo3383r(View view) {
    }
}
