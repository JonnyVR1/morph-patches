package p149l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/vhi0;", "", "<init>", "()V", "", "width", "height", "Ll/ga80;", "rect", "", "array", "a", "(IILl/ga80;[F)[F", "b", "([F)[F", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class vhi0 {

    @NotNull
    public static final vhi0 INSTANCE = new vhi0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final float[] m198463a(int width, int height, @NotNull ga80 rect, @NotNull float[] array) {
        rect.getClass();
        array.getClass();
        float f = width;
        array[0] = rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f;
        float f2 = height;
        array[1] = rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2;
        array[2] = rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f;
        array[3] = (rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2;
        array[4] = (rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f;
        array[5] = rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2;
        array[6] = (rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f;
        array[7] = (rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2;
        return array;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final float[] m198464b(@NotNull float[] array) {
        array.getClass();
        float f = array[0];
        float f2 = array[1];
        array[0] = array[2];
        array[1] = array[3];
        array[2] = array[6];
        array[3] = array[7];
        array[6] = array[4];
        array[7] = array[5];
        array[4] = f;
        array[5] = f2;
        return array;
    }
}
