package p149l;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class q8e implements Comparable<q8e> {

    /* JADX INFO: renamed from: A */
    public String f153158A;

    /* JADX INFO: renamed from: a */
    public String f153161a;

    /* JADX INFO: renamed from: b */
    public String[] f153162b;

    /* JADX INFO: renamed from: c */
    public String f153163c;

    /* JADX INFO: renamed from: d */
    public String f153164d;

    /* JADX INFO: renamed from: e */
    public String f153165e;

    /* JADX INFO: renamed from: f */
    public String f153166f;

    /* JADX INFO: renamed from: g */
    public String f153167g;

    /* JADX INFO: renamed from: h */
    public String f153168h;

    /* JADX INFO: renamed from: k */
    public String f153171k;

    /* JADX INFO: renamed from: l */
    public String f153172l;

    /* JADX INFO: renamed from: m */
    public long f153173m;

    /* JADX INFO: renamed from: n */
    public long f153174n;

    /* JADX INFO: renamed from: o */
    public int f153175o;

    /* JADX INFO: renamed from: p */
    public int f153176p;

    /* JADX INFO: renamed from: q */
    public long f153177q;

    /* JADX INFO: renamed from: r */
    public b8e[] f153178r;

    /* JADX INFO: renamed from: t */
    public double f153180t;

    /* JADX INFO: renamed from: w */
    public long f153183w;

    /* JADX INFO: renamed from: x */
    public Bitmap f153184x;

    /* JADX INFO: renamed from: y */
    public String f153185y;

    /* JADX INFO: renamed from: z */
    public String f153186z;

    /* JADX INFO: renamed from: i */
    public int f153169i = 0;

    /* JADX INFO: renamed from: j */
    public int f153170j = 0;

    /* JADX INFO: renamed from: s */
    public boolean f153179s = true;

    /* JADX INFO: renamed from: u */
    public int f153181u = 0;

    /* JADX INFO: renamed from: v */
    public int f153182v = 50;

    /* JADX INFO: renamed from: B */
    public boolean f153159B = true;

    /* JADX INFO: renamed from: C */
    public boolean f153160C = true;

    /* JADX INFO: renamed from: A */
    public boolean m173369A() {
        if (TextUtils.isEmpty(this.f153161a)) {
            return false;
        }
        if (this.f153169i != 0) {
            return !TextUtils.isEmpty(this.f153163c);
        }
        String[] strArr = this.f153162b;
        return (strArr == null || strArr.length == 0 || TextUtils.isEmpty(this.f153167g) || TextUtils.isEmpty(this.f153168h) || this.f153176p <= 0) ? false : true;
    }

    /* JADX INFO: renamed from: B */
    public void m173370B(q8e q8eVar) {
        if (q8eVar == null || TextUtils.isEmpty(q8eVar.f153161a) || !q8eVar.f153161a.equals(this.f153161a)) {
            return;
        }
        if (TextUtils.isEmpty(this.f153166f)) {
            this.f153166f = q8eVar.f153166f;
        }
        if (TextUtils.isEmpty(this.f153164d)) {
            this.f153164d = q8eVar.f153164d;
        }
        if (TextUtils.isEmpty(this.f153165e)) {
            this.f153165e = q8eVar.f153165e;
        }
        if (this.f153173m <= 0) {
            this.f153173m = q8eVar.f153173m;
        }
        if (this.f153174n <= 0) {
            this.f153174n = q8eVar.f153174n;
        }
        long j = q8eVar.f153177q;
        if (j > 0) {
            this.f153177q = j;
        }
        b8e[] b8eVarArr = this.f153178r;
        if (b8eVarArr == null || b8eVarArr.length == 0) {
            this.f153178r = q8eVar.f153178r;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m173371C() {
        Bitmap bitmap = this.f153184x;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f153184x.recycle();
        this.f153184x = null;
    }

    /* JADX INFO: renamed from: F */
    public void m173372F(String str) {
        this.f153167g = str;
    }

    /* JADX INFO: renamed from: H */
    public void m173373H(long j) {
        this.f153173m = j;
    }

    /* JADX INFO: renamed from: I */
    public void m173374I(String str) {
        this.f153165e = str;
    }

    /* JADX INFO: renamed from: J */
    public void m173375J(b8e[] b8eVarArr) {
        this.f153178r = b8eVarArr;
    }

    /* JADX INFO: renamed from: K */
    public void m173376K(int i) {
        this.f153169i = i;
    }

    /* JADX INFO: renamed from: L */
    public void m173377L(int i) {
        this.f153170j = i;
    }

    /* JADX INFO: renamed from: M */
    public void m173378M(String str) {
        this.f153171k = str;
    }

    /* JADX INFO: renamed from: N */
    public void m173379N(String str) {
        this.f153166f = str;
    }

    /* JADX INFO: renamed from: O */
    public void m173380O(int i) {
        this.f153175o = i;
    }

    /* JADX INFO: renamed from: P */
    public void m173381P(boolean z) {
        this.f153179s = z;
    }

    /* JADX INFO: renamed from: Q */
    public void m173382Q(long j) {
        this.f153177q = j;
    }

    /* JADX INFO: renamed from: R */
    public void m173383R(int i) {
        this.f153176p = i;
    }

    /* JADX INFO: renamed from: S */
    public void m173384S(String str) {
        this.f153168h = str;
    }

    /* JADX INFO: renamed from: T */
    public void m173385T(String str) {
        this.f153164d = str;
    }

    /* JADX INFO: renamed from: U */
    public void m173386U(String str) {
        this.f153172l = str;
    }

    /* JADX INFO: renamed from: V */
    public void m173387V(String str) {
        this.f153163c = str;
    }

    /* JADX INFO: renamed from: W */
    public void m173388W(String[] strArr) {
        this.f153162b = strArr;
    }

    /* JADX INFO: renamed from: X */
    public void m173389X(String str) {
        this.f153161a = str;
    }

    /* JADX INFO: renamed from: Y */
    public void m173390Y(long j) {
        this.f153174n = j;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(q8e q8eVar) {
        return this.f153182v - q8eVar.f153182v;
    }

    /* JADX INFO: renamed from: b */
    public String m173392b() {
        return this.f153167g;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof q8e) {
            q8e q8eVar = (q8e) obj;
            if (!TextUtils.isEmpty(q8eVar.f153161a)) {
                return q8eVar.f153161a.equals(this.f153161a);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public long m173393f() {
        return this.f153173m;
    }

    /* JADX INFO: renamed from: g */
    public String m173394g() {
        return this.f153165e;
    }

    /* JADX INFO: renamed from: h */
    public b8e[] m173395h() {
        return this.f153178r;
    }

    /* JADX INFO: renamed from: i */
    public int m173396i() {
        return this.f153169i;
    }

    /* JADX INFO: renamed from: j */
    public int m173397j() {
        return this.f153170j;
    }

    /* JADX INFO: renamed from: m */
    public String m173398m() {
        return this.f153171k;
    }

    /* JADX INFO: renamed from: n */
    public String m173399n() {
        return this.f153166f;
    }

    /* JADX INFO: renamed from: o */
    public int m173400o() {
        return this.f153175o;
    }

    /* JADX INFO: renamed from: p */
    public boolean m173401p() {
        return this.f153179s;
    }

    /* JADX INFO: renamed from: q */
    public long m173402q() {
        return this.f153177q;
    }

    /* JADX INFO: renamed from: r */
    public int m173403r() {
        return this.f153176p;
    }

    /* JADX INFO: renamed from: s */
    public String m173404s() {
        return this.f153168h;
    }

    /* JADX INFO: renamed from: t */
    public String m173405t() {
        return this.f153164d;
    }

    public String toString() {
        return "DownloadTask{taskID='" + this.f153161a + "', sourceUrls=" + Arrays.toString(this.f153162b) + ", sourceUrl='" + this.f153163c + "', checkCode='" + this.f153167g + "', md5Str='" + this.f153168h + "', savePath='" + this.f153172l + "', completeNum=" + this.f153173m + ", totalNum=" + this.f153174n + ", currentStatus=" + this.f153181u + ", mProirity=" + this.f153182v + ", logFinalUrl='" + this.f153185y + "', logResourceSize='" + this.f153186z + "', logFinalIP='" + this.f153158A + "', needContinue=" + this.f153159B + '}';
    }

    /* JADX INFO: renamed from: u */
    public String m173406u() {
        return this.f153172l;
    }

    /* JADX INFO: renamed from: v */
    public String m173407v() {
        return this.f153163c;
    }

    /* JADX INFO: renamed from: w */
    public String[] m173408w() {
        return this.f153162b;
    }

    /* JADX INFO: renamed from: x */
    public String m173409x(int i) {
        if (i == 0) {
            return "等待下载中";
        }
        if (i == 1) {
            return "准备下载中";
        }
        if (i == 2) {
            return "正在下载";
        }
        if (i == 3) {
            return "已完成";
        }
        if (i == 4) {
            return "已暂停";
        }
        if (i != 5) {
            return null;
        }
        return "下载失败";
    }

    /* JADX INFO: renamed from: y */
    public String m173410y() {
        return this.f153161a;
    }

    /* JADX INFO: renamed from: z */
    public long m173411z() {
        return this.f153174n;
    }
}
