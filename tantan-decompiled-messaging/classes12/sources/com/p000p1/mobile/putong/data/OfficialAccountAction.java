package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(OfficialAccountAction officialAccountAction) {
            OfficialAccountActionType officialAccountActionType = officialAccountAction.type;
            int iH = officialAccountActionType != null ? CodedOutputByteBufferNano.h(1, officialAccountActionType.ordinal()) : 0;
            String str = officialAccountAction.data;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            OfficialAccountActionType officialAccountActionType2 = officialAccountAction.type;
            if (officialAccountActionType2 != null) {
                iH += CodedOutputByteBufferNano.l(3, officialAccountActionType2, OfficialAccountActionType.PROTOBUF_ADAPTER);
            }
            ((MessageNano) officialAccountAction).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public OfficialAccountAction m18702parse(nb5 nb5Var) throws IOException {
            OfficialAccountAction officialAccountAction = new OfficialAccountAction();
            Integer numValueOf = null;
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (officialAccountAction.type == null && numValueOf != null) {
                        officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (officialAccountAction.type != null) {
                        break;
                    }
                    officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iU == 8) {
                    numValueOf = Integer.valueOf(nb5Var.j());
                } else if (iU == 18) {
                    officialAccountAction.data = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (officialAccountAction.type == null && numValueOf != null) {
                            officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (officialAccountAction.type != null) {
                            break;
                        }
                        officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
                        return officialAccountAction;
                    }
                    officialAccountAction.type = (OfficialAccountActionType) nb5Var.l(OfficialAccountActionType.PROTOBUF_ADAPTER);
                }
            }
            return officialAccountAction;
        }

        public void serialize(OfficialAccountAction officialAccountAction, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            OfficialAccountActionType officialAccountActionType = officialAccountAction.type;
            if (officialAccountActionType != null) {
                codedOutputByteBufferNano.G(1, officialAccountActionType.ordinal());
            }
            String str = officialAccountAction.data;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            OfficialAccountActionType officialAccountActionType2 = officialAccountAction.type;
            if (officialAccountActionType2 != null) {
                codedOutputByteBufferNano.K(3, officialAccountActionType2, OfficialAccountActionType.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<OfficialAccountAction> JSON_ADAPTER = new ObjectJsonAdapter<OfficialAccountAction>() { // from class: com.p1.mobile.putong.data.OfficialAccountAction.2
        public Class getDataClass() {
            return OfficialAccountAction.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public OfficialAccountAction mo17830newInstance() {
            return new OfficialAccountAction();
        }

        public boolean parseField(OfficialAccountAction officialAccountAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(Data.TYPE)) {
                officialAccountAction.data = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("type")) {
                return false;
            }
            officialAccountAction.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.parse(jsonParser, str2);
            return true;
        }

        public boolean parseFieldCheck(OfficialAccountAction officialAccountAction, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(Data.TYPE) || str.equals("type")) {
                return true;
            }
            return super.parseFieldCheck(officialAccountAction, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OfficialAccountAction officialAccountAction, JsonGenerator jsonGenerator) throws IOException {
            if (officialAccountAction.type != null) {
                jsonGenerator.writeFieldName("type");
                OfficialAccountActionType.JSON_ADAPTER.serialize(officialAccountAction.type, jsonGenerator, true);
            }
            String str = officialAccountAction.data;
            if (str != null) {
                jsonGenerator.writeStringField(Data.TYPE, str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OfficialAccountAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OfficialAccountAction) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static OfficialAccountAction new_() {
        OfficialAccountAction officialAccountAction = new OfficialAccountAction();
        officialAccountAction.nullCheck();
        return officialAccountAction;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public OfficialAccountAction m18701clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        OfficialAccountActionType officialAccountActionType = this.type;
        int iHashCode = (i2 + (officialAccountActionType != null ? officialAccountActionType.hashCode() : 0)) * 41;
        String str = this.data;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.type == null) {
            this.type = (OfficialAccountActionType) OfficialAccountActionType.JSON_ADAPTER.defaultEnum();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
