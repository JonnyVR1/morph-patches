package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OmsNewTags;
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

/* JADX INFO: loaded from: classes12.dex */
public class OmsNewTags extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "omsnewtags";

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> categories;

    @ProtobufIndex(index = 5)
    public long count;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38801id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;
    public static ProtobufAdapter<OmsNewTags> PROTOBUF_ADAPTER = new MessageNanoAdapter<OmsNewTags>() { // from class: com.p1.mobile.putong.data.OmsNewTags.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(OmsNewTags omsNewTags) {
            String str = omsNewTags.f38801id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = omsNewTags.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = omsNewTags.categories;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = omsNewTags.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(5, omsNewTags.count);
            String str4 = omsNewTags.status;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(6, str4);
            }
            omsNewTags.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public OmsNewTags parse(nb5 nb5Var) throws IOException {
            OmsNewTags omsNewTags = new OmsNewTags();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (omsNewTags.f38801id == null) {
                        omsNewTags.f38801id = "";
                    }
                    if (omsNewTags.name == null) {
                        omsNewTags.name = "";
                    }
                    if (omsNewTags.categories == null) {
                        omsNewTags.categories = new ArrayList();
                    }
                    if (omsNewTags.icon == null) {
                        omsNewTags.icon = "";
                    }
                    if (omsNewTags.status != null) {
                        break;
                    }
                    omsNewTags.status = "";
                    break;
                }
                if (iM158752u == 10) {
                    omsNewTags.f38801id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    omsNewTags.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    omsNewTags.categories = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    omsNewTags.icon = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    omsNewTags.count = nb5Var.m158742k();
                } else {
                    if (iM158752u != 50) {
                        if (omsNewTags.f38801id == null) {
                            omsNewTags.f38801id = "";
                        }
                        if (omsNewTags.name == null) {
                            omsNewTags.name = "";
                        }
                        if (omsNewTags.categories == null) {
                            omsNewTags.categories = new ArrayList();
                        }
                        if (omsNewTags.icon == null) {
                            omsNewTags.icon = "";
                        }
                        if (omsNewTags.status != null) {
                            break;
                        }
                        omsNewTags.status = "";
                        return omsNewTags;
                    }
                    omsNewTags.status = nb5Var.m158750s();
                }
            }
            return omsNewTags;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(OmsNewTags omsNewTags, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = omsNewTags.f38801id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = omsNewTags.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = omsNewTags.categories;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = omsNewTags.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17252I(5, omsNewTags.count);
            String str4 = omsNewTags.status;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(6, str4);
            }
        }
    };
    public static JsonAdapter<OmsNewTags> JSON_ADAPTER = new ObjectJsonAdapter<OmsNewTags>() { // from class: com.p1.mobile.putong.data.OmsNewTags.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return OmsNewTags.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public OmsNewTags newInstance() {
            return new OmsNewTags();
        }

        public boolean parseField(OmsNewTags omsNewTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "status":
                    omsNewTags.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    omsNewTags.f38801id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    omsNewTags.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    omsNewTags.name = jsonParser.getValueAsString();
                    return true;
                case "count":
                    omsNewTags.count = jsonParser.getValueAsLong();
                    return true;
                case "categories":
                    omsNewTags.categories = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(OmsNewTags omsNewTags, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "status":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "count":
                case "categories":
                    return true;
                default:
                    return super.parseFieldCheck(omsNewTags, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(OmsNewTags omsNewTags, JsonGenerator jsonGenerator) throws IOException {
            String str = omsNewTags.f38801id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = omsNewTags.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            if (omsNewTags.categories != null) {
                jsonGenerator.writeFieldName("categories");
                JsonAdapter.serializeArray(omsNewTags.categories, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = omsNewTags.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeNumberField("count", omsNewTags.count);
            String str4 = omsNewTags.status;
            if (str4 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str4);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((OmsNewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((OmsNewTags) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59968a(String str) {
        return str;
    }

    public static OmsNewTags new_() {
        OmsNewTags omsNewTags = new OmsNewTags();
        omsNewTags.nullCheck();
        return omsNewTags;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public OmsNewTags mo223809clone() {
        OmsNewTags omsNewTags = new OmsNewTags();
        omsNewTags.f38801id = this.f38801id;
        omsNewTags.name = this.name;
        List<String> list = this.categories;
        if (list != null) {
            omsNewTags.categories = ValueObject.util_map(list, new w9j() { // from class: l.kc50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return OmsNewTags.m59968a((String) obj);
                }
            });
        }
        omsNewTags.icon = this.icon;
        omsNewTags.count = this.count;
        omsNewTags.status = this.status;
        return omsNewTags;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OmsNewTags)) {
            return false;
        }
        OmsNewTags omsNewTags = (OmsNewTags) obj;
        return ValueObject.util_equals(this.f38801id, omsNewTags.f38801id) && ValueObject.util_equals(this.name, omsNewTags.name) && ValueObject.util_equals(this.categories, omsNewTags.categories) && ValueObject.util_equals(this.icon, omsNewTags.icon) && this.count == omsNewTags.count && ValueObject.util_equals(this.status, omsNewTags.status);
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
        String str = this.f38801id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.categories;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long j = this.count;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        String str4 = this.status;
        int iHashCode5 = i3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38801id == null) {
            this.f38801id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.categories == null) {
            this.categories = new ArrayList();
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.status == null) {
            this.status = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
