package com.p046p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.base.view.LoadMoreFooterView;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.brl;
import p149l.f1c0;
import p149l.g3c0;
import p149l.jeg;
import p149l.jxk;
import p149l.oeg;
import p149l.q6c0;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupNoticeListView extends VFrame implements LoadMoreFooterView.InterfaceC12477b {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f44305a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f44306b;

    /* JADX INFO: renamed from: c */
    public VLinear f44307c;

    /* JADX INFO: renamed from: d */
    public VImage f44308d;

    /* JADX INFO: renamed from: e */
    public VText f44309e;

    /* JADX INFO: renamed from: f */
    public boolean f44310f;

    /* JADX INFO: renamed from: g */
    public BaseLiveListBean<FanbaseGroupAuditsItemBean> f44311g;

    /* JADX INFO: renamed from: h */
    public jxk f44312h;

    /* JADX INFO: renamed from: i */
    public jeg f44313i;

    /* JADX INFO: renamed from: j */
    public brl f44314j;

    /* JADX INFO: renamed from: k */
    public LoadMoreFooterView f44315k;

    /* JADX INFO: renamed from: l */
    public final RecyclerView.AbstractC0582t f44316l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView$a */
    public class C11441a extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public boolean f44317a = false;

        public C11441a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i != 0 || !this.f44317a || linearLayoutManager.findLastCompletelyVisibleItemPosition() < FansGroupNoticeListView.this.f44312h.getItemCount() - 1 || FansGroupNoticeListView.this.f44311g.getList() == null || FansGroupNoticeListView.this.f44311g.getList().size() <= 0 || !FansGroupNoticeListView.this.m67627C() || FansGroupNoticeListView.this.f44314j.isLoading()) {
                return;
            }
            FansGroupNoticeListView.this.f44315k.m68789c(FansGroupNoticeListView.this.m67627C());
            FansGroupNoticeListView.this.f44314j.mo103556f(FansGroupNoticeListView.this.f44311g.getPagination().getProcessedNext());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f44317a = i2 > 0;
        }
    }

    public FansGroupNoticeListView(Context context) {
        super(context);
        this.f44316l = new C11441a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public boolean m67627C() {
        return (this.f44311g.getPagination() == null || TextUtils.isEmpty(this.f44311g.getPagination().getProcessedNext())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m67628F() {
        brl brlVar = this.f44314j;
        if (brlVar != null) {
            brlVar.mo103553a();
        }
    }

    /* JADX INFO: renamed from: L */
    private void m67629L() {
        this.f44306b.setVisibility(8);
        this.f44307c.setVisibility(0);
        this.f44308d.setImageResource(this.f44310f ? g3c0.f100406a0 : g3c0.f100424j0);
        this.f44309e.setTextColor(Color.parseColor(this.f44310f ? "#4dffffff" : "#4d323232"));
    }

    /* JADX INFO: renamed from: B */
    public final void m67636B(View view) {
        oeg.m163953a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public void m67637E(boolean z, brl brlVar) {
        this.f44314j = brlVar;
        this.f44310f = z;
        this.f44305a.setColorSchemeResources(f1c0.f94076m, f1c0.f94073j, f1c0.f94074k, f1c0.f94075l);
        this.f44306b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f44306b.addOnScrollListener(this.f44316l);
        jeg jegVar = new jeg(z, this.f44314j);
        this.f44313i = jegVar;
        this.f44312h = new jxk(jegVar);
        LoadMoreFooterView loadMoreFooterView = (LoadMoreFooterView) View.inflate(getContext(), q6c0.f152869H, null);
        this.f44315k = loadMoreFooterView;
        loadMoreFooterView.setIsHalf(z);
        this.f44312h.m143813F(this.f44315k);
        this.f44306b.setAdapter(this.f44312h);
        this.f44305a.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0700j() { // from class: l.neg
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
            /* JADX INFO: renamed from: q */
            public final void mo4094q() {
                this.f138608a.m67628F();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m67638G() {
        LoadMoreFooterView loadMoreFooterView = this.f44315k;
        if (loadMoreFooterView != null) {
            loadMoreFooterView.m68791e();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m67639K(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f44311g = baseLiveListBean;
        this.f44313i.m141131z(baseLiveListBean.getList());
        this.f44315k.m68792f(m67627C());
    }

    /* JADX INFO: renamed from: M */
    public void m67640M(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f44305a.setRefreshing(false);
        if (baseLiveListBean == null || baseLiveListBean.getList() == null || baseLiveListBean.getList().size() == 0) {
            m67629L();
            return;
        }
        this.f44311g = baseLiveListBean;
        this.f44313i.m141129D(baseLiveListBean.getList());
        this.f44315k.m68792f(m67627C());
    }

    /* JADX INFO: renamed from: N */
    public void m67641N(int i, String str) {
        if (this.f44313i.m141130y().get(i) != null) {
            this.f44313i.m141130y().get(i).setStatus(str);
            this.f44313i.notifyItemChanged(i);
        }
    }

    @Override // com.p046p1.mobile.putong.live.base.view.LoadMoreFooterView.InterfaceC12477b
    /* JADX INFO: renamed from: e */
    public void mo67642e() {
        brl brlVar = this.f44314j;
        if (brlVar == null || brlVar.isLoading()) {
            return;
        }
        this.f44315k.m68789c(m67627C());
        this.f44314j.mo103556f(this.f44311g.getPagination().getProcessedNext());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m67636B(this);
    }

    public FansGroupNoticeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44316l = new C11441a();
    }

    public FansGroupNoticeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44316l = new C11441a();
    }
}
