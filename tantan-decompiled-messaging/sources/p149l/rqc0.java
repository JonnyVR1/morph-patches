package p149l;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rqc0 {

    /* JADX INFO: renamed from: a */
    public final String f160603a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f160604b;

    /* JADX INFO: renamed from: c */
    public final CharSequence[] f160605c;

    /* JADX INFO: renamed from: d */
    public final boolean f160606d;

    /* JADX INFO: renamed from: e */
    public final int f160607e;

    /* JADX INFO: renamed from: f */
    public final Bundle f160608f;

    /* JADX INFO: renamed from: g */
    public final Set<String> f160609g;

    /* JADX INFO: renamed from: l.rqc0$a */
    @RequiresApi(20)
    public static class C19753a {
        /* JADX INFO: renamed from: a */
        public static RemoteInput m180423a(rqc0 rqc0Var) {
            Set<String> setM180416e;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(rqc0Var.m180421j()).setLabel(rqc0Var.m180420i()).setChoices(rqc0Var.m180417f()).setAllowFreeFormInput(rqc0Var.m180415d()).addExtras(rqc0Var.m180419h());
            if (Build.VERSION.SDK_INT >= 26 && (setM180416e = rqc0Var.m180416e()) != null) {
                Iterator<String> it = setM180416e.iterator();
                while (it.hasNext()) {
                    C19754b.m180427b(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C19755c.m180429b(builderAddExtras, rqc0Var.m180418g());
            }
            return builderAddExtras.build();
        }

        /* JADX INFO: renamed from: b */
        public static rqc0 m180424b(Object obj) {
            Set<String> setM180426a;
            RemoteInput remoteInput = (RemoteInput) obj;
            C19756d c19756dM180430a = new C19756d(remoteInput.getResultKey()).m180436g(remoteInput.getLabel()).m180434e(remoteInput.getChoices()).m180433d(remoteInput.getAllowFreeFormInput()).m180430a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setM180426a = C19754b.m180426a(remoteInput)) != null) {
                Iterator<String> it = setM180426a.iterator();
                while (it.hasNext()) {
                    c19756dM180430a.m180432c(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c19756dM180430a.m180435f(C19755c.m180428a(remoteInput));
            }
            return c19756dM180430a.m180431b();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Bundle m180425c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: renamed from: l.rqc0$b */
    @RequiresApi(26)
    public static class C19754b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Set<String> m180426a(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static RemoteInput.Builder m180427b(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* JADX INFO: renamed from: l.rqc0$c */
    @RequiresApi(29)
    public static class C19755c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m180428a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static RemoteInput.Builder m180429b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* JADX INFO: renamed from: l.rqc0$d */
    public static final class C19756d {

        /* JADX INFO: renamed from: a */
        public final String f160610a;

        /* JADX INFO: renamed from: d */
        public CharSequence f160613d;

        /* JADX INFO: renamed from: e */
        public CharSequence[] f160614e;

        /* JADX INFO: renamed from: b */
        public final Set<String> f160611b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Bundle f160612c = new Bundle();

        /* JADX INFO: renamed from: f */
        public boolean f160615f = true;

        /* JADX INFO: renamed from: g */
        public int f160616g = 0;

        public C19756d(@NonNull String str) {
            if (str != null) {
                this.f160610a = str;
            } else {
                ig3.m135964a("Result key can't be null");
                throw null;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C19756d m180430a(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f160612c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public rqc0 m180431b() {
            return new rqc0(this.f160610a, this.f160613d, this.f160614e, this.f160615f, this.f160616g, this.f160612c, this.f160611b);
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C19756d m180432c(@NonNull String str, boolean z) {
            Set<String> set = this.f160611b;
            if (z) {
                set.add(str);
                return this;
            }
            set.remove(str);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C19756d m180433d(boolean z) {
            this.f160615f = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C19756d m180434e(@Nullable CharSequence[] charSequenceArr) {
            this.f160614e = charSequenceArr;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public C19756d m180435f(int i) {
            this.f160616g = i;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public C19756d m180436g(@Nullable CharSequence charSequence) {
            this.f160613d = charSequence;
            return this;
        }
    }

    public rqc0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f160603a = str;
        this.f160604b = charSequence;
        this.f160605c = charSequenceArr;
        this.f160606d = z;
        this.f160607e = i;
        this.f160608f = bundle;
        this.f160609g = set;
        if (m180418g() != 2 || m180415d()) {
            return;
        }
        ig3.m135964a("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: a */
    public static RemoteInput m180411a(rqc0 rqc0Var) {
        return C19753a.m180423a(rqc0Var);
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: b */
    public static RemoteInput[] m180412b(rqc0[] rqc0VarArr) {
        if (rqc0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[rqc0VarArr.length];
        for (int i = 0; i < rqc0VarArr.length; i++) {
            remoteInputArr[i] = m180411a(rqc0VarArr[i]);
        }
        return remoteInputArr;
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: c */
    public static rqc0 m180413c(RemoteInput remoteInput) {
        return C19753a.m180424b(remoteInput);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Bundle m180414k(@NonNull Intent intent) {
        return C19753a.m180425c(intent);
    }

    /* JADX INFO: renamed from: d */
    public boolean m180415d() {
        return this.f160606d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<String> m180416e() {
        return this.f160609g;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public CharSequence[] m180417f() {
        return this.f160605c;
    }

    /* JADX INFO: renamed from: g */
    public int m180418g() {
        return this.f160607e;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Bundle m180419h() {
        return this.f160608f;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public CharSequence m180420i() {
        return this.f160604b;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public String m180421j() {
        return this.f160603a;
    }

    /* JADX INFO: renamed from: l */
    public boolean m180422l() {
        if (m180415d()) {
            return false;
        }
        return ((m180417f() != null && m180417f().length != 0) || m180416e() == null || m180416e().isEmpty()) ? false : true;
    }
}
