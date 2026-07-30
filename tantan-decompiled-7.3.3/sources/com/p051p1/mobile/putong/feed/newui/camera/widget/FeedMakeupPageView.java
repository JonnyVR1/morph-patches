package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.camera.util.CameraEffectMgr;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupPageAdapter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p153l.a30;
import p153l.cb50;
import p153l.eeh;
import p153l.jyb;
import p153l.o1j0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMakeupPageView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FeedMakeupPageView f40463a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f40464b;

    /* JADX INFO: renamed from: c */
    public int f40465c;

    /* JADX INFO: renamed from: d */
    public C11351e f40466d;

    /* JADX INFO: renamed from: e */
    public C11354h f40467e;

    /* JADX INFO: renamed from: f */
    public a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> f40468f;

    /* JADX INFO: renamed from: g */
    public List<MakeUpMenuView.MakeupCategory> f40469g;

    /* JADX INFO: renamed from: h */
    public List<FeedMakeupPageAdapter.MakeupItem> f40470h;

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40465c = 2;
        this.f40469g = new ArrayList();
        this.f40470h = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public final void m62709d(View view) {
        eeh.m120542a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m62710e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m62711f(int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(m62710e());
        linearLayoutManager.setOrientation(0);
        this.f40466d = new C11351e(i);
        this.f40467e = new C11354h(i);
        this.f40464b.setLayoutManager(linearLayoutManager);
        this.f40467e.m63019U(new a30() { // from class: l.ceh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f81356a.m62712g((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
        this.f40466d.m62989K(new a30() { // from class: l.deh
            @Override // p153l.a30
            /* JADX INFO: renamed from: a */
            public final void mo37058a(Object obj, Object obj2, Object obj3) {
                this.f88030a.m62713h((FeedMakeupPageAdapter.MakeupItem) obj, (Integer) obj2, (Boolean) obj3);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m62712g(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m82486a(this.f40468f)) {
            this.f40468f.mo37058a(makeupItem, num, bool);
        }
    }

    public FeedMakeupPageAdapter.MakeupItem getCurrentItem() {
        return this.f40466d.m62985G();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m62713h(FeedMakeupPageAdapter.MakeupItem makeupItem, Integer num, Boolean bool) {
        if (NullChecker.m82486a(this.f40468f)) {
            this.f40468f.mo37058a(makeupItem, num, bool);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m62714i(Integer num) {
        Objects.toString(getTag());
        if (getTag() == num) {
            m62722q(num.intValue());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m62715j(List<FeedMakeupPageAdapter.MakeupItem> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f40470h.clear();
        this.f40470h.addAll(list);
    }

    /* JADX INFO: renamed from: k */
    public void m62716k(int i) {
        C11351e c11351e = this.f40466d;
        if (c11351e != null) {
            c11351e.notifyItemChanged(i, 0);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m62717l() {
        C11351e c11351e = this.f40466d;
        if (c11351e != null) {
            c11351e.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m62718m(int i, int i2, boolean z) {
        C11351e c11351e = this.f40466d;
        if (c11351e != null) {
            c11351e.m62990L(i);
            if (i2 >= 0) {
                this.f40464b.smoothScrollToPosition(i2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m62719n(int i, boolean z, int i2) {
        RecyclerView recyclerView = this.f40464b;
        if (i == 3) {
            recyclerView.setAdapter(this.f40467e);
            this.f40467e.m63021W(m62710e(), this.f40470h);
        } else {
            recyclerView.setAdapter(this.f40466d);
            this.f40466d.m62988J(i2);
            this.f40466d.m62991M(m62710e(), this.f40470h, z);
            this.f40464b.scrollToPosition(i2);
        }
        CameraEffectMgr.m62524V().m62550X().m63033j().m2984i(m62710e(), new cb50() { // from class: l.beh
            @Override // p153l.cb50
            public final void onChanged(Object obj) {
                this.f76376a.m62714i((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m62720o(int i, int i2) {
        int iIntValue = ((Integer) getTag()).intValue();
        if (iIntValue == 0 || iIntValue == 1 || iIntValue == 2) {
            m62718m(i, i2, true);
        } else {
            if (iIntValue != 3) {
                return;
            }
            m62721p(i, i);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62709d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m62721p(int i, int i2) {
        C11354h c11354h = this.f40467e;
        if (c11354h == null) {
            o1j0.m165634h(R$string.f39764J0);
        } else {
            c11354h.m63020V(i);
            this.f40464b.smoothScrollToPosition(i2);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m62722q(int i) {
        if (i == 0) {
            int iM62590w = CameraEffectMgr.m62524V().m62590w();
            m62720o(iM62590w, iM62590w);
            return;
        }
        if (i == 1) {
            int iM62532A = CameraEffectMgr.m62524V().m62532A();
            m62720o(iM62532A, iM62532A);
        } else if (i == 2) {
            int iM62540L = CameraEffectMgr.m62524V().m62540L();
            m62720o(iM62540L, iM62540L);
        } else {
            if (i != 3) {
                return;
            }
            int iM62542O = CameraEffectMgr.m62524V().m62542O();
            m62720o(iM62542O, iM62542O);
        }
    }

    public void setOnItemClicked(a30<FeedMakeupPageAdapter.MakeupItem, Integer, Boolean> a30Var) {
        this.f40468f = a30Var;
    }

    public FeedMakeupPageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedMakeupPageView(Context context) {
        this(context, null);
    }
}
