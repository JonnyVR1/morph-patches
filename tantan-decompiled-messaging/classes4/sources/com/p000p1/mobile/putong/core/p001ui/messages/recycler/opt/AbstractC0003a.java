package com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt;

import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l.e30;
import l.upk0;
import l.vwb;
import p002l.coi0;
import p002l.hjc0;
import p002l.ja80;
import p002l.jjc0;
import p002l.t5e0;
import p002l.wgi0;
import p002l.xmr;
import p002l.xr2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0003a extends AbstractRunnableC0006d {

    /* JADX INFO: renamed from: h */
    public coi0 f43h;

    /* JADX INFO: renamed from: k */
    public TantanListView f46k;

    /* JADX INFO: renamed from: l */
    public jjc0 f47l;

    /* JADX INFO: renamed from: q */
    public int f52q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f53r = false;

    /* JADX INFO: renamed from: s */
    public boolean f54s = false;

    /* JADX INFO: renamed from: i */
    public List<hjc0> f44i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<hjc0> f45j = new ArrayList();

    /* JADX INFO: renamed from: m */
    public SparseArray<Object> f48m = new SparseArray<>();

    /* JADX INFO: renamed from: p */
    public ja80 f51p = new ja80();

    /* JADX INFO: renamed from: n */
    public t5e0 f49n = new t5e0(this.f51p);

    /* JADX INFO: renamed from: o */
    public t5e0 f50o = new t5e0(this.f51p);

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m56o(List list) {
        ListIterator listIterator = list.listIterator();
        AbstractC0005c abstractC0005c = null;
        while (listIterator.hasNext()) {
            AbstractC0005c abstractC0005c2 = (AbstractC0005c) listIterator.next();
            if (abstractC0005c2 instanceof AbstractC0005c.b) {
                listIterator.remove();
                abstractC0005c = abstractC0005c2;
            }
        }
        if (abstractC0005c != null) {
            list.add(0, abstractC0005c);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m57p() {
    }

    /* JADX INFO: renamed from: A */
    public boolean mo59A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final int m60B(String str, int i, int i2) {
        boolean z;
        if (m70L(str, i)) {
            return i;
        }
        boolean z2 = true;
        int i3 = 1;
        while (true) {
            z = false;
            if (i3 >= i2) {
                z2 = false;
                break;
            }
            if (m70L(str, i + i3)) {
                z = true;
                z2 = false;
                break;
            }
            if (m70L(str, i - i3)) {
                break;
            }
            i3++;
        }
        if (z2) {
            return i - i3;
        }
        if (z) {
            return i + i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: C */
    public final hjc0 m61C(int i, int i2, int i3) {
        hjc0 hjc0Var;
        int size = this.f45j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                hjc0Var = null;
                break;
            }
            hjc0Var = this.f45j.get(i4);
            boolean zMo11207z = this.f43h.mo11207z();
            coi0 coi0Var = this.f43h;
            if (zMo11207z) {
                if (TextUtils.equals(coi0Var.mo11201d(i), hjc0Var.f12076g.f22422b) && this.f43h.mo11203p(i) == hjc0Var.f12076g.f22423c) {
                    break;
                }
                i4++;
            } else {
                if (coi0Var.mo11203p(i) == hjc0Var.f12076g.f22423c) {
                    break;
                }
                i4++;
            }
        }
        if (hjc0Var != null) {
            this.f45j.remove(hjc0Var);
        }
        return hjc0Var;
    }

    /* JADX INFO: renamed from: D */
    public hjc0 m62D(int i, int i2, int i3) {
        hjc0 hjc0VarM61C = m61C(i, i2, i3);
        if (hjc0VarM61C != null) {
            System.currentTimeMillis();
            hjc0VarM61C.f12076g.f22423c = this.f43h.mo11203p(i);
            hjc0VarM61C.f12076g.f22422b = this.f43h.mo11201d(i);
            this.f43h.mo11205w(hjc0VarM61C.f12076g);
            m98u(hjc0VarM61C, "tempList begin");
            coi0 coi0Var = this.f43h;
            coi0Var.mo11199a(hjc0VarM61C.f12076g, i, coi0Var.mo11203p(i));
            m98u(hjc0VarM61C, "tempList end");
            m95r(i2, i3, hjc0VarM61C);
        }
        if (hjc0VarM61C == null) {
            hjc0VarM61C = m66H(i, i2, i3);
        }
        return hjc0VarM61C == null ? m103z(i, i2, i3) : hjc0VarM61C;
    }

    /* JADX INFO: renamed from: E */
    public hjc0 m63E() {
        return this.f44i.get(0);
    }

    /* JADX INFO: renamed from: F */
    public hjc0 m64F() {
        List<hjc0> list = this.f44i;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: G */
    public final void m65G() {
        if (this.f47l == null) {
            this.f47l = new jjc0();
            return;
        }
        boolean zIsEmpty = this.f44i.isEmpty();
        jjc0 jjc0Var = this.f47l;
        if (zIsEmpty) {
            jjc0Var.m15972b();
            this.f52q = 0;
            return;
        }
        jjc0Var.m15972b();
        this.f46k.getRenderContentHeight();
        hjc0 hjc0VarM63E = m63E();
        hjc0 hjc0VarM64F = m64F();
        int i = this.f52q;
        jjc0 jjc0Var2 = this.f47l;
        jjc0Var2.f13808a = hjc0VarM63E.f12075f;
        int i2 = hjc0VarM63E.f12070a;
        jjc0Var2.f13810c = i2 + i;
        jjc0Var2.f13811d = i2 + hjc0VarM63E.f12072c + i;
        jjc0Var2.f13809b = hjc0VarM63E.f12076g.f22422b;
        jjc0Var2.f13812e = hjc0VarM64F.f12075f;
        int i3 = hjc0VarM64F.f12070a;
        jjc0Var2.f13814g = i3 + i;
        jjc0Var2.f13815h = i3 + hjc0VarM64F.f12072c + i;
        jjc0Var2.f13813f = hjc0VarM64F.f12076g.f22422b;
        jjc0Var2.f13816i = i;
        this.f52q = 0;
        if (this.f44i.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < this.f44i.size() - 1; i4++) {
            hjc0 hjc0Var = this.f44i.get(i4);
            wgi0 wgi0VarM24597a = wgi0.m24597a();
            wgi0VarM24597a.m24599c(hjc0Var.f12071b, hjc0Var.f12070a + i, hjc0Var.f12072c, hjc0Var.f12075f, hjc0Var.f12076g.f22422b);
            this.f47l.m15971a(wgi0VarM24597a);
        }
    }

    /* JADX INFO: renamed from: H */
    public final hjc0 m66H(int i, int i2, int i3) {
        xr2 xr2VarM15781b = this.f51p.m15781b(this.f43h.mo11203p(i));
        if (xr2VarM15781b == null) {
            return null;
        }
        hjc0 hjc0VarM14414a = hjc0.m14414a();
        hjc0VarM14414a.f12076g = xr2VarM15781b;
        xr2VarM15781b.f22423c = this.f43h.mo11203p(i);
        hjc0VarM14414a.f12076g.f22422b = this.f43h.mo11201d(i);
        hjc0VarM14414a.f12075f = i;
        this.f43h.mo11205w(hjc0VarM14414a.f12076g);
        m98u(hjc0VarM14414a, "getRecyclerInfoFromPool begin");
        coi0 coi0Var = this.f43h;
        coi0Var.mo11199a(hjc0VarM14414a.f12076g, i, coi0Var.mo11203p(i));
        m98u(hjc0VarM14414a, "getRecyclerInfoFromPool end");
        m95r(i2, i3, hjc0VarM14414a);
        hjc0VarM14414a.f12077h = 1;
        System.currentTimeMillis();
        return hjc0VarM14414a;
    }

    /* JADX INFO: renamed from: I */
    public int m67I() {
        if (vwb.J(this.f44i)) {
            return 0;
        }
        return this.f44i.size();
    }

    /* JADX INFO: renamed from: J */
    public View m68J(int i) {
        if (i < 0 || i >= this.f44i.size()) {
            return null;
        }
        return this.f44i.get(i).f12076g.f22421a;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m69K(int i, List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m70L(String str, int i) {
        return i >= 0 && i < this.f43h.mo11202m() && TextUtils.equals(this.f43h.mo11201d(i), str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m71M(hjc0 hjc0Var) {
        this.f44i.add(hjc0Var);
        this.f46k.addView(hjc0Var.f12076g.f22421a);
        m81W("test add refresh");
    }

    /* JADX INFO: renamed from: N */
    public void m72N() {
        this.f54s = true;
        m82X();
        m102y();
        m90f0();
        m84Z();
        this.f47l.f13821n = this.f43h.mo11202m();
        this.f47l.f13822o = this.f46k.getRenderContentHeight();
        this.f46k.m40E("layoutAfterAnchor");
        this.f54s = false;
    }

    /* JADX INFO: renamed from: O */
    public void m73O(boolean z, int i, int i2, int i3, int i4) {
        xmr.m26036c("layoutChild");
        m81W("sys layout");
    }

    /* JADX INFO: renamed from: P */
    public void m74P() {
        this.f54s = true;
        if (this.f44i.size() > 0) {
            hjc0 hjc0Var = this.f44i.get(0);
            List<hjc0> list = this.f44i;
            hjc0 hjc0Var2 = list.get(list.size() - 1);
            int renderContentHeight = this.f46k.getRenderContentHeight();
            jjc0 jjc0Var = this.f47l;
            int i = jjc0Var.f13822o;
            jjc0Var.f13822o = renderContentHeight;
            if (renderContentHeight > i) {
                int i2 = this.f52q + (renderContentHeight - i);
                this.f52q = i2;
                int i3 = hjc0Var.f12070a;
                if (i2 + i3 > 0) {
                    int i4 = hjc0Var.f12075f - 1;
                    if (i4 >= 0) {
                        m92h0(i4, i3, this.f43h.mo11202m());
                    }
                    hjc0 hjc0Var3 = this.f44i.get(0);
                    if (hjc0Var3.f12075f == 0) {
                        int i5 = hjc0Var3.f12070a;
                        int i6 = this.f52q;
                        if (i5 + i6 > 0) {
                            this.f52q = i6 - (i5 + i6);
                        }
                    }
                }
            } else {
                int i7 = hjc0Var2.f12070a;
                int i8 = hjc0Var2.f12072c;
                int i9 = this.f52q;
                if ((i7 + i8 + i9 >= i && i7 + i8 + i9 > renderContentHeight) || (i7 + i8 + i9 < i && i7 + i8 + i9 > renderContentHeight)) {
                    this.f52q = i9 + (renderContentHeight - i);
                }
            }
        }
        this.f54s = false;
    }

    /* JADX INFO: renamed from: Q */
    public void m75Q() {
        xmr.m26036c("notifyDataChange");
        m132h(AbstractRunnableC0006d.f60f);
    }

    /* JADX INFO: renamed from: R */
    public void m76R(Runnable runnable, String str) {
        if (this.f46k.getRenderContentHeight() <= 0) {
            return;
        }
        xmr.m26036c("notifyDataChangeInner ------- begin from: " + str);
        this.f54s = true;
        m102y();
        m65G();
        m82X();
        m96s(runnable);
        m90f0();
        mo59A();
        m84Z();
        m83Y("notifyDataChangeInner", true);
        this.f54s = false;
        m100w();
        xmr.m26036c("notifyDataChangeInner ------- end from: " + str);
    }

    /* JADX INFO: renamed from: S */
    public final void m77S(String str) {
        m76R(null, str);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[SYNTHETIC] */
    /* JADX INFO: renamed from: T */
    public final void m78T(List<Integer> list) {
        ListIterator<hjc0> listIterator;
        int i;
        hjc0 next;
        if (list == null || list.isEmpty()) {
            return;
        }
        xmr.m26036c("notifyItemIndex");
        boolean z = true;
        this.f54s = true;
        if (this.f53r) {
            int renderContentHeight = this.f46k.getRenderContentHeight();
            int realWidth = this.f46k.getRealWidth();
            hjc0 hjc0Var = this.f44i.get(0);
            List<hjc0> list2 = this.f44i;
            hjc0 hjc0Var2 = list2.get(list2.size() - 1);
            if (hjc0Var.f12075f == 0 && hjc0Var.f12070a + this.f52q == 0) {
                if (hjc0Var2.f12075f == this.f43h.mo11202m() - 1 && hjc0Var2.f12070a + hjc0Var2.f12072c <= renderContentHeight) {
                }
                if (!z) {
                    Collections.reverse(this.f44i);
                }
                listIterator = this.f44i.listIterator();
                if (z) {
                    i = hjc0Var.f12070a;
                } else {
                    i = hjc0Var2.f12070a + hjc0Var2.f12072c;
                }
                while (listIterator.hasNext()) {
                    next = listIterator.next();
                    if (m69K(next.f12075f, list)) {
                        m95r(realWidth, renderContentHeight, next);
                    }
                    if (z) {
                        next.f12070a = i;
                        i += next.f12072c;
                    } else {
                        i -= next.f12072c;
                        next.f12070a = i;
                    }
                }
                if (!z) {
                    Collections.reverse(this.f44i);
                }
                m83Y("notify notifyItemIndex", false);
            } else {
                int i2 = hjc0Var2.f12070a + hjc0Var2.f12072c;
            }
            z = false;
            if (!z) {
                Collections.reverse(this.f44i);
            }
            listIterator = this.f44i.listIterator();
            if (z) {
                i = hjc0Var.f12070a;
            } else {
                i = hjc0Var2.f12070a + hjc0Var2.f12072c;
            }
            while (listIterator.hasNext()) {
                next = listIterator.next();
                if (m69K(next.f12075f, list)) {
                    m95r(realWidth, renderContentHeight, next);
                }
                if (z) {
                    next.f12070a = i;
                    i += next.f12072c;
                } else {
                    i -= next.f12072c;
                    next.f12070a = i;
                }
            }
            if (!z) {
                Collections.reverse(this.f44i);
            }
            m83Y("notify notifyItemIndex", false);
        }
        this.f54s = false;
    }

    /* JADX INFO: renamed from: U */
    public void mo79U() {
        xmr.m26036c("Manager onRequest:" + this.f54s);
        if (this.f54s) {
            return;
        }
        int size = this.f44i.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            hjc0 hjc0Var = this.f44i.get(i);
            if (hjc0Var.f12076g.f22421a.isLayoutRequested()) {
                arrayList.add(Integer.valueOf(hjc0Var.f12075f));
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        xmr.m26035b("TantanListView", "item real Request");
        xmr.m26036c("Manager onRequest doing:" + arrayList.size());
        AbstractC0005c.b bVar = new AbstractC0005c.b();
        bVar.m128b(arrayList);
        m133i(bVar, new e30() { // from class: l.kn2
            public final void call(Object obj) {
                AbstractC0003a.m56o((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m80V() {
        if (vwb.J(this.f44i)) {
            return;
        }
        int realWidth = this.f46k.getRealWidth();
        int renderContentHeight = this.f46k.getRenderContentHeight();
        Iterator<hjc0> it = this.f44i.iterator();
        while (it.hasNext()) {
            m95r(realWidth, renderContentHeight, it.next());
        }
    }

    /* JADX INFO: renamed from: W */
    public void m81W(String str) {
        xmr.m26036c("realLayoutItem：" + str);
        for (int i = 0; i < this.f44i.size(); i++) {
            hjc0 hjc0Var = this.f44i.get(i);
            View view = hjc0Var.f12076g.f22421a;
            int i2 = hjc0Var.f12071b;
            int i3 = hjc0Var.f12070a;
            int i4 = this.f52q;
            view.layout(i2, i3 + i4, hjc0Var.f12073d + i2, i3 + hjc0Var.f12072c + i4);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m82X() {
        List<hjc0> list = this.f44i;
        if (list != null && list.size() > 0) {
            for (hjc0 hjc0Var : this.f44i) {
                if (hjc0Var.f12077h == 3) {
                    hjc0Var.f12077h = 4;
                }
                if (hjc0Var.f12076g == null) {
                    xmr.m26035b("TantanListView", "temList hold add null：----------------");
                }
                this.f45j.add(hjc0Var);
            }
        }
        this.f44i.clear();
    }

    /* JADX INFO: renamed from: Y */
    public void m83Y(String str, boolean z) {
        xmr.m26036c("requestInner from: " + str);
        if (z) {
            this.f47l.f13821n = this.f43h.mo11202m();
            this.f47l.f13822o = this.f46k.getRenderContentHeight();
        }
        this.f46k.m40E("request inner " + str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m84Z() {
        List<hjc0> list = this.f45j;
        if (list == null || list.size() <= 0) {
            return;
        }
        ListIterator<hjc0> listIterator = this.f45j.listIterator();
        while (listIterator.hasNext()) {
            hjc0 next = listIterator.next();
            listIterator.remove();
            this.f49n.m22796d(next, this.f43h);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m85a0(coi0 coi0Var) {
        this.f43h = coi0Var;
        coi0Var.m11206y(this);
    }

    /* JADX INFO: renamed from: b0 */
    public void m86b0(boolean z) {
        this.f53r = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m87c0(TantanListView tantanListView) {
        this.f46k = tantanListView;
        mo94n(tantanListView);
        this.f49n.m22797e(tantanListView);
        this.f50o.m22797e(tantanListView);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m88d0(int i, int i2) {
        this.f54s = true;
        boolean zM99v = i > 0 ? m99v(i, i2) : m99v(i, i2);
        this.f46k.m40E("scroll");
        this.f54s = false;
        return zM99v;
    }

    /* JADX INFO: renamed from: e0 */
    public void m89e0() {
        if (this.f44i.isEmpty()) {
            return;
        }
        m77S("test notify");
        List<hjc0> list = this.f44i;
        final hjc0 hjc0Var = list.get(list.size() - 1);
        this.f44i.remove(hjc0Var);
        this.f46k.removeView(hjc0Var.f12076g.f22421a);
        m81W("test remove refresh");
        this.f46k.postDelayed(new Runnable() { // from class: l.mn2
            @Override // java.lang.Runnable
            public final void run() {
                this.f15489a.m71M(hjc0Var);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m90f0() {
        System.currentTimeMillis();
        int iMo11202m = this.f43h.mo11202m();
        int renderContentHeight = this.f46k.getRenderContentHeight();
        int measuredWidth = this.f46k.getMeasuredWidth();
        int i = this.f47l.f13818k;
        if (i == -1) {
            return;
        }
        hjc0 hjc0VarM62D = m62D(i, measuredWidth, renderContentHeight);
        hjc0VarM62D.f12071b = 0;
        jjc0 jjc0Var = this.f47l;
        if (jjc0Var.f13820m) {
            hjc0VarM62D.f12070a = jjc0Var.f13819l;
        } else {
            hjc0VarM62D.f12070a = jjc0Var.f13819l - hjc0VarM62D.f12072c;
        }
        int i2 = hjc0VarM62D.f12077h;
        if (i2 == 1) {
            this.f46k.addView(hjc0VarM62D.f12076g.f22421a, 0);
        } else if (i2 == 2) {
            TantanListView tantanListView = this.f46k;
            View view = hjc0VarM62D.f12076g.f22421a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        hjc0VarM62D.f12077h = 3;
        hjc0VarM62D.f12075f = i;
        m101x(hjc0VarM62D);
        this.f44i.add(hjc0VarM62D);
        boolean z = this.f53r;
        int i3 = hjc0VarM62D.f12070a;
        if (z) {
            m91g0(i + 1, i3 + hjc0VarM62D.f12072c, iMo11202m, renderContentHeight);
            if (!this.f44i.isEmpty()) {
                List<hjc0> list = this.f44i;
                hjc0 hjc0Var = list.get(list.size() - 1);
                int i4 = hjc0Var.f12070a;
                int i5 = hjc0Var.f12072c;
                int i6 = this.f52q;
                if (i4 + i5 + i6 < renderContentHeight) {
                    this.f52q = i6 + (renderContentHeight - ((i4 + i5) + i6));
                }
            }
            m92h0(i - 1, hjc0VarM62D.f12070a, iMo11202m);
        } else {
            m92h0(i - 1, i3, iMo11202m);
            m91g0(i + 1, hjc0VarM62D.f12070a + hjc0VarM62D.f12072c, iMo11202m, renderContentHeight);
        }
        if (!this.f53r || this.f44i.isEmpty()) {
            return;
        }
        List<hjc0> list2 = this.f44i;
        hjc0 hjc0Var2 = list2.get(list2.size() - 1);
        int i7 = this.f44i.get(0).f12070a;
        int i8 = this.f52q;
        if (i7 + i8 > 0) {
            this.f52q = i8 - (i7 + i8);
            m91g0(hjc0Var2.f12075f + 1, hjc0Var2.f12070a + hjc0Var2.f12072c, iMo11202m, renderContentHeight);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m91g0(int i, int i2, int i3, int i4) {
        if (this.f52q + i2 >= i4 || i < 0 || i >= i3) {
            return;
        }
        hjc0 hjc0VarM62D = m62D(i, this.f46k.getMeasuredWidth(), i4);
        hjc0VarM62D.f12071b = 0;
        hjc0VarM62D.f12070a = i2;
        int i5 = hjc0VarM62D.f12077h;
        if (i5 == 1) {
            this.f46k.addView(hjc0VarM62D.f12076g.f22421a);
        } else if (i5 == 2) {
            this.f46k.attachViewToParent(hjc0VarM62D.f12076g.f22421a, this.f44i.size() - 1, hjc0VarM62D.f12076g.f22421a.getLayoutParams());
        }
        hjc0VarM62D.f12077h = 3;
        hjc0VarM62D.f12075f = i;
        m101x(hjc0VarM62D);
        this.f44i.add(hjc0VarM62D);
        m91g0(i + 1, hjc0VarM62D.f12070a + hjc0VarM62D.f12072c, i3, i4);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m92h0(int i, int i2, int i3) {
        if (this.f52q + i2 <= 0 || i < 0 || i >= i3) {
            return;
        }
        hjc0 hjc0VarM62D = m62D(i, this.f46k.getMeasuredWidth(), this.f46k.getRenderContentHeight());
        hjc0VarM62D.f12071b = 0;
        hjc0VarM62D.f12070a = i2 - hjc0VarM62D.f12072c;
        int i4 = hjc0VarM62D.f12077h;
        if (i4 == 1) {
            this.f46k.addView(hjc0VarM62D.f12076g.f22421a, 0);
        } else if (i4 == 2) {
            TantanListView tantanListView = this.f46k;
            View view = hjc0VarM62D.f12076g.f22421a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        hjc0VarM62D.f12077h = 3;
        hjc0VarM62D.f12075f = i;
        m101x(hjc0VarM62D);
        this.f44i.add(0, hjc0VarM62D);
        m101x(hjc0VarM62D);
        m92h0(i - 1, hjc0VarM62D.f12070a, i3);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d, android.os.Handler.Callback
    public /* bridge */ /* synthetic */ boolean handleMessage(@NonNull Message message) {
        return super.handleMessage(message);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d
    /* JADX INFO: renamed from: j */
    public void mo93j(AbstractC0005c abstractC0005c) {
        if (abstractC0005c == AbstractRunnableC0006d.f60f) {
            this.f46k.postDelayed(new Runnable() { // from class: l.ln2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0003a.m57p();
                }
            }, 1000L);
            m77S("action");
        } else if (abstractC0005c instanceof AbstractC0005c.b) {
            List<Integer> list = ((AbstractC0005c.b) abstractC0005c).f57a;
            if (list != null && list.size() > 0) {
                xmr.m26035b("TantanListView", "notifyItemIndex **************************");
                m78T(list);
            }
            m130e();
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo94n(View view) {
        super.mo94n(view);
    }

    /* JADX INFO: renamed from: r */
    public final void m95r(int i, int i2, hjc0 hjc0Var) {
        ViewGroup.LayoutParams layoutParams = hjc0Var.f12076g.f22421a.getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            hjc0Var.f12076g.f22421a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
        } else {
            hjc0Var.f12076g.f22421a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        }
        int measuredWidth = hjc0Var.f12076g.f22421a.getMeasuredWidth();
        int measuredHeight = hjc0Var.f12076g.f22421a.getMeasuredHeight();
        hjc0Var.f12073d = measuredWidth;
        hjc0Var.f12072c = measuredHeight;
        if (hjc0Var.f12076g.f22421a.getVisibility() == 8) {
            hjc0Var.f12073d = 0;
            hjc0Var.f12072c = 0;
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractRunnableC0006d, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* JADX INFO: renamed from: s */
    public final void m96s(Runnable runnable) {
        int i;
        int renderContentHeight = this.f46k.getRenderContentHeight();
        jjc0 jjc0Var = this.f47l;
        float f = jjc0Var.f13815h;
        float f2 = jjc0Var.f13810c;
        if (this.f53r) {
            int i2 = jjc0Var.f13808a;
            if (i2 == -1 && jjc0Var.f13812e == -1) {
                jjc0Var.f13820m = false;
                jjc0Var.f13819l = renderContentHeight;
                int iMo11202m = this.f43h.mo11202m();
                jjc0 jjc0Var2 = this.f47l;
                if (iMo11202m == 0) {
                    jjc0Var2.f13818k = -1;
                    jjc0Var2.f13817j = "";
                } else {
                    jjc0Var2.f13818k = this.f43h.mo11202m() - 1;
                    jjc0 jjc0Var3 = this.f47l;
                    jjc0Var3.f13817j = this.f43h.mo11201d(jjc0Var3.f13818k);
                }
            } else if (i2 == 0 && (i = jjc0Var.f13812e) == jjc0Var.f13821n - 1 && f2 == 0.0f && f <= renderContentHeight) {
                jjc0Var.f13820m = false;
                jjc0Var.f13819l = (int) f;
                jjc0Var.f13818k = i;
                jjc0Var.f13817j = jjc0Var.f13813f;
                m97t(jjc0Var);
            } else {
                float f3 = renderContentHeight;
                if (f >= f3) {
                    jjc0Var.f13820m = true;
                    jjc0Var.f13819l = jjc0Var.f13814g;
                    if (f == f3 && jjc0Var.f13812e == this.f43h.mo11202m() - 1) {
                        this.f47l.f13823p = AbstractRunnableC0006d.f61g;
                    }
                    jjc0 jjc0Var4 = this.f47l;
                    jjc0Var4.f13818k = jjc0Var4.f13812e;
                    jjc0Var4.f13817j = jjc0Var4.f13813f;
                    m97t(jjc0Var4);
                } else if (f < f3) {
                    jjc0Var.f13820m = true;
                    jjc0Var.f13819l = jjc0Var.f13814g;
                    if (f == f3) {
                        jjc0Var.f13823p = AbstractRunnableC0006d.f61g;
                    }
                    jjc0Var.f13818k = jjc0Var.f13812e;
                    jjc0Var.f13817j = jjc0Var.f13813f;
                    m97t(jjc0Var);
                }
            }
        } else {
            int i3 = jjc0Var.f13808a;
            if (i3 >= 0 && i3 < this.f43h.mo11202m() && TextUtils.equals(this.f43h.mo11201d(i3), this.f47l.f13809b)) {
                jjc0 jjc0Var5 = this.f47l;
                jjc0Var5.f13817j = jjc0Var5.f13809b;
                jjc0Var5.f13818k = jjc0Var5.f13808a;
                jjc0Var5.f13820m = false;
                jjc0Var5.f13819l = jjc0Var5.f13811d;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        xmr.m26036c("##### calculate info :" + this.f47l.f13822o + " , " + this.f47l.f13815h + " , " + this.f47l.f13821n);
        jjc0 jjc0Var6 = this.f47l;
        int i4 = jjc0Var6.f13822o;
        if (i4 > 0) {
            renderContentHeight = i4;
        }
        if (jjc0Var6.f13815h > renderContentHeight || jjc0Var6.f13812e != jjc0Var6.f13821n - 1) {
            return;
        }
        jjc0Var6.f13823p = AbstractRunnableC0006d.f61g;
    }

    /* JADX INFO: renamed from: t */
    public final void m97t(jjc0 jjc0Var) {
        boolean z;
        int iM60B;
        int iMo11202m = this.f43h.mo11202m() > jjc0Var.f13821n ? this.f43h.mo11202m() - jjc0Var.f13821n : 0;
        int iM60B2 = m60B(jjc0Var.f13817j, jjc0Var.f13818k + iMo11202m, 20);
        if (iM60B2 >= 0) {
            jjc0Var.f13818k = iM60B2;
            return;
        }
        List<wgi0> list = jjc0Var.f13824q;
        if (jjc0Var.f13818k == jjc0Var.f13812e) {
            Collections.reverse(list);
            z = true;
        } else {
            z = false;
        }
        int renderContentHeight = this.f46k.getRenderContentHeight();
        for (wgi0 wgi0Var : list) {
            int i = wgi0Var.f21757d;
            if (i != jjc0Var.f13818k && (iM60B = m60B(wgi0Var.f21758e, i + iMo11202m, 20)) >= 0) {
                jjc0Var.f13818k = iM60B;
                jjc0Var.f13817j = wgi0Var.f21758e;
                int i2 = wgi0Var.f21755b;
                int i3 = wgi0Var.f21756c + i2;
                if (z) {
                    if (i3 < renderContentHeight) {
                        jjc0Var.f13820m = false;
                        jjc0Var.f13819l = i3;
                        return;
                    } else {
                        jjc0Var.f13820m = true;
                        jjc0Var.f13819l = i2;
                        return;
                    }
                }
                if (i2 < 0) {
                    jjc0Var.f13820m = false;
                    jjc0Var.f13819l = i3;
                    return;
                } else {
                    jjc0Var.f13820m = true;
                    jjc0Var.f13819l = i2;
                    return;
                }
            }
        }
        if (list.size() == 0 || this.f43h.mo11202m() == 0) {
            this.f47l.m15972b();
            return;
        }
        boolean z2 = this.f53r;
        jjc0 jjc0Var2 = this.f47l;
        if (z2) {
            jjc0Var2.f13820m = false;
            jjc0Var2.f13819l = renderContentHeight;
            jjc0Var2.f13818k = this.f43h.mo11202m() - 1;
            this.f47l.f13817j = "";
            return;
        }
        jjc0Var2.f13820m = true;
        jjc0Var2.f13819l = 0;
        jjc0Var2.f13818k = 0;
        jjc0Var2.f13817j = "";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7911. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: v */
    public boolean m99v(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p000p1.mobile.putong.core.p001ui.messages.recycler.opt.AbstractC0003a.m99v(int, int):boolean");
    }

    /* JADX INFO: renamed from: w */
    public final void m100w() {
        if (NullChecker.a(this.f47l.f13823p) && !vwb.J(this.f44i)) {
            List<hjc0> list = this.f44i;
            hjc0 hjc0Var = list.get(list.size() - 1);
            if (hjc0Var.f12070a + hjc0Var.f12072c + this.f52q >= this.f46k.getRenderContentHeight() || (this.f47l.f13823p instanceof AbstractC0005c.e)) {
                m132h(this.f47l.f13823p);
                return;
            }
        }
        m130e();
    }

    /* JADX INFO: renamed from: x */
    public final void m101x(hjc0 hjc0Var) {
        if (hjc0Var.f12076g != null) {
            return;
        }
        xmr.m26035b("TantanListView", "错误的添加item-------------");
        upk0.a("错误的添加item-------------");
    }

    /* JADX INFO: renamed from: y */
    public void m102y() {
        xmr.m26035b("TantanListView", "移出item 清除scroll cache ");
        this.f49n.m22794b(this.f43h);
        this.f50o.m22794b(this.f43h);
    }

    /* JADX INFO: renamed from: z */
    public final hjc0 m103z(int i, int i2, int i3) {
        hjc0 hjc0Var = new hjc0();
        coi0 coi0Var = this.f43h;
        xr2 xr2VarMo11200b = coi0Var.mo11200b(i, this.f46k, coi0Var.mo11203p(i));
        xr2VarMo11200b.f22423c = this.f43h.mo11203p(i);
        xr2VarMo11200b.f22422b = this.f43h.mo11201d(i);
        hjc0Var.f12076g = xr2VarMo11200b;
        this.f43h.mo11205w(xr2VarMo11200b);
        m98u(hjc0Var, "createInfoByAdapter begin");
        coi0 coi0Var2 = this.f43h;
        coi0Var2.mo11199a(xr2VarMo11200b, i, coi0Var2.mo11203p(i));
        m98u(hjc0Var, "createInfoByAdapter end");
        m95r(i2, i3, hjc0Var);
        return hjc0Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m98u(hjc0 hjc0Var, String str) {
    }
}
