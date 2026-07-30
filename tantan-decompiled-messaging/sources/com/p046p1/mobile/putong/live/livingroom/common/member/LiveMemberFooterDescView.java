package com.p046p1.mobile.putong.live.livingroom.common.member;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VText;
import p149l.h2t;
import p149l.t100;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMemberFooterDescView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveMemberFooterDescView f49192a;

    /* JADX INFO: renamed from: b */
    public VText f49193b;

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73051a(View view) {
        h2t.m129144a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final int m73052b(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 > 0 && (i2 = 206 - (i3 * 62)) > 0) {
            return t100.m186890d(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m73053c(int i) {
        m73054d(i, false);
    }

    /* JADX INFO: renamed from: d */
    public void m73054d(int i, boolean z) {
        VText vText = this.f49193b;
        if (z) {
            vText.setText("已经到底了");
        } else {
            vText.setText(R$string.f46867O5);
            this.f49192a.setPadding(0, m73052b(i), 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73051a(this);
    }

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
