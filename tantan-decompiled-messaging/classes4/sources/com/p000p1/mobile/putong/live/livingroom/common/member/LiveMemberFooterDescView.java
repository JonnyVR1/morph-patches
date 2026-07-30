package com.p000p1.mobile.putong.live.livingroom.common.member;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.t100;
import p002l.h2t;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveMemberFooterDescView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveMemberFooterDescView f5234a;

    /* JADX INFO: renamed from: b */
    public VText f5235b;

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6577a(View view) {
        h2t.m14163a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final int m6578b(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 > 0 && (i2 = 206 - (i3 * 62)) > 0) {
            return t100.d(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m6579c(int i) {
        m6580d(i, false);
    }

    /* JADX INFO: renamed from: d */
    public void m6580d(int i, boolean z) {
        VText vText = this.f5235b;
        if (z) {
            vText.setText("已经到底了");
        } else {
            vText.setText(R$string.f2909O5);
            this.f5234a.setPadding(0, m6578b(i), 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6577a(this);
    }

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
