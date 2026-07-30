package p149l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0005\b\u0016\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\tJ+\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J+\u0010\u0018\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010!¨\u0006%"}, m87232d2 = {"Ll/szi;", "I", "Ll/di2;", "<init>", "()V", "Ll/p26;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "k", "(Ll/p26;)V", "m", "", "id", "", "callerContext", "Ll/p26$a;", "extras", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ljava/lang/Object;Ll/p26$a;)V", "imageInfo", "extraData", "h", "", "throwable", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/Throwable;Ll/p26$a;)V", "j", "(Ljava/lang/String;Ll/p26$a;)V", "b", "(Ljava/lang/String;Ljava/lang/Object;)V", "e", "(Ljava/lang/String;)V", "", "Ljava/util/List;", "listeners", "Companion", "a", "ui-common_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public class szi<I> extends di2<I> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<p26<I>> listeners = new ArrayList(2);

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: b */
    public void mo111857b(@NotNull String id, @Nullable I imageInfo) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111857b(id, imageInfo);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: d */
    public void mo111858d(@NotNull String id, @Nullable Throwable throwable, @Nullable p26.C19111a extras) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111858d(id, throwable, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: e */
    public void mo111859e(@NotNull String id) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111859e(id);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: h */
    public void mo111860h(@NotNull String id, @Nullable I imageInfo, @Nullable p26.C19111a extraData) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111860h(id, imageInfo, extraData);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: i */
    public void mo111861i(@NotNull String id, @Nullable Object callerContext, @Nullable p26.C19111a extras) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111861i(id, callerContext, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // p149l.di2, p149l.p26
    /* JADX INFO: renamed from: j */
    public void mo111862j(@NotNull String id, @Nullable p26.C19111a extras) {
        id.getClass();
        int size = this.listeners.size();
        for (int i = 0; i < size; i++) {
            try {
                try {
                    this.listeners.get(i).mo111862j(id, extras);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m186794k(@NotNull p26<I> listener) {
        listener.getClass();
        this.listeners.add(listener);
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m186795m(@NotNull p26<I> listener) {
        listener.getClass();
        this.listeners.remove(listener);
    }
}
