package com.p051p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p051p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11409b;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p153l.bnl0;
import p153l.gt0;
import p153l.mxg;
import p153l.nc1;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostBottomAudioView extends VFrame {

    /* JADX INFO: renamed from: a */
    public int f41589a;

    /* JADX INFO: renamed from: b */
    public Act f41590b;

    /* JADX INFO: renamed from: c */
    public FeedAudioRecordView f41591c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView$a */
    public class C11410a implements nc1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ y20 f41592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y20 f41593b;

        public C11410a(y20 y20Var, y20 y20Var2) {
            this.f41592a = y20Var;
            this.f41593b = y20Var2;
        }

        @Override // p153l.nc1
        /* JADX INFO: renamed from: a */
        public void mo64134a(Audio audio) {
            if (NullChecker.m82486a(this.f41592a)) {
                this.f41592a.call(audio);
            }
        }

        @Override // p153l.nc1
        /* JADX INFO: renamed from: b */
        public void mo64135b(AudioRecordState audioRecordState) {
            if (NullChecker.m82486a(this.f41593b)) {
                this.f41593b.call(audioRecordState);
            }
        }
    }

    public FeedPostBottomAudioView(Context context) {
        super(context);
        this.f41589a = C11409b.f41532X;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m64127B() {
        bnl0.m105525M0(this, true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m64128C(boolean z) {
        bnl0.m105525M0(this, z);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m64129E() {
        this.f41591c.m63793j();
    }

    /* JADX INFO: renamed from: F */
    public void m64130F() {
        if (NullChecker.m82486a(this.f41591c)) {
            this.f41591c.m63788F();
        }
    }

    public void setKeyboardHeight(Integer num) {
        this.f41589a = num.intValue();
        if (NullChecker.m82486a(this.f41591c)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41591c.getLayoutParams();
            layoutParams.height = num.intValue() == 0 ? qa00.m175859d(320.0f) : num.intValue();
            this.f41591c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m64131v(final boolean z) {
        Animator animatorM132170p = gt0.m132170p(this, "translationY", 0L, z ? 200L : 300L, new LinearInterpolator(), z ? this.f41589a : 0, z ? 0 : this.f41589a);
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.lth
            @Override // java.lang.Runnable
            public final void run() {
                this.f133546a.m64127B();
            }
        });
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.mth
            @Override // java.lang.Runnable
            public final void run() {
                this.f138630a.m64128C(z);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: w */
    public boolean m64132w() {
        if (!NullChecker.m82486a(this.f41591c)) {
            return false;
        }
        if (this.f41591c.getCurrentRecordState() != AudioRecordState.RECORDING && this.f41591c.getCurrentRecordState() != AudioRecordState.COMPLETING) {
            return false;
        }
        this.f41591c.m63788F();
        new mxg(this.f41590b).m160668j(R$string.f39800P0).m160667i(R$string.f39993s3, new Runnable() { // from class: l.nth
            @Override // java.lang.Runnable
            public final void run() {
                this.f143600a.m64129E();
            }
        }).m160665g(R$string.f39865a).show();
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m64133z(Act act, y20 y20Var, y20 y20Var2) {
        this.f41590b = act;
        if (this.f41591c == null) {
            this.f41591c = new FeedAudioRecordView(act);
            int iM175859d = this.f41589a;
            if (iM175859d == 0) {
                iM175859d = qa00.m175859d(320.0f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iM175859d);
            layoutParams.gravity = 80;
            this.f41591c.setLayoutParams(layoutParams);
            this.f41591c.setAudioRecordStateChangeListener(new C11410a(y20Var, y20Var2));
            addView(this.f41591c);
        }
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41589a = C11409b.f41532X;
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41589a = C11409b.f41532X;
    }
}
