package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0005R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0019"}, m88121d2 = {"Ll/bqw;", "", "", "shape", "<init>", "([I)V", "", RXScreenCaptureService.KEY_INDEX, "b", "(I)I", "", Constants.INAPP_DATA_TAG, "a", "[I", "I", "capacity", "", "<set-?>", "c", "[F", "()[F", "data", "()I", "shapeSize", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class bqw {

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

    public bqw(@NotNull int[] iArr) {
        iArr.getClass();
        this.shape = iArr;
        int iM106014b = INSTANCE.m106014b(iArr);
        this.capacity = iM106014b;
        this.data = new float[iM106014b];
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final float[] getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b */
    public final int m106010b(int i) {
        return this.shape[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m106011c() {
        return this.shape.length;
    }

    /* JADX INFO: renamed from: d */
    public final void m106012d(@NotNull int[] shape) {
        shape.getClass();
        this.shape = shape;
        int iM106014b = INSTANCE.m106014b(shape);
        float[] fArr = new float[iM106014b];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, iM106014b));
        this.data = fArr;
        this.capacity = iM106014b;
    }

    /* JADX INFO: renamed from: l.bqw$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/bqw$a;", "", "<init>", "()V", "", "shape", "", "b", "([I)I", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final int m106014b(int[] shape) {
            if (shape.length == 0) {
                pr3.m173429a("Empty array can't be reduced.");
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
