package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import p149l.hoi0;

/* JADX INFO: renamed from: androidx.room.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Landroidx/room/RoomDatabase;", "Lkotlin/coroutines/ContinuationInterceptor;", "dispatcher", "Lkotlin/coroutines/CoroutineContext;", "b", "(Landroidx/room/RoomDatabase;Lkotlin/coroutines/ContinuationInterceptor;)Lkotlin/coroutines/CoroutineContext;", "room-ktx_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class C0671h {
    /* JADX INFO: renamed from: b */
    public static final CoroutineContext m3994b(RoomDatabase roomDatabase, ContinuationInterceptor continuationInterceptor) {
        C0674k c0674k = new C0674k(continuationInterceptor);
        return continuationInterceptor.plus(c0674k).plus(hoi0.m132222a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(c0674k))));
    }
}
