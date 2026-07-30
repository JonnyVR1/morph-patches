package com.p051p1.mobile.putong.feed.p065ui.moments.entry;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsFeedAct;
import com.p051p1.mobile.putong.feed.p065ui.moments.entry.scalerv.PopScaleRecyclerView;
import java.util.List;
import java.util.Objects;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.pih;
import p153l.qih;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMomentsEntry extends FrameLayout implements iam<pih> {

    /* JADX INFO: renamed from: a */
    public FeedMomentsEntry f44841a;

    /* JADX INFO: renamed from: b */
    public PopScaleRecyclerView f44842b;

    /* JADX INFO: renamed from: c */
    public VImage f44843c;

    /* JADX INFO: renamed from: d */
    public TextView f44844d;

    /* JADX INFO: renamed from: e */
    public VText f44845e;

    /* JADX INFO: renamed from: f */
    public VImage f44846f;

    public FeedMomentsEntry(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i */
    private void m68250i() {
        bnl0.m105509E0(this.f44841a, new View.OnClickListener() { // from class: l.zhh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204416a.m68255f(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m68251b(View view) {
        qih.m176750a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public int m68253d(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m68254e(List<String> list) {
        this.f44842b.m68264K(m68253d(30.0f), m68253d(15.0f), 1);
        this.f44842b.m68267N(list, false);
        this.f44842b.m68261H(1500L);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m68255f(View view) {
        if (getContext() != null) {
            Intent intentM68013Y1 = MomentsFeedAct.m68013Y1(getContext());
            Act act = act();
            Objects.requireNonNull(act);
            act.startActivity(intentM68013Y1);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m68256j() {
        this.f44842b.m68262I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68251b(this);
        m68250i();
    }

    public void setMomentDot(boolean z) {
        if (bnl0.m105529O0(this.f44845e)) {
            return;
        }
        bnl0.m105524M(this.f44846f, z);
    }

    public void setMomentMsgNum(int i) {
        if (i > 0 && i <= 99) {
            this.f44845e.setText(String.valueOf(i));
        } else if (i > 99) {
            this.f44845e.setText("99+");
        }
        bnl0.m105524M(this.f44845e, i > 0);
        bnl0.m105524M(this.f44846f, false);
    }

    public void setPopScale(boolean z) {
        PopScaleRecyclerView popScaleRecyclerView = this.f44842b;
        if (z) {
            bnl0.m105524M(popScaleRecyclerView, true);
            bnl0.m105524M(this.f44843c, false);
        } else {
            bnl0.m105524M(popScaleRecyclerView, false);
            bnl0.m105524M(this.f44843c, true);
        }
    }

    public FeedMomentsEntry(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(pih pihVar) {
    }
}
