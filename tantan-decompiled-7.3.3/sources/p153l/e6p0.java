package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p051p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.rwn0;

/* JADX INFO: loaded from: classes10.dex */
public class e6p0<D extends rwn0> extends LiveMenuDialogHolder<v7p0<D>> {

    /* JADX INFO: renamed from: A */
    public VoiceSweetCpHeadView f92306A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f92307B;

    /* JADX INFO: renamed from: C */
    public VText f92308C;

    /* JADX INFO: renamed from: D */
    public VText f92309D;

    /* JADX INFO: renamed from: E */
    public VText f92310E;

    /* JADX INFO: renamed from: F */
    public VText f92311F;

    /* JADX INFO: renamed from: G */
    public VImage f92312G;

    /* JADX INFO: renamed from: H */
    public VText f92313H;

    /* JADX INFO: renamed from: I */
    public View f92314I;

    /* JADX INFO: renamed from: J */
    public AnimEffectPlayer f92315J;

    /* JADX INFO: renamed from: K */
    public VideoEffectPlayer f92316K;

    /* JADX INFO: renamed from: L */
    public LiveUserCardSkinView f92317L;

    /* JADX INFO: renamed from: M */
    public User f92318M;

    /* JADX INFO: renamed from: N */
    public BLiveVoiceUserProfileConfig f92319N;

    /* JADX INFO: renamed from: O */
    public vak0 f92320O;

    /* JADX INFO: renamed from: P */
    public BLiveVoiceCall f92321P;

    /* JADX INFO: renamed from: Q */
    public nsv<User> f92322Q;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f92323k;

    /* JADX INFO: renamed from: l */
    public View f92324l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f92325m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f92326n;

    /* JADX INFO: renamed from: o */
    public VImage f92327o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f92328p;

    /* JADX INFO: renamed from: q */
    public VoiceUserCardMedalAndNameView f92329q;

    /* JADX INFO: renamed from: r */
    public VFrame f92330r;

    /* JADX INFO: renamed from: s */
    public VLinear f92331s;

    /* JADX INFO: renamed from: t */
    public VoiceCardUserLevelView f92332t;

    /* JADX INFO: renamed from: u */
    public VoiceCardAnchorLevelView f92333u;

    /* JADX INFO: renamed from: v */
    public VoiceCardFanBaseEnterView f92334v;

    /* JADX INFO: renamed from: w */
    public VoiceCardMedalWallEnterView f92335w;

    /* JADX INFO: renamed from: x */
    public UserCardFamilyGroupView f92336x;

    /* JADX INFO: renamed from: y */
    public VoiceCardGiftWallView f92337y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f92338z;

    /* JADX INFO: renamed from: l.e6p0$a */
    public class C16722a extends wo0 {
        public C16722a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(e6p0.this.f92315J, false);
        }
    }

    public e6p0(Act act, v7p0 v7p0Var) {
        super(yec0.f198698A6, act, v7p0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: renamed from: B0 */
    private void m119608B0(vak0 vak0Var, BLiveVoiceCall bLiveVoiceCall) {
        this.f92321P = bLiveVoiceCall;
        this.f92320O = vak0Var;
        this.f92318M = vak0Var == null ? null : vak0Var.f183108c.f143542a;
        this.f92322Q = vak0Var == null ? null : vak0Var.f183108c;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM200543r = vak0Var != null ? vak0Var.m200543r() : null;
        this.f92319N = bLiveVoiceUserProfileConfigM200543r;
        if (this.f92318M == null || bLiveVoiceUserProfileConfigM200543r == null) {
            bnl0.m105524M(this.f92313H, true);
            this.f92325m.setVisibility(8);
            return;
        }
        m119643D0();
        m119613I0();
        ArrayList arrayList = new ArrayList();
        if (zrv.m221193k().m203746u7() && vak0Var.m200535j() != null && !vak0Var.m200546u()) {
            m119642A0(vak0Var);
            arrayList.add(this.f92332t);
        }
        if (vak0Var.m200529d() != null && vak0Var.m200529d().grade >= 0 && vak0Var.m200546u()) {
            m119665z0(vak0Var);
            arrayList.add(this.f92333u);
        }
        m119645G0(vak0Var.m200542q());
        arrayList.add(this.f92334v);
        final BLiveUserFamilyCard bLiveUserFamilyCardM200533h = vak0Var.m200533h();
        if (bLiveUserFamilyCardM200533h != null && !TextUtils.isEmpty(bLiveUserFamilyCardM200533h.schema)) {
            this.f92336x.m79911j0(bLiveUserFamilyCardM200533h);
            arrayList.add(this.f92336x);
            bnl0.m105509E0(this.f92336x, new View.OnClickListener() { // from class: l.d6p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85389a.m119634j0(bLiveUserFamilyCardM200533h, view);
                }
            });
        } else if (vak0Var.m200548w()) {
            m119647J0(vak0Var.m200537l());
            arrayList.add(this.f92335w);
        }
        m119632c0(arrayList);
        bnl0.m105524M(this.f92331s, arrayList.size() > 0);
        this.f92317L.m74506y0(this.f92322Q, this.f92324l);
        LiveUserCardSkinView liveUserCardSkinView = this.f92317L;
        FrameLayout frameLayout = this.f92325m;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f92319N;
        liveUserCardSkinView.m74494D0(frameLayout, bLiveVoiceUserProfileConfig != null && bLiveVoiceUserProfileConfig.enableNewPrivilege);
        m119644E0();
        List<BLiveUserCardGiftWall> listM200534i = vak0Var.m200534i();
        if (jyb.m147479J(listM200534i)) {
            bnl0.m105524M(this.f92337y, false);
        } else {
            m119646H0(listM200534i);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m119613I0() {
        biv.m104517b(this.f92326n, qa00.m175859d(100.0f), this.f92322Q, new qcj() { // from class: l.p5p0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        bnl0.m105524M(this.f92325m, true);
        boolean zM73304k0 = this.f92326n.m73304k0();
        FrameLayout frameLayout = this.f92325m;
        if (zM73304k0) {
            bnl0.m105537U(frameLayout, qa00.m175859d(2.0f));
            this.f92325m.setBackground(null);
            bnl0.m105524M(this.f92327o, false);
        } else {
            bnl0.m105537U(frameLayout, qa00.m175859d(-6.0f));
            boolean zM119322d = e3t.m119319a(this.f92322Q).m119322d();
            FrameLayout frameLayout2 = this.f92325m;
            if (zM119322d) {
                frameLayout2.setBackground(null);
                bnl0.m105524M(this.f92327o, false);
            } else {
                frameLayout2.setBackgroundResource(obc0.f145998C8);
                bnl0.m105524M(this.f92327o, true);
                zrv.f205799a.m207693s0(this.f92327o.getContext(), this.f92318M, this.f92327o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardM200531f = this.f92320O.m200531f();
        CommonMaskAvatarView commonMaskAvatarView = this.f92328p;
        if (bLiveBoardGuardM200531f == null) {
            bnl0.m105524M(commonMaskAvatarView, false);
            return;
        }
        bnl0.m105524M(commonMaskAvatarView, true);
        biv.m104522g(this.f92328p, qa00.m175859d(48.0f), bLiveBoardGuardM200531f.userAvatar, bLiveBoardGuardM200531f.userAvatarFrame, "");
        bnl0.m105509E0(this.f92328p, new View.OnClickListener() { // from class: l.q5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155747a.m119662p0(bLiveBoardGuardM200531f, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    private void m119616K0() {
        this.f92324l.setOnClickListener(new View.OnClickListener() { // from class: l.j5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118487a.m119635q0(view);
            }
        });
        bnl0.m105509E0(this.f92308C, new View.OnClickListener() { // from class: l.u5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177667a.m119636r0(view);
            }
        });
        bnl0.m105509E0(this.f92309D, new View.OnClickListener() { // from class: l.w5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187540a.m119637s0(view);
            }
        });
        this.f92314I.setOnClickListener(new View.OnClickListener() { // from class: l.x5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e6p0.m119621P(view);
            }
        });
        bnl0.m105509E0(this.f92325m, new View.OnClickListener() { // from class: l.y5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197577a.m119638t0(view);
            }
        });
        bnl0.m105509E0(this.f92334v, new View.OnClickListener() { // from class: l.z5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203074a.m119639u0(view);
            }
        });
        bnl0.m105509E0(this.f92335w, new View.OnClickListener() { // from class: l.a6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68745a.m119640v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m119621P(View view) {
    }

    /* JADX INFO: renamed from: c0 */
    private void m119632c0(List<View> list) {
        if (list.size() == 3) {
            final float fM105592y0 = (bnl0.m105592y0() - qa00.m175859d(58.0f)) / 3.0f;
            jyb.m147537z(list, new y20() { // from class: l.n5p0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams((int) fM105592y0, qa00.m175859d(56.0f)));
                }
            });
            bnl0.m105538V(list.get(1), qa00.m175859d(9.0f));
            bnl0.m105539W(list.get(1), qa00.m175859d(9.0f));
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.o5p0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(106.0f), qa00.m175859d(56.0f)));
            }
        });
        if (list.size() > 1) {
            bnl0.m105539W(list.get(0), qa00.m175859d(9.0f));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m119633d0() {
        bnl0.m105524M(this.f92310E, false);
        bnl0.m105524M(this.f92309D, false);
        bnl0.m105524M(this.f92308C, false);
        bnl0.m105524M(this.f92307B, false);
        bnl0.m105524M(this.f92311F, false);
        bnl0.m105524M(this.f92313H, false);
        bnl0.m105524M(this.f92331s, false);
        bnl0.m105524M(this.f92332t, false);
        bnl0.m105524M(this.f92333u, false);
        bnl0.m105524M(this.f92334v, false);
        bnl0.m105524M(this.f92315J, false);
        bnl0.m105524M(this.f92316K, false);
        bnl0.m105524M(this.f92335w, false);
        this.f92326n.m73302i0();
        this.f92329q.m79955b();
        this.f92318M = null;
        this.f92319N = null;
        this.f92317L.m74496n0();
        this.f92337y.m79898e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m119634j0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((v7p0) this.f48605b).mo138869p3(3800, bLiveUserFamilyCard.schema);
        ((v7p0) this.f48605b).m200254z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m119635q0(View view) {
        ((v7p0) this.f48605b).m100211Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m119636r0(View view) {
        m119641x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m119637s0(View view) {
        if (this.f92318M != null) {
            w7p0.m205355c();
            ((v7p0) this.f48605b).m200251V4(this.f92320O.f183108c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m119638t0(View view) {
        User user = this.f92318M;
        if (user != null) {
            ((v7p0) this.f48605b).m200250U4(user.f56859id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m119639u0(View view) {
        ((v7p0) this.f48605b).m213811F2().FansClubEvent.showVoiceFansClubDialog().mo199273j(this.f92318M.f56859id);
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m119640v0(View view) {
        if (!NullChecker.m82486a(this.f92320O.m200537l()) || TextUtils.isEmpty(this.f92318M.f56859id)) {
            return;
        }
        ((v7p0) this.f48605b).m213811F2().IntlVoiceMedalWallEvent.showMedalWall().mo199273j(this.f92318M.f56859id);
        mo73021p();
    }

    /* JADX INFO: renamed from: x0 */
    private void m119641x0() {
        if (this.f92318M == null) {
            return;
        }
        String strConcat = "@" + this.f92318M.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = ix4.f117314E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((v7p0) this.f48605b).m200249T4(strConcat);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m119642A0(final vak0 vak0Var) {
        bnl0.m105524M(this.f92332t, true);
        this.f92332t.m79948K(vak0Var.m200541p(), vak0Var, vak0Var.m200535j().shadingFrontUrl, vak0Var.m200535j().shadingBackUrl, new x20() { // from class: l.t5p0
            @Override // p153l.x20
            public final void call() {
                this.f172221a.m119656i0(vak0Var);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((v7p0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public void m119643D0() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f92319N;
        if (bLiveVoiceUserProfileConfig == null) {
            fhw.m125605a("voiceUserCard", "config is null");
            return;
        }
        if (bLiveVoiceUserProfileConfig.bottomButtons.size() == 0) {
            fhw.m125605a("voiceUserCard", "config.bottomButtons is empty");
            this.f92307B.setVisibility(8);
            return;
        }
        fhw.m125605a("voiceUserCard", "bottom button:" + this.f92319N.userId);
        this.f92307B.setVisibility(0);
        for (int i = 0; i < this.f92319N.bottomButtons.size(); i++) {
            String str = this.f92319N.bottomButtons.get(i);
            fhw.m125605a("voiceUserCard", "render bottom button:" + str);
            str.getClass();
            switch (str) {
                case "follow":
                    ((v7p0) this.f48605b).mo100209X3(this.f92318M, this.f92319N.bottomButtons.size());
                    T t = this.f48605b;
                    z8p0.m219020d(t, ((v7p0) t).mo100219h4(), ((v7p0) this.f48605b).m200232B4(), ((v7p0) this.f48605b).mo78457R2());
                    break;
                case "at":
                    boolean zIsFemale = this.f92318M.isFemale();
                    VText vText = this.f92308C;
                    if (zIsFemale) {
                        vText.setText(zrv.f205803e.getString(R$string.f47808Se));
                    } else {
                        vText.setText(zrv.f205803e.getString(R$string.f47766Qe));
                    }
                    this.f92308C.setVisibility(0);
                    break;
                case "call":
                    m119663w0(this.f92321P);
                    break;
                case "sendGift":
                    bnl0.m105524M(this.f92309D, true);
                    this.f92309D.setText(R$string.f48238md);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m119644E0() {
        bnl0.m105524M(this.f92306A, this.f92320O.m200547v());
        if (this.f92320O.m200547v()) {
            final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f92320O.m200532g().maxRankHouseInfo;
            this.f92306A.m79675b(bLiveVoiceCpHouseInfo.houseBackground, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar);
            this.f92306A.m79676c(qa00.m175859d(75.0f), qa00.m175859d(75.0f));
            this.f92306A.f54382e.setOnClickListener(new View.OnClickListener() { // from class: l.r5p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161373a.m119657k0(bLiveVoiceCpHouseInfo, view);
                }
            });
            this.f92306A.f54384g.setOnClickListener(new View.OnClickListener() { // from class: l.s5p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166443a.m119658l0(bLiveVoiceCpHouseInfo, view);
                }
            });
            if (bLiveVoiceCpHouseInfo.houseRank >= 9) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f92320O.m200532g().profileVideoEffect);
                vak0 vak0Var = this.f92320O;
                if (!zIsEmpty) {
                    m119664y0(vak0Var.m200532g().profileVideoEffect);
                } else {
                    if (TextUtils.isEmpty(vak0Var.m200532g().profileEffectImage)) {
                        return;
                    }
                    bnl0.m105524M(this.f92315J, true);
                    this.f92315J.mo69680g(this.f92320O.m200532g().profileEffectImage, 1, new C16722a(), true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m119645G0(BLiveFansMemberNum bLiveFansMemberNum) {
        bnl0.m105524M(this.f92334v, true);
        this.f92334v.m79327v(bLiveFansMemberNum);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m119646H0(List<BLiveUserCardGiftWall> list) {
        bnl0.m105524M(this.f92337y, true);
        final String strUserId = ((v7p0) this.f48605b).m200232B4().userId();
        this.f92337y.m79900h(((v7p0) this.f48605b).act(), list, new x20() { // from class: l.k5p0
            @Override // p153l.x20
            public final void call() {
                this.f124108a.m119659m0(strUserId);
            }
        }, new Action1() { // from class: l.l5p0
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                this.f130158a.m119660n0(strUserId, (String) obj);
            }
        });
        bnl0.m105509E0(this.f92337y.f54672b, new View.OnClickListener() { // from class: l.m5p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134921a.m119661o0(strUserId, view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final void m119647J0(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        bnl0.m105524M(this.f92335w, true);
        this.f92335w.m79458v(bLiveIntlMedalWallInUserCard);
    }

    /* JADX INFO: renamed from: L0 */
    public void m119648L0(boolean z, vak0 vak0Var, BLiveVoiceCall bLiveVoiceCall) {
        super.m73017E();
        m119633d0();
        m73015B(z);
        m119608B0(vak0Var, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public final void m119649M0(String str) {
        if (this.f92320O.m200540o().f143542a.f56859id.equals(str)) {
            return;
        }
        mo73021p();
        T t = this.f48605b;
        ydn0.m215258k(t, ((rwn0) ((v7p0) t).m213810E2()).m168532l0().f56859id, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m119650a0(View view) {
        f6p0.m124321a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((v7p0) this.f48605b).act();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        if (isShowing()) {
            ((v7p0) this.f48605b).m200254z4();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m119652e0() {
        this.f92310E.setText(R$string.f47554Gh);
        this.f92310E.setEnabled(false);
        this.f92310E.setBackgroundResource(obc0.f146244Y0);
        this.f92310E.setTextColor(((v7p0) this.f48605b).act().getResources().getColor(n9c0.f140838j1));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m119653f0(View view) {
        ((v7p0) this.f48605b).m200237G4(this.f92318M);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m119654g0(BLiveVoiceCall bLiveVoiceCall, View view) {
        ((v7p0) this.f48605b).m200248S4(bLiveVoiceCall, this.f92318M.f56859id);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Boolean m119655h0() {
        return Boolean.valueOf(this.f48606c.isShowing());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m119656i0(vak0 vak0Var) {
        if (vak0Var.m200541p() != null && vak0Var.m200543r().enableNewPrivilege && !TextUtils.equals(zrv.f205799a.m207631D0(), vak0Var.f183108c.f143542a.f56859id) && !TextUtils.isEmpty(vak0Var.m200541p().jumpScheme)) {
            ((v7p0) this.f48605b).mo138869p3(3800, vak0Var.m200541p().jumpScheme);
        } else {
            if (wft.m206159b(3) || !TextUtils.equals(vak0Var.m200540o().f143542a.f56859id, zrv.f205799a.m207631D0())) {
                return;
            }
            this.f92332t.m79950P(vak0Var.m200541p());
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m119657k0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m119649M0(bLiveVoiceCpHouseInfo.userId);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m119658l0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m119649M0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m119650a0(view);
        m73027z(LiveDialogEnum.USER_CARD);
        m73014A(80);
        m119616K0();
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(mdc0.f135999M7);
        this.f92317L = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m119659m0(String str) {
        ((v7p0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(str, "profile"));
        mo73021p();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m119660n0(String str, String str2) {
        ((v7p0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(str, "profile"));
        aco0 aco0Var = new aco0();
        aco0Var.f69735b = str2;
        aco0Var.f69734a = str;
        ((v7p0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showGiftDetail().mo199273j(aco0Var);
        mo73021p();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m119661o0(String str, View view) {
        ((v7p0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(str, "profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m119662p0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((v7p0) this.f48605b).mo138869p3(3800, bLiveBoardGuard.schema);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        if (this.f92315J.isAnimating()) {
            this.f92315J.m69688o();
        }
        if (this.f92316K.isPlaying()) {
            this.f92316K.stop();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m119663w0(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f92318M == null || this.f92320O == null) {
            return;
        }
        bnl0.m105525M0(this.f92310E, true);
        if (bLiveVoiceCall != null) {
            this.f92310E.setText(R$string.f48331qi);
            this.f92310E.setEnabled(true);
            this.f92310E.setBackgroundResource(obc0.f146291c1);
            this.f92310E.setTextColor(((v7p0) this.f48605b).act().getResources().getColor(n9c0.f140877w1));
            bnl0.m105509E0(this.f92310E, new View.OnClickListener() { // from class: l.c6p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79985a.m119654g0(bLiveVoiceCall, view);
                }
            });
            return;
        }
        if (this.f92320O.m200528c(this.f92318M.f56859id)) {
            m119652e0();
            return;
        }
        this.f92310E.setEnabled(true);
        this.f92310E.setText(R$string.f47631K6);
        this.f92310E.setBackgroundResource(obc0.f146291c1);
        this.f92310E.setTextColor(((v7p0) this.f48605b).act().getResources().getColor(n9c0.f140877w1));
        bnl0.m105509E0(this.f92310E, new View.OnClickListener() { // from class: l.b6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75201a.m119653f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m119664y0(String str) {
        jfl0.m144685n(this.f92316K, new hre(String.valueOf(str)).m136830m(new pcj() { // from class: l.v5p0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f182561a.m119655h0();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m119665z0(vak0 vak0Var) {
        bnl0.m105524M(this.f92333u, true);
        this.f92333u.m79931O(vak0Var.m200529d(), vak0Var.m200530e().shadingFrontUrl, vak0Var.m200530e().shadingBackUrl);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(v7p0 v7p0Var) {
    }
}
