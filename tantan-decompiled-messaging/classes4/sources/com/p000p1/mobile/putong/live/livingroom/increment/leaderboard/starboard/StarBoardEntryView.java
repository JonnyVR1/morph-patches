package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import l.s7m;
import l.xdl0;
import p002l.ktf0;
import p002l.stf0;
import p002l.vtf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class StarBoardEntryView extends ConstraintLayout implements s7m<stf0> {

    /* JADX INFO: renamed from: d */
    public StarBoardEntryView f6806d;

    /* JADX INFO: renamed from: e */
    public StarBoardEntryRollView f6807e;

    /* JADX INFO: renamed from: f */
    public stf0 f6808f;

    /* JADX INFO: renamed from: g */
    public ktf0 f6809g;

    public StarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m8554l0(View view) {
        this.f6808f.m22703e4();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8555C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return null;
    }

    public void destroy() {
        m8561n0();
        m8562o0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8556i0(View view) {
        vtf0.m24126a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void m8557i1(stf0 stf0Var) {
        this.f6808f = stf0Var;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m8559k0(ktf0 ktf0Var) {
        ktf0 ktf0Var2 = this.f6809g;
        return ktf0Var2 != null && TextUtils.equals(ktf0Var.f14507a, ktf0Var2.f14507a) && TextUtils.equals(ktf0Var.f14508b, this.f6809g.f14508b);
    }

    /* JADX INFO: renamed from: m0 */
    public void m8560m0(ktf0 ktf0Var) {
        if (this.f6807e.getRunning() || m8559k0(ktf0Var)) {
            return;
        }
        this.f6809g = ktf0Var;
        this.f6807e.setAdapterViewAnimTime(200);
        this.f6807e.setNextAnim(400L);
        this.f6807e.m8551A(ktf0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m8561n0() {
        this.f6807e.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m8562o0(boolean z) {
        xdl0.M(this, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8556i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.utf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20790a.m8554l0(view);
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
