package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveGiftUserInfoViewBindings;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import java.util.ArrayList;
import java.util.List;
import p153l.biv;
import p153l.bnl0;
import p153l.coj;
import p153l.cpj;
import p153l.cqj;
import p153l.djs;
import p153l.jgc0;
import p153l.jic0;
import p153l.lx50;
import p153l.mdc0;
import p153l.nsv;
import p153l.o1j0;
import p153l.pcj;
import p153l.qa00;
import p153l.qcj;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class GiftUserInfoView extends LiveGiftUserInfoViewBindings<djs> {

    /* JADX INFO: renamed from: m */
    public coj f51208m;

    /* JADX INFO: renamed from: n */
    public String f51209n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoView$a */
    public static class C13009a extends jic0<coj> {

        /* JADX INFO: renamed from: c */
        public final PopupWindow f51210c;

        /* JADX INFO: renamed from: d */
        public final List<coj> f51211d = new ArrayList();

        /* JADX INFO: renamed from: e */
        public final String f51212e;

        /* JADX INFO: renamed from: f */
        public final djs<?> f51213f;

        public C13009a(PopupWindow popupWindow, String str, djs<?> djsVar) {
            this.f51210c = popupWindow;
            this.f51212e = str;
            this.f51213f = djsVar;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f51211d.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return LayoutInflater.from(this.f51210c.getContentView().getContext()).inflate(yec0.f198765G1, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final coj cojVar, int i, int i2) {
            CommonMaskAvatarView commonMaskAvatarView = (CommonMaskAvatarView) view.findViewById(mdc0.f136338x2);
            ((TextView) view.findViewById(mdc0.f136162e4)).setText(cpj.m111767C(cojVar));
            biv.m104519d(commonMaskAvatarView, qa00.f156335v, nsv.m164636f(cojVar).m164639c(cojVar.f82889e.f107997a, cojVar.f82886b, cojVar.f82885a), false, new qcj() { // from class: l.g0k
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((coj) obj).f82889e.f107999c;
                }
            });
            final cqj cqjVarM111923d = new cqj.C16337a().m111924e(cojVar, this.f51212e).m111923d();
            view.setOnClickListener(new View.OnClickListener() { // from class: l.h0k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f107308a.m75735I(cojVar, cqjVarM111923d, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public coj getItem(int i) {
            return this.f51211d.get(i);
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m75735I(coj cojVar, cqj cqjVar, View view) {
            this.f51210c.dismiss();
            this.f51213f.m116153W3(new lx50().m156159i(700).m156160j(cojVar.f82891g).m156158h(cqjVar));
        }

        /* JADX INFO: renamed from: J */
        public void m75736J(List<coj> list) {
            this.f51211d.clear();
            this.f51211d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public GiftUserInfoView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    @Nullable
    public coj getCurrentGiftCallInfo() {
        T t;
        if (bnl0.m105529O0(this) && (t = this.f48808d) != 0 && TextUtils.equals("live", ((djs) t).m213810E2().mo118362A0())) {
            return this.f51208m;
        }
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final int m75722o0(List<coj> list) {
        int size = (list.size() * qa00.f156338y) + qa00.f156323j;
        int[] iArr = new int[2];
        this.f48811g.getLocationOnScreen(iArr);
        return Math.min(size, bnl0.m105588w0() - iArr[1]);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m75723p0(coj cojVar, View view) {
        ((djs) this.f48808d).m116151U3(cojVar.f82889e.f107997a, cojVar.f82891g);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m75724q0(coj cojVar, View view) {
        ((djs) this.f48808d).m116150T3(cojVar);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m75725r0(coj cojVar, pcj pcjVar, View view) {
        if (cojVar.m111667i()) {
            return;
        }
        List<coj> list = (List) pcjVar.call();
        if (list.size() <= 1) {
            o1j0.m165651y("没有更多");
        } else {
            m75730w0(list);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m75726s0() {
        bnl0.m105525M0(this.f48810f, true);
        bnl0.m105525M0(this.f48813i, true);
    }

    /* JADX INFO: renamed from: t0 */
    public void m75727t0(cqj cqjVar, pcj<List<coj>> pcjVar) {
        coj cojVarM111918g = cqjVar.m111918g();
        this.f51208m = cojVarM111918g;
        this.f51209n = cqjVar.m111913b();
        biv.m104519d(this.f48811g, qa00.f156335v, nsv.m164636f(cojVarM111918g).m164639c(cojVarM111918g.f82889e.f107997a, cojVarM111918g.f82886b, cojVarM111918g.f82885a), false, new qcj() { // from class: l.a0k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((coj) obj).f82889e.f107999c;
            }
        });
        this.f48812h.setText(cpj.m111767C(cojVarM111918g));
        m75728u0(cojVarM111918g, pcjVar);
        m75729v0(cojVarM111918g);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75728u0(final coj cojVar, final pcj<List<coj>> pcjVar) {
        this.f48815k.setOnClickListener(new View.OnClickListener() { // from class: l.b0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74276a.m75723p0(cojVar, view);
            }
        });
        this.f48816l.setOnClickListener(new View.OnClickListener() { // from class: l.c0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79276a.m75724q0(cojVar, view);
            }
        });
        bnl0.m105509E0(this.f48814j, new View.OnClickListener() { // from class: l.d0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84574a.m75725r0(cojVar, pcjVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75729v0(coj cojVar) {
        int iM175859d;
        bnl0.m105524M(this.f48816l, !cojVar.f82887c);
        boolean zM111667i = cojVar.m111667i();
        ImageView imageView = this.f48813i;
        if (zM111667i) {
            bnl0.m105525M0(imageView, false);
            iM175859d = (int) this.f48812h.getPaint().measureText(this.f48812h.getText().toString());
        } else {
            bnl0.m105525M0(imageView, true);
            iM175859d = qa00.m175859d(117.0f);
        }
        bnl0.m105507D0(iM175859d, this.f48812h);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m75730w0(List<coj> list) {
        View viewInflate = LayoutInflater.from(this.f48812h.getContext()).inflate(yec0.f198753F1, (ViewGroup) null);
        final PopupWindow popupWindow = new PopupWindow(viewInflate, qa00.m175859d(200.0f), m75722o0(list), true);
        popupWindow.setAnimationStyle(jgc0.f120698e);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(mdc0.f136095X4);
        View viewFindViewById = viewInflate.findViewById(mdc0.f135967J2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        C13009a c13009a = new C13009a(popupWindow, this.f51209n, (djs) this.f48808d);
        recyclerView.setAdapter(c13009a);
        c13009a.m75736J(list);
        bnl0.m105525M0(this.f48810f, false);
        bnl0.m105525M0(this.f48813i, false);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.e0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        popupWindow.showAsDropDown(this.f48811g, -qa00.m175859d(6.0f), -qa00.m175859d(49.0f));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.f0k
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f96688a.m75726s0();
            }
        });
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, -1);
    }

    public GiftUserInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
