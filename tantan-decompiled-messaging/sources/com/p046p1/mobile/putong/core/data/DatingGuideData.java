package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.data.LinkAction;
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
public class DatingGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingguidedata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String button;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonId;

    @NonNull
    @ProtobufIndex(index = 5)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> pictures;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> subTitles;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> titles;
    public static ProtobufAdapter<DatingGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingGuideData>() { // from class: com.p1.mobile.putong.core.data.DatingGuideData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DatingGuideData datingGuideData) {
            List<String> list = datingGuideData.pictures;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = datingGuideData.titles;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = datingGuideData.subTitles;
            if (list3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = datingGuideData.button;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(4, str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(6, str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(7, str4);
            }
            datingGuideData.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DatingGuideData parse(nb5 nb5Var) throws IOException {
            DatingGuideData datingGuideData = new DatingGuideData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (datingGuideData.pictures == null) {
                        datingGuideData.pictures = new ArrayList();
                    }
                    if (datingGuideData.titles == null) {
                        datingGuideData.titles = new ArrayList();
                    }
                    if (datingGuideData.subTitles == null) {
                        datingGuideData.subTitles = new ArrayList();
                    }
                    if (datingGuideData.button == null) {
                        datingGuideData.button = "";
                    }
                    if (datingGuideData.deeplink == null) {
                        datingGuideData.deeplink = "";
                    }
                    if (datingGuideData.pageId == null) {
                        datingGuideData.pageId = "";
                    }
                    if (datingGuideData.buttonId != null) {
                        break;
                    }
                    datingGuideData.buttonId = "";
                    break;
                }
                if (iM158752u == 10) {
                    datingGuideData.pictures = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    datingGuideData.titles = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 26) {
                    datingGuideData.subTitles = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    datingGuideData.button = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    datingGuideData.deeplink = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    datingGuideData.pageId = nb5Var.m158750s();
                } else {
                    if (iM158752u != 58) {
                        if (datingGuideData.pictures == null) {
                            datingGuideData.pictures = new ArrayList();
                        }
                        if (datingGuideData.titles == null) {
                            datingGuideData.titles = new ArrayList();
                        }
                        if (datingGuideData.subTitles == null) {
                            datingGuideData.subTitles = new ArrayList();
                        }
                        if (datingGuideData.button == null) {
                            datingGuideData.button = "";
                        }
                        if (datingGuideData.deeplink == null) {
                            datingGuideData.deeplink = "";
                        }
                        if (datingGuideData.pageId == null) {
                            datingGuideData.pageId = "";
                        }
                        if (datingGuideData.buttonId != null) {
                            break;
                        }
                        datingGuideData.buttonId = "";
                        return datingGuideData;
                    }
                    datingGuideData.buttonId = nb5Var.m158750s();
                }
            }
            return datingGuideData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DatingGuideData datingGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = datingGuideData.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = datingGuideData.titles;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = datingGuideData.subTitles;
            if (list3 != null) {
                codedOutputByteBufferNano.m17254K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = datingGuideData.button;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(4, str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(6, str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(7, str4);
            }
        }
    };
    public static JsonAdapter<DatingGuideData> JSON_ADAPTER = new ObjectJsonAdapter<DatingGuideData>() { // from class: com.p1.mobile.putong.core.data.DatingGuideData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return DatingGuideData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public DatingGuideData newInstance() {
            return new DatingGuideData();
        }

        public boolean parseField(DatingGuideData datingGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "button":
                    datingGuideData.button = jsonParser.getValueAsString();
                    return true;
                case "buttonId":
                    datingGuideData.buttonId = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    datingGuideData.pageId = jsonParser.getValueAsString();
                    return true;
                case "titles":
                    datingGuideData.titles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    datingGuideData.pictures = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "subTitles":
                    datingGuideData.subTitles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "deeplink":
                    datingGuideData.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DatingGuideData datingGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "button":
                case "buttonId":
                case "pageId":
                case "titles":
                case "pictures":
                case "subTitles":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(datingGuideData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(DatingGuideData datingGuideData, JsonGenerator jsonGenerator) throws IOException {
            if (datingGuideData.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(datingGuideData.pictures, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (datingGuideData.titles != null) {
                jsonGenerator.writeFieldName("titles");
                JsonAdapter.serializeArray(datingGuideData.titles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (datingGuideData.subTitles != null) {
                jsonGenerator.writeFieldName("subTitles");
                JsonAdapter.serializeArray(datingGuideData.subTitles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = datingGuideData.button;
            if (str != null) {
                jsonGenerator.writeStringField("button", str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                jsonGenerator.writeStringField("pageId", str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonId", str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35499a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m35500b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m35501c(String str) {
        return str;
    }

    public static DatingGuideData new_() {
        DatingGuideData datingGuideData = new DatingGuideData();
        datingGuideData.nullCheck();
        return datingGuideData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DatingGuideData mo223809clone() {
        DatingGuideData datingGuideData = new DatingGuideData();
        List<String> list = this.pictures;
        if (list != null) {
            datingGuideData.pictures = ValueObject.util_map(list, new w9j() { // from class: l.p7c
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DatingGuideData.m35499a((String) obj);
                }
            });
        }
        List<String> list2 = this.titles;
        if (list2 != null) {
            datingGuideData.titles = ValueObject.util_map(list2, new w9j() { // from class: l.q7c
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DatingGuideData.m35500b((String) obj);
                }
            });
        }
        List<String> list3 = this.subTitles;
        if (list3 != null) {
            datingGuideData.subTitles = ValueObject.util_map(list3, new w9j() { // from class: l.r7c
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return DatingGuideData.m35501c((String) obj);
                }
            });
        }
        datingGuideData.button = this.button;
        datingGuideData.deeplink = this.deeplink;
        datingGuideData.pageId = this.pageId;
        datingGuideData.buttonId = this.buttonId;
        return datingGuideData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingGuideData)) {
            return false;
        }
        DatingGuideData datingGuideData = (DatingGuideData) obj;
        return ValueObject.util_equals(this.pictures, datingGuideData.pictures) && ValueObject.util_equals(this.titles, datingGuideData.titles) && ValueObject.util_equals(this.subTitles, datingGuideData.subTitles) && ValueObject.util_equals(this.button, datingGuideData.button) && ValueObject.util_equals(this.deeplink, datingGuideData.deeplink) && ValueObject.util_equals(this.pageId, datingGuideData.pageId) && ValueObject.util_equals(this.buttonId, datingGuideData.buttonId);
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
        List<String> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.titles;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.subTitles;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str = this.button;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pageId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonId;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.titles == null) {
            this.titles = new ArrayList();
        }
        if (this.subTitles == null) {
            this.subTitles = new ArrayList();
        }
        if (this.button == null) {
            this.button = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.buttonId == null) {
            this.buttonId = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
