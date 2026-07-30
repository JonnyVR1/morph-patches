package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\nH&¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001aÀ\u0006\u0003"}, m87232d2 = {"Ll/jzl;", "", "", "isCollapse", "", "Y", "(Z)V", "", "g1", "()I", "Landroid/view/View;", "T1", "()Landroid/view/View;", "e2", "()Z", "isManager", "b0", "G0", BaseSei.f13930X, "Landroid/view/ViewGroup;", "root", "u", "(Landroid/view/ViewGroup;)V", "P1", "f1", "c2", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public interface jzl {
    @NotNull
    /* JADX INFO: renamed from: G0 */
    View mo104849G0();

    /* JADX INFO: renamed from: P1 */
    default int mo104850P1() {
        return x7n0.m207301a();
    }

    @NotNull
    /* JADX INFO: renamed from: T1 */
    View mo104853T1();

    /* JADX INFO: renamed from: Y */
    void mo104856Y(boolean isCollapse);

    /* JADX INFO: renamed from: c2 */
    default int mo104858c2() {
        return 0;
    }

    /* JADX INFO: renamed from: e2 */
    default boolean mo104859e2() {
        return true;
    }

    /* JADX INFO: renamed from: f1 */
    default boolean mo104860f1() {
        return true;
    }

    /* JADX INFO: renamed from: g1 */
    int mo104861g1();

    /* JADX INFO: renamed from: u */
    default void mo104862u(@NotNull ViewGroup root) {
        root.getClass();
        mo104856Y(false);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    View mo104863x();

    /* JADX INFO: renamed from: b0 */
    default void mo104857b0(boolean isManager) {
    }
}
