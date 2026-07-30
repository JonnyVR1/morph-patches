package p153l;

import androidx.annotation.CallSuper;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.iam;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\f\b\u0001\u0010\u0004*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/nn2;", "Ll/oo2;", p7f.GPS_DIRECTION_TRUE, "Ll/iam;", p7f.GPS_MEASUREMENT_INTERRUPTED, "Ll/y8s;", "Ll/dum;", BaseSei.INFO, "<init>", "(Ll/dum;)V", "", "show", "", "a4", "(Z)V", "Y3", "", "progress", "Z3", "(ZI)V", "X3", "()V", "b4", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class nn2<T extends oo2, V extends iam<?>> extends y8s<T, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn2(@NotNull dum<T> dumVar) {
        super(dumVar);
        dumVar.getClass();
    }

    /* JADX INFO: renamed from: S3 */
    public static void m163846S3(boolean z, uwl uwlVar) {
        if (uwlVar instanceof nn2) {
            try {
                ((nn2) uwlVar).mo95792Y3(z);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static void m163847T3(nn2 nn2Var) {
        zrv.f205799a.m207683n0(nn2Var.act(), new x20() { // from class: l.mn2
            @Override // p153l.x20
            public final void call() {
                nn2.m163851c4();
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static void m163848U3(boolean z, uwl uwlVar) {
        if (uwlVar instanceof nn2) {
            try {
                ((nn2) uwlVar).mo112749a4(z);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static void m163850W3(boolean z, int i, uwl uwlVar) {
        if (uwlVar instanceof nn2) {
            try {
                ((nn2) uwlVar).mo95793Z3(z, i);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final void m163852X3() {
        m213811F2().ChatEvent.dismissDialog().m199277p();
    }

    @CallSuper
    /* JADX INFO: renamed from: Y3 */
    public void mo95792Y3(final boolean show) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.ln2
            @Override // p153l.y20
            public final void call(Object obj) {
                nn2.m163846S3(show, (uwl) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: Z3 */
    public void mo95793Z3(final boolean show, final int progress) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.kn2
            @Override // p153l.y20
            public final void call(Object obj) {
                nn2.m163850W3(show, progress, (uwl) obj);
            }
        });
    }

    @CallSuper
    /* JADX INFO: renamed from: a4 */
    public void mo112749a4(final boolean show) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.jn2
            @Override // p153l.y20
            public final void call(Object obj) {
                nn2.m163848U3(show, (uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: b4 */
    public void m163853b4() {
        this.f196919f.dialog().m21555t0(R$string.f47559H0, new Runnable() { // from class: l.in2
            @Override // java.lang.Runnable
            public final void run() {
                nn2.m163847T3(this.f115859a);
            }
        }).m21499D(R$string.f47581I0).m21540k0(R$string.f47961a).m21495B(false).m21567z0();
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m163851c4() {
    }
}
