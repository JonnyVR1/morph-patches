package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.presenter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
class FetchVerifyCodeHelper$VerifyCodeResponse extends ValueObject {
    public String action;
    public int code;
    private static JsonAdapter<FetchVerifyCodeHelper$VerifyCodeResponse> JSON_ADAPTER = new ObjectJsonAdapter<FetchVerifyCodeHelper$VerifyCodeResponse>() { // from class: com.p1.mobile.putong.account.ui.accountnew.loginopt.presenter.FetchVerifyCodeHelper$VerifyCodeResponse.1
        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FetchVerifyCodeHelper$VerifyCodeResponse newInstance() {
            return new FetchVerifyCodeHelper$VerifyCodeResponse();
        }

        public boolean parseField(FetchVerifyCodeHelper$VerifyCodeResponse fetchVerifyCodeHelper$VerifyCodeResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (!str.equals("data")) {
                return str.equals("meta");
            }
            FetchVerifyCodeHelper$VerifyCodeResponse fetchVerifyCodeHelper$VerifyCodeResponse2 = (FetchVerifyCodeHelper$VerifyCodeResponse) FetchVerifyCodeHelper$VerifyCodeResponse.DATA_JSON_ADAPTER.parse(jsonParser, str2);
            fetchVerifyCodeHelper$VerifyCodeResponse.code = fetchVerifyCodeHelper$VerifyCodeResponse2.code;
            fetchVerifyCodeHelper$VerifyCodeResponse.action = fetchVerifyCodeHelper$VerifyCodeResponse2.action;
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FetchVerifyCodeHelper$VerifyCodeResponse fetchVerifyCodeHelper$VerifyCodeResponse, JsonGenerator jsonGenerator) throws IOException {
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FetchVerifyCodeHelper$VerifyCodeResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    private static JsonAdapter<FetchVerifyCodeHelper$VerifyCodeResponse> DATA_JSON_ADAPTER = new ObjectJsonAdapter<FetchVerifyCodeHelper$VerifyCodeResponse>() { // from class: com.p1.mobile.putong.account.ui.accountnew.loginopt.presenter.FetchVerifyCodeHelper$VerifyCodeResponse.2
        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FetchVerifyCodeHelper$VerifyCodeResponse newInstance() {
            return new FetchVerifyCodeHelper$VerifyCodeResponse();
        }

        public boolean parseField(FetchVerifyCodeHelper$VerifyCodeResponse fetchVerifyCodeHelper$VerifyCodeResponse, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("action")) {
                fetchVerifyCodeHelper$VerifyCodeResponse.action = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("code")) {
                return false;
            }
            fetchVerifyCodeHelper$VerifyCodeResponse.code = jsonParser.getValueAsInt();
            return true;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FetchVerifyCodeHelper$VerifyCodeResponse fetchVerifyCodeHelper$VerifyCodeResponse, JsonGenerator jsonGenerator) {
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FetchVerifyCodeHelper$VerifyCodeResponse) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    private FetchVerifyCodeHelper$VerifyCodeResponse() {
    }
}
