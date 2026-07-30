package p153l;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class rvq0 extends vvq0.AbstractC20941b<Long> {

    /* JADX INFO: renamed from: p */
    private long f165050p;

    /* JADX INFO: renamed from: q */
    private String f165051q;

    public rvq0(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f165050p = 0L;
        this.f165051q = str6;
    }

    /* JADX INFO: renamed from: l */
    public static rvq0 m183305l(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new rvq0(str, arrayList, null, null, null, null, null, 0, "job to get count of all message");
    }

    @Override // p153l.vvq0.AbstractRunnableC20940a
    /* JADX INFO: renamed from: b */
    public Object mo183306b() {
        return Long.valueOf(this.f165050p);
    }

    @Override // p153l.vvq0.AbstractC20941b
    /* JADX INFO: renamed from: j */
    public void mo183308j(Context context, List<Long> list) {
        if (context == null || list == null || list.size() <= 0) {
            return;
        }
        this.f165050p = list.get(0).longValue();
    }

    @Override // p153l.vvq0.AbstractC20941b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long mo183307i(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }
}
