package com.p051p1.mobile.putong.core.newui.home.views;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedImageSwitchView;
import com.p051p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.AdmobMedia;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.roundcorners.view.RoundFrameLayout;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.adc0;
import p153l.aia0;
import p153l.aoh0;
import p153l.asj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dnd0;
import p153l.end0;
import p153l.fo0;
import p153l.gra;
import p153l.h1e0;
import p153l.hkl0;
import p153l.i4g0;
import p153l.jm50;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.lb2;
import p153l.nwb;
import p153l.ol4;
import p153l.p6w;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pza0;
import p153l.pzk;
import p153l.qa00;
import p153l.qcj;
import p153l.sfj0;
import p153l.uqb0;
import p153l.vmf;
import p153l.we60;
import p153l.x20;
import p153l.xck;
import p153l.xu90;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CardIntlPictureViewOpt extends RoundFrameLayout {

    /* JADX INFO: renamed from: A */
    public boolean f24364A;

    /* JADX INFO: renamed from: B */
    public boolean f24365B;

    /* JADX INFO: renamed from: b */
    public VPager_SquaredRefactor f24366b;

    /* JADX INFO: renamed from: c */
    public VFrame f24367c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f24368d;

    /* JADX INFO: renamed from: e */
    public NewPictureContainerIndicator f24369e;

    /* JADX INFO: renamed from: f */
    public final ViewPager.InterfaceC0718j f24370f;

    /* JADX INFO: renamed from: g */
    public C8198e f24371g;

    /* JADX INFO: renamed from: h */
    public int f24372h;

    /* JADX INFO: renamed from: i */
    public boolean f24373i;

    /* JADX INFO: renamed from: j */
    public User f24374j;

    /* JADX INFO: renamed from: k */
    public CoreSuggested.UserInfo f24375k;

    /* JADX INFO: renamed from: l */
    public String f24376l;

    /* JADX INFO: renamed from: m */
    public String f24377m;

    /* JADX INFO: renamed from: n */
    public aoh0 f24378n;

    /* JADX INFO: renamed from: o */
    public ExpandedImageSwitchView.InterfaceC8118b f24379o;

    /* JADX INFO: renamed from: p */
    public jm50 f24380p;

    /* JADX INFO: renamed from: q */
    public int f24381q;

    /* JADX INFO: renamed from: r */
    public boolean f24382r;

    /* JADX INFO: renamed from: s */
    public boolean f24383s;

    /* JADX INFO: renamed from: t */
    public pzk f24384t;

    /* JADX INFO: renamed from: u */
    public AdmobMedia f24385u;

    /* JADX INFO: renamed from: v */
    public boolean f24386v;

    /* JADX INFO: renamed from: w */
    public kcg0 f24387w;

    /* JADX INFO: renamed from: x */
    public kcg0 f24388x;

    /* JADX INFO: renamed from: y */
    public View f24389y;

    /* JADX INFO: renamed from: z */
    public String f24390z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$a */
    public class C8194a implements ViewPager.InterfaceC0718j {
        public C8194a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            CardIntlPictureViewOpt.this.f24372h = i;
            CardIntlPictureViewOpt.this.m39986B(i);
            CardIntlPictureViewOpt.this.m40006V(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$b */
    public class ViewOnTouchListenerC8195b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jm50 f24392a;

        public ViewOnTouchListenerC8195b(jm50 jm50Var) {
            this.f24392a = jm50Var;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            jm50 jm50Var = this.f24392a;
            if (jm50Var == null || jm50Var.mo38933l() == null) {
                return false;
            }
            this.f24392a.mo38933l().m177128p(CardIntlPictureViewOpt.this.f24366b);
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$c */
    public class RunnableC8196c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f24394a;

        public RunnableC8196c(List list) {
            this.f24394a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt.m40023y(cardIntlPictureViewOpt.f24371g, this.f24394a.size());
            CardIntlPictureViewOpt.this.f24371g.m40043J(this.f24394a);
            CardIntlPictureViewOpt cardIntlPictureViewOpt2 = CardIntlPictureViewOpt.this;
            cardIntlPictureViewOpt2.m40014d0(cardIntlPictureViewOpt2.f24372h, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$d */
    public class C8197d implements y20<Throwable> {
        public C8197d() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            CardIntlPictureViewOpt.this.f24376l = "";
            xck.m210153c(th);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardIntlPictureViewOpt$e */
    public class C8198e extends lb2 {

        /* JADX INFO: renamed from: e */
        public final Stack<View> f24397e;

        /* JADX INFO: renamed from: f */
        public List<Media> f24398f;

        /* JADX INFO: renamed from: g */
        public int f24399g;

        /* JADX INFO: renamed from: h */
        public long f24400h;

        /* JADX INFO: renamed from: i */
        public int f24401i;

        public C8198e() {
            this.f24397e = new Stack<>();
            this.f24398f = new ArrayList();
            this.f24399g = 0;
            this.f24400h = 0L;
            this.f24401i = -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: q */
        public static /* synthetic */ Integer m40026q(pf60 pf60Var) {
            return (Integer) pf60Var.f152156a;
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m40035A() {
            ArrayList arrayList = new ArrayList(this.f24398f);
            arrayList.remove(CardIntlPictureViewOpt.this.f24385u);
            CardIntlPictureViewOpt.this.f24381q = -1;
            CardIntlPictureViewOpt.this.f24371g.m40043J(arrayList);
            CardIntlPictureViewOpt.this.f24369e.setIndicatorCount(arrayList.size());
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m40036C(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                bnl0.m105524M(pictureView.f28921d, false);
            }
            m40042I(pictureView, this.f24398f.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ void m40037D(PictureView pictureView, boolean z, View view) {
            int iM45172T = pictureView.m45172T();
            if (iM45172T == -1 && CardIntlPictureViewOpt.this.f24366b.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = CardIntlPictureViewOpt.this.f24366b;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iM45172T == 1 && CardIntlPictureViewOpt.this.f24366b.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = CardIntlPictureViewOpt.this.f24366b;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else if (iM45172T == 0) {
                if (z && (CardIntlPictureViewOpt.this.m39984w() instanceof NewUI1ContainerActivity)) {
                    CardIntlPictureViewOpt.this.m39984w().startActivity(ProfileAct.m51922q2(CardIntlPictureViewOpt.this.m39984w(), CardIntlPictureViewOpt.this.f24374j.f56859id, "profile_frag_picture", false, true));
                } else {
                    CardIntlPictureViewOpt.this.m39984w().m48999H2();
                }
            }
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m40038E(View view) {
            CardIntlPictureViewOpt.this.m40019i0();
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m40039F(View view) {
            CardIntlPictureViewOpt.this.m40016f0();
        }

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ void m40040G(View view) {
            CardIntlPictureViewOpt.this.m40024z();
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m40041H(int i, View view) {
            i4g0.m138523u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("invisible_photo_location", Integer.valueOf(i)), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            we60.m205991a(CardIntlPictureViewOpt.this.m39984w(), CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO);
        }

        /* JADX INFO: renamed from: I */
        public void m40042I(PictureView pictureView, Media media, int i) {
            pictureView.m45177Y(media, i);
            m40044K(pictureView, media);
        }

        /* JADX INFO: renamed from: J */
        public void m40043J(List<Media> list) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = list.size();
            if (!Objects.equals(this.f24398f, list) || CardIntlPictureViewOpt.this.f24366b.getChildCount() <= 0 || Math.abs(jCurrentTimeMillis - this.f24400h) >= 300 || size != this.f24401i) {
                this.f24400h = jCurrentTimeMillis;
                this.f24398f = list;
                this.f24399g = getCount();
                notifyDataSetChanged();
                this.f24401i = size;
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                if (cardIntlPictureViewOpt.f24382r) {
                    return;
                }
                cardIntlPictureViewOpt.m40022x();
            }
        }

        /* JADX INFO: renamed from: K */
        public final void m40044K(PictureView pictureView, Media media) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(CardIntlPictureViewOpt.this.f24374j.f56859id);
            if (NullChecker.m82486a(pictureView) && NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
                uqb0.f180374G.m127115L0(pictureView.f28918a, media.url);
            }
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f24398f.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            int i = this.f24399g;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f24399g = i - 1;
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            if (i == CardIntlPictureViewOpt.this.f24366b.getCurrentItem()) {
                CardIntlPictureViewOpt.this.m40007W(false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f24397e.add((PictureView) obj);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f24398f.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(CardIntlPictureViewOpt.this.m39984w());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                aia0.m97972m().m97973A(frameLayout, CardIntlPictureViewOpt.this.m39984w(), new x20() { // from class: l.fl4
                    @Override // p153l.x20
                    public final void call() {
                        this.f99588a.m40035A();
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f24397e.isEmpty() ? (PictureView) this.f24397e.pop() : (PictureView) LayoutInflater.from(CardIntlPictureViewOpt.this.getContext()).inflate(kec0.f125431Ge, viewGroup, false);
            final boolean zIsMe = CardIntlPictureViewOpt.this.f24374j.isMe();
            int iM213123a = xu90.m213122d().m213123a(CardIntlPictureViewOpt.this.f24374j);
            if (NullChecker.m82486a(CardIntlPictureViewOpt.this.f24374j) && !CardIntlPictureViewOpt.this.f24374j.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(CardIntlPictureViewOpt.this.f24374j.isFemale());
            }
            if (iM213123a != -1) {
                if (CardIntlPictureViewOpt.this.f24383s) {
                    pictureView.f28880A.setVisibility(8);
                    pictureView.f28881B.setVisibility(8);
                } else {
                    pictureView.f28880A.setVisibility(0);
                    pictureView.f28881B.setVisibility(0);
                }
                xu90.m213122d().m213130i(iM213123a, pictureView.f28882C);
            } else {
                pictureView.f28880A.setVisibility(8);
                pictureView.f28881B.setVisibility(8);
            }
            String str = CardIntlPictureViewOpt.this.f24375k.from;
            pictureView.setFrom(str);
            pictureView.f28918a.getHierarchy().m207038A(CardIntlPictureViewOpt.this.m39984w().getResources().getDrawable(c9c0.f80363P));
            pictureView.m45165J(true, false);
            pictureView.f28918a.getHierarchy().m207062w(h1e0.f107452i);
            pictureView.m45188k0();
            CardIntlPictureViewOpt.this.f24382r = false;
            if ("live_profile_voice_mask_mode".equals(str)) {
                m40042I(pictureView, this.f24398f.get(i), 0);
            } else if (vmf.m201736f(CardIntlPictureViewOpt.this.f24374j)) {
                CardIntlPictureViewOpt cardIntlPictureViewOpt = CardIntlPictureViewOpt.this;
                cardIntlPictureViewOpt.f24382r = true;
                p6w p6wVar = p6w.INSTANCE;
                if (p6wVar.m171055C(cardIntlPictureViewOpt.f24374j.f56859id)) {
                    m40042I(pictureView, this.f24398f.get(i), 0);
                } else {
                    m153557n(CardIntlPictureViewOpt.this.m39984w(), p6wVar.m171058F(CardIntlPictureViewOpt.this.f24374j.f56859id)).map(new qcj() { // from class: l.gl4
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return CardIntlPictureViewOpt.C8198e.m40026q((pf60) obj);
                        }
                    }).subscribe(psd0.m173596G(new y20() { // from class: l.hl4
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f110479a.m40036C(pictureView, i, (Integer) obj);
                        }
                    }));
                }
                if (!"from_voice_buzz".equals(str)) {
                    bnl0.m105524M(pictureView.f28921d, true);
                }
            } else {
                m40042I(pictureView, this.f24398f.get(i), -1);
            }
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(CardIntlPictureViewOpt.this.f24374j.f56859id);
            if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
                bnl0.m105524M(pictureView.f28921d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.il4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115520a.m40037D(pictureView, zIsMe, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            pictureView.setOnClickListener(null);
            View viewInflate = p9r.m171370a(CardIntlPictureViewOpt.this.m39984w()).inflate(kec0.f126085u9, (ViewGroup) null);
            pictureView.addView(viewInflate, 1);
            bnl0.m105548c0(viewInflate, 0);
            View viewFindViewById = viewInflate.findViewById(adc0.f70276c);
            View viewFindViewById2 = viewInflate.findViewById(adc0.f70293d);
            View viewFindViewById3 = viewInflate.findViewById(adc0.f70327f);
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.jl4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f121466a.m40038E(view);
                }
            });
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.kl4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127328a.m40039F(view);
                }
            });
            bnl0.m105524M(viewFindViewById3, true);
            bnl0.m105505C0(viewFindViewById3, qa00.f156306S);
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ll4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132523a.m40040G(view);
                }
            });
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (gra.m131756u2()) {
                bnl0.m105509E0(pictureView.f28945z, new View.OnClickListener() { // from class: l.ml4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f137357a.m40041H(i, view);
                    }
                });
            }
            return pictureView;
        }

        /* JADX INFO: renamed from: z */
        public View m40047z(int i) {
            if (CardIntlPictureViewOpt.this.f24366b == null) {
                return null;
            }
            for (int i2 = 0; i2 < CardIntlPictureViewOpt.this.f24366b.getChildCount(); i2++) {
                Object tag = CardIntlPictureViewOpt.this.f24366b.getChildAt(i2).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                    return CardIntlPictureViewOpt.this.f24366b.getChildAt(i2);
                }
            }
            return null;
        }
    }

    public CardIntlPictureViewOpt(@NonNull Context context) {
        super(context);
        this.f24370f = new C8194a();
        this.f24371g = new C8198e();
        this.f24372h = 0;
        this.f24373i = true;
        this.f24376l = "";
        this.f24377m = "";
        this.f24381q = -1;
        this.f24382r = false;
        this.f24383s = false;
        this.f24385u = new AdmobMedia();
        this.f24386v = false;
        this.f24364A = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m39967e(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setBlurBackground, reason: merged with bridge method [inline-methods] */
    public void m40001Q(Drawable drawable) {
        this.f24389y = p9r.m171370a(m39984w()).inflate(kec0.f125457I8, (ViewGroup) this, false);
        psd0.m173633z(this.f24387w);
        psd0.m173633z(this.f24388x);
        VImage vImage = (VImage) this.f24389y.findViewById(adc0.f70313e2);
        VText vText = (VText) this.f24389y.findViewById(adc0.f70083Q6);
        VText vText2 = (VText) this.f24389y.findViewById(adc0.f69901Fb);
        VText vText3 = (VText) this.f24389y.findViewById(adc0.f70651y1);
        if (NullChecker.m82486a(this.f24374j)) {
            vText.setText(TEnum.equals(this.f24374j.gender, "female") ? m39984w().getString(R$string.f19171d1) : m39984w().getString(R$string.f19201e1));
            vText2.setText(TEnum.equals(this.f24374j.gender, "female") ? m39984w().getString(R$string.f19109b1) : m39984w().getString(R$string.f19140c1));
            vText3.setText(TEnum.equals(this.f24374j.gender, "female") ? m39984w().getString(R$string.f19232f1) : m39984w().getString(R$string.f19263g1));
        }
        if (this.f24375k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m39093o().m39106s()) {
            vText3.setText(m39984w().getString(R$string.f18917Uk));
            CoreModule.f18264c.f20381e0.f89151W0.put(Boolean.TRUE);
        } else {
            CoreModule.f18264c.f20405m0.f20202w0.put(Boolean.TRUE);
        }
        pza0.f154796w = true;
        vImage.setBackground(drawable);
        this.f24384t.f154908g.addView(this.f24389y);
        bnl0.m105509E0(this.f24389y, new View.OnClickListener() { // from class: l.xk4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194708a.m39996L(view);
            }
        });
        CoreModule.f18264c.f20405m0.f20089J0.onNext(Boolean.TRUE);
        this.f24364A = true;
        pza0.f154795v = true;
        this.f24390z = this.f24374j.f56859id;
        m40003S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* JADX INFO: renamed from: w */
    public Act m39984w() {
        Activity activityM105508E = bnl0.m105508E(this);
        if (activityM105508E instanceof Act) {
            return (Act) activityM105508E;
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m39985A(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f24366b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.setPreferVPagerOnHorizontalConflict(!z);
        this.f24366b.setScrollble(!z);
    }

    /* JADX INFO: renamed from: B */
    public final void m39986B(int i) {
        m40007W(false);
        View viewM40047z = this.f24371g.m40047z(i);
        if (!(viewM40047z instanceof PictureView)) {
            if (!aia0.m97972m().m97980o()) {
                aia0.m97972m().m97976D(true);
            }
            sfj0.m185601h("e_clone_profile_photo_ads", "p_suggest_users_home_view", new sfj0.C20032a[0]);
            return;
        }
        PictureView pictureView = (PictureView) viewM40047z;
        if (this.f24373i && asj0.m99935d0() && !this.f24382r && (pictureView.f28888G instanceof Video)) {
            pictureView.m45160A(true);
            pictureView.m45174V();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m39987C(boolean z, boolean z2) {
        pza0.f154795v = false;
        View view = this.f24389y;
        if (view == null) {
            return;
        }
        this.f24384t.f154908g.removeView(view);
        this.f24364A = false;
        CoreModule.f18264c.f20405m0.f20089J0.onNext(Boolean.FALSE);
        if (pza0.f154796w) {
            pza0.f154796w = false;
            i4g0.m138495D("e_user_guide_flash", "p_suggest_users_home_view", jyb.m147494Y("play_status", z2 ? "01" : "02"));
        }
        invalidate();
        this.f24389y = null;
        this.f24390z = null;
        if (z) {
            m40022x();
        }
        psd0.m173633z(this.f24387w);
        psd0.m173633z(this.f24388x);
    }

    /* JADX INFO: renamed from: D */
    public boolean m39988D() {
        if (!m40005U() || getCurrentView() == null || !getCurrentView().f28918a.getHierarchy().m207057r()) {
            return false;
        }
        m40018h0();
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m39989E() {
        CoreSuggested.UserInfo userInfo = this.f24375k;
        return (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m39093o().m39106s()) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m39990F() {
        return this.f24381q >= 0 && getCurrentItem() == this.f24381q;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m39991G(User user, CoreSuggested.UserInfo userInfo) {
        boolean z = false;
        if (NullChecker.m82486a(user) && NullChecker.m82486a(userInfo)) {
            if (CoreModule.f18264c.f20405m0.m32023L6(userInfo.f20214id) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive()) && NullChecker.m82486a(userInfo.intlLiveCardPartDataWrapper.getCurrentLive().videoCapture)) {
                z = true;
            }
            this.f24365B = z;
        } else {
            this.f24365B = false;
        }
        return this.f24365B;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m39992H() {
        jm50 jm50Var = this.f24380p;
        return jm50Var != null && jm50Var.mo38932J() != null && TextUtils.equals(this.f24374j.f56859id, this.f24380p.mo38932J().f152156a) && this.f24380p.mo38932J().f152157b.booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m39993I(CoreSuggested.UserInfo userInfo) {
        return NullChecker.m82486a(userInfo) && CoreModule.f18264c.f20405m0.m32027M6(userInfo.f20214id);
    }

    /* JADX INFO: renamed from: J */
    public boolean m39994J() {
        return this.f24364A;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m39995K(Boolean bool) {
        this.f24376l = "";
        if (!bool.booleanValue()) {
            this.f24381q = -1;
            this.f24377m = "";
        } else {
            if (this.f24379o == null) {
                return;
            }
            this.f24377m = this.f24374j.f56859id;
            m40020j0();
        }
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m39996L(View view) {
        m39987C(true, false);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Bitmap m39997M() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_4444);
        draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ C22421c m39998N() {
        return C22421c.fromCallable(new Callable() { // from class: l.dl4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f89493a.m39997M();
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22421c m39999O(Bitmap bitmap) {
        return C22421c.just(asj0.m99938p(bitmap, getWidth(), getHeight(), 2097152000));
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Drawable m40000P(Bitmap bitmap) {
        dnd0 dnd0VarM121524a = end0.m121524a(m39984w().getResources(), bitmap);
        dnd0VarM121524a.m117059e(qa00.f156328o);
        return dnd0VarM121524a;
    }

    /* JADX INFO: renamed from: R */
    public final void m40002R() {
        if (TextUtils.isEmpty(this.f24377m) && TextUtils.isEmpty(this.f24376l)) {
            this.f24376l = this.f24374j.f56859id;
            m39984w().duringCreated(aia0.m97972m().m97990y(m39984w(), true)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.el4
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94477a.m39995K((Boolean) obj);
                }
            }, new C8197d()));
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m40003S() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24389y.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 17;
    }

    /* JADX INFO: renamed from: T */
    public boolean m40004T() {
        if (!m39994J()) {
            return false;
        }
        m39987C(true, false);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public boolean m40005U() {
        if (this.f24386v) {
            return false;
        }
        if ((!IntlCountryCodeController.m29125v() || this.f24375k.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m39093o().m39106s()) && !m39994J() && this.f24374j != null && ((!NullChecker.m82486a(this.f24384t.f154902b0) || !bnl0.m105529O0(this.f24384t.f154902b0)) && !m39991G(this.f24374j, this.f24375k) && !m39993I(this.f24375k))) {
            CardInfoRenderFrom cardInfoRenderFrom = this.f24375k.renderFrom;
            CardInfoRenderFrom cardInfoRenderFrom2 = CardInfoRenderFrom.CARD;
            if (cardInfoRenderFrom == cardInfoRenderFrom2 && !ExpandedCardStyleHelper.m39093o().m39106s() && !CoreModule.f18264c.f20405m0.f20202w0.get().booleanValue()) {
                return true;
            }
            if (!CoreModule.f18264c.f20381e0.f89151W0.get().booleanValue() && (this.f24375k.renderFrom != cardInfoRenderFrom2 || ExpandedCardStyleHelper.m39093o().m39106s())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: V */
    public final void m40006V(int i) {
        ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b;
        if (this.f24378n == null || (interfaceC8118b = this.f24379o) == null) {
            return;
        }
        interfaceC8118b.mo39341f(i, this.f24381q == i);
        List<Media> listM99080a = this.f24378n.m99080a();
        if (listM99080a == null || listM99080a.isEmpty() || i < 0 || i >= listM99080a.size()) {
            return;
        }
        this.f24379o.mo39339d(i, listM99080a.get(i), false);
        int i2 = i + 1;
        if (i2 < listM99080a.size()) {
            m40008X(listM99080a.get(i2));
        }
        int i3 = i - 1;
        if (i3 >= 0) {
            m40008X(listM99080a.get(i3));
        }
    }

    /* JADX INFO: renamed from: W */
    public void m40007W(boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f24366b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        hkl0.m135638a(vPager_SquaredRefactor, z);
    }

    /* JADX INFO: renamed from: X */
    public final void m40008X(Media media) {
        ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b = this.f24379o;
        boolean z = interfaceC8118b != null && interfaceC8118b.mo39340e(media);
        if (!TEnum.equals(media.status, "raw")) {
            nwb.m164977o(media, z);
        } else if (media instanceof Video) {
            uqb0.f180374G.m127160x0(media.url);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m40009Y() {
        aoh0 aoh0Var = this.f24378n;
        if (aoh0Var == null || !m40015e0(aoh0Var.m99080a().size())) {
            return;
        }
        m40002R();
    }

    /* JADX INFO: renamed from: Z */
    public void m40010Z(User user, CoreSuggested.UserInfo userInfo, aoh0 aoh0Var, int i, jm50 jm50Var) {
        if (user == null || aoh0Var == null) {
            return;
        }
        if (userInfo.renderFrom == CardInfoRenderFrom.PROFILE) {
            this.f24366b.setWidthHeightRate(0.7f);
        }
        User user2 = this.f24374j;
        if (user2 == null || !TextUtils.equals(user2.f56859id, user.f56859id)) {
            this.f24372h = 0;
            this.f24377m = "";
            this.f24381q = -1;
            this.f24376l = "";
        }
        this.f24374j = user;
        this.f24375k = userInfo;
        this.f24378n = aoh0Var;
        this.f24380p = jm50Var;
        ArrayList arrayList = new ArrayList(aoh0Var.m99080a());
        if (m40015e0(arrayList.size())) {
            m40002R();
        } else {
            this.f24377m = "";
            this.f24381q = -1;
            this.f24376l = "";
        }
        if (i == 0) {
            m40023y(this.f24371g, arrayList.size());
            this.f24371g.m40043J(arrayList);
            m40014d0(this.f24372h, false);
            if (jm50Var != null && jm50Var.mo38933l() != null) {
                jm50Var.mo38933l().m177128p(this.f24366b);
            }
            this.f24366b.setOnTouchListener(new ViewOnTouchListenerC8195b(jm50Var));
        } else {
            this.f24366b.post(new RunnableC8196c(arrayList));
        }
        if (userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            m39988D();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m40011a0(aoh0 aoh0Var, User user, ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b) {
        this.f24378n = aoh0Var;
        this.f24379o = interfaceC8118b;
    }

    /* JADX INFO: renamed from: b0 */
    public void m40012b0() {
        View view;
        try {
            if (!m39994J() || (view = this.f24389y) == null) {
                return;
            }
            this.f24384t.f154908g.removeView(view);
            this.f24364A = false;
            this.f24389y = null;
            psd0.m173633z(this.f24387w);
            psd0.m173633z(this.f24388x);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m40013c0() {
        CoreSuggested.UserInfo userInfo = this.f24375k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        this.f24378n = null;
        this.f24379o = null;
        this.f24382r = false;
        this.f24381q = -1;
        this.f24377m = "";
        this.f24376l = "";
    }

    /* JADX INFO: renamed from: d0 */
    public void m40014d0(int i, boolean z) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f24366b;
        if (vPager_SquaredRefactor == null) {
            return;
        }
        vPager_SquaredRefactor.m4178T(i, z);
        NewPictureContainerIndicator newPictureContainerIndicator = this.f24369e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m37958b(i);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m40015e0(int i) {
        if ((TextUtils.isEmpty(this.f24377m) || !TextUtils.equals(this.f24377m, this.f24374j.f56859id)) && i >= 2 && !m39992H() && !m39989E()) {
            return aia0.m97972m().m97981p(this.f24374j);
        }
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public void m40016f0() {
        ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b;
        if (m40004T() || m39988D() || this.f24379o == null) {
            return;
        }
        if (this.f24379o.m39336a(getCurrentItem())) {
            return;
        }
        boolean zM40017g0 = m40017g0(false);
        if (!zM40017g0 && (interfaceC8118b = this.f24379o) != null) {
            interfaceC8118b.mo39338c(false);
        }
        CoreSuggested.UserInfo userInfo = this.f24375k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m39093o().m39106s()) {
            pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, zM40017g0, true, this.f24374j, "");
        } else {
            pza0.m174355g("p_suggest_users_home_view", zM40017g0, true, this.f24374j, "");
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m40017g0(boolean z) {
        aoh0 aoh0Var;
        List<Media> listM99080a;
        boolean z2;
        int i;
        int i2;
        if (this.f24366b == null || (aoh0Var = this.f24378n) == null || this.f24379o == null || (listM99080a = aoh0Var.m99080a()) == null || listM99080a.isEmpty()) {
            return false;
        }
        int currentItem = getCurrentItem();
        int size = z ? currentItem + 1 : currentItem - 1;
        if (size < 0) {
            size = 0;
        } else if (size >= listM99080a.size()) {
            size = listM99080a.size() - 1;
        }
        if (currentItem == size) {
            if (!z || this.f24381q <= 0 || currentItem >= this.f24371g.f24398f.size()) {
                z2 = false;
            } else {
                size = this.f24381q;
                z2 = true;
            }
            if (!z2) {
                return false;
            }
        } else {
            z2 = false;
        }
        this.f24366b.m4178T(size, false);
        if (!z2) {
            this.f24379o.mo39339d(size, listM99080a.get(size), false);
        }
        NewPictureContainerIndicator newPictureContainerIndicator = this.f24369e;
        if (newPictureContainerIndicator != null) {
            newPictureContainerIndicator.m37958b(size);
        }
        if (!z2) {
            if (z && (i2 = size + 1) < listM99080a.size()) {
                m40008X(listM99080a.get(i2));
            } else if (!z && (i = size - 1) >= 0) {
                m40008X(listM99080a.get(i));
            }
        }
        return true;
    }

    public int getCurrentItem() {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f24366b;
        if (vPager_SquaredRefactor != null) {
            return vPager_SquaredRefactor.getCurrentItem();
        }
        return 0;
    }

    public int getCurrentPosition() {
        return this.f24372h;
    }

    @Nullable
    public PictureView getCurrentView() {
        View viewM40047z = this.f24371g.m40047z(getCurrentItem());
        if (viewM40047z instanceof PictureView) {
            return (PictureView) viewM40047z;
        }
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public void m40018h0() {
        sfj0.m185601h("e_card_guide_overlay", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        if ((this.f24374j.media(getCurrentPosition()) instanceof Video) && asj0.m99935d0() && NullChecker.m82486a(getCurrentView())) {
            getCurrentView().m45173U();
        }
        psd0.m173633z(this.f24387w);
        this.f24387w = m39984w().duringCreated(((C22421c) new pcj() { // from class: l.yk4
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f200371a.m39998N();
            }
        }.call()).compose(psd0.m173607R()).observeOn(Schedulers.computation()).flatMap(new qcj() { // from class: l.zk4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f204729a.m39999O((Bitmap) obj);
            }
        }).compose(psd0.m173632y()).map(new qcj() { // from class: l.al4
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f72070a.m40000P((Bitmap) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.bl4
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77144a.m40001Q((Drawable) obj);
            }
        }, new y20() { // from class: l.cl4
            @Override // p153l.y20
            public final void call(Object obj) {
                CardIntlPictureViewOpt.m39967e((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i0 */
    public void m40019i0() {
        ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b;
        if (m40004T() || m39988D() || this.f24379o == null) {
            return;
        }
        if (this.f24379o.m39336a(getCurrentItem())) {
            return;
        }
        boolean zM40017g0 = m40017g0(true);
        if (!zM40017g0 && (interfaceC8118b = this.f24379o) != null) {
            interfaceC8118b.mo39338c(true);
        }
        CoreSuggested.UserInfo userInfo = this.f24375k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD || ExpandedCardStyleHelper.m39093o().m39106s()) {
            pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, zM40017g0, false, this.f24374j, "");
        } else {
            pza0.m174355g("p_suggest_users_home_view", zM40017g0, false, this.f24374j, "");
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m40020j0() {
        if (m39989E() || m39992H() || !aia0.m97972m().m97981p(this.f24374j)) {
            if (this.f24371g.f24398f.contains(this.f24385u)) {
                ArrayList arrayList = new ArrayList(this.f24378n.m99080a());
                this.f24381q = -1;
                this.f24371g.m40043J(arrayList);
                this.f24369e.setIndicatorCount(arrayList.size());
                return;
            }
            return;
        }
        if (!TextUtils.equals(this.f24377m, this.f24374j.f56859id) || this.f24371g.f24398f.contains(this.f24385u)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(this.f24378n.m99080a());
        this.f24381q = arrayList2.size();
        arrayList2.add(this.f24385u);
        this.f24371g.m40043J(arrayList2);
        this.f24369e.setIndicatorCount(arrayList2.size());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40021v(this);
        this.f24366b.setWidthHeightRate(0.6f);
        this.f24366b.setOffscreenPageLimit(1);
        this.f24366b.setPreferVPagerOnHorizontalConflict(false);
        this.f24366b.setScrollble(false);
        this.f24366b.setAllowZoom(true);
    }

    public void setAutoPlayEnabled(boolean z) {
        this.f24373i = z;
    }

    public void setCardStyleChangeProgress(float f) {
        CoreSuggested.UserInfo userInfo = this.f24375k;
        if (userInfo == null || userInfo.renderFrom != CardInfoRenderFrom.CARD) {
            return;
        }
        float f2 = CardHeadLayoutV2.f24337w;
        if (f2 > 0.6f) {
            this.f24366b.setWidthHeightRate(((f2 - 0.6f) * f) + 0.6f);
        }
    }

    public void setCertBtnShowing(boolean z) {
        this.f24383s = z;
        PictureView currentView = getCurrentView();
        if (currentView != null) {
            bnl0.m105524M(currentView.f28880A, !z);
            bnl0.m105524M(currentView.f28881B, !z);
        }
    }

    public void setParentHolder(pzk pzkVar) {
        this.f24384t = pzkVar;
    }

    /* JADX INFO: renamed from: v */
    public final void m40021v(View view) {
        ol4.m168101a(this, view);
    }

    /* JADX INFO: renamed from: x */
    public void m40022x() {
        if (asj0.m99935d0() && NullChecker.m82486a(getCurrentView()) && (getCurrentView().f28888G instanceof Video)) {
            getCurrentView().m45174V();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m40023y(lb2 lb2Var, int i) {
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f24366b;
        if (vPager_SquaredRefactor == null || this.f24369e == null) {
            return;
        }
        vPager_SquaredRefactor.setAdapter(lb2Var);
        this.f24366b.m4191i();
        this.f24366b.m4187d(this.f24370f);
        this.f24369e.setupWithPager(this.f24366b);
        this.f24369e.setIndicatorCount(i);
        bnl0.m105525M0(this.f24368d, i > 1);
        this.f24369e.setSelectedIndex(this.f24366b.getCurrentItem());
    }

    /* JADX INFO: renamed from: z */
    public void m40024z() {
        ExpandedImageSwitchView.InterfaceC8118b interfaceC8118b;
        if (m40004T() || m39988D() || (interfaceC8118b = this.f24379o) == null) {
            return;
        }
        interfaceC8118b.mo39337b();
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24370f = new C8194a();
        this.f24371g = new C8198e();
        this.f24372h = 0;
        this.f24373i = true;
        this.f24376l = "";
        this.f24377m = "";
        this.f24381q = -1;
        this.f24382r = false;
        this.f24383s = false;
        this.f24385u = new AdmobMedia();
        this.f24386v = false;
        this.f24364A = false;
    }

    public CardIntlPictureViewOpt(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24370f = new C8194a();
        this.f24371g = new C8198e();
        this.f24372h = 0;
        this.f24373i = true;
        this.f24376l = "";
        this.f24377m = "";
        this.f24381q = -1;
        this.f24382r = false;
        this.f24383s = false;
        this.f24385u = new AdmobMedia();
        this.f24386v = false;
        this.f24364A = false;
    }
}
