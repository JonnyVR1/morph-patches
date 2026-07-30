package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.data.FaceidLiveData;
import com.p051p1.mobile.putong.data.IdCard;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class yc2 {

    /* JADX INFO: renamed from: f */
    public static yc2 f198381f;

    /* JADX INFO: renamed from: a */
    public AppealInfo f198382a;

    /* JADX INFO: renamed from: b */
    public FaceidLiveData f198383b;

    /* JADX INFO: renamed from: c */
    public IdCard f198384c;

    /* JADX INFO: renamed from: d */
    public String f198385d;

    /* JADX INFO: renamed from: e */
    public String f198386e;

    /* JADX INFO: renamed from: e */
    public static yc2 m215118e() {
        if (f198381f == null) {
            synchronized (yc2.class) {
                try {
                    if (f198381f == null) {
                        f198381f = new yc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f198381f;
    }

    /* JADX INFO: renamed from: a */
    public AppealInfo m215119a() {
        return this.f198382a;
    }

    /* JADX INFO: renamed from: b */
    public String m215120b() {
        if (!NullChecker.m82486a(this.f198382a)) {
            return "no_appeal";
        }
        AppealInfo appealInfo = this.f198382a;
        return (appealInfo.allowAppeal && TextUtils.equals(appealInfo.status, "inProgress")) ? "under_review" : "no_appeal";
    }

    /* JADX INFO: renamed from: c */
    public FaceidLiveData m215121c() {
        return this.f198383b;
    }

    /* JADX INFO: renamed from: d */
    public IdCard m215122d() {
        return this.f198384c;
    }

    /* JADX INFO: renamed from: f */
    public String m215123f() {
        return this.f198385d;
    }

    /* JADX INFO: renamed from: g */
    public String m215124g() {
        return this.f198386e;
    }

    /* JADX INFO: renamed from: h */
    public void m215125h(AppealInfo appealInfo) {
        this.f198382a = appealInfo;
    }

    /* JADX INFO: renamed from: i */
    public void m215126i(FaceidLiveData faceidLiveData) {
        this.f198383b = faceidLiveData;
    }

    /* JADX INFO: renamed from: j */
    public void m215127j(IdCard idCard) {
        this.f198384c = idCard;
    }

    /* JADX INFO: renamed from: k */
    public void m215128k(String str) {
        this.f198385d = str;
    }

    /* JADX INFO: renamed from: l */
    public void m215129l(String str) {
        this.f198386e = str;
    }
}
