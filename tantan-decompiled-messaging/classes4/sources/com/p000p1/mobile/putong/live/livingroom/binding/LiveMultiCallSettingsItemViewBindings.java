package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import l.jfd0;
import l.q0m;
import l.s7m;
import p002l.t6c0;
import v.VSwitchButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallSettingsItemViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f4074d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsItemView f4075e;

    /* JADX INFO: renamed from: f */
    public VText f4076f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f4077g;

    public LiveMultiCallSettingsItemViewBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5437C0() {
        return getRoot().getContext();
    }

    public void destroy() {
    }

    public MultiCallSettingsItemView getRoot() {
        return this.f4075e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5438h0(ViewGroup viewGroup) {
        this.f4075e = (MultiCallSettingsItemView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4076f = childAt;
        String str = childAt == null ? "_title" : null;
        VSwitchButton childAt2 = viewGroup.getChildAt(1);
        this.f4077g = childAt2;
        if (childAt2 == null) {
            str = "_switcher";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX INFO: renamed from: i1 */
    public void m5439i1(T t) {
        this.f4074d = t;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20071x4, viewGroup, false);
        m5438h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5438h0(this);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
