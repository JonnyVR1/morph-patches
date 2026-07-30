package com.p051p1.mobile.putong.feed.newui.group.groupdetail;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.actRender.FeedGroupDetailViewHolder;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.FeedGroupTab;
import p153l.c6h;
import p153l.hgk;
import p153l.jhk;
import p153l.l6c;
import p153l.q6i;
import p153l.tfj0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupDetailAct extends PutongAct implements l6c<Group> {

    /* JADX INFO: renamed from: c */
    public FeedGroupDetailViewHolder f40898c;

    /* JADX INFO: renamed from: d */
    public c6h f40899d;

    /* JADX INFO: renamed from: e */
    public String f40900e;

    /* JADX INFO: renamed from: f */
    public String f40901f;

    /* JADX INFO: renamed from: g */
    public FeedGroupTab f40902g;

    /* JADX INFO: renamed from: h */
    public hgk f40903h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct$a */
    public static final class C11363a {

        /* JADX INFO: renamed from: a */
        public String f40904a;

        /* JADX INFO: renamed from: b */
        public String f40905b;

        /* JADX INFO: renamed from: c */
        public FeedGroupTab f40906c;

        /* JADX INFO: renamed from: d */
        public Act f40907d;

        public C11363a(Act act, String str) {
            this.f40907d = act;
            this.f40904a = str;
        }

        /* JADX INFO: renamed from: a */
        public Intent m63170a() {
            Intent intent = new Intent(this.f40907d, (Class<?>) FeedGroupDetailAct.class);
            intent.putExtra("groupId", this.f40904a);
            intent.putExtra("TopPositionMomentIdAppendInRecommend", this.f40905b);
            intent.putExtra("jumpToTabValue", this.f40906c);
            return intent;
        }

        /* JADX INFO: renamed from: b */
        public C11363a m63171b() {
            m63172c(FeedGroupTab.GROUP_FRIEND);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C11363a m63172c(FeedGroupTab feedGroupTab) {
            this.f40906c = feedGroupTab;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C11363a m63173d(String str) {
            this.f40905b = str;
            return this;
        }
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public void mo63169z0(Group group, Links links) {
        c6h c6hVar = new c6h(this.f40898c, this);
        this.f40899d = c6hVar;
        c6hVar.m108150C(new jhk(group));
        this.f40899d.m108151D(new q6i(this.f40902g));
        this.f40899d.m108152E(this.f40901f);
        this.f40899d.m194587l();
    }

    /* JADX INFO: renamed from: Y1 */
    public void m63167Y1(FeedGroupTab feedGroupTab) {
        this.pageHelper.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("circle_detail_tab", feedGroupTab != null ? feedGroupTab.getValue() : FeedGroupTab.GROUP_RECOMMEND.getValue())));
    }

    @Override // p153l.l6c
    /* JADX INFO: renamed from: a */
    public void mo63168a(Throwable th) {
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f40898c = new FeedGroupDetailViewHolder(this);
        hgk hgkVar = new hgk(this, this.f40900e);
        this.f40903h = hgkVar;
        hgkVar.m96352a(this);
        this.f40903h.previous();
        return this.f40898c;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f40900e = getIntent().getStringExtra("groupId");
        this.f40901f = getIntent().getStringExtra("TopPositionMomentIdAppendInRecommend");
        FeedGroupTab feedGroupTab = (FeedGroupTab) getIntent().getSerializableExtra("jumpToTabValue");
        this.f40902g = feedGroupTab;
        m63167Y1(feedGroupTab);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_circle_detail";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
