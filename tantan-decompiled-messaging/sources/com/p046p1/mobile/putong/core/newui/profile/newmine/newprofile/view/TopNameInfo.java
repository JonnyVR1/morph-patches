package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ew40;
import p149l.gkl0;
import p149l.khl0;
import p149l.t100;
import p149l.xdl0;
import p149l.xma;
import p149l.zb90;

/* JADX INFO: loaded from: classes11.dex */
public class TopNameInfo extends VLinear {

    /* JADX INFO: renamed from: c */
    public TopNameInfo f26742c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f26743d;

    /* JADX INFO: renamed from: e */
    public VText f26744e;

    /* JADX INFO: renamed from: f */
    public VImage f26745f;

    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel f26746g;

    /* JADX INFO: renamed from: h */
    public VImage f26747h;

    /* JADX INFO: renamed from: i */
    public Act f26748i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.TopNameInfo$a */
    public static class C8234a {
        /* JADX INFO: renamed from: b */
        public static void m43508b(TopNameInfo topNameInfo, View view) {
            topNameInfo.f26742c = (TopNameInfo) view;
            ViewGroup viewGroup = (ViewGroup) view;
            topNameInfo.f26743d = (LinearLayout) viewGroup.getChildAt(0);
            topNameInfo.f26744e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            topNameInfo.f26745f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            topNameInfo.f26746g = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            topNameInfo.f26747h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        }
    }

    public TopNameInfo(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m43504Y(View view) {
        m43506Z();
    }

    /* JADX INFO: renamed from: X */
    public final void m43505X(View view) {
        C8234a.m43508b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public void m43506Z() {
        if (ew40.m118398j()) {
            Act act = this.f26748i;
            act.startActivity(VipAct.m56237b2(act, khl0.m145975a("diamond")));
            return;
        }
        if (zb90.m217831h() || xma.m210073f4()) {
            Act act2 = this.f26748i;
            act2.startActivity(VipAct.m56237b2(act2, khl0.m145975a("svip")));
            return;
        }
        boolean zM217832i = zb90.m217832i();
        Act act3 = this.f26748i;
        if (zM217832i) {
            act3.startActivity(VipAct.m56236a2(act3));
        } else {
            act3.startActivity(VipAct.m56237b2(act3, gkl0.m126654q0()));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43505X(this);
        this.f26748i = (Act) xdl0.m208328E(this);
        this.f26744e.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208327D0(xdl0.m208412y0() - t100.m186890d(79.0f), this.f26742c);
        xdl0.m208329E0(this.f26747h, new View.OnClickListener() { // from class: l.bwi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77618a.m43504Y(view);
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
