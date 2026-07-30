package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveBoardGuard;
import com.p046p1.mobile.putong.live.base.data.BLiveFansMemberNum;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlMedalWallInUserCard;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p046p1.mobile.putong.live.base.data.BLiveUserFamilyCard;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase.VoiceCardFanBaseEnterView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.medalwall.VoiceCardMedalWallEnterView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view.VoiceSweetCpHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.UserCardFamilyGroupView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardAnchorLevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceCardUserLevelView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardMedalAndNameView;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.nnn0;

/* JADX INFO: loaded from: classes11.dex */
public class axo0<D extends nnn0> extends LiveMenuDialogHolder<ryo0<D>> {

    /* JADX INFO: renamed from: A */
    public VoiceSweetCpHeadView f72197A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f72198B;

    /* JADX INFO: renamed from: C */
    public VText f72199C;

    /* JADX INFO: renamed from: D */
    public VText f72200D;

    /* JADX INFO: renamed from: E */
    public VText f72201E;

    /* JADX INFO: renamed from: F */
    public VText f72202F;

    /* JADX INFO: renamed from: G */
    public VImage f72203G;

    /* JADX INFO: renamed from: H */
    public VText f72204H;

    /* JADX INFO: renamed from: I */
    public View f72205I;

    /* JADX INFO: renamed from: J */
    public AnimEffectPlayer f72206J;

    /* JADX INFO: renamed from: K */
    public VideoEffectPlayer f72207K;

    /* JADX INFO: renamed from: L */
    public LiveUserCardSkinView f72208L;

    /* JADX INFO: renamed from: M */
    public User f72209M;

    /* JADX INFO: renamed from: N */
    public BLiveVoiceUserProfileConfig f72210N;

    /* JADX INFO: renamed from: O */
    public p1k0 f72211O;

    /* JADX INFO: renamed from: P */
    public BLiveVoiceCall f72212P;

    /* JADX INFO: renamed from: Q */
    public mqv<User> f72213Q;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f72214k;

    /* JADX INFO: renamed from: l */
    public View f72215l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f72216m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f72217n;

    /* JADX INFO: renamed from: o */
    public VImage f72218o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f72219p;

    /* JADX INFO: renamed from: q */
    public VoiceUserCardMedalAndNameView f72220q;

    /* JADX INFO: renamed from: r */
    public VFrame f72221r;

    /* JADX INFO: renamed from: s */
    public VLinear f72222s;

    /* JADX INFO: renamed from: t */
    public VoiceCardUserLevelView f72223t;

    /* JADX INFO: renamed from: u */
    public VoiceCardAnchorLevelView f72224u;

    /* JADX INFO: renamed from: v */
    public VoiceCardFanBaseEnterView f72225v;

    /* JADX INFO: renamed from: w */
    public VoiceCardMedalWallEnterView f72226w;

    /* JADX INFO: renamed from: x */
    public UserCardFamilyGroupView f72227x;

    /* JADX INFO: renamed from: y */
    public VoiceCardGiftWallView f72228y;

    /* JADX INFO: renamed from: z */
    public LinearLayout f72229z;

    /* JADX INFO: renamed from: l.axo0$a */
    public class C15755a extends ap0 {
        public C15755a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(axo0.this.f72206J, false);
        }
    }

    public axo0(Act act, ryo0 ryo0Var) {
        super(t6c0.f167966A6, act, ryo0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: renamed from: B0 */
    private void m99456B0(p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        this.f72212P = bLiveVoiceCall;
        this.f72211O = p1k0Var;
        this.f72209M = p1k0Var == null ? null : p1k0Var.f146688c.f135304a;
        this.f72213Q = p1k0Var == null ? null : p1k0Var.f146688c;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM167098r = p1k0Var != null ? p1k0Var.m167098r() : null;
        this.f72210N = bLiveVoiceUserProfileConfigM167098r;
        if (this.f72209M == null || bLiveVoiceUserProfileConfigM167098r == null) {
            xdl0.m208344M(this.f72204H, true);
            this.f72216m.setVisibility(8);
            return;
        }
        m99491D0();
        m99461I0();
        ArrayList arrayList = new ArrayList();
        if (ypv.m215672k().m195959u7() && p1k0Var.m167090j() != null && !p1k0Var.m167101u()) {
            m99490A0(p1k0Var);
            arrayList.add(this.f72223t);
        }
        if (p1k0Var.m167084d() != null && p1k0Var.m167084d().grade >= 0 && p1k0Var.m167101u()) {
            m99513z0(p1k0Var);
            arrayList.add(this.f72224u);
        }
        m99493G0(p1k0Var.m167097q());
        arrayList.add(this.f72225v);
        final BLiveUserFamilyCard bLiveUserFamilyCardM167088h = p1k0Var.m167088h();
        if (bLiveUserFamilyCardM167088h != null && !TextUtils.isEmpty(bLiveUserFamilyCardM167088h.schema)) {
            this.f72227x.m78728j0(bLiveUserFamilyCardM167088h);
            arrayList.add(this.f72227x);
            xdl0.m208329E0(this.f72227x, new View.OnClickListener() { // from class: l.zwo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205248a.m99482j0(bLiveUserFamilyCardM167088h, view);
                }
            });
        } else if (p1k0Var.m167103w()) {
            m99495J0(p1k0Var.m167092l());
            arrayList.add(this.f72226w);
        }
        m99480c0(arrayList);
        xdl0.m208344M(this.f72222s, arrayList.size() > 0);
        this.f72208L.m73323y0(this.f72213Q, this.f72215l);
        LiveUserCardSkinView liveUserCardSkinView = this.f72208L;
        FrameLayout frameLayout = this.f72216m;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f72210N;
        liveUserCardSkinView.m73311D0(frameLayout, bLiveVoiceUserProfileConfig != null && bLiveVoiceUserProfileConfig.enableNewPrivilege);
        m99492E0();
        List<BLiveUserCardGiftWall> listM167089i = p1k0Var.m167089i();
        if (vwb.m200296J(listM167089i)) {
            xdl0.m208344M(this.f72228y, false);
        } else {
            m99494H0(listM167089i);
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m99461I0() {
        agv.m96344b(this.f72217n, t100.m186890d(100.0f), this.f72213Q, new w9j() { // from class: l.lwo0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        xdl0.m208344M(this.f72216m, true);
        boolean zM72121k0 = this.f72217n.m72121k0();
        FrameLayout frameLayout = this.f72216m;
        if (zM72121k0) {
            xdl0.m208357U(frameLayout, t100.m186890d(2.0f));
            this.f72216m.setBackground(null);
            xdl0.m208344M(this.f72218o, false);
        } else {
            xdl0.m208357U(frameLayout, t100.m186890d(-6.0f));
            boolean zM109681d = d1t.m109678a(this.f72213Q).m109681d();
            FrameLayout frameLayout2 = this.f72216m;
            if (zM109681d) {
                frameLayout2.setBackground(null);
                xdl0.m208344M(this.f72218o, false);
            } else {
                frameLayout2.setBackgroundResource(i3c0.f110670C8);
                xdl0.m208344M(this.f72218o, true);
                ypv.f199493a.m199371s0(this.f72218o.getContext(), this.f72209M, this.f72218o);
            }
        }
        final BLiveBoardGuard bLiveBoardGuardM167086f = this.f72211O.m167086f();
        CommonMaskAvatarView commonMaskAvatarView = this.f72219p;
        if (bLiveBoardGuardM167086f == null) {
            xdl0.m208344M(commonMaskAvatarView, false);
            return;
        }
        xdl0.m208344M(commonMaskAvatarView, true);
        agv.m96349g(this.f72219p, t100.m186890d(48.0f), bLiveBoardGuardM167086f.userAvatar, bLiveBoardGuardM167086f.userAvatarFrame, "");
        xdl0.m208329E0(this.f72219p, new View.OnClickListener() { // from class: l.mwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136075a.m99510p0(bLiveBoardGuardM167086f, view);
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    private void m99464K0() {
        this.f72215l.setOnClickListener(new View.OnClickListener() { // from class: l.fwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99675a.m99483q0(view);
            }
        });
        xdl0.m208329E0(this.f72199C, new View.OnClickListener() { // from class: l.qwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156746a.m99484r0(view);
            }
        });
        xdl0.m208329E0(this.f72200D, new View.OnClickListener() { // from class: l.swo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166707a.m99485s0(view);
            }
        });
        this.f72205I.setOnClickListener(new View.OnClickListener() { // from class: l.two0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                axo0.m99469P(view);
            }
        });
        xdl0.m208329E0(this.f72216m, new View.OnClickListener() { // from class: l.uwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178665a.m99486t0(view);
            }
        });
        xdl0.m208329E0(this.f72225v, new View.OnClickListener() { // from class: l.vwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183361a.m99487u0(view);
            }
        });
        xdl0.m208329E0(this.f72226w, new View.OnClickListener() { // from class: l.wwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188396a.m99488v0(view);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m99469P(View view) {
    }

    /* JADX INFO: renamed from: c0 */
    private void m99480c0(List<View> list) {
        if (list.size() == 3) {
            final float fM208412y0 = (xdl0.m208412y0() - t100.m186890d(58.0f)) / 3.0f;
            vwb.m200354z(list, new e30() { // from class: l.jwo0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((View) obj).setLayoutParams(new LinearLayout.LayoutParams((int) fM208412y0, t100.m186890d(56.0f)));
                }
            });
            xdl0.m208358V(list.get(1), t100.m186890d(9.0f));
            xdl0.m208359W(list.get(1), t100.m186890d(9.0f));
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.kwo0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((View) obj).setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(106.0f), t100.m186890d(56.0f)));
            }
        });
        if (list.size() > 1) {
            xdl0.m208359W(list.get(0), t100.m186890d(9.0f));
        }
    }

    /* JADX INFO: renamed from: d0 */
    private void m99481d0() {
        xdl0.m208344M(this.f72201E, false);
        xdl0.m208344M(this.f72200D, false);
        xdl0.m208344M(this.f72199C, false);
        xdl0.m208344M(this.f72198B, false);
        xdl0.m208344M(this.f72202F, false);
        xdl0.m208344M(this.f72204H, false);
        xdl0.m208344M(this.f72222s, false);
        xdl0.m208344M(this.f72223t, false);
        xdl0.m208344M(this.f72224u, false);
        xdl0.m208344M(this.f72225v, false);
        xdl0.m208344M(this.f72206J, false);
        xdl0.m208344M(this.f72207K, false);
        xdl0.m208344M(this.f72226w, false);
        this.f72217n.m72119i0();
        this.f72220q.m78772b();
        this.f72209M = null;
        this.f72210N = null;
        this.f72208L.m73313n0();
        this.f72228y.m78715e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public /* synthetic */ void m99482j0(BLiveUserFamilyCard bLiveUserFamilyCard, View view) {
        ((ryo0) this.f47757b).mo129310p3(3800, bLiveUserFamilyCard.schema);
        ((ryo0) this.f47757b).m181709z4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m99483q0(View view) {
        ((ryo0) this.f47757b).m203470Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m99484r0(View view) {
        m99489x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public /* synthetic */ void m99485s0(View view) {
        if (this.f72209M != null) {
            syo0.m186712c();
            ((ryo0) this.f47757b).m181703V4(this.f72211O.f146688c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public /* synthetic */ void m99486t0(View view) {
        User user = this.f72209M;
        if (user != null) {
            ((ryo0) this.f47757b).m181702U4(user.f56011id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m99487u0(View view) {
        ((ryo0) this.f47757b).m206028F2().FansClubEvent.showVoiceFansClubDialog().mo172463j(this.f72209M.f56011id);
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public /* synthetic */ void m99488v0(View view) {
        if (!NullChecker.m81303a(this.f72211O.m167092l()) || TextUtils.isEmpty(this.f72209M.f56011id)) {
            return;
        }
        ((ryo0) this.f47757b).m206028F2().IntlVoiceMedalWallEvent.showMedalWall().mo172463j(this.f72209M.f56011id);
        mo71838p();
    }

    /* JADX INFO: renamed from: x0 */
    private void m99489x0() {
        if (this.f72209M == null) {
            return;
        }
        String strConcat = "@" + this.f72209M.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = jw4.f120018E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((ryo0) this.f47757b).m181701T4(strConcat);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m99490A0(final p1k0 p1k0Var) {
        xdl0.m208344M(this.f72223t, true);
        this.f72223t.m78765K(p1k0Var.m167096p(), p1k0Var, p1k0Var.m167090j().shadingFrontUrl, p1k0Var.m167090j().shadingBackUrl, new d30() { // from class: l.pwo0
            @Override // p149l.d30
            public final void call() {
                this.f151587a.m99504i0(p1k0Var);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((ryo0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: D0 */
    public void m99491D0() {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f72210N;
        if (bLiveVoiceUserProfileConfig == null) {
            hfw.m130790a("voiceUserCard", "config is null");
            return;
        }
        if (bLiveVoiceUserProfileConfig.bottomButtons.size() == 0) {
            hfw.m130790a("voiceUserCard", "config.bottomButtons is empty");
            this.f72198B.setVisibility(8);
            return;
        }
        hfw.m130790a("voiceUserCard", "bottom button:" + this.f72210N.userId);
        this.f72198B.setVisibility(0);
        for (int i = 0; i < this.f72210N.bottomButtons.size(); i++) {
            String str = this.f72210N.bottomButtons.get(i);
            hfw.m130790a("voiceUserCard", "render bottom button:" + str);
            str.getClass();
            switch (str) {
                case "follow":
                    ((ryo0) this.f47757b).mo138880X3(this.f72209M, this.f72210N.bottomButtons.size());
                    T t = this.f47757b;
                    vzo0.m200777d(t, ((ryo0) t).mo181707h4(), ((ryo0) this.f47757b).m181684B4(), ((ryo0) this.f47757b).mo77274R2());
                    break;
                case "at":
                    boolean zIsFemale = this.f72209M.isFemale();
                    VText vText = this.f72199C;
                    if (zIsFemale) {
                        vText.setText(ypv.f199497e.getString(R$string.f46960Se));
                    } else {
                        vText.setText(ypv.f199497e.getString(R$string.f46918Qe));
                    }
                    this.f72199C.setVisibility(0);
                    break;
                case "call":
                    m99511w0(this.f72212P);
                    break;
                case "sendGift":
                    xdl0.m208344M(this.f72200D, true);
                    this.f72200D.setText(R$string.f47390md);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m99492E0() {
        xdl0.m208344M(this.f72197A, this.f72211O.m167102v());
        if (this.f72211O.m167102v()) {
            final BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo = this.f72211O.m167087g().maxRankHouseInfo;
            this.f72197A.m78492b(bLiveVoiceCpHouseInfo.houseBackground, bLiveVoiceCpHouseInfo.houseImage, "LV." + bLiveVoiceCpHouseInfo.houseRank + bLiveVoiceCpHouseInfo.houseName, bLiveVoiceCpHouseInfo.meUserAvatar, bLiveVoiceCpHouseInfo.cpUserAvatar);
            this.f72197A.m78493c(t100.m186890d(75.0f), t100.m186890d(75.0f));
            this.f72197A.f53534e.setOnClickListener(new View.OnClickListener() { // from class: l.nwo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140959a.m99505k0(bLiveVoiceCpHouseInfo, view);
                }
            });
            this.f72197A.f53536g.setOnClickListener(new View.OnClickListener() { // from class: l.owo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f146074a.m99506l0(bLiveVoiceCpHouseInfo, view);
                }
            });
            if (bLiveVoiceCpHouseInfo.houseRank >= 9) {
                boolean zIsEmpty = TextUtils.isEmpty(this.f72211O.m167087g().profileVideoEffect);
                p1k0 p1k0Var = this.f72211O;
                if (!zIsEmpty) {
                    m99512y0(p1k0Var.m167087g().profileVideoEffect);
                } else {
                    if (TextUtils.isEmpty(p1k0Var.m167087g().profileEffectImage)) {
                        return;
                    }
                    xdl0.m208344M(this.f72206J, true);
                    this.f72206J.mo68497g(this.f72211O.m167087g().profileEffectImage, 1, new C15755a(), true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: G0 */
    public final void m99493G0(BLiveFansMemberNum bLiveFansMemberNum) {
        xdl0.m208344M(this.f72225v, true);
        this.f72225v.m78144v(bLiveFansMemberNum);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m99494H0(List<BLiveUserCardGiftWall> list) {
        xdl0.m208344M(this.f72228y, true);
        final String strUserId = ((ryo0) this.f47757b).m181684B4().userId();
        this.f72228y.m78717h(((ryo0) this.f47757b).act(), list, new d30() { // from class: l.gwo0
            @Override // p149l.d30
            public final void call() {
                this.f104753a.m99507m0(strUserId);
            }
        }, new Action1() { // from class: l.hwo0
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                this.f109777a.m99508n0(strUserId, (String) obj);
            }
        });
        xdl0.m208329E0(this.f72228y.f53824b, new View.OnClickListener() { // from class: l.iwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115288a.m99509o0(strUserId, view);
            }
        });
    }

    /* JADX INFO: renamed from: J0 */
    public final void m99495J0(BLiveIntlMedalWallInUserCard bLiveIntlMedalWallInUserCard) {
        xdl0.m208344M(this.f72226w, true);
        this.f72226w.m78275v(bLiveIntlMedalWallInUserCard);
    }

    /* JADX INFO: renamed from: L0 */
    public void m99496L0(boolean z, p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        super.m71834E();
        m99481d0();
        m71832B(z);
        m99456B0(p1k0Var, bLiveVoiceCall);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public final void m99497M0(String str) {
        if (this.f72211O.m167095o().f135304a.f56011id.equals(str)) {
            return;
        }
        mo71838p();
        T t = this.f47757b;
        u4n0.m191752k(t, ((nnn0) ((ryo0) t).m206027E2()).m132146l0().f56011id, str);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m99498a0(View view) {
        bxo0.m104368a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((ryo0) this.f47757b).act();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        if (isShowing()) {
            ((ryo0) this.f47757b).m181709z4();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m99500e0() {
        this.f72201E.setText(R$string.f46706Gh);
        this.f72201E.setEnabled(false);
        this.f72201E.setBackgroundResource(i3c0.f110916Y0);
        this.f72201E.setTextColor(((ryo0) this.f47757b).act().getResources().getColor(h1c0.f105377j1));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m99501f0(View view) {
        ((ryo0) this.f47757b).m181689G4(this.f72209M);
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m99502g0(BLiveVoiceCall bLiveVoiceCall, View view) {
        ((ryo0) this.f47757b).m181700S4(bLiveVoiceCall, this.f72209M.f56011id);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ Boolean m99503h0() {
        return Boolean.valueOf(this.f47758c.isShowing());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m99504i0(p1k0 p1k0Var) {
        if (p1k0Var.m167096p() != null && p1k0Var.m167098r().enableNewPrivilege && !TextUtils.equals(ypv.f199493a.m199309D0(), p1k0Var.f146688c.f135304a.f56011id) && !TextUtils.isEmpty(p1k0Var.m167096p().jumpScheme)) {
            ((ryo0) this.f47757b).mo129310p3(3800, p1k0Var.m167096p().jumpScheme);
        } else {
            if (vdt.m198092b(3) || !TextUtils.equals(p1k0Var.m167095o().f135304a.f56011id, ypv.f199493a.m199309D0())) {
                return;
            }
            this.f72223t.m78767P(p1k0Var.m167096p());
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m99505k0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m99497M0(bLiveVoiceCpHouseInfo.userId);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m99506l0(BLiveVoiceCpHouseInfo bLiveVoiceCpHouseInfo, View view) {
        m99497M0(bLiveVoiceCpHouseInfo.otherUserId);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m99498a0(view);
        m71844z(LiveDialogEnum.USER_CARD);
        m71831A(80);
        m99464K0();
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(g5c0.f100754M7);
        this.f72208L = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m99507m0(String str) {
        ((ryo0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(str, "profile"));
        mo71838p();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m99508n0(String str, String str2) {
        ((ryo0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(str, "profile"));
        w2o0 w2o0Var = new w2o0();
        w2o0Var.f184266b = str2;
        w2o0Var.f184265a = str;
        ((ryo0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showGiftDetail().mo172463j(w2o0Var);
        mo71838p();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m99509o0(String str, View view) {
        ((ryo0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(str, "profile"));
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m99510p0(BLiveBoardGuard bLiveBoardGuard, View view) {
        ((ryo0) this.f47757b).mo129310p3(3800, bLiveBoardGuard.schema);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        if (this.f72206J.isAnimating()) {
            this.f72206J.m68505o();
        }
        if (this.f72207K.isPlaying()) {
            this.f72207K.stop();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m99511w0(final BLiveVoiceCall bLiveVoiceCall) {
        if (this.f72209M == null || this.f72211O == null) {
            return;
        }
        xdl0.m208345M0(this.f72201E, true);
        if (bLiveVoiceCall != null) {
            this.f72201E.setText(R$string.f47483qi);
            this.f72201E.setEnabled(true);
            this.f72201E.setBackgroundResource(i3c0.f110963c1);
            this.f72201E.setTextColor(((ryo0) this.f47757b).act().getResources().getColor(h1c0.f105416w1));
            xdl0.m208329E0(this.f72201E, new View.OnClickListener() { // from class: l.ywo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f200518a.m99502g0(bLiveVoiceCall, view);
                }
            });
            return;
        }
        if (this.f72211O.m167083c(this.f72209M.f56011id)) {
            m99500e0();
            return;
        }
        this.f72201E.setEnabled(true);
        this.f72201E.setText(R$string.f46783K6);
        this.f72201E.setBackgroundResource(i3c0.f110963c1);
        this.f72201E.setTextColor(((ryo0) this.f47757b).act().getResources().getColor(h1c0.f105416w1));
        xdl0.m208329E0(this.f72201E, new View.OnClickListener() { // from class: l.xwo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194748a.m99501f0(view);
            }
        });
    }

    /* JADX INFO: renamed from: y0 */
    public final void m99512y0(String str) {
        f6l0.m119627n(this.f72207K, new dqe(String.valueOf(str)).m113019m(new v9j() { // from class: l.rwo0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f161362a.m99503h0();
            }
        }));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m99513z0(p1k0 p1k0Var) {
        xdl0.m208344M(this.f72224u, true);
        this.f72224u.m78748O(p1k0Var.m167084d(), p1k0Var.m167085e().shadingFrontUrl, p1k0Var.m167085e().shadingBackUrl);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ryo0 ryo0Var) {
    }
}
