package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class FakeGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fakeguidedata";

    @ProtobufIndex(index = 1)
    public boolean changeAvatar;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String identifier;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;
    public static ProtobufAdapter<FakeGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FakeGuideData>() { // from class: com.p1.mobile.putong.core.data.FakeGuideData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FakeGuideData fakeGuideData) {
            int iB = CodedOutputByteBufferNano.b(1, fakeGuideData.changeAvatar);
            String str = fakeGuideData.type;
            if (str != null) {
                iB += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = fakeGuideData.identifier;
            if (str2 != null) {
                iB += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) fakeGuideData).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FakeGuideData m12713parse(nb5 nb5Var) throws IOException {
            FakeGuideData fakeGuideData = new FakeGuideData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fakeGuideData.type == null) {
                        fakeGuideData.type = "";
                    }
                    if (fakeGuideData.identifier != null) {
                        break;
                    }
                    fakeGuideData.identifier = "";
                    break;
                }
                if (iU == 8) {
                    fakeGuideData.changeAvatar = nb5Var.g();
                } else if (iU == 18) {
                    fakeGuideData.type = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (fakeGuideData.type == null) {
                            fakeGuideData.type = "";
                        }
                        if (fakeGuideData.identifier != null) {
                            break;
                        }
                        fakeGuideData.identifier = "";
                        return fakeGuideData;
                    }
                    fakeGuideData.identifier = nb5Var.s();
                }
            }
            return fakeGuideData;
        }

        public void serialize(FakeGuideData fakeGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, fakeGuideData.changeAvatar);
            String str = fakeGuideData.type;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = fakeGuideData.identifier;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<FakeGuideData> JSON_ADAPTER = new ObjectJsonAdapter<FakeGuideData>() { // from class: com.p1.mobile.putong.core.data.FakeGuideData.2
        public Class getDataClass() {
            return FakeGuideData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FakeGuideData m12714newInstance() {
            return new FakeGuideData();
        }

        public boolean parseField(FakeGuideData fakeGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "identifier":
                    fakeGuideData.identifier = jsonParser.getValueAsString();
                    return true;
                case "changeAvatar":
                    fakeGuideData.changeAvatar = jsonParser.getValueAsBoolean();
                    return true;
                case "type":
                    fakeGuideData.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FakeGuideData fakeGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "identifier":
                case "changeAvatar":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(fakeGuideData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FakeGuideData fakeGuideData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("changeAvatar", fakeGuideData.changeAvatar);
            String str = fakeGuideData.type;
            if (str != null) {
                jsonGenerator.writeStringField("type", str);
            }
            String str2 = fakeGuideData.identifier;
            if (str2 != null) {
                jsonGenerator.writeStringField("identifier", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FakeGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FakeGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static FakeGuideData new_() {
        FakeGuideData fakeGuideData = new FakeGuideData();
        fakeGuideData.nullCheck();
        return fakeGuideData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FakeGuideData m12712clone() {
        FakeGuideData fakeGuideData = new FakeGuideData();
        fakeGuideData.changeAvatar = this.changeAvatar;
        fakeGuideData.type = this.type;
        fakeGuideData.identifier = this.identifier;
        return fakeGuideData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FakeGuideData)) {
            return false;
        }
        FakeGuideData fakeGuideData = (FakeGuideData) obj;
        return this.changeAvatar == fakeGuideData.changeAvatar && ValueObject.util_equals(this.type, fakeGuideData.type) && ValueObject.util_equals(this.identifier, fakeGuideData.identifier);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + (this.changeAvatar ? 1231 : 1237)) * 41;
        String str = this.type;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.identifier;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = "";
        }
        if (this.identifier == null) {
            this.identifier = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
