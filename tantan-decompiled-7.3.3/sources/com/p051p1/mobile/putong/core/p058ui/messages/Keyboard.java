package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.Keyboard;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.ViewOnClickListenerC8704a;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.ViewOnClickListenerC8705b;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p151v.VButton_FakeShadow;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VList_Horizontal;
import p151v.VPager;
import p151v.VPagerCircleIndicator;
import p153l.AbstractC15610a;
import p153l.au9;
import p153l.bnl0;
import p153l.bsj0;
import p153l.edc0;
import p153l.hxj0;
import p153l.i4g0;
import p153l.jxd0;
import p153l.jyb;
import p153l.jye;
import p153l.oze;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.r1r;
import p153l.s1r;
import p153l.sfj0;
import p153l.t1r;
import p153l.tcz;
import p153l.tye;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.w0r;
import p153l.x20;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes3.dex */
public class Keyboard extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: A */
    public int f32402A;

    /* JADX INFO: renamed from: a */
    public LinearLayout f32403a;

    /* JADX INFO: renamed from: b */
    public VList_Horizontal f32404b;

    /* JADX INFO: renamed from: c */
    public AppBarLayout f32405c;

    /* JADX INFO: renamed from: d */
    public TabLayout f32406d;

    /* JADX INFO: renamed from: e */
    public VPager f32407e;

    /* JADX INFO: renamed from: f */
    public VPager f32408f;

    /* JADX INFO: renamed from: g */
    public VPagerCircleIndicator f32409g;

    /* JADX INFO: renamed from: h */
    public View f32410h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f32411i;

    /* JADX INFO: renamed from: j */
    public VList_Horizontal f32412j;

    /* JADX INFO: renamed from: k */
    public VFrame f32413k;

    /* JADX INFO: renamed from: l */
    public VFrame f32414l;

    /* JADX INFO: renamed from: m */
    public VButton_FakeShadow f32415m;

    /* JADX INFO: renamed from: n */
    public List<List<String>> f32416n;

    /* JADX INFO: renamed from: o */
    public List<pf60<StickerBundle, StickerPackage>> f32417o;

    /* JADX INFO: renamed from: p */
    public C8677b f32418p;

    /* JADX INFO: renamed from: q */
    public au9 f32419q;

    /* JADX INFO: renamed from: r */
    public w0r f32420r;

    /* JADX INFO: renamed from: s */
    public x20 f32421s;

    /* JADX INFO: renamed from: t */
    public x20 f32422t;

    /* JADX INFO: renamed from: u */
    public boolean f32423u;

    /* JADX INFO: renamed from: v */
    public boolean f32424v;

    /* JADX INFO: renamed from: w */
    public final int f32425w;

    /* JADX INFO: renamed from: x */
    public int f32426x;

    /* JADX INFO: renamed from: y */
    public int f32427y;

    /* JADX INFO: renamed from: z */
    public int f32428z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$a */
    public class C8676a implements ViewPager.InterfaceC0718j {
        public C8676a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            Keyboard.this.f32412j.setSelection(i);
            if (bnl0.m105529O0(Keyboard.this.f32406d)) {
                CoreModule.f18264c.f20381e0.f89075M1.put(Integer.valueOf(i));
            }
            if (i >= 3) {
                i4g0.m138523u("e_stickers_type", OMSDialogPositon.p_chat_view, jyb.m147494Y("stickers_id", Keyboard.this.f32419q.getItem(i).f152157b.f21248id));
            }
            if (i > Keyboard.this.f32425w) {
                jxd0 jxd0VarM100366t = Keyboard.this.f32419q.m100366t(Keyboard.this.f32419q.getItem(i).f152157b.f21248id, true);
                if (jxd0VarM100366t.get().booleanValue()) {
                    jxd0VarM100366t.put(Boolean.FALSE);
                    Keyboard.this.f32419q.notifyDataSetChanged();
                }
            }
            if (CoreModule.m30933P().m143412i().mo180523q() && i == 1) {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.Keyboard$b */
    public class C8677b extends AbstractC15610a<pf60<StickerBundle, StickerPackage>> implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: c */
        public List<pf60<StickerBundle, StickerPackage>> f32430c;

        public C8677b() {
            this.f32430c = Collections.EMPTY_LIST;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public void m49998I(int i) {
            if (i == 0) {
                m50003A(oze.f149866d);
            } else if (i == 1) {
                m50005C(hxj0.C17589a.f112013b);
            } else if (i == 2) {
                m50005C(hxj0.C17589a.f112014c);
            } else {
                m50004B(i);
            }
            Keyboard.this.f32412j.setSelection(i);
            m50009G(true);
        }

        /* JADX INFO: renamed from: A */
        public final void m50003A(final ArrayList<oze.C19253a> arrayList) {
            Keyboard.this.f32408f.setAdapter(new ViewOnClickListenerC8704a(new y20() { // from class: l.a0r
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f67740a.m50006D(arrayList, (String) obj);
                }
            }, arrayList));
            Keyboard.this.f32414l.setVisibility(4);
            Keyboard.this.f32413k.setVisibility(4);
        }

        /* JADX INFO: renamed from: B */
        public final void m50004B(final int i) {
            Keyboard.this.f32408f.setAdapter(new ViewOnClickListenerC8705b(getItem(i).f152157b, Keyboard.this.m49987p(), new y20() { // from class: l.yzq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202214a.m50007E(i, (Sticker) obj);
                }
            }));
            boolean zEquals = TEnum.equals(getItem(i).f152156a.status, "locked");
            bnl0.m105525M0(Keyboard.this.f32414l, zEquals);
            bnl0.m105525M0(Keyboard.this.f32413k, zEquals);
        }

        /* JADX INFO: renamed from: C */
        public final void m50005C(List<String> list) {
            Keyboard.this.f32408f.setAdapter(new r1r(list, new y20() { // from class: l.zzq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f206735a.m50008F((CharSequence) obj);
                }
            }));
            Keyboard.this.f32414l.setVisibility(4);
            Keyboard.this.f32413k.setVisibility(4);
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m50006D(ArrayList arrayList, String str) {
            if (Keyboard.this.m49987p().m50140C2()) {
                if (CoreModule.f18273l.m143412i().mo180358M()) {
                    if (arrayList.equals(oze.f149864b)) {
                        sfj0.m185596c("e_emoji", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("emoji_type", "white"));
                    } else if (arrayList.equals(oze.f149866d)) {
                        sfj0.m185596c("e_emoji", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("emoji_type", "yellow"));
                    }
                }
                Keyboard.this.m49987p().mo50138B0().m194168B1(str);
                int size = arrayList.size();
                ArrayList<oze.C19253a> arrayList2 = oze.f149865c;
                if (size == arrayList2.size() + oze.f149864b.size()) {
                    Iterator<oze.C19253a> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (TextUtils.equals(CoreModule.f18263b.getString(it.next().f149874b), str.substring(1, str.length() - 1))) {
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m50007E(int i, Sticker sticker) {
            pf60<StickerBundle, StickerPackage> item = getItem(i);
            if (CoreModule.f18273l.m143412i().mo180358M() && NullChecker.m82486a(item) && NullChecker.m82486a(item.f152156a)) {
                sfj0.m185596c("e_emoji", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("emoji_type", item.f152156a.name));
            }
            Keyboard.this.m49987p().mo50158l().m110909R6(sticker, false);
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m50008F(CharSequence charSequence) {
            if (Keyboard.this.m49987p().m50140C2()) {
                Keyboard.this.m49987p().mo50138B0().m194168B1(charSequence);
            }
        }

        /* JADX INFO: renamed from: G */
        public final void m50009G(boolean z) {
            int count = Keyboard.this.f32408f.getAdapter().getCount();
            Keyboard keyboard = Keyboard.this;
            if (count == 1) {
                keyboard.f32409g.setVisibility(4);
                return;
            }
            keyboard.f32409g.setVisibility(0);
            Keyboard keyboard2 = Keyboard.this;
            keyboard2.f32409g.setViewPager(keyboard2.f32408f);
            if (z) {
                Keyboard.this.f32409g.setCurrentItem(0);
            }
        }

        /* JADX INFO: renamed from: H */
        public void m50010H(List<pf60<StickerBundle, StickerPackage>> list) {
            ArrayList arrayList = new ArrayList(list);
            this.f32430c = arrayList;
            arrayList.add(0, null);
            this.f32430c.add(0, null);
            this.f32430c.add(0, null);
            notifyDataSetChanged();
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            return p9r.m171370a(Keyboard.this.getContext()).inflate(qec0.f157084n5, viewGroup, false);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= getCount()) {
                i = 0;
            }
            getItem(i);
            if (i == CoreModule.f18264c.f20381e0.f89075M1.get().intValue()) {
                return;
            }
            CoreModule.f18264c.f20381e0.f89075M1.put(Integer.valueOf(i));
            m49998I(i);
        }

        @Override // p153l.AbstractC15610a
        /* JADX INFO: renamed from: p */
        public List<pf60<StickerBundle, StickerPackage>> mo21403p() {
            return this.f32430c;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, pf60<StickerBundle, StickerPackage> pf60Var, int i, int i2) {
            VDraweeView vDraweeView = (VDraweeView) view.findViewById(edc0.f93422o1);
            view.findViewById(edc0.f93230K3);
            vDraweeView.setBackground(null);
            if (i2 == 0) {
                vDraweeView.setImageDrawable(new jye(vDraweeView.getContext(), "😊", 16.0f, qa00.m175859d(24.0f)));
                return;
            }
            if (i2 == 1) {
                vDraweeView.setImageDrawable(new jye(vDraweeView.getContext(), "🐶", 16.0f, qa00.m175859d(24.0f)));
            } else if (i2 == 2) {
                vDraweeView.setImageDrawable(new jye(vDraweeView.getContext(), "🍔", 16.0f, qa00.m175859d(24.0f)));
            } else {
                uqb0.f180374G.m127125Q0(vDraweeView, pf60Var.f152157b.pictures.get(0).stickerPackage());
            }
        }
    }

    public Keyboard(Context context) {
        super(context);
        this.f32416n = new ArrayList();
        this.f32417o = null;
        this.f32418p = new C8677b();
        this.f32423u = false;
        this.f32424v = false;
        this.f32425w = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 3;
        this.f32426x = qa00.m175859d(41.0f);
        this.f32427y = qa00.m175859d(34.0f);
        this.f32428z = qa00.m175859d(14.0f);
        this.f32402A = (((bnl0.m105592y0() - qa00.m175859d(32.0f)) / 3) - qa00.m175859d(16.0f)) / 2;
        m49988q();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49968a(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m49971d(View view, MotionEvent motionEvent) {
        return true;
    }

    private void setPagerAdapterByPage(int i) {
        this.f32408f.m4178T(i, true);
        this.f32420r.m204248Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Boolean m49981A(pf60 pf60Var) {
        if (TextUtils.equals(((StickerPackage) pf60Var.f152157b).f21248id, MessageWarmingUpHelper.m50367n())) {
            return m49987p().mo50158l().mo110972e6() ? Boolean.TRUE : Boolean.FALSE;
        }
        if (TextUtils.equals(((StickerPackage) pf60Var.f152157b).f21248id, MessageWarmingUpHelper.m50357d())) {
            return m49987p().mo50158l().mo110967d6() ? Boolean.TRUE : Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: C */
    public void m49982C() {
        if (NullChecker.m82486a(this.f32420r)) {
            this.f32420r.m204246W();
        }
        if (jyb.m147479J(this.f32417o)) {
            return;
        }
        m49983D(this.f32417o);
    }

    /* JADX INFO: renamed from: D */
    public void m49983D(List<pf60<StickerBundle, StickerPackage>> list) {
        this.f32417o = list;
        ArrayList arrayListM147522n = jyb.m147522n(list, new qcj() { // from class: l.vzq
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186507a.m49981A((pf60) obj);
            }
        });
        if (!CoreModule.m30933P().m143412i().mo180325G1()) {
            this.f32418p.m50010H(arrayListM147522n);
            int iIntValue = CoreModule.f18264c.f20381e0.f89075M1.get().intValue();
            if (iIntValue < this.f32418p.getCount()) {
                this.f32418p.m49998I(iIntValue);
                return;
            }
            return;
        }
        this.f32420r.m204245V(arrayListM147522n);
        this.f32419q.m100367w(arrayListM147522n);
        int iIntValue2 = CoreModule.f18264c.f20381e0.f89075M1.get().intValue();
        if (iIntValue2 < this.f32419q.getCount()) {
            this.f32419q.m100368y(iIntValue2);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m49984E() {
    }

    public vxd0 getCurrentPackage() {
        return CoreModule.f18264c.f20381e0.f89075M1;
    }

    /* JADX INFO: renamed from: n */
    public final void m49985n(View view) {
        s1r.m184056a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public final void m49986o(View view) {
        t1r.m188931a(this, view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Link link = new Link();
        link.intent = LinkIntent.get("sticker");
        link.href = "https://r.tantanapp.com/user/" + CoreModule.m30929H().userId();
        ShareHelper shareHelper = new ShareHelper(link);
        shareHelper.m81202w0(m49987p(), m49987p().string(R$string.f21674b6), m49987p().string(R$string.f21683c6), null, false).subscribe(psd0.m173597H(new y20() { // from class: l.nzq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144465a.m49992u((uxj0) obj);
            }
        }, new y20() { // from class: l.pzq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154947a.m49993v((Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(this.f32422t)) {
            shareHelper.m81199t0(new z20() { // from class: l.qzq
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f160292a.m49994w((String) obj, (String) obj2);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (!CoreModule.m30933P().m143412i().mo180325G1()) {
            m49985n(this);
            this.f32412j.setAdapter((ListAdapter) this.f32418p);
            this.f32412j.setOnItemClickListener(this.f32418p);
            this.f32413k.setOnTouchListener(new View.OnTouchListener() { // from class: l.uzq
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return Keyboard.m49971d(view, motionEvent);
                }
            });
            this.f32415m.setOnClickListener(this);
            this.f32414l.setVisibility(4);
            this.f32413k.setVisibility(4);
            setBackgroundColor(-1775379);
            return;
        }
        this.f32416n.add(hxj0.C17589a.f112012a);
        this.f32416n.add(hxj0.C17589a.f112013b);
        this.f32416n.add(hxj0.C17589a.f112014c);
        m49986o(this);
        this.f32412j = this.f32404b;
        this.f32408f = this.f32407e;
        this.f32411i = this.f32403a;
        new ArrayList();
        ArrayList<oze.C19253a> arrayListM193577d = tye.m193572c().m193577d();
        this.f32412j.setAdapter((ListAdapter) this.f32419q);
        this.f32412j.setOnItemClickListener(this.f32419q);
        w0r w0rVar = new w0r(m49987p(), new y20() { // from class: l.rzq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165564a.m49995x((String) obj);
            }
        }, new y20() { // from class: l.szq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171413a.m49996y((Sticker) obj);
            }
        }, m49987p().mo50138B0().m143374g0().m114041t0().getBar_center_text(), arrayListM193577d, this.f32416n, new x20() { // from class: l.tzq
            @Override // p153l.x20
            public final void call() {
                this.f176795a.m49997z();
            }
        }, false, false);
        this.f32420r = w0rVar;
        this.f32408f.setAdapter(w0rVar);
        this.f32408f.m4187d(new C8676a());
    }

    /* JADX INFO: renamed from: p */
    public MessagesAct m49987p() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: q */
    public final void m49988q() {
        this.f32419q = new au9(this);
    }

    /* JADX INFO: renamed from: r */
    public boolean m49989r() {
        VFrame vFrame = this.f32414l;
        return vFrame != null && vFrame.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m49990s(uxj0 uxj0Var) {
        this.f32414l.setVisibility(4);
        this.f32413k.setVisibility(4);
        if (NullChecker.m82486a(this.f32421s)) {
            this.f32421s.call();
        }
    }

    public void setNestedScrolling(boolean z) {
        if (NullChecker.m82486a(this.f32420r)) {
            this.f32420r.m204252c0(z);
        }
    }

    public void setShareCancelCallbackListener(x20 x20Var) {
        this.f32422t = x20Var;
    }

    public void setUnlockSuccessListener(x20 x20Var) {
        this.f32421s = x20Var;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m49991t() {
        CoreModule.f18264c.f20366Z.f20884S.m35935E().subscribe(psd0.m173597H(new y20() { // from class: l.xzq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196904a.m49990s((uxj0) obj);
            }
        }, new y20() { // from class: l.ozq
            @Override // p153l.y20
            public final void call(Object obj) {
                Keyboard.m49968a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m49992u(uxj0 uxj0Var) {
        m49987p().post(new Runnable() { // from class: l.wzq
            @Override // java.lang.Runnable
            public final void run() {
                this.f191819a.m49991t();
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m49993v(Throwable th) {
        if (th instanceof ShareHelper.PlatformNotFoundException) {
            bsj0.m106246D(th);
        } else {
            tcz.m190536N(m49987p());
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m49994w(String str, String str2) {
        if (str2.equals("cancel")) {
            this.f32422t.call();
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m49995x(String str) {
        if (m49987p().m50140C2()) {
            m49987p().mo50138B0().m194168B1(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m49996y(Sticker sticker) {
        m49987p().mo50158l().m110909R6(sticker, false);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m49997z() {
        m49987p().mo50158l().m143372e0().mo50138B0().m194201k1();
    }

    public Keyboard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32416n = new ArrayList();
        this.f32417o = null;
        this.f32418p = new C8677b();
        this.f32423u = false;
        this.f32424v = false;
        this.f32425w = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 3;
        this.f32426x = qa00.m175859d(41.0f);
        this.f32427y = qa00.m175859d(34.0f);
        this.f32428z = qa00.m175859d(14.0f);
        this.f32402A = (((bnl0.m105592y0() - qa00.m175859d(32.0f)) / 3) - qa00.m175859d(16.0f)) / 2;
        m49988q();
    }

    public Keyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32416n = new ArrayList();
        this.f32417o = null;
        this.f32418p = new C8677b();
        this.f32423u = false;
        this.f32424v = false;
        this.f32425w = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 3;
        this.f32426x = qa00.m175859d(41.0f);
        this.f32427y = qa00.m175859d(34.0f);
        this.f32428z = qa00.m175859d(14.0f);
        this.f32402A = (((bnl0.m105592y0() - qa00.m175859d(32.0f)) / 3) - qa00.m175859d(16.0f)) / 2;
        m49988q();
    }
}
