package p153l;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fzv {

    /* JADX INFO: renamed from: a */
    nqw f101550a;

    /* JADX INFO: renamed from: b */
    nqw f101551b;

    @Expose
    String business;

    @Expose
    boolean needRealtime = false;

    @Expose
    String secondLBusiness;

    @Expose
    String thirdLBusiness;

    public fzv(String str) {
        this.business = str;
    }

    /* JADX INFO: renamed from: a */
    public fzv m128336a(ayl aylVar) {
        if (this.f101550a == null) {
            this.f101550a = new nqw();
        }
        this.f101550a.m164356a(aylVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public fzv m128337b(ayl aylVar) {
        if (this.f101551b == null) {
            this.f101551b = new nqw();
        }
        this.f101551b.m164356a(aylVar);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m128338c() {
        if (!(this.needRealtime && gqw.m131493q()) && (this.needRealtime || !gqw.m131492p())) {
            gqw.m131499w("commit but mulog disabled");
        } else {
            gzv.m133125e().m133129d(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public fzv m128339d(boolean z) {
        this.needRealtime = z;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public fzv m128340e(String str) {
        this.secondLBusiness = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public fzv m128341f(String str) {
        this.thirdLBusiness = str;
        return this;
    }

    @NonNull
    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("business", this.business);
            jSONObject.put("secondLBusiness", this.secondLBusiness);
            jSONObject.put("thirdLBusiness", this.thirdLBusiness);
            nqw nqwVar = this.f101550a;
            jSONObject.put("body", nqwVar != null ? nqwVar.m164358d() : new JSONObject());
            nqw nqwVar2 = this.f101551b;
            jSONObject.put("extra", nqwVar2 != null ? nqwVar2.m164358d() : new JSONObject());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return WeJson.EMPTY_MAP;
        }
    }
}
