package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.mkd0;
import l.n3b0;
import l.o7r;
import l.q860;
import l.sab0;
import l.sw80;
import l.vwb;
import l.w9j;
import l.x9j;
import l.xdl0;
import p006l.dv80;
import p006l.f6c0;
import p006l.g6a;
import p006l.it80;
import p006l.nb90;
import p006l.w0c0;
import p006l.x2c0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7456a;

    /* JADX INFO: renamed from: b */
    public VIcon f7457b;

    /* JADX INFO: renamed from: c */
    public VText f7458c;

    /* JADX INFO: renamed from: d */
    public VText f7459d;

    /* JADX INFO: renamed from: e */
    public VIcon f7460e;

    /* JADX INFO: renamed from: f */
    public VText f7461f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f7462g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f7463h;

    /* JADX INFO: renamed from: i */
    public View f7464i;

    /* JADX INFO: renamed from: j */
    public C0433b f7465j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a */
    public static class C0432a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f7466a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10714a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m10713b(a aVar) {
            this.f7466a = aVar;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b */
    public static class C0433b extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f7467c;

        /* JADX INFO: renamed from: d */
        public Context f7468d;

        /* JADX INFO: renamed from: e */
        public a f7469e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10724a(View view);
        }

        public C0433b(Context context, a aVar) {
            this.f7468d = context;
            this.f7469e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m10717I(View view) {
            a aVar = this.f7469e;
            if (aVar != null) {
                aVar.mo10724a(view);
            }
        }

        /* JADX INFO: renamed from: C */
        public int m10719C() {
            List<User> list = this.f7467c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: D */
        public View m10720D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7468d).inflate(f6c0.f12073Y8, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m10718A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m7571b(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f20824a.m10717I(view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f7467c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m10723J(List<User> list) {
            this.f7467c = list;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10701a(C0432a c0432a, View view) {
        if (c0432a.f7466a != null) {
            c0432a.f7466a.mo10714a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10703c(C0432a c0432a, View view) {
        if (c0432a.f7466a != null) {
            nb90.m20002f();
            c0432a.f7466a.mo10714a(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10707g(View view) {
        sw80.a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m10708h(j760 j760Var) {
        m10711k((List) j760Var.b, ((Integer) j760Var.a).intValue());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m10709i(j760 j760Var) {
        if (CoreModule.f1534c.f3676u0.m2343T6() != null) {
            m10711k(CoreModule.f1534c.f3676u0.m2343T6().a, ((CoreLikers.C0145a) j760Var.a).f3259b);
        } else {
            m10711k(null, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m10710j(dac0<dv80> dac0Var, PutongFrag putongFrag, final C0432a c0432a, PurchaseType purchaseType) {
        this.f7457b.setImageResource(x2c0.f25933Hk);
        this.f7458c.setText(R$string.f2697ln);
        this.f7459d.setText(R$string.f2635jn);
        if (this.f7465j == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C0433b c0433b = new C0433b(getContext(), new C0433b.a() { // from class: l.kw80
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C0433b.a
                /* JADX INFO: renamed from: a */
                public final void mo10724a(View view) {
                    PrivilegeDescListSeeItem.m10701a(c0432a, view);
                }
            });
            this.f7465j = c0433b;
            this.f7463h.setAdapter(c0433b);
            this.f7463h.setLayoutManager(linearLayoutManager);
        }
        this.f7456a.setOnClickListener(new View.OnClickListener() { // from class: l.lw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSeeItem.m10703c(c0432a, view);
            }
        });
        if (g6a.m15592o() && sab0.i(purchaseType)) {
            this.f7457b.setImageResource(x2c0.f26647ei);
            this.f7458c.setTextColor(getResources().getColor(w0c0.f24677c1));
            this.f7459d.setTextColor(getResources().getColor(w0c0.f24673b1));
            this.f7464i.setBackgroundResource(w0c0.f24687f1);
            this.f7460e.setImageResource(x2c0.f26774ii);
        } else if (sab0.i(purchaseType)) {
            this.f7457b.setImageResource(x2c0.f25838Ek);
        } else if (sab0.o(purchaseType)) {
            this.f7457b.setImageResource(it80.m17030d(Privilege.see_who_likes_me));
        } else if (sab0.u(purchaseType)) {
            this.f7457b.setImageResource(x2c0.f25870Fk);
            this.f7458c.setTextColor(getResources().getColor(w0c0.f24719q0));
            this.f7459d.setTextColor(getResources().getColor(w0c0.f24668a0));
            this.f7464i.setBackgroundResource(w0c0.f24646T);
            this.f7460e.setImageResource(x2c0.f26523al);
        }
        dac0Var.c(putongFrag, CoreModule.f1534c.f3676u0.m2339R6()).filter(new w9j() { // from class: l.mw80
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.q());
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.nw80
            public final void call(Object obj) {
                this.f17902a.m10708h((j760) obj);
            }
        }));
        dac0Var.c(putongFrag, mkd0.r(CoreModule.f1534c.f3676u0.m2335P6(), CoreModule.f1534c.f3676u0.m2323J6(), new x9j() { // from class: l.ow80
            public final Object call(Object obj, Object obj2) {
                return new j760((CoreLikers.C0145a) obj, (q860) obj2);
            }
        })).filter(new w9j() { // from class: l.pw80
            public final Object call(Object obj) {
                return Boolean.valueOf(!n3b0.q() && NullChecker.a(((j760) obj).a));
            }
        }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.qw80
            public final void call(Object obj) {
                this.f20101a.m10709i((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m10711k(List<User> list, int i) {
        String str;
        if (vwb.J(list)) {
            this.f7458c.setText(R$string.f2697ln);
            this.f7459d.setText(R$string.f2635jn);
            xdl0.M(this.f7462g, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        xdl0.M(this.f7462g, true);
        String string = getContext().getString(R$string.f3115zh);
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        this.f7458c.setText(String.format(string, str));
        this.f7459d.setText(R$string.f1603Bh);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f7465j.m10723J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10707g(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
