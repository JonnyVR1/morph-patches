package com.p051p1.mobile.putong.live.livingroom.common.fansclub.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansBottomSelectView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.submodule.recall.FansRecallSelectView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.view.tab.FansClubTabView;
import java.util.ArrayList;
import java.util.List;
import p151v.VPagerNoPage;
import p153l.acg;
import p153l.jyb;
import p153l.lm5;
import p153l.n9g;
import p153l.obg;
import p153l.pf60;
import p153l.qa00;
import p153l.sl5;
import p153l.y20;
import p153l.y8s;
import p153l.yhg;

/* JADX INFO: loaded from: classes4.dex */
public class FansClubEventView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FansClubEventView f49877a;

    /* JADX INFO: renamed from: b */
    public View f49878b;

    /* JADX INFO: renamed from: c */
    public FansClubTabView f49879c;

    /* JADX INFO: renamed from: d */
    public VPagerNoPage f49880d;

    /* JADX INFO: renamed from: e */
    public FansRecallSelectView f49881e;

    public FansClubEventView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m74050b(View view) {
        n9g.m161977a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m74051c() {
        this.f49881e.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public void m74052d(List<pf60<String, View>> list, y8s y8sVar) {
        obg obgVar = new obg(list);
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.m9g
            @Override // p153l.y20
            public final void call(Object obj) {
                arrayList.add((String) ((pf60) obj).f152156a);
            }
        });
        this.f49880d.setAdapter(obgVar);
        this.f49879c.m74077r(qa00.m175859d(24.0f)).m74078s(new sl5()).m74080u(new lm5()).m74076q(arrayList).m74065f(this.f49880d);
    }

    /* JADX INFO: renamed from: e */
    public void m74053e(acg acgVar, yhg yhgVar, FansBottomSelectView fansBottomSelectView) {
        this.f49879c.setPresenter(acgVar);
        this.f49881e.m74042Q(acgVar, yhgVar, fansBottomSelectView);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74050b(this);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FansClubEventView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
