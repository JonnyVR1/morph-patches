package com.p051p1.mobile.putong.feed.newui.photoalbum.immersionvideo;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import p153l.a8c0;
import p153l.fmm;
import p153l.k9c0;
import p153l.omm;

/* JADX INFO: loaded from: classes13.dex */
public class ImmersionVideoMomentDetailAct extends PutongMvpAct<fmm, omm> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public fmm mo29671X1() {
        return new fmm(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public omm mo29672Y1() {
        return new omm(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        act().overridePendingTransition(0, a8c0.f68910j);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        Moment momentM145813w7 = FeedModule.f39703d.m145813w7(getIntent().getStringExtra("momentId"));
        if (momentM145813w7 == null) {
            m68056e2();
            return;
        }
        p p = this.f17891c;
        ((fmm) p).f99799c = momentM145813w7;
        ((fmm) p).f99806j = momentM145813w7.f56859id;
        ((fmm) p).f99807k = momentM145813w7.owner;
        ((omm) this.f17892d).f147972t = getIntent().getStringExtra("from");
        ((omm) this.f17892d).f147973u = getIntent().getStringExtra("commentHint");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_immersion_comment_page";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(k9c0.f124522n0));
        setSwipeBackEnable(false);
    }
}
