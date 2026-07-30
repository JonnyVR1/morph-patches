package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import l.ew40;
import l.gkl0;
import l.khl0;
import l.t100;
import l.xdl0;
import l.xma;
import l.zb90;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TopNameInfo extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopNameInfo f5520c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f5521d;

    /* JADX INFO: renamed from: e */
    public VText f5522e;

    /* JADX INFO: renamed from: f */
    public VImage f5523f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f5524g;

    /* JADX INFO: renamed from: h */
    public VImage f5525h;

    /* JADX INFO: renamed from: i */
    public Act f5526i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.TopNameInfo$a */
    public static class C0398a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m7754b(TopNameInfo topNameInfo, View view) {
            topNameInfo.f5520c = (TopNameInfo) view;
            ViewGroup viewGroup = (ViewGroup) view;
            topNameInfo.f5521d = (LinearLayout) viewGroup.getChildAt(0);
            topNameInfo.f5522e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            topNameInfo.f5523f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            topNameInfo.f5524g = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            topNameInfo.f5525h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        }
    }

    public TopNameInfo(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m7750Y(View view) {
        m7752Z();
    }

    /* JADX INFO: renamed from: X */
    public final void m7751X(View view) {
        C0398a.m7754b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public void m7752Z() {
        if (ew40.j()) {
            Act act = this.f5526i;
            act.startActivity(VipAct.b2(act, khl0.a("diamond")));
            return;
        }
        if (zb90.h() || xma.f4()) {
            Act act2 = this.f5526i;
            act2.startActivity(VipAct.b2(act2, khl0.a("svip")));
            return;
        }
        boolean zI = zb90.i();
        Act act3 = this.f5526i;
        if (zI) {
            act3.startActivity(VipAct.a2(act3));
        } else {
            act3.startActivity(VipAct.b2(act3, gkl0.q0()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7751X(this);
        this.f5526i = xdl0.E(this);
        this.f5522e.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.D0(xdl0.y0() - t100.d(79.0f), new View[]{this.f5520c});
        xdl0.E0(this.f5525h, new View.OnClickListener() { // from class: l.bwi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10340a.m7750Y(view);
            }
        });
    }

    public TopNameInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopNameInfo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
