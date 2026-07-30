package com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt;

import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p153l.azk0;
import p153l.dxi0;
import p153l.jyb;
import p153l.ns2;
import p153l.orc0;
import p153l.pi80;
import p153l.qrc0;
import p153l.wpi0;
import p153l.y20;
import p153l.yde0;
import p153l.yor;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.recycler.opt.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8741a extends AbstractRunnableC8744d {

    /* JADX INFO: renamed from: h */
    public dxi0 f33069h;

    /* JADX INFO: renamed from: k */
    public TantanListView f33072k;

    /* JADX INFO: renamed from: l */
    public qrc0 f33073l;

    /* JADX INFO: renamed from: q */
    public int f33078q = 0;

    /* JADX INFO: renamed from: r */
    public boolean f33079r = false;

    /* JADX INFO: renamed from: s */
    public boolean f33080s = false;

    /* JADX INFO: renamed from: i */
    public List<orc0> f33070i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<orc0> f33071j = new ArrayList();

    /* JADX INFO: renamed from: m */
    public SparseArray<Object> f33074m = new SparseArray<>();

    /* JADX INFO: renamed from: p */
    public pi80 f33077p = new pi80();

    /* JADX INFO: renamed from: n */
    public yde0 f33075n = new yde0(this.f33077p);

    /* JADX INFO: renamed from: o */
    public yde0 f33076o = new yde0(this.f33077p);

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m50825o(List list) {
        ListIterator listIterator = list.listIterator();
        AbstractC8743c abstractC8743c = null;
        while (listIterator.hasNext()) {
            AbstractC8743c abstractC8743c2 = (AbstractC8743c) listIterator.next();
            if (abstractC8743c2 instanceof AbstractC8743c.b) {
                listIterator.remove();
                abstractC8743c = abstractC8743c2;
            }
        }
        if (abstractC8743c != null) {
            list.add(0, abstractC8743c);
        }
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m50826p() {
    }

    /* JADX INFO: renamed from: A */
    public boolean mo50828A() {
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final int m50829B(String str, int i, int i2) {
        boolean z;
        if (m50839L(str, i)) {
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
            if (m50839L(str, i + i3)) {
                z = true;
                z2 = false;
                break;
            }
            if (m50839L(str, i - i3)) {
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
    public final orc0 m50830C(int i, int i2, int i3) {
        orc0 orc0Var;
        int size = this.f33071j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                orc0Var = null;
                break;
            }
            orc0Var = this.f33071j.get(i4);
            boolean zMo118502z = this.f33069h.mo118502z();
            dxi0 dxi0Var = this.f33069h;
            if (zMo118502z) {
                if (TextUtils.equals(dxi0Var.mo118496d(i), orc0Var.f148694g.f143455b) && this.f33069h.mo118498p(i) == orc0Var.f148694g.f143456c) {
                    break;
                }
                i4++;
            } else {
                if (dxi0Var.mo118498p(i) == orc0Var.f148694g.f143456c) {
                    break;
                }
                i4++;
            }
        }
        if (orc0Var != null) {
            this.f33071j.remove(orc0Var);
        }
        return orc0Var;
    }

    /* JADX INFO: renamed from: D */
    public orc0 m50831D(int i, int i2, int i3) {
        orc0 orc0VarM50830C = m50830C(i, i2, i3);
        if (orc0VarM50830C != null) {
            System.currentTimeMillis();
            orc0VarM50830C.f148694g.f143456c = this.f33069h.mo118498p(i);
            orc0VarM50830C.f148694g.f143455b = this.f33069h.mo118496d(i);
            this.f33069h.mo118500w(orc0VarM50830C.f148694g);
            m50867u(orc0VarM50830C, "tempList begin");
            dxi0 dxi0Var = this.f33069h;
            dxi0Var.mo118494a(orc0VarM50830C.f148694g, i, dxi0Var.mo118498p(i));
            m50867u(orc0VarM50830C, "tempList end");
            m50864r(i2, i3, orc0VarM50830C);
        }
        if (orc0VarM50830C == null) {
            orc0VarM50830C = m50835H(i, i2, i3);
        }
        return orc0VarM50830C == null ? m50872z(i, i2, i3) : orc0VarM50830C;
    }

    /* JADX INFO: renamed from: E */
    public orc0 m50832E() {
        return this.f33070i.get(0);
    }

    /* JADX INFO: renamed from: F */
    public orc0 m50833F() {
        List<orc0> list = this.f33070i;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: G */
    public final void m50834G() {
        if (this.f33073l == null) {
            this.f33073l = new qrc0();
            return;
        }
        boolean zIsEmpty = this.f33070i.isEmpty();
        qrc0 qrc0Var = this.f33073l;
        if (zIsEmpty) {
            qrc0Var.m177535b();
            this.f33078q = 0;
            return;
        }
        qrc0Var.m177535b();
        this.f33072k.getRenderContentHeight();
        orc0 orc0VarM50832E = m50832E();
        orc0 orc0VarM50833F = m50833F();
        int i = this.f33078q;
        qrc0 qrc0Var2 = this.f33073l;
        qrc0Var2.f159087a = orc0VarM50832E.f148693f;
        int i2 = orc0VarM50832E.f148688a;
        qrc0Var2.f159089c = i2 + i;
        qrc0Var2.f159090d = i2 + orc0VarM50832E.f148690c + i;
        qrc0Var2.f159088b = orc0VarM50832E.f148694g.f143455b;
        qrc0Var2.f159091e = orc0VarM50833F.f148693f;
        int i3 = orc0VarM50833F.f148688a;
        qrc0Var2.f159093g = i3 + i;
        qrc0Var2.f159094h = i3 + orc0VarM50833F.f148690c + i;
        qrc0Var2.f159092f = orc0VarM50833F.f148694g.f143455b;
        qrc0Var2.f159095i = i;
        this.f33078q = 0;
        if (this.f33070i.isEmpty()) {
            return;
        }
        for (int i4 = 0; i4 < this.f33070i.size() - 1; i4++) {
            orc0 orc0Var = this.f33070i.get(i4);
            wpi0 wpi0VarM207460a = wpi0.m207460a();
            wpi0VarM207460a.m207462c(orc0Var.f148689b, orc0Var.f148688a + i, orc0Var.f148690c, orc0Var.f148693f, orc0Var.f148694g.f143455b);
            this.f33073l.m177534a(wpi0VarM207460a);
        }
    }

    /* JADX INFO: renamed from: H */
    public final orc0 m50835H(int i, int i2, int i3) {
        ns2 ns2VarM172357b = this.f33077p.m172357b(this.f33069h.mo118498p(i));
        if (ns2VarM172357b == null) {
            return null;
        }
        orc0 orc0VarM168910a = orc0.m168910a();
        orc0VarM168910a.f148694g = ns2VarM172357b;
        ns2VarM172357b.f143456c = this.f33069h.mo118498p(i);
        orc0VarM168910a.f148694g.f143455b = this.f33069h.mo118496d(i);
        orc0VarM168910a.f148693f = i;
        this.f33069h.mo118500w(orc0VarM168910a.f148694g);
        m50867u(orc0VarM168910a, "getRecyclerInfoFromPool begin");
        dxi0 dxi0Var = this.f33069h;
        dxi0Var.mo118494a(orc0VarM168910a.f148694g, i, dxi0Var.mo118498p(i));
        m50867u(orc0VarM168910a, "getRecyclerInfoFromPool end");
        m50864r(i2, i3, orc0VarM168910a);
        orc0VarM168910a.f148695h = 1;
        System.currentTimeMillis();
        return orc0VarM168910a;
    }

    /* JADX INFO: renamed from: I */
    public int m50836I() {
        if (jyb.m147479J(this.f33070i)) {
            return 0;
        }
        return this.f33070i.size();
    }

    /* JADX INFO: renamed from: J */
    public View m50837J(int i) {
        if (i < 0 || i >= this.f33070i.size()) {
            return null;
        }
        return this.f33070i.get(i).f148694g.f143454a;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m50838K(int i, List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if (i == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m50839L(String str, int i) {
        return i >= 0 && i < this.f33069h.mo118497m() && TextUtils.equals(this.f33069h.mo118496d(i), str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m50840M(orc0 orc0Var) {
        this.f33070i.add(orc0Var);
        this.f33072k.addView(orc0Var.f148694g.f143454a);
        m50850W("test add refresh");
    }

    /* JADX INFO: renamed from: N */
    public void m50841N() {
        this.f33080s = true;
        m50851X();
        m50871y();
        m50859f0();
        m50853Z();
        this.f33073l.f159100n = this.f33069h.mo118497m();
        this.f33073l.f159101o = this.f33072k.getRenderContentHeight();
        this.f33072k.m50809E("layoutAfterAnchor");
        this.f33080s = false;
    }

    /* JADX INFO: renamed from: O */
    public void m50842O(boolean z, int i, int i2, int i3, int i4) {
        yor.m216992c("layoutChild");
        m50850W("sys layout");
    }

    /* JADX INFO: renamed from: P */
    public void m50843P() {
        this.f33080s = true;
        if (this.f33070i.size() > 0) {
            orc0 orc0Var = this.f33070i.get(0);
            List<orc0> list = this.f33070i;
            orc0 orc0Var2 = list.get(list.size() - 1);
            int renderContentHeight = this.f33072k.getRenderContentHeight();
            qrc0 qrc0Var = this.f33073l;
            int i = qrc0Var.f159101o;
            qrc0Var.f159101o = renderContentHeight;
            if (renderContentHeight > i) {
                int i2 = this.f33078q + (renderContentHeight - i);
                this.f33078q = i2;
                int i3 = orc0Var.f148688a;
                if (i2 + i3 > 0) {
                    int i4 = orc0Var.f148693f - 1;
                    if (i4 >= 0) {
                        m50861h0(i4, i3, this.f33069h.mo118497m());
                    }
                    orc0 orc0Var3 = this.f33070i.get(0);
                    if (orc0Var3.f148693f == 0) {
                        int i5 = orc0Var3.f148688a;
                        int i6 = this.f33078q;
                        if (i5 + i6 > 0) {
                            this.f33078q = i6 - (i5 + i6);
                        }
                    }
                }
            } else {
                int i7 = orc0Var2.f148688a;
                int i8 = orc0Var2.f148690c;
                int i9 = this.f33078q;
                if ((i7 + i8 + i9 >= i && i7 + i8 + i9 > renderContentHeight) || (i7 + i8 + i9 < i && i7 + i8 + i9 > renderContentHeight)) {
                    this.f33078q = i9 + (renderContentHeight - i);
                }
            }
        }
        this.f33080s = false;
    }

    /* JADX INFO: renamed from: Q */
    public void m50844Q() {
        yor.m216992c("notifyDataChange");
        m50901h(AbstractRunnableC8744d.f33086f);
    }

    /* JADX INFO: renamed from: R */
    public void m50845R(Runnable runnable, String str) {
        if (this.f33072k.getRenderContentHeight() <= 0) {
            return;
        }
        yor.m216992c("notifyDataChangeInner ------- begin from: " + str);
        this.f33080s = true;
        m50871y();
        m50834G();
        m50851X();
        m50865s(runnable);
        m50859f0();
        mo50828A();
        m50853Z();
        m50852Y("notifyDataChangeInner", true);
        this.f33080s = false;
        m50869w();
        yor.m216992c("notifyDataChangeInner ------- end from: " + str);
    }

    /* JADX INFO: renamed from: S */
    public final void m50846S(String str) {
        m50845R(null, str);
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
    public final void m50847T(List<Integer> list) {
        ListIterator<orc0> listIterator;
        int i;
        orc0 next;
        if (list == null || list.isEmpty()) {
            return;
        }
        yor.m216992c("notifyItemIndex");
        boolean z = true;
        this.f33080s = true;
        if (this.f33079r) {
            int renderContentHeight = this.f33072k.getRenderContentHeight();
            int realWidth = this.f33072k.getRealWidth();
            orc0 orc0Var = this.f33070i.get(0);
            List<orc0> list2 = this.f33070i;
            orc0 orc0Var2 = list2.get(list2.size() - 1);
            if (orc0Var.f148693f == 0 && orc0Var.f148688a + this.f33078q == 0) {
                if (orc0Var2.f148693f == this.f33069h.mo118497m() - 1 && orc0Var2.f148688a + orc0Var2.f148690c <= renderContentHeight) {
                }
                if (!z) {
                    Collections.reverse(this.f33070i);
                }
                listIterator = this.f33070i.listIterator();
                if (z) {
                    i = orc0Var.f148688a;
                } else {
                    i = orc0Var2.f148688a + orc0Var2.f148690c;
                }
                while (listIterator.hasNext()) {
                    next = listIterator.next();
                    if (m50838K(next.f148693f, list)) {
                        m50864r(realWidth, renderContentHeight, next);
                    }
                    if (z) {
                        next.f148688a = i;
                        i += next.f148690c;
                    } else {
                        i -= next.f148690c;
                        next.f148688a = i;
                    }
                }
                if (!z) {
                    Collections.reverse(this.f33070i);
                }
                m50852Y("notify notifyItemIndex", false);
            } else {
                int i2 = orc0Var2.f148688a + orc0Var2.f148690c;
            }
            z = false;
            if (!z) {
                Collections.reverse(this.f33070i);
            }
            listIterator = this.f33070i.listIterator();
            if (z) {
                i = orc0Var.f148688a;
            } else {
                i = orc0Var2.f148688a + orc0Var2.f148690c;
            }
            while (listIterator.hasNext()) {
                next = listIterator.next();
                if (m50838K(next.f148693f, list)) {
                    m50864r(realWidth, renderContentHeight, next);
                }
                if (z) {
                    next.f148688a = i;
                    i += next.f148690c;
                } else {
                    i -= next.f148690c;
                    next.f148688a = i;
                }
            }
            if (!z) {
                Collections.reverse(this.f33070i);
            }
            m50852Y("notify notifyItemIndex", false);
        }
        this.f33080s = false;
    }

    /* JADX INFO: renamed from: U */
    public void mo50848U() {
        yor.m216992c("Manager onRequest:" + this.f33080s);
        if (this.f33080s) {
            return;
        }
        int size = this.f33070i.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            orc0 orc0Var = this.f33070i.get(i);
            if (orc0Var.f148694g.f143454a.isLayoutRequested()) {
                arrayList.add(Integer.valueOf(orc0Var.f148693f));
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        yor.m216991b("TantanListView", "item real Request");
        yor.m216992c("Manager onRequest doing:" + arrayList.size());
        AbstractC8743c.b bVar = new AbstractC8743c.b();
        bVar.m50897b(arrayList);
        m50902i(bVar, new y20() { // from class: l.rn2
            @Override // p153l.y20
            public final void call(Object obj) {
                AbstractC8741a.m50825o((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m50849V() {
        if (jyb.m147479J(this.f33070i)) {
            return;
        }
        int realWidth = this.f33072k.getRealWidth();
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        Iterator<orc0> it = this.f33070i.iterator();
        while (it.hasNext()) {
            m50864r(realWidth, renderContentHeight, it.next());
        }
    }

    /* JADX INFO: renamed from: W */
    public void m50850W(String str) {
        yor.m216992c("realLayoutItem：" + str);
        for (int i = 0; i < this.f33070i.size(); i++) {
            orc0 orc0Var = this.f33070i.get(i);
            View view = orc0Var.f148694g.f143454a;
            int i2 = orc0Var.f148689b;
            int i3 = orc0Var.f148688a;
            int i4 = this.f33078q;
            view.layout(i2, i3 + i4, orc0Var.f148691d + i2, i3 + orc0Var.f148690c + i4);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m50851X() {
        List<orc0> list = this.f33070i;
        if (list != null && list.size() > 0) {
            for (orc0 orc0Var : this.f33070i) {
                if (orc0Var.f148695h == 3) {
                    orc0Var.f148695h = 4;
                }
                if (orc0Var.f148694g == null) {
                    yor.m216991b("TantanListView", "temList hold add null：----------------");
                }
                this.f33071j.add(orc0Var);
            }
        }
        this.f33070i.clear();
    }

    /* JADX INFO: renamed from: Y */
    public void m50852Y(String str, boolean z) {
        yor.m216992c("requestInner from: " + str);
        if (z) {
            this.f33073l.f159100n = this.f33069h.mo118497m();
            this.f33073l.f159101o = this.f33072k.getRenderContentHeight();
        }
        this.f33072k.m50809E("request inner " + str);
    }

    /* JADX INFO: renamed from: Z */
    public final void m50853Z() {
        List<orc0> list = this.f33071j;
        if (list == null || list.size() <= 0) {
            return;
        }
        ListIterator<orc0> listIterator = this.f33071j.listIterator();
        while (listIterator.hasNext()) {
            orc0 next = listIterator.next();
            listIterator.remove();
            this.f33075n.m215216d(next, this.f33069h);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m50854a0(dxi0 dxi0Var) {
        this.f33069h = dxi0Var;
        dxi0Var.m118501y(this);
    }

    /* JADX INFO: renamed from: b0 */
    public void m50855b0(boolean z) {
        this.f33079r = z;
    }

    /* JADX INFO: renamed from: c0 */
    public void m50856c0(TantanListView tantanListView) {
        this.f33072k = tantanListView;
        mo50863n(tantanListView);
        this.f33075n.m215217e(tantanListView);
        this.f33076o.m215217e(tantanListView);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m50857d0(int i, int i2) {
        this.f33080s = true;
        boolean zM50868v = i > 0 ? m50868v(i, i2) : m50868v(i, i2);
        this.f33072k.m50809E("scroll");
        this.f33080s = false;
        return zM50868v;
    }

    /* JADX INFO: renamed from: e0 */
    public void m50858e0() {
        if (this.f33070i.isEmpty()) {
            return;
        }
        m50846S("test notify");
        List<orc0> list = this.f33070i;
        final orc0 orc0Var = list.get(list.size() - 1);
        this.f33070i.remove(orc0Var);
        this.f33072k.removeView(orc0Var.f148694g.f143454a);
        m50850W("test remove refresh");
        this.f33072k.postDelayed(new Runnable() { // from class: l.tn2
            @Override // java.lang.Runnable
            public final void run() {
                this.f175219a.m50840M(orc0Var);
            }
        }, 4000L);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m50859f0() {
        System.currentTimeMillis();
        int iMo118497m = this.f33069h.mo118497m();
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        int measuredWidth = this.f33072k.getMeasuredWidth();
        int i = this.f33073l.f159097k;
        if (i == -1) {
            return;
        }
        orc0 orc0VarM50831D = m50831D(i, measuredWidth, renderContentHeight);
        orc0VarM50831D.f148689b = 0;
        qrc0 qrc0Var = this.f33073l;
        if (qrc0Var.f159099m) {
            orc0VarM50831D.f148688a = qrc0Var.f159098l;
        } else {
            orc0VarM50831D.f148688a = qrc0Var.f159098l - orc0VarM50831D.f148690c;
        }
        int i2 = orc0VarM50831D.f148695h;
        if (i2 == 1) {
            this.f33072k.addView(orc0VarM50831D.f148694g.f143454a, 0);
        } else if (i2 == 2) {
            TantanListView tantanListView = this.f33072k;
            View view = orc0VarM50831D.f148694g.f143454a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        orc0VarM50831D.f148695h = 3;
        orc0VarM50831D.f148693f = i;
        m50870x(orc0VarM50831D);
        this.f33070i.add(orc0VarM50831D);
        boolean z = this.f33079r;
        int i3 = orc0VarM50831D.f148688a;
        if (z) {
            m50860g0(i + 1, i3 + orc0VarM50831D.f148690c, iMo118497m, renderContentHeight);
            if (!this.f33070i.isEmpty()) {
                List<orc0> list = this.f33070i;
                orc0 orc0Var = list.get(list.size() - 1);
                int i4 = orc0Var.f148688a;
                int i5 = orc0Var.f148690c;
                int i6 = this.f33078q;
                if (i4 + i5 + i6 < renderContentHeight) {
                    this.f33078q = i6 + (renderContentHeight - ((i4 + i5) + i6));
                }
            }
            m50861h0(i - 1, orc0VarM50831D.f148688a, iMo118497m);
        } else {
            m50861h0(i - 1, i3, iMo118497m);
            m50860g0(i + 1, orc0VarM50831D.f148688a + orc0VarM50831D.f148690c, iMo118497m, renderContentHeight);
        }
        if (!this.f33079r || this.f33070i.isEmpty()) {
            return;
        }
        List<orc0> list2 = this.f33070i;
        orc0 orc0Var2 = list2.get(list2.size() - 1);
        int i7 = this.f33070i.get(0).f148688a;
        int i8 = this.f33078q;
        if (i7 + i8 > 0) {
            this.f33078q = i8 - (i7 + i8);
            m50860g0(orc0Var2.f148693f + 1, orc0Var2.f148688a + orc0Var2.f148690c, iMo118497m, renderContentHeight);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m50860g0(int i, int i2, int i3, int i4) {
        if (this.f33078q + i2 >= i4 || i < 0 || i >= i3) {
            return;
        }
        orc0 orc0VarM50831D = m50831D(i, this.f33072k.getMeasuredWidth(), i4);
        orc0VarM50831D.f148689b = 0;
        orc0VarM50831D.f148688a = i2;
        int i5 = orc0VarM50831D.f148695h;
        if (i5 == 1) {
            this.f33072k.addView(orc0VarM50831D.f148694g.f143454a);
        } else if (i5 == 2) {
            this.f33072k.attachViewToParent(orc0VarM50831D.f148694g.f143454a, this.f33070i.size() - 1, orc0VarM50831D.f148694g.f143454a.getLayoutParams());
        }
        orc0VarM50831D.f148695h = 3;
        orc0VarM50831D.f148693f = i;
        m50870x(orc0VarM50831D);
        this.f33070i.add(orc0VarM50831D);
        m50860g0(i + 1, orc0VarM50831D.f148688a + orc0VarM50831D.f148690c, i3, i4);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m50861h0(int i, int i2, int i3) {
        if (this.f33078q + i2 <= 0 || i < 0 || i >= i3) {
            return;
        }
        orc0 orc0VarM50831D = m50831D(i, this.f33072k.getMeasuredWidth(), this.f33072k.getRenderContentHeight());
        orc0VarM50831D.f148689b = 0;
        orc0VarM50831D.f148688a = i2 - orc0VarM50831D.f148690c;
        int i4 = orc0VarM50831D.f148695h;
        if (i4 == 1) {
            this.f33072k.addView(orc0VarM50831D.f148694g.f143454a, 0);
        } else if (i4 == 2) {
            TantanListView tantanListView = this.f33072k;
            View view = orc0VarM50831D.f148694g.f143454a;
            tantanListView.attachViewToParent(view, 0, view.getLayoutParams());
        }
        orc0VarM50831D.f148695h = 3;
        orc0VarM50831D.f148693f = i;
        m50870x(orc0VarM50831D);
        this.f33070i.add(0, orc0VarM50831D);
        m50870x(orc0VarM50831D);
        m50861h0(i - 1, orc0VarM50831D.f148688a, i3);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d, android.os.Handler.Callback
    public /* bridge */ /* synthetic */ boolean handleMessage(@NonNull Message message) {
        return super.handleMessage(message);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d
    /* JADX INFO: renamed from: j */
    public void mo50862j(AbstractC8743c abstractC8743c) {
        if (abstractC8743c == AbstractRunnableC8744d.f33086f) {
            this.f33072k.postDelayed(new Runnable() { // from class: l.sn2
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC8741a.m50826p();
                }
            }, 1000L);
            m50846S("action");
        } else if (abstractC8743c instanceof AbstractC8743c.b) {
            List<Integer> list = ((AbstractC8743c.b) abstractC8743c).f33083a;
            if (list != null && list.size() > 0) {
                yor.m216991b("TantanListView", "notifyItemIndex **************************");
                m50847T(list);
            }
            m50899e();
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo50863n(View view) {
        super.mo50863n(view);
    }

    /* JADX INFO: renamed from: r */
    public final void m50864r(int i, int i2, orc0 orc0Var) {
        ViewGroup.LayoutParams layoutParams = orc0Var.f148694g.f143454a.getLayoutParams();
        if (layoutParams == null || layoutParams.height < 0) {
            orc0Var.f148694g.f143454a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 0));
        } else {
            orc0Var.f148694g.f143454a.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
        }
        int measuredWidth = orc0Var.f148694g.f143454a.getMeasuredWidth();
        int measuredHeight = orc0Var.f148694g.f143454a.getMeasuredHeight();
        orc0Var.f148691d = measuredWidth;
        orc0Var.f148690c = measuredHeight;
        if (orc0Var.f148694g.f143454a.getVisibility() == 8) {
            orc0Var.f148691d = 0;
            orc0Var.f148690c = 0;
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractRunnableC8744d, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    /* JADX INFO: renamed from: s */
    public final void m50865s(Runnable runnable) {
        int i;
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        qrc0 qrc0Var = this.f33073l;
        float f = qrc0Var.f159094h;
        float f2 = qrc0Var.f159089c;
        if (this.f33079r) {
            int i2 = qrc0Var.f159087a;
            if (i2 == -1 && qrc0Var.f159091e == -1) {
                qrc0Var.f159099m = false;
                qrc0Var.f159098l = renderContentHeight;
                int iMo118497m = this.f33069h.mo118497m();
                qrc0 qrc0Var2 = this.f33073l;
                if (iMo118497m == 0) {
                    qrc0Var2.f159097k = -1;
                    qrc0Var2.f159096j = "";
                } else {
                    qrc0Var2.f159097k = this.f33069h.mo118497m() - 1;
                    qrc0 qrc0Var3 = this.f33073l;
                    qrc0Var3.f159096j = this.f33069h.mo118496d(qrc0Var3.f159097k);
                }
            } else if (i2 == 0 && (i = qrc0Var.f159091e) == qrc0Var.f159100n - 1 && f2 == 0.0f && f <= renderContentHeight) {
                qrc0Var.f159099m = false;
                qrc0Var.f159098l = (int) f;
                qrc0Var.f159097k = i;
                qrc0Var.f159096j = qrc0Var.f159092f;
                m50866t(qrc0Var);
            } else {
                float f3 = renderContentHeight;
                if (f >= f3) {
                    qrc0Var.f159099m = true;
                    qrc0Var.f159098l = qrc0Var.f159093g;
                    if (f == f3 && qrc0Var.f159091e == this.f33069h.mo118497m() - 1) {
                        this.f33073l.f159102p = AbstractRunnableC8744d.f33087g;
                    }
                    qrc0 qrc0Var4 = this.f33073l;
                    qrc0Var4.f159097k = qrc0Var4.f159091e;
                    qrc0Var4.f159096j = qrc0Var4.f159092f;
                    m50866t(qrc0Var4);
                } else if (f < f3) {
                    qrc0Var.f159099m = true;
                    qrc0Var.f159098l = qrc0Var.f159093g;
                    if (f == f3) {
                        qrc0Var.f159102p = AbstractRunnableC8744d.f33087g;
                    }
                    qrc0Var.f159097k = qrc0Var.f159091e;
                    qrc0Var.f159096j = qrc0Var.f159092f;
                    m50866t(qrc0Var);
                }
            }
        } else {
            int i3 = qrc0Var.f159087a;
            if (i3 >= 0 && i3 < this.f33069h.mo118497m() && TextUtils.equals(this.f33069h.mo118496d(i3), this.f33073l.f159088b)) {
                qrc0 qrc0Var5 = this.f33073l;
                qrc0Var5.f159096j = qrc0Var5.f159088b;
                qrc0Var5.f159097k = qrc0Var5.f159087a;
                qrc0Var5.f159099m = false;
                qrc0Var5.f159098l = qrc0Var5.f159090d;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        yor.m216992c("##### calculate info :" + this.f33073l.f159101o + " , " + this.f33073l.f159094h + " , " + this.f33073l.f159100n);
        qrc0 qrc0Var6 = this.f33073l;
        int i4 = qrc0Var6.f159101o;
        if (i4 > 0) {
            renderContentHeight = i4;
        }
        if (qrc0Var6.f159094h > renderContentHeight || qrc0Var6.f159091e != qrc0Var6.f159100n - 1) {
            return;
        }
        qrc0Var6.f159102p = AbstractRunnableC8744d.f33087g;
    }

    /* JADX INFO: renamed from: t */
    public final void m50866t(qrc0 qrc0Var) {
        boolean z;
        int iM50829B;
        int iMo118497m = this.f33069h.mo118497m() > qrc0Var.f159100n ? this.f33069h.mo118497m() - qrc0Var.f159100n : 0;
        int iM50829B2 = m50829B(qrc0Var.f159096j, qrc0Var.f159097k + iMo118497m, 20);
        if (iM50829B2 >= 0) {
            qrc0Var.f159097k = iM50829B2;
            return;
        }
        List<wpi0> list = qrc0Var.f159103q;
        if (qrc0Var.f159097k == qrc0Var.f159091e) {
            Collections.reverse(list);
            z = true;
        } else {
            z = false;
        }
        int renderContentHeight = this.f33072k.getRenderContentHeight();
        for (wpi0 wpi0Var : list) {
            int i = wpi0Var.f190311d;
            if (i != qrc0Var.f159097k && (iM50829B = m50829B(wpi0Var.f190312e, i + iMo118497m, 20)) >= 0) {
                qrc0Var.f159097k = iM50829B;
                qrc0Var.f159096j = wpi0Var.f190312e;
                int i2 = wpi0Var.f190309b;
                int i3 = wpi0Var.f190310c + i2;
                if (z) {
                    if (i3 < renderContentHeight) {
                        qrc0Var.f159099m = false;
                        qrc0Var.f159098l = i3;
                        return;
                    } else {
                        qrc0Var.f159099m = true;
                        qrc0Var.f159098l = i2;
                        return;
                    }
                }
                if (i2 < 0) {
                    qrc0Var.f159099m = false;
                    qrc0Var.f159098l = i3;
                    return;
                } else {
                    qrc0Var.f159099m = true;
                    qrc0Var.f159098l = i2;
                    return;
                }
            }
        }
        if (list.size() == 0 || this.f33069h.mo118497m() == 0) {
            this.f33073l.m177535b();
            return;
        }
        boolean z2 = this.f33079r;
        qrc0 qrc0Var2 = this.f33073l;
        if (z2) {
            qrc0Var2.f159099m = false;
            qrc0Var2.f159098l = renderContentHeight;
            qrc0Var2.f159097k = this.f33069h.mo118497m() - 1;
            this.f33073l.f159096j = "";
            return;
        }
        qrc0Var2.f159099m = true;
        qrc0Var2.f159098l = 0;
        qrc0Var2.f159097k = 0;
        qrc0Var2.f159096j = "";
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7911. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: v */
    public boolean m50868v(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p051p1.mobile.putong.core.p058ui.messages.recycler.opt.AbstractC8741a.m50868v(int, int):boolean");
    }

    /* JADX INFO: renamed from: w */
    public final void m50869w() {
        if (NullChecker.m82486a(this.f33073l.f159102p) && !jyb.m147479J(this.f33070i)) {
            List<orc0> list = this.f33070i;
            orc0 orc0Var = list.get(list.size() - 1);
            if (orc0Var.f148688a + orc0Var.f148690c + this.f33078q >= this.f33072k.getRenderContentHeight() || (this.f33073l.f159102p instanceof AbstractC8743c.e)) {
                m50901h(this.f33073l.f159102p);
                return;
            }
        }
        m50899e();
    }

    /* JADX INFO: renamed from: x */
    public final void m50870x(orc0 orc0Var) {
        if (orc0Var.f148694g != null) {
            return;
        }
        yor.m216991b("TantanListView", "错误的添加item-------------");
        azk0.m101074a("错误的添加item-------------");
    }

    /* JADX INFO: renamed from: y */
    public void m50871y() {
        yor.m216991b("TantanListView", "移出item 清除scroll cache ");
        this.f33075n.m215214b(this.f33069h);
        this.f33076o.m215214b(this.f33069h);
    }

    /* JADX INFO: renamed from: z */
    public final orc0 m50872z(int i, int i2, int i3) {
        orc0 orc0Var = new orc0();
        dxi0 dxi0Var = this.f33069h;
        ns2 ns2VarMo118495b = dxi0Var.mo118495b(i, this.f33072k, dxi0Var.mo118498p(i));
        ns2VarMo118495b.f143456c = this.f33069h.mo118498p(i);
        ns2VarMo118495b.f143455b = this.f33069h.mo118496d(i);
        orc0Var.f148694g = ns2VarMo118495b;
        this.f33069h.mo118500w(ns2VarMo118495b);
        m50867u(orc0Var, "createInfoByAdapter begin");
        dxi0 dxi0Var2 = this.f33069h;
        dxi0Var2.mo118494a(ns2VarMo118495b, i, dxi0Var2.mo118498p(i));
        m50867u(orc0Var, "createInfoByAdapter end");
        m50864r(i2, i3, orc0Var);
        return orc0Var;
    }

    /* JADX INFO: renamed from: u */
    public final void m50867u(orc0 orc0Var, String str) {
    }
}
