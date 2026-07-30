package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

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
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0485e;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VisitorCounter;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.o7r;
import l.sab0;
import l.vwb;
import l.vx80;
import l.w9j;
import l.xdl0;
import l.zvf0;
import p006l.dv80;
import p006l.f6c0;
import p006l.g6a;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import rx.c;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListVisitorItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7505a;

    /* JADX INFO: renamed from: b */
    public VIcon f7506b;

    /* JADX INFO: renamed from: c */
    public VText f7507c;

    /* JADX INFO: renamed from: d */
    public VText f7508d;

    /* JADX INFO: renamed from: e */
    public VIcon f7509e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7510f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f7511g;

    /* JADX INFO: renamed from: h */
    public C0438b f7512h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a */
    public static class C0437a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f7513a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10788a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m10787b(a aVar) {
            this.f7513a = aVar;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 7;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b */
    public static class C0438b extends dac0<j760<User, Integer>> {

        /* JADX INFO: renamed from: c */
        public List<j760<User, Integer>> f7514c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Context f7515d;

        /* JADX INFO: renamed from: e */
        public a f7516e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListVisitorItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10798a(View view);
        }

        public C0438b(Context context, a aVar) {
            this.f7515d = context;
            this.f7516e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m10791I(View view) {
            a aVar = this.f7516e;
            if (aVar != null) {
                aVar.mo10798a(view);
            }
        }

        /* JADX INFO: renamed from: C */
        public int m10793C() {
            List<j760<User, Integer>> list = this.f7514c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: D */
        public View m10794D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7515d).inflate(f6c0.f12073Y8, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m10792A(View view, j760<User, Integer> j760Var, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m7573d(j760Var, i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ux80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f23794a.m10791I(view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public j760<User, Integer> getItem(int i) {
            return this.f7514c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m10797J(List<j760<User, Integer>> list) {
            this.f7514c.clear();
            this.f7514c.addAll(list);
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListVisitorItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10767a(C0437a c0437a, View view) {
        if (c0437a.f7513a != null) {
            c0437a.f7513a.mo10788a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10770d(C0437a c0437a, View view) {
        if (NullChecker.a(c0437a.f7513a)) {
            c0437a.f7513a.mo10788a(view);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ j760 m10775i(VisitorCounter visitorCounter) {
        return NullChecker.a(visitorCounter) ? j760.a(Integer.valueOf(visitorCounter.totalCnt), Integer.valueOf(visitorCounter.newCnt)) : j760.a(0, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m10778l(View view) {
        vx80.a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public final String m10779m(int i) {
        if (i <= 9999) {
            return String.valueOf(i);
        }
        return (i / 10000) + "万";
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10780n(j760 j760Var) {
        int iIntValue = ((Integer) j760Var.a).intValue();
        VText vText = this.f7508d;
        if (iIntValue == 0) {
            vText.setText("不错过每个默默关心你的人！");
        } else {
            vText.setText(String.format("%s人看过我", m10779m(iIntValue)));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ c m10781o(PutongFrag putongFrag, Throwable th) {
        m10785s(null);
        return putongFrag.lifecycle().filter(new w9j() { // from class: l.kx80
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).skip(1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10778l(this);
        setDescendantFocusability(393216);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ c m10782p(final PutongFrag putongFrag, c cVar) {
        return cVar.flatMap(new w9j() { // from class: l.tx80
            public final Object call(Object obj) {
                return this.f22320a.m10781o(putongFrag, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10783q(Throwable th) {
        m10785s(null);
    }

    /* JADX INFO: renamed from: r */
    public void m10784r(final dac0<dv80> dac0Var, final PutongFrag putongFrag, final C0437a c0437a, PurchaseType purchaseType) {
        if (xma.m27351F3()) {
            zvf0.x("e_privilege_odiamond_visitor_more", putongFrag.pageId());
        }
        setPadding(0, 0, 0, 0);
        this.f7506b.setImageResource(x2c0.f26367Vk);
        this.f7507c.setText("我的访客");
        if (sab0.i(purchaseType) && g6a.m15592o()) {
            this.f7506b.setImageResource(x2c0.f26743hi);
            this.f7507c.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7508d.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7509e.setImageResource(x2c0.f26774ii);
        }
        if (this.f7512h == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C0438b c0438b = new C0438b(getContext(), new C0438b.a() { // from class: l.jx80
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListVisitorItem.C0438b.a
                /* JADX INFO: renamed from: a */
                public final void mo10798a(View view) {
                    PrivilegeDescListVisitorItem.m10770d(c0437a, view);
                }
            });
            this.f7512h = c0438b;
            this.f7511g.setAdapter(c0438b);
            this.f7511g.setLayoutManager(linearLayoutManager);
        }
        this.f7505a.setOnClickListener(new View.OnClickListener() { // from class: l.lx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListVisitorItem.m10767a(c0437a, view);
            }
        });
        dac0Var.c(putongFrag, CoreModule.f1534c.f3653m1.m6642Q4().map(new w9j() { // from class: l.mx80
            public final Object call(Object obj) {
                return PrivilegeDescListVisitorItem.m10775i((VisitorCounter) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.nx80
            public final void call(Object obj) {
                this.f17913a.m10780n((j760) obj);
            }
        }));
        putongFrag.lifecycle().filter(new w9j() { // from class: l.ox80
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).flatMap(new w9j() { // from class: l.px80
            public final Object call(Object obj) {
                dac0 dac0Var2 = dac0Var;
                PutongFrag putongFrag2 = putongFrag;
                return dac0Var2.c(putongFrag2, C0485e.m11482d(putongFrag2.act()));
            }
        }).retryWhen(new w9j() { // from class: l.qx80
            public final Object call(Object obj) {
                return this.f20127a.m10782p(putongFrag, (c) obj);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.rx80
            public final void call(Object obj) {
                this.f20845a.m10785s((List) obj);
            }
        }, new e30() { // from class: l.sx80
            public final void call(Object obj) {
                this.f21737a.m10783q((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public final void m10785s(List<j760<User, Integer>> list) {
        if (vwb.J(list) || !CoreModule.f1534c.f3657n2.m22251L3()) {
            xdl0.M(this.f7510f, false);
            return;
        }
        xdl0.M(this.f7510f, true);
        this.f7512h.m10797J(list.subList(0, Math.min(list.size(), 15)));
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListVisitorItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
