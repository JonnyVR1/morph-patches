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
public class ODiamondListFeedRelation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "odiamondlistfeedrelation";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String otherStatus;

    @NonNull
    @ProtobufIndex(index = 1)
    public String status;
    public static ProtobufAdapter<ODiamondListFeedRelation> PROTOBUF_ADAPTER = new MessageNanoAdapter<ODiamondListFeedRelation>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedRelation.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ODiamondListFeedRelation oDiamondListFeedRelation) {
            String str = oDiamondListFeedRelation.status;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) oDiamondListFeedRelation).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeedRelation m14603parse(nb5 nb5Var) throws IOException {
            ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (oDiamondListFeedRelation.status == null) {
                        oDiamondListFeedRelation.status = "";
                    }
                    if (oDiamondListFeedRelation.otherStatus != null) {
                        break;
                    }
                    oDiamondListFeedRelation.otherStatus = "";
                    break;
                }
                if (iU == 10) {
                    oDiamondListFeedRelation.status = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (oDiamondListFeedRelation.status == null) {
                            oDiamondListFeedRelation.status = "";
                        }
                        if (oDiamondListFeedRelation.otherStatus != null) {
                            break;
                        }
                        oDiamondListFeedRelation.otherStatus = "";
                        return oDiamondListFeedRelation;
                    }
                    oDiamondListFeedRelation.otherStatus = nb5Var.s();
                }
            }
            return oDiamondListFeedRelation;
        }

        public void serialize(ODiamondListFeedRelation oDiamondListFeedRelation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = oDiamondListFeedRelation.status;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<ODiamondListFeedRelation> JSON_ADAPTER = new ObjectJsonAdapter<ODiamondListFeedRelation>() { // from class: com.p1.mobile.putong.core.data.ODiamondListFeedRelation.2
        public Class getDataClass() {
            return ODiamondListFeedRelation.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ODiamondListFeedRelation m14604newInstance() {
            return new ODiamondListFeedRelation();
        }

        public boolean parseField(ODiamondListFeedRelation oDiamondListFeedRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("otherStatus")) {
                oDiamondListFeedRelation.otherStatus = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("status")) {
                return false;
            }
            oDiamondListFeedRelation.status = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(ODiamondListFeedRelation oDiamondListFeedRelation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("otherStatus") || str.equals("status")) {
                return true;
            }
            return super.parseFieldCheck(oDiamondListFeedRelation, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ODiamondListFeedRelation oDiamondListFeedRelation, JsonGenerator jsonGenerator) throws IOException {
            String str = oDiamondListFeedRelation.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
            String str2 = oDiamondListFeedRelation.otherStatus;
            if (str2 != null) {
                jsonGenerator.writeStringField("otherStatus", str2);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ODiamondListFeedRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ODiamondListFeedRelation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ODiamondListFeedRelation new_() {
        ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
        oDiamondListFeedRelation.nullCheck();
        return oDiamondListFeedRelation;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ODiamondListFeedRelation m14602clone() {
        ODiamondListFeedRelation oDiamondListFeedRelation = new ODiamondListFeedRelation();
        oDiamondListFeedRelation.status = this.status;
        oDiamondListFeedRelation.otherStatus = this.otherStatus;
        return oDiamondListFeedRelation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ODiamondListFeedRelation)) {
            return false;
        }
        ODiamondListFeedRelation oDiamondListFeedRelation = (ODiamondListFeedRelation) obj;
        return ValueObject.util_equals(this.status, oDiamondListFeedRelation.status) && ValueObject.util_equals(this.otherStatus, oDiamondListFeedRelation.otherStatus);
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
        String str = this.status;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.otherStatus;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.status == null) {
            this.status = "";
        }
        if (this.otherStatus == null) {
            this.otherStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
