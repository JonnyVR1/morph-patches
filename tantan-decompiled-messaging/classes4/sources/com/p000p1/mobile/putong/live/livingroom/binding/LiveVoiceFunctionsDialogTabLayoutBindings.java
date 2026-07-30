package com.p000p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import l.jfd0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveVoiceFunctionsDialogTabLayoutBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabView f4373a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f4374b;

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m5535a(ViewGroup viewGroup) {
        this.f4373a = (VoiceFunctionsTabView) viewGroup;
        VRecyclerView childAt = viewGroup.getChildAt(0);
        this.f4374b = childAt;
        String str = childAt == null ? "_tab_recyclerView" : null;
        if (str == null) {
            return;
        }
        jfd0.a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabView getRoot() {
        return this.f4373a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5535a(this);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
