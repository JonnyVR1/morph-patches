package p149l;

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
public class u2j {

    /* JADX INFO: renamed from: a */
    public final v2j<?> f173494a;

    public u2j(v2j<?> v2jVar) {
        this.f173494a = v2jVar;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static u2j m191500b(@NonNull v2j<?> v2jVar) {
        return new u2j((v2j) tf80.m188659f(v2jVar, "callbacks == null"));
    }

    /* JADX INFO: renamed from: a */
    public void m191501a(@Nullable Fragment fragment) {
        v2j<?> v2jVar = this.f173494a;
        v2jVar.f179557e.m2562k(v2jVar, v2jVar, fragment);
    }

    /* JADX INFO: renamed from: c */
    public void m191502c() {
        this.f173494a.f179557e.m2603y();
    }

    /* JADX INFO: renamed from: d */
    public void m191503d(@NonNull Configuration configuration) {
        this.f173494a.f179557e.m2486A(configuration);
    }

    /* JADX INFO: renamed from: e */
    public boolean m191504e(@NonNull MenuItem menuItem) {
        return this.f173494a.f179557e.m2487B(menuItem);
    }

    /* JADX INFO: renamed from: f */
    public void m191505f() {
        this.f173494a.f179557e.m2489C();
    }

    /* JADX INFO: renamed from: g */
    public boolean m191506g(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        return this.f173494a.f179557e.m2491D(menu, menuInflater);
    }

    /* JADX INFO: renamed from: h */
    public void m191507h() {
        this.f173494a.f179557e.m2493E();
    }

    /* JADX INFO: renamed from: i */
    public void m191508i() {
        this.f173494a.f179557e.m2497G();
    }

    /* JADX INFO: renamed from: j */
    public void m191509j(boolean z) {
        this.f173494a.f179557e.m2498H(z);
    }

    /* JADX INFO: renamed from: k */
    public boolean m191510k(@NonNull MenuItem menuItem) {
        return this.f173494a.f179557e.m2502J(menuItem);
    }

    /* JADX INFO: renamed from: l */
    public void m191511l(@NonNull Menu menu) {
        this.f173494a.f179557e.m2504K(menu);
    }

    /* JADX INFO: renamed from: m */
    public void m191512m() {
        this.f173494a.f179557e.m2508M();
    }

    /* JADX INFO: renamed from: n */
    public void m191513n(boolean z) {
        this.f173494a.f179557e.m2510N(z);
    }

    /* JADX INFO: renamed from: o */
    public boolean m191514o(@NonNull Menu menu) {
        return this.f173494a.f179557e.m2512O(menu);
    }

    /* JADX INFO: renamed from: p */
    public void m191515p() {
        this.f173494a.f179557e.m2516Q();
    }

    /* JADX INFO: renamed from: q */
    public void m191516q() {
        this.f173494a.f179557e.m2518R();
    }

    /* JADX INFO: renamed from: r */
    public void m191517r() {
        this.f173494a.f179557e.m2522T();
    }

    /* JADX INFO: renamed from: s */
    public boolean m191518s() {
        return this.f173494a.f179557e.m2536a0(true);
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public FragmentManager m191519t() {
        return this.f173494a.f179557e;
    }

    /* JADX INFO: renamed from: u */
    public void m191520u() {
        this.f173494a.f179557e.m2525U0();
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public View m191521v(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.f173494a.f179557e.m2595v0().onCreateView(view, str, context, attributeSet);
    }

    /* JADX INFO: renamed from: w */
    public void m191522w(@Nullable Parcelable parcelable) {
        v2j<?> v2jVar = this.f173494a;
        if (v2jVar instanceof pcl0) {
            v2jVar.f179557e.m2564k1(parcelable);
        } else {
            qkq0.m175383a("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public Parcelable m191523x() {
        return this.f173494a.f179557e.m2569m1();
    }
}
