package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001IB\u001b\b\u0007\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0010¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00142\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0013R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R2\u0010*\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00109\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R<\u0010A\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\f\u0018\u00010:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Ll/l01;", j6f.GPS_DIRECTION_TRUE, "Ll/ps2;", "", "data", "<init>", "(Ljava/util/List;)V", "", Item.TYPE, "", "m", "(Ljava/lang/Object;)Ljava/lang/String;", "", FirebaseAnalytics.Param.INDEX, "n", "(I)Ljava/lang/String;", "", "isCompareFormatText", "p", "(Ljava/lang/Object;Z)I", j6f.GPS_MEASUREMENT_INTERRUPTED, "position", BLiveStormDanmakuGiftResourceType.f44444l, "(I)Ljava/lang/Object;", "o", "()Ljava/lang/Object;", "q", "Ll/vii0;", "e", "Ll/vii0;", "getTextFormatter$putong_common_intlGmsRelease", "()Ll/vii0;", "w", "(Ll/vii0;)V", "textFormatter", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "getFormatterBlock$putong_common_intlGmsRelease", "()Lkotlin/jvm/functions/Function1;", BLiveStormDanmakuGiftResourceType.f44446s, "(Lkotlin/jvm/functions/Function1;)V", "formatterBlock", "Ll/l01$a;", "g", "Ll/l01$a;", "getFinishScrollCallback$putong_common_intlGmsRelease", "()Ll/l01$a;", "r", "(Ll/l01$a;)V", "finishScrollCallback", "h", "I", "getSelectedItemPosition$putong_common_intlGmsRelease", "()I", ResourceDirection.f38808v, "(I)V", "selectedItemPosition", "Lkotlin/Function2;", RXScreenCaptureService.KEY_INDEX, "Lkotlin/jvm/functions/Function2;", "getItemIndexerBlock$putong_common_intlGmsRelease", "()Lkotlin/jvm/functions/Function2;", "u", "(Lkotlin/jvm/functions/Function2;)V", "itemIndexerBlock", "Ll/w4q;", "itemIndexer", "Ll/w4q;", "getItemIndexer$putong_common_intlGmsRelease", "()Ll/w4q;", Constants.KEY_T, "(Ll/w4q;)V", "a", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class l01<T> extends ps2<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public vii0 textFormatter;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Function1<Object, String> formatterBlock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public InterfaceC18123a finishScrollCallback;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int selectedItemPosition;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Function2<? super l01<?>, Object, Integer> itemIndexerBlock;

    /* JADX INFO: renamed from: l.l01$a */
    @Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, m87232d2 = {"Ll/l01$a;", "", "", "a", "()V", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18123a {
        /* JADX INFO: renamed from: a */
        void mo79477a();
    }

    public /* synthetic */ l01(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final <V> V m147991l(int position) {
        T tM171098d = m171098d(position);
        if (tM171098d == null) {
            return null;
        }
        return tM171098d;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public String m147992m(@Nullable Object item) {
        String string;
        String strInvoke;
        String strMo174537a;
        vii0 vii0Var = this.textFormatter;
        if (vii0Var != null && (strMo174537a = vii0Var.mo174537a(item)) != null) {
            return strMo174537a;
        }
        Function1<Object, String> function1 = this.formatterBlock;
        if (function1 == null || (strInvoke = function1.invoke(item)) == null) {
            return (item == null || (string = item.toString()) == null) ? "" : string;
        }
        return strInvoke;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public String m147993n(int index) {
        int iM171097c = m171097c();
        if (iM171097c == 0) {
            return "";
        }
        if (!getIsCyclic()) {
            return (index < 0 || index >= iM171097c) ? "" : m147992m(m171098d(index));
        }
        int i = index % iM171097c;
        if (i < 0) {
            i += iM171097c;
        }
        return m147992m(m171098d(i));
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final <V> V m147994o() {
        InterfaceC18123a interfaceC18123a = this.finishScrollCallback;
        if (interfaceC18123a != null) {
            interfaceC18123a.mo79477a();
        }
        return (V) m147991l(this.selectedItemPosition);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: p */
    public final int m147995p(@Nullable Object item, boolean isCompareFormatText) {
        Function2<? super l01<?>, Object, Integer> function2 = this.itemIndexerBlock;
        return function2 != null ? function2.invoke(this, item).intValue() : m147996q(item, isCompareFormatText);
    }

    /* JADX INFO: renamed from: q */
    public final int m147996q(Object item, boolean isCompareFormatText) {
        int size = m171096b().size();
        for (int i = 0; i < size; i++) {
            if (isCompareFormatText) {
                if (Intrinsics.m87488d(m147993n(i), item)) {
                    return i;
                }
            } else {
                if (Intrinsics.m87488d(m171096b().get(i), item)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public final void m147997r(@Nullable InterfaceC18123a interfaceC18123a) {
        this.finishScrollCallback = interfaceC18123a;
    }

    /* JADX INFO: renamed from: s */
    public final void m147998s(@Nullable Function1<Object, String> function1) {
        this.formatterBlock = function1;
    }

    /* JADX INFO: renamed from: u */
    public final void m148000u(@Nullable Function2<? super l01<?>, Object, Integer> function2) {
        this.itemIndexerBlock = function2;
    }

    /* JADX INFO: renamed from: v */
    public final void m148001v(int i) {
        this.selectedItemPosition = i;
    }

    /* JADX INFO: renamed from: w */
    public final void m148002w(@Nullable vii0 vii0Var) {
        this.textFormatter = vii0Var;
    }

    @JvmOverloads
    public l01(@Nullable List<? extends T> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public l01() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: t */
    public final void m147999t(@Nullable w4q w4qVar) {
    }
}
