package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class VipSetting extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "vipsetting";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean blockAds;

    @ProtobufIndex(index = 4)
    public boolean blockSensitiveWord;

    @ProtobufIndex(index = 1)
    public boolean suggestReal;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean suggestSecure;
    public static ProtobufAdapter<VipSetting> PROTOBUF_ADAPTER = new MessageNanoAdapter<VipSetting>() { // from class: com.p1.mobile.putong.core.data.VipSetting.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VipSetting vipSetting) {
            int iB = CodedOutputByteBufferNano.b(1, vipSetting.suggestReal) + CodedOutputByteBufferNano.b(2, vipSetting.suggestSecure) + CodedOutputByteBufferNano.b(3, vipSetting.blockAds) + CodedOutputByteBufferNano.b(4, vipSetting.blockSensitiveWord);
            ((MessageNano) vipSetting).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VipSetting m16232parse(nb5 nb5Var) throws IOException {
            VipSetting vipSetting = new VipSetting();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    vipSetting.suggestReal = nb5Var.g();
                } else if (iU == 16) {
                    vipSetting.suggestSecure = nb5Var.g();
                } else if (iU == 24) {
                    vipSetting.blockAds = nb5Var.g();
                } else {
                    if (iU != 32) {
                        return vipSetting;
                    }
                    vipSetting.blockSensitiveWord = nb5Var.g();
                }
            }
        }

        public void serialize(VipSetting vipSetting, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, vipSetting.suggestReal);
            codedOutputByteBufferNano.A(2, vipSetting.suggestSecure);
            codedOutputByteBufferNano.A(3, vipSetting.blockAds);
            codedOutputByteBufferNano.A(4, vipSetting.blockSensitiveWord);
        }
    };
    public static JsonAdapter<VipSetting> JSON_ADAPTER = new ObjectJsonAdapter<VipSetting>() { // from class: com.p1.mobile.putong.core.data.VipSetting.2
        public Class getDataClass() {
            return VipSetting.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VipSetting m16233newInstance() {
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

        public void serializeFields(VipSetting vipSetting, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("suggestReal", vipSetting.suggestReal);
            jsonGenerator.writeBooleanField("suggestSecure", vipSetting.suggestSecure);
            jsonGenerator.writeBooleanField("blockAds", vipSetting.blockAds);
            jsonGenerator.writeBooleanField("blockSensitiveWord", vipSetting.blockSensitiveWord);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VipSetting) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static VipSetting new_() {
        VipSetting vipSetting = new VipSetting();
        vipSetting.nullCheck();
        return vipSetting;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VipSetting m16231clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((((i * 41) + (this.suggestReal ? 1231 : 1237)) * 41) + (this.suggestSecure ? 1231 : 1237)) * 41) + (this.blockAds ? 1231 : 1237)) * 41) + (this.blockSensitiveWord ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
