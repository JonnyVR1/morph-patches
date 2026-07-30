package com.p046p1.mobile.putong.core.p053ui.promotion;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.dac0;
import p149l.m6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a */
/* JADX INFO: loaded from: classes4.dex */
public class C8751a extends dac0<a> {

    /* JADX INFO: renamed from: c */
    public final Act f34325c;

    /* JADX INFO: renamed from: d */
    public final List<a> f34326d = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f34327a;

        /* JADX INFO: renamed from: b */
        public int f34328b;

        /* JADX INFO: renamed from: c */
        public String f34329c;

        /* JADX INFO: renamed from: d */
        public String f34330d;

        /* JADX INFO: renamed from: e */
        public boolean f34331e;

        /* JADX INFO: renamed from: a */
        public static a m53078a(String str, String str2, boolean z) {
            a aVar = new a();
            aVar.f34329c = str;
            aVar.f34330d = str2;
            aVar.f34331e = z;
            aVar.f34328b = 0;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        public static a m53079b(String str, String str2) {
            a aVar = new a();
            aVar.f34327a = str;
            aVar.f34329c = str2;
            aVar.f34328b = 1;
            return aVar;
        }
    }

    public C8751a(Act act) {
        this.f34325c = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.f34326d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        Act act = this.f34325c;
        return i != 1 ? act.inflater().inflate(m6c0.f131475E1, viewGroup, false) : act.inflater().inflate(m6c0.f131479F1, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, a aVar, int i, int i2) {
        if (i == 1) {
            ((PurchasePromotionTitleView) view).m53073a(aVar);
        } else {
            ((PurchasePromotionItemView) view).m53072n0(aVar);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a getItem(int i) {
        return this.f34326d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m53076G(List<C8752b.a> list) {
        this.f34326d.clear();
        for (C8752b.a aVar : list) {
            this.f34326d.add(a.m53079b(aVar.f34334b, aVar.f34333a));
            for (String str : aVar.f34335c) {
                User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
                this.f34326d.add(a.m53078a(aVar.f34333a, str, (str.contains("exceed23age") && NullChecker.m81303a(userM169527p9) && userM169527p9.age.intValue() < 23) || (str.contains("under23age") && NullChecker.m81303a(userM169527p9) && userM169527p9.age.intValue() >= 23)));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m53077H(List<C8752b.a> list) {
        m53076G(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f34328b;
    }
}
