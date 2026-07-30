package p149l;

import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class ad20 implements c2m<NetworkTrackInfo> {

    /* JADX INFO: renamed from: d */
    public static volatile ad20 f68901d;

    /* JADX INFO: renamed from: a */
    public hwx f68902a;

    /* JADX INFO: renamed from: b */
    public nt0 f68903b;

    /* JADX INFO: renamed from: c */
    public C21276y1 f68904c;

    /* JADX INFO: renamed from: l.ad20$a */
    public static /* synthetic */ class C15583a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f68905a;

        static {
            int[] iArr = new int[NetworkTrackInfo.ReportType.values().length];
            f68905a = iArr;
            try {
                iArr[NetworkTrackInfo.ReportType.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68905a[NetworkTrackInfo.ReportType.API.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68905a[NetworkTrackInfo.ReportType.AV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static ad20 m95853b() {
        if (f68901d == null) {
            synchronized (ad20.class) {
                try {
                    if (f68901d == null) {
                        f68901d = new ad20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f68901d;
    }

    /* JADX INFO: renamed from: c */
    public final c2m<NetworkTrackInfo> m95855c(NetworkTrackInfo networkTrackInfo) {
        c2m<NetworkTrackInfo> c2mVar;
        NetworkTrackInfo.ReportType reportType = networkTrackInfo.getReportType();
        synchronized (this) {
            try {
                int i = C15583a.f68905a[reportType.ordinal()];
                if (i == 1) {
                    if (this.f68902a == null) {
                        this.f68902a = new hwx();
                    }
                    c2mVar = this.f68902a;
                } else if (i == 2) {
                    if (this.f68903b == null) {
                        this.f68903b = new nt0();
                    }
                    c2mVar = this.f68903b;
                } else if (i != 3) {
                    c2mVar = null;
                } else {
                    if (this.f68904c == null) {
                        this.f68904c = new C21276y1();
                    }
                    c2mVar = this.f68904c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2mVar;
    }

    @Override // p149l.c2m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo95854a(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null) {
            return;
        }
        du2.m113670a("[common][network]", "NetworkTrackReporter report " + networkTrackInfo);
        c2m<NetworkTrackInfo> c2mVarM95855c = m95855c(networkTrackInfo);
        if (c2mVarM95855c != null) {
            c2mVarM95855c.mo95854a(networkTrackInfo);
        }
    }
}
