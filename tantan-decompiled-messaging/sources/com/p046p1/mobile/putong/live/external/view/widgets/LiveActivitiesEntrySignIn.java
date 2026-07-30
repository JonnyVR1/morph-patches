package com.p046p1.mobile.putong.live.external.view.widgets;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import java.util.HashMap;
import p147v.VFrame;
import p147v.VText;
import p149l.adu;
import p149l.h3c0;
import p149l.l9s;
import p149l.lqr;
import p149l.mep0;
import p149l.pqr;
import p149l.t100;
import p149l.yb2;

/* JADX INFO: loaded from: classes13.dex */
public class LiveActivitiesEntrySignIn extends VFrame {

    /* JADX INFO: renamed from: a */
    public FrameLayout f46268a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f46269b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f46270c;

    /* JADX INFO: renamed from: d */
    public VText f46271d;

    /* JADX INFO: renamed from: e */
    public VText f46272e;

    public LiveActivitiesEntrySignIn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: u */
    public static void m70856u(String str) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        if ("p_live_nearby".equals(str) || "p_live_recommend".equals(str)) {
            map.put("source", "top_live");
        }
        adu.m96010f(str, map);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70857p(this);
        if (l9s.m149078h()) {
            mep0.m154302d1(this, t100.f167260i);
            setBackgroundResource(h3c0.f105711u);
            this.f46268a.setBackground(yb2.m213876a(Color.parseColor("#EF47D2"), t100.m186890d(10.0f), false));
            return;
        }
        this.f46268a.setBackgroundResource(h3c0.f105690n);
        ViewGroup.LayoutParams layoutParams = this.f46268a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = t100.m186890d(42.0f);
            layoutParams.height = t100.m186890d(42.0f);
            this.f46268a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m70857p(View view) {
        pqr.m170935a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m70858s(lqr lqrVar, BLiveEntranceSummary bLiveEntranceSummary) {
        this.f46269b.m68500j("https://auto.tancdn.com/v1/raw/4801806a-4d91-4fa8-a2e3-375c878375a410.so", -1);
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f46271d.setText(bLiveEntranceSummary.title);
        }
        if (!TextUtils.isEmpty(bLiveEntranceSummary.description)) {
            this.f46272e.setText(bLiveEntranceSummary.description);
        }
        m70856u(lqrVar.m151074h3());
    }
}
