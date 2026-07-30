package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p153l.bnl0;
import p153l.eao;
import p153l.hao;
import p153l.iam;
import p153l.obc0;
import p153l.y9o;

/* JADX INFO: loaded from: classes4.dex */
public class IntlLiveStarBoardEntryView extends ConstraintLayout implements iam<eao> {

    /* JADX INFO: renamed from: d */
    public IntlLiveStarBoardEntryRollView f51601d;

    /* JADX INFO: renamed from: e */
    public eao f51602e;

    /* JADX INFO: renamed from: f */
    public y9o f51603f;

    public IntlLiveStarBoardEntryView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m76118l0(View view) {
        IntlLiveStarBoardEntryItemView currentShowView = this.f51601d.getCurrentShowView();
        this.f51602e.m120096b4((NullChecker.m82486a(currentShowView) && NullChecker.m82486a(currentShowView.getEntryModel())) ? currentShowView.getEntryModel().f198111c : "");
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
        m76123n0();
        m76125p0(false);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76119i0(View view) {
        hao.m134190a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(eao eaoVar) {
        this.f51602e = eaoVar;
    }

    /* JADX INFO: renamed from: k0 */
    public final boolean m76121k0(y9o y9oVar) {
        y9o y9oVar2 = this.f51603f;
        return y9oVar2 != null && TextUtils.equals(y9oVar.f198109a, y9oVar2.f198109a) && TextUtils.equals(y9oVar.f198110b, this.f51603f.f198110b);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX INFO: renamed from: m0 */
    public void m76122m0(y9o y9oVar) {
        if (this.f51601d.getRunning() || m76121k0(y9oVar)) {
            return;
        }
        this.f51603f = y9oVar;
        y9oVar.f198112d = this.f51602e.m213810E2().m168498Z0();
        this.f51601d.setAdapterViewAnimTime(200);
        this.f51601d.setNextAnim(400L);
        this.f51601d.m76115A(y9oVar);
    }

    /* JADX INFO: renamed from: n0 */
    public void m76123n0() {
        this.f51601d.reset();
    }

    /* JADX INFO: renamed from: o0 */
    public void m76124o0() {
        setBackground(getResources().getDrawable(obc0.f146144P));
        this.f51601d.setVoiceLive(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76119i0(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.gao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103015a.m76118l0(view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public void m76125p0(boolean z) {
        bnl0.m105524M(this, z);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveStarBoardEntryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
