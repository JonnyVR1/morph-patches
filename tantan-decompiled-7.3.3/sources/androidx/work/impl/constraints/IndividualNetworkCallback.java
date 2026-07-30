package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import p153l.jj5;
import p153l.qzv;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m88121d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/a;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Lkotlin/jvm/functions/Function1;", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class IndividualNetworkCallback extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Function1<AbstractC0789a, Unit> onConstraintState;

    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Landroidx/work/impl/constraints/IndividualNetworkCallback$Companion;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/a;", "", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "a", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Function0<Unit> m4571a(@NotNull final ConnectivityManager connManager, @NotNull NetworkRequest networkRequest, @NotNull Function1<? super AbstractC0789a, Unit> onConstraintState) {
            connManager.getClass();
            networkRequest.getClass();
            onConstraintState.getClass();
            final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(onConstraintState, null);
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            try {
                qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController register callback");
                jj5.m145016j(connManager, networkRequest, individualNetworkCallback);
                booleanRef.element = true;
            } catch (RuntimeException e) {
                if (!C15493d.m94380w(e.getClass().getName(), "TooManyRequestsException", false, 2, null)) {
                    throw e;
                }
                qzv.m178829e().mo178833b(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController couldn't register callback", e);
                onConstraintState.invoke(new AbstractC0789a.b(7));
            }
            return new Function0<Unit>() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$addCallback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (booleanRef.element) {
                        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController unregister callback");
                        connManager.unregisterNetworkCallback(individualNetworkCallback);
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IndividualNetworkCallback(Function1<? super AbstractC0789a, Unit> function1) {
        this.onConstraintState = function1;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(@NotNull Network network, @NotNull NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.invoke(AbstractC0789a.a.INSTANCE);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(@NotNull Network network) {
        network.getClass();
        qzv.m178829e().mo178832a(WorkConstraintsTrackerKt.f3586a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.invoke(new AbstractC0789a.b(7));
    }

    public /* synthetic */ IndividualNetworkCallback(Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1);
    }
}
