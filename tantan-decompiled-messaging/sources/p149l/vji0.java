package p149l;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010'\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R$\u0010.\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010-\u001a\u0004\b.\u0010/R\"\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010-\u001a\u0004\b0\u0010/\"\u0004\b1\u0010\u0012R\"\u00106\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b4\u0010/\"\u0004\b5\u0010\u0012R\"\u0010:\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/\"\u0004\b9\u0010\u0012R\"\u0010?\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010;\u001a\u0004\b7\u0010<\"\u0004\b=\u0010>R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u0016R\"\u0010K\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JRY\u0010S\u001aG\u0012\u0013\u0012\u00110M¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(P\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bN\u0012\b\bO\u0012\u0004\b\b(Q\u0012\u0004\u0012\u00020\u001b0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010RR!\u0010X\u001a\b\u0012\u0004\u0012\u00020U0T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010V\u001a\u0004\b3\u0010W¨\u0006Y"}, m87232d2 = {"Ll/vji0;", "", "Landroid/widget/TextView;", "textView", "<init>", "(Landroid/widget/TextView;)V", "", "fromIndex", "toIndex", "colorRes", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "p", "(IIILandroid/view/View$OnClickListener;)V", "", "animation", "e", "(Z)V", "Ll/u7j0;", "transition", "j", "(Ll/u7j0;)V", "a", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "", "value", "b", "Ljava/lang/CharSequence;", "f", "()Ljava/lang/CharSequence;", "m", "(Ljava/lang/CharSequence;)V", "mainContent", "c", "g", "n", "suffix", Constants.INAPP_DATA_TAG, "collapseCache", "Landroid/text/Layout;", "Landroid/text/Layout;", "collapseLayoutCache", "Z", "isCollapsed", "()Z", "getEnableCache", "setEnableCache", "enableCache", "h", "getEnableMaxLinesCheck", "setEnableMaxLinesCheck", "enableMaxLinesCheck", RXScreenCaptureService.KEY_INDEX, "getAlwaysShowMoreBtn", BLiveStormDanmakuGiftResourceType.f44444l, "alwaysShowMoreBtn", "I", "()I", "o", "(I)V", "targetLineCount", "k", "Ll/u7j0;", "getTransition", "()Ll/u7j0;", "setTransition", "Landroid/view/ViewGroup;", "Landroid/view/ViewGroup;", "getSceneRoot", "()Landroid/view/ViewGroup;", "setSceneRoot", "(Landroid/view/ViewGroup;)V", "sceneRoot", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "text", "suffixIndex", "Lkotlin/jvm/functions/Function3;", "textWrapper", "", "Ll/vji0$a;", "Lkotlin/Lazy;", "()Ljava/util/List;", "suffixColorList", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vji0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final TextView textView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public CharSequence mainContent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public CharSequence suffix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public CharSequence collapseCache;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public Layout collapseLayoutCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isCollapsed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean enableCache;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean enableMaxLinesCheck;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean alwaysShowMoreBtn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int targetLineCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public u7j0 transition;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public ViewGroup sceneRoot;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Function3<String, CharSequence, Integer, CharSequence> textWrapper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Lazy suffixColorList;

    /* JADX INFO: renamed from: l.vji0$a */
    @Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/vji0$a;", "", "", "fromIndex", "toIndex", "color", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(IILjava/lang/Integer;Landroid/view/View$OnClickListener;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", Constants.INAPP_DATA_TAG, "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Landroid/view/View$OnClickListener;", "()Landroid/view/View$OnClickListener;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* data */ class C20652a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int fromIndex;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int toIndex;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public final Integer color;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public final View.OnClickListener listener;

        public C20652a(int i, int i2, @Nullable Integer num, @Nullable View.OnClickListener onClickListener) {
            this.fromIndex = i;
            this.toIndex = i2;
            this.color = num;
            this.listener = onClickListener;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Integer getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final View.OnClickListener getListener() {
            return this.listener;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C20652a)) {
                return false;
            }
            C20652a c20652a = (C20652a) other;
            return this.fromIndex == c20652a.fromIndex && this.toIndex == c20652a.toIndex && Intrinsics.m87488d(this.color, c20652a.color) && Intrinsics.m87488d(this.listener, c20652a.listener);
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.fromIndex) * 31) + Integer.hashCode(this.toIndex)) * 31;
            Integer num = this.color;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            View.OnClickListener onClickListener = this.listener;
            return iHashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SuffixColor(fromIndex=" + this.fromIndex + ", toIndex=" + this.toIndex + ", color=" + this.color + ", listener=" + this.listener + ")";
        }
    }

    /* JADX INFO: renamed from: l.vji0$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/vji0$b", "Ll/u8j0;", "Ll/u7j0;", "transition", "", "c", "(Ll/u7j0;)V", "e", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20653b extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f181730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vji0 f181731b;

        public C20653b(TextView textView, vji0 vji0Var) {
            this.f181730a = textView;
            this.f181731b = vji0Var;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
            this.f181730a.getLayoutParams().height = -2;
            TextView textView = this.f181730a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f181730a.setMaxLines(this.f181731b.getTargetLineCount());
            this.f181730a.setText(this.f181731b.getMainContent());
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.vji0$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"l/vji0$c", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C20654c extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View.OnClickListener f181732a;

        public C20654c(View.OnClickListener onClickListener) {
            this.f181732a = onClickListener;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            widget.getClass();
            this.f181732a.onClick(widget);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds) {
            ds.getClass();
            super.updateDrawState(ds);
            ds.setUnderlineText(false);
        }
    }

    public vji0(@NotNull TextView textView) {
        textView.getClass();
        this.textView = textView;
        CharSequence text = textView.getText();
        text.getClass();
        this.mainContent = text;
        this.enableMaxLinesCheck = true;
        this.targetLineCount = 2;
        this.transition = new lj1();
        ViewParent parent = textView.getParent();
        parent.getClass();
        this.sceneRoot = (ViewGroup) parent;
        this.textWrapper = new Function3() { // from class: l.tji0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return vji0.m198653a(this.f170731a, (String) obj, (CharSequence) obj2, ((Integer) obj3).intValue());
            }
        };
        this.suffixColorList = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.uji0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return vji0.m198654b();
            }
        });
        if (textView.getLayoutParams().width != -2) {
            return;
        }
        upk0.m194883a("textView's width can't be wrap_content. Only support match_parent or specified size");
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public static SpannableStringBuilder m198653a(vji0 vji0Var, String str, CharSequence charSequence, int i) {
        str.getClass();
        charSequence.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (C20652a c20652a : vji0Var.m198661h()) {
            int fromIndex = c20652a.getFromIndex() + i;
            int toIndex = c20652a.getToIndex() + i;
            View.OnClickListener listener = c20652a.getListener();
            if (listener != null) {
                spannableStringBuilder.setSpan(new C20654c(listener), fromIndex, toIndex, 33);
                vji0Var.textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            Integer color = c20652a.getColor();
            if (color != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color.intValue()), fromIndex, toIndex, 33);
            }
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: b */
    public static List m198654b() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public static Unit m198655c(vji0 vji0Var, u7j0 u7j0Var, CharSequence charSequence) {
        charSequence.getClass();
        m198657k(vji0Var, u7j0Var);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static Unit m198656d(vji0 vji0Var, CharSequence charSequence) {
        charSequence.getClass();
        vji0Var.collapseCache = charSequence;
        vji0Var.collapseLayoutCache = vji0Var.textView.getLayout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final void m198657k(vji0 vji0Var, u7j0 u7j0Var) {
        vji0Var.textView.setMaxLines(vji0Var.targetLineCount);
        vji0Var.textView.setEllipsize(TextUtils.TruncateAt.END);
        CharSequence text = vji0Var.textView.getText();
        vji0Var.textView.setText(vji0Var.mainContent);
        if (u7j0Var != null) {
            TextView textView = vji0Var.textView;
            Layout layout = textView.getLayout();
            if (layout != null) {
                int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
                textView.setText(text);
                textView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                textView.getLayoutParams().height = height;
                textView.setLayoutParams(textView.getLayoutParams());
                u7j0Var.addListener(new C20653b(textView, vji0Var));
            }
            v8j0.m197458a(vji0Var.sceneRoot, u7j0Var);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m198658e(boolean animation) {
        m198663j(animation ? this.transition : null);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final CharSequence getMainContent() {
        return this.mainContent;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final CharSequence getSuffix() {
        return this.suffix;
    }

    /* JADX INFO: renamed from: h */
    public final List<C20652a> m198661h() {
        return (List) this.suffixColorList.getValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTargetLineCount() {
        return this.targetLineCount;
    }

    /* JADX INFO: renamed from: j */
    public final void m198663j(final u7j0 transition) {
        if (this.enableMaxLinesCheck && this.textView.getMaxLines() < this.targetLineCount) {
            throw new IllegalArgumentException(("textView.maxLines(" + this.textView.getMaxLines() + ") < targetLineCount(" + this.targetLineCount + ")").toString());
        }
        this.isCollapsed = true;
        if (this.suffix == null) {
            m198657k(this, transition);
            return;
        }
        if (!this.enableCache || this.collapseCache == null || !Intrinsics.m87488d(this.collapseLayoutCache, this.textView.getLayout())) {
            TextView textView = this.textView;
            CharSequence charSequence = this.mainContent;
            CharSequence charSequence2 = this.suffix;
            charSequence2.getClass();
            pji0.m169880h(textView, charSequence, charSequence2, this.alwaysShowMoreBtn, this.targetLineCount, transition, this.sceneRoot, new Function1() { // from class: l.rji0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vji0.m198656d(this.f159696a, (CharSequence) obj);
                }
            }, new Function1() { // from class: l.sji0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return vji0.m198655c(this.f164841a, transition, (CharSequence) obj);
                }
            }, this.textWrapper);
            return;
        }
        if (Intrinsics.m87488d(this.collapseCache, this.mainContent)) {
            return;
        }
        TextView textView2 = this.textView;
        if (transition != null) {
            CharSequence charSequence3 = this.collapseCache;
            charSequence3.getClass();
            pji0.m169882j(textView2, charSequence3, transition, this.sceneRoot);
        } else {
            textView2.setMaxLines(this.targetLineCount);
            this.textView.setEllipsize(TextUtils.TruncateAt.END);
            this.textView.setText(this.collapseCache);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m198664l(boolean z) {
        this.alwaysShowMoreBtn = z;
    }

    /* JADX INFO: renamed from: m */
    public final void m198665m(@NotNull CharSequence charSequence) {
        charSequence.getClass();
        this.collapseCache = null;
        this.mainContent = charSequence;
    }

    /* JADX INFO: renamed from: n */
    public final void m198666n(@Nullable CharSequence charSequence) {
        this.collapseCache = null;
        if (new StaticLayout(this.mainContent, this.textView.getPaint(), this.textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false).getLineCount() > 2) {
            charSequence = "... " + ((Object) charSequence);
        }
        this.suffix = charSequence;
    }

    /* JADX INFO: renamed from: o */
    public final void m198667o(int i) {
        this.targetLineCount = i;
    }

    /* JADX INFO: renamed from: p */
    public final void m198668p(int fromIndex, int toIndex, @ColorRes int colorRes, @NotNull View.OnClickListener listener) {
        listener.getClass();
        if (new StaticLayout(this.mainContent, this.textView.getPaint(), this.textView.getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false).getLineCount() > 2) {
            fromIndex += 4;
        }
        m198661h().add(new C20652a(fromIndex, toIndex, Integer.valueOf(ywc0.m216332c(this.textView.getResources(), colorRes, this.textView.getContext().getTheme())), listener));
    }
}
