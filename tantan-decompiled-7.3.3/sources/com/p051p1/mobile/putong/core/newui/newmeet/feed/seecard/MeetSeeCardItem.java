package com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VText;
import p153l.cfy;
import p153l.gbc0;
import p153l.h1e0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class MeetSeeCardItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f27020a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f27021b;

    /* JADX INFO: renamed from: c */
    public VText f27022c;

    /* JADX INFO: renamed from: d */
    public VText f27023d;

    public MeetSeeCardItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m43952a(View view) {
        cfy.m109660a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m43953b(String str) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (CoreModule.m30933P().m143405a().mo34492e2()) {
            uqb0.f180374G.m127120O(this.f27020a, userM116503Pa.m61308fp().profile180().formatted(), 4, 30);
        } else {
            uqb0.f180374G.m127115L0(this.f27020a, userM116503Pa.m61308fp().profile480().formatted());
        }
        this.f27022c.setText(userM116503Pa.age + "岁");
        this.f27023d.setText(userM116503Pa.name);
        this.f27021b.setBackground(getContext().getDrawable(gbc0.f103343l1));
        RoundingParams roundingParamsM207055p = this.f27020a.getHierarchy().m207055p();
        roundingParamsM207055p.m8319s(qa00.m175859d(18.0f));
        this.f27020a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    /* JADX INFO: renamed from: c */
    public void m43954c() {
        this.f27021b.setBackground(null);
        uqb0.f180374G.m127138Y0(this.f27020a, gbc0.f103142K0);
        this.f27020a.getHierarchy().m207062w(h1e0.f107444a);
        RoundingParams roundingParamsM207055p = this.f27020a.getHierarchy().m207055p();
        roundingParamsM207055p.m8315o(Color.parseColor("#ffffff"), 0.0f);
        this.f27020a.getHierarchy().m207045H(roundingParamsM207055p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43952a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.337d), View.MeasureSpec.getMode(i2)));
    }

    public void setTextSize(int i) {
        float f = i;
        this.f27022c.setTextSize(f);
        this.f27023d.setTextSize(f);
    }

    public void setWidth(int i) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public MeetSeeCardItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MeetSeeCardItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
