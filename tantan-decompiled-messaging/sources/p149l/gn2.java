package p149l;

import androidx.annotation.CallSuper;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.ho2;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/gn2;", "Ll/ho2;", j6f.GPS_DIRECTION_TRUE, "Ll/s7m;", j6f.GPS_MEASUREMENT_INTERRUPTED, "Ll/x6s;", "Ll/bsm;", BaseSei.INFO, "<init>", "(Ll/bsm;)V", "", "show", "", "a4", "(Z)V", "Y3", "", "progress", "Z3", "(ZI)V", "X3", "()V", "b4", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public class gn2<T extends ho2, V extends s7m<?>> extends x6s<T, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn2(@NotNull bsm<T> bsmVar) {
        super(bsmVar);
        bsmVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m127100S3(boolean z, gul gulVar) {
        if (gulVar instanceof gn2) {
            try {
                ((gn2) gulVar).mo127107Y3(z);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m127101T3(gn2 gn2Var) {
        ypv.f199493a.m199361n0(gn2Var.act(), new d30() { // from class: l.fn2
            @Override // p149l.d30
            public final void call() {
                gn2.m127105c4();
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static void m127102U3(boolean z, gul gulVar) {
        if (gulVar instanceof gn2) {
            try {
                ((gn2) gulVar).mo127109a4(z);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static void m127104W3(boolean z, int i, gul gulVar) {
        if (gulVar instanceof gn2) {
            try {
                ((gn2) gulVar).mo127108Z3(z, i);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m127106X3() {
        m206028F2().ChatEvent.dismissDialog().m172467p();
    }

    @CallSuper
    /* JADX INFO: renamed from: Y3 */
    public void mo127107Y3(final boolean show) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.en2
            @Override // p149l.e30
            public final void call(Object obj) {
                gn2.m127100S3(show, (gul) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: Z3 */
    public void mo127108Z3(final boolean show, final int progress) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.dn2
            @Override // p149l.e30
            public final void call(Object obj) {
                gn2.m127104W3(show, progress, (gul) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: a4 */
    public void mo127109a4(final boolean show) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.cn2
            @Override // p149l.e30
            public final void call(Object obj) {
                gn2.m127102U3(show, (gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public void m127110b4() {
        this.f188513f.dialog().m20556t0(R$string.f46711H0, new Runnable() { // from class: l.bn2
            @Override // java.lang.Runnable
            public final void run() {
                gn2.m127101T3(this.f76364a);
            }
        }).m20500D(R$string.f46733I0).m20541k0(R$string.f47113a).m20496B(false).m20568z0();
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m127105c4() {
    }
}
