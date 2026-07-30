package com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b3c0;
import p149l.f6y;
import p149l.ftd0;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class MeetSeeCardItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f26278a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f26279b;

    /* JADX INFO: renamed from: c */
    public VText f26280c;

    /* JADX INFO: renamed from: d */
    public VText f26281d;

    public MeetSeeCardItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m42941a(View view) {
        f6y.m119700a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m42942b(String str) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (CoreModule.m29935P().m94651a().mo33489e2()) {
            qib0.f154691G.m102336O(this.f26278a, userM169430Pa.m60124fp().profile180().formatted(), 4, 30);
        } else {
            qib0.f154691G.m102331L0(this.f26278a, userM169430Pa.m60124fp().profile480().formatted());
        }
        this.f26280c.setText(userM169430Pa.age + "岁");
        this.f26281d.setText(userM169430Pa.name);
        this.f26279b.setBackground(getContext().getDrawable(b3c0.f73092l1));
        RoundingParams roundingParamsM112069p = this.f26278a.getHierarchy().m112069p();
        roundingParamsM112069p.m8265s(t100.m186890d(18.0f));
        this.f26278a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    /* JADX INFO: renamed from: c */
    public void m42943c() {
        this.f26279b.setBackground(null);
        qib0.f154691G.m102354Y0(this.f26278a, b3c0.f72891K0);
        this.f26278a.getHierarchy().m112076w(ftd0.f99177a);
        RoundingParams roundingParamsM112069p = this.f26278a.getHierarchy().m112069p();
        roundingParamsM112069p.m8261o(Color.parseColor("#ffffff"), 0.0f);
        this.f26278a.getHierarchy().m112053H(roundingParamsM112069p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42941a(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.337d), View.MeasureSpec.getMode(i2)));
    }

    public void setTextSize(int i) {
        float f = i;
        this.f26280c.setTextSize(f);
        this.f26281d.setTextSize(f);
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
