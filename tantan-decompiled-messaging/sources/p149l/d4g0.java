package p149l;

import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Ll/d4g0;", "Ll/gvf0;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "<init>", "(I)V", "delta", "", "X", "(I)Z", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class d4g0 extends SharedFlowImpl<Integer> implements gvf0<Integer> {
    public d4g0(int i) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, BufferOverflow.DROP_OLDEST);
        mo94148c(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: X */
    public final boolean m109985X(int delta) {
        boolean zMo94148c;
        synchronized (this) {
            zMo94148c = mo94148c(Integer.valueOf(m94133K().intValue() + delta));
        }
        return zMo94148c;
    }
}
