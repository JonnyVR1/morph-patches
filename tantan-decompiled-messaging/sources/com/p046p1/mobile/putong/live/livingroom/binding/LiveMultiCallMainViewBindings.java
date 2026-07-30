package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import p147v.VText;
import p149l.g5c0;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallMainViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48006d;

    /* JADX INFO: renamed from: e */
    public MultiCallMainView f48007e;

    /* JADX INFO: renamed from: f */
    public VText f48008f;

    /* JADX INFO: renamed from: g */
    public VText f48009g;

    /* JADX INFO: renamed from: h */
    public VText f48010h;

    /* JADX INFO: renamed from: i */
    public VText f48011i;

    /* JADX INFO: renamed from: j */
    public View f48012j;

    /* JADX INFO: renamed from: k */
    public View f48013k;

    /* JADX INFO: renamed from: l */
    public ViewPager2 f48014l;

    public LiveMultiCallMainViewBindings(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public MultiCallMainView getRoot() {
        return this.f48007e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72021h0(ViewGroup viewGroup) {
        this.f48007e = (MultiCallMainView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48008f = vText;
        String str = vText == null ? "_title" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f48009g = vText2;
        if (vText2 == null) {
            str = "_apply";
        }
        VText vText3 = (VText) viewGroup.getChildAt(2);
        this.f48010h = vText3;
        if (vText3 == null) {
            str = "_invite";
        }
        VText vText4 = (VText) viewGroup.getChildAt(3);
        this.f48011i = vText4;
        if (vText4 == null) {
            str = "_setting";
        }
        View childAt = viewGroup.getChildAt(4);
        this.f48012j = childAt;
        if (childAt == null) {
            str = "_line";
        }
        View childAt2 = viewGroup.getChildAt(5);
        this.f48013k = childAt2;
        if (childAt2 == null) {
            str = "_indicator";
        }
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(g5c0.f100652B4);
        this.f48014l = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48006d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168458o4, viewGroup, false);
        m72021h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72021h0(this);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
