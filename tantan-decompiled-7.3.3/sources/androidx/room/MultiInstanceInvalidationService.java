package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.facebook.AuthenticationTokenClaims;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "maxClientId", "I", "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "", "", "clientNames", "Ljava/util/Map;", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "Landroid/os/RemoteCallbackList;", "Landroidx/room/c;", "callbackList", "Landroid/os/RemoteCallbackList;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "Landroidx/room/d$a;", "binder", "Landroidx/room/d$a;", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;

    @NotNull
    private final Map<Integer, String> clientNames = new LinkedHashMap();

    @NotNull
    private final RemoteCallbackList<InterfaceC0668c> callbackList = new RemoteCallbackListC0656b();

    @NotNull
    private final InterfaceC0669d.a binder = new BinderC0655a();

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$a */
    @Metadata(m88120d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"androidx/room/MultiInstanceInvalidationService$a", "Landroidx/room/d$a;", "Landroidx/room/c;", "callback", "", AuthenticationTokenClaims.JSON_KEY_NAME, "", "S6", "(Landroidx/room/c;Ljava/lang/String;)I", "clientId", "", "k8", "(Landroidx/room/c;I)V", "", "tables", "h6", "(I[Ljava/lang/String;)V", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class BinderC0655a extends InterfaceC0669d.a {
        public BinderC0655a() {
        }

        @Override // androidx.room.InterfaceC0669d
        /* JADX INFO: renamed from: S6 */
        public int mo3909S6(@NotNull InterfaceC0668c callback, @Nullable String name) {
            callback.getClass();
            int i = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList<InterfaceC0668c> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId), name);
                        i = maxClientId;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.InterfaceC0669d
        /* JADX INFO: renamed from: h6 */
        public void mo3910h6(int clientId, @NotNull String[] tables) {
            tables.getClass();
            RemoteCallbackList<InterfaceC0668c> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                try {
                    String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(clientId));
                    if (str == null) {
                        return;
                    }
                    int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                            if (clientId != iIntValue && Intrinsics.m88377d(str, str2)) {
                                try {
                                    ((InterfaceC0668c) multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i)).mo3941J0(tables);
                                } catch (RemoteException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                            throw th;
                        }
                    }
                    multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.room.InterfaceC0669d
        /* JADX INFO: renamed from: k8 */
        public void mo3911k8(@NotNull InterfaceC0668c callback, int clientId) {
            callback.getClass();
            RemoteCallbackList<InterfaceC0668c> callbackList$room_runtime_release = MultiInstanceInvalidationService.this.getCallbackList$room_runtime_release();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList$room_runtime_release) {
                multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
                multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(clientId));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationService$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"androidx/room/MultiInstanceInvalidationService$b", "Landroid/os/RemoteCallbackList;", "Landroidx/room/c;", "callback", "", "cookie", "", "a", "(Landroidx/room/c;Ljava/lang/Object;)V", "room-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class RemoteCallbackListC0656b extends RemoteCallbackList<InterfaceC0668c> {
        public RemoteCallbackListC0656b() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(@NotNull InterfaceC0668c callback, @NotNull Object cookie) {
            callback.getClass();
            cookie.getClass();
            MultiInstanceInvalidationService.this.getClientNames$room_runtime_release().remove((Integer) cookie);
        }
    }

    @NotNull
    public final RemoteCallbackList<InterfaceC0668c> getCallbackList$room_runtime_release() {
        return this.callbackList;
    }

    @NotNull
    public final Map<Integer, String> getClientNames$room_runtime_release() {
        return this.clientNames;
    }

    /* JADX INFO: renamed from: getMaxClientId$room_runtime_release, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent intent) {
        intent.getClass();
        return this.binder;
    }

    public final void setMaxClientId$room_runtime_release(int i) {
        this.maxClientId = i;
    }
}
