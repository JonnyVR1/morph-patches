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
public class HomeRealV2Config extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "homerealv2config";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean marriageEnable;

    @ProtobufIndex(index = 1)
    public boolean momentEnable;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public boolean outLikeNewUIEnable;
    public static ProtobufAdapter<HomeRealV2Config> PROTOBUF_ADAPTER = new MessageNanoAdapter<HomeRealV2Config>() { // from class: com.p1.mobile.putong.core.data.HomeRealV2Config.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(HomeRealV2Config homeRealV2Config) {
            int iB = CodedOutputByteBufferNano.b(1, homeRealV2Config.momentEnable) + CodedOutputByteBufferNano.b(2, homeRealV2Config.marriageEnable) + CodedOutputByteBufferNano.b(3, homeRealV2Config.outLikeNewUIEnable);
            ((MessageNano) homeRealV2Config).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public HomeRealV2Config m13307parse(nb5 nb5Var) throws IOException {
            HomeRealV2Config homeRealV2Config = new HomeRealV2Config();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    homeRealV2Config.momentEnable = nb5Var.g();
                } else if (iU == 16) {
                    homeRealV2Config.marriageEnable = nb5Var.g();
                } else {
                    if (iU != 24) {
                        return homeRealV2Config;
                    }
                    homeRealV2Config.outLikeNewUIEnable = nb5Var.g();
                }
            }
        }

        public void serialize(HomeRealV2Config homeRealV2Config, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, homeRealV2Config.momentEnable);
            codedOutputByteBufferNano.A(2, homeRealV2Config.marriageEnable);
            codedOutputByteBufferNano.A(3, homeRealV2Config.outLikeNewUIEnable);
        }
    };
    public static JsonAdapter<HomeRealV2Config> JSON_ADAPTER = new ObjectJsonAdapter<HomeRealV2Config>() { // from class: com.p1.mobile.putong.core.data.HomeRealV2Config.2
        public Class getDataClass() {
            return HomeRealV2Config.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public HomeRealV2Config m13308newInstance() {
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

        public void serializeFields(HomeRealV2Config homeRealV2Config, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("momentEnable", homeRealV2Config.momentEnable);
            jsonGenerator.writeBooleanField("marriageEnable", homeRealV2Config.marriageEnable);
            jsonGenerator.writeBooleanField("outLikeNewUIEnable", homeRealV2Config.outLikeNewUIEnable);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((HomeRealV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((HomeRealV2Config) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static HomeRealV2Config new_() {
        HomeRealV2Config homeRealV2Config = new HomeRealV2Config();
        homeRealV2Config.nullCheck();
        return homeRealV2Config;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public HomeRealV2Config m13306clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + (this.momentEnable ? 1231 : 1237)) * 41) + (this.marriageEnable ? 1231 : 1237)) * 41) + (this.outLikeNewUIEnable ? 1231 : 1237);
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
