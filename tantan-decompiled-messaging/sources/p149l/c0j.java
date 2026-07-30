package p149l;

import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\nJ\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006*"}, m87232d2 = {"Ll/c0j;", "Ll/huc0;", "", "listenersToAdd", "<init>", "(Ljava/util/Set;)V", "Ll/uc90;", "producerContext", "", "b", "(Ll/uc90;)V", "", "producerName", Constants.INAPP_DATA_TAG, "(Ll/uc90;Ljava/lang/String;)V", "", "extraMap", "f", "(Ll/uc90;Ljava/lang/String;Ljava/util/Map;)V", "", Constants.KEY_T, RXScreenCaptureService.KEY_INDEX, "(Ll/uc90;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "a", "producerEventName", "j", "(Ll/uc90;Ljava/lang/String;Ljava/lang/String;)V", "", "successful", "e", "(Ll/uc90;Ljava/lang/String;Z)V", "c", "throwable", "g", "(Ll/uc90;Ljava/lang/Throwable;)V", "h", "k", "(Ll/uc90;Ljava/lang/String;)Z", "", "Ljava/util/List;", "requestListeners", "Companion", "imagepipeline_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class c0j implements huc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<huc0> requestListeners;

    public c0j(@Nullable Set<? extends huc0> set) {
        if (set == null) {
            this.requestListeners = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.requestListeners = arrayList;
        CollectionsKt.filterNotNullTo(set, arrayList);
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: a */
    public void mo104753a(@Nullable uc90 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104753a(producerContext, producerName, extraMap);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: b */
    public void mo104625b(@NotNull uc90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104625b(producerContext);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: c */
    public void mo104626c(@NotNull uc90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104626c(producerContext);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: d */
    public void mo104754d(@NotNull uc90 producerContext, @NotNull String producerName) {
        producerContext.getClass();
        producerName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104754d(producerContext, producerName);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: e */
    public void mo104755e(@NotNull uc90 producerContext, @NotNull String producerName, boolean successful) {
        producerContext.getClass();
        producerName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104755e(producerContext, producerName, successful);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: f */
    public void mo104756f(@Nullable uc90 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104756f(producerContext, producerName, extraMap);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: g */
    public void mo104627g(@NotNull uc90 producerContext, @NotNull Throwable throwable) {
        producerContext.getClass();
        throwable.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104627g(producerContext, throwable);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // p149l.huc0
    /* JADX INFO: renamed from: h */
    public void mo104628h(@NotNull uc90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104628h(producerContext);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: i */
    public void mo104757i(@Nullable uc90 producerContext, @Nullable String producerName, @Nullable Throwable t, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104757i(producerContext, producerName, t, extraMap);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: j */
    public void mo104758j(@NotNull uc90 producerContext, @NotNull String producerName, @NotNull String producerEventName) {
        producerContext.getClass();
        producerName.getClass();
        producerEventName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((huc0) it.next()).mo104758j(producerContext, producerName, producerEventName);
            } catch (Exception e) {
                tsf.m190543i("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p149l.yc90
    /* JADX INFO: renamed from: k */
    public boolean mo104759k(@NotNull uc90 producerContext, @NotNull String producerName) {
        producerContext.getClass();
        producerName.getClass();
        List<huc0> list = this.requestListeners;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((huc0) it.next()).mo104759k(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }
}
