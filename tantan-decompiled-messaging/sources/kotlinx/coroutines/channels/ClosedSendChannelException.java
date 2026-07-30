package kotlinx.coroutines.channels;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Lkotlinx/coroutines/channels/ClosedSendChannelException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "message", "", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class ClosedSendChannelException extends IllegalStateException {
    public ClosedSendChannelException(@Nullable String str) {
        super(str);
    }
}
