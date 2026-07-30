package com.p000p1.mobile.putong.core.p001ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.member.R;
import l.cfr;
import l.t100;
import l.xdl0;
import l.zz6;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUserHeaderView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f78a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f79b;

    /* JADX INFO: renamed from: c */
    public VText f80c;

    /* JADX INFO: renamed from: d */
    public TextView f81d;

    public LikedUserHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m464a(View view) {
        cfr.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m465b() {
        xdl0.M(this.f78a, true);
        xdl0.M(this.f79b, false);
        this.f78a.setText(R.string.x);
    }

    /* JADX INFO: renamed from: c */
    public void m466c() {
        LinearLayout linearLayout = this.f79b;
        int i = t100.h;
        linearLayout.setPadding(i, 0, i, 0);
        xdl0.M(this.f78a, false);
        xdl0.M(this.f79b, true);
        this.f80c.setText("滑错了？送你一瓶后悔药");
        this.f81d.setText(String.format("使用反悔特权，重新喜欢%s", zz6.u0() ? "他" : "她"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m464a(this);
        setBackgroundColor(-1);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
