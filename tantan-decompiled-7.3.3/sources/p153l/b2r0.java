package p153l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.tencent.ugc.TXRecordCommon;
import com.xiaomi.push.C14885fi;
import com.xiaomi.push.C14928i;
import com.xiaomi.push.EnumC14881ei;
import com.xiaomi.push.service.C15019m;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b2r0 extends u1r0 {

    /* JADX INFO: renamed from: A */
    protected volatile long f74650A;

    /* JADX INFO: renamed from: B */
    private int f74651B;

    /* JADX INFO: renamed from: C */
    private long f74652C;

    /* JADX INFO: renamed from: t */
    protected Exception f74653t;

    /* JADX INFO: renamed from: u */
    protected Socket f74654u;

    /* JADX INFO: renamed from: v */
    String f74655v;

    /* JADX INFO: renamed from: w */
    private String f74656w;

    /* JADX INFO: renamed from: x */
    protected XMPushService f74657x;

    /* JADX INFO: renamed from: y */
    protected volatile long f74658y;

    /* JADX INFO: renamed from: z */
    protected volatile long f74659z;

    /* JADX INFO: renamed from: l.b2r0$c */
    public class RunnableC15907c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f74666a;

        public RunnableC15907c(String str) {
            this.f74666a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            xwq0.m213395a().m213403a(this.f74666a, true);
        }
    }

    public b2r0(XMPushService xMPushService, v1r0 v1r0Var) {
        super(xMPushService, v1r0Var);
        this.f74653t = null;
        this.f74655v = null;
        this.f74658y = 0L;
        this.f74659z = 0L;
        this.f74650A = 0L;
        this.f74652C = 0L;
        this.f74657x = xMPushService;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x019d  */
    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x0225  */
    /* JADX WARN: Code duplicated, block: B:66:0x0227  */
    /* JADX WARN: Code duplicated, block: B:69:0x0240  */
    /* JADX WARN: Code duplicated, block: B:77:0x029f  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0305  */
    /* JADX WARN: Code duplicated, block: B:96:0x0329  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x019f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0227, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x02a1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX INFO: renamed from: L */
    private void m102221L(String str, int i) throws Throwable {
        long j;
        String str2;
        boolean z;
        int iElapsedRealtime;
        int i2;
        Iterator<String> it;
        String str3;
        String str4;
        String str5;
        this.f74653t = null;
        ArrayList<String> arrayList = new ArrayList<>();
        Integer numM169382b = ouq0.m169382b("get bucket for host : " + str);
        numM169382b.intValue();
        swq0 swq0VarM102226H = m102226H(str);
        ouq0.m169392l(numM169382b);
        ?? r10 = 1;
        if (swq0VarM102226H != null) {
            arrayList = swq0VarM102226H.mo188337d(true);
        }
        swq0 swq0VarM213417d = xwq0.m213395a().m213417d(str);
        if (swq0VarM213417d != null) {
            for (String str6 : swq0VarM213417d.mo188337d(true)) {
                if (arrayList.indexOf(str6) == -1) {
                    arrayList.add(str6);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        long j2 = 0;
        this.f74650A = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strM160029e = mtq0.m160029e(this.f74657x);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = arrayList.iterator();
        StringBuilder sb2 = sb;
        String str7 = "";
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                String next = it2.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f177112a += r10;
                i2 = i3 + 1;
                try {
                    try {
                        try {
                            ouq0.m169393m("begin to connect to " + next);
                            this.f74654u = m102225G();
                            this.f74654u.connect(uwq0.m198387c(next, i), TXRecordCommon.AUDIO_SAMPLERATE_8000);
                            ouq0.m169393m("tcp connected");
                            this.f74654u.setTcpNoDelay(r10);
                            this.f74656w = next;
                            mo102227I();
                            swq0 swq0Var = swq0VarM102226H;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            try {
                                this.f177113b = jCurrentTimeMillis2;
                                this.f177122k = strM160029e;
                                if (swq0Var != null) {
                                    Iterator<String> it3 = it2;
                                    sb2 = sb2;
                                    it = it3;
                                    j = 0;
                                    swq0VarM102226H = swq0Var;
                                    str3 = strM160029e;
                                    try {
                                        swq0VarM102226H.m188352s(next, jCurrentTimeMillis2, 0L);
                                    } catch (Exception e) {
                                        e = e;
                                        try {
                                            this.f74653t = e;
                                            ouq0.m169378B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f74653t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str4 = next;
                                            } else {
                                                str4 = str7 + "|" + next;
                                            }
                                            C14928i.m87421h(next, this.f74653t);
                                            if (swq0VarM102226H != null) {
                                                swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                            }
                                            if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                                str2 = str4;
                                                i3 = i2;
                                                z = false;
                                            }
                                            str7 = str4;
                                            StringBuilder sb3 = sb2;
                                            it2 = it;
                                            sb2 = sb3;
                                            strM160029e = str3;
                                            j2 = j;
                                            i3 = i2;
                                            r10 = 1;
                                        } catch (Throwable th) {
                                            th = th;
                                            ouq0.m169378B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f74653t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            C14928i.m87421h(next, this.f74653t);
                                            if (swq0VarM102226H != null) {
                                                swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                            }
                                            if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i3 = i2;
                                            z = false;
                                            xwq0.m213395a().m213415c();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                                                return;
                                            }
                                            if (this.f74652C != j) {
                                                this.f74652C = SystemClock.elapsedRealtime();
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.f74652C = SystemClock.elapsedRealtime();
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new C14885fi(sb2.toString());
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            this.f74653t = new Exception("abnormal exception", th);
                                            ouq0.m169397q(th);
                                            ouq0.m169378B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f74653t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str4 = next;
                                            } else {
                                                str4 = str7 + "|" + next;
                                            }
                                            C14928i.m87421h(next, this.f74653t);
                                            if (swq0VarM102226H != null) {
                                                swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                            }
                                            if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                                str2 = str4;
                                                i3 = i2;
                                                z = false;
                                            }
                                            str7 = str4;
                                            StringBuilder sb4 = sb2;
                                            it2 = it;
                                            sb2 = sb4;
                                            strM160029e = str3;
                                            j2 = j;
                                            i3 = i2;
                                            r10 = 1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str7 = str7;
                                            ouq0.m169378B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f74653t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            C14928i.m87421h(next, this.f74653t);
                                            if (swq0VarM102226H != null) {
                                                swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                            }
                                            if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i3 = i2;
                                            z = false;
                                            xwq0.m213395a().m213415c();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                                                return;
                                            }
                                            if (this.f74652C != j) {
                                                this.f74652C = SystemClock.elapsedRealtime();
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.f74652C = SystemClock.elapsedRealtime();
                                                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new C14885fi(sb2.toString());
                                        }
                                    }
                                } else {
                                    Iterator<String> it4 = it2;
                                    sb2 = sb2;
                                    it = it4;
                                    swq0VarM102226H = swq0Var;
                                    str3 = strM160029e;
                                    j = 0;
                                }
                                this.f74650A = SystemClock.elapsedRealtime();
                                ouq0.m169393m("connected to " + next + " in " + this.f177113b);
                                str2 = str7;
                                i3 = i2;
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                it = it2;
                                swq0VarM102226H = swq0Var;
                                str3 = strM160029e;
                                j = 0;
                                this.f74653t = e;
                                ouq0.m169378B("SMACK: Could not connect to:" + next);
                                sb2.append("SMACK: Could not connect to ");
                                sb2.append(next);
                                sb2.append(" port:");
                                sb2.append(i);
                                sb2.append(" err:");
                                sb2.append(this.f74653t.getClass().getSimpleName());
                                sb2.append(SignParameters.NEW_LINE);
                                if (TextUtils.isEmpty(str7)) {
                                    str4 = next;
                                } else {
                                    str4 = str7 + "|" + next;
                                }
                                C14928i.m87421h(next, this.f74653t);
                                if (swq0VarM102226H != null) {
                                    swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                }
                                if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                    str2 = str4;
                                    i3 = i2;
                                    z = false;
                                    xwq0.m213395a().m213415c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                                        return;
                                    }
                                    if (this.f74652C != j) {
                                        this.f74652C = SystemClock.elapsedRealtime();
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f74652C = SystemClock.elapsedRealtime();
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new C14885fi(sb2.toString());
                                }
                                str7 = str4;
                                StringBuilder sb5 = sb2;
                                it2 = it;
                                sb2 = sb5;
                                strM160029e = str3;
                                j2 = j;
                                i3 = i2;
                                r10 = 1;
                            } catch (Throwable th4) {
                                th = th4;
                                it = it2;
                                swq0VarM102226H = swq0Var;
                                str3 = strM160029e;
                                j = 0;
                                this.f74653t = new Exception("abnormal exception", th);
                                ouq0.m169397q(th);
                                ouq0.m169378B("SMACK: Could not connect to:" + next);
                                sb2.append("SMACK: Could not connect to ");
                                sb2.append(next);
                                sb2.append(" port:");
                                sb2.append(i);
                                sb2.append(" err:");
                                sb2.append(this.f74653t.getClass().getSimpleName());
                                sb2.append(SignParameters.NEW_LINE);
                                if (TextUtils.isEmpty(str7)) {
                                    str4 = next;
                                } else {
                                    str4 = str7 + "|" + next;
                                }
                                C14928i.m87421h(next, this.f74653t);
                                if (swq0VarM102226H != null) {
                                    swq0VarM102226H.m188353t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f74653t);
                                }
                                if (!TextUtils.equals(str3, mtq0.m160029e(this.f74657x))) {
                                    str2 = str4;
                                    i3 = i2;
                                    z = false;
                                    xwq0.m213395a().m213415c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                                        return;
                                    }
                                    if (this.f74652C != j) {
                                        this.f74652C = SystemClock.elapsedRealtime();
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f74652C = SystemClock.elapsedRealtime();
                                        C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new C14885fi(sb2.toString());
                                }
                                str7 = str4;
                                StringBuilder sb6 = sb2;
                                it2 = it;
                                sb2 = sb6;
                                strM160029e = str3;
                                j2 = j;
                                i3 = i2;
                                r10 = 1;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            it = it2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        Iterator<String> it5 = it2;
                        sb2 = sb2;
                        it = it5;
                        str3 = strM160029e;
                        j = 0;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    it = it2;
                }
                xwq0.m213395a().m213415c();
                iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (!z) {
                    C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                    return;
                }
                if (this.f74652C != j || SystemClock.elapsedRealtime() - this.f74652C > 480000) {
                    this.f74652C = SystemClock.elapsedRealtime();
                    C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
                }
                throw new C14885fi(sb2.toString());
            }
            sb2 = sb2;
            j = j2;
            str2 = str7;
            z = false;
            xwq0.m213395a().m213415c();
            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (!z) {
                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_SUCCESS.m86699a(), iElapsedRealtime, str2, i3);
                return;
            }
            if (this.f74652C != j) {
                this.f74652C = SystemClock.elapsedRealtime();
                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
            } else {
                this.f74652C = SystemClock.elapsedRealtime();
                C14928i.m87417d(0, EnumC14881ei.BATCH_TCP_CONN_FAIL.m86699a(), iElapsedRealtime, str2, mtq0.m160046v(this.f74657x.getApplicationContext()) ? 1 : 0);
            }
            throw new C14885fi(sb2.toString());
            StringBuilder sb7 = sb2;
            it2 = it;
            sb2 = sb7;
            strM160029e = str3;
            j2 = j;
            i3 = i2;
            r10 = 1;
        }
    }

    /* JADX INFO: renamed from: N */
    private void m102222N(v1r0 v1r0Var) throws Throwable {
        m102221L(v1r0Var.m199059c(), v1r0Var.m199054a());
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: A */
    public void mo102223A(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        mo102231O(z);
        C15019m.m87852a(this.f74657x).m87878c();
        if (z) {
            return;
        }
        this.f74657x.m87517a(new C15905a(13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    /* JADX INFO: renamed from: F */
    public Context m102224F() {
        return this.f74657x;
    }

    /* JADX INFO: renamed from: G */
    public Socket m102225G() {
        return new Socket();
    }

    /* JADX INFO: renamed from: H */
    public swq0 m102226H(String str) {
        swq0 swq0VarM213403a = xwq0.m213395a().m213403a(str, false);
        if (!swq0VarM213403a.mo188354u()) {
            o2r0.m165744a(new RunnableC15907c(str));
        }
        return swq0VarM213403a;
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo102227I();

    /* JADX INFO: renamed from: J */
    public synchronized void mo102228J(int i, Exception exc) {
        if (m194105s() == 2) {
            return;
        }
        m194099h(2, i, exc);
        this.f177121j = "";
        try {
            this.f74654u.close();
        } catch (Throwable unused) {
        }
        this.f74658y = 0L;
        this.f74659z = 0L;
    }

    /* JADX INFO: renamed from: K */
    public void m102229K(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f74650A >= Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            this.f74651B = 0;
            return;
        }
        if (mtq0.m160044t(this.f74657x)) {
            int i = this.f74651B + 1;
            this.f74651B = i;
            if (i >= 2) {
                String strMo102237c = mo102237c();
                ouq0.m169393m("max short conn time reached, sink down current host:" + strMo102237c);
                m102230M(strMo102237c, 0L, exc);
                this.f74651B = 0;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m102230M(String str, long j, Exception exc) {
        swq0 swq0VarM213403a = xwq0.m213395a().m213403a(v1r0.m199051a(), false);
        if (swq0VarM213403a != null) {
            swq0VarM213403a.m188353t(str, j, 0L, exc);
            xwq0.m213395a().m213415c();
        }
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo102231O(boolean z);

    /* JADX INFO: renamed from: P */
    public String m102232P() {
        return this.f177121j;
    }

    /* JADX INFO: renamed from: Q */
    public void m102233Q(int i, Exception exc) {
        mtq0.m160045u();
        this.f74657x.m87516a(new C15906b(2, i, exc));
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m102234R() {
        try {
            if (!m194093D() && !m194091B()) {
                m194099h(0, 0, null);
                m102222N(this.f177125n);
                return;
            }
            ouq0.m169393m("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new C14885fi(e);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m102235S() {
        this.f74658y = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: T */
    public void m102236T() {
        this.f74659z = SystemClock.elapsedRealtime();
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: c */
    public String mo102237c() {
        return this.f74656w;
    }

    @Override // p153l.u1r0
    /* JADX INFO: renamed from: v */
    public void mo102238v(int i, Exception exc) {
        mo102228J(i, exc);
        if ((exc != null || i == 18) && this.f74650A != 0) {
            m102229K(exc);
        }
    }

    /* JADX INFO: renamed from: l.b2r0$b */
    public class C15906b extends XMPushService.AbstractC14966j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f74663d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Exception f74664e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15906b(int i, int i2, Exception exc) {
            super(i);
            this.f74663d = i2;
            this.f74664e = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "shutdown the connection. " + this.f74663d + ", " + this.f74664e;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            b2r0.this.f74657x.m87515a(this.f74663d, this.f74664e);
        }
    }

    /* JADX INFO: renamed from: l.b2r0$a */
    public class C15905a extends XMPushService.AbstractC14966j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f74660d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f74661e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15905a(int i, long j, long j2) {
            super(i);
            this.f74660d = j;
            this.f74661e = j2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public void mo86634a() {
            Thread.yield();
            if (!b2r0.this.m194093D() || b2r0.this.m194104r(this.f74660d)) {
                return;
            }
            C15019m.m87852a(b2r0.this.f74657x).m87877b();
            b2r0.this.f74657x.m87515a(22, (Exception) null);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14966j
        /* JADX INFO: renamed from: a */
        public String mo86633a() {
            return "check the ping-pong." + this.f74661e;
        }
    }
}
