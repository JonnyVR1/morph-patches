package p153l;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.google.android.gms.internal.ads.C2216m0;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class bav0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f75734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cav0 f75735b;

    public bav0(cav0 cav0Var, boolean z) {
        this.f75734a = z;
        this.f75735b = cav0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        dct0.m115295d("Failed to get signals bundle");
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
    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listUnmodifiableList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        zzbcn zzbcnVar;
        Bundle bundle = (Bundle) obj;
        if (this.f75735b.m115137a()) {
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
            final zzbec zzbecVarM108510c = cav0.m108510c(this.f75735b, bundle);
            final C2216m0 c2216m0M108509b = cav0.m108509b(this.f75735b, bundle);
            cav0 cav0Var = this.f75735b;
            final boolean z = this.f75734a;
            cav0Var.f85930b.m153463a(new kbw0() { // from class: l.aav0
                @Override // p153l.kbw0
                public final Object zza(Object obj3) {
                    bav0 bav0Var = this.f69175a;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (bav0Var.f75735b.m115137a()) {
                        return null;
                    }
                    zzbec zzbecVar = zzbecVarM108510c;
                    C2216m0 c2216m0 = c2216m0M108509b;
                    ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrM108512f = cav0.m108512f(bav0Var.f75735b, z2, arrayList2, c2216m0, zzbecVar);
                    fav0.m124789g(sQLiteDatabase, z2, true);
                    fav0.m124786d(sQLiteDatabase, bav0Var.f75735b.f80626f.m195135d(), bArrM108512f);
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
        final zzbec zzbecVarM108510c2 = cav0.m108510c(this.f75735b, bundle);
        final C2216m0 c2216m0M108509b2 = cav0.m108509b(this.f75735b, bundle);
        cav0 cav0Var2 = this.f75735b;
        final boolean z2 = this.f75734a;
        cav0Var2.f85930b.m153463a(new kbw0() { // from class: l.aav0
            @Override // p153l.kbw0
            public final Object zza(Object obj4) {
                bav0 bav0Var = this.f69175a;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (bav0Var.f75735b.m115137a()) {
                    return null;
                }
                zzbec zzbecVar = zzbecVarM108510c2;
                C2216m0 c2216m0 = c2216m0M108509b2;
                ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrM108512f = cav0.m108512f(bav0Var.f75735b, z3, arrayList3, c2216m0, zzbecVar);
                fav0.m124789g(sQLiteDatabase, z3, true);
                fav0.m124786d(sQLiteDatabase, bav0Var.f75735b.f80626f.m195135d(), bArrM108512f);
                return null;
            }
        });
    }
}
