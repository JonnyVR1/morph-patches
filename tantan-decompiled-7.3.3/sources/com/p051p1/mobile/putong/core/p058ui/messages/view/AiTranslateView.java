package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.view.AiTranslateView;
import com.p051p1.mobile.putong.data.AiTranslateResultData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.i4g0;
import p153l.o1j0;
import p153l.oze;
import p153l.psd0;
import p153l.tye;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 M2\u00020\u0001:\u0001NB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010 \u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0019H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\fR\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00107R\u0018\u0010C\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0018\u0010F\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00107R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00107R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "g0", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onFinishInflate", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/p1/mobile/putong/core/data/Message;", "message", "", "Y", "(Lcom/p1/mobile/putong/core/data/Message;)Z", "", "hostId", "Landroid/view/View;", "contentView", "frameView", "Landroid/graphics/drawable/Drawable;", "originalContentBg", "X", "(Lcom/p1/mobile/putong/core/data/Message;Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "f0", "a0", "()Z", "txtWidth", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "i0", "(ILcom/p1/mobile/android/app/Act;)V", "value", "c0", "(Ljava/lang/String;)Z", "b0", "text", "h0", "(Ljava/lang/String;)V", "d0", "Lv/VText;", "c", "Lv/VText;", "translatedTextView", Constants.INAPP_DATA_TAG, "Landroid/view/View;", "translateLine", "e", "Lv/VLinear;", "translateBtn", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", "translateLoadingSvga", "g", "translateChangeLanguage", "h", "translateBtnText", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/core/data/Message;", "boundMessage", "j", "Ljava/lang/String;", "k", BLiveStormDanmakuGiftResourceType.f45292l, "m", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class AiTranslateView extends VLinear {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, String> f33137n = new LinkedHashMap();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Set<AiTranslateView> f33138o = new LinkedHashSet();

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Set<String> f33139p = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public VText translatedTextView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public View translateLine;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public VLinear translateBtn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public SVGAnimationView translateLoadingSvga;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public View translateChangeLanguage;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public VText translateBtnText;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Message boundMessage;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public String hostId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public View contentView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public View frameView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Drawable originalContentBg;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.AiTranslateView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView$a;", "", "<init>", "()V", "", "a", "", "", "translationCache", "Ljava/util/Map;", "", "Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView;", "activeViews", "Ljava/util/Set;", "translationingMsgCache", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m50965a() {
            AiTranslateView.f33139p.clear();
            AiTranslateView.f33137n.clear();
            Iterator it = new ArrayList(AiTranslateView.f33138o).iterator();
            while (it.hasNext()) {
                ((AiTranslateView) it.next()).m50962f0();
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ AiTranslateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: P */
    public static void m50946P(String str, AiTranslateView aiTranslateView, AiTranslateResultData aiTranslateResultData) {
        Set<String> set = f33139p;
        if (!set.contains(str) || aiTranslateResultData == null || TextUtils.isEmpty(aiTranslateResultData.translated_text)) {
            set.remove(str);
            Message message = aiTranslateView.boundMessage;
            if (Intrinsics.m88377d(message != null ? message.f56859id : null, str)) {
                aiTranslateView.m50959b0();
                return;
            }
            return;
        }
        f33137n.put(str, aiTranslateResultData.translated_text);
        Message message2 = aiTranslateView.boundMessage;
        if (Intrinsics.m88377d(message2 != null ? message2.f56859id : null, str)) {
            String str2 = aiTranslateResultData.translated_text;
            str2.getClass();
            aiTranslateView.m50963h0(str2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m50947Q(String str, AiTranslateView aiTranslateView, Throwable th) {
        f33139p.remove(str);
        Message message = aiTranslateView.boundMessage;
        if (Intrinsics.m88377d(message != null ? message.f56859id : null, str)) {
            aiTranslateView.m50959b0();
        }
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            o1j0.m165651y(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m50948R(View view) {
        i4g0.m138520r("e_intl_switch_language", OMSDialogPositon.p_chat_view);
        Context context = view.getContext();
        Act act = context instanceof Act ? (Act) context : null;
        if (act != null) {
            CoreModule.m30933P().m143412i().mo180393S2(act, new Runnable() { // from class: l.bh0
                @Override // java.lang.Runnable
                public final void run() {
                    AiTranslateView.m50954e0();
                }
            });
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m50953Z() {
        INSTANCE.m50965a();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m50954e0() {
        INSTANCE.m50965a();
    }

    /* JADX INFO: renamed from: g0 */
    private final void m50955g0() {
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.translateLine, true);
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R$string.f21622V3);
        }
        bnl0.m105524M(this.translateLoadingSvga, true);
        Context context = getContext();
        context.getClass();
        SVGALoader.SVGARequestBuilder sVGARequestBuilderRepeatCount = SVGALoader.with(context).from("ai_translating.svga").autoPlay(true).repeatCount(-1);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        sVGAnimationView.getClass();
        sVGARequestBuilderRepeatCount.into(sVGAnimationView);
        bnl0.m105524M(this.translateChangeLanguage, true);
        bnl0.m105524M(this.translatedTextView, false);
        m50961d0();
    }

    /* JADX INFO: renamed from: X */
    public final void m50956X(@Nullable Message message, @NotNull String hostId, @Nullable View contentView, @Nullable View frameView, @Nullable Drawable originalContentBg) {
        hostId.getClass();
        this.boundMessage = message;
        this.hostId = hostId;
        this.contentView = contentView;
        this.frameView = frameView;
        this.originalContentBg = originalContentBg;
        String str = message != null ? message.f56859id : null;
        Set<String> set = f33139p;
        if (!CollectionsKt.contains(set, str)) {
            m50962f0();
        }
        if (str == null || !m50957Y(message)) {
            return;
        }
        String str2 = f33137n.get(str);
        if (str2 != null) {
            m50963h0(str2);
        } else if (set.contains(str)) {
            m50955g0();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m50957Y(@Nullable Message message) {
        return (message == null || message.isGroupMessage() || !TEnum.equals(message.status(), "normal") || TextUtils.isEmpty(message.value) || m50960c0(message.value)) ? false : true;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m50958a0() {
        String str;
        Message message = this.boundMessage;
        if (message == null || (str = message.f56859id) == null) {
            return false;
        }
        return f33137n.containsKey(str);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m50959b0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        bnl0.m105524M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R$string.f21606T3);
        }
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.translateLine, false);
        bnl0.m105524M(this.translateChangeLanguage, false);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m50960c0(String value) {
        if (value == null || value.length() == 0 || !C15493d.m94374J(value, "[", false, 2, null) || !C15493d.m94380w(value, Constants.AES_SUFFIX, false, 2, null)) {
            return false;
        }
        String strSubstring = value.substring(1, value.length() - 1);
        if (StringsKt.m94303P(strSubstring, "[", false, 2, null) || StringsKt.m94303P(strSubstring, Constants.AES_SUFFIX, false, 2, null)) {
            return false;
        }
        return oze.f149871i.contains(strSubstring);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m50961d0() {
        View view;
        Drawable drawable = this.originalContentBg;
        if (drawable == null || (view = this.frameView) == null) {
            return;
        }
        view.setBackground(drawable);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m50962f0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.translatedTextView, false);
        bnl0.m105524M(this.translateLine, false);
        bnl0.m105524M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R$string.f21606T3);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m50963h0(String text) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        bnl0.m105524M(this, true);
        bnl0.m105524M(this.translateLine, true);
        bnl0.m105524M(this.translateChangeLanguage, true);
        bnl0.m105524M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R$string.f21606T3);
        }
        SpannableStringBuilder spannableStringBuilderM193573e = tye.m193573e(new SpannableStringBuilder(text), tye.f176661c);
        VText vText2 = this.translatedTextView;
        if (vText2 != null) {
            vText2.setText(spannableStringBuilderM193573e);
        }
        bnl0.m105524M(this.translatedTextView, true);
        m50961d0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m50964i0(int txtWidth, @Nullable Act act) {
        Message message;
        if (act == null || m50958a0() || (message = this.boundMessage) == null) {
            return;
        }
        final String str = message.f56859id;
        str.getClass();
        Set<String> set = f33139p;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        try {
            long j = Long.parseLong(str);
            if (txtWidth > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams.width = Math.max(txtWidth, bnl0.m105587w(180.0f));
                    setLayoutParams(layoutParams);
                }
            }
            Message message2 = this.boundMessage;
            if (message2 == null || !message2.isMe()) {
                VText vText = this.translatedTextView;
                if (vText != null) {
                    ViewGroup.LayoutParams layoutParams2 = vText.getLayoutParams();
                    if (layoutParams2 == null) {
                        C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        setGravity(3);
                        vText.setLayoutParams(layoutParams2);
                    }
                }
            } else {
                VText vText2 = this.translatedTextView;
                if (vText2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = vText2.getLayoutParams();
                    if (layoutParams3 == null) {
                        C0799b.m4641a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        setGravity(3);
                        vText2.setLayoutParams(layoutParams3);
                    }
                }
            }
            m50955g0();
            act.duringCreated(CoreModule.f18264c.f20426t0.m31032s3("chat", this.hostId, j, 0L)).subscribe(psd0.m173597H(new y20() { // from class: l.ch0
                @Override // p153l.y20
                public final void call(Object obj) {
                    AiTranslateView.m50946P(str, this, (AiTranslateResultData) obj);
                }
            }, new y20() { // from class: l.dh0
                @Override // p153l.y20
                public final void call(Object obj) {
                    AiTranslateView.m50947Q(str, this, (Throwable) obj);
                }
            }));
        } catch (NumberFormatException unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f33138o.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f33138o.remove(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.translateLine = findViewById(edc0.f93482w5);
        this.translatedTextView = (VText) findViewById(edc0.f93303W4);
        this.translateBtn = (VLinear) findViewById(edc0.f93270R1);
        this.translateLoadingSvga = (SVGAnimationView) findViewById(edc0.f93297V4);
        this.translateChangeLanguage = findViewById(edc0.f93291U4);
        this.translateBtnText = (VText) findViewById(edc0.f93412m5);
        View view = this.translateChangeLanguage;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.ah0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AiTranslateView.m50948R(view2);
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        VText vText = this.translatedTextView;
        if (vText == null || vText.getVisibility() != 0) {
            return;
        }
        View view = this.contentView;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        if (measuredWidth > getMeasuredWidth()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), heightMeasureSpec);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AiTranslateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AiTranslateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.hostId = "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AiTranslateView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
