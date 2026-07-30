package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.InactivateReasonDetail;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class InactivateReason extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "inactivatereason";

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<InactivateReasonDetail> reasons;
    public static ProtobufAdapter<InactivateReason> PROTOBUF_ADAPTER = new MessageNanoAdapter<InactivateReason>() { // from class: com.p1.mobile.putong.core.data.InactivateReason.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(InactivateReason inactivateReason) {
            String str = inactivateReason.key;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = inactivateReason.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<InactivateReasonDetail> list = inactivateReason.reasons;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            inactivateReason.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public InactivateReason parse(nb5 nb5Var) throws IOException {
            InactivateReason inactivateReason = new InactivateReason();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (inactivateReason.key == null) {
                        inactivateReason.key = "";
                    }
                    if (inactivateReason.name == null) {
                        inactivateReason.name = "";
                    }
                    if (inactivateReason.reasons != null) {
                        break;
                    }
                    inactivateReason.reasons = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    inactivateReason.key = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    inactivateReason.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (inactivateReason.key == null) {
                            inactivateReason.key = "";
                        }
                        if (inactivateReason.name == null) {
                            inactivateReason.name = "";
                        }
                        if (inactivateReason.reasons != null) {
                            break;
                        }
                        inactivateReason.reasons = new ArrayList();
                        return inactivateReason;
                    }
                    inactivateReason.reasons = (List) nb5Var.m158743l(InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return inactivateReason;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(InactivateReason inactivateReason, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = inactivateReason.key;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = inactivateReason.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<InactivateReasonDetail> list = inactivateReason.reasons;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, InactivateReasonDetail.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<InactivateReason> JSON_ADAPTER = new ObjectJsonAdapter<InactivateReason>() { // from class: com.p1.mobile.putong.core.data.InactivateReason.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return InactivateReason.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public InactivateReason newInstance() {
            return new InactivateReason();
        }

        public boolean parseField(InactivateReason inactivateReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "key":
                    inactivateReason.key = jsonParser.getValueAsString();
                    return true;
                case "name":
                    inactivateReason.name = jsonParser.getValueAsString();
                    return true;
                case "reasons":
                    inactivateReason.reasons = JsonAdapter.parseArray(jsonParser, InactivateReasonDetail.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(InactivateReason inactivateReason, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "key":
                case "name":
                case "reasons":
                    return true;
                default:
                    return super.parseFieldCheck(inactivateReason, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(InactivateReason inactivateReason, JsonGenerator jsonGenerator) throws IOException {
            String str = inactivateReason.key;
            if (str != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str);
            }
            String str2 = inactivateReason.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (inactivateReason.reasons != null) {
                jsonGenerator.writeFieldName("reasons");
                JsonAdapter.serializeArray(inactivateReason.reasons, jsonGenerator, InactivateReasonDetail.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((InactivateReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((InactivateReason) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static InactivateReason new_() {
        InactivateReason inactivateReason = new InactivateReason();
        inactivateReason.nullCheck();
        return inactivateReason;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public InactivateReason mo223809clone() {
        InactivateReason inactivateReason = new InactivateReason();
        inactivateReason.key = this.key;
        inactivateReason.name = this.name;
        List<InactivateReasonDetail> list = this.reasons;
        if (list != null) {
            inactivateReason.reasons = ValueObject.util_map(list, new w9j() { // from class: l.rqm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((InactivateReasonDetail) obj).mo223809clone();
                }
            });
        }
        return inactivateReason;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InactivateReason)) {
            return false;
        }
        InactivateReason inactivateReason = (InactivateReason) obj;
        return ValueObject.util_equals(this.key, inactivateReason.key) && ValueObject.util_equals(this.name, inactivateReason.name) && ValueObject.util_equals(this.reasons, inactivateReason.reasons);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<InactivateReasonDetail> list = this.reasons;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.reasons == null) {
            this.reasons = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
