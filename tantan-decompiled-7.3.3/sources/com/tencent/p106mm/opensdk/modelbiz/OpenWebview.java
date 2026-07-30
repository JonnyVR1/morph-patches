package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class OpenWebview {

    public static class Req extends BaseReq {
        private static final int MAX_URL_LENGHT = 10240;
        public String url;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str = this.url;
            return str != null && str.length() >= 0 && this.url.length() <= MAX_URL_LENGHT;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_jump_to_webview_url");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 12;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_webview_url", URLEncoder.encode(this.url));
        }
    }

    public static class Resp extends BaseResp {
        public String result;

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.result = bundle.getString("_wxapi_open_webview_result");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 12;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_open_webview_result", this.result);
        }

        public Resp() {
        }
    }
}
