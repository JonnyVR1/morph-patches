package p153l;

import androidx.core.app.NotificationCompat;
import com.hellogroup.p036mk.core.utils.globalevent.MKEventManager;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/hcg0;", "Lcom/hellogroup/mk/core/utils/globalevent/MKEventManager$a;", "Ll/g4k$a;", "subscriber", "<init>", "(Ll/g4k$a;)V", "Lcom/hellogroup/mk/core/utils/globalevent/MKEventManager$Event;", NotificationCompat.CATEGORY_EVENT, "", RXScreenCaptureService.KEY_INDEX, "(Lcom/hellogroup/mk/core/utils/globalevent/MKEventManager$Event;)V", "", "o", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ll/g4k$a;", "getSubscriber", "()Ll/g4k$a;", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
final class hcg0 implements MKEventManager.InterfaceC3606a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final g4k.InterfaceC17150a subscriber;

    public hcg0(@Nullable g4k.InterfaceC17150a interfaceC17150a) {
        this.subscriber = interfaceC17150a;
    }

    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && Intrinsics.m88377d(hcg0.class, o.getClass())) {
            g4k.InterfaceC17150a interfaceC17150a = this.subscriber;
            g4k.InterfaceC17150a interfaceC17150a2 = ((hcg0) o).subscriber;
            if (interfaceC17150a != null) {
                return Intrinsics.m88377d(interfaceC17150a, interfaceC17150a2);
            }
            if (interfaceC17150a2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        g4k.InterfaceC17150a interfaceC17150a = this.subscriber;
        if (interfaceC17150a != null) {
            return interfaceC17150a.hashCode();
        }
        return 0;
    }

    @Override // com.hellogroup.p036mk.core.utils.globalevent.MKEventManager.InterfaceC3606a
    /* JADX INFO: renamed from: i */
    public void mo17965i(@NotNull MKEventManager.Event event) {
        event.getClass();
        g4k.InterfaceC17150a interfaceC17150a = this.subscriber;
        if (interfaceC17150a != null) {
            interfaceC17150a.mo17914b(event.m18503f(), event.m18504h());
        }
    }
}
