package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import p147v.VButton;
import p147v.VText;
import p149l.ek40;

/* JADX INFO: loaded from: classes9.dex */
public class NoMatchSeeGuideDialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public BotherOptDynamicAvatarRoundView f36969a;

    /* JADX INFO: renamed from: b */
    public VText f36970b;

    /* JADX INFO: renamed from: c */
    public VText f36971c;

    /* JADX INFO: renamed from: d */
    public VButton f36972d;

    /* JADX INFO: renamed from: e */
    public VText f36973e;

    public NoMatchSeeGuideDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56231a(View view) {
        ek40.m116922a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56231a(this);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
