package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallMainView;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mdc0;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallMainViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48854d;

    /* JADX INFO: renamed from: e */
    public MultiCallMainView f48855e;

    /* JADX INFO: renamed from: f */
    public VText f48856f;

    /* JADX INFO: renamed from: g */
    public VText f48857g;

    /* JADX INFO: renamed from: h */
    public VText f48858h;

    /* JADX INFO: renamed from: i */
    public VText f48859i;

    /* JADX INFO: renamed from: j */
    public View f48860j;

    /* JADX INFO: renamed from: k */
    public View f48861k;

    /* JADX INFO: renamed from: l */
    public ViewPager2 f48862l;

    public LiveMultiCallMainViewBindings(Context context) {
        super(context);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getRoot().getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public MultiCallMainView getRoot() {
        return this.f48855e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73204h0(ViewGroup viewGroup) {
        this.f48855e = (MultiCallMainView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48856f = vText;
        String str = vText == null ? "_title" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f48857g = vText2;
        if (vText2 == null) {
            str = "_apply";
        }
        VText vText3 = (VText) viewGroup.getChildAt(2);
        this.f48858h = vText3;
        if (vText3 == null) {
            str = "_invite";
        }
        VText vText4 = (VText) viewGroup.getChildAt(3);
        this.f48859i = vText4;
        if (vText4 == null) {
            str = "_setting";
        }
        View childAt = viewGroup.getChildAt(4);
        this.f48860j = childAt;
        if (childAt == null) {
            str = "_line";
        }
        View childAt2 = viewGroup.getChildAt(5);
        this.f48861k = childAt2;
        if (childAt2 == null) {
            str = "_indicator";
        }
        ViewPager2 viewPager2 = (ViewPager2) viewGroup.findViewById(mdc0.f135897B4);
        this.f48862l = viewPager2;
        if (viewPager2 == null) {
            str = "_pager_content";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48854d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199190o4, viewGroup, false);
        m73204h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73204h0(this);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallMainViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
