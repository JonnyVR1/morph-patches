package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import l.ek40;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NoMatchSeeGuideDialog extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public BotherOptDynamicAvatarRoundView f6750a;

    /* JADX INFO: renamed from: b */
    public VText f6751b;

    /* JADX INFO: renamed from: c */
    public VText f6752c;

    /* JADX INFO: renamed from: d */
    public VButton f6753d;

    /* JADX INFO: renamed from: e */
    public VText f6754e;

    public NoMatchSeeGuideDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9664a(View view) {
        ek40.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9664a(this);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoMatchSeeGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
