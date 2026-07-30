package p153l;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001a\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/byj0;", "", "<init>", "()V", "", "unityObject", "unityMethod", "message", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "eventMapping", "c", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "b", "()Ljava/lang/Class;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/lang/Class;", "unityPlayer", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class byj0 {

    @NotNull
    public static final byj0 INSTANCE = new byj0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = byj0.class.getCanonicalName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static Class<?> unityPlayer;

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m107022a() {
        m107024d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final void m107023c(@Nullable String eventMapping) {
        m107024d("UnityFacebookSDKPlugin", "OnReceiveMapping", eventMapping);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m107024d(@Nullable String unityObject, @Nullable String unityMethod, @Nullable String message) {
        try {
            if (unityPlayer == null) {
                unityPlayer = INSTANCE.m107025b();
            }
            Class<?> cls = unityPlayer;
            Class<?> cls2 = null;
            if (cls == null) {
                Intrinsics.m88391r("unityPlayer");
                cls = null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class<?> cls3 = unityPlayer;
            if (cls3 == null) {
                Intrinsics.m88391r("unityPlayer");
            } else {
                cls2 = cls3;
            }
            method.invoke(cls2, unityObject, unityMethod, message);
        } catch (Exception e) {
            Log.e(TAG, "Failed to send message to Unity", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Class<?> m107025b() {
        return Class.forName("com.unity3d.player.UnityPlayer");
    }
}
