package p149l;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lmq0 extends pmq0.AbstractC19284b<Long> {

    /* JADX INFO: renamed from: p */
    private long f128816p;

    /* JADX INFO: renamed from: q */
    private String f128817q;

    public lmq0(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f128816p = 0L;
        this.f128817q = str6;
    }

    /* JADX INFO: renamed from: l */
    public static lmq0 m150596l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new lmq0(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    @Override // p149l.pmq0.AbstractRunnableC19283a
    /* JADX INFO: renamed from: b */
    public Object mo150597b() {
        return Long.valueOf(this.f128816p);
    }

    @Override // p149l.pmq0.AbstractC19284b
    /* JADX INFO: renamed from: j */
    public void mo150599j(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.f128816p = list.get(0).longValue();
    }

    @Override // p149l.pmq0.AbstractC19284b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long mo150598i(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
