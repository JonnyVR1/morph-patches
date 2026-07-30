package com.p046p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import p147v.VDraweeView;
import p149l.mrh;
import p149l.orh;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostAtDialogItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40614a;

    /* JADX INFO: renamed from: b */
    public TextView f40615b;

    /* JADX INFO: renamed from: c */
    public TextView f40616c;

    /* JADX INFO: renamed from: d */
    public View f40617d;

    public FeedPostAtDialogItem(@NonNull Context context) {
        super(context);
        m62674c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m62672a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mrh.m156027b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m62673b() {
        this.f40616c.setText("每天可以提问" + orh.m165571d() + "个问题，明天再来吧");
        xdl0.m208344M(this.f40617d, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m62674c(Context context) {
        addView(m62672a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: d */
    public void m62675d(NotifyUsers notifyUsers) {
        User userM209447e8;
        if (notifyUsers == null || (userM209447e8 = FeedModule.f38855d.m209447e8(notifyUsers.userId)) == null) {
            return;
        }
        qib0.f154691G.m102341Q0(this.f40614a, userM209447e8.m60124fp().profileSmall());
        this.f40615b.setText(userM209447e8.name);
        this.f40616c.setText(notifyUsers.subtitle);
        xdl0.m208344M(this.f40617d, false);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m62674c(context);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62674c(context);
    }
}
