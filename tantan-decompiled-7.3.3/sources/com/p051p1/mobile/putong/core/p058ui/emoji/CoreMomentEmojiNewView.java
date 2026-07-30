package com.p051p1.mobile.putong.core.p058ui.emoji;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.core.data.StickerPackage;
import com.p051p1.mobile.putong.core.data.UserSticker;
import com.p051p1.mobile.putong.core.p058ui.emoji.CoreMomentEmojiNewView;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.meme.CorePopularMemeAct;
import com.p051p1.mobile.putong.data.BundleStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VPager;
import p151v.VRecyclerView;
import p153l.a0a;
import p153l.bnl0;
import p153l.dbc0;
import p153l.edc0;
import p153l.gra;
import p153l.i0a;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.niw;
import p153l.oze;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.uqb0;
import p153l.w0r;
import p153l.x20;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMomentEmojiNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiNewView f29958a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29959b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f29960c;

    /* JADX INFO: renamed from: d */
    public VPager f29961d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29962e;

    /* JADX INFO: renamed from: f */
    public Act f29963f;

    /* JADX INFO: renamed from: g */
    public y20<String> f29964g;

    /* JADX INFO: renamed from: h */
    public x20 f29965h;

    /* JADX INFO: renamed from: i */
    public MessageInputEditView f29966i;

    /* JADX INFO: renamed from: j */
    public boolean f29967j;

    /* JADX INFO: renamed from: k */
    public Runnable f29968k;

    /* JADX INFO: renamed from: l */
    public View f29969l;

    /* JADX INFO: renamed from: m */
    public w0r f29970m;

    /* JADX INFO: renamed from: n */
    public int f29971n;

    /* JADX INFO: renamed from: o */
    public final int f29972o;

    /* JADX INFO: renamed from: p */
    public List<pf60<StickerBundle, StickerPackage>> f29973p;

    /* JADX INFO: renamed from: q */
    public C8491b f29974q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$a */
    public class C8490a implements ViewPager.InterfaceC0718j {
        public C8490a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            CoreMomentEmojiNewView.this.setActivatedTab(i);
            CoreMomentEmojiNewView.this.f29971n = i;
            if (CoreModule.m30933P().m143412i().mo180523q() && i == 1) {
                CoreModule.f18264c.f20366Z.f20885T.m159280q();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$b */
    public static class C8491b extends jic0<Sticker> {

        /* JADX INFO: renamed from: c */
        public List<Sticker> f29976c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public View f29977d;

        /* JADX INFO: renamed from: e */
        public Act f29978e;

        public C8491b(View view, Act act) {
            this.f29977d = view;
            this.f29978e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m46533K(View view, View view2) {
            i4g0.m138520r("e_gif_search", "p_user_moment_interactions_details_view");
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f32705j, true);
            this.f29978e.startActivityForResult(18, intent, new C4468a.a() { // from class: l.h0a
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent2) {
                    return this.f107281a.m46536J(i, i2, intent2);
                }
            });
            this.f29978e.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f29976c.size() + 1;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(qec0.f156967W3, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM105592y0 = bnl0.m105592y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM105592y0, iM105592y0);
            }
            layoutParams.width = iM105592y0;
            layoutParams.height = iM105592y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo29822A(final View view, final Sticker sticker, int i, int i2) {
            if (i == -1) {
                ((VDraweeView) view.findViewById(edc0.f93179C1)).getHierarchy().mo118280f(this.f29978e.getDrawable(gra.m131778z() ? dbc0.f86981f8 : dbc0.f86916d8), 1.0f, true);
                bnl0.m105522L(view, new View.OnClickListener() { // from class: l.f0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f96666a.m46533K(view, view2);
                    }
                });
                return;
            }
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(edc0.f93179C1);
                if (!NullChecker.m82486a(sticker) || sticker.pictures.isEmpty()) {
                    uqb0.f180374G.m98798o(vDraweeView);
                    return;
                }
                frameLayout.setTag(sticker);
                if (TEnum.equals(sticker.source, "shanmeng")) {
                    uqb0.f180374G.m127115L0(vDraweeView, sticker.pictures.get(0).url);
                    sticker.hash = niw.m163315e(sticker.pictures.get(0).url);
                } else {
                    uqb0.f180374G.m127096B0(vDraweeView, m46539N(sticker.pictures.get(0)));
                }
                bnl0.m105522L(frameLayout, new View.OnClickListener() { // from class: l.g0a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f101621a.m46537L(sticker, view2);
                    }
                });
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f29976c.get(i - 1);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m46536J(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.m82486a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f32710o);
            if (!NullChecker.m82486a(sticker)) {
                return true;
            }
            CoreModule.m30930K().mo31806p7(this.f29977d, sticker, null);
            return true;
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m46537L(Sticker sticker, View view) {
            CoreModule.m30930K().mo31806p7(this.f29977d, sticker, null);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m46538M(List<Sticker> list) {
            this.f29976c.clear();
            this.f29976c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public Picture.ImageUri m46539N(Picture picture) {
            return picture.aboutWidth((bnl0.m105592y0() - (qa00.m175859d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }
    }

    public CoreMomentEmojiNewView(@NonNull Context context) {
        super(context);
        this.f29967j = false;
        this.f29968k = null;
        this.f29971n = 0;
        this.f29972o = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 1;
        this.f29973p = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m46502b(List list, Throwable th) {
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m46503c(pf60 pf60Var) {
        if (TextUtils.equals(((StickerPackage) pf60Var.f152157b).f21248id, MessageWarmingUpHelper.m50367n())) {
            return Boolean.FALSE;
        }
        return TextUtils.equals(((StickerPackage) pf60Var.f152157b).f21248id, MessageWarmingUpHelper.m50357d()) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m46507g(y20 y20Var, List list) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m46508h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m46511k(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m46516A(int i) {
        this.f29960c.removeAllViews();
        final int i2 = 0;
        while (i2 < 2) {
            View viewInflate = LayoutInflater.from(this.f29963f).inflate(kec0.f125836fe, (ViewGroup) this.f29960c, false);
            View viewFindViewById = viewInflate.findViewById(edc0.f93204G1);
            viewFindViewById.setBackgroundResource(ibc0.f113939W3);
            viewFindViewById.setActivated(i2 == i);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93422o1);
            if (i2 == 0) {
                uqb0.f180374G.m127138Y0(vDraweeView, ibc0.f113966Z6);
            } else {
                uqb0.f180374G.m127138Y0(vDraweeView, gra.m131778z() ? dbc0.f87118jf : ibc0.f114024g2);
            }
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.uz9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f181712a.m46525v(i2, view);
                }
            });
            this.f29960c.addView(viewInflate);
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m46517B(Act act, y20<String> y20Var, x20 x20Var, MessageInputEditView messageInputEditView, final View view) {
        this.f29963f = act;
        this.f29964g = y20Var;
        this.f29965h = x20Var;
        this.f29966i = messageInputEditView;
        this.f29969l = view;
        w0r w0rVar = new w0r(act, y20Var, new y20() { // from class: l.pz9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.m30930K().mo31806p7(view, (Sticker) obj, null);
            }
        }, this.f29966i, oze.f149866d, new ArrayList(), x20Var, false);
        this.f29970m = w0rVar;
        this.f29961d.setAdapter(w0rVar);
        this.f29961d.m4187d(new C8490a());
        m46521r();
        m46527x();
        m46526w(new y20() { // from class: l.wz9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191736a.m46528y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final List<pf60<StickerBundle, StickerPackage>> m46522s(List<pf60<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || jyb.m147479J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f21248id = "custom_stickers";
        if (!jyb.m147479J(list) && NullChecker.m82486a(list.get(0).f152157b) && "custom_stickers".equals(list.get(0).f152157b.f21248id)) {
            list.remove(0);
        }
        list.add(0, pf60.m172085a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46519p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m46519p(View view) {
        i0a.m137956a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final List<pf60<StickerBundle, StickerPackage>> m46520q(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.f21248id, stickerPackage);
        }
        ArrayList arrayListM147534w = jyb.m147534w(coreData.bundles, new qcj() { // from class: l.sz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return jyb.m147486Q(stickerBundle.packages, new qcj() { // from class: l.vz9
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return jyb.m147494Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListM147534w.iterator();
        while (it.hasNext()) {
            pf60 pf60Var = (pf60) it.next();
            if (pf60Var.f152157b == 0) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) pf60Var.f152156a).f21247id, "4")) {
                ((StickerBundle) pf60Var.f152156a).status = BundleStatus.get(BundleStatus.purchased);
                Locale locale = this.f29963f.getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    S s = pf60Var.f152157b;
                    ((StickerPackage) s).stickers = jyb.m147522n(((StickerPackage) s).stickers, new qcj() { // from class: l.tz9
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!rgj.m181447a((String) obj));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListM147534w;
    }

    /* JADX INFO: renamed from: r */
    public final void m46521r() {
        this.f29974q = new C8491b(this.f29969l, this.f29963f);
        this.f29962e.setLayoutManager(new GridLayoutManager(this.f29963f, 4));
        this.f29962e.setAdapter(this.f29974q);
    }

    public void setActivatedTab(int i) {
        int i2 = 0;
        while (i2 < this.f29960c.getChildCount()) {
            View viewFindViewById = this.f29960c.getChildAt(i2).findViewById(edc0.f93204G1);
            if (NullChecker.m82486a(viewFindViewById)) {
                viewFindViewById.setActivated(i2 == i);
            }
            i2++;
        }
    }

    public void setViewGone(int i) {
        if (i == 0) {
            setVisibility(8);
            bnl0.m105524M(this.f29959b, true);
            bnl0.m105524M(this.f29962e, true);
        } else if (i == 1) {
            bnl0.m105524M(this.f29959b, true);
            bnl0.m105524M(this.f29962e, false);
        } else if (i == 2) {
            bnl0.m105524M(this.f29959b, false);
            bnl0.m105524M(this.f29962e, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C22421c m46523t(final List list) {
        return CoreModule.m30933P().m143412i().mo180523q() ? CoreModule.f18264c.f20366Z.f20885T.m159274k().map(new qcj() { // from class: l.qz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f160231a.m46522s(list, (CoreData) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.rz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m46502b(list, (Throwable) obj);
            }
        }) : C22421c.just(list);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m46524u(Pair pair) {
        m46529z((List) pair.first);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m46525v(int i, View view) {
        if (this.f29961d.getCurrentItem() == i) {
            return;
        }
        this.f29961d.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m46526w(final y20<List<pf60<StickerBundle, StickerPackage>>> y20Var) {
        this.f29963f.duringCreated(CoreModule.f18264c.f20366Z.f20884S.m159274k().filter(new a0a()).map(new qcj() { // from class: l.b0a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74258a.m46520q((CoreData) obj);
            }
        }).switchMap(new qcj() { // from class: l.c0a
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79239a.m46523t((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.d0a
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m46507g(y20Var, (List) obj);
            }
        }, new y20() { // from class: l.e0a
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m46511k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m46527x() {
        this.f29963f.duringCreated(CoreModule.f18264c.f20366Z.m35922k3()).subscribe(psd0.m173597H(new y20() { // from class: l.yz9
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202179a.m46524u((Pair) obj);
            }
        }, new y20() { // from class: l.zz9
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m46508h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m46528y(List<pf60<StickerBundle, StickerPackage>> list) {
        this.f29973p = list;
        this.f29970m.m204245V(jyb.m147522n(list, new qcj() { // from class: l.xz9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m46503c((pf60) obj);
            }
        }).subList(0, 1));
        this.f29961d.setCurrentItem(this.f29971n);
        m46516A(this.f29971n);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: z */
    public void m46529z(List<Sticker> list) {
        this.f29974q.m46538M(list);
        this.f29974q.notifyDataSetChanged();
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29967j = false;
        this.f29968k = null;
        this.f29971n = 0;
        this.f29972o = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 1;
        this.f29973p = null;
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29967j = false;
        this.f29968k = null;
        this.f29971n = 0;
        this.f29972o = CoreModule.m30933P().m143412i().mo180523q() ? 2 : 1;
        this.f29973p = null;
    }
}
