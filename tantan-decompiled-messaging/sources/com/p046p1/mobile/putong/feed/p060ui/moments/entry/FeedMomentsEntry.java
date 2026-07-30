package com.p046p1.mobile.putong.feed.p060ui.moments.entry;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsFeedAct;
import com.p046p1.mobile.putong.feed.p060ui.moments.entry.scalerv.PopScaleRecyclerView;
import java.util.List;
import java.util.Objects;
import p147v.VImage;
import p147v.VText;
import p149l.ahh;
import p149l.bhh;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMomentsEntry extends FrameLayout implements s7m<ahh> {

    /* JADX INFO: renamed from: a */
    public FeedMomentsEntry f43993a;

    /* JADX INFO: renamed from: b */
    public PopScaleRecyclerView f43994b;

    /* JADX INFO: renamed from: c */
    public VImage f43995c;

    /* JADX INFO: renamed from: d */
    public TextView f43996d;

    /* JADX INFO: renamed from: e */
    public VText f43997e;

    /* JADX INFO: renamed from: f */
    public VImage f43998f;

    public FeedMomentsEntry(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    private void m67067i() {
        xdl0.m208329E0(this.f43993a, new View.OnClickListener() { // from class: l.kgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123035a.m67072f(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m67068b(View view) {
        bhh.m101836a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public int m67070d(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m67071e(List<String> list) {
        this.f43994b.m67081K(m67070d(30.0f), m67070d(15.0f), 1);
        this.f43994b.m67084N(list, false);
        this.f43994b.m67078H(1500L);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m67072f(View view) {
        if (getContext() != null) {
            Intent intentM66830X1 = MomentsFeedAct.m66830X1(getContext());
            Act act = act();
            Objects.requireNonNull(act);
            act.startActivity(intentM66830X1);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m67073j() {
        this.f43994b.m67079I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67068b(this);
        m67067i();
    }

    public void setMomentDot(boolean z) {
        if (xdl0.m208349O0(this.f43997e)) {
            return;
        }
        xdl0.m208344M(this.f43998f, z);
    }

    public void setMomentMsgNum(int i) {
        if (i > 0 && i <= 99) {
            this.f43997e.setText(String.valueOf(i));
        } else if (i > 99) {
            this.f43997e.setText("99+");
        }
        xdl0.m208344M(this.f43997e, i > 0);
        xdl0.m208344M(this.f43998f, false);
    }

    public void setPopScale(boolean z) {
        PopScaleRecyclerView popScaleRecyclerView = this.f43994b;
        if (z) {
            xdl0.m208344M(popScaleRecyclerView, true);
            xdl0.m208344M(this.f43995c, false);
        } else {
            xdl0.m208344M(popScaleRecyclerView, false);
            xdl0.m208344M(this.f43995c, true);
        }
    }

    public FeedMomentsEntry(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ahh ahhVar) {
    }
}
