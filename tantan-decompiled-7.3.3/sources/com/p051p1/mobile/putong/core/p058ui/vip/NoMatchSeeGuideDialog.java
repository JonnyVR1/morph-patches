package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import p151v.VButton;
import p151v.VText;
import p153l.ss40;

/* JADX INFO: loaded from: classes12.dex */
public class NoMatchSeeGuideDialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public BotherOptDynamicAvatarRoundView f37817a;

    /* JADX INFO: renamed from: b */
    public VText f37818b;

    /* JADX INFO: renamed from: c */
    public VText f37819c;

    /* JADX INFO: renamed from: d */
    public VButton f37820d;

    /* JADX INFO: renamed from: e */
    public VText f37821e;

    public NoMatchSeeGuideDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57414a(View view) {
        ss40.m187689a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57414a(this);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
