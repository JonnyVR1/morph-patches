package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IdealTag;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class IdealTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealtag";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> fitIdealDetails;
    public boolean hasChecked = false;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f221id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public static ProtobufAdapter<IdealTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealTag>() { // from class: com.p1.mobile.putong.data.IdealTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdealTag idealTag) {
            String str = idealTag.f221id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = idealTag.name;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            List<String> list = idealTag.fitIdealDetails;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) idealTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdealTag m18214parse(nb5 nb5Var) throws IOException {
            IdealTag idealTag = new IdealTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idealTag.f221id == null) {
                        idealTag.f221id = "";
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
                if (iU == 10) {
                    idealTag.f221id = nb5Var.s();
                } else if (iU == 18) {
                    idealTag.name = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (idealTag.f221id == null) {
                            idealTag.f221id = "";
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
                    idealTag.fitIdealDetails = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealTag;
        }

        public void serialize(IdealTag idealTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealTag.f221id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = idealTag.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            List<String> list = idealTag.fitIdealDetails;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealTag> JSON_ADAPTER = new ObjectJsonAdapter<IdealTag>() { // from class: com.p1.mobile.putong.data.IdealTag.2
        public Class getDataClass() {
            return IdealTag.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public IdealTag mo17830newInstance() {
            return new IdealTag();
        }

        public boolean parseField(IdealTag idealTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    idealTag.f221id = jsonParser.getValueAsString();
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealTag idealTag, JsonGenerator jsonGenerator) throws IOException {
            String str = idealTag.f221id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = idealTag.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (idealTag.fitIdealDetails != null) {
                jsonGenerator.writeFieldName("fitIdealDetails");
                JsonAdapter.serializeArray(idealTag.fitIdealDetails, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m722a(String str) {
        return str;
    }

    public static IdealTag new_() {
        IdealTag idealTag = new IdealTag();
        idealTag.nullCheck();
        return idealTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdealTag m18213clone() {
        IdealTag idealTag = new IdealTag();
        idealTag.f221id = this.f221id;
        idealTag.name = this.name;
        List<String> list = this.fitIdealDetails;
        if (list != null) {
            idealTag.fitIdealDetails = ValueObject.util_map(list, new w9j() { // from class: l.zbm
                public final Object call(Object obj) {
                    return IdealTag.m722a((String) obj);
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
        return ValueObject.util_equals(this.f221id, idealTag.f221id) && ValueObject.util_equals(this.name, idealTag.name) && ValueObject.util_equals(this.fitIdealDetails, idealTag.fitIdealDetails);
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
        String str = this.f221id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.fitIdealDetails;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f221id == null) {
            this.f221id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.fitIdealDetails == null) {
            this.fitIdealDetails = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
