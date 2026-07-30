package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import p153l.ixi0;

/* JADX INFO: renamed from: androidx.room.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m88121d2 = {"Landroidx/room/RoomDatabase;", "Lkotlin/coroutines/ContinuationInterceptor;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "b", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/ContinuationInterceptor;)Lkotlin/coroutines/CoroutineContext;", "room-ktx_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
@SourceDebugExtension
public final class C0673h {
    /* JADX INFO: renamed from: b */
    public static final CoroutineContext m3996b(RoomDatabase roomDatabase, ContinuationInterceptor continuationInterceptor) {
        C0676k c0676k = new C0676k(continuationInterceptor);
        return continuationInterceptor.plus(c0676k).plus(ixi0.m142530a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(c0676k))));
    }
}
