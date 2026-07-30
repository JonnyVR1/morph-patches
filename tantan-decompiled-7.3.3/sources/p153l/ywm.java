package p153l;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m88121d2 = {"Ll/ywm;", "", "<init>", "()V", "Ll/ywm$a;", "callback", "", Constants.INAPP_DATA_TAG, "(Ll/ywm$a;)V", "c", "e", "", "b", "()Z", "isUpdated", "a", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ywm {

    @NotNull
    public static final ywm INSTANCE = new ywm();

    /* JADX INFO: renamed from: l.ywm$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/ywm$a;", "", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "a", "(Ljava/lang/String;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC21692a {
        /* JADX INFO: renamed from: a */
        void mo7824a(@Nullable String s);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m217617d(@NotNull InterfaceC21692a callback) {
        callback.getClass();
        ywm ywmVar = INSTANCE;
        if (ywmVar.m217618b()) {
            return;
        }
        ywmVar.m217619c(callback);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m217618b() {
        return C1600c.m8101l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* JADX INFO: renamed from: c */
    public final void m217619c(InterfaceC21692a callback) {
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(C1600c.m8101l()).build();
        try {
            installReferrerClientBuild.startConnection(new C21693b(installReferrerClientBuild, callback));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m217620e() {
        C1600c.m8101l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    /* JADX INFO: renamed from: l.ywm$b */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/ywm$b", "Lcom/android/installreferrer/api/InstallReferrerStateListener;", "", "responseCode", "", "onInstallReferrerSetupFinished", "(I)V", "onInstallReferrerServiceDisconnected", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C21693b implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstallReferrerClient f201845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC21692a f201846b;

        public C21693b(InstallReferrerClient installReferrerClient, InterfaceC21692a interfaceC21692a) {
            this.f201845a = installReferrerClient;
            this.f201846b = interfaceC21692a;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int responseCode) {
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                if (responseCode == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f201845a.getInstallReferrer();
                        installReferrer.getClass();
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (StringsKt.m94303P(installReferrer2, "fb", false, 2, null) || StringsKt.m94303P(installReferrer2, "facebook", false, 2, null))) {
                            this.f201846b.mo7824a(installReferrer2);
                        }
                        ywm.INSTANCE.m217620e();
                    } catch (RemoteException | Exception unused) {
                        return;
                    }
                } else if (responseCode == 2) {
                    ywm.INSTANCE.m217620e();
                }
                this.f201845a.endConnection();
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
