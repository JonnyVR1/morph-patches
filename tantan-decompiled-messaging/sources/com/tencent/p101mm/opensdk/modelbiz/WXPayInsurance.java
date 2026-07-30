package com.tencent.p101mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.utils.C14340b;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXPayInsurance {

    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXPayInsurance.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public String url;

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (C14340b.m84183b(this.url)) {
                Log.m84176i(TAG, "url should not be empty");
                return false;
            }
            if (this.url.length() <= URL_LENGTH_LIMIT) {
                return true;
            }
            Log.m84175e(TAG, "url must be in 10k");
            return false;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_pay_insourance_req_url");
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 22;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_pay_insourance_req_url", this.url);
        }
    }

    public static final class Resp extends BaseResp {
        public String wxOrderId;

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_pay_insourance_order_id");
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 22;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_pay_insourance_order_id", this.wxOrderId);
        }
    }
}
