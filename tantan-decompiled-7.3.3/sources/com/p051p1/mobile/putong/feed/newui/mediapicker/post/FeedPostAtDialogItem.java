package com.p051p1.mobile.putong.feed.newui.mediapicker.post;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.bth;
import p153l.dth;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostAtDialogItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41462a;

    /* JADX INFO: renamed from: b */
    public TextView f41463b;

    /* JADX INFO: renamed from: c */
    public TextView f41464c;

    /* JADX INFO: renamed from: d */
    public View f41465d;

    public FeedPostAtDialogItem(@NonNull Context context) {
        super(context);
        m63857c(context);
    }

    /* JADX INFO: renamed from: a */
    public View m63855a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bth.m106335b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public void m63856b() {
        this.f41464c.setText("每天可以提问" + dth.m117873d() + "个问题，明天再来吧");
        bnl0.m105524M(this.f41465d, true);
    }

    /* JADX INFO: renamed from: c */
    public final void m63857c(Context context) {
        addView(m63855a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: d */
    public void m63858d(NotifyUsers notifyUsers) {
        User userM145688e8;
        if (notifyUsers == null || (userM145688e8 = FeedModule.f39703d.m145688e8(notifyUsers.userId)) == null) {
            return;
        }
        uqb0.f180374G.m127125Q0(this.f41462a, userM145688e8.m61308fp().profileSmall());
        this.f41463b.setText(userM145688e8.name);
        this.f41464c.setText(notifyUsers.subtitle);
        bnl0.m105524M(this.f41465d, false);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63857c(context);
    }

    public FeedPostAtDialogItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63857c(context);
    }
}
