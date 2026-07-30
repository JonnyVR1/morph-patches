package com.p046p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import java.util.ArrayList;
import java.util.List;
import p149l.a6o0;
import p149l.f6o0;
import p149l.g5c0;
import p149l.m6o0;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceOperationsView extends FrameLayout implements s7m<m6o0> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f53314a;

    /* JADX INFO: renamed from: b */
    public m6o0 f53315b;

    /* JADX INFO: renamed from: c */
    public f6o0 f53316c;

    public VoiceOperationsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m78327d() {
        this.f53314a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        f6o0 f6o0Var = new f6o0();
        this.f53316c = f6o0Var;
        this.f53314a.setAdapter(f6o0Var);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m78328b(FrameLayout frameLayout, int i) {
        if (!xdl0.m208349O0(this) || i == 0) {
            xdl0.m208360X(frameLayout, t100.m186890d(5.0f));
        } else {
            xdl0.m208360X(frameLayout, t100.m186890d(5.0f) + t100.m186890d(6.0f) + i);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m6o0 m6o0Var) {
        this.f53315b = m6o0Var;
        f6o0 f6o0Var = this.f53316c;
        if (f6o0Var != null) {
            f6o0Var.m119630f0(m6o0Var);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        xdl0.m208344M(this, false);
        f6o0 f6o0Var = this.f53316c;
        if (f6o0Var != null) {
            f6o0Var.m119629e0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78330e(IntlLiveOperationItemBean intlLiveOperationItemBean, a6o0 a6o0Var, View view) {
        m6o0 m6o0Var = this.f53315b;
        if (m6o0Var != null) {
            m6o0Var.m153260S3(intlLiveOperationItemBean);
            a6o0Var.m95155K(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m78331f(List<IntlLiveOperationItemBean> list, FrameLayout frameLayout, int i) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            f6o0 f6o0Var = this.f53316c;
            if (f6o0Var != null) {
                f6o0Var.m119629e0();
            }
            m78328b(frameLayout, i);
            return;
        }
        setData(list);
        if (list.size() > 3) {
            xdl0.m208327D0(t100.m186890d(120.0f), this.f53314a);
        } else {
            xdl0.m208327D0(t100.m186890d(132.0f), this.f53314a);
        }
        xdl0.m208344M(this, true);
        m78328b(frameLayout, i);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53314a = (RecyclerView) findViewById(g5c0.f100841W4);
        m78327d();
    }

    public void setData(List<IntlLiveOperationItemBean> list) {
        if (this.f53316c == null) {
            return;
        }
        if (vwb.m200296J(list)) {
            this.f53316c.m119629e0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final IntlLiveOperationItemBean intlLiveOperationItemBean : list) {
            final a6o0 a6o0Var = new a6o0(this.f53316c, intlLiveOperationItemBean);
            a6o0Var.mo109662A(new View.OnClickListener() { // from class: l.n6o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f137432a.m78330e(intlLiveOperationItemBean, a6o0Var, view);
                }
            });
            arrayList.add(a6o0Var);
        }
        this.f53316c.m67372a0(arrayList, false);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
