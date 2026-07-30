package com.p051p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserHeaderView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.jyb;
import p153l.qa00;
import p153l.uqb0;
import p153l.y20;
import p153l.y9i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedUserHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VLinear f44271d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f44272e;

    /* JADX INFO: renamed from: f */
    public VLinear f44273f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f44274g;

    /* JADX INFO: renamed from: h */
    public VLinear f44275h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f44276i;

    public FeedUserHeaderView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m67548h0(VDraweeView vDraweeView) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vDraweeView.getLayoutParams();
        layoutParams.width = qa00.m175859d(20.0f);
        layoutParams.height = qa00.m175859d(20.0f);
        vDraweeView.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m67549i0(VLinear vLinear) {
        ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) vLinear.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0221a).width = qa00.m175859d(24.0f);
        ((ViewGroup.MarginLayoutParams) c0221a).height = qa00.m175859d(24.0f);
        vLinear.setLayoutParams(c0221a);
        vLinear.setBackgroundDrawable(m67550m0(Color.parseColor("#C2D4FF")));
    }

    /* JADX INFO: renamed from: m0 */
    public static GradientDrawable m67550m0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m67551j0(View view) {
        y9i.m214843a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m67552k0() {
        bnl0.m105538V(this.f44273f, qa00.m175859d(14.0f));
        bnl0.m105538V(this.f44275h, qa00.m175859d(29.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m67553l0() {
        VLinear vLinear = this.f44271d;
        VLinear vLinear2 = this.f44273f;
        jyb.m147537z(jyb.m147507f0(vLinear, vLinear2, vLinear2), new y20() { // from class: l.w9i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedUserHeaderView.m67549i0((VLinear) obj);
            }
        });
        jyb.m147537z(jyb.m147507f0(this.f44272e, this.f44274g, this.f44276i), new y20() { // from class: l.x9i
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedUserHeaderView.m67548h0((VDraweeView) obj);
            }
        });
        bnl0.m105538V(this.f44273f, qa00.m175859d(16.0f));
        bnl0.m105538V(this.f44275h, qa00.m175859d(33.0f));
    }

    /* JADX INFO: renamed from: n0 */
    public void m67554n0(List<String> list, boolean z) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f44271d, false);
            bnl0.m105524M(this.f44273f, false);
            bnl0.m105524M(this.f44275h, false);
            return;
        }
        if (z) {
            int size = list.size();
            if (size == 1) {
                uqb0.f180374G.m127109I0(this.f44272e, list.get(0), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
                bnl0.m105524M(this.f44271d, true);
                bnl0.m105524M(this.f44273f, false);
                bnl0.m105524M(this.f44275h, false);
                return;
            }
            if (size == 2) {
                uqb0.f180374G.m127109I0(this.f44272e, list.get(0), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
                uqb0.f180374G.m127109I0(this.f44274g, list.get(1), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
                bnl0.m105524M(this.f44271d, true);
                bnl0.m105524M(this.f44273f, true);
                bnl0.m105524M(this.f44275h, false);
                return;
            }
            uqb0.f180374G.m127109I0(this.f44272e, list.get(0), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
            uqb0.f180374G.m127109I0(this.f44274g, list.get(1), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
            uqb0.f180374G.m127109I0(this.f44276i, list.get(2), qa00.m175859d(20.0f), qa00.m175859d(20.0f));
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, true);
            bnl0.m105524M(this.f44275h, true);
            return;
        }
        int size2 = list.size();
        if (size2 == 1) {
            User userM145688e8 = FeedModule.f39703d.m145688e8(list.get(0));
            if (userM145688e8 == null) {
                return;
            }
            uqb0.f180374G.m127125Q0(this.f44272e, userM145688e8.m61308fp().profileSmall());
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, false);
            bnl0.m105524M(this.f44275h, false);
            return;
        }
        if (size2 == 2) {
            User userM145688e9 = FeedModule.f39703d.m145688e8(list.get(0));
            User userM145688e10 = FeedModule.f39703d.m145688e8(list.get(1));
            if (userM145688e9 == null && userM145688e10 == null) {
                return;
            }
            if (userM145688e9 == null || userM145688e10 == null) {
                uqb0.f180374G.m127125Q0(this.f44272e, (userM145688e9 == null ? userM145688e10.m61308fp() : userM145688e9.m61308fp()).profileSmall());
                bnl0.m105524M(this.f44271d, true);
                bnl0.m105524M(this.f44273f, false);
                bnl0.m105524M(this.f44275h, false);
                return;
            }
            uqb0.f180374G.m127125Q0(this.f44272e, userM145688e10.m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f44274g, userM145688e9.m61308fp().profileSmall());
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, true);
            bnl0.m105524M(this.f44275h, false);
            return;
        }
        User userM145688e11 = FeedModule.f39703d.m145688e8(list.get(0));
        User userM145688e12 = FeedModule.f39703d.m145688e8(list.get(1));
        User userM145688e13 = FeedModule.f39703d.m145688e8(list.get(2));
        if (userM145688e11 == null && userM145688e12 == null && userM145688e13 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(userM145688e11)) {
            arrayList.add(userM145688e11);
        }
        if (NullChecker.m82486a(userM145688e12)) {
            arrayList.add(userM145688e12);
        }
        if (NullChecker.m82486a(userM145688e13)) {
            arrayList.add(userM145688e13);
        }
        if (arrayList.size() == 1) {
            uqb0.f180374G.m127125Q0(this.f44272e, ((User) arrayList.get(0)).m61308fp().profileSmall());
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, false);
            bnl0.m105524M(this.f44275h, false);
        }
        if (arrayList.size() == 2) {
            uqb0.f180374G.m127125Q0(this.f44272e, ((User) arrayList.get(0)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f44274g, ((User) arrayList.get(1)).m61308fp().profileSmall());
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, true);
            bnl0.m105524M(this.f44275h, false);
        }
        if (arrayList.size() == 3) {
            uqb0.f180374G.m127125Q0(this.f44272e, ((User) arrayList.get(0)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f44274g, ((User) arrayList.get(1)).m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f44276i, ((User) arrayList.get(2)).m61308fp().profileSmall());
            bnl0.m105524M(this.f44271d, true);
            bnl0.m105524M(this.f44273f, true);
            bnl0.m105524M(this.f44275h, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67551j0(this);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
