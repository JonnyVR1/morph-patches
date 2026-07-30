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
public class PickInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pickinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public PicksTagType picksTagType;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String picksTracker;
    public static ProtobufAdapter<PickInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PickInfo>() { // from class: com.p1.mobile.putong.core.data.PickInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PickInfo pickInfo) {
            PicksTagType picksTagType = pickInfo.picksTagType;
            int iL = picksTagType != null ? CodedOutputByteBufferNano.l(1, picksTagType, PicksTagType.PROTOBUF_ADAPTER) : 0;
            String str = pickInfo.picksTracker;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) pickInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PickInfo m14771parse(nb5 nb5Var) throws IOException {
            PickInfo pickInfo = new PickInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (pickInfo.picksTagType == null) {
                        pickInfo.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                    }
                    if (pickInfo.picksTracker != null) {
                        break;
                    }
                    pickInfo.picksTracker = "";
                    break;
                }
                if (iU == 10) {
                    pickInfo.picksTagType = (PicksTagType) nb5Var.l(PicksTagType.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (pickInfo.picksTagType == null) {
                            pickInfo.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
                        }
                        if (pickInfo.picksTracker != null) {
                            break;
                        }
                        pickInfo.picksTracker = "";
                        return pickInfo;
                    }
                    pickInfo.picksTracker = nb5Var.s();
                }
            }
            return pickInfo;
        }

        public void serialize(PickInfo pickInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            PicksTagType picksTagType = pickInfo.picksTagType;
            if (picksTagType != null) {
                codedOutputByteBufferNano.K(1, picksTagType, PicksTagType.PROTOBUF_ADAPTER);
            }
            String str = pickInfo.picksTracker;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<PickInfo> JSON_ADAPTER = new ObjectJsonAdapter<PickInfo>() { // from class: com.p1.mobile.putong.core.data.PickInfo.2
        public Class getDataClass() {
            return PickInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PickInfo m14772newInstance() {
            return new PickInfo();
        }

        public boolean parseField(PickInfo pickInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("picksTagType")) {
                pickInfo.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("picksTracker")) {
                return false;
            }
            pickInfo.picksTracker = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(PickInfo pickInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("picksTagType") || str.equals("picksTracker")) {
                return true;
            }
            return super.parseFieldCheck(pickInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(PickInfo pickInfo, JsonGenerator jsonGenerator) throws IOException {
            if (pickInfo.picksTagType != null) {
                jsonGenerator.writeFieldName("picksTagType");
                PicksTagType.JSON_ADAPTER.serialize(pickInfo.picksTagType, jsonGenerator, true);
            }
            String str = pickInfo.picksTracker;
            if (str != null) {
                jsonGenerator.writeStringField("picksTracker", str);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PickInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PickInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PickInfo new_() {
        PickInfo pickInfo = new PickInfo();
        pickInfo.nullCheck();
        return pickInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PickInfo m14770clone() {
        PickInfo pickInfo = new PickInfo();
        pickInfo.picksTagType = this.picksTagType;
        pickInfo.picksTracker = this.picksTracker;
        return pickInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PickInfo)) {
            return false;
        }
        PickInfo pickInfo = (PickInfo) obj;
        return ValueObject.util_equals(this.picksTagType, pickInfo.picksTagType) && ValueObject.util_equals(this.picksTracker, pickInfo.picksTracker);
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
        PicksTagType picksTagType = this.picksTagType;
        int iHashCode = (i2 + (picksTagType != null ? picksTagType.hashCode() : 0)) * 41;
        String str = this.picksTracker;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.picksTagType == null) {
            this.picksTagType = (PicksTagType) PicksTagType.JSON_ADAPTER.defaultEnum();
        }
        if (this.picksTracker == null) {
            this.picksTracker = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
