package com.p051p1.mobile.putong.feed.newui.group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Group;
import com.p051p1.mobile.putong.feed.newui.group.allgroup.AllGroupAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p153l.bnl0;
import p153l.cmg;
import p153l.h80;
import p153l.jgk;
import p153l.jyb;
import p153l.k6h;
import p153l.pf60;
import p153l.psd0;
import p153l.tfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupEntranceView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VLinear f40808c;

    /* JADX INFO: renamed from: d */
    public TextView f40809d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f40810e;

    /* JADX INFO: renamed from: f */
    public PutongFrag f40811f;

    /* JADX INFO: renamed from: g */
    public jgk f40812g;

    /* JADX INFO: renamed from: h */
    public List<Group> f40813h;

    /* JADX INFO: renamed from: i */
    public h80 f40814i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a */
    public class C11357a extends h80<Group> {

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView$a$a */
        public class a extends ViewPager.C0721m {
            public a() {
            }

            @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
            public void onPageScrollStateChanged(int i) {
                super.onPageScrollStateChanged(i);
                if (i == 0) {
                    C11357a.this.m133884o();
                }
            }
        }

        public C11357a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: f */
        public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            DiscoveryPager discoveryPager = (DiscoveryPager) FeedGroupEntranceView.this.m63076W(DiscoveryPager.class, viewGroup);
            if (discoveryPager == null) {
                return;
            }
            discoveryPager.m4187d(new a());
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(Group group, int i) {
            tfj0.m190942e("e_circle", FeedGroupEntranceView.this.getPageId(), new pf60("circle_id", group.f56859id), new pf60("circle_source", FeedGroupEntranceView.this.getCircleSource()));
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(Group group, int i, long j) {
        }
    }

    public FeedGroupEntranceView(Context context) {
        super(context);
        this.f40814i = new C11357a();
        m63072Y(context);
    }

    /* JADX INFO: renamed from: Y */
    private void m63072Y(final Context context) {
        setPadding(0, 1, 0, 0);
        addView(m63075V(LayoutInflater.from(context), this));
        bnl0.m105524M(this.f40808c, false);
        bnl0.m105509E0(this.f40809d, new View.OnClickListener() { // from class: l.j6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118561a.m63073b0(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public /* synthetic */ void m63073b0(Context context, View view) {
        PutongFrag putongFrag = this.f40811f;
        boolean z = false;
        if (!jyb.m147479J(this.f40813h) && this.f40813h.get(0).joined) {
            z = true;
        }
        putongFrag.startActivity(AllGroupAct.m63086X1(context, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCircleSource() {
        if (cmg.m111233s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m61406H().me_();
        return (NullChecker.m82486a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageId() {
        return cmg.m111233s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: r */
    private void m63074r() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f40810e.setLayoutManager(linearLayoutManager);
        jgk jgkVar = new jgk((Act) getContext(), this.f40814i);
        this.f40812g = jgkVar;
        this.f40810e.setAdapter(jgkVar);
    }

    /* JADX INFO: renamed from: V */
    public View m63075V(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k6h.m148515b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final <T extends View> T m63076W(Class<T> cls, View view) {
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
                    t = (T) m63076W(cls, childAt);
                }
                if (t != null) {
                    return t;
                }
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: X */
    public void m63077X(PutongFrag putongFrag) {
        this.f40811f = putongFrag;
        putongFrag.duringCreated(FeedModule.f39703d.m145771q7("recommend", 100)).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.h6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108029a.m63078Z((List) obj);
            }
        }, new y20() { // from class: l.i6h
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113167a.m63079a0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m63079a0(Throwable th) {
        m63078Z(new ArrayList());
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void m63078Z(List<Group> list) {
        boolean zM147479J = jyb.m147479J(list);
        VLinear vLinear = this.f40808c;
        if (zM147479J) {
            bnl0.m105524M(vLinear, false);
            return;
        }
        bnl0.m105524M(vLinear, true);
        this.f40813h = list;
        m63074r();
        this.f40812g.m144786N(list);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40814i = new C11357a();
        m63072Y(context);
    }

    public FeedGroupEntranceView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40814i = new C11357a();
        m63072Y(context);
    }
}
