package com.p000p1.mobile.putong.feed.newui.group.groupdetail;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import p007l.b5i;
import p007l.f5c;
import p007l.n4h;
import p007l.p6j0;
import p007l.rdk;
import p007l.tek;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupDetailAct extends PutongAct implements f5c<Group> {

    /* JADX INFO: renamed from: c */
    public FeedGroupDetailViewHolder f1511c;

    /* JADX INFO: renamed from: d */
    public n4h f1512d;

    /* JADX INFO: renamed from: e */
    public String f1513e;

    /* JADX INFO: renamed from: f */
    public String f1514f;

    /* JADX INFO: renamed from: g */
    public FeedGroupTab f1515g;

    /* JADX INFO: renamed from: h */
    public rdk f1516h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct$a */
    public static final class C2044a {

        /* JADX INFO: renamed from: a */
        public String f1517a;

        /* JADX INFO: renamed from: b */
        public String f1518b;

        /* JADX INFO: renamed from: c */
        public FeedGroupTab f1519c;

        /* JADX INFO: renamed from: d */
        public Act f1520d;

        public C2044a(Act act, String str) {
            this.f1520d = act;
            this.f1517a = str;
        }

        /* JADX INFO: renamed from: a */
        public Intent m2961a() {
            Intent intent = new Intent((Context) this.f1520d, (Class<?>) FeedGroupDetailAct.class);
            intent.putExtra("groupId", this.f1517a);
            intent.putExtra("TopPositionMomentIdAppendInRecommend", this.f1518b);
            intent.putExtra("jumpToTabValue", this.f1519c);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C2044a m2962b() {
            m2963c(FeedGroupTab.GROUP_FRIEND);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C2044a m2963c(FeedGroupTab feedGroupTab) {
            this.f1519c = feedGroupTab;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C2044a m2964d(String str) {
            this.f1518b = str;
            return this;
        }
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void mo2960z0(Group group, Links links) {
        n4h n4hVar = new n4h(this.f1511c, this);
        this.f1512d = n4hVar;
        n4hVar.m12082C(new tek(group));
        this.f1512d.m12083D(new b5i(this.f1515g));
        this.f1512d.m12084E(this.f1514f);
        this.f1512d.m10046l();
    }

    /* JADX INFO: renamed from: X1 */
    public void m2958X1(FeedGroupTab feedGroupTab) {
        ((PutongAct) this).pageHelper.o(p6j0.m12911a(p6j0.C2456a.m12922g("circle_detail_tab", feedGroupTab != null ? feedGroupTab.getValue() : FeedGroupTab.GROUP_RECOMMEND.getValue())));
    }

    @Override // p007l.f5c
    /* JADX INFO: renamed from: a */
    public void mo2959a(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f1511c = new FeedGroupDetailViewHolder(this);
        rdk rdkVar = new rdk(this, this.f1513e);
        this.f1516h = rdkVar;
        rdkVar.m10069a(this);
        this.f1516h.previous();
        return this.f1511c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1513e = getIntent().getStringExtra("groupId");
        this.f1514f = getIntent().getStringExtra("TopPositionMomentIdAppendInRecommend");
        FeedGroupTab feedGroupTab = (FeedGroupTab) getIntent().getSerializableExtra("jumpToTabValue");
        this.f1515g = feedGroupTab;
        m2958X1(feedGroupTab);
    }

    public String pageId() {
        return "p_circle_detail";
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
