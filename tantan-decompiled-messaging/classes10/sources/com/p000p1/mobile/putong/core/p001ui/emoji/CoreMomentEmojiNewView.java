package com.p000p1.mobile.putong.core.p001ui.emoji;

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
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.Sticker;
import com.p000p1.mobile.putong.core.data.StickerBundle;
import com.p000p1.mobile.putong.core.data.StickerPackage;
import com.p000p1.mobile.putong.core.data.StickerSource;
import com.p000p1.mobile.putong.core.data.UserSticker;
import com.p000p1.mobile.putong.core.p001ui.emoji.CoreMomentEmojiNewView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.putong.core.ui.messages.meme.CorePopularMemeAct;
import com.p1.mobile.putong.data.BundleStatus;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.view.MessageInputEditView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.d30;
import l.dac0;
import l.e30;
import l.f6c0;
import l.j760;
import l.kye;
import l.mkd0;
import l.ogw;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.wyq;
import l.x2c0;
import l.xdj;
import l.xdl0;
import l.zvf0;
import p003l.c3c0;
import p003l.l6c0;
import p003l.szb0;
import p003l.xy9;
import p003l.y4c0;
import rx.c;
import v.VDraweeView;
import v.VPager;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreMomentEmojiNewView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreMomentEmojiNewView f1504a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f1505b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1506c;

    /* JADX INFO: renamed from: d */
    public VPager f1507d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f1508e;

    /* JADX INFO: renamed from: f */
    public Act f1509f;

    /* JADX INFO: renamed from: g */
    public e30<String> f1510g;

    /* JADX INFO: renamed from: h */
    public d30 f1511h;

    /* JADX INFO: renamed from: i */
    public MessageInputEditView f1512i;

    /* JADX INFO: renamed from: j */
    public boolean f1513j;

    /* JADX INFO: renamed from: k */
    public Runnable f1514k;

    /* JADX INFO: renamed from: l */
    public View f1515l;

    /* JADX INFO: renamed from: m */
    public wyq f1516m;

    /* JADX INFO: renamed from: n */
    public int f1517n;

    /* JADX INFO: renamed from: o */
    public final int f1518o;

    /* JADX INFO: renamed from: p */
    public List<j760<StickerBundle, StickerPackage>> f1519p;

    /* JADX INFO: renamed from: q */
    public C3103b f1520q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$a */
    public class C3102a implements ViewPager.j {
        public C3102a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            CoreMomentEmojiNewView.this.setActivatedTab(i);
            CoreMomentEmojiNewView.this.f1517n = i;
            if (CoreModule.P().i().q() && i == 1) {
                CoreModule.c.Z.T.z();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.emoji.CoreMomentEmojiNewView$b */
    public static class C3103b extends dac0<Sticker> {

        /* JADX INFO: renamed from: c */
        public List<Sticker> f1522c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public View f1523d;

        /* JADX INFO: renamed from: e */
        public Act f1524e;

        public C3103b(View view, Act act) {
            this.f1523d = view;
            this.f1524e = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m2672K(View view, View view2) {
            zvf0.r("e_gif_search", "p_user_moment_interactions_details_view");
            Intent intent = new Intent(view.getContext(), (Class<?>) CorePopularMemeAct.class);
            intent.putExtra(CorePopularMemeAct.j, true);
            this.f1524e.startActivityForResult(18, intent, new a.a() { // from class: l.wy9
                /* JADX INFO: renamed from: a */
                public final boolean m10606a(int i, int i2, Intent intent2) {
                    return this.f8273a.m2678J(i, i2, intent2);
                }
            });
            this.f1524e.overridePendingTransition(szb0.f7494e, szb0.f7490a);
        }

        /* JADX INFO: renamed from: C */
        public int m2674C() {
            return this.f1522c.size() + 1;
        }

        /* JADX INFO: renamed from: D */
        public View m2675D(ViewGroup viewGroup, int i) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(l6c0.f5920W3, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            int iY0 = xdl0.y0() / 4;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iY0, iY0);
            }
            layoutParams.width = iY0;
            layoutParams.height = iY0;
            viewInflate.setLayoutParams(layoutParams);
            return viewInflate;
        }

        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public void m2673A(final View view, final Sticker sticker, int i, int i2) {
            if (i == -1) {
                view.findViewById(y4c0.f8661C1).getHierarchy().f(this.f1524e.getDrawable(upa.z() ? x2c0.e8 : x2c0.c8), 1.0f, true);
                xdl0.L(view, new View.OnClickListener() { // from class: l.uy9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f7842a.m2672K(view, view2);
                    }
                });
                return;
            }
            if (i == 1) {
                FrameLayout frameLayout = (FrameLayout) view;
                VDraweeView vDraweeViewFindViewById = frameLayout.findViewById(y4c0.f8661C1);
                if (!NullChecker.a(sticker) || sticker.pictures.isEmpty()) {
                    qib0.G.o(vDraweeViewFindViewById);
                    return;
                }
                frameLayout.setTag(sticker);
                if (TEnum.equals(sticker.source, StickerSource.shanmeng)) {
                    qib0.G.L0(vDraweeViewFindViewById, ((Media) sticker.pictures.get(0)).url);
                    sticker.hash = ogw.e(((Media) sticker.pictures.get(0)).url);
                } else {
                    qib0.G.B0(vDraweeViewFindViewById, m2681N(sticker.pictures.get(0)));
                }
                xdl0.L(frameLayout, new View.OnClickListener() { // from class: l.vy9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f8101a.m2679L(sticker, view2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public Sticker getItem(int i) {
            if (i == 0) {
                return null;
            }
            return this.f1522c.get(i - 1);
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ boolean m2678J(int i, int i2, Intent intent) {
            if (i != 18 || i2 != -1 || !NullChecker.a(intent)) {
                return false;
            }
            Sticker sticker = (Sticker) intent.getSerializableExtra(CorePopularMemeAct.o);
            if (!NullChecker.a(sticker)) {
                return true;
            }
            CoreModule.K().m5201p7(this.f1523d, sticker, null);
            return true;
        }

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ void m2679L(Sticker sticker, View view) {
            CoreModule.K().m5201p7(this.f1523d, sticker, null);
        }

        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: M */
        public void m2680M(List<Sticker> list) {
            this.f1522c.clear();
            this.f1522c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: N */
        public Picture.ImageUri m2681N(Picture picture) {
            return picture.aboutWidth((xdl0.y0() - (t100.d(12.0f) * 5)) / 4, ".png");
        }

        public int getItemViewType(int i) {
            return i == 0 ? -1 : 1;
        }
    }

    public CoreMomentEmojiNewView(@NonNull Context context) {
        super(context);
        this.f1513j = false;
        this.f1514k = null;
        this.f1517n = 0;
        this.f1518o = CoreModule.P().i().q() ? 2 : 1;
        this.f1519p = null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ List m2641b(List list, Throwable th) {
        return list;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m2642c(j760 j760Var) {
        if (TextUtils.equals(((StickerPackage) j760Var.b).f168id, MessageWarmingUpHelper.n())) {
            return Boolean.FALSE;
        }
        return TextUtils.equals(((StickerPackage) j760Var.b).f168id, MessageWarmingUpHelper.d()) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m2646g(e30 e30Var, List list) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(list);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2647h(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2650k(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final void m2655A(int i) {
        this.f1506c.removeAllViews();
        final int i2 = 0;
        while (i2 < 2) {
            View viewInflate = LayoutInflater.from(this.f1509f).inflate(f6c0.Yd, (ViewGroup) this.f1506c, false);
            View viewFindViewById = viewInflate.findViewById(y4c0.f8686G1);
            viewFindViewById.setBackgroundResource(c3c0.f3701W3);
            viewFindViewById.setActivated(i2 == i);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(y4c0.f8904o1);
            if (i2 == 0) {
                qib0.G.Y0(vDraweeViewFindViewById, c3c0.f3728Z6);
            } else {
                qib0.G.Y0(vDraweeViewFindViewById, upa.z() ? x2c0.ue : c3c0.f3786g2);
            }
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.jy9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5395a.m2664v(i2, view);
                }
            });
            this.f1506c.addView(viewInflate);
            i2++;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m2656B(Act act, e30<String> e30Var, d30 d30Var, MessageInputEditView messageInputEditView, final View view) {
        this.f1509f = act;
        this.f1510g = e30Var;
        this.f1511h = d30Var;
        this.f1512i = messageInputEditView;
        this.f1515l = view;
        wyq wyqVar = new wyq(act, e30Var, new e30() { // from class: l.ey9
            public final void call(Object obj) {
                CoreModule.K().m5201p7(view, (Sticker) obj, null);
            }
        }, this.f1512i, kye.d, new ArrayList(), d30Var, false);
        this.f1516m = wyqVar;
        this.f1507d.setAdapter(wyqVar);
        this.f1507d.d(new C3102a());
        m2660r();
        m2666x();
        m2665w(new e30() { // from class: l.ly9
            public final void call(Object obj) {
                this.f6232a.m2667y((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final List<j760<StickerBundle, StickerPackage>> m2661s(List<j760<StickerBundle, StickerPackage>> list, CoreData coreData) {
        UserSticker userStickerNew_ = (coreData == null || vwb.J(coreData.userStickers)) ? UserSticker.new_() : coreData.userStickers.get(0);
        if (userStickerNew_.favoriteStickers == null) {
            userStickerNew_.favoriteStickers = new ArrayList();
        }
        StickerPackage stickerPackageNew_ = StickerPackage.new_();
        stickerPackageNew_.stickers = userStickerNew_.favoriteStickers;
        stickerPackageNew_.f168id = "custom_stickers";
        if (!vwb.J(list) && NullChecker.a(list.get(0).b) && "custom_stickers".equals(((StickerPackage) list.get(0).b).f168id)) {
            list.remove(0);
        }
        list.add(0, j760.a(StickerBundle.new_(), stickerPackageNew_));
        return list;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2658p(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m2658p(View view) {
        xy9.m11070a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public final List<j760<StickerBundle, StickerPackage>> m2659q(CoreData coreData) {
        final HashMap map = new HashMap();
        for (StickerPackage stickerPackage : coreData.packages) {
            map.put(stickerPackage.f168id, stickerPackage);
        }
        ArrayList arrayListW = vwb.w(coreData.bundles, new w9j() { // from class: l.hy9
            public final Object call(Object obj) {
                StickerBundle stickerBundle = (StickerBundle) obj;
                return vwb.Q(stickerBundle.packages, new w9j() { // from class: l.ky9
                    public final Object call(Object obj2) {
                        return vwb.Y(stickerBundle, (StickerPackage) map.get((String) obj2));
                    }
                });
            }
        });
        Iterator it = arrayListW.iterator();
        while (it.hasNext()) {
            j760 j760Var = (j760) it.next();
            if (j760Var.b == null) {
                it.remove();
            } else if (TextUtils.equals(((StickerBundle) j760Var.a).f167id, "4")) {
                ((StickerBundle) j760Var.a).status = BundleStatus.get("purchased");
                Locale locale = this.f1509f.getResources().getConfiguration().locale;
                if (!"zh".equals(locale.getLanguage()) || !"CN".equalsIgnoreCase(locale.getCountry())) {
                    Object obj = j760Var.b;
                    ((StickerPackage) obj).stickers = vwb.n(((StickerPackage) obj).stickers, new w9j() { // from class: l.iy9
                        public final Object call(Object obj2) {
                            return Boolean.valueOf(!xdj.a((String) obj2));
                        }
                    });
                }
            } else {
                it.remove();
            }
        }
        return arrayListW;
    }

    /* JADX INFO: renamed from: r */
    public final void m2660r() {
        this.f1520q = new C3103b(this.f1515l, this.f1509f);
        this.f1508e.setLayoutManager(new GridLayoutManager(this.f1509f, 4));
        this.f1508e.setAdapter(this.f1520q);
    }

    public void setActivatedTab(int i) {
        int i2 = 0;
        while (i2 < this.f1506c.getChildCount()) {
            View viewFindViewById = this.f1506c.getChildAt(i2).findViewById(y4c0.f8686G1);
            if (NullChecker.a(viewFindViewById)) {
                viewFindViewById.setActivated(i2 == i);
            }
            i2++;
        }
    }

    public void setViewGone(int i) {
        if (i == 0) {
            setVisibility(8);
            xdl0.M(this.f1505b, true);
            xdl0.M(this.f1508e, true);
        } else if (i == 1) {
            xdl0.M(this.f1505b, true);
            xdl0.M(this.f1508e, false);
        } else if (i == 2) {
            xdl0.M(this.f1505b, false);
            xdl0.M(this.f1508e, true);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ c m2662t(final List list) {
        return CoreModule.P().i().q() ? CoreModule.c.Z.T.k().map(new w9j() { // from class: l.fy9
            public final Object call(Object obj) {
                return this.f4527a.m2661s(list, (CoreData) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.gy9
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m2641b(list, (Throwable) obj);
            }
        }) : c.just(list);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2663u(Pair pair) {
        m2668z((List) pair.first);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2664v(int i, View view) {
        if (this.f1507d.getCurrentItem() == i) {
            return;
        }
        this.f1507d.setCurrentItem(i);
    }

    /* JADX INFO: renamed from: w */
    public final void m2665w(final e30<List<j760<StickerBundle, StickerPackage>>> e30Var) {
        this.f1509f.duringCreated(CoreModule.c.Z.S.k().filter(new w9j() { // from class: l.py9
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((CoreData) obj));
            }
        }).map(new w9j() { // from class: l.qy9
            public final Object call(Object obj) {
                return this.f7112a.m2659q((CoreData) obj);
            }
        }).switchMap(new w9j() { // from class: l.ry9
            public final Object call(Object obj) {
                return this.f7254a.m2662t((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.sy9
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m2646g(e30Var, (List) obj);
            }
        }, new e30() { // from class: l.ty9
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m2650k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m2666x() {
        this.f1509f.duringCreated(CoreModule.c.Z.k3()).subscribe(mkd0.H(new e30() { // from class: l.ny9
            public final void call(Object obj) {
                this.f6574a.m2663u((Pair) obj);
            }
        }, new e30() { // from class: l.oy9
            public final void call(Object obj) {
                CoreMomentEmojiNewView.m2647h((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m2667y(List<j760<StickerBundle, StickerPackage>> list) {
        this.f1519p = list;
        this.f1516m.V(vwb.n(list, new w9j() { // from class: l.my9
            public final Object call(Object obj) {
                return CoreMomentEmojiNewView.m2642c((j760) obj);
            }
        }).subList(0, 1));
        this.f1507d.setCurrentItem(this.f1517n);
        m2655A(this.f1517n);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: z */
    public void m2668z(List<Sticker> list) {
        this.f1520q.m2680M(list);
        this.f1520q.notifyDataSetChanged();
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1513j = false;
        this.f1514k = null;
        this.f1517n = 0;
        this.f1518o = CoreModule.P().i().q() ? 2 : 1;
        this.f1519p = null;
    }

    public CoreMomentEmojiNewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1513j = false;
        this.f1514k = null;
        this.f1517n = 0;
        this.f1518o = CoreModule.P().i().q() ? 2 : 1;
        this.f1519p = null;
    }
}
