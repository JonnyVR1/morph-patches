package com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.d30;
import l.e30;
import l.hu0;
import l.vwb;
import p002l.vff;
import p002l.xff;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpProfileLoopCustomHomeTownTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public final ArrayList<C0069a> f1118F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public final ArrayList<Map<String, List<String>>> f1119G = new ArrayList<>();

    /* JADX INFO: renamed from: H */
    public final ArrayList<String> f1120H = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    public RecyclerView f1121I;

    /* JADX INFO: renamed from: J */
    public ExpProfileLoopCustomHomeTownTypeData f1122J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag$a */
    public static class C0069a {

        /* JADX INFO: renamed from: a */
        public Context f1123a;

        /* JADX INFO: renamed from: b */
        public List<String> f1124b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public vff f1125c;

        /* JADX INFO: renamed from: d */
        public String f1126d;

        /* JADX INFO: renamed from: e */
        public RecyclerView f1127e;

        /* JADX INFO: renamed from: f */
        public d30 f1128f;

        /* JADX INFO: renamed from: g */
        public e30<String> f1129g;

        /* JADX INFO: renamed from: h */
        public xff f1130h;

        public C0069a(Context context, e30<String> e30Var, d30 d30Var) {
            this.f1123a = context;
            this.f1129g = e30Var;
            this.f1128f = d30Var;
        }

        /* JADX INFO: renamed from: c */
        public void m1745c() {
            hu0 hu0Var = this.f1130h;
            if (hu0Var != null) {
                hu0Var.dismiss();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m1746d(String str) {
            this.f1126d = str;
            e30<String> e30Var = this.f1129g;
            if (e30Var != null) {
                e30Var.call(str);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m1747e(DialogInterface dialogInterface) {
            d30 d30Var = this.f1128f;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m1748f(List<String> list, String str, Map<String, List<String>> map) {
            this.f1124b = list;
            if (this.f1125c == null) {
                this.f1125c = new vff(this.f1123a, new e30() { // from class: l.jgf
                    public final void call(Object obj) {
                        this.f13765a.m1746d((String) obj);
                    }
                });
            }
            this.f1125c.m23941I(list, str, map);
        }

        /* JADX INFO: renamed from: g */
        public void m1749g(RecyclerView recyclerView) {
            this.f1127e = recyclerView;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Dialog, l.xff] */
        /* JADX INFO: renamed from: h */
        public void m1750h() {
            RecyclerView recyclerView = this.f1127e;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f1125c);
                return;
            }
            ?? xffVar = new xff(this.f1123a);
            this.f1130h = xffVar;
            xffVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.igf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f13231a.m1747e(dialogInterface);
                }
            });
            this.f1130h.m25913t(this.f1125c);
            this.f1130h.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public void m1738W4() {
        if (this.f1118F.size() == 0) {
            return;
        }
        ArrayList<C0069a> arrayList = this.f1118F;
        arrayList.remove(arrayList.get(arrayList.size() - 1));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo1701O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f1121I = recyclerView;
        return recyclerView;
    }

    /* JADX INFO: renamed from: X4 */
    public void m1739X4(String str) {
        int size = this.f1118F.size();
        List<String> list = this.f1119G.get(this.f1118F.size() - 1).get(str);
        if (vwb.J(list)) {
            m1740Y4();
        } else {
            m1741Z4(size, list);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m1740Y4() {
        ExpProfileLoopCustomHomeTownTypeData expProfileLoopCustomHomeTownTypeData = this.f1122J;
        expProfileLoopCustomHomeTownTypeData.selectItem1 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem2 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem3 = "";
        if (this.f1118F.size() == 3) {
            this.f1122J.selectItem3 = this.f1118F.get(2).f1126d;
        }
        if (this.f1118F.size() >= 2) {
            this.f1122J.selectItem2 = this.f1118F.get(1).f1126d;
        }
        if (this.f1118F.size() >= 1) {
            this.f1122J.selectItem1 = this.f1118F.get(0).f1126d;
        }
        vwb.z(this.f1118F, new e30() { // from class: l.hgf
            public final void call(Object obj) {
                ((ExpProfileLoopCustomHomeTownTypeFrag.C0069a) obj).m1745c();
            }
        });
        m1698M4().m1686a2().m24655q0();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m1741Z4(int i, List<String> list) {
        C0069a c0069a = new C0069a(getContext(), new e30() { // from class: l.fgf
            public final void call(Object obj) {
                this.f10336a.m1739X4((String) obj);
            }
        }, new d30() { // from class: l.ggf
            public final void call() {
                this.f11404a.m1738W4();
            }
        });
        if (i == 0) {
            c0069a.m1749g(this.f1121I);
        }
        c0069a.m1748f(list, this.f1120H.get(i), this.f1119G.get(i));
        this.f1118F.add(c0069a);
        c0069a.m1750h();
    }

    /* JADX INFO: renamed from: g4 */
    public void m1742g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f1122J = this.f1101A.getData().getCustomHomeTownType();
        this.f1121I.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f1121I.setOverScrollMode(0);
        this.f1119G.add(this.f1122J.firstMap);
        this.f1119G.add(this.f1122J.secondMap);
        this.f1119G.add(new HashMap());
        this.f1120H.add(this.f1122J.selectStr);
        this.f1120H.add(this.f1122J.selectItem2);
        this.f1120H.add(this.f1122J.selectItem3);
        m1741Z4(0, this.f1122J.list);
    }
}
