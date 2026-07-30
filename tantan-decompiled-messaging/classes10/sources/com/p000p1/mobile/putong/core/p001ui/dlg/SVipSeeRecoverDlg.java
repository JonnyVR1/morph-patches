package com.p000p1.mobile.putong.core.p001ui.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.dlg.SVipSeeRecoverDlg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.meet.MeetAct;
import com.p1.mobile.putong.core.ui.purchase.privilege.ExplodeLayout;
import l.d30;
import l.j760;
import l.m6c0;
import l.o7r;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.bod0;
import v.VButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SVipSeeRecoverDlg extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f1367a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f1368b;

    /* JADX INFO: renamed from: c */
    public TextView f1369c;

    /* JADX INFO: renamed from: d */
    public TextView f1370d;

    /* JADX INFO: renamed from: e */
    public VButton f1371e;

    /* JADX INFO: renamed from: f */
    public TextView f1372f;

    /* JADX INFO: renamed from: g */
    public ExplodeLayout f1373g;

    public SVipSeeRecoverDlg(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2503a(d30 d30Var, Act act, View view) {
        d30Var.call();
        act.startActivity(MeetAct.Y1(act, "", "see"));
        zvf0.u("e_see_expired_svip", "p_see_popup_expired_svip", new j760[]{vwb.Y("button_type", "open")});
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2504b(d30 d30Var, View view) {
        d30Var.call();
        zvf0.u("e_see_expired_svip", "p_see_popup_expired_svip", new j760[]{vwb.Y("button_type", "close")});
    }

    /* JADX INFO: renamed from: c */
    public final void m2505c(View view) {
        bod0.m5769a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m2506d(final Act act, int i, final d30 d30Var) {
        qib0.G.D(this.f1367a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlRCVURTSTdKRkVZNzJXM1dPUkhGUjVGT0NYRUJRQzE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDUyMjE3MjM4NTU4NjA0NTAyOX0.webp");
        ExplodeLayout explodeLayoutInflate = o7r.a(getContext()).inflate(m6c0.L2, (ViewGroup) this.f1368b, false);
        this.f1373g = explodeLayoutInflate;
        explodeLayoutInflate.setScale(0.8f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.d(52.0f);
        this.f1368b.addView((View) this.f1373g, (ViewGroup.LayoutParams) layoutParams);
        this.f1373g.l(true);
        this.f1369c.setText(String.format("有%s人喜欢了你", Math.min(100, i) > 99 ? "99+" : Integer.valueOf(i)));
        xdl0.E0(this.f1371e, new View.OnClickListener() { // from class: l.znd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m2503a(d30Var, act, view);
            }
        });
        xdl0.E0(this.f1372f, new View.OnClickListener() { // from class: l.aod0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m2504b(d30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2505c(this);
    }

    public SVipSeeRecoverDlg(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SVipSeeRecoverDlg(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SVipSeeRecoverDlg(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
