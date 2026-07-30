package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabItemView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceFunctionsDialogTabItemBindings extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabItemView f49173a;

    /* JADX INFO: renamed from: b */
    public VFrame f49174b;

    /* JADX INFO: renamed from: c */
    public View f49175c;

    /* JADX INFO: renamed from: d */
    public VImage f49176d;

    /* JADX INFO: renamed from: e */
    public VText f49177e;

    /* JADX INFO: renamed from: f */
    public VText f49178f;

    public LiveVoiceFunctionsDialogTabItemBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73248a(ViewGroup viewGroup) {
        this.f49173a = (VoiceFunctionsTabItemView) viewGroup;
        VFrame vFrame = (VFrame) viewGroup.getChildAt(0);
        this.f49174b = vFrame;
        String str = vFrame == null ? "_icon_root" : null;
        View childAt = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        this.f49175c = childAt;
        if (childAt == null) {
            str = "_background";
        }
        VImage vImage = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        this.f49176d = vImage;
        if (vImage == null) {
            str = "_icon";
        }
        VText vText = (VText) viewGroup.getChildAt(1);
        this.f49177e = vText;
        if (vText == null) {
            str = "_auction_tag";
        }
        VText vText2 = (VText) viewGroup.getChildAt(2);
        this.f49178f = vText2;
        if (vText2 == null) {
            str = "_name";
        }
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabItemView getRoot() {
        return this.f49173a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73248a(this);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabItemBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
