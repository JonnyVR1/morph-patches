package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.MessageMomentGuide;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMomentGuidePhaseTwo;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageBar;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.p051p1.mobile.putong.core.p058ui.messages.model.moment.MessageMomentExpandItemLivePhotoView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.moment.MessageMomentExpandItemPictureView;
import com.p051p1.mobile.putong.core.p058ui.messages.model.moment.MessageMomentExpandItemPlayView;
import com.p051p1.mobile.putong.data.LivePhoto;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class h100 implements iam<s000>, ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: A */
    public static String f107361A = "bubble_moment_expand_like_guide";

    /* JADX INFO: renamed from: a */
    public VLinear f107362a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f107363b;

    /* JADX INFO: renamed from: c */
    public VPager f107364c;

    /* JADX INFO: renamed from: d */
    public NewPictureContainerIndicator f107365d;

    /* JADX INFO: renamed from: e */
    public VRelative f107366e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f107367f;

    /* JADX INFO: renamed from: g */
    public VImage f107368g;

    /* JADX INFO: renamed from: h */
    public VImage f107369h;

    /* JADX INFO: renamed from: i */
    public VLinear f107370i;

    /* JADX INFO: renamed from: j */
    public VText f107371j;

    /* JADX INFO: renamed from: k */
    public VText f107372k;

    /* JADX INFO: renamed from: l */
    public VImage f107373l;

    /* JADX INFO: renamed from: m */
    public MessagesAct f107374m;

    /* JADX INFO: renamed from: n */
    public s000 f107375n;

    /* JADX INFO: renamed from: o */
    public C17370e f107376o;

    /* JADX INFO: renamed from: p */
    public MessageMomentExpandItemPlayView f107377p;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, MessageMomentExpandItemLivePhotoView> f107378q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public kcg0 f107379r;

    /* JADX INFO: renamed from: s */
    public kcg0 f107380s;

    /* JADX INFO: renamed from: t */
    public kcg0 f107381t;

    /* JADX INFO: renamed from: u */
    public ItemMomentGuidePhaseTwo f107382u;

    /* JADX INFO: renamed from: v */
    public MessageMomentGuide f107383v;

    /* JADX INFO: renamed from: w */
    public kcg0 f107384w;

    /* JADX INFO: renamed from: x */
    public l4g0 f107385x;

    /* JADX INFO: renamed from: y */
    public int f107386y;

    /* JADX INFO: renamed from: z */
    public GestureDetector f107387z;

    /* JADX INFO: renamed from: l.h100$a */
    public class C17366a extends ViewOutlineProvider {
        public C17366a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), qa00.f156328o);
        }
    }

    /* JADX INFO: renamed from: l.h100$d */
    public class C17369d extends GestureDetector.SimpleOnGestureListener {
        public C17369d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (motionEvent.getY() > h100.this.f107362a.getBottom()) {
                h100.this.m133236F();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (motionEvent.getY() > h100.this.f107362a.getBottom()) {
                MessageBar messageBarM114041t0 = h100.this.f107375n.m143372e0().mo50138B0().m143374g0().m114041t0();
                if (messageBarM114041t0 instanceof MessageBarOpt) {
                    Rect rect = new Rect();
                    ((MessageBarOpt) messageBarM114041t0).f32833x.getGlobalVisibleRect(rect);
                    if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        h100.this.m133237G();
                        return true;
                    }
                }
                h100.this.m133236F();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.h100$e */
    public class C17370e extends lb2 {

        /* JADX INFO: renamed from: e */
        public List<Media> f107394e = new ArrayList();

        /* JADX INFO: renamed from: f */
        public Stack<View> f107395f = new Stack<>();

        public C17370e() {
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f107394e.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            if (obj instanceof MessageMomentExpandItemPictureView) {
                this.f107395f.add((MessageMomentExpandItemPictureView) obj);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            Media media = this.f107394e.get(i);
            if (CoreModule.m30932N().mo61477Lq() && (media instanceof Picture)) {
                Picture picture = (Picture) media;
                if (NullChecker.m82486a(picture.livePhoto)) {
                    MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoView = (MessageMomentExpandItemLivePhotoView) h100.this.getAct().inflater().inflate(qec0.f157025f2, viewGroup, false);
                    int iM105592y0 = bnl0.m105592y0();
                    int i2 = qa00.f156321h;
                    int i3 = (iM105592y0 - i2) - i2;
                    viewGroup.addView(messageMomentExpandItemLivePhotoView);
                    h100.this.f107378q.put(Integer.valueOf(i), messageMomentExpandItemLivePhotoView);
                    messageMomentExpandItemLivePhotoView.m50610Z(m133265w(picture));
                    messageMomentExpandItemLivePhotoView.m50612b0(i3, i3);
                    bnl0.m105509E0(messageMomentExpandItemLivePhotoView.f32869g, new View.OnClickListener() { // from class: l.i100
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f112473a.m133262t(view);
                        }
                    });
                    bnl0.m105509E0(messageMomentExpandItemLivePhotoView.f32871i, new View.OnClickListener() { // from class: l.j100
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f117911a.m133263u(view);
                        }
                    });
                    return messageMomentExpandItemLivePhotoView;
                }
            }
            if (media instanceof Picture) {
                final MessageMomentExpandItemPictureView messageMomentExpandItemPictureView = !this.f107395f.isEmpty() ? (MessageMomentExpandItemPictureView) this.f107395f.pop() : (MessageMomentExpandItemPictureView) h100.this.getAct().inflater().inflate(qec0.f157032g2, viewGroup, false);
                viewGroup.addView(messageMomentExpandItemPictureView);
                bnl0.m105509E0(messageMomentExpandItemPictureView, new View.OnClickListener() { // from class: l.k100
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123438a.m133264v(messageMomentExpandItemPictureView, view);
                    }
                });
                messageMomentExpandItemPictureView.m50615z((Picture) media);
                return messageMomentExpandItemPictureView;
            }
            if (!(media instanceof Video)) {
                return Integer.valueOf(i);
            }
            MessageMomentExpandItemPlayView messageMomentExpandItemPlayView = (MessageMomentExpandItemPlayView) h100.this.getAct().inflater().inflate(qec0.f157039h2, viewGroup, false);
            int iM105592y1 = bnl0.m105592y0();
            int i4 = qa00.f156321h;
            int i5 = (iM105592y1 - i4) - i4;
            viewGroup.addView(messageMomentExpandItemPlayView);
            h100.this.f107377p = messageMomentExpandItemPlayView;
            messageMomentExpandItemPlayView.m50638e0((Video) media);
            messageMomentExpandItemPlayView.m50640h0(i5, i5);
            return messageMomentExpandItemPlayView;
        }

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ void m133262t(View view) {
            if (h100.this.f107364c.getCurrentItem() > 0) {
                VPager vPager = h100.this.f107364c;
                vPager.m4178T(vPager.getCurrentItem() - 1, false);
            }
        }

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ void m133263u(View view) {
            if (h100.this.f107364c.getCurrentItem() < getCount() - 1) {
                VPager vPager = h100.this.f107364c;
                vPager.m4178T(vPager.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ void m133264v(MessageMomentExpandItemPictureView messageMomentExpandItemPictureView, View view) {
            int iM50614q = messageMomentExpandItemPictureView.m50614q();
            if (iM50614q == -1 && h100.this.f107364c.getCurrentItem() > 0) {
                VPager vPager = h100.this.f107364c;
                vPager.m4178T(vPager.getCurrentItem() - 1, false);
            } else {
                if (iM50614q != 1 || h100.this.f107364c.getCurrentItem() >= getCount() - 1) {
                    return;
                }
                VPager vPager2 = h100.this.f107364c;
                vPager2.m4178T(vPager2.getCurrentItem() + 1, false);
            }
        }

        /* JADX INFO: renamed from: w */
        public final Video m133265w(Picture picture) {
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
        public void m133266x(List<Media> list) {
            this.f107394e = list;
            notifyDataSetChanged();
        }
    }

    public h100(MessagesAct messagesAct) {
        this.f107387z = new GestureDetector(this.f107374m, new C17369d());
        this.f107374m = messagesAct;
    }

    /* JADX INFO: renamed from: J */
    private boolean m133207J() {
        if (NullChecker.m82486a(this.f107377p)) {
            return this.f107377p.m50634V();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I = m133239I();
        if (NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I)) {
            return messageMomentExpandItemLivePhotoViewM133239I.m50605S();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m133208L(View view) {
        m133236F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public void m133211b0() {
        if (NullChecker.m82486a(this.f107377p) && ConnectivityReceiver.m82472l()) {
            this.f107377p.m50637b0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I = m133239I();
        if (ConnectivityReceiver.m82472l() && NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I)) {
            messageMomentExpandItemLivePhotoViewM133239I.m50609X();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m133212c(CoreMomentInfo coreMomentInfo, boolean z, Throwable th) {
        CoreModule.m30932N().mo61529d(th);
        CoreModule.m30932N().mo61518Yc(coreMomentInfo, "p_moment_view", false, CoreModule.m30933P().m143412i().mo180573z3(th), z);
    }

    /* JADX INFO: renamed from: c0 */
    private void m133213c0(final String str, final String str2) {
        final CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61581us(str, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(str, CoreMomentInfo.JSON_ADAPTER);
            psd0.m173633z(this.f107384w);
            this.f107384w = CoreModule.m30932N().momentRefresh(str2, str, CoreMomentInfo.JSON_ADAPTER).filter(new qcj() { // from class: l.c100
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((CoreMomentInfo) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.d100
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84631a.m133245Q((CoreMomentInfo) obj);
                }
            }, new y20() { // from class: l.e100
                @Override // p153l.y20
                public final void call(Object obj) {
                    h100.m133222n((Throwable) obj);
                }
            }));
        }
        if (NullChecker.m82486a(coreMomentInfo)) {
            this.f107368g.setImageResource(coreMomentInfo.haveLiked ? ibc0.f113755B3 : ibc0.f113782E3);
        } else {
            this.f107368g.setImageResource(ibc0.f113782E3);
        }
        if (NullChecker.m82486a(this.f107368g.getParent()) && ((View) this.f107368g.getParent()).getTouchDelegate() == null) {
            this.f107368g.post(new Runnable() { // from class: l.f100
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96754a.m133246R();
                }
            });
        }
        bnl0.m105509E0(this.f107368g, new View.OnClickListener() { // from class: l.g100
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101704a.m133244P(coreMomentInfo, str, str2, view);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m133222n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m133225r() {
        ViewGroup.LayoutParams layoutParams = this.f107363b.getLayoutParams();
        int iM105592y0 = bnl0.m105592y0();
        int i = qa00.f156316c;
        layoutParams.height = (iM105592y0 - i) - i;
        this.f107363b.setLayoutParams(layoutParams);
        this.f107364c.setOutlineProvider(new C17366a());
        this.f107364c.setClipToOutline(true);
        uqb0.f180374G.m127115L0(this.f107367f, "res://" + this.f107374m.getPackageName() + "/" + ibc0.f113773D3);
        bnl0.m105524M(this.f107362a, false);
        this.f107364c.m4187d(this);
        bnl0.m105509E0(this.f107373l, new View.OnClickListener() { // from class: l.y000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196936a.m133208L(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public View m133233B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l100.m152416b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public MessagesAct getAct() {
        return this.f107374m;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f107374m;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(s000 s000Var) {
        this.f107375n = s000Var;
    }

    /* JADX INFO: renamed from: F */
    public void m133236F() {
        this.f107382u = null;
        psd0.m173633z(this.f107384w);
        psd0.m173633z(this.f107379r);
        psd0.m173633z(this.f107380s);
        psd0.m173633z(this.f107381t);
        if (NullChecker.m82486a(this.f107377p)) {
            this.f107377p.m50639g0();
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I = m133239I();
        if (NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I)) {
            messageMomentExpandItemLivePhotoViewM133239I.m50611a0();
        }
        if (bnl0.m105529O0(this.f107362a)) {
            this.f107362a.post(new Runnable() { // from class: l.t000
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171439a.m133240K();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m133237G() {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f107383v.ownerId);
        this.f107375n.m143372e0().mo50158l().m110968d7(this.f107383v);
        this.f107375n.m143372e0().mo50138B0().m143374g0().m113994X1(userM116503Pa == null ? "" : userM116503Pa.name, this.f107383v);
        m133236F();
    }

    /* JADX INFO: renamed from: H */
    public final void m133238H() {
        if (NullChecker.m82486a(this.f107377p)) {
            this.f107377p.m50636a0();
            return;
        }
        MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I = m133239I();
        if (NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I)) {
            messageMomentExpandItemLivePhotoViewM133239I.m50608W();
        }
    }

    /* JADX INFO: renamed from: I */
    public final MessageMomentExpandItemLivePhotoView m133239I() {
        if (NullChecker.m82486a(this.f107378q) && this.f107378q.containsKey(Integer.valueOf(this.f107386y))) {
            return this.f107378q.get(Integer.valueOf(this.f107386y));
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m133240K() {
        VLinear vLinear = this.f107362a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear, "translationY", 0.0f, -vLinear.getHeight());
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.addListener(new C17368c());
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m133241M(Integer num) {
        if (xzm0.m213760p().m213773q() || !bnl0.m105529O0(this.f107362a)) {
            return;
        }
        m133236F();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m133242N(NetworkInfo networkInfo) {
        if (!ConnectivityReceiver.m82472l()) {
            m133238H();
        } else {
            if (m133207J()) {
                return;
            }
            m133211b0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m133243O(String str, String str2, C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m133213c0(str, str2);
        } else if (c4470c == C4470c.f16268j) {
            m133238H();
        } else if (c4470c == C4470c.f16269k) {
            m133236F();
        }
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m133244P(final CoreMomentInfo coreMomentInfo, final String str, final String str2, View view) {
        if (coreMomentInfo == null) {
            r1j0.m179420g("该动态因为隐私设置，已不可见");
        } else {
            final boolean z = coreMomentInfo.haveLiked;
            getAct().duringCreated(CoreModule.m30932N().mo61473Kn(coreMomentInfo.owner, coreMomentInfo.f56856id, !coreMomentInfo.haveLiked, OMSDialogPositon.p_chat_view)).subscribe(psd0.m173597H(new y20() { // from class: l.w000
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f186526a.m133247S(coreMomentInfo, z, str, str2, (uxj0) obj);
                }
            }, new y20() { // from class: l.x000
                @Override // p153l.y20
                public final void call(Object obj) {
                    h100.m133212c(coreMomentInfo, z, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m133245Q(CoreMomentInfo coreMomentInfo) {
        this.f107368g.setImageResource(coreMomentInfo.haveLiked ? ibc0.f113755B3 : ibc0.f113782E3);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m133246R() {
        Rect rect = new Rect();
        this.f107368g.getHitRect(rect);
        int i = rect.top;
        int i2 = qa00.f156325l;
        rect.top = i - i2;
        rect.bottom += i2;
        rect.left -= i2;
        rect.right += i2;
        ((View) this.f107368g.getParent()).setTouchDelegate(new TouchDelegate(rect, this.f107368g));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m133247S(CoreMomentInfo coreMomentInfo, boolean z, String str, String str2, uxj0 uxj0Var) {
        boolean z2 = coreMomentInfo.haveLiked;
        coreMomentInfo.haveLiked = !z2;
        this.f107368g.setImageResource(!z2 ? ibc0.f113755B3 : ibc0.f113782E3);
        if (coreMomentInfo.haveLiked) {
            j000.m142892k(this.f107374m, coreMomentInfo);
        }
        CoreModule.m30932N().mo61518Yc(coreMomentInfo, "p_moment_view", false, 201, z);
        if (NullChecker.m82486a(this.f107382u)) {
            this.f107382u.m49707D(str, str2);
        }
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m133248T(View view) {
        i4g0.m138520r("e_moment_reply", "p_moment_view");
        m133237G();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m133249U(User user, String str) {
        VLinear vLinear = this.f107362a;
        vLinear.setTranslationY(-vLinear.getHeight());
        this.f107362a.setVisibility(0);
        VLinear vLinear2 = this.f107362a;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(vLinear2, "translationY", -vLinear2.getHeight(), 0.0f);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(0.8f));
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setStartDelay(500L);
        objectAnimatorOfFloat.addListener(new C17367b(user, str));
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: V */
    public final void m133250V() {
        this.f107381t = this.f107374m.duringCreated(xzm0.m213760p().m213766i()).subscribe(psd0.m173596G(new y20() { // from class: l.u000
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176840a.m133241M((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W */
    public final void m133251W() {
        this.f107380s = this.f107374m.duringCreated(ConnectivityReceiver.m82473m()).subscribe(psd0.m173596G(new y20() { // from class: l.v000
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181831a.m133242N((NetworkInfo) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final void m133252X(final String str, final String str2) {
        MessagesAct messagesAct = this.f107374m;
        this.f107379r = messagesAct.duringCreated(messagesAct.lifecycle()).subscribe(psd0.m173596G(new y20() { // from class: l.b100
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74311a.m133243O(str, str2, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m133253Y(MotionEvent motionEvent) {
        if (bnl0.m105529O0(this.f107362a)) {
            this.f107387z.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m133254Z() {
        l4g0 l4g0Var = this.f107385x;
        if (l4g0Var == null) {
            return;
        }
        w1e.m204401e(l4g0Var);
        this.f107385x = null;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m133255a0(String str) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_moment_view", h100.class.getName());
        this.f107385x = l4g0VarM204399c;
        l4g0VarM204399c.m152781p(pf60.m172085a("moment_id", str));
        w1e.m204402f(this.f107385x);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m133256d0(MessageMomentGuide messageMomentGuide) {
        CoreMomentInfo coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61581us(messageMomentGuide.f21188id, CoreMomentInfo.JSON_ADAPTER);
        if (coreMomentInfo == null) {
            coreMomentInfo = (CoreMomentInfo) CoreModule.m30932N().mo61479Mh(messageMomentGuide.f21188id, CoreMomentInfo.JSON_ADAPTER);
        }
        if (coreMomentInfo == null) {
            return;
        }
        if (messageMomentGuide.type != 1 || jyb.m147479J(coreMomentInfo.media)) {
            if (messageMomentGuide.type != 2 || jyb.m147479J(coreMomentInfo.media)) {
                return;
            }
            bnl0.m105524M(this.f107365d, false);
            C17370e c17370e = new C17370e();
            this.f107376o = c17370e;
            this.f107364c.setAdapter(c17370e);
            this.f107376o.m133266x(coreMomentInfo.media);
            return;
        }
        int size = coreMomentInfo.media.size();
        NewPictureContainerIndicator newPictureContainerIndicator = this.f107365d;
        if (size > 1) {
            bnl0.m105524M(newPictureContainerIndicator, true);
            this.f107365d.setIndicatorCount(coreMomentInfo.media.size());
        } else {
            bnl0.m105524M(newPictureContainerIndicator, false);
        }
        C17370e c17370e2 = new C17370e();
        this.f107376o = c17370e2;
        this.f107364c.setAdapter(c17370e2);
        this.f107376o.m133266x(coreMomentInfo.media);
    }

    /* JADX INFO: renamed from: e0 */
    public void m133257e0(MessageMomentGuide messageMomentGuide, ItemMomentGuidePhaseTwo itemMomentGuidePhaseTwo) {
        this.f107382u = itemMomentGuidePhaseTwo;
        this.f107383v = messageMomentGuide;
        final String str = messageMomentGuide.f21188id;
        String str2 = messageMomentGuide.ownerId;
        final User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str2);
        this.f107371j.setText((userM116503Pa == null || userM116503Pa.isFemale()) ? "她的动态" : "他的动态");
        boolean zIsEmpty = TextUtils.isEmpty(messageMomentGuide.desc);
        VText vText = this.f107372k;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f107372k.setText(messageMomentGuide.desc);
        }
        m133256d0(messageMomentGuide);
        m133252X(messageMomentGuide.f21188id, str2);
        bnl0.m105509E0(this.f107369h, new View.OnClickListener() { // from class: l.z000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202273a.m133248T(view);
            }
        });
        if (bnl0.m105529O0(this.f107362a)) {
            return;
        }
        this.f107362a.setVisibility(4);
        this.f107362a.post(new Runnable() { // from class: l.a100
            @Override // java.lang.Runnable
            public final void run() {
                this.f67772a.m133249U(userM116503Pa, str);
            }
        });
    }

    /* JADX INFO: renamed from: f0 */
    public void m133258f0(Act act, View view, User user) {
        if (!cl80.m110426e().m110433k() && CoreModule.f18264c.f20381e0.f89366y2.get().longValue() <= 0) {
            String strConcat = ((user == null || user.isFemale()) ? "她" : "他").concat("的动态不错，友好二连拉近距离～");
            C4496a c4496a = new C4496a(act);
            c4496a.m21846B(qa00.m175859d(2.0f)).m21848D(strConcat).m21854J(13.0f).m21869k(Color.parseColor("#fe7e1d")).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21881x(-qa00.m175859d(4.0f)).m21880w(qa00.m175859d(10.0f)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21863e(true).m21874q(C4496a.f16402Q);
            C4499d.m21895l().m21908u(c4496a, view, f107361A);
            CoreModule.f18264c.f20381e0.f89366y2.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM133233B = m133233B(layoutInflater, viewGroup);
        m133225r();
        return viewM133233B;
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        if (this.f107386y != i) {
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I = m133239I();
            if (NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I)) {
                messageMomentExpandItemLivePhotoViewM133239I.m50611a0();
            }
            this.f107386y = i;
            MessageMomentExpandItemLivePhotoView messageMomentExpandItemLivePhotoViewM133239I2 = m133239I();
            if (NullChecker.m82486a(messageMomentExpandItemLivePhotoViewM133239I2)) {
                messageMomentExpandItemLivePhotoViewM133239I2.m50609X();
            }
        }
        this.f107365d.m37958b(i);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.h100$b */
    public class C17367b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f107389a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f107390b;

        public C17367b(User user, String str) {
            this.f107389a = user;
            this.f107390b = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h100.this.m133211b0();
            h100 h100Var = h100.this;
            h100Var.m133258f0(h100Var.f107374m, h100.this.f107368g, this.f107389a);
            h100.this.m133255a0(this.f107390b);
            h100.this.m133251W();
            h100.this.m133250V();
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

    /* JADX INFO: renamed from: l.h100$c */
    public class C17368c implements Animator.AnimatorListener {
        public C17368c() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            bnl0.m105524M(h100.this.f107362a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bnl0.m105524M(h100.this.f107362a, false);
            h100.this.m133254Z();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }
}
