package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import p149l.ktf0;
import p149l.s7m;
import p149l.stf0;
import p149l.vtf0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class StarBoardEntryView extends ConstraintLayout implements s7m<stf0> {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryView f50764d;

    /* JADX INFO: renamed from: e */
    public StarBoardEntryRollView f50765e;

    /* JADX INFO: renamed from: f */
    public stf0 f50766f;

    /* JADX INFO: renamed from: g */
    public ktf0 f50767g;

    public StarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m74950l0(View view) {
        this.f50766f.m185942e4();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
        m74955n0();
        m74956o0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74951i0(View view) {
        vtf0.m199998a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(stf0 stf0Var) {
        this.f50766f = stf0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m74953k0(ktf0 ktf0Var) {
        ktf0 ktf0Var2 = this.f50767g;
        return ktf0Var2 != null && TextUtils.equals(ktf0Var.f124582a, ktf0Var2.f124582a) && TextUtils.equals(ktf0Var.f124583b, this.f50767g.f124583b);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74954m0(ktf0 ktf0Var) {
        if (this.f50765e.getRunning() || m74953k0(ktf0Var)) {
            return;
        }
        this.f50767g = ktf0Var;
        this.f50765e.setAdapterViewAnimTime(200);
        this.f50765e.setNextAnim(400L);
        this.f50765e.m74947A(ktf0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74955n0() {
        this.f50765e.reset();
    }

    /* JADX INFO: renamed from: o0 */
    public void m74956o0(boolean z) {
        xdl0.m208344M(this, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74951i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.utf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178267a.m74950l0(view);
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
