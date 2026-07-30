package com.p051p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class VipSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "vipsetting";

    @ProtobufIndex(index = 3)
    public boolean blockAds;

    @ProtobufIndex(index = 4)
    public boolean blockSensitiveWord;

    @ProtobufIndex(index = 1)
    public boolean suggestReal;

    @ProtobufIndex(index = 2)
    public boolean suggestSecure;
    public static ProtobufAdapter<VipSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<VipSetting>() { // from class: com.p1.mobile.putong.core.data.VipSetting.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VipSetting vipSetting) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, vipSetting.suggestReal) + CodedOutputByteBufferNano.m17275b(2, vipSetting.suggestSecure) + CodedOutputByteBufferNano.m17275b(3, vipSetting.blockAds) + CodedOutputByteBufferNano.m17275b(4, vipSetting.blockSensitiveWord);
            vipSetting.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VipSetting parse(nc5 nc5Var) throws IOException {
            VipSetting vipSetting = new VipSetting();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    vipSetting.suggestReal = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    vipSetting.suggestSecure = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    vipSetting.blockAds = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        return vipSetting;
                    }
                    vipSetting.blockSensitiveWord = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VipSetting vipSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, vipSetting.suggestReal);
            codedOutputByteBufferNano.m17299A(2, vipSetting.suggestSecure);
            codedOutputByteBufferNano.m17299A(3, vipSetting.blockAds);
            codedOutputByteBufferNano.m17299A(4, vipSetting.blockSensitiveWord);
        }
    };
    public static JsonAdapter<VipSetting> JSON_ADAPTER = new ObjectJsonAdapter<VipSetting>() { // from class: com.p1.mobile.putong.core.data.VipSetting.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VipSetting.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VipSetting newInstance() {
            return new VipSetting();
        }

        public boolean parseField(VipSetting vipSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "suggestSecure":
                    vipSetting.suggestSecure = jsonParser.getValueAsBoolean();
                    return true;
                case "suggestReal":
                    vipSetting.suggestReal = jsonParser.getValueAsBoolean();
                    return true;
                case "blockSensitiveWord":
                    vipSetting.blockSensitiveWord = jsonParser.getValueAsBoolean();
                    return true;
                case "blockAds":
                    vipSetting.blockAds = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VipSetting vipSetting, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "suggestSecure":
                case "suggestReal":
                case "blockSensitiveWord":
                case "blockAds":
                    return true;
                default:
                    return super.parseFieldCheck(vipSetting, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VipSetting vipSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("suggestReal", vipSetting.suggestReal);
            jsonGenerator.writeBooleanField("suggestSecure", vipSetting.suggestSecure);
            jsonGenerator.writeBooleanField("blockAds", vipSetting.blockAds);
            jsonGenerator.writeBooleanField("blockSensitiveWord", vipSetting.blockSensitiveWord);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VipSetting new_() {
        VipSetting vipSetting = new VipSetting();
        vipSetting.nullCheck();
        return vipSetting;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VipSetting mo225055clone() {
        VipSetting vipSetting = new VipSetting();
        vipSetting.suggestReal = this.suggestReal;
        vipSetting.suggestSecure = this.suggestSecure;
        vipSetting.blockAds = this.blockAds;
        vipSetting.blockSensitiveWord = this.blockSensitiveWord;
        return vipSetting;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VipSetting)) {
            return false;
        }
        VipSetting vipSetting = (VipSetting) obj;
        return this.suggestReal == vipSetting.suggestReal && this.suggestSecure == vipSetting.suggestSecure && this.blockAds == vipSetting.blockAds && this.blockSensitiveWord == vipSetting.blockSensitiveWord;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + (this.suggestReal ? 1231 : 1237)) * 41) + (this.suggestSecure ? 1231 : 1237)) * 41) + (this.blockAds ? 1231 : 1237)) * 41) + (this.blockSensitiveWord ? 1231 : 1237);
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
