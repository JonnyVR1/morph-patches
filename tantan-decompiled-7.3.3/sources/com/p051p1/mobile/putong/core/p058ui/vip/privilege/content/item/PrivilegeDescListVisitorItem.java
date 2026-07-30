package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9212e;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.i4g0;
import p153l.jic0;
import p153l.joa;
import p153l.jyb;
import p153l.kec0;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.s7a;
import p153l.wib0;
import p153l.y20;
import p153l.z590;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListVisitorItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38572a;

    /* JADX INFO: renamed from: b */
    public VIcon f38573b;

    /* JADX INFO: renamed from: c */
    public VText f38574c;

    /* JADX INFO: renamed from: d */
    public VText f38575d;

    /* JADX INFO: renamed from: e */
    public VIcon f38576e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f38577f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f38578g;

    /* JADX INFO: renamed from: h */
    public C9165b f38579h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a */
    public static class C9164a implements h390 {

        /* JADX INFO: renamed from: a */
        public a f38580a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58491a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m58490b(a aVar) {
            this.f38580a = aVar;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 7;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b */
    public static class C9165b extends jic0<pf60<User, Integer>> {

        /* JADX INFO: renamed from: c */
        public List<pf60<User, Integer>> f38581c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Context f38582d;

        /* JADX INFO: renamed from: e */
        public a f38583e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58498a(View view);
        }

        public C9165b(Context context, a aVar) {
            this.f38582d = context;
            this.f38583e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m58494I(View view) {
            a aVar = this.f38583e;
            if (aVar != null) {
                aVar.mo58498a(view);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<pf60<User, Integer>> list = this.f38581c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38582d).inflate(kec0.f125831f9, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, pf60<User, Integer> pf60Var, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m55421d(pf60Var, i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.y590
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f197546a.m58494I(view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public pf60<User, Integer> getItem(int i) {
            return this.f38581c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m58497J(List<pf60<User, Integer>> list) {
            this.f38581c.clear();
            this.f38581c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListVisitorItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58470a(C9164a c9164a, View view) {
        if (c9164a.f38580a != null) {
            c9164a.f38580a.mo58491a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m58473d(C9164a c9164a, View view) {
        if (NullChecker.m82486a(c9164a.f38580a)) {
            c9164a.f38580a.mo58491a(view);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ pf60 m58478i(VisitorCounter visitorCounter) {
        return NullChecker.m82486a(visitorCounter) ? pf60.m172085a(Integer.valueOf(visitorCounter.totalCnt), Integer.valueOf(visitorCounter.newCnt)) : pf60.m172085a(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m58481l(View view) {
        z590.m218632a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final String m58482m(int i) {
        if (i <= 9999) {
            return String.valueOf(i);
        }
        return (i / 10000) + "万";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m58483n(pf60 pf60Var) {
        int iIntValue = ((Integer) pf60Var.f152156a).intValue();
        VText vText = this.f38575d;
        if (iIntValue == 0) {
            vText.setText("不错过每个默默关心你的人！");
        } else {
            vText.setText(String.format("%s人看过我", m58482m(iIntValue)));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C22421c m58484o(PutongFrag putongFrag, Throwable th) {
        m58488s(null);
        return putongFrag.lifecycle().filter(new qcj() { // from class: l.o590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).skip(1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58481l(this);
        setDescendantFocusability(393216);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22421c m58485p(final PutongFrag putongFrag, C22421c c22421c) {
        return c22421c.flatMap(new qcj() { // from class: l.x590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192466a.m58484o(putongFrag, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m58486q(Throwable th) {
        m58488s(null);
    }

    /* JADX INFO: renamed from: r */
    public void m58487r(final jic0<h390> jic0Var, final PutongFrag putongFrag, final C9164a c9164a, PurchaseType purchaseType) {
        if (joa.m146357G3()) {
            i4g0.m138526x("e_privilege_odiamond_visitor_more", putongFrag.pageId());
        }
        setPadding(0, 0, 0, 0);
        this.f38573b.setImageResource(dbc0.f86286Jl);
        this.f38574c.setText("我的访客");
        if (wib0.m206565i(purchaseType) && s7a.m184986o()) {
            this.f38573b.setImageResource(dbc0.f86667Vi);
            this.f38574c.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38575d.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38576e.setImageResource(dbc0.f86699Wi);
        }
        if (this.f38579h == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C9165b c9165b = new C9165b(getContext(), new C9165b.a() { // from class: l.n590
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C9165b.a
                /* JADX INFO: renamed from: a */
                public final void mo58498a(View view) {
                    PrivilegeDescListVisitorItem.m58473d(c9164a, view);
                }
            });
            this.f38579h = c9165b;
            this.f38578g.setAdapter(c9165b);
            this.f38578g.setLayoutManager(linearLayoutManager);
        }
        this.f38572a.setOnClickListener(new View.OnClickListener() { // from class: l.p590
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListVisitorItem.m58470a(c9164a, view);
            }
        });
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20406m1.m35708Q4().map(new qcj() { // from class: l.q590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return PrivilegeDescListVisitorItem.m58478i((VisitorCounter) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.r590
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161329a.m58483n((pf60) obj);
            }
        }));
        putongFrag.lifecycle().filter(new qcj() { // from class: l.s590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).flatMap(new qcj() { // from class: l.t590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                jic0 jic0Var2 = jic0Var;
                PutongFrag putongFrag2 = putongFrag;
                return jic0Var2.mo68557c(putongFrag2, C9212e.m59147d(putongFrag2.act()));
            }
        }).retryWhen(new qcj() { // from class: l.u590
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f177589a.m58485p(putongFrag, (C22421c) obj);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.v590
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182490a.m58488s((List) obj);
            }
        }, new y20() { // from class: l.w590
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187489a.m58486q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m58488s(List<pf60<User, Integer>> list) {
        if (jyb.m147479J(list) || !CoreModule.f18264c.f20410n2.m121466L3()) {
            bnl0.m105524M(this.f38577f, false);
            return;
        }
        bnl0.m105524M(this.f38577f, true);
        this.f38579h.m58497J(list.subList(0, Math.min(list.size(), 15)));
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
