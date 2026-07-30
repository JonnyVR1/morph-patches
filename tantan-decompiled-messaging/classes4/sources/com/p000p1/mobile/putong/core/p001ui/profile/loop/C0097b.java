package com.p000p1.mobile.putong.core.p001ui.profile.loop;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.views.RingProgressBarView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.SetInfoProgressView;
import l.bt0;
import l.e3c0;
import l.jha0;
import l.mji0;
import l.s7m;
import l.t100;
import l.ura;
import l.xdl0;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0097b implements s7m<C0096a> {

    /* JADX INFO: renamed from: a */
    public VLinear f1251a;

    /* JADX INFO: renamed from: b */
    public ImageView f1252b;

    /* JADX INFO: renamed from: c */
    public SetInfoProgressView f1253c;

    /* JADX INFO: renamed from: d */
    public VText f1254d;

    /* JADX INFO: renamed from: e */
    public VFrame f1255e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f1256f;

    /* JADX INFO: renamed from: g */
    public TextView f1257g;

    /* JADX INFO: renamed from: h */
    public TextView f1258h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f1259i;

    /* JADX INFO: renamed from: j */
    public Context f1260j;

    /* JADX INFO: renamed from: k */
    public C0096a f1261k;

    /* JADX INFO: renamed from: l */
    public String f1262l;

    public C0097b(Context context) {
        this.f1260j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m2049f(View view) {
        this.f1261k.m2038p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m2050i(View view) {
        this.f1261k.m2040r0();
    }

    /* JADX INFO: renamed from: m */
    private boolean m2051m() {
        return "from_ideal_guide_dialog".equals(this.f1262l) || "from_ideal_guide_profile_item".equals(this.f1262l);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2052C0() {
        return this.f1260j;
    }

    /* JADX INFO: renamed from: c */
    public View m2053c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jha0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m2056i1(C0096a c0096a) {
        this.f1261k = c0096a;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m2055e(String str, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, int i) {
        if (TextUtils.equals(str, "from_card_upload_photo") || TextUtils.equals(str, "from_profile_upload_photo") || TextUtils.equals(str, "from_explore_card") || TextUtils.equals(str, "from_filter_purpose_dialog") || TextUtils.equals(str, "from_card_guide_improve_profile")) {
            xdl0.M(this.f1254d, false);
        } else {
            xdl0.M(this.f1254d, true);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT && i <= 1) {
            xdl0.M(this.f1254d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            xdl0.M(this.f1254d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME) {
            this.f1252b.setImageResource(e3c0.r);
            xdl0.M(this.f1253c, false);
            xdl0.M(this.f1254d, false);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2053c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m2057j(boolean z) {
        xdl0.M(this.f1254d, z);
    }

    /* JADX INFO: renamed from: k */
    public void m2058k(int i, int i2) {
        if (!m2051m()) {
            this.f1253c.m3602d(i2, i);
            if (xdl0.O0(this.f1253c) || i <= 1) {
                return;
            }
            xdl0.M(this.f1253c, true);
            this.f1253c.setAlpha(0.0f);
            bt0.q(this.f1253c, "alpha", new float[]{1.0f}).setDuration(180L).start();
            return;
        }
        int iJc = ura.e().d().Jc(act());
        this.f1256f.setProgress(iJc);
        this.f1257g.getPaint().setFakeBoldText(true);
        this.f1257g.setText("已完成" + iJc + "%");
        if ("from_ideal_guide_dialog".equals(this.f1262l) || "from_ideal_guide_profile_item".equals(this.f1262l)) {
            this.f1258h.setText("丰富资料，符合更多人的理想型，推荐给更多合适的人");
            mji0.m(this.f1258h, t100.d(17.0f));
            mji0.m(this.f1257g, t100.d(21.0f));
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m2059l() {
        return xdl0.O0(this.f1254d);
    }

    /* JADX INFO: renamed from: r */
    public void m2060r() {
        if (m2051m()) {
            xdl0.M(this.f1253c, false);
            xdl0.M(this.f1255e, true);
            this.f1258h.setMaxLines(2);
        }
        xdl0.E0(this.f1252b, new View.OnClickListener() { // from class: l.hha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12036a.m2049f(view);
            }
        });
        xdl0.E0(this.f1254d, new View.OnClickListener() { // from class: l.iha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13245a.m2050i(view);
            }
        });
    }
}
