package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p149l.pm4;
import p149l.ved0;
import p149l.wed0;

/* JADX INFO: renamed from: androidx.cardview.widget.a */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class C0191a implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: a */
    public ColorStateList mo842a(pm4 pm4Var) {
        return m856o(pm4Var).m198169b();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: b */
    public void mo843b(pm4 pm4Var, float f) {
        m856o(pm4Var).m198174g(f, pm4Var.mo838a(), pm4Var.mo841d());
        mo845d(pm4Var);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: c */
    public void mo844c(pm4 pm4Var) {
        mo843b(pm4Var, mo848g(pm4Var));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: d */
    public void mo845d(pm4 pm4Var) {
        if (!pm4Var.mo838a()) {
            pm4Var.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fMo848g = mo848g(pm4Var);
        float fMo850i = mo850i(pm4Var);
        int iCeil = (int) Math.ceil(wed0.m202888a(fMo848g, fMo850i, pm4Var.mo841d()));
        int iCeil2 = (int) Math.ceil(wed0.m202889b(fMo848g, fMo850i, pm4Var.mo841d()));
        pm4Var.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: e */
    public void mo846e(pm4 pm4Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        pm4Var.mo839b(new ved0(colorStateList, f));
        View cardView = pm4Var.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo843b(pm4Var, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: f */
    public float mo847f(pm4 pm4Var) {
        return mo850i(pm4Var) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: g */
    public float mo848g(pm4 pm4Var) {
        return m856o(pm4Var).m198170c();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: h */
    public void mo849h(pm4 pm4Var, float f) {
        pm4Var.getCardView().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: i */
    public float mo850i(pm4 pm4Var) {
        return m856o(pm4Var).m198171d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: j */
    public float mo851j(pm4 pm4Var) {
        return pm4Var.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: k */
    public void mo852k(pm4 pm4Var, float f) {
        m856o(pm4Var).m198175h(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: l */
    public float mo853l(pm4 pm4Var) {
        return mo850i(pm4Var) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: m */
    public void mo854m(pm4 pm4Var) {
        mo843b(pm4Var, mo848g(pm4Var));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: n */
    public void mo855n(pm4 pm4Var, @Nullable ColorStateList colorStateList) {
        m856o(pm4Var).m198173f(colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public final ved0 m856o(pm4 pm4Var) {
        return (ved0) pm4Var.mo840c();
    }
}
