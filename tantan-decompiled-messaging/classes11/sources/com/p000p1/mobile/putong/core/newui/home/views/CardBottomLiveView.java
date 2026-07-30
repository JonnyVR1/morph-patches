package com.p000p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.p000p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bt0;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.jo0;
import l.mkd0;
import l.o6j0;
import l.qh4;
import l.qib0;
import l.u4c0;
import l.vwb;
import p009l.dol;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardBottomLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f2297c;

    /* JADX INFO: renamed from: d */
    public VLinear f2298d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f2299e;

    /* JADX INFO: renamed from: f */
    public VLinear f2300f;

    /* JADX INFO: renamed from: g */
    public VFrame f2301g;

    /* JADX INFO: renamed from: h */
    public VFrame f2302h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f2303i;

    /* JADX INFO: renamed from: j */
    public VText f2304j;

    /* JADX INFO: renamed from: k */
    public VText f2305k;

    /* JADX INFO: renamed from: l */
    public VText f2306l;

    /* JADX INFO: renamed from: m */
    public VDraweeView[] f2307m;

    /* JADX INFO: renamed from: n */
    public int f2308n;

    /* JADX INFO: renamed from: o */
    public c4g0 f2309o;

    /* JADX INFO: renamed from: p */
    public User f2310p;

    public CardBottomLiveView(Context context) {
        super(context);
        this.f2307m = new VDraweeView[4];
        this.f2308n = 0;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m2931R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m2933W(Long l2) {
        m2934b0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m2934b0() {
        int measuredHeight = this.f2305k.getMeasuredHeight() / 2;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorP = bt0.p(this.f2305k, "translationY", 0L, 100L, linearInterpolator, new float[]{0.0f, -measuredHeight});
        bt0.f(animatorP, new Runnable() { // from class: l.ph4
            @Override // java.lang.Runnable
            public final void run() {
                this.f18582a.m2940a0();
            }
        });
        bt0.s(new Animator[]{animatorP, bt0.p(this.f2305k, "translationY", 0L, 100L, linearInterpolator, new float[]{measuredHeight, 0.0f})}).start();
    }

    private List<o6j0.a> getParams() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.a.h("anchorId", ((DbObject) this.f2310p).id));
        String str = "";
        arrayList.add(o6j0.a.h("liveId", !TextUtils.isEmpty(this.f2310p.voiceLiveState.voiceLiveId) ? this.f2310p.voiceLiveState.voiceLiveId : ""));
        arrayList.add(o6j0.a.h("roomId", !TextUtils.isEmpty(this.f2310p.voiceLiveState.voiceRoomId) ? this.f2310p.voiceLiveState.voiceRoomId : ""));
        arrayList.add(o6j0.a.h("audio_card_type", "swipe_card_voicechat"));
        if (!TextUtils.isEmpty(this.f2310p.voiceLiveState.anchorId)) {
            User user = this.f2310p;
            str = TextUtils.equals(((DbObject) user).id, user.voiceLiveState.anchorId) ? "anchor" : "audience_voicechat";
        }
        arrayList.add(o6j0.a.h("user_type", str));
        arrayList.add(o6j0.a.f("index", 1));
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final void m2935T(View view) {
        qh4.a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m2936V() {
        int i = f6c0.u0;
        int iMin = Math.min(this.f2310p.voiceLiveState.avatars.size(), 4);
        if (iMin == 1) {
            i = f6c0.u0;
        } else if (iMin == 2) {
            i = f6c0.w0;
        } else if (iMin == 3) {
            i = f6c0.v0;
        } else if (iMin == 4) {
            i = f6c0.t0;
        }
        View viewInflate = act().inflater().inflate(i, (ViewGroup) this.f2302h, false);
        this.f2307m[0] = (VDraweeView) viewInflate.findViewById(u4c0.c6);
        this.f2307m[1] = (VDraweeView) viewInflate.findViewById(u4c0.f6);
        this.f2307m[2] = (VDraweeView) viewInflate.findViewById(u4c0.e6);
        this.f2307m[3] = (VDraweeView) viewInflate.findViewById(u4c0.a6);
        this.f2302h.addView(viewInflate, 0);
        for (int i2 = 0; i2 < iMin; i2++) {
            if (vwb.J(this.f2310p.voiceLiveState.avatars)) {
                qib0.G.o(this.f2307m[i2]);
            } else if (TextUtils.isEmpty((CharSequence) this.f2310p.voiceLiveState.avatars.get(i2))) {
                qib0.G.o(this.f2307m[i2]);
            } else {
                qib0.G.L0(this.f2307m[i2], (String) this.f2310p.voiceLiveState.avatars.get(i2));
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2937X(dol dolVar, View view) {
        CoreModule.Q().m9019M6().m12097p(dolVar.mo1449f().getCardView().getContext(), CoreModule.Q().getUserVirtualVoiceId(((DbObject) dolVar.getUser()).id), "suggest-card", ((DbObject) dolVar.getUser()).id, null);
        List<o6j0.a> params = getParams();
        o6j0.c("e_live_audio_room_enter", "p_suggest_users_home_view", (o6j0.a[]) params.toArray(new o6j0.a[params.size()]));
    }

    /* JADX INFO: renamed from: Y */
    public void m2938Y(dol dolVar, VoiceLiveState voiceLiveState, int i) {
        if (NullChecker.a(dolVar) && NullChecker.a(dolVar.getUser()) && NullChecker.a(voiceLiveState) && dolVar.mo1450g() && i == 0) {
            List<o6j0.a> params = getParams();
            o6j0.h("e_live_audio_room_enter", "p_suggest_users_home_view", (o6j0.a[]) params.toArray(new o6j0.a[params.size()]));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m2939Z(final dol dolVar) {
        User user = dolVar.getUser();
        this.f2310p = user;
        if (NullChecker.a(user) && NullChecker.a(this.f2310p.voiceLiveState)) {
            m2936V();
            this.f2303i.loadAnimWithListener("core_card_bottom_live.svga", -1, new AnimListener(), true);
            if (!TextUtils.isEmpty(this.f2310p.voiceLiveState.topDesc) && !TextUtils.isEmpty(this.f2310p.voiceLiveState.title)) {
                this.f2304j.setText("#" + this.f2310p.voiceLiveState.topDesc + " " + this.f2310p.voiceLiveState.title);
            }
            if (!vwb.J(this.f2310p.voiceLiveState.messages)) {
                if (this.f2310p.voiceLiveState.messages.size() == 1) {
                    this.f2305k.setText((CharSequence) this.f2310p.voiceLiveState.messages.get(0));
                } else if (this.f2310p.voiceLiveState.messages.size() > 1) {
                    this.f2305k.setText((CharSequence) this.f2310p.voiceLiveState.messages.get(0));
                    if (NullChecker.a(this.f2309o)) {
                        return;
                    } else {
                        this.f2309o = act().duringCreated(c.interval(7L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.mh4
                            public final void call(Object obj) {
                                this.f16917a.m2933W((Long) obj);
                            }
                        }, new e30() { // from class: l.nh4
                            public final void call(Object obj) {
                                CardBottomLiveView.m2931R((Throwable) obj);
                            }
                        }));
                    }
                }
            }
            this.f2300f.setOnClickListener(new View.OnClickListener() { // from class: l.oh4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18045a.m2937X(dolVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2940a0() {
        if (vwb.J(this.f2310p.voiceLiveState.messages)) {
            return;
        }
        int i = this.f2308n + 1;
        this.f2308n = i;
        if (i < 0 || i >= this.f2310p.voiceLiveState.messages.size()) {
            this.f2308n = 0;
        }
        this.f2305k.setText((CharSequence) this.f2310p.voiceLiveState.messages.get(this.f2308n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Act act() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        mkd0.z(this.f2309o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2935T(this);
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2307m = new VDraweeView[4];
        this.f2308n = 0;
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2307m = new VDraweeView[4];
        this.f2308n = 0;
    }
}
