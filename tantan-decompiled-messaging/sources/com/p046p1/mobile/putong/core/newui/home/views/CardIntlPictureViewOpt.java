package com.p046p1.mobile.putong.core.newui.home.views;

import android.app.Activity;
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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p046p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.AdmobMedia;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.roundcorners.view.RoundFrameLayout;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.bfd0;
import p149l.c4g0;
import p149l.ce50;
import p149l.cfd0;
import p149l.d30;
import p149l.dbl0;
import p149l.e30;
import p149l.eb2;
import p149l.f6c0;
import p149l.ftd0;
import p149l.gak;
import p149l.j760;
import p149l.jo0;
import p149l.lra0;
import p149l.mkd0;
import p149l.o6j0;
import p149l.o7r;
import p149l.pk4;
import p149l.plf;
import p149l.q660;
import p149l.qib0;
import p149l.r4w;
import p149l.sfh0;
import p149l.t100;
import p149l.tm90;
import p149l.u4c0;
import p149l.upa;
import p149l.v9j;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9a0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xij0;
import p149l.zub;
import p149l.zvf0;
import p149l.zwk;

/* JADX INFO: loaded from: classes11.dex */
public class CardIntlPictureViewOpt extends RoundFrameLayout {

    /* JADX INFO: renamed from: A */
    public boolean f23622A;

    /* JADX INFO: renamed from: B */
    public boolean f23623B;

    /* JADX INFO: renamed from: b */
    public VPager_SquaredRefactor f23624b;

    /* JADX INFO: renamed from: c */
    public VFrame f23625c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f23626d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f23627e;

    /* JADX INFO: renamed from: f */
    public final ViewPager.InterfaceC0716j f23628f;

    /* JADX INFO: renamed from: g */
    public C8047e f23629g;

    /* JADX INFO: renamed from: h */
    public int f23630h;

    /* JADX INFO: renamed from: i */
    public boolean f23631i;

    /* JADX INFO: renamed from: j */
    public User f23632j;

    /* JADX INFO: renamed from: k */
    public CoreSuggested.UserInfo f23633k;

    /* JADX INFO: renamed from: l */
    public String f23634l;

    /* JADX INFO: renamed from: m */
    public String f23635m;

    /* JADX INFO: renamed from: n */
    public sfh0 f23636n;

    /* JADX INFO: renamed from: o */
    public ExpandedImageSwitchView.InterfaceC7967b f23637o;

    /* JADX INFO: renamed from: p */
    public ce50 f23638p;

    /* JADX INFO: renamed from: q */
    public int f23639q;

    /* JADX INFO: renamed from: r */
    public boolean f23640r;

    /* JADX INFO: renamed from: s */
    public boolean f23641s;

    /* JADX INFO: renamed from: t */
    public zwk f23642t;

    /* JADX INFO: renamed from: u */
    public AdmobMedia f23643u;

    /* JADX INFO: renamed from: v */
    public boolean f23644v;

    /* JADX INFO: renamed from: w */
    public c4g0 f23645w;

    /* JADX INFO: renamed from: x */
    public c4g0 f23646x;

    /* JADX INFO: renamed from: y */
    public View f23647y;

    /* JADX INFO: renamed from: z */
    public String f23648z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$a */
    public class C8043a implements ViewPager.InterfaceC0716j {
        public C8043a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            CardIntlPictureViewOpt.this.f23630h = i;
            CardIntlPictureViewOpt.this.m38983B(i);
            CardIntlPictureViewOpt.this.m39003V(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$b */
    public class ViewOnTouchListenerC8044b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ce50 f23650a;

        public ViewOnTouchListenerC8044b(ce50 ce50Var) {
            this.f23650a = ce50Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ce50 ce50Var = this.f23650a;
            if (ce50Var == null || ce50Var.mo37930l() == null) {
                return false;
            }
            this.f23650a.mo37930l().m154080p(CardIntlPictureViewOpt.this.f23624b);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$c */
    public class RunnableC8045c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f23652a;

        public RunnableC8045c(List list) {
            this.f23652a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt.m39020y(cardIntlPictureViewOpt.f23629g, this.f23652a.size());
            CardIntlPictureViewOpt.this.f23629g.m39040J(this.f23652a);
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt2.m39011d0(cardIntlPictureViewOpt2.f23630h, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$d */
    public class C8046d implements e30<Throwable> {
        public C8046d() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CardIntlPictureViewOpt.this.f23634l = "";
            gak.m125002c(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$e */
    public class C8047e extends eb2 {

        /* JADX INFO: renamed from: e */
        public final Stack<View> f23655e;

        /* JADX INFO: renamed from: f */
        public List<Media> f23656f;

        /* JADX INFO: renamed from: g */
        public int f23657g;

        /* JADX INFO: renamed from: h */
        public long f23658h;

        /* JADX INFO: renamed from: i */
        public int f23659i;

        public C8047e() {
            this.f23655e = new Stack<>();
            this.f23656f = new ArrayList();
            this.f23657g = 0;
            this.f23658h = 0L;
            this.f23659i = -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ Integer m39023q(j760 j760Var) {
            return (Integer) j760Var.f116564a;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m39032A() {
            ArrayList arrayList = new ArrayList(this.f23656f);
            arrayList.remove(CardIntlPictureViewOpt.this.f23643u);
            CardIntlPictureViewOpt.this.f23639q = -1;
            CardIntlPictureViewOpt.this.f23629g.m39040J(arrayList);
            CardIntlPictureViewOpt.this.f23627e.setIndicatorCount(arrayList.size());
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m39033C(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                xdl0.m208344M(pictureView.f28073d, false);
            }
            m39039I(pictureView, this.f23656f.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m39034D(PictureView pictureView, boolean z, View view) {
            int iM43989T = pictureView.m43989T();
            if (iM43989T == -1 && CardIntlPictureViewOpt.this.f23624b.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = CardIntlPictureViewOpt.this.f23624b;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iM43989T == 1 && CardIntlPictureViewOpt.this.f23624b.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = CardIntlPictureViewOpt.this.f23624b;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else if (iM43989T == 0) {
                if (z && (CardIntlPictureViewOpt.this.m38981w() instanceof NewUI1ContainerActivity)) {
                    CardIntlPictureViewOpt.this.m38981w().startActivity(ProfileAct.m50738p2(CardIntlPictureViewOpt.this.m38981w(), CardIntlPictureViewOpt.this.f23632j.f56011id, "profile_frag_picture", false, true));
                } else {
                    CardIntlPictureViewOpt.this.m38981w().m47815F2();
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m39035E(View view) {
            CardIntlPictureViewOpt.this.m39016i0();
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m39036F(View view) {
            CardIntlPictureViewOpt.this.m39013f0();
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m39037G(View view) {
            CardIntlPictureViewOpt.this.m39021z();
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m39038H(int i, View view) {
            zvf0.m220399u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("invisible_photo_location", Integer.valueOf(i)), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            q660.m173125a(CardIntlPictureViewOpt.this.m38981w(), CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO);
        }

        /* JADX INFO: renamed from: I */
        public void m39039I(PictureView pictureView, Media media, int i) {
            pictureView.m43994Y(media, i);
            m39041K(pictureView, media);
        }

        /* JADX INFO: renamed from: J */
        public void m39040J(List<Media> list) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = list.size();
            if (!Objects.equals(this.f23656f, list) || CardIntlPictureViewOpt.this.f23624b.getChildCount() <= 0 || Math.abs(jCurrentTimeMillis - this.f23658h) >= 300 || size != this.f23659i) {
                this.f23658h = jCurrentTimeMillis;
                this.f23656f = list;
                this.f23657g = getCount();
                notifyDataSetChanged();
                this.f23659i = size;
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                if (cardIntlPictureViewOpt.f23640r) {
                    return;
                }
                cardIntlPictureViewOpt.m39019x();
            }
        }

        /* JADX INFO: renamed from: K */
        public final void m39041K(PictureView pictureView, Media media) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(CardIntlPictureViewOpt.this.f23632j.f56011id);
            if (NullChecker.m81303a(pictureView) && NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
                qib0.f154691G.m102331L0(pictureView.f28070a, media.url);
            }
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f23656f.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            int i = this.f23657g;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f23657g = i - 1;
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            if (i == CardIntlPictureViewOpt.this.f23624b.getCurrentItem()) {
                CardIntlPictureViewOpt.this.m39004W(false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f23655e.add((PictureView) obj);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f23656f.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(CardIntlPictureViewOpt.this.m38981w());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                w9a0.m202285m().m202286A(frameLayout, CardIntlPictureViewOpt.this.m38981w(), new d30() { // from class: l.gk4
                    @Override // p149l.d30
                    public final void call() {
                        this.f103148a.m39032A();
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f23655e.isEmpty() ? (PictureView) this.f23655e.pop() : (PictureView) LayoutInflater.from(CardIntlPictureViewOpt.this.getContext()).inflate(f6c0.f96120ze, viewGroup, false);
            final boolean zIsMe = CardIntlPictureViewOpt.this.f23632j.isMe();
            int iM189644a = tm90.m189643d().m189644a(CardIntlPictureViewOpt.this.f23632j);
            if (NullChecker.m81303a(CardIntlPictureViewOpt.this.f23632j) && !CardIntlPictureViewOpt.this.f23632j.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(CardIntlPictureViewOpt.this.f23632j.isFemale());
            }
            if (iM189644a != -1) {
                if (CardIntlPictureViewOpt.this.f23641s) {
                    pictureView.f28032A.setVisibility(8);
                    pictureView.f28033B.setVisibility(8);
                } else {
                    pictureView.f28032A.setVisibility(0);
                    pictureView.f28033B.setVisibility(0);
                }
                tm90.m189643d().m189651i(iM189644a, pictureView.f28034C);
            } else {
                pictureView.f28032A.setVisibility(8);
                pictureView.f28033B.setVisibility(8);
            }
            String str = CardIntlPictureViewOpt.this.f23633k.from;
            pictureView.setFrom(str);
            pictureView.f28070a.getHierarchy().m112046A(CardIntlPictureViewOpt.this.m38981w().getResources().getDrawable(w0c0.f183794P));
            pictureView.m43982J(true, false);
            pictureView.f28070a.getHierarchy().m112076w(ftd0.f99185i);
            pictureView.m44005k0();
            CardIntlPictureViewOpt.this.f23640r = false;
            if ("live_profile_voice_mask_mode".equals(str)) {
                m39039I(pictureView, this.f23656f.get(i), 0);
            } else if (plf.m170174f(CardIntlPictureViewOpt.this.f23632j)) {
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                cardIntlPictureViewOpt.f23640r = true;
                r4w r4wVar = r4w.INSTANCE;
                if (r4wVar.m177848C(cardIntlPictureViewOpt.f23632j.f56011id)) {
                    m39039I(pictureView, this.f23656f.get(i), 0);
                } else {
                    m115452n(CardIntlPictureViewOpt.this.m38981w(), r4wVar.m177851F(CardIntlPictureViewOpt.this.f23632j.f56011id)).map(new w9j() { // from class: l.hk4
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return CardIntlPictureViewOpt.C8047e.m39023q((j760) obj);
                        }
                    }).subscribe(mkd0.m154955G(new e30() { // from class: l.ik4
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f113628a.m39033C(pictureView, i, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(str)) {
                    xdl0.m208344M(pictureView.f28073d, true);
                }
            } else {
                m39039I(pictureView, this.f23656f.get(i), -1);
            }
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(CardIntlPictureViewOpt.this.f23632j.f56011id);
            if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
                xdl0.m208344M(pictureView.f28073d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.jk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118336a.m39034D(pictureView, zIsMe, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = o7r.m163037a(CardIntlPictureViewOpt.this.m38981w()).inflate(f6c0.f95912n9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            xdl0.m208368c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(u4c0.f174185c);
            View viewFindViewById2 = viewInflate.findViewById(u4c0.f174202d);
            View viewFindViewById3 = viewInflate.findViewById(u4c0.f174236f);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.kk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123529a.m39035E(view);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.lk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128446a.m39036F(view);
                }
            });
            xdl0.m208344M(viewFindViewById3, true);
            xdl0.m208325C0(viewFindViewById3, t100.f167244S);
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.mk4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134283a.m39037G(view);
                }
            });
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (upa.m194825u2()) {
                xdl0.m208329E0(pictureView.f28097z, new View.OnClickListener() { // from class: l.nk4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f139373a.m39038H(i, view);
                    }
                });
            }
            return pictureView;
        }

        /* JADX INFO: renamed from: z */
        public View m39044z(int i) {
            if (CardIntlPictureViewOpt.this.f23624b == null) {
                return null;
            }
            for (int i2 = 0; i2 < CardIntlPictureViewOpt.this.f23624b.getChildCount(); i2++) {
                Object tag = CardIntlPictureViewOpt.this.f23624b.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return CardIntlPictureViewOpt.this.f23624b.getChildAt(i2);
                }
            }
            return null;
        }
    }

    public CardIntlPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f23628f = new C8043a();
        this.f23629g = new C8047e();
        this.f23630h = 0;
        this.f23631i = true;
        this.f23634l = "";
        this.f23635m = "";
        this.f23639q = -1;
        this.f23640r = false;
        this.f23641s = false;
        this.f23643u = new AdmobMedia();
        this.f23644v = false;
        this.f23622A = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38964e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m38998Q(Drawable drawable) {
        this.f23647y = o7r.m163037a(m38981w()).inflate(f6c0.f95291B8, (ViewGroup) this, false);
        mkd0.m154992z(this.f23645w);
        mkd0.m154992z(this.f23646x);
        VImage vImage = (VImage) this.f23647y.findViewById(u4c0.f174188c2);
        VText vText = (VText) this.f23647y.findViewById(u4c0.f173961O6);
        VText vText2 = (VText) this.f23647y.findViewById(u4c0.f173779Db);
        VText vText3 = (VText) this.f23647y.findViewById(u4c0.f174560y1);
        if (NullChecker.m81303a(this.f23632j)) {
            vText.setText(TEnum.equals(this.f23632j.gender, "female") ? m38981w().getString(R$string.f18441d1) : m38981w().getString(R$string.f18471e1));
            vText2.setText(TEnum.equals(this.f23632j.gender, "female") ? m38981w().getString(R$string.f18379b1) : m38981w().getString(R$string.f18410c1));
            vText3.setText(TEnum.equals(this.f23632j.gender, "female") ? m38981w().getString(R$string.f18502f1) : m38981w().getString(R$string.f18533g1));
        }
        if (this.f23633k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m38090o().m38103s()) {
            vText3.setText(m38981w().getString(R$string.f19099yk));
            CoreModule.f17545c.f19639e0.f149294W0.put(Boolean.TRUE);
        } else {
            CoreModule.f17545c.f19663m0.f19460w0.put(Boolean.TRUE);
        }
        lra0.f129536w = true;
        vImage.setBackground(drawable);
        this.f23642t.f205212g.addView(this.f23647y);
        xdl0.m208329E0(this.f23647y, new View.OnClickListener() { // from class: l.yj4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198589a.m38993L(view);
            }
        });
        CoreModule.f17545c.f19663m0.f19347J0.onNext(Boolean.TRUE);
        this.f23622A = true;
        lra0.f129535v = true;
        this.f23648z = this.f23632j.f56011id;
        m39000S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* JADX INFO: renamed from: w */
    public Act m38981w() {
        Activity activityM208328E = xdl0.m208328E(this);
        if (activityM208328E instanceof Act) {
            return (Act) activityM208328E;
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m38982A(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f23624b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.setPreferVPagerOnHorizontalConflict(!z);
        this.f23624b.setScrollble(!z);
    }

    /* JADX INFO: renamed from: B */
    public final void m38983B(int i) {
        m39004W(false);
        View viewM39044z = this.f23629g.m39044z(i);
        if (!(viewM39044z instanceof PictureView)) {
            if (!w9a0.m202285m().m202293o()) {
                w9a0.m202285m().m202289D(true);
            }
            o6j0.m162864h("e_clone_profile_photo_ads", "p_suggest_users_home_view", new o6j0.C18854a[0]);
            return;
        }
        PictureView pictureView = (PictureView) viewM39044z;
        if (this.f23631i && xij0.m209661d0() && !this.f23640r && (pictureView.f28040G instanceof Video)) {
            pictureView.m43977A(true);
            pictureView.m43991V();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m38984C(boolean z, boolean z2) {
        lra0.f129535v = false;
        View view = this.f23647y;
        if (view == null) {
            return;
        }
        this.f23642t.f205212g.removeView(view);
        this.f23622A = false;
        CoreModule.f17545c.f19663m0.f19347J0.onNext(Boolean.FALSE);
        if (lra0.f129536w) {
            lra0.f129536w = false;
            zvf0.m220371D("e_user_guide_flash", "p_suggest_users_home_view", vwb.m200311Y("play_status", z2 ? "01" : "02"));
        }
        invalidate();
        this.f23647y = null;
        this.f23648z = null;
        if (z) {
            m39019x();
        }
        mkd0.m154992z(this.f23645w);
        mkd0.m154992z(this.f23646x);
    }

    /* JADX INFO: renamed from: D */
    public boolean m38985D() {
        if (!m39002U() || getCurrentView() == null || !getCurrentView().f28070a.getHierarchy().m112071r()) {
            return false;
        }
        m39015h0();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m38986E() {
        CoreSuggested.UserInfo userInfo = this.f23633k;
        return (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m38090o().m38103s()) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m38987F() {
        return this.f23639q >= 0 && getCurrentItem() == this.f23639q;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m38988G(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.m81303a(user) && NullChecker.m81303a(userInfo)) {
            if (CoreModule.f17545c.f19663m0.m31020L6(userInfo.f19472id) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.m81303a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f23623B = z;
        } else {
            this.f23623B = false;
        }
        return this.f23623B;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m38989H() {
        ce50 ce50Var = this.f23638p;
        return ce50Var != null && ce50Var.mo37929J() != null && TextUtils.equals(this.f23632j.f56011id, this.f23638p.mo37929J().f116564a) && this.f23638p.mo37929J().f116565b.booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m38990I(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m81303a(userInfo) && CoreModule.f17545c.f19663m0.m31024M6(userInfo.f19472id);
    }

    /* JADX INFO: renamed from: J */
    public boolean m38991J() {
        return this.f23622A;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m38992K(Boolean bool) {
        this.f23634l = "";
        if (!bool.booleanValue()) {
            this.f23639q = -1;
            this.f23635m = "";
        } else {
            if (this.f23637o == null) {
                return;
            }
            this.f23635m = this.f23632j.f56011id;
            m39017j0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m38993L(View view) {
        m38984C(true, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Bitmap m38994M() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ C22306c m38995N() {
        return C22306c.fromCallable(new Callable() { // from class: l.ek4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f91937a.m38994M();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22306c m38996O(Bitmap bitmap) {
        return C22306c.just(xij0.m209664p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Drawable m38997P(Bitmap bitmap) {
        bfd0 bfd0VarM106505a = cfd0.m106505a(m38981w().getResources(), bitmap);
        bfd0VarM106505a.m101528e(t100.f167266o);
        return bfd0VarM106505a;
    }

    /* JADX INFO: renamed from: R */
    public final void m38999R() {
        if (TextUtils.isEmpty(this.f23635m) && TextUtils.isEmpty(this.f23634l)) {
            this.f23634l = this.f23632j.f56011id;
            m38981w().duringCreated(w9a0.m202285m().m202303y(m38981w(), true)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.fk4
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98035a.m38992K((Boolean) obj);
                }
            }, new C8046d()));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m39000S() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f23647y.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: T */
    public boolean m39001T() {
        if (!m38991J()) {
            return false;
        }
        m38984C(true, false);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public boolean m39002U() {
        if (this.f23644v) {
            return false;
        }
        if ((!IntlCountryCodeController.m28126v() || this.f23633k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m38090o().m38103s()) && !m38991J() && this.f23632j != null && ((!NullChecker.m81303a(this.f23642t.f205206b0) || !xdl0.m208349O0(this.f23642t.f205206b0)) && !m38988G(this.f23632j, this.f23633k) && !m38990I(this.f23633k))) {
            CardInfoRenderFrom cardInfoRenderFrom = this.f23633k.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            if (cardInfoRenderFrom == cardInfoRenderFrom2 && !ExpandedCardStyleHelper.m38090o().m38103s() && !CoreModule.f17545c.f19663m0.f19460w0.get().booleanValue()) {
                return true;
            }
            if (!CoreModule.f17545c.f19639e0.f149294W0.get().booleanValue() && (this.f23633k.renderFrom != cardInfoRenderFrom2 || ExpandedCardStyleHelper.m38090o().m38103s())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final void m39003V(int i) {
        ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b;
        if (this.f23636n == null || (interfaceC7967b = this.f23637o) == null) {
            return;
        }
        interfaceC7967b.mo38338f(i, this.f23639q == i);
        List<Media> listM183924a = this.f23636n.m183924a();
        if (listM183924a == null || listM183924a.isEmpty() || i < 0 || i >= listM183924a.size()) {
            return;
        }
        this.f23637o.mo38336d(i, listM183924a.get(i), false);
        int i2 = i + 1;
        if (i2 < listM183924a.size()) {
            m39005X(listM183924a.get(i2));
        }
        int i3 = i - 1;
        if (i3 >= 0) {
            m39005X(listM183924a.get(i3));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m39004W(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f23624b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        dbl0.m110646a(vPager_SquaredRefactor, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m39005X(Media media) {
        ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b = this.f23637o;
        boolean z = interfaceC7967b != null && interfaceC7967b.mo38337e(media);
        if (!TEnum.equals(media.status, "raw")) {
            zub.m220216o(media, z);
        } else if (media instanceof Video) {
            qib0.f154691G.m102377x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m39006Y() {
        sfh0 sfh0Var = this.f23636n;
        if (sfh0Var == null || !m39012e0(sfh0Var.m183924a().size())) {
            return;
        }
        m38999R();
    }

    /* JADX INFO: renamed from: Z */
    public void m39007Z(User user, CoreSuggested.UserInfo userInfo, sfh0 sfh0Var, int i, ce50 ce50Var) {
        if (user == null || sfh0Var == null) {
            return;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f23624b.setWidthHeightRate(0.7f);
        }
        User user2 = this.f23632j;
        if (user2 == null || !TextUtils.equals(user2.f56011id, user.f56011id)) {
            this.f23630h = 0;
            this.f23635m = "";
            this.f23639q = -1;
            this.f23634l = "";
        }
        this.f23632j = user;
        this.f23633k = userInfo;
        this.f23636n = sfh0Var;
        this.f23638p = ce50Var;
        ArrayList arrayList = new ArrayList(sfh0Var.m183924a());
        if (m39012e0(arrayList.size())) {
            m38999R();
        } else {
            this.f23635m = "";
            this.f23639q = -1;
            this.f23634l = "";
        }
        if (i == 0) {
            m39020y(this.f23629g, arrayList.size());
            this.f23629g.m39040J(arrayList);
            m39011d0(this.f23630h, false);
            if (ce50Var != null && ce50Var.mo37930l() != null) {
                ce50Var.mo37930l().m154080p(this.f23624b);
            }
            this.f23624b.setOnTouchListener(new ViewOnTouchListenerC8044b(ce50Var));
        } else {
            this.f23624b.post(new RunnableC8045c(arrayList));
        }
        if (userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            m38985D();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m39008a0(sfh0 sfh0Var, User user, ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b) {
        this.f23636n = sfh0Var;
        this.f23637o = interfaceC7967b;
    }

    /* JADX INFO: renamed from: b0 */
    public void m39009b0() {
        View view;
        try {
            if (!m38991J() || (view = this.f23647y) == null) {
                return;
            }
            this.f23642t.f205212g.removeView(view);
            this.f23622A = false;
            this.f23647y = null;
            mkd0.m154992z(this.f23645w);
            mkd0.m154992z(this.f23646x);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m39010c0() {
        CoreSuggested.UserInfo userInfo = this.f23633k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        this.f23636n = null;
        this.f23637o = null;
        this.f23640r = false;
        this.f23639q = -1;
        this.f23635m = "";
        this.f23634l = "";
    }

    /* JADX INFO: renamed from: d0 */
    public void m39011d0(int i, boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f23624b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.m4176T(i, z);
        NewPictureContainerIndicator newPictureContainerIndicator = this.f23627e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m36955b(i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m39012e0(int i) {
        if ((TextUtils.isEmpty(this.f23635m) || !TextUtils.equals(this.f23635m, this.f23632j.f56011id)) && i >= 2 && !m38989H() && !m38986E()) {
            return w9a0.m202285m().m202294p(this.f23632j);
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m39013f0() {
        ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b;
        if (m39001T() || m38985D() || this.f23637o == null) {
            return;
        }
        if (this.f23637o.m38333a(getCurrentItem())) {
            return;
        }
        boolean zM39014g0 = m39014g0(false);
        if (!zM39014g0 && (interfaceC7967b = this.f23637o) != null) {
            interfaceC7967b.mo38335c(false);
        }
        CoreSuggested.UserInfo userInfo = this.f23633k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m38090o().m38103s()) {
            lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, zM39014g0, true, this.f23632j, "");
        } else {
            lra0.m151148g("p_suggest_users_home_view", zM39014g0, true, this.f23632j, "");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m39014g0(boolean z) {
        sfh0 sfh0Var;
        List<Media> listM183924a;
        boolean z2;
        int i;
        int i2;
        if (this.f23624b == null || (sfh0Var = this.f23636n) == null || this.f23637o == null || (listM183924a = sfh0Var.m183924a()) == null || listM183924a.isEmpty()) {
            return false;
        }
        int currentItem = getCurrentItem();
        int size = z ? currentItem + 1 : currentItem - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM183924a.size()) {
            size = listM183924a.size() - 1;
        }
        if (currentItem == size) {
            if (!z || this.f23639q <= 0 || currentItem >= this.f23629g.f23656f.size()) {
                z2 = false;
            } else {
                size = this.f23639q;
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        } else {
            z2 = false;
        }
        this.f23624b.m4176T(size, false);
        if (!z2) {
            this.f23637o.mo38336d(size, listM183924a.get(size), false);
        }
        NewPictureContainerIndicator newPictureContainerIndicator = this.f23627e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m36955b(size);
        }
        if (!z2) {
            if (z && (i2 = size + 1) < listM183924a.size()) {
                m39005X(listM183924a.get(i2));
            } else if (!z && (i = size - 1) >= 0) {
                m39005X(listM183924a.get(i));
            }
        }
        return true;
    }

    public int getCurrentItem() {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f23624b;
        if (vPager_SquaredRefactor != null) {
            return vPager_SquaredRefactor.getCurrentItem();
        }
        return 0;
    }

    public int getCurrentPosition() {
        return this.f23630h;
    }

    @Nullable
    public PictureView getCurrentView() {
        View viewM39044z = this.f23629g.m39044z(getCurrentItem());
        if (viewM39044z instanceof PictureView) {
            return (PictureView) viewM39044z;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public void m39015h0() {
        o6j0.m162864h("e_card_guide_overlay", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        if ((this.f23632j.media(getCurrentPosition()) instanceof Video) && xij0.m209661d0() && NullChecker.m81303a(getCurrentView())) {
            getCurrentView().m43990U();
        }
        mkd0.m154992z(this.f23645w);
        this.f23645w = m38981w().duringCreated(((C22306c) new v9j() { // from class: l.zj4
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f203378a.m38995N();
            }
        }.call()).compose(mkd0.m154966R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.ak4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f70235a.m38996O((Bitmap) obj);
            }
        }).compose(mkd0.m154991y()).map(new w9j() { // from class: l.bk4
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75964a.m38997P((Bitmap) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ck4
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81273a.m38998Q((Drawable) obj);
            }
        }, new e30() { // from class: l.dk4
            @Override // p149l.e30
            public final void call(Object obj) {
                CardIntlPictureViewOpt.m38964e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public void m39016i0() {
        ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b;
        if (m39001T() || m38985D() || this.f23637o == null) {
            return;
        }
        if (this.f23637o.m38333a(getCurrentItem())) {
            return;
        }
        boolean zM39014g0 = m39014g0(true);
        if (!zM39014g0 && (interfaceC7967b = this.f23637o) != null) {
            interfaceC7967b.mo38335c(true);
        }
        CoreSuggested.UserInfo userInfo = this.f23633k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m38090o().m38103s()) {
            lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, zM39014g0, false, this.f23632j, "");
        } else {
            lra0.m151148g("p_suggest_users_home_view", zM39014g0, false, this.f23632j, "");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m39017j0() {
        if (m38986E() || m38989H() || !w9a0.m202285m().m202294p(this.f23632j)) {
            if (this.f23629g.f23656f.contains(this.f23643u)) {
                ArrayList arrayList = new ArrayList(this.f23636n.m183924a());
                this.f23639q = -1;
                this.f23629g.m39040J(arrayList);
                this.f23627e.setIndicatorCount(arrayList.size());
                return;
            }
            return;
        }
        if (!TextUtils.equals(this.f23635m, this.f23632j.f56011id) || this.f23629g.f23656f.contains(this.f23643u)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f23636n.m183924a());
        this.f23639q = arrayList2.size();
        arrayList2.add(this.f23643u);
        this.f23629g.m39040J(arrayList2);
        this.f23627e.setIndicatorCount(arrayList2.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39018v(this);
        this.f23624b.setWidthHeightRate(0.6f);
        this.f23624b.setOffscreenPageLimit(1);
        this.f23624b.setPreferVPagerOnHorizontalConflict(false);
        this.f23624b.setScrollble(false);
        this.f23624b.setAllowZoom(true);
    }

    public void setAutoPlayEnabled(boolean z) {
        this.f23631i = z;
    }

    public void setCardStyleChangeProgress(float f) {
        CoreSuggested.UserInfo userInfo = this.f23633k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        float f2 = CardHeadLayoutV2.f23595w;
        if (f2 > 0.6f) {
            this.f23624b.setWidthHeightRate(((f2 - 0.6f) * f) + 0.6f);
        }
    }

    public void setCertBtnShowing(boolean z) {
        this.f23641s = z;
        PictureView currentView = getCurrentView();
        if (currentView != null) {
            xdl0.m208344M(currentView.f28032A, !z);
            xdl0.m208344M(currentView.f28033B, !z);
        }
    }

    public void setParentHolder(zwk zwkVar) {
        this.f23642t = zwkVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m39018v(View view) {
        pk4.m169969a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public void m39019x() {
        if (xij0.m209661d0() && NullChecker.m81303a(getCurrentView()) && (getCurrentView().f28040G instanceof Video)) {
            getCurrentView().m43991V();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m39020y(eb2 eb2Var, int i) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f23624b;
        if (vPager_SquaredRefactor == null || this.f23627e == null) {
            return;
        }
        vPager_SquaredRefactor.setAdapter(eb2Var);
        this.f23624b.m4189i();
        this.f23624b.m4185d(this.f23628f);
        this.f23627e.setupWithPager(this.f23624b);
        this.f23627e.setIndicatorCount(i);
        xdl0.m208345M0(this.f23626d, i > 1);
        this.f23627e.setSelectedIndex(this.f23624b.getCurrentItem());
    }

    /* JADX INFO: renamed from: z */
    public void m39021z() {
        ExpandedImageSwitchView.InterfaceC7967b interfaceC7967b;
        if (m39001T() || m38985D() || (interfaceC7967b = this.f23637o) == null) {
            return;
        }
        interfaceC7967b.mo38334b();
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23628f = new C8043a();
        this.f23629g = new C8047e();
        this.f23630h = 0;
        this.f23631i = true;
        this.f23634l = "";
        this.f23635m = "";
        this.f23639q = -1;
        this.f23640r = false;
        this.f23641s = false;
        this.f23643u = new AdmobMedia();
        this.f23644v = false;
        this.f23622A = false;
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23628f = new C8043a();
        this.f23629g = new C8047e();
        this.f23630h = 0;
        this.f23631i = true;
        this.f23634l = "";
        this.f23635m = "";
        this.f23639q = -1;
        this.f23640r = false;
        this.f23641s = false;
        this.f23643u = new AdmobMedia();
        this.f23644v = false;
        this.f23622A = false;
    }
}
