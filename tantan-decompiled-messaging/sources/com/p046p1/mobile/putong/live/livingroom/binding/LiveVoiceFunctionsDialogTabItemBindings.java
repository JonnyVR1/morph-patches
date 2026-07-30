package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabItemView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceFunctionsDialogTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabItemView f48325a;

    /* JADX INFO: renamed from: b */
    public VFrame f48326b;

    /* JADX INFO: renamed from: c */
    public View f48327c;

    /* JADX INFO: renamed from: d */
    public VImage f48328d;

    /* JADX INFO: renamed from: e */
    public VText f48329e;

    /* JADX INFO: renamed from: f */
    public VText f48330f;

    public LiveVoiceFunctionsDialogTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72065a(ViewGroup viewGroup) {
        this.f48325a = (VoiceFunctionsTabItemView) viewGroup;
        VFrame vFrame = (VFrame) viewGroup.getChildAt(0);
        this.f48326b = vFrame;
        String str = vFrame == null ? "_icon_root" : null;
        View childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f48327c = childAt;
        if (childAt == null) {
            str = "_background";
        }
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f48328d = vImage;
        if (vImage == null) {
            str = "_icon";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f48329e = vText;
        if (vText == null) {
            str = "_auction_tag";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f48330f = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabItemView getRoot() {
        return this.f48325a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72065a(this);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
