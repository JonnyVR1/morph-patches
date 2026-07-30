package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VText;
import p149l.a1c0;
import p149l.o4q;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatSuccessNewUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f31021a;

    /* JADX INFO: renamed from: b */
    public VText f31022b;

    public ItemHeartbeatSuccessNewUi(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48204a(View view) {
        o4q.m162615a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48204a(this);
        this.f31022b.getPaint().setFakeBoldText(true);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31022b.setTextColor(getResources().getColor(a1c0.f67153g));
        }
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
