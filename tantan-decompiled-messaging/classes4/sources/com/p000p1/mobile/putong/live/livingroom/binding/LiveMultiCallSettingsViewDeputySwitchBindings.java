package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallSettingsDeputySwitchView;
import l.jfd0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMultiCallSettingsViewDeputySwitchBindings extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public MultiCallSettingsDeputySwitchView f4084d;

    /* JADX INFO: renamed from: e */
    public VText f4085e;

    /* JADX INFO: renamed from: f */
    public VText f4086f;

    /* JADX INFO: renamed from: g */
    public VText f4087g;

    /* JADX INFO: renamed from: h */
    public VText f4088h;

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context) {
        super(context);
    }

    public MultiCallSettingsDeputySwitchView getRoot() {
        return this.f4084d;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5443h0(ViewGroup viewGroup) {
        this.f4084d = (MultiCallSettingsDeputySwitchView) viewGroup;
        VText childAt = viewGroup.getChildAt(0);
        this.f4085e = childAt;
        String str = childAt == null ? "_deputy_count" : null;
        VText childAt2 = viewGroup.getChildAt(1);
        this.f4086f = childAt2;
        if (childAt2 == null) {
            str = "_deputy_count_4";
        }
        VText childAt3 = viewGroup.getChildAt(2);
        this.f4087g = childAt3;
        if (childAt3 == null) {
            str = "_deputy_count_6";
        }
        VText childAt4 = viewGroup.getChildAt(3);
        this.f4088h = childAt4;
        if (childAt4 == null) {
            str = "_deputy_count_9";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5443h0(this);
    }

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMultiCallSettingsViewDeputySwitchBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
