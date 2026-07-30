package com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt;

import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p149l.coi0;
import p149l.e30;
import p149l.hjc0;
import p149l.ja80;
import p149l.jjc0;
import p149l.t5e0;
import p149l.upk0;
import p149l.vwb;
import p149l.wgi0;
import p149l.xmr;
import p149l.xr2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8578a extends AbstractRunnableC8581d {

    /* JADX INFO: renamed from: h */
    public coi0 f32221h;

    /* JADX INFO: renamed from: k */
    public TantanListView f32224k;

    /* JADX INFO: renamed from: l */
    public jjc0 f32225l;

    /* JADX INFO: renamed from: q */
    public int f32230q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f32231r = false;

    /* JADX INFO: renamed from: s */
    public boolean f32232s = false;

    /* JADX INFO: renamed from: i */
    public List<hjc0> f32222i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<hjc0> f32223j = new ArrayList();

    /* JADX INFO: renamed from: m */
    public SparseArray<Object> f32226m = new SparseArray<>();

    /* JADX INFO: renamed from: p */
    public ja80 f32229p = new ja80();

    /* JADX INFO: renamed from: n */
    public t5e0 f32227n = new t5e0(this.f32229p);

    /* JADX INFO: renamed from: o */
    public t5e0 f32228o = new t5e0(this.f32229p);

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m49642o(List list) {
        ListIterator listIterator = list.listIterator();
        AbstractC8580c abstractC8580c = null;
        while (listIterator.hasNext()) {
            AbstractC8580c abstractC8580c2 = (AbstractC8580c) listIterator.next();
            if (abstractC8580c2 instanceof AbstractC8580c.b) {
                listIterator.remove();
                abstractC8580c = abstractC8580c2;
            }
        }
        if (abstractC8580c != null) {
            list.add(0, abstractC8580c);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m49643p() {
    }

    /* JADX INFO: renamed from: A */
    public boolean mo49645A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final int m49646B(String str, int i, int i2) {
        boolean z;
        if (m49656L(str, i)) {
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
            if (m49656L(str, i + i3)) {
                z = true;
                z2 = false;
                break;
            }
            if (m49656L(str, i - i3)) {
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
    public final hjc0 m49647C(int i, int i2, int i3) {
        hjc0 hjc0Var;
        int size = this.f32223j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                hjc0Var = null;
                break;
            }
            hjc0Var = this.f32223j.get(i4);
            boolean zMo108018z = this.f32221h.mo108018z();
            coi0 coi0Var = this.f32221h;
            if (zMo108018z) {
                if (TextUtils.equals(coi0Var.mo108012d(i), hjc0Var.f108066g.f194079b) && this.f32221h.mo108014p(i) == hjc0Var.f108066g.f194080c) {
                    break;
                }
                i4++;
            } else {
                if (coi0Var.mo108014p(i) == hjc0Var.f108066g.f194080c) {
                    break;
                }
                i4++;
            }
        }
        if (hjc0Var != null) {
            this.f32223j.remove(hjc0Var);
        }
        return hjc0Var;
    }

    /* JADX INFO: renamed from: D */
    public hjc0 m49648D(int i, int i2, int i3) {
        hjc0 hjc0VarM49647C = m49647C(i, i2, i3);
        if (hjc0VarM49647C != null) {
            System.currentTimeMillis();
            hjc0VarM49647C.f108066g.f194080c = this.f32221h.mo108014p(i);
            hjc0VarM49647C.f108066g.f194079b = this.f32221h.mo108012d(i);
            this.f32221h.mo108016w(hjc0VarM49647C.f108066g);
            m49684u(hjc0VarM49647C, "tempList begin");
            coi0 coi0Var = this.f32221h;
            coi0Var.mo108010a(hjc0VarM49647C.f108066g, i, coi0Var.mo108014p(i));
            m49684u(hjc0VarM49647C, "tempList end");
            m49681r(i2, i3, hjc0VarM49647C);
        }
        if (hjc0VarM49647C == null) {
            hjc0VarM49647C = m49652H(i, i2, i3);
        }
        return hjc0VarM49647C == null ? m49689z(i, i2, i3) : hjc0VarM49647C;
    }

    /* JADX INFO: renamed from: E */
    public hjc0 m49649E() {
        return this.f32222i.get(0);
    }

    /* JADX INFO: renamed from: F */
    public hjc0 m49650F() {
        List<hjc0> list = this.f32222i;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: G */
    public final void m49651G() {
        if (this.f32225l == null) {
            this.f32225l = new jjc0();
            return;
        }
        boolean zIsEmpty = this.f32222i.isEmpty();
        jjc0 jjc0Var = this.f32225l;
        if (zIsEmpty) {
            jjc0Var.m141789b();
            this.f32230q = 0;
            return;
        }
        jjc0Var.m141789b();
        this.f32224k.getRenderContentHeight();
        hjc0 hjc0VarM49649E = m49649E();
        hjc0 hjc0VarM49650F = m49650F();
        int i = this.f32230q;
        jjc0 jjc0Var2 = this.f32225l;
        jjc0Var2.f118257a = hjc0VarM49649E.f108065f;
        int i2 = hjc0VarM49649E.f108060a;
        jjc0Var2.f118259c = i2 + i;
        jjc0Var2.f118260d = i2 + hjc0VarM49649E.f108062c + i;
        jjc0Var2.f118258b = hjc0VarM49649E.f108066g.f194079b;
        jjc0Var2.f118261e = hjc0VarM49650F.f108065f;
        int i3 = hjc0VarM49650F.f108060a;
        jjc0Var2.f118263g = i3 + i;
        jjc0Var2.f118264h = i3 + hjc0VarM49650F.f108062c + i;
        jjc0Var2.f118262f = hjc0VarM49650F.f108066g.f194079b;
        jjc0Var2.f118265i = i;
        this.f32230q = 0;
        if (this.f32222i.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < this.f32222i.size() - 1; i4++) {
            hjc0 hjc0Var = this.f32222i.get(i4);
            wgi0 wgi0VarM203055a = wgi0.m203055a();
            wgi0VarM203055a.m203057c(hjc0Var.f108061b, hjc0Var.f108060a + i, hjc0Var.f108062c, hjc0Var.f108065f, hjc0Var.f108066g.f194079b);
            this.f32225l.m141788a(wgi0VarM203055a);
        }
    }

    /* JADX INFO: renamed from: H */
    public final hjc0 m49652H(int i, int i2, int i3) {
        xr2 xr2VarM140691b = this.f32229p.m140691b(this.f32221h.mo108014p(i));
        if (xr2VarM140691b == null) {
            return null;
        }
        hjc0 hjc0VarM131366a = hjc0.m131366a();
        hjc0VarM131366a.f108066g = xr2VarM140691b;
        xr2VarM140691b.f194080c = this.f32221h.mo108014p(i);
        hjc0VarM131366a.f108066g.f194079b = this.f32221h.mo108012d(i);
        hjc0VarM131366a.f108065f = i;
        this.f32221h.mo108016w(hjc0VarM131366a.f108066g);
        m49684u(hjc0VarM131366a, "getRecyclerInfoFromPool begin");
        coi0 coi0Var = this.f32221h;
        coi0Var.mo108010a(hjc0VarM131366a.f108066g, i, coi0Var.mo108014p(i));
        m49684u(hjc0VarM131366a, "getRecyclerInfoFromPool end");
        m49681r(i2, i3, hjc0VarM131366a);
        hjc0VarM131366a.f108067h = 1;
        System.currentTimeMillis();
        return hjc0VarM131366a;
    }

    /* JADX INFO: renamed from: I */
    public int m49653I() {
        if (vwb.m200296J(this.f32222i)) {
            return 0;
        }
        return this.f32222i.size();
    }

    /* JADX INFO: renamed from: J */
    public View m49654J(int i) {
        if (i < 0 || i >= this.f32222i.size()) {
            return null;
        }
        return this.f32222i.get(i).f108066g.f194078a;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m49655K(int i, List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m49656L(String str, int i) {
        return i >= 0 && i < this.f32221h.mo108013m() && TextUtils.equals(this.f32221h.mo108012d(i), str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m49657M(hjc0 hjc0Var) {
        this.f32222i.add(hjc0Var);
        this.f32224k.addView(hjc0Var.f108066g.f194078a);
        m49667W("test add refresh");
    }

    /* JADX INFO: renamed from: N */
    public void m49658N() {
        this.f32232s = true;
        m49668X();
        m49688y();
        m49676f0();
        m49670Z();
        this.f32225l.f118270n = this.f32221h.mo108013m();
        this.f32225l.f118271o = this.f32224k.getRenderContentHeight();
        this.f32224k.m49626E("layoutAfterAnchor");
        this.f32232s = false;
    }

    /* JADX INFO: renamed from: O */
    public void m49659O(boolean z, int i, int i2, int i3, int i4) {
        xmr.m210147c("layoutChild");
        m49667W("sys layout");
    }

    /* JADX INFO: renamed from: P */
    public void m49660P() {
        this.f32232s = true;
        if (this.f32222i.size() > 0) {
            hjc0 hjc0Var = this.f32222i.get(0);
            List<hjc0> list = this.f32222i;
            hjc0 hjc0Var2 = list.get(list.size() - 1);
            int renderContentHeight = this.f32224k.getRenderContentHeight();
            jjc0 jjc0Var = this.f32225l;
            int i = jjc0Var.f118271o;
            jjc0Var.f118271o = renderContentHeight;
            if (renderContentHeight > i) {
                int i2 = this.f32230q + (renderContentHeight - i);
                this.f32230q = i2;
                int i3 = hjc0Var.f108060a;
                if (i2 + i3 > 0) {
                    int i4 = hjc0Var.f108065f - 1;
                    if (i4 >= 0) {
                        m49678h0(i4, i3, this.f32221h.mo108013m());
                    }
                    hjc0 hjc0Var3 = this.f32222i.get(0);
                    if (hjc0Var3.f108065f == 0) {
                        int i5 = hjc0Var3.f108060a;
                        int i6 = this.f32230q;
                        if (i5 + i6 > 0) {
                            this.f32230q = i6 - (i5 + i6);
                        }
                    }
                }
            } else {
                int i7 = hjc0Var2.f108060a;
                int i8 = hjc0Var2.f108062c;
                int i9 = this.f32230q;
                if ((i7 + i8 + i9 >= i && i7 + i8 + i9 > renderContentHeight) || (i7 + i8 + i9 < i && i7 + i8 + i9 > renderContentHeight)) {
                    this.f32230q = i9 + (renderContentHeight - i);
                }
            }
        }
        this.f32232s = false;
    }

    /* JADX INFO: renamed from: Q */
    public void m49661Q() {
        xmr.m210147c("notifyDataChange");
        m49718h(AbstractRunnableC8581d.f32238f);
    }

    /* JADX INFO: renamed from: R */
    public void m49662R(Runnable runnable, String str) {
        if (this.f32224k.getRenderContentHeight() <= 0) {
            return;
        }
        xmr.m210147c("notifyDataChangeInner ------- begin from: " + str);
        this.f32232s = true;
        m49688y();
        m49651G();
        m49668X();
        m49682s(runnable);
        m49676f0();
        mo49645A();
        m49670Z();
        m49669Y("notifyDataChangeInner", true);
        this.f32232s = false;
        m49686w();
        xmr.m210147c("notifyDataChangeInner ------- end from: " + str);
    }

    /* JADX INFO: renamed from: S */
    public final void m49663S(String str) {
        m49662R(null, str);
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
    public final void m49664T(List<Integer> list) {
        ListIterator<hjc0> listIterator;
        int i;
        hjc0 next;
        if (list == null || list.isEmpty()) {
            return;
        }
        xmr.m210147c("notifyItemIndex");
        boolean z = true;
        this.f32232s = true;
        if (this.f32231r) {
            int renderContentHeight = this.f32224k.getRenderContentHeight();
            int realWidth = this.f32224k.getRealWidth();
            hjc0 hjc0Var = this.f32222i.get(0);
            List<hjc0> list2 = this.f32222i;
            hjc0 hjc0Var2 = list2.get(list2.size() - 1);
            if (hjc0Var.f108065f == 0 && hjc0Var.f108060a + this.f32230q == 0) {
                if (hjc0Var2.f108065f == this.f32221h.mo108013m() - 1 && hjc0Var2.f108060a + hjc0Var2.f108062c <= renderContentHeight) {
                }
                if (!z) {
                    Collections.reverse(this.f32222i);
                }
                listIterator = this.f32222i.listIterator();
                if (z) {
                    i = hjc0Var.f108060a;
                } else {
                    i = hjc0Var2.f108060a + hjc0Var2.f108062c;
                }
                while (listIterator.hasNext()) {
                    next = listIterator.next();
                    if (m49655K(next.f108065f, list)) {
                        m49681r(realWidth, renderContentHeight, next);
                    }
                    if (z) {
                        next.f108060a = i;
                        i += next.f108062c;
                    } else {
                        i -= next.f108062c;
                        next.f108060a = i;
                    }
                }
                if (!z) {
                    Collections.reverse(this.f32222i);
                }
                m49669Y("notify notifyItemIndex", false);
            } else {
                int i2 = hjc0Var2.f108060a + hjc0Var2.f108062c;
            }
            z = false;
            if (!z) {
                Collections.reverse(this.f32222i);
            }
            listIterator = this.f32222i.listIterator();
            if (z) {
                i = hjc0Var.f108060a;
            } else {
                i = hjc0Var2.f108060a + hjc0Var2.f108062c;
            }
            while (listIterator.hasNext()) {
                next = listIterator.next();
                if (m49655K(next.f108065f, list)) {
                    m49681r(realWidth, renderContentHeight, next);
                }
                if (z) {
                    next.f108060a = i;
                    i += next.f108062c;
                } else {
                    i -= next.f108062c;
                    next.f108060a = i;
                }
            }
            if (!z) {
                Collections.reverse(this.f32222i);
            }
            m49669Y("notify notifyItemIndex", false);
        }
        this.f32232s = false;
    }

    /* JADX INFO: renamed from: U */
    public void mo49665U() {
        xmr.m210147c("Manager onRequest:" + this.f32232s);
        if (this.f32232s) {
            return;
        }
        int size = this.f32222i.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            hjc0 hjc0Var = this.f32222i.get(i);
            if (hjc0Var.f108066g.f194078a.isLayoutRequested()) {
                arrayList.add(Integer.valueOf(hjc0Var.f108065f));
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        xmr.m210146b("TantanListView", "item real Request");
        xmr.m210147c("Manager onRequest doing:" + arrayList.size());
        AbstractC8580c.b bVar = new AbstractC8580c.b();
        bVar.m49714b(arrayList);
        m49719i(bVar, new e30() { // from class: l.kn2
            @Override // p149l.e30
            public final void call(Object obj) {
                AbstractC8578a.m49642o((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m49666V() {
        if (vwb.m200296J(this.f32222i)) {
            return;
        }
        int realWidth = this.f32224k.getRealWidth();
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        Iterator<hjc0> it = this.f32222i.iterator();
        while (it.hasNext()) {
            m49681r(realWidth, renderContentHeight, it.next());
        }
    }

    /* JADX INFO: renamed from: W */
    public void m49667W(String str) {
        xmr.m210147c("realLayoutItem：" + str);
        for (int i = 0; i < this.f32222i.size(); i++) {
            hjc0 hjc0Var = this.f32222i.get(i);
            View view = hjc0Var.f108066g.f194078a;
            int i2 = hjc0Var.f108061b;
            int i3 = hjc0Var.f108060a;
            int i4 = this.f32230q;
            view.layout(i2, i3 + i4, hjc0Var.f108063d + i2, i3 + hjc0Var.f108062c + i4);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m49668X() {
        List<hjc0> list = this.f32222i;
        if (list != null && list.size() > 0) {
            for (hjc0 hjc0Var : this.f32222i) {
                if (hjc0Var.f108067h == 3) {
                    hjc0Var.f108067h = 4;
                }
                if (hjc0Var.f108066g == null) {
                    xmr.m210146b("TantanListView", "temList hold add null：----------------");
                }
                this.f32223j.add(hjc0Var);
            }
        }
        this.f32222i.clear();
    }

    /* JADX INFO: renamed from: Y */
    public void m49669Y(String str, boolean z) {
        xmr.m210147c("requestInner from: " + str);
        if (z) {
            this.f32225l.f118270n = this.f32221h.mo108013m();
            this.f32225l.f118271o = this.f32224k.getRenderContentHeight();
        }
        this.f32224k.m49626E("request inner " + str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m49670Z() {
        List<hjc0> list = this.f32223j;
        if (list == null || list.size() <= 0) {
            return;
        }
        ListIterator<hjc0> listIterator = this.f32223j.listIterator();
        while (listIterator.hasNext()) {
            hjc0 next = listIterator.next();
            listIterator.remove();
            this.f32227n.m187299d(next, this.f32221h);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m49671a0(coi0 coi0Var) {
        this.f32221h = coi0Var;
        coi0Var.m108017y(this);
    }

    /* JADX INFO: renamed from: b0 */
    public void m49672b0(boolean z) {
        this.f32231r = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m49673c0(TantanListView tantanListView) {
        this.f32224k = tantanListView;
        mo49680n(tantanListView);
        this.f32227n.m187300e(tantanListView);
        this.f32228o.m187300e(tantanListView);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m49674d0(int i, int i2) {
        this.f32232s = true;
        boolean zM49685v = i > 0 ? m49685v(i, i2) : m49685v(i, i2);
        this.f32224k.m49626E("scroll");
        this.f32232s = false;
        return zM49685v;
    }

    /* JADX INFO: renamed from: e0 */
    public void m49675e0() {
        if (this.f32222i.isEmpty()) {
            return;
        }
        m49663S("test notify");
        List<hjc0> list = this.f32222i;
        final hjc0 hjc0Var = list.get(list.size() - 1);
        this.f32222i.remove(hjc0Var);
        this.f32224k.removeView(hjc0Var.f108066g.f194078a);
        m49667W("test remove refresh");
        this.f32224k.postDelayed(new Runnable() { // from class: l.mn2
            @Override // java.lang.Runnable
            public final void run() {
                this.f134728a.m49657M(hjc0Var);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m49676f0() {
        System.currentTimeMillis();
        int iMo108013m = this.f32221h.mo108013m();
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        int measuredWidth = this.f32224k.getMeasuredWidth();
        int i = this.f32225l.f118267k;
        if (i == -1) {
            return;
        }
        hjc0 hjc0VarM49648D = m49648D(i, measuredWidth, renderContentHeight);
        hjc0VarM49648D.f108061b = 0;
        jjc0 jjc0Var = this.f32225l;
        if (jjc0Var.f118269m) {
            hjc0VarM49648D.f108060a = jjc0Var.f118268l;
        } else {
            hjc0VarM49648D.f108060a = jjc0Var.f118268l - hjc0VarM49648D.f108062c;
        }
        int i2 = hjc0VarM49648D.f108067h;
        if (i2 == 1) {
            this.f32224k.addView(hjc0VarM49648D.f108066g.f194078a, 0);
        } else if (i2 == 2) {
            TantanListView tantanListView = this.f32224k;
            View view = hjc0VarM49648D.f108066g.f194078a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        hjc0VarM49648D.f108067h = 3;
        hjc0VarM49648D.f108065f = i;
        m49687x(hjc0VarM49648D);
        this.f32222i.add(hjc0VarM49648D);
        boolean z = this.f32231r;
        int i3 = hjc0VarM49648D.f108060a;
        if (z) {
            m49677g0(i + 1, i3 + hjc0VarM49648D.f108062c, iMo108013m, renderContentHeight);
            if (!this.f32222i.isEmpty()) {
                List<hjc0> list = this.f32222i;
                hjc0 hjc0Var = list.get(list.size() - 1);
                int i4 = hjc0Var.f108060a;
                int i5 = hjc0Var.f108062c;
                int i6 = this.f32230q;
                if (i4 + i5 + i6 < renderContentHeight) {
                    this.f32230q = i6 + (renderContentHeight - ((i4 + i5) + i6));
                }
            }
            m49678h0(i - 1, hjc0VarM49648D.f108060a, iMo108013m);
        } else {
            m49678h0(i - 1, i3, iMo108013m);
            m49677g0(i + 1, hjc0VarM49648D.f108060a + hjc0VarM49648D.f108062c, iMo108013m, renderContentHeight);
        }
        if (!this.f32231r || this.f32222i.isEmpty()) {
            return;
        }
        List<hjc0> list2 = this.f32222i;
        hjc0 hjc0Var2 = list2.get(list2.size() - 1);
        int i7 = this.f32222i.get(0).f108060a;
        int i8 = this.f32230q;
        if (i7 + i8 > 0) {
            this.f32230q = i8 - (i7 + i8);
            m49677g0(hjc0Var2.f108065f + 1, hjc0Var2.f108060a + hjc0Var2.f108062c, iMo108013m, renderContentHeight);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m49677g0(int i, int i2, int i3, int i4) {
        if (this.f32230q + i2 >= i4 || i < 0 || i >= i3) {
            return;
        }
        hjc0 hjc0VarM49648D = m49648D(i, this.f32224k.getMeasuredWidth(), i4);
        hjc0VarM49648D.f108061b = 0;
        hjc0VarM49648D.f108060a = i2;
        int i5 = hjc0VarM49648D.f108067h;
        if (i5 == 1) {
            this.f32224k.addView(hjc0VarM49648D.f108066g.f194078a);
        } else if (i5 == 2) {
            this.f32224k.attachViewToParent(hjc0VarM49648D.f108066g.f194078a, this.f32222i.size() - 1, hjc0VarM49648D.f108066g.f194078a.getLayoutParams());
        }
        hjc0VarM49648D.f108067h = 3;
        hjc0VarM49648D.f108065f = i;
        m49687x(hjc0VarM49648D);
        this.f32222i.add(hjc0VarM49648D);
        m49677g0(i + 1, hjc0VarM49648D.f108060a + hjc0VarM49648D.f108062c, i3, i4);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m49678h0(int i, int i2, int i3) {
        if (this.f32230q + i2 <= 0 || i < 0 || i >= i3) {
            return;
        }
        hjc0 hjc0VarM49648D = m49648D(i, this.f32224k.getMeasuredWidth(), this.f32224k.getRenderContentHeight());
        hjc0VarM49648D.f108061b = 0;
        hjc0VarM49648D.f108060a = i2 - hjc0VarM49648D.f108062c;
        int i4 = hjc0VarM49648D.f108067h;
        if (i4 == 1) {
            this.f32224k.addView(hjc0VarM49648D.f108066g.f194078a, 0);
        } else if (i4 == 2) {
            TantanListView tantanListView = this.f32224k;
            View view = hjc0VarM49648D.f108066g.f194078a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        hjc0VarM49648D.f108067h = 3;
        hjc0VarM49648D.f108065f = i;
        m49687x(hjc0VarM49648D);
        this.f32222i.add(0, hjc0VarM49648D);
        m49687x(hjc0VarM49648D);
        m49678h0(i - 1, hjc0VarM49648D.f108060a, i3);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d, android.os.Handler.Callback
    public /* bridge */ /* synthetic */ boolean handleMessage(@NonNull Message message) {
        return super.handleMessage(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d
    /* JADX INFO: renamed from: j */
    public void mo49679j(AbstractC8580c abstractC8580c) {
        if (abstractC8580c == AbstractRunnableC8581d.f32238f) {
            this.f32224k.postDelayed(new Runnable() { // from class: l.ln2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8578a.m49643p();
                }
            }, 1000L);
            m49663S("action");
        } else if (abstractC8580c instanceof AbstractC8580c.b) {
            List<Integer> list = ((AbstractC8580c.b) abstractC8580c).f32235a;
            if (list != null && list.size() > 0) {
                xmr.m210146b("TantanListView", "notifyItemIndex **************************");
                m49664T(list);
            }
            m49716e();
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo49680n(View view) {
        super.mo49680n(view);
    }

    /* JADX INFO: renamed from: r */
    public final void m49681r(int i, int i2, hjc0 hjc0Var) {
        ViewGroup.LayoutParams layoutParams = hjc0Var.f108066g.f194078a.getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            hjc0Var.f108066g.f194078a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
        } else {
            hjc0Var.f108066g.f194078a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        }
        int measuredWidth = hjc0Var.f108066g.f194078a.getMeasuredWidth();
        int measuredHeight = hjc0Var.f108066g.f194078a.getMeasuredHeight();
        hjc0Var.f108063d = measuredWidth;
        hjc0Var.f108062c = measuredHeight;
        if (hjc0Var.f108066g.f194078a.getVisibility() == 8) {
            hjc0Var.f108063d = 0;
            hjc0Var.f108062c = 0;
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractRunnableC8581d, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* JADX INFO: renamed from: s */
    public final void m49682s(Runnable runnable) {
        int i;
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        jjc0 jjc0Var = this.f32225l;
        float f = jjc0Var.f118264h;
        float f2 = jjc0Var.f118259c;
        if (this.f32231r) {
            int i2 = jjc0Var.f118257a;
            if (i2 == -1 && jjc0Var.f118261e == -1) {
                jjc0Var.f118269m = false;
                jjc0Var.f118268l = renderContentHeight;
                int iMo108013m = this.f32221h.mo108013m();
                jjc0 jjc0Var2 = this.f32225l;
                if (iMo108013m == 0) {
                    jjc0Var2.f118267k = -1;
                    jjc0Var2.f118266j = "";
                } else {
                    jjc0Var2.f118267k = this.f32221h.mo108013m() - 1;
                    jjc0 jjc0Var3 = this.f32225l;
                    jjc0Var3.f118266j = this.f32221h.mo108012d(jjc0Var3.f118267k);
                }
            } else if (i2 == 0 && (i = jjc0Var.f118261e) == jjc0Var.f118270n - 1 && f2 == 0.0f && f <= renderContentHeight) {
                jjc0Var.f118269m = false;
                jjc0Var.f118268l = (int) f;
                jjc0Var.f118267k = i;
                jjc0Var.f118266j = jjc0Var.f118262f;
                m49683t(jjc0Var);
            } else {
                float f3 = renderContentHeight;
                if (f >= f3) {
                    jjc0Var.f118269m = true;
                    jjc0Var.f118268l = jjc0Var.f118263g;
                    if (f == f3 && jjc0Var.f118261e == this.f32221h.mo108013m() - 1) {
                        this.f32225l.f118272p = AbstractRunnableC8581d.f32239g;
                    }
                    jjc0 jjc0Var4 = this.f32225l;
                    jjc0Var4.f118267k = jjc0Var4.f118261e;
                    jjc0Var4.f118266j = jjc0Var4.f118262f;
                    m49683t(jjc0Var4);
                } else if (f < f3) {
                    jjc0Var.f118269m = true;
                    jjc0Var.f118268l = jjc0Var.f118263g;
                    if (f == f3) {
                        jjc0Var.f118272p = AbstractRunnableC8581d.f32239g;
                    }
                    jjc0Var.f118267k = jjc0Var.f118261e;
                    jjc0Var.f118266j = jjc0Var.f118262f;
                    m49683t(jjc0Var);
                }
            }
        } else {
            int i3 = jjc0Var.f118257a;
            if (i3 >= 0 && i3 < this.f32221h.mo108013m() && TextUtils.equals(this.f32221h.mo108012d(i3), this.f32225l.f118258b)) {
                jjc0 jjc0Var5 = this.f32225l;
                jjc0Var5.f118266j = jjc0Var5.f118258b;
                jjc0Var5.f118267k = jjc0Var5.f118257a;
                jjc0Var5.f118269m = false;
                jjc0Var5.f118268l = jjc0Var5.f118260d;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        xmr.m210147c("##### calculate info :" + this.f32225l.f118271o + " , " + this.f32225l.f118264h + " , " + this.f32225l.f118270n);
        jjc0 jjc0Var6 = this.f32225l;
        int i4 = jjc0Var6.f118271o;
        if (i4 > 0) {
            renderContentHeight = i4;
        }
        if (jjc0Var6.f118264h > renderContentHeight || jjc0Var6.f118261e != jjc0Var6.f118270n - 1) {
            return;
        }
        jjc0Var6.f118272p = AbstractRunnableC8581d.f32239g;
    }

    /* JADX INFO: renamed from: t */
    public final void m49683t(jjc0 jjc0Var) {
        boolean z;
        int iM49646B;
        int iMo108013m = this.f32221h.mo108013m() > jjc0Var.f118270n ? this.f32221h.mo108013m() - jjc0Var.f118270n : 0;
        int iM49646B2 = m49646B(jjc0Var.f118266j, jjc0Var.f118267k + iMo108013m, 20);
        if (iM49646B2 >= 0) {
            jjc0Var.f118267k = iM49646B2;
            return;
        }
        List<wgi0> list = jjc0Var.f118273q;
        if (jjc0Var.f118267k == jjc0Var.f118261e) {
            Collections.reverse(list);
            z = true;
        } else {
            z = false;
        }
        int renderContentHeight = this.f32224k.getRenderContentHeight();
        for (wgi0 wgi0Var : list) {
            int i = wgi0Var.f186202d;
            if (i != jjc0Var.f118267k && (iM49646B = m49646B(wgi0Var.f186203e, i + iMo108013m, 20)) >= 0) {
                jjc0Var.f118267k = iM49646B;
                jjc0Var.f118266j = wgi0Var.f186203e;
                int i2 = wgi0Var.f186200b;
                int i3 = wgi0Var.f186201c + i2;
                if (z) {
                    if (i3 < renderContentHeight) {
                        jjc0Var.f118269m = false;
                        jjc0Var.f118268l = i3;
                        return;
                    } else {
                        jjc0Var.f118269m = true;
                        jjc0Var.f118268l = i2;
                        return;
                    }
                }
                if (i2 < 0) {
                    jjc0Var.f118269m = false;
                    jjc0Var.f118268l = i3;
                    return;
                } else {
                    jjc0Var.f118269m = true;
                    jjc0Var.f118268l = i2;
                    return;
                }
            }
        }
        if (list.size() == 0 || this.f32221h.mo108013m() == 0) {
            this.f32225l.m141789b();
            return;
        }
        boolean z2 = this.f32231r;
        jjc0 jjc0Var2 = this.f32225l;
        if (z2) {
            jjc0Var2.f118269m = false;
            jjc0Var2.f118268l = renderContentHeight;
            jjc0Var2.f118267k = this.f32221h.mo108013m() - 1;
            this.f32225l.f118266j = "";
            return;
        }
        jjc0Var2.f118269m = true;
        jjc0Var2.f118268l = 0;
        jjc0Var2.f118267k = 0;
        jjc0Var2.f118266j = "";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7911. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: v */
    public boolean m49685v(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.putong.core.p053ui.messages.recycler.opt.AbstractC8578a.m49685v(int, int):boolean");
    }

    /* JADX INFO: renamed from: w */
    public final void m49686w() {
        if (NullChecker.m81303a(this.f32225l.f118272p) && !vwb.m200296J(this.f32222i)) {
            List<hjc0> list = this.f32222i;
            hjc0 hjc0Var = list.get(list.size() - 1);
            if (hjc0Var.f108060a + hjc0Var.f108062c + this.f32230q >= this.f32224k.getRenderContentHeight() || (this.f32225l.f118272p instanceof AbstractC8580c.e)) {
                m49718h(this.f32225l.f118272p);
                return;
            }
        }
        m49716e();
    }

    /* JADX INFO: renamed from: x */
    public final void m49687x(hjc0 hjc0Var) {
        if (hjc0Var.f108066g != null) {
            return;
        }
        xmr.m210146b("TantanListView", "错误的添加item-------------");
        upk0.m194883a("错误的添加item-------------");
    }

    /* JADX INFO: renamed from: y */
    public void m49688y() {
        xmr.m210146b("TantanListView", "移出item 清除scroll cache ");
        this.f32227n.m187297b(this.f32221h);
        this.f32228o.m187297b(this.f32221h);
    }

    /* JADX INFO: renamed from: z */
    public final hjc0 m49689z(int i, int i2, int i3) {
        hjc0 hjc0Var = new hjc0();
        coi0 coi0Var = this.f32221h;
        xr2 xr2VarMo108011b = coi0Var.mo108011b(i, this.f32224k, coi0Var.mo108014p(i));
        xr2VarMo108011b.f194080c = this.f32221h.mo108014p(i);
        xr2VarMo108011b.f194079b = this.f32221h.mo108012d(i);
        hjc0Var.f108066g = xr2VarMo108011b;
        this.f32221h.mo108016w(xr2VarMo108011b);
        m49684u(hjc0Var, "createInfoByAdapter begin");
        coi0 coi0Var2 = this.f32221h;
        coi0Var2.mo108010a(xr2VarMo108011b, i, coi0Var2.mo108014p(i));
        m49684u(hjc0Var, "createInfoByAdapter end");
        m49681r(i2, i3, hjc0Var);
        return hjc0Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m49684u(hjc0 hjc0Var, String str) {
    }
}
