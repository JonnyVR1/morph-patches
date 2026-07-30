package com.p046p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.g5c0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceUserCardGiftWallView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53910d;

    /* JADX INFO: renamed from: e */
    public VText f53911e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53912f;

    /* JADX INFO: renamed from: g */
    public VLinear f53913g;

    /* JADX INFO: renamed from: h */
    public VLinear f53914h;

    /* JADX INFO: renamed from: i */
    public int f53915i;

    /* JADX INFO: renamed from: j */
    public Animator f53916j;

    /* JADX INFO: renamed from: k */
    public View f53917k;

    /* JADX INFO: renamed from: l */
    public View f53918l;

    /* JADX INFO: renamed from: m */
    public View f53919m;

    /* JADX INFO: renamed from: n */
    public Runnable f53920n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardGiftWallView$a */
    public class RunnableC13052a implements Runnable {
        public RunnableC13052a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VoiceUserCardGiftWallView.this.f53916j != null) {
                VoiceUserCardGiftWallView.this.f53916j.start();
            }
        }
    }

    public VoiceUserCardGiftWallView(Context context) {
        super(context);
        this.f53915i = 0;
        this.f53920n = new RunnableC13052a();
    }

    public VLinear getCurrentGiftLayout() {
        return this.f53919m == this.f53917k ? this.f53913g : this.f53914h;
    }

    public VText getCurrentTitleView() {
        return this.f53919m == this.f53917k ? this.f53910d : this.f53911e;
    }

    public VLinear getOtherGiftLayout() {
        return this.f53919m == this.f53917k ? this.f53914h : this.f53913g;
    }

    public View getOtherGroup() {
        View view = this.f53919m;
        View view2 = this.f53917k;
        return view == view2 ? this.f53918l : view2;
    }

    public VText getOtherTitleView() {
        return this.f53919m == this.f53917k ? this.f53911e : this.f53910d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53910d = (VText) findViewById(g5c0.f100762N6);
        this.f53911e = (VText) findViewById(g5c0.f100771O6);
        this.f53912f = (VDraweeView) findViewById(g5c0.f100911d8);
        this.f53913g = (VLinear) findViewById(g5c0.f100955i2);
        this.f53914h = (VLinear) findViewById(g5c0.f100965j2);
        this.f53917k = findViewById(g5c0.f101066u2);
        this.f53918l = findViewById(g5c0.f101075v2);
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53915i = 0;
        this.f53920n = new RunnableC13052a();
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53915i = 0;
        this.f53920n = new RunnableC13052a();
    }
}
