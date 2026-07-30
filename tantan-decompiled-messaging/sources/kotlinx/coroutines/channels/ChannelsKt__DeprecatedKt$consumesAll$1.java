package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p149l.h5f;
import p149l.vr4;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m87232d2 = {"<anonymous>", "", "cause", "", "invoke"}, m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
final class ChannelsKt__DeprecatedKt$consumesAll$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ReceiveChannel<?>[] $channels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$consumesAll$1(ReceiveChannel<?>[] receiveChannelArr) {
        super(1);
        this.$channels = receiveChannelArr;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) throws Throwable {
        Throwable th2 = null;
        for (ReceiveChannel<?> receiveChannel : this.$channels) {
            try {
                vr4.m199619b(receiveChannel, th);
            } catch (Throwable th3) {
                if (th2 == null) {
                    th2 = th3;
                } else {
                    h5f.m129395a(th2, th3);
                }
            }
        }
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
