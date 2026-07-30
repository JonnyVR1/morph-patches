package com.p000p1.mobile.putong.core.p004ui.seepage.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import l.jcn;
import l.t100;
import l.xdl0;
import p006l.qib0;
import v.VDraweeView;
import v.VFrame_Shadow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f5571h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f5572i;

    /* JADX INFO: renamed from: j */
    public TextView f5573j;

    /* JADX INFO: renamed from: k */
    public TextView f5574k;

    /* JADX INFO: renamed from: l */
    public TextView f5575l;

    /* JADX INFO: renamed from: m */
    public User f5576m;

    public IntlFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f5576m;
    }

    /* JADX INFO: renamed from: h */
    public final void m8335h(View view) {
        jcn.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m8336i(User user) {
        this.f5576m = user;
        qib0.f19782G.m12749O(this.f5571h, user.fp().profileBig().formatted(), 4, 35);
        this.f5574k.setText(CoreModule.m1854P().m11706a().m5485mi(user.location.distance));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8335h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5572i.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f5572i.setLayoutParams(layoutParams);
        }
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
