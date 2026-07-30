package com.p046p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.AllGroupAct;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p149l.e30;
import p149l.j760;
import p149l.l80;
import p149l.mkd0;
import p149l.nkg;
import p149l.p6j0;
import p149l.tdk;
import p149l.v4h;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupEntranceView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f39960c;

    /* JADX INFO: renamed from: d */
    public TextView f39961d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f39962e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f39963f;

    /* JADX INFO: renamed from: g */
    public tdk f39964g;

    /* JADX INFO: renamed from: h */
    public List<Group> f39965h;

    /* JADX INFO: renamed from: i */
    public l80 f39966i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a */
    public class C11194a extends l80<Group> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a$a */
        public class a extends ViewPager.C0719m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11194a.this.m148842o();
                }
            }
        }

        public C11194a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: f */
        public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) FeedGroupEntranceView.this.m61893W(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4185d(new a());
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(Group group, int i) {
            p6j0.m167671e("e_circle", FeedGroupEntranceView.this.getPageId(), new j760("circle_id", group.f56011id), new j760("circle_source", FeedGroupEntranceView.this.getCircleSource()));
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(Group group, int i, long j) {
        }
    }

    public FeedGroupEntranceView(Context context) {
        super(context);
        this.f39966i = new C11194a();
        m61889Y(context);
    }

    /* JADX INFO: renamed from: Y */
    private void m61889Y(final Context context) {
        setPadding(0, 1, 0, 0);
        addView(m61892V(LayoutInflater.from(context), this));
        xdl0.m208344M(this.f39960c, false);
        xdl0.m208329E0(this.f39961d, new View.OnClickListener() { // from class: l.u4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174598a.m61890b0(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m61890b0(Context context, View view) {
        PutongFrag putongFrag = this.f39963f;
        boolean z = false;
        if (!vwb.m200296J(this.f39965h) && this.f39965h.get(0).joined) {
            z = true;
        }
        putongFrag.startActivity(AllGroupAct.m61903V1(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCircleSource() {
        if (nkg.m159904s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m60222H().me_();
        return (NullChecker.m81303a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return nkg.m159904s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: r */
    private void m61891r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f39962e.setLayoutManager(linearLayoutManager);
        tdk tdkVar = new tdk((Act) getContext(), this.f39966i);
        this.f39964g = tdkVar;
        this.f39962e.setAdapter(tdkVar);
    }

    /* JADX INFO: renamed from: V */
    public View m61892V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v4h.m196989b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final <T extends View> T m61893W(Class<T> cls, View view) {
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
                    t = (T) m61893W(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: X */
    public void m61894X(PutongFrag putongFrag) {
        this.f39963f = putongFrag;
        putongFrag.duringCreated(FeedModule.f38855d.m209530q7("recommend", 100)).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.s4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162396a.m61895Z((List) obj);
            }
        }, new e30() { // from class: l.t4h
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167724a.m61896a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m61896a0(Throwable th) {
        m61895Z(new ArrayList());
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m61895Z(List<Group> list) {
        boolean zM200296J = vwb.m200296J(list);
        VLinear vLinear = this.f39960c;
        if (zM200296J) {
            xdl0.m208344M(vLinear, false);
            return;
        }
        xdl0.m208344M(vLinear, true);
        this.f39965h = list;
        m61891r();
        this.f39964g.m188135N(list);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39966i = new C11194a();
        m61889Y(context);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39966i = new C11194a();
        m61889Y(context);
    }
}
