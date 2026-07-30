package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p000p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.helpers.performance.PerformanceLogUtil;
import com.p1.mobile.putong.core.ui.profile.helpers.performance.ProfileLogEntity;
import com.p1.mobile.putong.core.ui.profile.profilelist.AdmobMedia;
import com.p1.mobile.putong.core.ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Callable;
import l.bfd0;
import l.c4g0;
import l.cfd0;
import l.d30;
import l.dbl0;
import l.e30;
import l.eb2;
import l.f6c0;
import l.ftd0;
import l.gak;
import l.j760;
import l.jo0;
import l.mkd0;
import l.o6j0;
import l.pk4;
import l.q660;
import l.qib0;
import l.r4w;
import l.t100;
import l.tm90;
import l.u4c0;
import l.upa;
import l.v9j;
import l.vwb;
import l.w0c0;
import l.w9a0;
import l.w9j;
import l.xdl0;
import l.xij0;
import l.zvf0;
import p009l.ce50;
import p009l.lra0;
import p009l.o7r;
import p009l.plf;
import p009l.sfh0;
import p009l.zub;
import p009l.zwk;
import rx.c;
import rx.schedulers.Schedulers;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardIntlPictureViewOpt extends RoundFrameLayout {

    /* JADX INFO: renamed from: A */
    public boolean f2400A;

    /* JADX INFO: renamed from: B */
    public boolean f2401B;

    /* JADX INFO: renamed from: b */
    public VPager_SquaredRefactor f2402b;

    /* JADX INFO: renamed from: c */
    public VFrame f2403c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f2404d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f2405e;

    /* JADX INFO: renamed from: f */
    public final ViewPager.j f2406f;

    /* JADX INFO: renamed from: g */
    public C0211e f2407g;

    /* JADX INFO: renamed from: h */
    public int f2408h;

    /* JADX INFO: renamed from: i */
    public boolean f2409i;

    /* JADX INFO: renamed from: j */
    public User f2410j;

    /* JADX INFO: renamed from: k */
    public CoreSuggested.UserInfo f2411k;

    /* JADX INFO: renamed from: l */
    public String f2412l;

    /* JADX INFO: renamed from: m */
    public String f2413m;

    /* JADX INFO: renamed from: n */
    public sfh0 f2414n;

    /* JADX INFO: renamed from: o */
    public ExpandedImageSwitchView.InterfaceC0131b f2415o;

    /* JADX INFO: renamed from: p */
    public ce50 f2416p;

    /* JADX INFO: renamed from: q */
    public int f2417q;

    /* JADX INFO: renamed from: r */
    public boolean f2418r;

    /* JADX INFO: renamed from: s */
    public boolean f2419s;

    /* JADX INFO: renamed from: t */
    public zwk f2420t;

    /* JADX INFO: renamed from: u */
    public AdmobMedia f2421u;

    /* JADX INFO: renamed from: v */
    public boolean f2422v;

    /* JADX INFO: renamed from: w */
    public c4g0 f2423w;

    /* JADX INFO: renamed from: x */
    public c4g0 f2424x;

    /* JADX INFO: renamed from: y */
    public View f2425y;

    /* JADX INFO: renamed from: z */
    public String f2426z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$a */
    public class C0207a implements ViewPager.j {
        public C0207a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            CardIntlPictureViewOpt.this.f2408h = i;
            CardIntlPictureViewOpt.this.m2990B(i);
            CardIntlPictureViewOpt.this.m3010V(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$b */
    public class ViewOnTouchListenerC0208b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ce50 f2428a;

        public ViewOnTouchListenerC0208b(ce50 ce50Var) {
            this.f2428a = ce50Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ce50 ce50Var = this.f2428a;
            if (ce50Var == null || ce50Var.mo1904l() == null) {
                return false;
            }
            this.f2428a.mo1904l().m18417p(CardIntlPictureViewOpt.this.f2402b);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$c */
    public class RunnableC0209c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f2430a;

        public RunnableC0209c(List list) {
            this.f2430a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt.m3027y(cardIntlPictureViewOpt.f2407g, this.f2430a.size());
            CardIntlPictureViewOpt.this.f2407g.m3047J(this.f2430a);
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt2.m3018d0(cardIntlPictureViewOpt2.f2408h, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$d */
    public class C0210d implements e30<Throwable> {
        public C0210d() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CardIntlPictureViewOpt.this.f2412l = "";
            gak.c(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$e */
    public class C0211e extends eb2 {

        /* JADX INFO: renamed from: e */
        public final Stack<View> f2433e;

        /* JADX INFO: renamed from: f */
        public List<Media> f2434f;

        /* JADX INFO: renamed from: g */
        public int f2435g;

        /* JADX INFO: renamed from: h */
        public long f2436h;

        /* JADX INFO: renamed from: i */
        public int f2437i;

        public C0211e() {
            this.f2433e = new Stack<>();
            this.f2434f = new ArrayList();
            this.f2435g = 0;
            this.f2436h = 0L;
            this.f2437i = -1;
        }

        /* JADX INFO: renamed from: q */
        public static /* synthetic */ Integer m3030q(j760 j760Var) {
            return (Integer) j760Var.a;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m3039A() {
            ArrayList arrayList = new ArrayList(this.f2434f);
            arrayList.remove(CardIntlPictureViewOpt.this.f2421u);
            CardIntlPictureViewOpt.this.f2417q = -1;
            CardIntlPictureViewOpt.this.f2407g.m3047J(arrayList);
            CardIntlPictureViewOpt.this.f2405e.setIndicatorCount(arrayList.size());
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m3040C(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                xdl0.M(pictureView.d, false);
            }
            m3046I(pictureView, this.f2434f.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m3041D(PictureView pictureView, boolean z, View view) {
            int iT = pictureView.T();
            if (iT == -1 && CardIntlPictureViewOpt.this.f2402b.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = CardIntlPictureViewOpt.this.f2402b;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iT == 1 && CardIntlPictureViewOpt.this.f2402b.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = CardIntlPictureViewOpt.this.f2402b;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else if (iT == 0) {
                if (z && (CardIntlPictureViewOpt.this.m2988w() instanceof NewUI1ContainerActivity)) {
                    CardIntlPictureViewOpt.this.m2988w().startActivity(ProfileAct.p2(CardIntlPictureViewOpt.this.m2988w(), ((DbObject) CardIntlPictureViewOpt.this.f2410j).id, "profile_frag_picture", false, true));
                } else {
                    CardIntlPictureViewOpt.this.m2988w().finish();
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m3042E(View view) {
            CardIntlPictureViewOpt.this.m3023i0();
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m3043F(View view) {
            CardIntlPictureViewOpt.this.m3020f0();
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m3044G(View view) {
            CardIntlPictureViewOpt.this.m3028z();
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m3045H(int i, View view) {
            zvf0.u("e_invisible_photo_upload", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i)), vwb.Y("invisible_photo_is_thumbnail", Boolean.FALSE)});
            q660.a(CardIntlPictureViewOpt.this.m2988w(), "from_profile_upload_photo");
        }

        /* JADX INFO: renamed from: I */
        public void m3046I(PictureView pictureView, Media media, int i) {
            pictureView.Y(media, i);
            m3048K(pictureView, media);
        }

        /* JADX INFO: renamed from: J */
        public void m3047J(List<Media> list) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = list.size();
            if (!Objects.equals(this.f2434f, list) || CardIntlPictureViewOpt.this.f2402b.getChildCount() <= 0 || Math.abs(jCurrentTimeMillis - this.f2436h) >= 300 || size != this.f2437i) {
                this.f2436h = jCurrentTimeMillis;
                this.f2434f = list;
                this.f2435g = getCount();
                notifyDataSetChanged();
                this.f2437i = size;
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                if (cardIntlPictureViewOpt.f2418r) {
                    return;
                }
                cardIntlPictureViewOpt.m3026x();
            }
        }

        /* JADX INFO: renamed from: K */
        public final void m3048K(PictureView pictureView, Media media) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) CardIntlPictureViewOpt.this.f2410j).id);
            if (NullChecker.a(pictureView) && NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
                qib0.G.L0(pictureView.a, media.url);
            }
        }

        public int getCount() {
            return this.f2434f.size();
        }

        public int getItemPosition(Object obj) {
            int i = this.f2435g;
            if (i <= 0) {
                return super/*l.w660*/.getItemPosition(obj);
            }
            this.f2435g = i - 1;
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m3049o(ViewGroup viewGroup, int i, Object obj) {
            if (i == CardIntlPictureViewOpt.this.f2402b.getCurrentItem()) {
                CardIntlPictureViewOpt.this.m3011W(false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f2433e.add((PictureView) obj);
            }
        }

        /* JADX INFO: renamed from: p */
        public Object m3050p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f2434f.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(CardIntlPictureViewOpt.this.m2988w());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                w9a0.m().A(frameLayout, CardIntlPictureViewOpt.this.m2988w(), new d30() { // from class: l.gk4
                    public final void call() {
                        this.f13613a.m3039A();
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f2433e.isEmpty() ? (PictureView) this.f2433e.pop() : (PictureView) LayoutInflater.from(CardIntlPictureViewOpt.this.getContext()).inflate(f6c0.ze, viewGroup, false);
            final boolean zIsMe = CardIntlPictureViewOpt.this.f2410j.isMe();
            int iA = tm90.d().a(CardIntlPictureViewOpt.this.f2410j);
            if (NullChecker.a(CardIntlPictureViewOpt.this.f2410j) && !CardIntlPictureViewOpt.this.f2410j.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(CardIntlPictureViewOpt.this.f2410j.isFemale());
            }
            if (iA != -1) {
                if (CardIntlPictureViewOpt.this.f2419s) {
                    pictureView.A.setVisibility(8);
                    pictureView.B.setVisibility(8);
                } else {
                    pictureView.A.setVisibility(0);
                    pictureView.B.setVisibility(0);
                }
                tm90.d().i(iA, pictureView.C);
            } else {
                pictureView.A.setVisibility(8);
                pictureView.B.setVisibility(8);
            }
            String str = CardIntlPictureViewOpt.this.f2411k.from;
            pictureView.setFrom(str);
            pictureView.a.getHierarchy().A(CardIntlPictureViewOpt.this.m2988w().getResources().getDrawable(w0c0.P));
            pictureView.J(true, false);
            pictureView.a.getHierarchy().w(ftd0.i);
            pictureView.k0();
            CardIntlPictureViewOpt.this.f2418r = false;
            if ("live_profile_voice_mask_mode".equals(str)) {
                m3046I(pictureView, this.f2434f.get(i), 0);
            } else if (plf.m20503f(CardIntlPictureViewOpt.this.f2410j)) {
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                cardIntlPictureViewOpt.f2418r = true;
                r4w r4wVar = r4w.INSTANCE;
                if (r4wVar.C(((DbObject) cardIntlPictureViewOpt.f2410j).id)) {
                    m3046I(pictureView, this.f2434f.get(i), 0);
                } else {
                    n(CardIntlPictureViewOpt.this.m2988w(), r4wVar.F(((DbObject) CardIntlPictureViewOpt.this.f2410j).id)).map(new w9j() { // from class: l.hk4
                        public final Object call(Object obj) {
                            return CardIntlPictureViewOpt.C0211e.m3030q((j760) obj);
                        }
                    }).subscribe(mkd0.G(new e30() { // from class: l.ik4
                        public final void call(Object obj) {
                            this.f14676a.m3040C(pictureView, i, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(str)) {
                    xdl0.M(pictureView.d, true);
                }
            } else {
                m3046I(pictureView, this.f2434f.get(i), -1);
            }
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) CardIntlPictureViewOpt.this.f2410j).id);
            if (NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
                xdl0.M(pictureView.d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.jk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15215a.m3041D(pictureView, zIsMe, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = o7r.m19649a(CardIntlPictureViewOpt.this.m2988w()).inflate(f6c0.n9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            xdl0.c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(u4c0.c);
            View viewFindViewById2 = viewInflate.findViewById(u4c0.d);
            View viewFindViewById3 = viewInflate.findViewById(u4c0.f);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.kk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15742a.m3042E(view);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.lk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16203a.m3043F(view);
                }
            });
            xdl0.M(viewFindViewById3, true);
            xdl0.C0(viewFindViewById3, t100.S);
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.mk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16983a.m3044G(view);
                }
            });
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (upa.u2()) {
                xdl0.E0(pictureView.z, new View.OnClickListener() { // from class: l.nk4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f17550a.m3045H(i, view);
                    }
                });
            }
            return pictureView;
        }

        /* JADX INFO: renamed from: z */
        public View m3051z(int i) {
            if (CardIntlPictureViewOpt.this.f2402b == null) {
                return null;
            }
            for (int i2 = 0; i2 < CardIntlPictureViewOpt.this.f2402b.getChildCount(); i2++) {
                Object tag = CardIntlPictureViewOpt.this.f2402b.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return CardIntlPictureViewOpt.this.f2402b.getChildAt(i2);
                }
            }
            return null;
        }
    }

    public CardIntlPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f2406f = new C0207a();
        this.f2407g = new C0211e();
        this.f2408h = 0;
        this.f2409i = true;
        this.f2412l = "";
        this.f2413m = "";
        this.f2417q = -1;
        this.f2418r = false;
        this.f2419s = false;
        this.f2421u = new AdmobMedia();
        this.f2422v = false;
        this.f2400A = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2971e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m3005Q(Drawable drawable) {
        this.f2425y = o7r.m19649a(m2988w()).inflate(f6c0.B8, (ViewGroup) this, false);
        mkd0.z(this.f2423w);
        mkd0.z(this.f2424x);
        VImage vImageFindViewById = this.f2425y.findViewById(u4c0.c2);
        VText vTextFindViewById = this.f2425y.findViewById(u4c0.O6);
        VText vTextFindViewById2 = this.f2425y.findViewById(u4c0.Db);
        VText vTextFindViewById3 = this.f2425y.findViewById(u4c0.y1);
        if (NullChecker.a(this.f2410j)) {
            vTextFindViewById.setText(TEnum.equals(this.f2410j.gender, "female") ? m2988w().getString(R.string.d1) : m2988w().getString(R.string.e1));
            vTextFindViewById2.setText(TEnum.equals(this.f2410j.gender, "female") ? m2988w().getString(R.string.b1) : m2988w().getString(R.string.c1));
            vTextFindViewById3.setText(TEnum.equals(this.f2410j.gender, "female") ? m2988w().getString(R.string.f1) : m2988w().getString(R.string.g1));
        }
        if (this.f2411k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m2064o().m2077s()) {
            vTextFindViewById3.setText(m2988w().getString(R.string.yk));
            CoreModule.c.e0.W0.put(Boolean.TRUE);
        } else {
            CoreModule.c.m0.w0.put(Boolean.TRUE);
        }
        lra0.f16375w = true;
        vImageFindViewById.setBackground(drawable);
        this.f2420t.f23985g.addView(this.f2425y);
        xdl0.E0(this.f2425y, new View.OnClickListener() { // from class: l.yj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23103a.m3000L(view);
            }
        });
        CoreModule.c.m0.J0.onNext(Boolean.TRUE);
        this.f2400A = true;
        lra0.f16374v = true;
        this.f2426z = ((DbObject) this.f2410j).id;
        m3007S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: w */
    public Act m2988w() {
        Act actE = xdl0.E(this);
        if (actE instanceof Act) {
            return actE;
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m2989A(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f2402b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.setPreferVPagerOnHorizontalConflict(!z);
        this.f2402b.setScrollble(!z);
    }

    /* JADX INFO: renamed from: B */
    public final void m2990B(int i) {
        m3011W(false);
        PictureView pictureViewM3051z = this.f2407g.m3051z(i);
        if (!(pictureViewM3051z instanceof PictureView)) {
            if (!w9a0.m().o()) {
                w9a0.m().D(true);
            }
            o6j0.h("e_clone_profile_photo_ads", "p_suggest_users_home_view", new o6j0.a[0]);
            return;
        }
        PictureView pictureView = pictureViewM3051z;
        if (this.f2409i && xij0.d0() && !this.f2418r && (pictureView.G instanceof Video)) {
            pictureView.A(true);
            pictureView.V();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public void m2991C(boolean z, boolean z2) {
        lra0.f16374v = false;
        View view = this.f2425y;
        if (view == null) {
            return;
        }
        this.f2420t.f23985g.removeView(view);
        this.f2400A = false;
        CoreModule.c.m0.J0.onNext(Boolean.FALSE);
        if (lra0.f16375w) {
            lra0.f16375w = false;
            zvf0.D("e_user_guide_flash", "p_suggest_users_home_view", new j760[]{vwb.Y("play_status", z2 ? "01" : "02")});
        }
        invalidate();
        this.f2425y = null;
        this.f2426z = null;
        if (z) {
            m3026x();
        }
        mkd0.z(this.f2423w);
        mkd0.z(this.f2424x);
    }

    /* JADX INFO: renamed from: D */
    public boolean m2992D() {
        if (!m3009U() || getCurrentView() == null || !getCurrentView().a.getHierarchy().r()) {
            return false;
        }
        m3022h0();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m2993E() {
        CoreSuggested.UserInfo userInfo = this.f2411k;
        return (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m2064o().m2077s()) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m2994F() {
        return this.f2417q >= 0 && getCurrentItem() == this.f2417q;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m2995G(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.a(user) && NullChecker.a(userInfo)) {
            if (CoreModule.c.m0.L6(userInfo.id) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f2401B = z;
        } else {
            this.f2401B = false;
        }
        return this.f2401B;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m2996H() {
        ce50 ce50Var = this.f2416p;
        return ce50Var != null && ce50Var.mo1903J() != null && TextUtils.equals(((DbObject) this.f2410j).id, (CharSequence) this.f2416p.mo1903J().a) && ((Boolean) this.f2416p.mo1903J().b).booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m2997I(CoreSuggested.UserInfo userInfo) {
        return NullChecker.a(userInfo) && CoreModule.c.m0.M6(userInfo.id);
    }

    /* JADX INFO: renamed from: J */
    public boolean m2998J() {
        return this.f2400A;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m2999K(Boolean bool) {
        this.f2412l = "";
        if (!bool.booleanValue()) {
            this.f2417q = -1;
            this.f2413m = "";
        } else {
            if (this.f2415o == null) {
                return;
            }
            this.f2413m = ((DbObject) this.f2410j).id;
            m3024j0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m3000L(View view) {
        m2991C(true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Bitmap m3001M() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ c m3002N() {
        return c.fromCallable(new Callable() { // from class: l.ek4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f12592a.m3001M();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ c m3003O(Bitmap bitmap) {
        return c.just(xij0.p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Drawable m3004P(Bitmap bitmap) {
        bfd0 bfd0VarA = cfd0.a(m2988w().getResources(), bitmap);
        bfd0VarA.e(t100.o);
        return bfd0VarA;
    }

    /* JADX INFO: renamed from: R */
    public final void m3006R() {
        if (TextUtils.isEmpty(this.f2413m) && TextUtils.isEmpty(this.f2412l)) {
            this.f2412l = ((DbObject) this.f2410j).id;
            m2988w().duringCreated(w9a0.m().y(m2988w(), true)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.fk4
                public final void call(Object obj) {
                    this.f13070a.m2999K((Boolean) obj);
                }
            }, new C0210d()));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m3007S() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2425y.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: T */
    public boolean m3008T() {
        if (!m2998J()) {
            return false;
        }
        m2991C(true, false);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public boolean m3009U() {
        if (this.f2422v) {
            return false;
        }
        if ((!IntlCountryCodeController.v() || this.f2411k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m2064o().m2077s()) && !m2998J() && this.f2410j != null && ((!NullChecker.a(this.f2420t.f23979b0) || !xdl0.O0(this.f2420t.f23979b0)) && !m2995G(this.f2410j, this.f2411k) && !m2997I(this.f2411k))) {
            CardInfoRenderFrom cardInfoRenderFrom = this.f2411k.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            if (cardInfoRenderFrom == cardInfoRenderFrom2 && !ExpandedCardStyleHelper.m2064o().m2077s() && !((Boolean) CoreModule.c.m0.w0.get()).booleanValue()) {
                return true;
            }
            if (!((Boolean) CoreModule.c.e0.W0.get()).booleanValue() && (this.f2411k.renderFrom != cardInfoRenderFrom2 || ExpandedCardStyleHelper.m2064o().m2077s())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final void m3010V(int i) {
        ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b;
        if (this.f2414n == null || (interfaceC0131b = this.f2415o) == null) {
            return;
        }
        interfaceC0131b.mo2316f(i, this.f2417q == i);
        List<Media> listM22132a = this.f2414n.m22132a();
        if (listM22132a == null || listM22132a.isEmpty() || i < 0 || i >= listM22132a.size()) {
            return;
        }
        this.f2415o.mo2314d(i, listM22132a.get(i), false);
        int i2 = i + 1;
        if (i2 < listM22132a.size()) {
            m3012X(listM22132a.get(i2));
        }
        int i3 = i - 1;
        if (i3 >= 0) {
            m3012X(listM22132a.get(i3));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m3011W(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f2402b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        dbl0.a(vPager_SquaredRefactor, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m3012X(Media media) {
        ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b = this.f2415o;
        boolean z = interfaceC0131b != null && interfaceC0131b.mo2315e(media);
        if (!TEnum.equals(media.status, "raw")) {
            zub.m25975o(media, z);
        } else if (media instanceof Video) {
            qib0.G.x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m3013Y() {
        sfh0 sfh0Var = this.f2414n;
        if (sfh0Var == null || !m3019e0(sfh0Var.m22132a().size())) {
            return;
        }
        m3006R();
    }

    /* JADX INFO: renamed from: Z */
    public void m3014Z(User user, CoreSuggested.UserInfo userInfo, sfh0 sfh0Var, int i, ce50 ce50Var) {
        if (user == null || sfh0Var == null) {
            return;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f2402b.setWidthHeightRate(0.7f);
        }
        User user2 = this.f2410j;
        if (user2 == null || !TextUtils.equals(((DbObject) user2).id, ((DbObject) user).id)) {
            this.f2408h = 0;
            this.f2413m = "";
            this.f2417q = -1;
            this.f2412l = "";
        }
        this.f2410j = user;
        this.f2411k = userInfo;
        this.f2414n = sfh0Var;
        this.f2416p = ce50Var;
        ArrayList arrayList = new ArrayList(sfh0Var.m22132a());
        if (m3019e0(arrayList.size())) {
            m3006R();
        } else {
            this.f2413m = "";
            this.f2417q = -1;
            this.f2412l = "";
        }
        if (i == 0) {
            m3027y(this.f2407g, arrayList.size());
            this.f2407g.m3047J(arrayList);
            m3018d0(this.f2408h, false);
            if (ce50Var != null && ce50Var.mo1904l() != null) {
                ce50Var.mo1904l().m18417p(this.f2402b);
            }
            this.f2402b.setOnTouchListener(new ViewOnTouchListenerC0208b(ce50Var));
        } else {
            this.f2402b.post(new RunnableC0209c(arrayList));
        }
        if (userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            m2992D();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m3015a0(sfh0 sfh0Var, User user, ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b) {
        this.f2414n = sfh0Var;
        this.f2415o = interfaceC0131b;
    }

    /* JADX INFO: renamed from: b0 */
    public void m3016b0() {
        View view;
        try {
            if (!m2998J() || (view = this.f2425y) == null) {
                return;
            }
            this.f2420t.f23985g.removeView(view);
            this.f2400A = false;
            this.f2425y = null;
            mkd0.z(this.f2423w);
            mkd0.z(this.f2424x);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m3017c0() {
        CoreSuggested.UserInfo userInfo = this.f2411k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        this.f2414n = null;
        this.f2415o = null;
        this.f2418r = false;
        this.f2417q = -1;
        this.f2413m = "";
        this.f2412l = "";
    }

    /* JADX INFO: renamed from: d0 */
    public void m3018d0(int i, boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f2402b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.T(i, z);
        NewPictureContainerIndicator newPictureContainerIndicator = this.f2405e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m922b(i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m3019e0(int i) {
        if ((TextUtils.isEmpty(this.f2413m) || !TextUtils.equals(this.f2413m, ((DbObject) this.f2410j).id)) && i >= 2 && !m2996H() && !m2993E()) {
            return w9a0.m().p(this.f2410j);
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m3020f0() {
        ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b;
        if (m3008T() || m2992D() || this.f2415o == null) {
            return;
        }
        if (this.f2415o.m2311a(getCurrentItem())) {
            return;
        }
        boolean zM3021g0 = m3021g0(false);
        if (!zM3021g0 && (interfaceC0131b = this.f2415o) != null) {
            interfaceC0131b.mo2313c(false);
        }
        CoreSuggested.UserInfo userInfo = this.f2411k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m2064o().m2077s()) {
            lra0.m17993g("p_suggest_user_profile_info_view", zM3021g0, true, this.f2410j, "");
        } else {
            lra0.m17993g("p_suggest_users_home_view", zM3021g0, true, this.f2410j, "");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m3021g0(boolean z) {
        sfh0 sfh0Var;
        List<Media> listM22132a;
        boolean z2;
        int i;
        int i2;
        if (this.f2402b == null || (sfh0Var = this.f2414n) == null || this.f2415o == null || (listM22132a = sfh0Var.m22132a()) == null || listM22132a.isEmpty()) {
            return false;
        }
        int currentItem = getCurrentItem();
        int size = z ? currentItem + 1 : currentItem - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM22132a.size()) {
            size = listM22132a.size() - 1;
        }
        if (currentItem == size) {
            if (!z || this.f2417q <= 0 || currentItem >= this.f2407g.f2434f.size()) {
                z2 = false;
            } else {
                size = this.f2417q;
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        } else {
            z2 = false;
        }
        this.f2402b.T(size, false);
        if (!z2) {
            this.f2415o.mo2314d(size, listM22132a.get(size), false);
        }
        NewPictureContainerIndicator newPictureContainerIndicator = this.f2405e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m922b(size);
        }
        if (!z2) {
            if (z && (i2 = size + 1) < listM22132a.size()) {
                m3012X(listM22132a.get(i2));
            } else if (!z && (i = size - 1) >= 0) {
                m3012X(listM22132a.get(i));
            }
        }
        return true;
    }

    public int getCurrentItem() {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f2402b;
        if (vPager_SquaredRefactor != null) {
            return vPager_SquaredRefactor.getCurrentItem();
        }
        return 0;
    }

    public int getCurrentPosition() {
        return this.f2408h;
    }

    @Nullable
    public PictureView getCurrentView() {
        PictureView pictureViewM3051z = this.f2407g.m3051z(getCurrentItem());
        if (pictureViewM3051z instanceof PictureView) {
            return pictureViewM3051z;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public void m3022h0() {
        o6j0.h("e_card_guide_overlay", "p_suggest_users_home_view", new o6j0.a[0]);
        if ((this.f2410j.media(getCurrentPosition()) instanceof Video) && xij0.d0() && NullChecker.a(getCurrentView())) {
            getCurrentView().U();
        }
        mkd0.z(this.f2423w);
        this.f2423w = m2988w().duringCreated(((c) new v9j() { // from class: l.zj4
            public final Object call() {
                return this.f23706a.m3002N();
            }
        }.call()).compose(mkd0.R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.ak4
            public final Object call(Object obj) {
                return this.f9552a.m3003O((Bitmap) obj);
            }
        }).compose(mkd0.y()).map(new w9j() { // from class: l.bk4
            public final Object call(Object obj) {
                return this.f10147a.m3004P((Bitmap) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ck4
            public final void call(Object obj) {
                this.f10651a.m3005Q((Drawable) obj);
            }
        }, new e30() { // from class: l.dk4
            public final void call(Object obj) {
                CardIntlPictureViewOpt.m2971e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public void m3023i0() {
        ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b;
        if (m3008T() || m2992D() || this.f2415o == null) {
            return;
        }
        if (this.f2415o.m2311a(getCurrentItem())) {
            return;
        }
        boolean zM3021g0 = m3021g0(true);
        if (!zM3021g0 && (interfaceC0131b = this.f2415o) != null) {
            interfaceC0131b.mo2313c(true);
        }
        CoreSuggested.UserInfo userInfo = this.f2411k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m2064o().m2077s()) {
            lra0.m17993g("p_suggest_user_profile_info_view", zM3021g0, false, this.f2410j, "");
        } else {
            lra0.m17993g("p_suggest_users_home_view", zM3021g0, false, this.f2410j, "");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m3024j0() {
        if (m2993E() || m2996H() || !w9a0.m().p(this.f2410j)) {
            if (this.f2407g.f2434f.contains(this.f2421u)) {
                ArrayList arrayList = new ArrayList(this.f2414n.m22132a());
                this.f2417q = -1;
                this.f2407g.m3047J(arrayList);
                this.f2405e.setIndicatorCount(arrayList.size());
                return;
            }
            return;
        }
        if (!TextUtils.equals(this.f2413m, ((DbObject) this.f2410j).id) || this.f2407g.f2434f.contains(this.f2421u)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f2414n.m22132a());
        this.f2417q = arrayList2.size();
        arrayList2.add(this.f2421u);
        this.f2407g.m3047J(arrayList2);
        this.f2405e.setIndicatorCount(arrayList2.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3025v(this);
        this.f2402b.setWidthHeightRate(0.6f);
        this.f2402b.setOffscreenPageLimit(1);
        this.f2402b.setPreferVPagerOnHorizontalConflict(false);
        this.f2402b.setScrollble(false);
        this.f2402b.setAllowZoom(true);
    }

    public void setAutoPlayEnabled(boolean z) {
        this.f2409i = z;
    }

    public void setCardStyleChangeProgress(float f) {
        CoreSuggested.UserInfo userInfo = this.f2411k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        float f2 = CardHeadLayoutV2.f2373w;
        if (f2 > 0.6f) {
            this.f2402b.setWidthHeightRate(((f2 - 0.6f) * f) + 0.6f);
        }
    }

    public void setCertBtnShowing(boolean z) {
        this.f2419s = z;
        PictureView currentView = getCurrentView();
        if (currentView != null) {
            xdl0.M(currentView.A, !z);
            xdl0.M(currentView.B, !z);
        }
    }

    public void setParentHolder(zwk zwkVar) {
        this.f2420t = zwkVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m3025v(View view) {
        pk4.a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public void m3026x() {
        if (xij0.d0() && NullChecker.a(getCurrentView()) && (getCurrentView().G instanceof Video)) {
            getCurrentView().V();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m3027y(eb2 eb2Var, int i) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f2402b;
        if (vPager_SquaredRefactor == null || this.f2405e == null) {
            return;
        }
        vPager_SquaredRefactor.setAdapter(eb2Var);
        this.f2402b.i();
        this.f2402b.d(this.f2406f);
        this.f2405e.setupWithPager(this.f2402b);
        this.f2405e.setIndicatorCount(i);
        xdl0.M0(this.f2404d, i > 1);
        this.f2405e.setSelectedIndex(this.f2402b.getCurrentItem());
    }

    /* JADX INFO: renamed from: z */
    public void m3028z() {
        ExpandedImageSwitchView.InterfaceC0131b interfaceC0131b;
        if (m3008T() || m2992D() || (interfaceC0131b = this.f2415o) == null) {
            return;
        }
        interfaceC0131b.mo2312b();
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2406f = new C0207a();
        this.f2407g = new C0211e();
        this.f2408h = 0;
        this.f2409i = true;
        this.f2412l = "";
        this.f2413m = "";
        this.f2417q = -1;
        this.f2418r = false;
        this.f2419s = false;
        this.f2421u = new AdmobMedia();
        this.f2422v = false;
        this.f2400A = false;
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2406f = new C0207a();
        this.f2407g = new C0211e();
        this.f2408h = 0;
        this.f2409i = true;
        this.f2412l = "";
        this.f2413m = "";
        this.f2417q = -1;
        this.f2418r = false;
        this.f2419s = false;
        this.f2421u = new AdmobMedia();
        this.f2422v = false;
        this.f2400A = false;
    }
}
