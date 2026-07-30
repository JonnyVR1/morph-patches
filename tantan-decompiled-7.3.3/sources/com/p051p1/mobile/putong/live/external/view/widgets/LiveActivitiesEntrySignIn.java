package com.p051p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.HashMap;
import p151v.VFrame;
import p151v.VText;
import p153l.bfu;
import p153l.fc2;
import p153l.mbs;
import p153l.msr;
import p153l.nbc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.qsr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveActivitiesEntrySignIn extends VFrame {

    /* JADX INFO: renamed from: a */
    public FrameLayout f47116a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f47117b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f47118c;

    /* JADX INFO: renamed from: d */
    public VText f47119d;

    /* JADX INFO: renamed from: e */
    public VText f47120e;

    public LiveActivitiesEntrySignIn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: u */
    public static void m72039u(String str) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        if ("p_live_nearby".equals(str) || "p_live_recommend".equals(str)) {
            map.put("source", "top_live");
        }
        bfu.m104074f(str, map);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72040p(this);
        if (mbs.m157855h()) {
            qnp0.m177261d1(this, qa00.f156322i);
            setBackgroundResource(nbc0.f141202u);
            this.f47116a.setBackground(fc2.m124971a(Color.parseColor("#EF47D2"), qa00.m175859d(10.0f), false));
            return;
        }
        this.f47116a.setBackgroundResource(nbc0.f141181n);
        ViewGroup.LayoutParams layoutParams = this.f47116a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = qa00.m175859d(42.0f);
            layoutParams.height = qa00.m175859d(42.0f);
            this.f47116a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m72040p(View view) {
        qsr.m177816a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m72041s(msr msrVar, BLiveEntranceSummary bLiveEntranceSummary) {
        this.f47117b.m69683j("https://auto.tancdn.com/v1/raw/4801806a-4d91-4fa8-a2e3-375c878375a410.so", -1);
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f47119d.setText(bLiveEntranceSummary.title);
        }
        if (!TextUtils.isEmpty(bLiveEntranceSummary.description)) {
            this.f47120e.setText(bLiveEntranceSummary.description);
        }
        m72039u(msrVar.m159916h3());
    }
}
