package p153l;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.codec.language.p126bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a/\u0010\f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001aä\u0001\u0010\u001e\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142%\b\u0002\u0010\u0019\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00142M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a¢\u0006\u0004\b\u001e\u0010\u001f\u001aÊ\u0001\u0010 \u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122#\b\u0002\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u00142#\b\u0002\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00020\u00142M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a¢\u0006\u0004\b \u0010!\u001az\u0010\"\u001a\u00020\u0012*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122M\u0010\u001d\u001aI\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00108\u0002X\u0082D¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"", Languages.ANY, "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/Object;)V", "Landroid/widget/TextView;", "", "content", "Ll/ygj0;", "transition", "Landroid/view/ViewGroup;", "sceneRoot", "j", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ll/ygj0;Landroid/view/ViewGroup;)V", "mainContent", "suffix", "", "alwaysShowMoreBtn", "", "targetLineCount", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "text", "onSuccess", "onFailed", "Lkotlin/Function3;", "", "suffixIndex", "textWrapper", "h", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILl/ygj0;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "k", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "f", "(Landroid/widget/TextView;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILkotlin/jvm/functions/Function3;)I", "a", "Z", "enableDebugLog", "livingroom_intlGmsRelease"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class psi0 {

    /* JADX INFO: renamed from: a */
    public static final boolean f153907a = false;

    /* JADX INFO: renamed from: l.psi0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/psi0$a", "Ll/yhj0;", "Ll/ygj0;", "transition", "", "c", "(Ll/ygj0;)V", "e", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19435a extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f153908a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f153909b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function1<CharSequence, Unit> f153910c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f153911d;

        /* JADX WARN: Multi-variable type inference failed */
        public C19435a(TextView textView, CharSequence charSequence, Function1<? super CharSequence, Unit> function1, CharSequence charSequence2) {
            this.f153908a = textView;
            this.f153909b = charSequence;
            this.f153910c = function1;
            this.f153911d = charSequence2;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(ygj0 transition) {
            transition.getClass();
            transition.removeListener(this);
            this.f153908a.getLayoutParams().height = -2;
            TextView textView = this.f153908a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f153908a.setText(this.f153909b);
            Function1<CharSequence, Unit> function1 = this.f153910c;
            if (function1 != null) {
                function1.invoke(this.f153911d);
            }
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: e */
        public void mo106213e(ygj0 transition) {
            transition.getClass();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.psi0$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m88121d2 = {"l/psi0$b", "Ll/yhj0;", "Ll/ygj0;", "transition", "", "c", "(Ll/ygj0;)V", "e", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C19436b extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f153912a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CharSequence f153913b;

        public C19436b(TextView textView, CharSequence charSequence) {
            this.f153912a = textView;
            this.f153913b = charSequence;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(ygj0 transition) {
            transition.getClass();
            transition.removeListener(this);
            this.f153912a.getLayoutParams().height = -2;
            TextView textView = this.f153912a;
            textView.setLayoutParams(textView.getLayoutParams());
            this.f153912a.setText(this.f153913b);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: e */
        public void mo106213e(ygj0 transition) {
            transition.getClass();
            transition.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.psi0$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JY\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"l/psi0$c", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", ResourceDirection.f39656v, "", BLiveGiftBubblePopupTitlePosition.left, StickStatus.top, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class ViewOnLayoutChangeListenerC19437c implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f153914a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<CharSequence, Unit> f153915b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ CharSequence f153916c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CharSequence f153917d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f153918e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function3<String, CharSequence, Integer, CharSequence> f153919f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CharSequence f153920g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f153921h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function1<CharSequence, Unit> f153922i;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewOnLayoutChangeListenerC19437c(TextView textView, Function1<? super CharSequence, Unit> function1, CharSequence charSequence, CharSequence charSequence2, int i, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, CharSequence charSequence3, boolean z, Function1<? super CharSequence, Unit> function2) {
            this.f153914a = textView;
            this.f153915b = function1;
            this.f153916c = charSequence;
            this.f153917d = charSequence2;
            this.f153918e = i;
            this.f153919f = function3;
            this.f153920g = charSequence3;
            this.f153921h = z;
            this.f153922i = function2;
        }

        /* JADX INFO: renamed from: a */
        public static void m173656a(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3 function3, Function1 function1, CharSequence charSequence3, boolean z, Function1 function2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            psi0.m173655l(function1, charSequence3, textView, charSequence, z, charSequence2, function3, function2, psi0.m173649f(textView, charSequence, charSequence2, i, function3));
            psi0.m173652i(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            this.f153914a.removeOnLayoutChangeListener(this);
            if (this.f153914a.getLayout() == null) {
                Function1<CharSequence, Unit> function1 = this.f153915b;
                CharSequence text = this.f153914a.getText();
                text.getClass();
                function1.invoke(text);
                return;
            }
            final TextView textView = this.f153914a;
            final CharSequence charSequence = this.f153916c;
            final CharSequence charSequence2 = this.f153917d;
            final int i = this.f153918e;
            final Function3<String, CharSequence, Integer, CharSequence> function3 = this.f153919f;
            final Function1<CharSequence, Unit> function2 = this.f153915b;
            final CharSequence charSequence3 = this.f153920g;
            final boolean z = this.f153921h;
            final Function1<CharSequence, Unit> function4 = this.f153922i;
            textView.post(new Runnable() { // from class: l.qsi0
                @Override // java.lang.Runnable
                public final void run() {
                    psi0.ViewOnLayoutChangeListenerC19437c.m173656a(textView, charSequence, charSequence2, i, function3, function2, charSequence3, z, function4);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public static Unit m173644a(ygj0 ygj0Var, Function1 function1, TextView textView, CharSequence charSequence, ViewGroup viewGroup, CharSequence charSequence2) {
        charSequence2.getClass();
        if (ygj0Var != null) {
            CharSequence text = textView.getText();
            int height = textView.getLayout().getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(charSequence);
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            ygj0Var.addListener(new C19435a(textView, text, function1, charSequence2));
            zhj0.m219688a(viewGroup, ygj0Var);
        } else if (function1 != null) {
            function1.invoke(charSequence2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m173645b(TextView textView, CharSequence charSequence, int i, Function1 function1, CharSequence charSequence2) {
        charSequence2.getClass();
        textView.setText(charSequence);
        textView.setMaxLines(i);
        if (function1 != null) {
            function1.invoke(charSequence);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final int m173649f(TextView textView, CharSequence charSequence, CharSequence charSequence2, int i, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        Ref.IntRef intRef = new Ref.IntRef();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (textView.getLayout() == null) {
            m173652i("layout is null");
            return -1;
        }
        int iM173650g = m173650g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, charSequence.length());
        if (iM173650g <= i) {
            m173652i("verify <= targetLineCount, verify = " + iM173650g + ", targetLineCount = " + i);
            textView.setText(charSequence);
            return charSequence.length();
        }
        int length = charSequence.length();
        m173652i("left = 0, right = " + length);
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            int iM173650g2 = m173650g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, i3);
            String str = "binarySearch: (" + i2 + ", " + i3 + ", " + length + "), pLineCount = " + iM173650g2;
            if (iM173650g2 < i) {
                str = str + ", targetLineCount = " + i + ", pLineCount < targetLineCount";
                i2 = i3 + 1;
            } else if (iM173650g2 == i) {
                int i4 = i3 + 1;
                int iM173650g3 = m173650g(linkedHashMap, intRef, charSequence, charSequence2, textView, function3, 0, i4);
                str = str + ", nLineCount = " + iM173650g3;
                int i5 = i + 1;
                if (iM173650g3 >= i5) {
                    if (iM173650g3 != i5) {
                        m173652i("impossible");
                        break;
                    }
                    m173652i("success = " + i3 + ", verifyCount = " + intRef.element);
                    return i3;
                }
                i2 = i4;
            } else {
                length = i3 - 1;
            }
            m173652i(str + ", text = " + charSequence.subSequence(0, i3).toString() + ((Object) charSequence2));
        }
        m173652i("failed, verifyCount = " + intRef.element);
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m173650g(Map<Integer, Integer> map, Ref.IntRef intRef, CharSequence charSequence, CharSequence charSequence2, TextView textView, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, int i, int i2) {
        CharSequence charSequenceInvoke;
        int i3 = (i << 16) | i2;
        Integer num = map.get(Integer.valueOf(i3));
        if (num != null) {
            m173652i("verify: " + i2 + " cached");
            return num.intValue();
        }
        intRef.element++;
        CharSequence charSequence3 = charSequence.subSequence(i, i2).toString() + ((Object) charSequence2);
        if (function3 != null && (charSequenceInvoke = function3.invoke(charSequence3, charSequence2, Integer.valueOf(i2))) != null) {
            charSequence3 = charSequenceInvoke;
        }
        textView.setText(charSequence3);
        int lineCount = textView.getLineCount();
        m173652i("verify: " + i2 + ", lineCount = " + lineCount);
        map.put(Integer.valueOf(i3), Integer.valueOf(lineCount));
        return lineCount;
    }

    /* JADX INFO: renamed from: h */
    public static final void m173651h(@NotNull final TextView textView, @NotNull final CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, final int i, @Nullable final ygj0 ygj0Var, @NotNull final ViewGroup viewGroup, @Nullable final Function1<? super CharSequence, Unit> function1, @Nullable final Function1<? super CharSequence, Unit> function2, @Nullable Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        textView.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        viewGroup.getClass();
        final CharSequence text = textView.getText();
        m173654k(textView, charSequence, charSequence2, z, i, new Function1() { // from class: l.nsi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psi0.m173644a(ygj0Var, function1, textView, text, viewGroup, (CharSequence) obj);
            }
        }, new Function1() { // from class: l.osi0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psi0.m173645b(textView, charSequence, i, function2, (CharSequence) obj);
            }
        }, function3);
    }

    /* JADX INFO: renamed from: i */
    public static final void m173652i(Object obj) {
        if (f153907a) {
            String.valueOf(obj);
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: j */
    public static final void m173653j(@NotNull TextView textView, @NotNull CharSequence charSequence, @NotNull ygj0 ygj0Var, @NotNull ViewGroup viewGroup) {
        textView.getClass();
        charSequence.getClass();
        ygj0Var.getClass();
        viewGroup.getClass();
        CharSequence text = textView.getText();
        textView.setText(charSequence);
        Layout layout = textView.getLayout();
        if (layout != null) {
            int height = layout.getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(text);
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            ygj0Var.addListener(new C19436b(textView, charSequence));
        }
        zhj0.m219688a(viewGroup, ygj0Var);
    }

    /* JADX INFO: renamed from: k */
    public static final void m173654k(@NotNull TextView textView, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, boolean z, int i, @NotNull Function1<? super CharSequence, Unit> function1, @NotNull Function1<? super CharSequence, Unit> function2, @Nullable Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3) {
        textView.getClass();
        charSequence.getClass();
        charSequence2.getClass();
        function1.getClass();
        function2.getClass();
        CharSequence text = textView.getText();
        if (textView.getLayout() == null) {
            textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19437c(textView, function2, charSequence, charSequence2, i, function3, text, z, function1));
            textView.requestLayout();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        m173655l(function2, text, textView, charSequence, z, charSequence2, function3, function1, m173649f(textView, charSequence, charSequence2, i, function3));
        m173652i(">>>>>performance: " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
    }

    /* JADX INFO: renamed from: l */
    public static final void m173655l(Function1<? super CharSequence, Unit> function1, CharSequence charSequence, TextView textView, CharSequence charSequence2, boolean z, CharSequence charSequence3, Function3<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> function3, Function1<? super CharSequence, Unit> function2, int i) {
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
