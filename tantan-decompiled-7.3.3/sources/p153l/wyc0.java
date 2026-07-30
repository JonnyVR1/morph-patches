package p153l;

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
public final class wyc0 {

    /* JADX INFO: renamed from: a */
    public final String f191617a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f191618b;

    /* JADX INFO: renamed from: c */
    public final CharSequence[] f191619c;

    /* JADX INFO: renamed from: d */
    public final boolean f191620d;

    /* JADX INFO: renamed from: e */
    public final int f191621e;

    /* JADX INFO: renamed from: f */
    public final Bundle f191622f;

    /* JADX INFO: renamed from: g */
    public final Set<String> f191623g;

    /* JADX INFO: renamed from: l.wyc0$a */
    @RequiresApi(20)
    public static class C21207a {
        /* JADX INFO: renamed from: a */
        public static RemoteInput m208595a(wyc0 wyc0Var) {
            Set<String> setM208588e;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(wyc0Var.m208593j()).setLabel(wyc0Var.m208592i()).setChoices(wyc0Var.m208589f()).setAllowFreeFormInput(wyc0Var.m208587d()).addExtras(wyc0Var.m208591h());
            if (Build.VERSION.SDK_INT >= 26 && (setM208588e = wyc0Var.m208588e()) != null) {
                Iterator<String> it = setM208588e.iterator();
                while (it.hasNext()) {
                    C21208b.m208599b(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                C21209c.m208601b(builderAddExtras, wyc0Var.m208590g());
            }
            return builderAddExtras.build();
        }

        /* JADX INFO: renamed from: b */
        public static wyc0 m208596b(Object obj) {
            Set<String> setM208598a;
            RemoteInput remoteInput = (RemoteInput) obj;
            C21210d c21210dM208602a = new C21210d(remoteInput.getResultKey()).m208608g(remoteInput.getLabel()).m208606e(remoteInput.getChoices()).m208605d(remoteInput.getAllowFreeFormInput()).m208602a(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setM208598a = C21208b.m208598a(remoteInput)) != null) {
                Iterator<String> it = setM208598a.iterator();
                while (it.hasNext()) {
                    c21210dM208602a.m208604c(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c21210dM208602a.m208607f(C21209c.m208600a(remoteInput));
            }
            return c21210dM208602a.m208603b();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static Bundle m208597c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* JADX INFO: renamed from: l.wyc0$b */
    @RequiresApi(26)
    public static class C21208b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Set<String> m208598a(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static RemoteInput.Builder m208599b(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    /* JADX INFO: renamed from: l.wyc0$c */
    @RequiresApi(29)
    public static class C21209c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m208600a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static RemoteInput.Builder m208601b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    /* JADX INFO: renamed from: l.wyc0$d */
    public static final class C21210d {

        /* JADX INFO: renamed from: a */
        public final String f191624a;

        /* JADX INFO: renamed from: d */
        public CharSequence f191627d;

        /* JADX INFO: renamed from: e */
        public CharSequence[] f191628e;

        /* JADX INFO: renamed from: b */
        public final Set<String> f191625b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Bundle f191626c = new Bundle();

        /* JADX INFO: renamed from: f */
        public boolean f191629f = true;

        /* JADX INFO: renamed from: g */
        public int f191630g = 0;

        public C21210d(@NonNull String str) {
            if (str != null) {
                this.f191624a = str;
            } else {
                wg3.m206174a("Result key can't be null");
                throw null;
            }
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C21210d m208602a(@NonNull Bundle bundle) {
            if (bundle != null) {
                this.f191626c.putAll(bundle);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public wyc0 m208603b() {
            return new wyc0(this.f191624a, this.f191627d, this.f191628e, this.f191629f, this.f191630g, this.f191626c, this.f191625b);
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C21210d m208604c(@NonNull String str, boolean z) {
            Set<String> set = this.f191625b;
            if (z) {
                set.add(str);
                return this;
            }
            set.remove(str);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public C21210d m208605d(boolean z) {
            this.f191629f = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public C21210d m208606e(@Nullable CharSequence[] charSequenceArr) {
            this.f191628e = charSequenceArr;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public C21210d m208607f(int i) {
            this.f191630g = i;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public C21210d m208608g(@Nullable CharSequence charSequence) {
            this.f191627d = charSequence;
            return this;
        }
    }

    public wyc0(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set<String> set) {
        this.f191617a = str;
        this.f191618b = charSequence;
        this.f191619c = charSequenceArr;
        this.f191620d = z;
        this.f191621e = i;
        this.f191622f = bundle;
        this.f191623g = set;
        if (m208590g() != 2 || m208587d()) {
            return;
        }
        wg3.m206174a("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        throw null;
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: a */
    public static RemoteInput m208583a(wyc0 wyc0Var) {
        return C21207a.m208595a(wyc0Var);
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: b */
    public static RemoteInput[] m208584b(wyc0[] wyc0VarArr) {
        if (wyc0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[wyc0VarArr.length];
        for (int i = 0; i < wyc0VarArr.length; i++) {
            remoteInputArr[i] = m208583a(wyc0VarArr[i]);
        }
        return remoteInputArr;
    }

    @RequiresApi(20)
    /* JADX INFO: renamed from: c */
    public static wyc0 m208585c(RemoteInput remoteInput) {
        return C21207a.m208596b(remoteInput);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Bundle m208586k(@NonNull Intent intent) {
        return C21207a.m208597c(intent);
    }

    /* JADX INFO: renamed from: d */
    public boolean m208587d() {
        return this.f191620d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public Set<String> m208588e() {
        return this.f191623g;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public CharSequence[] m208589f() {
        return this.f191619c;
    }

    /* JADX INFO: renamed from: g */
    public int m208590g() {
        return this.f191621e;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public Bundle m208591h() {
        return this.f191622f;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public CharSequence m208592i() {
        return this.f191618b;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public String m208593j() {
        return this.f191617a;
    }

    /* JADX INFO: renamed from: l */
    public boolean m208594l() {
        if (m208587d()) {
            return false;
        }
        return ((m208589f() != null && m208589f().length != 0) || m208588e() == null || m208588e().isEmpty()) ? false : true;
    }
}
