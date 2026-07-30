package com.p000p1.mobile.putong.core.p001ui.promotion;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.m6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0176a extends dac0<a> {

    /* JADX INFO: renamed from: c */
    public final Act f2147c;

    /* JADX INFO: renamed from: d */
    public final List<a> f2148d = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.promotion.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public String f2149a;

        /* JADX INFO: renamed from: b */
        public int f2150b;

        /* JADX INFO: renamed from: c */
        public String f2151c;

        /* JADX INFO: renamed from: d */
        public String f2152d;

        /* JADX INFO: renamed from: e */
        public boolean f2153e;

        /* JADX INFO: renamed from: a */
        public static a m3641a(String str, String str2, boolean z) {
            a aVar = new a();
            aVar.f2151c = str;
            aVar.f2152d = str2;
            aVar.f2153e = z;
            aVar.f2150b = 0;
            return aVar;
        }

        /* JADX INFO: renamed from: b */
        public static a m3642b(String str, String str2) {
            a aVar = new a();
            aVar.f2149a = str;
            aVar.f2151c = str2;
            aVar.f2150b = 1;
            return aVar;
        }
    }

    public C0176a(Act act) {
        this.f2147c = act;
    }

    /* JADX INFO: renamed from: C */
    public int m3635C() {
        return this.f2148d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m3636D(ViewGroup viewGroup, int i) {
        Act act = this.f2147c;
        return i != 1 ? act.inflater().inflate(m6c0.E1, viewGroup, false) : act.inflater().inflate(m6c0.F1, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m3634A(View view, a aVar, int i, int i2) {
        if (i == 1) {
            ((PurchasePromotionTitleView) view).m3633a(aVar);
        } else {
            ((PurchasePromotionItemView) view).m3632n0(aVar);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a getItem(int i) {
        return this.f2148d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public final void m3639G(List<C0177b.a> list) {
        this.f2148d.clear();
        for (C0177b.a aVar : list) {
            this.f2148d.add(a.m3642b(aVar.f2156b, aVar.f2155a));
            for (String str : aVar.f2157c) {
                User userP9 = CoreModule.c.e0.p9();
                this.f2148d.add(a.m3641a(aVar.f2155a, str, (str.contains("exceed23age") && NullChecker.a(userP9) && userP9.age.intValue() < 23) || (str.contains("under23age") && NullChecker.a(userP9) && userP9.age.intValue() >= 23)));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m3640H(List<C0177b.a> list) {
        m3639G(list);
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return getItem(i).f2150b;
    }
}
