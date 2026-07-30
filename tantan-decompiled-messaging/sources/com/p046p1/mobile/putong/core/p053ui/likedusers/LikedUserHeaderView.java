package com.p046p1.mobile.putong.core.p053ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.member.R$string;
import p147v.VText;
import p149l.cfr;
import p149l.t100;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f29969a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29970b;

    /* JADX INFO: renamed from: c */
    public VText f29971c;

    /* JADX INFO: renamed from: d */
    public TextView f29972d;

    public LikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46789a(View view) {
        cfr.m106597a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m46790b() {
        xdl0.m208344M(this.f29969a, true);
        xdl0.m208344M(this.f29970b, false);
        this.f29969a.setText(R$string.f20696x);
    }

    /* JADX INFO: renamed from: c */
    public void m46791c() {
        LinearLayout linearLayout = this.f29970b;
        int i = t100.f167259h;
        linearLayout.setPadding(i, 0, i, 0);
        xdl0.m208344M(this.f29969a, false);
        xdl0.m208344M(this.f29970b, true);
        this.f29971c.setText("滑错了？送你一瓶后悔药");
        this.f29972d.setText(String.format("使用反悔特权，重新喜欢%s", zz6.m221004u0() ? "他" : "她"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46789a(this);
        setBackgroundColor(-1);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
