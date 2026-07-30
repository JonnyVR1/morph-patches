package com.p051p1.mobile.putong.live.livingroom.common.member;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VText;
import p153l.i4t;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LiveMemberFooterDescView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LiveMemberFooterDescView f50040a;

    /* JADX INFO: renamed from: b */
    public VText f50041b;

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m74234a(View view) {
        i4t.m138582a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final int m74235b(int i) {
        int i2;
        int i3 = i - 1;
        if (i3 > 0 && (i2 = 206 - (i3 * 62)) > 0) {
            return qa00.m175859d(i2);
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m74236c(int i) {
        m74237d(i, false);
    }

    /* JADX INFO: renamed from: d */
    public void m74237d(int i, boolean z) {
        VText vText = this.f50041b;
        if (z) {
            vText.setText("已经到底了");
        } else {
            vText.setText(R$string.f47715O5);
            this.f50040a.setPadding(0, m74235b(i), 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74234a(this);
    }

    public LiveMemberFooterDescView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
