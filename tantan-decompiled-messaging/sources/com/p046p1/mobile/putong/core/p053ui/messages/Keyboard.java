package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.Keyboard;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.ViewOnClickListenerC8541a;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.ViewOnClickListenerC8542b;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p147v.VButton_FakeShadow;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VList_Horizontal;
import p147v.VPager;
import p147v.VPagerCircleIndicator;
import p149l.AbstractC15503a;
import p149l.d30;
import p149l.e30;
import p149l.eoj0;
import p149l.f30;
import p149l.fxe;
import p149l.hpd0;
import p149l.j760;
import p149l.kye;
import p149l.l6c0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.o7r;
import p149l.ps9;
import p149l.pxe;
import p149l.qib0;
import p149l.roj0;
import p149l.rzq;
import p149l.szq;
import p149l.t100;
import p149l.tpd0;
import p149l.tzq;
import p149l.vwb;
import p149l.w3z;
import p149l.w9j;
import p149l.wyq;
import p149l.xdl0;
import p149l.y4c0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class Keyboard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public int f31554A;

    /* JADX INFO: renamed from: a */
    public LinearLayout f31555a;

    /* JADX INFO: renamed from: b */
    public VList_Horizontal f31556b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f31557c;

    /* JADX INFO: renamed from: d */
    public TabLayout f31558d;

    /* JADX INFO: renamed from: e */
    public VPager f31559e;

    /* JADX INFO: renamed from: f */
    public VPager f31560f;

    /* JADX INFO: renamed from: g */
    public VPagerCircleIndicator f31561g;

    /* JADX INFO: renamed from: h */
    public View f31562h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f31563i;

    /* JADX INFO: renamed from: j */
    public VList_Horizontal f31564j;

    /* JADX INFO: renamed from: k */
    public VFrame f31565k;

    /* JADX INFO: renamed from: l */
    public VFrame f31566l;

    /* JADX INFO: renamed from: m */
    public VButton_FakeShadow f31567m;

    /* JADX INFO: renamed from: n */
    public List<List<String>> f31568n;

    /* JADX INFO: renamed from: o */
    public List<j760<StickerBundle, StickerPackage>> f31569o;

    /* JADX INFO: renamed from: p */
    public C8514b f31570p;

    /* JADX INFO: renamed from: q */
    public ps9 f31571q;

    /* JADX INFO: renamed from: r */
    public wyq f31572r;

    /* JADX INFO: renamed from: s */
    public d30 f31573s;

    /* JADX INFO: renamed from: t */
    public d30 f31574t;

    /* JADX INFO: renamed from: u */
    public boolean f31575u;

    /* JADX INFO: renamed from: v */
    public boolean f31576v;

    /* JADX INFO: renamed from: w */
    public final int f31577w;

    /* JADX INFO: renamed from: x */
    public int f31578x;

    /* JADX INFO: renamed from: y */
    public int f31579y;

    /* JADX INFO: renamed from: z */
    public int f31580z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$a */
    public class C8513a implements ViewPager.InterfaceC0716j {
        public C8513a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            Keyboard.this.f31564j.setSelection(i);
            if (xdl0.m208349O0(Keyboard.this.f31558d)) {
                CoreModule.f17545c.f19639e0.f149218M1.put(Integer.valueOf(i));
            }
            if (i >= 3) {
                zvf0.m220399u("e_stickers_type", OMSDialogPositon.p_chat_view, vwb.m200311Y("stickers_id", Keyboard.this.f31571q.getItem(i).f116565b.f20506id));
            }
            if (i > Keyboard.this.f31577w) {
                hpd0 hpd0VarM171112t = Keyboard.this.f31571q.m171112t(Keyboard.this.f31571q.getItem(i).f116565b.f20506id, true);
                if (hpd0VarM171112t.get().booleanValue()) {
                    hpd0VarM171112t.put(Boolean.FALSE);
                    Keyboard.this.f31571q.notifyDataSetChanged();
                }
            }
            if (CoreModule.m29935P().m94658i().mo158431q() && i == 1) {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$b */
    public class C8514b extends AbstractC15503a<j760<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: c */
        public List<j760<StickerBundle, StickerPackage>> f31582c;

        public C8514b() {
            this.f31582c = Collections.EMPTY_LIST;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public void m48815I(int i) {
            if (i == 0) {
                m48820A(kye.f125279d);
            } else if (i == 1) {
                m48822C(eoj0.C16651a.f92448b);
            } else if (i == 2) {
                m48822C(eoj0.C16651a.f92449c);
            } else {
                m48821B(i);
            }
            Keyboard.this.f31564j.setSelection(i);
            m48826G(true);
        }

        /* JADX INFO: renamed from: A */
        public final void m48820A(final ArrayList<kye.C18115a> arrayList) {
            Keyboard.this.f31560f.setAdapter(new ViewOnClickListenerC8541a(new e30() { // from class: l.ayq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f72303a.m48823D(arrayList, (String) obj);
                }
            }, arrayList));
            Keyboard.this.f31566l.setVisibility(4);
            Keyboard.this.f31565k.setVisibility(4);
        }

        /* JADX INFO: renamed from: B */
        public final void m48821B(final int i) {
            Keyboard.this.f31560f.setAdapter(new ViewOnClickListenerC8542b(getItem(i).f116565b, Keyboard.this.m48804p(), new e30() { // from class: l.yxq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200656a.m48824E(i, (Sticker) obj);
                }
            }));
            boolean zEquals = TEnum.equals(getItem(i).f116564a.status, "locked");
            xdl0.m208345M0(Keyboard.this.f31566l, zEquals);
            xdl0.m208345M0(Keyboard.this.f31565k, zEquals);
        }

        /* JADX INFO: renamed from: C */
        public final void m48822C(List<String> list) {
            Keyboard.this.f31560f.setAdapter(new rzq(list, new e30() { // from class: l.zxq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205481a.m48825F((CharSequence) obj);
                }
            }));
            Keyboard.this.f31566l.setVisibility(4);
            Keyboard.this.f31565k.setVisibility(4);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m48823D(ArrayList arrayList, String str) {
            if (Keyboard.this.m48804p().m48956B2()) {
                if (CoreModule.f17554l.m94658i().mo158266M()) {
                    if (arrayList.equals(kye.f125277b)) {
                        o6j0.m162859c("e_emoji", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("emoji_type", "white"));
                    } else if (arrayList.equals(kye.f125279d)) {
                        o6j0.m162859c("e_emoji", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("emoji_type", "yellow"));
                    }
                }
                Keyboard.this.m48804p().mo48954A0().m210890B1(str);
                int size = arrayList.size();
                ArrayList<kye.C18115a> arrayList2 = kye.f125278c;
                if (size == arrayList2.size() + kye.f125277b.size()) {
                    Iterator<kye.C18115a> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(CoreModule.f17544b.getString(it.next().f125287b), str.substring(1, str.length() - 1))) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m48824E(int i, Sticker sticker) {
            j760<StickerBundle, StickerPackage> item = getItem(i);
            if (CoreModule.f17554l.m94658i().mo158266M() && NullChecker.m81303a(item) && NullChecker.m81303a(item.f116564a)) {
                o6j0.m162859c("e_emoji", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("emoji_type", item.f116564a.name));
            }
            Keyboard.this.m48804p().mo48974l().m120703R6(sticker, false);
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m48825F(CharSequence charSequence) {
            if (Keyboard.this.m48804p().m48956B2()) {
                Keyboard.this.m48804p().mo48954A0().m210890B1(charSequence);
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m48826G(boolean z) {
            int count = Keyboard.this.f31560f.getAdapter().getCount();
            Keyboard keyboard = Keyboard.this;
            if (count == 1) {
                keyboard.f31561g.setVisibility(4);
                return;
            }
            keyboard.f31561g.setVisibility(0);
            Keyboard keyboard2 = Keyboard.this;
            keyboard2.f31561g.setViewPager(keyboard2.f31560f);
            if (z) {
                Keyboard.this.f31561g.setCurrentItem(0);
            }
        }

        /* JADX INFO: renamed from: H */
        public void m48827H(List<j760<StickerBundle, StickerPackage>> list) {
            ArrayList arrayList = new ArrayList(list);
            this.f31582c = arrayList;
            arrayList.add(0, null);
            this.f31582c.add(0, null);
            this.f31582c.add(0, null);
            notifyDataSetChanged();
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            return o7r.m163037a(Keyboard.this.getContext()).inflate(l6c0.f126528n5, viewGroup, false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= getCount()) {
                i = 0;
            }
            getItem(i);
            if (i == CoreModule.f17545c.f19639e0.f149218M1.get().intValue()) {
                return;
            }
            CoreModule.f17545c.f19639e0.f149218M1.put(Integer.valueOf(i));
            m48815I(i);
        }

        @Override // p149l.AbstractC15503a
        /* JADX INFO: renamed from: p */
        public List<j760<StickerBundle, StickerPackage>> mo20404p() {
            return this.f31582c;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, j760<StickerBundle, StickerPackage> j760Var, int i, int i2) {
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(y4c0.f196187o1);
            view.findViewById(y4c0.f195995K3);
            vDraweeView.setBackground(null);
            if (i2 == 0) {
                vDraweeView.setImageDrawable(new fxe(vDraweeView.getContext(), "😊", 16.0f, t100.m186890d(24.0f)));
                return;
            }
            if (i2 == 1) {
                vDraweeView.setImageDrawable(new fxe(vDraweeView.getContext(), "🐶", 16.0f, t100.m186890d(24.0f)));
            } else if (i2 == 2) {
                vDraweeView.setImageDrawable(new fxe(vDraweeView.getContext(), "🍔", 16.0f, t100.m186890d(24.0f)));
            } else {
                qib0.f154691G.m102341Q0(vDraweeView, j760Var.f116565b.pictures.get(0).stickerPackage());
            }
        }
    }

    public Keyboard(Context context) {
        super(context);
        this.f31568n = new ArrayList();
        this.f31569o = null;
        this.f31570p = new C8514b();
        this.f31575u = false;
        this.f31576v = false;
        this.f31577w = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 3;
        this.f31578x = t100.m186890d(41.0f);
        this.f31579y = t100.m186890d(34.0f);
        this.f31580z = t100.m186890d(14.0f);
        this.f31554A = (((xdl0.m208412y0() - t100.m186890d(32.0f)) / 3) - t100.m186890d(16.0f)) / 2;
        m48805q();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48785a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m48788d(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setPagerAdapterByPage(int i) {
        this.f31560f.m4176T(i, true);
        this.f31572r.m206152Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m48798A(j760 j760Var) {
        if (TextUtils.equals(((StickerPackage) j760Var.f116565b).f20506id, MessageWarmingUpHelper.m49184n())) {
            return m48804p().mo48974l().mo120766e6() ? Boolean.TRUE : Boolean.FALSE;
        }
        if (TextUtils.equals(((StickerPackage) j760Var.f116565b).f20506id, MessageWarmingUpHelper.m49174d())) {
            return m48804p().mo48974l().mo120761d6() ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public void m48799C() {
        if (NullChecker.m81303a(this.f31572r)) {
            this.f31572r.m206150W();
        }
        if (vwb.m200296J(this.f31569o)) {
            return;
        }
        m48800D(this.f31569o);
    }

    /* JADX INFO: renamed from: D */
    public void m48800D(List<j760<StickerBundle, StickerPackage>> list) {
        this.f31569o = list;
        ArrayList arrayListM200339n = vwb.m200339n(list, new w9j() { // from class: l.vxq
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f183474a.m48798A((j760) obj);
            }
        });
        if (!CoreModule.m29935P().m94658i().mo158233G1()) {
            this.f31570p.m48827H(arrayListM200339n);
            int iIntValue = CoreModule.f17545c.f19639e0.f149218M1.get().intValue();
            if (iIntValue < this.f31570p.getCount()) {
                this.f31570p.m48815I(iIntValue);
                return;
            }
            return;
        }
        this.f31572r.m206149V(arrayListM200339n);
        this.f31571q.m171113w(arrayListM200339n);
        int iIntValue2 = CoreModule.f17545c.f19639e0.f149218M1.get().intValue();
        if (iIntValue2 < this.f31571q.getCount()) {
            this.f31571q.m171114y(iIntValue2);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m48801E() {
    }

    public tpd0 getCurrentPackage() {
        return CoreModule.f17545c.f19639e0.f149218M1;
    }

    /* JADX INFO: renamed from: n */
    public final void m48802n(View view) {
        szq.m186796a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final void m48803o(View view) {
        tzq.m191213a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Link link = new Link();
        link.intent = LinkIntent.get("sticker");
        link.href = "https://r.tantanapp.com/user/" + CoreModule.m29931H().userId();
        ShareHelper shareHelper = new ShareHelper(link);
        shareHelper.m80019w0(m48804p(), m48804p().string(R$string.f20932b6), m48804p().string(R$string.f20941c6), null, false).subscribe(mkd0.m154956H(new e30() { // from class: l.nxq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141044a.m48809u((roj0) obj);
            }
        }, new e30() { // from class: l.pxq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151717a.m48810v((Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(this.f31574t)) {
            shareHelper.m80016t0(new f30() { // from class: l.qxq
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f156860a.m48811w((String) obj, (String) obj2);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!CoreModule.m29935P().m94658i().mo158233G1()) {
            m48802n(this);
            this.f31564j.setAdapter((ListAdapter) this.f31570p);
            this.f31564j.setOnItemClickListener(this.f31570p);
            this.f31565k.setOnTouchListener(new View.OnTouchListener() { // from class: l.uxq
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return Keyboard.m48788d(view, motionEvent);
                }
            });
            this.f31567m.setOnClickListener(this);
            this.f31566l.setVisibility(4);
            this.f31565k.setVisibility(4);
            setBackgroundColor(-1775379);
            return;
        }
        this.f31568n.add(eoj0.C16651a.f92447a);
        this.f31568n.add(eoj0.C16651a.f92448b);
        this.f31568n.add(eoj0.C16651a.f92449c);
        m48803o(this);
        this.f31564j = this.f31556b;
        this.f31560f = this.f31559e;
        this.f31563i = this.f31555a;
        new ArrayList();
        ArrayList<kye.C18115a> arrayListM171840d = pxe.m171835c().m171840d();
        this.f31564j.setAdapter((ListAdapter) this.f31571q);
        this.f31564j.setOnItemClickListener(this.f31571q);
        wyq wyqVar = new wyq(m48804p(), new e30() { // from class: l.rxq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161494a.m48812x((String) obj);
            }
        }, new e30() { // from class: l.sxq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166815a.m48813y((Sticker) obj);
            }
        }, m48804p().mo48954A0().m156457g0().m128210t0().getBar_center_text(), arrayListM171840d, this.f31568n, new d30() { // from class: l.txq
            @Override // p149l.d30
            public final void call() {
                this.f172527a.m48814z();
            }
        }, false, false);
        this.f31572r = wyqVar;
        this.f31560f.setAdapter(wyqVar);
        this.f31560f.m4185d(new C8513a());
    }

    /* JADX INFO: renamed from: p */
    public MessagesAct m48804p() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m48805q() {
        this.f31571q = new ps9(this);
    }

    /* JADX INFO: renamed from: r */
    public boolean m48806r() {
        VFrame vFrame = this.f31566l;
        return vFrame != null && vFrame.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m48807s(roj0 roj0Var) {
        this.f31566l.setVisibility(4);
        this.f31565k.setVisibility(4);
        if (NullChecker.m81303a(this.f31573s)) {
            this.f31573s.call();
        }
    }

    public void setNestedScrolling(boolean z) {
        if (NullChecker.m81303a(this.f31572r)) {
            this.f31572r.m206156c0(z);
        }
    }

    public void setShareCancelCallbackListener(d30 d30Var) {
        this.f31574t = d30Var;
    }

    public void setUnlockSuccessListener(d30 d30Var) {
        this.f31573s = d30Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m48808t() {
        CoreModule.f17545c.f19624Z.f20142S.m34932E().subscribe(mkd0.m154956H(new e30() { // from class: l.xxq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194904a.m48807s((roj0) obj);
            }
        }, new e30() { // from class: l.oxq
            @Override // p149l.e30
            public final void call(Object obj) {
                Keyboard.m48785a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m48809u(roj0 roj0Var) {
        m48804p().post(new Runnable() { // from class: l.wxq
            @Override // java.lang.Runnable
            public final void run() {
                this.f188507a.m48808t();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m48810v(Throwable th) {
        if (th instanceof ShareHelper.PlatformNotFoundException) {
            yij0.m214926D(th);
        } else {
            w3z.m201408N(m48804p());
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m48811w(String str, String str2) {
        if (str2.equals("cancel")) {
            this.f31574t.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m48812x(String str) {
        if (m48804p().m48956B2()) {
            m48804p().mo48954A0().m210890B1(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m48813y(Sticker sticker) {
        m48804p().mo48974l().m120703R6(sticker, false);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m48814z() {
        m48804p().mo48974l().m156455e0().mo48954A0().m210923k1();
    }

    public Keyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31568n = new ArrayList();
        this.f31569o = null;
        this.f31570p = new C8514b();
        this.f31575u = false;
        this.f31576v = false;
        this.f31577w = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 3;
        this.f31578x = t100.m186890d(41.0f);
        this.f31579y = t100.m186890d(34.0f);
        this.f31580z = t100.m186890d(14.0f);
        this.f31554A = (((xdl0.m208412y0() - t100.m186890d(32.0f)) / 3) - t100.m186890d(16.0f)) / 2;
        m48805q();
    }

    public Keyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31568n = new ArrayList();
        this.f31569o = null;
        this.f31570p = new C8514b();
        this.f31575u = false;
        this.f31576v = false;
        this.f31577w = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 3;
        this.f31578x = t100.m186890d(41.0f);
        this.f31579y = t100.m186890d(34.0f);
        this.f31580z = t100.m186890d(14.0f);
        this.f31554A = (((xdl0.m208412y0() - t100.m186890d(32.0f)) / 3) - t100.m186890d(16.0f)) / 2;
        m48805q();
    }
}
