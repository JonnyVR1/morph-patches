package com.p000p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import l.g5c0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceUserCardGiftWallView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f7516d;

    /* JADX INFO: renamed from: e */
    public VText f7517e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7518f;

    /* JADX INFO: renamed from: g */
    public VLinear f7519g;

    /* JADX INFO: renamed from: h */
    public VLinear f7520h;

    /* JADX INFO: renamed from: i */
    public int f7521i;

    /* JADX INFO: renamed from: j */
    public Animator f7522j;

    /* JADX INFO: renamed from: k */
    public View f7523k;

    /* JADX INFO: renamed from: l */
    public View f7524l;

    /* JADX INFO: renamed from: m */
    public View f7525m;

    /* JADX INFO: renamed from: n */
    public Runnable f7526n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardGiftWallView$a */
    public class RunnableC0454a implements Runnable {
        public RunnableC0454a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VoiceUserCardGiftWallView.this.f7522j != null) {
                VoiceUserCardGiftWallView.this.f7522j.start();
            }
        }
    }

    public VoiceUserCardGiftWallView(Context context) {
        super(context);
        this.f7521i = 0;
        this.f7526n = new RunnableC0454a();
    }

    public VLinear getCurrentGiftLayout() {
        return this.f7525m == this.f7523k ? this.f7519g : this.f7520h;
    }

    public VText getCurrentTitleView() {
        return this.f7525m == this.f7523k ? this.f7516d : this.f7517e;
    }

    public VLinear getOtherGiftLayout() {
        return this.f7525m == this.f7523k ? this.f7520h : this.f7519g;
    }

    public View getOtherGroup() {
        View view = this.f7525m;
        View view2 = this.f7523k;
        return view == view2 ? this.f7524l : view2;
    }

    public VText getOtherTitleView() {
        return this.f7525m == this.f7523k ? this.f7517e : this.f7516d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7516d = findViewById(g5c0.N6);
        this.f7517e = findViewById(g5c0.O6);
        this.f7518f = findViewById(g5c0.d8);
        this.f7519g = findViewById(g5c0.i2);
        this.f7520h = findViewById(g5c0.j2);
        this.f7523k = findViewById(g5c0.u2);
        this.f7524l = findViewById(g5c0.v2);
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7521i = 0;
        this.f7526n = new RunnableC0454a();
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7521i = 0;
        this.f7526n = new RunnableC0454a();
    }
}
