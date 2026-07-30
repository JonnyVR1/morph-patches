package com.p046p1.mobile.putong.live.livingroom.voice.fans;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import p149l.c5n0;
import p149l.d5n0;
import p149l.njn0;
import p149l.p5n0;
import p149l.s7m;
import p149l.u5n0;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFansView extends RelativeLayout implements s7m<p5n0> {

    /* JADX INFO: renamed from: a */
    public LiveFadeRecyclerView f53068a;

    /* JADX INFO: renamed from: b */
    public TextView f53069b;

    /* JADX INFO: renamed from: c */
    public p5n0 f53070c;

    /* JADX INFO: renamed from: d */
    public c5n0 f53071d;

    public VoiceFansView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m78062d(View view) {
        m78063f(0);
    }

    /* JADX INFO: renamed from: f */
    private void m78063f(int i) {
        this.f53070c.m167510d4(i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m78064b(View view) {
        u5n0.m191874a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(p5n0 p5n0Var) {
        this.f53070c = p5n0Var;
        if (p5n0Var != null) {
            c5n0 c5n0Var = new c5n0(p5n0Var);
            this.f53071d = c5n0Var;
            this.f53068a.setAdapter(c5n0Var);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m78066e() {
        c5n0 c5n0Var = this.f53071d;
        if (c5n0Var != null) {
            c5n0Var.m105351j0();
        }
        this.f53069b.setText("0");
    }

    /* JADX INFO: renamed from: i */
    public void m78067i(boolean z) {
        xdl0.m208344M(this, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m78068j(double d) {
        this.f53069b.setText(x8u.m207433c(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78064b(this);
        m78069r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m78069r() {
        this.f53068a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        xdl0.m208329E0(this.f53069b, new View.OnClickListener() { // from class: l.t5n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167840a.m78062d(view);
            }
        });
    }

    public void setFansData(d5n0 d5n0Var) {
        c5n0 c5n0Var = this.f53071d;
        if (c5n0Var != null) {
            c5n0Var.m105352k0(d5n0Var);
        }
    }

    public void setFansDataByLeaderBoardData(njn0 njn0Var) {
        c5n0 c5n0Var = this.f53071d;
        if (c5n0Var != null) {
            c5n0Var.m105352k0(new d5n0(njn0Var));
        }
    }

    public void setFansViewVisible(boolean z) {
        xdl0.m208344M(this.f53068a, z);
    }

    public VoiceFansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
