package com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VImage;
import p147v.VText;
import p149l.epy;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBarActionItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f31928a;

    /* JADX INFO: renamed from: b */
    public View f31929b;

    /* JADX INFO: renamed from: c */
    public VText f31930c;

    /* JADX INFO: renamed from: d */
    public View f31931d;

    public MessageBarActionItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49323a(View view) {
        epy.m117689a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49323a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31928a.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f31928a.setLayoutParams(layoutParams);
        }
        this.f31930c.getPaint().setFakeBoldText(true);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBarActionItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
