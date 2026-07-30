package com.p046p1.mobile.putong.core.p053ui.profile.loop;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.views.RingProgressBarView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.SetInfoProgressView;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.e3c0;
import p149l.jha0;
import p149l.mji0;
import p149l.s7m;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.loop.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8672b implements s7m<C8671a> {

    /* JADX INFO: renamed from: a */
    public VLinear f33429a;

    /* JADX INFO: renamed from: b */
    public ImageView f33430b;

    /* JADX INFO: renamed from: c */
    public SetInfoProgressView f33431c;

    /* JADX INFO: renamed from: d */
    public VText f33432d;

    /* JADX INFO: renamed from: e */
    public VFrame f33433e;

    /* JADX INFO: renamed from: f */
    public RingProgressBarView f33434f;

    /* JADX INFO: renamed from: g */
    public TextView f33435g;

    /* JADX INFO: renamed from: h */
    public TextView f33436h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f33437i;

    /* JADX INFO: renamed from: j */
    public Context f33438j;

    /* JADX INFO: renamed from: k */
    public C8671a f33439k;

    /* JADX INFO: renamed from: l */
    public String f33440l;

    public C8672b(Context context) {
        this.f33438j = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m51565f(View view) {
        this.f33439k.m51554p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m51566i(View view) {
        this.f33439k.m51556r0();
    }

    /* JADX INFO: renamed from: m */
    private boolean m51567m() {
        return CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG.equals(this.f33440l) || CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM.equals(this.f33440l);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f33438j;
    }

    /* JADX INFO: renamed from: c */
    public View m51568c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jha0.m141492b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8671a c8671a) {
        this.f33439k = c8671a;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m51570e(String str, LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType, int i) {
        if (TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_EXPLORE) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_FILTER_PURPOSE_DIALOG) || TextUtils.equals(str, CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE)) {
            xdl0.m208344M(this.f33432d, false);
        } else {
            xdl0.m208344M(this.f33432d, true);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_INTL_FILL_INFO_KIT && i <= 1) {
            xdl0.m208344M(this.f33432d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MY_TAB_OPT) {
            xdl0.m208344M(this.f33432d, false);
        }
        if (loopCreateEntryType == LoopFragmentFactory.LoopCreateEntryType.ENTRY_MOMENT_GAME) {
            this.f33430b.setImageResource(e3c0.f89141r);
            xdl0.m208344M(this.f33431c, false);
            xdl0.m208344M(this.f33432d, false);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51568c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m51571j(boolean z) {
        xdl0.m208344M(this.f33432d, z);
    }

    /* JADX INFO: renamed from: k */
    public void m51572k(int i, int i2) {
        if (!m51567m()) {
            this.f33431c.m53044d(i2, i);
            if (xdl0.m208349O0(this.f33431c) || i <= 1) {
                return;
            }
            xdl0.m208344M(this.f33431c, true);
            this.f33431c.setAlpha(0.0f);
            bt0.m103744q(this.f33431c, "alpha", 1.0f).setDuration(180L).start();
            return;
        }
        int iMo33707Jc = ura.m195053e().m195057d().mo33707Jc(act());
        this.f33434f.setProgress(iMo33707Jc);
        this.f33435g.getPaint().setFakeBoldText(true);
        this.f33435g.setText("已完成" + iMo33707Jc + "%");
        if (CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG.equals(this.f33440l) || CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM.equals(this.f33440l)) {
            this.f33436h.setText("丰富资料，符合更多人的理想型，推荐给更多合适的人");
            mji0.m154819m(this.f33436h, t100.m186890d(17.0f));
            mji0.m154819m(this.f33435g, t100.m186890d(21.0f));
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m51573l() {
        return xdl0.m208349O0(this.f33432d);
    }

    /* JADX INFO: renamed from: r */
    public void m51574r() {
        if (m51567m()) {
            xdl0.m208344M(this.f33431c, false);
            xdl0.m208344M(this.f33433e, true);
            this.f33436h.setMaxLines(2);
        }
        xdl0.m208329E0(this.f33430b, new View.OnClickListener() { // from class: l.hha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107694a.m51565f(view);
            }
        });
        xdl0.m208329E0(this.f33432d, new View.OnClickListener() { // from class: l.iha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113226a.m51566i(view);
            }
        });
    }
}
