package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.SeeTrialStatus;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SeeTrialStatus extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seetrialstatus";

    @ProtobufIndex(index = 4)
    public long expireAt;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<Long> seeUsers;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long startAt;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String status;
    public static ProtobufAdapter<SeeTrialStatus> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeTrialStatus>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatus.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeTrialStatus seeTrialStatus) {
            List<Long> list = seeTrialStatus.seeUsers;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = seeTrialStatus.status;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            int iJ = iL + CodedOutputByteBufferNano.j(3, seeTrialStatus.startAt) + CodedOutputByteBufferNano.j(4, seeTrialStatus.expireAt);
            ((MessageNano) seeTrialStatus).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeTrialStatus m15555parse(nb5 nb5Var) throws IOException {
            SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeTrialStatus.seeUsers == null) {
                        seeTrialStatus.seeUsers = new ArrayList();
                    }
                    if (seeTrialStatus.status != null) {
                        break;
                    }
                    seeTrialStatus.status = "";
                    break;
                }
                if (iU == 10) {
                    seeTrialStatus.seeUsers = (List) nb5Var.l(ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    seeTrialStatus.status = nb5Var.s();
                } else if (iU == 24) {
                    seeTrialStatus.startAt = nb5Var.k();
                } else {
                    if (iU != 32) {
                        if (seeTrialStatus.seeUsers == null) {
                            seeTrialStatus.seeUsers = new ArrayList();
                        }
                        if (seeTrialStatus.status != null) {
                            break;
                        }
                        seeTrialStatus.status = "";
                        return seeTrialStatus;
                    }
                    seeTrialStatus.expireAt = nb5Var.k();
                }
            }
            return seeTrialStatus;
        }

        public void serialize(SeeTrialStatus seeTrialStatus, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<Long> list = seeTrialStatus.seeUsers;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.LONG_BOXED_ADAPTER.ARRAY_ADAPTER());
            }
            String str = seeTrialStatus.status;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.I(3, seeTrialStatus.startAt);
            codedOutputByteBufferNano.I(4, seeTrialStatus.expireAt);
        }
    };
    public static JsonAdapter<SeeTrialStatus> JSON_ADAPTER = new ObjectJsonAdapter<SeeTrialStatus>() { // from class: com.p1.mobile.putong.core.data.SeeTrialStatus.2
        public Class getDataClass() {
            return SeeTrialStatus.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeTrialStatus m15556newInstance() {
            return new SeeTrialStatus();
        }

        public boolean parseField(SeeTrialStatus seeTrialStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "expireAt":
                    seeTrialStatus.expireAt = jsonParser.getValueAsLong();
                    return true;
                case "startAt":
                    seeTrialStatus.startAt = jsonParser.getValueAsLong();
                    return true;
                case "status":
                    seeTrialStatus.status = jsonParser.getValueAsString();
                    return true;
                case "seeUsers":
                    seeTrialStatus.seeUsers = JsonAdapter.parseArray(jsonParser, JsonAdapter.LONG_BOXED_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeTrialStatus seeTrialStatus, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "expireAt":
                case "startAt":
                case "status":
                case "seeUsers":
                    return true;
                default:
                    return super.parseFieldCheck(seeTrialStatus, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeeTrialStatus seeTrialStatus, JsonGenerator jsonGenerator) throws IOException {
            if (seeTrialStatus.seeUsers != null) {
                jsonGenerator.writeFieldName("seeUsers");
                JsonAdapter.serializeArray(seeTrialStatus.seeUsers, jsonGenerator, JsonAdapter.LONG_BOXED_ADAPTER);
            }
            String str = seeTrialStatus.status;
            if (str != null) {
                jsonGenerator.writeStringField("status", str);
            }
            jsonGenerator.writeNumberField("startAt", seeTrialStatus.startAt);
            jsonGenerator.writeNumberField("expireAt", seeTrialStatus.expireAt);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeTrialStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeTrialStatus) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Long m634a(Long l2) {
        return l2;
    }

    public static SeeTrialStatus new_() {
        SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
        seeTrialStatus.nullCheck();
        return seeTrialStatus;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeTrialStatus m15554clone() {
        SeeTrialStatus seeTrialStatus = new SeeTrialStatus();
        List<Long> list = this.seeUsers;
        if (list != null) {
            seeTrialStatus.seeUsers = ValueObject.util_map(list, new w9j() { // from class: l.pbe0
                public final Object call(Object obj) {
                    return SeeTrialStatus.m634a((Long) obj);
                }
            });
        }
        seeTrialStatus.status = this.status;
        seeTrialStatus.startAt = this.startAt;
        seeTrialStatus.expireAt = this.expireAt;
        return seeTrialStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeTrialStatus)) {
            return false;
        }
        SeeTrialStatus seeTrialStatus = (SeeTrialStatus) obj;
        return ValueObject.util_equals(this.seeUsers, seeTrialStatus.seeUsers) && ValueObject.util_equals(this.status, seeTrialStatus.status) && this.startAt == seeTrialStatus.startAt && this.expireAt == seeTrialStatus.expireAt;
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
        List<Long> list = this.seeUsers;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.status;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.startAt;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.expireAt;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.seeUsers == null) {
            this.seeUsers = new ArrayList();
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
