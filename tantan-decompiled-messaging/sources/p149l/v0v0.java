package p149l;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C2193m0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class v0v0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f179145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w0v0 f179146b;

    public v0v0(w0v0 w0v0Var, boolean z) {
        this.f179145a = z;
        this.f179146b = w0v0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        x2t0.m206866d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        zzbcn zzbcnVar;
        Bundle bundle = (Bundle) obj;
        if (this.f179146b.m206653a()) {
            return;
        }
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listUnmodifiableList = Collections.EMPTY_LIST;
            }
            arrayList = new ArrayList();
            it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        zzbcnVar = zzbcn.BANNER;
                        break;
                    case "native":
                        zzbcnVar = zzbcn.NATIVE_APP_INSTALL;
                        break;
                    case "rewarded":
                        zzbcnVar = zzbcn.REWARD_BASED_VIDEO_AD;
                        break;
                    case "interstitial":
                        zzbcnVar = zzbcn.INTERSTITIAL;
                        break;
                    default:
                        zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                        break;
                }
                arrayList.add(zzbcnVar);
            }
            final zzbec zzbecVarM200904c = w0v0.m200904c(this.f179146b, bundle);
            final C2193m0 c2193m0M200903b = w0v0.m200903b(this.f179146b, bundle);
            w0v0 w0v0Var = this.f179146b;
            final boolean z = this.f179145a;
            w0v0Var.f188997b.m119057a(new e2w0() { // from class: l.u0v0
                @Override // p149l.e2w0
                public final Object zza(Object obj3) {
                    v0v0 v0v0Var = this.f172949a;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (v0v0Var.f179146b.m206653a()) {
                        return null;
                    }
                    zzbec zzbecVar = zzbecVarM200904c;
                    C2193m0 c2193m0 = c2193m0M200903b;
                    ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrM200906f = w0v0.m200906f(v0v0Var.f179146b, z2, arrayList2, c2193m0, zzbecVar);
                    z0v0.m216767g(sQLiteDatabase, z2, true);
                    z0v0.m216764d(sQLiteDatabase, v0v0Var.f179146b.f183957f.m162180d(), bArrM200906f);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        zzbcnVar = zzbcn.BANNER;
                    } else {
                        zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals("native")) {
                        zzbcnVar = zzbcn.NATIVE_APP_INSTALL;
                    } else {
                        zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case -239580146:
                    if (!r1.equals("rewarded")) {
                        zzbcnVar = zzbcn.REWARD_BASED_VIDEO_AD;
                    } else {
                        zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                case 604727084:
                    if (!r1.equals("interstitial")) {
                        zzbcnVar = zzbcn.INTERSTITIAL;
                    } else {
                        zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                    }
                    break;
                default:
                    zzbcnVar = zzbcn.AD_FORMAT_TYPE_UNSPECIFIED;
                    break;
            }
            arrayList.add(zzbcnVar);
        }
        final zzbec zzbecVarM200904c2 = w0v0.m200904c(this.f179146b, bundle);
        final C2193m0 c2193m0M200903b2 = w0v0.m200903b(this.f179146b, bundle);
        w0v0 w0v0Var2 = this.f179146b;
        final boolean z2 = this.f179145a;
        w0v0Var2.f188997b.m119057a(new e2w0() { // from class: l.u0v0
            @Override // p149l.e2w0
            public final Object zza(Object obj4) {
                v0v0 v0v0Var = this.f172949a;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (v0v0Var.f179146b.m206653a()) {
                    return null;
                }
                zzbec zzbecVar = zzbecVarM200904c2;
                C2193m0 c2193m0 = c2193m0M200903b2;
                ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrM200906f = w0v0.m200906f(v0v0Var.f179146b, z3, arrayList3, c2193m0, zzbecVar);
                z0v0.m216767g(sQLiteDatabase, z3, true);
                z0v0.m216764d(sQLiteDatabase, v0v0Var.f179146b.f183957f.m162180d(), bArrM200906f);
                return null;
            }
        });
    }
}
