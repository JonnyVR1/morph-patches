package com.p046p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import p147v.VPagerNoPage;
import p149l.aag;
import p149l.e30;
import p149l.il5;
import p149l.j760;
import p149l.kgg;
import p149l.mag;
import p149l.rk5;
import p149l.t100;
import p149l.vwb;
import p149l.x6s;
import p149l.z7g;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubEventView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FansClubEventView f49029a;

    /* JADX INFO: renamed from: b */
    public View f49030b;

    /* JADX INFO: renamed from: c */
    public FansClubTabView f49031c;

    /* JADX INFO: renamed from: d */
    public VPagerNoPage f49032d;

    /* JADX INFO: renamed from: e */
    public FansRecallSelectView f49033e;

    public FansClubEventView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m72867b(View view) {
        z7g.m217463a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m72868c() {
        this.f49033e.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m72869d(List<j760<String, View>> list, x6s x6sVar) {
        aag aagVar = new aag(list);
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.y7g
            @Override // p149l.e30
            public final void call(Object obj) {
                arrayList.add((String) ((j760) obj).f116564a);
            }
        });
        this.f49032d.setAdapter(aagVar);
        this.f49031c.m72894r(t100.m186890d(24.0f)).m72895s(new rk5()).m72897u(new il5()).m72893q(arrayList).m72882f(this.f49032d);
    }

    /* JADX INFO: renamed from: e */
    public void m72870e(mag magVar, kgg kggVar, FansBottomSelectView fansBottomSelectView) {
        this.f49031c.setPresenter(magVar);
        this.f49033e.m72859Q(magVar, kggVar, fansBottomSelectView);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72867b(this);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
