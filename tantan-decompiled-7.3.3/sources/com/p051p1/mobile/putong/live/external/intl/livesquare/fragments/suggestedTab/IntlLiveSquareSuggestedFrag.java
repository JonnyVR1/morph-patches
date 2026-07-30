package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p051p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.d3q;
import p153l.d8o;
import p153l.jyb;
import p153l.mbs;
import p153l.n4o;
import p153l.nus;
import p153l.p1o;
import p153l.qcj;
import p153l.r9o;
import p153l.vvk;
import p153l.y20;
import p153l.y8o;
import p153l.z3o;
import p153l.z8o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareSuggestedFrag extends IntlLiveSquareFeedBaseFrag<r9o> implements C12709a.a {

    /* JADX INFO: renamed from: S */
    public y8o f46533S;

    /* JADX INFO: renamed from: R5 */
    public final void m71348R5(z8o z8oVar, List<d3q<?>> list, boolean z) {
        list.add(m71245E5(z8oVar, z));
        p1o.m170251b(list);
        this.f46476N.m68554Z(list);
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, p153l.iam
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void mo22064i1(r9o r9oVar) {
        super.mo22064i1(r9oVar);
    }

    /* JADX INFO: renamed from: T5 */
    public void m71350T5(View view, List<d8o<?>> list) {
        if (view == null) {
            return;
        }
        z3o z3oVar = new z3o(view, this.layoutColumnNum);
        z3oVar.m114919J(2);
        list.add(z3oVar);
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo70114U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo70114U4(view, bundle);
        new r9o(this, new nus(m71996Z4(), this)).mo52715C(this);
    }

    /* JADX INFO: renamed from: U5 */
    public void m71351U5(View view, List<d3q<?>> list) {
        if (view == null) {
            return;
        }
        int iMax = Math.max(mbs.m157853g().mo31804ns() - 1, 0);
        int size = list.size();
        if (iMax > size - 1) {
            iMax = size;
        }
        list.add(iMax, new n4o(view, this.layoutColumnNum, act()));
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m71352V5(d3q d3qVar) {
        if (this.f46533S == null && (d3qVar instanceof y8o)) {
            this.f46533S = (y8o) d3qVar;
            this.f46476N.m68544P(d3qVar, new vvk(((r9o) this.f46477O).f161841n));
        }
    }

    /* JADX INFO: renamed from: W5 */
    public void m71353W5(z8o z8oVar, List<d3q<?>> list, Pair<View, View> pair) {
        for (int i = 0; i < z8oVar.f178357a.size(); i++) {
            list.add(this.f46474L.m157047c(z8oVar.f178357a.get(i), i));
        }
        if (NullChecker.m82486a(pair)) {
            m71351U5((View) pair.first, list);
        }
        ArrayList arrayList = new ArrayList();
        List<LiveSquareBannerBean> list2 = z8oVar.f203405c;
        if (!jyb.m147479J(list2)) {
            for (LiveSquareBannerBean liveSquareBannerBean : list2) {
                if (!jyb.m147479J(liveSquareBannerBean.tabs)) {
                    arrayList.add(this.f46474L.m157046b(liveSquareBannerBean));
                }
            }
            Collections.sort(arrayList);
        } else if (NullChecker.m82486a(pair)) {
            m71350T5((View) pair.second, arrayList);
        }
        m71356Z5(list, arrayList, 0, NullChecker.m82486a(pair) && (NullChecker.m82486a(pair.first) || NullChecker.m82486a(pair.second)));
    }

    /* JADX INFO: renamed from: X5 */
    public void m71354X5(boolean z) {
        y8o y8oVar = this.f46533S;
        if (y8oVar != null) {
            this.f46476N.m68544P(y8oVar, new vvk(z));
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m71355Y5(z8o z8oVar) {
        if (m71244D5() == null) {
            m71251M5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        boolean z = true;
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        m71353W5(z8oVar, arrayList, z8oVar.m219012F());
        boolean zM147520m = jyb.m147520m(arrayList, new qcj() { // from class: l.t9o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                d3q d3qVar = (d3q) obj;
                return Boolean.valueOf((d3qVar instanceof b9o) || (d3qVar instanceof n4o));
            }
        });
        boolean zM147520m2 = jyb.m147520m(arrayList, new qcj() { // from class: l.u9o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                d3q d3qVar = (d3q) obj;
                return Boolean.valueOf((d3qVar instanceof e2o) || (d3qVar instanceof z3o));
            }
        });
        boolean z2 = !jyb.m147479J(arrayList);
        if (!zM147520m && !zM147520m2) {
            z = false;
        }
        m71188t5(z2, z);
        m71348R5(z8oVar, arrayList, zM147520m);
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m71356Z5(List<d3q<?>> list, List<d8o<?>> list2, int i, boolean z) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            d8o<?> d8oVar = list2.get(i2);
            p1o.m170252c(d8oVar, d8oVar.m114918I() + i, this.layoutColumnNum, !z, list);
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
    }

    @Override // com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46476N.m143024J0(new y20() { // from class: l.s9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166961a.m71352V5((d3q) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        if (this.tabInfo == null && getArguments() != null) {
            this.tabInfo = (BLiveSquareTab) getArguments().getSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        return (bLiveSquareTab == null || TextUtils.isEmpty(bLiveSquareTab.pageId)) ? "p_live_recommend" : this.tabInfo.pageId;
    }
}
