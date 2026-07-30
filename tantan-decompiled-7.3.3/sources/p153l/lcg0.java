package p153l;

import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/lcg0;", "Ll/p3g0;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "<init>", "(I)V", "delta", "", "X", "(I)Z", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class lcg0 extends SharedFlowImpl<Integer> implements p3g0<Integer> {
    public lcg0(int i) {
        super(1, Api.BaseClientBuilder.API_PRIORITY_OTHER, BufferOverflow.DROP_OLDEST);
        mo95041c(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: X */
    public final boolean m153682X(int delta) {
        boolean zMo95041c;
        synchronized (this) {
            zMo95041c = mo95041c(Integer.valueOf(m95026K().intValue() + delta));
        }
        return zMo95041c;
    }
}
