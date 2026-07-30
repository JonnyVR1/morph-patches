package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsItemView;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.jfd0;
import p149l.q0m;
import p149l.s7m;
import p149l.t6c0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallSettingsItemViewBindings<T extends q0m> extends ConstraintLayout implements s7m<T> {

    /* JADX INFO: renamed from: d */
    public T f48032d;

    /* JADX INFO: renamed from: e */
    public MultiCallSettingsItemView f48033e;

    /* JADX INFO: renamed from: f */
    public VText f48034f;

    /* JADX INFO: renamed from: g */
    public VSwitchButton f48035g;

    public LiveMultiCallSettingsItemViewBindings(Context context) {
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

    public MultiCallSettingsItemView getRoot() {
        return this.f48033e;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72024h0(ViewGroup viewGroup) {
        this.f48033e = (MultiCallSettingsItemView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48034f = vText;
        String str = vText == null ? "_title" : null;
        VSwitchButton vSwitchButton = (VSwitchButton) viewGroup.getChildAt(1);
        this.f48035g = vSwitchButton;
        if (vSwitchButton == null) {
            str = "_switcher";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i1 */
    public void mo21065i1(T t) {
        this.f48032d = t;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168575x4, viewGroup, false);
        m72024h0((ViewGroup) viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72024h0(this);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsItemViewBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
