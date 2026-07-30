package com.p046p1.mobile.putong.feed.newui.group.groupdetail;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import p149l.b5i;
import p149l.f5c;
import p149l.n4h;
import p149l.p6j0;
import p149l.rdk;
import p149l.tek;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupDetailAct extends PutongAct implements f5c<Group> {

    /* JADX INFO: renamed from: c */
    public FeedGroupDetailViewHolder f40050c;

    /* JADX INFO: renamed from: d */
    public n4h f40051d;

    /* JADX INFO: renamed from: e */
    public String f40052e;

    /* JADX INFO: renamed from: f */
    public String f40053f;

    /* JADX INFO: renamed from: g */
    public FeedGroupTab f40054g;

    /* JADX INFO: renamed from: h */
    public rdk f40055h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct$a */
    public static final class C11200a {

        /* JADX INFO: renamed from: a */
        public String f40056a;

        /* JADX INFO: renamed from: b */
        public String f40057b;

        /* JADX INFO: renamed from: c */
        public FeedGroupTab f40058c;

        /* JADX INFO: renamed from: d */
        public Act f40059d;

        public C11200a(Act act, String str) {
            this.f40059d = act;
            this.f40056a = str;
        }

        /* JADX INFO: renamed from: a */
        public Intent m61987a() {
            Intent intent = new Intent(this.f40059d, (Class<?>) FeedGroupDetailAct.class);
            intent.putExtra("groupId", this.f40056a);
            intent.putExtra("TopPositionMomentIdAppendInRecommend", this.f40057b);
            intent.putExtra("jumpToTabValue", this.f40058c);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C11200a m61988b() {
            m61989c(FeedGroupTab.GROUP_FRIEND);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11200a m61989c(FeedGroupTab feedGroupTab) {
            this.f40058c = feedGroupTab;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11200a m61990d(String str) {
            this.f40057b = str;
            return this;
        }
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void mo61986z0(Group group, Links links) {
        n4h n4hVar = new n4h(this.f40050c, this);
        this.f40051d = n4hVar;
        n4hVar.m157852C(new tek(group));
        this.f40051d.m157853D(new b5i(this.f40054g));
        this.f40051d.m157854E(this.f40053f);
        this.f40051d.m119316l();
    }

    /* JADX INFO: renamed from: X1 */
    public void m61984X1(FeedGroupTab feedGroupTab) {
        this.pageHelper.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("circle_detail_tab", feedGroupTab != null ? feedGroupTab.getValue() : FeedGroupTab.GROUP_RECOMMEND.getValue())));
    }

    @Override // p149l.f5c
    /* JADX INFO: renamed from: a */
    public void mo61985a(Throwable th) {
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f40050c = new FeedGroupDetailViewHolder(this);
        rdk rdkVar = new rdk(this, this.f40052e);
        this.f40055h = rdkVar;
        rdkVar.m119701a(this);
        this.f40055h.previous();
        return this.f40050c;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f40052e = getIntent().getStringExtra("groupId");
        this.f40053f = getIntent().getStringExtra("TopPositionMomentIdAppendInRecommend");
        FeedGroupTab feedGroupTab = (FeedGroupTab) getIntent().getSerializableExtra("jumpToTabValue");
        this.f40054g = feedGroupTab;
        m61984X1(feedGroupTab);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_circle_detail";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
