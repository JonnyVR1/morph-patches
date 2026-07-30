package com.p000p1.mobile.putong.feed.newui.status.display.statuspage;

import android.R;
import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.ConversationStatus;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.KanKanStatus;
import com.p000p1.mobile.putong.data.KanPostData;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.Meet;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p000p1.mobile.putong.feed.newui.status.aquare.FeedStatusListTabFrag;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStatusSquareTabFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import com.tantanapp.media.ttmediaeffect.anim.AnimListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l.bkb0;
import l.bt0;
import l.dyl;
import l.e30;
import l.e51;
import l.hpd0;
import l.j760;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.sub0;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.b5c0;
import p007l.c3i;
import p007l.e1c0;
import p007l.f3c0;
import p007l.nkg;
import p007l.o6c0;
import p007l.s1i;
import p007l.vqg;
import p007l.xia;
import rx.subjects.a;
import rx.subjects.b;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.navigationbar.VNavigationBar;
import v.navigationbar.VNavigationTabLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStatusPageAct extends PutongAct implements sub0 {

    /* JADX INFO: renamed from: A */
    public static a<List<BubbleInfo>> f4209A = a.c(new ArrayList());

    /* JADX INFO: renamed from: B */
    public static b<j760<Boolean, Boolean>> f4210B = b.b();

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f4211c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f4212d;

    /* JADX INFO: renamed from: e */
    public VNavigationBar f4213e;

    /* JADX INFO: renamed from: f */
    public DiscoveryPager f4214f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f4215g;

    /* JADX INFO: renamed from: h */
    public VImage f4216h;

    /* JADX INFO: renamed from: i */
    public VRelative f4217i;

    /* JADX INFO: renamed from: j */
    public VImage f4218j;

    /* JADX INFO: renamed from: k */
    public VImage f4219k;

    /* JADX INFO: renamed from: l */
    public VImage f4220l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f4221m;

    /* JADX INFO: renamed from: o */
    public FeedStatusSquareTabFrag f4223o;

    /* JADX INFO: renamed from: p */
    public List<PutongFrag> f4224p;

    /* JADX INFO: renamed from: s */
    public View f4227s;

    /* JADX INFO: renamed from: t */
    public VNavigationTabLayout f4228t;

    /* JADX INFO: renamed from: u */
    public View f4229u;

    /* JADX INFO: renamed from: v */
    public String f4230v;

    /* JADX INFO: renamed from: x */
    public int f4232x;

    /* JADX INFO: renamed from: y */
    public boolean f4233y;

    /* JADX INFO: renamed from: n */
    public hpd0 f4222n = new hpd0("HASSHOWSTATEPAGEACTPOSTTVGUIDEBUBBLE" + FeedModule.m1139F().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: q */
    public C2178d f4225q = null;

    /* JADX INFO: renamed from: r */
    public List<String> f4226r = new ArrayList();

    /* JADX INFO: renamed from: w */
    public TextView[] f4231w = new TextView[2];

    /* JADX INFO: renamed from: z */
    public final Runnable f4234z = new RunnableC2177c();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$a */
    public class C2175a implements Animator.AnimatorListener {
        public C2175a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            FeedStatusPageAct.this.m6705u2();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$b */
    public class C2176b extends AnimListener {
        public C2176b() {
        }

        public void onFinished() {
            super.onFinished();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$c */
    public class RunnableC2177c implements Runnable {
        public RunnableC2177c() {
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m6712d(List list, ConversationStatus conversationStatus) {
            boolean zM15497U = vqg.m15497U(conversationStatus);
            FeedStatusPageAct feedStatusPageAct = FeedStatusPageAct.this;
            if (!zM15497U) {
                feedStatusPageAct.f4223o.m6829s6(((Meet) list.get(0)).type, ((Meet) list.get(0)).f690id, ((Meet) list.get(0)).userId);
                return;
            }
            if (feedStatusPageAct.getLifecycle().b() == Lifecycle.State.RESUMED) {
                osi0.g("暂时没有遇到有趣的灵魂");
            }
            FeedStatusPageAct.this.m6705u2();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m6713e(Envelope envelope) {
            if (xdl0.O0(FeedStatusPageAct.this.f4215g)) {
                final List<Meet> list = ((FeedData) envelope.data.getModuleData(FeedData.class)).meets;
                if (vwb.J(list) || list.size() == 0) {
                    osi0.g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m6705u2();
                } else if (!TextUtils.isEmpty(list.get(0).userId)) {
                    FeedStatusPageAct.this.duringCreated(FeedModule.m1140H().ab(list.get(0).userId)).subscribe(mkd0.G(new e30() { // from class: l.b3i
                        public final void call(Object obj) {
                            this.f5908a.m6712d(list, (ConversationStatus) obj);
                        }
                    }));
                } else {
                    osi0.g("暂时没有遇到有趣的灵魂");
                    FeedStatusPageAct.this.m6705u2();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m6714f(Throwable th) {
            if (xdl0.O0(FeedStatusPageAct.this.f4215g)) {
                boolean z = th instanceof TantanException.Client.TantanForbidden;
                if (z && ((TantanException.Client.TantanForbidden) th).code == 40350) {
                    osi0.g("今天的偶遇机会已用尽，明天再来邂逅");
                    FeedStatusPageAct.this.m6705u2();
                    return;
                }
                if ((z && ((TantanException.Client.TantanForbidden) th).code == 40351) || (z && ((TantanException.Client.TantanForbidden) th).code == 40352)) {
                    FeedStatusPageAct.this.f4223o.m6830t6(((TantanException.Client.TantanForbidden) th).code);
                } else {
                    osi0.g("暂时没有遇到有趣的灵魂");
                }
                FeedStatusPageAct.this.m6705u2();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            FeedStatusPageAct.this.duringCreated(FeedModule.f316d.m16746v7()).subscribe(mkd0.H(new e30() { // from class: l.z2i
                public final void call(Object obj) {
                    this.f15563a.m6713e((Envelope) obj);
                }
            }, new e30() { // from class: l.a3i
                public final void call(Object obj) {
                    this.f5565a.m6714f((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$d */
    public class C2178d extends FragmentPagerAdapter implements ViewPager.j, dyl {

        /* JADX INFO: renamed from: a */
        public List<PutongFrag> f4238a;

        /* JADX INFO: renamed from: b */
        public Method f4239b;

        /* JADX INFO: renamed from: c */
        public FragmentManager f4240c;

        public C2178d(FragmentManager fragmentManager) {
            super(fragmentManager);
            this.f4238a = new ArrayList();
            this.f4239b = null;
            this.f4240c = fragmentManager;
            try {
                Method declaredMethod = FragmentPagerAdapter.class.getDeclaredMethod("makeFragmentName", Integer.TYPE, Long.TYPE);
                this.f4239b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                CrashHelper.c(e);
                this.f4239b = null;
            } catch (SecurityException e2) {
                CrashHelper.c(e2);
                this.f4239b = null;
            }
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: a */
        public Animator m6715a(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: b */
        public Animator m6716b(int i, @NonNull @NotNull View view) {
            return (Animator) dyl.l0.call(view);
        }

        @Nullable
        @org.jetbrains.annotations.Nullable
        /* JADX INFO: renamed from: g */
        public List<View> m6717g(int i) {
            return null;
        }

        public int getCount() {
            return this.f4238a.size();
        }

        public Fragment getItem(int i) {
            if (i < 0 || i >= getCount()) {
                return null;
            }
            return this.f4238a.get(i);
        }

        public CharSequence getPageTitle(int i) {
            return (CharSequence) FeedStatusPageAct.this.f4226r.get(i);
        }

        @NonNull
        @NotNull
        public Object instantiateItem(@NonNull @NotNull ViewGroup viewGroup, int i) {
            return super.instantiateItem(viewGroup, i);
        }

        /* JADX INFO: renamed from: j */
        public View m6718j(int i) {
            View viewInflate = FeedStatusPageAct.this.act().inflater().inflate(o6c0.f11336x3, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(b5c0.f6037d2);
            FeedStatusPageAct.this.f4231w[i] = textView;
            textView.setText((CharSequence) FeedStatusPageAct.this.f4226r.get(i));
            return viewInflate;
        }

        /* JADX INFO: renamed from: k */
        public void m6719k(List<PutongFrag> list) {
            FeedStatusPageAct.this.f4224p = list;
            this.f4238a.clear();
            if (NullChecker.b(list)) {
                this.f4238a.addAll(list);
            }
            notifyDataSetChanged();
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            PhotoAlbumPictureView.m4886u(FeedStatusPageAct.this.act().getWindow().getDecorView(), false);
            FeedStatusPageAct.this.act().hideInput();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.statuspage.FeedStatusPageAct$e */
    public class C2179e implements VNavigationTabLayout.d {
        public C2179e() {
        }

        /* JADX INFO: renamed from: a */
        public void m6720a(VNavigationTabLayout.f fVar) {
            TextPaint paint;
            int iF = fVar.f();
            if (iF == 0) {
                FeedStatusPageAct.f4210B.onNext(new j760(Boolean.FALSE, Boolean.TRUE));
            }
            TextView textView = FeedStatusPageAct.this.f4231w[iF];
            if (!NullChecker.a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(false);
        }

        /* JADX INFO: renamed from: b */
        public void m6721b(VNavigationTabLayout.f fVar) {
        }

        /* JADX INFO: renamed from: c */
        public void m6722c(VNavigationTabLayout.f fVar) {
            TextPaint paint;
            int iF = fVar.f();
            FeedStatusPageAct.this.f4232x = iF;
            if (NullChecker.a(FeedStatusPageAct.this.f4229u)) {
                xdl0.M(FeedStatusPageAct.this.f4229u, iF == 0);
            }
            if (iF == 0) {
                b<j760<Boolean, Boolean>> bVar = FeedStatusPageAct.f4210B;
                Boolean bool = Boolean.TRUE;
                bVar.onNext(new j760(bool, bool));
            } else {
                FeedStatusPageAct.this.f4214f.setScrollble(true);
            }
            TextView textView = FeedStatusPageAct.this.f4231w[iF];
            if (!NullChecker.a(textView) || (paint = textView.getPaint()) == null) {
                return;
            }
            paint.setFakeBoldText(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public /* synthetic */ void m6668A2() {
        m6701L2(this.f4212d.getRightIconContainer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public /* synthetic */ void m6669C2(View view) {
        if (this.f4233y) {
            e51.J(this.f4234z);
            zvf0.r("e_meet_back", "p_meet_greet");
            m6705u2();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: H2 */
    public static List<BubbleInfo> m6670H2(List<BubbleInfo> list) {
        return vwb.n(list, new w9j() { // from class: l.w2i
            public final Object call(Object obj) {
                return Boolean.valueOf(((BubbleInfo) obj) != null);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public static /* synthetic */ void m6678d2(View view) {
    }

    /* JADX INFO: renamed from: o2 */
    private void m6686o2() {
        xdl0.X(this.f4212d, xdl0.F0());
        xdl0.X(this.f4215g, xdl0.F0());
    }

    /* JADX INFO: renamed from: p2 */
    public static Intent m6687p2(Context context, String str, String str2, boolean z, String str3) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateId", str);
        intent.putExtra("userId", str2);
        intent.putExtra("needAppendFeed", z);
        intent.putExtra("from", str3);
        f4209A.onNext(new ArrayList());
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    public static Intent m6688q2(Context context, List<BubbleInfo> list, int i, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("initialShowIndex", i);
        intent.putExtra("next", str);
        intent.putExtra("from", str2);
        f4209A.onNext(m6670H2(list));
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m6689r() {
        m6686o2();
        xdl0.M(this.f4212d, true);
        xdl0.M(this.f4213e, true);
        this.f4212d.setTitle(FeedModule.f313a.getString(R$string.f523g2));
        this.f4212d.setLeftIconAsBack(this);
        this.f4212d.setLeftIconResource(f3c0.f7631I3);
        this.f4226r.add(FeedModule.f313a.getString(R$string.f407O0));
        this.f4226r.add(FeedModule.f313a.getString(R$string.f517f3));
        ArrayList arrayList = new ArrayList();
        FeedStatusListTabFrag feedStatusListTabFragM6598S4 = FeedStatusListTabFrag.m6598S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false));
        BubbleInfo bubbleInfo = (BubbleInfo) getIntent().getSerializableExtra("bubbleInfo");
        if (nkg.m12248k0()) {
            FeedStatusSquareTabFrag feedStatusSquareTabFragM6788y5 = FeedStatusSquareTabFrag.m6788y5(bubbleInfo, getIntent().getStringExtra("from"));
            this.f4223o = feedStatusSquareTabFragM6788y5;
            arrayList.add(feedStatusSquareTabFragM6788y5);
        } else {
            arrayList.add(FeedModule.m1140H().i7(getIntent().getStringExtra("from"), bubbleInfo, o6c0.f11346z));
        }
        arrayList.add(feedStatusListTabFragM6598S4);
        this.f4225q.m6719k(arrayList);
        this.f4214f.setOnPageChangeListener(this.f4225q);
        this.f4214f.setAdapter(this.f4225q);
        this.f4213e.setBackgroundColor(act().getResources().getColor(e1c0.f7159p0));
        this.f4213e.setupViewPager(this.f4214f);
        VNavigationTabLayout tabLayout = this.f4213e.getTabLayout();
        this.f4228t = tabLayout;
        if (tabLayout != null) {
            tabLayout.setBackgroundColor(act().getResources().getColor(e1c0.f7159p0));
        }
        if (nkg.m12266t0()) {
            View viewInflate = LayoutInflater.from(this).inflate(o6c0.f11308t3, (ViewGroup) null);
            this.f4229u = viewInflate;
            this.f4213e.setRightIconViews(new View[]{viewInflate});
            xdl0.E0(this.f4229u, new View.OnClickListener() { // from class: l.q2i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12054a.m6691y2(view);
                }
            });
        }
        int i = 0;
        while (true) {
            VNavigationTabLayout vNavigationTabLayout = this.f4228t;
            Objects.requireNonNull(vNavigationTabLayout);
            if (i >= vNavigationTabLayout.getTabCount()) {
                break;
            }
            View viewM6718j = this.f4225q.m6718j(i);
            VNavigationTabLayout.f fVarW = this.f4228t.w(i);
            Objects.requireNonNull(fVarW);
            fVarW.n(viewM6718j);
            VNavigationTabLayout.f fVarW2 = this.f4228t.w(i);
            Objects.requireNonNull(fVarW2);
            VNavigationTabLayout.TabView tabView = fVarW2.i;
            int iD = t100.d(i == 0 ? 4.0f : 6.0f);
            VNavigationTabLayout.f fVarW3 = this.f4228t.w(i);
            Objects.requireNonNull(fVarW3);
            int paddingTop = fVarW3.i.getPaddingTop();
            VNavigationTabLayout.f fVarW4 = this.f4228t.w(i);
            Objects.requireNonNull(fVarW4);
            tabView.setPadding(iD, paddingTop, 0, fVarW4.i.getPaddingBottom());
            i++;
        }
        this.f4228t.setOnTabSelectedListener(new C2179e());
        this.f4214f.setCurrentItem(0);
        e51.H(((Act) this).act, new Runnable() { // from class: l.r2i
            @Override // java.lang.Runnable
            public final void run() {
                this.f12462a.m6692z2();
            }
        }, 200L);
        duringCreated(FeedModule.f316d.m16488K7()).subscribe(mkd0.G(new e30() { // from class: l.s2i
            public final void call(Object obj) {
                this.f12780a.m6694B2((Map) obj);
            }
        }));
        xdl0.E0(this.f4216h, new View.OnClickListener() { // from class: l.t2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13164a.m6669C2(view);
            }
        });
        if (nkg.m12248k0()) {
            duringCreated(xia.f14908M1).subscribe(mkd0.G(new e30() { // from class: l.u2i
                public final void call(Object obj) {
                    this.f13508a.m6696D2((Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: r2 */
    public static Intent m6690r2(Context context, boolean z, BubbleInfo bubbleInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedStatusPageAct.class);
        intent.putExtra("stateSquare", z);
        intent.putExtra("bubbleInfo", bubbleInfo);
        intent.putExtra("from", str);
        f4209A.onNext(new ArrayList());
        return intent;
    }

    public static void showView(View view) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        view.setAnimation(translateAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public /* synthetic */ void m6691y2(View view) {
        if (NullChecker.a(this.f4223o)) {
            this.f4223o.m6836z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z2 */
    public /* synthetic */ void m6692z2() {
        if (!getIntent().getBooleanExtra("stateSquare", false)) {
            this.f4214f.setCurrentItem(1);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: B */
    public Animator m6693B() {
        return null;
    }

    /* JADX INFO: renamed from: B2 */
    public final /* synthetic */ void m6694B2(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(((DbObject) FeedModule.m1140H().me_()).id);
        this.f4212d.setRightIconViews(new View[]{m6698F2(bubbleInfo)});
        VLinear rightIconContainer = this.f4212d.getRightIconContainer();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rightIconContainer.getLayoutParams();
        marginLayoutParams.rightMargin = t100.d(4.0f);
        rightIconContainer.setLayoutParams(marginLayoutParams);
        View childAt = this.f4212d.getRightIconContainer().getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        layoutParams.height = t100.d(34.0f);
        childAt.setLayoutParams(layoutParams);
        if (bubbleInfo == null) {
            e51.H(((Act) this).act, new Runnable() { // from class: l.v2i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14029a.m6668A2();
                }
            }, 800L);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public View m6695C() {
        return this.f4211c;
    }

    /* JADX INFO: renamed from: D2 */
    public final /* synthetic */ void m6696D2(Boolean bool) {
        if (bool.booleanValue()) {
            this.f4233y = false;
            Animator animatorP = bt0.p(this.f4215g, "alpha", 0L, 100L, new LinearInterpolator(), new float[]{1.0f, 0.0f});
            animatorP.addListener(new C2175a());
            animatorP.start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E2 */
    public final /* synthetic */ void m6697E2(BubbleInfo bubbleInfo, View view) {
        int i = this.f4232x;
        zvf0.u("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", new j760[]{j760.a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), j760.a("state_id", bubbleInfo == null ? "" : bubbleInfo.f191id), j760.a("owner_id", bubbleInfo == null ? "" : bubbleInfo.owner.f264id)});
        if (bubbleInfo != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bubbleInfo);
            startActivity(m6688q2(this, arrayList, 0, "", this.f4232x != 1 ? "p_my_state" : "p_other_state"));
        } else if (NullChecker.a(FeedModule.f317e.f8795H) && NullChecker.a(FeedModule.f317e.f8795H.e()) && TEnum.equals(((KanPostData) FeedModule.f317e.f8795H.e()).status, KanKanStatus.start)) {
            osi0.g("状态发布中...");
        } else {
            s1i.m13982f(this, this.f4232x != 0 ? "p_other_state" : "p_state_explore");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F2 */
    public final View m6698F2(final BubbleInfo bubbleInfo) {
        int i = this.f4232x;
        zvf0.A("e_set_my_state", i == 0 ? "p_state_explore" : "p_other_state", new j760[]{j760.a("source_page", i == 0 ? "p_state_explore" : "p_other_state"), j760.a("state_id", bubbleInfo == null ? "" : bubbleInfo.f191id), j760.a("owner_id", bubbleInfo != null ? bubbleInfo.owner.f264id : "")});
        View viewInflate = LayoutInflater.from(this).inflate(o6c0.f11060H2, (ViewGroup) null);
        VLinear vLinearFindViewById = viewInflate.findViewById(b5c0.f5952C1);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(b5c0.f5979L1);
        VText vTextFindViewById = viewInflate.findViewById(b5c0.f5976K1);
        TextPaint paint = vTextFindViewById.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        xdl0.M(vDraweeViewFindViewById, bubbleInfo != null);
        if (bubbleInfo == null) {
            vLinearFindViewById.setPadding(t100.d(13.0f), 0, t100.d(13.0f), 0);
        } else {
            vLinearFindViewById.setPadding(t100.d(10.0f), 0, t100.d(12.0f), 0);
        }
        vLinearFindViewById.setBackgroundResource(bubbleInfo == null ? f3c0.f7889q5 : f3c0.f7897r5);
        vTextFindViewById.setTextColor(Color.parseColor(bubbleInfo == null ? "#ffffff" : "#1a1a1b"));
        vTextFindViewById.setTextSize(bubbleInfo == null ? 14.0f : 13.0f);
        vTextFindViewById.setText(bubbleInfo != null ? bubbleInfo.emotion.text : FeedModule.f313a.getString(R$string.f516f2));
        if (NullChecker.a(bubbleInfo)) {
            bkb0 bkb0Var = qib0.G;
            String str = bubbleInfo.emotion.emojiUrl;
            int i2 = t100.q;
            bkb0Var.I0(vDraweeViewFindViewById, str, i2, i2);
        }
        xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.y2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15208a.m6697E2(bubbleInfo, view);
            }
        });
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I2 */
    public void m6699I2() {
        this.f4215g.setOnClickListener(new View.OnClickListener() { // from class: l.x2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedStatusPageAct.m6678d2(view);
            }
        });
        showView(this.f4215g);
        this.f4233y = true;
        m6700K2();
        xdl0.M(this.f4215g, true);
        this.f4221m.loadAnimWithListener("feed_state_meet.svga", -1, new C2176b(), true);
        e51.H(this, this.f4234z, 1800L);
    }

    /* JADX INFO: renamed from: K2 */
    public void m6700K2() {
        ((PutongAct) this).pageHelper.c();
        ((PutongAct) this).pageHelper.q("p_meet_greet");
        ((PutongAct) this).pageHelper.l();
    }

    /* JADX INFO: renamed from: L2 */
    public final void m6701L2(VLinear vLinear) {
        if (((Boolean) this.f4222n.get()).booleanValue()) {
            return;
        }
        VText vText = new VText(act());
        int i = xdl0.e;
        vText.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        vText.setText("分享状态，让更多人看到你");
        int i2 = t100.m;
        vText.setPadding(i2, t100.d(10.0f), i2, t100.d(10.0f));
        vText.setTextColor(-1);
        if (NullChecker.a(vText.getPaint())) {
            vText.getPaint().setFakeBoldText(true);
        }
        this.f4230v = d.l().t(new com.p1.mobile.android.ui.bubble.a(act()).s(vText).e(true).k(new int[]{act().getResources().getColor(e1c0.f7154n)}).J(13.0f).b(5000L).y(true).w(t100.j).q(com.p1.mobile.android.ui.bubble.a.N), vLinear);
        this.f4222n.put(Boolean.TRUE);
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (nkg.m12207E() && !m6708w2()) {
            this.f4225q = new C2178d(getSupportFragmentManager());
            this.f4227s = m6702n2(layoutInflater, viewGroup);
            m6689r();
            return this.f4227s;
        }
        if (((Act) this).act.fragmentManager().h0(R.id.content) != null) {
            return null;
        }
        ((Act) this).act.fragmentManager().m().s(R.id.content, FeedStatusListTabFrag.m6598S4(getIntent().getIntExtra("initialShowIndex", 0), getIntent().getStringExtra("stateId"), getIntent().getStringExtra("next"), getIntent().getBooleanExtra("needAppendFeed", false), getIntent().getStringExtra("userId"), getIntent().getStringExtra("from"), getIntent().getBooleanExtra("stateSquare", false))).i();
        ((Act) this).act.fragmentManager().e0();
        return null;
    }

    /* JADX INFO: renamed from: n2 */
    public View m6702n2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c3i.m9093b(this, layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && NullChecker.a(intent) && NullChecker.a(intent.getExtras())) {
            if (i2 == 10087 && NullChecker.a(this.f4223o)) {
                this.f4223o.m6829s6(intent.getExtras().getString("type"), intent.getExtras().getString("id"), intent.getExtras().getString("uid"));
            }
            if (i2 == 10088 && NullChecker.a(this.f4223o)) {
                this.f4223o.m6830t6(intent.getExtras().getInt("code"));
            }
        }
    }

    public void onBackPressed() {
        if (!this.f4233y) {
            finish();
            return;
        }
        e51.J(this.f4234z);
        zvf0.r("e_meet_back", "p_meet_greet");
        m6705u2();
    }

    public void onDialogAttachToWindow(Dialog dialog) {
        super/*com.p1.mobile.android.app.Act*/.onDialogAttachToWindow(dialog);
        if (this.f4232x == 0) {
            b<j760<Boolean, Boolean>> bVar = f4210B;
            Boolean bool = Boolean.FALSE;
            bVar.onNext(new j760(bool, bool));
        }
    }

    public void onDialogDetachFromWindow(Dialog dialog) {
        super/*com.p1.mobile.android.app.Act*/.onDialogDetachFromWindow(dialog);
        if (this.f4232x == 0) {
            f4210B.onNext(new j760(Boolean.TRUE, Boolean.FALSE));
        }
    }

    public void onPauseLifecycle() {
        super.onPauseLifecycle();
        m6706v2();
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public View m6703p() {
        return this.f4227s;
    }

    /* JADX INFO: renamed from: s2 */
    public void m6704s2() {
        ((PutongAct) this).pageHelper.q("p_meet_greet");
        ((PutongAct) this).pageHelper.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        setLightStatusBar(1024);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().clearFlags(67108864);
        getWindow().setStatusBarColor(0);
        setStatusBarColor(0);
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    public void stop() {
    }

    /* JADX INFO: renamed from: u2 */
    public void m6705u2() {
        if (NullChecker.a(this.f4223o)) {
            this.f4223o.m6835x6();
        }
        this.f4233y = false;
        m6704s2();
        this.f4221m.stopAnimation();
        xdl0.M(this.f4215g, false);
        this.f4215g.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: v2 */
    public void m6706v2() {
        if (TextUtils.isEmpty(this.f4230v)) {
            return;
        }
        d.l().k(this.f4230v);
        this.f4230v = null;
    }

    /* JADX INFO: renamed from: w */
    public void m6707w() {
    }

    /* JADX INFO: renamed from: w2 */
    public boolean m6708w2() {
        return ((List) f4209A.e()).size() > 0 && ((List) f4209A.e()).get(0) != null && ((DbObject) FeedModule.m1140H().me_()).id.equals(((BubbleInfo) ((List) f4209A.e()).get(0)).owner.f264id);
    }
}
