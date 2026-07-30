package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.g30;
import l.lsi0;
import l.n250;
import l.vwb;
import p007l.pch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupPageView f1076a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1077b;

    /* JADX INFO: renamed from: c */
    public int f1078c;

    /* JADX INFO: renamed from: d */
    public C2032e f1079d;

    /* JADX INFO: renamed from: e */
    public C2035h f1080e;

    /* JADX INFO: renamed from: f */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f1081f;

    /* JADX INFO: renamed from: g */
    public List<MakeUpMenuView.MakeupCategory> f1082g;

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f1083h;

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1078c = 2;
        this.f1082g = new ArrayList();
        this.f1083h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m2477d(View view) {
        pch.m13026a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m2478e() {
        return getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m2479f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m2478e());
        linearLayoutManager.setOrientation(0);
        this.f1079d = new C2032e(i);
        this.f1080e = new C2035h(i);
        this.f1077b.setLayoutManager(linearLayoutManager);
        this.f1080e.m2803U(new g30() { // from class: l.nch
            /* JADX INFO: renamed from: a */
            public final void m12135a(Object obj, Object obj2, Object obj3) {
                this.f10743a.m2480g((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f1079d.m2770K(new g30() { // from class: l.och
            /* JADX INFO: renamed from: a */
            public final void m12527a(Object obj, Object obj2, Object obj3) {
                this.f11425a.m2481h((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2480g(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.a(this.f1081f)) {
            this.f1081f.a(makeupItem, num, bool);
        }
    }

    public FeedMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f1079d.m2766G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2481h(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.a(this.f1081f)) {
            this.f1081f.a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m2482i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m2490q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2483j(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f1083h.clear();
        this.f1083h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m2484k(int i) {
        C2032e c2032e = this.f1079d;
        if (c2032e != null) {
            c2032e.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2485l() {
        C2032e c2032e = this.f1079d;
        if (c2032e != null) {
            c2032e.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2486m(int i, int i2, boolean z) {
        C2032e c2032e = this.f1079d;
        if (c2032e != null) {
            c2032e.m2771L(i);
            if (i2 >= 0) {
                this.f1077b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2487n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f1077b;
        if (i == 3) {
            recyclerView.setAdapter(this.f1080e);
            this.f1080e.m2805W(m2478e(), this.f1083h);
        } else {
            recyclerView.setAdapter(this.f1079d);
            this.f1079d.m2769J(i2);
            this.f1079d.m2772M(m2478e(), this.f1083h, z);
            this.f1077b.scrollToPosition(i2);
        }
        CameraEffectMgr.m2289V().m2315X().m2817j().i(m2478e(), new n250() { // from class: l.mch
            public final void onChanged(Object obj) {
                this.f10427a.m2482i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m2488o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m2486m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m2489p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2477d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2489p(int i, int i2) {
        C2035h c2035h = this.f1080e;
        if (c2035h == null) {
            lsi0.h(R$string.f377J0);
        } else {
            c2035h.m2804V(i);
            this.f1077b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2490q(int i) {
        if (i == 0) {
            int iM2355w = CameraEffectMgr.m2289V().m2355w();
            m2488o(iM2355w, iM2355w);
            return;
        }
        if (i == 1) {
            int iM2297A = CameraEffectMgr.m2289V().m2297A();
            m2488o(iM2297A, iM2297A);
        } else if (i == 2) {
            int iM2305L = CameraEffectMgr.m2289V().m2305L();
            m2488o(iM2305L, iM2305L);
        } else {
            if (i != 3) {
                return;
            }
            int iM2307O = CameraEffectMgr.m2289V().m2307O();
            m2488o(iM2307O, iM2307O);
        }
    }

    public void setOnItemClicked(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f1081f = g30Var;
    }

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupPageView(Context context) {
        this(context, null);
    }
}
