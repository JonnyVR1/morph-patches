package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class GiftInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public String giftType;

    @ProtobufIndex(index = 2)
    public int num;
    public static ProtobufAdapter<GiftInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftInfo>() { // from class: com.p1.mobile.putong.data.GiftInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GiftInfo giftInfo) {
            String str = giftInfo.giftType;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, giftInfo.num);
            ((MessageNano) giftInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GiftInfo m18181parse(nb5 nb5Var) throws IOException {
            GiftInfo giftInfo = new GiftInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (giftInfo.giftType != null) {
                        break;
                    }
                    giftInfo.giftType = "";
                    break;
                }
                if (iU == 10) {
                    giftInfo.giftType = nb5Var.s();
                } else {
                    if (iU != 16) {
                        if (giftInfo.giftType != null) {
                            break;
                        }
                        giftInfo.giftType = "";
                        return giftInfo;
                    }
                    giftInfo.num = nb5Var.j();
                }
            }
            return giftInfo;
        }

        public void serialize(GiftInfo giftInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = giftInfo.giftType;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, giftInfo.num);
        }
    };
    public static JsonAdapter<GiftInfo> JSON_ADAPTER = new ObjectJsonAdapter<GiftInfo>() { // from class: com.p1.mobile.putong.data.GiftInfo.2
        public Class getDataClass() {
            return GiftInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GiftInfo mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftInfo giftInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = giftInfo.giftType;
            if (str != null) {
                jsonGenerator.writeStringField("giftType", str);
            }
            jsonGenerator.writeNumberField("num", giftInfo.num);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GiftInfo new_() {
        GiftInfo giftInfo = new GiftInfo();
        giftInfo.nullCheck();
        return giftInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GiftInfo m18180clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.giftType;
        int iHashCode = ((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.num;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.giftType == null) {
            this.giftType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
