package p153l;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class p5j {

    /* JADX INFO: renamed from: a */
    public final q5j<?> f150657a;

    public p5j(q5j<?> q5jVar) {
        this.f150657a = q5jVar;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static p5j m170652b(@NonNull q5j<?> q5jVar) {
        return new p5j((q5j) yn80.m216776f(q5jVar, "callbacks == null"));
    }

    /* JADX INFO: renamed from: a */
    public void m170653a(@Nullable Fragment fragment) {
        q5j<?> q5jVar = this.f150657a;
        q5jVar.f155726e.m2563k(q5jVar, q5jVar, fragment);
    }

    /* JADX INFO: renamed from: c */
    public void m170654c() {
        this.f150657a.f155726e.m2604y();
    }

    /* JADX INFO: renamed from: d */
    public void m170655d(@NonNull Configuration configuration) {
        this.f150657a.f155726e.m2487A(configuration);
    }

    /* JADX INFO: renamed from: e */
    public boolean m170656e(@NonNull MenuItem menuItem) {
        return this.f150657a.f155726e.m2488B(menuItem);
    }

    /* JADX INFO: renamed from: f */
    public void m170657f() {
        this.f150657a.f155726e.m2490C();
    }

    /* JADX INFO: renamed from: g */
    public boolean m170658g(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f150657a.f155726e.m2492D(menu, menuInflater);
    }

    /* JADX INFO: renamed from: h */
    public void m170659h() {
        this.f150657a.f155726e.m2494E();
    }

    /* JADX INFO: renamed from: i */
    public void m170660i() {
        this.f150657a.f155726e.m2498G();
    }

    /* JADX INFO: renamed from: j */
    public void m170661j(boolean z) {
        this.f150657a.f155726e.m2499H(z);
    }

    /* JADX INFO: renamed from: k */
    public boolean m170662k(@NonNull MenuItem menuItem) {
        return this.f150657a.f155726e.m2503J(menuItem);
    }

    /* JADX INFO: renamed from: l */
    public void m170663l(@NonNull Menu menu) {
        this.f150657a.f155726e.m2505K(menu);
    }

    /* JADX INFO: renamed from: m */
    public void m170664m() {
        this.f150657a.f155726e.m2509M();
    }

    /* JADX INFO: renamed from: n */
    public void m170665n(boolean z) {
        this.f150657a.f155726e.m2511N(z);
    }

    /* JADX INFO: renamed from: o */
    public boolean m170666o(@NonNull Menu menu) {
        return this.f150657a.f155726e.m2513O(menu);
    }

    /* JADX INFO: renamed from: p */
    public void m170667p() {
        this.f150657a.f155726e.m2517Q();
    }

    /* JADX INFO: renamed from: q */
    public void m170668q() {
        this.f150657a.f155726e.m2519R();
    }

    /* JADX INFO: renamed from: r */
    public void m170669r() {
        this.f150657a.f155726e.m2523T();
    }

    /* JADX INFO: renamed from: s */
    public boolean m170670s() {
        return this.f150657a.f155726e.m2537a0(true);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public FragmentManager m170671t() {
        return this.f150657a.f155726e;
    }

    /* JADX INFO: renamed from: u */
    public void m170672u() {
        this.f150657a.f155726e.m2526U0();
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public View m170673v(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f150657a.f155726e.m2596v0().onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: w */
    public void m170674w(@Nullable Parcelable parcelable) {
        q5j<?> q5jVar = this.f150657a;
        if (q5jVar instanceof tll0) {
            q5jVar.f155726e.m2565k1(parcelable);
        } else {
            wtq0.m207906a("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public Parcelable m170675x() {
        return this.f150657a.f155726e.m2570m1();
    }
}
