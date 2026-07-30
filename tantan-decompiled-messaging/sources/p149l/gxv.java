package p149l;

import androidx.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class gxv {

    /* JADX INFO: renamed from: a */
    pnw f104928a;

    /* JADX INFO: renamed from: b */
    pnw f104929b;

    @Expose
    String business;

    @Expose
    boolean needRealtime = false;

    @Expose
    String secondLBusiness;

    @Expose
    String thirdLBusiness;

    public gxv(String str) {
        this.business = str;
    }

    /* JADX INFO: renamed from: a */
    public gxv m128645a(ivl ivlVar) {
        if (this.f104928a == null) {
            this.f104928a = new pnw();
        }
        this.f104928a.m170469a(ivlVar);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public gxv m128646b(ivl ivlVar) {
        if (this.f104929b == null) {
            this.f104929b = new pnw();
        }
        this.f104929b.m170469a(ivlVar);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m128647c() {
        if (!(this.needRealtime && inw.m137179q()) && (this.needRealtime || !inw.m137178p())) {
            inw.m137185w("commit but mulog disabled");
        } else {
            hxv.m133419e().m133423d(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public gxv m128648d(boolean z) {
        this.needRealtime = z;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public gxv m128649e(String str) {
        this.secondLBusiness = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public gxv m128650f(String str) {
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
            pnw pnwVar = this.f104928a;
            jSONObject.put("body", pnwVar != null ? pnwVar.m170471d() : new JSONObject());
            pnw pnwVar2 = this.f104929b;
            jSONObject.put("extra", pnwVar2 != null ? pnwVar2.m170471d() : new JSONObject());
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return WeJson.EMPTY_MAP;
        }
    }
}
