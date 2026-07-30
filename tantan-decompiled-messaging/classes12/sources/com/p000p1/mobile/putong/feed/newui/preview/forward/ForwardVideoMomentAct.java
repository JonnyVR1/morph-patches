package com.p000p1.mobile.putong.feed.newui.preview.forward;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.jq2;
import p007l.e1c0;
import p007l.fzi;
import p007l.nzi;
import p007l.uzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ForwardVideoMomentAct extends PutongMvpAct<fzi, nzi> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public fzi m6443V1() {
        return new fzi(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public nzi m6444X1() {
        return new nzi(this);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        act().overridePendingTransition(0, uzb0.f13996j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Moment momentM16753w7 = FeedModule.f316d.m16753w7(getIntent().getStringExtra("momentId"));
        if (momentM16753w7 == null) {
            finish();
            return;
        }
        jq2 jq2Var = ((PutongMvpAct) this).c;
        ((fzi) jq2Var).f8283b = momentM16753w7;
        ((fzi) jq2Var).f8284c = getIntent().getStringExtra("from");
    }

    public String pageId() {
        return "p_forwarding_popup";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(e1c0.f7155n0));
        setSwipeBackEnable(false);
    }
}
