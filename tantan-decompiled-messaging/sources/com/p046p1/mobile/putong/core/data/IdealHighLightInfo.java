package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.IdealHighLightInfo;
import com.p046p1.mobile.putong.data.IdealTag;
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
public class IdealHighLightInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealhighlightinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> profile;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<IdealTag> tags;
    public static ProtobufAdapter<IdealHighLightInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealHighLightInfo>() { // from class: com.p1.mobile.putong.core.data.IdealHighLightInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealHighLightInfo idealHighLightInfo) {
            List<String> list = idealHighLightInfo.profile;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IdealTag> list2 = idealHighLightInfo.tags;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            idealHighLightInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealHighLightInfo parse(nb5 nb5Var) throws IOException {
            IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (idealHighLightInfo.profile == null) {
                        idealHighLightInfo.profile = new ArrayList();
                    }
                    if (idealHighLightInfo.tags != null) {
                        break;
                    }
                    idealHighLightInfo.tags = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    idealHighLightInfo.profile = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (idealHighLightInfo.profile == null) {
                            idealHighLightInfo.profile = new ArrayList();
                        }
                        if (idealHighLightInfo.tags != null) {
                            break;
                        }
                        idealHighLightInfo.tags = new ArrayList();
                        return idealHighLightInfo;
                    }
                    idealHighLightInfo.tags = (List) nb5Var.m158743l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealHighLightInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealHighLightInfo idealHighLightInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = idealHighLightInfo.profile;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list2 = idealHighLightInfo.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealHighLightInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdealHighLightInfo>() { // from class: com.p1.mobile.putong.core.data.IdealHighLightInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealHighLightInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealHighLightInfo newInstance() {
            return new IdealHighLightInfo();
        }

        public boolean parseField(IdealHighLightInfo idealHighLightInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("profile")) {
                idealHighLightInfo.profile = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("tags")) {
                return false;
            }
            idealHighLightInfo.tags = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IdealHighLightInfo idealHighLightInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("profile") || str.equals("tags")) {
                return true;
            }
            return super.parseFieldCheck(idealHighLightInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealHighLightInfo idealHighLightInfo, JsonGenerator jsonGenerator) throws IOException {
            if (idealHighLightInfo.profile != null) {
                jsonGenerator.writeFieldName("profile");
                JsonAdapter.serializeArray(idealHighLightInfo.profile, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (idealHighLightInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(idealHighLightInfo.tags, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealHighLightInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealHighLightInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35596b(String str) {
        return str;
    }

    public static IdealHighLightInfo new_() {
        IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
        idealHighLightInfo.nullCheck();
        return idealHighLightInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealHighLightInfo mo223809clone() {
        IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
        List<String> list = this.profile;
        if (list != null) {
            idealHighLightInfo.profile = ValueObject.util_map(list, new w9j() { // from class: l.nbm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return IdealHighLightInfo.m35596b((String) obj);
                }
            });
        }
        List<IdealTag> list2 = this.tags;
        if (list2 != null) {
            idealHighLightInfo.tags = ValueObject.util_map(list2, new w9j() { // from class: l.obm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((IdealTag) obj).mo223809clone();
                }
            });
        }
        return idealHighLightInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealHighLightInfo)) {
            return false;
        }
        IdealHighLightInfo idealHighLightInfo = (IdealHighLightInfo) obj;
        return ValueObject.util_equals(this.profile, idealHighLightInfo.profile) && ValueObject.util_equals(this.tags, idealHighLightInfo.tags);
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
        List<String> list = this.profile;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IdealTag> list2 = this.tags;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.profile == null) {
            this.profile = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
