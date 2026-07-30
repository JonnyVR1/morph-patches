package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001IB\u001b\b\u0007\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00142\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0013R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R2\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R<\u0010A\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, m88121d2 = {"Ll/s01;", p7f.GPS_DIRECTION_TRUE, "Ll/ft2;", "", "data", "<init>", "(Ljava/util/List;)V", "", Item.TYPE, "", "m", "(Ljava/lang/Object;)Ljava/lang/String;", "", FirebaseAnalytics.Param.INDEX, "n", "(I)Ljava/lang/String;", "", "isCompareFormatText", "p", "(Ljava/lang/Object;Z)I", p7f.GPS_MEASUREMENT_INTERRUPTED, "position", BLiveStormDanmakuGiftResourceType.f45292l, "(I)Ljava/lang/Object;", "o", "()Ljava/lang/Object;", "q", "Ll/vri0;", "e", "Ll/vri0;", "getTextFormatter$putong_common_intlGmsRelease", "()Ll/vri0;", "w", "(Ll/vri0;)V", "textFormatter", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "getFormatterBlock$putong_common_intlGmsRelease", "()Lkotlin/jvm/functions/Function1;", BLiveStormDanmakuGiftResourceType.f45294s, "(Lkotlin/jvm/functions/Function1;)V", "formatterBlock", "Ll/s01$a;", "g", "Ll/s01$a;", "getFinishScrollCallback$putong_common_intlGmsRelease", "()Ll/s01$a;", "r", "(Ll/s01$a;)V", "finishScrollCallback", "h", "I", "getSelectedItemPosition$putong_common_intlGmsRelease", "()I", ResourceDirection.f39656v, "(I)V", "selectedItemPosition", "Lkotlin/Function2;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/jvm/functions/Function2;", "getItemIndexerBlock$putong_common_intlGmsRelease", "()Lkotlin/jvm/functions/Function2;", "u", "(Lkotlin/jvm/functions/Function2;)V", "itemIndexerBlock", "Ll/w6q;", "itemIndexer", "Ll/w6q;", "getItemIndexer$putong_common_intlGmsRelease", "()Ll/w6q;", Constants.KEY_T, "(Ll/w6q;)V", "a", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class s01<T> extends ft2<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public vri0 textFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function1<Object, String> formatterBlock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC19946a finishScrollCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int selectedItemPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Function2<? super s01<?>, Object, Integer> itemIndexerBlock;

    /* JADX INFO: renamed from: l.s01$a */
    @Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m88121d2 = {"Ll/s01$a;", "", "", "a", "()V", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19946a {
        /* JADX INFO: renamed from: a */
        void mo80660a();
    }

    public /* synthetic */ s01(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final <V> V m183873l(int position) {
        T tM127285d = m127285d(position);
        if (tM127285d == null) {
            return null;
        }
        return tM127285d;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public String m183874m(@Nullable Object item) {
        String string;
        String strInvoke;
        String strMo202504a;
        vri0 vri0Var = this.textFormatter;
        if (vri0Var != null && (strMo202504a = vri0Var.mo202504a(item)) != null) {
            return strMo202504a;
        }
        Function1<Object, String> function1 = this.formatterBlock;
        if (function1 == null || (strInvoke = function1.invoke(item)) == null) {
            return (item == null || (string = item.toString()) == null) ? "" : string;
        }
        return strInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public String m183875n(int index) {
        int iM127284c = m127284c();
        if (iM127284c == 0) {
            return "";
        }
        if (!getIsCyclic()) {
            return (index < 0 || index >= iM127284c) ? "" : m183874m(m127285d(index));
        }
        int i = index % iM127284c;
        if (i < 0) {
            i += iM127284c;
        }
        return m183874m(m127285d(i));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final <V> V m183876o() {
        InterfaceC19946a interfaceC19946a = this.finishScrollCallback;
        if (interfaceC19946a != null) {
            interfaceC19946a.mo80660a();
        }
        return (V) m183873l(this.selectedItemPosition);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: p */
    public final int m183877p(@Nullable Object item, boolean isCompareFormatText) {
        Function2<? super s01<?>, Object, Integer> function2 = this.itemIndexerBlock;
        return function2 != null ? function2.invoke(this, item).intValue() : m183878q(item, isCompareFormatText);
    }

    /* JADX INFO: renamed from: q */
    public final int m183878q(Object item, boolean isCompareFormatText) {
        int size = m127283b().size();
        for (int i = 0; i < size; i++) {
            if (isCompareFormatText) {
                if (Intrinsics.m88377d(m183875n(i), item)) {
                    return i;
                }
            } else {
                if (Intrinsics.m88377d(m127283b().get(i), item)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m183879r(@Nullable InterfaceC19946a interfaceC19946a) {
        this.finishScrollCallback = interfaceC19946a;
    }

    /* JADX INFO: renamed from: s */
    public final void m183880s(@Nullable Function1<Object, String> function1) {
        this.formatterBlock = function1;
    }

    /* JADX INFO: renamed from: u */
    public final void m183882u(@Nullable Function2<? super s01<?>, Object, Integer> function2) {
        this.itemIndexerBlock = function2;
    }

    /* JADX INFO: renamed from: v */
    public final void m183883v(int i) {
        this.selectedItemPosition = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m183884w(@Nullable vri0 vri0Var) {
        this.textFormatter = vri0Var;
    }

    @JvmOverloads
    public s01(@Nullable List<? extends T> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public s01() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final void m183881t(@Nullable w6q w6qVar) {
    }
}
