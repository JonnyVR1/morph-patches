package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.suggestedTab;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag;
import com.p046p1.mobile.putong.live.external.square.api.LiveSquareBannerBean;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.d1q;
import p149l.d6o;
import p149l.e30;
import p149l.ftk;
import p149l.l9s;
import p149l.mss;
import p149l.n2o;
import p149l.pzn;
import p149l.r7o;
import p149l.vwb;
import p149l.w9j;
import p149l.y6o;
import p149l.z1o;
import p149l.z6o;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareSuggestedFrag extends IntlLiveSquareFeedBaseFrag<r7o> implements C12546a.a {

    /* JADX INFO: renamed from: S */
    public y6o f45685S;

    /* JADX INFO: renamed from: R5 */
    public final void m70165R5(z6o z6oVar, List<d1q<?>> list, boolean z) {
        list.add(m70062E5(z6oVar, z));
        pzn.m172240b(list);
        this.f45628N.m67371Z(list);
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, p149l.s7m
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void mo21065i1(r7o r7oVar) {
        super.mo21065i1(r7oVar);
    }

    /* JADX INFO: renamed from: T5 */
    public void m70167T5(View view, List<d6o<?>> list) {
        if (view == null) {
            return;
        }
        z1o z1oVar = new z1o(view, this.layoutColumnNum);
        z1oVar.m110184J(2);
        list.add(z1oVar);
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag
    /* JADX INFO: renamed from: U4 */
    public void mo68931U4(@NonNull View view, @Nullable Bundle bundle) {
        super.mo68931U4(view, bundle);
        new r7o(this, new mss(m70813Z4(), this)).mo51532C(this);
    }

    /* JADX INFO: renamed from: U5 */
    public void m70168U5(View view, List<d1q<?>> list) {
        if (view == null) {
            return;
        }
        int iMax = Math.max(l9s.m149076g().mo30801ns() - 1, 0);
        int size = list.size();
        if (iMax > size - 1) {
            iMax = size;
        }
        list.add(iMax, new n2o(view, this.layoutColumnNum, act()));
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m70169V5(d1q d1qVar) {
        if (this.f45685S == null && (d1qVar instanceof y6o)) {
            this.f45685S = (y6o) d1qVar;
            this.f45628N.m67361P(d1qVar, new ftk(((r7o) this.f45629O).f158052n));
        }
    }

    /* JADX INFO: renamed from: W5 */
    public void m70170W5(z6o z6oVar, List<d1q<?>> list, Pair<View, View> pair) {
        for (int i = 0; i < z6oVar.f169071a.size(); i++) {
            list.add(this.f45626L.m152700c(z6oVar.f169071a.get(i), i));
        }
        if (NullChecker.m81303a(pair)) {
            m70168U5((View) pair.first, list);
        }
        ArrayList arrayList = new ArrayList();
        List<LiveSquareBannerBean> list2 = z6oVar.f201940c;
        if (!vwb.m200296J(list2)) {
            for (LiveSquareBannerBean liveSquareBannerBean : list2) {
                if (!vwb.m200296J(liveSquareBannerBean.tabs)) {
                    arrayList.add(this.f45626L.m152699b(liveSquareBannerBean));
                }
            }
            Collections.sort(arrayList);
        } else if (NullChecker.m81303a(pair)) {
            m70167T5((View) pair.second, arrayList);
        }
        m70173Z5(list, arrayList, 0, NullChecker.m81303a(pair) && (NullChecker.m81303a(pair.first) || NullChecker.m81303a(pair.second)));
    }

    /* JADX INFO: renamed from: X5 */
    public void m70171X5(boolean z) {
        y6o y6oVar = this.f45685S;
        if (y6oVar != null) {
            this.f45628N.m67361P(y6oVar, new ftk(z));
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public void m70172Y5(z6o z6oVar) {
        if (m70061D5() == null) {
            m70068M5(new NullPointerException("LiveSetting is Null!"));
            return;
        }
        boolean z = true;
        this.loaded = true;
        ArrayList arrayList = new ArrayList();
        m70170W5(z6oVar, arrayList, z6oVar.m217398F());
        boolean zM200337m = vwb.m200337m(arrayList, new w9j() { // from class: l.t7o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                d1q d1qVar = (d1q) obj;
                return Boolean.valueOf((d1qVar instanceof b7o) || (d1qVar instanceof n2o));
            }
        });
        boolean zM200337m2 = vwb.m200337m(arrayList, new w9j() { // from class: l.u7o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                d1q d1qVar = (d1q) obj;
                return Boolean.valueOf((d1qVar instanceof e0o) || (d1qVar instanceof z1o));
            }
        });
        boolean z2 = !vwb.m200296J(arrayList);
        if (!zM200337m && !zM200337m2) {
            z = false;
        }
        m70005t5(z2, z);
        m70165R5(z6oVar, arrayList, zM200337m);
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m70173Z5(List<d1q<?>> list, List<d6o<?>> list2, int i, boolean z) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            d6o<?> d6oVar = list2.get(i2);
            pzn.m172241c(d6oVar, d6oVar.m110183I() + i, this.layoutColumnNum, !z, list);
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
    }

    @Override // com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.feedbase.IntlLiveSquareFeedBaseFrag, com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.IntlLiveSquareBaseListFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45628N.m139006J0(new e30() { // from class: l.s7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162926a.m70169V5((d1q) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        if (this.tabInfo == null && getArguments() != null) {
            this.tabInfo = (BLiveSquareTab) getArguments().getSerializable(LiveSquareBaseFrag.ARGS_TAB_INFO);
        }
        BLiveSquareTab bLiveSquareTab = this.tabInfo;
        return (bLiveSquareTab == null || TextUtils.isEmpty(bLiveSquareTab.pageId)) ? "p_live_recommend" : this.tabInfo.pageId;
    }
}
