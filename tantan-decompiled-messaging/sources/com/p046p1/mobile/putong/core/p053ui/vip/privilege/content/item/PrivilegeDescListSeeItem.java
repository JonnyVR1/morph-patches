package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
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
import p149l.g6a;
import p149l.it80;
import p149l.j760;
import p149l.mkd0;
import p149l.nb90;
import p149l.o7r;
import p149l.sab0;
import p149l.sw80;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37675a;

    /* JADX INFO: renamed from: b */
    public VIcon f37676b;

    /* JADX INFO: renamed from: c */
    public VText f37677c;

    /* JADX INFO: renamed from: d */
    public VText f37678d;

    /* JADX INFO: renamed from: e */
    public VIcon f37679e;

    /* JADX INFO: renamed from: f */
    public VText f37680f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f37681g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f37682h;

    /* JADX INFO: renamed from: i */
    public View f37683i;

    /* JADX INFO: renamed from: j */
    public C8997b f37684j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a */
    public static class C8996a implements dv80 {

        /* JADX INFO: renamed from: a */
        public a f37685a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57237a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m57236b(a aVar) {
            this.f37685a = aVar;
        }

        @Override // p149l.dv80
        public int getItemType() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b */
    public static class C8997b extends dac0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f37686c;

        /* JADX INFO: renamed from: d */
        public Context f37687d;

        /* JADX INFO: renamed from: e */
        public a f37688e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo57244a(View view);
        }

        public C8997b(Context context, a aVar) {
            this.f37687d = context;
            this.f37688e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m57240I(View view) {
            a aVar = this.f37688e;
            if (aVar != null) {
                aVar.mo57244a(view);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<User> list = this.f37686c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return o7r.m163037a(this.f37687d).inflate(f6c0.f95659Y8, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m54236b(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.rw80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f161321a.m57240I(view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f37686c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m57243J(List<User> list) {
            this.f37686c = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }
    }

    public PrivilegeDescListSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57224a(C8996a c8996a, View view) {
        if (c8996a.f37685a != null) {
            c8996a.f37685a.mo57237a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57226c(C8996a c8996a, View view) {
        if (c8996a.f37685a != null) {
            nb90.m158768f();
            c8996a.f37685a.mo57237a(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m57230g(View view) {
        sw80.m186128a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m57231h(j760 j760Var) {
        m57234k((List) j760Var.f116565b, ((Integer) j760Var.f116564a).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m57232i(j760 j760Var) {
        if (CoreModule.f17545c.f19687u0.m30415T6() != null) {
            m57234k(CoreModule.f17545c.f19687u0.m30415T6().f153135a, ((CoreLikers.C4719a) j760Var.f116564a).f19270b);
        } else {
            m57234k(null, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m57233j(dac0<dv80> dac0Var, PutongFrag putongFrag, final C8996a c8996a, PurchaseType purchaseType) {
        this.f37676b.setImageResource(x2c0.f189397Hk);
        this.f37677c.setText(R$string.f18708ln);
        this.f37678d.setText(R$string.f18646jn);
        if (this.f37684j == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C8997b c8997b = new C8997b(getContext(), new C8997b.a() { // from class: l.kw80
                @Override // com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C8997b.a
                /* JADX INFO: renamed from: a */
                public final void mo57244a(View view) {
                    PrivilegeDescListSeeItem.m57224a(c8996a, view);
                }
            });
            this.f37684j = c8997b;
            this.f37682h.setAdapter(c8997b);
            this.f37682h.setLayoutManager(linearLayoutManager);
        }
        this.f37675a.setOnClickListener(new View.OnClickListener() { // from class: l.lw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSeeItem.m57226c(c8996a, view);
            }
        });
        if (g6a.m124566o() && sab0.m182891i(purchaseType)) {
            this.f37676b.setImageResource(x2c0.f190111ei);
            this.f37677c.setTextColor(getResources().getColor(w0c0.f183837c1));
            this.f37678d.setTextColor(getResources().getColor(w0c0.f183833b1));
            this.f37683i.setBackgroundResource(w0c0.f183847f1);
            this.f37679e.setImageResource(x2c0.f190238ii);
        } else if (sab0.m182891i(purchaseType)) {
            this.f37676b.setImageResource(x2c0.f189302Ek);
        } else if (sab0.m182897o(purchaseType)) {
            this.f37676b.setImageResource(it80.m138188d(Privilege.see_who_likes_me));
        } else if (sab0.m182903u(purchaseType)) {
            this.f37676b.setImageResource(x2c0.f189334Fk);
            this.f37677c.setTextColor(getResources().getColor(w0c0.f183879q0));
            this.f37678d.setTextColor(getResources().getColor(w0c0.f183828a0));
            this.f37683i.setBackgroundResource(w0c0.f183806T);
            this.f37679e.setImageResource(x2c0.f189987al);
        }
        dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19687u0.m30411R6()).filter(new w9j() { // from class: l.mw80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.m157742q());
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.nw80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140927a.m57231h((j760) obj);
            }
        }));
        dac0Var.mo67374c(putongFrag, mkd0.m154984r(CoreModule.f17545c.f19687u0.m30407P6(), CoreModule.f17545c.f19687u0.m30395J6(), new x9j() { // from class: l.ow80
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((CoreLikers.C4719a) obj, (q860) obj2);
            }
        })).filter(new w9j() { // from class: l.pw80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!n3b0.m157742q() && NullChecker.m81303a(((j760) obj).f116564a));
            }
        }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.qw80
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156667a.m57232i((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m57234k(List<User> list, int i) {
        String str;
        if (vwb.m200296J(list)) {
            this.f37677c.setText(R$string.f18708ln);
            this.f37678d.setText(R$string.f18646jn);
            xdl0.m208344M(this.f37681g, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        xdl0.m208344M(this.f37681g, true);
        String string = getContext().getString(R$string.f19126zh);
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        this.f37677c.setText(String.format(string, str));
        this.f37678d.setText(R$string.f17614Bh);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f37684j.m57243J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57230g(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
