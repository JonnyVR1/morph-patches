package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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

/* JADX INFO: loaded from: classes10.dex */
public class LiveAnchor extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "liveanchor";

    @NonNull
    @ProtobufIndex(index = 1)
    public String guildId;

    @NonNull
    @ProtobufIndex(index = 2)
    public VerificationStatus status;
    public static ProtobufAdapter<LiveAnchor> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveAnchor>() { // from class: com.p1.mobile.putong.core.data.LiveAnchor.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LiveAnchor liveAnchor) {
            String str = liveAnchor.guildId;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            VerificationStatus verificationStatus = liveAnchor.status;
            if (verificationStatus != null) {
                iM17233o += CodedOutputByteBufferNano.m17226h(2, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = liveAnchor.status;
            if (verificationStatus2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
            liveAnchor.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LiveAnchor parse(nb5 nb5Var) throws IOException {
            LiveAnchor liveAnchor = new LiveAnchor();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (liveAnchor.status == null && numValueOf != null) {
                        liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                if (iM158752u == 10) {
                    liveAnchor.guildId = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else {
                    if (iM158752u != 26) {
                        if (liveAnchor.status == null && numValueOf != null) {
                            liveAnchor.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
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
                    liveAnchor.status = (VerificationStatus) nb5Var.m158743l(VerificationStatus.PROTOBUF_ADAPTER);
                }
            }
            return liveAnchor;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LiveAnchor liveAnchor, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveAnchor.guildId;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            VerificationStatus verificationStatus = liveAnchor.status;
            if (verificationStatus != null) {
                codedOutputByteBufferNano.m17250G(2, verificationStatus.ordinal());
            }
            VerificationStatus verificationStatus2 = liveAnchor.status;
            if (verificationStatus2 != null) {
                codedOutputByteBufferNano.m17254K(3, verificationStatus2, VerificationStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<LiveAnchor> JSON_ADAPTER = new ObjectJsonAdapter<LiveAnchor>() { // from class: com.p1.mobile.putong.core.data.LiveAnchor.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LiveAnchor.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LiveAnchor newInstance() {
            return new LiveAnchor();
        }

        public boolean parseField(LiveAnchor liveAnchor, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(NotificationCompat.CATEGORY_STATUS)) {
                liveAnchor.status = VerificationStatus.JSON_ADAPTER.parse(jsonParser, str2);
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
            if (str.equals(NotificationCompat.CATEGORY_STATUS) || str.equals("guildId")) {
                return true;
            }
            return super.parseFieldCheck(liveAnchor, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveAnchor liveAnchor, JsonGenerator jsonGenerator) throws IOException {
            String str = liveAnchor.guildId;
            if (str != null) {
                jsonGenerator.writeStringField("guildId", str);
            }
            if (liveAnchor.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                VerificationStatus.JSON_ADAPTER.serialize(liveAnchor.status, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveAnchor) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveAnchor new_() {
        LiveAnchor liveAnchor = new LiveAnchor();
        liveAnchor.nullCheck();
        return liveAnchor;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LiveAnchor mo223809clone() {
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
        String str = this.guildId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        VerificationStatus verificationStatus = this.status;
        int iHashCode2 = iHashCode + (verificationStatus != null ? verificationStatus.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guildId == null) {
            this.guildId = "";
        }
        if (this.status == null) {
            this.status = (VerificationStatus) VerificationStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
