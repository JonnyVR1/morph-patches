package com.p051p1.mobile.putong.core.p058ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.member.R$string;
import p151v.VText;
import p153l.bnl0;
import p153l.c17;
import p153l.dhr;
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f30817a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f30818b;

    /* JADX INFO: renamed from: c */
    public VText f30819c;

    /* JADX INFO: renamed from: d */
    public TextView f30820d;

    public LikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m47972a(View view) {
        dhr.m115810a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m47973b() {
        bnl0.m105524M(this.f30817a, true);
        bnl0.m105524M(this.f30818b, false);
        this.f30817a.setText(R$string.f21438x);
    }

    /* JADX INFO: renamed from: c */
    public void m47974c() {
        LinearLayout linearLayout = this.f30818b;
        int i = qa00.f156321h;
        linearLayout.setPadding(i, 0, i, 0);
        bnl0.m105524M(this.f30817a, false);
        bnl0.m105524M(this.f30818b, true);
        this.f30819c.setText("滑错了？送你一瓶后悔药");
        this.f30820d.setText(String.format("使用反悔特权，重新喜欢%s", c17.m107528u0() ? "他" : "她"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47972a(this);
        setBackgroundColor(-1);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
