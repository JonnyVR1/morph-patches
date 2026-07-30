package p003l;

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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemMomentGuidePhaseTwo;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageBar;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p000p1.mobile.putong.core.p001ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.moment.MessageMomentExpandItemPictureView;
import com.p000p1.mobile.putong.core.p001ui.messages.model.moment.MessageMomentExpandItemPlayView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.MessageMomentGuide;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.data.LivePhoto;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import l.c3c0;
import l.cwf0;
import l.i0e;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.osz;
import l.qib0;
import l.roj0;
import l.s7m;
import l.t100;
import l.tqm0;
import l.vrz;
import l.vwb;
import l.wc80;
import l.xdl0;
import l.zvf0;
import org.eclipse.jetty.http.HttpStatus;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;
import p028v.VPager;
import p028v.VRelative;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ksz implements s7m<vrz>, ViewPager.j {

    /* JADX INFO: renamed from: A */
    public static String f5032A = "bubble_moment_expand_like_guide";

    /* JADX INFO: renamed from: a */
    public VLinear f5033a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5034b;

    /* JADX INFO: renamed from: c */
    public VPager f5035c;

    /* JADX INFO: renamed from: d */
    public NewPictureContainerIndicator f5036d;

    /* JADX INFO: renamed from: e */
    public VRelative f5037e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f5038f;

    /* JADX INFO: renamed from: g */
    public VImage f5039g;

    /* JADX INFO: renamed from: h */
    public VImage f5040h;

    /* JADX INFO: renamed from: i */
    public VLinear f5041i;

    /* JADX INFO: renamed from: j */
    public VText f5042j;

    /* JADX INFO: renamed from: k */
    public VText f5043k;

    /* JADX INFO: renamed from: l */
    public VImage f5044l;

    /* JADX INFO: renamed from: m */
    public MessagesAct f5045m;

    /* JADX INFO: renamed from: n */
    public vrz f5046n;

    /* JADX INFO: renamed from: o */
    public C0387e f5047o;

    /* JADX INFO: renamed from: p */
    public MessageMomentExpandItemPlayView f5048p;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, MessageMomentExpandItemLivePhotoView> f5049q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public c4g0 f5050r;

    /* JADX INFO: renamed from: s */
    public c4g0 f5051s;

    /* JADX INFO: renamed from: t */
    public c4g0 f5052t;

    /* JADX INFO: renamed from: u */
    public ItemMomentGuidePhaseTwo f5053u;

    /* JADX INFO: renamed from: v */
    public MessageMomentGuide f5054v;

    /* JADX INFO: renamed from: w */
    public c4g0 f5055w;

    /* JADX INFO: renamed from: x */
    public cwf0 f5056x;

    /* JADX INFO: renamed from: y */
    public int f5057y;

    /* JADX INFO: renamed from: z */
    public GestureDetector f5058z;

    /* JADX INFO: renamed from: l.ksz$a */
    public class C0383a extends ViewOutlineProvider {
        public C0383a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), t100.o);
        }
    }

    /* JADX INFO: renamed from: l.ksz$d */
    public class C0386d extends GestureDetector.SimpleOnGestureListener {
        public C0386d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (motionEvent.getY() > ksz.this.f5033a.getBottom()) {
                ksz.this.m5813F();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (motionEvent.getY() > ksz.this.f5033a.getBottom()) {
                MessageBar messageBarM4844t0 = ksz.this.f5046n.m6497e0().mo2046A0().m6499g0().m4844t0();
                if (messageBarM4844t0 instanceof MessageBarOpt) {
                    Rect rect = new Rect();
                    ((MessageBarOpt) messageBarM4844t0).f1876x.getGlobalVisibleRect(rect);
                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        ksz.this.m5814G();
                        return true;
                    }
                }
                ksz.this.m5813F();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.ksz$e */
    public class C0387e extends eb2 {

        /* JADX INFO: renamed from: e */
        public List<Media> f5065e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public Stack<View> f5066f = new Stack<>();

        public C0387e() {
        }

        public int getCount() {
            return this.f5065e.size();
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: o */
        public void mo923o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            if (obj instanceof MessageMomentExpandItemPictureView) {
                this.f5066f.add((MessageMomentExpandItemPictureView) obj);
            }
        }

        @Override // p003l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo924p(ViewGroup viewGroup, int i) {
            Picture picture = (Media) this.f5065e.get(i);
            if (CoreModule.N().Lq() && (picture instanceof Picture)) {
                Picture picture2 = picture;
                if (NullChecker.a(picture2.livePhoto)) {
                    MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = (MessageMomentExpandItemLivePhotoView) ksz.this.act().inflater().inflate(l6c0.f2, viewGroup, false);
                    int iY0 = xdl0.y0();
                    int i2 = t100.h;
                    int i3 = (iY0 - i2) - i2;
                    viewGroup.addView(messageMomentExpandItemLivePhotoView);
                    ksz.this.f5049q.put(Integer.valueOf(i), messageMomentExpandItemLivePhotoView);
                    messageMomentExpandItemLivePhotoView.m2556Z(m5843w(picture2));
                    messageMomentExpandItemLivePhotoView.m2558b0(i3, i3);
                    xdl0.E0(messageMomentExpandItemLivePhotoView.f1912g, new View.OnClickListener() { // from class: l.lsz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f5411a.m5840t(view);
                        }
                    });
                    xdl0.E0(messageMomentExpandItemLivePhotoView.f1914i, new View.OnClickListener() { // from class: l.msz
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f5758a.m5841u(view);
                        }
                    });
                    return messageMomentExpandItemLivePhotoView;
                }
            }
            if (picture instanceof Picture) {
                final MessageMomentExpandItemPictureView messageMomentExpandItemPictureView = !this.f5066f.isEmpty() ? (MessageMomentExpandItemPictureView) this.f5066f.pop() : (MessageMomentExpandItemPictureView) ksz.this.act().inflater().inflate(l6c0.g2, viewGroup, false);
                viewGroup.addView(messageMomentExpandItemPictureView);
                xdl0.E0(messageMomentExpandItemPictureView, new View.OnClickListener() { // from class: l.nsz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5963a.m5842v(messageMomentExpandItemPictureView, view);
                    }
                });
                messageMomentExpandItemPictureView.m2570z(picture);
                return messageMomentExpandItemPictureView;
            }
            if (!(picture instanceof Video)) {
                return Integer.valueOf(i);
            }
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = (MessageMomentExpandItemPlayView) ksz.this.act().inflater().inflate(l6c0.h2, viewGroup, false);
            int iY1 = xdl0.y0();
            int i4 = t100.h;
            int i5 = (iY1 - i4) - i4;
            viewGroup.addView(messageMomentExpandItemPlayView);
            ksz.this.f5048p = messageMomentExpandItemPlayView;
            messageMomentExpandItemPlayView.m2593e0((Video) picture);
            messageMomentExpandItemPlayView.m2595h0(i5, i5);
            return messageMomentExpandItemPlayView;
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m5840t(View view) {
            if (ksz.this.f5035c.getCurrentItem() > 0) {
                VPager vPager = ksz.this.f5035c;
                vPager.T(vPager.getCurrentItem() - 1, false);
            }
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m5841u(View view) {
            if (ksz.this.f5035c.getCurrentItem() < getCount() - 1) {
                VPager vPager = ksz.this.f5035c;
                vPager.T(vPager.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m5842v(MessageMomentExpandItemPictureView messageMomentExpandItemPictureView, View view) {
            int iM2569q = messageMomentExpandItemPictureView.m2569q();
            if (iM2569q == -1 && ksz.this.f5035c.getCurrentItem() > 0) {
                VPager vPager = ksz.this.f5035c;
                vPager.T(vPager.getCurrentItem() - 1, false);
            } else {
                if (iM2569q != 1 || ksz.this.f5035c.getCurrentItem() >= getCount() - 1) {
                    return;
                }
                VPager vPager2 = ksz.this.f5035c;
                vPager2.T(vPager2.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: w */
        public final Video m5843w(Picture picture) {
            Video video = new Video();
            Picture pictureNew_ = Picture.new_();
            video.cover = pictureNew_;
            ((Media) pictureNew_).url = ((Media) picture).url;
            ((Media) pictureNew_).urlKey = Media.URL_TO_CACHEKEY(((Media) picture).url);
            Picture picture2 = video.cover;
            ((Media) picture2).mediaType = ((Media) picture).mediaType;
            MediaLocalStatus mediaLocalStatus = ((Media) picture).status;
            if (mediaLocalStatus == null) {
                ((Media) picture2).status = MediaLocalStatus.get("normal");
            } else {
                ((Media) picture2).status = mediaLocalStatus;
            }
            Picture picture3 = video.cover;
            ((Media) picture3).labels = ((Media) picture).labels;
            picture3.gaussianBlurParameters = picture.gaussianBlurParameters;
            picture3.size = picture.size;
            LivePhoto livePhoto = picture.livePhoto;
            ((Media) video).url = livePhoto.url;
            ((Media) video).mediaType = livePhoto.mediaType;
            video.duration = livePhoto.duration;
            video.size = livePhoto.size;
            return video;
        }

        /* JADX INFO: renamed from: x */
        public void m5844x(List<Media> list) {
            this.f5065e = list;
            notifyDataSetChanged();
        }
    }

    public ksz(MessagesAct messagesAct) {
        this.f5058z = new GestureDetector((Context) this.f5045m, (GestureDetector.OnGestureListener) new C0386d());
        this.f5045m = messagesAct;
    }

    /* JADX INFO: renamed from: J */
    private boolean m5783J() {
        if (NullChecker.a(this.f5048p)) {
            return this.f5048p.m2589V();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I = m5816I();
        if (NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I)) {
            return messageMomentExpandItemLivePhotoViewM5816I.m2551S();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m5784L(View view) {
        m5813F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m5787b0() {
        if (NullChecker.a(this.f5048p) && ConnectivityReceiver.l()) {
            this.f5048p.m2592b0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I = m5816I();
        if (ConnectivityReceiver.l() && NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I)) {
            messageMomentExpandItemLivePhotoViewM5816I.m2555X();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5788c(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.N().d(th);
        CoreModule.N().Yc(coreMomentInfo, "p_moment_view", false, CoreModule.P().i().z3(th), z);
    }

    /* JADX INFO: renamed from: c0 */
    private void m5789c0(final String str, final String str2) {
        final CoreMomentInfo coreMomentInfoUs = CoreModule.N().us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfoUs == null) {
            coreMomentInfoUs = (CoreMomentInfo) CoreModule.N().Mh(str, CoreMomentInfo.JSON_ADAPTER);
            mkd0.z(this.f5055w);
            this.f5055w = CoreModule.N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new w9j() { // from class: l.fsz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((CoreMomentInfo) obj));
                }
            }).subscribe((m250) mkd0.H(new e30() { // from class: l.gsz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4007a.m5822Q((CoreMomentInfo) obj);
                }
            }, new e30() { // from class: l.hsz
                @Override // p003l.e30
                public final void call(Object obj) {
                    ksz.m5798n((Throwable) obj);
                }
            }));
        }
        if (NullChecker.a(coreMomentInfoUs)) {
            this.f5039g.setImageResource(coreMomentInfoUs.haveLiked ? c3c0.B3 : c3c0.E3);
        } else {
            this.f5039g.setImageResource(c3c0.E3);
        }
        if (NullChecker.a(this.f5039g.getParent()) && ((View) this.f5039g.getParent()).getTouchDelegate() == null) {
            this.f5039g.post(new Runnable() { // from class: l.isz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4492a.m5823R();
                }
            });
        }
        xdl0.E0(this.f5039g, new View.OnClickListener() { // from class: l.jsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4724a.m5821P(coreMomentInfoUs, str, str2, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m5798n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m5801r() {
        ViewGroup.LayoutParams layoutParams = this.f5034b.getLayoutParams();
        int iY0 = xdl0.y0();
        int i = t100.c;
        layoutParams.height = (iY0 - i) - i;
        this.f5034b.setLayoutParams(layoutParams);
        this.f5035c.setOutlineProvider(new C0383a());
        this.f5035c.setClipToOutline(true);
        qib0.G.L0(this.f5038f, "res://" + this.f5045m.getPackageName() + "/" + c3c0.D3);
        xdl0.M(this.f5033a, false);
        this.f5035c.d(this);
        xdl0.E0(this.f5044l, new View.OnClickListener() { // from class: l.bsz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2492a.m5784L(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m5809B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return osz.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessagesAct act() {
        return this.f5045m;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5811C0() {
        return this.f5045m;
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m5836i1(vrz vrzVar) {
        this.f5046n = vrzVar;
    }

    /* JADX INFO: renamed from: F */
    public void m5813F() {
        this.f5053u = null;
        mkd0.z(this.f5055w);
        mkd0.z(this.f5050r);
        mkd0.z(this.f5051s);
        mkd0.z(this.f5052t);
        if (NullChecker.a(this.f5048p)) {
            this.f5048p.m2594g0();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I = m5816I();
        if (NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I)) {
            messageMomentExpandItemLivePhotoViewM5816I.m2557a0();
        }
        if (xdl0.O0(this.f5033a)) {
            this.f5033a.post(new Runnable() { // from class: l.wrz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8609a.m5817K();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m5814G() {
        User userPa = CoreModule.c.e0.Pa(this.f5054v.ownerId);
        this.f5046n.m6497e0().mo2066l().m4229d7(this.f5054v);
        this.f5046n.m6497e0().mo2046A0().m6499g0().m4799X1(userPa == null ? "" : userPa.name, this.f5054v);
        m5813F();
    }

    /* JADX INFO: renamed from: H */
    public final void m5815H() {
        if (NullChecker.a(this.f5048p)) {
            this.f5048p.m2591a0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I = m5816I();
        if (NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I)) {
            messageMomentExpandItemLivePhotoViewM5816I.m2554W();
        }
    }

    /* JADX INFO: renamed from: I */
    public final MessageMomentExpandItemLivePhotoView m5816I() {
        if (NullChecker.a(this.f5049q) && this.f5049q.containsKey(Integer.valueOf(this.f5057y))) {
            return this.f5049q.get(Integer.valueOf(this.f5057y));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m5817K() {
        VLinear vLinear = this.f5033a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationY", 0.0f, -vLinear.getHeight());
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new C0385c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m5818M(Integer num) {
        if (tqm0.p().q() || !xdl0.O0(this.f5033a)) {
            return;
        }
        m5813F();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m5819N(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.l()) {
            m5815H();
        } else {
            if (m5783J()) {
                return;
            }
            m5787b0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m5820O(String str, String str2, c cVar) {
        if (cVar == c.i) {
            m5789c0(str, str2);
        } else if (cVar == c.j) {
            m5815H();
        } else if (cVar == c.k) {
            m5813F();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m5821P(final CoreMomentInfo coreMomentInfo, final String str, final String str2, View view) {
        if (coreMomentInfo == null) {
            osi0.g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            act().duringCreated(CoreModule.N().Kn(coreMomentInfo.owner, ((CopyObject) coreMomentInfo).id, !coreMomentInfo.haveLiked, "p_chat_view")).subscribe((m250) mkd0.H(new e30() { // from class: l.zrz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9406a.m5824S(coreMomentInfo, z, str, str2, (roj0) obj);
                }
            }, new e30() { // from class: l.asz
                @Override // p003l.e30
                public final void call(Object obj) {
                    ksz.m5788c(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m5822Q(CoreMomentInfo coreMomentInfo) {
        this.f5039g.setImageResource(coreMomentInfo.haveLiked ? c3c0.B3 : c3c0.E3);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m5823R() {
        Rect rect = new Rect();
        this.f5039g.getHitRect(rect);
        int i = rect.top;
        int i2 = t100.l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f5039g.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f5039g));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m5824S(CoreMomentInfo coreMomentInfo, boolean z, String str, String str2, roj0 roj0Var) {
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        this.f5039g.setImageResource(!z2 ? c3c0.B3 : c3c0.E3);
        if (coreMomentInfo.haveLiked) {
            mrz.m6460k(this.f5045m, coreMomentInfo);
        }
        CoreModule.N().Yc(coreMomentInfo, "p_moment_view", false, HttpStatus.CREATED_201, z);
        if (NullChecker.a(this.f5053u)) {
            this.f5053u.m1608D(str, str2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m5825T(View view) {
        zvf0.r("e_moment_reply", "p_moment_view");
        m5814G();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m5826U(User user, String str) {
        VLinear vLinear = this.f5033a;
        vLinear.setTranslationY(-vLinear.getHeight());
        this.f5033a.setVisibility(0);
        VLinear vLinear2 = this.f5033a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear2, "translationY", -vLinear2.getHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setStartDelay(500L);
        objectAnimatorOfFloat.addListener(new C0384b(user, str));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: V */
    public final void m5827V() {
        this.f5052t = this.f5045m.duringCreated(tqm0.p().i()).subscribe((m250) mkd0.G(new e30() { // from class: l.xrz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8830a.m5818M((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m5828W() {
        this.f5051s = this.f5045m.duringCreated(ConnectivityReceiver.m()).subscribe((m250) mkd0.G(new e30() { // from class: l.yrz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9128a.m5819N((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m5829X(final String str, final String str2) {
        MessagesAct messagesAct = this.f5045m;
        this.f5050r = messagesAct.duringCreated(messagesAct.lifecycle()).subscribe((m250) mkd0.G(new e30() { // from class: l.esz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f3373a.m5820O(str, str2, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m5830Y(MotionEvent motionEvent) {
        if (xdl0.O0(this.f5033a)) {
            this.f5058z.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m5831Z() {
        cwf0 cwf0Var = this.f5056x;
        if (cwf0Var == null) {
            return;
        }
        i0e.e(cwf0Var);
        this.f5056x = null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m5832a0(String str) {
        cwf0 cwf0VarC = i0e.c("p_moment_view", ksz.class.getName());
        this.f5056x = cwf0VarC;
        cwf0VarC.p(new j760[]{j760.a("moment_id", str)});
        i0e.f(this.f5056x);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m5833d0(MessageMomentGuide messageMomentGuide) {
        CoreMomentInfo coreMomentInfoUs = CoreModule.N().us(messageMomentGuide.id, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfoUs == null) {
            coreMomentInfoUs = (CoreMomentInfo) CoreModule.N().Mh(messageMomentGuide.id, CoreMomentInfo.JSON_ADAPTER);
        }
        if (coreMomentInfoUs == null) {
            return;
        }
        if (messageMomentGuide.type != 1 || vwb.J(coreMomentInfoUs.media)) {
            if (messageMomentGuide.type != 2 || vwb.J(coreMomentInfoUs.media)) {
                return;
            }
            xdl0.M(this.f5036d, false);
            C0387e c0387e = new C0387e();
            this.f5047o = c0387e;
            this.f5035c.setAdapter(c0387e);
            this.f5047o.m5844x(coreMomentInfoUs.media);
            return;
        }
        int size = coreMomentInfoUs.media.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f5036d;
        if (size > 1) {
            xdl0.M(newPictureContainerIndicator, true);
            this.f5036d.setIndicatorCount(coreMomentInfoUs.media.size());
        } else {
            xdl0.M(newPictureContainerIndicator, false);
        }
        C0387e c0387e2 = new C0387e();
        this.f5047o = c0387e2;
        this.f5035c.setAdapter(c0387e2);
        this.f5047o.m5844x(coreMomentInfoUs.media);
    }

    /* JADX INFO: renamed from: e0 */
    public void m5834e0(MessageMomentGuide messageMomentGuide, ItemMomentGuidePhaseTwo itemMomentGuidePhaseTwo) {
        this.f5053u = itemMomentGuidePhaseTwo;
        this.f5054v = messageMomentGuide;
        final String str = messageMomentGuide.id;
        String str2 = messageMomentGuide.ownerId;
        final User userPa = CoreModule.c.e0.Pa(str2);
        this.f5042j.setText((userPa == null || userPa.isFemale()) ? "她的动态" : "他的动态");
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        AppCompatTextView appCompatTextView = this.f5043k;
        if (zIsEmpty) {
            xdl0.M(appCompatTextView, false);
        } else {
            xdl0.M(appCompatTextView, true);
            this.f5043k.setText(messageMomentGuide.desc);
        }
        m5833d0(messageMomentGuide);
        m5829X(messageMomentGuide.id, str2);
        xdl0.E0(this.f5040h, new View.OnClickListener() { // from class: l.csz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2801a.m5825T(view);
            }
        });
        if (xdl0.O0(this.f5033a)) {
            return;
        }
        this.f5033a.setVisibility(4);
        this.f5033a.post(new Runnable() { // from class: l.dsz
            @Override // java.lang.Runnable
            public final void run() {
                this.f3108a.m5826U(userPa, str);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m5835f0(Act act, View view, User user) {
        if (!wc80.e().k() && ((Long) CoreModule.c.e0.y2.get()).longValue() <= 0) {
            String strConcat = ((user == null || user.isFemale()) ? "她" : "他").concat("的动态不错，友好二连拉近距离～");
            a aVar = new a(act);
            aVar.B(t100.d(2.0f)).D(strConcat).J(13.0f).k(new int[]{Color.parseColor("#fe7e1d")}).l(t100.d(7.0f)).p(75).x(-t100.d(4.0f)).w(t100.d(10.0f)).b(5000L).e(true).q(a.Q);
            d.l().u(aVar, view, f5032A);
            CoreModule.c.e0.y2.put(Long.valueOf(mqi0.o()));
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5809B = m5809B(layoutInflater, viewGroup);
        m5801r();
        return viewM5809B;
    }

    public void onPageSelected(int i) {
        if (this.f5057y != i) {
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I = m5816I();
            if (NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I)) {
                messageMomentExpandItemLivePhotoViewM5816I.m2557a0();
            }
            this.f5057y = i;
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM5816I2 = m5816I();
            if (NullChecker.a(messageMomentExpandItemLivePhotoViewM5816I2)) {
                messageMomentExpandItemLivePhotoViewM5816I2.m2555X();
            }
        }
        this.f5036d.b(i);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ksz$b */
    public class C0384b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f5060a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f5061b;

        public C0384b(User user, String str) {
            this.f5060a = user;
            this.f5061b = str;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ksz.this.m5787b0();
            ksz kszVar = ksz.this;
            kszVar.m5835f0(kszVar.f5045m, ksz.this.f5039g, this.f5060a);
            ksz.this.m5832a0(this.f5061b);
            ksz.this.m5828W();
            ksz.this.m5827V();
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
    public class C0385c implements Animator.AnimatorListener {
        public C0385c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            xdl0.M(ksz.this.f5033a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            xdl0.M(ksz.this.f5033a, false);
            ksz.this.m5831Z();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }
}
