package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.messages.view.AiTranslateView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.AiTranslateResultData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
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
import kotlin.text.StringsKt;
import kotlin.text.d;
import l.e30;
import l.kye;
import l.lsi0;
import l.mkd0;
import l.ox50;
import l.pxe;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 M2\u00020\u0001:\u0001NB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010 \u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\n¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0002¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u0019H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\fR\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00107R\u0018\u0010C\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u00104R\u0018\u0010F\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u00107R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00107R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView;", "Lv/VLinear;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "g0", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onFinishInflate", "onAttachedToWindow", "onDetachedFromWindow", "Lcom/p1/mobile/putong/core/data/Message;", "message", "", "Y", "(Lcom/p1/mobile/putong/core/data/Message;)Z", "", "hostId", "Landroid/view/View;", "contentView", "frameView", "Landroid/graphics/drawable/Drawable;", "originalContentBg", "X", "(Lcom/p1/mobile/putong/core/data/Message;Ljava/lang/String;Landroid/view/View;Landroid/view/View;Landroid/graphics/drawable/Drawable;)V", "f0", "a0", "()Z", "txtWidth", "Lcom/p1/mobile/android/app/Act;", "act", "i0", "(ILcom/p1/mobile/android/app/Act;)V", "value", "c0", "(Ljava/lang/String;)Z", "b0", "text", "h0", "(Ljava/lang/String;)V", "d0", "Lv/VText;", "c", "Lv/VText;", "translatedTextView", "d", "Landroid/view/View;", "translateLine", "e", "Lv/VLinear;", "translateBtn", "Lcom/tantan/library/svga/SVGAnimationView;", "f", "Lcom/tantan/library/svga/SVGAnimationView;", "translateLoadingSvga", "g", "translateChangeLanguage", "h", "translateBtnText", "i", "Lcom/p1/mobile/putong/core/data/Message;", "boundMessage", "j", "Ljava/lang/String;", "k", "l", "m", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class AiTranslateView extends VLinear {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final Map<String, String> f111n = new LinkedHashMap();

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final Set<AiTranslateView> f112o = new LinkedHashSet();

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Set<String> f113p = new LinkedHashSet();

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
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView$a;", "", "<init>", "()V", "", "a", "", "", "translationCache", "Ljava/util/Map;", "", "Lcom/p1/mobile/putong/core/ui/messages/view/AiTranslateView;", "activeViews", "Ljava/util/Set;", "translationingMsgCache", "message_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m200a() {
            AiTranslateView.f113p.clear();
            AiTranslateView.f111n.clear();
            Iterator it = new ArrayList(AiTranslateView.f112o).iterator();
            while (it.hasNext()) {
                ((AiTranslateView) it.next()).m197f0();
            }
        }

        public Companion() {
        }
    }

    public /* synthetic */ AiTranslateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: P */
    public static void m181P(String str, AiTranslateView aiTranslateView, AiTranslateResultData aiTranslateResultData) {
        Set<String> set = f113p;
        if (!set.contains(str) || aiTranslateResultData == null || TextUtils.isEmpty(aiTranslateResultData.translated_text)) {
            set.remove(str);
            Message message = aiTranslateView.boundMessage;
            if (Intrinsics.d(message != null ? ((DbObject) message).id : null, str)) {
                aiTranslateView.m194b0();
                return;
            }
            return;
        }
        f111n.put(str, aiTranslateResultData.translated_text);
        Message message2 = aiTranslateView.boundMessage;
        if (Intrinsics.d(message2 != null ? ((DbObject) message2).id : null, str)) {
            String str2 = aiTranslateResultData.translated_text;
            str2.getClass();
            aiTranslateView.m198h0(str2);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static void m182Q(String str, AiTranslateView aiTranslateView, Throwable th) {
        f113p.remove(str);
        Message message = aiTranslateView.boundMessage;
        if (Intrinsics.d(message != null ? ((DbObject) message).id : null, str)) {
            aiTranslateView.m194b0();
        }
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            lsi0.y(th.getMessage());
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m183R(View view) {
        zvf0.r("e_intl_switch_language", "p_chat_view");
        Act context = view.getContext();
        Act act = context instanceof Act ? context : null;
        if (act != null) {
            CoreModule.P().i().S2(act, new Runnable() { // from class: l.fh0
                @Override // java.lang.Runnable
                public final void run() {
                    AiTranslateView.m189e0();
                }
            });
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: Z */
    public static final void m188Z() {
        INSTANCE.m200a();
    }

    /* JADX INFO: renamed from: e0 */
    public static final void m189e0() {
        INSTANCE.m200a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    private final void m190g0() {
        xdl0.M(this, true);
        xdl0.M(this.translateLine, true);
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R.string.V3);
        }
        xdl0.M(this.translateLoadingSvga, true);
        Context context = getContext();
        context.getClass();
        SVGALoader.SVGARequestBuilder sVGARequestBuilderRepeatCount = SVGALoader.with(context).from("ai_translating.svga").autoPlay(true).repeatCount(-1);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        sVGAnimationView.getClass();
        sVGARequestBuilderRepeatCount.into(sVGAnimationView);
        xdl0.M(this.translateChangeLanguage, true);
        xdl0.M(this.translatedTextView, false);
        m196d0();
    }

    /* JADX INFO: renamed from: X */
    public final void m191X(@Nullable Message message, @NotNull String hostId, @Nullable View contentView, @Nullable View frameView, @Nullable Drawable originalContentBg) {
        hostId.getClass();
        this.boundMessage = message;
        this.hostId = hostId;
        this.contentView = contentView;
        this.frameView = frameView;
        this.originalContentBg = originalContentBg;
        String str = message != null ? ((DbObject) message).id : null;
        Set<String> set = f113p;
        if (!CollectionsKt.contains(set, str)) {
            m197f0();
        }
        if (str == null || !m192Y(message)) {
            return;
        }
        String str2 = f111n.get(str);
        if (str2 != null) {
            m198h0(str2);
        } else if (set.contains(str)) {
            m190g0();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m192Y(@Nullable Message message) {
        return (message == null || message.isGroupMessage() || !TEnum.equals(message.status(), "normal") || TextUtils.isEmpty(message.value) || m195c0(message.value)) ? false : true;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m193a0() {
        String str;
        Message message = this.boundMessage;
        if (message == null || (str = ((DbObject) message).id) == null) {
            return false;
        }
        return f111n.containsKey(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final void m194b0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        xdl0.M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R.string.T3);
        }
        xdl0.M(this, false);
        xdl0.M(this.translateLine, false);
        xdl0.M(this.translateChangeLanguage, false);
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m195c0(String value) {
        if (value == null || value.length() == 0 || !d.J(value, "[", false, 2, (Object) null) || !d.w(value, "]", false, 2, (Object) null)) {
            return false;
        }
        String strSubstring = value.substring(1, value.length() - 1);
        if (StringsKt.P(strSubstring, "[", false, 2, (Object) null) || StringsKt.P(strSubstring, "]", false, 2, (Object) null)) {
            return false;
        }
        return kye.i.contains(strSubstring);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m196d0() {
        View view;
        Drawable drawable = this.originalContentBg;
        if (drawable == null || (view = this.frameView) == null) {
            return;
        }
        view.setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final void m197f0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        xdl0.M(this, false);
        xdl0.M(this.translatedTextView, false);
        xdl0.M(this.translateLine, false);
        xdl0.M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R.string.T3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final void m198h0(String text) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        setLayoutParams(layoutParams);
        xdl0.M(this, true);
        xdl0.M(this.translateLine, true);
        xdl0.M(this.translateChangeLanguage, true);
        xdl0.M(this.translateLoadingSvga, false);
        SVGAnimationView sVGAnimationView = this.translateLoadingSvga;
        if (sVGAnimationView != null) {
            sVGAnimationView.stopAnimation(true);
        }
        VText vText = this.translateBtnText;
        if (vText != null) {
            vText.setText(R.string.T3);
        }
        SpannableStringBuilder spannableStringBuilderE = pxe.e(new SpannableStringBuilder(text), pxe.c);
        VText vText2 = this.translatedTextView;
        if (vText2 != null) {
            vText2.setText(spannableStringBuilderE);
        }
        xdl0.M(this.translatedTextView, true);
        m196d0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final void m199i0(int txtWidth, @Nullable Act act) {
        Message message;
        if (act == null || m193a0() || (message = this.boundMessage) == null) {
            return;
        }
        final String str = ((DbObject) message).id;
        str.getClass();
        Set<String> set = f113p;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
        try {
            long j = Long.parseLong(str);
            if (txtWidth > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams.width = Math.max(txtWidth, xdl0.w(180.0f));
                    setLayoutParams(layoutParams);
                }
            }
            Message message2 = this.boundMessage;
            if (message2 == null || !message2.isMe()) {
                VText vText = this.translatedTextView;
                if (vText != null) {
                    ViewGroup.LayoutParams layoutParams2 = vText.getLayoutParams();
                    if (layoutParams2 == null) {
                        ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
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
                        ox50.a("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        setGravity(3);
                        vText2.setLayoutParams(layoutParams3);
                    }
                }
            }
            m190g0();
            act.duringCreated(CoreModule.c.t0.s3("chat", this.hostId, j, 0L)).subscribe(mkd0.H(new e30() { // from class: l.gh0
                public final void call(Object obj) {
                    AiTranslateView.m181P(str, this, (AiTranslateResultData) obj);
                }
            }, new e30() { // from class: l.hh0
                public final void call(Object obj) {
                    AiTranslateView.m182Q(str, this, (Throwable) obj);
                }
            }));
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        f112o.add(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        f112o.remove(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.translateLine = findViewById(y4c0.w5);
        this.translatedTextView = findViewById(y4c0.W4);
        this.translateBtn = findViewById(y4c0.R1);
        this.translateLoadingSvga = findViewById(y4c0.V4);
        this.translateChangeLanguage = findViewById(y4c0.U4);
        this.translateBtnText = findViewById(y4c0.m5);
        View view = this.translateChangeLanguage;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: l.eh0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AiTranslateView.m183R(view2);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super/*android.view.View*/.onMeasure(widthMeasureSpec, heightMeasureSpec);
        VText vText = this.translatedTextView;
        if (vText == null || vText.getVisibility() != 0) {
            return;
        }
        View view = this.contentView;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        if (measuredWidth > getMeasuredWidth()) {
            super/*android.view.View*/.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), heightMeasureSpec);
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
