package p153l;

import kotlin.Metadata;
import kotlinx.coroutines.channels.ReceiveChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, m88121d2 = {"Ll/fs4;", "E", "Ll/sme0;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "g0", "a", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public interface fs4<E> extends sme0<E>, ReceiveChannel<E> {

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f100523a;

    /* JADX INFO: renamed from: l.fs4$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m88121d2 = {"Ll/fs4$a;", "", "<init>", "()V", "", "b", "I", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f100523a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int CHANNEL_DEFAULT_CAPACITY = bqh0.m105935b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        /* JADX INFO: renamed from: a */
        public final int m127023a() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
