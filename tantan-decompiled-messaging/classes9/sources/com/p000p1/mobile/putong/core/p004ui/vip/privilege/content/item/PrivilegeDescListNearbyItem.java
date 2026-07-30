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
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.lv80;
import l.mkd0;
import l.o7r;
import l.q860;
import l.vwb;
import l.x9j;
import l.xdl0;
import p006l.dv80;
import p006l.f6c0;
import p006l.w0c0;
import p006l.wx80;
import p006l.x2c0;
import v.VIcon;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescListNearbyItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f7389a;

    /* JADX INFO: renamed from: b */
    public VIcon f7390b;

    /* JADX INFO: renamed from: c */
    public VText f7391c;

    /* JADX INFO: renamed from: d */
    public VText f7392d;

    /* JADX INFO: renamed from: e */
    public VIcon f7393e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7394f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f7395g;

    /* JADX INFO: renamed from: h */
    public View f7396h;

    /* JADX INFO: renamed from: i */
    public C0426b f7397i;

    /* JADX INFO: renamed from: j */
    public boolean f7398j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a */
    public static class C0425a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f7399a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10615a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m10614b(a aVar) {
            this.f7399a = aVar;
        }

        @Override // p006l.dv80
        public int getItemType() {
            return 11;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b */
    public static class C0426b extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f7400c;

        /* JADX INFO: renamed from: d */
        public Context f7401d;

        /* JADX INFO: renamed from: e */
        public a f7402e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo10625a(View view);
        }

        public C0426b(Context context, a aVar) {
            this.f7401d = context;
            this.f7402e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m10618I(View view) {
            if (NullChecker.a(this.f7402e)) {
                this.f7402e.mo10625a(view);
            }
        }

        /* JADX INFO: renamed from: C */
        public int m10620C() {
            List<User> list = this.f7400c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        /* JADX INFO: renamed from: D */
        public View m10621D(ViewGroup viewGroup, int i) {
            return o7r.a(this.f7401d).inflate(f6c0.f12073Y8, viewGroup, false);
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void m10619A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m7572c(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.kv80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f16005a.m10618I(view2);
                }
            });
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f7400c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m10624J(List<User> list) {
            this.f7400c = list;
            notifyDataSetChanged();
        }

        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListNearbyItem(Context context) {
        super(context);
        this.f7398j = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10606c(C0425a c0425a, View view) {
        if (NullChecker.a(c0425a.f7399a)) {
            c0425a.f7399a.mo10615a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10607d(C0425a c0425a, View view) {
        if (NullChecker.a(c0425a.f7399a)) {
            c0425a.f7399a.mo10615a(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10608e(View view) {
        lv80.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m10609f(j760 j760Var) {
        if (!NullChecker.a(j760Var) || !NullChecker.a(j760Var.b)) {
            m10612i(null);
        } else {
            this.f7398j = true;
            m10612i(((q860) j760Var.b).a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m10610g(Throwable th) {
        m10612i(null);
    }

    /* JADX INFO: renamed from: h */
    public void m10611h(dac0<dv80> dac0Var, PutongFrag putongFrag, final C0425a c0425a, PurchaseType purchaseType) {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(purchaseType, Privilege.nearby_people);
        this.f7391c.setText(wx80VarM6950Hm.m26849t());
        this.f7392d.setText(wx80VarM6950Hm.m26829d());
        if (this.f7397i == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C0426b c0426b = new C0426b(getContext(), new C0426b.a() { // from class: l.fv80
                @Override // com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C0426b.a
                /* JADX INFO: renamed from: a */
                public final void mo10625a(View view) {
                    PrivilegeDescListNearbyItem.m10606c(c0425a, view);
                }
            });
            this.f7397i = c0426b;
            this.f7395g.setAdapter(c0426b);
            this.f7395g.setLayoutManager(linearLayoutManager);
        }
        this.f7389a.setOnClickListener(new View.OnClickListener() { // from class: l.gv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNearbyItem.m10607d(c0425a, view);
            }
        });
        if (!this.f7398j) {
            CoreModule.f1534c.f3654m2.m24921D3(null, 20, true);
        }
        dac0Var.c(putongFrag, mkd0.r(CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("supremePartner")).distinctUntilChanged(), CoreModule.f1534c.f3654m2.m24927J3(), new x9j() { // from class: l.hv80
            public final Object call(Object obj, Object obj2) {
                return new j760((UserPrivilege) obj, (q860) obj2);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.iv80
            public final void call(Object obj) {
                this.f14802a.m10609f((j760) obj);
            }
        }, new e30() { // from class: l.jv80
            public final void call(Object obj) {
                this.f15443a.m10610g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m10612i(List<User> list) {
        if (vwb.J(list)) {
            xdl0.M(this.f7394f, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        xdl0.M(this.f7394f, true);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f7397i.m10624J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10608e(this);
        setDescendantFocusability(393216);
        this.f7390b.setImageResource(x2c0.f27095sk);
        this.f7391c.setTextColor(getResources().getColor(w0c0.f24719q0));
        this.f7392d.setTextColor(getResources().getColor(w0c0.f24668a0));
        this.f7396h.setBackgroundResource(w0c0.f24646T);
        this.f7393e.setImageResource(x2c0.f26523al);
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7398j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7398j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7398j = false;
    }
}
