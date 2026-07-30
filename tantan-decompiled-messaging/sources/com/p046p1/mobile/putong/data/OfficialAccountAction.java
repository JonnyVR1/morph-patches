package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class OfficialAccountAction extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "officialaccountaction";

    @Nullable
    @ProtobufIndex(index = 2)
    public String data;

    @NonNull
    @ProtobufIndex(index = 1)
    public OfficialAccountActionType type;
    public static ProtobufAdapter<OfficialAccountAction> PROTOBUF_ADAPTER = new MessageNanoAdapter<OfficialAccountAction>() { // from class: com.p1.mobile.putong.data.OfficialAccountAction.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OfficialAccountAction officialAccountAction) {
            OfficialAccountActionType officialAccountActionType = officialAccountAction.type;
            int iM17226h = officialAccountActionType != null ? CodedOutputByteBufferNano.m17226h(1, officialAccountActionType.ordinal()) : 0;
            String str = officialAccountAction.data;
            if (str != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(2, str);
            }
            OfficialAccountActionType officialAccountActionType2 = officialAccountAction.type;
            if (officialAccountActionType2 != null) {
                iM17226h += CodedOutputByteBufferNano.m17230l(3, officialAccountActionType2, OfficialAccountActionType.PROTOBUF_ADAPTER);
            }
            officialAccountAction.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OfficialAccountAction parse(nb5 nb5Var) throws IOException {
            OfficialAccountAction officialAccountAction = new OfficialAccountAction();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (officialAccountAction.type == null && numValueOf != null) {
                        officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (officialAccountAction.type != null) {
                        break;
                    }
                    officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 8) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 18) {
                    officialAccountAction.data = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (officialAccountAction.type == null && numValueOf != null) {
                            officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (officialAccountAction.type != null) {
                            break;
                        }
                        officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
                        return officialAccountAction;
                    }
                    officialAccountAction.type = (OfficialAccountActionType) nb5Var.m158743l(OfficialAccountActionType.PROTOBUF_ADAPTER);
                }
            }
            return officialAccountAction;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OfficialAccountAction officialAccountAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OfficialAccountActionType officialAccountActionType = officialAccountAction.type;
            if (officialAccountActionType != null) {
                codedOutputByteBufferNano.m17250G(1, officialAccountActionType.ordinal());
            }
            String str = officialAccountAction.data;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            OfficialAccountActionType officialAccountActionType2 = officialAccountAction.type;
            if (officialAccountActionType2 != null) {
                codedOutputByteBufferNano.m17254K(3, officialAccountActionType2, OfficialAccountActionType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAccountAction> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountAction>() { // from class: com.p1.mobile.putong.data.OfficialAccountAction.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OfficialAccountAction.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OfficialAccountAction newInstance() {
            return new OfficialAccountAction();
        }

        public boolean parseField(OfficialAccountAction officialAccountAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("data")) {
                officialAccountAction.data = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            officialAccountAction.type = OfficialAccountActionType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(OfficialAccountAction officialAccountAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("data") || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(officialAccountAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccountAction officialAccountAction, JsonGenerator jsonGenerator) throws IOException {
            if (officialAccountAction.type != null) {
                jsonGenerator.writeFieldName("type");
                OfficialAccountActionType.JSON_ADAPTER.serialize(officialAccountAction.type, jsonGenerator, true);
            }
            String str = officialAccountAction.data;
            if (str != null) {
                jsonGenerator.writeStringField("data", str);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAccountAction new_() {
        OfficialAccountAction officialAccountAction = new OfficialAccountAction();
        officialAccountAction.nullCheck();
        return officialAccountAction;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OfficialAccountAction mo223809clone() {
        OfficialAccountAction officialAccountAction = new OfficialAccountAction();
        officialAccountAction.type = this.type;
        officialAccountAction.data = this.data;
        return officialAccountAction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfficialAccountAction)) {
            return false;
        }
        OfficialAccountAction officialAccountAction = (OfficialAccountAction) obj;
        return ValueObject.util_equals(this.type, officialAccountAction.type) && ValueObject.util_equals(this.data, officialAccountAction.data);
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
        OfficialAccountActionType officialAccountActionType = this.type;
        int iHashCode = (i2 + (officialAccountActionType != null ? officialAccountActionType.hashCode() : 0)) * 41;
        String str = this.data;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.type == null) {
            this.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
