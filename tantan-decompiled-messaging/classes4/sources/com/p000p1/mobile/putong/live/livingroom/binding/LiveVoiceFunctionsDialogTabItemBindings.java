package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabItemView;
import l.jfd0;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceFunctionsDialogTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabItemView f4367a;

    /* JADX INFO: renamed from: b */
    public VFrame f4368b;

    /* JADX INFO: renamed from: c */
    public View f4369c;

    /* JADX INFO: renamed from: d */
    public VImage f4370d;

    /* JADX INFO: renamed from: e */
    public VText f4371e;

    /* JADX INFO: renamed from: f */
    public VText f4372f;

    public LiveVoiceFunctionsDialogTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5534a(ViewGroup viewGroup) {
        this.f4367a = (VoiceFunctionsTabItemView) viewGroup;
        VFrame childAt = viewGroup.getChildAt(0);
        this.f4368b = childAt;
        String str = childAt == null ? "_icon_root" : null;
        View childAt2 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f4369c = childAt2;
        if (childAt2 == null) {
            str = "_background";
        }
        VImage childAt3 = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f4370d = childAt3;
        if (childAt3 == null) {
            str = "_icon";
        }
        VText childAt4 = viewGroup.getChildAt(1);
        this.f4371e = childAt4;
        if (childAt4 == null) {
            str = "_auction_tag";
        }
        VText childAt5 = viewGroup.getChildAt(2);
        this.f4372f = childAt5;
        if (childAt5 == null) {
            str = "_name";
        }
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabItemView getRoot() {
        return this.f4367a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5534a(this);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
