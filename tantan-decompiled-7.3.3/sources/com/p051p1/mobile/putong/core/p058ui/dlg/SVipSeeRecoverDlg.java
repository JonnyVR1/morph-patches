package com.p051p1.mobile.putong.core.p058ui.dlg;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.newui.meet.MeetAct;
import com.p051p1.mobile.putong.core.p058ui.dlg.SVipSeeRecoverDlg;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import p151v.VButton;
import p153l.bnl0;
import p153l.dwd0;
import p153l.i4g0;
import p153l.jyb;
import p153l.p9r;
import p153l.qa00;
import p153l.rec0;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes2.dex */
public class SVipSeeRecoverDlg extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f29821a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f29822b;

    /* JADX INFO: renamed from: c */
    public TextView f29823c;

    /* JADX INFO: renamed from: d */
    public TextView f29824d;

    /* JADX INFO: renamed from: e */
    public VButton f29825e;

    /* JADX INFO: renamed from: f */
    public TextView f29826f;

    /* JADX INFO: renamed from: g */
    public ExplodeLayout f29827g;

    public SVipSeeRecoverDlg(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46369a(x20 x20Var, Act act, View view) {
        x20Var.call();
        act.startActivity(MeetAct.m41505Z1(act, "", "see"));
        i4g0.m138523u("e_see_expired_svip", "p_see_popup_expired_svip", jyb.m147494Y("button_type", "open"));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46370b(x20 x20Var, View view) {
        x20Var.call();
        i4g0.m138523u("e_see_expired_svip", "p_see_popup_expired_svip", jyb.m147494Y("button_type", "close"));
    }

    /* JADX INFO: renamed from: c */
    public final void m46371c(View view) {
        dwd0.m118411a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m46372d(final Act act, int i, final x20 x20Var) {
        uqb0.f180374G.m127098D(this.f29821a, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlRCVURTSTdKRkVZNzJXM1dPUkhGUjVGT0NYRUJRQzE0IiwidyI6OTMzLCJoIjo2MjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDUyMjE3MjM4NTU4NjA0NTAyOX0.webp");
        ExplodeLayout explodeLayout = (ExplodeLayout) p9r.m171370a(getContext()).inflate(rec0.f162464L2, (ViewGroup) this.f29822b, false);
        this.f29827g = explodeLayout;
        explodeLayout.setScale(0.8f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        layoutParams.topMargin = qa00.m175859d(52.0f);
        this.f29822b.addView(this.f29827g, layoutParams);
        this.f29827g.m55411l(true);
        this.f29823c.setText(String.format("有%s人喜欢了你", Math.min(100, i) > 99 ? "99+" : Integer.valueOf(i)));
        bnl0.m105509E0(this.f29825e, new View.OnClickListener() { // from class: l.bwd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m46369a(x20Var, act, view);
            }
        });
        bnl0.m105509E0(this.f29826f, new View.OnClickListener() { // from class: l.cwd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SVipSeeRecoverDlg.m46370b(x20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46371c(this);
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
