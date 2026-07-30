package com.p051p1.mobile.putong.feed.newui.preview.forward;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import p153l.a2j;
import p153l.a8c0;
import p153l.i2j;
import p153l.k9c0;

/* JADX INFO: loaded from: classes13.dex */
public class ForwardVideoMomentAct extends PutongMvpAct<a2j, i2j> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public a2j mo29671X1() {
        return new a2j(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public i2j mo29672Y1() {
        return new i2j(this);
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
        ((a2j) p).f68001b = momentM145813w7;
        ((a2j) p).f68002c = getIntent().getStringExtra("from");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_forwarding_popup";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(k9c0.f124522n0));
        setSwipeBackEnable(false);
    }
}
