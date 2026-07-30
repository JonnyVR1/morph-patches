package p153l;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpHouseInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp.VirtualVoiceSpFriendHeadView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p051p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class k5m0<D extends rwn0> extends LiveMenuDialogHolder<w6m0<D>> {

    /* JADX INFO: renamed from: A */
    public VideoEffectPlayer f124080A;

    /* JADX INFO: renamed from: B */
    public AnimEffectPlayer f124081B;

    /* JADX INFO: renamed from: C */
    public LiveUserCardSkinView f124082C;

    /* JADX INFO: renamed from: D */
    public User f124083D;

    /* JADX INFO: renamed from: E */
    public BLiveVoiceUserProfileConfig f124084E;

    /* JADX INFO: renamed from: F */
    public vak0 f124085F;

    /* JADX INFO: renamed from: G */
    public nsv<User> f124086G;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f124087k;

    /* JADX INFO: renamed from: l */
    public View f124088l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f124089m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f124090n;

    /* JADX INFO: renamed from: o */
    public VirtualVoiceUserCardMedalAndNameView f124091o;

    /* JADX INFO: renamed from: p */
    public VoiceCardGiftWallView f124092p;

    /* JADX INFO: renamed from: q */
    public VirtualVoiceSpFriendHeadView f124093q;

    /* JADX INFO: renamed from: r */
    public VoiceVirtualUserCardMiddleView f124094r;

    /* JADX INFO: renamed from: s */
    public VirtualUserCardMatchView f124095s;

    /* JADX INFO: renamed from: t */
    public View f124096t;

    /* JADX INFO: renamed from: u */
    public VLinear f124097u;

    /* JADX INFO: renamed from: v */
    public VImage f124098v;

    /* JADX INFO: renamed from: w */
    public TextView f124099w;

    /* JADX INFO: renamed from: x */
    public VText f124100x;

    /* JADX INFO: renamed from: y */
    public View f124101y;

    /* JADX INFO: renamed from: z */
    public AnimEffectPlayer f124102z;

    /* JADX INFO: renamed from: l.k5m0$a */
    public class C18104a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f124103a;

        public C18104a(x20 x20Var) {
            this.f124103a = x20Var;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            this.f124103a.call();
            bnl0.m105524M(k5m0.this.f124102z, false);
        }
    }

    /* JADX INFO: renamed from: l.k5m0$b */
    public class C18105b extends AnimListener {
        public C18105b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            bnl0.m105524M(k5m0.this.f124081B, false);
        }
    }

    public k5m0(w6m0 w6m0Var) {
        super(yec0.f199145kb, w6m0Var.act(), w6m0Var, qag0.m175922c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m148412A0(View view) {
        ((w6m0) this.f48605b).m100211Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m148413B0(View view) {
        User user = this.f124083D;
        if (user != null) {
            ((w6m0) this.f48605b).m205164f5(user.f56859id);
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m148414E0() {
        if (this.f124083D == null) {
            return;
        }
        String strConcat = "@" + this.f124083D.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = ix4.f117314E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((w6m0) this.f48605b).m205163e5(strConcat);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m148415F(View view) {
    }

    /* JADX INFO: renamed from: K0 */
    private void m148421K0() {
        biv.m104517b(this.f124090n, qa00.m175859d(100.0f), this.f124086G, new qcj() { // from class: l.a5m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall().formatted();
            }
        });
        bnl0.m105524M(this.f124089m, true);
        boolean zM73304k0 = this.f124090n.m73304k0();
        FrameLayout frameLayout = this.f124089m;
        if (zM73304k0) {
            bnl0.m105537U(frameLayout, qa00.m175859d(2.0f));
            this.f124089m.setBackground(null);
            return;
        }
        bnl0.m105537U(frameLayout, qa00.m175859d(-6.0f));
        boolean zM119322d = e3t.m119319a(this.f124086G).m119322d();
        FrameLayout frameLayout2 = this.f124089m;
        if (zM119322d) {
            frameLayout2.setBackground(null);
        } else {
            frameLayout2.setBackgroundResource(obc0.f145998C8);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m148427P0() {
        this.f124088l.setOnClickListener(new View.OnClickListener() { // from class: l.h5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107953a.m148412A0(view);
            }
        });
        this.f124101y.setOnClickListener(new View.OnClickListener() { // from class: l.i5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k5m0.m148415F(view);
            }
        });
        bnl0.m105509E0(this.f124089m, new View.OnClickListener() { // from class: l.j5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118479a.m148413B0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private void m148441g0() {
        if (this.f124087k == null) {
            return;
        }
        bnl0.m105524M(this.f124097u, false);
        this.f124097u.removeAllViews();
        bnl0.m105524M(this.f124100x, false);
        this.f124090n.m73302i0();
        this.f124091o.m79914b();
        this.f124083D = null;
        this.f124084E = null;
        this.f124082C.m74496n0();
        this.f124092p.m79898e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m148442l0(View view) {
        m148458h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m148443m0(View view) {
        if (NullChecker.m82486a(this.f124083D)) {
            w7p0.m205358f();
            ((w6m0) this.f48605b).m205169k5(this.f124083D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m148444p0(View view) {
        ((w6m0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(((w6m0) this.f48605b).f187632m, "profile"));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((w6m0) this.f48605b).act();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public void m148445D0(VText vText) {
        String strM209910t;
        boolean z = false;
        if (this.f124083D == null || this.f124085F == null) {
            bnl0.m105524M(vText, false);
        }
        if (((rwn0) ((w6m0) this.f48605b).m213810E2()).m183411P2().m136873l(this.f124083D.f56859id) == null) {
            if (this.f124085F.m200528c(this.f124083D.f56859id)) {
                strM209910t = xau.m209910t(R$string.f47554Gh);
            } else {
                strM209910t = y6s.m214495c(((rwn0) ((w6m0) this.f48605b).m213810E2()).mo183435j().liveMode) ? "邀为嘉宾" : xau.m209910t(R$string.f47479D8);
            }
            vText.setText(strM209910t);
            vText.setEnabled(z);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.n4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140242a.m148460j0(view);
                }
            });
        }
        strM209910t = xau.m209910t(R$string.f48331qi);
        z = true;
        vText.setText(strM209910t);
        vText.setEnabled(z);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.n4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140242a.m148460j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m148446G0(String str, x20 x20Var) {
        String strValueOf = String.valueOf(str);
        this.f124080A.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        jfl0.m144685n(this.f124080A, new hre(strValueOf).m136830m(new pcj() { // from class: l.b5m0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f75078a.m148461k0();
            }
        }).m136826i(x20Var));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m148447H0(vak0 vak0Var, BLiveVoiceCall bLiveVoiceCall) {
        this.f124085F = vak0Var;
        this.f124083D = vak0Var == null ? null : vak0Var.f183108c.f143542a;
        this.f124086G = vak0Var == null ? null : vak0Var.f183108c;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM200543r = vak0Var != null ? vak0Var.m200543r() : null;
        this.f124084E = bLiveVoiceUserProfileConfigM200543r;
        User user = this.f124083D;
        if (user == null || bLiveVoiceUserProfileConfigM200543r == null) {
            bnl0.m105524M(this.f124100x, true);
            this.f124089m.setVisibility(8);
            return;
        }
        m148448I0();
        m148421K0();
        m148449J0(vak0Var, new x20() { // from class: l.q4m0
            @Override // p153l.x20
            public final void call() {
                this.f155603a.m148451M0();
            }
        });
        bnl0.m105524M(this.f124099w, true);
        if (TextUtils.equals(user.f56859id, zrv.f205799a.m207631D0())) {
            this.f124099w.setText("我的装扮");
            bnl0.m105509E0(this.f124099w, new View.OnClickListener() { // from class: l.r4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161217a.m148442l0(view);
                }
            });
        } else {
            w7p0.m205359g();
            this.f124099w.setText(String.format("%s的装扮", user.isFemale() ? "她" : "他"));
            bnl0.m105509E0(this.f124099w, new View.OnClickListener() { // from class: l.s4m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166255a.m148443m0(view);
                }
            });
        }
        m148452N0(vak0Var);
        List<BLiveUserCardGiftWall> listM200534i = vak0Var.m200534i();
        boolean zM147479J = jyb.m147479J(listM200534i);
        VoiceCardGiftWallView voiceCardGiftWallView = this.f124092p;
        if (zM147479J) {
            bnl0.m105524M(voiceCardGiftWallView, false);
            return;
        }
        bnl0.m105524M(voiceCardGiftWallView, true);
        this.f124092p.m79900h(((w6m0) this.f48605b).act(), listM200534i, new x20() { // from class: l.t4m0
            @Override // p153l.x20
            public final void call() {
                this.f172089a.m148462n0();
            }
        }, new Action1() { // from class: l.u4m0
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                this.f177475a.m148463o0((String) obj);
            }
        });
        bnl0.m105509E0(this.f124092p.f54672b, new View.OnClickListener() { // from class: l.v4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182385a.m148444p0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: I0 */
    public void m148448I0() {
        if (this.f124084E == null) {
            fhw.m125605a("voiceUserCard", "config is null");
            return;
        }
        this.f124097u.removeAllViews();
        if (this.f124084E.bottomButtons.size() == 0) {
            fhw.m125605a("voiceUserCard", "config.bottomButtons is empty");
            this.f124097u.setVisibility(8);
            return;
        }
        fhw.m125605a("voiceUserCard", "bottom button:" + this.f124084E.userId);
        this.f124097u.setVisibility(0);
        for (int i = 0; i < this.f124084E.bottomButtons.size(); i++) {
            String str = this.f124084E.bottomButtons.get(i);
            fhw.m125605a("voiceUserCard", "render bottom button:" + str);
            final VText vText = new VText(this.f124097u.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, bnl0.f77544e);
            vText.setTextSize(15.0f);
            vText.setGravity(17);
            layoutParams.weight = 1.0f;
            vText.setTextColor(Color.parseColor("#ccffffff"));
            vText.setLayoutParams(layoutParams);
            str.getClass();
            switch (str) {
                case "sayHello":
                    vText.setText("打招呼");
                    i4g0.m138492A("e_audio_greeting", "p_audio_profile", pf60.m172085a("anchorId", ((rwn0) ((w6m0) this.f48605b).m213810E2()).m168532l0().f56859id), pf60.m172085a("liveId", ((rwn0) ((w6m0) this.f48605b).m213810E2()).m202191k()), pf60.m172085a("receiver_user_id", this.f124083D.f56859id));
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.d5m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f85175a.m148467t0(view);
                        }
                    });
                    break;
                case "managerInvite":
                    m148450L0(vText);
                    break;
                case "at":
                    if (this.f124083D.isFemale()) {
                        vText.setText(zrv.f205803e.getString(R$string.f47808Se));
                    } else {
                        vText.setText(zrv.f205803e.getString(R$string.f47766Qe));
                    }
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.x4m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f192423a.m148465r0(view);
                        }
                    });
                    break;
                case "call":
                    m148445D0(vText);
                    break;
                case "like":
                    m148453O0(vText, this.f124084E.relationState);
                    i4g0.m138492A("e_audio_like", "p_audio_profile", pf60.m172085a("anchorId", ((rwn0) ((w6m0) this.f48605b).m213810E2()).m168532l0().f56859id), pf60.m172085a("liveId", ((rwn0) ((w6m0) this.f48605b).m213810E2()).m202191k()), pf60.m172085a("receiver_user_id", this.f124083D.f56859id));
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.e5m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f92222a.m148468u0(vText, view);
                        }
                    });
                    break;
                case "more":
                    vText.setText("更多");
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.g5m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f102337a.m148470w0(view);
                        }
                    });
                    break;
                case "realNamePrivateChat":
                    vText.setText("私聊");
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.f5m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f97269a.m148469v0(view);
                        }
                    });
                    break;
                case "sendGift":
                    if (TextUtils.equals(this.f124083D.f56859id, zrv.f205799a.m207631D0())) {
                        vText.setText(R$string.f48392td);
                    } else {
                        vText.setText(R$string.f48238md);
                    }
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.m4m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f134815a.m148464q0(view);
                        }
                    });
                    break;
                case "privateChat":
                    i4g0.m138492A("e_anonymous_chat_button", "p_audio_profile", pf60.m172085a("receiver_user_id", this.f124083D.f56859id), pf60.m172085a("message_from", "AudioProfileCard"));
                    vText.setText("私聊");
                    bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.c5m0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f79886a.m148466s0(view);
                        }
                    });
                    break;
            }
            this.f124097u.addView(vText);
            if (this.f124084E.bottomButtons.size() > 1 && i != this.f124084E.bottomButtons.size() - 1) {
                View view = new View(this.f124097u.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(qa00.f156314a, qa00.f156326m);
                layoutParams2.gravity = 16;
                view.setLayoutParams(layoutParams2);
                view.setBackgroundColor(Color.parseColor("#0cffffff"));
                this.f124097u.addView(view);
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m148449J0(vak0 vak0Var, x20 x20Var) {
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = vak0Var.m200543r().sweetCpCard.sweetCp;
        if ((TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileEffect) && TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileVideoEffect)) || TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileAvatarEffect)) {
            bnl0.m105524M(this.f124102z, false);
            bnl0.m105524M(this.f124081B, false);
            bnl0.m105524M(this.f124080A, false);
            x20Var.call();
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileVideoEffect);
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = bLiveVirtualVoiceCpInfo.currentHouse;
        if (!zIsEmpty) {
            m148446G0(bLiveVirtualVoiceCpHouseInfo.profileVideoEffect, x20Var);
        } else if (!TextUtils.isEmpty(bLiveVirtualVoiceCpHouseInfo.profileEffect)) {
            bnl0.m105524M(this.f124102z, true);
            this.f124102z.m69681h(bLiveVirtualVoiceCpInfo.currentHouse.profileEffect, 1, new C18104a(x20Var), true, false);
        }
        bnl0.m105524M(this.f124081B, true);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(bLiveVirtualVoiceCpInfo.meUser.avatar, "head01");
        sVGADynamicEntity.setDynamicImage(bLiveVirtualVoiceCpInfo.otherUser.avatar, "head02");
        SVGALoader.with(((w6m0) this.f48605b).act()).from(bLiveVirtualVoiceCpInfo.currentHouse.profileAvatarEffect).frameMode(SVGAnimationView.FrameMode.AFTER).isCacheable(false).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C18105b()).repeatCount(1).into(this.f124081B);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m148450L0(VText vText) {
        List list = (List) ((w6m0) this.f48605b).m138856F3(new x5o0(3800));
        final String str = this.f124085F.m200540o().f143542a.f56859id;
        final boolean zM147520m = jyb.m147520m(list, new qcj() { // from class: l.o4m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceManager) obj).userId.equals(str));
            }
        });
        vText.setText(zM147520m ? xau.m209910t(R$string.f48043df) : xau.m209910t(R$string.f48218lf));
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.p4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150547a.m148471x0(zM147520m, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final void m148451M0() {
        this.f124082C.m74506y0(this.f124086G, this.f124088l);
        LiveUserCardSkinView liveUserCardSkinView = this.f124082C;
        FrameLayout frameLayout = this.f124089m;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f124084E;
        liveUserCardSkinView.m74494D0(frameLayout, bLiveVoiceUserProfileConfig != null && bLiveVoiceUserProfileConfig.enableNewPrivilege);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m148452N0(final vak0 vak0Var) {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM200543r = vak0Var.m200543r();
        if (bLiveVoiceUserProfileConfigM200543r == null) {
            return;
        }
        bnl0.m105525M0(this.f124096t, bLiveVoiceUserProfileConfigM200543r.payGuideConfig == null && bLiveVoiceUserProfileConfigM200543r.payGuideInfo == null);
        this.f124095s.m78746s(vak0Var, this.f48605b, vak0Var.f183108c.f143542a.f56859id);
        bnl0.m105509E0(this.f124095s._apply_layout, new View.OnClickListener() { // from class: l.y4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197483a.m148473z0(vak0Var, view);
            }
        });
        bnl0.m105509E0(this.f124095s._accept_layout_accept_button, new View.OnClickListener() { // from class: l.z4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202965a.m148472y0(vak0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m148453O0(VText vText, String str) {
        if (TextUtils.equals(str, "liking")) {
            vText.setText("已喜欢");
            bnl0.m105524M(vText, true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
        } else {
            vText.setText("喜欢");
            vText.setTextColor(Color.parseColor("#ff8817"));
            if (TextUtils.equals(str, "likeMatched")) {
                bnl0.m105524M(vText, false);
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m148454Q0(boolean z, vak0 vak0Var, BLiveVoiceCall bLiveVoiceCall) {
        m148441g0();
        m73015B(false);
        m73017E();
        m148447H0(vak0Var, bLiveVoiceCall);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((w6m0) this.f48605b).act();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m148455d0(View view) {
        l5m0.m152974a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public void destroy() {
        if (isShowing()) {
            ((w6m0) this.f48605b).m205144J4();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m148457f0() {
        String strM103845w = bf10.m103845w(this.f124085F.m200540o().f143542a.name, 5);
        String strM209911u = xau.m209911u(R$string.f47977af, strM103845w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM209911u);
        int iIndexOf = strM209911u.indexOf(strM103845w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM103845w.length() + iIndexOf, 33);
        }
        new th0.C20312a(getContext()).m191151j(spannableStringBuilder).m191158q(R$string.f48021cf).m191156o(new View.OnClickListener() { // from class: l.w4m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187417a.m148459i0(view);
            }
        }).m191146e(R$string.f47999bf).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: h0 */
    public void m148458h0() {
        ((w6m0) this.f48605b).m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e("tantanapp://voice-live/room/showUserVoiceRightsPage").m103152c());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m148459i0(View view) {
        ((w6m0) this.f48605b).m205142H4(this.f124085F.m200540o().f143542a);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m148460j0(View view) {
        ((w6m0) this.f48605b).m205143I4(this.f124083D);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m148461k0() {
        return Boolean.valueOf(this.f48606c.isShowing());
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        m148455d0(view);
        m73027z(LiveDialogEnum.USER_CARD);
        m73014A(80);
        m148427P0();
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(mdc0.f135999M7);
        this.f124082C = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m148462n0() {
        ((w6m0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(((w6m0) this.f48605b).f187632m, "profile"));
        mo73021p();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m148463o0(String str) {
        ((w6m0) this.f48605b).m213811F2().VoiceNewGiftWallEvent.showMainPage().mo199273j(bco0.m103544a(((w6m0) this.f48605b).f187632m, "profile"));
        aco0 aco0Var = new aco0();
        aco0Var.f69735b = str;
        T t = this.f48605b;
        aco0Var.f69734a = ((w6m0) t).f187632m;
        ((w6m0) t).m213811F2().VoiceNewGiftWallEvent.showGiftDetail().mo199273j(aco0Var);
        mo73021p();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m148464q0(View view) {
        if (this.f124083D != null) {
            w7p0.m205355c();
            ((w6m0) this.f48605b).m205172n5(this.f124085F.f183108c);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m148465r0(View view) {
        m148414E0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m148466s0(View view) {
        User user = this.f124083D;
        if (user != null) {
            ((w6m0) this.f48605b).m205166h5(user.f56859id);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m148467t0(View view) {
        User user = this.f124083D;
        if (user != null) {
            ((w6m0) this.f48605b).m205168j5(user.f56859id);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m148468u0(VText vText, View view) {
        User user = this.f124083D;
        if (user != null) {
            ((w6m0) this.f48605b).m205165g5(vText, user.f56859id, this.f124084E.relationState);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m148469v0(View view) {
        User user = this.f124083D;
        if (user != null) {
            ((w6m0) this.f48605b).m205167i5(user.f56859id);
        } else {
            fhw.m125605a("voiceUserCard", "currentUser is null");
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        if (this.f124102z.isAnimating()) {
            this.f124102z.m69688o();
        }
        bnl0.m105524M(this.f124102z, false);
        this.f124095s.m78747u();
        this.f124080A.stop();
        bnl0.m105524M(this.f124080A, false);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m148470w0(View view) {
        if (this.f124083D != null) {
            ((w6m0) this.f48605b).m205175q5();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m148471x0(boolean z, String str, View view) {
        if (z) {
            m148457f0();
        } else {
            ((w6m0) this.f48605b).m205149O4(str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m148472y0(vak0 vak0Var, View view) {
        ((w6m0) this.f48605b).m205140F4(vak0Var.m200543r().payGuideInfo);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m148473z0(vak0 vak0Var, View view) {
        ((w6m0) this.f48605b).m205141G4(vak0Var.m200543r().payGuideConfig);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w6m0 w6m0Var) {
    }
}
