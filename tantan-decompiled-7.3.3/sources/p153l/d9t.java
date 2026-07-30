package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class d9t<T extends BaseLiveBean> extends wxr<T> {

    /* JADX INFO: renamed from: b */
    public String f85818b;

    /* JADX INFO: renamed from: c */
    public Class<T> f85819c;

    public d9t(Class<T> cls, String str) {
        this.f85819c = cls;
        this.f85818b = str;
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public T parse(InputStream inputStream, String str) throws IOException {
        String str2 = INetParser.STRING_PARSER.parse(inputStream, str);
        String strM208439a = m208439a();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            T tNewInstance = TextUtils.isEmpty(this.f85818b) ? (T) SafeJsonUtil.getInstance().fromJson(jSONObject.optString("data"), (Class) this.f85819c) : (T) SafeJsonUtil.getInstance().fromJson(jSONObject.optJSONObject("data").optString(this.f85818b), (Class) this.f85819c);
            if (tNewInstance == null) {
                tNewInstance = this.f85819c.newInstance();
            }
            if (jSONObjectOptJSONObject != null) {
                tNewInstance.setCode(jSONObjectOptJSONObject.optInt("code"));
                tNewInstance.setMsg(jSONObjectOptJSONObject.optString("message"));
            }
            if (this.f85819c == BaseLiveBean.class) {
                tNewInstance.setData(jSONObject.optString("data"));
            }
            tNewInstance.setPagination((PaginationBean) SafeJsonUtil.getInstance().fromJson(jSONObject.optString(Pagination.TYPE), PaginationBean.class));
            if (tNewInstance.getPagination() != null) {
                PaginationBean.normalize(tNewInstance.getPagination().getLinks());
            }
            return tNewInstance;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            ilw0.m140722a("LIVE JSON PARSER ERROR", strM208439a, "---", e.getMessage());
            return null;
        }
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
        return (T) parse(inputStream, str);
    }

    /* JADX INFO: renamed from: e */
    public void m115098e(T t, OutputStream outputStream) {
        String json = SafeJsonUtil.getInstance().toJson(t);
        BaseLiveBean baseLiveBean = new BaseLiveBean();
        baseLiveBean.setData(json);
        try {
            outputStream.write(SafeJsonUtil.getInstance().toJson(baseLiveBean).getBytes());
            outputStream.close();
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            iig0.m140070a(e);
        }
    }

    public d9t(Class<T> cls) {
        this.f85819c = cls;
    }
}
