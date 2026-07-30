package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.IdealProfile;
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

/* JADX INFO: loaded from: classes10.dex */
public class IdealProfile extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealprofile";

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f21164id;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> profiles;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> tagIds;
    public static ProtobufAdapter<IdealProfile> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealProfile>() { // from class: com.p1.mobile.putong.core.data.IdealProfile.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(IdealProfile idealProfile) {
            String str = idealProfile.f21164id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            List<String> list = idealProfile.profiles;
            if (list != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = idealProfile.tagIds;
            if (list2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            idealProfile.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public IdealProfile parse(nc5 nc5Var) throws IOException {
            IdealProfile idealProfile = new IdealProfile();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (idealProfile.f21164id == null) {
                        idealProfile.f21164id = "";
                    }
                    if (idealProfile.profiles == null) {
                        idealProfile.profiles = new ArrayList();
                    }
                    if (idealProfile.tagIds != null) {
                        break;
                    }
                    idealProfile.tagIds = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    idealProfile.f21164id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    idealProfile.profiles = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (idealProfile.f21164id == null) {
                            idealProfile.f21164id = "";
                        }
                        if (idealProfile.profiles == null) {
                            idealProfile.profiles = new ArrayList();
                        }
                        if (idealProfile.tagIds != null) {
                            break;
                        }
                        idealProfile.tagIds = new ArrayList();
                        return idealProfile;
                    }
                    idealProfile.tagIds = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealProfile;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(IdealProfile idealProfile, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = idealProfile.f21164id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            List<String> list = idealProfile.profiles;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = idealProfile.tagIds;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(3, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealProfile> JSON_ADAPTER = new ObjectJsonAdapter<IdealProfile>() { // from class: com.p1.mobile.putong.core.data.IdealProfile.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return IdealProfile.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public IdealProfile newInstance() {
            return new IdealProfile();
        }

        public boolean parseField(IdealProfile idealProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profiles":
                    idealProfile.profiles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "tagIds":
                    idealProfile.tagIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    idealProfile.f21164id = jsonParser.getValueAsString();
                    return false;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(IdealProfile idealProfile, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "profiles":
                case "tagIds":
                    return true;
                case "id":
                    return false;
                default:
                    return super.parseFieldCheck(idealProfile, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(IdealProfile idealProfile, JsonGenerator jsonGenerator) throws IOException {
            String str = idealProfile.f21164id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (idealProfile.profiles != null) {
                jsonGenerator.writeFieldName("profiles");
                JsonAdapter.serializeArray(idealProfile.profiles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (idealProfile.tagIds != null) {
                jsonGenerator.writeFieldName("tagIds");
                JsonAdapter.serializeArray(idealProfile.tagIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealProfile) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36608a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m36609b(String str) {
        return str;
    }

    public static IdealProfile new_() {
        IdealProfile idealProfile = new IdealProfile();
        idealProfile.nullCheck();
        return idealProfile;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public IdealProfile mo225055clone() {
        IdealProfile idealProfile = new IdealProfile();
        idealProfile.f21164id = this.f21164id;
        List<String> list = this.profiles;
        if (list != null) {
            idealProfile.profiles = ValueObject.util_map(list, new qcj() { // from class: l.nem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IdealProfile.m36608a((String) obj);
                }
            });
        }
        List<String> list2 = this.tagIds;
        if (list2 != null) {
            idealProfile.tagIds = ValueObject.util_map(list2, new qcj() { // from class: l.oem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return IdealProfile.m36609b((String) obj);
                }
            });
        }
        return idealProfile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealProfile)) {
            return false;
        }
        IdealProfile idealProfile = (IdealProfile) obj;
        return ValueObject.util_equals(this.f21164id, idealProfile.f21164id) && ValueObject.util_equals(this.profiles, idealProfile.profiles) && ValueObject.util_equals(this.tagIds, idealProfile.tagIds);
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
        String str = this.f21164id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<String> list = this.profiles;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.tagIds;
        int iHashCode3 = iHashCode2 + (list2 != null ? list2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f21164id == null) {
            this.f21164id = "";
        }
        if (this.profiles == null) {
            this.profiles = new ArrayList();
        }
        if (this.tagIds == null) {
            this.tagIds = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
