package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.data.FaceidLiveData;
import com.p1.mobile.putong.data.IdCard;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rc2 {

    /* JADX INFO: renamed from: f */
    public static rc2 f19727f;

    /* JADX INFO: renamed from: a */
    public AppealInfo f19728a;

    /* JADX INFO: renamed from: b */
    public FaceidLiveData f19729b;

    /* JADX INFO: renamed from: c */
    public IdCard f19730c;

    /* JADX INFO: renamed from: d */
    public String f19731d;

    /* JADX INFO: renamed from: e */
    public String f19732e;

    /* JADX INFO: renamed from: e */
    public static rc2 m21492e() {
        if (f19727f == null) {
            synchronized (rc2.class) {
                try {
                    if (f19727f == null) {
                        f19727f = new rc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19727f;
    }

    /* JADX INFO: renamed from: a */
    public AppealInfo m21493a() {
        return this.f19728a;
    }

    /* JADX INFO: renamed from: b */
    public String m21494b() {
        if (!NullChecker.a(this.f19728a)) {
            return "no_appeal";
        }
        AppealInfo appealInfo = this.f19728a;
        return (appealInfo.allowAppeal && TextUtils.equals(appealInfo.status, "inProgress")) ? "under_review" : "no_appeal";
    }

    /* JADX INFO: renamed from: c */
    public FaceidLiveData m21495c() {
        return this.f19729b;
    }

    /* JADX INFO: renamed from: d */
    public IdCard m21496d() {
        return this.f19730c;
    }

    /* JADX INFO: renamed from: f */
    public String m21497f() {
        return this.f19731d;
    }

    /* JADX INFO: renamed from: g */
    public String m21498g() {
        return this.f19732e;
    }

    /* JADX INFO: renamed from: h */
    public void m21499h(AppealInfo appealInfo) {
        this.f19728a = appealInfo;
    }

    /* JADX INFO: renamed from: i */
    public void m21500i(FaceidLiveData faceidLiveData) {
        this.f19729b = faceidLiveData;
    }

    /* JADX INFO: renamed from: j */
    public void m21501j(IdCard idCard) {
        this.f19730c = idCard;
    }

    /* JADX INFO: renamed from: k */
    public void m21502k(String str) {
        this.f19731d = str;
    }

    /* JADX INFO: renamed from: l */
    public void m21503l(String str) {
        this.f19732e = str;
    }
}
