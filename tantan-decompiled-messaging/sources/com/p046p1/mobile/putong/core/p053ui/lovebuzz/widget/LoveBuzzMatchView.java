package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p046p1.mobile.putong.data.User;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VText;
import p149l.e30;
import p149l.hmb;
import p149l.hvc0;
import p149l.j8w;
import p149l.kp3;
import p149l.m6w;
import p149l.m8w;
import p149l.mkd0;
import p149l.o7r;
import p149l.qa2;
import p149l.qib0;
import p149l.u9w;
import p149l.x0c0;
import p149l.y2c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", RXScreenCaptureService.KEY_INDEX, "()V", "h", "g", "e", "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", "url", Constants.KEY_KEY, "f", "(Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/tantan/library/svga/SVGAnimationView;", "a", "Lcom/tantan/library/svga/SVGAnimationView;", "get_match_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_match_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_match_anim", "Lv/VText;", "b", "Lv/VText;", "get_match_title", "()Lv/VText;", "set_match_title", "(Lv/VText;)V", "_match_title", "get_match_sub_title", "set_match_sub_title", "_match_sub_title", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class LoveBuzzMatchView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public SVGAnimationView _match_anim;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _match_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _match_sub_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$a", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8432a extends AnimListener {
        public C8432a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            qa2.INSTANCE.m173681a(LoveBuzzMatchView.this.TAG, "startBonusAnim onFinished");
            LoveBuzzMatchView.this.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8433b extends AnimListener {
        public C8433b() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            qa2.INSTANCE.m173681a(LoveBuzzMatchView.this.TAG, "startLikePeerAnim onFinished");
            LoveBuzzMatchView.this.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView$c */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$c", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8434c extends AnimListener {
        public C8434c() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            qa2.INSTANCE.m173681a(LoveBuzzMatchView.this.TAG, "startMatchAnim finish");
            LoveBuzzMatchView.this.animate().alpha(0.0f).setDuration(400L).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMatchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47195c(layoutInflaterM163037a, this);
        this.TAG = "LoveBuzzMatchView";
        m47196e();
    }

    /* JADX INFO: renamed from: a */
    public static void m47192a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m47193b(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m47195c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM153514b = m8w.m153514b(this, inflater, parent);
        viewM153514b.getClass();
        return viewM153514b;
    }

    /* JADX INFO: renamed from: e */
    public final void m47196e() {
        setOrientation(1);
    }

    /* JADX INFO: renamed from: f */
    public final void m47197f(final SVGADynamicEntity entity, String url, final String key) {
        qib0.f154691G.m102316E(url).subscribe(mkd0.m154956H(new e30() { // from class: l.k8w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoveBuzzMatchView.m47193b(entity, key, (Bitmap) obj);
            }
        }, new e30() { // from class: l.l8w
            @Override // p149l.e30
            public final void call(Object obj) {
                LoveBuzzMatchView.m47192a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final void m47198g() {
        qa2.INSTANCE.m173681a(this.TAG, "startBonusAnim start");
        setAlpha(1.0f);
        m6w.INSTANCE.m153305j(get_match_title(), get_match_sub_title());
        setBackgroundResource(x0c0.f188960n);
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.m146817g()).repeatCount(1).autoPlay(true).animListener(new C8432a()).into(get_match_anim());
    }

    @NotNull
    public final SVGAnimationView get_match_anim() {
        SVGAnimationView sVGAnimationView = this._match_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m87502r("_match_anim");
        return null;
    }

    @NotNull
    public final VText get_match_sub_title() {
        VText vText = this._match_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_match_sub_title");
        return null;
    }

    @NotNull
    public final VText get_match_title() {
        VText vText = this._match_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_match_title");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m47199h() {
        qa2.INSTANCE.m173681a(this.TAG, "startLikePeerAnim start");
        setAlpha(1.0f);
        m6w.INSTANCE.m153305j(get_match_title(), get_match_sub_title());
        setBackgroundResource(x0c0.f188960n);
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.m146818h()).repeatCount(1).autoPlay(true).animListener(new C8433b()).into(get_match_anim());
    }

    /* JADX INFO: renamed from: i */
    public final void m47200i() {
        setAlpha(0.0f);
        m6w.INSTANCE.m153307l(get_match_title(), get_match_sub_title());
        qa2.INSTANCE.m173681a(this.TAG, "startMatchAnim start");
        setBackgroundResource(y2c0.f195565j0);
        animate().alpha(1.0f).setDuration(600L).start();
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(j8w.INSTANCE.m140473a().m140417B0().getUserId());
        if (NullChecker.m81303a(userM169430Pa)) {
            String strM133156c = hvc0.m133156c(R$string.f20215d1);
            VText vText = get_match_sub_title();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strM133156c.getClass();
            vText.setText(String.format(strM133156c, Arrays.copyOf(new Object[]{userM169430Pa.name}, 1)));
            hmb.m131707l1(get_match_sub_title(), strM133156c, 1);
        }
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        u9w u9wVar = u9w.INSTANCE;
        userM169430Pa.getClass();
        String str = u9wVar.m192677j(userM169430Pa).profileSmall().formatted();
        str.getClass();
        m47197f(sVGADynamicEntity, str, "user_avatar1");
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        userM169527p9.getClass();
        String str2 = u9wVar.m192677j(userM169527p9).profileSmall().formatted();
        str2.getClass();
        m47197f(sVGADynamicEntity, str2, "user_avatar2");
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.m146814d()).repeatCount(1).dynamic(sVGADynamicEntity).autoPlay(true).animListener(new C8434c()).into(get_match_anim());
    }

    public final void set_match_anim(@NotNull SVGAnimationView sVGAnimationView) {
        sVGAnimationView.getClass();
        this._match_anim = sVGAnimationView;
    }

    public final void set_match_sub_title(@NotNull VText vText) {
        vText.getClass();
        this._match_sub_title = vText;
    }

    public final void set_match_title(@NotNull VText vText) {
        vText.getClass();
        this._match_title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMatchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
