package com.tencent.p106mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.p106mm.opensdk.modelbase.BaseReq;
import com.tencent.p106mm.opensdk.modelbase.BaseResp;
import com.tencent.p106mm.opensdk.utils.C14503b;
import com.tencent.p106mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes2.dex */
public class WXOpenBusinessView {

    public static final class Req extends BaseReq {
        private static final String TAG = "MicroMsg.SDK.WXOpenBusinessView.Req";
        public String businessType;
        public String extInfo;
        public String query;

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            if (!C14503b.m85366b(this.businessType)) {
                return true;
            }
            Log.m85358e(TAG, "businessType is null");
            return false;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void fromBundle(Bundle bundle) {
            super.fromBundle(bundle);
            this.businessType = bundle.getString("_openbusinessview_businessType");
            this.query = bundle.getString("_openbusinessview__query_info");
            this.extInfo = bundle.getString("_openbusinessview_extInfo");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 26;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseReq
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_businessType", this.businessType);
            bundle.putString("_openbusinessview__query_info", this.query);
            bundle.putString("_openbusinessview_extInfo", this.extInfo);
        }
    }

    public static final class Resp extends BaseResp {
        public String businessType;
        public String extMsg;

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
            this.extMsg = bundle.getString("_openbusinessview_ext_msg");
            this.businessType = bundle.getString("_openbusinessview_business_type");
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 26;
        }

        @Override // com.tencent.p106mm.opensdk.modelbase.BaseResp
        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_openbusinessview_ext_msg", this.extMsg);
            bundle.putString("_openbusinessview_business_type", this.businessType);
        }

        public Resp() {
        }
    }
}
