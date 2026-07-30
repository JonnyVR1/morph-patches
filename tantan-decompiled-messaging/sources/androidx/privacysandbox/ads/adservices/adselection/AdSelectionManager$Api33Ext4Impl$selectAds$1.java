package androidx.privacysandbox.ads.adservices.adselection;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
@DebugMetadata(m87373c = "androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl", m87374f = "AdSelectionManager.kt", m87375l = {EACTags.TAG_LIST}, m87376m = "selectAds")
final class AdSelectionManager$Api33Ext4Impl$selectAds$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC0525a.a this$0;

    public AdSelectionManager$Api33Ext4Impl$selectAds$1(AbstractC0525a.a aVar, Continuation<? super AdSelectionManager$Api33Ext4Impl$selectAds$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
