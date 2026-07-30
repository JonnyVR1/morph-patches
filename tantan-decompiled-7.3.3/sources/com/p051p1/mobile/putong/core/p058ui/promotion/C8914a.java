package com.p051p1.mobile.putong.core.p058ui.promotion;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.jic0;
import p153l.rec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8914a extends jic0<a> {

    /* JADX INFO: renamed from: c */
    public final Act f35173c;

    /* JADX INFO: renamed from: d */
    public final List<a> f35174d = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f35175a;

        /* JADX INFO: renamed from: b */
        public int f35176b;

        /* JADX INFO: renamed from: c */
        public String f35177c;

        /* JADX INFO: renamed from: d */
        public String f35178d;

        /* JADX INFO: renamed from: e */
        public boolean f35179e;

        /* JADX INFO: renamed from: a */
        public static a m54261a(String str, String str2, boolean z) {
            a aVar = new a();
            aVar.f35177c = str;
            aVar.f35178d = str2;
            aVar.f35179e = z;
            aVar.f35176b = 0;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        public static a m54262b(String str, String str2) {
            a aVar = new a();
            aVar.f35175a = str;
            aVar.f35177c = str2;
            aVar.f35176b = 1;
            return aVar;
        }
    }

    public C8914a(Act act) {
        this.f35173c = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.f35174d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        Act act = this.f35173c;
        return i != 1 ? act.inflater().inflate(rec0.f162435E1, viewGroup, false) : act.inflater().inflate(rec0.f162439F1, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, a aVar, int i, int i2) {
        if (i == 1) {
            ((PurchasePromotionTitleView) view).m54256a(aVar);
        } else {
            ((PurchasePromotionItemView) view).m54255n0(aVar);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a getItem(int i) {
        return this.f35174d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m54259G(List<C8915b.a> list) {
        this.f35174d.clear();
        for (C8915b.a aVar : list) {
            this.f35174d.add(a.m54262b(aVar.f35182b, aVar.f35181a));
            for (String str : aVar.f35183c) {
                User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
                this.f35174d.add(a.m54261a(aVar.f35181a, str, (str.contains("exceed23age") && NullChecker.m82486a(userM116600p9) && userM116600p9.age.intValue() < 23) || (str.contains("under23age") && NullChecker.m82486a(userM116600p9) && userM116600p9.age.intValue() >= 23)));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m54260H(List<C8915b.a> list) {
        m54259G(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f35176b;
    }
}
