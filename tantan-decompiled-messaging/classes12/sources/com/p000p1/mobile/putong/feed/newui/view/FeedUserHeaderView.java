package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.j8i;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedUserHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear f4884d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4885e;

    /* JADX INFO: renamed from: f */
    public VLinear f4886f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f4887g;

    /* JADX INFO: renamed from: h */
    public VLinear f4888h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4889i;

    public FeedUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m7530h0(VDraweeView vDraweeView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vDraweeView.getLayoutParams();
        layoutParams.width = t100.d(20.0f);
        layoutParams.height = t100.d(20.0f);
        vDraweeView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m7531i0(VLinear vLinear) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) vLinear.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) aVar).width = t100.d(24.0f);
        ((ViewGroup.MarginLayoutParams) aVar).height = t100.d(24.0f);
        vLinear.setLayoutParams(aVar);
        vLinear.setBackgroundDrawable(m7532m0(Color.parseColor("#C2D4FF")));
    }

    /* JADX INFO: renamed from: m0 */
    public static GradientDrawable m7532m0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m7533j0(View view) {
        j8i.m11092a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m7534k0() {
        xdl0.V(this.f4886f, t100.d(14.0f));
        xdl0.V(this.f4888h, t100.d(29.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m7535l0() {
        VLinear vLinear = this.f4884d;
        VLinear vLinear2 = this.f4886f;
        vwb.z(vwb.f0(new VLinear[]{vLinear, vLinear2, vLinear2}), new e30() { // from class: l.h8i
            public final void call(Object obj) {
                FeedUserHeaderView.m7531i0((VLinear) obj);
            }
        });
        vwb.z(vwb.f0(new VDraweeView[]{this.f4885e, this.f4887g, this.f4889i}), new e30() { // from class: l.i8i
            public final void call(Object obj) {
                FeedUserHeaderView.m7530h0((VDraweeView) obj);
            }
        });
        xdl0.V(this.f4886f, t100.d(16.0f));
        xdl0.V(this.f4888h, t100.d(33.0f));
    }

    /* JADX INFO: renamed from: n0 */
    public void m7536n0(List<String> list, boolean z) {
        if (vwb.J(list)) {
            xdl0.M(this.f4884d, false);
            xdl0.M(this.f4886f, false);
            xdl0.M(this.f4888h, false);
            return;
        }
        if (z) {
            int size = list.size();
            if (size == 1) {
                qib0.G.I0(this.f4885e, list.get(0), t100.d(20.0f), t100.d(20.0f));
                xdl0.M(this.f4884d, true);
                xdl0.M(this.f4886f, false);
                xdl0.M(this.f4888h, false);
                return;
            }
            if (size == 2) {
                qib0.G.I0(this.f4885e, list.get(0), t100.d(20.0f), t100.d(20.0f));
                qib0.G.I0(this.f4887g, list.get(1), t100.d(20.0f), t100.d(20.0f));
                xdl0.M(this.f4884d, true);
                xdl0.M(this.f4886f, true);
                xdl0.M(this.f4888h, false);
                return;
            }
            qib0.G.I0(this.f4885e, list.get(0), t100.d(20.0f), t100.d(20.0f));
            qib0.G.I0(this.f4887g, list.get(1), t100.d(20.0f), t100.d(20.0f));
            qib0.G.I0(this.f4889i, list.get(2), t100.d(20.0f), t100.d(20.0f));
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, true);
            xdl0.M(this.f4888h, true);
            return;
        }
        int size2 = list.size();
        if (size2 == 1) {
            User userM16628e8 = FeedModule.f316d.m16628e8(list.get(0));
            if (userM16628e8 == null) {
                return;
            }
            qib0.G.Q0(this.f4885e, userM16628e8.m1042fp().profileSmall());
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, false);
            xdl0.M(this.f4888h, false);
            return;
        }
        if (size2 == 2) {
            User userM16628e9 = FeedModule.f316d.m16628e8(list.get(0));
            User userM16628e10 = FeedModule.f316d.m16628e8(list.get(1));
            if (userM16628e9 == null && userM16628e10 == null) {
                return;
            }
            if (userM16628e9 == null || userM16628e10 == null) {
                qib0.G.Q0(this.f4885e, (userM16628e9 == null ? userM16628e10.m1042fp() : userM16628e9.m1042fp()).profileSmall());
                xdl0.M(this.f4884d, true);
                xdl0.M(this.f4886f, false);
                xdl0.M(this.f4888h, false);
                return;
            }
            qib0.G.Q0(this.f4885e, userM16628e10.m1042fp().profileSmall());
            qib0.G.Q0(this.f4887g, userM16628e9.m1042fp().profileSmall());
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, true);
            xdl0.M(this.f4888h, false);
            return;
        }
        User userM16628e11 = FeedModule.f316d.m16628e8(list.get(0));
        User userM16628e12 = FeedModule.f316d.m16628e8(list.get(1));
        User userM16628e13 = FeedModule.f316d.m16628e8(list.get(2));
        if (userM16628e11 == null && userM16628e12 == null && userM16628e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(userM16628e11)) {
            arrayList.add(userM16628e11);
        }
        if (NullChecker.a(userM16628e12)) {
            arrayList.add(userM16628e12);
        }
        if (NullChecker.a(userM16628e13)) {
            arrayList.add(userM16628e13);
        }
        if (arrayList.size() == 1) {
            qib0.G.Q0(this.f4885e, ((User) arrayList.get(0)).m1042fp().profileSmall());
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, false);
            xdl0.M(this.f4888h, false);
        }
        if (arrayList.size() == 2) {
            qib0.G.Q0(this.f4885e, ((User) arrayList.get(0)).m1042fp().profileSmall());
            qib0.G.Q0(this.f4887g, ((User) arrayList.get(1)).m1042fp().profileSmall());
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, true);
            xdl0.M(this.f4888h, false);
        }
        if (arrayList.size() == 3) {
            qib0.G.Q0(this.f4885e, ((User) arrayList.get(0)).m1042fp().profileSmall());
            qib0.G.Q0(this.f4887g, ((User) arrayList.get(1)).m1042fp().profileSmall());
            qib0.G.Q0(this.f4889i, ((User) arrayList.get(2)).m1042fp().profileSmall());
            xdl0.M(this.f4884d, true);
            xdl0.M(this.f4886f, true);
            xdl0.M(this.f4888h, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7533j0(this);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
