package com.tencent.liteav.network;

import android.content.Context;
import com.tencent.liteav.basic.datareport.C14189a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.datareport.TXCDRExtInfo;
import com.tencent.liteav.basic.util.C14215f;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.tencent.liteav.network.j */
/* JADX INFO: loaded from: classes2.dex */
public class C14317j {

    /* JADX INFO: renamed from: a */
    private Context f60430a;

    /* JADX INFO: renamed from: b */
    private String f60431b;

    /* JADX INFO: renamed from: c */
    private String f60432c;

    /* JADX INFO: renamed from: d */
    private String f60433d;

    /* JADX INFO: renamed from: e */
    private String f60434e;

    /* JADX INFO: renamed from: f */
    private long f60435f;

    /* JADX INFO: renamed from: g */
    private long f60436g;

    /* JADX INFO: renamed from: h */
    private String f60437h;

    /* JADX INFO: renamed from: i */
    private long f60438i;

    /* JADX INFO: renamed from: j */
    private long f60439j;

    /* JADX INFO: renamed from: k */
    private long f60440k;

    /* JADX INFO: renamed from: l */
    private long f60441l;

    /* JADX INFO: renamed from: m */
    private long f60442m;

    /* JADX INFO: renamed from: n */
    private long f60443n;

    /* JADX INFO: renamed from: o */
    private long f60444o;

    /* JADX INFO: renamed from: p */
    private long f60445p;

    /* JADX INFO: renamed from: q */
    private long f60446q;

    /* JADX INFO: renamed from: r */
    private long f60447r;

    /* JADX INFO: renamed from: s */
    private long f60448s;

    /* JADX INFO: renamed from: t */
    private long f60449t;

    /* JADX INFO: renamed from: u */
    private long f60450u;

    /* JADX INFO: renamed from: v */
    private long f60451v;

    /* JADX INFO: renamed from: w */
    private boolean f60452w = true;

    public C14317j(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f60430a = applicationContext;
        this.f60431b = C14215f.m84229b(applicationContext);
        this.f60433d = "Android";
        C14316i.m84918a().m84923a(this.f60430a);
        m84932a();
    }

    /* JADX INFO: renamed from: c */
    private boolean m84929c(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* JADX INFO: renamed from: e */
    private void m84930e() {
        long j = this.f60445p;
        long j2 = this.f60446q;
        m84932a();
        this.f60443n = j;
        this.f60444o = j2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0117  */
    /* JADX INFO: renamed from: f */
    private void m84931f() {
        long j;
        float f;
        float f2;
        float f3;
        long j2 = 0;
        if (this.f60435f == 0 || m84928b(this.f60431b) || m84928b(this.f60434e)) {
            return;
        }
        String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(this.f60434e);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f60435f;
        long j3 = this.f60445p;
        long j4 = this.f60443n;
        long j5 = j3 > j4 ? j3 - j4 : 0L;
        long j6 = this.f60446q;
        long j7 = this.f60444o;
        long j8 = j6 > j7 ? j6 - j7 : 0L;
        long j9 = this.f60451v;
        if (j9 > 0) {
            j = this.f60447r / j9;
            j2 = this.f60448s / j9;
        } else {
            j = 0;
        }
        String strTxCreateToken = TXCDRApi.txCreateToken();
        TXCDRExtInfo tXCDRExtInfo = new TXCDRExtInfo();
        tXCDRExtInfo.report_common = false;
        tXCDRExtInfo.report_status = false;
        tXCDRExtInfo.url = this.f60434e;
        TXCDRApi.InitEvent(this.f60430a, strTxCreateToken, C14189a.f59134T, C14189a.f59179al, tXCDRExtInfo);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14189a.f59134T, "str_user_id", this.f60431b);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14189a.f59134T, "str_stream_id", streamIDByStreamUrl);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14189a.f59134T, "str_access_id", this.f60432c);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14189a.f59134T, "str_platform", this.f60433d);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_server_type", this.f60436g);
        TXCDRApi.txSetEventValue(strTxCreateToken, C14189a.f59134T, "str_server_addr", this.f60437h);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_dns_timecost", this.f60438i);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_connect_timecost", this.f60439j);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_handshake_timecost", this.f60440k);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_push_type", this.f60441l);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_totaltime", jCurrentTimeMillis);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_block_count", this.f60442m);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_video_drop", j5);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_audio_drop", j8);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_video_que_avg", j);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_audio_que_avg", j2);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_video_que_max", this.f60449t);
        TXCDRApi.txSetEventIntValue(strTxCreateToken, C14189a.f59134T, "u32_audio_que_max", this.f60450u);
        TXCDRApi.nativeReportEvent(strTxCreateToken, C14189a.f59134T);
        if (jCurrentTimeMillis > 0) {
            long j10 = this.f60442m;
            if (j10 == 0) {
                f = 0.0f;
            } else {
                f = (j10 * 60000.0f) / jCurrentTimeMillis;
            }
        } else {
            f = 0.0f;
        }
        long j11 = this.f60451v;
        if (j11 > 0) {
            long j12 = this.f60447r;
            float f4 = j12 == 0 ? 0.0f : j12 / j11;
            long j13 = this.f60448s;
            f3 = j13 != 0 ? j13 / j11 : 0.0f;
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (!this.f60452w || m84928b(this.f60432c) || this.f60440k == -1) {
            return;
        }
        C14316i.m84918a().m84925a(this.f60432c, this.f60436g, jCurrentTimeMillis, this.f60440k, f, f2, f3);
    }

    /* JADX INFO: renamed from: a */
    public void m84937a(boolean z, String str) {
        this.f60437h = str;
        if (z) {
            this.f60436g = 1L;
            return;
        }
        if (str != null) {
            int iIndexOf = str.indexOf(":");
            if (iIndexOf != -1) {
                str = str.substring(0, iIndexOf);
            }
            for (String str2 : str.split("[.]")) {
                if (!m84929c(str2)) {
                    this.f60436g = 3L;
                    return;
                }
            }
            this.f60436g = 2L;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m84939b(long j, long j2) {
        this.f60451v++;
        this.f60447r += j;
        this.f60448s += j2;
        if (j > this.f60449t) {
            this.f60449t = j;
        }
        if (j2 > this.f60450u) {
            this.f60450u = j2;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m84941d() {
        this.f60442m++;
    }

    /* JADX INFO: renamed from: c */
    public void m84940c() {
        m84931f();
        m84930e();
    }

    /* JADX INFO: renamed from: b */
    public void m84938b() {
        this.f60435f = System.currentTimeMillis();
        this.f60432c = C14316i.m84918a().m84926b();
    }

    /* JADX INFO: renamed from: b */
    private boolean m84928b(String str) {
        return str == null || str.length() == 0;
    }

    /* JADX INFO: renamed from: a */
    public void m84936a(boolean z) {
        this.f60441l = z ? 2L : 1L;
        if (z) {
            this.f60452w = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84935a(String str) {
        this.f60434e = str;
    }

    /* JADX INFO: renamed from: a */
    public void m84932a() {
        this.f60432c = "";
        this.f60435f = 0L;
        this.f60436g = -1L;
        this.f60437h = "";
        this.f60438i = -1L;
        this.f60439j = -1L;
        this.f60440k = -1L;
        this.f60441l = -1L;
        this.f60434e = "";
        this.f60442m = 0L;
        this.f60443n = 0L;
        this.f60444o = 0L;
        this.f60445p = 0L;
        this.f60446q = 0L;
        this.f60447r = 0L;
        this.f60448s = 0L;
        this.f60449t = 0L;
        this.f60450u = 0L;
        this.f60451v = 0L;
        this.f60452w = true;
    }

    /* JADX INFO: renamed from: a */
    public void m84934a(long j, long j2, long j3) {
        this.f60438i = j;
        this.f60439j = j2;
        this.f60440k = j3;
    }

    /* JADX INFO: renamed from: a */
    public void m84933a(long j, long j2) {
        this.f60445p = j;
        this.f60446q = j2;
    }
}
