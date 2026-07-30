package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VFrame;
import p147v.VText;
import p149l.osn;
import p149l.usn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesEntrySignIn extends VFrame {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f45755a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f45756b;

    /* JADX INFO: renamed from: c */
    public VText f45757c;

    /* JADX INFO: renamed from: d */
    public VText f45758d;

    public IntlLiveActivitiesEntrySignIn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70290p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m70290p(View view) {
        usn.m195225a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m70291s(osn osnVar, BLiveEntranceSummary bLiveEntranceSummary) {
        this.f45755a.m68500j("https://auto.tancdn.com/v1/raw/4801806a-4d91-4fa8-a2e3-375c878375a410.so", -1);
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f45757c.setText(bLiveEntranceSummary.title);
        }
        if (!TextUtils.isEmpty(bLiveEntranceSummary.description)) {
            this.f45758d.setText(bLiveEntranceSummary.description);
        }
        osnVar.m165859J3();
        osnVar.m165854D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }
}
