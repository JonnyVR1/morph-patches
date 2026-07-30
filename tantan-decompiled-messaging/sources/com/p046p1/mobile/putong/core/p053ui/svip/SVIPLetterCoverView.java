package com.p046p1.mobile.putong.core.p053ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.bmd0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SVIPLetterCoverView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VImage f36463A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f36464B;

    /* JADX INFO: renamed from: C */
    public TextView f36465C;

    /* JADX INFO: renamed from: D */
    public TextView f36466D;

    /* JADX INFO: renamed from: E */
    public VImage f36467E;

    /* JADX INFO: renamed from: F */
    public TextView f36468F;

    /* JADX INFO: renamed from: G */
    public TextView f36469G;

    /* JADX INFO: renamed from: H */
    public TextView f36470H;

    /* JADX INFO: renamed from: I */
    public TextView f36471I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f36472J;

    /* JADX INFO: renamed from: d */
    public Space f36473d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f36474e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f36475f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f36476g;

    /* JADX INFO: renamed from: h */
    public TextView f36477h;

    /* JADX INFO: renamed from: i */
    public TextView f36478i;

    /* JADX INFO: renamed from: j */
    public TextView f36479j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f36480k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f36481l;

    /* JADX INFO: renamed from: m */
    public TextView f36482m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f36483n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f36484o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f36485p;

    /* JADX INFO: renamed from: q */
    public TextView f36486q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f36487r;

    /* JADX INFO: renamed from: s */
    public VImage f36488s;

    /* JADX INFO: renamed from: t */
    public TextView f36489t;

    /* JADX INFO: renamed from: u */
    public TextView f36490u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f36491v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f36492w;

    /* JADX INFO: renamed from: x */
    public TextView f36493x;

    /* JADX INFO: renamed from: y */
    public TextView f36494y;

    /* JADX INFO: renamed from: z */
    public TextView f36495z;

    public SVIPLetterCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m55827h0(View view) {
        bmd0.m102639a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55827h0(this);
        xdl0.m208344M(this.f36484o, false);
        xdl0.m208344M(this.f36475f, true);
        this.f36471I = this.f36477h;
        this.f36468F = this.f36479j;
        this.f36469G = this.f36482m;
        this.f36470H = this.f36478i;
        this.f36472J = this.f36476g;
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
