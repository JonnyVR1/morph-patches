package p153l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class qvq0 extends svq0 {
    public qvq0(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    /* JADX INFO: renamed from: j */
    public static qvq0 m178374j(Context context, String str, int i) {
        ouq0.m169403w("delete  messages when db size is too bigger");
        String strM203027a = vvq0.m203026c(context).m203027a(str);
        if (TextUtils.isEmpty(strM203027a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("rowDataId in (select ");
        sb.append("rowDataId from " + strM203027a);
        sb.append(" order by createTimeStamp asc limit ?)");
        return new qvq0(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    /* JADX INFO: renamed from: k */
    private void m178375k(long j) {
        String[] strArr = this.f185975i;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        strArr[0] = String.valueOf(j);
    }

    @Override // p153l.vvq0.AbstractRunnableC20940a
    /* JADX INFO: renamed from: f */
    public void mo178376f(Context context, Object obj) {
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            long jM178535a = qwq0.m178535a(m203031c());
            long j = ovq0.f149297b;
            if (jM178535a <= j) {
                ouq0.m169403w("db size is suitable");
                return;
            }
            long j2 = (long) ((((jM178535a - j) * 1.2d) / j) * jLongValue);
            m178375k(j2);
            nvq0.m164913d(context).m164921g("begin delete " + j2 + "noUpload messages , because db size is " + jM178535a + "B");
            super.mo178376f(context, obj);
        }
    }
}
