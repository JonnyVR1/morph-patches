package p149l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class kmq0 extends mmq0 {
    public kmq0(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    /* JADX INFO: renamed from: j */
    public static kmq0 m146551j(Context context, String str, int i) {
        ilq0.m137050w("delete  messages when db size is too bigger");
        String strM170365a = pmq0.m170364c(context).m170365a(str);
        if (TextUtils.isEmpty(strM170365a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("rowDataId in (select ");
        sb.append("rowDataId from " + strM170365a);
        sb.append(" order by createTimeStamp asc limit ?)");
        return new kmq0(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    /* JADX INFO: renamed from: k */
    private void m146552k(long j) {
        String[] strArr = this.f150282i;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j);
    }

    @Override // p149l.pmq0.AbstractRunnableC19283a
    /* JADX INFO: renamed from: f */
    public void mo146553f(Context context, Object obj) {
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            long jM146588a = knq0.m146588a(m170369c());
            long j = imq0.f113955b;
            if (jM146588a <= j) {
                ilq0.m137050w("db size is suitable");
                return;
            }
            long j2 = (long) ((((jM146588a - j) * 1.2d) / j) * jLongValue);
            m146552k(j2);
            hmq0.m131742d(context).m131750g("begin delete " + j2 + "noUpload messages , because db size is " + jM146588a + "B");
            super.mo146553f(context, obj);
        }
    }
}
