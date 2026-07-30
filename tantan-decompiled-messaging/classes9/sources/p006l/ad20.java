package p006l;

import com.tantanapp.common.network.NetworkTrackInfo;
import l.du2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ad20 implements c2m<NetworkTrackInfo> {

    /* JADX INFO: renamed from: d */
    public static volatile ad20 f8212d;

    /* JADX INFO: renamed from: a */
    public hwx f8213a;

    /* JADX INFO: renamed from: b */
    public nt0 f8214b;

    /* JADX INFO: renamed from: c */
    public C1458y1 f8215c;

    /* JADX INFO: renamed from: l.ad20$a */
    public static /* synthetic */ class C0502a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8216a;

        static {
            int[] iArr = new int[NetworkTrackInfo.ReportType.values().length];
            f8216a = iArr;
            try {
                iArr[NetworkTrackInfo.ReportType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8216a[NetworkTrackInfo.ReportType.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8216a[NetworkTrackInfo.ReportType.AV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static ad20 m11809b() {
        if (f8212d == null) {
            synchronized (ad20.class) {
                try {
                    if (f8212d == null) {
                        f8212d = new ad20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f8212d;
    }

    /* JADX INFO: renamed from: c */
    public final c2m<NetworkTrackInfo> m11811c(NetworkTrackInfo networkTrackInfo) {
        c2m<NetworkTrackInfo> c2mVar;
        NetworkTrackInfo.ReportType reportType = networkTrackInfo.getReportType();
        synchronized (this) {
            try {
                int i = C0502a.f8216a[reportType.ordinal()];
                if (i == 1) {
                    if (this.f8213a == null) {
                        this.f8213a = new hwx();
                    }
                    c2mVar = this.f8213a;
                } else if (i == 2) {
                    if (this.f8214b == null) {
                        this.f8214b = new nt0();
                    }
                    c2mVar = this.f8214b;
                } else if (i != 3) {
                    c2mVar = null;
                } else {
                    if (this.f8215c == null) {
                        this.f8215c = new C1458y1();
                    }
                    c2mVar = this.f8215c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2mVar;
    }

    @Override // p006l.c2m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo11810a(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null) {
            return;
        }
        du2.a("[common][network]", "NetworkTrackReporter report " + networkTrackInfo);
        c2m<NetworkTrackInfo> c2mVarM11811c = m11811c(networkTrackInfo);
        if (c2mVarM11811c != null) {
            c2mVarM11811c.mo11810a(networkTrackInfo);
        }
    }
}
