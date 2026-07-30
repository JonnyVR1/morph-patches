package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VText;
import p153l.g9c0;
import p153l.gta;
import p153l.o6q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemHeartbeatSuccessNewUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f31869a;

    /* JADX INFO: renamed from: b */
    public VText f31870b;

    public ItemHeartbeatSuccessNewUi(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49387a(View view) {
        o6q.m166280a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49387a(this);
        this.f31870b.getPaint().setFakeBoldText(true);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31870b.setTextColor(getResources().getColor(g9c0.f102817g));
        }
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemHeartbeatSuccessNewUi(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
