package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.C2279u;
import com.google.android.gms.internal.ads.C2287v;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class njw0 {

    /* JADX INFO: renamed from: a */
    public final File f142361a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final File f142362b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f142363c;

    /* JADX INFO: renamed from: d */
    public final int f142364d;

    public njw0(@NonNull Context context, int i) {
        this.f142363c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        ojw0.m167968a(dir, false);
        this.f142361a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        ojw0.m167968a(dir2, true);
        this.f142362b = dir2;
        this.f142364d = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX INFO: renamed from: a */
    public final boolean m163476a(@NonNull C2279u c2279u, @Nullable rjw0 rjw0Var) {
        boolean z;
        String strM13423U = c2279u.m13386N().m13423U();
        byte[] bArrZzA = c2279u.m13388P().zzA();
        byte[] bArrZzA2 = c2279u.m13387O().zzA();
        if (!TextUtils.isEmpty(strM13423U) && bArrZzA2 != null && bArrZzA2.length != 0) {
            ojw0.m167971d(this.f142362b);
            this.f142362b.mkdirs();
            ojw0.m167970c(strM13423U, this.f142362b).mkdirs();
            File fileM167969b = ojw0.m167969b(strM13423U, "pcam.jar", this.f142362b);
            if ((bArrZzA == null || bArrZzA.length <= 0 || ojw0.m167972e(fileM167969b, bArrZzA)) && ojw0.m167972e(ojw0.m167969b(strM13423U, "pcbc", this.f142362b), bArrZzA2)) {
                File fileM167969b2 = ojw0.m167969b(c2279u.m13386N().m13423U(), "pcam.jar", this.f142362b);
                if (fileM167969b2.exists() && rjw0Var != null && !rjw0Var.mo107724a(fileM167969b2)) {
                    return false;
                }
                String strM13423U2 = c2279u.m13386N().m13423U();
                if (TextUtils.isEmpty(strM13423U2)) {
                    z = false;
                } else {
                    File fileM167969b3 = ojw0.m167969b(strM13423U2, "pcam.jar", this.f142362b);
                    File fileM167969b4 = ojw0.m167969b(strM13423U2, "pcbc", this.f142362b);
                    File fileM167969b5 = ojw0.m167969b(strM13423U2, "pcam.jar", m163479d());
                    File fileM167969b6 = ojw0.m167969b(strM13423U2, "pcbc", m163479d());
                    if ((!fileM167969b3.exists() || fileM167969b3.renameTo(fileM167969b5)) && fileM167969b4.exists() && fileM167969b4.renameTo(fileM167969b6)) {
                        o6s0 o6s0VarM13409O = C2287v.m13409O();
                        o6s0VarM13409O.m166291u(c2279u.m13386N().m13423U());
                        o6s0VarM13409O.m166287q(c2279u.m13386N().m13422T());
                        o6s0VarM13409O.m166288r(c2279u.m13386N().m13419L());
                        o6s0VarM13409O.m166290t(c2279u.m13386N().m13421N());
                        o6s0VarM13409O.m166289s(c2279u.m13386N().m13420M());
                        C2287v c2287v = (C2287v) o6s0VarM13409O.m185950m();
                        C2287v c2287vM163477b = m163477b(1);
                        SharedPreferences.Editor editorEdit = this.f142363c.edit();
                        if (c2287vM163477b != null && !c2287v.m13423U().equals(c2287vM163477b.m13423U())) {
                            editorEdit.putString(m163480e(), Hex.bytesToStringLowercase(c2287vM163477b.m12798h()));
                        }
                        editorEdit.putString(m163481f(), Hex.bytesToStringLowercase(c2287v.m12798h()));
                        if (editorEdit.commit()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                HashSet hashSet = new HashSet();
                C2287v c2287vM163477b2 = m163477b(1);
                if (c2287vM163477b2 != null) {
                    hashSet.add(c2287vM163477b2.m13423U());
                }
                C2287v c2287vM163477b3 = m163477b(2);
                if (c2287vM163477b3 != null) {
                    hashSet.add(c2287vM163477b3.m13423U());
                }
                for (File file : m163479d().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        ojw0.m167971d(ojw0.m167970c(name, m163479d()));
                    }
                }
                return z;
            }
        }
        return false;
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public final C2287v m163477b(int i) {
        SharedPreferences sharedPreferences = this.f142363c;
        String string = i == 1 ? sharedPreferences.getString(m163481f(), null) : sharedPreferences.getString(m163480e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.zzb;
            C2287v c2287vM13412R = C2287v.m13412R(zzgyl.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strM13423U = c2287vM13412R.m13423U();
            File fileM167969b = ojw0.m167969b(strM13423U, "pcam.jar", m163479d());
            if (!fileM167969b.exists()) {
                fileM167969b = ojw0.m167969b(strM13423U, "pcam", m163479d());
            }
            File fileM167969b2 = ojw0.m167969b(strM13423U, "pcbc", m163479d());
            if (fileM167969b.exists() && fileM167969b2.exists()) {
                return c2287vM13412R;
            }
            return null;
        } catch (zzhag unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final mjw0 m163478c(int i) {
        C2287v c2287vM163477b = m163477b(1);
        if (c2287vM163477b == null) {
            return null;
        }
        String strM13423U = c2287vM163477b.m13423U();
        File fileM167969b = ojw0.m167969b(strM13423U, "pcam.jar", m163479d());
        if (!fileM167969b.exists()) {
            fileM167969b = ojw0.m167969b(strM13423U, "pcam", m163479d());
        }
        return new mjw0(c2287vM163477b, fileM167969b, ojw0.m167969b(strM13423U, "pcbc", m163479d()), ojw0.m167969b(strM13423U, "pcopt", m163479d()));
    }

    /* JADX INFO: renamed from: d */
    public final File m163479d() {
        File file = new File(this.f142361a, Integer.toString(this.f142364d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public final String m163480e() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.f142364d - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m163481f() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.f142364d - 1);
        return sb.toString();
    }
}
