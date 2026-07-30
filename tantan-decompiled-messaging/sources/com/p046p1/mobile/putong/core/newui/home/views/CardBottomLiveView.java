package com.p046p1.mobile.putong.core.newui.home.views;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomLiveView;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.dol;
import p149l.e30;
import p149l.f6c0;
import p149l.jo0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qh4;
import p149l.qib0;
import p149l.u4c0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class CardBottomLiveView extends VLinear {

    /* JADX INFO: renamed from: c */
    public CardBottomBaseInfoView f23519c;

    /* JADX INFO: renamed from: d */
    public VLinear f23520d;

    /* JADX INFO: renamed from: e */
    public CardUserContentView f23521e;

    /* JADX INFO: renamed from: f */
    public VLinear f23522f;

    /* JADX INFO: renamed from: g */
    public VFrame f23523g;

    /* JADX INFO: renamed from: h */
    public VFrame f23524h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f23525i;

    /* JADX INFO: renamed from: j */
    public VText f23526j;

    /* JADX INFO: renamed from: k */
    public VText f23527k;

    /* JADX INFO: renamed from: l */
    public VText f23528l;

    /* JADX INFO: renamed from: m */
    public VDraweeView[] f23529m;

    /* JADX INFO: renamed from: n */
    public int f23530n;

    /* JADX INFO: renamed from: o */
    public c4g0 f23531o;

    /* JADX INFO: renamed from: p */
    public User f23532p;

    public CardBottomLiveView(Context context) {
        super(context);
        this.f23529m = new VDraweeView[4];
        this.f23530n = 0;
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m38924R(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m38926W(Long l2) {
        m38927b0();
    }

    /* JADX INFO: renamed from: b0 */
    private void m38927b0() {
        int measuredHeight = this.f23527k.getMeasuredHeight() / 2;
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103743p = bt0.m103743p(this.f23527k, "translationY", 0L, 100L, linearInterpolator, 0.0f, -measuredHeight);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.ph4
            @Override // java.lang.Runnable
            public final void run() {
                this.f148867a.m38933a0();
            }
        });
        bt0.m103746s(animatorM103743p, bt0.m103743p(this.f23527k, "translationY", 0L, 100L, linearInterpolator, measuredHeight, 0.0f)).start();
    }

    private List<o6j0.C18854a> getParams() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(o6j0.C18854a.m162878h("anchorId", this.f23532p.f56011id));
        String str = "";
        arrayList.add(o6j0.C18854a.m162878h("liveId", !TextUtils.isEmpty(this.f23532p.voiceLiveState.voiceLiveId) ? this.f23532p.voiceLiveState.voiceLiveId : ""));
        arrayList.add(o6j0.C18854a.m162878h("roomId", !TextUtils.isEmpty(this.f23532p.voiceLiveState.voiceRoomId) ? this.f23532p.voiceLiveState.voiceRoomId : ""));
        arrayList.add(o6j0.C18854a.m162878h("audio_card_type", "swipe_card_voicechat"));
        if (!TextUtils.isEmpty(this.f23532p.voiceLiveState.anchorId)) {
            User user = this.f23532p;
            str = TextUtils.equals(user.f56011id, user.voiceLiveState.anchorId) ? "anchor" : "audience_voicechat";
        }
        arrayList.add(o6j0.C18854a.m162878h("user_type", str));
        arrayList.add(o6j0.C18854a.m162876f(FirebaseAnalytics.Param.INDEX, 1));
        return arrayList;
    }

    /* JADX INFO: renamed from: T */
    public final void m38928T(View view) {
        qh4.m174508a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m38929V() {
        int i = f6c0.f96022u0;
        int iMin = Math.min(this.f23532p.voiceLiveState.avatars.size(), 4);
        if (iMin == 1) {
            i = f6c0.f96022u0;
        } else if (iMin == 2) {
            i = f6c0.f96056w0;
        } else if (iMin == 3) {
            i = f6c0.f96039v0;
        } else if (iMin == 4) {
            i = f6c0.f96005t0;
        }
        View viewInflate = act().inflater().inflate(i, (ViewGroup) this.f23524h, false);
        this.f23529m[0] = (VDraweeView) viewInflate.findViewById(u4c0.f174192c6);
        this.f23529m[1] = (VDraweeView) viewInflate.findViewById(u4c0.f174243f6);
        this.f23529m[2] = (VDraweeView) viewInflate.findViewById(u4c0.f174226e6);
        this.f23529m[3] = (VDraweeView) viewInflate.findViewById(u4c0.f174158a6);
        this.f23524h.addView(viewInflate, 0);
        for (int i2 = 0; i2 < iMin; i2++) {
            if (vwb.m200296J(this.f23532p.voiceLiveState.avatars)) {
                qib0.f154691G.m184725o(this.f23529m[i2]);
            } else if (TextUtils.isEmpty(this.f23532p.voiceLiveState.avatars.get(i2))) {
                qib0.f154691G.m184725o(this.f23529m[i2]);
            } else {
                qib0.f154691G.m102331L0(this.f23529m[i2], this.f23532p.voiceLiveState.avatars.get(i2));
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m38930X(dol dolVar, View view) {
        CoreModule.m29936Q().mo67229M6().mo102431p(dolVar.mo37478f().getCardView().getContext(), CoreModule.m29936Q().getUserVirtualVoiceId(dolVar.getUser().f56011id), "suggest-card", dolVar.getUser().f56011id, null);
        List<o6j0.C18854a> params = getParams();
        o6j0.m162859c("e_live_audio_room_enter", "p_suggest_users_home_view", (o6j0.C18854a[]) params.toArray(new o6j0.C18854a[params.size()]));
    }

    /* JADX INFO: renamed from: Y */
    public void m38931Y(dol dolVar, VoiceLiveState voiceLiveState, int i) {
        if (NullChecker.m81303a(dolVar) && NullChecker.m81303a(dolVar.getUser()) && NullChecker.m81303a(voiceLiveState) && dolVar.mo37479g() && i == 0) {
            List<o6j0.C18854a> params = getParams();
            o6j0.m162864h("e_live_audio_room_enter", "p_suggest_users_home_view", (o6j0.C18854a[]) params.toArray(new o6j0.C18854a[params.size()]));
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m38932Z(final dol dolVar) {
        User user = dolVar.getUser();
        this.f23532p = user;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(this.f23532p.voiceLiveState)) {
            m38929V();
            this.f23525i.loadAnimWithListener("core_card_bottom_live.svga", -1, new AnimListener(), true);
            if (!TextUtils.isEmpty(this.f23532p.voiceLiveState.topDesc) && !TextUtils.isEmpty(this.f23532p.voiceLiveState.title)) {
                this.f23526j.setText("#" + this.f23532p.voiceLiveState.topDesc + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f23532p.voiceLiveState.title);
            }
            if (!vwb.m200296J(this.f23532p.voiceLiveState.messages)) {
                if (this.f23532p.voiceLiveState.messages.size() == 1) {
                    this.f23527k.setText(this.f23532p.voiceLiveState.messages.get(0));
                } else if (this.f23532p.voiceLiveState.messages.size() > 1) {
                    this.f23527k.setText(this.f23532p.voiceLiveState.messages.get(0));
                    if (NullChecker.m81303a(this.f23531o)) {
                        return;
                    } else {
                        this.f23531o = act().duringCreated(C22306c.interval(7L, TimeUnit.SECONDS)).distinctUntilChanged().onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.mh4
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                this.f133777a.m38926W((Long) obj);
                            }
                        }, new e30() { // from class: l.nh4
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                CardBottomLiveView.m38924R((Throwable) obj);
                            }
                        }));
                    }
                }
            }
            this.f23522f.setOnClickListener(new View.OnClickListener() { // from class: l.oh4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f143945a.m38930X(dolVar, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m38933a0() {
        if (vwb.m200296J(this.f23532p.voiceLiveState.messages)) {
            return;
        }
        int i = this.f23530n + 1;
        this.f23530n = i;
        if (i < 0 || i >= this.f23532p.voiceLiveState.messages.size()) {
            this.f23530n = 0;
        }
        this.f23527k.setText(this.f23532p.voiceLiveState.messages.get(this.f23530n));
    }

    public Act act() {
        return (Act) getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f23531o);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m38928T(this);
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23529m = new VDraweeView[4];
        this.f23530n = 0;
    }

    public CardBottomLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23529m = new VDraweeView[4];
        this.f23530n = 0;
    }
}
