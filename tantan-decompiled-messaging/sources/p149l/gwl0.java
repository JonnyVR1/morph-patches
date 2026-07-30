package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveUserCardGiftWall;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpHouseInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVirtualVoiceCpInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileConfig;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.view.LiveUserCardSkinView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.friend.VirtualUserCardMatchView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp.VirtualVoiceSpFriendHeadView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall.VoiceCardGiftWallView;
import com.p046p1.mobile.putong.live.livingroom.voice.usercard.view.VirtualVoiceUserCardMedalAndNameView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.download.Action1;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class gwl0<D extends nnn0> extends LiveMenuDialogHolder<sxl0<D>> {

    /* JADX INFO: renamed from: A */
    public VideoEffectPlayer f104719A;

    /* JADX INFO: renamed from: B */
    public AnimEffectPlayer f104720B;

    /* JADX INFO: renamed from: C */
    public LiveUserCardSkinView f104721C;

    /* JADX INFO: renamed from: D */
    public User f104722D;

    /* JADX INFO: renamed from: E */
    public BLiveVoiceUserProfileConfig f104723E;

    /* JADX INFO: renamed from: F */
    public p1k0 f104724F;

    /* JADX INFO: renamed from: G */
    public mqv<User> f104725G;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f104726k;

    /* JADX INFO: renamed from: l */
    public View f104727l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f104728m;

    /* JADX INFO: renamed from: n */
    public CommonMaskAvatarView f104729n;

    /* JADX INFO: renamed from: o */
    public VirtualVoiceUserCardMedalAndNameView f104730o;

    /* JADX INFO: renamed from: p */
    public VoiceCardGiftWallView f104731p;

    /* JADX INFO: renamed from: q */
    public VirtualVoiceSpFriendHeadView f104732q;

    /* JADX INFO: renamed from: r */
    public VoiceVirtualUserCardMiddleView f104733r;

    /* JADX INFO: renamed from: s */
    public VirtualUserCardMatchView f104734s;

    /* JADX INFO: renamed from: t */
    public View f104735t;

    /* JADX INFO: renamed from: u */
    public VLinear f104736u;

    /* JADX INFO: renamed from: v */
    public VImage f104737v;

    /* JADX INFO: renamed from: w */
    public TextView f104738w;

    /* JADX INFO: renamed from: x */
    public VText f104739x;

    /* JADX INFO: renamed from: y */
    public View f104740y;

    /* JADX INFO: renamed from: z */
    public AnimEffectPlayer f104741z;

    /* JADX INFO: renamed from: l.gwl0$a */
    public class C17181a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f104742a;

        public C17181a(d30 d30Var) {
            this.f104742a = d30Var;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            this.f104742a.call();
            xdl0.m208344M(gwl0.this.f104741z, false);
        }
    }

    /* JADX INFO: renamed from: l.gwl0$b */
    public class C17182b extends AnimListener {
        public C17182b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            xdl0.m208344M(gwl0.this.f104720B, false);
        }
    }

    public gwl0(sxl0 sxl0Var) {
        super(t6c0.f168413kb, sxl0Var.act(), sxl0Var, j2g0.m139456c(0.3f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public /* synthetic */ void m128423A0(View view) {
        ((sxl0) this.f47757b).m203470Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m128424B0(View view) {
        User user = this.f104722D;
        if (user != null) {
            ((sxl0) this.f47757b).m186502f5(user.f56011id);
        }
    }

    /* JADX INFO: renamed from: E0 */
    private void m128425E0() {
        if (this.f104722D == null) {
            return;
        }
        String strConcat = "@" + this.f104722D.name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        int length = strConcat.length();
        int i = jw4.f120018E;
        if (length > i) {
            strConcat = strConcat.substring(0, i - 4).concat("... ");
        }
        ((sxl0) this.f47757b).m186501e5(strConcat);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m128426F(View view) {
    }

    /* JADX INFO: renamed from: K0 */
    private void m128432K0() {
        agv.m96344b(this.f104729n, t100.m186890d(100.0f), this.f104725G, new w9j() { // from class: l.wvl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall().formatted();
            }
        });
        xdl0.m208344M(this.f104728m, true);
        boolean zM72121k0 = this.f104729n.m72121k0();
        FrameLayout frameLayout = this.f104728m;
        if (zM72121k0) {
            xdl0.m208357U(frameLayout, t100.m186890d(2.0f));
            this.f104728m.setBackground(null);
            return;
        }
        xdl0.m208357U(frameLayout, t100.m186890d(-6.0f));
        boolean zM109681d = d1t.m109678a(this.f104725G).m109681d();
        FrameLayout frameLayout2 = this.f104728m;
        if (zM109681d) {
            frameLayout2.setBackground(null);
        } else {
            frameLayout2.setBackgroundResource(i3c0.f110670C8);
        }
    }

    /* JADX INFO: renamed from: P0 */
    private void m128438P0() {
        this.f104727l.setOnClickListener(new View.OnClickListener() { // from class: l.dwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88186a.m128423A0(view);
            }
        });
        this.f104740y.setOnClickListener(new View.OnClickListener() { // from class: l.ewl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gwl0.m128426F(view);
            }
        });
        xdl0.m208329E0(this.f104728m, new View.OnClickListener() { // from class: l.fwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99665a.m128424B0(view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private void m128452g0() {
        if (this.f104726k == null) {
            return;
        }
        xdl0.m208344M(this.f104736u, false);
        this.f104736u.removeAllViews();
        xdl0.m208344M(this.f104739x, false);
        this.f104729n.m72119i0();
        this.f104730o.m78731b();
        this.f104722D = null;
        this.f104723E = null;
        this.f104721C.m73313n0();
        this.f104731p.m78715e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m128453l0(View view) {
        m128469h0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m128454m0(View view) {
        if (NullChecker.m81303a(this.f104722D)) {
            syo0.m186715f();
            ((sxl0) this.f47757b).m186507k5(this.f104722D);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m128455p0(View view) {
        ((sxl0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(((sxl0) this.f47757b).f166804m, "profile"));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((sxl0) this.f47757b).act();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public void m128456D0(VText vText) {
        String strM202217t;
        boolean z = false;
        if (this.f104722D == null || this.f104724F == null) {
            xdl0.m208344M(vText, false);
        }
        if (((nnn0) ((sxl0) this.f47757b).m206027E2()).m160249P2().m102063l(this.f104722D.f56011id) == null) {
            if (this.f104724F.m167083c(this.f104722D.f56011id)) {
                strM202217t = w8u.m202217t(R$string.f46706Gh);
            } else {
                strM202217t = x4s.m207013c(((nnn0) ((sxl0) this.f47757b).m206027E2()).mo149813j().liveMode) ? "邀为嘉宾" : w8u.m202217t(R$string.f46631D8);
            }
            vText.setText(strM202217t);
            vText.setEnabled(z);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.jvl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f119957a.m128471j0(view);
                }
            });
        }
        strM202217t = w8u.m202217t(R$string.f47483qi);
        z = true;
        vText.setText(strM202217t);
        vText.setEnabled(z);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.jvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119957a.m128471j0(view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m128457G0(String str, d30 d30Var) {
        String strValueOf = String.valueOf(str);
        this.f104719A.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        f6l0.m119627n(this.f104719A, new dqe(strValueOf).m113019m(new v9j() { // from class: l.xvl0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f194649a.m128472k0();
            }
        }).m113015i(d30Var));
    }

    /* JADX INFO: renamed from: H0 */
    public final void m128458H0(p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        this.f104724F = p1k0Var;
        this.f104722D = p1k0Var == null ? null : p1k0Var.f146688c.f135304a;
        this.f104725G = p1k0Var == null ? null : p1k0Var.f146688c;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM167098r = p1k0Var != null ? p1k0Var.m167098r() : null;
        this.f104723E = bLiveVoiceUserProfileConfigM167098r;
        User user = this.f104722D;
        if (user == null || bLiveVoiceUserProfileConfigM167098r == null) {
            xdl0.m208344M(this.f104739x, true);
            this.f104728m.setVisibility(8);
            return;
        }
        m128459I0();
        m128432K0();
        m128460J0(p1k0Var, new d30() { // from class: l.mvl0
            @Override // p149l.d30
            public final void call() {
                this.f135914a.m128462M0();
            }
        });
        xdl0.m208344M(this.f104738w, true);
        if (TextUtils.equals(user.f56011id, ypv.f199493a.m199309D0())) {
            this.f104738w.setText("我的装扮");
            xdl0.m208329E0(this.f104738w, new View.OnClickListener() { // from class: l.nvl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140779a.m128453l0(view);
                }
            });
        } else {
            syo0.m186716g();
            this.f104738w.setText(String.format("%s的装扮", user.isFemale() ? "她" : "他"));
            xdl0.m208329E0(this.f104738w, new View.OnClickListener() { // from class: l.ovl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f145820a.m128454m0(view);
                }
            });
        }
        m128463N0(p1k0Var);
        List<BLiveUserCardGiftWall> listM167089i = p1k0Var.m167089i();
        boolean zM200296J = vwb.m200296J(listM167089i);
        VoiceCardGiftWallView voiceCardGiftWallView = this.f104731p;
        if (zM200296J) {
            xdl0.m208344M(voiceCardGiftWallView, false);
            return;
        }
        xdl0.m208344M(voiceCardGiftWallView, true);
        this.f104731p.m78717h(((sxl0) this.f47757b).act(), listM167089i, new d30() { // from class: l.pvl0
            @Override // p149l.d30
            public final void call() {
                this.f151483a.m128473n0();
            }
        }, new Action1() { // from class: l.qvl0
            @Override // com.tantanapp.media.ttmediautils.download.Action1
            public final void call(Object obj) {
                this.f156611a.m128474o0((String) obj);
            }
        });
        xdl0.m208329E0(this.f104731p.f53824b, new View.OnClickListener() { // from class: l.rvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161219a.m128455p0(view);
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
    public void m128459I0() {
        if (this.f104723E == null) {
            hfw.m130790a("voiceUserCard", "config is null");
            return;
        }
        this.f104736u.removeAllViews();
        if (this.f104723E.bottomButtons.size() == 0) {
            hfw.m130790a("voiceUserCard", "config.bottomButtons is empty");
            this.f104736u.setVisibility(8);
            return;
        }
        hfw.m130790a("voiceUserCard", "bottom button:" + this.f104723E.userId);
        this.f104736u.setVisibility(0);
        for (int i = 0; i < this.f104723E.bottomButtons.size(); i++) {
            String str = this.f104723E.bottomButtons.get(i);
            hfw.m130790a("voiceUserCard", "render bottom button:" + str);
            final VText vText = new VText(this.f104736u.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, xdl0.f192403e);
            vText.setTextSize(15.0f);
            vText.setGravity(17);
            layoutParams.weight = 1.0f;
            vText.setTextColor(Color.parseColor("#ccffffff"));
            vText.setLayoutParams(layoutParams);
            str.getClass();
            switch (str) {
                case "sayHello":
                    vText.setText("打招呼");
                    zvf0.m220368A("e_audio_greeting", "p_audio_profile", j760.m140076a("anchorId", ((nnn0) ((sxl0) this.f47757b).m206027E2()).m132146l0().f56011id), j760.m140076a("liveId", ((nnn0) ((sxl0) this.f47757b).m206027E2()).m149814k()), j760.m140076a("receiver_user_id", this.f104722D.f56011id));
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.zvl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f205016a.m128478t0(view);
                        }
                    });
                    break;
                case "managerInvite":
                    m128461L0(vText);
                    break;
                case "at":
                    if (this.f104722D.isFemale()) {
                        vText.setText(ypv.f199497e.getString(R$string.f46960Se));
                    } else {
                        vText.setText(ypv.f199497e.getString(R$string.f46918Qe));
                    }
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.tvl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f172320a.m128476r0(view);
                        }
                    });
                    break;
                case "call":
                    m128456D0(vText);
                    break;
                case "like":
                    m128464O0(vText, this.f104723E.relationState);
                    zvf0.m220368A("e_audio_like", "p_audio_profile", j760.m140076a("anchorId", ((nnn0) ((sxl0) this.f47757b).m206027E2()).m132146l0().f56011id), j760.m140076a("liveId", ((nnn0) ((sxl0) this.f47757b).m206027E2()).m149814k()), j760.m140076a("receiver_user_id", this.f104722D.f56011id));
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.awl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f72064a.m128479u0(vText, view);
                        }
                    });
                    break;
                case "more":
                    vText.setText("更多");
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.cwl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f82799a.m128481w0(view);
                        }
                    });
                    break;
                case "realNamePrivateChat":
                    vText.setText("私聊");
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.bwl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f77629a.m128480v0(view);
                        }
                    });
                    break;
                case "sendGift":
                    if (TextUtils.equals(this.f104722D.f56011id, ypv.f199493a.m199309D0())) {
                        vText.setText(R$string.f47544td);
                    } else {
                        vText.setText(R$string.f47390md);
                    }
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.ivl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f115180a.m128475q0(view);
                        }
                    });
                    break;
                case "privateChat":
                    zvf0.m220368A("e_anonymous_chat_button", "p_audio_profile", j760.m140076a("receiver_user_id", this.f104722D.f56011id), j760.m140076a("message_from", "AudioProfileCard"));
                    vText.setText("私聊");
                    xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.yvl0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f200282a.m128477s0(view);
                        }
                    });
                    break;
            }
            this.f104736u.addView(vText);
            if (this.f104723E.bottomButtons.size() > 1 && i != this.f104723E.bottomButtons.size() - 1) {
                View view = new View(this.f104736u.getContext());
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(t100.f167252a, t100.f167264m);
                layoutParams2.gravity = 16;
                view.setLayoutParams(layoutParams2);
                view.setBackgroundColor(Color.parseColor("#0cffffff"));
                this.f104736u.addView(view);
            }
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m128460J0(p1k0 p1k0Var, d30 d30Var) {
        BLiveVirtualVoiceCpInfo bLiveVirtualVoiceCpInfo = p1k0Var.m167098r().sweetCpCard.sweetCp;
        if ((TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileEffect) && TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileVideoEffect)) || TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileAvatarEffect)) {
            xdl0.m208344M(this.f104741z, false);
            xdl0.m208344M(this.f104720B, false);
            xdl0.m208344M(this.f104719A, false);
            d30Var.call();
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVirtualVoiceCpInfo.currentHouse.profileVideoEffect);
        BLiveVirtualVoiceCpHouseInfo bLiveVirtualVoiceCpHouseInfo = bLiveVirtualVoiceCpInfo.currentHouse;
        if (!zIsEmpty) {
            m128457G0(bLiveVirtualVoiceCpHouseInfo.profileVideoEffect, d30Var);
        } else if (!TextUtils.isEmpty(bLiveVirtualVoiceCpHouseInfo.profileEffect)) {
            xdl0.m208344M(this.f104741z, true);
            this.f104741z.m68498h(bLiveVirtualVoiceCpInfo.currentHouse.profileEffect, 1, new C17181a(d30Var), true, false);
        }
        xdl0.m208344M(this.f104720B, true);
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(bLiveVirtualVoiceCpInfo.meUser.avatar, "head01");
        sVGADynamicEntity.setDynamicImage(bLiveVirtualVoiceCpInfo.otherUser.avatar, "head02");
        SVGALoader.with(((sxl0) this.f47757b).act()).from(bLiveVirtualVoiceCpInfo.currentHouse.profileAvatarEffect).frameMode(SVGAnimationView.FrameMode.AFTER).isCacheable(false).autoPlay(true).dynamic(sVGADynamicEntity).animListener(new C17182b()).repeatCount(1).into(this.f104720B);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m128461L0(VText vText) {
        List list = (List) ((sxl0) this.f47757b).m129297F3(new twn0(3800));
        final String str = this.f104724F.m167095o().f135304a.f56011id;
        final boolean zM200337m = vwb.m200337m(list, new w9j() { // from class: l.kvl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveVoiceManager) obj).userId.equals(str));
            }
        });
        vText.setText(zM200337m ? w8u.m202217t(R$string.f47195df) : w8u.m202217t(R$string.f47370lf));
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.lvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130170a.m128482x0(zM200337m, str, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public final void m128462M0() {
        this.f104721C.m73323y0(this.f104725G, this.f104727l);
        LiveUserCardSkinView liveUserCardSkinView = this.f104721C;
        FrameLayout frameLayout = this.f104728m;
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfig = this.f104723E;
        liveUserCardSkinView.m73311D0(frameLayout, bLiveVoiceUserProfileConfig != null && bLiveVoiceUserProfileConfig.enableNewPrivilege);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m128463N0(final p1k0 p1k0Var) {
        BLiveVoiceUserProfileConfig bLiveVoiceUserProfileConfigM167098r = p1k0Var.m167098r();
        if (bLiveVoiceUserProfileConfigM167098r == null) {
            return;
        }
        xdl0.m208345M0(this.f104735t, bLiveVoiceUserProfileConfigM167098r.payGuideConfig == null && bLiveVoiceUserProfileConfigM167098r.payGuideInfo == null);
        this.f104734s.m77563s(p1k0Var, this.f47757b, p1k0Var.f146688c.f135304a.f56011id);
        xdl0.m208329E0(this.f104734s._apply_layout, new View.OnClickListener() { // from class: l.uvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178544a.m128484z0(p1k0Var, view);
            }
        });
        xdl0.m208329E0(this.f104734s._accept_layout_accept_button, new View.OnClickListener() { // from class: l.vvl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183239a.m128483y0(p1k0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m128464O0(VText vText, String str) {
        if (TextUtils.equals(str, "liking")) {
            vText.setText("已喜欢");
            xdl0.m208344M(vText, true);
            vText.setTextColor(Color.parseColor("#66ffffff"));
        } else {
            vText.setText("喜欢");
            vText.setTextColor(Color.parseColor("#ff8817"));
            if (TextUtils.equals(str, "likeMatched")) {
                xdl0.m208344M(vText, false);
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public void m128465Q0(boolean z, p1k0 p1k0Var, BLiveVoiceCall bLiveVoiceCall) {
        m128452g0();
        m71832B(false);
        m71834E();
        m128458H0(p1k0Var, bLiveVoiceCall);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return ((sxl0) this.f47757b).act();
    }

    /* JADX INFO: renamed from: d0 */
    public final void m128466d0(View view) {
        hwl0.m133251a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public void destroy() {
        if (isShowing()) {
            ((sxl0) this.f47757b).m186482J4();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m128468f0() {
        String strM178016w = r610.m178016w(this.f104724F.m167095o().f135304a.name, 5);
        String strM202218u = w8u.m202218u(R$string.f47129af, strM178016w);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM202218u);
        int iIndexOf = strM202218u.indexOf(strM178016w);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf, strM178016w.length() + iIndexOf, 33);
        }
        new xh0.C21150a(getContext()).m208731j(spannableStringBuilder).m208738q(R$string.f47173cf).m208736o(new View.OnClickListener() { // from class: l.svl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166581a.m128470i0(view);
            }
        }).m208726e(R$string.f47151bf).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: h0 */
    public void m128469h0() {
        ((sxl0) this.f47757b).m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e("tantanapp://voice-live/room/showUserVoiceRightsPage").m206699c());
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m128470i0(View view) {
        ((sxl0) this.f47757b).m186480H4(this.f104724F.m167095o().f135304a);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m128471j0(View view) {
        ((sxl0) this.f47757b).m186481I4(this.f104722D);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ Boolean m128472k0() {
        return Boolean.valueOf(this.f47758c.isShowing());
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        m128466d0(view);
        m71844z(LiveDialogEnum.USER_CARD);
        m71831A(80);
        m128438P0();
        LiveUserCardSkinView liveUserCardSkinView = (LiveUserCardSkinView) view.findViewById(g5c0.f100754M7);
        this.f104721C = liveUserCardSkinView;
        liveUserCardSkinView.setDialogHost(this);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m128473n0() {
        ((sxl0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(((sxl0) this.f47757b).f166804m, "profile"));
        mo71838p();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m128474o0(String str) {
        ((sxl0) this.f47757b).m206028F2().VoiceNewGiftWallEvent.showMainPage().mo172463j(x2o0.m206856a(((sxl0) this.f47757b).f166804m, "profile"));
        w2o0 w2o0Var = new w2o0();
        w2o0Var.f184266b = str;
        T t = this.f47757b;
        w2o0Var.f184265a = ((sxl0) t).f166804m;
        ((sxl0) t).m206028F2().VoiceNewGiftWallEvent.showGiftDetail().mo172463j(w2o0Var);
        mo71838p();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m128475q0(View view) {
        if (this.f104722D != null) {
            syo0.m186712c();
            ((sxl0) this.f47757b).m186510n5(this.f104724F.f146688c);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m128476r0(View view) {
        m128425E0();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m128477s0(View view) {
        User user = this.f104722D;
        if (user != null) {
            ((sxl0) this.f47757b).m186504h5(user.f56011id);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m128478t0(View view) {
        User user = this.f104722D;
        if (user != null) {
            ((sxl0) this.f47757b).m186506j5(user.f56011id);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m128479u0(VText vText, View view) {
        User user = this.f104722D;
        if (user != null) {
            ((sxl0) this.f47757b).m186503g5(vText, user.f56011id, this.f104723E.relationState);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m128480v0(View view) {
        User user = this.f104722D;
        if (user != null) {
            ((sxl0) this.f47757b).m186505i5(user.f56011id);
        } else {
            hfw.m130790a("voiceUserCard", "currentUser is null");
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        if (this.f104741z.isAnimating()) {
            this.f104741z.m68505o();
        }
        xdl0.m208344M(this.f104741z, false);
        this.f104734s.m77564u();
        this.f104719A.stop();
        xdl0.m208344M(this.f104719A, false);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m128481w0(View view) {
        if (this.f104722D != null) {
            ((sxl0) this.f47757b).m186513q5();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m128482x0(boolean z, String str, View view) {
        if (z) {
            m128468f0();
        } else {
            ((sxl0) this.f47757b).m186487O4(str);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m128483y0(p1k0 p1k0Var, View view) {
        ((sxl0) this.f47757b).m186478F4(p1k0Var.m167098r().payGuideInfo);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m128484z0(p1k0 p1k0Var, View view) {
        ((sxl0) this.f47757b).m186479G4(p1k0Var.m167098r().payGuideConfig);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sxl0 sxl0Var) {
    }
}
