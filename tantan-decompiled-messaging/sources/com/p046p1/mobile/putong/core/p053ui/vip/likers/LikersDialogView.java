package com.p046p1.mobile.putong.core.p053ui.vip.likers;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p149l.bkb0;
import p149l.kir;
import p149l.qib0;
import p149l.t0g0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class LikersDialogView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f37273a;

    /* JADX INFO: renamed from: b */
    public ImageView f37274b;

    /* JADX INFO: renamed from: c */
    public VFrame_Shadow f37275c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f37276d;

    /* JADX INFO: renamed from: e */
    public VFrame f37277e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f37278f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f37279g;

    /* JADX INFO: renamed from: h */
    public VFrame f37280h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f37281i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f37282j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f37283k;

    /* JADX INFO: renamed from: l */
    public TextView f37284l;

    /* JADX INFO: renamed from: m */
    public TextView f37285m;

    /* JADX INFO: renamed from: n */
    public VButton f37286n;

    /* JADX INFO: renamed from: o */
    public TextView f37287o;

    public LikersDialogView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m56571a(View view) {
        kir.m146129a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m56572b(int i, CoreLikers.C4719a c4719a) {
        List<User> list = c4719a.f19272d;
        int size = list.size();
        xdl0.m208344M(this.f37275c, i == 1 || (i > 1 && size == 1));
        xdl0.m208344M(this.f37277e, (i == 2 && size >= 2) || (i > 2 && size == 2));
        xdl0.m208344M(this.f37280h, i >= 3 && size >= 3);
        if (i == 1 || (i > 1 && size == 1)) {
            qib0.f154691G.m102336O(this.f37276d, list.get(0).m60124fp().profileMiddle().formatted(), 3, t100.f167257f);
        } else if ((i != 2 || size < 2) && (i <= 2 || size != 2)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f37281i;
            String str = list.get(0).m60124fp().profileMiddle().formatted();
            int i2 = t100.f167257f;
            bkb0Var.m102336O(vDraweeView, str, 3, i2);
            qib0.f154691G.m102336O(this.f37282j, list.get(1).m60124fp().profileMiddle().formatted(), 3, i2);
            qib0.f154691G.m102336O(this.f37283k, list.get(2).m60124fp().profileMiddle().formatted(), 3, i2);
        } else {
            bkb0 bkb0Var2 = qib0.f154691G;
            VDraweeView vDraweeView2 = this.f37278f;
            String str2 = list.get(0).m60124fp().profileMiddle().formatted();
            int i3 = t100.f167257f;
            bkb0Var2.m102336O(vDraweeView2, str2, 3, i3);
            qib0.f154691G.m102336O(this.f37279g, list.get(1).m60124fp().profileMiddle().formatted(), 3, i3);
        }
        this.f37286n.setText(CoreModule.f17544b.getString(R$string.f20656j1));
        this.f37287o.setText(CoreModule.f17544b.getString(R$string.f20665m1));
        this.f37284l.setText(getContext().getString(i == 1 ? R$string.f20662l1 : R$string.f20659k1, i > 99 ? "99+" : String.valueOf(i)));
        this.f37285m.setText(CoreModule.m29935P().m94651a().mo33291Bc(list.get(0), getContext(), new int[]{Color.parseColor("#ffe8aa"), Color.parseColor("#ffe8aa")}));
    }

    /* JADX INFO: renamed from: c */
    public void m56573c(List<String> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        int size = list.size();
        xdl0.m208344M(this.f37275c, size == 1);
        xdl0.m208344M(this.f37277e, size == 2);
        xdl0.m208344M(this.f37280h, size >= 3);
        if (size == 1) {
            qib0.f154691G.m102336O(this.f37276d, list.get(0), 3, t100.f167257f);
        } else if (size == 2) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f37278f;
            String str = list.get(0);
            int i = t100.f167257f;
            bkb0Var.m102336O(vDraweeView, str, 3, i);
            qib0.f154691G.m102336O(this.f37279g, list.get(1), 3, i);
        } else {
            bkb0 bkb0Var2 = qib0.f154691G;
            VDraweeView vDraweeView2 = this.f37281i;
            String str2 = list.get(0);
            int i2 = t100.f167257f;
            bkb0Var2.m102336O(vDraweeView2, str2, 3, i2);
            qib0.f154691G.m102336O(this.f37282j, list.get(1), 3, i2);
            qib0.f154691G.m102336O(this.f37283k, list.get(2), 3, i2);
        }
        this.f37284l.setText(CoreModule.f17544b.getString(R$string.f20608Q0, t0g0.m186865f(CoreModule.f17554l.m94651a().mo33448Y4())));
        this.f37285m.setText(CoreModule.f17544b.getString(R$string.f20604O0));
        ((LinearLayout.LayoutParams) this.f37285m.getLayoutParams()).setMargins(t100.m186890d(38.0f), 0, t100.m186890d(38.0f), 0);
        this.f37286n.setText(CoreModule.f17544b.getString(R$string.f20606P0));
        this.f37287o.setText(CoreModule.f17544b.getString(R$string.f20665m1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56571a(this);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
