package com.p051p1.mobile.putong.core.p058ui.seepage.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VFrame_Shadow;
import p153l.bnl0;
import p153l.jen;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class IntlFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f36638h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f36639i;

    /* JADX INFO: renamed from: j */
    public TextView f36640j;

    /* JADX INFO: renamed from: k */
    public TextView f36641k;

    /* JADX INFO: renamed from: l */
    public TextView f36642l;

    /* JADX INFO: renamed from: m */
    public User f36643m;

    public IntlFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f36643m;
    }

    /* JADX INFO: renamed from: h */
    public final void m56153h(View view) {
        jen.m144601a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m56154i(User user) {
        this.f36643m = user;
        uqb0.f180374G.m127120O(this.f36638h, user.m61308fp().profileBig().formatted(), 4, 35);
        this.f36641k.setText(CoreModule.m30933P().m143405a().mo34551mi(user.location.distance));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56153h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f36639i.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f36639i.setLayoutParams(layoutParams);
        }
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
