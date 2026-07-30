package p153l;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2379y;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ixr0 {

    /* JADX INFO: renamed from: a */
    public final String f117455a;

    /* JADX INFO: renamed from: b */
    public long f117456b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ opr0 f117457c;

    public ixr0(opr0 opr0Var, String str) {
        this.f117457c = opr0Var;
        Preconditions.checkNotEmpty(str);
        this.f117455a = str;
    }

    /* JADX INFO: renamed from: a */
    public final List<evr0> m142590a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = this.f117457c.m168765v().query("raw_events", new String[]{"rowid", AuthenticationTokenClaims.JSON_KEY_NAME, "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f117455a, String.valueOf(this.f117456b)}, null, null, "rowid", Constants.DEFAULT_UIN);
                if (!cursorQuery.moveToFirst()) {
                    List<evr0> list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                do {
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(3);
                    boolean z = cursorQuery.getLong(5) == 1;
                    byte[] blob = cursorQuery.getBlob(4);
                    if (j > this.f117456b) {
                        this.f117456b = j;
                    }
                    try {
                        C2379y.a aVar = (C2379y.a) vmy0.m201859K(C2379y.m14548V(), blob);
                        String string = cursorQuery.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        aVar.m14564D(string).m14566G(cursorQuery.getLong(2));
                        arrayList.add(new evr0(j, j2, z, (C2379y) ((AbstractC2372u0) aVar.mo14423H())));
                    } catch (IOException e) {
                        this.f117457c.zzj().m114558A().m153302c("Data loss. Failed to merge raw event. appId", d6x0.m114551p(this.f117455a), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.f117457c.zzj().m114558A().m153302c("Data loss. Error querying raw events batch. appId", d6x0.m114551p(this.f117455a), e2);
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
