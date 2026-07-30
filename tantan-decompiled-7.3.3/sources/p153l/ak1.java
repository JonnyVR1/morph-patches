package p153l;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioTrack;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b'\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)R\"\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\"\u001a\u0004\b*\u0010$\"\u0004\b+\u0010&R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010:\u001a\u00020\u00108\u0006X\u0086D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010C\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bA\u0010=\u001a\u0004\bB\u0010?R\u0017\u0010F\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bD\u0010=\u001a\u0004\bE\u0010?R\u0017\u0010I\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?R\u0017\u0010L\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bJ\u0010=\u001a\u0004\bK\u0010?R\u0017\u0010O\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bM\u0010=\u001a\u0004\bN\u0010?R\u0017\u0010R\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010?R\u0017\u0010U\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bS\u0010=\u001a\u0004\bT\u0010?R\u0017\u0010X\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bV\u0010=\u001a\u0004\bW\u0010?R\u0017\u0010[\u001a\u00020;8\u0006¢\u0006\f\n\u0004\bY\u0010=\u001a\u0004\bZ\u0010?R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001c\u0010d\u001a\n a*\u0004\u0018\u00010`0`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010f\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u00107¨\u0006g"}, m88121d2 = {"Ll/ak1;", "", "Landroid/view/View;", "root", "_follow", "Lv/VText;", "_follow_follow_text", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "_svga", "_join_fans", "Landroid/widget/FrameLayout;", "_img_fan_club", "Lv/VImage;", "_pic_fan_club", "<init>", "(Landroid/view/View;Landroid/view/View;Lv/VText;Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;Lv/VText;Landroid/widget/FrameLayout;Lv/VImage;)V", "", "minWidth", "diff", "", "g", "(II)V", Constants.INAPP_DATA_TAG, "()V", "e", "a", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "b", "get_follow", "set_follow", "(Landroid/view/View;)V", "c", "Lv/VText;", "get_follow_follow_text", "()Lv/VText;", "set_follow_follow_text", "(Lv/VText;)V", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "f", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_join_fans", "set_join_fans", "Landroid/widget/FrameLayout;", "get_img_fan_club", "()Landroid/widget/FrameLayout;", "set_img_fan_club", "(Landroid/widget/FrameLayout;)V", "Lv/VImage;", "get_pic_fan_club", "()Lv/VImage;", "set_pic_fan_club", "(Lv/VImage;)V", "h", "I", "getTestSlowScare", "()I", "testSlowScare", "", RXScreenCaptureService.KEY_INDEX, "F", "getT120", "()F", "t120", "j", "getT180", "t180", "k", "getT240", "t240", BLiveStormDanmakuGiftResourceType.f45292l, "getT600", "t600", "m", "getT1500", "t1500", "n", "getT2500", "t2500", "o", "getT3500", "t3500", "p", "getT4000", "t4000", "q", "getT4180", "t4180", "r", "getT4360", "t4360", "Landroid/animation/ArgbEvaluator;", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/animation/ArgbEvaluator;", "evaluator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", Constants.KEY_T, "Landroid/animation/ValueAnimator;", "valueAnimator", "u", "svgaMaxWidth", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ak1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final View root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public View _follow;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public VText _follow_follow_text;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AnimEffectPlayer _svga;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public VText _join_fans;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public FrameLayout _img_fan_club;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public VImage _pic_fan_club;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int testSlowScare;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float t120;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final float t180;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float t240;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final float t600;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final float t1500;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public final float t2500;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final float t3500;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final float t4000;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final float t4180;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final float t4360;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final ArgbEvaluator evaluator;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final ValueAnimator valueAnimator;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int svgaMaxWidth;

    /* JADX INFO: renamed from: l.ak1$a */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/ak1$a", "Ll/wo0;", "", Frame.TYPE, "", "percentage", "", "h", "(ID)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C15732a extends wo0 {
        public C15732a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: h */
        public void mo77318h(int frame, double percentage) {
            if (frame == 1) {
                ak1.this.get_svga().pauseAnimation();
            }
        }
    }

    public ak1(@NotNull View view, @NotNull View view2, @NotNull VText vText, @NotNull AnimEffectPlayer animEffectPlayer, @NotNull VText vText2, @NotNull FrameLayout frameLayout, @NotNull VImage vImage) {
        view.getClass();
        view2.getClass();
        vText.getClass();
        animEffectPlayer.getClass();
        vText2.getClass();
        frameLayout.getClass();
        vImage.getClass();
        this.root = view;
        this._follow = view2;
        this._follow_follow_text = vText;
        this._svga = animEffectPlayer;
        this._join_fans = vText2;
        this._img_fan_club = frameLayout;
        this._pic_fan_club = vImage;
        this.testSlowScare = 1;
        this.t120 = 1 * 120.0f;
        this.t180 = 1 * 180.0f;
        this.t240 = 1 * 240.0f;
        this.t600 = 1 * 600.0f;
        this.t1500 = 1 * 1500.0f;
        this.t2500 = 1 * 2500.0f;
        this.t3500 = 1 * 3500.0f;
        this.t4000 = 1 * 4000.0f;
        this.t4180 = 1 * 4180.0f;
        float f = 1 * 4360.0f;
        this.t4360 = f;
        this.evaluator = new ArgbEvaluator();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) f);
        valueAnimatorOfInt.setDuration((long) f);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        this.valueAnimator = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: a */
    public static void m98534a(ak1 ak1Var, Ref.BooleanRef booleanRef, int i, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        try {
            Object animatedValue = valueAnimator.getAnimatedValue();
            animatedValue.getClass();
            float fIntValue = ((Integer) animatedValue).intValue();
            if (fIntValue < ak1Var.t240) {
                float f = ak1Var.t120;
                if (fIntValue < f) {
                    ak1Var._follow_follow_text.setAlpha(1.0f - (fIntValue / f));
                }
                float f2 = ak1Var.t180;
                if (fIntValue < f2) {
                    bnl0.m105507D0((int) (((double) (fIntValue / f2)) * 1.1d * ((double) ak1Var.svgaMaxWidth)), ak1Var._svga);
                    return;
                } else {
                    bnl0.m105507D0((int) ((1.0d + (((double) (1.0f - ((fIntValue - f2) / (ak1Var.t240 - f2)))) * 0.1d)) * ((double) ak1Var.svgaMaxWidth)), ak1Var._svga);
                    return;
                }
            }
            float f3 = ak1Var.t600;
            if (fIntValue < f3) {
                if (!booleanRef.element) {
                    if (ak1Var._svga.isPaused()) {
                        ak1Var._svga.resumeAnimation();
                    }
                    booleanRef.element = true;
                }
                if (bnl0.m105529O0(ak1Var._follow_follow_text)) {
                    bnl0.m105524M(ak1Var._follow, false);
                    ak1Var._follow_follow_text.setAlpha(1.0f);
                    if (!wft.m206159b(2)) {
                        bnl0.m105524M(ak1Var._follow_follow_text, false);
                    }
                }
                ak1Var.m98537d();
                int width = ak1Var._svga.getWidth();
                int i2 = ak1Var.svgaMaxWidth;
                if (width != i2) {
                    bnl0.m105507D0(i2, ak1Var._svga);
                }
                float f4 = ak1Var.t240;
                float f5 = (fIntValue - f4) / (ak1Var.t600 - f4);
                if (!bnl0.m105529O0(ak1Var._join_fans)) {
                    bnl0.m105507D0(ak1Var.svgaMaxWidth - i, ak1Var._join_fans);
                    ak1Var._join_fans.setGravity(17);
                    ak1Var._join_fans.setVisibility(0);
                }
                ak1Var._join_fans.setAlpha(f5);
                return;
            }
            float f6 = ak1Var.t1500;
            if (fIntValue < f6) {
                Object objEvaluate = ak1Var.evaluator.evaluate((fIntValue - f3) / (f6 - f3), Integer.valueOf(WebRtcAudioTrack.AudioTrackErrorCode.AUDIO_TRACK_INIT_CREATE_INVALID_STATE), -1);
                objEvaluate.getClass();
                ak1Var._join_fans.setTextColor(((Integer) objEvaluate).intValue());
                return;
            }
            float f7 = ak1Var.t2500;
            if (fIntValue < f7) {
                Object objEvaluate2 = ak1Var.evaluator.evaluate((fIntValue - f6) / (f7 - f6), -1, -12323);
                objEvaluate2.getClass();
                ak1Var._join_fans.setTextColor(((Integer) objEvaluate2).intValue());
                return;
            }
            float f8 = ak1Var.t3500;
            if (fIntValue < f8) {
                Object objEvaluate3 = ak1Var.evaluator.evaluate((fIntValue - f7) / (f8 - f7), -12323, -1);
                objEvaluate3.getClass();
                ak1Var._join_fans.setTextColor(((Integer) objEvaluate3).intValue());
                return;
            }
            float f9 = ak1Var.t4000;
            if (fIntValue < f9 || fIntValue >= ak1Var.t4360) {
                return;
            }
            float f10 = ak1Var.t4180;
            if (fIntValue < f10) {
                bnl0.m105507D0((int) ((1.0f - ((fIntValue - f9) / (f10 - f9))) * ak1Var.svgaMaxWidth), ak1Var._svga);
            }
            float f11 = ak1Var.t4000;
            ak1Var._join_fans.setAlpha(1.0f - ((fIntValue - f11) / (ak1Var.t4360 - f11)));
        } catch (Exception e) {
            e.toString();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m98535b(ak1 ak1Var) {
        ak1Var.m98537d();
        ak1Var._svga.m69688o();
        bnl0.m105524M(ak1Var._svga, false);
        bnl0.m105524M(ak1Var._join_fans, false);
        bnl0.m105524M(ak1Var._follow, false);
    }

    /* JADX INFO: renamed from: c */
    public static void m98536c(ak1 ak1Var) {
        bnl0.m105524M(ak1Var._follow, true);
        bnl0.m105524M(ak1Var._follow_follow_text, true);
        bnl0.m105524M(ak1Var._img_fan_club, false);
        bnl0.m105524M(ak1Var._pic_fan_club, false);
        ak1Var._follow_follow_text.setAlpha(1.0f);
        bnl0.m105524M(ak1Var._svga, true);
        bnl0.m105507D0(1, ak1Var._svga);
        ak1Var._svga.mo69685l("https://auto.tancdn.com/v1/raw/20e93f36-6e7c-4c99-98c0-3eed786d574f06.pdf", -1, ak1Var.new C15732a());
    }

    /* JADX INFO: renamed from: d */
    public final void m98537d() {
        if (!bnl0.m105529O0(this._img_fan_club)) {
            bnl0.m105524M(this._img_fan_club, true);
        }
        if (bnl0.m105529O0(this._pic_fan_club)) {
            return;
        }
        bnl0.m105524M(this._pic_fan_club, true);
    }

    /* JADX INFO: renamed from: e */
    public final void m98538e() {
        this._svga.m69687n();
        this.valueAnimator.cancel();
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final AnimEffectPlayer get_svga() {
        return this._svga;
    }

    /* JADX INFO: renamed from: g */
    public final void m98540g(int minWidth, final int diff) {
        this.valueAnimator.cancel();
        ViewGroup.LayoutParams layoutParams = this._svga.getLayoutParams();
        layoutParams.getClass();
        int width = this.root.getWidth() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        this.svgaMaxWidth = width;
        this.svgaMaxWidth = Math.max(minWidth, width);
        if (this.root.getWidth() <= 0) {
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        gt0.m132176v(this.valueAnimator, new Runnable() { // from class: l.xj1
            @Override // java.lang.Runnable
            public final void run() {
                ak1.m98536c(this.f194531a);
            }
        });
        gt0.m132160f(this.valueAnimator, new Runnable() { // from class: l.yj1
            @Override // java.lang.Runnable
            public final void run() {
                ak1.m98535b(this.f200262a);
            }
        });
        this.valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zj1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ak1.m98534a(this.f204636a, booleanRef, diff, valueAnimator);
            }
        });
        this.valueAnimator.start();
    }
}
