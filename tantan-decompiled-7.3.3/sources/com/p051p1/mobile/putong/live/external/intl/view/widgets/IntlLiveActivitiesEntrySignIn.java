package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VFrame;
import p151v.VText;
import p153l.oun;
import p153l.uun;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesEntrySignIn extends VFrame {

    /* JADX INFO: renamed from: a */
    public AnimEffectPlayer f46603a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f46604b;

    /* JADX INFO: renamed from: c */
    public VText f46605c;

    /* JADX INFO: renamed from: d */
    public VText f46606d;

    public IntlLiveActivitiesEntrySignIn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71473p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m71473p(View view) {
        uun.m198211a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m71474s(oun ounVar, BLiveEntranceSummary bLiveEntranceSummary) {
        this.f46603a.m69683j("https://auto.tancdn.com/v1/raw/4801806a-4d91-4fa8-a2e3-375c878375a410.so", -1);
        if (!TextUtils.isEmpty(bLiveEntranceSummary.title)) {
            this.f46605c.setText(bLiveEntranceSummary.title);
        }
        if (!TextUtils.isEmpty(bLiveEntranceSummary.description)) {
            this.f46606d.setText(bLiveEntranceSummary.description);
        }
        ounVar.m169353J3();
        ounVar.m169348D3(BLiveUnreadTypeEnum.get("unknown_"), 0);
    }
}
