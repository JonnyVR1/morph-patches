package com.p046p1.mobile.putong.core.p053ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.R$string;
import p147v.VLinear;
import p147v.VText;
import p149l.rar;
import p149l.u59;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class LetterGuideView_IntlB extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f37240c;

    /* JADX INFO: renamed from: d */
    public VLinear f37241d;

    /* JADX INFO: renamed from: e */
    public VText f37242e;

    /* JADX INFO: renamed from: f */
    public VText f37243f;

    /* JADX INFO: renamed from: g */
    public VText f37244g;

    public LetterGuideView_IntlB(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m56542P(View view) {
        rar.m178533a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56542P(this);
        if (zz6.m221004u0()) {
            this.f37243f.setText(R$string.f19119za);
        }
        if (u59.m191827f0()) {
            xdl0.m208344M(this.f37242e, false);
            this.f37243f.setText(R$string.f17577Aa);
        }
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
