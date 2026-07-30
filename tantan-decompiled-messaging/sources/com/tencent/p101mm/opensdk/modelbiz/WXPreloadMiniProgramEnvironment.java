package com.tencent.p101mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p101mm.opensdk.modelbase.BaseReq;
import com.tencent.p101mm.opensdk.modelbase.BaseResp;

/* JADX INFO: loaded from: classes2.dex */
public class WXPreloadMiniProgramEnvironment {

    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXPreloadMiniProgramEnvironment.Req";
        public String extData = "";

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 32;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_preload_wxminiprogram_environment_extData", this.extData);
        }
    }

    public static final class Resp extends BaseResp {
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
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 32;
        }

        @Override // com.tencent.p101mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
        }

        public Resp() {
        }
    }
}
