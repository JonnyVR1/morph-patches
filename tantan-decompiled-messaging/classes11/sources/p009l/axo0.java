package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p000p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import l.agv;
import l.ap0;
import l.bxo0;
import l.d1t;
import l.d30;
import l.dqe;
import l.e30;
import l.f6l0;
import l.g5c0;
import l.h1c0;
import l.hfw;
import l.i3c0;
import l.j2g0;
import l.jw4;
import l.mqv;
import l.nnn0;
import l.p1k0;
import l.t100;
import l.t6c0;
import l.u4n0;
import l.v9j;
import l.vdt;
import l.vwb;
import l.w9j;
import l.x6s;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class axo0<D extends nnn0> extends LiveMenuDialogHolder<ryo0<D>> {

    /* JADX INFO: renamed from: A */
    public VoiceSweetCpHeadView f9730A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f9731B;

    /* JADX INFO: renamed from: C */
    public VText f9732C;

    /* JADX INFO: renamed from: D */
    public VText f9733D;

    /* JADX INFO: renamed from: E */
    public VText f9734E;

    /* JADX INFO: renamed from: F */
    public VText f9735F;

    /* JADX INFO: renamed from: G */
    public VImage f9736G;

    /* JADX INFO: renamed from: H */
    public VText f9737H;

    /* JADX INFO: renamed from: I */
    public View f9738I;

    /* JADX INFO: renamed from: J */
    public AnimEffectPlayer f9739J;

    /* JADX INFO: renamed from: K */
    public VideoEffectPlayer f9740K;

    /* JADX INFO: renamed from: L */
    public LiveUserCardSkinView f9741L;

    /* JADX INFO: renamed from: M */
    public User f9742M;

    /* JADX INFO: renamed from: N */
    public BLiveVoiceUserProfileConfig f9743N;

    /* JADX INFO: renamed from: O */
    public p1k0 f9744O;

    /* JADX INFO: renamed from: P */
    public BLiveVoiceCall f9745P;

    /* JADX INFO: renamed from: Q */
    public mqv<User> f9746Q;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f9747k;

    /* JADX INFO: renamed from: l */
    public View f9748l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f9749m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f9750n;

    /* JADX INFO: renamed from: o */
    public VImage f9751o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f9752p;

    /* JADX INFO: renamed from: q */
    public VoiceUserCardMedalAndNameView f9753q;

    /* JADX INFO: renamed from: r */
    public VFrame f9754r;

    /* JADX INFO: renamed from: s */
    public VLinear f9755s;

    /* JADX INFO: renamed from: t */
    public VoiceCardUserLevelView f9756t;

    /* JADX INFO: renamed from: u */
    public VoiceCardAnchorLevelView f9757u;

    /* JADX INFO: renamed from: v */
    public VoiceCardFanBaseEnterView f9758v;

    /* JADX INFO: renamed from: w */
    public VoiceCardMedalWallEnterView f9759w;

    /* JADX INFO: renamed from: x */
    public UserCardFamilyGroupView f9760x;

    /* JADX INFO: renamed from: y */
    public VoiceCardGiftWallView f9761y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f9762z;

    /* JADX INFO: renamed from: l.axo0$a */
    public class C0771a extends ap0 {
        public C0771a() {
        }

        /* JADX INFO: renamed from: b */
        public void m11762b() {
            super.b();
            xdl0.M(axo0.this.f9739J, false);
        }
    }

    public axo0(Act act, ryo0 ryo0Var) {
        super(t6c0.A6, act, ryo0Var, j2g0.c(0.3f));
    }

    /* JADX INFO: renamed from: B0 */
    private void m11699B0(p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        this.f9745P = bLiveVoiceCall;
        this.f9744O = p1k0Var;
        this.f9742M = p1k0Var == null ? null : (User) p1k0Var.c.a;
        this.f9746Q = p1k0Var == null ? null : p1k0Var.c;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigR = p1k0Var != null ? p1k0Var.r() : null;
        this.f9743N = bLiveVoiceUserProfileConfigR;
        if (this.f9742M == null || bLiveVoiceUserProfileConfigR == null) {
            xdl0.M(this.f9737H, true);
            this.f9749m.setVisibility(8);
            return;
        }
        m11735D0();
        m11704I0();
        List<View> arrayList = new ArrayList<>();
        if (ypv.m25490k().u7() && p1k0Var.j() != null && !p1k0Var.u()) {
            m11733A0(p1k0Var);
            arrayList.add(this.f9756t);
        }
        if (p1k0Var.d() != null && p1k0Var.d().grade >= 0 && p1k0Var.u()) {
            m11761z0(p1k0Var);
            arrayList.add(this.f9757u);
        }
        m11737G0(p1k0Var.q());
        arrayList.add(this.f9758v);
        final BLiveUserFamilyCard bLiveUserFamilyCardH = p1k0Var.h();
        if (bLiveUserFamilyCardH != null && !TextUtils.isEmpty(bLiveUserFamilyCardH.schema)) {
            this.f9760x.m8944j0(bLiveUserFamilyCardH);
            arrayList.add(this.f9760x);
            xdl0.E0(this.f9760x, new View.OnClickListener() { // from class: l.zwo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f24011a.m11725j0(bLiveUserFamilyCardH, view);
                }
            });
        } else if (p1k0Var.w()) {
            m11739J0(p1k0Var.l());
            arrayList.add(this.f9759w);
        }
        m11723c0(arrayList);
        xdl0.M(this.f9755s, arrayList.size() > 0);
        this.f9741L.y0(this.f9746Q, this.f9748l);
        LiveUserCardSkinView liveUserCardSkinView = this.f9741L;
        FrameLayout frameLayout = this.f9749m;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f9743N;
        liveUserCardSkinView.D0(frameLayout, bLiveVoiceUserProfileConfig != null && bLiveVoiceUserProfileConfig.enableNewPrivilege);
        m11736E0();
        List<BLiveUserCardGiftWall> listI = p1k0Var.i();
        if (vwb.J(listI)) {
            xdl0.M(this.f9761y, false);
        } else {
            m11738H0(listI);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m11704I0() {
        agv.b(this.f9750n, t100.d(100.0f), this.f9746Q, new w9j() { // from class: l.lwo0
            public final Object call(Object obj) {
                return ((User) obj).fp().profileSmall().formatted();
            }
        });
        xdl0.M(this.f9749m, true);
        boolean zK0 = this.f9750n.k0();
        FrameLayout frameLayout = this.f9749m;
        if (zK0) {
            xdl0.U(frameLayout, t100.d(2.0f));
            this.f9749m.setBackground(null);
            xdl0.M(this.f9751o, false);
        } else {
            xdl0.U(frameLayout, t100.d(-6.0f));
            boolean zD = d1t.a(this.f9746Q).d();
            FrameLayout frameLayout2 = this.f9749m;
            if (zD) {
                frameLayout2.setBackground(null);
                xdl0.M(this.f9751o, false);
            } else {
                frameLayout2.setBackgroundResource(i3c0.C8);
                xdl0.M(this.f9751o, true);
                ypv.f23196a.m23681s0(this.f9751o.getContext(), this.f9742M, this.f9751o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardF = this.f9744O.f();
        CommonMaskAvatarView commonMaskAvatarView = this.f9752p;
        if (bLiveBoardGuardF == null) {
            xdl0.M(commonMaskAvatarView, false);
            return;
        }
        xdl0.M(commonMaskAvatarView, true);
        agv.g(this.f9752p, t100.d(48.0f), bLiveBoardGuardF.userAvatar, bLiveBoardGuardF.userAvatarFrame, "");
        xdl0.E0(this.f9752p, new View.OnClickListener() { // from class: l.mwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17131a.m11757p0(bLiveBoardGuardF, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    private void m11707K0() {
        this.f9748l.setOnClickListener(new View.OnClickListener() { // from class: l.fwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13188a.m11726q0(view);
            }
        });
        xdl0.E0(this.f9732C, new View.OnClickListener() { // from class: l.qwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19569a.m11727r0(view);
            }
        });
        xdl0.E0(this.f9733D, new View.OnClickListener() { // from class: l.swo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20488a.m11728s0(view);
            }
        });
        this.f9738I.setOnClickListener(new View.OnClickListener() { // from class: l.two0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axo0.m11712P(view);
            }
        });
        xdl0.E0(this.f9749m, new View.OnClickListener() { // from class: l.uwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21357a.m11729t0(view);
            }
        });
        xdl0.E0(this.f9758v, new View.OnClickListener() { // from class: l.vwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21810a.m11730u0(view);
            }
        });
        xdl0.E0(this.f9759w, new View.OnClickListener() { // from class: l.wwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22350a.m11731v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m11712P(View view) {
    }

    /* JADX INFO: renamed from: c0 */
    private void m11723c0(List<View> list) {
        if (list.size() == 3) {
            final float fY0 = (xdl0.y0() - t100.d(58.0f)) / 3.0f;
            vwb.z(list, new e30() { // from class: l.jwo0
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams((int) fY0, t100.d(56.0f)));
                }
            });
            xdl0.V(list.get(1), t100.d(9.0f));
            xdl0.W(list.get(1), t100.d(9.0f));
            return;
        }
        vwb.z(list, new e30() { // from class: l.kwo0
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(t100.d(106.0f), t100.d(56.0f)));
            }
        });
        if (list.size() > 1) {
            xdl0.W(list.get(0), t100.d(9.0f));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m11724d0() {
        xdl0.M(this.f9734E, false);
        xdl0.M(this.f9733D, false);
        xdl0.M(this.f9732C, false);
        xdl0.M(this.f9731B, false);
        xdl0.M(this.f9735F, false);
        xdl0.M(this.f9737H, false);
        xdl0.M(this.f9755s, false);
        xdl0.M(this.f9756t, false);
        xdl0.M(this.f9757u, false);
        xdl0.M(this.f9758v, false);
        xdl0.M(this.f9739J, false);
        xdl0.M(this.f9740K, false);
        xdl0.M(this.f9759w, false);
        this.f9750n.i0();
        this.f9753q.m8988b();
        this.f9742M = null;
        this.f9743N = null;
        this.f9741L.n0();
        this.f9761y.m8931e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m11725j0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).p3(3800, bLiveUserFamilyCard.schema);
        ((ryo0) ((LiveMenuDialogHolder) this).b).m21936z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m11726q0(View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).m24297Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m11727r0(View view) {
        m11732x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m11728s0(View view) {
        if (this.f9742M != null) {
            syo0.m22418c();
            ((ryo0) ((LiveMenuDialogHolder) this).b).m21929V4(this.f9744O.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m11729t0(View view) {
        User user = this.f9742M;
        if (user != null) {
            ((ryo0) ((LiveMenuDialogHolder) this).b).m21928U4(((DbObject) user).id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m11730u0(View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().FansClubEvent.showVoiceFansClubDialog().j(((DbObject) this.f9742M).id);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m11731v0(View view) {
        if (!NullChecker.a(this.f9744O.l()) || TextUtils.isEmpty(((DbObject) this.f9742M).id)) {
            return;
        }
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().IntlVoiceMedalWallEvent.showMedalWall().j(((DbObject) this.f9742M).id);
        p();
    }

    /* JADX INFO: renamed from: x0 */
    private void m11732x0() {
        if (this.f9742M == null) {
            return;
        }
        String strConcat = "@" + this.f9742M.name + " ";
        int length = strConcat.length();
        int i = jw4.E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((ryo0) ((LiveMenuDialogHolder) this).b).m21927T4(strConcat);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m11733A0(final p1k0 p1k0Var) {
        xdl0.M(this.f9756t, true);
        this.f9756t.m8981K(p1k0Var.p(), p1k0Var, p1k0Var.j().shadingFrontUrl, p1k0Var.j().shadingBackUrl, new d30() { // from class: l.pwo0
            public final void call() {
                this.f18945a.m11748i0(p1k0Var);
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public Context m11734C0() {
        return ((ryo0) ((LiveMenuDialogHolder) this).b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public void m11735D0() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f9743N;
        if (bLiveVoiceUserProfileConfig == null) {
            hfw.a("voiceUserCard", "config is null");
            return;
        }
        if (bLiveVoiceUserProfileConfig.bottomButtons.size() == 0) {
            hfw.a("voiceUserCard", "config.bottomButtons is empty");
            this.f9731B.setVisibility(8);
            return;
        }
        hfw.a("voiceUserCard", "bottom button:" + this.f9743N.userId);
        this.f9731B.setVisibility(0);
        for (int i = 0; i < this.f9743N.bottomButtons.size(); i++) {
            String str = (String) this.f9743N.bottomButtons.get(i);
            hfw.a("voiceUserCard", "render bottom button:" + str);
            str.getClass();
            switch (str) {
                case "follow":
                    ((ryo0) ((LiveMenuDialogHolder) this).b).mo16786X3(this.f9742M, this.f9743N.bottomButtons.size());
                    x6s x6sVar = ((LiveMenuDialogHolder) this).b;
                    vzo0.m23768d(x6sVar, ((ryo0) x6sVar).mo21933h4(), ((ryo0) ((LiveMenuDialogHolder) this).b).m21908B4(), ((ryo0) ((LiveMenuDialogHolder) this).b).R2());
                    break;
                case "at":
                    boolean zIsFemale = this.f9742M.isFemale();
                    VText vText = this.f9732C;
                    if (zIsFemale) {
                        vText.setText(ypv.f23200e.getString(R.string.Se));
                    } else {
                        vText.setText(ypv.f23200e.getString(R.string.Qe));
                    }
                    this.f9732C.setVisibility(0);
                    break;
                case "call":
                    m11759w0(this.f9745P);
                    break;
                case "sendGift":
                    xdl0.M(this.f9733D, true);
                    this.f9733D.setText(R.string.md);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m11736E0() {
        xdl0.M(this.f9730A, this.f9744O.v());
        if (this.f9744O.v()) {
            final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f9744O.g().maxRankHouseInfo;
            this.f9730A.m8701b(bLiveVoiceCpHouseInfo.houseBackground, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar);
            this.f9730A.m8702c(t100.d(75.0f), t100.d(75.0f));
            this.f9730A.f7140e.setOnClickListener(new View.OnClickListener() { // from class: l.nwo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17754a.m11750k0(bLiveVoiceCpHouseInfo, view);
                }
            });
            this.f9730A.f7142g.setOnClickListener(new View.OnClickListener() { // from class: l.owo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18269a.m11751l0(bLiveVoiceCpHouseInfo, view);
                }
            });
            if (bLiveVoiceCpHouseInfo.houseRank >= 9) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f9744O.g().profileVideoEffect);
                p1k0 p1k0Var = this.f9744O;
                if (!zIsEmpty) {
                    m11760y0(p1k0Var.g().profileVideoEffect);
                } else {
                    if (TextUtils.isEmpty(p1k0Var.g().profileEffectImage)) {
                        return;
                    }
                    xdl0.M(this.f9739J, true);
                    this.f9739J.g(this.f9744O.g().profileEffectImage, 1, new C0771a(), true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m11737G0(BLiveFansMemberNum bLiveFansMemberNum) {
        xdl0.M(this.f9758v, true);
        this.f9758v.v(bLiveFansMemberNum);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m11738H0(List<BLiveUserCardGiftWall> list) {
        xdl0.M(this.f9761y, true);
        final String strUserId = ((ryo0) ((LiveMenuDialogHolder) this).b).m21908B4().userId();
        this.f9761y.m8933h(((ryo0) ((LiveMenuDialogHolder) this).b).act(), list, new d30() { // from class: l.gwo0
            public final void call() {
                this.f13798a.m11753m0(strUserId);
            }
        }, new Action1() { // from class: l.hwo0
            public final void call(Object obj) {
                this.f14272a.m11755n0(strUserId, (String) obj);
            }
        });
        xdl0.E0(this.f9761y.f7430b, new View.OnClickListener() { // from class: l.iwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14845a.m11756o0(strUserId, view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final void m11739J0(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        xdl0.M(this.f9759w, true);
        this.f9759w.m8464v(bLiveIntlMedalWallInUserCard);
    }

    /* JADX INFO: renamed from: L0 */
    public void m11740L0(boolean z, p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        super.E();
        m11724d0();
        B(z);
        m11699B0(p1k0Var, bLiveVoiceCall);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m11741M0(String str) {
        if (((DbObject) ((User) this.f9744O.o().a)).id.equals(str)) {
            return;
        }
        p();
        x6s x6sVar = ((LiveMenuDialogHolder) this).b;
        u4n0.k(x6sVar, ((DbObject) ((ryo0) x6sVar).E2().l0()).id, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m11742a0(View view) {
        bxo0.a(this, view);
    }

    public Act act() {
        return ((ryo0) ((LiveMenuDialogHolder) this).b).act();
    }

    public void destroy() {
        if (isShowing()) {
            ((ryo0) ((LiveMenuDialogHolder) this).b).m21936z4();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m11744e0() {
        this.f9734E.setText(R.string.Gh);
        this.f9734E.setEnabled(false);
        this.f9734E.setBackgroundResource(i3c0.Y0);
        this.f9734E.setTextColor(((ryo0) ((LiveMenuDialogHolder) this).b).act().getResources().getColor(h1c0.j1));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m11745f0(View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).m21913G4(this.f9742M);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m11746g0(BLiveVoiceCall bLiveVoiceCall, View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).m21926S4(bLiveVoiceCall, ((DbObject) this.f9742M).id);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Boolean m11747h0() {
        return Boolean.valueOf(((LiveMenuDialogHolder) this).c.isShowing());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m11748i0(p1k0 p1k0Var) {
        if (p1k0Var.p() != null && p1k0Var.r().enableNewPrivilege && !TextUtils.equals(ypv.f23196a.m23619D0(), ((DbObject) ((User) p1k0Var.c.a)).id) && !TextUtils.isEmpty(p1k0Var.p().jumpScheme)) {
            ((ryo0) ((LiveMenuDialogHolder) this).b).p3(3800, p1k0Var.p().jumpScheme);
        } else {
            if (vdt.b(3) || !TextUtils.equals(((DbObject) ((User) p1k0Var.o().a)).id, ypv.f23196a.m23619D0())) {
                return;
            }
            this.f9756t.m8983P(p1k0Var.p());
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m11750k0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m11741M0(bLiveVoiceCpHouseInfo.userId);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m11751l0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m11741M0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    /* JADX INFO: renamed from: m */
    public void m11752m(View view) {
        m11742a0(view);
        z(LiveDialogEnum.USER_CARD);
        A(80);
        m11707K0();
        LiveUserCardSkinView liveUserCardSkinViewFindViewById = view.findViewById(g5c0.M7);
        this.f9741L = liveUserCardSkinViewFindViewById;
        liveUserCardSkinViewFindViewById.setDialogHost(this);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m11753m0(String str) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showMainPage().j(x2o0.m24680a(str, "profile"));
        p();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m11755n0(String str, String str2) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showMainPage().j(x2o0.m24680a(str, "profile"));
        w2o0 w2o0Var = new w2o0();
        w2o0Var.f21860b = str2;
        w2o0Var.f21859a = str;
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showGiftDetail().j(w2o0Var);
        p();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m11756o0(String str, View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).F2().VoiceNewGiftWallEvent.showMainPage().j(x2o0.m24680a(str, "profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m11757p0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((ryo0) ((LiveMenuDialogHolder) this).b).p3(3800, bLiveBoardGuard.schema);
    }

    /* JADX INFO: renamed from: w */
    public void m11758w() {
        super.w();
        if (this.f9739J.isAnimating()) {
            this.f9739J.o();
        }
        if (this.f9740K.isPlaying()) {
            this.f9740K.stop();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m11759w0(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f9742M == null || this.f9744O == null) {
            return;
        }
        xdl0.M0(this.f9734E, true);
        if (bLiveVoiceCall != null) {
            this.f9734E.setText(R.string.qi);
            this.f9734E.setEnabled(true);
            this.f9734E.setBackgroundResource(i3c0.c1);
            this.f9734E.setTextColor(((ryo0) ((LiveMenuDialogHolder) this).b).act().getResources().getColor(h1c0.w1));
            xdl0.E0(this.f9734E, new View.OnClickListener() { // from class: l.ywo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f23260a.m11746g0(bLiveVoiceCall, view);
                }
            });
            return;
        }
        if (this.f9744O.c(((DbObject) this.f9742M).id)) {
            m11744e0();
            return;
        }
        this.f9734E.setEnabled(true);
        this.f9734E.setText(R.string.K6);
        this.f9734E.setBackgroundResource(i3c0.c1);
        this.f9734E.setTextColor(((ryo0) ((LiveMenuDialogHolder) this).b).act().getResources().getColor(h1c0.w1));
        xdl0.E0(this.f9734E, new View.OnClickListener() { // from class: l.xwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22749a.m11745f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m11760y0(String str) {
        f6l0.n(this.f9740K, new dqe(String.valueOf(str)).m(new v9j() { // from class: l.rwo0
            public final Object call() {
                return this.f20012a.m11747h0();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m11761z0(p1k0 p1k0Var) {
        xdl0.M(this.f9757u, true);
        this.f9757u.m8964O(p1k0Var.d(), p1k0Var.e().shadingFrontUrl, p1k0Var.e().shadingBackUrl);
    }

    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m11754n(ryo0 ryo0Var) {
    }
}
