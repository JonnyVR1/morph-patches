package com.p046p1.mobile.putong.core.p053ui.seepage.likers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VFrame_Shadow;
import p149l.jcn;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlFakeLikersItem extends VFrame_Shadow {

    /* JADX INFO: renamed from: h */
    public VDraweeView f35790h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f35791i;

    /* JADX INFO: renamed from: j */
    public TextView f35792j;

    /* JADX INFO: renamed from: k */
    public TextView f35793k;

    /* JADX INFO: renamed from: l */
    public TextView f35794l;

    /* JADX INFO: renamed from: m */
    public User f35795m;

    public IntlFakeLikersItem(@NonNull Context context) {
        super(context);
    }

    public User getUser() {
        return this.f35795m;
    }

    /* JADX INFO: renamed from: h */
    public final void m54970h(View view) {
        jcn.m140982a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m54971i(User user) {
        this.f35795m = user;
        qib0.f154691G.m102336O(this.f35790h, user.m60124fp().profileBig().formatted(), 4, 35);
        this.f35793k.setText(CoreModule.m29935P().m94651a().mo33548mi(user.location.distance));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54970h(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 1.33f), 1073741824));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35791i.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f35791i.setLayoutParams(layoutParams);
        }
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlFakeLikersItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
