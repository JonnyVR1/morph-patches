package p149l;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.topics.GpsTopicsManager;
import com.facebook.appevents.iap.C1564g;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.p026ml.ModelManager;
import com.facebook.internal.C1656d;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/jw0;", "", "<init>", "()V", "", "a", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class jw0 {

    @NotNull
    public static final jw0 INSTANCE = new jw0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m143584a() {
        if (lsb.m151554d(jw0.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.m8688d(new C17874a());
        } catch (Throwable th) {
            lsb.m151552b(th, jw0.class);
        }
    }

    /* JADX INFO: renamed from: l.jw0$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"l/jw0$a", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "Lcom/facebook/internal/d;", "fetchedAppSettings", "", "a", "(Lcom/facebook/internal/d;)V", "onError", "()V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C17874a implements FetchedAppSettingsManager.InterfaceC1645a {
        /* JADX INFO: renamed from: b */
        public static void m143585b(boolean z) {
            if (z) {
                a43.m94765a();
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m143586c(boolean z) {
            if (z) {
                pv0.m171488b();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m143587d(boolean z) {
            if (z) {
                ProtectedModeManager.m7917b();
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m143588e(boolean z) {
            if (z) {
                the0.m188902a();
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m143589f(boolean z) {
            if (z) {
                yfw.m214583a();
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m143590g(boolean z) {
            if (z) {
                GpsTopicsManager.m7806a();
            }
        }

        /* JADX INFO: renamed from: h */
        public static void m143591h(boolean z) {
            if (z) {
                GpsAraTriggersManager.m7799e();
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m143592i(boolean z) {
            if (z) {
                xlc0.m209868a();
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m143593j(boolean z) {
            if (z) {
                C1564g.m7903a();
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m143594k(boolean z) {
            if (z) {
                d100.m109562b();
            }
        }

        /* JADX INFO: renamed from: l */
        public static void m143595l(boolean z) {
            if (z) {
                gd2.m125530a();
            }
        }

        /* JADX INFO: renamed from: m */
        public static void m143596m(boolean z) {
            if (z) {
                o060.m162124c();
            }
        }

        /* JADX INFO: renamed from: n */
        public static void m143597n(boolean z) {
            if (z) {
                c3f.m105008a();
            }
        }

        /* JADX INFO: renamed from: o */
        public static void m143598o(boolean z) {
            if (z) {
                ModelManager.m7939f();
            }
        }

        /* JADX INFO: renamed from: p */
        public static void m143599p(boolean z) {
            if (z) {
                iwf0.m138742b();
            }
        }

        /* JADX INFO: renamed from: q */
        public static void m143600q(boolean z) {
            if (z) {
                lxc0.m152049a();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC1645a
        /* JADX INFO: renamed from: a */
        public void mo8703a(@Nullable C1656d fetchedAppSettings) {
            FeatureManager.m8676a(FeatureManager.Feature.AAM, new FeatureManager.InterfaceC1642a() { // from class: l.tv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143594k(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.InterfaceC1642a() { // from class: l.gw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143600q(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.PrivacyProtection, new FeatureManager.InterfaceC1642a() { // from class: l.hw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143598o(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.EventDeactivation, new FeatureManager.InterfaceC1642a() { // from class: l.iw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143597n(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.BannedParamFiltering, new FeatureManager.InterfaceC1642a() { // from class: l.uv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143595l(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.IapLogging, new FeatureManager.InterfaceC1642a() { // from class: l.vv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143593j(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.StdParamEnforcement, new FeatureManager.InterfaceC1642a() { // from class: l.wv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143599p(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.ProtectedMode, new FeatureManager.InterfaceC1642a() { // from class: l.xv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143587d(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.MACARuleMatching, new FeatureManager.InterfaceC1642a() { // from class: l.yv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143589f(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.BlocklistEvents, new FeatureManager.InterfaceC1642a() { // from class: l.zv0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143585b(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.FilterRedactedEvents, new FeatureManager.InterfaceC1642a() { // from class: l.aw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143592i(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.FilterSensitiveParams, new FeatureManager.InterfaceC1642a() { // from class: l.bw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143588e(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.CloudBridge, new FeatureManager.InterfaceC1642a() { // from class: l.cw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143586c(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.GPSARATriggers, new FeatureManager.InterfaceC1642a() { // from class: l.dw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143591h(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.GPSPACAProcessing, new FeatureManager.InterfaceC1642a() { // from class: l.ew0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143596m(z);
                }
            });
            FeatureManager.m8676a(FeatureManager.Feature.GPSTopicsObservation, new FeatureManager.InterfaceC1642a() { // from class: l.fw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1642a
                /* JADX INFO: renamed from: a */
                public final void mo8684a(boolean z) {
                    jw0.C17874a.m143590g(z);
                }
            });
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC1645a
        public void onError() {
        }
    }
}
