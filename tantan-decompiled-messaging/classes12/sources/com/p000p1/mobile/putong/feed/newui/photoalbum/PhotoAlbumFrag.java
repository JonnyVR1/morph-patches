package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.animation.Animator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.Counter;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.C2089a;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.cwf0;
import l.d30;
import l.du2;
import l.dyl;
import l.e30;
import l.e51;
import l.ed80;
import l.eqh0;
import l.ic50;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.t100;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wc40;
import l.x9j;
import l.xck0;
import l.xdl0;
import l.z9j;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p007l.a5i;
import p007l.b0i;
import p007l.b5c0;
import p007l.cjh;
import p007l.dah;
import p007l.e1c0;
import p007l.eng;
import p007l.f3c0;
import p007l.fm20;
import p007l.hrg;
import p007l.ijb0;
import p007l.je80;
import p007l.jug;
import p007l.kjb0;
import p007l.l80;
import p007l.lah;
import p007l.lwh;
import p007l.m84;
import p007l.mwh;
import p007l.n970;
import p007l.nkg;
import p007l.o6c0;
import p007l.oe40;
import p007l.p6j0;
import p007l.pv60;
import p007l.tfh;
import p007l.u2h;
import p007l.uwh;
import p007l.v1h;
import p007l.v9h;
import p007l.vch;
import p007l.vqg;
import p007l.wch;
import p007l.zzl;
import rx.subjects.a;
import rx.subjects.b;
import v.VFrame;
import v.VImage;
import v.VText;
import v.navigationbar.VNavigationBar;
import v.navigationbar.VNavigationTabLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC2258a, FeedService.InterfaceC2259b, zzl {

    /* JADX INFO: renamed from: f1 */
    public static long f2701f1 = 7200000;

    /* JADX INFO: renamed from: g1 */
    public static boolean f2702g1 = true;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f2703A;

    /* JADX INFO: renamed from: B */
    public VFrame f2704B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f2705C;

    /* JADX INFO: renamed from: D */
    public VFrame f2706D;

    /* JADX INFO: renamed from: E */
    public ImageView f2707E;

    /* JADX INFO: renamed from: E0 */
    public int f2708E0;

    /* JADX INFO: renamed from: F */
    public VText f2709F;

    /* JADX INFO: renamed from: F0 */
    public String f2710F0;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f2711G;

    /* JADX INFO: renamed from: H */
    public VFrame f2713H;

    /* JADX INFO: renamed from: I */
    public VText f2715I;

    /* JADX INFO: renamed from: I0 */
    public List<PutongFrag> f2716I0;

    /* JADX INFO: renamed from: J */
    public VFrame f2717J;

    /* JADX INFO: renamed from: J0 */
    public b0i f2718J0;

    /* JADX INFO: renamed from: K */
    public VImage f2719K;

    /* JADX INFO: renamed from: K0 */
    public String f2720K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f2721L;

    /* JADX INFO: renamed from: L0 */
    public boolean f2722L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f2723M;

    /* JADX INFO: renamed from: Q */
    public cwf0 f2731Q;

    /* JADX INFO: renamed from: U */
    public String f2739U;

    /* JADX INFO: renamed from: V0 */
    public Dialog f2742V0;

    /* JADX INFO: renamed from: W */
    public long f2743W;

    /* JADX INFO: renamed from: W0 */
    @Nullable
    public C2122g f2744W0;

    /* JADX INFO: renamed from: X0 */
    public String f2746X0;

    /* JADX INFO: renamed from: a1 */
    public Runnable f2751a1;

    /* JADX INFO: renamed from: b1 */
    public dah f2752b1;

    /* JADX INFO: renamed from: c1 */
    public String f2753c1;

    /* JADX INFO: renamed from: d1 */
    public String f2754d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f2755e1;

    /* JADX INFO: renamed from: p0 */
    public boolean f2757p0;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f2758z;

    /* JADX INFO: renamed from: N */
    public cwf0 f2725N = new cwf0("p_like", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public cwf0 f2727O = new cwf0("p_follow", PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public cwf0 f2729P = new cwf0(OMSDialogPositon.p_nearby, PhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: R */
    public vch f2733R = new wch();

    /* JADX INFO: renamed from: S */
    public e30<Intent> f2735S = xck0.a(400, new e30() { // from class: l.m870
        public final void call(Object obj) {
            this.f10266a.m4801b7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: T */
    public a<Boolean> f2737T = a.b();

    /* JADX INFO: renamed from: V */
    public boolean f2741V = true;

    /* JADX INFO: renamed from: X */
    public b<Long> f2745X = b.b();

    /* JADX INFO: renamed from: Y */
    public boolean f2747Y = false;

    /* JADX INFO: renamed from: Z */
    public boolean f2749Z = false;

    /* JADX INFO: renamed from: k0 */
    public int f2756k0 = 1;

    /* JADX INFO: renamed from: G0 */
    public int f2712G0 = -1;

    /* JADX INFO: renamed from: H0 */
    public boolean f2714H0 = false;

    /* JADX INFO: renamed from: M0 */
    public l80<C2121f> f2724M0 = new C2116a();

    /* JADX INFO: renamed from: N0 */
    public C2119d f2726N0 = null;

    /* JADX INFO: renamed from: O0 */
    public List<String> f2728O0 = new ArrayList();

    /* JADX INFO: renamed from: P0 */
    public TextView[] f2730P0 = new TextView[4];

    /* JADX INFO: renamed from: Q0 */
    public VImage[] f2732Q0 = new VImage[1];

    /* JADX INFO: renamed from: R0 */
    public TextView[] f2734R0 = new TextView[4];

    /* JADX INFO: renamed from: S0 */
    public ImageView[] f2736S0 = new ImageView[4];

    /* JADX INFO: renamed from: T0 */
    public int f2738T0 = 0;

    /* JADX INFO: renamed from: U0 */
    public boolean f2740U0 = true;

    /* JADX INFO: renamed from: Y0 */
    public boolean f2748Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public pv60 f2750Z0 = new pv60();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$a */
    public class C2116a extends l80<C2121f> {
        public C2116a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(C2121f c2121f, int i) {
            if (i == 1) {
                zvf0.x("e_tantan_topic", PhotoAlbumFrag.this.m4835r6());
            } else if (NullChecker.a(c2121f.f2769c)) {
                zvf0.z(c2121f.f2767a, c2121f.f2768b, c2121f.f2769c);
            } else {
                zvf0.x(c2121f.f2767a, c2121f.f2768b);
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(C2121f c2121f, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$b */
    public class RunnableC2117b implements Runnable {
        public RunnableC2117b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PhotoAlbumFrag.this.m4842u7();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$c */
    public class C2118c implements PopupWindow.OnDismissListener {
        public C2118c() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            boolean zEquals = TextUtils.equals(PhotoAlbumFrag.this.f2732Q0[0].getTag().toString(), PhotoAlbumFrag.this.f2753c1);
            PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
            if (zEquals) {
                photoAlbumFrag.f2732Q0[0].setTag(PhotoAlbumFrag.this.f2754d1);
                PhotoAlbumFrag.this.f2732Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7917u1));
            } else {
                photoAlbumFrag.f2732Q0[0].setTag(PhotoAlbumFrag.this.f2753c1);
                PhotoAlbumFrag.this.f2732Q0[0].setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7925v1));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$d */
    public class C2119d extends FragmentPagerAdapter implements ViewPager.j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f2762a;

        /* JADX INFO: renamed from: b */
        public Method f2763b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f2764c;

        public C2119d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f2762a = new ArrayList();
            this.f2763b = null;
            this.f2764c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f2763b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.c(e);
                this.f2763b = null;
            } catch (SecurityException e2) {
                CrashHelper.c(e2);
                this.f2763b = null;
            }
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator m4856a(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator m4857b(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> m4858g(int i) {
            return null;
        }

        public int getCount() {
            return this.f2762a.size();
        }

        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f2762a.get(i);
        }

        public CharSequence getPageTitle(int i) {
            return (CharSequence) PhotoAlbumFrag.this.f2728O0.get(i);
        }

        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.a(this.f2764c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f2764c.t0());
                    sb.append(";");
                    sb.append("lstFrag :" + this.f2762a);
                    du2.a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: l */
        public Fragment m4859l(int i) {
            Fragment fragmentI0;
            Method method = this.f2763b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentI0 = PhotoAlbumFrag.this.getChildFragmentManager().i0((String) method.invoke(this, Integer.valueOf(PhotoAlbumFrag.this.f2703A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
                fragmentI0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.c(e2);
                fragmentI0 = null;
            }
            return fragmentI0 == null ? getItem(i) : fragmentI0;
        }

        /* JADX INFO: renamed from: m */
        public View m4860m(final int i) {
            View viewInflate = PhotoAlbumFrag.this.act().inflater().inflate(o6c0.f11338x5, (ViewGroup) null);
            final VImage vImageFindViewById = viewInflate.findViewById(b5c0.f5954D0);
            vImageFindViewById.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7925v1));
            vImageFindViewById.setTag(PhotoAlbumFrag.this.f2753c1);
            if (nkg.m12227Y() && i == 0) {
                PhotoAlbumFrag.this.f2732Q0[0] = vImageFindViewById;
            }
            final TextView textView = (TextView) viewInflate.findViewById(b5c0.f6037d2);
            TextView textView2 = (TextView) viewInflate.findViewById(b5c0.f6041e2);
            PhotoAlbumFrag.this.f2730P0[i] = textView;
            PhotoAlbumFrag.this.f2734R0[i] = textView2;
            PhotoAlbumFrag.this.f2736S0[i] = (ImageView) viewInflate.findViewById(b5c0.f6106y0);
            textView.setText((CharSequence) PhotoAlbumFrag.this.f2728O0.get(i));
            xdl0.E0(textView, new View.OnClickListener() { // from class: l.k970
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9642a.m4861n(i, textView, vImageFindViewById, view);
                }
            });
            PhotoAlbumFrag.this.f2730P0[i].setTextColor(PhotoAlbumFrag.this.getResources().getColor(e1c0.f7127Z));
            return viewInflate;
        }

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ void m4861n(int i, TextView textView, VImage vImage, View view) {
            if (PhotoAlbumFrag.this.f2738T0 == i && TextUtils.equals("喜欢", textView.getText().toString())) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), PhotoAlbumFrag.this.f2753c1);
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(photoAlbumFrag.f2754d1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7917u1));
                } else {
                    vImage.setTag(photoAlbumFrag.f2753c1);
                    vImage.setBackgroundDrawable(PhotoAlbumFrag.this.getResources().getDrawable(f3c0.f7925v1));
                }
                PhotoAlbumFrag.this.m4830o7(view);
            }
            if (PhotoAlbumFrag.this.f2738T0 != i) {
                VNavigationTabLayout vNavigationTabLayout = PhotoAlbumFrag.this.f2711G;
                vNavigationTabLayout.D(vNavigationTabLayout.w(i));
            }
        }

        /* JADX INFO: renamed from: o */
        public void m4862o() {
            if (this.f2764c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f2762a.iterator();
            while (it.hasNext()) {
                this.f2764c.m().r(it.next()).j();
            }
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = PhotoAlbumFrag.this.f2726N0.m4859l(i);
            if ((photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) && photoAlbumFeedFragM4859l.m5442Q4()) {
                FeedModule.m1140H().jg(PhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m1140H().Pq(PhotoAlbumFrag.this.act(), false);
            }
            PhotoAlbumFrag.this.m4747m7();
            PhotoAlbumFrag.this.m4757v7();
            PhotoAlbumFrag.this.m4759w6();
            PhotoAlbumFrag.this.f2738T0 = i;
            PhotoAlbumPictureView.m4886u(PhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f2762a.size()) {
                    break;
                }
                Fragment fragmentM4859l = m4859l(i2);
                if (fragmentM4859l instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM4859l;
                    photoAlbumFeedFrag.m5460h5(i2 == i);
                    photoAlbumFeedFrag.m5459g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m5451Z4();
                    }
                } else if (fragmentM4859l instanceof PhotoAlbumFallsFeedFrag) {
                    ((PhotoAlbumFallsFeedFrag) fragmentM4859l).m4632p5(i2 == i);
                }
                i2++;
            }
            PhotoAlbumFrag.this.f2740U0 = false;
            PhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
            }
            PhotoAlbumFrag.this.m4836r7();
        }

        /* JADX INFO: renamed from: p */
        public void m4863p(List<PutongFrag> list) {
            PhotoAlbumFrag.this.f2716I0 = list;
            this.f2762a.clear();
            if (NullChecker.b(list)) {
                this.f2762a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$e */
    public class C2120e implements VNavigationTabLayout.d {
        public C2120e() {
        }

        /* JADX INFO: renamed from: a */
        public void m4866a(VNavigationTabLayout.f fVar) {
            FeedModule.f316d.m16527Pb().mo15086m(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f2730P0[fVar.f()]);
        }

        /* JADX INFO: renamed from: b */
        public void m4867b(VNavigationTabLayout.f fVar) {
        }

        /* JADX INFO: renamed from: c */
        public void m4868c(VNavigationTabLayout.f fVar) {
            int iF = fVar.f();
            VNavigationTabLayout.TabView tabView = PhotoAlbumFrag.this.f2711G.w(0).i;
            if (iF == 0 && nkg.m12227Y()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), t100.d(15.0f), tabView.getPaddingBottom());
                PhotoAlbumFrag.this.f2732Q0[0].setVisibility(0);
                boolean zM12238f0 = nkg.m12238f0();
                PhotoAlbumFrag photoAlbumFrag = PhotoAlbumFrag.this;
                if (!zM12238f0) {
                    if (photoAlbumFrag.f2748Y0) {
                        p6j0.m12913c("e_red_dot_explore", mwh.m12038d().m12043f(PhotoAlbumFrag.this.m4833q6()), new j760("red_dot_relation_child", "red_dot_like"));
                    }
                    if (PhotoAlbumFrag.this.f2748Y0 && lah.m11627g().f9979b.mo8474f()) {
                        FeedModule.f316d.f14923G1 = "recommend";
                        PhotoAlbumFrag.this.m4806e7();
                    }
                    lah.m11627g().m11634m();
                } else if (xdl0.O0(photoAlbumFrag.f2736S0[0])) {
                    if (v9h.f14112g) {
                        FeedModule.f316d.m16702oc();
                    } else {
                        v9h.f14114i = true;
                        boolean z = PhotoAlbumFrag.this.f2755e1;
                        PhotoAlbumFrag photoAlbumFrag2 = PhotoAlbumFrag.this;
                        if (z) {
                            photoAlbumFrag2.f2755e1 = false;
                        } else {
                            e51.H(photoAlbumFrag2.getContext(), new Runnable() { // from class: l.l970
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f9958a.m4869f();
                                }
                            }, 200L);
                        }
                    }
                    v9h.f14112g = false;
                    v9h.f14113h = false;
                    e51.H(PhotoAlbumFrag.this.getContext(), new Runnable() { // from class: l.m970
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10278a.m4870g();
                        }
                    }, 500L);
                }
            } else {
                if (nkg.m12227Y() && !nkg.m12238f0()) {
                    lah.m11627g().m11633l(true);
                }
                if (nkg.m12227Y() && PhotoAlbumFrag.this.f2732Q0 != null && PhotoAlbumFrag.this.f2732Q0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    PhotoAlbumFrag.this.f2732Q0[0].setVisibility(8);
                }
            }
            FeedModule.f316d.m16527Pb().mo15076c(PhotoAlbumFrag.this.act(), PhotoAlbumFrag.this.f2730P0[iF]);
            if (PhotoAlbumFrag.this.getString(R$string.f533h5).equals(PhotoAlbumFrag.this.f2730P0[iF].getText().toString()) || "喜欢".equals(PhotoAlbumFrag.this.f2730P0[iF].getText().toString())) {
                mwh.m12038d().m12049l("喜欢".equals(PhotoAlbumFrag.this.f2730P0[iF].getText().toString()) ? 15 : 3);
                PhotoAlbumFrag.this.mo4810g2();
            }
            if (PhotoAlbumFrag.this.getString(R$string.f540i5).equals(PhotoAlbumFrag.this.f2730P0[iF].getText().toString()) && PhotoAlbumFrag.this.isResumed()) {
                mwh.m12038d().m12049l(11);
                if (PhotoAlbumFrag.this.f2714H0) {
                    PhotoAlbumFrag.this.m4814h6();
                }
            }
            if (PhotoAlbumFrag.this.getString(R$string.f347E0).equals(PhotoAlbumFrag.this.f2730P0[iF].getText().toString()) && iF != PhotoAlbumFrag.this.f2738T0) {
                PhotoAlbumFrag photoAlbumFrag3 = PhotoAlbumFrag.this;
                p6j0.m12912b("e_recommend", photoAlbumFrag3.m4837s6(photoAlbumFrag3.f2712G0), new p6j0.C2456a[0]);
            }
            PhotoAlbumFrag.this.f2712G0 = iF;
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m4869f() {
            PhotoAlbumFrag.this.m4806e7();
        }

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ void m4870g() {
            xdl0.M(PhotoAlbumFrag.this.f2736S0[0], false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$f */
    public class C2121f {

        /* JADX INFO: renamed from: a */
        public String f2767a;

        /* JADX INFO: renamed from: b */
        public String f2768b;

        /* JADX INFO: renamed from: c */
        public JSONObject f2769c;

        public C2121f(String str, String str2, JSONObject jSONObject) {
            this.f2767a = str;
            this.f2768b = str2;
            this.f2769c = jSONObject;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumFrag$g */
    public class C2122g {

        /* JADX INFO: renamed from: a */
        public int f2771a;

        /* JADX INFO: renamed from: b */
        public int f2772b;

        /* JADX INFO: renamed from: c */
        public int f2773c;

        /* JADX INFO: renamed from: d */
        public boolean f2774d;

        /* JADX INFO: renamed from: e */
        public boolean f2775e;

        /* JADX INFO: renamed from: f */
        public boolean f2776f;

        public C2122g(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
            this.f2772b = i;
            this.f2771a = i2;
            this.f2773c = i3;
            this.f2774d = z;
            this.f2775e = z2;
            this.f2776f = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2122g)) {
                return false;
            }
            C2122g c2122g = (C2122g) obj;
            return this.f2774d == c2122g.f2774d && this.f2771a == c2122g.f2771a && this.f2772b == c2122g.f2772b && this.f2773c == c2122g.f2773c && this.f2775e == c2122g.f2775e && this.f2776f == c2122g.f2776f;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f2771a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f2773c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f2774d).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f2775e).hashCode();
            return (Boolean.valueOf(this.f2776f).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f2772b + "\nunreadFeeds:" + this.f2771a + "\nunreadActivities:" + this.f2773c + "\nisShowFixTimeDot:" + this.f2774d + "\nisShowTopicDot:" + this.f2775e + "\nisHideRedByNewUser:" + this.f2776f + "\n";
        }
    }

    public PhotoAlbumFrag() {
        if (NullChecker.b(FeedModule.f316d)) {
            je80.m11129b().m11130a();
            if (nkg.m12227Y() && !nkg.m12238f0()) {
                lah.m11627g().m11633l(false);
            }
        }
        this.f2751a1 = new RunnableC2117b();
        this.f2753c1 = "feed_like_menu_icon_default";
        this.f2754d1 = "feed_like_menu_icon";
    }

    /* JADX INFO: renamed from: A6 */
    private void m4696A6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.z870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15644a.m4793X6(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a970
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f5665a.m4796Y6(view2);
            }
        });
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m4710N4(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a7 */
    public /* synthetic */ void m4732a7(View view) {
        p6j0.m12912b("e_moment_unread_notes_history", m4820j6(), new p6j0.C2456a[0]);
        act().startActivity(PhotoAlbumActivitiesAct.m6071V1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: c6 */
    private void m4735c6(final int i) {
        if (m4826m6() >= 0 || (nkg.m12238f0() && m4829o6() >= 0)) {
            final int iM4829o6 = nkg.m12227Y() ? m4829o6() : m4826m6();
            boolean z = this.f2736S0[iM4829o6].getVisibility() == 0;
            lwh lwhVar = new lwh(false, new d30() { // from class: l.c870
                public final void call() {
                    this.f6555a.m4768E6(i);
                }
            });
            lwhVar.m11712b(new lwh(i > 0, new d30() { // from class: l.n870
                public final void call() {
                    this.f10697a.m4769F6(iM4829o6);
                }
            })).m11712b(new lwh(true, new d30() { // from class: l.y870
                public final void call() {
                    this.f15293a.m4770G6(iM4829o6);
                }
            }));
            lwhVar.m11711a();
            m4812g6(xdl0.O0(this.f2736S0[iM4829o6]) ? this.f2736S0[iM4829o6] : this.f2734R0[iM4829o6], z, this.f2736S0[iM4829o6].getVisibility() == 0, m4833q6(), null);
        }
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m4737e5(c cVar) {
        if (cVar == c.m) {
            FeedModule.f319g.m10117c();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m4743k5(Throwable th) {
    }

    /* JADX INFO: renamed from: l7 */
    private void m4745l7() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) {
            photoAlbumFeedFragM4859l.m5452a5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m7 */
    public void m4747m7() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) {
            photoAlbumFeedFragM4859l.m5453b5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v7 */
    public void m4757v7() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) {
            photoAlbumFeedFragM4859l.m5463m5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w6 */
    public void m4759w6() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) {
            photoAlbumFeedFragM4859l.m5447V4();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m4763B4() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.view.View, com.p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView] */
    /* JADX INFO: renamed from: B6 */
    public final void m4764B6() {
        this.f2713H = new VFrame(getContext());
        this.f2717J = new VFrame(getContext());
        View vText = new VText(getContext());
        this.f2715I = vText;
        this.f2713H.addView(vText, new FrameLayout.LayoutParams(-2, t100.d(34.0f)));
        this.f2715I.setText(R$string.f360G1);
        this.f2715I.setTextSize(14.0f);
        this.f2715I.setTextColor(-1);
        this.f2715I.setTypeface(eqh0.c(3), 1);
        this.f2715I.setPadding(t100.d(12.0f), 0, t100.d(12.0f), 0);
        this.f2715I.setBackgroundResource(f3c0.f7889q5);
        this.f2715I.setGravity(16);
        View vImage = new VImage(getContext());
        this.f2719K = vImage;
        this.f2717J.addView(vImage, new FrameLayout.LayoutParams(t100.d(32.0f), t100.d(32.0f)));
        this.f2719K.setImageResource(f3c0.f7895r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(9.5f), t100.d(9.5f));
        layoutParams.gravity = 53;
        ?? feedRedDotView = new FeedRedDotView(getContext());
        this.f2721L = feedRedDotView;
        this.f2717J.addView(feedRedDotView, layoutParams);
        this.f2721L.setOvalColor(getResources().getColor(e1c0.f7156o));
        this.f2721L.setWidth(t100.d(9.5f));
        this.f2721L.setRingWidth(t100.d(1.5f));
        this.f2721L.setRingColor(getResources().getColor(e1c0.f7159p0));
        this.f2721L.setRedPointType(2);
        this.f2721L.m6158o();
        xdl0.M(this.f2721L, false);
        xdl0.M(this.f2706D, true);
    }

    /* JADX INFO: renamed from: C6 */
    public final boolean m4765C6() {
        return vqg.m15522j0(1);
    }

    /* JADX INFO: renamed from: D6 */
    public final boolean m4766D6() {
        return !TextUtils.isEmpty(this.f2710F0);
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC2259b
    /* JADX INFO: renamed from: E0 */
    public void mo4767E0() {
        e51.J(this.f2751a1);
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m4768E6(int i) {
        String str;
        m4834q7(m4826m6(), i);
        this.f2734R0[m4826m6()].setVisibility(0);
        this.f2736S0[m4826m6()].setVisibility(8);
        TextView textView = this.f2734R0[m4826m6()];
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        textView.setText(str);
        m4832p7(this.f2734R0[m4826m6()]);
    }

    /* JADX INFO: renamed from: H6 */
    public final /* synthetic */ void m4771H6(int i) {
        m4792X5(m4831p6(), i);
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m4772I6() {
        m4770G6(m4831p6());
    }

    /* JADX INFO: renamed from: J4 */
    public cwf0 m4773J4() {
        return NullChecker.a(this.f2731Q) ? this.f2731Q : super.J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m4774J6(Moment moment) {
        this.f2703A.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ Boolean m4775K6(c cVar) {
        return Boolean.valueOf(cVar == c.i && m4838s7());
    }

    /* JADX INFO: renamed from: L6 */
    public final /* synthetic */ void m4776L6(c cVar) {
        if (NullChecker.a(this.f2723M) && this.f2723M.isShowing()) {
            this.f2723M.dismiss();
        }
        if (NullChecker.a(this.f2752b1) && this.f2752b1.isShowing()) {
            this.f2752b1.dismiss();
        }
        m4805e6();
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m4777M6(Act.r rVar) {
        ImageView imageView;
        if (NullChecker.a(rVar)) {
            FeedModule.f314b.m1417I2();
            if (!nkg.m12227Y() || nkg.m12238f0() || (imageView = this.f2736S0[0]) == null || xdl0.O0(imageView) || !lah.f9976g || !lah.m11627g().m11628f()) {
                return;
            }
            lah.f9976g = false;
            if (this.f2738T0 != 0) {
                lah.m11627g().m11633l(true);
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final /* synthetic */ void m4778N6(Bundle bundle) {
        act().duringCreated(Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.v870
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.r) obj) != null || ((Act.r) obj2) == null);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.w870
            public final void call(Object obj) {
                this.f14460a.m4777M6((Act.r) obj);
            }
        }));
        FeedModule.f314b.m1415G2();
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: O0 */
    public void mo4779O0(String str, boolean z) {
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m4780O6(Boolean bool) {
        m4806e7();
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: P0 */
    public boolean mo4781P0() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (this.f2740U0 || !(photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag)) {
            return false;
        }
        return photoAlbumFeedFragM4859l.m5440P0();
    }

    /* JADX INFO: renamed from: P6 */
    public final /* synthetic */ void m4782P6(String str) {
        v1h.m15205I0(act(), str);
    }

    /* JADX INFO: renamed from: Q6 */
    public final /* synthetic */ Boolean m4783Q6(Act.r rVar, Act.r rVar2) {
        if (rVar != null && rVar2 == null) {
            this.f2743W = System.currentTimeMillis();
        }
        return Boolean.valueOf(rVar != null || rVar2 == null);
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m4784R6(Act.r rVar) {
        if (this.f2743W <= 0 || System.currentTimeMillis() - this.f2743W <= f2701f1) {
            return;
        }
        this.f2743W = 0L;
        this.f2745X.onNext(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: S6 */
    public final /* synthetic */ void m4785S6(Bundle bundle) {
        act().duringCreated(Act.foreground(), false).distinctUntilChanged(new x9j() { // from class: l.t870
            public final Object call(Object obj, Object obj2) {
                return this.f13224a.m4783Q6((Act.r) obj, (Act.r) obj2);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.u870
            public final void call(Object obj) {
                this.f13587a.m4784R6((Act.r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    public final /* synthetic */ void m4786T6(Long l2) {
        m4823k7();
    }

    /* JADX INFO: renamed from: U6 */
    public final /* synthetic */ void m4787U6(String str) {
        if (this.f2738T0 == 0) {
            FeedModule.f316d.f14966a0.put(str);
            return;
        }
        if (lah.f9976g || !lah.m11627g().m11628f()) {
            return;
        }
        lah.m11627g().m11634m();
        lah.f9976g = true;
        lah.m11627g().m11632k();
        this.f2748Y0 = true;
        this.f2746X0 = str;
        m4813g7();
    }

    /* JADX INFO: renamed from: V5 */
    public View m4788V5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return n970.m12128b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: W5 */
    public void m4790W5() {
        n970.m12129c(this);
    }

    /* JADX INFO: renamed from: W6 */
    public final /* synthetic */ void m4791W6(C2122g c2122g) {
        m4846x6(c2122g);
        m4828n7(c2122g);
        m4850y7(c2122g.f2773c);
    }

    /* JADX INFO: renamed from: X5 */
    public final void m4792X5(int i, int i2) {
        String str;
        if (i == -1) {
            return;
        }
        m4834q7(i, i2);
        this.f2734R0[i].setVisibility(0);
        this.f2736S0[i].setVisibility(8);
        TextView textView = this.f2734R0[i];
        if (i2 > 99) {
            str = "99+";
        } else {
            str = i2 + "";
        }
        textView.setText(str);
        if (nkg.m12227Y()) {
            return;
        }
        m4832p7(this.f2734R0[m4826m6()]);
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m4793X6(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return;
        }
        this.f2733R.mo15419a(act(), m4839t6(), null, this.f2735S);
        m84.m11844e().m11853j();
        m4844v6();
    }

    /* JADX INFO: renamed from: Y */
    public Frag m4794Y() {
        return this.f2726N0.m4859l(this.f2703A.getCurrentItem());
    }

    /* JADX INFO: renamed from: Y5 */
    public final boolean m4795Y5(int i) {
        if (i < 10) {
            return false;
        }
        return ((Long) fm20.f8153d.get()).longValue() == 0 || !a5i.m8406f(((Long) fm20.f8153d.get()).longValue(), mqi0.o());
    }

    /* JADX INFO: renamed from: Y6 */
    public final /* synthetic */ boolean m4796Y6(View view) {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
            return true;
        }
        m84.m11844e().m11853j();
        oe40.m12583k0(act(), vwb.f0(new Media[0]), true, "camera");
        m4844v6();
        return true;
    }

    /* JADX INFO: renamed from: Z5 */
    public final void m4797Z5(boolean z) {
        C2119d c2119d;
        if (z || (c2119d = this.f2726N0) == null) {
            FeedModule.m1140H().Pq(act(), false);
            return;
        }
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = c2119d.m4859l(this.f2738T0);
        if ((photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag) && photoAlbumFeedFragM4859l.m5442Q4()) {
            FeedModule.m1140H().jg(act(), false);
        } else {
            FeedModule.m1140H().Pq(act(), false);
        }
    }

    /* JADX INFO: renamed from: Z6 */
    public final /* synthetic */ void m4798Z6(View view, String str, String str2, j760[] j760VarArr) {
        this.f2724M0.m11594h(view, new C2121f(str, str2, zvf0.b(j760VarArr)), 2);
    }

    /* JADX INFO: renamed from: a6 */
    public final boolean m4799a6() {
        return m4800b6();
    }

    /* JADX INFO: renamed from: b6 */
    public final boolean m4800b6() {
        this.f2714H0 = true;
        e51.J(this.f2751a1);
        if (this.f2738T0 != m4831p6()) {
            return false;
        }
        m4814h6();
        return false;
    }

    /* JADX INFO: renamed from: b7 */
    public final /* synthetic */ void m4801b7(Intent intent) {
        act().startActivityForResult(intent, 786);
    }

    /* JADX INFO: renamed from: d6 */
    public final void m4803d6(final int i) {
        if (m4831p6() < 1) {
            return;
        }
        boolean z = this.f2734R0[m4831p6()].getVisibility() == 0;
        lwh lwhVar = new lwh(false, new d30() { // from class: l.q870
            public final void call() {
                this.f12149a.m4771H6(i);
            }
        });
        lwhVar.m11712b(new lwh(true, new d30() { // from class: l.r870
            public final void call() {
                this.f12541a.m4772I6();
            }
        }));
        lwhVar.m11711a();
        m4808f6(xdl0.O0(this.f2734R0[m4831p6()]) ? this.f2734R0[m4831p6()] : this.f2736S0[m4831p6()], z, this.f2734R0[m4831p6()].getVisibility() == 0, 11);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m4804d7(String str) {
        if (this.f2738T0 == 0 && nkg.m12238f0() && NullChecker.a(this.f2736S0) && NullChecker.a(this.f2736S0[0]) && xdl0.O0(this.f2736S0[0])) {
            v9h.f14114i = true;
            v9h.f14112g = false;
            v9h.f14113h = false;
        }
    }

    /* JADX INFO: renamed from: e6 */
    public void m4805e6() {
        if (NullChecker.a(this.f2720K0)) {
            d.l().k(this.f2720K0);
            this.f2720K0 = null;
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m4807f4() {
        super.f4();
        m4851z6();
    }

    /* JADX INFO: renamed from: f6 */
    public final void m4808f6(View view, boolean z, boolean z2, int i) {
        if (z ^ z2) {
            if (z) {
                mwh.m12038d().m12056s(Integer.valueOf(i));
            } else {
                mwh.m12038d().m12054q(false, view, i, new ArrayList());
            }
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ C2122g m4809f7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        return new C2122g(nkg.m12238f0() ? counter.moments.unreadLikeFeeds : 0, nkg.m12227Y() ? 0 : counter.moments.unreadFeeds, counter.activities.unread, bool.booleanValue(), d.doubleValue() > 0.0d, bool2.booleanValue());
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: g2 */
    public void mo4810g2() {
        if (nkg.m12227Y() && xdl0.O0(this.f2736S0[0]) && !nkg.m12238f0()) {
            this.f2748Y0 = false;
            xdl0.M(this.f2736S0[0], false);
            FeedModule.f316d.f14966a0.put(this.f2746X0);
            if (NullChecker.a(this.f2744W0)) {
                m4828n7(this.f2744W0);
                return;
            }
            return;
        }
        if (this.f2757p0 || this.f2708E0 <= 0 || !NullChecker.a(this.f2744W0)) {
            return;
        }
        this.f2757p0 = true;
        this.f2708E0 = 0;
        m4828n7(this.f2744W0);
    }

    /* JADX INFO: renamed from: g4 */
    public void m4811g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        mwh.m12038d().m12060w(new mwh.InterfaceC2432a() { // from class: l.o870
            @Override // p007l.mwh.InterfaceC2432a
            /* JADX INFO: renamed from: a */
            public final void mo11060a(View view, String str, String str2, j760[] j760VarArr) {
                this.f11379a.m4798Z6(view, str, str2, j760VarArr);
            }
        });
        m4764B6();
        this.f2728O0.add(0, nkg.m12227Y() ? "喜欢" : getString(R$string.f533h5));
        this.f2728O0.add(1, getString(R$string.f540i5));
        ArrayList arrayList = new ArrayList();
        PhotoAlbumFeedFrag photoAlbumFeedFragM5457f5 = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_like", -1, User.ID_TEAM_ACCOUNT, 12).m5457f5(this.f2703A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM5457f6 = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_nearby_focus", -1, User.ID_TEAM_ACCOUNT, 0).m5457f5(this.f2703A);
        PhotoAlbumFeedFrag photoAlbumFeedFragM5434M4 = PhotoAlbumFeedFrag.m5434M4(FeedModule.m1139F().userId(), "from_nearby_falls_feed", -1, User.ID_TEAM_ACCOUNT, 1);
        if (nkg.m12227Y()) {
            arrayList.add(photoAlbumFeedFragM5457f5);
        } else {
            arrayList.add(photoAlbumFeedFragM5457f6);
        }
        arrayList.add(photoAlbumFeedFragM5434M4);
        this.f2726N0.m4863p(arrayList);
        this.f2758z.setTag("photo_album_root");
        this.f2703A.setOnPageChangeListener(this.f2726N0);
        this.f2703A.setAdapter(this.f2726N0);
        this.f2705C.setBackgroundColor(act().getResources().getColor(e1c0.f7155n0));
        this.f2705C.setupViewPager(this.f2703A);
        this.f2711G = this.f2705C.getTabLayout();
        this.f2705C.setRightIconViews(new View[]{this.f2717J, this.f2713H});
        int i = 0;
        while (i < this.f2711G.getTabCount()) {
            View viewM4860m = this.f2726N0.m4860m(i);
            VNavigationTabLayout.f fVarW = this.f2711G.w(i);
            Objects.requireNonNull(fVarW);
            fVarW.n(viewM4860m);
            VNavigationTabLayout.f fVarW2 = this.f2711G.w(i);
            Objects.requireNonNull(fVarW2);
            VNavigationTabLayout.TabView tabView = fVarW2.i;
            int iD = i == 0 ? t100.d(4.0f) : 0;
            VNavigationTabLayout.f fVarW3 = this.f2711G.w(i);
            Objects.requireNonNull(fVarW3);
            int paddingTop = fVarW3.i.getPaddingTop();
            VNavigationTabLayout.f fVarW4 = this.f2711G.w(i);
            Objects.requireNonNull(fVarW4);
            tabView.setPadding(iD, paddingTop, 0, fVarW4.i.getPaddingBottom());
            i++;
        }
        this.f2711G.setOnTabSelectedListener(new C2120e());
        this.f2747Y = true;
        m4849y6(m4827n6(), photoAlbumFeedFragM5434M4);
        m4696A6(this.f2715I);
        this.f2718J0 = new jug(act(), m4820j6());
        tfh.m14518h().m14526k(this);
        hrg.m10716g().m10722j(this);
        xdl0.E0(this.f2706D, new View.OnClickListener() { // from class: l.p870
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11725a.m4732a7(view);
            }
        });
    }

    /* JADX INFO: renamed from: g6 */
    public final void m4812g6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                mwh.m12038d().m12056s(Integer.valueOf(i));
            } else {
                mwh.m12038d().m12053p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: renamed from: g7 */
    public final void m4813g7() {
        this.f2736S0[0].setVisibility(0);
        p6j0.m12915e("e_red_dot_explore", mwh.m12038d().m12043f(m4833q6()), new j760("red_dot_relation_child", "red_dot_like"));
        if (NullChecker.a(this.f2744W0)) {
            m4828n7(this.f2744W0);
        }
    }

    /* JADX INFO: renamed from: h6 */
    public final boolean m4814h6() {
        this.f2714H0 = false;
        if (System.currentTimeMillis() - ((Long) fm20.f8154e.get()).longValue() < 172800000 || cjh.m9194d()) {
            return false;
        }
        e51.I(this, this.f2751a1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void m4770G6(int i) {
        this.f2734R0[i].setVisibility(8);
        this.f2736S0[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: i6 */
    public final void m4816i6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f2756k0 = mwh.m12038d().m12048k(view, i, z3, z4, m4835r6(), true);
            } else {
                mwh.m12038d().m12056s(1);
            }
        }
    }

    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m4806e7() {
        Fragment fragmentM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (this.f2740U0) {
            return;
        }
        if (fragmentM4859l instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM4859l).m5450Y4();
        } else if (fragmentM4859l instanceof PhotoAlbumFallsFeedFrag) {
            ((PhotoAlbumFallsFeedFrag) fragmentM4859l).m4629m5();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f2726N0 = new C2119d(getChildFragmentManager());
        return m4788V5(layoutInflater, viewGroup);
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: j0 */
    public void mo4818j0() {
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: j1 */
    public void mo4819j1(int i) {
        int iM4824l6 = m4824l6(i);
        if (iM4824l6 >= 0) {
            if (12 == i) {
                this.f2755e1 = true;
            }
            this.f2703A.setCurrentItem(iM4824l6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public String m4820j6() {
        if (this.f2738T0 == 0) {
            return nkg.m12227Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: j7, reason: merged with bridge method [inline-methods] */
    public final void m4769F6(int i) {
        this.f2734R0[i].setVisibility(8);
        this.f2736S0[i].setVisibility(0);
        if (nkg.m12238f0() && i == 0) {
            v9h.f14113h = true;
            FeedModule.f316d.f14923G1 = "recommend";
        }
    }

    /* JADX INFO: renamed from: k6 */
    public String m4822k6() {
        cwf0 cwf0Var = this.f2731Q;
        if (cwf0Var == this.f2727O) {
            return "p_follow";
        }
        if (cwf0Var == this.f2729P) {
            return OMSDialogPositon.p_nearby;
        }
        return cwf0Var == this.f2725N ? "p_like" : "";
    }

    /* JADX INFO: renamed from: k7 */
    public final void m4823k7() {
        if (vwb.J(this.f2716I0)) {
            return;
        }
        int size = this.f2716I0.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f2716I0.get(i);
            boolean z = (fragment.getArguments() == null ? -2 : fragment.getArguments().getInt("page_type", -2)) != 0;
            boolean z2 = 12 != (fragment.getArguments() != null ? fragment.getArguments().getInt("page_type", -2) : -2);
            if ((fragment instanceof PhotoAlbumFeedFrag) && (z || z2)) {
                ((PhotoAlbumFeedFrag) fragment).m5450Y4();
            }
        }
    }

    /* JADX INFO: renamed from: l6 */
    public int m4824l6(int i) {
        if (vwb.J(this.f2716I0)) {
            return -1;
        }
        int size = this.f2716I0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i == (this.f2716I0.get(i2).getArguments() != null ? this.f2716I0.get(i2).getArguments().getInt("page_type", -2) : -2)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.p000p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC2258a
    /* JADX INFO: renamed from: m */
    public void mo4825m(String str) {
        PhotoAlbumFallsFeedFrag photoAlbumFallsFeedFragM4794Y = m4794Y();
        if (photoAlbumFallsFeedFragM4794Y instanceof PhotoAlbumFallsFeedFrag) {
            photoAlbumFallsFeedFragM4794Y.m4631o5(str);
        }
    }

    /* JADX INFO: renamed from: m6 */
    public final int m4826m6() {
        List<String> list = this.f2728O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f533h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: n6 */
    public final int m4827n6() {
        return m4831p6();
    }

    /* JADX INFO: renamed from: n7 */
    public final void m4828n7(C2122g c2122g) {
        if (c2122g == null) {
            return;
        }
        this.f2744W0 = c2122g;
        m4735c6(m4841u6(c2122g));
        m4803d6(c2122g.f2773c);
        int iM4831p6 = m4831p6();
        if (iM4831p6 >= 0) {
            ImageView[] imageViewArr = this.f2736S0;
            if (iM4831p6 < imageViewArr.length) {
                xdl0.M(imageViewArr[this.f2728O0.indexOf(getString(R$string.f540i5))], c2122g.f2774d);
            }
        }
        if (c2122g.f2774d) {
            FeedModule.f316d.m16745ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z = true;
        boolean z2 = c2122g.f2773c > 0 && !m4765C6();
        if (z2) {
            kjb0.m11438B(act(), c2122g.f2773c);
        } else {
            kjb0.m11438B(act(), -1);
        }
        if (!nkg.m12238f0()) {
            boolean z3 = !z2 && ((!nkg.m12227Y() && m4841u6(c2122g) > 0) || c2122g.f2774d || (!c2122g.f2776f && c2122g.f2775e)) && !m4765C6();
            boolean z4 = this.f2749Z;
            if (z2) {
                m4816i6(null, z4, false, m4841u6(c2122g), c2122g.f2775e, true);
                kjb0.m11437A(act(), false);
            } else {
                m4816i6(null, z4, z3 || this.f2748Y0, m4841u6(c2122g), c2122g.f2775e, false);
                kjb0.m11437A(act(), z3 || this.f2748Y0);
            }
            if (!z3 && !this.f2748Y0) {
                z = false;
            }
            this.f2749Z = z;
            return;
        }
        boolean z5 = !z2 && (m4841u6(c2122g) > 0 || c2122g.f2774d || (!c2122g.f2776f && c2122g.f2775e)) && !m4765C6();
        boolean z6 = this.f2749Z;
        if (!z6 || !c2122g.f2775e) {
            m4816i6(null, z6, z5, m4841u6(c2122g), c2122g.f2775e, z2);
            kjb0.m11437A(act(), z5);
            this.f2749Z = z5;
        } else {
            mwh.m12038d().m12051n(4);
            if (!z5 && !c2122g.f2775e) {
                z = false;
            }
            this.f2749Z = z;
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final int m4829o6() {
        List<String> list = this.f2728O0;
        if (list != null) {
            return list.indexOf("喜欢");
        }
        return 0;
    }

    /* JADX INFO: renamed from: o7 */
    public final void m4830o7(View view) {
        dah dahVar = this.f2752b1;
        if (dahVar != null && dahVar.isShowing()) {
            this.f2752b1.dismiss();
            return;
        }
        dah dahVar2 = new dah(this, act(), new d30() { // from class: l.c970
            public final void call() {
                this.f6572a.m4802c7();
            }
        });
        this.f2752b1 = dahVar2;
        VImage[] vImageArr = this.f2732Q0;
        if (vImageArr != null && vImageArr.length > 0) {
            dahVar2.setOnDismissListener(new C2118c());
        }
        ed80.c(this.f2752b1, view, 0, t100.e, 80);
    }

    public void onCreate(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.onCreate(bundle);
        this.f2729P.i();
        this.f2727O.i();
        if (nkg.m12227Y()) {
            this.f2725N.i();
        }
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        mwh.m12038d().m12057t();
        this.f2729P.j();
        this.f2727O.j();
        if (nkg.m12227Y()) {
            this.f2725N.j();
        }
        if (NullChecker.a(this.f2726N0)) {
            this.f2726N0.m4862o();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f2702g1 = z;
        uwh.m15178a().f13974a.onNext(Boolean.valueOf(!z));
        if (nkg.m12216N() && NullChecker.a(this.f2726N0)) {
            for (int i = 0; i < this.f2726N0.f2762a.size(); i++) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (Fragment) this.f2726N0.f2762a.get(i);
                if (photoAlbumFeedFrag instanceof PhotoAlbumFeedFrag) {
                    photoAlbumFeedFrag.m5455e5(z);
                }
            }
        }
        if (z) {
            if (NullChecker.b(act())) {
                if (NullChecker.a(this.f2742V0) && this.f2742V0.isShowing()) {
                    this.f2742V0.dismiss();
                }
                if (NullChecker.a(this.f2723M) && this.f2723M.isShowing()) {
                    this.f2723M.dismiss();
                }
                if (NullChecker.a(this.f2752b1) && this.f2752b1.isShowing()) {
                    this.f2752b1.dismiss();
                }
                PhotoAlbumPictureView.m4886u(act().getWindow().getDecorView(), false);
            }
            e51.J(this.f2751a1);
            eng.m9935o();
            m4747m7();
            m4757v7();
            m4759w6();
            m4805e6();
        } else {
            m4840t7(NullChecker.a(this.f2744W0) ? this.f2744W0.f2773c : 0);
            if (this.f2756k0 == 10) {
                mwh.m12038d().m12050m(this.f2756k0, m4835r6());
            } else {
                mwh.m12038d().m12049l(this.f2756k0);
            }
            uwh.m15178a().f13975b = true;
            if (this.f2738T0 == 1) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.FALSE);
            }
            m4799a6();
            if (u2h.m14719d()) {
                m4745l7();
            }
            m4845w7();
        }
        m4797Z5(z);
        this.f2737T.onNext(Boolean.valueOf(z));
    }

    public void onResume() {
        super/*com.p1.mobile.android.app.Frag*/.onResume();
        if ("moment".equals(this.f2739U)) {
            this.f2718J0.mo8626q();
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final int m4831p6() {
        List<String> list = this.f2728O0;
        if (list != null) {
            return list.indexOf(getString(R$string.f540i5));
        }
        return 1;
    }

    /* JADX INFO: renamed from: p7 */
    public final void m4832p7(TextView textView) {
        if (NullChecker.b(textView)) {
            textView.setTextColor(Color.parseColor("#ff3228"));
            textView.setBackgroundResource(f3c0.f7721V0);
            textView.setTextSize(10.0f);
        }
    }

    public String pageId() {
        return m4820j6();
    }

    /* JADX INFO: renamed from: q6 */
    public final int m4833q6() {
        return nkg.m12227Y() ? 15 : 3;
    }

    /* JADX INFO: renamed from: q7 */
    public void m4834q7(int i, int i2) {
        VText vText = this.f2734R0[i];
        ConstraintLayout.a aVar = (ConstraintLayout.a) vText.getLayoutParams();
        if (i2 < 10) {
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = t100.d(10.0f);
        } else if (i2 <= 99) {
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = t100.d(6.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = t100.d(0.0f);
        }
        vText.setLayoutParams(aVar);
    }

    /* JADX INFO: renamed from: r6 */
    public final String m4835r6() {
        if (NullChecker.b(this.f2711G) && this.f2711G.getSelectedTabPosition() == 0) {
            return nkg.m12227Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: r7 */
    public void m4836r7() {
        PhotoAlbumFeedFrag photoAlbumFeedFragM4859l = this.f2726N0.m4859l(this.f2738T0);
        if (this.f2740U0 || !(photoAlbumFeedFragM4859l instanceof PhotoAlbumFeedFrag)) {
            return;
        }
        photoAlbumFeedFragM4859l.m5461i5(new e30() { // from class: l.x870
            public final void call(Object obj) {
                this.f14794a.m4804d7((String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s6 */
    public final String m4837s6(int i) {
        if (NullChecker.b(this.f2711G) && i == 0) {
            return nkg.m12227Y() ? "p_like" : "p_follow";
        }
        return OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: s7 */
    public final boolean m4838s7() {
        long jLongValue = FeedModule.f316d.m16777z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    @NotNull
    /* JADX INFO: renamed from: t6 */
    public final String m4839t6() {
        CharSequence pageTitle = this.f2726N0.getPageTitle(this.f2703A.getCurrentItem());
        if ("喜欢".equals(pageTitle)) {
            return "like";
        }
        if (getString(R$string.f533h5).equals(pageTitle)) {
            return "follow";
        }
        return getString(R$string.f540i5).equals(pageTitle) ? "nearby" : "other";
    }

    /* JADX INFO: renamed from: t7 */
    public final void m4840t7(int i) {
        if (f2702g1 || this.f2722L0) {
            return;
        }
        String str = "这里有" + ((Object) this.f2709F.getText()) + "条消息在等你回复～";
        if (m4795Y5(i)) {
            fm20.f8153d.put(Long.valueOf(mqi0.o()));
            this.f2720K0 = d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).D(str).k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f).E(true).b(3000L).x(-t100.d).q(com.p1.mobile.android.ui.bubble.a.Q | com.p1.mobile.android.ui.bubble.a.P).o(com.p1.mobile.android.ui.bubble.a.P, t100.d(6.0f)), this.f2706D);
            this.f2722L0 = true;
        }
    }

    /* JADX INFO: renamed from: u6 */
    public final int m4841u6(C2122g c2122g) {
        int i;
        if (nkg.m12238f0()) {
            return c2122g.f2772b;
        }
        int i2 = c2122g.f2771a;
        return (i2 != 0 || (i = this.f2708E0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: u7 */
    public final void m4842u7() {
        if (isHidden() || cjh.m9192b()) {
            return;
        }
        fm20.f8154e.put(Long.valueOf(System.currentTimeMillis()));
        if (!u2h.m14717b() || ic50.j().f().M("p_alert_positioning_authority_explore_popup", true)) {
            if (u2h.m14717b()) {
                ic50.j().f().b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m1140H().showLocationPermissionCallbackDlg(act(), new d30() { // from class: l.b970
                public final void call() {
                    this.f6187a.m4806e7();
                }
            }, (d30) null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    @Override // p007l.zzl
    /* JADX INFO: renamed from: v3 */
    public void mo4843v3(String str) {
    }

    /* JADX INFO: renamed from: v6 */
    public final void m4844v6() {
        if (m4766D6()) {
            d.l().k(this.f2710F0);
            this.f2710F0 = null;
        }
    }

    /* JADX INFO: renamed from: w7 */
    public final void m4845w7() {
        p6j0.m12914d("e_moment_unread_notes_history", m4820j6(), new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: x6 */
    public final void m4846x6(C2122g c2122g) {
        if (nkg.m12238f0()) {
            int i = c2122g.f2772b;
            if (i <= 0 || this.f2757p0) {
                return;
            }
            this.f2708E0 = i;
            return;
        }
        int i2 = c2122g.f2771a;
        if (i2 <= 0 || this.f2757p0) {
            return;
        }
        this.f2708E0 = i2;
    }

    /* JADX INFO: renamed from: x7, reason: merged with bridge method [inline-methods] */
    public final rx.c<C2122g> m4789V6() {
        FeedModule.f316d.m16591Yc("");
        return mkd0.t(ijb0.m10923j(), FeedModule.f316d.f14963Y0.asObservable(), rx.c.just(Double.valueOf(0.0d)), FeedModule.m1140H().isHideRedByNewUser(), new z9j() { // from class: l.s870
            /* JADX INFO: renamed from: b */
            public final Object m14046b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f12822a.m4809f7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: y4 */
    public void m4848y4() {
        m4790W5();
    }

    /* JADX INFO: renamed from: y6 */
    public final void m4849y6(int i, PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f2703A.setCurrentItem(i);
        Fragment fragment = this.f2716I0.get(i);
        boolean z = (getString(R$string.f533h5).equals(this.f2726N0.getPageTitle(i)) && "喜欢".equals(this.f2726N0.getPageTitle(i))) ? false : true;
        if ((fragment instanceof PhotoAlbumFeedFrag) && z) {
            ((PhotoAlbumFeedFrag) fragment).m5446U4().m8725j0();
        } else if (photoAlbumFeedFrag != null) {
            photoAlbumFeedFrag.m5446U4().m8725j0();
        }
    }

    /* JADX INFO: renamed from: y7 */
    public final void m4850y7(int i) {
        ImageView imageView = this.f2707E;
        if (i > 0) {
            imageView.setImageResource(f3c0.f7679P0);
            xdl0.M(this.f2709F, true);
            VText vText = this.f2709F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(f3c0.f7672O0);
            xdl0.M(this.f2709F, false);
        }
        m4840t7(i);
    }

    /* JADX INFO: renamed from: z6 */
    public final void m4851z6() {
        if (nkg.m12227Y() && !nkg.m12238f0()) {
            duringCreated(FeedModule.f316d.f14912B0).subscribe(mkd0.G(new e30() { // from class: l.d970
                public final void call(Object obj) {
                    this.f6869a.m4787U6((String) obj);
                }
            }));
        }
        duringCreated(new v9j() { // from class: l.d870
            public final Object call() {
                return this.f6864a.m4789V6();
            }
        }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.e870
            public final void call(Object obj) {
                this.f7247a.m4791W6((PhotoAlbumFrag.C2122g) obj);
            }
        }, new e30() { // from class: l.f870
            public final void call(Object obj) {
                PhotoAlbumFrag.m4710N4((Throwable) obj);
            }
        }));
        duringCreated(oe40.m12541F()).subscribe(mkd0.G(new e30() { // from class: l.g870
            public final void call(Object obj) {
                this.f8384a.m4774J6((Moment) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.h870
            public final Object call(Object obj) {
                return this.f8624a.m4775K6((c) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.i870
            public final void call(Object obj) {
                FeedModule.f316d.f14963Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.j870
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.k870
            public final void call(Object obj) {
                this.f9632a.m4776L6((c) obj);
            }
        }));
        if (wc40.f() || (nkg.m12227Y() && !nkg.m12238f0())) {
            creates(new e30() { // from class: l.l870
                public final void call(Object obj) {
                    this.f9940a.m4778N6((Bundle) obj);
                }
            });
        }
        duringCreated(kjb0.m11464p()).subscribe(mkd0.G(new e30() { // from class: l.e970
            public final void call(Object obj) {
                this.f7255a.m4780O6((Boolean) obj);
            }
        }));
        duringCreated(C2089a.m3721c1()).subscribe(mkd0.G(new e30() { // from class: l.f970
            public final void call(Object obj) {
                this.f8036a.m4782P6((String) obj);
            }
        }));
        if (this.f2741V) {
            creates(new e30() { // from class: l.g970
                public final void call(Object obj) {
                    this.f8395a.m4785S6((Bundle) obj);
                }
            });
            duringCreated(this.f2745X).subscribe(mkd0.H(new e30() { // from class: l.h970
                public final void call(Object obj) {
                    this.f8637a.m4786T6((Long) obj);
                }
            }, new e30() { // from class: l.i970
                public final void call(Object obj) {
                    PhotoAlbumFrag.m4743k5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(mkd0.G(new e30() { // from class: l.j970
            public final void call(Object obj) {
                PhotoAlbumFrag.m4737e5((c) obj);
            }
        }));
    }
}
