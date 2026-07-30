package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.Objects;

/* JADX INFO: renamed from: androidx.core.app.c */
/* JADX INFO: loaded from: classes.dex */
public class C0245c {

    /* JADX INFO: renamed from: a */
    @Nullable
    public CharSequence f1436a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public IconCompat f1437b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f1438c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f1439d;

    /* JADX INFO: renamed from: e */
    public boolean f1440e;

    /* JADX INFO: renamed from: f */
    public boolean f1441f;

    /* JADX INFO: renamed from: androidx.core.app.c$a */
    @RequiresApi(28)
    public static class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static C0245c m1273a(Person person) {
            return new b().m1280f(person.getName()).m1277c(person.getIcon() != null ? IconCompat.m1289c(person.getIcon()) : null).m1281g(person.getUri()).m1279e(person.getKey()).m1276b(person.isBot()).m1278d(person.isImportant()).m1275a();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Person m1274b(C0245c c0245c) {
            return new Person.Builder().setName(c0245c.m1266e()).setIcon(c0245c.m1264c() != null ? c0245c.m1264c().m1312x() : null).setUri(c0245c.m1267f()).setKey(c0245c.m1265d()).setBot(c0245c.m1268g()).setImportant(c0245c.m1269h()).build();
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.c$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        @Nullable
        public CharSequence f1442a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public IconCompat f1443b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f1444c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f1445d;

        /* JADX INFO: renamed from: e */
        public boolean f1446e;

        /* JADX INFO: renamed from: f */
        public boolean f1447f;

        @NonNull
        /* JADX INFO: renamed from: a */
        public C0245c m1275a() {
            return new C0245c(this);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m1276b(boolean z) {
            this.f1446e = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m1277c(@Nullable IconCompat iconCompat) {
            this.f1443b = iconCompat;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m1278d(boolean z) {
            this.f1447f = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public b m1279e(@Nullable String str) {
            this.f1445d = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public b m1280f(@Nullable CharSequence charSequence) {
            this.f1442a = charSequence;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public b m1281g(@Nullable String str) {
            this.f1444c = str;
            return this;
        }
    }

    public C0245c(b bVar) {
        this.f1436a = bVar.f1442a;
        this.f1437b = bVar.f1443b;
        this.f1438c = bVar.f1444c;
        this.f1439d = bVar.f1445d;
        this.f1440e = bVar.f1446e;
        this.f1441f = bVar.f1447f;
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: a */
    public static C0245c m1262a(@NonNull Person person) {
        return a.m1273a(person);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C0245c m1263b(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().m1280f(bundle.getCharSequence(AuthenticationTokenClaims.JSON_KEY_NAME)).m1277c(bundle2 != null ? IconCompat.m1288b(bundle2) : null).m1281g(bundle.getString("uri")).m1279e(bundle.getString(Constants.KEY_KEY)).m1276b(bundle.getBoolean("isBot")).m1278d(bundle.getBoolean("isImportant")).m1275a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public IconCompat m1264c() {
        return this.f1437b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m1265d() {
        return this.f1439d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CharSequence m1266e() {
        return this.f1436a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C0245c)) {
            return false;
        }
        C0245c c0245c = (C0245c) obj;
        String strM1265d = m1265d();
        String strM1265d2 = c0245c.m1265d();
        if (strM1265d == null && strM1265d2 == null) {
            return Objects.equals(Objects.toString(m1266e()), Objects.toString(c0245c.m1266e())) && Objects.equals(m1267f(), c0245c.m1267f()) && Boolean.valueOf(m1268g()).equals(Boolean.valueOf(c0245c.m1268g())) && Boolean.valueOf(m1269h()).equals(Boolean.valueOf(c0245c.m1269h()));
        }
        return Objects.equals(strM1265d, strM1265d2);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m1267f() {
        return this.f1438c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1268g() {
        return this.f1440e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1269h() {
        return this.f1441f;
    }

    public int hashCode() {
        String strM1265d = m1265d();
        return strM1265d != null ? strM1265d.hashCode() : Objects.hash(m1266e(), m1267f(), Boolean.valueOf(m1268g()), Boolean.valueOf(m1269h()));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public String m1270i() {
        String str = this.f1438c;
        if (str != null) {
            return str;
        }
        if (this.f1436a == null) {
            return "";
        }
        return "name:" + ((Object) this.f1436a);
    }

    @NonNull
    @RequiresApi(28)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: j */
    public Person m1271j() {
        return a.m1274b(this);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public Bundle m1272k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(AuthenticationTokenClaims.JSON_KEY_NAME, this.f1436a);
        IconCompat iconCompat = this.f1437b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m1311w() : null);
        bundle.putString("uri", this.f1438c);
        bundle.putString(Constants.KEY_KEY, this.f1439d);
        bundle.putBoolean("isBot", this.f1440e);
        bundle.putBoolean("isImportant", this.f1441f);
        return bundle;
    }
}
