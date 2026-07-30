package com.p046p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import p147v.VRecyclerView;
import p149l.jfd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceFunctionsDialogTabLayoutBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabView f48331a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f48332b;

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m72066a(ViewGroup viewGroup) {
        this.f48331a = (VoiceFunctionsTabView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f48332b = vRecyclerView;
        String str = vRecyclerView == null ? "_tab_recyclerView" : null;
        if (str == null) {
            return;
        }
        jfd0.m141176a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabView getRoot() {
        return this.f48331a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72066a(this);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
