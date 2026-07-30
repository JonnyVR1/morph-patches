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
public class SeeMatchGroup extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seematchgroup";

    @ProtobufIndex(index = 4)
    public boolean matchPageEnabled;

    @ProtobufIndex(index = 3)
    public boolean seeListEnabled;

    @ProtobufIndex(index = 2)
    public int seeNum;

    @ProtobufIndex(index = 1)
    public int signUpDays;
    public static ProtobufAdapter<SeeMatchGroup> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeMatchGroup>() { // from class: com.p1.mobile.putong.core.data.SeeMatchGroup.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SeeMatchGroup seeMatchGroup) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, seeMatchGroup.signUpDays) + CodedOutputByteBufferNano.m17281h(2, seeMatchGroup.seeNum) + CodedOutputByteBufferNano.m17275b(3, seeMatchGroup.seeListEnabled) + CodedOutputByteBufferNano.m17275b(4, seeMatchGroup.matchPageEnabled);
            seeMatchGroup.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SeeMatchGroup parse(nc5 nc5Var) throws IOException {
            SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    seeMatchGroup.signUpDays = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    seeMatchGroup.seeNum = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    seeMatchGroup.seeListEnabled = nc5Var.m162483g();
                } else {
                    if (iM162497u != 32) {
                        return seeMatchGroup;
                    }
                    seeMatchGroup.matchPageEnabled = nc5Var.m162483g();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SeeMatchGroup seeMatchGroup, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, seeMatchGroup.signUpDays);
            codedOutputByteBufferNano.m17305G(2, seeMatchGroup.seeNum);
            codedOutputByteBufferNano.m17299A(3, seeMatchGroup.seeListEnabled);
            codedOutputByteBufferNano.m17299A(4, seeMatchGroup.matchPageEnabled);
        }
    };
    public static JsonAdapter<SeeMatchGroup> JSON_ADAPTER = new ObjectJsonAdapter<SeeMatchGroup>() { // from class: com.p1.mobile.putong.core.data.SeeMatchGroup.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SeeMatchGroup.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SeeMatchGroup newInstance() {
            return new SeeMatchGroup();
        }

        public boolean parseField(SeeMatchGroup seeMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "matchPageEnabled":
                    seeMatchGroup.matchPageEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "signUpDays":
                    seeMatchGroup.signUpDays = jsonParser.getValueAsInt();
                    return true;
                case "seeListEnabled":
                    seeMatchGroup.seeListEnabled = jsonParser.getValueAsBoolean();
                    return true;
                case "seeNum":
                    seeMatchGroup.seeNum = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeMatchGroup seeMatchGroup, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "matchPageEnabled":
                case "signUpDays":
                case "seeListEnabled":
                case "seeNum":
                    return true;
                default:
                    return super.parseFieldCheck(seeMatchGroup, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SeeMatchGroup seeMatchGroup, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("signUpDays", seeMatchGroup.signUpDays);
            jsonGenerator.writeNumberField("seeNum", seeMatchGroup.seeNum);
            jsonGenerator.writeBooleanField("seeListEnabled", seeMatchGroup.seeListEnabled);
            jsonGenerator.writeBooleanField("matchPageEnabled", seeMatchGroup.matchPageEnabled);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeMatchGroup) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeMatchGroup new_() {
        SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
        seeMatchGroup.nullCheck();
        return seeMatchGroup;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SeeMatchGroup mo225055clone() {
        SeeMatchGroup seeMatchGroup = new SeeMatchGroup();
        seeMatchGroup.signUpDays = this.signUpDays;
        seeMatchGroup.seeNum = this.seeNum;
        seeMatchGroup.seeListEnabled = this.seeListEnabled;
        seeMatchGroup.matchPageEnabled = this.matchPageEnabled;
        return seeMatchGroup;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeMatchGroup)) {
            return false;
        }
        SeeMatchGroup seeMatchGroup = (SeeMatchGroup) obj;
        return this.signUpDays == seeMatchGroup.signUpDays && this.seeNum == seeMatchGroup.seeNum && this.seeListEnabled == seeMatchGroup.seeListEnabled && this.matchPageEnabled == seeMatchGroup.matchPageEnabled;
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
        int i2 = (((((((i * 41) + this.signUpDays) * 41) + this.seeNum) * 41) + (this.seeListEnabled ? 1231 : 1237)) * 41) + (this.matchPageEnabled ? 1231 : 1237);
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
