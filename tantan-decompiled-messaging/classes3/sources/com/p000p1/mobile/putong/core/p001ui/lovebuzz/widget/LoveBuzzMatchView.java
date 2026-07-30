package com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.lovebuzz.widget.LoveBuzzMatchView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.buzz.R;
import com.p1.mobile.putong.data.User;
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
import l.hmb;
import l.hvc0;
import l.j8w;
import l.kp3;
import l.m6w;
import l.m8w;
import l.mkd0;
import l.o7r;
import l.qa2;
import l.qib0;
import l.u9w;
import l.x0c0;
import l.y2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.seamless.xhtml.XHTMLElement;
import p003l.e30;
import p003l.m250;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0014J'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00101\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u0014\u00104\u001a\u00020\u001a8\u0002X\u0082D¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "c", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "i", "()V", XHTMLElement.XPATH_PREFIX, "g", "e", "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", "url", "key", "f", "(Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/tantan/library/svga/SVGAnimationView;", "a", "Lcom/tantan/library/svga/SVGAnimationView;", "get_match_anim", "()Lcom/tantan/library/svga/SVGAnimationView;", "set_match_anim", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_match_anim", "Lv/VText;", "b", "Lv/VText;", "get_match_title", "()Lv/VText;", "set_match_title", "(Lv/VText;)V", "_match_title", "get_match_sub_title", "set_match_sub_title", "_match_sub_title", "d", "Ljava/lang/String;", "TAG", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$a", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0015a extends AnimListener {
        public C0015a() {
        }

        public void onFinished() {
            qa2.INSTANCE.a(LoveBuzzMatchView.this.TAG, "startBonusAnim onFinished");
            LoveBuzzMatchView.this.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$b", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0016b extends AnimListener {
        public C0016b() {
        }

        public void onFinished() {
            qa2.INSTANCE.a(LoveBuzzMatchView.this.TAG, "startLikePeerAnim onFinished");
            LoveBuzzMatchView.this.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.LoveBuzzMatchView$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/LoveBuzzMatchView$c", "Lcom/tantan/library/svga/AnimListener;", "", "onFinished", "()V", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0017c extends AnimListener {
        public C0017c() {
        }

        public void onFinished() {
            qa2.INSTANCE.a(LoveBuzzMatchView.this.TAG, "startMatchAnim finish");
            LoveBuzzMatchView.this.animate().alpha(0.0f).setDuration(400L).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoveBuzzMatchView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterA = o7r.a(getContext());
        layoutInflaterA.getClass();
        m224c(layoutInflaterA, this);
        this.TAG = "LoveBuzzMatchView";
        m225e();
    }

    /* JADX INFO: renamed from: a */
    public static void m221a(Throwable th) {
    }

    /* JADX INFO: renamed from: b */
    public static void m222b(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final View m224c(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = m8w.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    /* JADX INFO: renamed from: e */
    public final void m225e() {
        setOrientation(1);
    }

    /* JADX INFO: renamed from: f */
    public final void m226f(final SVGADynamicEntity entity, String url, final String key) {
        qib0.G.E(url).subscribe((m250) mkd0.H(new e30() { // from class: l.k8w
            @Override // p003l.e30
            public final void call(Object obj) {
                LoveBuzzMatchView.m222b(entity, key, (Bitmap) obj);
            }
        }, new e30() { // from class: l.l8w
            @Override // p003l.e30
            public final void call(Object obj) {
                LoveBuzzMatchView.m221a((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final void m227g() {
        qa2.INSTANCE.a(this.TAG, "startBonusAnim start");
        setAlpha(1.0f);
        m6w.INSTANCE.j(new View[]{get_match_title(), get_match_sub_title()});
        setBackgroundResource(x0c0.n);
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.g()).repeatCount(1).autoPlay(true).animListener(new C0015a()).into(get_match_anim());
    }

    @NotNull
    public final SVGAnimationView get_match_anim() {
        SVGAnimationView sVGAnimationView = this._match_anim;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.r("_match_anim");
        return null;
    }

    @NotNull
    public final VText get_match_sub_title() {
        VText vText = this._match_sub_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_match_sub_title");
        return null;
    }

    @NotNull
    public final VText get_match_title() {
        VText vText = this._match_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_match_title");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final void m228h() {
        qa2.INSTANCE.a(this.TAG, "startLikePeerAnim start");
        setAlpha(1.0f);
        m6w.INSTANCE.j(new View[]{get_match_title(), get_match_sub_title()});
        setBackgroundResource(x0c0.n);
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.h()).repeatCount(1).autoPlay(true).animListener(new C0016b()).into(get_match_anim());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m229i() {
        setAlpha(0.0f);
        m6w.INSTANCE.l(new View[]{get_match_title(), get_match_sub_title()});
        qa2.INSTANCE.a(this.TAG, "startMatchAnim start");
        setBackgroundResource(y2c0.j0);
        animate().alpha(1.0f).setDuration(600L).start();
        User userPa = CoreModule.c.e0.Pa(j8w.Companion.a().B0().l());
        if (NullChecker.a(userPa)) {
            String strC = hvc0.c(R.string.d1);
            AppCompatTextView appCompatTextView = get_match_sub_title();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            strC.getClass();
            appCompatTextView.setText(String.format(strC, Arrays.copyOf(new Object[]{userPa.name}, 1)));
            hmb.l1(get_match_sub_title(), strC, 1);
        }
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        u9w u9wVar = u9w.INSTANCE;
        userPa.getClass();
        String str = u9wVar.j(userPa).profileSmall().formatted();
        str.getClass();
        m226f(sVGADynamicEntity, str, "user_avatar1");
        User userP9 = CoreModule.c.e0.p9();
        userP9.getClass();
        String str2 = u9wVar.j(userP9).profileSmall().formatted();
        str2.getClass();
        m226f(sVGADynamicEntity, str2, "user_avatar2");
        if (!get_match_anim().isAnimating()) {
            get_match_anim().stopAnimation(true);
            get_match_anim().clearAnimation();
        }
        Context context = getContext();
        context.getClass();
        SVGALoader.with(context).from(kp3.INSTANCE.d()).repeatCount(1).dynamic(sVGADynamicEntity).autoPlay(true).animListener(new C0017c()).into(get_match_anim());
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
