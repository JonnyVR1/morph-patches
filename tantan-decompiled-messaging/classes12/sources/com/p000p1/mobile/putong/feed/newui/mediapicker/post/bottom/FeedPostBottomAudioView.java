package com.p000p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.data.Audio;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p000p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2090b;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.e30;
import l.t100;
import l.xdl0;
import p007l.gc1;
import p007l.xvg;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostBottomAudioView extends VFrame {

    /* JADX INFO: renamed from: a */
    public int f2202a;

    /* JADX INFO: renamed from: b */
    public Act f2203b;

    /* JADX INFO: renamed from: c */
    public FeedAudioRecordView f2204c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView$a */
    public class C2091a implements gc1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f2205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f2206b;

        public C2091a(e30 e30Var, e30 e30Var2) {
            this.f2205a = e30Var;
            this.f2206b = e30Var2;
        }

        @Override // p007l.gc1
        /* JADX INFO: renamed from: a */
        public void mo3964a(Audio audio) {
            if (NullChecker.a(this.f2205a)) {
                this.f2205a.call(audio);
            }
        }

        @Override // p007l.gc1
        /* JADX INFO: renamed from: b */
        public void mo3965b(AudioRecordState audioRecordState) {
            if (NullChecker.a(this.f2206b)) {
                this.f2206b.call(audioRecordState);
            }
        }
    }

    public FeedPostBottomAudioView(Context context) {
        super(context);
        this.f2202a = C2090b.f2145X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m3957B() {
        xdl0.M0(this, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m3958C(boolean z) {
        xdl0.M0(this, z);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m3959E() {
        this.f2204c.m3615j();
    }

    /* JADX INFO: renamed from: F */
    public void m3960F() {
        if (NullChecker.a(this.f2204c)) {
            this.f2204c.m3610F();
        }
    }

    public void setKeyboardHeight(Integer num) {
        this.f2202a = num.intValue();
        if (NullChecker.a(this.f2204c)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2204c.getLayoutParams();
            layoutParams.height = num.intValue() == 0 ? t100.d(320.0f) : num.intValue();
            this.f2204c.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public void m3961v(final boolean z) {
        Animator animatorP = bt0.p(this, "translationY", 0L, z ? 200L : 300L, new LinearInterpolator(), new float[]{z ? this.f2202a : 0, z ? 0 : this.f2202a});
        bt0.v(animatorP, new Runnable() { // from class: l.wrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f14668a.m3957B();
            }
        });
        bt0.f(animatorP, new Runnable() { // from class: l.xrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15109a.m3958C(z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: w */
    public boolean m3962w() {
        if (!NullChecker.a(this.f2204c)) {
            return false;
        }
        if (this.f2204c.getCurrentRecordState() != AudioRecordState.RECORDING && this.f2204c.getCurrentRecordState() != AudioRecordState.COMPLETING) {
            return false;
        }
        this.f2204c.m3610F();
        new xvg(this.f2203b).m16864j(R$string.f413P0).m16863i(R$string.f606s3, new Runnable() { // from class: l.yrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f15495a.m3959E();
            }
        }).m16861g(R$string.f478a).show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public void m3963z(Act act, e30 e30Var, e30 e30Var2) {
        this.f2203b = act;
        if (this.f2204c == null) {
            this.f2204c = new FeedAudioRecordView(act);
            int iD = this.f2202a;
            if (iD == 0) {
                iD = t100.d(320.0f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iD);
            layoutParams.gravity = 80;
            this.f2204c.setLayoutParams(layoutParams);
            this.f2204c.setAudioRecordStateChangeListener(new C2091a(e30Var, e30Var2));
            addView(this.f2204c);
        }
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2202a = C2090b.f2145X;
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2202a = C2090b.f2145X;
    }
}
