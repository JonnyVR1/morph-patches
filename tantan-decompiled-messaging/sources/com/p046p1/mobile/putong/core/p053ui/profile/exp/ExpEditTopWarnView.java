package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.AutoVDraweeView;
import p147v.VText;
import p149l.mep0;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpEditTopWarnView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f33151a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f33152b;

    /* JADX INFO: renamed from: c */
    public VText f33153c;

    /* JADX INFO: renamed from: d */
    public AutoVDraweeView f33154d;

    public ExpEditTopWarnView(@NonNull Context context) {
        super(context);
        m50944a();
    }

    /* JADX INFO: renamed from: a */
    public final void m50944a() {
        VText_Medium vText_Medium = new VText_Medium(getContext());
        this.f33151a = vText_Medium;
        vText_Medium.setCompoundDrawablePadding(t100.f167259h);
        this.f33151a.setGravity(17);
        this.f33151a.setTextSize(1, 13.0f);
        this.f33151a.setTextColor(getContext().getResources().getColor(w0c0.f183899x));
        addView(this.f33151a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33152b = linearLayout;
        linearLayout.setOrientation(0);
        this.f33152b.setShowDividers(2);
        this.f33152b.setDividerPadding(t100.f167256e);
        this.f33152b.setGravity(16);
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 21;
        layoutParams.rightMargin = t100.f167268q;
        addView(this.f33152b, layoutParams);
        VText vText = new VText(getContext());
        this.f33153c = vText;
        vText.setTextSize(1, 13.0f);
        this.f33153c.setTextColor(getContext().getResources().getColor(w0c0.f183899x));
        this.f33152b.addView(this.f33153c);
        View view = new View(getContext());
        int i2 = t100.f167265n;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        view.setBackgroundResource(x2c0.f190343ls);
        this.f33152b.addView(view, layoutParams2);
        mep0.m154302d1(this, t100.f167264m);
    }

    /* JADX INFO: renamed from: b */
    public final void m50945b() {
        xdl0.m208344M(this.f33152b, false);
        this.f33151a.setGravity(17);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33151a.getLayoutParams();
        int i = xdl0.f192404f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 17;
        int i2 = t100.f167266o;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        this.f33151a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m50946c(String str, int i, int i2) {
        m50945b();
        this.f33151a.setText(str);
        this.f33151a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        AutoVDraweeView autoVDraweeView = this.f33154d;
        if (autoVDraweeView != null) {
            xdl0.m208344M(autoVDraweeView, false);
        }
        if (i2 != 0) {
            setBackgroundResource(i2);
        } else {
            setBackgroundResource(x2c0.f189507L6);
        }
        setOnClickListener(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m50947d() {
        xdl0.m208344M(this.f33152b, true);
        this.f33151a.setGravity(19);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f33151a.getLayoutParams();
        int i = xdl0.f192404f;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 19;
        layoutParams.leftMargin = t100.f167268q;
        layoutParams.rightMargin = t100.f167240O;
        this.f33151a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: e */
    public void m50948e(String str, String str2, int i, String str3) {
        m50947d();
        this.f33151a.setText(str);
        this.f33151a.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.f33153c.setText(str2);
        boolean zIsEmpty = TextUtils.isEmpty(str3);
        AutoVDraweeView autoVDraweeView = this.f33154d;
        if (zIsEmpty) {
            if (autoVDraweeView != null) {
                xdl0.m208344M(autoVDraweeView, false);
            }
            setBackgroundResource(x2c0.f189507L6);
            return;
        }
        if (autoVDraweeView == null) {
            AutoVDraweeView autoVDraweeView2 = new AutoVDraweeView(getContext());
            this.f33154d = autoVDraweeView2;
            int i2 = xdl0.f192403e;
            addView(autoVDraweeView2, 0, new LinearLayout.LayoutParams(i2, i2));
        }
        this.f33154d.setImageUrl(str3);
        xdl0.m208344M(this.f33154d, true);
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50944a();
    }

    public ExpEditTopWarnView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50944a();
    }
}
