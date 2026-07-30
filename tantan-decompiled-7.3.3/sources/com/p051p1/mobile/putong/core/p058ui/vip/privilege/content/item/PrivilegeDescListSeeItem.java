package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.PrivilegeDescListSeeImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VIcon;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.h390;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.m190;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.rj90;
import p153l.s7a;
import p153l.w490;
import p153l.wib0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescListSeeItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f38523a;

    /* JADX INFO: renamed from: b */
    public VIcon f38524b;

    /* JADX INFO: renamed from: c */
    public VText f38525c;

    /* JADX INFO: renamed from: d */
    public VText f38526d;

    /* JADX INFO: renamed from: e */
    public VIcon f38527e;

    /* JADX INFO: renamed from: f */
    public VText f38528f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f38529g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f38530h;

    /* JADX INFO: renamed from: i */
    public View f38531i;

    /* JADX INFO: renamed from: j */
    public C9160b f38532j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a */
    public static class C9159a implements h390 {

        /* JADX INFO: renamed from: a */
        public a f38533a;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$a$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58420a(View view);
        }

        /* JADX INFO: renamed from: b */
        public void m58419b(a aVar) {
            this.f38533a = aVar;
        }

        @Override // p153l.h390
        public int getItemType() {
            return 3;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b */
    public static class C9160b extends jic0<User> {

        /* JADX INFO: renamed from: c */
        public List<User> f38534c;

        /* JADX INFO: renamed from: d */
        public Context f38535d;

        /* JADX INFO: renamed from: e */
        public a f38536e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListSeeItem$b$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            void mo58427a(View view);
        }

        public C9160b(Context context, a aVar) {
            this.f38535d = context;
            this.f38536e = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m58423I(View view) {
            a aVar = this.f38536e;
            if (aVar != null) {
                aVar.mo58427a(view);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            List<User> list = this.f38534c;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return p9r.m171370a(this.f38535d).inflate(kec0.f125831f9, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, User user, int i, int i2) {
            ((PrivilegeDescListSeeImageItem) view).m55419b(user);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.v490
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f182342a.m58423I(view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public User getItem(int i) {
            return this.f38534c.get(i);
        }

        /* JADX INFO: renamed from: J */
        public final void m58426J(List<User> list) {
            this.f38534c = list;
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
    public static /* synthetic */ void m58407a(C9159a c9159a, View view) {
        if (c9159a.f38533a != null) {
            c9159a.f38533a.mo58420a(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58409c(C9159a c9159a, View view) {
        if (c9159a.f38533a != null) {
            rj90.m181696f();
            c9159a.f38533a.mo58420a(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m58413g(View view) {
        w490.m204825a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m58414h(pf60 pf60Var) {
        m58417k((List) pf60Var.f152157b, ((Integer) pf60Var.f152156a).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m58415i(pf60 pf60Var) {
        if (CoreModule.f18264c.f20429u0.m31425X6() != null) {
            m58417k(CoreModule.f18264c.f20429u0.m31425X6().f184001a, ((CoreLikers.C4870a) pf60Var.f152156a).f20012b);
        } else {
            m58417k(null, 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m58416j(jic0<h390> jic0Var, PutongFrag putongFrag, final C9159a c9159a, PurchaseType purchaseType) {
        this.f38524b.setImageResource(dbc0.f87519vl);
        this.f38525c.setText(R$string.f18526Hn);
        this.f38526d.setText(R$string.f18464Fn);
        if (this.f38532j == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            linearLayoutManager.setOrientation(0);
            C9160b c9160b = new C9160b(getContext(), new C9160b.a() { // from class: l.o490
                @Override // com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem.C9160b.a
                /* JADX INFO: renamed from: a */
                public final void mo58427a(View view) {
                    PrivilegeDescListSeeItem.m58407a(c9159a, view);
                }
            });
            this.f38532j = c9160b;
            this.f38530h.setAdapter(c9160b);
            this.f38530h.setLayoutManager(linearLayoutManager);
        }
        this.f38523a.setOnClickListener(new View.OnClickListener() { // from class: l.p490
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivilegeDescListSeeItem.m58409c(c9159a, view);
            }
        });
        if (s7a.m184986o() && wib0.m206565i(purchaseType)) {
            this.f38524b.setImageResource(dbc0.f86571Si);
            this.f38525c.setTextColor(getResources().getColor(c9c0.f80410d1));
            this.f38526d.setTextColor(getResources().getColor(c9c0.f80406c1));
            this.f38531i.setBackgroundResource(c9c0.f80420g1);
            this.f38527e.setImageResource(dbc0.f86699Wi);
        } else if (wib0.m206565i(purchaseType)) {
            this.f38524b.setImageResource(dbc0.f87421sl);
        } else if (wib0.m206571o(purchaseType)) {
            this.f38524b.setImageResource(m190.m156633d(Privilege.see_who_likes_me));
        } else if (wib0.m206577u(purchaseType)) {
            this.f38524b.setImageResource(dbc0.f87454tl);
            this.f38525c.setTextColor(getResources().getColor(c9c0.f80452r0));
            this.f38526d.setTextColor(getResources().getColor(c9c0.f80401b0));
            this.f38531i.setBackgroundResource(c9c0.f80378U);
            this.f38527e.setImageResource(dbc0.f86446Ol);
        }
        jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20429u0.m31421V6()).filter(new qcj() { // from class: l.q490
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rbb0.m180744q());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.r490
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161158a.m58414h((pf60) obj);
            }
        }));
        jic0Var.mo68557c(putongFrag, psd0.m173625r(CoreModule.f18264c.f20429u0.m31417T6(), CoreModule.f18264c.f20429u0.m31405N6(), new rcj() { // from class: l.s490
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((CoreLikers.C4870a) obj, (vg60) obj2);
            }
        })).filter(new qcj() { // from class: l.t490
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!rbb0.m180744q() && NullChecker.m82486a(((pf60) obj).f152156a));
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.u490
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177443a.m58415i((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m58417k(List<User> list, int i) {
        String str;
        if (jyb.m147479J(list)) {
            this.f38525c.setText(R$string.f18526Hn);
            this.f38526d.setText(R$string.f18464Fn);
            bnl0.m105524M(this.f38529g, false);
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        bnl0.m105524M(this.f38529g, true);
        String string = getContext().getString(R$string.f18914Uh);
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        this.f38525c.setText(String.format(string, str));
        this.f38526d.setText(R$string.f18974Wh);
        int size = arrayList.size();
        if (size >= 10) {
            size = 10;
        }
        this.f38532j.m58426J(arrayList.subList(0, size));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58413g(this);
        setDescendantFocusability(393216);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescListSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
