package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class HandleScanResult {

    public static class Req extends BaseReq {
        private static final int MAX_URL_LENGHT = 10240;
        public String scanResult;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            String str = this.scanResult;
            return str != null && str.length() >= 0 && this.scanResult.length() <= MAX_URL_LENGHT;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 17;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_scan_qrcode_result", URLEncoder.encode(this.scanResult));
        }
    }

    public static class Resp extends BaseResp {
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
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 17;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }

        public Resp() {
        }
    }
}
