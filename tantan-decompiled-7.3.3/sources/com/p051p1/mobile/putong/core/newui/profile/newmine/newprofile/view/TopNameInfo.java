package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dk90;
import p153l.joa;
import p153l.ktl0;
import p153l.oql0;
import p153l.qa00;
import p153l.t450;

/* JADX INFO: loaded from: classes11.dex */
public class TopNameInfo extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopNameInfo f27590c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f27591d;

    /* JADX INFO: renamed from: e */
    public VText f27592e;

    /* JADX INFO: renamed from: f */
    public VImage f27593f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f27594g;

    /* JADX INFO: renamed from: h */
    public VImage f27595h;

    /* JADX INFO: renamed from: i */
    public Act f27596i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.TopNameInfo$a */
    public static class C8397a {
        /* JADX INFO: renamed from: b */
        public static void m44694b(TopNameInfo topNameInfo, View view) {
            topNameInfo.f27590c = (TopNameInfo) view;
            ViewGroup viewGroup = (ViewGroup) view;
            topNameInfo.f27591d = (LinearLayout) viewGroup.getChildAt(0);
            topNameInfo.f27592e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            topNameInfo.f27593f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            topNameInfo.f27594g = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            topNameInfo.f27595h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        }
    }

    public TopNameInfo(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m44690Y(View view) {
        m44692Z();
    }

    /* JADX INFO: renamed from: X */
    public final void m44691X(View view) {
        C8397a.m44694b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public void m44692Z() {
        if (t450.m189175j()) {
            Act act = this.f27596i;
            act.startActivity(VipAct.m57420c2(act, oql0.m168817a("diamond")));
            return;
        }
        if (dk90.m116229h() || joa.m146388g4()) {
            Act act2 = this.f27596i;
            act2.startActivity(VipAct.m57420c2(act2, oql0.m168817a("svip")));
            return;
        }
        boolean zM116230i = dk90.m116230i();
        Act act3 = this.f27596i;
        if (zM116230i) {
            act3.startActivity(VipAct.m57419b2(act3));
        } else {
            act3.startActivity(VipAct.m57420c2(act3, ktl0.m151379q0()));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44691X(this);
        this.f27596i = (Act) bnl0.m105508E(this);
        this.f27592e.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105507D0(bnl0.m105592y0() - qa00.m175859d(79.0f), this.f27590c);
        bnl0.m105509E0(this.f27595h, new View.OnClickListener() { // from class: l.f5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97229a.m44690Y(view);
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
