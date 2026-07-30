package p149l;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.tencent.ugc.TXRecordCommon;
import com.xiaomi.push.C14737fi;
import com.xiaomi.push.C14780i;
import com.xiaomi.push.EnumC14733ei;
import com.xiaomi.push.service.C14871m;
import com.xiaomi.push.service.XMPushService;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vsq0 extends osq0 {

    /* JADX INFO: renamed from: A */
    protected volatile long f182864A;

    /* JADX INFO: renamed from: B */
    private int f182865B;

    /* JADX INFO: renamed from: C */
    private long f182866C;

    /* JADX INFO: renamed from: t */
    protected Exception f182867t;

    /* JADX INFO: renamed from: u */
    protected Socket f182868u;

    /* JADX INFO: renamed from: v */
    String f182869v;

    /* JADX INFO: renamed from: w */
    private String f182870w;

    /* JADX INFO: renamed from: x */
    protected XMPushService f182871x;

    /* JADX INFO: renamed from: y */
    protected volatile long f182872y;

    /* JADX INFO: renamed from: z */
    protected volatile long f182873z;

    /* JADX INFO: renamed from: l.vsq0$c */
    public class RunnableC20723c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f182880a;

        public RunnableC20723c(String str) {
            this.f182880a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            rnq0.m180126a().m180134a(this.f182880a, true);
        }
    }

    public vsq0(XMPushService xMPushService, psq0 psq0Var) {
        super(xMPushService, psq0Var);
        this.f182867t = null;
        this.f182869v = null;
        this.f182872y = 0L;
        this.f182873z = 0L;
        this.f182864A = 0L;
        this.f182866C = 0L;
        this.f182871x = xMPushService;
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
    private void m199892L(String str, int i) throws Throwable {
        long j;
        String str2;
        boolean z;
        int iElapsedRealtime;
        int i2;
        Iterator<String> it;
        String str3;
        String str4;
        String str5;
        this.f182867t = null;
        ArrayList<String> arrayList = new ArrayList<>();
        Integer numM137029b = ilq0.m137029b("get bucket for host : " + str);
        numM137029b.intValue();
        mnq0 mnq0VarM199896H = m199896H(str);
        ilq0.m137039l(numM137029b);
        ?? r10 = 1;
        if (mnq0VarM199896H != null) {
            arrayList = mnq0VarM199896H.mo155537d(true);
        }
        mnq0 mnq0VarM180148d = rnq0.m180126a().m180148d(str);
        if (mnq0VarM180148d != null) {
            for (String str6 : mnq0VarM180148d.mo155537d(true)) {
                if (arrayList.indexOf(str6) == -1) {
                    arrayList.add(str6);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(str);
        }
        long j2 = 0;
        this.f182864A = 0L;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strM126676e = gkq0.m126676e(this.f182871x);
        StringBuilder sb = new StringBuilder();
        Iterator<String> it2 = arrayList.iterator();
        StringBuilder sb2 = sb;
        String str7 = "";
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                String next = it2.next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f145487a += r10;
                i2 = i3 + 1;
                try {
                    try {
                        try {
                            ilq0.m137040m("begin to connect to " + next);
                            this.f182868u = m199895G();
                            this.f182868u.connect(onq0.m165224c(next, i), TXRecordCommon.AUDIO_SAMPLERATE_8000);
                            ilq0.m137040m("tcp connected");
                            this.f182868u.setTcpNoDelay(r10);
                            this.f182870w = next;
                            mo199897I();
                            mnq0 mnq0Var = mnq0VarM199896H;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            try {
                                this.f145488b = jCurrentTimeMillis2;
                                this.f145497k = strM126676e;
                                if (mnq0Var != null) {
                                    Iterator<String> it3 = it2;
                                    sb2 = sb2;
                                    it = it3;
                                    j = 0;
                                    mnq0VarM199896H = mnq0Var;
                                    str3 = strM126676e;
                                    try {
                                        mnq0VarM199896H.m155552s(next, jCurrentTimeMillis2, 0L);
                                    } catch (Exception e) {
                                        e = e;
                                        try {
                                            this.f182867t = e;
                                            ilq0.m137025B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f182867t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str4 = next;
                                            } else {
                                                str4 = str7 + "|" + next;
                                            }
                                            C14780i.m86250h(next, this.f182867t);
                                            if (mnq0VarM199896H != null) {
                                                mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                            }
                                            if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                                str2 = str4;
                                                i3 = i2;
                                                z = false;
                                            }
                                            str7 = str4;
                                            StringBuilder sb3 = sb2;
                                            it2 = it;
                                            sb2 = sb3;
                                            strM126676e = str3;
                                            j2 = j;
                                            i3 = i2;
                                            r10 = 1;
                                        } catch (Throwable th) {
                                            th = th;
                                            ilq0.m137025B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f182867t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            C14780i.m86250h(next, this.f182867t);
                                            if (mnq0VarM199896H != null) {
                                                mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                            }
                                            if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i3 = i2;
                                            z = false;
                                            rnq0.m180126a().m180146c();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                                                return;
                                            }
                                            if (this.f182866C != j) {
                                                this.f182866C = SystemClock.elapsedRealtime();
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.f182866C = SystemClock.elapsedRealtime();
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new C14737fi(sb2.toString());
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            this.f182867t = new Exception("abnormal exception", th);
                                            ilq0.m137044q(th);
                                            ilq0.m137025B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f182867t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str4 = next;
                                            } else {
                                                str4 = str7 + "|" + next;
                                            }
                                            C14780i.m86250h(next, this.f182867t);
                                            if (mnq0VarM199896H != null) {
                                                mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                            }
                                            if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                                str2 = str4;
                                                i3 = i2;
                                                z = false;
                                            }
                                            str7 = str4;
                                            StringBuilder sb4 = sb2;
                                            it2 = it;
                                            sb2 = sb4;
                                            strM126676e = str3;
                                            j2 = j;
                                            i3 = i2;
                                            r10 = 1;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str7 = str7;
                                            ilq0.m137025B("SMACK: Could not connect to:" + next);
                                            sb2.append("SMACK: Could not connect to ");
                                            sb2.append(next);
                                            sb2.append(" port:");
                                            sb2.append(i);
                                            sb2.append(" err:");
                                            sb2.append(this.f182867t.getClass().getSimpleName());
                                            sb2.append(SignParameters.NEW_LINE);
                                            if (TextUtils.isEmpty(str7)) {
                                                str5 = next;
                                            } else {
                                                str5 = str7 + "|" + next;
                                            }
                                            C14780i.m86250h(next, this.f182867t);
                                            if (mnq0VarM199896H != null) {
                                                mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                            }
                                            if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                                throw th;
                                            }
                                            str2 = str5;
                                            i3 = i2;
                                            z = false;
                                            rnq0.m180126a().m180146c();
                                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                            if (!z) {
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                                                return;
                                            }
                                            if (this.f182866C != j) {
                                                this.f182866C = SystemClock.elapsedRealtime();
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                            } else {
                                                this.f182866C = SystemClock.elapsedRealtime();
                                                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                            }
                                            throw new C14737fi(sb2.toString());
                                        }
                                    }
                                } else {
                                    Iterator<String> it4 = it2;
                                    sb2 = sb2;
                                    it = it4;
                                    mnq0VarM199896H = mnq0Var;
                                    str3 = strM126676e;
                                    j = 0;
                                }
                                this.f182864A = SystemClock.elapsedRealtime();
                                ilq0.m137040m("connected to " + next + " in " + this.f145488b);
                                str2 = str7;
                                i3 = i2;
                                z = true;
                            } catch (Exception e2) {
                                e = e2;
                                it = it2;
                                mnq0VarM199896H = mnq0Var;
                                str3 = strM126676e;
                                j = 0;
                                this.f182867t = e;
                                ilq0.m137025B("SMACK: Could not connect to:" + next);
                                sb2.append("SMACK: Could not connect to ");
                                sb2.append(next);
                                sb2.append(" port:");
                                sb2.append(i);
                                sb2.append(" err:");
                                sb2.append(this.f182867t.getClass().getSimpleName());
                                sb2.append(SignParameters.NEW_LINE);
                                if (TextUtils.isEmpty(str7)) {
                                    str4 = next;
                                } else {
                                    str4 = str7 + "|" + next;
                                }
                                C14780i.m86250h(next, this.f182867t);
                                if (mnq0VarM199896H != null) {
                                    mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                }
                                if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                    str2 = str4;
                                    i3 = i2;
                                    z = false;
                                    rnq0.m180126a().m180146c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                                        return;
                                    }
                                    if (this.f182866C != j) {
                                        this.f182866C = SystemClock.elapsedRealtime();
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f182866C = SystemClock.elapsedRealtime();
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new C14737fi(sb2.toString());
                                }
                                str7 = str4;
                                StringBuilder sb5 = sb2;
                                it2 = it;
                                sb2 = sb5;
                                strM126676e = str3;
                                j2 = j;
                                i3 = i2;
                                r10 = 1;
                            } catch (Throwable th4) {
                                th = th4;
                                it = it2;
                                mnq0VarM199896H = mnq0Var;
                                str3 = strM126676e;
                                j = 0;
                                this.f182867t = new Exception("abnormal exception", th);
                                ilq0.m137044q(th);
                                ilq0.m137025B("SMACK: Could not connect to:" + next);
                                sb2.append("SMACK: Could not connect to ");
                                sb2.append(next);
                                sb2.append(" port:");
                                sb2.append(i);
                                sb2.append(" err:");
                                sb2.append(this.f182867t.getClass().getSimpleName());
                                sb2.append(SignParameters.NEW_LINE);
                                if (TextUtils.isEmpty(str7)) {
                                    str4 = next;
                                } else {
                                    str4 = str7 + "|" + next;
                                }
                                C14780i.m86250h(next, this.f182867t);
                                if (mnq0VarM199896H != null) {
                                    mnq0VarM199896H.m155553t(next, System.currentTimeMillis() - jCurrentTimeMillis, 0L, this.f182867t);
                                }
                                if (!TextUtils.equals(str3, gkq0.m126676e(this.f182871x))) {
                                    str2 = str4;
                                    i3 = i2;
                                    z = false;
                                    rnq0.m180126a().m180146c();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                                    if (!z) {
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                                        return;
                                    }
                                    if (this.f182866C != j) {
                                        this.f182866C = SystemClock.elapsedRealtime();
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                    } else {
                                        this.f182866C = SystemClock.elapsedRealtime();
                                        C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                                    }
                                    throw new C14737fi(sb2.toString());
                                }
                                str7 = str4;
                                StringBuilder sb6 = sb2;
                                it2 = it;
                                sb2 = sb6;
                                strM126676e = str3;
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
                        str3 = strM126676e;
                        j = 0;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    it = it2;
                }
                rnq0.m180126a().m180146c();
                iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (!z) {
                    C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                    return;
                }
                if (this.f182866C != j || SystemClock.elapsedRealtime() - this.f182866C > 480000) {
                    this.f182866C = SystemClock.elapsedRealtime();
                    C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
                }
                throw new C14737fi(sb2.toString());
            }
            sb2 = sb2;
            j = j2;
            str2 = str7;
            z = false;
            rnq0.m180126a().m180146c();
            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (!z) {
                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_SUCCESS.m85528a(), iElapsedRealtime, str2, i3);
                return;
            }
            if (this.f182866C != j) {
                this.f182866C = SystemClock.elapsedRealtime();
                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
            } else {
                this.f182866C = SystemClock.elapsedRealtime();
                C14780i.m86246d(0, EnumC14733ei.BATCH_TCP_CONN_FAIL.m85528a(), iElapsedRealtime, str2, gkq0.m126693v(this.f182871x.getApplicationContext()) ? 1 : 0);
            }
            throw new C14737fi(sb2.toString());
            StringBuilder sb7 = sb2;
            it2 = it;
            sb2 = sb7;
            strM126676e = str3;
            j2 = j;
            i3 = i2;
            r10 = 1;
        }
    }

    /* JADX INFO: renamed from: N */
    private void m199893N(psq0 psq0Var) throws Throwable {
        m199892L(psq0Var.m171246c(), psq0Var.m171241a());
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: A */
    public void mo165877A(boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        mo199901O(z);
        C14871m.m86681a(this.f182871x).m86707c();
        if (z) {
            return;
        }
        this.f182871x.m86346a(new C20721a(13, jElapsedRealtime, jCurrentTimeMillis), 10000L);
    }

    /* JADX INFO: renamed from: F */
    public Context m199894F() {
        return this.f182871x;
    }

    /* JADX INFO: renamed from: G */
    public Socket m199895G() {
        return new Socket();
    }

    /* JADX INFO: renamed from: H */
    public mnq0 m199896H(String str) {
        mnq0 mnq0VarM180134a = rnq0.m180126a().m180134a(str, false);
        if (!mnq0VarM180134a.mo155554u()) {
            itq0.m138233a(new RunnableC20723c(str));
        }
        return mnq0VarM180134a;
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo199897I();

    /* JADX INFO: renamed from: J */
    public synchronized void mo199898J(int i, Exception exc) {
        if (m165898s() == 2) {
            return;
        }
        m165887h(2, i, exc);
        this.f145496j = "";
        try {
            this.f182868u.close();
        } catch (Throwable unused) {
        }
        this.f182872y = 0L;
        this.f182873z = 0L;
    }

    /* JADX INFO: renamed from: K */
    public void m199899K(Exception exc) {
        if (SystemClock.elapsedRealtime() - this.f182864A >= Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            this.f182865B = 0;
            return;
        }
        if (gkq0.m126691t(this.f182871x)) {
            int i = this.f182865B + 1;
            this.f182865B = i;
            if (i >= 2) {
                String strMo165884c = mo165884c();
                ilq0.m137040m("max short conn time reached, sink down current host:" + strMo165884c);
                m199900M(strMo165884c, 0L, exc);
                this.f182865B = 0;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m199900M(String str, long j, Exception exc) {
        mnq0 mnq0VarM180134a = rnq0.m180126a().m180134a(psq0.m171238a(), false);
        if (mnq0VarM180134a != null) {
            mnq0VarM180134a.m155553t(str, j, 0L, exc);
            rnq0.m180126a().m180146c();
        }
    }

    /* JADX INFO: renamed from: O */
    public abstract void mo199901O(boolean z);

    /* JADX INFO: renamed from: P */
    public String m199902P() {
        return this.f145496j;
    }

    /* JADX INFO: renamed from: Q */
    public void m199903Q(int i, Exception exc) {
        gkq0.m126692u();
        this.f182871x.m86345a(new C20722b(2, i, exc));
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m199904R() {
        try {
            if (!m165880D() && !m165878B()) {
                m165887h(0, 0, null);
                m199893N(this.f145500n);
                return;
            }
            ilq0.m137040m("WARNING: current xmpp has connected");
        } catch (IOException e) {
            throw new C14737fi(e);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m199905S() {
        this.f182872y = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: T */
    public void m199906T() {
        this.f182873z = SystemClock.elapsedRealtime();
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: c */
    public String mo165884c() {
        return this.f182870w;
    }

    @Override // p149l.osq0
    /* JADX INFO: renamed from: v */
    public void mo165901v(int i, Exception exc) {
        mo199898J(i, exc);
        if ((exc != null || i == 18) && this.f182864A != 0) {
            m199899K(exc);
        }
    }

    /* JADX INFO: renamed from: l.vsq0$b */
    public class C20722b extends XMPushService.AbstractC14818j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f182877d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Exception f182878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20722b(int i, int i2, Exception exc) {
            super(i);
            this.f182877d = i2;
            this.f182878e = exc;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "shutdown the connection. " + this.f182877d + ", " + this.f182878e;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            vsq0.this.f182871x.m86344a(this.f182877d, this.f182878e);
        }
    }

    /* JADX INFO: renamed from: l.vsq0$a */
    public class C20721a extends XMPushService.AbstractC14818j {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ long f182874d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ long f182875e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20721a(int i, long j, long j2) {
            super(i);
            this.f182874d = j;
            this.f182875e = j2;
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public void mo85463a() {
            Thread.yield();
            if (!vsq0.this.m165880D() || vsq0.this.m165897r(this.f182874d)) {
                return;
            }
            C14871m.m86681a(vsq0.this.f182871x).m86706b();
            vsq0.this.f182871x.m86344a(22, (Exception) null);
        }

        @Override // com.xiaomi.push.service.XMPushService.AbstractC14818j
        /* JADX INFO: renamed from: a */
        public String mo85462a() {
            return "check the ping-pong." + this.f182875e;
        }
    }
}
