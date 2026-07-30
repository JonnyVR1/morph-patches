package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.FourSelectOneAdCardData;
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
public class FourSelectOneAdCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fourselectoneadcarddata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String adContent;

    @NonNull
    @ProtobufIndex(index = 2)
    public String adTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> avatarList;

    @NonNull
    @ProtobufIndex(index = 4)
    public String firstIds;
    public static ProtobufAdapter<FourSelectOneAdCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FourSelectOneAdCardData>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(FourSelectOneAdCardData fourSelectOneAdCardData) {
            List<String> list = fourSelectOneAdCardData.avatarList;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            fourSelectOneAdCardData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public FourSelectOneAdCardData parse(nb5 nb5Var) throws IOException {
            FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (fourSelectOneAdCardData.avatarList == null) {
                        fourSelectOneAdCardData.avatarList = new ArrayList();
                    }
                    if (fourSelectOneAdCardData.adTitle == null) {
                        fourSelectOneAdCardData.adTitle = "";
                    }
                    if (fourSelectOneAdCardData.adContent == null) {
                        fourSelectOneAdCardData.adContent = "";
                    }
                    if (fourSelectOneAdCardData.firstIds != null) {
                        break;
                    }
                    fourSelectOneAdCardData.firstIds = "";
                    break;
                }
                if (iM158752u == 10) {
                    fourSelectOneAdCardData.avatarList = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    fourSelectOneAdCardData.adTitle = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    fourSelectOneAdCardData.adContent = nb5Var.m158750s();
                } else {
                    if (iM158752u != 34) {
                        if (fourSelectOneAdCardData.avatarList == null) {
                            fourSelectOneAdCardData.avatarList = new ArrayList();
                        }
                        if (fourSelectOneAdCardData.adTitle == null) {
                            fourSelectOneAdCardData.adTitle = "";
                        }
                        if (fourSelectOneAdCardData.adContent == null) {
                            fourSelectOneAdCardData.adContent = "";
                        }
                        if (fourSelectOneAdCardData.firstIds != null) {
                            break;
                        }
                        fourSelectOneAdCardData.firstIds = "";
                        return fourSelectOneAdCardData;
                    }
                    fourSelectOneAdCardData.firstIds = nb5Var.m158750s();
                }
            }
            return fourSelectOneAdCardData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(FourSelectOneAdCardData fourSelectOneAdCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = fourSelectOneAdCardData.avatarList;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
        }
    };
    public static JsonAdapter<FourSelectOneAdCardData> JSON_ADAPTER = new ObjectJsonAdapter<FourSelectOneAdCardData>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return FourSelectOneAdCardData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public FourSelectOneAdCardData newInstance() {
            return new FourSelectOneAdCardData();
        }

        public boolean parseField(FourSelectOneAdCardData fourSelectOneAdCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "adTitle":
                    fourSelectOneAdCardData.adTitle = jsonParser.getValueAsString();
                    return true;
                case "firstIds":
                    fourSelectOneAdCardData.firstIds = jsonParser.getValueAsString();
                    return true;
                case "avatarList":
                    fourSelectOneAdCardData.avatarList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "adContent":
                    fourSelectOneAdCardData.adContent = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FourSelectOneAdCardData fourSelectOneAdCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "adTitle":
                case "firstIds":
                case "avatarList":
                case "adContent":
                    return true;
                default:
                    return super.parseFieldCheck(fourSelectOneAdCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(FourSelectOneAdCardData fourSelectOneAdCardData, JsonGenerator jsonGenerator) throws IOException {
            if (fourSelectOneAdCardData.avatarList != null) {
                jsonGenerator.writeFieldName("avatarList");
                JsonAdapter.serializeArray(fourSelectOneAdCardData.avatarList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                jsonGenerator.writeStringField("adTitle", str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("adContent", str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                jsonGenerator.writeStringField("firstIds", str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FourSelectOneAdCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FourSelectOneAdCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35533a(String str) {
        return str;
    }

    public static FourSelectOneAdCardData new_() {
        FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
        fourSelectOneAdCardData.nullCheck();
        return fourSelectOneAdCardData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public FourSelectOneAdCardData mo223809clone() {
        FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
        List<String> list = this.avatarList;
        if (list != null) {
            fourSelectOneAdCardData.avatarList = ValueObject.util_map(list, new w9j() { // from class: l.i1j
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return FourSelectOneAdCardData.m35533a((String) obj);
                }
            });
        }
        fourSelectOneAdCardData.adTitle = this.adTitle;
        fourSelectOneAdCardData.adContent = this.adContent;
        fourSelectOneAdCardData.firstIds = this.firstIds;
        return fourSelectOneAdCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FourSelectOneAdCardData)) {
            return false;
        }
        FourSelectOneAdCardData fourSelectOneAdCardData = (FourSelectOneAdCardData) obj;
        return ValueObject.util_equals(this.avatarList, fourSelectOneAdCardData.avatarList) && ValueObject.util_equals(this.adTitle, fourSelectOneAdCardData.adTitle) && ValueObject.util_equals(this.adContent, fourSelectOneAdCardData.adContent) && ValueObject.util_equals(this.firstIds, fourSelectOneAdCardData.firstIds);
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
        List<String> list = this.avatarList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.adTitle;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.adContent;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.firstIds;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.avatarList == null) {
            this.avatarList = new ArrayList();
        }
        if (this.adTitle == null) {
            this.adTitle = "";
        }
        if (this.adContent == null) {
            this.adContent = "";
        }
        if (this.firstIds == null) {
            this.firstIds = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
