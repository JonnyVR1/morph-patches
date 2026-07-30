package com.p051p1.mobile.putong.core.newui.home;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.tantanapp.common.utils.NullChecker;
import p153l.ek4;

/* JADX INFO: loaded from: classes11.dex */
public class CardCertificationTips extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CardCertificationTips f22342a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f22343b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f22344c;

    /* JADX INFO: renamed from: d */
    public Animator f22345d;

    /* JADX INFO: renamed from: e */
    public long f22346e;

    /* JADX INFO: renamed from: f */
    public int f22347f;

    /* JADX INFO: renamed from: g */
    public View f22348g;

    public CardCertificationTips(Context context) {
        super(context);
        this.f22345d = null;
        this.f22346e = -1L;
        this.f22347f = -1;
    }

    /* JADX INFO: renamed from: a */
    public final void m37637a(View view) {
        ek4.m121030a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37637a(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (NullChecker.m82486a(this.f22348g)) {
            this.f22348g.setVisibility(i);
        }
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22345d = null;
        this.f22346e = -1L;
        this.f22347f = -1;
    }

    public CardCertificationTips(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22345d = null;
        this.f22346e = -1L;
        this.f22347f = -1;
    }
}
