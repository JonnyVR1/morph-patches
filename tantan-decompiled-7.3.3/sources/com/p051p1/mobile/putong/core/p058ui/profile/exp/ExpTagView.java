package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.AutoVDraweeView;
import p153l.bnl0;
import p153l.lyh0;
import p153l.qa00;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpTagView extends CardView {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f34019a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f34020b;

    /* JADX INFO: renamed from: c */
    public ExpTagBgView f34021c;

    public ExpTagView(@NonNull Context context) {
        super(context);
        m52144b();
    }

    /* JADX INFO: renamed from: b */
    private void m52144b() {
        setRadius(qa00.m175859d(10.0f));
        setCardBackgroundColor(0);
        setElevation(0.0f);
        setCardElevation(0.0f);
        ExpTagBgView expTagBgView = new ExpTagBgView(getContext());
        this.f34021c = expTagBgView;
        expTagBgView.setOrientation(0);
        this.f34019a = new AutoVDraweeView(getContext());
        int i = qa00.f156328o;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = qa00.f156319f;
        layoutParams.gravity = 16;
        this.f34021c.addView(this.f34019a, layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f34020b = vText_Medium;
        vText_Medium.setTypeface(lyh0.m156283c(3), 1);
        this.f34020b.setGravity(17);
        this.f34020b.setTextSize(1, 14.0f);
        this.f34020b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f34020b.setSingleLine(true);
        this.f34020b.setEllipsize(TextUtils.TruncateAt.END);
        this.f34020b.setMaxLines(1);
        this.f34021c.addView(this.f34020b, bnl0.f77545f, bnl0.f77544e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(bnl0.f77545f, qa00.m175861f(44));
        layoutParams2.gravity = 17;
        addView(this.f34021c, layoutParams2);
    }

    /* JADX INFO: renamed from: e */
    public void m52145e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            m52148i();
        } else {
            m52146f();
            this.f34019a.setImageUrl(str2);
        }
        this.f34020b.setText(str);
        this.f34021c.m52142b(-526345);
    }

    /* JADX INFO: renamed from: f */
    public final void m52146f() {
        this.f34021c.setPadding(qa00.f156323j, 0, qa00.f156326m, 0);
        bnl0.m105524M(this.f34019a, true);
    }

    /* JADX INFO: renamed from: h */
    public void m52147h(String str, int i, boolean z) {
        if (i != 0) {
            this.f34019a.setBackgroundResource(i);
            m52146f();
        } else {
            m52148i();
        }
        this.f34020b.setText(str);
        ExpTagBgView expTagBgView = this.f34021c;
        if (z) {
            expTagBgView.m52143c();
        } else {
            expTagBgView.m52142b(-4383);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m52148i() {
        ExpTagBgView expTagBgView = this.f34021c;
        int i = qa00.f156326m;
        expTagBgView.setPadding(i, 0, i, 0);
        bnl0.m105524M(this.f34019a, false);
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52144b();
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52144b();
    }
}
