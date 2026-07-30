package p153l;

import androidx.annotation.RestrictTo;
import com.facebook.appevents.gps.ara.GpsAraTriggersManager;
import com.facebook.appevents.gps.topics.GpsTopicsManager;
import com.facebook.appevents.iap.C1587g;
import com.facebook.appevents.integrity.ProtectedModeManager;
import com.facebook.appevents.p027ml.ModelManager;
import com.facebook.internal.C1679d;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/qw0;", "", "<init>", "()V", "", "a", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class qw0 {

    @NotNull
    public static final qw0 INSTANCE = new qw0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m178401a() {
        if (ztb.m221490d(qw0.class)) {
            return;
        }
        try {
            FetchedAppSettingsManager.m8742d(new C19683a());
        } catch (Throwable th) {
            ztb.m221488b(th, qw0.class);
        }
    }

    /* JADX INFO: renamed from: l.qw0$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"l/qw0$a", "Lcom/facebook/internal/FetchedAppSettingsManager$a;", "Lcom/facebook/internal/d;", "fetchedAppSettings", "", "a", "(Lcom/facebook/internal/d;)V", "onError", "()V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C19683a implements FetchedAppSettingsManager.InterfaceC1668a {
        /* JADX INFO: renamed from: b */
        public static void m178402b(boolean z) {
            if (z) {
                q43.m175192a();
            }
        }

        /* JADX INFO: renamed from: c */
        public static void m178403c(boolean z) {
            if (z) {
                wv0.m207983b();
            }
        }

        /* JADX INFO: renamed from: d */
        public static void m178404d(boolean z) {
            if (z) {
                ProtectedModeManager.m7971b();
            }
        }

        /* JADX INFO: renamed from: e */
        public static void m178405e(boolean z) {
            if (z) {
                ype0.m217017a();
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m178406f(boolean z) {
            if (z) {
                whw.m206510a();
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m178407g(boolean z) {
            if (z) {
                GpsTopicsManager.m7860a();
            }
        }

        /* JADX INFO: renamed from: h */
        public static void m178408h(boolean z) {
            if (z) {
                GpsAraTriggersManager.m7853e();
            }
        }

        /* JADX INFO: renamed from: i */
        public static void m178409i(boolean z) {
            if (z) {
                euc0.m122555a();
            }
        }

        /* JADX INFO: renamed from: j */
        public static void m178410j(boolean z) {
            if (z) {
                C1587g.m7957a();
            }
        }

        /* JADX INFO: renamed from: k */
        public static void m178411k(boolean z) {
            if (z) {
                aa00.m96618b();
            }
        }

        /* JADX INFO: renamed from: l */
        public static void m178412l(boolean z) {
            if (z) {
                nd2.m162606a();
            }
        }

        /* JADX INFO: renamed from: m */
        public static void m178413m(boolean z) {
            if (z) {
                t860.m189640c();
            }
        }

        /* JADX INFO: renamed from: n */
        public static void m178414n(boolean z) {
            if (z) {
                h4f.m133564a();
            }
        }

        /* JADX INFO: renamed from: o */
        public static void m178415o(boolean z) {
            if (z) {
                ModelManager.m7993f();
            }
        }

        /* JADX INFO: renamed from: p */
        public static void m178416p(boolean z) {
            if (z) {
                s4g0.m184551b();
            }
        }

        /* JADX INFO: renamed from: q */
        public static void m178417q(boolean z) {
            if (z) {
                o5d0.m166099a();
            }
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC1668a
        /* JADX INFO: renamed from: a */
        public void mo8757a(@Nullable C1679d fetchedAppSettings) {
            FeatureManager.m8730a(FeatureManager.Feature.AAM, new FeatureManager.InterfaceC1665a() { // from class: l.aw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178411k(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.RestrictiveDataFiltering, new FeatureManager.InterfaceC1665a() { // from class: l.nw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178417q(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.PrivacyProtection, new FeatureManager.InterfaceC1665a() { // from class: l.ow0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178415o(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.EventDeactivation, new FeatureManager.InterfaceC1665a() { // from class: l.pw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178414n(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.BannedParamFiltering, new FeatureManager.InterfaceC1665a() { // from class: l.bw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178412l(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.IapLogging, new FeatureManager.InterfaceC1665a() { // from class: l.cw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178410j(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.StdParamEnforcement, new FeatureManager.InterfaceC1665a() { // from class: l.dw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178416p(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.ProtectedMode, new FeatureManager.InterfaceC1665a() { // from class: l.ew0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178404d(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.MACARuleMatching, new FeatureManager.InterfaceC1665a() { // from class: l.fw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178406f(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.BlocklistEvents, new FeatureManager.InterfaceC1665a() { // from class: l.gw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178402b(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.FilterRedactedEvents, new FeatureManager.InterfaceC1665a() { // from class: l.hw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178409i(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.FilterSensitiveParams, new FeatureManager.InterfaceC1665a() { // from class: l.iw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178405e(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.CloudBridge, new FeatureManager.InterfaceC1665a() { // from class: l.jw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178403c(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.GPSARATriggers, new FeatureManager.InterfaceC1665a() { // from class: l.kw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178408h(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.GPSPACAProcessing, new FeatureManager.InterfaceC1665a() { // from class: l.lw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178413m(z);
                }
            });
            FeatureManager.m8730a(FeatureManager.Feature.GPSTopicsObservation, new FeatureManager.InterfaceC1665a() { // from class: l.mw0
                @Override // com.facebook.internal.FeatureManager.InterfaceC1665a
                /* JADX INFO: renamed from: a */
                public final void mo8738a(boolean z) {
                    qw0.C19683a.m178407g(z);
                }
            });
        }

        @Override // com.facebook.internal.FetchedAppSettingsManager.InterfaceC1668a
        public void onError() {
        }
    }
}
