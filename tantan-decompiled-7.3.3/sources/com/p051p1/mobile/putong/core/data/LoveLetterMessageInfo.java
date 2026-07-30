package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
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
public class LoveLetterMessageInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "lovelettermessageinfo";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21179id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String otherUser;

    @NonNull
    @ProtobufIndex(index = 3)
    public LoveLetterMessageState state;
    public static ProtobufAdapter<LoveLetterMessageInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LoveLetterMessageInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LoveLetterMessageInfo loveLetterMessageInfo) {
            String str = loveLetterMessageInfo.f21179id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            LoveLetterMessageState loveLetterMessageState = loveLetterMessageInfo.state;
            if (loveLetterMessageState != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
            loveLetterMessageInfo.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LoveLetterMessageInfo parse(nc5 nc5Var) throws IOException {
            LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (loveLetterMessageInfo.f21179id == null) {
                        loveLetterMessageInfo.f21179id = "";
                    }
                    if (loveLetterMessageInfo.otherUser == null) {
                        loveLetterMessageInfo.otherUser = "";
                    }
                    if (loveLetterMessageInfo.state != null) {
                        break;
                    }
                    loveLetterMessageInfo.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM162497u == 10) {
                    loveLetterMessageInfo.f21179id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    loveLetterMessageInfo.otherUser = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (loveLetterMessageInfo.f21179id == null) {
                            loveLetterMessageInfo.f21179id = "";
                        }
                        if (loveLetterMessageInfo.otherUser == null) {
                            loveLetterMessageInfo.otherUser = "";
                        }
                        if (loveLetterMessageInfo.state != null) {
                            break;
                        }
                        loveLetterMessageInfo.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
                        return loveLetterMessageInfo;
                    }
                    loveLetterMessageInfo.state = (LoveLetterMessageState) nc5Var.m162488l(LoveLetterMessageState.PROTOBUF_ADAPTER);
                }
            }
            return loveLetterMessageInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LoveLetterMessageInfo loveLetterMessageInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = loveLetterMessageInfo.f21179id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            LoveLetterMessageState loveLetterMessageState = loveLetterMessageInfo.state;
            if (loveLetterMessageState != null) {
                codedOutputByteBufferNano.m17309K(3, loveLetterMessageState, LoveLetterMessageState.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LoveLetterMessageInfo> JSON_ADAPTER = new ObjectJsonAdapter<LoveLetterMessageInfo>() { // from class: com.p1.mobile.putong.core.data.LoveLetterMessageInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LoveLetterMessageInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LoveLetterMessageInfo newInstance() {
            return new LoveLetterMessageInfo();
        }

        public boolean parseField(LoveLetterMessageInfo loveLetterMessageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "otherUser":
                    loveLetterMessageInfo.otherUser = jsonParser.getValueAsString();
                    return true;
                case "id":
                    loveLetterMessageInfo.f21179id = jsonParser.getValueAsString();
                    return false;
                case "state":
                    loveLetterMessageInfo.state = LoveLetterMessageState.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LoveLetterMessageInfo loveLetterMessageInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "otherUser":
                    return true;
                case "id":
                    return false;
                case "state":
                    return true;
                default:
                    return super.parseFieldCheck(loveLetterMessageInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LoveLetterMessageInfo loveLetterMessageInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = loveLetterMessageInfo.f21179id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = loveLetterMessageInfo.otherUser;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherUser", str2);
            }
            if (loveLetterMessageInfo.state != null) {
                jsonGenerator.writeFieldName("state");
                LoveLetterMessageState.JSON_ADAPTER.serialize(loveLetterMessageInfo.state, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LoveLetterMessageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LoveLetterMessageInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LoveLetterMessageInfo new_() {
        LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
        loveLetterMessageInfo.nullCheck();
        return loveLetterMessageInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LoveLetterMessageInfo mo225055clone() {
        LoveLetterMessageInfo loveLetterMessageInfo = new LoveLetterMessageInfo();
        loveLetterMessageInfo.f21179id = this.f21179id;
        loveLetterMessageInfo.otherUser = this.otherUser;
        loveLetterMessageInfo.state = this.state;
        return loveLetterMessageInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoveLetterMessageInfo)) {
            return false;
        }
        LoveLetterMessageInfo loveLetterMessageInfo = (LoveLetterMessageInfo) obj;
        return ValueObject.util_equals(this.f21179id, loveLetterMessageInfo.f21179id) && ValueObject.util_equals(this.otherUser, loveLetterMessageInfo.otherUser) && ValueObject.util_equals(this.state, loveLetterMessageInfo.state);
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
        int i2 = i * 41;
        String str = this.f21179id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherUser;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        LoveLetterMessageState loveLetterMessageState = this.state;
        int iHashCode3 = iHashCode2 + (loveLetterMessageState != null ? loveLetterMessageState.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21179id == null) {
            this.f21179id = "";
        }
        if (this.otherUser == null) {
            this.otherUser = "";
        }
        if (this.state == null) {
            this.state = (LoveLetterMessageState) LoveLetterMessageState.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
