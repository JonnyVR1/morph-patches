package p153l;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
@Metadata(m88120d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001\u0017B\u001b\b\u0016\u0012\u0010\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0011\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\nJ\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006*"}, m88121d2 = {"Ll/x2j;", "Ll/k2d0;", "", "listenersToAdd", "<init>", "(Ljava/util/Set;)V", "Ll/yk90;", "producerContext", "", "b", "(Ll/yk90;)V", "", "producerName", Constants.INAPP_DATA_TAG, "(Ll/yk90;Ljava/lang/String;)V", "", "extraMap", "f", "(Ll/yk90;Ljava/lang/String;Ljava/util/Map;)V", "", Constants.KEY_T, RXScreenCaptureService.KEY_INDEX, "(Ll/yk90;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/Map;)V", "a", "producerEventName", "j", "(Ll/yk90;Ljava/lang/String;Ljava/lang/String;)V", "", "successful", "e", "(Ll/yk90;Ljava/lang/String;Z)V", "c", "throwable", "g", "(Ll/yk90;Ljava/lang/Throwable;)V", "h", "k", "(Ll/yk90;Ljava/lang/String;)Z", "", "Ljava/util/List;", "requestListeners", "Companion", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class x2j implements k2d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<k2d0> requestListeners;

    public x2j(@Nullable Set<? extends k2d0> set) {
        if (set == null) {
            this.requestListeners = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.requestListeners = arrayList;
        CollectionsKt.filterNotNullTo(set, arrayList);
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: a */
    public void mo110443a(@Nullable yk90 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110443a(producerContext, producerName, extraMap);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: b */
    public void mo101485b(@NotNull yk90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo101485b(producerContext);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onRequestStart", e);
            }
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: c */
    public void mo101486c(@NotNull yk90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo101486c(producerContext);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: d */
    public void mo110444d(@NotNull yk90 producerContext, @NotNull String producerName) {
        producerContext.getClass();
        producerName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110444d(producerContext, producerName);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: e */
    public void mo110445e(@NotNull yk90 producerContext, @NotNull String producerName, boolean successful) {
        producerContext.getClass();
        producerName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110445e(producerContext, producerName, successful);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: f */
    public void mo110446f(@Nullable yk90 producerContext, @Nullable String producerName, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110446f(producerContext, producerName, extraMap);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: g */
    public void mo101487g(@NotNull yk90 producerContext, @NotNull Throwable throwable) {
        producerContext.getClass();
        throwable.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo101487g(producerContext, throwable);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // p153l.k2d0
    /* JADX INFO: renamed from: h */
    public void mo101488h(@NotNull yk90 producerContext) {
        producerContext.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo101488h(producerContext);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: i */
    public void mo110447i(@Nullable yk90 producerContext, @Nullable String producerName, @Nullable Throwable t, @Nullable Map<String, String> extraMap) {
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110447i(producerContext, producerName, t, extraMap);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: j */
    public void mo110448j(@NotNull yk90 producerContext, @NotNull String producerName, @NotNull String producerEventName) {
        producerContext.getClass();
        producerName.getClass();
        producerEventName.getClass();
        Iterator<T> it = this.requestListeners.iterator();
        while (it.hasNext()) {
            try {
                ((k2d0) it.next()).mo110448j(producerContext, producerName, producerEventName);
            } catch (Exception e) {
                huf.m137181i("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // p153l.cl90
    /* JADX INFO: renamed from: k */
    public boolean mo110449k(@NotNull yk90 producerContext, @NotNull String producerName) {
        producerContext.getClass();
        producerName.getClass();
        List<k2d0> list = this.requestListeners;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((k2d0) it.next()).mo110449k(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }
}
