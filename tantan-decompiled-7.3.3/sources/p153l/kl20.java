package p153l;

import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class kl20 implements v4m<NetworkTrackInfo> {

    /* JADX INFO: renamed from: d */
    public static volatile kl20 f127323d;

    /* JADX INFO: renamed from: a */
    public e5y f127324a;

    /* JADX INFO: renamed from: b */
    public tt0 f127325b;

    /* JADX INFO: renamed from: c */
    public C21488y1 f127326c;

    /* JADX INFO: renamed from: l.kl20$a */
    public static /* synthetic */ class C18204a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f127327a;

        static {
            int[] iArr = new int[NetworkTrackInfo.ReportType.values().length];
            f127327a = iArr;
            try {
                iArr[NetworkTrackInfo.ReportType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f127327a[NetworkTrackInfo.ReportType.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f127327a[NetworkTrackInfo.ReportType.AV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static kl20 m150342b() {
        if (f127323d == null) {
            synchronized (kl20.class) {
                try {
                    if (f127323d == null) {
                        f127323d = new kl20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f127323d;
    }

    /* JADX INFO: renamed from: c */
    public final v4m<NetworkTrackInfo> m150343c(NetworkTrackInfo networkTrackInfo) {
        v4m<NetworkTrackInfo> v4mVar;
        NetworkTrackInfo.ReportType reportType = networkTrackInfo.getReportType();
        synchronized (this) {
            try {
                int i = C18204a.f127327a[reportType.ordinal()];
                if (i == 1) {
                    if (this.f127324a == null) {
                        this.f127324a = new e5y();
                    }
                    v4mVar = this.f127324a;
                } else if (i == 2) {
                    if (this.f127325b == null) {
                        this.f127325b = new tt0();
                    }
                    v4mVar = this.f127325b;
                } else if (i != 3) {
                    v4mVar = null;
                } else {
                    if (this.f127326c == null) {
                        this.f127326c = new C21488y1();
                    }
                    v4mVar = this.f127326c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v4mVar;
    }

    @Override // p153l.v4m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo119562a(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null) {
            return;
        }
        tu2.m192703a("[common][network]", "NetworkTrackReporter report " + networkTrackInfo);
        v4m<NetworkTrackInfo> v4mVarM150343c = m150343c(networkTrackInfo);
        if (v4mVarM150343c != null) {
            v4mVarM150343c.mo119562a(networkTrackInfo);
        }
    }
}
