package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p153l.on4;
import p153l.xmd0;
import p153l.ymd0;

/* JADX INFO: renamed from: androidx.cardview.widget.a */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class C0192a implements CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: a */
    public ColorStateList mo843a(on4 on4Var) {
        return m857o(on4Var).m211718b();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: b */
    public void mo844b(on4 on4Var, float f) {
        m857o(on4Var).m211723g(f, on4Var.mo839a(), on4Var.mo842d());
        mo846d(on4Var);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: c */
    public void mo845c(on4 on4Var) {
        mo844b(on4Var, mo849g(on4Var));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: d */
    public void mo846d(on4 on4Var) {
        if (!on4Var.mo839a()) {
            on4Var.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float fMo849g = mo849g(on4Var);
        float fMo851i = mo851i(on4Var);
        int iCeil = (int) Math.ceil(ymd0.m216673a(fMo849g, fMo851i, on4Var.mo842d()));
        int iCeil2 = (int) Math.ceil(ymd0.m216674b(fMo849g, fMo851i, on4Var.mo842d()));
        on4Var.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: e */
    public void mo847e(on4 on4Var, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        on4Var.mo840b(new xmd0(colorStateList, f));
        View cardView = on4Var.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo844b(on4Var, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: f */
    public float mo848f(on4 on4Var) {
        return mo851i(on4Var) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: g */
    public float mo849g(on4 on4Var) {
        return m857o(on4Var).m211719c();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: h */
    public void mo850h(on4 on4Var, float f) {
        on4Var.getCardView().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: i */
    public float mo851i(on4 on4Var) {
        return m857o(on4Var).m211720d();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: j */
    public float mo852j(on4 on4Var) {
        return on4Var.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: k */
    public void mo853k(on4 on4Var, float f) {
        m857o(on4Var).m211724h(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: l */
    public float mo854l(on4 on4Var) {
        return mo851i(on4Var) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: m */
    public void mo855m(on4 on4Var) {
        mo844b(on4Var, mo849g(on4Var));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    /* JADX INFO: renamed from: n */
    public void mo856n(on4 on4Var, @Nullable ColorStateList colorStateList) {
        m857o(on4Var).m211722f(colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public final xmd0 m857o(on4 on4Var) {
        return (xmd0) on4Var.mo841c();
    }
}
