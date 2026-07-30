package com.tencent.liteav.network;

import android.content.Context;
import com.tencent.liteav.basic.datareport.C14026a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.util.C14052f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.liteav.network.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14154j {

    /* JADX INFO: renamed from: a */
    private Context f59582a;

    /* JADX INFO: renamed from: b */
    private String f59583b;

    /* JADX INFO: renamed from: c */
    private String f59584c;

    /* JADX INFO: renamed from: d */
    private String f59585d;

    /* JADX INFO: renamed from: e */
    private String f59586e;

    /* JADX INFO: renamed from: f */
    private long f59587f;

    /* JADX INFO: renamed from: g */
    private long f59588g;

    /* JADX INFO: renamed from: h */
    private String f59589h;

    /* JADX INFO: renamed from: i */
    private long f59590i;

    /* JADX INFO: renamed from: j */
    private long f59591j;

    /* JADX INFO: renamed from: k */
    private long f59592k;

    /* JADX INFO: renamed from: l */
    private long f59593l;

    /* JADX INFO: renamed from: m */
    private long f59594m;

    /* JADX INFO: renamed from: n */
    private long f59595n;

    /* JADX INFO: renamed from: o */
    private long f59596o;

    /* JADX INFO: renamed from: p */
    private long f59597p;

    /* JADX INFO: renamed from: q */
    private long f59598q;

    /* JADX INFO: renamed from: r */
    private long f59599r;

    /* JADX INFO: renamed from: s */
    private long f59600s;

    /* JADX INFO: renamed from: t */
    private long f59601t;

    /* JADX INFO: renamed from: u */
    private long f59602u;

    /* JADX INFO: renamed from: v */
    private long f59603v;

    /* JADX INFO: renamed from: w */
    private boolean f59604w = true;

    public C14154j(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f59582a = applicationContext;
        this.f59583b = C14052f.m83046b(applicationContext);
        this.f59585d = "Android";
        C14153i.m83735a().m83740a(this.f59582a);
        m83749a();
    }

    /* JADX INFO: renamed from: c */
    private boolean m83746c(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX INFO: renamed from: e */
    private void m83747e() {
        long j = this.f59597p;
        long j2 = this.f59598q;
        m83749a();
        this.f59595n = j;
        this.f59596o = j2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0117  */
    /* JADX INFO: renamed from: f */
    private void m83748f() {
        long j;
        float f;
        float f2;
        float f3;
        long j2 = 0;
        if (this.f59587f == 0 || m83745b(this.f59583b) || m83745b(this.f59586e)) {
            return;
        }
        String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(this.f59586e);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f59587f;
        long j3 = this.f59597p;
        long j4 = this.f59595n;
        long j5 = j3 > j4 ? j3 - j4 : 0L;
        long j6 = this.f59598q;
        long j7 = this.f59596o;
        long j8 = j6 > j7 ? j6 - j7 : 0L;
        long j9 = this.f59603v;
        if (j9 > 0) {
            j = this.f59599r / j9;
            j2 = this.f59600s / j9;
        } else {
            j = 0;
        }
        String strTxCreateToken = TXCDRApi.txCreateToken();
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.f59586e;
        TXCDRApi.InitEvent(this.f59582a, strTxCreateToken, C14026a.f58286T, C14026a.f58331al, tXCDRExtInfo);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14026a.f58286T, "str_user_id", this.f59583b);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14026a.f58286T, "str_stream_id", streamIDByStreamUrl);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14026a.f58286T, "str_access_id", this.f59584c);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14026a.f58286T, "str_platform", this.f59585d);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_server_type", this.f59588g);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14026a.f58286T, "str_server_addr", this.f59589h);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_dns_timecost", this.f59590i);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_connect_timecost", this.f59591j);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_handshake_timecost", this.f59592k);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_push_type", this.f59593l);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_totaltime", jCurrentTimeMillis);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_block_count", this.f59594m);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_video_drop", j5);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_audio_drop", j8);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_video_que_avg", j);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_audio_que_avg", j2);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_video_que_max", this.f59601t);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14026a.f58286T, "u32_audio_que_max", this.f59602u);
        TXCDRApi.nativeReportEvent(strTxCreateToken, C14026a.f58286T);
        if (jCurrentTimeMillis > 0) {
            long j10 = this.f59594m;
            if (j10 == 0) {
                f = 0.0f;
            } else {
                f = (j10 * 60000.0f) / jCurrentTimeMillis;
            }
        } else {
            f = 0.0f;
        }
        long j11 = this.f59603v;
        if (j11 > 0) {
            long j12 = this.f59599r;
            float f4 = j12 == 0 ? 0.0f : j12 / j11;
            long j13 = this.f59600s;
            f3 = j13 != 0 ? j13 / j11 : 0.0f;
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (!this.f59604w || m83745b(this.f59584c) || this.f59592k == -1) {
            return;
        }
        C14153i.m83735a().m83742a(this.f59584c, this.f59588g, jCurrentTimeMillis, this.f59592k, f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public void m83754a(boolean z, String str) {
        this.f59589h = str;
        if (z) {
            this.f59588g = 1L;
            return;
        }
        if (str != null) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            for (String str2 : str.split("[.]")) {
                if (!m83746c(str2)) {
                    this.f59588g = 3L;
                    return;
                }
            }
            this.f59588g = 2L;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83756b(long j, long j2) {
        this.f59603v++;
        this.f59599r += j;
        this.f59600s += j2;
        if (j > this.f59601t) {
            this.f59601t = j;
        }
        if (j2 > this.f59602u) {
            this.f59602u = j2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m83758d() {
        this.f59594m++;
    }

    /* JADX INFO: renamed from: c */
    public void m83757c() {
        m83748f();
        m83747e();
    }

    /* JADX INFO: renamed from: b */
    public void m83755b() {
        this.f59587f = System.currentTimeMillis();
        this.f59584c = C14153i.m83735a().m83743b();
    }

    /* JADX INFO: renamed from: b */
    private boolean m83745b(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public void m83753a(boolean z) {
        this.f59593l = z ? 2L : 1L;
        if (z) {
            this.f59604w = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83752a(String str) {
        this.f59586e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m83749a() {
        this.f59584c = "";
        this.f59587f = 0L;
        this.f59588g = -1L;
        this.f59589h = "";
        this.f59590i = -1L;
        this.f59591j = -1L;
        this.f59592k = -1L;
        this.f59593l = -1L;
        this.f59586e = "";
        this.f59594m = 0L;
        this.f59595n = 0L;
        this.f59596o = 0L;
        this.f59597p = 0L;
        this.f59598q = 0L;
        this.f59599r = 0L;
        this.f59600s = 0L;
        this.f59601t = 0L;
        this.f59602u = 0L;
        this.f59603v = 0L;
        this.f59604w = true;
    }

    /* JADX INFO: renamed from: a */
    public void m83751a(long j, long j2, long j3) {
        this.f59590i = j;
        this.f59591j = j2;
        this.f59592k = j3;
    }

    /* JADX INFO: renamed from: a */
    public void m83750a(long j, long j2) {
        this.f59597p = j;
        this.f59598q = j2;
    }
}
