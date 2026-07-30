package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import com.tantanapp.common.utils.CrashHelper;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlin.ranges.C15274a;
import kotlin.text.C15493d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.AutoVDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\b\u0010\u001f\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J#\u00100\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\n\u0010/\u001a\u0006\u0012\u0002\b\u00030.H\u0016¢\u0006\u0004\b0\u00101J!\u00102\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b2\u0010\u000bR\"\u00109\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010E\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010A\u001a\u0004\bB\u0010\u001e\"\u0004\bC\u0010DR\"\u0010L\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010S\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010V\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010N\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010`\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010N\u001a\u0004\b^\u0010P\"\u0004\b_\u0010RR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010a\u001a\u0004\bb\u0010\r\"\u0004\bc\u0010\u000fR\u001a\u0010e\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b^\u0010a\u001a\u0004\bd\u0010\rR'\u0010k\u001a\u0012\u0012\u0004\u0012\u00020\u00070fj\b\u0012\u0004\u0012\u00020\u0007`g8\u0006¢\u0006\f\n\u0004\bT\u0010h\u001a\u0004\bi\u0010jR'\u0010m\u001a\u0012\u0012\u0004\u0012\u00020\u00070fj\b\u0012\u0004\u0012\u00020\u0007`g8\u0006¢\u0006\f\n\u0004\bO\u0010h\u001a\u0004\bl\u0010jR\"\u0010r\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010#R\"\u0010u\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010a\u001a\u0004\bs\u0010\r\"\u0004\bt\u0010\u000fR\"\u0010|\u001a\u00020v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{¨\u0006}"}, m88121d2 = {"Ll/k2j0;", "Ll/qa3;", "Lcom/tantan/library/svga/data/request/RequestCallback;", "<init>", "()V", "", "u", "", "text", "imageUrl", "r", "(Ljava/lang/String;Ljava/lang/String;)V", "h", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "svgaRes", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "f", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "a", "(Lcom/p1/mobile/android/app/Act;Landroid/view/ViewGroup;)V", "b", "()Landroid/view/View;", "e", "", NotificationCompat.CATEGORY_STATUS, "c", "(I)V", "", Constants.ScionAnalytics.PARAM_LABEL, "progress", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(Ljava/lang/CharSequence;I)V", "Lcom/tantan/library/svga/ResourceKey;", com.clevertap.android.sdk.Constants.KEY_KEY, "Lcom/tantan/library/svga/exception/SVGAException;", "onLoadFailed", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/exception/SVGAException;)V", "Lcom/tantan/library/svga/data/cache/Resource;", "resource", "onResourceReady", "(Lcom/tantan/library/svga/ResourceKey;Lcom/tantan/library/svga/data/cache/Resource;)V", BLiveStormDanmakuGiftResourceType.f45294s, "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", RXScreenCaptureService.KEY_INDEX, "()Landroid/widget/FrameLayout;", "set_boost_container", "(Landroid/widget/FrameLayout;)V", "_boost_container", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "m", "()Landroid/widget/RelativeLayout;", "set_fl_boost_anim", "(Landroid/widget/RelativeLayout;)V", "_fl_boost_anim", "Landroid/view/View;", "get_fl_boost_anim_round", "set_fl_boost_anim_round", "(Landroid/view/View;)V", "_fl_boost_anim_round", "Lv/VText;", "Lv/VText;", "n", "()Lv/VText;", "set_fl_boost_anim_status", "(Lv/VText;)V", "_fl_boost_anim_status", "Lcom/tantan/library/svga/SVGAnimationView;", "Lcom/tantan/library/svga/SVGAnimationView;", BLiveStormDanmakuGiftResourceType.f45292l, "()Lcom/tantan/library/svga/SVGAnimationView;", "set_boost_svga_particle", "(Lcom/tantan/library/svga/SVGAnimationView;)V", "_boost_svga_particle", "k", "set_boost_svga", "_boost_svga", "Lv/AutoVDraweeView;", "Lv/AutoVDraweeView;", "o", "()Lv/AutoVDraweeView;", "set_user_image", "(Lv/AutoVDraweeView;)V", "_user_image", "j", "set_boost_odiamond_svga", "_boost_odiamond_svga", "Ljava/lang/String;", "getText", "setText", "getREMAINING_STR", "REMAINING_STR", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "getDEFAULT_STATUS_TEXT", "()Ljava/util/ArrayList;", "DEFAULT_STATUS_TEXT", "getBOOSTING_STATUS_TEXT", "BOOSTING_STATUS_TEXT", "I", "getCurrentStatus", "()I", "setCurrentStatus", "currentStatus", "getCurrentSVGARes", "setCurrentSVGARes", "currentSVGARes", "", "Z", "getDefaultNoTextStyle", "()Z", "p", "(Z)V", "defaultNoTextStyle", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class k2j0 implements qa3, RequestCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _boost_container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RelativeLayout _fl_boost_anim;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public View _fl_boost_anim_round;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _fl_boost_anim_status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public SVGAnimationView _boost_svga_particle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public SVGAnimationView _boost_svga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AutoVDraweeView _user_image;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public SVGAnimationView _boost_odiamond_svga;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String text = "";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final String REMAINING_STR = "剩余";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<String> DEFAULT_STATUS_TEXT = CollectionsKt.arrayListOf("加速配对", "获取10倍配对", "获取更多新喜欢", "让更多人看到我");

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<String> BOOSTING_STATUS_TEXT = CollectionsKt.arrayListOf("剩余", "加速配对中");

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int currentStatus = -1;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public String currentSVGARes = "";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean defaultNoTextStyle;

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m147948t(k2j0 k2j0Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        k2j0Var.m147967s(str, str2);
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: a */
    public void mo147949a(@Nullable Act act, @Nullable ViewGroup parent) {
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(act);
        layoutInflaterM171370a.getClass();
        m147954f(layoutInflaterM171370a, parent);
        m147960l().setRequestCallback(this);
        m147962n().setTypeface(null, 1);
        Context context = m147960l().getContext();
        context.getClass();
        SVGALoader.with(context).from("https://auto.tancdn.com/v1/raw/1fefa2ee-6067-4ef9-a91b-4952d95d14e113.so").repeatCount(-1).autoPlay(true).into(m147960l());
        Context context2 = m147958j().getContext();
        context2.getClass();
        SVGALoader.with(context2).from("https://auto.tancdn.com/v1/raw/f8c57236-5032-40f3-943d-56b93b02631d10.pdf").repeatCount(-1).into(m147958j());
    }

    @Override // p153l.qa3
    @Nullable
    /* JADX INFO: renamed from: b */
    public View mo147950b() {
        return m147957i();
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: c */
    public void mo147951c(int status) {
        if (this.currentStatus != status) {
            m147948t(this, null, null, 3, null);
        }
        this.currentStatus = status;
    }

    @Override // p153l.qa3
    /* JADX INFO: renamed from: d */
    public void mo147952d(@Nullable CharSequence label, int progress) {
        if (ric0.INSTANCE.m181594b()) {
            if (bnl0.m105529O0(m147962n())) {
                CharSequence text = m147962n().getText();
                text.getClass();
                if (StringsKt.m94291I0(text, this.REMAINING_STR, false, 2, null)) {
                    m147965q(this.REMAINING_STR + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m147956h());
                    return;
                }
                return;
            }
            return;
        }
        if (v83.m200282b() && t450.m189175j() && !bnl0.m105529O0(m147958j())) {
            m147948t(this, null, null, 3, null);
            return;
        }
        if (bnl0.m105529O0(m147962n())) {
            CharSequence text2 = m147962n().getText();
            text2.getClass();
            if (StringsKt.m94291I0(text2, this.REMAINING_STR, false, 2, null)) {
                m147965q(this.REMAINING_STR + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m147956h());
            }
        }
    }

    @Override // p153l.qa3
    @NotNull
    /* JADX INFO: renamed from: e */
    public View mo147953e() {
        return m147957i();
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final View m147954f(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM152625b = l2j0.m152625b(this, inflater, parent);
        viewM152625b.getClass();
        return viewM152625b;
    }

    /* JADX INFO: renamed from: g */
    public final void m147955g(String svgaRes) {
        if (!Intrinsics.m88377d(this.currentSVGARes, svgaRes)) {
            m147959k().stopAnimation(true);
            Context context = m147959k().getContext();
            context.getClass();
            SVGALoader.with(context).from(svgaRes).autoPlay(true).repeatCount(-1).into(m147959k());
        }
        this.currentSVGARes = svgaRes;
    }

    /* JADX INFO: renamed from: h */
    public final String m147956h() {
        long jM156795w3 = (CoreModule.f18264c.f20318J0.m156795w3() - uqb0.f180376H.guessedCurrentServerTime()) / 1000;
        if (ric0.INSTANCE.m181594b()) {
            jM156795w3 = (CoreModule.f18264c.f20377c2.m118405q3() - uqb0.f180376H.guessedCurrentServerTime()) / 1000;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jM156795w3 / 60), Long.valueOf(jM156795w3 % 60)}, 2));
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final FrameLayout m147957i() {
        FrameLayout frameLayout = this._boost_container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_boost_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final SVGAnimationView m147958j() {
        SVGAnimationView sVGAnimationView = this._boost_odiamond_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_boost_odiamond_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final SVGAnimationView m147959k() {
        SVGAnimationView sVGAnimationView = this._boost_svga;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_boost_svga");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final SVGAnimationView m147960l() {
        SVGAnimationView sVGAnimationView = this._boost_svga_particle;
        if (sVGAnimationView != null) {
            return sVGAnimationView;
        }
        Intrinsics.m88391r("_boost_svga_particle");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final RelativeLayout m147961m() {
        RelativeLayout relativeLayout = this._fl_boost_anim;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m88391r("_fl_boost_anim");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final VText m147962n() {
        VText vText = this._fl_boost_anim_status;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_fl_boost_anim_status");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final AutoVDraweeView m147963o() {
        AutoVDraweeView autoVDraweeView = this._user_image;
        if (autoVDraweeView != null) {
            return autoVDraweeView;
        }
        Intrinsics.m88391r("_user_image");
        return null;
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onLoadFailed(@NotNull ResourceKey key, @Nullable SVGAException e) {
        key.getClass();
        if (e != null) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // com.tantan.library.svga.data.request.RequestCallback
    public void onResourceReady(@NotNull ResourceKey key, @NotNull Resource<?> resource) {
        key.getClass();
        resource.getClass();
    }

    /* JADX INFO: renamed from: p */
    public final void m147964p(boolean z) {
        this.defaultNoTextStyle = z;
    }

    /* JADX INFO: renamed from: q */
    public final void m147965q(String text) {
        m147962n().setWidth(C15493d.m94374J(text, this.REMAINING_STR, false, 2, null) ? C15274a.m88486b(((int) Math.ceil(m147962n().getPaint().measureText(new Regex("[0-9]").replace(text, "4")))) + 3, (int) Math.ceil(m147962n().getPaint().measureText(text))) : (int) Math.ceil(m147962n().getPaint().measureText(text)));
        m147962n().setText(text);
    }

    /* JADX INFO: renamed from: r */
    public final void m147966r(String text, String imageUrl) {
        if (text.length() == 0) {
            text = (String) CollectionsKt.random(this.BOOSTING_STATUS_TEXT, Random.INSTANCE);
        }
        bnl0.m105524M(m147961m(), true);
        bnl0.m105524M(m147960l(), true);
        bnl0.m105525M0(m147963o(), false);
        if (imageUrl.length() > 0) {
            bnl0.m105524M(m147963o(), true);
            m147963o().setImageUrl(imageUrl);
        }
        if (C15493d.m94374J(text, this.REMAINING_STR, false, 2, null)) {
            m147965q(this.REMAINING_STR + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + m147956h());
        } else {
            m147965q(text);
        }
        m147955g("https://auto.tancdn.com/v1/raw/78d48405-c88b-494d-94e8-8ddda81296eb12.so");
    }

    /* JADX INFO: renamed from: s */
    public final void m147967s(@NotNull String text, @NotNull String imageUrl) {
        text.getClass();
        imageUrl.getClass();
        if (ric0.INSTANCE.m181594b()) {
            if (m147958j().isAnimating()) {
                m147958j().stopAnimation(false);
            }
            bnl0.m105524M(m147958j(), false);
            if (!C21545y9.INSTANCE.m214797k() || CoreModule.m30933P().m143410g().mo36020Ki() || CoreModule.m30933P().m143410g().mo36090yc()) {
                m147968u();
            } else {
                m147966r(text, imageUrl);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m147968u() {
        String str;
        if (this.defaultNoTextStyle) {
            str = "";
        } else {
            str = CoreModule.m30933P().m143412i().mo180364N() ? "加速配对" : (String) CollectionsKt.random(this.DEFAULT_STATUS_TEXT, Random.INSTANCE);
        }
        bnl0.m105525M0(m147963o(), false);
        bnl0.m105524M(m147960l(), false);
        if (str.length() == 0) {
            bnl0.m105524M(m147961m(), false);
            m147955g("https://auto.tancdn.com/v1/raw/c3c0ac1a-8dcd-453d-9ad9-d48d9c40a4f613.so");
        } else {
            bnl0.m105524M(m147961m(), true);
            m147965q(str);
            m147955g("https://auto.tancdn.com/v1/raw/78d48405-c88b-494d-94e8-8ddda81296eb12.so");
        }
    }
}
