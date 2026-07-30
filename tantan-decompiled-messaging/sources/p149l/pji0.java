package p149l;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.codec.language.p122bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aä\u0001\u0010\u001e\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142%\b\u0002\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001f\u001aÊ\u0001\u0010 \u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u00142#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u00142M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a¢\u0006\u0004\b \u0010!\u001az\u0010\"\u001a\u00020\u0012*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"", Languages.ANY, "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)V", "Landroid/widget/TextView;", "", "content", "Ll/u7j0;", "transition", "Landroid/view/ViewGroup;", "sceneRoot", "j", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ll/u7j0;Landroid/view/ViewGroup;)V", "mainContent", "suffix", "", "alwaysShowMoreBtn", "", "targetLineCount", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "text", "onSuccess", "onFailed", "Lkotlin/Function3;", "", "suffixIndex", "textWrapper", "h", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILl/u7j0;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "k", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "f", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILkotlin/jvm/functions/Function3;)I", "a", "Z", "enableDebugLog", "livingroom_intlGmsRelease"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class pji0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f149789a = false;

    /* JADX INFO: renamed from: l.pji0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/pji0$a", "Ll/u8j0;", "Ll/u7j0;", "transition", "", "c", "(Ll/u7j0;)V", "e", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19244a extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f149790a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f149791b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<CharSequence, Unit> f149792c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f149793d;

        /* JADX WARN: Multi-variable type inference failed */
        public C19244a(TextView textView, CharSequence charSequence, Function1<? super CharSequence, Unit> function1, CharSequence charSequence2) {
            this.f149790a = textView;
            this.f149791b = charSequence;
            this.f149792c = function1;
            this.f149793d = charSequence2;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
            this.f149790a.getLayoutParams().height = -2;
            TextView textView = this.f149790a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f149790a.setText(this.f149791b);
            Function1<CharSequence, Unit> function1 = this.f149792c;
            if (function1 != null) {
                function1.invoke(this.f149793d);
            }
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.pji0$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m87232d2 = {"l/pji0$b", "Ll/u8j0;", "Ll/u7j0;", "transition", "", "c", "(Ll/u7j0;)V", "e", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C19245b extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f149794a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f149795b;

        public C19245b(TextView textView, CharSequence charSequence) {
            this.f149794a = textView;
            this.f149795b = charSequence;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
            this.f149794a.getLayoutParams().height = -2;
            TextView textView = this.f149794a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f149794a.setText(this.f149795b);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(u7j0 transition) {
            transition.getClass();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.pji0$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JY\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m87232d2 = {"l/pji0$c", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", ResourceDirection.f38808v, "", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class ViewOnLayoutChangeListenerC19246c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f149796a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<CharSequence, Unit> f149797b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CharSequence f149798c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f149799d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f149800e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function3<String, CharSequence, Integer, CharSequence> f149801f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CharSequence f149802g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f149803h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<CharSequence, Unit> f149804i;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnLayoutChangeListenerC19246c(TextView textView, Function1<? super CharSequence, Unit> function1, CharSequence charSequence, CharSequence charSequence2, int i, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, CharSequence charSequence3, boolean z, Function1<? super CharSequence, Unit> function2) {
            this.f149796a = textView;
            this.f149797b = function1;
            this.f149798c = charSequence;
            this.f149799d = charSequence2;
            this.f149800e = i;
            this.f149801f = function3;
            this.f149802g = charSequence3;
            this.f149803h = z;
            this.f149804i = function2;
        }

        /* JADX INFO: renamed from: a */
        public static void m169885a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3 function3, Function1 function1, CharSequence charSequence3, boolean z, Function1 function2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            pji0.m169884l(function1, charSequence3, textView, charSequence, z, charSequence2, function3, function2, pji0.m169878f(textView, charSequence, charSequence2, i, function3));
            pji0.m169881i(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            this.f149796a.removeOnLayoutChangeListener(this);
            if (this.f149796a.getLayout() == null) {
                Function1<CharSequence, Unit> function1 = this.f149797b;
                CharSequence text = this.f149796a.getText();
                text.getClass();
                function1.invoke(text);
                return;
            }
            final TextView textView = this.f149796a;
            final CharSequence charSequence = this.f149798c;
            final CharSequence charSequence2 = this.f149799d;
            final int i = this.f149800e;
            final Function3<String, CharSequence, Integer, CharSequence> function3 = this.f149801f;
            final Function1<CharSequence, Unit> function2 = this.f149797b;
            final CharSequence charSequence3 = this.f149802g;
            final boolean z = this.f149803h;
            final Function1<CharSequence, Unit> function4 = this.f149804i;
            textView.post(new Runnable() { // from class: l.qji0
                @Override // java.lang.Runnable
                public final void run() {
                    pji0.ViewOnLayoutChangeListenerC19246c.m169885a(textView, charSequence, charSequence2, i, function3, function2, charSequence3, z, function4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static Unit m169873a(u7j0 u7j0Var, Function1 function1, TextView textView, CharSequence charSequence, ViewGroup viewGroup, CharSequence charSequence2) {
        charSequence2.getClass();
        if (u7j0Var != null) {
            CharSequence text = textView.getText();
            int height = textView.getLayout().getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(charSequence);
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            u7j0Var.addListener(new C19244a(textView, text, function1, charSequence2));
            v8j0.m197458a(viewGroup, u7j0Var);
        } else if (function1 != null) {
            function1.invoke(charSequence2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m169874b(TextView textView, CharSequence charSequence, int i, Function1 function1, CharSequence charSequence2) {
        charSequence2.getClass();
        textView.setText(charSequence);
        textView.setMaxLines(i);
        if (function1 != null) {
            function1.invoke(charSequence);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final int m169878f(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        Ref.IntRef intRef = new Ref.IntRef();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (textView.getLayout() == null) {
            m169881i("layout is null");
            return -1;
        }
        int iM169879g = m169879g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, charSequence.length());
        if (iM169879g <= i) {
            m169881i("verify <= targetLineCount, verify = " + iM169879g + ", targetLineCount = " + i);
            textView.setText(charSequence);
            return charSequence.length();
        }
        int length = charSequence.length();
        m169881i("left = 0, right = " + length);
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            int iM169879g2 = m169879g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, i3);
            String str = "binarySearch: (" + i2 + ", " + i3 + ", " + length + "), pLineCount = " + iM169879g2;
            if (iM169879g2 < i) {
                str = str + ", targetLineCount = " + i + ", pLineCount < targetLineCount";
                i2 = i3 + 1;
            } else if (iM169879g2 == i) {
                int i4 = i3 + 1;
                int iM169879g3 = m169879g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, i4);
                str = str + ", nLineCount = " + iM169879g3;
                int i5 = i + 1;
                if (iM169879g3 >= i5) {
                    if (iM169879g3 != i5) {
                        m169881i("impossible");
                        break;
                    }
                    m169881i("success = " + i3 + ", verifyCount = " + intRef.element);
                    return i3;
                }
                i2 = i4;
            } else {
                length = i3 - 1;
            }
            m169881i(str + ", text = " + charSequence.subSequence(0, i3).toString() + ((Object) charSequence2));
        }
        m169881i("failed, verifyCount = " + intRef.element);
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m169879g(Map<Integer, Integer> map, Ref.IntRef intRef, CharSequence charSequence, CharSequence charSequence2, TextView textView, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, int i, int i2) {
        CharSequence charSequenceInvoke;
        int i3 = (i << 16) | i2;
        Integer num = map.get(Integer.valueOf(i3));
        if (num != null) {
            m169881i("verify: " + i2 + " cached");
            return num.intValue();
        }
        intRef.element++;
        CharSequence charSequence3 = charSequence.subSequence(i, i2).toString() + ((Object) charSequence2);
        if (function3 != null && (charSequenceInvoke = function3.invoke(charSequence3, charSequence2, Integer.valueOf(i2))) != null) {
            charSequence3 = charSequenceInvoke;
        }
        textView.setText(charSequence3);
        int lineCount = textView.getLineCount();
        m169881i("verify: " + i2 + ", lineCount = " + lineCount);
        map.put(Integer.valueOf(i3), Integer.valueOf(lineCount));
        return lineCount;
    }

    /* JADX INFO: renamed from: h */
    public static final void m169880h(@NotNull final TextView textView, @NotNull final CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, final int i, @Nullable final u7j0 u7j0Var, @NotNull final ViewGroup viewGroup, @Nullable final Function1<? super CharSequence, Unit> function1, @Nullable final Function1<? super CharSequence, Unit> function2, @Nullable Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        textView.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        viewGroup.getClass();
        final CharSequence text = textView.getText();
        m169883k(textView, charSequence, charSequence2, z, i, new Function1() { // from class: l.nji0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pji0.m169873a(u7j0Var, function1, textView, text, viewGroup, (CharSequence) obj);
            }
        }, new Function1() { // from class: l.oji0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return pji0.m169874b(textView, charSequence, i, function2, (CharSequence) obj);
            }
        }, function3);
    }

    /* JADX INFO: renamed from: i */
    public static final void m169881i(Object obj) {
        if (f149789a) {
            String.valueOf(obj);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public static final void m169882j(@NotNull TextView textView, @NotNull CharSequence charSequence, @NotNull u7j0 u7j0Var, @NotNull ViewGroup viewGroup) {
        textView.getClass();
        charSequence.getClass();
        u7j0Var.getClass();
        viewGroup.getClass();
        CharSequence text = textView.getText();
        textView.setText(charSequence);
        Layout layout = textView.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(text);
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            u7j0Var.addListener(new C19245b(textView, charSequence));
        }
        v8j0.m197458a(viewGroup, u7j0Var);
    }

    /* JADX INFO: renamed from: k */
    public static final void m169883k(@NotNull TextView textView, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, int i, @NotNull Function1<? super CharSequence, Unit> function1, @NotNull Function1<? super CharSequence, Unit> function2, @Nullable Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        textView.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        function1.getClass();
        function2.getClass();
        CharSequence text = textView.getText();
        if (textView.getLayout() == null) {
            textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19246c(textView, function2, charSequence, charSequence2, i, function3, text, z, function1));
            textView.requestLayout();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        m169884l(function2, text, textView, charSequence, z, charSequence2, function3, function1, m169878f(textView, charSequence, charSequence2, i, function3));
        m169881i(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    /* JADX INFO: renamed from: l */
    public static final void m169884l(Function1<? super CharSequence, Unit> function1, CharSequence charSequence, TextView textView, CharSequence charSequence2, boolean z, CharSequence charSequence3, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, Function1<? super CharSequence, Unit> function2, int i) {
        CharSequence charSequenceInvoke;
        if (i < 0) {
            charSequence.getClass();
            function1.invoke(charSequence);
            return;
        }
        if (i < charSequence2.length() || z) {
            charSequence2 = charSequence2.subSequence(0, i).toString() + ((Object) charSequence3);
            if (function3 != null && (charSequenceInvoke = function3.invoke(charSequence2, charSequence3, Integer.valueOf(i))) != null) {
                charSequence2 = charSequenceInvoke;
            }
        }
        textView.setText(charSequence2);
        CharSequence text = textView.getText();
        text.getClass();
        function2.invoke(text);
    }
}
