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
public class PrivilegeDetail extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "privilegedetail";

    @NonNull
    @ProtobufIndex(index = 1)
    public String channel;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long count;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long duration;

    @ProtobufIndex(index = 4)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String privilegeType;

    @ProtobufIndex(index = 6)
    public long remaining;
    public static ProtobufAdapter<PrivilegeDetail> PROTOBUF_ADAPTER = new MessageNanoAdapter<PrivilegeDetail>() { // from class: com.p1.mobile.putong.core.data.PrivilegeDetail.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PrivilegeDetail privilegeDetail) {
            String str = privilegeDetail.channel;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(3, privilegeDetail.duration) + CodedOutputByteBufferNano.j(4, privilegeDetail.expireAt) + CodedOutputByteBufferNano.j(5, privilegeDetail.count) + CodedOutputByteBufferNano.j(6, privilegeDetail.remaining);
            ((MessageNano) privilegeDetail).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PrivilegeDetail m14879parse(nb5 nb5Var) throws IOException {
            PrivilegeDetail privilegeDetail = new PrivilegeDetail();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (privilegeDetail.channel == null) {
                        privilegeDetail.channel = "";
                    }
                    if (privilegeDetail.privilegeType != null) {
                        break;
                    }
                    privilegeDetail.privilegeType = "";
                    break;
                }
                if (iU == 10) {
                    privilegeDetail.channel = nb5Var.s();
                } else if (iU == 18) {
                    privilegeDetail.privilegeType = nb5Var.s();
                } else if (iU == 24) {
                    privilegeDetail.duration = nb5Var.k();
                } else if (iU == 32) {
                    privilegeDetail.expireAt = nb5Var.k();
                } else if (iU == 40) {
                    privilegeDetail.count = nb5Var.k();
                } else {
                    if (iU != 48) {
                        if (privilegeDetail.channel == null) {
                            privilegeDetail.channel = "";
                        }
                        if (privilegeDetail.privilegeType != null) {
                            break;
                        }
                        privilegeDetail.privilegeType = "";
                        return privilegeDetail;
                    }
                    privilegeDetail.remaining = nb5Var.k();
                }
            }
            return privilegeDetail;
        }

        public void serialize(PrivilegeDetail privilegeDetail, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = privilegeDetail.channel;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            codedOutputByteBufferNano.I(3, privilegeDetail.duration);
            codedOutputByteBufferNano.I(4, privilegeDetail.expireAt);
            codedOutputByteBufferNano.I(5, privilegeDetail.count);
            codedOutputByteBufferNano.I(6, privilegeDetail.remaining);
        }
    };
    public static JsonAdapter<PrivilegeDetail> JSON_ADAPTER = new ObjectJsonAdapter<PrivilegeDetail>() { // from class: com.p1.mobile.putong.core.data.PrivilegeDetail.2
        public Class getDataClass() {
            return PrivilegeDetail.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PrivilegeDetail m14880newInstance() {
            return new PrivilegeDetail();
        }

        public boolean parseField(PrivilegeDetail privilegeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "duration":
                    privilegeDetail.duration = jsonParser.getValueAsLong();
                    return true;
                case "expireAt":
                    privilegeDetail.expireAt = jsonParser.getValueAsLong();
                    return true;
                case "privilegeType":
                    privilegeDetail.privilegeType = jsonParser.getValueAsString();
                    return true;
                case "count":
                    privilegeDetail.count = jsonParser.getValueAsLong();
                    return true;
                case "channel":
                    privilegeDetail.channel = jsonParser.getValueAsString();
                    return true;
                case "remaining":
                    privilegeDetail.remaining = jsonParser.getValueAsLong();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PrivilegeDetail privilegeDetail, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "duration":
                case "expireAt":
                case "privilegeType":
                case "count":
                case "channel":
                case "remaining":
                    return true;
                default:
                    return super.parseFieldCheck(privilegeDetail, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PrivilegeDetail privilegeDetail, JsonGenerator jsonGenerator) throws IOException {
            String str = privilegeDetail.channel;
            if (str != null) {
                jsonGenerator.writeStringField("channel", str);
            }
            String str2 = privilegeDetail.privilegeType;
            if (str2 != null) {
                jsonGenerator.writeStringField("privilegeType", str2);
            }
            jsonGenerator.writeNumberField("duration", privilegeDetail.duration);
            jsonGenerator.writeNumberField("expireAt", privilegeDetail.expireAt);
            jsonGenerator.writeNumberField("count", privilegeDetail.count);
            jsonGenerator.writeNumberField("remaining", privilegeDetail.remaining);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PrivilegeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PrivilegeDetail) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PrivilegeDetail new_() {
        PrivilegeDetail privilegeDetail = new PrivilegeDetail();
        privilegeDetail.nullCheck();
        return privilegeDetail;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PrivilegeDetail m14878clone() {
        PrivilegeDetail privilegeDetail = new PrivilegeDetail();
        privilegeDetail.channel = this.channel;
        privilegeDetail.privilegeType = this.privilegeType;
        privilegeDetail.duration = this.duration;
        privilegeDetail.expireAt = this.expireAt;
        privilegeDetail.count = this.count;
        privilegeDetail.remaining = this.remaining;
        return privilegeDetail;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PrivilegeDetail)) {
            return false;
        }
        PrivilegeDetail privilegeDetail = (PrivilegeDetail) obj;
        return ValueObject.util_equals(this.channel, privilegeDetail.channel) && ValueObject.util_equals(this.privilegeType, privilegeDetail.privilegeType) && this.duration == privilegeDetail.duration && this.expireAt == privilegeDetail.expireAt && this.count == privilegeDetail.count && this.remaining == privilegeDetail.remaining;
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
        String str = this.channel;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeType;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.duration;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireAt;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        long j3 = this.count;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.remaining;
        int i6 = i5 + ((int) (j4 ^ (j4 >>> 32)));
        ((ValueObject) this).hashCode = i6;
        return i6;
    }

    public void nullCheck() {
        if (this.channel == null) {
            this.channel = "";
        }
        if (this.privilegeType == null) {
            this.privilegeType = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
