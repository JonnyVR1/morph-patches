package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m88121d2 = {"Ll/u9l0;", "", "<init>", "()V", "", "width", "height", "Ll/mi80;", "rect", "", "array", "a", "(IILl/mi80;[F)[F", "", BaseSei.f14624X, "b", "(F)F", BaseSei.f14625Y, "c", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class u9l0 {

    @NotNull
    public static final u9l0 INSTANCE = new u9l0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final float[] m195103a(int width, int height, @NotNull mi80 rect, @NotNull float[] array) {
        rect.getClass();
        array.getClass();
        float f = width;
        array[0] = m195104b(rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f);
        float f2 = height;
        array[1] = m195105c(rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2);
        array[2] = m195104b(rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() / f);
        array[3] = m195105c((rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2);
        array[4] = m195104b((rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f);
        array[5] = m195105c(rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() / f2);
        array[6] = m195104b((rect.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + rect.getW()) / f);
        array[7] = m195105c((rect.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + rect.getH()) / f2);
        return array;
    }

    /* JADX INFO: renamed from: b */
    public final float m195104b(float x) {
        return (x * 2.0f) - 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public final float m195105c(float y) {
        return (((y * 2.0f) - 2.0f) * (-1.0f)) - 1.0f;
    }
}
