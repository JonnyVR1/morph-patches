package com.p000p1.mobile.putong.feed.p005ui.moments.entry;

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
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsFeedAct;
import com.p000p1.mobile.putong.feed.p005ui.moments.entry.scalerv.PopScaleRecyclerView;
import com.p1.mobile.android.app.Act;
import java.util.List;
import java.util.Objects;
import l.s7m;
import l.xdl0;
import p007l.ahh;
import p007l.bhh;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMomentsEntry extends FrameLayout implements s7m<ahh> {

    /* JADX INFO: renamed from: a */
    public FeedMomentsEntry f5454a;

    /* JADX INFO: renamed from: b */
    public PopScaleRecyclerView f5455b;

    /* JADX INFO: renamed from: c */
    public VImage f5456c;

    /* JADX INFO: renamed from: d */
    public TextView f5457d;

    /* JADX INFO: renamed from: e */
    public VText f5458e;

    /* JADX INFO: renamed from: f */
    public VImage f5459f;

    public FeedMomentsEntry(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    private void m8272i() {
        xdl0.E0(this.f5454a, new View.OnClickListener() { // from class: l.kgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9714a.m8278f(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8273C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m8274b(View view) {
        bhh.m8891a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public int m8276d(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m8277e(List<String> list) {
        this.f5455b.m8288K(m8276d(30.0f), m8276d(15.0f), 1);
        this.f5455b.m8291N(list, false);
        this.f5455b.m8285H(1500L);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m8278f(View view) {
        if (getContext() != null) {
            Intent intentM8021X1 = MomentsFeedAct.m8021X1(getContext());
            Act act = act();
            Objects.requireNonNull(act);
            act.startActivity(intentM8021X1);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m8280j() {
        this.f5455b.m8286I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8274b(this);
        m8272i();
    }

    public void setMomentDot(boolean z) {
        if (xdl0.O0(this.f5458e)) {
            return;
        }
        xdl0.M(this.f5459f, z);
    }

    public void setMomentMsgNum(int i) {
        if (i > 0 && i <= 99) {
            this.f5458e.setText(String.valueOf(i));
        } else if (i > 99) {
            this.f5458e.setText("99+");
        }
        xdl0.M(this.f5458e, i > 0);
        xdl0.M(this.f5459f, false);
    }

    public void setPopScale(boolean z) {
        RecyclerView recyclerView = this.f5455b;
        if (z) {
            xdl0.M(recyclerView, true);
            xdl0.M(this.f5456c, false);
        } else {
            xdl0.M(recyclerView, false);
            xdl0.M(this.f5456c, true);
        }
    }

    public FeedMomentsEntry(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8279i1(ahh ahhVar) {
    }
}
