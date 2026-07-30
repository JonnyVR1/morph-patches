package com.p051p1.mobile.putong.core.p058ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.dud0;

/* JADX INFO: loaded from: classes12.dex */
public class SVIPLetterCoverView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VImage f37311A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f37312B;

    /* JADX INFO: renamed from: C */
    public TextView f37313C;

    /* JADX INFO: renamed from: D */
    public TextView f37314D;

    /* JADX INFO: renamed from: E */
    public VImage f37315E;

    /* JADX INFO: renamed from: F */
    public TextView f37316F;

    /* JADX INFO: renamed from: G */
    public TextView f37317G;

    /* JADX INFO: renamed from: H */
    public TextView f37318H;

    /* JADX INFO: renamed from: I */
    public TextView f37319I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f37320J;

    /* JADX INFO: renamed from: d */
    public Space f37321d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f37322e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f37323f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f37324g;

    /* JADX INFO: renamed from: h */
    public TextView f37325h;

    /* JADX INFO: renamed from: i */
    public TextView f37326i;

    /* JADX INFO: renamed from: j */
    public TextView f37327j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f37328k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f37329l;

    /* JADX INFO: renamed from: m */
    public TextView f37330m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f37331n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f37332o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f37333p;

    /* JADX INFO: renamed from: q */
    public TextView f37334q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f37335r;

    /* JADX INFO: renamed from: s */
    public VImage f37336s;

    /* JADX INFO: renamed from: t */
    public TextView f37337t;

    /* JADX INFO: renamed from: u */
    public TextView f37338u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f37339v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f37340w;

    /* JADX INFO: renamed from: x */
    public TextView f37341x;

    /* JADX INFO: renamed from: y */
    public TextView f37342y;

    /* JADX INFO: renamed from: z */
    public TextView f37343z;

    public SVIPLetterCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57010h0(View view) {
        dud0.m118133a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57010h0(this);
        bnl0.m105524M(this.f37332o, false);
        bnl0.m105524M(this.f37323f, true);
        this.f37319I = this.f37325h;
        this.f37316F = this.f37327j;
        this.f37317G = this.f37330m;
        this.f37318H = this.f37326i;
        this.f37320J = this.f37324g;
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
