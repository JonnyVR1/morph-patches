package p153l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.C1685a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/cym;", "", "<init>", "()V", "", Constants.INAPP_DATA_TAG, "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class cym {

    @NotNull
    public static final cym INSTANCE = new cym();

    /* JADX INFO: renamed from: a */
    public static void m113203a(boolean z) {
        if (z) {
            k3f.m148012d();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m113204b(boolean z) {
        if (z) {
            utb.INSTANCE.m197982c();
            if (FeatureManager.m8733g(FeatureManager.Feature.CrashShield)) {
                C1685a.m8958b();
                ztb.m221487a();
            }
            if (FeatureManager.m8733g(FeatureManager.Feature.ThreadCheck)) {
                exi0.m123056a();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m113205c(boolean z) {
        if (z) {
            C17365h1.m133204c();
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final void m113206d() {
        if (C1600c.m8105p()) {
            FeatureManager.m8730a(FeatureManager.Feature.CrashReport, new FeatureManager.InterfaceC1665a() { // from class: l.zxm
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    cym.m113204b(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.ErrorReport, new FeatureManager.InterfaceC1665a() { // from class: l.aym
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    cym.m113203a(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.AnrReport, new FeatureManager.InterfaceC1665a() { // from class: l.bym
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    cym.m113205c(z);
                }
            });
        }
    }
}
