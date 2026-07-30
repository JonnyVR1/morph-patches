package p153l;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlinx.coroutines.InterfaceC15593o;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, m88121d2 = {"Ll/xoq;", "Lkotlinx/coroutines/JobSupport;", "Ll/po5;", "Lkotlinx/coroutines/o;", "parent", "<init>", "(Lkotlinx/coroutines/o;)V", "", "d1", "()Z", "c", "Z", "n0", "handlesException", "o0", "onCancelComplete", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@PublishedApi
public class xoq extends JobSupport implements po5 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean handlesException;

    public xoq(@Nullable InterfaceC15593o interfaceC15593o) {
        super(true);
        m94595w0(interfaceC15593o);
        this.handlesException = m212479d1();
    }

    /* JADX INFO: renamed from: d1 */
    public final boolean m212479d1() {
        JobSupport jobSupportM136579u;
        f45 f45VarM94590q0 = m94590q0();
        g45 g45Var = f45VarM94590q0 instanceof g45 ? (g45) f45VarM94590q0 : null;
        if (g45Var != null && (jobSupportM136579u = g45Var.m136579u()) != null) {
            while (!jobSupportM136579u.getHandlesException()) {
                f45 f45VarM94590q1 = jobSupportM136579u.m94590q0();
                g45 g45Var2 = f45VarM94590q1 instanceof g45 ? (g45) f45VarM94590q1 : null;
                if (g45Var2 == null || (jobSupportM136579u = g45Var2.m136579u()) == null) {
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
    public boolean mo94588o0() {
        return true;
    }
}
