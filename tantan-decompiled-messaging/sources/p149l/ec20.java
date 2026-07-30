package p149l;

import com.cosmos.photon.push.service.PushService;
import com.immomo.android.network.metrics.NetworkMetricsEventListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/ec20;", "Ll/o3f$b;", "otherFactory", "", "Ll/o3f;", "eventListeners", "<init>", "(Ll/o3f$b;Ljava/util/List;)V", "Ll/sx3;", "call", PushService.COMMAND_CREATE, "(Ll/sx3;)Ll/o3f;", "a", "Ll/o3f$b;", "getOtherFactory", "()Ll/o3f$b;", "b", "Ljava/util/List;", "getEventListeners", "()Ljava/util/List;", "sdk_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class ec20 implements o3f.InterfaceC18833b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final o3f.InterfaceC18833b otherFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final List<o3f> eventListeners;

    public /* synthetic */ ec20(o3f.InterfaceC18833b interfaceC18833b, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC18833b, (i & 2) != 0 ? null : list);
    }

    @Override // p149l.o3f.InterfaceC18833b
    @NotNull
    public o3f create(@NotNull sx3 call) {
        call.getClass();
        o3f.InterfaceC18833b interfaceC18833b = this.otherFactory;
        List<o3f> listEmptyList = this.eventListeners;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new NetworkMetricsEventListener(interfaceC18833b, listEmptyList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ec20(@Nullable o3f.InterfaceC18833b interfaceC18833b, @Nullable List<? extends o3f> list) {
        this.otherFactory = interfaceC18833b;
        this.eventListeners = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ec20() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
