package p149l;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.InterfaceC15486o;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, m87232d2 = {"Ll/ymq;", "Lkotlinx/coroutines/JobSupport;", "Ll/ln5;", "Lkotlinx/coroutines/o;", "parent", "<init>", "(Lkotlinx/coroutines/o;)V", "", "d1", "()Z", "c", "Z", "n0", "handlesException", "o0", "onCancelComplete", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@PublishedApi
public class ymq extends JobSupport implements ln5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean handlesException;

    public ymq(@Nullable InterfaceC15486o interfaceC15486o) {
        super(true);
        m93704w0(interfaceC15486o);
        this.handlesException = m215377d1();
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m215377d1() {
        JobSupport jobSupportM137157u;
        e35 e35VarM93699q0 = m93699q0();
        f35 f35Var = e35VarM93699q0 instanceof f35 ? (f35) e35VarM93699q0 : null;
        if (f35Var != null && (jobSupportM137157u = f35Var.m137157u()) != null) {
            while (!jobSupportM137157u.getHandlesException()) {
                e35 e35VarM93699q1 = jobSupportM137157u.m93699q0();
                f35 f35Var2 = e35VarM93699q1 instanceof f35 ? (f35) e35VarM93699q1 : null;
                if (f35Var2 == null || (jobSupportM137157u = f35Var2.m137157u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: n0, reason: from getter */
    public boolean getHandlesException() {
        return this.handlesException;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: o0 */
    public boolean mo93697o0() {
        return true;
    }
}
