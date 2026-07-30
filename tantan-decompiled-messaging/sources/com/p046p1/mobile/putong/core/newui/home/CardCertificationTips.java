package com.p046p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import p149l.fj4;

/* JADX INFO: loaded from: classes11.dex */
public class CardCertificationTips extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardCertificationTips f21600a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f21601b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f21602c;

    /* JADX INFO: renamed from: d */
    public Animator f21603d;

    /* JADX INFO: renamed from: e */
    public long f21604e;

    /* JADX INFO: renamed from: f */
    public int f21605f;

    /* JADX INFO: renamed from: g */
    public View f21606g;

    public CardCertificationTips(Context context) {
        super(context);
        this.f21603d = null;
        this.f21604e = -1L;
        this.f21605f = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m36634a(View view) {
        fj4.m121573a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36634a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.m81303a(this.f21606g)) {
            this.f21606g.setVisibility(i);
        }
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21603d = null;
        this.f21604e = -1L;
        this.f21605f = -1;
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21603d = null;
        this.f21604e = -1L;
        this.f21605f = -1;
    }
}
