package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.ads.C2256u;
import com.google.android.gms.internal.ads.C2264v;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class haw0 {

    /* JADX INFO: renamed from: a */
    public final File f106852a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final File f106853b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f106854c;

    /* JADX INFO: renamed from: d */
    public final int f106855d;

    public haw0(@NonNull Context context, int i) {
        this.f106854c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        iaw0.m135207a(dir, false);
        this.f106852a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        iaw0.m135207a(dir2, true);
        this.f106853b = dir2;
        this.f106855d = i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087  */
    /* JADX INFO: renamed from: a */
    public final boolean m130245a(@NonNull C2256u c2256u, @Nullable law0 law0Var) {
        boolean z;
        String strM13369U = c2256u.m13332N().m13369U();
        byte[] bArrZzA = c2256u.m13334P().zzA();
        byte[] bArrZzA2 = c2256u.m13333O().zzA();
        if (!TextUtils.isEmpty(strM13369U) && bArrZzA2 != null && bArrZzA2.length != 0) {
            iaw0.m135210d(this.f106853b);
            this.f106853b.mkdirs();
            iaw0.m135209c(strM13369U, this.f106853b).mkdirs();
            File fileM135208b = iaw0.m135208b(strM13369U, "pcam.jar", this.f106853b);
            if ((bArrZzA == null || bArrZzA.length <= 0 || iaw0.m135211e(fileM135208b, bArrZzA)) && iaw0.m135211e(iaw0.m135208b(strM13369U, "pcbc", this.f106853b), bArrZzA2)) {
                File fileM135208b2 = iaw0.m135208b(c2256u.m13332N().m13369U(), "pcam.jar", this.f106853b);
                if (fileM135208b2.exists() && law0Var != null && !law0Var.mo149181a(fileM135208b2)) {
                    return false;
                }
                String strM13369U2 = c2256u.m13332N().m13369U();
                if (TextUtils.isEmpty(strM13369U2)) {
                    z = false;
                } else {
                    File fileM135208b3 = iaw0.m135208b(strM13369U2, "pcam.jar", this.f106853b);
                    File fileM135208b4 = iaw0.m135208b(strM13369U2, "pcbc", this.f106853b);
                    File fileM135208b5 = iaw0.m135208b(strM13369U2, "pcam.jar", m130248d());
                    File fileM135208b6 = iaw0.m135208b(strM13369U2, "pcbc", m130248d());
                    if ((!fileM135208b3.exists() || fileM135208b3.renameTo(fileM135208b5)) && fileM135208b4.exists() && fileM135208b4.renameTo(fileM135208b6)) {
                        ixr0 ixr0VarM13355O = C2264v.m13355O();
                        ixr0VarM13355O.m138896u(c2256u.m13332N().m13369U());
                        ixr0VarM13355O.m138892q(c2256u.m13332N().m13368T());
                        ixr0VarM13355O.m138893r(c2256u.m13332N().m13365L());
                        ixr0VarM13355O.m138895t(c2256u.m13332N().m13367N());
                        ixr0VarM13355O.m138894s(c2256u.m13332N().m13366M());
                        C2264v c2264v = (C2264v) ixr0VarM13355O.m153521m();
                        C2264v c2264vM130246b = m130246b(1);
                        SharedPreferences.Editor editorEdit = this.f106854c.edit();
                        if (c2264vM130246b != null && !c2264v.m13369U().equals(c2264vM130246b.m13369U())) {
                            editorEdit.putString(m130249e(), Hex.bytesToStringLowercase(c2264vM130246b.m12744h()));
                        }
                        editorEdit.putString(m130250f(), Hex.bytesToStringLowercase(c2264v.m12744h()));
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
                C2264v c2264vM130246b2 = m130246b(1);
                if (c2264vM130246b2 != null) {
                    hashSet.add(c2264vM130246b2.m13369U());
                }
                C2264v c2264vM130246b3 = m130246b(2);
                if (c2264vM130246b3 != null) {
                    hashSet.add(c2264vM130246b3.m13369U());
                }
                for (File file : m130248d().listFiles()) {
                    String name = file.getName();
                    if (!hashSet.contains(name)) {
                        iaw0.m135210d(iaw0.m135209c(name, m130248d()));
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
    public final C2264v m130246b(int i) {
        SharedPreferences sharedPreferences = this.f106854c;
        String string = i == 1 ? sharedPreferences.getString(m130250f(), null) : sharedPreferences.getString(m130249e(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgyl zzgylVar = zzgyl.zzb;
            C2264v c2264vM13358R = C2264v.m13358R(zzgyl.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strM13369U = c2264vM13358R.m13369U();
            File fileM135208b = iaw0.m135208b(strM13369U, "pcam.jar", m130248d());
            if (!fileM135208b.exists()) {
                fileM135208b = iaw0.m135208b(strM13369U, "pcam", m130248d());
            }
            File fileM135208b2 = iaw0.m135208b(strM13369U, "pcbc", m130248d());
            if (fileM135208b.exists() && fileM135208b2.exists()) {
                return c2264vM13358R;
            }
            return null;
        } catch (zzhag unused) {
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final gaw0 m130247c(int i) {
        C2264v c2264vM130246b = m130246b(1);
        if (c2264vM130246b == null) {
            return null;
        }
        String strM13369U = c2264vM130246b.m13369U();
        File fileM135208b = iaw0.m135208b(strM13369U, "pcam.jar", m130248d());
        if (!fileM135208b.exists()) {
            fileM135208b = iaw0.m135208b(strM13369U, "pcam", m130248d());
        }
        return new gaw0(c2264vM130246b, fileM135208b, iaw0.m135208b(strM13369U, "pcbc", m130248d()), iaw0.m135208b(strM13369U, "pcopt", m130248d()));
    }

    /* JADX INFO: renamed from: d */
    public final File m130248d() {
        File file = new File(this.f106852a, Integer.toString(this.f106855d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    /* JADX INFO: renamed from: e */
    public final String m130249e() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.f106855d - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public final String m130250f() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.f106855d - 1);
        return sb.toString();
    }
}
