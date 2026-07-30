package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.iam;
import p153l.k3m;
import p153l.mnd0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallSettingsItemViewBindings<T extends k3m> extends ConstraintLayout implements iam<T> {

    /* JADX INFO: renamed from: d */
    public T f48880d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsItemView f48881e;

    /* JADX INFO: renamed from: f */
    public VText f48882f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f48883g;

    public LiveMultiCallSettingsItemViewBindings(Context context) {
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

    public MultiCallSettingsItemView getRoot() {
        return this.f48881e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73207h0(ViewGroup viewGroup) {
        this.f48881e = (MultiCallSettingsItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48882f = vText;
        String str = vText == null ? "_title" : null;
        VSwitchButton vSwitchButton = (VSwitchButton) viewGroup.getChildAt(1);
        this.f48883g = vSwitchButton;
        if (vSwitchButton == null) {
            str = "_switcher";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(T t) {
        this.f48880d = t;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199307x4, viewGroup, false);
        m73207h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73207h0(this);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
