package com.p046p1.mobile.account_core.reponse_data;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p149l.e01;

/* JADX INFO: loaded from: classes8.dex */
public class AccountEnvelop {
    public Data data;
    public Map<String, String> extra;
    public Meta meta;

    public void fillExtraData() {
        Map<String, String> map;
        Token token;
        List<String> list;
        Data data = this.data;
        if (data != null && !TextUtils.isEmpty(data.stage)) {
            if (this.extra != null) {
                Token token2 = this.data.token;
                if (token2 != null) {
                    if (token2.extra == null) {
                        token2.extra = new e01();
                    }
                    Data data2 = this.data;
                    data2.token.extra.put("stage", data2.stage);
                }
            } else {
                e01 e01Var = new e01();
                this.extra = e01Var;
                e01Var.put("stage", this.data.stage);
            }
        }
        if (this.extra == null) {
            this.extra = new e01();
        }
        Data data3 = this.data;
        if (data3 != null && (list = data3.finishedStages) != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.data.finishedStages.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(Constants.SEPARATOR_COMMA);
            }
            this.extra.put("finished_stages", sb.toString());
        }
        if (this.data == null || (map = this.extra) == null || map.size() <= 0 || (token = this.data.token) == null) {
            return;
        }
        if (token.extra == null) {
            token.extra = new e01();
        }
        this.data.token.extra.putAll(this.extra);
    }
}
