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
public class HomeRealV2Config extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "homerealv2config";

    @ProtobufIndex(index = 2)
    public boolean marriageEnable;

    @ProtobufIndex(index = 1)
    public boolean momentEnable;

    @ProtobufIndex(index = 3)
    public boolean outLikeNewUIEnable;
    public static ProtobufAdapter<HomeRealV2Config> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeRealV2Config>() { // from class: com.p1.mobile.putong.core.data.HomeRealV2Config.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(HomeRealV2Config homeRealV2Config) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, homeRealV2Config.momentEnable) + CodedOutputByteBufferNano.m17275b(2, homeRealV2Config.marriageEnable) + CodedOutputByteBufferNano.m17275b(3, homeRealV2Config.outLikeNewUIEnable);
            homeRealV2Config.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public HomeRealV2Config parse(nc5 nc5Var) throws IOException {
            HomeRealV2Config homeRealV2Config = new HomeRealV2Config();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    homeRealV2Config.momentEnable = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    homeRealV2Config.marriageEnable = nc5Var.m162483g();
                } else {
                    if (iM162497u != 24) {
                        return homeRealV2Config;
                    }
                    homeRealV2Config.outLikeNewUIEnable = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(HomeRealV2Config homeRealV2Config, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, homeRealV2Config.momentEnable);
            codedOutputByteBufferNano.m17299A(2, homeRealV2Config.marriageEnable);
            codedOutputByteBufferNano.m17299A(3, homeRealV2Config.outLikeNewUIEnable);
        }
    };
    public static JsonAdapter<HomeRealV2Config> JSON_ADAPTER = new ObjectJsonAdapter<HomeRealV2Config>() { // from class: com.p1.mobile.putong.core.data.HomeRealV2Config.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return HomeRealV2Config.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public HomeRealV2Config newInstance() {
            return new HomeRealV2Config();
        }

        public boolean parseField(HomeRealV2Config homeRealV2Config, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "marriageEnable":
                    homeRealV2Config.marriageEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "outLikeNewUIEnable":
                    homeRealV2Config.outLikeNewUIEnable = jsonParser.getValueAsBoolean();
                    return true;
                case "momentEnable":
                    homeRealV2Config.momentEnable = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(HomeRealV2Config homeRealV2Config, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "marriageEnable":
                case "outLikeNewUIEnable":
                case "momentEnable":
                    return true;
                default:
                    return super.parseFieldCheck(homeRealV2Config, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(HomeRealV2Config homeRealV2Config, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("momentEnable", homeRealV2Config.momentEnable);
            jsonGenerator.writeBooleanField("marriageEnable", homeRealV2Config.marriageEnable);
            jsonGenerator.writeBooleanField("outLikeNewUIEnable", homeRealV2Config.outLikeNewUIEnable);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeRealV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeRealV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeRealV2Config new_() {
        HomeRealV2Config homeRealV2Config = new HomeRealV2Config();
        homeRealV2Config.nullCheck();
        return homeRealV2Config;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public HomeRealV2Config mo225055clone() {
        HomeRealV2Config homeRealV2Config = new HomeRealV2Config();
        homeRealV2Config.momentEnable = this.momentEnable;
        homeRealV2Config.marriageEnable = this.marriageEnable;
        homeRealV2Config.outLikeNewUIEnable = this.outLikeNewUIEnable;
        return homeRealV2Config;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeRealV2Config)) {
            return false;
        }
        HomeRealV2Config homeRealV2Config = (HomeRealV2Config) obj;
        return this.momentEnable == homeRealV2Config.momentEnable && this.marriageEnable == homeRealV2Config.marriageEnable && this.outLikeNewUIEnable == homeRealV2Config.outLikeNewUIEnable;
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
        int i2 = (((((i * 41) + (this.momentEnable ? 1231 : 1237)) * 41) + (this.marriageEnable ? 1231 : 1237)) * 41) + (this.outLikeNewUIEnable ? 1231 : 1237);
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
