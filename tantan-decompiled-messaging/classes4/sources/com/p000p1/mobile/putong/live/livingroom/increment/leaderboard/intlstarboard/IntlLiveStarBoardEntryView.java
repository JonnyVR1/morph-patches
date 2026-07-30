package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;
import l.xdl0;
import p002l.e8o;
import p002l.h8o;
import p002l.i3c0;
import p002l.y7o;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class IntlLiveStarBoardEntryView extends ConstraintLayout implements s7m<e8o> {

    /* JADX INFO: renamed from: d */
    public IntlLiveStarBoardEntryRollView f6795d;

    /* JADX INFO: renamed from: e */
    public e8o f6796e;

    /* JADX INFO: renamed from: f */
    public y7o f6797f;

    public IntlLiveStarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m8537l0(View view) {
        IntlLiveStarBoardEntryItemView currentShowView = this.f6795d.getCurrentShowView();
        this.f6796e.m12289b4((NullChecker.a(currentShowView) && NullChecker.a(currentShowView.getEntryModel())) ? currentShowView.getEntryModel().f22732c : "");
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8538C0() {
        return null;
    }

    @Nullable
    public Act act() {
        return null;
    }

    public void destroy() {
        m8544n0();
        m8546p0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m8539i0(View view) {
        h8o.m14287a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void m8540i1(e8o e8oVar) {
        this.f6796e = e8oVar;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m8542k0(y7o y7oVar) {
        y7o y7oVar2 = this.f6797f;
        return y7oVar2 != null && TextUtils.equals(y7oVar.f22730a, y7oVar2.f22730a) && TextUtils.equals(y7oVar.f22731b, this.f6797f.f22731b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: m0 */
    public void m8543m0(y7o y7oVar) {
        if (this.f6795d.getRunning() || m8542k0(y7oVar)) {
            return;
        }
        this.f6797f = y7oVar;
        y7oVar.f22733d = this.f6796e.m25547E2().m14548Z0();
        this.f6795d.setAdapterViewAnimTime(200);
        this.f6795d.setNextAnim(400L);
        this.f6795d.m8534A(y7oVar);
    }

    /* JADX INFO: renamed from: n0 */
    public void m8544n0() {
        this.f6795d.reset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m8545o0() {
        setBackground(getResources().getDrawable(i3c0.f12601P));
        this.f6795d.setVoiceLive(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8539i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.g8o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11307a.m8537l0(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public void m8546p0(boolean z) {
        xdl0.M(this, z);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
