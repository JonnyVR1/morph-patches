package com.p046p1.mobile.putong.feed.newui.photoalbum.immersionvideo;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import p149l.dkm;
import p149l.e1c0;
import p149l.mkm;
import p149l.uzb0;

/* JADX INFO: loaded from: classes12.dex */
public class ImmersionVideoMomentDetailAct extends PutongMvpAct<dkm, mkm> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public dkm mo28672V1() {
        return new dkm(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mkm mo28673X1() {
        return new mkm(this);
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
        ((dkm) p).f86670c = momentM209572w7;
        ((dkm) p).f86677j = momentM209572w7.f56011id;
        ((dkm) p).f86678k = momentM209572w7.owner;
        ((mkm) this.f17173d).f134355t = getIntent().getStringExtra("from");
        ((mkm) this.f17173d).f134356u = getIntent().getStringExtra("commentHint");
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_immersion_comment_page";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(e1c0.f88799n0));
        setSwipeBackEnable(false);
    }
}
