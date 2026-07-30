package com.p051p1.mobile.putong.live.livingroom.increment.recharge;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.immomo.svgaplayer.view.MomoLayUpSVGAImageView;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import p151v.VText;
import p153l.bnl0;
import p153l.hre;
import p153l.jhe;
import p153l.n1k0;
import p153l.vxr;
import p153l.x20;
import p153l.yft;

/* JADX INFO: loaded from: classes4.dex */
public class LiveRemindDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f51728d;

    /* JADX INFO: renamed from: e */
    public MomoLayUpSVGAImageView f51729e;

    /* JADX INFO: renamed from: f */
    public XEGiftView f51730f;

    /* JADX INFO: renamed from: g */
    public VText f51731g;

    /* JADX INFO: renamed from: h */
    public VText f51732h;

    public LiveRemindDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m76317i0(View view) {
        yft.m215814a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m76318j0(String str) {
        bnl0.m105524M(this.f51728d, true);
        if (!vxr.m203876d().m170973E1()) {
            bnl0.m105524M(this.f51729e, true);
            this.f51729e.loadSVGAAnimWithListener(n1k0.m161124i(str, 3000), 1, null, true);
        } else {
            bnl0.m105524M(this.f51730f, true);
            jhe.m144897r(this.f51730f, new hre(str));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m76319k0(String str, String str2, final x20 x20Var) {
        this.f51731g.setText(str);
        bnl0.m105509E0(this.f51732h, new View.OnClickListener() { // from class: l.xft
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m76318j0(str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76317i0(this);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRemindDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
