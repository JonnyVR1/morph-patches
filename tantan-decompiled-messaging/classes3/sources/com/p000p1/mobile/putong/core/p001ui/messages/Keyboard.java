package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.messages.Keyboard;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.ViewOnClickListenerC0124a;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.ViewOnClickListenerC0125b;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.StickerBundle;
import com.p1.mobile.putong.core.data.StickerPackage;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkIntent;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.hpd0;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.o6j0;
import l.o7r;
import l.qib0;
import l.roj0;
import l.szq;
import l.t100;
import l.tpd0;
import l.tzq;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.yij0;
import l.zvf0;
import p003l.AbstractC0158a;
import p003l.d30;
import p003l.e30;
import p003l.eoj0;
import p003l.f30;
import p003l.fxe;
import p003l.kye;
import p003l.m250;
import p003l.ps9;
import p003l.pxe;
import p003l.rzq;
import p003l.w3z;
import p003l.w9j;
import p003l.wyq;
import p028v.VButton_FakeShadow;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VList_Horizontal;
import p028v.VPager;
import p028v.VPagerCircleIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Keyboard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public int f1445A;

    /* JADX INFO: renamed from: a */
    public LinearLayout f1446a;

    /* JADX INFO: renamed from: b */
    public VList_Horizontal f1447b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f1448c;

    /* JADX INFO: renamed from: d */
    public TabLayout f1449d;

    /* JADX INFO: renamed from: e */
    public VPager f1450e;

    /* JADX INFO: renamed from: f */
    public VPager f1451f;

    /* JADX INFO: renamed from: g */
    public VPagerCircleIndicator f1452g;

    /* JADX INFO: renamed from: h */
    public View f1453h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f1454i;

    /* JADX INFO: renamed from: j */
    public VList_Horizontal f1455j;

    /* JADX INFO: renamed from: k */
    public VFrame f1456k;

    /* JADX INFO: renamed from: l */
    public VFrame f1457l;

    /* JADX INFO: renamed from: m */
    public VButton_FakeShadow f1458m;

    /* JADX INFO: renamed from: n */
    public List<List<String>> f1459n;

    /* JADX INFO: renamed from: o */
    public List<j760<StickerBundle, StickerPackage>> f1460o;

    /* JADX INFO: renamed from: p */
    public C0097b f1461p;

    /* JADX INFO: renamed from: q */
    public ps9 f1462q;

    /* JADX INFO: renamed from: r */
    public wyq f1463r;

    /* JADX INFO: renamed from: s */
    public d30 f1464s;

    /* JADX INFO: renamed from: t */
    public d30 f1465t;

    /* JADX INFO: renamed from: u */
    public boolean f1466u;

    /* JADX INFO: renamed from: v */
    public boolean f1467v;

    /* JADX INFO: renamed from: w */
    public final int f1468w;

    /* JADX INFO: renamed from: x */
    public int f1469x;

    /* JADX INFO: renamed from: y */
    public int f1470y;

    /* JADX INFO: renamed from: z */
    public int f1471z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$a */
    public class C0096a implements ViewPager.j {
        public C0096a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            Keyboard.this.f1455j.setSelection(i);
            if (xdl0.O0(Keyboard.this.f1449d)) {
                CoreModule.c.e0.M1.put(Integer.valueOf(i));
            }
            if (i >= 3) {
                zvf0.u("e_stickers_type", "p_chat_view", new j760[]{vwb.Y("stickers_id", ((StickerPackage) Keyboard.this.f1462q.getItem(i).b).id)});
            }
            if (i > Keyboard.this.f1468w) {
                hpd0 hpd0VarM6909t = Keyboard.this.f1462q.m6909t(((StickerPackage) Keyboard.this.f1462q.getItem(i).b).id, true);
                if (((Boolean) hpd0VarM6909t.get()).booleanValue()) {
                    hpd0VarM6909t.put(Boolean.FALSE);
                    Keyboard.this.f1462q.notifyDataSetChanged();
                }
            }
            if (CoreModule.P().i().q() && i == 1) {
                CoreModule.c.Z.T.z();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$b */
    public class C0097b extends AbstractC0158a<j760<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: c */
        public List<j760<StickerBundle, StickerPackage>> f1473c;

        public C0097b() {
            this.f1473c = Collections.EMPTY_LIST;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public void m1899I(int i) {
            if (i == 0) {
                m1904A(kye.f5127d);
            } else if (i == 1) {
                m1906C(eoj0.C0278a.f3345b);
            } else if (i == 2) {
                m1906C(eoj0.C0278a.f3346c);
            } else {
                m1905B(i);
            }
            Keyboard.this.f1455j.setSelection(i);
            m1910G(true);
        }

        /* JADX INFO: renamed from: A */
        public final void m1904A(final ArrayList<kye.C0395a> arrayList) {
            Keyboard.this.f1451f.setAdapter(new ViewOnClickListenerC0124a(new e30() { // from class: l.ayq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2323a.m1907D(arrayList, (String) obj);
                }
            }, arrayList));
            Keyboard.this.f1457l.setVisibility(4);
            Keyboard.this.f1456k.setVisibility(4);
        }

        /* JADX INFO: renamed from: B */
        public final void m1905B(final int i) {
            Keyboard.this.f1451f.setAdapter(new ViewOnClickListenerC0125b((StickerPackage) getItem(i).b, Keyboard.this.m1888p(), new e30() { // from class: l.yxq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9177a.m1908E(i, (Sticker) obj);
                }
            }));
            boolean zEquals = TEnum.equals(((StickerBundle) getItem(i).a).status, "locked");
            xdl0.M0(Keyboard.this.f1457l, zEquals);
            xdl0.M0(Keyboard.this.f1456k, zEquals);
        }

        /* JADX INFO: renamed from: C */
        public final void m1906C(List<String> list) {
            Keyboard.this.f1451f.setAdapter(new rzq(list, new e30() { // from class: l.zxq
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9500a.m1909F((CharSequence) obj);
                }
            }));
            Keyboard.this.f1457l.setVisibility(4);
            Keyboard.this.f1456k.setVisibility(4);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m1907D(ArrayList arrayList, String str) {
            if (Keyboard.this.m1888p().m2048B2()) {
                if (CoreModule.l.i().M()) {
                    if (arrayList.equals(kye.f5125b)) {
                        o6j0.c("e_emoji", "p_chat_view", new o6j0.a[]{o6j0.a.h("emoji_type", "white")});
                    } else if (arrayList.equals(kye.f5127d)) {
                        o6j0.c("e_emoji", "p_chat_view", new o6j0.a[]{o6j0.a.h("emoji_type", "yellow")});
                    }
                }
                Keyboard.this.m1888p().mo2046A0().m8788B1(str);
                int size = arrayList.size();
                ArrayList<kye.C0395a> arrayList2 = kye.f5126c;
                if (size == arrayList2.size() + kye.f5125b.size()) {
                    Iterator<kye.C0395a> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(CoreModule.b.getString(it.next().f5135b), str.substring(1, str.length() - 1))) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m1908E(int i, Sticker sticker) {
            j760<StickerBundle, StickerPackage> item = getItem(i);
            if (CoreModule.l.i().M() && NullChecker.a(item) && NullChecker.a(item.a)) {
                o6j0.c("e_emoji", "p_chat_view", new o6j0.a[]{o6j0.a.h("emoji_type", ((StickerBundle) item.a).name)});
            }
            Keyboard.this.m1888p().mo2066l().m4168R6(sticker, false);
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m1909F(CharSequence charSequence) {
            if (Keyboard.this.m1888p().m2048B2()) {
                Keyboard.this.m1888p().mo2046A0().m8788B1(charSequence);
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m1910G(boolean z) {
            int count = Keyboard.this.f1451f.getAdapter().getCount();
            Keyboard keyboard = Keyboard.this;
            if (count == 1) {
                keyboard.f1452g.setVisibility(4);
                return;
            }
            keyboard.f1452g.setVisibility(0);
            Keyboard keyboard2 = Keyboard.this;
            keyboard2.f1452g.setViewPager(keyboard2.f1451f);
            if (z) {
                Keyboard.this.f1452g.setCurrentItem(0);
            }
        }

        /* JADX INFO: renamed from: H */
        public void m1911H(List<j760<StickerBundle, StickerPackage>> list) {
            ArrayList arrayList = new ArrayList(list);
            this.f1473c = arrayList;
            arrayList.add(0, null);
            this.f1473c.add(0, null);
            this.f1473c.add(0, null);
            notifyDataSetChanged();
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: m */
        public View mo1006m(ViewGroup viewGroup, int i) {
            return o7r.a(Keyboard.this.getContext()).inflate(l6c0.n5, viewGroup, false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= getCount()) {
                i = 0;
            }
            getItem(i);
            if (i == ((Integer) CoreModule.c.e0.M1.get()).intValue()) {
                return;
            }
            CoreModule.c.e0.M1.put(Integer.valueOf(i));
            m1899I(i);
        }

        @Override // p003l.AbstractC0158a
        /* JADX INFO: renamed from: p */
        public List<j760<StickerBundle, StickerPackage>> mo1912p() {
            return this.f1473c;
        }

        @Override // p003l.wp1
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo1005j(View view, j760<StickerBundle, StickerPackage> j760Var, int i, int i2) {
            SimpleDraweeView simpleDraweeView = (VDraweeView) view.findViewById(y4c0.o1);
            view.findViewById(y4c0.K3);
            simpleDraweeView.setBackground(null);
            if (i2 == 0) {
                simpleDraweeView.setImageDrawable(new fxe(simpleDraweeView.getContext(), "😊", 16.0f, t100.d(24.0f)));
                return;
            }
            if (i2 == 1) {
                simpleDraweeView.setImageDrawable(new fxe(simpleDraweeView.getContext(), "🐶", 16.0f, t100.d(24.0f)));
            } else if (i2 == 2) {
                simpleDraweeView.setImageDrawable(new fxe(simpleDraweeView.getContext(), "🍔", 16.0f, t100.d(24.0f)));
            } else {
                qib0.G.Q0(simpleDraweeView, ((Picture) ((StickerPackage) j760Var.b).pictures.get(0)).stickerPackage());
            }
        }
    }

    public Keyboard(Context context) {
        super(context);
        this.f1459n = new ArrayList();
        this.f1460o = null;
        this.f1461p = new C0097b();
        this.f1466u = false;
        this.f1467v = false;
        this.f1468w = CoreModule.P().i().q() ? 2 : 3;
        this.f1469x = t100.d(41.0f);
        this.f1470y = t100.d(34.0f);
        this.f1471z = t100.d(14.0f);
        this.f1445A = (((xdl0.y0() - t100.d(32.0f)) / 3) - t100.d(16.0f)) / 2;
        m1889q();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1869a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m1872d(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setPagerAdapterByPage(int i) {
        this.f1451f.T(i, true);
        this.f1463r.m8623Y();
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m1882A(j760 j760Var) {
        if (TextUtils.equals(((StickerPackage) j760Var.b).id, MessageWarmingUpHelper.m2303n())) {
            return m1888p().mo2066l().m4233e6() ? Boolean.TRUE : Boolean.FALSE;
        }
        if (TextUtils.equals(((StickerPackage) j760Var.b).id, MessageWarmingUpHelper.m2293d())) {
            return m1888p().mo2066l().m4228d6() ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public void m1883C() {
        if (NullChecker.a(this.f1463r)) {
            this.f1463r.m8621W();
        }
        if (vwb.J(this.f1460o)) {
            return;
        }
        m1884D(this.f1460o);
    }

    /* JADX INFO: renamed from: D */
    public void m1884D(List<j760<StickerBundle, StickerPackage>> list) {
        this.f1460o = list;
        ArrayList arrayListN = vwb.n(list, new w9j() { // from class: l.vxq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8460a.m1882A((j760) obj);
            }
        });
        if (!CoreModule.P().i().G1()) {
            this.f1461p.m1911H(arrayListN);
            int iIntValue = ((Integer) CoreModule.c.e0.M1.get()).intValue();
            if (iIntValue < this.f1461p.getCount()) {
                this.f1461p.m1899I(iIntValue);
                return;
            }
            return;
        }
        this.f1463r.m8620V(arrayListN);
        this.f1462q.m6910w(arrayListN);
        int iIntValue2 = ((Integer) CoreModule.c.e0.M1.get()).intValue();
        if (iIntValue2 < this.f1462q.getCount()) {
            this.f1462q.m6911y(iIntValue2);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m1885E() {
    }

    public tpd0 getCurrentPackage() {
        return CoreModule.c.e0.M1;
    }

    /* JADX INFO: renamed from: n */
    public final void m1886n(View view) {
        szq.a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final void m1887o(View view) {
        tzq.a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Link link = new Link();
        link.intent = LinkIntent.get("sticker");
        link.href = "https://r.tantanapp.com/user/" + CoreModule.H().userId();
        ShareHelper shareHelper = new ShareHelper(link);
        shareHelper.w0(m1888p(), m1888p().string(R.string.b6), m1888p().string(R.string.c6), (ArrayList) null, false).subscribe((m250) mkd0.H(new e30() { // from class: l.nxq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5996a.m1893u((roj0) obj);
            }
        }, new e30() { // from class: l.pxq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6551a.m1894v((Throwable) obj);
            }
        }));
        if (NullChecker.a(this.f1465t)) {
            shareHelper.t0(new f30() { // from class: l.qxq
                @Override // p003l.f30
                public final void call(Object obj, Object obj2) {
                    this.f6721a.m1895w((String) obj, (String) obj2);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!CoreModule.P().i().G1()) {
            m1886n(this);
            this.f1455j.setAdapter((ListAdapter) this.f1461p);
            this.f1455j.setOnItemClickListener(this.f1461p);
            this.f1456k.setOnTouchListener(new View.OnTouchListener() { // from class: l.uxq
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return Keyboard.m1872d(view, motionEvent);
                }
            });
            this.f1458m.setOnClickListener(this);
            this.f1457l.setVisibility(4);
            this.f1456k.setVisibility(4);
            setBackgroundColor(-1775379);
            return;
        }
        this.f1459n.add(eoj0.C0278a.f3344a);
        this.f1459n.add(eoj0.C0278a.f3345b);
        this.f1459n.add(eoj0.C0278a.f3346c);
        m1887o(this);
        this.f1455j = this.f1447b;
        this.f1451f = this.f1450e;
        this.f1454i = this.f1446a;
        new ArrayList();
        ArrayList<kye.C0395a> arrayListM6953d = pxe.m6948c().m6953d();
        this.f1455j.setAdapter((ListAdapter) this.f1462q);
        this.f1455j.setOnItemClickListener(this.f1462q);
        wyq wyqVar = new wyq(m1888p(), new e30() { // from class: l.rxq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7112a.m1896x((String) obj);
            }
        }, new e30() { // from class: l.sxq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7360a.m1897y((Sticker) obj);
            }
        }, m1888p().mo2046A0().m6499g0().m4844t0().getBar_center_text(), arrayListM6953d, this.f1459n, new d30() { // from class: l.txq
            @Override // p003l.d30
            public final void call() {
                this.f7822a.m1898z();
            }
        }, false, false);
        this.f1463r = wyqVar;
        this.f1451f.setAdapter(wyqVar);
        this.f1451f.d(new C0096a());
    }

    /* JADX INFO: renamed from: p */
    public MessagesAct m1888p() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m1889q() {
        this.f1462q = new ps9(this);
    }

    /* JADX INFO: renamed from: r */
    public boolean m1890r() {
        VFrame vFrame = this.f1457l;
        return vFrame != null && vFrame.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m1891s(roj0 roj0Var) {
        this.f1457l.setVisibility(4);
        this.f1456k.setVisibility(4);
        if (NullChecker.a(this.f1464s)) {
            this.f1464s.call();
        }
    }

    public void setNestedScrolling(boolean z) {
        if (NullChecker.a(this.f1463r)) {
            this.f1463r.m8627c0(z);
        }
    }

    public void setShareCancelCallbackListener(d30 d30Var) {
        this.f1465t = d30Var;
    }

    public void setUnlockSuccessListener(d30 d30Var) {
        this.f1464s = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1892t() {
        CoreModule.c.Z.S.E().subscribe((m250) mkd0.H(new e30() { // from class: l.xxq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8873a.m1891s((roj0) obj);
            }
        }, new e30() { // from class: l.oxq
            @Override // p003l.e30
            public final void call(Object obj) {
                Keyboard.m1869a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1893u(roj0 roj0Var) {
        m1888p().post(new Runnable() { // from class: l.wxq
            @Override // java.lang.Runnable
            public final void run() {
                this.f8639a.m1892t();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1894v(Throwable th) {
        if (th instanceof ShareHelper.PlatformNotFoundException) {
            yij0.D(th);
        } else {
            w3z.m8442N(m1888p());
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m1895w(String str, String str2) {
        if (str2.equals("cancel")) {
            this.f1465t.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m1896x(String str) {
        if (m1888p().m2048B2()) {
            m1888p().mo2046A0().m8788B1(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m1897y(Sticker sticker) {
        m1888p().mo2066l().m4168R6(sticker, false);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m1898z() {
        m1888p().mo2066l().m6497e0().mo2046A0().m8822k1();
    }

    public Keyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1459n = new ArrayList();
        this.f1460o = null;
        this.f1461p = new C0097b();
        this.f1466u = false;
        this.f1467v = false;
        this.f1468w = CoreModule.P().i().q() ? 2 : 3;
        this.f1469x = t100.d(41.0f);
        this.f1470y = t100.d(34.0f);
        this.f1471z = t100.d(14.0f);
        this.f1445A = (((xdl0.y0() - t100.d(32.0f)) / 3) - t100.d(16.0f)) / 2;
        m1889q();
    }

    public Keyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1459n = new ArrayList();
        this.f1460o = null;
        this.f1461p = new C0097b();
        this.f1466u = false;
        this.f1467v = false;
        this.f1468w = CoreModule.P().i().q() ? 2 : 3;
        this.f1469x = t100.d(41.0f);
        this.f1470y = t100.d(34.0f);
        this.f1471z = t100.d(14.0f);
        this.f1445A = (((xdl0.y0() - t100.d(32.0f)) / 3) - t100.d(16.0f)) / 2;
        m1889q();
    }
}
