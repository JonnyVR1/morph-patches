package com.p000p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.newui.group.allgroup.AllGroupAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.j760;
import l.mkd0;
import l.vwb;
import l.xdl0;
import p007l.l80;
import p007l.nkg;
import p007l.p6j0;
import p007l.tdk;
import p007l.v4h;
import v.VLinear;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupEntranceView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f1421c;

    /* JADX INFO: renamed from: d */
    public TextView f1422d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f1423e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f1424f;

    /* JADX INFO: renamed from: g */
    public tdk f1425g;

    /* JADX INFO: renamed from: h */
    public List<Group> f1426h;

    /* JADX INFO: renamed from: i */
    public l80 f1427i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a */
    public class C2038a extends l80<Group> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a$a */
        public class a extends ViewPager.m {
            public a() {
            }

            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C2038a.this.m11597o();
                }
            }
        }

        public C2038a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: f */
        public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) FeedGroupEntranceView.this.m2860W(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.d(new a());
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(Group group, int i) {
            p6j0.m12915e("e_circle", FeedGroupEntranceView.this.getPageId(), new j760("circle_id", ((DbObject) group).id), new j760("circle_source", FeedGroupEntranceView.this.getCircleSource()));
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(Group group, int i, long j) {
        }
    }

    public FeedGroupEntranceView(Context context) {
        super(context);
        this.f1427i = new C2038a();
        m2856Y(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    private void m2856Y(final Context context) {
        setPadding(0, 1, 0, 0);
        addView(m2859V(LayoutInflater.from(context), this));
        xdl0.M(this.f1421c, false);
        xdl0.E0(this.f1422d, new View.OnClickListener() { // from class: l.u4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13537a.m2857b0(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m2857b0(Context context, View view) {
        PutongFrag putongFrag = this.f1424f;
        boolean z = false;
        if (!vwb.J(this.f1426h) && this.f1426h.get(0).joined) {
            z = true;
        }
        putongFrag.startActivity(AllGroupAct.m2873V1(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCircleSource() {
        if (nkg.m12263s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m1140H().me_();
        return (NullChecker.a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return nkg.m12263s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m2858r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f1423e.setLayoutManager(linearLayoutManager);
        tdk tdkVar = new tdk(getContext(), this.f1427i);
        this.f1425g = tdkVar;
        this.f1423e.setAdapter(tdkVar);
    }

    /* JADX INFO: renamed from: V */
    public View m2859V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v4h.m15341b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final <T extends View> T m2860W(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        T t = null;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (cls.isInstance(childAt)) {
                    t = (T) childAt;
                } else if (childAt instanceof ViewGroup) {
                    t = (T) m2860W(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: X */
    public void m2861X(PutongFrag putongFrag) {
        this.f1424f = putongFrag;
        putongFrag.duringCreated(FeedModule.f316d.m16711q7("recommend", 100)).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.s4h
            public final void call(Object obj) {
                this.f12793a.m2862Z((List) obj);
            }
        }, new e30() { // from class: l.t4h
            public final void call(Object obj) {
                this.f13191a.m2863a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m2863a0(Throwable th) {
        m2862Z(new ArrayList());
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m2862Z(List<Group> list) {
        boolean zJ = vwb.J(list);
        VLinear vLinear = this.f1421c;
        if (zJ) {
            xdl0.M(vLinear, false);
            return;
        }
        xdl0.M(vLinear, true);
        this.f1426h = list;
        m2858r();
        this.f1425g.m14495N(list);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1427i = new C2038a();
        m2856Y(context);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1427i = new C2038a();
        m2856Y(context);
    }
}
