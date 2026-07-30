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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VIcon;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.p390;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.rcj;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListNearbyItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38456a;

    /* JADX INFO: renamed from: b */
    public VIcon f38457b;

    /* JADX INFO: renamed from: c */
    public VText f38458c;

    /* JADX INFO: renamed from: d */
    public VText f38459d;

    /* JADX INFO: renamed from: e */
    public VIcon f38460e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f38461f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f38462g;

    /* JADX INFO: renamed from: h */
    public View f38463h;

    /* JADX INFO: renamed from: i */
    public C9153b f38464i;

    /* JADX INFO: renamed from: j */
    public boolean f38465j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a */
    public static class C9152a implements h390 {

        /* JADX INFO: renamed from: a */
        public a f38466a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58327a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m58326b(a aVar) {
            this.f38466a = aVar;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 11;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b */
    public static class C9153b extends jic0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f38467c;

        /* JADX INFO: renamed from: d */
        public Context f38468d;

        /* JADX INFO: renamed from: e */
        public a f38469e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58334a(View view);
        }

        public C9153b(Context context, a aVar) {
            this.f38468d = context;
            this.f38469e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m58330I(View view) {
            if (NullChecker.m82486a(this.f38469e)) {
                this.f38469e.mo58334a(view);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<User> list = this.f38467c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38468d).inflate(kec0.f125831f9, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m55420c(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.o390
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f144824a.m58330I(view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f38467c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m58333J(List<User> list) {
            this.f38467c = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListNearbyItem(Context context) {
        super(context);
        this.f38465j = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58318c(C9152a c9152a, View view) {
        if (NullChecker.m82486a(c9152a.f38466a)) {
            c9152a.f38466a.mo58327a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m58319d(C9152a c9152a, View view) {
        if (NullChecker.m82486a(c9152a.f38466a)) {
            c9152a.f38466a.mo58327a(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m58320e(View view) {
        p390.m170485a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m58321f(pf60 pf60Var) {
        if (!NullChecker.m82486a(pf60Var) || !NullChecker.m82486a(pf60Var.f152157b)) {
            m58324i(null);
        } else {
            this.f38465j = true;
            m58324i(((vg60) pf60Var.f152157b).f184001a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m58322g(Throwable th) {
        m58324i(null);
    }

    /* JADX INFO: renamed from: h */
    public void m58323h(jic0<h390> jic0Var, PutongFrag putongFrag, final C9152a c9152a, PurchaseType purchaseType) {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(purchaseType, Privilege.nearby_people);
        this.f38458c.setText(a690VarMo36016Hm.m96314t());
        this.f38459d.setText(a690VarMo36016Hm.m96294d());
        if (this.f38464i == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C9153b c9153b = new C9153b(getContext(), new C9153b.a() { // from class: l.j390
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C9153b.a
                /* JADX INFO: renamed from: a */
                public final void mo58334a(View view) {
                    PrivilegeDescListNearbyItem.m58318c(c9152a, view);
                }
            });
            this.f38464i = c9153b;
            this.f38462g.setAdapter(c9153b);
            this.f38462g.setLayoutManager(linearLayoutManager);
        }
        this.f38456a.setOnClickListener(new View.OnClickListener() { // from class: l.k390
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNearbyItem.m58319d(c9152a, view);
            }
        });
        if (!this.f38465j) {
            CoreModule.f18264c.f20407m2.m123954D3(null, 20, true);
        }
        jic0Var.mo68557c(putongFrag, psd0.m173625r(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged(), CoreModule.f18264c.f20407m2.m123960J3(), new rcj() { // from class: l.l390
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((UserPrivilege) obj, (vg60) obj2);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.m390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134654a.m58321f((pf60) obj);
            }
        }, new y20() { // from class: l.n390
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139954a.m58322g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m58324i(List<User> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f38461f, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        bnl0.m105524M(this.f38461f, true);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f38464i.m58333J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58320e(this);
        setDescendantFocusability(393216);
        this.f38457b.setImageResource(dbc0.f87027gl);
        this.f38458c.setTextColor(getResources().getColor(c9c0.f80452r0));
        this.f38459d.setTextColor(getResources().getColor(c9c0.f80401b0));
        this.f38463h.setBackgroundResource(c9c0.f80378U);
        this.f38460e.setImageResource(dbc0.f86446Ol);
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38465j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38465j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f38465j = false;
    }
}
