package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/cpi0;", "", "Lkotlin/coroutines/CoroutineContext;", "context", "", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "Ll/goi0;", "element", "value", "", "a", "(Ll/goi0;Ljava/lang/Object;)V", "b", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Ll/goi0;", "elements", Constants.INAPP_DATA_TAG, "I", RXScreenCaptureService.KEY_INDEX, "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class cpi0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public final CoroutineContext context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object[] values;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final goi0<Object>[] elements;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int i;

    public cpi0(@NotNull CoroutineContext coroutineContext, int i) {
        this.context = coroutineContext;
        this.values = new Object[i];
        this.elements = new goi0[i];
    }

    /* JADX INFO: renamed from: a */
    public final void m108132a(@NotNull goi0<?> element, @Nullable Object value) {
        Object[] objArr = this.values;
        int i = this.i;
        objArr[i] = value;
        goi0<Object>[] goi0VarArr = this.elements;
        this.i = i + 1;
        element.getClass();
        goi0VarArr[i] = element;
    }

    /* JADX INFO: renamed from: b */
    public final void m108133b(@NotNull CoroutineContext context) {
        int length = this.elements.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            goi0<Object> goi0Var = this.elements[length];
            goi0Var.getClass();
            goi0Var.mo94012e(context, this.values[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
