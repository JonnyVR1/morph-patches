package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p149l.g30;
import p149l.lsi0;
import p149l.n250;
import p149l.pch;
import p149l.vwb;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupPageView f39615a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f39616b;

    /* JADX INFO: renamed from: c */
    public int f39617c;

    /* JADX INFO: renamed from: d */
    public C11188e f39618d;

    /* JADX INFO: renamed from: e */
    public C11191h f39619e;

    /* JADX INFO: renamed from: f */
    public g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f39620f;

    /* JADX INFO: renamed from: g */
    public List<MakeUpMenuView.MakeupCategory> f39621g;

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f39622h;

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39617c = 2;
        this.f39621g = new ArrayList();
        this.f39622h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m61525d(View view) {
        pch.m168341a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m61526e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m61527f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m61526e());
        linearLayoutManager.setOrientation(0);
        this.f39618d = new C11188e(i);
        this.f39619e = new C11191h(i);
        this.f39616b.setLayoutManager(linearLayoutManager);
        this.f39619e.m61836U(new g30() { // from class: l.nch
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f138169a.m61528g((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f39618d.m61806K(new g30() { // from class: l.och
            @Override // p149l.g30
            /* JADX INFO: renamed from: a */
            public final void mo36055a(Object obj, Object obj2, Object obj3) {
                this.f143040a.m61529h((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m61528g(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m81303a(this.f39620f)) {
            this.f39620f.mo36055a(makeupItem, num, bool);
        }
    }

    public FeedMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f39618d.m61802G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m61529h(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m81303a(this.f39620f)) {
            this.f39620f.mo36055a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m61530i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m61538q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m61531j(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f39622h.clear();
        this.f39622h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m61532k(int i) {
        C11188e c11188e = this.f39618d;
        if (c11188e != null) {
            c11188e.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m61533l() {
        C11188e c11188e = this.f39618d;
        if (c11188e != null) {
            c11188e.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m61534m(int i, int i2, boolean z) {
        C11188e c11188e = this.f39618d;
        if (c11188e != null) {
            c11188e.m61807L(i);
            if (i2 >= 0) {
                this.f39616b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m61535n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f39616b;
        if (i == 3) {
            recyclerView.setAdapter(this.f39619e);
            this.f39619e.m61838W(m61526e(), this.f39622h);
        } else {
            recyclerView.setAdapter(this.f39618d);
            this.f39618d.m61805J(i2);
            this.f39618d.m61808M(m61526e(), this.f39622h, z);
            this.f39616b.scrollToPosition(i2);
        }
        CameraEffectMgr.m61340V().m61366X().m61850j().m2983i(m61526e(), new n250() { // from class: l.mch
            @Override // p149l.n250
            public final void onChanged(Object obj) {
                this.f133132a.m61530i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m61536o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m61534m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m61537p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61525d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m61537p(int i, int i2) {
        C11191h c11191h = this.f39619e;
        if (c11191h == null) {
            lsi0.m151578h(R$string.f38916J0);
        } else {
            c11191h.m61837V(i);
            this.f39616b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m61538q(int i) {
        if (i == 0) {
            int iM61406w = CameraEffectMgr.m61340V().m61406w();
            m61536o(iM61406w, iM61406w);
            return;
        }
        if (i == 1) {
            int iM61348A = CameraEffectMgr.m61340V().m61348A();
            m61536o(iM61348A, iM61348A);
        } else if (i == 2) {
            int iM61356L = CameraEffectMgr.m61340V().m61356L();
            m61536o(iM61356L, iM61356L);
        } else {
            if (i != 3) {
                return;
            }
            int iM61358O = CameraEffectMgr.m61340V().m61358O();
            m61536o(iM61358O, iM61358O);
        }
    }

    public void setOnItemClicked(g30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> g30Var) {
        this.f39620f = g30Var;
    }

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupPageView(Context context) {
        this(context, null);
    }
}
