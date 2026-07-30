package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class GiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftType;

    @ProtobufIndex(index = 2)
    public int num;
    public static ProtobufAdapter<GiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftInfo>() { // from class: com.p1.mobile.putong.data.GiftInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftInfo giftInfo) {
            String str = giftInfo.giftType;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, giftInfo.num);
            giftInfo.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftInfo parse(nb5 nb5Var) throws IOException {
            GiftInfo giftInfo = new GiftInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftInfo.giftType != null) {
                        break;
                    }
                    giftInfo.giftType = "";
                    break;
                }
                if (iM158752u == 10) {
                    giftInfo.giftType = nb5Var.m158750s();
                } else {
                    if (iM158752u != 16) {
                        if (giftInfo.giftType != null) {
                            break;
                        }
                        giftInfo.giftType = "";
                        return giftInfo;
                    }
                    giftInfo.num = nb5Var.m158741j();
                }
            }
            return giftInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftInfo giftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftInfo.giftType;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, giftInfo.num);
        }
    };
    public static JsonAdapter<GiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftInfo>() { // from class: com.p1.mobile.putong.data.GiftInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftInfo newInstance() {
            return new GiftInfo();
        }

        public boolean parseField(GiftInfo giftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("num")) {
                giftInfo.num = jsonParser.getValueAsInt();
                return true;
            }
            if (!str.equals("giftType")) {
                return false;
            }
            giftInfo.giftType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GiftInfo giftInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("num") || str.equals("giftType")) {
                return true;
            }
            return super.parseFieldCheck(giftInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftInfo giftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftInfo.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            jsonGenerator.writeNumberField("num", giftInfo.num);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftInfo new_() {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.nullCheck();
        return giftInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftInfo mo223809clone() {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.giftType = this.giftType;
        giftInfo.num = this.num;
        return giftInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInfo)) {
            return false;
        }
        GiftInfo giftInfo = (GiftInfo) obj;
        return ValueObject.util_equals(this.giftType, giftInfo.giftType) && this.num == giftInfo.num;
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
        String str = this.giftType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.num;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
