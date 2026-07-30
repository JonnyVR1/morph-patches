package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p046p1.mobile.putong.core.p053ui.visitor.C9049e;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VIcon;
import p147v.VText;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.f6c0;
import p149l.g6a;
import p149l.j760;
import p149l.mkd0;
import p149l.o7r;
import p149l.sab0;
import p149l.vwb;
import p149l.vx80;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListVisitorItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37724a;

    /* JADX INFO: renamed from: b */
    public VIcon f37725b;

    /* JADX INFO: renamed from: c */
    public VText f37726c;

    /* JADX INFO: renamed from: d */
    public VText f37727d;

    /* JADX INFO: renamed from: e */
    public VIcon f37728e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f37729f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f37730g;

    /* JADX INFO: renamed from: h */
    public C9002b f37731h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a */
    public static class C9001a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f37732a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57308a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m57307b(a aVar) {
            this.f37732a = aVar;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 7;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b */
    public static class C9002b extends dac0<j760<User, Integer>> {

        /* JADX INFO: renamed from: c */
        public List<j760<User, Integer>> f37733c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Context f37734d;

        /* JADX INFO: renamed from: e */
        public a f37735e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57315a(View view);
        }

        public C9002b(Context context, a aVar) {
            this.f37734d = context;
            this.f37735e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m57311I(View view) {
            a aVar = this.f37735e;
            if (aVar != null) {
                aVar.mo57315a(view);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<j760<User, Integer>> list = this.f37733c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f37734d).inflate(f6c0.f95659Y8, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, j760<User, Integer> j760Var, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m54238d(j760Var, i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ux80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f178714a.m57311I(view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public j760<User, Integer> getItem(int i) {
            return this.f37733c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m57314J(List<j760<User, Integer>> list) {
            this.f37733c.clear();
            this.f37733c.addAll(list);
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
    public static /* synthetic */ void m57287a(C9001a c9001a, View view) {
        if (c9001a.f37732a != null) {
            c9001a.f37732a.mo57308a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m57290d(C9001a c9001a, View view) {
        if (NullChecker.m81303a(c9001a.f37732a)) {
            c9001a.f37732a.mo57308a(view);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ j760 m57295i(VisitorCounter visitorCounter) {
        return NullChecker.m81303a(visitorCounter) ? j760.m140076a(Integer.valueOf(visitorCounter.totalCnt), Integer.valueOf(visitorCounter.newCnt)) : j760.m140076a(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m57298l(View view) {
        vx80.m200511a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final String m57299m(int i) {
        if (i <= 9999) {
            return String.valueOf(i);
        }
        return (i / 10000) + "万";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57300n(j760 j760Var) {
        int iIntValue = ((Integer) j760Var.f116564a).intValue();
        VText vText = this.f37727d;
        if (iIntValue == 0) {
            vText.setText("不错过每个默默关心你的人！");
        } else {
            vText.setText(String.format("%s人看过我", m57299m(iIntValue)));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ C22306c m57301o(PutongFrag putongFrag, Throwable th) {
        m57305s(null);
        return putongFrag.lifecycle().filter(new w9j() { // from class: l.kx80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).skip(1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57298l(this);
        setDescendantFocusability(393216);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C22306c m57302p(final PutongFrag putongFrag, C22306c c22306c) {
        return c22306c.flatMap(new w9j() { // from class: l.tx80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172492a.m57301o(putongFrag, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m57303q(Throwable th) {
        m57305s(null);
    }

    /* JADX INFO: renamed from: r */
    public void m57304r(final dac0<dv80> dac0Var, final PutongFrag putongFrag, final C9001a c9001a, PurchaseType purchaseType) {
        if (xma.m210043F3()) {
            zvf0.m220402x("e_privilege_odiamond_visitor_more", putongFrag.pageId());
        }
        setPadding(0, 0, 0, 0);
        this.f37725b.setImageResource(x2c0.f189831Vk);
        this.f37726c.setText("我的访客");
        if (sab0.m182891i(purchaseType) && g6a.m124566o()) {
            this.f37725b.setImageResource(x2c0.f190207hi);
            this.f37726c.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37727d.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37728e.setImageResource(x2c0.f190238ii);
        }
        if (this.f37731h == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C9002b c9002b = new C9002b(getContext(), new C9002b.a() { // from class: l.jx80
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C9002b.a
                /* JADX INFO: renamed from: a */
                public final void mo57315a(View view) {
                    PrivilegeDescListVisitorItem.m57290d(c9001a, view);
                }
            });
            this.f37731h = c9002b;
            this.f37730g.setAdapter(c9002b);
            this.f37730g.setLayoutManager(linearLayoutManager);
        }
        this.f37724a.setOnClickListener(new View.OnClickListener() { // from class: l.lx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListVisitorItem.m57287a(c9001a, view);
            }
        });
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19664m1.m34705Q4().map(new w9j() { // from class: l.mx80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return PrivilegeDescListVisitorItem.m57295i((VisitorCounter) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.nx80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141004a.m57300n((j760) obj);
            }
        }));
        putongFrag.lifecycle().filter(new w9j() { // from class: l.ox80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).flatMap(new w9j() { // from class: l.px80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                dac0 dac0Var2 = dac0Var;
                PutongFrag putongFrag2 = putongFrag;
                return dac0Var2.mo67374c(putongFrag2, C9049e.m57964d(putongFrag2.act()));
            }
        }).retryWhen(new w9j() { // from class: l.qx80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156818a.m57302p(putongFrag, (C22306c) obj);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.rx80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161407a.m57305s((List) obj);
            }
        }, new e30() { // from class: l.sx80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166781a.m57303q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m57305s(List<j760<User, Integer>> list) {
        if (vwb.m200296J(list) || !CoreModule.f17545c.f19668n2.m175435L3()) {
            xdl0.m208344M(this.f37729f, false);
            return;
        }
        xdl0.m208344M(this.f37729f, true);
        this.f37731h.m57314J(list.subList(0, Math.min(list.size(), 15)));
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
