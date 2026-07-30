package com.p000p1.mobile.putong.core.p004ui.svip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import l.bmd0;
import l.xdl0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SVIPLetterCoverView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public VImage f6244A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f6245B;

    /* JADX INFO: renamed from: C */
    public TextView f6246C;

    /* JADX INFO: renamed from: D */
    public TextView f6247D;

    /* JADX INFO: renamed from: E */
    public VImage f6248E;

    /* JADX INFO: renamed from: F */
    public TextView f6249F;

    /* JADX INFO: renamed from: G */
    public TextView f6250G;

    /* JADX INFO: renamed from: H */
    public TextView f6251H;

    /* JADX INFO: renamed from: I */
    public TextView f6252I;

    /* JADX INFO: renamed from: J */
    public VDraweeView f6253J;

    /* JADX INFO: renamed from: d */
    public Space f6254d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f6255e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f6256f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f6257g;

    /* JADX INFO: renamed from: h */
    public TextView f6258h;

    /* JADX INFO: renamed from: i */
    public TextView f6259i;

    /* JADX INFO: renamed from: j */
    public TextView f6260j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f6261k;

    /* JADX INFO: renamed from: l */
    public GradientBgButton f6262l;

    /* JADX INFO: renamed from: m */
    public TextView f6263m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f6264n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f6265o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f6266p;

    /* JADX INFO: renamed from: q */
    public TextView f6267q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f6268r;

    /* JADX INFO: renamed from: s */
    public VImage f6269s;

    /* JADX INFO: renamed from: t */
    public TextView f6270t;

    /* JADX INFO: renamed from: u */
    public TextView f6271u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f6272v;

    /* JADX INFO: renamed from: w */
    public GradientBgButton f6273w;

    /* JADX INFO: renamed from: x */
    public TextView f6274x;

    /* JADX INFO: renamed from: y */
    public TextView f6275y;

    /* JADX INFO: renamed from: z */
    public TextView f6276z;

    public SVIPLetterCoverView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m9225h0(View view) {
        bmd0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9225h0(this);
        xdl0.M(this.f6265o, false);
        xdl0.M(this.f6256f, true);
        this.f6252I = this.f6258h;
        this.f6249F = this.f6260j;
        this.f6250G = this.f6263m;
        this.f6251H = this.f6259i;
        this.f6253J = this.f6257g;
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVIPLetterCoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
