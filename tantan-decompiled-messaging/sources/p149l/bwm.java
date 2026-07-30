package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C1662a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/bwm;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class bwm {

    @NotNull
    public static final bwm INSTANCE = new bwm();

    /* JADX INFO: renamed from: a */
    public static void m104160a(boolean z) {
        if (z) {
            f2f.m119178d();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m104161b(boolean z) {
        if (z) {
            gsb.INSTANCE.m127789c();
            if (FeatureManager.m8679g(FeatureManager.Feature.CrashShield)) {
                C1662a.m8904b();
                lsb.m151551a();
            }
            if (FeatureManager.m8679g(FeatureManager.Feature.ThreadCheck)) {
                doi0.m112807a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m104162c(boolean z) {
        if (z) {
            C17214h1.m128992c();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m104163d() {
        if (C1577c.m8051p()) {
            FeatureManager.m8676a(FeatureManager.Feature.CrashReport, new FeatureManager.InterfaceC1642a() { // from class: l.yvm
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    bwm.m104161b(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.ErrorReport, new FeatureManager.InterfaceC1642a() { // from class: l.zvm
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    bwm.m104160a(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.AnrReport, new FeatureManager.InterfaceC1642a() { // from class: l.awm
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    bwm.m104162c(z);
                }
            });
        }
    }
}
