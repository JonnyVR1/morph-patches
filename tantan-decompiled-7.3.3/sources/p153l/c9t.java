package p153l;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p051p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p051p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class c9t<item extends BaseListItemBean> extends wxr<BaseLiveListBean<item>> {

    /* JADX INFO: renamed from: b */
    public String f80521b;

    /* JADX INFO: renamed from: c */
    public Class<item> f80522c;

    public c9t(Class<item> cls, String str) {
        this.f80522c = cls;
        this.f80521b = str;
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BaseLiveListBean<item> parse(InputStream inputStream, String str) throws IOException {
        String str2 = INetParser.STRING_PARSER.parse(inputStream, str);
        String strM208439a = m208439a();
        try {
            BaseLiveListBean<item> baseLiveListBean = new BaseLiveListBean<>();
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            ArrayList arrayList = new ArrayList();
            String strOptString = TextUtils.isEmpty(this.f80521b) ? jSONObject.optString("data") : jSONObject.optJSONObject("data").optString(this.f80521b);
            if (!TextUtils.isEmpty(strOptString)) {
                Iterator<JsonElement> it = new JsonParser().parse(strOptString).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add((BaseListItemBean) SafeJsonUtil.getInstance().fromJson(it.next(), (Class) this.f80522c));
                }
            }
            baseLiveListBean.setList(arrayList);
            baseLiveListBean.setPagination((PaginationBean) SafeJsonUtil.getInstance().fromJson(jSONObject.optString(Pagination.TYPE), PaginationBean.class));
            if (baseLiveListBean.getPagination() != null) {
                PaginationBean.normalize(baseLiveListBean.getPagination().getLinks());
            }
            if (jSONObjectOptJSONObject != null) {
                baseLiveListBean.setCode(jSONObjectOptJSONObject.optInt("code"));
                baseLiveListBean.setMsg(jSONObjectOptJSONObject.optString("message"));
            }
            return baseLiveListBean;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            ilw0.m140722a("LIVE JSON PARSER ERROR", strM208439a, "--", e.getMessage());
            return null;
        }
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BaseLiveListBean<item> parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
        return parse(inputStream, str);
    }
}
