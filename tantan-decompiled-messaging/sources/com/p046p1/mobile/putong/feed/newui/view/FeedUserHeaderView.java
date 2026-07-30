package com.p046p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.e30;
import p149l.j8i;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedUserHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear f43423d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f43424e;

    /* JADX INFO: renamed from: f */
    public VLinear f43425f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f43426g;

    /* JADX INFO: renamed from: h */
    public VLinear f43427h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f43428i;

    public FeedUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m66365h0(VDraweeView vDraweeView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vDraweeView.getLayoutParams();
        layoutParams.width = t100.m186890d(20.0f);
        layoutParams.height = t100.m186890d(20.0f);
        vDraweeView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m66366i0(VLinear vLinear) {
        ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) vLinear.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0220a).width = t100.m186890d(24.0f);
        ((ViewGroup.MarginLayoutParams) c0220a).height = t100.m186890d(24.0f);
        vLinear.setLayoutParams(c0220a);
        vLinear.setBackgroundDrawable(m66367m0(Color.parseColor("#C2D4FF")));
    }

    /* JADX INFO: renamed from: m0 */
    public static GradientDrawable m66367m0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m66368j0(View view) {
        j8i.m140225a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m66369k0() {
        xdl0.m208358V(this.f43425f, t100.m186890d(14.0f));
        xdl0.m208358V(this.f43427h, t100.m186890d(29.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m66370l0() {
        VLinear vLinear = this.f43423d;
        VLinear vLinear2 = this.f43425f;
        vwb.m200354z(vwb.m200324f0(vLinear, vLinear2, vLinear2), new e30() { // from class: l.h8i
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedUserHeaderView.m66366i0((VLinear) obj);
            }
        });
        vwb.m200354z(vwb.m200324f0(this.f43424e, this.f43426g, this.f43428i), new e30() { // from class: l.i8i
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedUserHeaderView.m66365h0((VDraweeView) obj);
            }
        });
        xdl0.m208358V(this.f43425f, t100.m186890d(16.0f));
        xdl0.m208358V(this.f43427h, t100.m186890d(33.0f));
    }

    /* JADX INFO: renamed from: n0 */
    public void m66371n0(List<String> list, boolean z) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f43423d, false);
            xdl0.m208344M(this.f43425f, false);
            xdl0.m208344M(this.f43427h, false);
            return;
        }
        if (z) {
            int size = list.size();
            if (size == 1) {
                qib0.f154691G.m102325I0(this.f43424e, list.get(0), t100.m186890d(20.0f), t100.m186890d(20.0f));
                xdl0.m208344M(this.f43423d, true);
                xdl0.m208344M(this.f43425f, false);
                xdl0.m208344M(this.f43427h, false);
                return;
            }
            if (size == 2) {
                qib0.f154691G.m102325I0(this.f43424e, list.get(0), t100.m186890d(20.0f), t100.m186890d(20.0f));
                qib0.f154691G.m102325I0(this.f43426g, list.get(1), t100.m186890d(20.0f), t100.m186890d(20.0f));
                xdl0.m208344M(this.f43423d, true);
                xdl0.m208344M(this.f43425f, true);
                xdl0.m208344M(this.f43427h, false);
                return;
            }
            qib0.f154691G.m102325I0(this.f43424e, list.get(0), t100.m186890d(20.0f), t100.m186890d(20.0f));
            qib0.f154691G.m102325I0(this.f43426g, list.get(1), t100.m186890d(20.0f), t100.m186890d(20.0f));
            qib0.f154691G.m102325I0(this.f43428i, list.get(2), t100.m186890d(20.0f), t100.m186890d(20.0f));
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, true);
            xdl0.m208344M(this.f43427h, true);
            return;
        }
        int size2 = list.size();
        if (size2 == 1) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(list.get(0));
            if (userM209447e8 == null) {
                return;
            }
            qib0.f154691G.m102341Q0(this.f43424e, userM209447e8.m60124fp().profileSmall());
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, false);
            xdl0.m208344M(this.f43427h, false);
            return;
        }
        if (size2 == 2) {
            User userM209447e9 = FeedModule.f38855d.m209447e8(list.get(0));
            User userM209447e10 = FeedModule.f38855d.m209447e8(list.get(1));
            if (userM209447e9 == null && userM209447e10 == null) {
                return;
            }
            if (userM209447e9 == null || userM209447e10 == null) {
                qib0.f154691G.m102341Q0(this.f43424e, (userM209447e9 == null ? userM209447e10.m60124fp() : userM209447e9.m60124fp()).profileSmall());
                xdl0.m208344M(this.f43423d, true);
                xdl0.m208344M(this.f43425f, false);
                xdl0.m208344M(this.f43427h, false);
                return;
            }
            qib0.f154691G.m102341Q0(this.f43424e, userM209447e10.m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f43426g, userM209447e9.m60124fp().profileSmall());
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, true);
            xdl0.m208344M(this.f43427h, false);
            return;
        }
        User userM209447e11 = FeedModule.f38855d.m209447e8(list.get(0));
        User userM209447e12 = FeedModule.f38855d.m209447e8(list.get(1));
        User userM209447e13 = FeedModule.f38855d.m209447e8(list.get(2));
        if (userM209447e11 == null && userM209447e12 == null && userM209447e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(userM209447e11)) {
            arrayList.add(userM209447e11);
        }
        if (NullChecker.m81303a(userM209447e12)) {
            arrayList.add(userM209447e12);
        }
        if (NullChecker.m81303a(userM209447e13)) {
            arrayList.add(userM209447e13);
        }
        if (arrayList.size() == 1) {
            qib0.f154691G.m102341Q0(this.f43424e, ((User) arrayList.get(0)).m60124fp().profileSmall());
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, false);
            xdl0.m208344M(this.f43427h, false);
        }
        if (arrayList.size() == 2) {
            qib0.f154691G.m102341Q0(this.f43424e, ((User) arrayList.get(0)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f43426g, ((User) arrayList.get(1)).m60124fp().profileSmall());
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, true);
            xdl0.m208344M(this.f43427h, false);
        }
        if (arrayList.size() == 3) {
            qib0.f154691G.m102341Q0(this.f43424e, ((User) arrayList.get(0)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f43426g, ((User) arrayList.get(1)).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f43428i, ((User) arrayList.get(2)).m60124fp().profileSmall());
            xdl0.m208344M(this.f43423d, true);
            xdl0.m208344M(this.f43425f, true);
            xdl0.m208344M(this.f43427h, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66368j0(this);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
