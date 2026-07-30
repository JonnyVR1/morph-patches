package com.p051p1.mobile.putong.core.p058ui.vip.likers;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p153l.a9g0;
import p153l.bnl0;
import p153l.fsb0;
import p153l.jyb;
import p153l.lkr;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class LikersDialogView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f38121a;

    /* JADX INFO: renamed from: b */
    public ImageView f38122b;

    /* JADX INFO: renamed from: c */
    public VFrame_Shadow f38123c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f38124d;

    /* JADX INFO: renamed from: e */
    public VFrame f38125e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f38126f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f38127g;

    /* JADX INFO: renamed from: h */
    public VFrame f38128h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f38129i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f38130j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f38131k;

    /* JADX INFO: renamed from: l */
    public TextView f38132l;

    /* JADX INFO: renamed from: m */
    public TextView f38133m;

    /* JADX INFO: renamed from: n */
    public VButton f38134n;

    /* JADX INFO: renamed from: o */
    public TextView f38135o;

    public LikersDialogView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m57754a(View view) {
        lkr.m154650a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m57755b(int i, CoreLikers.C4870a c4870a) {
        List<User> list = c4870a.f20014d;
        int size = list.size();
        bnl0.m105524M(this.f38123c, i == 1 || (i > 1 && size == 1));
        bnl0.m105524M(this.f38125e, (i == 2 && size >= 2) || (i > 2 && size == 2));
        bnl0.m105524M(this.f38128h, i >= 3 && size >= 3);
        if (i == 1 || (i > 1 && size == 1)) {
            uqb0.f180374G.m127120O(this.f38124d, list.get(0).m61308fp().profileMiddle().formatted(), 3, qa00.f156319f);
        } else if ((i != 2 || size < 2) && (i <= 2 || size != 2)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f38129i;
            String str = list.get(0).m61308fp().profileMiddle().formatted();
            int i2 = qa00.f156319f;
            fsb0Var.m127120O(vDraweeView, str, 3, i2);
            uqb0.f180374G.m127120O(this.f38130j, list.get(1).m61308fp().profileMiddle().formatted(), 3, i2);
            uqb0.f180374G.m127120O(this.f38131k, list.get(2).m61308fp().profileMiddle().formatted(), 3, i2);
        } else {
            fsb0 fsb0Var2 = uqb0.f180374G;
            VDraweeView vDraweeView2 = this.f38126f;
            String str2 = list.get(0).m61308fp().profileMiddle().formatted();
            int i3 = qa00.f156319f;
            fsb0Var2.m127120O(vDraweeView2, str2, 3, i3);
            uqb0.f180374G.m127120O(this.f38127g, list.get(1).m61308fp().profileMiddle().formatted(), 3, i3);
        }
        this.f38134n.setText(CoreModule.f18263b.getString(R$string.f21398j1));
        this.f38135o.setText(CoreModule.f18263b.getString(R$string.f21407m1));
        this.f38132l.setText(getContext().getString(i == 1 ? R$string.f21404l1 : R$string.f21401k1, i > 99 ? "99+" : String.valueOf(i)));
        this.f38133m.setText(CoreModule.m30933P().m143405a().mo34294Bc(list.get(0), getContext(), new int[]{Color.parseColor("#ffe8aa"), Color.parseColor("#ffe8aa")}));
    }

    /* JADX INFO: renamed from: c */
    public void m57756c(List<String> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        int size = list.size();
        bnl0.m105524M(this.f38123c, size == 1);
        bnl0.m105524M(this.f38125e, size == 2);
        bnl0.m105524M(this.f38128h, size >= 3);
        if (size == 1) {
            uqb0.f180374G.m127120O(this.f38124d, list.get(0), 3, qa00.f156319f);
        } else if (size == 2) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f38126f;
            String str = list.get(0);
            int i = qa00.f156319f;
            fsb0Var.m127120O(vDraweeView, str, 3, i);
            uqb0.f180374G.m127120O(this.f38127g, list.get(1), 3, i);
        } else {
            fsb0 fsb0Var2 = uqb0.f180374G;
            VDraweeView vDraweeView2 = this.f38129i;
            String str2 = list.get(0);
            int i2 = qa00.f156319f;
            fsb0Var2.m127120O(vDraweeView2, str2, 3, i2);
            uqb0.f180374G.m127120O(this.f38130j, list.get(1), 3, i2);
            uqb0.f180374G.m127120O(this.f38131k, list.get(2), 3, i2);
        }
        this.f38132l.setText(CoreModule.f18263b.getString(R$string.f21350Q0, a9g0.m96571f(CoreModule.f18273l.m143405a().mo34451Y4())));
        this.f38133m.setText(CoreModule.f18263b.getString(R$string.f21346O0));
        ((LinearLayout.LayoutParams) this.f38133m.getLayoutParams()).setMargins(qa00.m175859d(38.0f), 0, qa00.m175859d(38.0f), 0);
        this.f38134n.setText(CoreModule.f18263b.getString(R$string.f21348P0));
        this.f38135o.setText(CoreModule.f18263b.getString(R$string.f21407m1));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57754a(this);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
