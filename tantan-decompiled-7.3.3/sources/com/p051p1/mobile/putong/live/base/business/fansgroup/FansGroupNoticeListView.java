package com.p051p1.mobile.putong.live.base.business.fansgroup;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.base.view.LoadMoreFooterView;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.cgg;
import p153l.l9c0;
import p153l.mbc0;
import p153l.otl;
import p153l.vec0;
import p153l.xfg;
import p153l.zzk;

/* JADX INFO: loaded from: classes13.dex */
public class FansGroupNoticeListView extends VFrame implements LoadMoreFooterView.InterfaceC12640b {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f45153a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f45154b;

    /* JADX INFO: renamed from: c */
    public VLinear f45155c;

    /* JADX INFO: renamed from: d */
    public VImage f45156d;

    /* JADX INFO: renamed from: e */
    public VText f45157e;

    /* JADX INFO: renamed from: f */
    public boolean f45158f;

    /* JADX INFO: renamed from: g */
    public BaseLiveListBean<FanbaseGroupAuditsItemBean> f45159g;

    /* JADX INFO: renamed from: h */
    public zzk f45160h;

    /* JADX INFO: renamed from: i */
    public xfg f45161i;

    /* JADX INFO: renamed from: j */
    public otl f45162j;

    /* JADX INFO: renamed from: k */
    public LoadMoreFooterView f45163k;

    /* JADX INFO: renamed from: l */
    public final RecyclerView.AbstractC0584t f45164l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.business.fansgroup.FansGroupNoticeListView$a */
    public class C11604a extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public boolean f45165a = false;

        public C11604a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (i != 0 || !this.f45165a || linearLayoutManager.findLastCompletelyVisibleItemPosition() < FansGroupNoticeListView.this.f45160h.getItemCount() - 1 || FansGroupNoticeListView.this.f45159g.getList() == null || FansGroupNoticeListView.this.f45159g.getList().size() <= 0 || !FansGroupNoticeListView.this.m68810C() || FansGroupNoticeListView.this.f45162j.isLoading()) {
                return;
            }
            FansGroupNoticeListView.this.f45163k.m69972c(FansGroupNoticeListView.this.m68810C());
            FansGroupNoticeListView.this.f45162j.mo120686f(FansGroupNoticeListView.this.f45159g.getPagination().getProcessedNext());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            this.f45165a = i2 > 0;
        }
    }

    public FansGroupNoticeListView(Context context) {
        super(context);
        this.f45164l = new C11604a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public boolean m68810C() {
        return (this.f45159g.getPagination() == null || TextUtils.isEmpty(this.f45159g.getPagination().getProcessedNext())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m68811F() {
        otl otlVar = this.f45162j;
        if (otlVar != null) {
            otlVar.mo120683a();
        }
    }

    /* JADX INFO: renamed from: L */
    private void m68812L() {
        this.f45154b.setVisibility(8);
        this.f45155c.setVisibility(0);
        this.f45156d.setImageResource(this.f45158f ? mbc0.f135668a0 : mbc0.f135686j0);
        this.f45157e.setTextColor(Color.parseColor(this.f45158f ? "#4dffffff" : "#4d323232"));
    }

    /* JADX INFO: renamed from: B */
    public final void m68819B(View view) {
        cgg.m109688a(this, view);
    }

    /* JADX INFO: renamed from: E */
    public void m68820E(boolean z, otl otlVar) {
        this.f45162j = otlVar;
        this.f45158f = z;
        this.f45153a.setColorSchemeResources(l9c0.f130600m, l9c0.f130597j, l9c0.f130598k, l9c0.f130599l);
        this.f45154b.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f45154b.addOnScrollListener(this.f45164l);
        xfg xfgVar = new xfg(z, this.f45162j);
        this.f45161i = xfgVar;
        this.f45160h = new zzk(xfgVar);
        LoadMoreFooterView loadMoreFooterView = (LoadMoreFooterView) View.inflate(getContext(), vec0.f183726H, null);
        this.f45163k = loadMoreFooterView;
        loadMoreFooterView.setIsHalf(z);
        this.f45160h.m222263F(this.f45163k);
        this.f45154b.setAdapter(this.f45160h);
        this.f45153a.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC0702j() { // from class: l.bgg
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
            /* JADX INFO: renamed from: p */
            public final void mo4096p() {
                this.f76619a.m68811F();
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public void m68821G() {
        LoadMoreFooterView loadMoreFooterView = this.f45163k;
        if (loadMoreFooterView != null) {
            loadMoreFooterView.m69974e();
        }
    }

    /* JADX INFO: renamed from: K */
    public void m68822K(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f45159g = baseLiveListBean;
        this.f45161i.m210797z(baseLiveListBean.getList());
        this.f45163k.m69975f(m68810C());
    }

    /* JADX INFO: renamed from: M */
    public void m68823M(BaseLiveListBean<FanbaseGroupAuditsItemBean> baseLiveListBean) {
        this.f45153a.setRefreshing(false);
        if (baseLiveListBean == null || baseLiveListBean.getList() == null || baseLiveListBean.getList().size() == 0) {
            m68812L();
            return;
        }
        this.f45159g = baseLiveListBean;
        this.f45161i.m210795D(baseLiveListBean.getList());
        this.f45163k.m69975f(m68810C());
    }

    /* JADX INFO: renamed from: N */
    public void m68824N(int i, String str) {
        if (this.f45161i.m210796y().get(i) != null) {
            this.f45161i.m210796y().get(i).setStatus(str);
            this.f45161i.notifyItemChanged(i);
        }
    }

    @Override // com.p051p1.mobile.putong.live.base.view.LoadMoreFooterView.InterfaceC12640b
    /* JADX INFO: renamed from: e */
    public void mo68825e() {
        otl otlVar = this.f45162j;
        if (otlVar == null || otlVar.isLoading()) {
            return;
        }
        this.f45163k.m69972c(m68810C());
        this.f45162j.mo120686f(this.f45159g.getPagination().getProcessedNext());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m68819B(this);
    }

    public FansGroupNoticeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45164l = new C11604a();
    }

    public FansGroupNoticeListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45164l = new C11604a();
    }
}
