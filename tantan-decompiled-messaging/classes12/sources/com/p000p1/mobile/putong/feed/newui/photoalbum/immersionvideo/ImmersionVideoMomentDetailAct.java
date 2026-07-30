package com.p000p1.mobile.putong.feed.newui.photoalbum.immersionvideo;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.data.DbObject;
import l.jq2;
import p007l.dkm;
import p007l.e1c0;
import p007l.mkm;
import p007l.uzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ImmersionVideoMomentDetailAct extends PutongMvpAct<dkm, mkm> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public dkm m5828V1() {
        return new dkm(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public mkm m5829X1() {
        return new mkm(this);
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
        ((dkm) jq2Var).f6972c = momentM16753w7;
        ((dkm) jq2Var).f6979j = ((DbObject) momentM16753w7).id;
        ((dkm) jq2Var).f6980k = momentM16753w7.owner;
        ((mkm) ((PutongMvpAct) this).d).f10504t = getIntent().getStringExtra("from");
        ((mkm) ((PutongMvpAct) this).d).f10505u = getIntent().getStringExtra("commentHint");
    }

    public String pageId() {
        return "p_immersion_comment_page";
    }

    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setStatusBarColor(getResources().getColor(e1c0.f7155n0));
        setSwipeBackEnable(false);
    }
}
