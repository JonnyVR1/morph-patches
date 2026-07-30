package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.immomo.mmutil.task.C3804c;
import com.p041mm.mmfile.MMFileHelper;

/* JADX INFO: loaded from: classes7.dex */
public class nnw implements hvl {

    /* JADX INFO: renamed from: a */
    private static long f139791a;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m160371d(gxv gxvVar) {
        try {
            inw.m137184v("offline log --> " + gxvVar.toString());
            MMFileHelper.write(gxvVar.f104928a.m170471d().toString(), m160372e(gxvVar));
        } catch (Exception e) {
            inw.m137183u(e);
        }
    }

    /* JADX INFO: renamed from: e */
    private static String[] m160372e(gxv gxvVar) {
        String str = TextUtils.isEmpty(gxvVar.secondLBusiness) ? "null" : gxvVar.secondLBusiness;
        String str2 = TextUtils.isEmpty(gxvVar.thirdLBusiness) ? "null" : gxvVar.thirdLBusiness;
        pnw pnwVar = gxvVar.f104929b;
        return new String[]{gxvVar.business, str, str2, pnwVar != null ? pnwVar.m170471d().toString() : "null"};
    }

    @Override // p149l.hvl
    /* JADX INFO: renamed from: a */
    public void mo133190a(@NonNull final gxv gxvVar) {
        C3804c.m18444d(5, new Runnable() { // from class: l.mnw
            @Override // java.lang.Runnable
            public final void run() {
                nnw.m160371d(gxvVar);
            }
        });
    }

    @Override // p149l.qml
    /* JADX INFO: renamed from: b */
    public void mo160373b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f139791a < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            inw.m137181s("appExist, but within five minutes");
            return;
        }
        f139791a = jCurrentTimeMillis;
        MMFileHelper.forceUploadMMFile();
        inw.m137181s("forceUploadFile ...");
    }

    @Override // p149l.qml
    /* JADX INFO: renamed from: c */
    public void mo160374c() {
    }
}
