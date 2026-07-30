package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.g5c0;
import p002l.t6c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallMainViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4048d;

    /* JADX INFO: renamed from: e */
    public MultiCallMainView f4049e;

    /* JADX INFO: renamed from: f */
    public VText f4050f;

    /* JADX INFO: renamed from: g */
    public VText f4051g;

    /* JADX INFO: renamed from: h */
    public VText f4052h;

    /* JADX INFO: renamed from: i */
    public VText f4053i;

    /* JADX INFO: renamed from: j */
    public View f4054j;

    /* JADX INFO: renamed from: k */
    public View f4055k;

    /* JADX INFO: renamed from: l */
    public ViewPager2 f4056l;

    public LiveMultiCallMainViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5428C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallMainView getRoot() {
        return this.f4049e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5429h0(ViewGroup viewGroup) {
        this.f4049e = (MultiCallMainView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4050f = childAt;
        String str = childAt == null ? "_title" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4051g = childAt2;
        if (childAt2 == null) {
            str = "_apply";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f4052h = childAt3;
        if (childAt3 == null) {
            str = "_invite";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f4053i = childAt4;
        if (childAt4 == null) {
            str = "_setting";
        }
        View childAt5 = viewGroup.getChildAt(4);
        this.f4054j = childAt5;
        if (childAt5 == null) {
            str = "_line";
        }
        View childAt6 = viewGroup.getChildAt(5);
        this.f4055k = childAt6;
        if (childAt6 == null) {
            str = "_indicator";
        }
        ViewPager2 viewPager2FindViewById = viewGroup.findViewById(g5c0.f10802B4);
        this.f4056l = viewPager2FindViewById;
        if (viewPager2FindViewById == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5430i1(T t) {
        this.f4048d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19954o4, viewGroup, false);
        m5429h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5429h0(this);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
