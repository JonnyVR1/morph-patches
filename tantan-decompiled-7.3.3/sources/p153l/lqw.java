package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.immomo.mmutil.task.C3949c;
import com.p046mm.mmfile.MMFileHelper;

/* JADX INFO: loaded from: classes7.dex */
public class lqw implements zxl {

    /* JADX INFO: renamed from: a */
    private static long f133252a;

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m155508d(fzv fzvVar) {
        try {
            gqw.m131498v("offline log --> " + fzvVar.toString());
            MMFileHelper.write(fzvVar.f101550a.m164358d().toString(), m155509e(fzvVar));
        } catch (Exception e) {
            gqw.m131497u(e);
        }
    }

    /* JADX INFO: renamed from: e */
    private static String[] m155509e(fzv fzvVar) {
        String str = TextUtils.isEmpty(fzvVar.secondLBusiness) ? "null" : fzvVar.secondLBusiness;
        String str2 = TextUtils.isEmpty(fzvVar.thirdLBusiness) ? "null" : fzvVar.thirdLBusiness;
        nqw nqwVar = fzvVar.f101551b;
        return new String[]{fzvVar.business, str, str2, nqwVar != null ? nqwVar.m164358d().toString() : "null"};
    }

    @Override // p153l.bpl
    /* JADX INFO: renamed from: a */
    public void mo105846a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f133252a < Constants.INBOX_V2_THROTTLE_WINDOW_MS) {
            gqw.m131495s("appExist, but within five minutes");
            return;
        }
        f133252a = jCurrentTimeMillis;
        MMFileHelper.forceUploadMMFile();
        gqw.m131495s("forceUploadFile ...");
    }

    @Override // p153l.zxl
    /* JADX INFO: renamed from: b */
    public void mo155510b(@NonNull final fzv fzvVar) {
        C3949c.m19427d(5, new Runnable() { // from class: l.kqw
            @Override // java.lang.Runnable
            public final void run() {
                lqw.m155508d(fzvVar);
            }
        });
    }

    @Override // p153l.bpl
    /* JADX INFO: renamed from: c */
    public void mo105847c() {
    }
}
