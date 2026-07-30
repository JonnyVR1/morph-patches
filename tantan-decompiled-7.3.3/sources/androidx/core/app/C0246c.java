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
public class C0246c {

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
        public static C0246c m1274a(Person person) {
            return new b().m1281f(person.getName()).m1278c(person.getIcon() != null ? IconCompat.m1290c(person.getIcon()) : null).m1282g(person.getUri()).m1280e(person.getKey()).m1277b(person.isBot()).m1279d(person.isImportant()).m1276a();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static Person m1275b(C0246c c0246c) {
            return new Person.Builder().setName(c0246c.m1267e()).setIcon(c0246c.m1265c() != null ? c0246c.m1265c().m1313x() : null).setUri(c0246c.m1268f()).setKey(c0246c.m1266d()).setBot(c0246c.m1269g()).setImportant(c0246c.m1270h()).build();
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
        public C0246c m1276a() {
            return new C0246c(this);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public b m1277b(boolean z) {
            this.f1446e = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public b m1278c(@Nullable IconCompat iconCompat) {
            this.f1443b = iconCompat;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: d */
        public b m1279d(boolean z) {
            this.f1447f = z;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public b m1280e(@Nullable String str) {
            this.f1445d = str;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public b m1281f(@Nullable CharSequence charSequence) {
            this.f1442a = charSequence;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public b m1282g(@Nullable String str) {
            this.f1444c = str;
            return this;
        }
    }

    public C0246c(b bVar) {
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
    public static C0246c m1263a(@NonNull Person person) {
        return a.m1274a(person);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static C0246c m1264b(@NonNull Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new b().m1281f(bundle.getCharSequence(AuthenticationTokenClaims.JSON_KEY_NAME)).m1278c(bundle2 != null ? IconCompat.m1289b(bundle2) : null).m1282g(bundle.getString("uri")).m1280e(bundle.getString(Constants.KEY_KEY)).m1277b(bundle.getBoolean("isBot")).m1279d(bundle.getBoolean("isImportant")).m1276a();
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public IconCompat m1265c() {
        return this.f1437b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m1266d() {
        return this.f1439d;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public CharSequence m1267e() {
        return this.f1436a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !(obj instanceof C0246c)) {
            return false;
        }
        C0246c c0246c = (C0246c) obj;
        String strM1266d = m1266d();
        String strM1266d2 = c0246c.m1266d();
        if (strM1266d == null && strM1266d2 == null) {
            return Objects.equals(Objects.toString(m1267e()), Objects.toString(c0246c.m1267e())) && Objects.equals(m1268f(), c0246c.m1268f()) && Boolean.valueOf(m1269g()).equals(Boolean.valueOf(c0246c.m1269g())) && Boolean.valueOf(m1270h()).equals(Boolean.valueOf(c0246c.m1270h()));
        }
        return Objects.equals(strM1266d, strM1266d2);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public String m1268f() {
        return this.f1438c;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1269g() {
        return this.f1440e;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1270h() {
        return this.f1441f;
    }

    public int hashCode() {
        String strM1266d = m1266d();
        return strM1266d != null ? strM1266d.hashCode() : Objects.hash(m1267e(), m1268f(), Boolean.valueOf(m1269g()), Boolean.valueOf(m1270h()));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: i */
    public String m1271i() {
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
    public Person m1272j() {
        return a.m1275b(this);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public Bundle m1273k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(AuthenticationTokenClaims.JSON_KEY_NAME, this.f1436a);
        IconCompat iconCompat = this.f1437b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m1312w() : null);
        bundle.putString("uri", this.f1438c);
        bundle.putString(Constants.KEY_KEY, this.f1439d);
        bundle.putBoolean("isBot", this.f1440e);
        bundle.putBoolean("isImportant", this.f1441f);
        return bundle;
    }
}
