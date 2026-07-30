package p149l;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m87232d2 = {"Ll/xum;", "", "<init>", "()V", "Ll/xum$a;", "callback", "", Constants.INAPP_DATA_TAG, "(Ll/xum$a;)V", "c", "e", "", "b", "()Z", "isUpdated", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class xum {

    @NotNull
    public static final xum INSTANCE = new xum();

    /* JADX INFO: renamed from: l.xum$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ll/xum$a;", "", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "a", "(Ljava/lang/String;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface InterfaceC21222a {
        /* JADX INFO: renamed from: a */
        void mo7770a(@Nullable String s);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m211142d(@NotNull InterfaceC21222a callback) {
        callback.getClass();
        xum xumVar = INSTANCE;
        if (xumVar.m211143b()) {
            return;
        }
        xumVar.m211144c(callback);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m211143b() {
        return C1577c.m8047l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* JADX INFO: renamed from: c */
    public final void m211144c(InterfaceC21222a callback) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(C1577c.m8047l()).build();
        try {
            installReferrerClientBuild.startConnection(new C21223b(installReferrerClientBuild, callback));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m211145e() {
        C1577c.m8047l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    /* JADX INFO: renamed from: l.xum$b */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/xum$b", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "", "responseCode", "", "onInstallReferrerSetupFinished", "(I)V", "onInstallReferrerServiceDisconnected", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C21223b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstallReferrerClient f194529a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC21222a f194530b;

        public C21223b(InstallReferrerClient installReferrerClient, InterfaceC21222a interfaceC21222a) {
            this.f194529a = installReferrerClient;
            this.f194530b = interfaceC21222a;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int responseCode) {
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                if (responseCode == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f194529a.getInstallReferrer();
                        installReferrer.getClass();
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (StringsKt.m93412P(installReferrer2, "fb", false, 2, null) || StringsKt.m93412P(installReferrer2, "facebook", false, 2, null))) {
                            this.f194530b.mo7770a(installReferrer2);
                        }
                        xum.INSTANCE.m211145e();
                    } catch (RemoteException | Exception unused) {
                        return;
                    }
                } else if (responseCode == 2) {
                    xum.INSTANCE.m211145e();
                }
                this.f194529a.endConnection();
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
