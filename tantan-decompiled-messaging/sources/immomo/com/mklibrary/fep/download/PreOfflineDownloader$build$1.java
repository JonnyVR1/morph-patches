package immomo.com.mklibrary.fep.download;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0082@¢\u0006\u0004\b\u0007\u0010\b"}, m87232d2 = {"Ll/ppb;", "coroutineScope", "Lkotlin/coroutines/Continuation;", "", "", "continuation", "", "build", "(Ll/ppb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m87233k = 3, m87234mv = {1, 4, 0})
@DebugMetadata(m87373c = "immomo.com.mklibrary.fep.download.PreOfflineDownloader", m87374f = "PreOfflineDownloader.kt", m87375l = {EACTags.TRACK1_APPLICATION}, m87376m = "build")
public final class PreOfflineDownloader$build$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PreOfflineDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreOfflineDownloader$build$1(PreOfflineDownloader preOfflineDownloader, Continuation continuation) {
        super(continuation);
        this.this$0 = preOfflineDownloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m87190d(null, this);
    }
}
