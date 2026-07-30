package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p149l.e8o;
import p149l.h8o;
import p149l.i3c0;
import p149l.s7m;
import p149l.xdl0;
import p149l.y7o;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryView extends ConstraintLayout implements s7m<e8o> {

    /* JADX INFO: renamed from: d */
    public IntlLiveStarBoardEntryRollView f50753d;

    /* JADX INFO: renamed from: e */
    public e8o f50754e;

    /* JADX INFO: renamed from: f */
    public y7o f50755f;

    public IntlLiveStarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m74935l0(View view) {
        IntlLiveStarBoardEntryItemView currentShowView = this.f50753d.getCurrentShowView();
        this.f50754e.m115274b4((NullChecker.m81303a(currentShowView) && NullChecker.m81303a(currentShowView.getEntryModel())) ? currentShowView.getEntryModel().f196718c : "");
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
        m74940n0();
        m74942p0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m74936i0(View view) {
        h8o.m129892a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e8o e8oVar) {
        this.f50754e = e8oVar;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m74938k0(y7o y7oVar) {
        y7o y7oVar2 = this.f50755f;
        return y7oVar2 != null && TextUtils.equals(y7oVar.f196716a, y7oVar2.f196716a) && TextUtils.equals(y7oVar.f196717b, this.f50755f.f196717b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: m0 */
    public void m74939m0(y7o y7oVar) {
        if (this.f50753d.getRunning() || m74938k0(y7oVar)) {
            return;
        }
        this.f50755f = y7oVar;
        y7oVar.f196719d = this.f50754e.m206027E2().m132112Z0();
        this.f50753d.setAdapterViewAnimTime(200);
        this.f50753d.setNextAnim(400L);
        this.f50753d.m74932A(y7oVar);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74940n0() {
        this.f50753d.reset();
    }

    /* JADX INFO: renamed from: o0 */
    public void m74941o0() {
        setBackground(getResources().getDrawable(i3c0.f110816P));
        this.f50753d.setVoiceLive(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74936i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.g8o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101507a.m74935l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m74942p0(boolean z) {
        xdl0.m208344M(this, z);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
