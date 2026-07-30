package com.p046p1.mobile.putong.feed.newui.mediapicker.post.bottom;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.AudioRecordState;
import com.p046p1.mobile.putong.feed.newui.mediapicker.audiopost.FeedAudioRecordView;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.C11246b;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p149l.bt0;
import p149l.e30;
import p149l.gc1;
import p149l.t100;
import p149l.xdl0;
import p149l.xvg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostBottomAudioView extends VFrame {

    /* JADX INFO: renamed from: a */
    public int f40741a;

    /* JADX INFO: renamed from: b */
    public Act f40742b;

    /* JADX INFO: renamed from: c */
    public FeedAudioRecordView f40743c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.mediapicker.post.bottom.FeedPostBottomAudioView$a */
    public class C11247a implements gc1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e30 f40744a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f40745b;

        public C11247a(e30 e30Var, e30 e30Var2) {
            this.f40744a = e30Var;
            this.f40745b = e30Var2;
        }

        @Override // p149l.gc1
        /* JADX INFO: renamed from: a */
        public void mo62951a(Audio audio) {
            if (NullChecker.m81303a(this.f40744a)) {
                this.f40744a.call(audio);
            }
        }

        @Override // p149l.gc1
        /* JADX INFO: renamed from: b */
        public void mo62952b(AudioRecordState audioRecordState) {
            if (NullChecker.m81303a(this.f40745b)) {
                this.f40745b.call(audioRecordState);
            }
        }
    }

    public FeedPostBottomAudioView(Context context) {
        super(context);
        this.f40741a = C11246b.f40684X;
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m62944B() {
        xdl0.m208345M0(this, true);
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m62945C(boolean z) {
        xdl0.m208345M0(this, z);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m62946E() {
        this.f40743c.m62610j();
    }

    /* JADX INFO: renamed from: F */
    public void m62947F() {
        if (NullChecker.m81303a(this.f40743c)) {
            this.f40743c.m62605F();
        }
    }

    public void setKeyboardHeight(Integer num) {
        this.f40741a = num.intValue();
        if (NullChecker.m81303a(this.f40743c)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40743c.getLayoutParams();
            layoutParams.height = num.intValue() == 0 ? t100.m186890d(320.0f) : num.intValue();
            this.f40743c.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m62948v(final boolean z) {
        Animator animatorM103743p = bt0.m103743p(this, "translationY", 0L, z ? 200L : 300L, new LinearInterpolator(), z ? this.f40741a : 0, z ? 0 : this.f40741a);
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.wrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f187796a.m62944B();
            }
        });
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.xrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f194144a.m62945C(z);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: w */
    public boolean m62949w() {
        if (!NullChecker.m81303a(this.f40743c)) {
            return false;
        }
        if (this.f40743c.getCurrentRecordState() != AudioRecordState.RECORDING && this.f40743c.getCurrentRecordState() != AudioRecordState.COMPLETING) {
            return false;
        }
        this.f40743c.m62605F();
        new xvg(this.f40742b).m211291j(R$string.f38952P0).m211290i(R$string.f39145s3, new Runnable() { // from class: l.yrh
            @Override // java.lang.Runnable
            public final void run() {
                this.f199669a.m62946E();
            }
        }).m211288g(R$string.f39017a).show();
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m62950z(Act act, e30 e30Var, e30 e30Var2) {
        this.f40742b = act;
        if (this.f40743c == null) {
            this.f40743c = new FeedAudioRecordView(act);
            int iM186890d = this.f40741a;
            if (iM186890d == 0) {
                iM186890d = t100.m186890d(320.0f);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, iM186890d);
            layoutParams.gravity = 80;
            this.f40743c.setLayoutParams(layoutParams);
            this.f40743c.setAudioRecordStateChangeListener(new C11247a(e30Var, e30Var2));
            addView(this.f40743c);
        }
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40741a = C11246b.f40684X;
    }

    public FeedPostBottomAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40741a = C11246b.f40684X;
    }
}
