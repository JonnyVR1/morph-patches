package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.AutoVDraweeView;
import p149l.eqh0;
import p149l.t100;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class ExpTagView extends CardView {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f33171a;

    /* JADX INFO: renamed from: b */
    public VText_Medium f33172b;

    /* JADX INFO: renamed from: c */
    public ExpTagBgView f33173c;

    public ExpTagView(@NonNull Context context) {
        super(context);
        m50961b();
    }

    /* JADX INFO: renamed from: b */
    private void m50961b() {
        setRadius(t100.m186890d(10.0f));
        setCardBackgroundColor(0);
        setElevation(0.0f);
        setCardElevation(0.0f);
        ExpTagBgView expTagBgView = new ExpTagBgView(getContext());
        this.f33173c = expTagBgView;
        expTagBgView.setOrientation(0);
        this.f33171a = new AutoVDraweeView(getContext());
        int i = t100.f167266o;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.rightMargin = t100.f167257f;
        layoutParams.gravity = 16;
        this.f33173c.addView(this.f33171a, layoutParams);
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f33172b = vText_Medium;
        vText_Medium.setTypeface(eqh0.m117752c(3), 1);
        this.f33172b.setGravity(17);
        this.f33172b.setTextSize(1, 14.0f);
        this.f33172b.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f33172b.setSingleLine(true);
        this.f33172b.setEllipsize(TextUtils.TruncateAt.END);
        this.f33172b.setMaxLines(1);
        this.f33173c.addView(this.f33172b, xdl0.f192404f, xdl0.f192403e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f192404f, t100.m186892f(44));
        layoutParams2.gravity = 17;
        addView(this.f33173c, layoutParams2);
    }

    /* JADX INFO: renamed from: e */
    public void m50962e(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            m50965i();
        } else {
            m50963f();
            this.f33171a.setImageUrl(str2);
        }
        this.f33172b.setText(str);
        this.f33173c.m50959b(-526345);
    }

    /* JADX INFO: renamed from: f */
    public final void m50963f() {
        this.f33173c.setPadding(t100.f167261j, 0, t100.f167264m, 0);
        xdl0.m208344M(this.f33171a, true);
    }

    /* JADX INFO: renamed from: h */
    public void m50964h(String str, int i, boolean z) {
        if (i != 0) {
            this.f33171a.setBackgroundResource(i);
            m50963f();
        } else {
            m50965i();
        }
        this.f33172b.setText(str);
        ExpTagBgView expTagBgView = this.f33173c;
        if (z) {
            expTagBgView.m50960c();
        } else {
            expTagBgView.m50959b(-4383);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m50965i() {
        ExpTagBgView expTagBgView = this.f33173c;
        int i = t100.f167264m;
        expTagBgView.setPadding(i, 0, i, 0);
        xdl0.m208344M(this.f33171a, false);
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50961b();
    }

    public ExpTagView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50961b();
    }
}
