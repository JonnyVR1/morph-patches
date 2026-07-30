package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Medal;
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
public class Medal extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "medal";

    @NonNull
    @ProtobufIndex(index = 6)
    public String guestDescription;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f38779id;

    @NonNull
    @ProtobufIndex(index = 5)
    public String mainDescription;

    @NonNull
    @ProtobufIndex(index = 4)
    public String name;

    @NonNull
    @ProtobufIndex(index = 3)
    public List<String> showPlaces;

    @NonNull
    @ProtobufIndex(index = 2)
    public String url;
    public static ProtobufAdapter<Medal> PROTOBUF_ADAPTER = new MessageNanoAdapter<Medal>() { // from class: com.p1.mobile.putong.data.Medal.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Medal medal) {
            String str = medal.f38779id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = medal.url;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            List<String> list = medal.showPlaces;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = medal.name;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            String str4 = medal.mainDescription;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str4);
            }
            String str5 = medal.guestDescription;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            medal.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Medal parse(nb5 nb5Var) throws IOException {
            Medal medal = new Medal();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (medal.f38779id == null) {
                        medal.f38779id = "";
                    }
                    if (medal.url == null) {
                        medal.url = "";
                    }
                    if (medal.showPlaces == null) {
                        medal.showPlaces = new ArrayList();
                    }
                    if (medal.name == null) {
                        medal.name = "";
                    }
                    if (medal.mainDescription == null) {
                        medal.mainDescription = "";
                    }
                    if (medal.guestDescription != null) {
                        break;
                    }
                    medal.guestDescription = "";
                    break;
                }
                if (iM158752u == 10) {
                    medal.f38779id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    medal.url = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    medal.showPlaces = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 34) {
                    medal.name = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    medal.mainDescription = nb5Var.m158750s();
                } else {
                    if (iM158752u != 50) {
                        if (medal.f38779id == null) {
                            medal.f38779id = "";
                        }
                        if (medal.url == null) {
                            medal.url = "";
                        }
                        if (medal.showPlaces == null) {
                            medal.showPlaces = new ArrayList();
                        }
                        if (medal.name == null) {
                            medal.name = "";
                        }
                        if (medal.mainDescription == null) {
                            medal.mainDescription = "";
                        }
                        if (medal.guestDescription != null) {
                            break;
                        }
                        medal.guestDescription = "";
                        return medal;
                    }
                    medal.guestDescription = nb5Var.m158750s();
                }
            }
            return medal;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Medal medal, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = medal.f38779id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = medal.url;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            List<String> list = medal.showPlaces;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(3, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str3 = medal.name;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            String str4 = medal.mainDescription;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(5, str4);
            }
            String str5 = medal.guestDescription;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
        }
    };
    public static JsonAdapter<Medal> JSON_ADAPTER = new ObjectJsonAdapter<Medal>() { // from class: com.p1.mobile.putong.data.Medal.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Medal.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Medal newInstance() {
            return new Medal();
        }

        public boolean parseField(Medal medal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guestDescription":
                    medal.guestDescription = jsonParser.getValueAsString();
                    return true;
                case "mainDescription":
                    medal.mainDescription = jsonParser.getValueAsString();
                    return true;
                case "id":
                    medal.f38779id = jsonParser.getValueAsString();
                    return false;
                case "url":
                    medal.url = jsonParser.getValueAsString();
                    return true;
                case "name":
                    medal.name = jsonParser.getValueAsString();
                    return true;
                case "showPlaces":
                    medal.showPlaces = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Medal medal, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guestDescription":
                case "mainDescription":
                    return true;
                case "id":
                    return false;
                case "url":
                case "name":
                case "showPlaces":
                    return true;
                default:
                    return super.parseFieldCheck(medal, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Medal medal, JsonGenerator jsonGenerator) throws IOException {
            String str = medal.f38779id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = medal.url;
            if (str2 != null) {
                jsonGenerator.writeStringField("url", str2);
            }
            if (medal.showPlaces != null) {
                jsonGenerator.writeFieldName("showPlaces");
                JsonAdapter.serializeArray(medal.showPlaces, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str3 = medal.name;
            if (str3 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str3);
            }
            String str4 = medal.mainDescription;
            if (str4 != null) {
                jsonGenerator.writeStringField("mainDescription", str4);
            }
            String str5 = medal.guestDescription;
            if (str5 != null) {
                jsonGenerator.writeStringField("guestDescription", str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Medal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Medal) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59852a(String str) {
        return str;
    }

    public static Medal new_() {
        Medal medal = new Medal();
        medal.nullCheck();
        return medal;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Medal mo223809clone() {
        Medal medal = new Medal();
        medal.f38779id = this.f38779id;
        medal.url = this.url;
        List<String> list = this.showPlaces;
        if (list != null) {
            medal.showPlaces = ValueObject.util_map(list, new w9j() { // from class: l.tfx
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Medal.m59852a((String) obj);
                }
            });
        }
        medal.name = this.name;
        medal.mainDescription = this.mainDescription;
        medal.guestDescription = this.guestDescription;
        return medal;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Medal)) {
            return false;
        }
        Medal medal = (Medal) obj;
        return ValueObject.util_equals(this.f38779id, medal.f38779id) && ValueObject.util_equals(this.url, medal.url) && ValueObject.util_equals(this.showPlaces, medal.showPlaces) && ValueObject.util_equals(this.name, medal.name) && ValueObject.util_equals(this.mainDescription, medal.mainDescription) && ValueObject.util_equals(this.guestDescription, medal.guestDescription);
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
        String str = this.f38779id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<String> list = this.showPlaces;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.mainDescription;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.guestDescription;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f38779id == null) {
            this.f38779id = "";
        }
        if (this.url == null) {
            this.url = "";
        }
        if (this.showPlaces == null) {
            this.showPlaces = new ArrayList();
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.mainDescription == null) {
            this.mainDescription = "";
        }
        if (this.guestDescription == null) {
            this.guestDescription = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
