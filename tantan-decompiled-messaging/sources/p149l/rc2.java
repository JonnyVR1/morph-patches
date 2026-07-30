package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.data.FaceidLiveData;
import com.p046p1.mobile.putong.data.IdCard;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class rc2 {

    /* JADX INFO: renamed from: f */
    public static rc2 f158705f;

    /* JADX INFO: renamed from: a */
    public AppealInfo f158706a;

    /* JADX INFO: renamed from: b */
    public FaceidLiveData f158707b;

    /* JADX INFO: renamed from: c */
    public IdCard f158708c;

    /* JADX INFO: renamed from: d */
    public String f158709d;

    /* JADX INFO: renamed from: e */
    public String f158710e;

    /* JADX INFO: renamed from: e */
    public static rc2 m178723e() {
        if (f158705f == null) {
            synchronized (rc2.class) {
                try {
                    if (f158705f == null) {
                        f158705f = new rc2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f158705f;
    }

    /* JADX INFO: renamed from: a */
    public AppealInfo m178724a() {
        return this.f158706a;
    }

    /* JADX INFO: renamed from: b */
    public String m178725b() {
        if (!NullChecker.m81303a(this.f158706a)) {
            return "no_appeal";
        }
        AppealInfo appealInfo = this.f158706a;
        return (appealInfo.allowAppeal && TextUtils.equals(appealInfo.status, "inProgress")) ? "under_review" : "no_appeal";
    }

    /* JADX INFO: renamed from: c */
    public FaceidLiveData m178726c() {
        return this.f158707b;
    }

    /* JADX INFO: renamed from: d */
    public IdCard m178727d() {
        return this.f158708c;
    }

    /* JADX INFO: renamed from: f */
    public String m178728f() {
        return this.f158709d;
    }

    /* JADX INFO: renamed from: g */
    public String m178729g() {
        return this.f158710e;
    }

    /* JADX INFO: renamed from: h */
    public void m178730h(AppealInfo appealInfo) {
        this.f158706a = appealInfo;
    }

    /* JADX INFO: renamed from: i */
    public void m178731i(FaceidLiveData faceidLiveData) {
        this.f158707b = faceidLiveData;
    }

    /* JADX INFO: renamed from: j */
    public void m178732j(IdCard idCard) {
        this.f158708c = idCard;
    }

    /* JADX INFO: renamed from: k */
    public void m178733k(String str) {
        this.f158709d = str;
    }

    /* JADX INFO: renamed from: l */
    public void m178734l(String str) {
        this.f158710e = str;
    }
}
