package com.p051p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.fo0;
import p153l.gt0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.oql;
import p153l.pi4;
import p153l.psd0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f24261c;

    /* JADX INFO: renamed from: d */
    public VLinear f24262d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f24263e;

    /* JADX INFO: renamed from: f */
    public VLinear f24264f;

    /* JADX INFO: renamed from: g */
    public VFrame f24265g;

    /* JADX INFO: renamed from: h */
    public VFrame f24266h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f24267i;

    /* JADX INFO: renamed from: j */
    public VText f24268j;

    /* JADX INFO: renamed from: k */
    public VText f24269k;

    /* JADX INFO: renamed from: l */
    public VText f24270l;

    /* JADX INFO: renamed from: m */
    public VDraweeView[] f24271m;

    /* JADX INFO: renamed from: n */
    public int f24272n;

    /* JADX INFO: renamed from: o */
    public kcg0 f24273o;

    /* JADX INFO: renamed from: p */
    public User f24274p;

    public CardBottomLiveView(Context context) {
        super(context);
        this.f24271m = new VDraweeView[4];
        this.f24272n = 0;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m39927R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m39929W(Long l2) {
        m39930b0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m39930b0() {
        int measuredHeight = this.f24269k.getMeasuredHeight() / 2;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132170p = gt0.m132170p(this.f24269k, "translationY", 0L, 100L, linearInterpolator, 0.0f, -measuredHeight);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.oi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f147509a.m39936a0();
            }
        });
        gt0.m132173s(animatorM132170p, gt0.m132170p(this.f24269k, "translationY", 0L, 100L, linearInterpolator, measuredHeight, 0.0f)).start();
    }

    private List<sfj0.C20032a> getParams() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sfj0.C20032a.m185615h("anchorId", this.f24274p.f56859id));
        String str = "";
        arrayList.add(sfj0.C20032a.m185615h("liveId", !TextUtils.isEmpty(this.f24274p.voiceLiveState.voiceLiveId) ? this.f24274p.voiceLiveState.voiceLiveId : ""));
        arrayList.add(sfj0.C20032a.m185615h("roomId", !TextUtils.isEmpty(this.f24274p.voiceLiveState.voiceRoomId) ? this.f24274p.voiceLiveState.voiceRoomId : ""));
        arrayList.add(sfj0.C20032a.m185615h("audio_card_type", "swipe_card_voicechat"));
        if (!TextUtils.isEmpty(this.f24274p.voiceLiveState.anchorId)) {
            User user = this.f24274p;
            str = TextUtils.equals(user.f56859id, user.voiceLiveState.anchorId) ? "anchor" : "audience_voicechat";
        }
        arrayList.add(sfj0.C20032a.m185615h("user_type", str));
        arrayList.add(sfj0.C20032a.m185613f(FirebaseAnalytics.Param.INDEX, 1));
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final void m39931T(View view) {
        pi4.m172352a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m39932V() {
        int i = kec0.f126076u0;
        int iMin = Math.min(this.f24274p.voiceLiveState.avatars.size(), 4);
        if (iMin == 1) {
            i = kec0.f126076u0;
        } else if (iMin == 2) {
            i = kec0.f126110w0;
        } else if (iMin == 3) {
            i = kec0.f126093v0;
        } else if (iMin == 4) {
            i = kec0.f126059t0;
        }
        View viewInflate = act().inflater().inflate(i, (ViewGroup) this.f24266h, false);
        this.f24271m[0] = (VDraweeView) viewInflate.findViewById(adc0.f70317e6);
        this.f24271m[1] = (VDraweeView) viewInflate.findViewById(adc0.f70368h6);
        this.f24271m[2] = (VDraweeView) viewInflate.findViewById(adc0.f70351g6);
        this.f24271m[3] = (VDraweeView) viewInflate.findViewById(adc0.f70283c6);
        this.f24266h.addView(viewInflate, 0);
        for (int i2 = 0; i2 < iMin; i2++) {
            if (jyb.m147479J(this.f24274p.voiceLiveState.avatars)) {
                uqb0.f180374G.m98798o(this.f24271m[i2]);
            } else if (TextUtils.isEmpty(this.f24274p.voiceLiveState.avatars.get(i2))) {
                uqb0.f180374G.m98798o(this.f24271m[i2]);
            } else {
                uqb0.f180374G.m127115L0(this.f24271m[i2], this.f24274p.voiceLiveState.avatars.get(i2));
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m39933X(oql oqlVar, View view) {
        CoreModule.m30934Q().mo68412M6().mo127345p(oqlVar.mo38481f().getCardView().getContext(), CoreModule.m30934Q().getUserVirtualVoiceId(oqlVar.getUser().f56859id), "suggest-card", oqlVar.getUser().f56859id, null);
        List<sfj0.C20032a> params = getParams();
        sfj0.m185596c("e_live_audio_room_enter", "p_suggest_users_home_view", (sfj0.C20032a[]) params.toArray(new sfj0.C20032a[params.size()]));
    }

    /* JADX INFO: renamed from: Y */
    public void m39934Y(oql oqlVar, VoiceLiveState voiceLiveState, int i) {
        if (NullChecker.m82486a(oqlVar) && NullChecker.m82486a(oqlVar.getUser()) && NullChecker.m82486a(voiceLiveState) && oqlVar.mo38482g() && i == 0) {
            List<sfj0.C20032a> params = getParams();
            sfj0.m185601h("e_live_audio_room_enter", "p_suggest_users_home_view", (sfj0.C20032a[]) params.toArray(new sfj0.C20032a[params.size()]));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m39935Z(final oql oqlVar) {
        User user = oqlVar.getUser();
        this.f24274p = user;
        if (NullChecker.m82486a(user) && NullChecker.m82486a(this.f24274p.voiceLiveState)) {
            m39932V();
            this.f24267i.loadAnimWithListener("core_card_bottom_live.svga", -1, new AnimListener(), true);
            if (!TextUtils.isEmpty(this.f24274p.voiceLiveState.topDesc) && !TextUtils.isEmpty(this.f24274p.voiceLiveState.title)) {
                this.f24268j.setText("#" + this.f24274p.voiceLiveState.topDesc + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f24274p.voiceLiveState.title);
            }
            if (!jyb.m147479J(this.f24274p.voiceLiveState.messages)) {
                if (this.f24274p.voiceLiveState.messages.size() == 1) {
                    this.f24269k.setText(this.f24274p.voiceLiveState.messages.get(0));
                } else if (this.f24274p.voiceLiveState.messages.size() > 1) {
                    this.f24269k.setText(this.f24274p.voiceLiveState.messages.get(0));
                    if (NullChecker.m82486a(this.f24273o)) {
                        return;
                    } else {
                        this.f24273o = act().duringCreated(C22421c.interval(7L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.li4
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                this.f132177a.m39929W((Long) obj);
                            }
                        }, new y20() { // from class: l.mi4
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                CardBottomLiveView.m39927R((Throwable) obj);
                            }
                        }));
                    }
                }
            }
            this.f24264f.setOnClickListener(new View.OnClickListener() { // from class: l.ni4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f142088a.m39933X(oqlVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m39936a0() {
        if (jyb.m147479J(this.f24274p.voiceLiveState.messages)) {
            return;
        }
        int i = this.f24272n + 1;
        this.f24272n = i;
        if (i < 0 || i >= this.f24274p.voiceLiveState.messages.size()) {
            this.f24272n = 0;
        }
        this.f24269k.setText(this.f24274p.voiceLiveState.messages.get(this.f24272n));
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f24273o);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39931T(this);
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24271m = new VDraweeView[4];
        this.f24272n = 0;
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24271m = new VDraweeView[4];
        this.f24272n = 0;
    }
}
