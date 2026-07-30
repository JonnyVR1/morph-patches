package com.p051p1.mobile.putong.core.p058ui.profile.loop;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.views.RingProgressBarView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.SetInfoProgressView;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.gta;
import p153l.iam;
import p153l.kbc0;
import p153l.msi0;
import p153l.npa0;
import p153l.qa00;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8835b implements iam<C8834a> {

    /* JADX INFO: renamed from: a */
    public VLinear f34277a;

    /* JADX INFO: renamed from: b */
    public ImageView f34278b;

    /* JADX INFO: renamed from: c */
    public SetInfoProgressView f34279c;

    /* JADX INFO: renamed from: d */
    public VText f34280d;

    /* JADX INFO: renamed from: e */
    public VFrame f34281e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f34282f;

    /* JADX INFO: renamed from: g */
    public TextView f34283g;

    /* JADX INFO: renamed from: h */
    public TextView f34284h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f34285i;

    /* JADX INFO: renamed from: j */
    public Context f34286j;

    /* JADX INFO: renamed from: k */
    public C8834a f34287k;

    /* JADX INFO: renamed from: l */
    public String f34288l;

    public C8835b(Context context) {
        this.f34286j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m52748f(View view) {
        this.f34287k.m52737p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m52749i(View view) {
        this.f34287k.m52739r0();
    }

    /* JADX INFO: renamed from: m */
    private boolean m52750m() {
        return CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG.equals(this.f34288l) || CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM.equals(this.f34288l);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f34286j;
    }

    /* JADX INFO: renamed from: c */
    public View m52751c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return npa0.m164218b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8834a c8834a) {
        this.f34287k = c8834a;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m52753e(String str, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, int i) {
        if (TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_EXPLORE) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE)) {
            bnl0.m105524M(this.f34280d, false);
        } else {
            bnl0.m105524M(this.f34280d, true);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT && i <= 1) {
            bnl0.m105524M(this.f34280d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            bnl0.m105524M(this.f34280d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME) {
            this.f34278b.setImageResource(kbc0.f124904r);
            bnl0.m105524M(this.f34279c, false);
            bnl0.m105524M(this.f34280d, false);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52751c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m52754j(boolean z) {
        bnl0.m105524M(this.f34280d, z);
    }

    /* JADX INFO: renamed from: k */
    public void m52755k(int i, int i2) {
        if (!m52750m()) {
            this.f34279c.m54227d(i2, i);
            if (bnl0.m105529O0(this.f34279c) || i <= 1) {
                return;
            }
            bnl0.m105524M(this.f34279c, true);
            this.f34279c.setAlpha(0.0f);
            gt0.m132171q(this.f34279c, "alpha", 1.0f).setDuration(180L).start();
            return;
        }
        int iMo34710Jc = gta.m132210e().m132214d().mo34710Jc(act());
        this.f34282f.setProgress(iMo34710Jc);
        this.f34283g.getPaint().setFakeBoldText(true);
        this.f34283g.setText("已完成" + iMo34710Jc + "%");
        if (CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG.equals(this.f34288l) || CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM.equals(this.f34288l)) {
            this.f34284h.setText("丰富资料，符合更多人的理想型，推荐给更多合适的人");
            msi0.m159815m(this.f34284h, qa00.m175859d(17.0f));
            msi0.m159815m(this.f34283g, qa00.m175859d(21.0f));
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m52756l() {
        return bnl0.m105529O0(this.f34280d);
    }

    /* JADX INFO: renamed from: r */
    public void m52757r() {
        if (m52750m()) {
            bnl0.m105524M(this.f34279c, false);
            bnl0.m105524M(this.f34281e, true);
            this.f34284h.setMaxLines(2);
        }
        bnl0.m105509E0(this.f34278b, new View.OnClickListener() { // from class: l.lpa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133031a.m52748f(view);
            }
        });
        bnl0.m105509E0(this.f34280d, new View.OnClickListener() { // from class: l.mpa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137897a.m52749i(view);
            }
        });
    }
}
