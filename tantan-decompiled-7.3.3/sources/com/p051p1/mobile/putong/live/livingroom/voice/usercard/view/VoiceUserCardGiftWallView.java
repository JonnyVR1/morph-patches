package com.p051p1.mobile.putong.live.livingroom.voice.usercard.view;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.mdc0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceUserCardGiftWallView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f54758d;

    /* JADX INFO: renamed from: e */
    public VText f54759e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54760f;

    /* JADX INFO: renamed from: g */
    public VLinear f54761g;

    /* JADX INFO: renamed from: h */
    public VLinear f54762h;

    /* JADX INFO: renamed from: i */
    public int f54763i;

    /* JADX INFO: renamed from: j */
    public Animator f54764j;

    /* JADX INFO: renamed from: k */
    public View f54765k;

    /* JADX INFO: renamed from: l */
    public View f54766l;

    /* JADX INFO: renamed from: m */
    public View f54767m;

    /* JADX INFO: renamed from: n */
    public Runnable f54768n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.usercard.view.VoiceUserCardGiftWallView$a */
    public class RunnableC13215a implements Runnable {
        public RunnableC13215a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VoiceUserCardGiftWallView.this.f54764j != null) {
                VoiceUserCardGiftWallView.this.f54764j.start();
            }
        }
    }

    public VoiceUserCardGiftWallView(Context context) {
        super(context);
        this.f54763i = 0;
        this.f54768n = new RunnableC13215a();
    }

    public VLinear getCurrentGiftLayout() {
        return this.f54767m == this.f54765k ? this.f54761g : this.f54762h;
    }

    public VText getCurrentTitleView() {
        return this.f54767m == this.f54765k ? this.f54758d : this.f54759e;
    }

    public VLinear getOtherGiftLayout() {
        return this.f54767m == this.f54765k ? this.f54762h : this.f54761g;
    }

    public View getOtherGroup() {
        View view = this.f54767m;
        View view2 = this.f54765k;
        return view == view2 ? this.f54766l : view2;
    }

    public VText getOtherTitleView() {
        return this.f54767m == this.f54765k ? this.f54759e : this.f54758d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54758d = (VText) findViewById(mdc0.f136007N6);
        this.f54759e = (VText) findViewById(mdc0.f136016O6);
        this.f54760f = (VDraweeView) findViewById(mdc0.f136156d8);
        this.f54761g = (VLinear) findViewById(mdc0.f136200i2);
        this.f54762h = (VLinear) findViewById(mdc0.f136210j2);
        this.f54765k = findViewById(mdc0.f136311u2);
        this.f54766l = findViewById(mdc0.f136320v2);
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54763i = 0;
        this.f54768n = new RunnableC13215a();
    }

    public VoiceUserCardGiftWallView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54763i = 0;
        this.f54768n = new RunnableC13215a();
    }
}
