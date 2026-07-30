package p149l;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.apibean.BaseListItemBean;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveListBean;
import com.p046p1.mobile.putong.live.base.apibean.PaginationBean;
import com.p046p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class b7t<item extends BaseListItemBean> extends vvr<BaseLiveListBean<item>> {

    /* JADX INFO: renamed from: b */
    public String f74015b;

    /* JADX INFO: renamed from: c */
    public Class<item> f74016c;

    public b7t(Class<item> cls, String str) {
        this.f74016c = cls;
        this.f74015b = str;
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BaseLiveListBean<item> parse(InputStream inputStream, String str) throws IOException {
        String str2 = INetParser.STRING_PARSER.parse(inputStream, str);
        String strM200205a = m200205a();
        try {
            BaseLiveListBean<item> baseLiveListBean = new BaseLiveListBean<>();
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
            ArrayList arrayList = new ArrayList();
            String strOptString = TextUtils.isEmpty(this.f74015b) ? jSONObject.optString("data") : jSONObject.optJSONObject("data").optString(this.f74015b);
            if (!TextUtils.isEmpty(strOptString)) {
                Iterator<JsonElement> it = new JsonParser().parse(strOptString).getAsJsonArray().iterator();
                while (it.hasNext()) {
                    arrayList.add((BaseListItemBean) SafeJsonUtil.getInstance().fromJson(it.next(), (Class) this.f74016c));
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
            CrashHelper.m81296c(e);
            ccw0.m106203a("LIVE JSON PARSER ERROR", strM200205a, "--", e.getMessage());
            return null;
        }
    }

    @Override // com.tantanapp.common.data.INetParser
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BaseLiveListBean<item> parse(InputStream inputStream, String str, DataChecker dataChecker) throws IOException {
        return parse(inputStream, str);
    }
}
