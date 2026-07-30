package p153l;

import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.Media;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class fzq implements Comparable<fzq> {

    /* JADX INFO: renamed from: a */
    public String f101495a;

    /* JADX INFO: renamed from: b */
    public String f101496b;

    /* JADX INFO: renamed from: c */
    public String f101497c;

    /* JADX INFO: renamed from: d */
    public String f101498d;

    /* JADX INFO: renamed from: e */
    public int f101499e;

    /* JADX INFO: renamed from: f */
    public Gender f101500f;

    /* JADX INFO: renamed from: g */
    public int f101501g;

    /* JADX INFO: renamed from: h */
    public String f101502h;

    /* JADX INFO: renamed from: i */
    public String f101503i;

    /* JADX INFO: renamed from: j */
    public List<Media> f101504j;

    /* JADX INFO: renamed from: k */
    public double f101505k;

    /* JADX INFO: renamed from: l */
    public String f101506l;

    /* JADX INFO: renamed from: m */
    public boolean f101507m;

    /* JADX INFO: renamed from: n */
    public String f101508n;

    /* JADX INFO: renamed from: o */
    public boolean f101509o;

    /* JADX INFO: renamed from: p */
    public boolean f101510p;

    /* JADX INFO: renamed from: q */
    public Greeting f101511q;

    /* JADX INFO: renamed from: r */
    public int f101512r = -1;

    /* JADX INFO: renamed from: s */
    public List<String> f101513s;

    /* JADX INFO: renamed from: t */
    public boolean f101514t;

    /* JADX INFO: renamed from: u */
    public boolean f101515u;

    /* JADX INFO: renamed from: v */
    public boolean f101516v;

    /* JADX INFO: renamed from: A */
    public void m128200A(List<Media> list) {
        this.f101504j = list;
    }

    /* JADX INFO: renamed from: B */
    public void m128201B(String str) {
        this.f101502h = str;
    }

    /* JADX INFO: renamed from: C */
    public void m128202C(boolean z) {
        this.f101514t = z;
    }

    /* JADX INFO: renamed from: F */
    public void m128203F(boolean z) {
        this.f101509o = z;
    }

    /* JADX INFO: renamed from: H */
    public void m128204H(boolean z) {
        this.f101515u = z;
    }

    /* JADX INFO: renamed from: I */
    public void m128205I(String str) {
        this.f101497c = str;
    }

    /* JADX INFO: renamed from: J */
    public void m128206J(String str) {
        this.f101506l = str;
    }

    /* JADX INFO: renamed from: K */
    public void m128207K(boolean z) {
        this.f101516v = z;
    }

    /* JADX INFO: renamed from: L */
    public void m128208L(double d) {
        this.f101505k = d;
    }

    /* JADX INFO: renamed from: M */
    public void m128209M(int i) {
        this.f101501g = i;
    }

    /* JADX INFO: renamed from: N */
    public void m128210N(int i) {
        this.f101499e = i;
    }

    /* JADX INFO: renamed from: O */
    public void m128211O(String str) {
        this.f101496b = str;
    }

    /* JADX INFO: renamed from: P */
    public void m128212P(String str) {
        this.f101498d = str;
    }

    /* JADX INFO: renamed from: Q */
    public void m128213Q(Gender gender) {
        this.f101500f = gender;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fzq fzqVar) {
        return (int) (fzqVar.m128222n() - m128222n());
    }

    /* JADX INFO: renamed from: b */
    public Greeting m128215b() {
        return this.f101511q;
    }

    /* JADX INFO: renamed from: f */
    public String m128216f() {
        return this.f101495a;
    }

    /* JADX INFO: renamed from: g */
    public String m128217g() {
        return this.f101508n;
    }

    /* JADX INFO: renamed from: h */
    public List<Media> m128218h() {
        return this.f101504j;
    }

    /* JADX INFO: renamed from: i */
    public String m128219i() {
        return this.f101502h;
    }

    /* JADX INFO: renamed from: j */
    public String m128220j() {
        return this.f101497c;
    }

    /* JADX INFO: renamed from: m */
    public String m128221m() {
        return this.f101506l;
    }

    /* JADX INFO: renamed from: n */
    public double m128222n() {
        return this.f101505k;
    }

    /* JADX INFO: renamed from: o */
    public int m128223o() {
        return this.f101501g;
    }

    /* JADX INFO: renamed from: p */
    public String m128224p() {
        return this.f101496b;
    }

    /* JADX INFO: renamed from: q */
    public String m128225q() {
        return this.f101498d;
    }

    /* JADX INFO: renamed from: r */
    public boolean m128226r() {
        return this.f101510p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m128227s() {
        return this.f101514t;
    }

    /* JADX INFO: renamed from: t */
    public boolean m128228t() {
        return this.f101509o;
    }

    public String toString() {
        return "KankanReplyData{mGreetingId='" + this.f101495a + "', mUserId='" + this.f101496b + "', mProfileUrl='" + this.f101497c + "', mUserName='" + this.f101498d + "', mUserAge=" + this.f101499e + ", mUserSex=" + this.f101500f + ", mUnReadCounts=" + this.f101501g + ", mMessage='" + this.f101502h + "', mMessageUrl='" + this.f101503i + "', mMedia=" + this.f101504j + ", mTime=" + this.f101505k + ", mStatus='" + this.f101506l + "', mKankanStatus=" + this.f101507m + ", mKankanValue='" + this.f101508n + "', mGreeting=" + this.f101511q + ", mContentType=" + this.f101512r + ", mTextTheme=" + this.f101513s + ", isPlatinum=" + this.f101515u + '}';
    }

    /* JADX INFO: renamed from: u */
    public boolean m128229u() {
        return this.f101515u;
    }

    /* JADX INFO: renamed from: v */
    public boolean m128230v() {
        return this.f101516v;
    }

    /* JADX INFO: renamed from: w */
    public void m128231w(Greeting greeting) {
        this.f101511q = greeting;
    }

    /* JADX INFO: renamed from: x */
    public void m128232x(String str) {
        this.f101495a = str;
    }

    /* JADX INFO: renamed from: y */
    public void m128233y(boolean z) {
        this.f101510p = z;
    }

    /* JADX INFO: renamed from: z */
    public void m128234z(String str) {
        this.f101508n = str;
    }
}
