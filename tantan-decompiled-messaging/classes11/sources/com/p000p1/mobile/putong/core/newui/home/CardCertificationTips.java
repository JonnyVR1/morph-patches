package com.p000p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import l.fj4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardCertificationTips extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardCertificationTips f378a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f379b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f380c;

    /* JADX INFO: renamed from: d */
    public Animator f381d;

    /* JADX INFO: renamed from: e */
    public long f382e;

    /* JADX INFO: renamed from: f */
    public int f383f;

    /* JADX INFO: renamed from: g */
    public View f384g;

    public CardCertificationTips(Context context) {
        super(context);
        this.f381d = null;
        this.f382e = -1L;
        this.f383f = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m583a(View view) {
        fj4.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m583a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.a(this.f384g)) {
            this.f384g.setVisibility(i);
        }
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f381d = null;
        this.f382e = -1L;
        this.f383f = -1;
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f381d = null;
        this.f382e = -1L;
        this.f383f = -1;
    }
}
