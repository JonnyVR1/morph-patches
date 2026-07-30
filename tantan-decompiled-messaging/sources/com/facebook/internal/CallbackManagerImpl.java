package com.facebook.internal;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.c84;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0003\u000f\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0017"}, m87232d2 = {"Lcom/facebook/internal/CallbackManagerImpl;", "Ll/c84;", "<init>", "()V", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$a;", "callback", "", "c", "(ILcom/facebook/internal/CallbackManagerImpl$a;)V", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(IILandroid/content/Intent;)Z", "", "Ljava/util/Map;", "callbacks", "Companion", "b", "RequestCodeOffset", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class CallbackManagerImpl implements c84 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<Integer, InterfaceC1636a> f6603b = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<Integer, InterfaceC1636a> callbacks = new HashMap();

    @Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, m87232d2 = {"Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET, "", "(Ljava/lang/String;II)V", "toRequestCode", "Login", "Share", "Message", "Like", "GameRequest", "AppGroupCreate", "AppGroupJoin", "AppInvite", "DeviceShare", "GamingFriendFinder", "GamingGroupIntegration", "Referral", "GamingContextCreate", "GamingContextSwitch", "GamingContextChoose", "TournamentShareDialog", "TournamentJoinDialog", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        RequestCodeOffset(int i) {
            this.offset = i;
        }

        public final int toRequestCode() {
            return C1577c.m8053r() + this.offset;
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$a */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/internal/CallbackManagerImpl$a;", "", "", "resultCode", "Landroid/content/Intent;", "data", "", "a", "(ILandroid/content/Intent;)Z", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC1636a {
        /* JADX INFO: renamed from: a */
        boolean mo8663a(int resultCode, @Nullable Intent data);
    }

    /* JADX INFO: renamed from: com.facebook.internal.CallbackManagerImpl$b, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/facebook/internal/CallbackManagerImpl$b;", "", "<init>", "()V", "", "requestCode", "Lcom/facebook/internal/CallbackManagerImpl$a;", "callback", "", "c", "(ILcom/facebook/internal/CallbackManagerImpl$a;)V", "b", "(I)Lcom/facebook/internal/CallbackManagerImpl$a;", "resultCode", "Landroid/content/Intent;", "data", "", Constants.INAPP_DATA_TAG, "(IILandroid/content/Intent;)Z", "", "staticCallbacks", "Ljava/util/Map;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public final synchronized InterfaceC1636a m8665b(int requestCode) {
            return (InterfaceC1636a) CallbackManagerImpl.f6603b.get(Integer.valueOf(requestCode));
        }

        @JvmStatic
        /* JADX INFO: renamed from: c */
        public final synchronized void m8666c(int requestCode, @NotNull InterfaceC1636a callback) {
            callback.getClass();
            if (CallbackManagerImpl.f6603b.containsKey(Integer.valueOf(requestCode))) {
                return;
            }
            CallbackManagerImpl.f6603b.put(Integer.valueOf(requestCode), callback);
        }

        @JvmStatic
        /* JADX INFO: renamed from: d */
        public final boolean m8667d(int requestCode, int resultCode, Intent data) {
            InterfaceC1636a interfaceC1636aM8665b = m8665b(requestCode);
            if (interfaceC1636aM8665b != null) {
                return interfaceC1636aM8665b.mo8663a(resultCode, data);
            }
            return false;
        }

        public Companion() {
        }
    }

    @Override // p149l.c84
    /* JADX INFO: renamed from: a */
    public boolean mo8661a(int requestCode, int resultCode, @Nullable Intent data) {
        InterfaceC1636a interfaceC1636a = this.callbacks.get(Integer.valueOf(requestCode));
        return interfaceC1636a != null ? interfaceC1636a.mo8663a(resultCode, data) : INSTANCE.m8667d(requestCode, resultCode, data);
    }

    /* JADX INFO: renamed from: c */
    public final void m8662c(int requestCode, @NotNull InterfaceC1636a callback) {
        callback.getClass();
        this.callbacks.put(Integer.valueOf(requestCode), callback);
    }
}
