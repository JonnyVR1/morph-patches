package com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.d30;
import p149l.e30;
import p149l.vff;
import p149l.vwb;
import p149l.xff;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomHomeTownTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public final ArrayList<C8644a> f33296F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public final ArrayList<Map<String, List<String>>> f33297G = new ArrayList<>();

    /* JADX INFO: renamed from: H */
    public final ArrayList<String> f33298H = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    public RecyclerView f33299I;

    /* JADX INFO: renamed from: J */
    public ExpProfileLoopCustomHomeTownTypeData f33300J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag$a */
    public static class C8644a {

        /* JADX INFO: renamed from: a */
        public Context f33301a;

        /* JADX INFO: renamed from: b */
        public List<String> f33302b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public vff f33303c;

        /* JADX INFO: renamed from: d */
        public String f33304d;

        /* JADX INFO: renamed from: e */
        public RecyclerView f33305e;

        /* JADX INFO: renamed from: f */
        public d30 f33306f;

        /* JADX INFO: renamed from: g */
        public e30<String> f33307g;

        /* JADX INFO: renamed from: h */
        public xff f33308h;

        public C8644a(Context context, e30<String> e30Var, d30 d30Var) {
            this.f33301a = context;
            this.f33307g = e30Var;
            this.f33306f = d30Var;
        }

        /* JADX INFO: renamed from: c */
        public void m51286c() {
            xff xffVar = this.f33308h;
            if (xffVar != null) {
                xffVar.dismiss();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m51287d(String str) {
            this.f33304d = str;
            e30<String> e30Var = this.f33307g;
            if (e30Var != null) {
                e30Var.call(str);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m51288e(DialogInterface dialogInterface) {
            d30 d30Var = this.f33306f;
            if (d30Var != null) {
                d30Var.call();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m51289f(List<String> list, String str, Map<String, List<String>> map) {
            this.f33302b = list;
            if (this.f33303c == null) {
                this.f33303c = new vff(this.f33301a, new e30() { // from class: l.jgf
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f117773a.m51287d((String) obj);
                    }
                });
            }
            this.f33303c.m198281I(list, str, map);
        }

        /* JADX INFO: renamed from: g */
        public void m51290g(RecyclerView recyclerView) {
            this.f33305e = recyclerView;
        }

        /* JADX INFO: renamed from: h */
        public void m51291h() {
            RecyclerView recyclerView = this.f33305e;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f33303c);
                return;
            }
            xff xffVar = new xff(this.f33301a);
            this.f33308h = xffVar;
            xffVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.igf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f113110a.m51288e(dialogInterface);
                }
            });
            this.f33308h.m208608t(this.f33303c);
            this.f33308h.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public void m51280W4() {
        if (this.f33296F.size() == 0) {
            return;
        }
        ArrayList<C8644a> arrayList = this.f33296F;
        arrayList.remove(arrayList.get(arrayList.size() - 1));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo51246O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f33299I = recyclerView;
        return recyclerView;
    }

    /* JADX INFO: renamed from: X4 */
    public void m51281X4(String str) {
        int size = this.f33296F.size();
        List<String> list = this.f33297G.get(this.f33296F.size() - 1).get(str);
        if (vwb.m200296J(list)) {
            m51282Y4();
        } else {
            m51283Z4(size, list);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m51282Y4() {
        ExpProfileLoopCustomHomeTownTypeData expProfileLoopCustomHomeTownTypeData = this.f33300J;
        expProfileLoopCustomHomeTownTypeData.selectItem1 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem2 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem3 = "";
        if (this.f33296F.size() == 3) {
            this.f33300J.selectItem3 = this.f33296F.get(2).f33304d;
        }
        if (this.f33296F.size() >= 2) {
            this.f33300J.selectItem2 = this.f33296F.get(1).f33304d;
        }
        if (this.f33296F.size() >= 1) {
            this.f33300J.selectItem1 = this.f33296F.get(0).f33304d;
        }
        vwb.m200354z(this.f33296F, new e30() { // from class: l.hgf
            @Override // p149l.e30
            public final void call(Object obj) {
                ((ExpProfileLoopCustomHomeTownTypeFrag.C8644a) obj).m51286c();
            }
        });
        m51243M4().m51231a2().m203205q0();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m51283Z4(int i, List<String> list) {
        C8644a c8644a = new C8644a(getContext(), new e30() { // from class: l.fgf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97358a.m51281X4((String) obj);
            }
        }, new d30() { // from class: l.ggf
            @Override // p149l.d30
            public final void call() {
                this.f102495a.m51280W4();
            }
        });
        if (i == 0) {
            c8644a.m51290g(this.f33299I);
        }
        c8644a.m51289f(list, this.f33298H.get(i), this.f33297G.get(i));
        this.f33296F.add(c8644a);
        c8644a.m51291h();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f33300J = this.f33279A.getData().getCustomHomeTownType();
        this.f33299I.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f33299I.setOverScrollMode(0);
        this.f33297G.add(this.f33300J.firstMap);
        this.f33297G.add(this.f33300J.secondMap);
        this.f33297G.add(new HashMap());
        this.f33298H.add(this.f33300J.selectStr);
        this.f33298H.add(this.f33300J.selectItem2);
        this.f33298H.add(this.f33300J.selectItem3);
        m51283Z4(0, this.f33300J.list);
    }
}
