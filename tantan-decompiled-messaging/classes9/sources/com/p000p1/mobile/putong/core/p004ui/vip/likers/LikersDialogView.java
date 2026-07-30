package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.kir;
import l.t0g0;
import l.t100;
import l.vwb;
import l.xdl0;
import p006l.bkb0;
import p006l.qib0;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_Shadow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersDialogView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f7054a;

    /* JADX INFO: renamed from: b */
    public ImageView f7055b;

    /* JADX INFO: renamed from: c */
    public VFrame_Shadow f7056c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f7057d;

    /* JADX INFO: renamed from: e */
    public VFrame f7058e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7059f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7060g;

    /* JADX INFO: renamed from: h */
    public VFrame f7061h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f7062i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f7063j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f7064k;

    /* JADX INFO: renamed from: l */
    public TextView f7065l;

    /* JADX INFO: renamed from: m */
    public TextView f7066m;

    /* JADX INFO: renamed from: n */
    public VButton f7067n;

    /* JADX INFO: renamed from: o */
    public TextView f7068o;

    public LikersDialogView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m10013a(View view) {
        kir.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m10014b(int i, CoreLikers.C0145a c0145a) {
        List<User> list = c0145a.f3261d;
        int size = list.size();
        xdl0.M(this.f7056c, i == 1 || (i > 1 && size == 1));
        xdl0.M(this.f7058e, (i == 2 && size >= 2) || (i > 2 && size == 2));
        xdl0.M(this.f7061h, i >= 3 && size >= 3);
        if (i == 1 || (i > 1 && size == 1)) {
            qib0.f19782G.m12749O(this.f7057d, list.get(0).fp().profileMiddle().formatted(), 3, t100.f);
        } else if ((i != 2 || size < 2) && (i <= 2 || size != 2)) {
            bkb0 bkb0Var = qib0.f19782G;
            VDraweeView vDraweeView = this.f7062i;
            String str = list.get(0).fp().profileMiddle().formatted();
            int i2 = t100.f;
            bkb0Var.m12749O(vDraweeView, str, 3, i2);
            qib0.f19782G.m12749O(this.f7063j, list.get(1).fp().profileMiddle().formatted(), 3, i2);
            qib0.f19782G.m12749O(this.f7064k, list.get(2).fp().profileMiddle().formatted(), 3, i2);
        } else {
            bkb0 bkb0Var2 = qib0.f19782G;
            VDraweeView vDraweeView2 = this.f7059f;
            String str2 = list.get(0).fp().profileMiddle().formatted();
            int i3 = t100.f;
            bkb0Var2.m12749O(vDraweeView2, str2, 3, i3);
            qib0.f19782G.m12749O(this.f7060g, list.get(1).fp().profileMiddle().formatted(), 3, i3);
        }
        this.f7067n.setText(CoreModule.f1533b.getString(R.string.j1));
        this.f7068o.setText(CoreModule.f1533b.getString(R.string.m1));
        this.f7065l.setText(getContext().getString(i == 1 ? R.string.l1 : R.string.k1, i > 99 ? "99+" : String.valueOf(i)));
        this.f7066m.setText(CoreModule.m1854P().m11706a().m5228Bc(list.get(0), getContext(), new int[]{Color.parseColor("#ffe8aa"), Color.parseColor("#ffe8aa")}));
    }

    /* JADX INFO: renamed from: c */
    public void m10015c(List<String> list) {
        if (vwb.J(list)) {
            return;
        }
        int size = list.size();
        xdl0.M(this.f7056c, size == 1);
        xdl0.M(this.f7058e, size == 2);
        xdl0.M(this.f7061h, size >= 3);
        if (size == 1) {
            qib0.f19782G.m12749O(this.f7057d, list.get(0), 3, t100.f);
        } else if (size == 2) {
            bkb0 bkb0Var = qib0.f19782G;
            VDraweeView vDraweeView = this.f7059f;
            String str = list.get(0);
            int i = t100.f;
            bkb0Var.m12749O(vDraweeView, str, 3, i);
            qib0.f19782G.m12749O(this.f7060g, list.get(1), 3, i);
        } else {
            bkb0 bkb0Var2 = qib0.f19782G;
            VDraweeView vDraweeView2 = this.f7062i;
            String str2 = list.get(0);
            int i2 = t100.f;
            bkb0Var2.m12749O(vDraweeView2, str2, 3, i2);
            qib0.f19782G.m12749O(this.f7063j, list.get(1), 3, i2);
            qib0.f19782G.m12749O(this.f7064k, list.get(2), 3, i2);
        }
        this.f7065l.setText(CoreModule.f1533b.getString(R.string.Q0, t0g0.f(CoreModule.f1543l.m11706a().m5385Y4())));
        this.f7066m.setText(CoreModule.f1533b.getString(R.string.O0));
        ((LinearLayout.LayoutParams) this.f7066m.getLayoutParams()).setMargins(t100.d(38.0f), 0, t100.d(38.0f), 0);
        this.f7067n.setText(CoreModule.f1533b.getString(R.string.P0));
        this.f7068o.setText(CoreModule.f1533b.getString(R.string.m1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10013a(this);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
