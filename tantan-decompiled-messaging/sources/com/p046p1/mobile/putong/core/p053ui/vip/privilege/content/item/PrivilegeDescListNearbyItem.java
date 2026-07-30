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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VIcon;
import p147v.VText;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.f6c0;
import p149l.j760;
import p149l.lv80;
import p149l.mkd0;
import p149l.o7r;
import p149l.q860;
import p149l.vwb;
import p149l.w0c0;
import p149l.wx80;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListNearbyItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37608a;

    /* JADX INFO: renamed from: b */
    public VIcon f37609b;

    /* JADX INFO: renamed from: c */
    public VText f37610c;

    /* JADX INFO: renamed from: d */
    public VText f37611d;

    /* JADX INFO: renamed from: e */
    public VIcon f37612e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f37613f;

    /* JADX INFO: renamed from: g */
    public RecyclerView f37614g;

    /* JADX INFO: renamed from: h */
    public View f37615h;

    /* JADX INFO: renamed from: i */
    public C8990b f37616i;

    /* JADX INFO: renamed from: j */
    public boolean f37617j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a */
    public static class C8989a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f37618a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57144a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m57143b(a aVar) {
            this.f37618a = aVar;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 11;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b */
    public static class C8990b extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f37619c;

        /* JADX INFO: renamed from: d */
        public Context f37620d;

        /* JADX INFO: renamed from: e */
        public a f37621e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListNearbyItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57151a(View view);
        }

        public C8990b(Context context, a aVar) {
            this.f37620d = context;
            this.f37621e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m57147I(View view) {
            if (NullChecker.m81303a(this.f37621e)) {
                this.f37621e.mo57151a(view);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<User> list = this.f37619c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f37620d).inflate(f6c0.f95659Y8, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m54237c(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.kv80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f124757a.m57147I(view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f37619c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m57150J(List<User> list) {
            this.f37619c = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListNearbyItem(Context context) {
        super(context);
        this.f37617j = false;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57135c(C8989a c8989a, View view) {
        if (NullChecker.m81303a(c8989a.f37618a)) {
            c8989a.f37618a.mo57144a(view);
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m57136d(C8989a c8989a, View view) {
        if (NullChecker.m81303a(c8989a.f37618a)) {
            c8989a.f37618a.mo57144a(view);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m57137e(View view) {
        lv80.m151839a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m57138f(j760 j760Var) {
        if (!NullChecker.m81303a(j760Var) || !NullChecker.m81303a(j760Var.f116565b)) {
            m57141i(null);
        } else {
            this.f37617j = true;
            m57141i(((q860) j760Var.f116565b).f153135a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57139g(Throwable th) {
        m57141i(null);
    }

    /* JADX INFO: renamed from: h */
    public void m57140h(dac0<dv80> dac0Var, PutongFrag putongFrag, final C8989a c8989a, PurchaseType purchaseType) {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(purchaseType, Privilege.nearby_people);
        this.f37610c.setText(wx80VarMo35013Hm.m205968t());
        this.f37611d.setText(wx80VarMo35013Hm.m205948d());
        if (this.f37616i == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C8990b c8990b = new C8990b(getContext(), new C8990b.a() { // from class: l.fv80
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem.C8990b.a
                /* JADX INFO: renamed from: a */
                public final void mo57151a(View view) {
                    PrivilegeDescListNearbyItem.m57135c(c8989a, view);
                }
            });
            this.f37616i = c8990b;
            this.f37614g.setAdapter(c8990b);
            this.f37614g.setLayoutManager(linearLayoutManager);
        }
        this.f37608a.setOnClickListener(new View.OnClickListener() { // from class: l.gv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListNearbyItem.m57136d(c8989a, view);
            }
        });
        if (!this.f37617j) {
            CoreModule.f17545c.f19665m2.m191463D3(null, 20, true);
        }
        dac0Var.mo67374c(putongFrag, mkd0.m154984r(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.supremePartner)).distinctUntilChanged(), CoreModule.f17545c.f19665m2.m191469J3(), new x9j() { // from class: l.hv80
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((UserPrivilege) obj, (q860) obj2);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.iv80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115101a.m57138f((j760) obj);
            }
        }, new e30() { // from class: l.jv80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119915a.m57139g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public final void m57141i(List<User> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f37613f, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        xdl0.m208344M(this.f37613f, true);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f37616i.m57150J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57137e(this);
        setDescendantFocusability(393216);
        this.f37609b.setImageResource(x2c0.f190559sk);
        this.f37610c.setTextColor(getResources().getColor(w0c0.f183879q0));
        this.f37611d.setTextColor(getResources().getColor(w0c0.f183828a0));
        this.f37615h.setBackgroundResource(w0c0.f183806T);
        this.f37612e.setImageResource(x2c0.f189987al);
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37617j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37617j = false;
    }

    public PrivilegeDescListNearbyItem(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f37617j = false;
    }
}
