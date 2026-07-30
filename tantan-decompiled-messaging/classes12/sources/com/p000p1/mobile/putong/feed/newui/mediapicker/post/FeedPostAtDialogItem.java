package com.p000p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import l.qib0;
import l.xdl0;
import p007l.mrh;
import p007l.orh;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostAtDialogItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2075a;

    /* JADX INFO: renamed from: b */
    public TextView f2076b;

    /* JADX INFO: renamed from: c */
    public TextView f2077c;

    /* JADX INFO: renamed from: d */
    public View f2078d;

    public FeedPostAtDialogItem(@NonNull Context context) {
        super(context);
        m3679c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m3677a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mrh.m12012b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m3678b() {
        this.f2077c.setText("每天可以提问" + orh.m12748d() + "个问题，明天再来吧");
        xdl0.M(this.f2078d, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m3679c(Context context) {
        addView(m3677a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: d */
    public void m3680d(NotifyUsers notifyUsers) {
        User userM16628e8;
        if (notifyUsers == null || (userM16628e8 = FeedModule.f316d.m16628e8(notifyUsers.userId)) == null) {
            return;
        }
        qib0.G.Q0(this.f2075a, userM16628e8.m1042fp().profileSmall());
        this.f2076b.setText(userM16628e8.name);
        this.f2077c.setText(notifyUsers.subtitle);
        xdl0.M(this.f2078d, false);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m3679c(context);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3679c(context);
    }
}
