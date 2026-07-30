package com.p051p1.mobile.putong.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class ThirdParty extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "thirdparty";

    @ProtobufIndex(index = 4)
    public boolean apple;

    @ProtobufIndex(index = 1)
    public boolean facebook;

    @ProtobufIndex(index = 3)
    public boolean google;

    @ProtobufIndex(index = 2)
    public boolean wechat;
    public static ProtobufAdapter<ThirdParty> PROTOBUF_ADAPTER = new MessageNanoAdapter<ThirdParty>() { // from class: com.p1.mobile.putong.data.ThirdParty.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ThirdParty thirdParty) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, thirdParty.facebook) + CodedOutputByteBufferNano.m17275b(2, thirdParty.wechat) + CodedOutputByteBufferNano.m17275b(3, thirdParty.google) + CodedOutputByteBufferNano.m17275b(4, thirdParty.apple);
            thirdParty.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ThirdParty parse(nc5 nc5Var) throws IOException {
            ThirdParty thirdParty = new ThirdParty();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    thirdParty.facebook = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    thirdParty.wechat = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    thirdParty.google = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        return thirdParty;
                    }
                    thirdParty.apple = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ThirdParty thirdParty, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, thirdParty.facebook);
            codedOutputByteBufferNano.m17299A(2, thirdParty.wechat);
            codedOutputByteBufferNano.m17299A(3, thirdParty.google);
            codedOutputByteBufferNano.m17299A(4, thirdParty.apple);
        }
    };
    public static JsonAdapter<ThirdParty> JSON_ADAPTER = new ObjectJsonAdapter<ThirdParty>() { // from class: com.p1.mobile.putong.data.ThirdParty.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ThirdParty.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ThirdParty newInstance() {
            return new ThirdParty();
        }

        public boolean parseField(ThirdParty thirdParty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "google":
                    thirdParty.google = jsonParser.getValueAsBoolean();
                    return true;
                case "wechat":
                    thirdParty.wechat = jsonParser.getValueAsBoolean();
                    return true;
                case "apple":
                    thirdParty.apple = jsonParser.getValueAsBoolean();
                    return true;
                case "facebook":
                    thirdParty.facebook = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ThirdParty thirdParty, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "google":
                case "wechat":
                case "apple":
                case "facebook":
                    return true;
                default:
                    return super.parseFieldCheck(thirdParty, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ThirdParty thirdParty, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("facebook", thirdParty.facebook);
            jsonGenerator.writeBooleanField("wechat", thirdParty.wechat);
            jsonGenerator.writeBooleanField("google", thirdParty.google);
            jsonGenerator.writeBooleanField("apple", thirdParty.apple);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ThirdParty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ThirdParty) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ThirdParty new_() {
        ThirdParty thirdParty = new ThirdParty();
        thirdParty.nullCheck();
        return thirdParty;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ThirdParty mo225055clone() {
        ThirdParty thirdParty = new ThirdParty();
        thirdParty.facebook = this.facebook;
        thirdParty.wechat = this.wechat;
        thirdParty.google = this.google;
        thirdParty.apple = this.apple;
        return thirdParty;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdParty)) {
            return false;
        }
        ThirdParty thirdParty = (ThirdParty) obj;
        return this.facebook == thirdParty.facebook && this.wechat == thirdParty.wechat && this.google == thirdParty.google && this.apple == thirdParty.apple;
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
        int i2 = (((((((i * 41) + (this.facebook ? 1231 : 1237)) * 41) + (this.wechat ? 1231 : 1237)) * 41) + (this.google ? 1231 : 1237)) * 41) + (this.apple ? 1231 : 1237);
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
