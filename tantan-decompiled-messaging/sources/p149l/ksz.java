package p149l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Rect;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.MessageMomentGuide;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMomentGuidePhaseTwo;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageBar;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.p046p1.mobile.putong.core.p053ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.moment.MessageMomentExpandItemPictureView;
import com.p046p1.mobile.putong.core.p053ui.messages.model.moment.MessageMomentExpandItemPlayView;
import com.p046p1.mobile.putong.data.LivePhoto;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ksz implements s7m<vrz>, ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: A */
    public static String f124524A = "bubble_moment_expand_like_guide";

    /* JADX INFO: renamed from: a */
    public VLinear f124525a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f124526b;

    /* JADX INFO: renamed from: c */
    public VPager f124527c;

    /* JADX INFO: renamed from: d */
    public NewPictureContainerIndicator f124528d;

    /* JADX INFO: renamed from: e */
    public VRelative f124529e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f124530f;

    /* JADX INFO: renamed from: g */
    public VImage f124531g;

    /* JADX INFO: renamed from: h */
    public VImage f124532h;

    /* JADX INFO: renamed from: i */
    public VLinear f124533i;

    /* JADX INFO: renamed from: j */
    public VText f124534j;

    /* JADX INFO: renamed from: k */
    public VText f124535k;

    /* JADX INFO: renamed from: l */
    public VImage f124536l;

    /* JADX INFO: renamed from: m */
    public MessagesAct f124537m;

    /* JADX INFO: renamed from: n */
    public vrz f124538n;

    /* JADX INFO: renamed from: o */
    public C18078e f124539o;

    /* JADX INFO: renamed from: p */
    public MessageMomentExpandItemPlayView f124540p;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, MessageMomentExpandItemLivePhotoView> f124541q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public c4g0 f124542r;

    /* JADX INFO: renamed from: s */
    public c4g0 f124543s;

    /* JADX INFO: renamed from: t */
    public c4g0 f124544t;

    /* JADX INFO: renamed from: u */
    public ItemMomentGuidePhaseTwo f124545u;

    /* JADX INFO: renamed from: v */
    public MessageMomentGuide f124546v;

    /* JADX INFO: renamed from: w */
    public c4g0 f124547w;

    /* JADX INFO: renamed from: x */
    public cwf0 f124548x;

    /* JADX INFO: renamed from: y */
    public int f124549y;

    /* JADX INFO: renamed from: z */
    public GestureDetector f124550z;

    /* JADX INFO: renamed from: l.ksz$a */
    public class C18074a extends ViewOutlineProvider {
        public C18074a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), t100.f167266o);
        }
    }

    /* JADX INFO: renamed from: l.ksz$d */
    public class C18077d extends GestureDetector.SimpleOnGestureListener {
        public C18077d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (motionEvent.getY() > ksz.this.f124525a.getBottom()) {
                ksz.this.m147165F();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (motionEvent.getY() > ksz.this.f124525a.getBottom()) {
                MessageBar messageBarM128210t0 = ksz.this.f124538n.m156455e0().mo48954A0().m156457g0().m128210t0();
                if (messageBarM128210t0 instanceof MessageBarOpt) {
                    Rect rect = new Rect();
                    ((MessageBarOpt) messageBarM128210t0).f31985x.getGlobalVisibleRect(rect);
                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ksz.this.m147166G();
                        return true;
                    }
                }
                ksz.this.m147165F();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ksz$e */
    public class C18078e extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<Media> f124557e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public Stack<View> f124558f = new Stack<>();

        public C18078e() {
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f124557e.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            if (obj instanceof MessageMomentExpandItemPictureView) {
                this.f124558f.add((MessageMomentExpandItemPictureView) obj);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            Media media = this.f124557e.get(i);
            if (CoreModule.m29934N().mo60293Lq() && (media instanceof Picture)) {
                Picture picture = (Picture) media;
                if (NullChecker.m81303a(picture.livePhoto)) {
                    MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = (MessageMomentExpandItemLivePhotoView) ksz.this.getAct().inflater().inflate(l6c0.f126469f2, viewGroup, false);
                    int iM208412y0 = xdl0.m208412y0();
                    int i2 = t100.f167259h;
                    int i3 = (iM208412y0 - i2) - i2;
                    viewGroup.addView(messageMomentExpandItemLivePhotoView);
                    ksz.this.f124541q.put(Integer.valueOf(i), messageMomentExpandItemLivePhotoView);
                    messageMomentExpandItemLivePhotoView.m49427Z(m147194w(picture));
                    messageMomentExpandItemLivePhotoView.m49429b0(i3, i3);
                    xdl0.m208329E0(messageMomentExpandItemLivePhotoView.f32021g, new View.OnClickListener() { // from class: l.lsz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f129919a.m147191t(view);
                        }
                    });
                    xdl0.m208329E0(messageMomentExpandItemLivePhotoView.f32023i, new View.OnClickListener() { // from class: l.msz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f135544a.m147192u(view);
                        }
                    });
                    return messageMomentExpandItemLivePhotoView;
                }
            }
            if (media instanceof Picture) {
                final MessageMomentExpandItemPictureView messageMomentExpandItemPictureView = !this.f124558f.isEmpty() ? (MessageMomentExpandItemPictureView) this.f124558f.pop() : (MessageMomentExpandItemPictureView) ksz.this.getAct().inflater().inflate(l6c0.f126476g2, viewGroup, false);
                viewGroup.addView(messageMomentExpandItemPictureView);
                xdl0.m208329E0(messageMomentExpandItemPictureView, new View.OnClickListener() { // from class: l.nsz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f140305a.m147193v(messageMomentExpandItemPictureView, view);
                    }
                });
                messageMomentExpandItemPictureView.m49432z((Picture) media);
                return messageMomentExpandItemPictureView;
            }
            if (!(media instanceof Video)) {
                return Integer.valueOf(i);
            }
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = (MessageMomentExpandItemPlayView) ksz.this.getAct().inflater().inflate(l6c0.f126483h2, viewGroup, false);
            int iM208412y1 = xdl0.m208412y0();
            int i4 = t100.f167259h;
            int i5 = (iM208412y1 - i4) - i4;
            viewGroup.addView(messageMomentExpandItemPlayView);
            ksz.this.f124540p = messageMomentExpandItemPlayView;
            messageMomentExpandItemPlayView.m49455e0((Video) media);
            messageMomentExpandItemPlayView.m49457h0(i5, i5);
            return messageMomentExpandItemPlayView;
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m147191t(View view) {
            if (ksz.this.f124527c.getCurrentItem() > 0) {
                VPager vPager = ksz.this.f124527c;
                vPager.m4176T(vPager.getCurrentItem() - 1, false);
            }
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m147192u(View view) {
            if (ksz.this.f124527c.getCurrentItem() < getCount() - 1) {
                VPager vPager = ksz.this.f124527c;
                vPager.m4176T(vPager.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m147193v(MessageMomentExpandItemPictureView messageMomentExpandItemPictureView, View view) {
            int iM49431q = messageMomentExpandItemPictureView.m49431q();
            if (iM49431q == -1 && ksz.this.f124527c.getCurrentItem() > 0) {
                VPager vPager = ksz.this.f124527c;
                vPager.m4176T(vPager.getCurrentItem() - 1, false);
            } else {
                if (iM49431q != 1 || ksz.this.f124527c.getCurrentItem() >= getCount() - 1) {
                    return;
                }
                VPager vPager2 = ksz.this.f124527c;
                vPager2.m4176T(vPager2.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: w */
        public final Video m147194w(Picture picture) {
            Video video = new Video();
            Picture pictureNew_ = Picture.new_();
            video.cover = pictureNew_;
            pictureNew_.url = picture.url;
            pictureNew_.urlKey = Media.URL_TO_CACHEKEY(picture.url);
            Picture picture2 = video.cover;
            picture2.mediaType = picture.mediaType;
            MediaLocalStatus mediaLocalStatus = picture.status;
            if (mediaLocalStatus == null) {
                picture2.status = MediaLocalStatus.get("normal");
            } else {
                picture2.status = mediaLocalStatus;
            }
            Picture picture3 = video.cover;
            picture3.labels = picture.labels;
            picture3.gaussianBlurParameters = picture.gaussianBlurParameters;
            picture3.size = picture.size;
            LivePhoto livePhoto = picture.livePhoto;
            video.url = livePhoto.url;
            video.mediaType = livePhoto.mediaType;
            video.duration = livePhoto.duration;
            video.size = livePhoto.size;
            return video;
        }

        /* JADX INFO: renamed from: x */
        public void m147195x(List<Media> list) {
            this.f124557e = list;
            notifyDataSetChanged();
        }
    }

    public ksz(MessagesAct messagesAct) {
        this.f124550z = new GestureDetector(this.f124537m, new C18077d());
        this.f124537m = messagesAct;
    }

    /* JADX INFO: renamed from: J */
    private boolean m147136J() {
        if (NullChecker.m81303a(this.f124540p)) {
            return this.f124540p.m49451V();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I = m147168I();
        if (NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I)) {
            return messageMomentExpandItemLivePhotoViewM147168I.m49422S();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m147137L(View view) {
        m147165F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m147140b0() {
        if (NullChecker.m81303a(this.f124540p) && ConnectivityReceiver.m81289l()) {
            this.f124540p.m49454b0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I = m147168I();
        if (ConnectivityReceiver.m81289l() && NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I)) {
            messageMomentExpandItemLivePhotoViewM147168I.m49426X();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m147141c(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.m29934N().mo60345d(th);
        CoreModule.m29934N().mo60334Yc(coreMomentInfo, "p_moment_view", false, CoreModule.m29935P().m94658i().mo158481z3(th), z);
    }

    /* JADX INFO: renamed from: c0 */
    private void m147142c0(final String str, final String str2) {
        final CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60397us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(str, CoreMomentInfo.JSON_ADAPTER);
            mkd0.m154992z(this.f124547w);
            this.f124547w = CoreModule.m29934N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.fsz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((CoreMomentInfo) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.gsz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104236a.m147174Q((CoreMomentInfo) obj);
                }
            }, new e30() { // from class: l.hsz
                @Override // p149l.e30
                public final void call(Object obj) {
                    ksz.m147151n((Throwable) obj);
                }
            }));
        }
        if (NullChecker.m81303a(coreMomentInfo)) {
            this.f124531g.setImageResource(coreMomentInfo.haveLiked ? c3c0.f78480B3 : c3c0.f78507E3);
        } else {
            this.f124531g.setImageResource(c3c0.f78507E3);
        }
        if (NullChecker.m81303a(this.f124531g.getParent()) && ((View) this.f124531g.getParent()).getTouchDelegate() == null) {
            this.f124531g.post(new Runnable() { // from class: l.isz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114814a.m147175R();
                }
            });
        }
        xdl0.m208329E0(this.f124531g, new View.OnClickListener() { // from class: l.jsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119558a.m147173P(coreMomentInfo, str, str2, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m147151n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m147154r() {
        ViewGroup.LayoutParams layoutParams = this.f124526b.getLayoutParams();
        int iM208412y0 = xdl0.m208412y0();
        int i = t100.f167254c;
        layoutParams.height = (iM208412y0 - i) - i;
        this.f124526b.setLayoutParams(layoutParams);
        this.f124527c.setOutlineProvider(new C18074a());
        this.f124527c.setClipToOutline(true);
        qib0.f154691G.m102331L0(this.f124530f, "res://" + this.f124537m.getPackageName() + "/" + c3c0.f78498D3);
        xdl0.m208344M(this.f124525a, false);
        this.f124527c.m4185d(this);
        xdl0.m208329E0(this.f124536l, new View.OnClickListener() { // from class: l.bsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77151a.m147137L(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m147162B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return osz.m165918b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f124537m;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124537m;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vrz vrzVar) {
        this.f124538n = vrzVar;
    }

    /* JADX INFO: renamed from: F */
    public void m147165F() {
        this.f124545u = null;
        mkd0.m154992z(this.f124547w);
        mkd0.m154992z(this.f124542r);
        mkd0.m154992z(this.f124543s);
        mkd0.m154992z(this.f124544t);
        if (NullChecker.m81303a(this.f124540p)) {
            this.f124540p.m49456g0();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I = m147168I();
        if (NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I)) {
            messageMomentExpandItemLivePhotoViewM147168I.m49428a0();
        }
        if (xdl0.m208349O0(this.f124525a)) {
            this.f124525a.post(new Runnable() { // from class: l.wrz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f187851a.m147169K();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m147166G() {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f124546v.ownerId);
        this.f124538n.m156455e0().mo48974l().m120762d7(this.f124546v);
        this.f124538n.m156455e0().mo48954A0().m156457g0().m128166X1(userM169430Pa == null ? "" : userM169430Pa.name, this.f124546v);
        m147165F();
    }

    /* JADX INFO: renamed from: H */
    public final void m147167H() {
        if (NullChecker.m81303a(this.f124540p)) {
            this.f124540p.m49453a0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I = m147168I();
        if (NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I)) {
            messageMomentExpandItemLivePhotoViewM147168I.m49425W();
        }
    }

    /* JADX INFO: renamed from: I */
    public final MessageMomentExpandItemLivePhotoView m147168I() {
        if (NullChecker.m81303a(this.f124541q) && this.f124541q.containsKey(Integer.valueOf(this.f124549y))) {
            return this.f124541q.get(Integer.valueOf(this.f124549y));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m147169K() {
        VLinear vLinear = this.f124525a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationY", 0.0f, -vLinear.getHeight());
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new C18076c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m147170M(Integer num) {
        if (tqm0.m190131p().m190144q() || !xdl0.m208349O0(this.f124525a)) {
            return;
        }
        m147165F();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m147171N(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m81289l()) {
            m147167H();
        } else {
            if (m147136J()) {
                return;
            }
            m147140b0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m147172O(String str, String str2, C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m147142c0(str, str2);
        } else if (c4319c == C4319c.f15549j) {
            m147167H();
        } else if (c4319c == C4319c.f15550k) {
            m147165F();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m147173P(final CoreMomentInfo coreMomentInfo, final String str, final String str2, View view) {
        if (coreMomentInfo == null) {
            osi0.m165783g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            getAct().duringCreated(CoreModule.m29934N().mo60289Kn(coreMomentInfo.owner, coreMomentInfo.f56008id, !coreMomentInfo.haveLiked, OMSDialogPositon.p_chat_view)).subscribe(mkd0.m154956H(new e30() { // from class: l.zrz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204555a.m147176S(coreMomentInfo, z, str, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.asz
                @Override // p149l.e30
                public final void call(Object obj) {
                    ksz.m147141c(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m147174Q(CoreMomentInfo coreMomentInfo) {
        this.f124531g.setImageResource(coreMomentInfo.haveLiked ? c3c0.f78480B3 : c3c0.f78507E3);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m147175R() {
        Rect rect = new Rect();
        this.f124531g.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.f167263l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f124531g.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f124531g));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m147176S(CoreMomentInfo coreMomentInfo, boolean z, String str, String str2, roj0 roj0Var) {
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        this.f124531g.setImageResource(!z2 ? c3c0.f78480B3 : c3c0.f78507E3);
        if (coreMomentInfo.haveLiked) {
            mrz.m156102k(this.f124537m, coreMomentInfo);
        }
        CoreModule.m29934N().mo60334Yc(coreMomentInfo, "p_moment_view", false, 201, z);
        if (NullChecker.m81303a(this.f124545u)) {
            this.f124545u.m48524D(str, str2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m147177T(View view) {
        zvf0.m220396r("e_moment_reply", "p_moment_view");
        m147166G();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m147178U(User user, String str) {
        VLinear vLinear = this.f124525a;
        vLinear.setTranslationY(-vLinear.getHeight());
        this.f124525a.setVisibility(0);
        VLinear vLinear2 = this.f124525a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear2, "translationY", -vLinear2.getHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setStartDelay(500L);
        objectAnimatorOfFloat.addListener(new C18075b(user, str));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: V */
    public final void m147179V() {
        this.f124544t = this.f124537m.duringCreated(tqm0.m190131p().m190137i()).subscribe(mkd0.m154955G(new e30() { // from class: l.xrz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194194a.m147170M((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m147180W() {
        this.f124543s = this.f124537m.duringCreated(ConnectivityReceiver.m81290m()).subscribe(mkd0.m154955G(new e30() { // from class: l.yrz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199732a.m147171N((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m147181X(final String str, final String str2) {
        MessagesAct messagesAct = this.f124537m;
        this.f124542r = messagesAct.duringCreated(messagesAct.lifecycle()).subscribe(mkd0.m154955G(new e30() { // from class: l.esz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93066a.m147172O(str, str2, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m147182Y(MotionEvent motionEvent) {
        if (xdl0.m208349O0(this.f124525a)) {
            this.f124550z.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m147183Z() {
        cwf0 cwf0Var = this.f124548x;
        if (cwf0Var == null) {
            return;
        }
        i0e.m133796e(cwf0Var);
        this.f124548x = null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m147184a0(String str) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_moment_view", ksz.class.getName());
        this.f124548x = cwf0VarM133794c;
        cwf0VarM133794c.m109040p(j760.m140076a("moment_id", str));
        i0e.m133797f(this.f124548x);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m147185d0(MessageMomentGuide messageMomentGuide) {
        CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60397us(messageMomentGuide.f20446id, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m29934N().mo60295Mh(messageMomentGuide.f20446id, CoreMomentInfo.JSON_ADAPTER);
        }
        if (coreMomentInfo == null) {
            return;
        }
        if (messageMomentGuide.type != 1 || vwb.m200296J(coreMomentInfo.media)) {
            if (messageMomentGuide.type != 2 || vwb.m200296J(coreMomentInfo.media)) {
                return;
            }
            xdl0.m208344M(this.f124528d, false);
            C18078e c18078e = new C18078e();
            this.f124539o = c18078e;
            this.f124527c.setAdapter(c18078e);
            this.f124539o.m147195x(coreMomentInfo.media);
            return;
        }
        int size = coreMomentInfo.media.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f124528d;
        if (size > 1) {
            xdl0.m208344M(newPictureContainerIndicator, true);
            this.f124528d.setIndicatorCount(coreMomentInfo.media.size());
        } else {
            xdl0.m208344M(newPictureContainerIndicator, false);
        }
        C18078e c18078e2 = new C18078e();
        this.f124539o = c18078e2;
        this.f124527c.setAdapter(c18078e2);
        this.f124539o.m147195x(coreMomentInfo.media);
    }

    /* JADX INFO: renamed from: e0 */
    public void m147186e0(MessageMomentGuide messageMomentGuide, ItemMomentGuidePhaseTwo itemMomentGuidePhaseTwo) {
        this.f124545u = itemMomentGuidePhaseTwo;
        this.f124546v = messageMomentGuide;
        final String str = messageMomentGuide.f20446id;
        String str2 = messageMomentGuide.ownerId;
        final User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str2);
        this.f124534j.setText((userM169430Pa == null || userM169430Pa.isFemale()) ? "她的动态" : "他的动态");
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        VText vText = this.f124535k;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f124535k.setText(messageMomentGuide.desc);
        }
        m147185d0(messageMomentGuide);
        m147181X(messageMomentGuide.f20446id, str2);
        xdl0.m208329E0(this.f124532h, new View.OnClickListener() { // from class: l.csz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82436a.m147177T(view);
            }
        });
        if (xdl0.m208349O0(this.f124525a)) {
            return;
        }
        this.f124525a.setVisibility(4);
        this.f124525a.post(new Runnable() { // from class: l.dsz
            @Override // java.lang.Runnable
            public final void run() {
                this.f87797a.m147178U(userM169430Pa, str);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m147187f0(Act act, View view, User user) {
        if (!wc80.m202636e().m202643k() && CoreModule.f17545c.f19639e0.f149509y2.get().longValue() <= 0) {
            String strConcat = ((user == null || user.isFemale()) ? "她" : "他").concat("的动态不错，友好二连拉近距离～");
            C4345a c4345a = new C4345a(act);
            c4345a.m20847B(t100.m186890d(2.0f)).m20849D(strConcat).m20855J(13.0f).m20870k(Color.parseColor("#fe7e1d")).m20871l(t100.m186890d(7.0f)).m20874p(75).m20882x(-t100.m186890d(4.0f)).m20881w(t100.m186890d(10.0f)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20864e(true).m20875q(C4345a.f15683Q);
            C4348d.m20896l().m20909u(c4345a, view, f124524A);
            CoreModule.f17545c.f19639e0.f149509y2.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM147162B = m147162B(layoutInflater, viewGroup);
        m147154r();
        return viewM147162B;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        if (this.f124549y != i) {
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I = m147168I();
            if (NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I)) {
                messageMomentExpandItemLivePhotoViewM147168I.m49428a0();
            }
            this.f124549y = i;
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM147168I2 = m147168I();
            if (NullChecker.m81303a(messageMomentExpandItemLivePhotoViewM147168I2)) {
                messageMomentExpandItemLivePhotoViewM147168I2.m49426X();
            }
        }
        this.f124528d.m36955b(i);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ksz$b */
    public class C18075b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f124552a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f124553b;

        public C18075b(User user, String str) {
            this.f124552a = user;
            this.f124553b = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ksz.this.m147140b0();
            ksz kszVar = ksz.this;
            kszVar.m147187f0(kszVar.f124537m, ksz.this.f124531g, this.f124552a);
            ksz.this.m147184a0(this.f124553b);
            ksz.this.m147180W();
            ksz.this.m147179V();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.ksz$c */
    public class C18076c implements Animator.AnimatorListener {
        public C18076c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            xdl0.m208344M(ksz.this.f124525a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.m208344M(ksz.this.f124525a, false);
            ksz.this.m147183Z();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
