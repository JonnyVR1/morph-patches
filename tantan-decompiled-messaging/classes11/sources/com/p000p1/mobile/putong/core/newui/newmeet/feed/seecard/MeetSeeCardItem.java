package com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard;

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
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.b3c0;
import l.f6y;
import l.ftd0;
import l.qib0;
import l.t100;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetSeeCardItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f5056a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5057b;

    /* JADX INFO: renamed from: c */
    public VText f5058c;

    /* JADX INFO: renamed from: d */
    public VText f5059d;

    public MeetSeeCardItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7136a(View view) {
        f6y.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7137b(String str) {
        User userPa = CoreModule.c.e0.Pa(str);
        if (CoreModule.P().a().e2()) {
            qib0.G.O(this.f5056a, userPa.fp().profile180().formatted(), 4, 30);
        } else {
            qib0.G.L0(this.f5056a, userPa.fp().profile480().formatted());
        }
        this.f5058c.setText(userPa.age + "岁");
        this.f5059d.setText(userPa.name);
        this.f5057b.setBackground(getContext().getDrawable(b3c0.l1));
        RoundingParams roundingParamsP = this.f5056a.getHierarchy().p();
        roundingParamsP.s(t100.d(18.0f));
        this.f5056a.getHierarchy().H(roundingParamsP);
    }

    /* JADX INFO: renamed from: c */
    public void m7138c() {
        this.f5057b.setBackground(null);
        qib0.G.Y0(this.f5056a, b3c0.K0);
        this.f5056a.getHierarchy().w(ftd0.a);
        RoundingParams roundingParamsP = this.f5056a.getHierarchy().p();
        roundingParamsP.o(Color.parseColor("#ffffff"), 0.0f);
        this.f5056a.getHierarchy().H(roundingParamsP);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7136a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.337d), View.MeasureSpec.getMode(i2)));
    }

    public void setTextSize(int i) {
        float f = i;
        this.f5058c.setTextSize(f);
        this.f5059d.setTextSize(f);
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
