package com.p000p1.mobile.putong.live.livingroom.voice.intl.operations;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.putong.live.base.apibean.IntlLiveOperationItemBean;
import java.util.ArrayList;
import java.util.List;
import l.g5c0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import p009l.a6o0;
import p009l.f6o0;
import p009l.m6o0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceOperationsView extends FrameLayout implements s7m<m6o0> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f6920a;

    /* JADX INFO: renamed from: b */
    public m6o0 f6921b;

    /* JADX INFO: renamed from: c */
    public f6o0 f6922c;

    public VoiceOperationsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    private void m8520d() {
        this.f6920a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        f6o0 f6o0Var = new f6o0();
        this.f6922c = f6o0Var;
        this.f6920a.setAdapter(f6o0Var);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8521C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m8522b(FrameLayout frameLayout, int i) {
        if (!xdl0.O0(this) || i == 0) {
            xdl0.X(frameLayout, t100.d(5.0f));
        } else {
            xdl0.X(frameLayout, t100.d(5.0f) + t100.d(6.0f) + i);
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m8526i1(m6o0 m6o0Var) {
        this.f6921b = m6o0Var;
        f6o0 f6o0Var = this.f6922c;
        if (f6o0Var != null) {
            f6o0Var.m14304f0(m6o0Var);
        }
    }

    public void destroy() {
        xdl0.M(this, false);
        f6o0 f6o0Var = this.f6922c;
        if (f6o0Var != null) {
            f6o0Var.m14303e0();
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8524e(IntlLiveOperationItemBean intlLiveOperationItemBean, a6o0 a6o0Var, View view) {
        m6o0 m6o0Var = this.f6921b;
        if (m6o0Var != null) {
            m6o0Var.m18276S3(intlLiveOperationItemBean);
            a6o0Var.m11251K(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m8525f(List<IntlLiveOperationItemBean> list, FrameLayout frameLayout, int i) {
        if (vwb.J(list)) {
            xdl0.M(this, false);
            f6o0 f6o0Var = this.f6922c;
            if (f6o0Var != null) {
                f6o0Var.m14303e0();
            }
            m8522b(frameLayout, i);
            return;
        }
        setData(list);
        if (list.size() > 3) {
            xdl0.D0(t100.d(120.0f), new View[]{this.f6920a});
        } else {
            xdl0.D0(t100.d(132.0f), new View[]{this.f6920a});
        }
        xdl0.M(this, true);
        m8522b(frameLayout, i);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6920a = findViewById(g5c0.W4);
        m8520d();
    }

    public void setData(List<IntlLiveOperationItemBean> list) {
        if (this.f6922c == null) {
            return;
        }
        if (vwb.J(list)) {
            this.f6922c.m14303e0();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (final IntlLiveOperationItemBean intlLiveOperationItemBean : list) {
            final a6o0 a6o0Var = new a6o0(this.f6922c, intlLiveOperationItemBean);
            a6o0Var.A(new View.OnClickListener() { // from class: l.n6o0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17346a.m8524e(intlLiveOperationItemBean, a6o0Var, view);
                }
            });
            arrayList.add(a6o0Var);
        }
        this.f6922c.a0(arrayList, false);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceOperationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
