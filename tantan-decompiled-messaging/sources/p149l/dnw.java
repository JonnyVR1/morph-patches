package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/dnw;", "", "", "shape", "<init>", "([I)V", "", RXScreenCaptureService.KEY_INDEX, "b", "(I)I", "", Constants.INAPP_DATA_TAG, "a", "[I", "I", "capacity", "", "<set-?>", "c", "[F", "()[F", "data", "()I", "shapeSize", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class dnw {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public int[] shape;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int capacity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public float[] data;

    public dnw(@NotNull int[] iArr) {
        iArr.getClass();
        this.shape = iArr;
        int iM112695b = INSTANCE.m112695b(iArr);
        this.capacity = iM112695b;
        this.data = new float[iM112695b];
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b */
    public final int m112691b(int i) {
        return this.shape[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m112692c() {
        return this.shape.length;
    }

    /* JADX INFO: renamed from: d */
    public final void m112693d(@NotNull int[] shape) {
        shape.getClass();
        this.shape = shape;
        int iM112695b = INSTANCE.m112695b(shape);
        float[] fArr = new float[iM112695b];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, iM112695b));
        this.data = fArr;
        this.capacity = iM112695b;
    }

    /* JADX INFO: renamed from: l.dnw$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/dnw$a;", "", "<init>", "()V", "", "shape", "", "b", "([I)I", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m112695b(int[] shape) {
            if (shape.length == 0) {
                qq3.m175877a("Empty array can't be reduced.");
                return 0;
            }
            int i = shape[0];
            IntIterator it = new IntRange(1, ArraysKt.getLastIndex(shape)).iterator();
            while (it.hasNext()) {
                i *= shape[it.nextInt()];
            }
            return i;
        }

        public Companion() {
        }
    }
}
