package com.p000p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import p002l.aag;
import p002l.il5;
import p002l.kgg;
import p002l.mag;
import p002l.rk5;
import p002l.x6s;
import p002l.z7g;
import v.VPagerNoPage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class FansClubEventView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FansClubEventView f5071a;

    /* JADX INFO: renamed from: b */
    public View f5072b;

    /* JADX INFO: renamed from: c */
    public FansClubTabView f5073c;

    /* JADX INFO: renamed from: d */
    public VPagerNoPage f5074d;

    /* JADX INFO: renamed from: e */
    public FansRecallSelectView f5075e;

    public FansClubEventView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m6386b(View view) {
        z7g.m27108a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6387c() {
        this.f5075e.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m6388d(List<j760<String, View>> list, x6s x6sVar) {
        aag aagVar = new aag(list);
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.y7g
            public final void call(Object obj) {
                arrayList.add((String) ((j760) obj).a);
            }
        });
        this.f5074d.setAdapter(aagVar);
        this.f5073c.m6413r(t100.d(24.0f)).m6414s(new rk5()).m6416u(new il5()).m6412q(arrayList).m6401f(this.f5074d);
    }

    /* JADX INFO: renamed from: e */
    public void m6389e(mag magVar, kgg kggVar, FansBottomSelectView fansBottomSelectView) {
        this.f5073c.setPresenter(magVar);
        this.f5075e.m6378Q(magVar, kggVar, fansBottomSelectView);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6386b(this);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
