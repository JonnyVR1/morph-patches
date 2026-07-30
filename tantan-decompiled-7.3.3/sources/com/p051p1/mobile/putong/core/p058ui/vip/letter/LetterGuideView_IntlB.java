package com.p051p1.mobile.putong.core.p058ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.R$string;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c17;
import p153l.d79;
import p153l.tcr;

/* JADX INFO: loaded from: classes12.dex */
public class LetterGuideView_IntlB extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f38088c;

    /* JADX INFO: renamed from: d */
    public VLinear f38089d;

    /* JADX INFO: renamed from: e */
    public VText f38090e;

    /* JADX INFO: renamed from: f */
    public VText f38091f;

    /* JADX INFO: renamed from: g */
    public VText f38092g;

    public LetterGuideView_IntlB(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m57725P(View view) {
        tcr.m190491a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57725P(this);
        if (c17.m107528u0()) {
            this.f38091f.setText(R$string.f18606Ka);
        }
        if (d79.m114685j0()) {
            bnl0.m105524M(this.f38090e, false);
            this.f38091f.setText(R$string.f18637La);
        }
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
