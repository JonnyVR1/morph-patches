package com.p046p1.mobile.putong.core.p053ui.emoji;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.data.StickerBundle;
import com.p046p1.mobile.putong.core.data.StickerPackage;
import com.p046p1.mobile.putong.core.data.UserSticker;
import com.p046p1.mobile.putong.core.p053ui.emoji.CoreMomentEmojiNewView;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.meme.CorePopularMemeAct;
import com.p046p1.mobile.putong.data.BundleStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VPager;
import p147v.VRecyclerView;
import p149l.c3c0;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.f6c0;
import p149l.j760;
import p149l.kye;
import p149l.l6c0;
import p149l.mkd0;
import p149l.ogw;
import p149l.py9;
import p149l.qib0;
import p149l.szb0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wyq;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xy9;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreMomentEmojiNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiNewView f29110a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29111b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f29112c;

    /* JADX INFO: renamed from: d */
    public VPager f29113d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f29114e;

    /* JADX INFO: renamed from: f */
    public Act f29115f;

    /* JADX INFO: renamed from: g */
    public e30<String> f29116g;

    /* JADX INFO: renamed from: h */
    public d30 f29117h;

    /* JADX INFO: renamed from: i */
    public MessageInputEditView f29118i;

    /* JADX INFO: renamed from: j */
    public boolean f29119j;

    /* JADX INFO: renamed from: k */
    public Runnable f29120k;

    /* JADX INFO: renamed from: l */
    public View f29121l;

    /* JADX INFO: renamed from: m */
    public wyq f29122m;

    /* JADX INFO: renamed from: n */
    public int f29123n;

    /* JADX INFO: renamed from: o */
    public final int f29124o;

    /* JADX INFO: renamed from: p */
    public List<j760<StickerBundle, StickerPackage>> f29125p;

    /* JADX INFO: renamed from: q */
    public C8328b f29126q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$a */
    public class C8327a implements ViewPager.InterfaceC0716j {
        public C8327a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            CoreMomentEmojiNewView.this.setActivatedTab(i);
            CoreMomentEmojiNewView.this.f29123n = i;
            if (CoreModule.m29935P().m94658i().mo158431q() && i == 1) {
                CoreModule.f17545c.f19624Z.f20143T.m121236q();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$b */
    public static class C8328b extends dac0<Sticker> {

        /* JADX INFO: renamed from: c */
        public List<Sticker> f29128c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public View f29129d;

        /* JADX INFO: renamed from: e */
        public Act f29130e;

        public C8328b(View view, Act act) {
            this.f29129d = view;
            this.f29130e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m45350K(View view, View view2) {
            zvf0.m220396r("e_gif_search", "p_user_moment_interactions_details_view");
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.f31857j, true);
            this.f29130e.startActivityForResult(18, intent, new C4317a.a() { // from class: l.wy9
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent2) {
                    return this.f188551a.m45353J(i, i2, intent2);
                }
            });
            this.f29130e.overridePendingTransition(szb0.f167030e, szb0.f167026a);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f29128c.size() + 1;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f126411W3, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iM208412y0 = xdl0.m208412y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iM208412y0, iM208412y0);
            }
            layoutParams.width = iM208412y0;
            layoutParams.height = iM208412y0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void mo28823A(final View view, final Sticker sticker, int i, int i2) {
            if (i == -1) {
                ((VDraweeView) view.findViewById(y4c0.f195944C1)).getHierarchy().mo112059f(this.f29130e.getDrawable(upa.m194847z() ? x2c0.f190101e8 : x2c0.f190038c8), 1.0f, true);
                xdl0.m208342L(view, new View.OnClickListener() { // from class: l.uy9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f178837a.m45350K(view, view2);
                    }
                });
                return;
            }
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                VDraweeView vDraweeView = (VDraweeView) frameLayout.findViewById(y4c0.f195944C1);
                if (!NullChecker.m81303a(sticker) || sticker.pictures.isEmpty()) {
                    qib0.f154691G.m184725o(vDraweeView);
                    return;
                }
                frameLayout.setTag(sticker);
                if (TEnum.equals(sticker.source, "shanmeng")) {
                    qib0.f154691G.m102331L0(vDraweeView, sticker.pictures.get(0).url);
                    sticker.hash = ogw.m164284e(sticker.pictures.get(0).url);
                } else {
                    qib0.f154691G.m102312B0(vDraweeView, m45356N(sticker.pictures.get(0)));
                }
                xdl0.m208342L(frameLayout, new View.OnClickListener() { // from class: l.vy9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f183506a.m45354L(sticker, view2);
                    }
                });
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f29128c.get(i - 1);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m45353J(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.m81303a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.f31862o);
            if (!NullChecker.m81303a(sticker)) {
                return true;
            }
            CoreModule.m29932K().mo30803p7(this.f29129d, sticker, null);
            return true;
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m45354L(Sticker sticker, View view) {
            CoreModule.m29932K().mo30803p7(this.f29129d, sticker, null);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m45355M(List<Sticker> list) {
            this.f29128c.clear();
            this.f29128c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public Picture.ImageUri m45356N(Picture picture) {
            return picture.aboutWidth((xdl0.m208412y0() - (t100.m186890d(12.0f) * 5)) / 4, ".png");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }
    }

    public CoreMomentEmojiNewView(@NonNull Context context) {
        super(context);
        this.f29119j = false;
        this.f29120k = null;
        this.f29123n = 0;
        this.f29124o = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 1;
        this.f29125p = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m45319b(List list, Throwable th) {
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m45320c(j760 j760Var) {
        if (TextUtils.equals(((StickerPackage) j760Var.f116565b).f20506id, MessageWarmingUpHelper.m49184n())) {
            return Boolean.FALSE;
        }
        return TextUtils.equals(((StickerPackage) j760Var.f116565b).f20506id, MessageWarmingUpHelper.m49174d()) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m45324g(e30 e30Var, List list) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m45325h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m45328k(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m45333A(int i) {
        this.f29112c.removeAllViews();
        final int i2 = 0;
        while (i2 < 2) {
            View viewInflate = LayoutInflater.from(this.f29115f).inflate(f6c0.f95664Yd, (ViewGroup) this.f29112c, false);
            View viewFindViewById = viewInflate.findViewById(y4c0.f195969G1);
            viewFindViewById.setBackgroundResource(c3c0.f78664W3);
            viewFindViewById.setActivated(i2 == i);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196187o1);
            if (i2 == 0) {
                qib0.f154691G.m102354Y0(vDraweeView, c3c0.f78691Z6);
            } else {
                qib0.f154691G.m102354Y0(vDraweeView, upa.m194847z() ? x2c0.f190617ue : c3c0.f78749g2);
            }
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.jy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120289a.m45342v(i2, view);
                }
            });
            this.f29112c.addView(viewInflate);
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m45334B(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, final View view) {
        this.f29115f = act;
        this.f29116g = e30Var;
        this.f29117h = d30Var;
        this.f29118i = messageInputEditView;
        this.f29121l = view;
        wyq wyqVar = new wyq(act, e30Var, new e30() { // from class: l.ey9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.m29932K().mo30803p7(view, (Sticker) obj, null);
            }
        }, this.f29118i, kye.f125279d, new ArrayList(), d30Var, false);
        this.f29122m = wyqVar;
        this.f29113d.setAdapter(wyqVar);
        this.f29113d.m4185d(new C8327a());
        m45338r();
        m45344x();
        m45343w(new e30() { // from class: l.ly9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130499a.m45345y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final List<j760<StickerBundle, StickerPackage>> m45339s(List<j760<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.m200296J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f20506id = "custom_stickers";
        if (!vwb.m200296J(list) && NullChecker.m81303a(list.get(0).f116565b) && "custom_stickers".equals(list.get(0).f116565b.f20506id)) {
            list.remove(0);
        }
        list.add(0, j760.m140076a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45336p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m45336p(View view) {
        xy9.m211743a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final List<j760<StickerBundle, StickerPackage>> m45337q(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.f20506id, stickerPackage);
        }
        ArrayList arrayListM200351w = vwb.m200351w(coreData.bundles, new w9j() { // from class: l.hy9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return vwb.m200303Q(stickerBundle.packages, new w9j() { // from class: l.ky9
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return vwb.m200311Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListM200351w.iterator();
        while (it.hasNext()) {
            j760 j760Var = (j760) it.next();
            if (j760Var.f116565b == 0) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) j760Var.f116564a).f20505id, "4")) {
                ((StickerBundle) j760Var.f116564a).status = BundleStatus.get(BundleStatus.purchased);
                Locale locale = this.f29115f.getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    S s = j760Var.f116565b;
                    ((StickerPackage) s).stickers = vwb.m200339n(((StickerPackage) s).stickers, new w9j() { // from class: l.iy9
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(!xdj.m208315a((String) obj));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListM200351w;
    }

    /* JADX INFO: renamed from: r */
    public final void m45338r() {
        this.f29126q = new C8328b(this.f29121l, this.f29115f);
        this.f29114e.setLayoutManager(new GridLayoutManager(this.f29115f, 4));
        this.f29114e.setAdapter(this.f29126q);
    }

    public void setActivatedTab(int i) {
        int i2 = 0;
        while (i2 < this.f29112c.getChildCount()) {
            View viewFindViewById = this.f29112c.getChildAt(i2).findViewById(y4c0.f195969G1);
            if (NullChecker.m81303a(viewFindViewById)) {
                viewFindViewById.setActivated(i2 == i);
            }
            i2++;
        }
    }

    public void setViewGone(int i) {
        if (i == 0) {
            setVisibility(8);
            xdl0.m208344M(this.f29111b, true);
            xdl0.m208344M(this.f29114e, true);
        } else if (i == 1) {
            xdl0.m208344M(this.f29111b, true);
            xdl0.m208344M(this.f29114e, false);
        } else if (i == 2) {
            xdl0.m208344M(this.f29111b, false);
            xdl0.m208344M(this.f29114e, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C22306c m45340t(final List list) {
        return CoreModule.m29935P().m94658i().mo158431q() ? CoreModule.f17545c.f19624Z.f20143T.m121230k().map(new w9j() { // from class: l.fy9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f99843a.m45339s(list, (CoreData) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.gy9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m45319b(list, (Throwable) obj);
            }
        }) : C22306c.just(list);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m45341u(Pair pair) {
        m45346z((List) pair.first);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m45342v(int i, View view) {
        if (this.f29113d.getCurrentItem() == i) {
            return;
        }
        this.f29113d.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m45343w(final e30<List<j760<StickerBundle, StickerPackage>>> e30Var) {
        this.f29115f.duringCreated(CoreModule.f17545c.f19624Z.f20142S.m121230k().filter(new py9()).map(new w9j() { // from class: l.qy9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f156910a.m45337q((CoreData) obj);
            }
        }).switchMap(new w9j() { // from class: l.ry9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161547a.m45340t((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.sy9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m45324g(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.ty9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m45328k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m45344x() {
        this.f29115f.duringCreated(CoreModule.f17545c.f19624Z.m34919k3()).subscribe(mkd0.m154956H(new e30() { // from class: l.ny9
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141094a.m45341u((Pair) obj);
            }
        }, new e30() { // from class: l.oy9
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m45325h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m45345y(List<j760<StickerBundle, StickerPackage>> list) {
        this.f29125p = list;
        this.f29122m.m206149V(vwb.m200339n(list, new w9j() { // from class: l.my9
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m45320c((j760) obj);
            }
        }).subList(0, 1));
        this.f29113d.setCurrentItem(this.f29123n);
        m45333A(this.f29123n);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: z */
    public void m45346z(List<Sticker> list) {
        this.f29126q.m45355M(list);
        this.f29126q.notifyDataSetChanged();
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29119j = false;
        this.f29120k = null;
        this.f29123n = 0;
        this.f29124o = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 1;
        this.f29125p = null;
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29119j = false;
        this.f29120k = null;
        this.f29123n = 0;
        this.f29124o = CoreModule.m29935P().m94658i().mo158431q() ? 2 : 1;
        this.f29125p = null;
    }
}
