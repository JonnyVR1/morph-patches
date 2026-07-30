package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes12.dex */
public class IdealTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtag";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> fitIdealDetails;
    public boolean hasChecked = false;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39608id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<IdealTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTag>() { // from class: com.p1.mobile.putong.data.IdealTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealTag idealTag) {
            String str = idealTag.f39608id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = idealTag.name;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            List<String> list = idealTag.fitIdealDetails;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            idealTag.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealTag parse(nc5 nc5Var) throws IOException {
            IdealTag idealTag = new IdealTag();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idealTag.f39608id == null) {
                        idealTag.f39608id = "";
                    }
                    if (idealTag.name == null) {
                        idealTag.name = "";
                    }
                    if (idealTag.fitIdealDetails != null) {
                        break;
                    }
                    idealTag.fitIdealDetails = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    idealTag.f39608id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    idealTag.name = nc5Var.m162495s();
                } else {
                    if (iM162497u != 26) {
                        if (idealTag.f39608id == null) {
                            idealTag.f39608id = "";
                        }
                        if (idealTag.name == null) {
                            idealTag.name = "";
                        }
                        if (idealTag.fitIdealDetails != null) {
                            break;
                        }
                        idealTag.fitIdealDetails = new ArrayList();
                        return idealTag;
                    }
                    idealTag.fitIdealDetails = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealTag idealTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealTag.f39608id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = idealTag.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            List<String> list = idealTag.fitIdealDetails;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealTag> JSON_ADAPTER = new ObjectJsonAdapter<IdealTag>() { // from class: com.p1.mobile.putong.data.IdealTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealTag.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealTag newInstance() {
            return new IdealTag();
        }

        public boolean parseField(IdealTag idealTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    idealTag.f39608id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    idealTag.name = jsonParser.getValueAsString();
                    return true;
                case "fitIdealDetails":
                    idealTag.fitIdealDetails = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealTag idealTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "name":
                case "fitIdealDetails":
                    return true;
                default:
                    return super.parseFieldCheck(idealTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealTag idealTag, JsonGenerator jsonGenerator) throws IOException {
            String str = idealTag.f39608id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = idealTag.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (idealTag.fitIdealDetails != null) {
                jsonGenerator.writeFieldName("fitIdealDetails");
                JsonAdapter.serializeArray(idealTag.fitIdealDetails, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60988a(String str) {
        return str;
    }

    public static IdealTag new_() {
        IdealTag idealTag = new IdealTag();
        idealTag.nullCheck();
        return idealTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealTag mo225055clone() {
        IdealTag idealTag = new IdealTag();
        idealTag.f39608id = this.f39608id;
        idealTag.name = this.name;
        List<String> list = this.fitIdealDetails;
        if (list != null) {
            idealTag.fitIdealDetails = ValueObject.util_map(list, new qcj() { // from class: l.pem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IdealTag.m60988a((String) obj);
                }
            });
        }
        return idealTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealTag)) {
            return false;
        }
        IdealTag idealTag = (IdealTag) obj;
        return ValueObject.util_equals(this.f39608id, idealTag.f39608id) && ValueObject.util_equals(this.name, idealTag.name) && ValueObject.util_equals(this.fitIdealDetails, idealTag.fitIdealDetails);
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
        String str = this.f39608id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.fitIdealDetails;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39608id == null) {
            this.f39608id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.fitIdealDetails == null) {
            this.fitIdealDetails = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
