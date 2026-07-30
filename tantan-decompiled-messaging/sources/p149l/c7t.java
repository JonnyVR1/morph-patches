package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class c7t<T extends BaseLiveBean> extends vvr<T> {

    /* JADX INFO: renamed from: b */
    public String f79646b;

    /* JADX INFO: renamed from: c */
    public Class<T> f79647c;

    public c7t(Class<T> cls, String str) {
        this.f79647c = cls;
        this.f79646b = str;
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public T parse(InputStream inputStream, String str) throws IOException {
        String str2 = INetParser.STRING_PARSER.parse(inputStream, str);
        String strM200205a = m200205a();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            T tNewInstance = TextUtils.isEmpty(this.f79646b) ? (T) SafeJsonUtil.getInstance().fromJson(jSONObject.optString("data"), (Class) this.f79647c) : (T) SafeJsonUtil.getInstance().fromJson(jSONObject.optJSONObject("data").optString(this.f79646b), (Class) this.f79647c);
            if (tNewInstance == null) {
                tNewInstance = this.f79647c.newInstance();
            }
            if (jSONObjectOptJSONObject != null) {
                tNewInstance.setCode(jSONObjectOptJSONObject.optInt("code"));
                tNewInstance.setMsg(jSONObjectOptJSONObject.optString("message"));
            }
            if (this.f79647c == BaseLiveBean.class) {
                tNewInstance.setData(jSONObject.optString("data"));
            }
            tNewInstance.setPagination((PaginationBean) SafeJsonUtil.getInstance().fromJson(jSONObject.optString(Pagination.TYPE), PaginationBean.class));
            if (tNewInstance.getPagination() != null) {
                PaginationBean.normalize(tNewInstance.getPagination().getLinks());
            }
            return tNewInstance;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            ccw0.m106203a("LIVE JSON PARSER ERROR", strM200205a, "---", e.getMessage());
            return null;
        }
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
        return (T) parse(inputStream, str);
    }

    /* JADX INFO: renamed from: e */
    public void m105637e(T t, OutputStream outputStream) {
        String json = SafeJsonUtil.getInstance().toJson(t);
        BaseLiveBean baseLiveBean = new BaseLiveBean();
        baseLiveBean.setData(json);
        try {
            outputStream.write(SafeJsonUtil.getInstance().toJson(baseLiveBean).getBytes());
            outputStream.close();
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            aag0.m95543a(e);
        }
    }

    public c7t(Class<T> cls) {
        this.f79647c = cls;
    }
}
