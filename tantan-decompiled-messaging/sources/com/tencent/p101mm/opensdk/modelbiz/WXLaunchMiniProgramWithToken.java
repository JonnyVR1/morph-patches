package com.tencent.p101mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;
import com.tencent.p101mm.opensdk.utils.C14340b;
import com.tencent.p101mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXLaunchMiniProgramWithToken {

    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXLaunchMiniProgramWithToken.Req";
        public String token;

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (!C14340b.m84183b(this.token)) {
                return true;
            }
            Log.m84175e(TAG, "token is null");
            return false;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 29;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_token", this.token);
        }
    }

    public static final class Resp extends BaseResp {
        public static final int ERR_INVALID_TOKEN = -1000;
        public String extMsg;

        public Resp(Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 29;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
        }

        public Resp() {
        }
    }
}
