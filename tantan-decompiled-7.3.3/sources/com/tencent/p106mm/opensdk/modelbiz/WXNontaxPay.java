package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.utils.C14503b;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXNontaxPay {

    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXNontaxPay.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public String url;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (C14503b.m85366b(this.url)) {
                Log.m85359i(TAG, "url should not be empty");
                return false;
            }
            if (this.url.length() <= URL_LENGTH_LIMIT) {
                return true;
            }
            Log.m85358e(TAG, "url must be in 10k");
            return false;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_nontax_pay_req_url");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 21;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_nontax_pay_req_url", this.url);
        }
    }

    public static final class Resp extends BaseResp {
        public String wxOrderId;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_nontax_pay_order_id");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 21;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_nontax_pay_order_id", this.wxOrderId);
        }
    }
}
