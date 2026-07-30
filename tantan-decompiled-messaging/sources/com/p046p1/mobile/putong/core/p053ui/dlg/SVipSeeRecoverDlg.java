package com.p046p1.mobile.putong.core.p053ui.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.meet.MeetAct;
import com.p046p1.mobile.putong.core.p053ui.dlg.SVipSeeRecoverDlg;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.ExplodeLayout;
import p147v.VButton;
import p149l.bod0;
import p149l.d30;
import p149l.m6c0;
import p149l.o7r;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class SVipSeeRecoverDlg extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f28973a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f28974b;

    /* JADX INFO: renamed from: c */
    public TextView f28975c;

    /* JADX INFO: renamed from: d */
    public TextView f28976d;

    /* JADX INFO: renamed from: e */
    public VButton f28977e;

    /* JADX INFO: renamed from: f */
    public TextView f28978f;

    /* JADX INFO: renamed from: g */
    public ExplodeLayout f28979g;

    public SVipSeeRecoverDlg(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45186a(d30 d30Var, Act act, View view) {
        d30Var.call();
        act.startActivity(MeetAct.m40494Y1(act, "", "see"));
        zvf0.m220399u("e_see_expired_svip", "p_see_popup_expired_svip", vwb.m200311Y("button_type", "open"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m45187b(d30 d30Var, View view) {
        d30Var.call();
        zvf0.m220399u("e_see_expired_svip", "p_see_popup_expired_svip", vwb.m200311Y("button_type", "close"));
    }

    /* JADX INFO: renamed from: c */
    public final void m45188c(View view) {
        bod0.m102940a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m45189d(final Act act, int i, final d30 d30Var) {
        qib0.f154691G.m102314D(this.f28973a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlRCVURTSTdKRkVZNzJXM1dPUkhGUjVGT0NYRUJRQzE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDUyMjE3MjM4NTU4NjA0NTAyOX0.webp");
        ExplodeLayout explodeLayout = (ExplodeLayout) o7r.m163037a(getContext()).inflate(m6c0.f131504L2, (ViewGroup) this.f28974b, false);
        this.f28979g = explodeLayout;
        explodeLayout.setScale(0.8f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        layoutParams.topMargin = t100.m186890d(52.0f);
        this.f28974b.addView(this.f28979g, layoutParams);
        this.f28979g.m54228l(true);
        this.f28975c.setText(String.format("有%s人喜欢了你", Math.min(100, i) > 99 ? "99+" : Integer.valueOf(i)));
        xdl0.m208329E0(this.f28977e, new View.OnClickListener() { // from class: l.znd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m45186a(d30Var, act, view);
            }
        });
        xdl0.m208329E0(this.f28978f, new View.OnClickListener() { // from class: l.aod0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m45187b(d30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45188c(this);
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
