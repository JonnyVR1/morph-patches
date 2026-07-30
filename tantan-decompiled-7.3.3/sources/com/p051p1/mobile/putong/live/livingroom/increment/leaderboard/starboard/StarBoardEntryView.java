package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import p153l.b2g0;
import p153l.bnl0;
import p153l.e2g0;
import p153l.iam;
import p153l.t1g0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryView extends ConstraintLayout implements iam<b2g0> {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryView f51612d;

    /* JADX INFO: renamed from: e */
    public StarBoardEntryRollView f51613e;

    /* JADX INFO: renamed from: f */
    public b2g0 f51614f;

    /* JADX INFO: renamed from: g */
    public t1g0 f51615g;

    public StarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m76133l0(View view) {
        this.f51614f.m102165e4();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
        m76138n0();
        m76139o0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76134i0(View view) {
        e2g0.m119086a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b2g0 b2g0Var) {
        this.f51614f = b2g0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m76136k0(t1g0 t1g0Var) {
        t1g0 t1g0Var2 = this.f51615g;
        return t1g0Var2 != null && TextUtils.equals(t1g0Var.f171667a, t1g0Var2.f171667a) && TextUtils.equals(t1g0Var.f171668b, this.f51615g.f171668b);
    }

    /* JADX INFO: renamed from: m0 */
    public void m76137m0(t1g0 t1g0Var) {
        if (this.f51613e.getRunning() || m76136k0(t1g0Var)) {
            return;
        }
        this.f51615g = t1g0Var;
        this.f51613e.setAdapterViewAnimTime(200);
        this.f51613e.setNextAnim(400L);
        this.f51613e.m76130A(t1g0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m76138n0() {
        this.f51613e.reset();
    }

    /* JADX INFO: renamed from: o0 */
    public void m76139o0(boolean z) {
        bnl0.m105524M(this, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76134i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.d2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84789a.m76133l0(view);
            }
        });
    }

    public StarBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
