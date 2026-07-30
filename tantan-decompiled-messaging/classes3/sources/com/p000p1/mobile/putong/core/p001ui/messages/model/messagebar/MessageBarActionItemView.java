package com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.epy;
import l.ura;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageBarActionItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f1819a;

    /* JADX INFO: renamed from: b */
    public View f1820b;

    /* JADX INFO: renamed from: c */
    public VText f1821c;

    /* JADX INFO: renamed from: d */
    public View f1822d;

    public MessageBarActionItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2452a(View view) {
        epy.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2452a(this);
        if (ura.e().d().I4()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f1819a.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f1819a.setLayoutParams(layoutParams);
        }
        this.f1821c.getPaint().setFakeBoldText(true);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
