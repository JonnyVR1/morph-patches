package com.p000p1.mobile.putong.core.p004ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.R$string;
import l.rar;
import l.xdl0;
import l.zz6;
import p006l.u59;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LetterGuideView_IntlB extends VLinear {

    /* JADX INFO: renamed from: c */
    public View f7021c;

    /* JADX INFO: renamed from: d */
    public VLinear f7022d;

    /* JADX INFO: renamed from: e */
    public VText f7023e;

    /* JADX INFO: renamed from: f */
    public VText f7024f;

    /* JADX INFO: renamed from: g */
    public VText f7025g;

    public LetterGuideView_IntlB(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m9984P(View view) {
        rar.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9984P(this);
        if (zz6.u0()) {
            this.f7024f.setText(R$string.f3108za);
        }
        if (u59.m24998f0()) {
            xdl0.M(this.f7023e, false);
            this.f7024f.setText(R$string.f1566Aa);
        }
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LetterGuideView_IntlB(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
