package com.p046p1.mobile.putong.feed.newui.preview.forward;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import p149l.e1c0;
import p149l.fzi;
import p149l.nzi;
import p149l.uzb0;

/* JADX INFO: loaded from: classes12.dex */
public class ForwardVideoMomentAct extends PutongMvpAct<fzi, nzi> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public fzi mo28672V1() {
        return new fzi(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public nzi mo28673X1() {
        return new nzi(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        act().overridePendingTransition(0, uzb0.f178985j);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Moment momentM209572w7 = FeedModule.f38855d.m209572w7(getIntent().getStringExtra("momentId"));
        if (momentM209572w7 == null) {
            m66873d2();
            return;
        }
        p p = this.f17172c;
        ((fzi) p).f99966b = momentM209572w7;
        ((fzi) p).f99967c = getIntent().getStringExtra("from");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_forwarding_popup";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(e1c0.f88799n0));
        setSwipeBackEnable(false);
    }
}
