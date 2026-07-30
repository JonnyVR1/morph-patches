package p149l;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2356y;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cor0 {

    /* JADX INFO: renamed from: a */
    public final String f81858a;

    /* JADX INFO: renamed from: b */
    public long f81859b = -1;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ igr0 f81860c;

    public cor0(igr0 igr0Var, String str) {
        this.f81860c = igr0Var;
        Preconditions.checkNotEmpty(str);
        this.f81858a = str;
    }

    /* JADX INFO: renamed from: a */
    public final List<ylr0> m108030a() {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = this.f81860c.m136166v().query("raw_events", new String[]{"rowid", AuthenticationTokenClaims.JSON_KEY_NAME, "timestamp", "metadata_fingerprint", "data", "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f81858a, String.valueOf(this.f81859b)}, null, null, "rowid", Constants.DEFAULT_UIN);
                if (!cursorQuery.moveToFirst()) {
                    List<ylr0> list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                do {
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(3);
                    boolean z = cursorQuery.getLong(5) == 1;
                    byte[] blob = cursorQuery.getBlob(4);
                    if (j > this.f81859b) {
                        this.f81859b = j;
                    }
                    try {
                        C2356y.a aVar = (C2356y.a) pdy0.m168454K(C2356y.m14494V(), blob);
                        String string = cursorQuery.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        aVar.m14510D(string).m14512G(cursorQuery.getLong(2));
                        arrayList.add(new ylr0(j, j2, z, (C2356y) ((AbstractC2349u0) aVar.mo14369H())));
                    } catch (IOException e) {
                        this.f81860c.zzj().m211412A().m123938c("Data loss. Failed to merge raw event. appId", xww0.m211405p(this.f81858a), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e2) {
                this.f81860c.zzj().m211412A().m123938c("Data loss. Error querying raw events batch. appId", xww0.m211405p(this.f81858a), e2);
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
