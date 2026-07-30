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
public class LiveAnchor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveanchor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String guildId;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public VerificationStatus status;
    public static ProtobufAdapter<LiveAnchor> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveAnchor>() { // from class: com.p1.mobile.putong.core.data.LiveAnchor.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveAnchor liveAnchor) {
            String str = liveAnchor.guildId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            VerificationStatus verificationStatus = liveAnchor.status;
            if (verificationStatus != null) {
                iO += CodedOutputByteBufferNano.h(2, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = liveAnchor.status;
            if (verificationStatus2 != null) {
                iO += CodedOutputByteBufferNano.l(3, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
            ((MessageNano) liveAnchor).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveAnchor m13923parse(nb5 nb5Var) throws IOException {
            LiveAnchor liveAnchor = new LiveAnchor();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveAnchor.status == null && numValueOf != null) {
                        liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                    }
                    if (liveAnchor.guildId == null) {
                        liveAnchor.guildId = "";
                    }
                    if (liveAnchor.status != null) {
                        break;
                    }
                    liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 10) {
                    liveAnchor.guildId = nb5Var.s();
                } else if (iU == 16) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else {
                    if (iU != 26) {
                        if (liveAnchor.status == null && numValueOf != null) {
                            liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum((String) null, numValueOf.intValue());
                        }
                        if (liveAnchor.guildId == null) {
                            liveAnchor.guildId = "";
                        }
                        if (liveAnchor.status != null) {
                            break;
                        }
                        liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
                        return liveAnchor;
                    }
                    liveAnchor.status = (VerificationStatus) nb5Var.l(VerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return liveAnchor;
        }

        public void serialize(LiveAnchor liveAnchor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveAnchor.guildId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            VerificationStatus verificationStatus = liveAnchor.status;
            if (verificationStatus != null) {
                codedOutputByteBufferNano.G(2, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = liveAnchor.status;
            if (verificationStatus2 != null) {
                codedOutputByteBufferNano.K(3, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveAnchor> JSON_ADAPTER = new ObjectJsonAdapter<LiveAnchor>() { // from class: com.p1.mobile.putong.core.data.LiveAnchor.2
        public Class getDataClass() {
            return LiveAnchor.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LiveAnchor m13924newInstance() {
            return new LiveAnchor();
        }

        public boolean parseField(LiveAnchor liveAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("status")) {
                liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
                return true;
            }
            if (!str.equals("guildId")) {
                return false;
            }
            liveAnchor.guildId = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveAnchor liveAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("status") || str.equals("guildId")) {
                return true;
            }
            return super.parseFieldCheck(liveAnchor, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(LiveAnchor liveAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = liveAnchor.guildId;
            if (str != null) {
                jsonGenerator.writeStringField("guildId", str);
            }
            if (liveAnchor.status != null) {
                jsonGenerator.writeFieldName("status");
                VerificationStatus.JSON_ADAPTER.serialize(liveAnchor.status, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAnchor new_() {
        LiveAnchor liveAnchor = new LiveAnchor();
        liveAnchor.nullCheck();
        return liveAnchor;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveAnchor m13922clone() {
        LiveAnchor liveAnchor = new LiveAnchor();
        liveAnchor.guildId = this.guildId;
        liveAnchor.status = this.status;
        return liveAnchor;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveAnchor)) {
            return false;
        }
        LiveAnchor liveAnchor = (LiveAnchor) obj;
        return ValueObject.util_equals(this.guildId, liveAnchor.guildId) && ValueObject.util_equals(this.status, liveAnchor.status);
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
        String str = this.guildId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        VerificationStatus verificationStatus = this.status;
        int iHashCode2 = iHashCode + (verificationStatus != null ? verificationStatus.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.guildId == null) {
            this.guildId = "";
        }
        if (this.status == null) {
            this.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
