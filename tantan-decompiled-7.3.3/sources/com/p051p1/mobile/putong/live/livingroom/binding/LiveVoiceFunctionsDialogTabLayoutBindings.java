package com.p051p1.mobile.putong.live.livingroom.binding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.tab.VoiceFunctionsTabView;
import p151v.VRecyclerView;
import p153l.mnd0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveVoiceFunctionsDialogTabLayoutBindings extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VoiceFunctionsTabView f49179a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f49180b;

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m73249a(ViewGroup viewGroup) {
        this.f49179a = (VoiceFunctionsTabView) viewGroup;
        VRecyclerView vRecyclerView = (VRecyclerView) viewGroup.getChildAt(0);
        this.f49180b = vRecyclerView;
        String str = vRecyclerView == null ? "_tab_recyclerView" : null;
        if (str == null) {
            return;
        }
        mnd0.m159157a("Missing required view with ID:".concat(str));
    }

    public VoiceFunctionsTabView getRoot() {
        return this.f49179a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73249a(this);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceFunctionsDialogTabLayoutBindings(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
