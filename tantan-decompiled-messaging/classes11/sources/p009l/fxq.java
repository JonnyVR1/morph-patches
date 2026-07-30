package p009l;

import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fxq implements Comparable<fxq> {

    /* JADX INFO: renamed from: a */
    public String f13192a;

    /* JADX INFO: renamed from: b */
    public String f13193b;

    /* JADX INFO: renamed from: c */
    public String f13194c;

    /* JADX INFO: renamed from: d */
    public String f13195d;

    /* JADX INFO: renamed from: e */
    public int f13196e;

    /* JADX INFO: renamed from: f */
    public Gender f13197f;

    /* JADX INFO: renamed from: g */
    public int f13198g;

    /* JADX INFO: renamed from: h */
    public String f13199h;

    /* JADX INFO: renamed from: i */
    public String f13200i;

    /* JADX INFO: renamed from: j */
    public List<Media> f13201j;

    /* JADX INFO: renamed from: k */
    public double f13202k;

    /* JADX INFO: renamed from: l */
    public String f13203l;

    /* JADX INFO: renamed from: m */
    public boolean f13204m;

    /* JADX INFO: renamed from: n */
    public String f13205n;

    /* JADX INFO: renamed from: o */
    public boolean f13206o;

    /* JADX INFO: renamed from: p */
    public boolean f13207p;

    /* JADX INFO: renamed from: q */
    public Greeting f13208q;

    /* JADX INFO: renamed from: r */
    public int f13209r = -1;

    /* JADX INFO: renamed from: s */
    public List<String> f13210s;

    /* JADX INFO: renamed from: t */
    public boolean f13211t;

    /* JADX INFO: renamed from: u */
    public boolean f13212u;

    /* JADX INFO: renamed from: v */
    public boolean f13213v;

    /* JADX INFO: renamed from: A */
    public void m14597A(List<Media> list) {
        this.f13201j = list;
    }

    /* JADX INFO: renamed from: B */
    public void m14598B(String str) {
        this.f13199h = str;
    }

    /* JADX INFO: renamed from: C */
    public void m14599C(boolean z) {
        this.f13211t = z;
    }

    /* JADX INFO: renamed from: F */
    public void m14600F(boolean z) {
        this.f13206o = z;
    }

    /* JADX INFO: renamed from: H */
    public void m14601H(boolean z) {
        this.f13212u = z;
    }

    /* JADX INFO: renamed from: I */
    public void m14602I(String str) {
        this.f13194c = str;
    }

    /* JADX INFO: renamed from: J */
    public void m14603J(String str) {
        this.f13203l = str;
    }

    /* JADX INFO: renamed from: K */
    public void m14604K(boolean z) {
        this.f13213v = z;
    }

    /* JADX INFO: renamed from: L */
    public void m14605L(double d) {
        this.f13202k = d;
    }

    /* JADX INFO: renamed from: M */
    public void m14606M(int i) {
        this.f13198g = i;
    }

    /* JADX INFO: renamed from: N */
    public void m14607N(int i) {
        this.f13196e = i;
    }

    /* JADX INFO: renamed from: O */
    public void m14608O(String str) {
        this.f13193b = str;
    }

    /* JADX INFO: renamed from: P */
    public void m14609P(String str) {
        this.f13195d = str;
    }

    /* JADX INFO: renamed from: Q */
    public void m14610Q(Gender gender) {
        this.f13197f = gender;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fxq fxqVar) {
        return (int) (fxqVar.m14619n() - m14619n());
    }

    /* JADX INFO: renamed from: b */
    public Greeting m14612b() {
        return this.f13208q;
    }

    /* JADX INFO: renamed from: f */
    public String m14613f() {
        return this.f13192a;
    }

    /* JADX INFO: renamed from: g */
    public String m14614g() {
        return this.f13205n;
    }

    /* JADX INFO: renamed from: h */
    public List<Media> m14615h() {
        return this.f13201j;
    }

    /* JADX INFO: renamed from: i */
    public String m14616i() {
        return this.f13199h;
    }

    /* JADX INFO: renamed from: j */
    public String m14617j() {
        return this.f13194c;
    }

    /* JADX INFO: renamed from: m */
    public String m14618m() {
        return this.f13203l;
    }

    /* JADX INFO: renamed from: n */
    public double m14619n() {
        return this.f13202k;
    }

    /* JADX INFO: renamed from: o */
    public int m14620o() {
        return this.f13198g;
    }

    /* JADX INFO: renamed from: p */
    public String m14621p() {
        return this.f13193b;
    }

    /* JADX INFO: renamed from: q */
    public String m14622q() {
        return this.f13195d;
    }

    /* JADX INFO: renamed from: r */
    public boolean m14623r() {
        return this.f13207p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m14624s() {
        return this.f13211t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m14625t() {
        return this.f13206o;
    }

    public String toString() {
        return "KankanReplyData{mGreetingId='" + this.f13192a + "', mUserId='" + this.f13193b + "', mProfileUrl='" + this.f13194c + "', mUserName='" + this.f13195d + "', mUserAge=" + this.f13196e + ", mUserSex=" + this.f13197f + ", mUnReadCounts=" + this.f13198g + ", mMessage='" + this.f13199h + "', mMessageUrl='" + this.f13200i + "', mMedia=" + this.f13201j + ", mTime=" + this.f13202k + ", mStatus='" + this.f13203l + "', mKankanStatus=" + this.f13204m + ", mKankanValue='" + this.f13205n + "', mGreeting=" + this.f13208q + ", mContentType=" + this.f13209r + ", mTextTheme=" + this.f13210s + ", isPlatinum=" + this.f13212u + '}';
    }

    /* JADX INFO: renamed from: u */
    public boolean m14626u() {
        return this.f13212u;
    }

    /* JADX INFO: renamed from: v */
    public boolean m14627v() {
        return this.f13213v;
    }

    /* JADX INFO: renamed from: w */
    public void m14628w(Greeting greeting) {
        this.f13208q = greeting;
    }

    /* JADX INFO: renamed from: x */
    public void m14629x(String str) {
        this.f13192a = str;
    }

    /* JADX INFO: renamed from: y */
    public void m14630y(boolean z) {
        this.f13207p = z;
    }

    /* JADX INFO: renamed from: z */
    public void m14631z(String str) {
        this.f13205n = str;
    }
}
