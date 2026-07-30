package com.p051p1.mobile.putong.live.livingroom.voice.fans;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.view.LiveFadeRecyclerView;
import p153l.bnl0;
import p153l.gen0;
import p153l.hen0;
import p153l.iam;
import p153l.rsn0;
import p153l.ten0;
import p153l.yau;
import p153l.yen0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceFansView extends RelativeLayout implements iam<ten0> {

    /* JADX INFO: renamed from: a */
    public LiveFadeRecyclerView f53916a;

    /* JADX INFO: renamed from: b */
    public TextView f53917b;

    /* JADX INFO: renamed from: c */
    public ten0 f53918c;

    /* JADX INFO: renamed from: d */
    public gen0 f53919d;

    public VoiceFansView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m79245d(View view) {
        m79246f(0);
    }

    /* JADX INFO: renamed from: f */
    private void m79246f(int i) {
        this.f53918c.m190863d4(i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: b */
    public final void m79247b(View view) {
        yen0.m215423a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ten0 ten0Var) {
        this.f53918c = ten0Var;
        if (ten0Var != null) {
            gen0 gen0Var = new gen0(ten0Var);
            this.f53919d = gen0Var;
            this.f53916a.setAdapter(gen0Var);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m79249e() {
        gen0 gen0Var = this.f53919d;
        if (gen0Var != null) {
            gen0Var.m130026j0();
        }
        this.f53917b.setText("0");
    }

    /* JADX INFO: renamed from: i */
    public void m79250i(boolean z) {
        bnl0.m105524M(this, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m79251j(double d) {
        this.f53917b.setText(yau.m214935c(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79247b(this);
        m79252r();
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: r */
    public void m79252r() {
        this.f53916a.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        bnl0.m105509E0(this.f53917b, new View.OnClickListener() { // from class: l.xen0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193970a.m79245d(view);
            }
        });
    }

    public void setFansData(hen0 hen0Var) {
        gen0 gen0Var = this.f53919d;
        if (gen0Var != null) {
            gen0Var.m130027k0(hen0Var);
        }
    }

    public void setFansDataByLeaderBoardData(rsn0 rsn0Var) {
        gen0 gen0Var = this.f53919d;
        if (gen0Var != null) {
            gen0Var.m130027k0(new hen0(rsn0Var));
        }
    }

    public void setFansViewVisible(boolean z) {
        bnl0.m105524M(this.f53916a, z);
    }

    public VoiceFansView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceFansView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
