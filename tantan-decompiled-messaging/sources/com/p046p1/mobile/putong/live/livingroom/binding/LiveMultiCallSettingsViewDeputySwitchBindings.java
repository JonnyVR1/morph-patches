package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsDeputySwitchView;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMultiCallSettingsViewDeputySwitchBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultiCallSettingsDeputySwitchView f48042d;

    /* JADX INFO: renamed from: e */
    public VText f48043e;

    /* JADX INFO: renamed from: f */
    public VText f48044f;

    /* JADX INFO: renamed from: g */
    public VText f48045g;

    /* JADX INFO: renamed from: h */
    public VText f48046h;

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context) {
        super(context);
    }

    public MultiCallSettingsDeputySwitchView getRoot() {
        return this.f48042d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72026h0(ViewGroup viewGroup) {
        this.f48042d = (MultiCallSettingsDeputySwitchView) viewGroup;
        VText vText = (VText) viewGroup.getChildAt(0);
        this.f48043e = vText;
        String str = vText == null ? "_deputy_count" : null;
        VText vText2 = (VText) viewGroup.getChildAt(1);
        this.f48044f = vText2;
        if (vText2 == null) {
            str = "_deputy_count_4";
        }
        VText vText3 = (VText) viewGroup.getChildAt(2);
        this.f48045g = vText3;
        if (vText3 == null) {
            str = "_deputy_count_6";
        }
        VText vText4 = (VText) viewGroup.getChildAt(3);
        this.f48046h = vText4;
        if (vText4 == null) {
            str = "_deputy_count_9";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72026h0(this);
    }

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
