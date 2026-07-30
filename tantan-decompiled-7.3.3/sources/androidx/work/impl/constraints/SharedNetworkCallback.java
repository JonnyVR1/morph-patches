package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(30)
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR0\u0010\u001f\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011j\u0002`\u0013\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m88121d2 = {"Landroidx/work/impl/constraints/SharedNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/a;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "c", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "", "a", "Ljava/lang/Object;", "requestsLock", "", "b", "Ljava/util/Map;", "requests", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {

    @NotNull
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Object requestsLock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @GuardedBy("requestsLock")
    @NotNull
    public static final Map<Function1<AbstractC0789a, Unit>, NetworkRequest> requests = new LinkedHashMap();

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Function0<Unit> m4579c(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull final Function1<? super AbstractC0789a, Unit> onConstraintState) {
        connManager.getClass();
        networkRequest.getClass();
        onConstraintState.getClass();
        synchronized (requestsLock) {
            try {
                Map<Function1<AbstractC0789a, Unit>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(this);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new Function0<Unit>() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$addCallback$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object obj = SharedNetworkCallback.requestsLock;
                Function1<AbstractC0789a, Unit> function1 = onConstraintState;
                ConnectivityManager connectivityManager = connManager;
                SharedNetworkCallback sharedNetworkCallback = this;
                synchronized (obj) {
                    try {
                        SharedNetworkCallback.requests.remove(function1);
                        if (SharedNetworkCallback.requests.isEmpty()) {
                            qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController unregister shared callback");
                            connectivityManager.unregisterNetworkCallback(sharedNetworkCallback);
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        List<Map.Entry> list;
        network.getClass();
        networkCapabilities.getClass();
        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            list = CollectionsKt.toList(requests.entrySet());
        }
        for (Map.Entry entry : list) {
            ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? AbstractC0789a.a.INSTANCE : new AbstractC0789a.b(7));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        List list;
        network.getClass();
        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            list = CollectionsKt.toList(requests.keySet());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(new AbstractC0789a.b(7));
        }
    }
}
