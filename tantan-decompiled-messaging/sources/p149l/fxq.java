package p149l;

import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fxq implements Comparable<fxq> {

    /* JADX INFO: renamed from: a */
    public String f99783a;

    /* JADX INFO: renamed from: b */
    public String f99784b;

    /* JADX INFO: renamed from: c */
    public String f99785c;

    /* JADX INFO: renamed from: d */
    public String f99786d;

    /* JADX INFO: renamed from: e */
    public int f99787e;

    /* JADX INFO: renamed from: f */
    public Gender f99788f;

    /* JADX INFO: renamed from: g */
    public int f99789g;

    /* JADX INFO: renamed from: h */
    public String f99790h;

    /* JADX INFO: renamed from: i */
    public String f99791i;

    /* JADX INFO: renamed from: j */
    public List<Media> f99792j;

    /* JADX INFO: renamed from: k */
    public double f99793k;

    /* JADX INFO: renamed from: l */
    public String f99794l;

    /* JADX INFO: renamed from: m */
    public boolean f99795m;

    /* JADX INFO: renamed from: n */
    public String f99796n;

    /* JADX INFO: renamed from: o */
    public boolean f99797o;

    /* JADX INFO: renamed from: p */
    public boolean f99798p;

    /* JADX INFO: renamed from: q */
    public Greeting f99799q;

    /* JADX INFO: renamed from: r */
    public int f99800r = -1;

    /* JADX INFO: renamed from: s */
    public List<String> f99801s;

    /* JADX INFO: renamed from: t */
    public boolean f99802t;

    /* JADX INFO: renamed from: u */
    public boolean f99803u;

    /* JADX INFO: renamed from: v */
    public boolean f99804v;

    /* JADX INFO: renamed from: A */
    public void m123644A(List<Media> list) {
        this.f99792j = list;
    }

    /* JADX INFO: renamed from: B */
    public void m123645B(String str) {
        this.f99790h = str;
    }

    /* JADX INFO: renamed from: C */
    public void m123646C(boolean z) {
        this.f99802t = z;
    }

    /* JADX INFO: renamed from: F */
    public void m123647F(boolean z) {
        this.f99797o = z;
    }

    /* JADX INFO: renamed from: H */
    public void m123648H(boolean z) {
        this.f99803u = z;
    }

    /* JADX INFO: renamed from: I */
    public void m123649I(String str) {
        this.f99785c = str;
    }

    /* JADX INFO: renamed from: J */
    public void m123650J(String str) {
        this.f99794l = str;
    }

    /* JADX INFO: renamed from: K */
    public void m123651K(boolean z) {
        this.f99804v = z;
    }

    /* JADX INFO: renamed from: L */
    public void m123652L(double d) {
        this.f99793k = d;
    }

    /* JADX INFO: renamed from: M */
    public void m123653M(int i) {
        this.f99789g = i;
    }

    /* JADX INFO: renamed from: N */
    public void m123654N(int i) {
        this.f99787e = i;
    }

    /* JADX INFO: renamed from: O */
    public void m123655O(String str) {
        this.f99784b = str;
    }

    /* JADX INFO: renamed from: P */
    public void m123656P(String str) {
        this.f99786d = str;
    }

    /* JADX INFO: renamed from: Q */
    public void m123657Q(Gender gender) {
        this.f99788f = gender;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fxq fxqVar) {
        return (int) (fxqVar.m123666n() - m123666n());
    }

    /* JADX INFO: renamed from: b */
    public Greeting m123659b() {
        return this.f99799q;
    }

    /* JADX INFO: renamed from: f */
    public String m123660f() {
        return this.f99783a;
    }

    /* JADX INFO: renamed from: g */
    public String m123661g() {
        return this.f99796n;
    }

    /* JADX INFO: renamed from: h */
    public List<Media> m123662h() {
        return this.f99792j;
    }

    /* JADX INFO: renamed from: i */
    public String m123663i() {
        return this.f99790h;
    }

    /* JADX INFO: renamed from: j */
    public String m123664j() {
        return this.f99785c;
    }

    /* JADX INFO: renamed from: m */
    public String m123665m() {
        return this.f99794l;
    }

    /* JADX INFO: renamed from: n */
    public double m123666n() {
        return this.f99793k;
    }

    /* JADX INFO: renamed from: o */
    public int m123667o() {
        return this.f99789g;
    }

    /* JADX INFO: renamed from: p */
    public String m123668p() {
        return this.f99784b;
    }

    /* JADX INFO: renamed from: q */
    public String m123669q() {
        return this.f99786d;
    }

    /* JADX INFO: renamed from: r */
    public boolean m123670r() {
        return this.f99798p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m123671s() {
        return this.f99802t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m123672t() {
        return this.f99797o;
    }

    public String toString() {
        return "KankanReplyData{mGreetingId='" + this.f99783a + "', mUserId='" + this.f99784b + "', mProfileUrl='" + this.f99785c + "', mUserName='" + this.f99786d + "', mUserAge=" + this.f99787e + ", mUserSex=" + this.f99788f + ", mUnReadCounts=" + this.f99789g + ", mMessage='" + this.f99790h + "', mMessageUrl='" + this.f99791i + "', mMedia=" + this.f99792j + ", mTime=" + this.f99793k + ", mStatus='" + this.f99794l + "', mKankanStatus=" + this.f99795m + ", mKankanValue='" + this.f99796n + "', mGreeting=" + this.f99799q + ", mContentType=" + this.f99800r + ", mTextTheme=" + this.f99801s + ", isPlatinum=" + this.f99803u + '}';
    }

    /* JADX INFO: renamed from: u */
    public boolean m123673u() {
        return this.f99803u;
    }

    /* JADX INFO: renamed from: v */
    public boolean m123674v() {
        return this.f99804v;
    }

    /* JADX INFO: renamed from: w */
    public void m123675w(Greeting greeting) {
        this.f99799q = greeting;
    }

    /* JADX INFO: renamed from: x */
    public void m123676x(String str) {
        this.f99783a = str;
    }

    /* JADX INFO: renamed from: y */
    public void m123677y(boolean z) {
        this.f99798p = z;
    }

    /* JADX INFO: renamed from: z */
    public void m123678z(String str) {
        this.f99796n = str;
    }
}
