package com.p051p1.mobile.putong.feed.newui.photoalbum.discovery;

import android.animation.Animator;
import android.content.Intent;
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
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.meituan.robust.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterActivities;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.C11408a;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p151v.navigationbar.VNavigationTabLayout;
import p153l.ayh;
import p153l.b5i;
import p153l.bnl0;
import p153l.byd0;
import p153l.byh;
import p153l.ci80;
import p153l.cmg;
import p153l.cn40;
import p153l.dmk0;
import p153l.f60;
import p153l.h80;
import p153l.hdc0;
import p153l.i4g0;
import p153l.ihh;
import p153l.j4h;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.keh;
import p153l.kl40;
import p153l.kl80;
import p153l.ksg;
import p153l.l4g0;
import p153l.l51;
import p153l.l94;
import p153l.lbc0;
import p153l.leh;
import p153l.lyh0;
import p153l.mrb0;
import p153l.mzg;
import p153l.n570;
import p153l.o1j0;
import p153l.orb0;
import p153l.p6i;
import p153l.pcj;
import p153l.pf60;
import p153l.pk50;
import p153l.pm80;
import p153l.psd0;
import p153l.pu20;
import p153l.pzi0;
import p153l.q1i;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.rkh;
import p153l.t2m;
import p153l.t8c;
import p153l.tcj;
import p153l.tec0;
import p153l.tfj0;
import p153l.tog;
import p153l.tu2;
import p153l.umg;
import p153l.uxj0;
import p153l.v370;
import p153l.vxd0;
import p153l.w0m;
import p153l.w940;
import p153l.wsg;
import p153l.x20;
import p153l.x3e;
import p153l.y20;
import p153l.ymg;
import p153l.yvg;

/* JADX INFO: loaded from: classes13.dex */
public class NewPhotoAlbumFrag extends PutongFrag implements FeedService.InterfaceC11577a, FeedService.InterfaceC11578b, t2m {

    /* JADX INFO: renamed from: l1 */
    public static long f42384l1;

    /* JADX INFO: renamed from: m1 */
    public static boolean f42385m1;

    /* JADX INFO: renamed from: n1 */
    public static byd0 f42386n1;

    /* JADX INFO: renamed from: o1 */
    public static vxd0 f42387o1;

    /* JADX INFO: renamed from: p1 */
    public static C22507a<Boolean> f42388p1;

    /* JADX INFO: renamed from: A */
    public DiscoveryPager f42389A;

    /* JADX INFO: renamed from: B */
    public VFrame f42390B;

    /* JADX INFO: renamed from: C */
    public VNavigationBar f42391C;

    /* JADX INFO: renamed from: D */
    public VFrame f42392D;

    /* JADX INFO: renamed from: E */
    public ImageView f42393E;

    /* JADX INFO: renamed from: E0 */
    public String f42394E0;

    /* JADX INFO: renamed from: F */
    public VText f42395F;

    /* JADX INFO: renamed from: G */
    public VNavigationTabLayout f42397G;

    /* JADX INFO: renamed from: H */
    public VFrame f42399H;

    /* JADX INFO: renamed from: I */
    public VText f42401I;

    /* JADX INFO: renamed from: J */
    public VFrame f42403J;

    /* JADX INFO: renamed from: J0 */
    public boolean f42404J0;

    /* JADX INFO: renamed from: K */
    public VImage f42405K;

    /* JADX INFO: renamed from: K0 */
    public int f42406K0;

    /* JADX INFO: renamed from: L */
    public FeedRedDotView f42407L;

    /* JADX INFO: renamed from: L0 */
    public String f42408L0;

    /* JADX INFO: renamed from: M */
    public PopupWindow f42409M;

    /* JADX INFO: renamed from: O0 */
    public List<PutongFrag> f42414O0;

    /* JADX INFO: renamed from: P0 */
    public q1i f42416P0;

    /* JADX INFO: renamed from: Q0 */
    public String f42418Q0;

    /* JADX INFO: renamed from: R */
    public l4g0 f42419R;

    /* JADX INFO: renamed from: R0 */
    public String f42420R0;

    /* JADX INFO: renamed from: S */
    public l4g0 f42421S;

    /* JADX INFO: renamed from: S0 */
    public FriendsFeedContainerFrag f42422S0;

    /* JADX INFO: renamed from: T */
    public l4g0 f42423T;

    /* JADX INFO: renamed from: T0 */
    public FriendsFeedViewPagerFrag f42424T0;

    /* JADX INFO: renamed from: X */
    public String f42431X;

    /* JADX INFO: renamed from: Y */
    public int f42433Y;

    /* JADX INFO: renamed from: c1 */
    public Dialog f42439c1;

    /* JADX INFO: renamed from: d1 */
    @Nullable
    public C11454e f42440d1;

    /* JADX INFO: renamed from: g1 */
    public Runnable f42443g1;

    /* JADX INFO: renamed from: h1 */
    public mzg f42444h1;

    /* JADX INFO: renamed from: i1 */
    public String f42445i1;

    /* JADX INFO: renamed from: j1 */
    public String f42446j1;

    /* JADX INFO: renamed from: k0 */
    public long f42447k0;

    /* JADX INFO: renamed from: k1 */
    public long f42448k1;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f42450z;

    /* JADX INFO: renamed from: N */
    public l4g0 f42411N = new l4g0("p_discover_dating", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: O */
    public l4g0 f42413O = new l4g0("p_discover_discussion", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: P */
    public l4g0 f42415P = new l4g0("p_follow", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: Q */
    public l4g0 f42417Q = new l4g0("p_like", NewPhotoAlbumFrag.class.getName());

    /* JADX INFO: renamed from: U */
    public keh f42425U = new leh();

    /* JADX INFO: renamed from: V */
    public y20<Intent> f42427V = dmk0.m116962a(400, new y20() { // from class: l.b840
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f75395a.m65360D7((Intent) obj);
        }
    });

    /* JADX INFO: renamed from: W */
    public C22507a<Boolean> f42429W = C22507a.m222758b();

    /* JADX INFO: renamed from: Z */
    public boolean f42435Z = true;

    /* JADX INFO: renamed from: p0 */
    public C22508b<Long> f42449p0 = C22508b.m222767b();

    /* JADX INFO: renamed from: F0 */
    public ArrayList<f60> f42396F0 = new ArrayList<>();

    /* JADX INFO: renamed from: G0 */
    public boolean f42398G0 = !pu20.m173827v();

    /* JADX INFO: renamed from: H0 */
    public boolean f42400H0 = false;

    /* JADX INFO: renamed from: I0 */
    public int f42402I0 = 1;

    /* JADX INFO: renamed from: M0 */
    public boolean f42410M0 = false;

    /* JADX INFO: renamed from: N0 */
    public boolean f42412N0 = false;

    /* JADX INFO: renamed from: U0 */
    public h80<C11453d> f42426U0 = new C11450a();

    /* JADX INFO: renamed from: V0 */
    public C11451b f42428V0 = null;

    /* JADX INFO: renamed from: W0 */
    public List<String> f42430W0 = new ArrayList();

    /* JADX INFO: renamed from: X0 */
    public TextView[] f42432X0 = new TextView[4];

    /* JADX INFO: renamed from: Y0 */
    public VImage[] f42434Y0 = new VImage[1];

    /* JADX INFO: renamed from: Z0 */
    public TextView[] f42436Z0 = new TextView[4];

    /* JADX INFO: renamed from: a1 */
    public ImageView[] f42437a1 = new ImageView[4];

    /* JADX INFO: renamed from: b1 */
    public int f42438b1 = 0;

    /* JADX INFO: renamed from: e1 */
    public v370 f42441e1 = new v370();

    /* JADX INFO: renamed from: f1 */
    public boolean f42442f1 = false;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$a */
    public class C11450a extends h80<C11453d> {
        public C11450a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(C11453d c11453d, int i) {
            if (i == 1) {
                i4g0.m138526x("e_tantan_topic", NewPhotoAlbumFrag.this.m65374L6());
            } else if (NullChecker.m82486a(c11453d.f42459c)) {
                i4g0.m138528z(c11453d.f42457a, c11453d.f42458b, c11453d.f42459c);
            } else {
                i4g0.m138526x(c11453d.f42457a, c11453d.f42458b);
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(C11453d c11453d, int i, long j) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$b */
    public class C11451b extends FragmentPagerAdapter implements ViewPager.InterfaceC0718j, w0m {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f42452a;

        /* JADX INFO: renamed from: b */
        public Method f42453b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f42454c;

        public C11451b(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f42452a = new ArrayList();
            this.f42453b = null;
            this.f42454c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f42453b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.m82479c(e);
                this.f42453b = null;
            } catch (SecurityException e2) {
                CrashHelper.m82479c(e2);
                this.f42453b = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public /* synthetic */ void m65529p(int i, TextView textView, VImage vImage, View view) {
            if (NewPhotoAlbumFrag.this.f42438b1 == i && (TextUtils.equals(pu20.m173822q(), textView.getText().toString()) || TextUtils.equals(pu20.m173813h(), textView.getText().toString()))) {
                boolean zEquals = TextUtils.equals(vImage.getTag().toString(), NewPhotoAlbumFrag.this.f42445i1);
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                if (zEquals) {
                    vImage.setTag(newPhotoAlbumFrag.f42446j1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(lbc0.f130863I0));
                } else {
                    vImage.setTag(newPhotoAlbumFrag.f42445i1);
                    vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(lbc0.f130871J0));
                }
                NewPhotoAlbumFrag.this.m65478Q7(view);
            }
            if (NewPhotoAlbumFrag.this.f42438b1 != i) {
                VNavigationTabLayout vNavigationTabLayout = NewPhotoAlbumFrag.this.f42397G;
                vNavigationTabLayout.m224844D(vNavigationTabLayout.m224873w(i));
            }
            NewPhotoAlbumFrag.this.m65516u6();
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator mo65012a(int i, @NonNull @NotNull View view) {
            return w0m.f186614l0.call(view);
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator mo65013b(int i, @NonNull @NotNull View view) {
            return w0m.f186614l0.call(view);
        }

        @Override // p153l.w0m
        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> mo65014g(int i) {
            return null;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f42452a.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f42452a.get(i);
        }

        @Override // p153l.cf60
        public CharSequence getPageTitle(int i) {
            return (CharSequence) NewPhotoAlbumFrag.this.f42430W0.get(i);
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            try {
                if (NullChecker.m82486a(this.f42454c)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("pagerFragmentManager.getFragments() :" + this.f42454c.m2590t0());
                    sb.append(Constants.PACKNAME_END);
                    sb.append("lstFrag :" + this.f42452a);
                    tu2.m192703a("[feed][crash]", sb.toString());
                }
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: m */
        public Fragment m65530m(int i) {
            Fragment fragmentM2558i0;
            Method method = this.f42453b;
            if (method == null) {
                return getItem(i);
            }
            try {
                fragmentM2558i0 = NewPhotoAlbumFrag.this.getChildFragmentManager().m2558i0((String) method.invoke(this, Integer.valueOf(NewPhotoAlbumFrag.this.f42389A.getId()), Long.valueOf(getItemId(i))));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
                fragmentM2558i0 = null;
            } catch (InvocationTargetException e2) {
                CrashHelper.m82479c(e2);
                fragmentM2558i0 = null;
            }
            return fragmentM2558i0 == null ? getItem(i) : fragmentM2558i0;
        }

        /* JADX INFO: renamed from: n */
        public View m65531n(final int i) {
            View viewInflate = NewPhotoAlbumFrag.this.act().inflater().inflate(tec0.f173788x5, (ViewGroup) null);
            final VImage vImage = (VImage) viewInflate.findViewById(hdc0.f108826D0);
            vImage.setBackgroundDrawable(NewPhotoAlbumFrag.this.getResources().getDrawable(lbc0.f130871J0));
            vImage.setTag(NewPhotoAlbumFrag.this.f42445i1);
            if (!cmg.m111235t() && i == 0) {
                NewPhotoAlbumFrag.this.f42434Y0[0] = vImage;
            }
            final TextView textView = (TextView) viewInflate.findViewById(hdc0.f108909d2);
            TextView textView2 = (TextView) viewInflate.findViewById(hdc0.f108913e2);
            NewPhotoAlbumFrag.this.f42432X0[i] = textView;
            NewPhotoAlbumFrag.this.f42436Z0[i] = textView2;
            NewPhotoAlbumFrag.this.f42437a1[i] = (ImageView) viewInflate.findViewById(hdc0.f108978y0);
            textView.setText((CharSequence) NewPhotoAlbumFrag.this.f42430W0.get(i));
            if (cmg.m111235t()) {
                return viewInflate;
            }
            bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.v940
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f182951a.m65529p(i, textView, vImage, view);
                }
            });
            return viewInflate;
        }

        /* JADX INFO: renamed from: o */
        public final void m65532o() {
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f42397G.m224873w(0).f210794i;
            if (!cmg.m111235t()) {
                tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), qa00.m175859d(15.0f), tabView.getPaddingBottom());
                NewPhotoAlbumFrag.this.f42434Y0[0].setVisibility(0);
            }
            FeedModule.f39703d.m145587Pb().mo144668c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f42432X0[0]);
            FeedModule.f39703d.m145587Pb().mo144678m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f42432X0[1]);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (cmg.m111238u0()) {
                b5i.m102594m().m102600l();
            }
            FeedModule.f39703d.m145540J6();
            Fragment fragmentM65530m = NewPhotoAlbumFrag.this.f42428V0.m65530m(i);
            if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
                if (((PhotoAlbumFeedFrag) fragmentM65530m).m65551Q4()) {
                    FeedModule.m61406H().mo31782jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m61406H().mo31720Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
                if (((FriendsFeedContainerFrag) fragmentM65530m).m65257R4()) {
                    FeedModule.m61406H().mo31782jg(NewPhotoAlbumFrag.this.act(), false);
                } else {
                    FeedModule.m61406H().mo31720Pq(NewPhotoAlbumFrag.this.act(), false);
                }
            } else if ((fragmentM65530m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM65530m).m65310B5()) {
                FeedModule.m61406H().mo31782jg(NewPhotoAlbumFrag.this.act(), false);
            } else {
                FeedModule.m61406H().mo31720Pq(NewPhotoAlbumFrag.this.act(), false);
            }
            NewPhotoAlbumFrag.this.m65387P7();
            NewPhotoAlbumFrag.this.m65410X7();
            NewPhotoAlbumFrag.this.m65386P6();
            if (pu20.m173823r().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag.m65503m6(newPhotoAlbumFrag.f42413O);
                NewPhotoAlbumFrag.this.m65473L7(fragmentM65530m);
            } else if (cmg.m111235t()) {
                if (pu20.m173821p().equals(NewPhotoAlbumFrag.this.m65467G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag2 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag2.m65503m6(newPhotoAlbumFrag2.f42411N);
                    NewPhotoAlbumFrag.this.m65473L7(fragmentM65530m);
                } else if (pu20.m173813h().equals(NewPhotoAlbumFrag.this.m65467G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag3 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag3.m65503m6(newPhotoAlbumFrag3.f42415P);
                } else if (pu20.m173814i().equals(NewPhotoAlbumFrag.this.m65467G6())) {
                    NewPhotoAlbumFrag newPhotoAlbumFrag4 = NewPhotoAlbumFrag.this;
                    newPhotoAlbumFrag4.m65503m6(newPhotoAlbumFrag4.f42417Q);
                }
            } else if (pu20.m173822q().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag5 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag5.m65503m6(newPhotoAlbumFrag5.f42411N);
            } else if (pu20.m173813h().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag6 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag6.m65503m6(newPhotoAlbumFrag6.f42415P);
            } else if (pu20.m173814i().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(i))) {
                NewPhotoAlbumFrag newPhotoAlbumFrag7 = NewPhotoAlbumFrag.this;
                newPhotoAlbumFrag7.m65503m6(newPhotoAlbumFrag7.f42417Q);
            }
            if (NewPhotoAlbumFrag.this.f42398G0) {
                NewPhotoAlbumFrag.this.f42398G0 = false;
            } else {
                if (pu20.m173822q().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(NewPhotoAlbumFrag.this.f42438b1))) {
                    NewPhotoAlbumFrag.this.f42411N.m152772g();
                } else if (pu20.m173813h().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(NewPhotoAlbumFrag.this.f42438b1))) {
                    NewPhotoAlbumFrag.this.f42415P.m152772g();
                } else if (pu20.m173814i().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(NewPhotoAlbumFrag.this.f42438b1))) {
                    NewPhotoAlbumFrag.this.f42417Q.m152772g();
                } else if (pu20.m173823r().equals(NewPhotoAlbumFrag.this.f42428V0.getPageTitle(NewPhotoAlbumFrag.this.f42438b1))) {
                    NewPhotoAlbumFrag.this.f42413O.m152772g();
                }
                NewPhotoAlbumFrag.this.f42423T.m152783r();
            }
            NewPhotoAlbumFrag.this.f42438b1 = i;
            NewPhotoAlbumFrag newPhotoAlbumFrag8 = NewPhotoAlbumFrag.this;
            newPhotoAlbumFrag8.f42407L.setPageId(newPhotoAlbumFrag8.m65462B6());
            PhotoAlbumPictureView.m65042u(NewPhotoAlbumFrag.this.act().getWindow().getDecorView(), false);
            int i2 = 0;
            while (true) {
                if (i2 >= this.f42452a.size()) {
                    break;
                }
                Fragment fragmentM65530m2 = m65530m(i2);
                if (fragmentM65530m2 instanceof PhotoAlbumFeedFrag) {
                    PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragmentM65530m2;
                    photoAlbumFeedFrag.m65567h5(i2 == i);
                    photoAlbumFeedFrag.m65566g5(i2 == i);
                    if (i2 == i) {
                        photoAlbumFeedFrag.m65560Z4();
                    }
                } else if (fragmentM65530m2 instanceof FriendsFeedContainerFrag) {
                    FriendsFeedContainerFrag friendsFeedContainerFrag = (FriendsFeedContainerFrag) fragmentM65530m2;
                    friendsFeedContainerFrag.m65266a5(i2 == i);
                    friendsFeedContainerFrag.m65265Z4(i2 == i);
                    if (i2 == i) {
                        friendsFeedContainerFrag.m65262W4();
                    }
                } else if (fragmentM65530m2 instanceof FriendsFeedViewPagerFrag) {
                    FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragmentM65530m2;
                    friendsFeedViewPagerFrag.m65329d6(i2 == i);
                    friendsFeedViewPagerFrag.m65328c6(i2 == i);
                    if (i2 == i) {
                        friendsFeedViewPagerFrag.m65322W5();
                    }
                }
                i2++;
            }
            NewPhotoAlbumFrag.this.act().hideInput();
            if (i == 1) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
            }
            NewPhotoAlbumFrag.this.m65516u6();
        }

        /* JADX INFO: renamed from: q */
        public void m65533q() {
            if (this.f42454c == null) {
                return;
            }
            Iterator<PutongFrag> it = this.f42452a.iterator();
            while (it.hasNext()) {
                this.f42454c.m2568m().mo2716r(it.next()).mo2709j();
            }
        }

        /* JADX INFO: renamed from: r */
        public void m65534r(List<PutongFrag> list) {
            NewPhotoAlbumFrag.this.f42414O0 = list;
            this.f42452a.clear();
            if (NullChecker.m82487b(list)) {
                this.f42452a.addAll(list);
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$c */
    public class C11452c implements VNavigationTabLayout.InterfaceC22736d {
        public C11452c() {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: a */
        public void mo65022a(VNavigationTabLayout.C22738f c22738f) {
            FeedModule.f39703d.m145587Pb().mo144678m(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f42432X0[c22738f.m224933f()]);
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: b */
        public void mo65023b(VNavigationTabLayout.C22738f c22738f) {
        }

        @Override // p151v.navigationbar.VNavigationTabLayout.InterfaceC22735c
        /* JADX INFO: renamed from: c */
        public void mo65024c(VNavigationTabLayout.C22738f c22738f) {
            int iM224933f = c22738f.m224933f();
            VNavigationTabLayout.TabView tabView = NewPhotoAlbumFrag.this.f42397G.m224873w(0).f210794i;
            if (!cmg.m111235t()) {
                if (iM224933f == 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), qa00.m175859d(15.0f), tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f42434Y0[0].setVisibility(0);
                } else if (NewPhotoAlbumFrag.this.f42434Y0 != null && NewPhotoAlbumFrag.this.f42434Y0.length > 0) {
                    tabView.setPadding(tabView.getPaddingLeft(), tabView.getPaddingTop(), 0, tabView.getPaddingBottom());
                    NewPhotoAlbumFrag.this.f42434Y0[0].setVisibility(8);
                }
            }
            FeedModule.f39703d.m145587Pb().mo144668c(NewPhotoAlbumFrag.this.act(), NewPhotoAlbumFrag.this.f42432X0[iM224933f]);
            if (cmg.m111235t() && iM224933f == 0) {
                if (pu20.m173813h().equals(NewPhotoAlbumFrag.this.m65467G6()) && iM224933f != NewPhotoAlbumFrag.this.f42438b1 && !cmg.m111183K()) {
                    NewPhotoAlbumFrag.this.mo64968g2();
                    byh.m106997d().m107008l(17);
                }
                if (pu20.m173821p().equals(NewPhotoAlbumFrag.this.m65467G6())) {
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f42410M0) {
                        NewPhotoAlbumFrag.this.m65457x6();
                    } else if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f42412N0) {
                        NewPhotoAlbumFrag.this.m65521y6();
                    }
                    byh.m106997d().m107008l(16);
                }
            } else if (!cmg.m111235t()) {
                if (pu20.m173813h().equals(NewPhotoAlbumFrag.this.f42432X0[iM224933f].getText().toString()) && iM224933f != NewPhotoAlbumFrag.this.f42438b1) {
                    byh.m106997d().m107008l(17);
                }
                if (pu20.m173822q().equals(NewPhotoAlbumFrag.this.f42432X0[iM224933f].getText().toString())) {
                    NewPhotoAlbumFrag.this.mo64968g2();
                    if (NewPhotoAlbumFrag.this.isResumed() && NewPhotoAlbumFrag.this.f42410M0) {
                        NewPhotoAlbumFrag.this.m65457x6();
                    }
                    byh.m106997d().m107008l(16);
                }
            }
            if (!pu20.m173823r().equals(NewPhotoAlbumFrag.this.f42432X0[iM224933f].getText().toString()) || iM224933f == NewPhotoAlbumFrag.this.f42438b1) {
                return;
            }
            byh.m106997d().m107008l(18);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$e */
    public class C11454e {

        /* JADX INFO: renamed from: a */
        public int f42461a;

        /* JADX INFO: renamed from: b */
        public int f42462b;

        /* JADX INFO: renamed from: c */
        public int f42463c;

        /* JADX INFO: renamed from: d */
        public int f42464d;

        /* JADX INFO: renamed from: e */
        public boolean f42465e;

        /* JADX INFO: renamed from: f */
        public boolean f42466f;

        /* JADX INFO: renamed from: g */
        public boolean f42467g;

        public C11454e(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.f42462b = i;
            this.f42461a = i2;
            this.f42463c = i3;
            this.f42464d = i4;
            this.f42465e = z;
            this.f42466f = z2;
            this.f42467g = z3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11454e)) {
                return false;
            }
            C11454e c11454e = (C11454e) obj;
            return this.f42465e == c11454e.f42465e && this.f42461a == c11454e.f42461a && this.f42462b == c11454e.f42462b && this.f42463c == c11454e.f42463c && this.f42466f == c11454e.f42466f && this.f42467g == c11454e.f42467g;
        }

        public int hashCode() {
            int iHashCode = Integer.valueOf(this.f42461a).hashCode();
            int iHashCode2 = Integer.valueOf(this.f42463c).hashCode();
            int iHashCode3 = Boolean.valueOf(this.f42465e).hashCode();
            int iHashCode4 = Boolean.valueOf(this.f42466f).hashCode();
            return (Boolean.valueOf(this.f42467g).hashCode() >> 1) ^ ((((iHashCode >> 1) ^ iHashCode2) ^ iHashCode3) ^ (iHashCode4 >> 1));
        }

        public String toString() {
            return "unreadLikeFeeds:" + this.f42462b + "\nunreadFeeds:" + this.f42461a + "\nunreadActivities:" + this.f42463c + "\nisShowFixTimeDot:" + this.f42465e + "\nisShowTopicDot:" + this.f42466f + "\nisHideRedByNewUser:" + this.f42467g + SignParameters.NEW_LINE;
        }
    }

    static {
        f42384l1 = cmg.m111171B() ? pu20.m173817l() : 7200000L;
        f42385m1 = true;
        f42386n1 = new byd0("last_like_show_red_dot_time_" + FeedModule.m61405F().userId(), 0L);
        f42387o1 = new vxd0("like_show_red_dot_count_" + FeedModule.m61405F().userId(), 0);
        f42388p1 = C22507a.m222758b();
    }

    public NewPhotoAlbumFrag() {
        if (NullChecker.m82487b(FeedModule.f39703d)) {
            pm80.m172919b().m172920a();
            if (cmg.m111220l0()) {
                FeedModule.f39703d.m145567Mc();
            }
        }
        this.f42443g1 = new Runnable() { // from class: l.m840
            @Override // java.lang.Runnable
            public final void run() {
                this.f135148a.m65465E7();
            }
        };
        this.f42445i1 = "feed_dating_menu_icon_default";
        this.f42446j1 = "feed_dating_menu_icon";
        this.f42448k1 = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m65353A7(View view, String str, String str2, pf60[] pf60VarArr) {
        this.f42426U0.m133881h(view, new C11453d(str, str2, i4g0.m138504b(pf60VarArr)), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m65355B7(View view) {
        m65422b7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C7 */
    public /* synthetic */ void m65357C7(View view) {
        String strM65470I6 = m65470I6();
        int i = this.f42433Y;
        tfj0.m190939b("e_moment_unread_notes_history", strM65470I6, tfj0.C20302a.m190949g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
        act().startActivity(PhotoAlbumActivitiesAct.m66154X1(act(), "activities", true, false, false));
    }

    /* JADX INFO: renamed from: D6 */
    private int m65359D6() {
        List<String> list = this.f42430W0;
        if (list != null) {
            return list.indexOf(pu20.m173822q());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D7 */
    public /* synthetic */ void m65360D7(Intent intent) {
        act().startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: F6 */
    private int m65363F6() {
        List<String> list = this.f42430W0;
        if (list != null) {
            return list.indexOf(getString(R$string.f39920h5));
        }
        return 0;
    }

    /* JADX INFO: renamed from: H6 */
    private int m65366H6() {
        if (this.f42442f1) {
            this.f42442f1 = false;
            return 0;
        }
        String strM173816k = pu20.m173816k();
        if (TextUtils.equals(strM173816k, pu20.m173814i())) {
            return 0;
        }
        return this.f42430W0.indexOf(strM173816k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I7, reason: merged with bridge method [inline-methods] */
    public void m65495h7(int i) {
        this.f42436Z0[i].setVisibility(8);
        this.f42437a1[i].setVisibility(8);
    }

    /* JADX INFO: renamed from: K6 */
    private int m65371K6() {
        if (!NullChecker.m82487b(this.f42397G)) {
            return 16;
        }
        int selectedTabPosition = this.f42397G.getSelectedTabPosition();
        if (selectedTabPosition == 0) {
            return pu20.m173822q().equals(this.f42428V0.getPageTitle(selectedTabPosition)) ? 16 : 17;
        }
        return 18;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K7, reason: merged with bridge method [inline-methods] */
    public void m65494g7(int i) {
        this.f42436Z0[i].setVisibility(8);
        this.f42437a1[i].setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public String m65374L6() {
        if (!NullChecker.m82487b(this.f42397G)) {
            return "p_discover_dating";
        }
        int selectedTabPosition = this.f42397G.getSelectedTabPosition();
        if (selectedTabPosition != 0) {
            return "p_discover_discussion";
        }
        if (cmg.m111235t()) {
            return m65467G6().equals(getString(R$string.f39920h5)) ? "p_follow" : "p_discover_dating";
        }
        return pu20.m173822q().equals(this.f42428V0.getPageTitle(selectedTabPosition)) ? "p_discover_dating" : "p_follow";
    }

    /* JADX INFO: renamed from: M4 */
    public static /* synthetic */ void m65375M4() {
    }

    @NotNull
    /* JADX INFO: renamed from: M6 */
    private String m65377M6() {
        return pu20.m173813h().equals(this.f42428V0.getPageTitle(this.f42389A.getCurrentItem())) ? "follow" : "other";
    }

    /* JADX INFO: renamed from: M7 */
    private void m65378M7() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65530m).m65561a5();
        } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM65530m).m65263X4();
        } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM65530m).m65324Y5();
        }
    }

    /* JADX INFO: renamed from: O6 */
    private void m65383O6() {
        if (m65413Y6()) {
            C4499d.m21895l().m21899k(this.f42408L0);
            this.f42408L0 = null;
        }
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m65384P4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public void m65386P6() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65530m).m65556V4();
        } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM65530m).m65258S4();
        } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM65530m).m65312G5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P7 */
    public void m65387P7() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65530m).m65562b5();
        } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM65530m).m65264Y4();
        } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM65530m).m65325Z5();
        }
    }

    /* JADX INFO: renamed from: R4 */
    public static /* synthetic */ void m65390R4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m65394S6() {
        if (cmg.m111183K()) {
            duringCreated(f42388p1).subscribe(psd0.m173596G(new y20() { // from class: l.t940
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172608a.m65519w7((Boolean) obj);
                }
            }));
        }
        duringCreated(new pcj() { // from class: l.l840
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f130413a.m65520x7();
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.n840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140649a.m65499j7((NewPhotoAlbumFrag.C11454e) obj);
            }
        }, new y20() { // from class: l.o840
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m65390R4((Throwable) obj);
            }
        }));
        duringCreated(FeedModule.f39703d.m145513F7()).filter(new qcj() { // from class: l.p840
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Double) obj).doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
            }
        }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.q840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156076a.m65501k7((Double) obj);
            }
        }));
        duringCreated(cn40.m111354F()).subscribe(psd0.m173596G(new y20() { // from class: l.r840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161663a.m65502l7((Moment) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.s840
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166740a.m65504m7((C4470c) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.t840
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.TRUE);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.u840
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.u940
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178098a.m65505n7((C4470c) obj);
            }
        }));
        if (kl40.m150348f()) {
            creates(new y20() { // from class: l.c840
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80180a.m65507o7((Bundle) obj);
                }
            });
        }
        duringCreated(orb0.m168899p()).subscribe(psd0.m173596G(new y20() { // from class: l.d840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85578a.m65509p7((Boolean) obj);
            }
        }));
        duringCreated(C11408a.m63899c1()).subscribe(psd0.m173596G(new y20() { // from class: l.e840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92508a.m65510q7((String) obj);
            }
        }));
        if (this.f42435Z) {
            creates(new y20() { // from class: l.f840
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97700a.m65515t7((Bundle) obj);
                }
            });
            duringCreated(this.f42449p0).subscribe(psd0.m173597H(new y20() { // from class: l.g840
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102645a.m65517u7((Long) obj);
                }
            }, new y20() { // from class: l.h840
                @Override // p153l.y20
                public final void call(Object obj) {
                    NewPhotoAlbumFrag.m65420b5((Throwable) obj);
                }
            }));
        }
        act().lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.i840
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m65415Z4((C4470c) obj);
            }
        }));
        duringCreated(pu20.f154137b).subscribe(psd0.m173597H(new y20() { // from class: l.j840
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118750a.m65518v7((uxj0) obj);
            }
        }, new y20() { // from class: l.k840
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m65454w5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T6 */
    private void m65397T6(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: l.h940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f108316a.m65522y7(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.j940
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.f118846a.m65523z7(view2);
            }
        });
    }

    /* JADX INFO: renamed from: T7 */
    private boolean m65398T7() {
        long jLongValue = FeedModule.f39703d.m145837z7().longValue();
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(11);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar.get(1), calendar.get(2), calendar.get(5), 4, 0, 0);
        return i >= 4 && jLongValue < calendar2.getTimeInMillis();
    }

    /* JADX INFO: renamed from: U6 */
    private void m65401U6() {
        this.f42399H = new VFrame(getContext());
        this.f42403J = new VFrame(getContext());
        VText vText = new VText(getContext());
        this.f42401I = vText;
        this.f42399H.addView(vText, new FrameLayout.LayoutParams(-2, qa00.m175859d(34.0f)));
        this.f42401I.setText(R$string.f39747G1);
        this.f42401I.setTextSize(14.0f);
        this.f42401I.setTextColor(-1);
        this.f42401I.setTypeface(lyh0.m156283c(3), 1);
        this.f42401I.setPadding(qa00.m175859d(12.0f), 0, qa00.m175859d(12.0f), 0);
        this.f42401I.setBackgroundResource(lbc0.f131124q5);
        this.f42401I.setGravity(16);
        VImage vImage = new VImage(getContext());
        this.f42405K = vImage;
        this.f42403J.addView(vImage, new FrameLayout.LayoutParams(qa00.m175859d(32.0f), qa00.m175859d(32.0f)));
        this.f42405K.setImageResource(lbc0.f131130r3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(12.0f), qa00.m175859d(12.0f));
        layoutParams.gravity = 53;
        layoutParams.rightMargin = -qa00.m175859d(2.0f);
        layoutParams.topMargin = -qa00.m175859d(2.0f);
        FeedRedDotView feedRedDotView = new FeedRedDotView(getContext());
        this.f42407L = feedRedDotView;
        this.f42403J.addView(feedRedDotView, layoutParams);
        this.f42407L.setOvalColor(getResources().getColor(k9c0.f124523o));
        this.f42407L.setWidth(qa00.m175859d(12.0f));
        this.f42407L.setRingWidth(qa00.m175859d(2.0f));
        this.f42407L.setRingColor(getResources().getColor(k9c0.f124526p0));
        this.f42407L.setRedPointType(2);
        this.f42407L.setPageId(m65462B6());
        this.f42407L.m66240o();
        bnl0.m105524M(this.f42407L, false);
        bnl0.m105524M(this.f42392D, true);
    }

    /* JADX INFO: renamed from: W6 */
    private boolean m65406W6() {
        return ksg.m151211j0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W7, reason: merged with bridge method [inline-methods] */
    public void m65465E7() {
        if (isHidden() || rkh.m181858b()) {
            return;
        }
        pu20.f154140e.put(Long.valueOf(System.currentTimeMillis()));
        if (!j4h.m143418b() || pk50.m172568j().m172574f().m181649M("p_alert_positioning_authority_explore_popup", true)) {
            if (j4h.m143418b()) {
                pk50.m172568j().m172574f().m181664b0("p_alert_positioning_authority_explore_popup", 0, true);
            }
            FeedModule.m61406H().showLocationPermissionCallbackDlg(act(), new x20() { // from class: l.c940
                @Override // p153l.x20
                public final void call() {
                    this.f80293a.m65468G7();
                }
            }, null, false, true, "p_alert_positioning_authority_explore_popup");
        }
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m65408X4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X7 */
    public void m65410X7() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM65530m).m65267b5();
        } else if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65530m).m65570m5();
        } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM65530m).m65330e6();
        }
    }

    /* JADX INFO: renamed from: Y6 */
    private boolean m65413Y6() {
        return !TextUtils.isEmpty(this.f42408L0);
    }

    /* JADX INFO: renamed from: Y7 */
    private void m65414Y7() {
        String strM65470I6 = m65470I6();
        int i = this.f42433Y;
        tfj0.m190941d("e_moment_unread_notes_history", strM65470I6, tfj0.C20302a.m190949g("moment_unread_red_dot_value", i > 99 ? "99+" : String.valueOf(i)));
    }

    /* JADX INFO: renamed from: Z4 */
    public static /* synthetic */ void m65415Z4(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            FeedModule.f39706g.m145955c();
            t8c.m189652e().m189658g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z7, reason: merged with bridge method [inline-methods] */
    public C22421c<C11454e> m65520x7() {
        FeedModule.f39703d.m145651Yc("");
        return psd0.m173627t(mrb0.m159656j(), C22421c.just(Boolean.FALSE), FeedModule.f39703d.m145513F7(), FeedModule.m61406H().isHideRedByNewUser(), new tcj() { // from class: l.g940
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f102755a.m65469H7((Counter) obj, (Boolean) obj2, (Double) obj3, (Boolean) obj4);
            }
        });
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m65420b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b7 */
    private void m65422b7() {
        ksg.m151173J0(act());
        this.f42407L.m66239k();
        i4g0.m138520r("e_tantan_topic", m65374L6());
        bnl0.m105524M(this.f42407L, false);
        FeedModule.f39703d.m145812vd();
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m65437k5(Act.C4450r c4450r) {
        if (NullChecker.m82486a(c4450r)) {
            FeedModule.f39701b.m61675I2();
        }
    }

    /* JADX INFO: renamed from: l6 */
    private boolean m65439l6(int i) {
        if (i < 10) {
            return false;
        }
        return pu20.f154139d.get().longValue() == 0 || !p6i.m170897f(pu20.f154139d.get().longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: n6 */
    private void m65442n6(boolean z) {
        C11451b c11451b;
        if (z || (c11451b = this.f42428V0) == null) {
            FeedModule.m61406H().mo31720Pq(act(), false);
            return;
        }
        Fragment fragmentM65530m = c11451b.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            if (((PhotoAlbumFeedFrag) fragmentM65530m).m65551Q4()) {
                FeedModule.m61406H().mo31782jg(act(), false);
                return;
            }
        } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            if (((FriendsFeedContainerFrag) fragmentM65530m).m65257R4()) {
                FeedModule.m61406H().mo31782jg(act(), false);
                return;
            }
        } else if ((fragmentM65530m instanceof FriendsFeedViewPagerFrag) && ((FriendsFeedViewPagerFrag) fragmentM65530m).m65310B5()) {
            FeedModule.m61406H().mo31782jg(act(), false);
            return;
        }
        FeedModule.m61406H().mo31720Pq(act(), false);
    }

    /* JADX INFO: renamed from: q6 */
    private boolean m65446q6() {
        this.f42410M0 = true;
        l51.m152890J(this.f42443g1);
        if (this.f42438b1 == m65359D6()) {
            return m65457x6();
        }
        return false;
    }

    /* JADX INFO: renamed from: r6 */
    private void m65448r6(final int i) {
        if (m65359D6() >= 0 || m65363F6() >= 0) {
            if (NullChecker.m82486a(this.f42424T0)) {
                this.f42424T0.duringCreated(lifecycle()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.q940
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f156192a.m65493f7(i, (C4470c) obj);
                    }
                }));
            }
            final int i2 = 0;
            boolean z = this.f42437a1[0].getVisibility() == 0;
            ayh ayhVar = new ayh(i > 0, new x20() { // from class: l.r940
                @Override // p153l.x20
                public final void call() {
                    this.f161791a.m65494g7(i2);
                }
            });
            ayhVar.m100875b(new ayh(true, new x20() { // from class: l.s940
                @Override // p153l.x20
                public final void call() {
                    this.f166899a.m65495h7(i2);
                }
            }));
            ayhVar.m100874a();
            m65455w6(bnl0.m105529O0(this.f42437a1[0]) ? this.f42437a1[0] : this.f42436Z0[0], z, this.f42437a1[0].getVisibility() == 0, m65371K6(), m65471J6());
        }
    }

    /* JADX INFO: renamed from: v6 */
    private void m65453v6() {
        if (cmg.m111220l0()) {
            Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
            if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
                ((PhotoAlbumFeedFrag) fragmentM65530m).m65550P4();
            } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) fragmentM65530m).m65255P4();
            } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) fragmentM65530m).m65338s5();
            }
        }
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m65454w5(Throwable th) {
    }

    /* JADX INFO: renamed from: w6 */
    private void m65455w6(View view, boolean z, boolean z2, int i, String str) {
        if (z ^ z2) {
            if (z) {
                byh.m106997d().m107015s(Integer.valueOf(i));
            } else {
                byh.m106997d().m107012p(false, view, i, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public boolean m65457x6() {
        this.f42410M0 = false;
        if (System.currentTimeMillis() - pu20.f154140e.get().longValue() < 172800000 || rkh.m181860d()) {
            return false;
        }
        l51.m152889I(this, this.f42443g1, 100L);
        return true;
    }

    /* JADX INFO: renamed from: z6 */
    private void m65460z6(View view, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        if ((z2 ^ z) || z4) {
            if (!z || z4) {
                this.f42402I0 = byh.m106997d().m107007k(view, i, z3, z4, m65374L6(), m65481S7());
            } else {
                byh.m106997d().m107015s(1);
            }
        }
    }

    /* JADX INFO: renamed from: A6 */
    public final void m65461A6() {
        m65414Y7();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: B6 */
    public String m65462B6() {
        if (!cmg.m111235t()) {
            if (pu20.m173827v()) {
                return (NullChecker.m82486a(this.f42432X0[0]) && this.f42432X0[0].getText().equals(getString(R$string.f39920h5))) ? "p_follow" : "p_discover_dating";
            }
            return "p_discover_discussion";
        }
        if (!pu20.m173827v()) {
            return "p_discover_discussion";
        }
        if (m65467G6().equals(getString(R$string.f39920h5))) {
            return "p_follow";
        }
        return m65467G6().equals(pu20.m173814i()) ? "p_like" : "p_discover_dating";
    }

    /* JADX INFO: renamed from: C6 */
    public String m65463C6() {
        l4g0 l4g0Var = this.f42423T;
        if (l4g0Var == this.f42415P) {
            return "p_follow";
        }
        if (l4g0Var == this.f42417Q) {
            return "p_like";
        }
        if (l4g0Var == this.f42413O) {
            return "p_discover_discussion";
        }
        if (l4g0Var == this.f42411N) {
            return "p_discover_dating";
        }
        if (l4g0Var == this.f42419R) {
            return pu20.m173808c(0);
        }
        return l4g0Var == this.f42421S ? pu20.m173808c(1) : "";
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11578b
    /* JADX INFO: renamed from: E0 */
    public void mo64927E0() {
        l51.m152890J(this.f42443g1);
    }

    /* JADX INFO: renamed from: E6 */
    public int m65464E6(int i) {
        if (i == 14 || i == 0 || i == 17 || i == 18) {
            return 0;
        }
        return i == 15 ? 1 : -1;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m65466F7() {
        boolean zEquals = TextUtils.equals(this.f42434Y0[0].getTag().toString(), this.f42445i1);
        VImage[] vImageArr = this.f42434Y0;
        if (zEquals) {
            vImageArr[0].setTag(this.f42446j1);
            this.f42434Y0[0].setBackgroundDrawable(getResources().getDrawable(lbc0.f130863I0));
        } else {
            vImageArr[0].setTag(this.f42445i1);
            this.f42434Y0[0].setBackgroundDrawable(getResources().getDrawable(lbc0.f130871J0));
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final String m65467G6() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f42424T0;
        return friendsFeedViewPagerFrag == null ? pu20.m173821p() : friendsFeedViewPagerFrag.m65342x5().toString();
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ C11454e m65469H7(Counter counter, Boolean bool, Double d, Boolean bool2) {
        int i = ksg.m151212k() ? counter.moments.unreadLikeFeeds : 0;
        int i2 = counter.moments.unreadFeeds;
        CounterActivities counterActivities = counter.activities;
        return new C11454e(i, i2, counterActivities.unread, counterActivities.unreadPicks, bool.booleanValue(), d.doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, bool2.booleanValue());
    }

    /* JADX INFO: renamed from: I6 */
    public final String m65470I6() {
        return (cmg.m111183K() && TextUtils.equals(pu20.m173816k(), pu20.m173814i())) ? "p_like" : m65462B6();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: J4 */
    public l4g0 mo30636J4() {
        return NullChecker.m82486a(this.f42423T) ? this.f42423T : super.mo30636J4();
    }

    /* JADX INFO: renamed from: J6 */
    public final String m65471J6() {
        if (NullChecker.m82487b(this.f42397G)) {
            this.f42397G.getSelectedTabPosition();
        }
        return null;
    }

    /* JADX INFO: renamed from: J7, reason: merged with bridge method [inline-methods] */
    public void m65468G7() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) fragmentM65530m).m65559Y4();
        } else if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            ((FriendsFeedContainerFrag) fragmentM65530m).m65261V4();
        } else if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            ((FriendsFeedViewPagerFrag) fragmentM65530m).m65320T5();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final void m65473L7(Fragment fragment) {
        n570 n570Var;
        if (cmg.m111171B()) {
            if (fragment instanceof PhotoAlbumFeedFrag) {
                PhotoAlbumFeedFrag photoAlbumFeedFrag = (PhotoAlbumFeedFrag) fragment;
                n570 n570Var2 = photoAlbumFeedFrag.m65553S4().f120405j;
                if (n570Var2 == null) {
                    return;
                }
                long j = n570Var2.f140314a;
                if (j <= 0 || System.currentTimeMillis() - j <= pu20.m173817l()) {
                    return;
                }
                photoAlbumFeedFrag.m65559Y4();
                return;
            }
            if ((fragment instanceof FriendsFeedViewPagerFrag) && pu20.m173821p().equals(m65467G6())) {
                FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = (FriendsFeedViewPagerFrag) fragment;
                PhotoAlbumFeedFrag photoAlbumFeedFragM65309A5 = friendsFeedViewPagerFrag.m65309A5();
                if (!NullChecker.m82486a(photoAlbumFeedFragM65309A5) || (n570Var = photoAlbumFeedFragM65309A5.m65553S4().f120405j) == null) {
                    return;
                }
                long j2 = n570Var.f140314a;
                if (j2 <= 0 || System.currentTimeMillis() - j2 <= pu20.m173817l()) {
                    return;
                }
                friendsFeedViewPagerFrag.m65309A5().m65559Y4();
            }
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final int m65474N6(C11454e c11454e) {
        int i;
        if (cmg.m111183K()) {
            return c11454e.f42462b;
        }
        int i2 = c11454e.f42461a;
        return (i2 != 0 || (i = this.f42406K0) <= 0) ? i2 : i;
    }

    /* JADX INFO: renamed from: N7 */
    public final void m65475N7() {
        if (cmg.m111235t()) {
            if (this.f42424T0.m65310B5()) {
                FeedModule.m61406H().mo31782jg(act(), false);
                return;
            } else {
                FeedModule.m61406H().mo31720Pq(act(), false);
                return;
            }
        }
        if (this.f42422S0.m65257R4()) {
            FeedModule.m61406H().mo31782jg(act(), false);
        } else {
            FeedModule.m61406H().mo31720Pq(act(), false);
        }
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: O0 */
    public void mo64938O0(String str, boolean z) {
        if (m65486Y() == null) {
            return;
        }
        if (cmg.m111183K() && z && TabName.Moment.toString().equals(this.f42394E0) && m65486Y() == this.f42424T0 && m65481S7()) {
            this.f42448k1 = System.currentTimeMillis();
        }
        String str2 = FeedModule.f39703d.f121304I1;
        TabName tabName = TabName.Moment;
        if (tabName.toString().equals(str) && !tabName.toString().equals(this.f42394E0) && z && (((cmg.m111235t() && m65486Y() == this.f42424T0) || m65486Y() == this.f42422S0) && (TextUtils.equals(str2, "follow") || TextUtils.equals(str2, "like")))) {
            t8c.m189652e().m189656d();
        }
        if (FeedModule.m61406H().mo31711Md() && FeedModule.m61406H().mo31803nd() && tabName.toString().equals(str) && !tabName.toString().equals(this.f42394E0)) {
            FeedModule.m61406H().mo31734Vr();
            tfj0.m190939b("e_leadtocommunity", "p_suggest_users_home_view", tfj0.C20302a.m190949g("leadtocommunity_uid", FeedModule.m61406H().mo31816qp()), tfj0.C20302a.m190948f("leadtocommunity_reason", FeedModule.m61406H().mo31698Id()));
            mo64976j1(14);
            t8c.m189652e().m189656d();
            l51.m152889I(this, new Runnable() { // from class: l.f940
                @Override // java.lang.Runnable
                public final void run() {
                    this.f97816a.m65468G7();
                }
            }, 100L);
        }
        this.f42394E0 = str;
    }

    /* JADX INFO: renamed from: O7 */
    public final void m65476O7() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        List<Fragment> listM2590t0 = childFragmentManager.m2590t0();
        if (jyb.m147479J(listM2590t0)) {
            return;
        }
        AbstractC0428k abstractC0428kM2568m = childFragmentManager.m2568m();
        Iterator<Fragment> it = listM2590t0.iterator();
        while (it.hasNext()) {
            abstractC0428kM2568m.mo2716r(it.next());
        }
        abstractC0428kM2568m.mo2709j();
        childFragmentManager.m2546e0();
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: P0 */
    public boolean mo64940P0() {
        Fragment fragmentM65530m = this.f42428V0.m65530m(this.f42438b1);
        if (fragmentM65530m instanceof FriendsFeedContainerFrag) {
            return ((FriendsFeedContainerFrag) fragmentM65530m).m65254P0();
        }
        if (fragmentM65530m instanceof PhotoAlbumFeedFrag) {
            return ((PhotoAlbumFeedFrag) fragmentM65530m).m65549P0();
        }
        if (fragmentM65530m instanceof FriendsFeedViewPagerFrag) {
            return ((FriendsFeedViewPagerFrag) fragmentM65530m).m65317P0();
        }
        return false;
    }

    /* JADX INFO: renamed from: Q6 */
    public final void m65477Q6(C11454e c11454e) {
        int i = c11454e.f42461a;
        if (i <= 0 || this.f42404J0) {
            return;
        }
        this.f42406K0 = i;
    }

    /* JADX INFO: renamed from: Q7 */
    public final void m65478Q7(View view) {
        mzg mzgVar = this.f42444h1;
        if (mzgVar != null && mzgVar.isShowing()) {
            this.f42444h1.dismiss();
            return;
        }
        mzg mzgVar2 = new mzg(this, act());
        this.f42444h1 = mzgVar2;
        VImage[] vImageArr = this.f42434Y0;
        if (vImageArr != null && vImageArr.length > 0) {
            mzgVar2.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.o940
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    this.f145494a.m65466F7();
                }
            });
        }
        kl80.m150358c(this.f42444h1, view, 0, 0, 80);
    }

    /* JADX INFO: renamed from: R6 */
    public final void m65479R6(int i, PutongFrag putongFrag) {
        if (i < 0) {
            return;
        }
        this.f42389A.setCurrentItem(i);
        PutongFrag putongFrag2 = this.f42414O0.get(i);
        if (putongFrag2 instanceof PhotoAlbumFeedFrag) {
            ((PhotoAlbumFeedFrag) putongFrag2).m65555U4().m134768j0();
            return;
        }
        if (putongFrag != null) {
            if (putongFrag instanceof FriendsFeedContainerFrag) {
                ((FriendsFeedContainerFrag) putongFrag).m65260U4();
            } else if (putongFrag instanceof FriendsFeedViewPagerFrag) {
                ((FriendsFeedViewPagerFrag) putongFrag).m65314J5();
            }
        }
    }

    /* JADX INFO: renamed from: R7 */
    public final void m65480R7(C11454e c11454e) {
        boolean z;
        if (c11454e == null) {
            return;
        }
        this.f42440d1 = c11454e;
        if (!FriendsFeedViewPagerFrag.f42345J0 && cmg.m111183K()) {
            this.f42440d1.f42462b = 0;
        }
        m65448r6(m65474N6(c11454e));
        if (c11454e.f42465e) {
            FeedModule.f39703d.m145805ud(Calendar.getInstance().getTimeInMillis());
        }
        boolean z2 = c11454e.f42463c > 0 && !m65406W6();
        if (z2) {
            orb0.m168873B(act(), c11454e.f42463c);
        } else {
            orb0.m168873B(act(), -1);
        }
        boolean z3 = !z2 && ((m65474N6(c11454e) > 0) || c11454e.f42465e || (!c11454e.f42467g && m65488a7(c11454e))) && !m65406W6();
        boolean z4 = z2;
        boolean z5 = this.f42400H0;
        if (z4) {
            m65460z6(null, z5, false, m65474N6(c11454e), m65488a7(c11454e), true);
            orb0.m168872A(act(), false);
            z = z3;
        } else {
            z = z3;
            m65460z6(null, z5, z, m65474N6(c11454e), m65488a7(c11454e), false);
            orb0.m168872A(act(), z);
        }
        this.f42400H0 = z;
    }

    /* JADX INFO: renamed from: S7 */
    public final boolean m65481S7() {
        FriendsFeedViewPagerFrag friendsFeedViewPagerFrag = this.f42424T0;
        return friendsFeedViewPagerFrag == null ? !cmg.m111183K() : friendsFeedViewPagerFrag.m65336q5();
    }

    /* JADX INFO: renamed from: U7 */
    public final void m65482U7(int i, int i2) {
        if (f42385m1) {
            return;
        }
        String str = "这里有" + ((Object) this.f42395F.getText()) + "条消息在等你回复～";
        if (umg.m196668e(i)) {
            tfj0.m190941d("e_moment_unread_notes_bubble", m65462B6(), new tfj0.C20302a[0]);
            str = "大量互动消息正在等待你的回应";
        } else if (m65500k6(i2)) {
            pu20.f154142g.put(Long.valueOf(pzi0.m174454o()));
            str = i2 + "位女生通过动态喜欢了你";
        } else if (!m65439l6(i)) {
            return;
        } else {
            pu20.f154139d.put(Long.valueOf(pzi0.m174454o()));
        }
        this.f42418Q0 = C4499d.m21895l().m21907t(new C4496a(act()).m21848D(str).m21869k(act().getResources().getColor(k9c0.f124521n)).m21854J(13.0f).m21883z(qa00.m175859d(10.0f)).m21849E(true).m21860b(TextUtils.equals("大量互动消息正在等待你的回应", str) ? com.clevertap.android.sdk.Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS : 3000L).m21874q(C4496a.f16402Q | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(6.0f)).m21881x(qa00.m175859d(2.0f)), this.f42392D);
    }

    /* JADX INFO: renamed from: V6 */
    public boolean m65483V6() {
        return m65359D6() == this.f42438b1 || m65363F6() == this.f42438b1;
    }

    /* JADX INFO: renamed from: V7 */
    public final void m65484V7() {
    }

    /* JADX INFO: renamed from: X6 */
    public final Boolean m65485X6() {
        if (!cmg.m111220l0()) {
            return Boolean.FALSE;
        }
        long jLongValue = FeedModule.f39703d.f121292D1.get().longValue();
        return (jLongValue <= 0 || p6i.m170900i((double) jLongValue)) ? Boolean.FALSE : Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Y */
    public Frag m65486Y() {
        DiscoveryPager discoveryPager;
        C11451b c11451b = this.f42428V0;
        if (c11451b == null || (discoveryPager = this.f42389A) == null) {
            return null;
        }
        return (Frag) c11451b.m65530m(discoveryPager.getCurrentItem());
    }

    /* JADX INFO: renamed from: Z6 */
    public final boolean m65487Z6() {
        if (pu20.f154138c.get().booleanValue()) {
            return NullChecker.m82486a(this.f42408L0) && C4499d.m21895l().m21911x(this.f42408L0);
        }
        return true;
    }

    /* JADX INFO: renamed from: a7 */
    public final boolean m65488a7(C11454e c11454e) {
        return c11454e.f42466f;
    }

    /* JADX INFO: renamed from: a8 */
    public final void m65489a8(int i, int i2) {
        this.f42433Y = i;
        ImageView imageView = this.f42393E;
        if (i > 0) {
            imageView.setImageResource(lbc0.f130914P0);
            bnl0.m105524M(this.f42395F, true);
            VText vText = this.f42395F;
            if (i > 99) {
                vText.setText("99+");
            } else {
                vText.setText(i + "");
            }
        } else {
            imageView.setImageResource(lbc0.f130907O0);
            bnl0.m105524M(this.f42395F, false);
        }
        m65482U7(i, i2);
    }

    /* JADX INFO: renamed from: d7 */
    public final /* synthetic */ void m65491d7(x20 x20Var, Throwable th) {
        m65490c7(null, x20Var);
    }

    /* JADX INFO: renamed from: e7 */
    public final /* synthetic */ void m65492e7(final ayh ayhVar) {
        Objects.requireNonNull(ayhVar);
        m65506o6(new x20() { // from class: l.k940
            @Override // p153l.x20
            public final void call() {
                ayhVar.m100874a();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m65394S6();
    }

    /* JADX INFO: renamed from: f7 */
    public final /* synthetic */ void m65493f7(int i, C4470c c4470c) {
        this.f42424T0.m65337r5(i);
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: g2 */
    public void mo64968g2() {
        if (cmg.m111183K() && this.f42438b1 == 0) {
            m65480R7(this.f42440d1);
            return;
        }
        if (this.f42404J0 || this.f42406K0 <= 0 || !NullChecker.m82486a(this.f42440d1)) {
            return;
        }
        this.f42404J0 = true;
        this.f42406K0 = 0;
        m65480R7(this.f42440d1);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        byh.m106997d().m107019w(new byh.InterfaceC16133a() { // from class: l.x840
            @Override // p153l.byh.InterfaceC16133a
            /* JADX INFO: renamed from: a */
            public final void mo107020a(View view, String str, String str2, pf60[] pf60VarArr) {
                this.f192789a.m65353A7(view, str, str2, pf60VarArr);
            }
        });
        m65401U6();
        this.f42430W0.add(0, pu20.m173822q());
        this.f42430W0.add(1, pu20.m173823r());
        ArrayList arrayList = new ArrayList();
        m65476O7();
        FriendsFeedContainerFrag friendsFeedContainerFragM65251M4 = FriendsFeedContainerFrag.m65251M4(FeedModule.m61405F().userId());
        t8c.m189652e().m189660i(this);
        this.f42422S0 = friendsFeedContainerFragM65251M4;
        PhotoAlbumFeedFrag photoAlbumFeedFragM65543M4 = PhotoAlbumFeedFrag.m65543M4(FeedModule.m61405F().userId(), "from_discover_discussion", -1, User.ID_TEAM_ACCOUNT, 15);
        if (cmg.m111235t()) {
            FriendsFeedViewPagerFrag friendsFeedViewPagerFragM65305n5 = FriendsFeedViewPagerFrag.m65305n5();
            this.f42424T0 = friendsFeedViewPagerFragM65305n5;
            arrayList.add(friendsFeedViewPagerFragM65305n5);
        } else {
            arrayList.add(friendsFeedContainerFragM65251M4);
        }
        arrayList.add(photoAlbumFeedFragM65543M4);
        this.f42428V0.m65534r(arrayList);
        this.f42450z.setTag("photo_album_root");
        this.f42389A.setOnPageChangeListener(this.f42428V0);
        this.f42389A.setAdapter(this.f42428V0);
        this.f42391C.setBackgroundColor(act().getResources().getColor(k9c0.f124526p0));
        this.f42391C.setupViewPager(this.f42389A);
        this.f42397G = this.f42391C.getTabLayout();
        this.f42391C.setRightIconViews(this.f42403J, this.f42399H);
        bnl0.m105542Z(this.f42391C);
        this.f42426U0.m133881h(this.f42450z, new C11453d(), 1);
        bnl0.m105524M(this.f42403J, true);
        bnl0.m105509E0(this.f42403J, new View.OnClickListener() { // from class: l.i940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113412a.m65355B7(view);
            }
        });
        int i = 0;
        while (i < this.f42397G.getTabCount()) {
            View viewM65531n = this.f42428V0.m65531n(i);
            VNavigationTabLayout.C22738f c22738fM224873w = this.f42397G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w);
            c22738fM224873w.m224941n(viewM65531n);
            VNavigationTabLayout.C22738f c22738fM224873w2 = this.f42397G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w2);
            VNavigationTabLayout.TabView tabView = c22738fM224873w2.f210794i;
            int iM175859d = i == 0 ? qa00.m175859d(4.0f) : 0;
            VNavigationTabLayout.C22738f c22738fM224873w3 = this.f42397G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w3);
            int paddingTop = c22738fM224873w3.f210794i.getPaddingTop();
            VNavigationTabLayout.C22738f c22738fM224873w4 = this.f42397G.m224873w(i);
            Objects.requireNonNull(c22738fM224873w4);
            tabView.setPadding(iM175859d, paddingTop, 0, c22738fM224873w4.f210794i.getPaddingBottom());
            i++;
        }
        this.f42397G.setOnTabSelectedListener((VNavigationTabLayout.InterfaceC22736d) new C11452c());
        this.f42428V0.m65532o();
        int iM65366H6 = m65366H6();
        PutongFrag putongFrag = friendsFeedContainerFragM65251M4;
        if (cmg.m111235t()) {
            putongFrag = this.f42424T0;
        }
        m65479R6(iM65366H6, putongFrag);
        m65397T6(this.f42401I);
        this.f42416P0 = new yvg(act(), m65462B6());
        ihh.m139977h().m139985k(this);
        wsg.m207772g().m207778j(this);
        bnl0.m105509E0(this.f42392D, new View.OnClickListener() { // from class: l.p940
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151107a.m65357C7(view);
            }
        });
        ymg.m216676f().m216677b(this);
    }

    /* JADX INFO: renamed from: i6 */
    public View m65496i6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w940.m205556b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: i7 */
    public final /* synthetic */ void m65497i7() {
        isHidden();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f42428V0 = new C11451b(getChildFragmentManager());
        return m65496i6(layoutInflater, viewGroup);
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: j0 */
    public void mo64975j0() {
        if (cmg.m111183K()) {
            if (this.f42424T0 == null) {
                return;
            }
            if (TextUtils.equals(FeedModule.f39703d.f121304I1, "like")) {
                this.f42424T0.m65335o5(5);
                m65475N7();
                return;
            }
        }
        if (cmg.m111235t()) {
            if (this.f42424T0 == null) {
                return;
            }
            String str = FeedModule.f39703d.f121304I1;
            if (TextUtils.equals(str, "follow")) {
                this.f42424T0.m65335o5(1);
                m65475N7();
                return;
            }
            if (TextUtils.equals(str, "dating")) {
                this.f42424T0.m65335o5(2);
                m65475N7();
                return;
            } else if (TextUtils.equals(str, "activity_one")) {
                this.f42424T0.m65335o5(3);
                m65475N7();
                return;
            } else {
                if (TextUtils.equals(str, "activity_two")) {
                    this.f42424T0.m65335o5(4);
                    m65475N7();
                    return;
                }
                return;
            }
        }
        if (this.f42422S0 == null) {
            return;
        }
        String str2 = FeedModule.f39703d.f121304I1;
        if (TextUtils.equals(str2, "follow")) {
            this.f42422S0.m65252N4(1);
            if (!jyb.m147479J(this.f42430W0)) {
                this.f42430W0.remove(0);
                this.f42430W0.add(0, getString(R$string.f39920h5));
                this.f42432X0[0].setText(getString(R$string.f39920h5));
            }
            this.f42423T.m152772g();
            m65503m6(this.f42415P);
            this.f42423T.m152783r();
            this.f42407L.setPageId(m65462B6());
            m65475N7();
            return;
        }
        if (TextUtils.equals(str2, "dating")) {
            this.f42422S0.m65252N4(2);
            if (!jyb.m147479J(this.f42430W0)) {
                this.f42430W0.remove(0);
                this.f42430W0.add(0, pu20.m173822q());
                this.f42432X0[0].setText(pu20.m173822q());
            }
            this.f42423T.m152772g();
            m65503m6(this.f42411N);
            this.f42423T.m152783r();
            this.f42407L.setPageId(m65462B6());
            m65475N7();
        }
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: j1 */
    public void mo64976j1(int i) {
        int iM65464E6 = m65464E6(i);
        if (iM65464E6 >= 0) {
            this.f42389A.setCurrentItem(iM65464E6);
        }
    }

    /* JADX INFO: renamed from: j6 */
    public void m65498j6() {
        w940.m205557c(this);
    }

    /* JADX INFO: renamed from: j7 */
    public final /* synthetic */ void m65499j7(C11454e c11454e) {
        if ((cmg.m111235t() && !m65467G6().equals(getString(R$string.f39920h5))) || !m65483V6()) {
            m65477Q6(c11454e);
        }
        m65480R7(c11454e);
        m65489a8(c11454e.f42463c, c11454e.f42464d);
    }

    /* JADX INFO: renamed from: k6 */
    public final boolean m65500k6(int i) {
        if (i > 0) {
            return !pzi0.m174438C(pzi0.m174454o(), pu20.f154142g.get().longValue());
        }
        return false;
    }

    /* JADX INFO: renamed from: k7 */
    public final /* synthetic */ void m65501k7(Double d) {
        bnl0.m105524M(this.f42407L, true);
    }

    /* JADX INFO: renamed from: l7 */
    public final /* synthetic */ void m65502l7(Moment moment) {
        this.f42389A.setCurrentItem(0);
        t8c.m189652e().m189656d();
    }

    @Override // com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService.InterfaceC11577a
    /* JADX INFO: renamed from: m */
    public void mo64982m(String str) {
    }

    /* JADX INFO: renamed from: m6 */
    public final void m65503m6(l4g0 l4g0Var) {
        String str;
        this.f42423T = l4g0Var;
        if (l4g0Var == this.f42415P) {
            str = "p_follow";
        } else if (l4g0Var == this.f42417Q) {
            str = "p_like";
        } else if (l4g0Var == this.f42411N) {
            str = "p_discover_dating";
        } else if (l4g0Var == this.f42413O) {
            str = "p_discover_discussion";
        } else if (l4g0Var == this.f42419R && pu20.m173824s()) {
            str = this.f42396F0.get(0).f97369b;
        } else {
            str = (l4g0Var == this.f42421S && pu20.m173826u()) ? this.f42396F0.get(1).f97369b : null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x3e.m209204b().m209207e(str);
    }

    /* JADX INFO: renamed from: m7 */
    public final /* synthetic */ Boolean m65504m7(C4470c c4470c) {
        return Boolean.valueOf(c4470c == C4470c.f16267i && m65398T7());
    }

    /* JADX INFO: renamed from: n7 */
    public final /* synthetic */ void m65505n7(C4470c c4470c) {
        if (NullChecker.m82486a(this.f42409M) && this.f42409M.isShowing()) {
            this.f42409M.dismiss();
        }
        if (NullChecker.m82486a(this.f42444h1) && this.f42444h1.isShowing()) {
            this.f42444h1.dismiss();
        }
        m65514t6();
        m65516u6();
        m65453v6();
        if (cmg.m111238u0()) {
            b5i.m102594m().m102600l();
        }
    }

    /* JADX INFO: renamed from: o6 */
    public final void m65506o6(final x20 x20Var) {
        if (cmg.m111220l0()) {
            act().duringCreated(FeedModule.f39703d.m145567Mc()).subscribe(psd0.m173597H(new y20() { // from class: l.m940
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f135346a.m65490c7(x20Var, (TopicOperations) obj);
                }
            }, new y20() { // from class: l.n940
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140743a.m65491d7(x20Var, (Throwable) obj);
                }
            }));
        } else {
            m65490c7(null, x20Var);
        }
    }

    /* JADX INFO: renamed from: o7 */
    public final /* synthetic */ void m65507o7(Bundle bundle) {
        act().duringCreated((C22421c) Act.foreground(), false).distinctUntilChanged(new rcj() { // from class: l.a940
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Act.C4450r) obj) != null || ((Act.C4450r) obj2) == null);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.b940
            @Override // p153l.y20
            public final void call(Object obj) {
                NewPhotoAlbumFrag.m65437k5((Act.C4450r) obj);
            }
        }));
        FeedModule.f39701b.m61673G2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f42411N.m152774i();
        this.f42415P.m152774i();
        this.f42417Q.m152774i();
        this.f42413O.m152774i();
        this.f42411N.m152781p(pf60.m172085a("tab_name", pu20.m173822q()));
        this.f42413O.m152781p(pf60.m172085a("tab_name", pu20.m173823r()));
        this.f42415P.m152781p(pf60.m172085a("tab_name", getString(R$string.f39920h5)));
        this.f42417Q.m152781p(pf60.m172085a("tab_name", pu20.m173814i()));
        this.f42423T = this.f42411N;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        byh.m106997d().m107016t();
        this.f42411N.m152775j();
        this.f42415P.m152775j();
        this.f42417Q.m152775j();
        this.f42413O.m152775j();
        if (NullChecker.m82486a(this.f42428V0)) {
            this.f42428V0.m65533q();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        f42385m1 = z;
        if (NullChecker.m82486a(this.f42428V0)) {
            for (int i = 0; i < this.f42428V0.f42452a.size(); i++) {
                Fragment fragment = (Fragment) this.f42428V0.f42452a.get(i);
                if (fragment instanceof PhotoAlbumFeedFrag) {
                    ((PhotoAlbumFeedFrag) fragment).m65564e5(z);
                } else if (fragment instanceof FriendsFeedViewPagerFrag) {
                    ((FriendsFeedViewPagerFrag) fragment).m65327b6(z);
                }
            }
        }
        if (z) {
            if (NullChecker.m82487b(act())) {
                if (NullChecker.m82486a(this.f42439c1) && this.f42439c1.isShowing()) {
                    this.f42439c1.dismiss();
                }
                if (NullChecker.m82486a(this.f42409M) && this.f42409M.isShowing()) {
                    this.f42409M.dismiss();
                }
                if (NullChecker.m82486a(this.f42444h1) && this.f42444h1.isShowing()) {
                    this.f42444h1.dismiss();
                }
                PhotoAlbumPictureView.m65042u(act().getWindow().getDecorView(), false);
            }
            l51.m152890J(this.f42443g1);
            tog.m192029o();
            m65387P7();
            m65410X7();
            m65386P6();
            m65514t6();
            m65516u6();
            ymg.m216676f().m216683i();
            m65453v6();
        } else {
            if (!jyb.m147479J(this.f42414O0)) {
                m65473L7(this.f42414O0.get(this.f42438b1));
            }
            m65482U7(NullChecker.m82486a(this.f42440d1) ? this.f42440d1.f42463c : 0, NullChecker.m82486a(this.f42440d1) ? this.f42440d1.f42464d : 0);
            if (this.f42402I0 == 10) {
                byh.m106997d().m107009m(this.f42402I0, m65374L6());
            } else {
                byh.m106997d().m107008l(this.f42402I0);
            }
            if (this.f42438b1 == 1) {
                FeedModule.f39703d.f121338Y0.onNext(Boolean.FALSE);
            }
            FeedModule.f39703d.m145651Yc("");
            m65508p6();
            if (j4h.m143420d()) {
                m65378M7();
            }
            m65461A6();
        }
        m65442n6(z);
        this.f42429W.onNext(Boolean.valueOf(z));
        x3e.m209204b().m209208f(z, m65463C6());
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if ("moment".equals(this.f42431X)) {
            this.f42416P0.mo174886p();
        }
        if (m65485X6().booleanValue()) {
            o1j0.m165651y("新人头像框体验已到期～");
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final void m65508p6() {
        ayh ayhVar = new ayh(m65446q6(), new x20() { // from class: l.v840
            @Override // p153l.x20
            public final void call() {
                NewPhotoAlbumFrag.m65384P4();
            }
        });
        ayh ayhVar2 = new ayh(!m65487Z6() && ymg.m216676f().m216689o() && ymg.m216676f().m216678c(act(), null), new x20() { // from class: l.w840
            @Override // p153l.x20
            public final void call() {
                NewPhotoAlbumFrag.m65408X4();
            }
        });
        final ayh ayhVar3 = new ayh(false, new x20() { // from class: l.y840
            @Override // p153l.x20
            public final void call() {
                NewPhotoAlbumFrag.m65375M4();
            }
        });
        ayhVar.m100875b(ayhVar2).m100875b(new ayh(true, new x20() { // from class: l.z840
            @Override // p153l.x20
            public final void call() {
                this.f203306a.m65492e7(ayhVar3);
            }
        })).m100875b(ayhVar3);
        ayhVar.m100874a();
    }

    /* JADX INFO: renamed from: p7 */
    public final /* synthetic */ void m65509p7(Boolean bool) {
        m65468G7();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return m65462B6();
    }

    /* JADX INFO: renamed from: q7 */
    public final /* synthetic */ void m65510q7(String str) {
        k3h.m148043I0(act(), str);
    }

    /* JADX INFO: renamed from: r7 */
    public final /* synthetic */ Boolean m65511r7(Act.C4450r c4450r, Act.C4450r c4450r2) {
        if (c4450r != null && c4450r2 == null) {
            this.f42447k0 = System.currentTimeMillis();
        }
        return Boolean.valueOf(c4450r != null || c4450r2 == null);
    }

    /* JADX INFO: renamed from: s6, reason: merged with bridge method [inline-methods] */
    public final void m65490c7(TopicOperations topicOperations, x20 x20Var) {
        x20Var.call();
    }

    /* JADX INFO: renamed from: s7 */
    public final /* synthetic */ void m65513s7(Act.C4450r c4450r) {
        if (!isHidden() && this.f42447k0 > 0 && System.currentTimeMillis() - this.f42447k0 > f42384l1) {
            this.f42447k0 = 0L;
            this.f42449p0.onNext(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: renamed from: t6 */
    public void m65514t6() {
        if (NullChecker.m82486a(this.f42418Q0)) {
            C4499d.m21895l().m21899k(this.f42418Q0);
            this.f42418Q0 = null;
        }
    }

    /* JADX INFO: renamed from: t7 */
    public final /* synthetic */ void m65515t7(Bundle bundle) {
        act().duringCreated((C22421c) Act.foreground(), false).distinctUntilChanged(new rcj() { // from class: l.d940
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f85708a.m65511r7((Act.C4450r) obj, (Act.C4450r) obj2);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.e940
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92590a.m65513s7((Act.C4450r) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u6 */
    public void m65516u6() {
        if (NullChecker.m82486a(this.f42420R0)) {
            C4499d.m21895l().m21899k(this.f42420R0);
            this.f42420R0 = null;
        }
    }

    /* JADX INFO: renamed from: u7 */
    public final /* synthetic */ void m65517u7(Long l2) {
        if (isHidden() || jyb.m147479J(this.f42414O0)) {
            return;
        }
        m65473L7(this.f42414O0.get(this.f42438b1));
    }

    @Override // p153l.t2m
    /* JADX INFO: renamed from: v3 */
    public void mo65000v3(String str) {
        this.f42423T.m152772g();
        if (TextUtils.equals(pu20.m173813h(), str)) {
            m65503m6(this.f42415P);
        } else if (TextUtils.equals(pu20.m173814i(), str)) {
            m65503m6(this.f42417Q);
        } else {
            m65503m6(this.f42411N);
        }
        this.f42423T.m152783r();
        this.f42407L.setPageId(m65462B6());
    }

    /* JADX INFO: renamed from: v7 */
    public final /* synthetic */ void m65518v7(uxj0 uxj0Var) {
        m65484V7();
    }

    /* JADX INFO: renamed from: w7 */
    public final /* synthetic */ void m65519w7(Boolean bool) {
        this.f42442f1 = bool.booleanValue();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: y4 */
    public void mo21604y4() {
        m65498j6();
    }

    /* JADX INFO: renamed from: y6 */
    public final boolean m65521y6() {
        this.f42412N0 = false;
        if (ci80.m109858h().m109864k()) {
            return ci80.m109858h().m109860f(act());
        }
        ci80.m109858h().m109859e(new x20() { // from class: l.l940
            @Override // p153l.x20
            public final void call() {
                this.f130552a.m65497i7();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m65522y7(View view) {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return;
        }
        boolean zM216687m = ymg.m216676f().m216687m();
        keh kehVar = this.f42425U;
        if (zM216687m) {
            kehVar.mo149320b(act(), jyb.m147507f0(new Media[0]), true, m65377M6(), ymg.m216676f().m216681g(), ymg.m216676f().m216682h(), this.f42427V, ymg.m216676f().m216679d());
            ymg.m216676f().m216683i();
        } else {
            kehVar.mo149319a(act(), m65377M6(), null, this.f42427V);
        }
        i4g0.m138520r("e_moment_post", m65463C6());
        l94.m153309e().m153318j();
        m65383O6();
    }

    /* JADX INFO: renamed from: z7 */
    public final /* synthetic */ boolean m65523z7(View view) {
        TopicMoment topicMomentNew_;
        i4g0.m138520r("e_moment_post", m65463C6());
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
            return true;
        }
        l94.m153309e().m153318j();
        if (ymg.m216676f().m216687m()) {
            String strM216681g = ymg.m216676f().m216681g();
            String strM216682h = ymg.m216676f().m216682h();
            if (TextUtils.isEmpty(strM216681g) || TextUtils.isEmpty(strM216682h)) {
                topicMomentNew_ = null;
            } else {
                topicMomentNew_ = TopicMoment.new_();
                topicMomentNew_.f40095id = strM216681g;
                topicMomentNew_.name = strM216682h;
            }
            cn40.m111402n0(act(), jyb.m147507f0(new Media[0]), true, m65377M6(), null, null, topicMomentNew_, ymg.m216676f().m216679d());
            ymg.m216676f().m216683i();
        } else {
            cn40.m111396k0(act(), jyb.m147507f0(new Media[0]), true, m65377M6());
        }
        m65383O6();
        return true;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.discovery.NewPhotoAlbumFrag$d */
    public class C11453d {

        /* JADX INFO: renamed from: a */
        public String f42457a;

        /* JADX INFO: renamed from: b */
        public String f42458b;

        /* JADX INFO: renamed from: c */
        public JSONObject f42459c;

        public C11453d(String str, String str2, JSONObject jSONObject) {
            this.f42457a = str;
            this.f42458b = str2;
            this.f42459c = jSONObject;
        }

        public C11453d() {
        }
    }
}
