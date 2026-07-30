package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m87232d2 = {"Ll/p0l0;", "", "<init>", "()V", "", "width", "height", "Ll/ga80;", "rect", "", "array", "a", "(IILl/ga80;[F)[F", "", BaseSei.f13930X, "b", "(F)F", BaseSei.f13931Y, "c", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class p0l0 {

    @NotNull
    public static final p0l0 INSTANCE = new p0l0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final float[] m166989a(int width, int height, @NotNull ga80 rect, @NotNull float[] array) {
        rect.getClass();
        array.getClass();
        float f = width;
        array[0] = m166990b(rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f);
        float f2 = height;
        array[1] = m166991c(rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2);
        array[2] = m166990b(rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f);
        array[3] = m166991c((rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2);
        array[4] = m166990b((rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f);
        array[5] = m166991c(rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2);
        array[6] = m166990b((rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f);
        array[7] = m166991c((rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2);
        return array;
    }

    /* JADX INFO: renamed from: b */
    public final float m166990b(float x) {
        return (x * 2.0f) - 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m166991c(float y) {
        return (((y * 2.0f) - 2.0f) * (-1.0f)) - 1.0f;
    }
}
