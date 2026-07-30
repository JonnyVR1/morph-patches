package com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p153l.bhf;
import p153l.dhf;
import p153l.jyb;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileLoopCustomHomeTownTypeFrag extends ExpProfileEditLoopBaseFrag {

    /* JADX INFO: renamed from: F */
    public final ArrayList<C8807a> f34144F = new ArrayList<>();

    /* JADX INFO: renamed from: G */
    public final ArrayList<Map<String, List<String>>> f34145G = new ArrayList<>();

    /* JADX INFO: renamed from: H */
    public final ArrayList<String> f34146H = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    public RecyclerView f34147I;

    /* JADX INFO: renamed from: J */
    public ExpProfileLoopCustomHomeTownTypeData f34148J;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exploop.inputitem.ExpProfileLoopCustomHomeTownTypeFrag$a */
    public static class C8807a {

        /* JADX INFO: renamed from: a */
        public Context f34149a;

        /* JADX INFO: renamed from: b */
        public List<String> f34150b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public bhf f34151c;

        /* JADX INFO: renamed from: d */
        public String f34152d;

        /* JADX INFO: renamed from: e */
        public RecyclerView f34153e;

        /* JADX INFO: renamed from: f */
        public x20 f34154f;

        /* JADX INFO: renamed from: g */
        public y20<String> f34155g;

        /* JADX INFO: renamed from: h */
        public dhf f34156h;

        public C8807a(Context context, y20<String> y20Var, x20 x20Var) {
            this.f34149a = context;
            this.f34155g = y20Var;
            this.f34154f = x20Var;
        }

        /* JADX INFO: renamed from: c */
        public void m52469c() {
            dhf dhfVar = this.f34156h;
            if (dhfVar != null) {
                dhfVar.dismiss();
            }
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m52470d(String str) {
            this.f34152d = str;
            y20<String> y20Var = this.f34155g;
            if (y20Var != null) {
                y20Var.call(str);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m52471e(DialogInterface dialogInterface) {
            x20 x20Var = this.f34154f;
            if (x20Var != null) {
                x20Var.call();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m52472f(List<String> list, String str, Map<String, List<String>> map) {
            this.f34150b = list;
            if (this.f34151c == null) {
                this.f34151c = new bhf(this.f34149a, new y20() { // from class: l.phf
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f152427a.m52470d((String) obj);
                    }
                });
            }
            this.f34151c.m104339I(list, str, map);
        }

        /* JADX INFO: renamed from: g */
        public void m52473g(RecyclerView recyclerView) {
            this.f34153e = recyclerView;
        }

        /* JADX INFO: renamed from: h */
        public void m52474h() {
            RecyclerView recyclerView = this.f34153e;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.f34151c);
                return;
            }
            dhf dhfVar = new dhf(this.f34149a);
            this.f34156h = dhfVar;
            dhfVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ohf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f147438a.m52471e(dialogInterface);
                }
            });
            this.f34156h.m115795t(this.f34151c);
            this.f34156h.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public void m52463W4() {
        if (this.f34144F.size() == 0) {
            return;
        }
        ArrayList<C8807a> arrayList = this.f34144F;
        arrayList.remove(arrayList.get(arrayList.size() - 1));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exploop.inputitem.ExpProfileEditLoopBaseFrag
    /* JADX INFO: renamed from: O4 */
    public View mo52429O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        this.f34147I = recyclerView;
        return recyclerView;
    }

    /* JADX INFO: renamed from: X4 */
    public void m52464X4(String str) {
        int size = this.f34144F.size();
        List<String> list = this.f34145G.get(this.f34144F.size() - 1).get(str);
        if (jyb.m147479J(list)) {
            m52465Y4();
        } else {
            m52466Z4(size, list);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final void m52465Y4() {
        ExpProfileLoopCustomHomeTownTypeData expProfileLoopCustomHomeTownTypeData = this.f34148J;
        expProfileLoopCustomHomeTownTypeData.selectItem1 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem2 = "";
        expProfileLoopCustomHomeTownTypeData.selectItem3 = "";
        if (this.f34144F.size() == 3) {
            this.f34148J.selectItem3 = this.f34144F.get(2).f34152d;
        }
        if (this.f34144F.size() >= 2) {
            this.f34148J.selectItem2 = this.f34144F.get(1).f34152d;
        }
        if (this.f34144F.size() >= 1) {
            this.f34148J.selectItem1 = this.f34144F.get(0).f34152d;
        }
        jyb.m147537z(this.f34144F, new y20() { // from class: l.nhf
            @Override // p153l.y20
            public final void call(Object obj) {
                ((ExpProfileLoopCustomHomeTownTypeFrag.C8807a) obj).m52469c();
            }
        });
        m52426M4().m52414b2().m110171q0();
    }

    /* JADX INFO: renamed from: Z4 */
    public final void m52466Z4(int i, List<String> list) {
        C8807a c8807a = new C8807a(getContext(), new y20() { // from class: l.lhf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f132091a.m52464X4((String) obj);
            }
        }, new x20() { // from class: l.mhf
            @Override // p153l.x20
            public final void call() {
                this.f136846a.m52463W4();
            }
        });
        if (i == 0) {
            c8807a.m52473g(this.f34147I);
        }
        c8807a.m52472f(list, this.f34146H.get(i), this.f34145G.get(i));
        this.f34144F.add(c8807a);
        c8807a.m52474h();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f34148J = this.f34127A.getData().getCustomHomeTownType();
        this.f34147I.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f34147I.setOverScrollMode(0);
        this.f34145G.add(this.f34148J.firstMap);
        this.f34145G.add(this.f34148J.secondMap);
        this.f34145G.add(new HashMap());
        this.f34146H.add(this.f34148J.selectStr);
        this.f34146H.add(this.f34148J.selectItem2);
        this.f34146H.add(this.f34148J.selectItem3);
        m52466Z4(0, this.f34148J.list);
    }
}
