package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
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
public class TopicCategorie extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "topiccategorie";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39246id;

    @NonNull
    @ProtobufIndex(index = 2)
    public String name;
    public boolean selected;

    @NonNull
    @ProtobufIndex(index = 6)
    public String status;

    @NonNull
    @ProtobufIndex(index = 5)
    public List<String> topicIds;

    @NonNull
    @ProtobufIndex(index = 4)
    public String type;
    public static ProtobufAdapter<TopicCategorie> PROTOBUF_ADAPTER = new MessageNanoAdapter<TopicCategorie>() { // from class: com.p1.mobile.putong.feed.data.TopicCategorie.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(TopicCategorie topicCategorie) {
            String str = topicCategorie.f39246id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = topicCategorie.name;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = topicCategorie.icon;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = topicCategorie.type;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            List<String> list = topicCategorie.topicIds;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = topicCategorie.status;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(6, str5);
            }
            topicCategorie.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public TopicCategorie parse(nb5 nb5Var) throws IOException {
            TopicCategorie topicCategorie = new TopicCategorie();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (topicCategorie.f39246id == null) {
                        topicCategorie.f39246id = "";
                    }
                    if (topicCategorie.name == null) {
                        topicCategorie.name = "";
                    }
                    if (topicCategorie.icon == null) {
                        topicCategorie.icon = "";
                    }
                    if (topicCategorie.type == null) {
                        topicCategorie.type = "";
                    }
                    if (topicCategorie.topicIds == null) {
                        topicCategorie.topicIds = new ArrayList();
                    }
                    if (topicCategorie.status != null) {
                        break;
                    }
                    topicCategorie.status = "";
                    break;
                }
                if (iM158752u == 10) {
                    topicCategorie.f39246id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    topicCategorie.name = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    topicCategorie.icon = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    topicCategorie.type = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    topicCategorie.topicIds = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 50) {
                        if (topicCategorie.f39246id == null) {
                            topicCategorie.f39246id = "";
                        }
                        if (topicCategorie.name == null) {
                            topicCategorie.name = "";
                        }
                        if (topicCategorie.icon == null) {
                            topicCategorie.icon = "";
                        }
                        if (topicCategorie.type == null) {
                            topicCategorie.type = "";
                        }
                        if (topicCategorie.topicIds == null) {
                            topicCategorie.topicIds = new ArrayList();
                        }
                        if (topicCategorie.status != null) {
                            break;
                        }
                        topicCategorie.status = "";
                        return topicCategorie;
                    }
                    topicCategorie.status = nb5Var.m158750s();
                }
            }
            return topicCategorie;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(TopicCategorie topicCategorie, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = topicCategorie.f39246id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = topicCategorie.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = topicCategorie.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = topicCategorie.type;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            List<String> list = topicCategorie.topicIds;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str5 = topicCategorie.status;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(6, str5);
            }
        }
    };
    public static JsonAdapter<TopicCategorie> JSON_ADAPTER = new ObjectJsonAdapter<TopicCategorie>() { // from class: com.p1.mobile.putong.feed.data.TopicCategorie.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return TopicCategorie.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public TopicCategorie newInstance() {
            return new TopicCategorie();
        }

        public boolean parseField(TopicCategorie topicCategorie, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "topicIds":
                    topicCategorie.topicIds = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "status":
                    topicCategorie.status = jsonParser.getValueAsString();
                    return true;
                case "id":
                    topicCategorie.f39246id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    topicCategorie.icon = jsonParser.getValueAsString();
                    return true;
                case "name":
                    topicCategorie.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    topicCategorie.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(TopicCategorie topicCategorie, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "topicIds":
                case "status":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "name":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(topicCategorie, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(TopicCategorie topicCategorie, JsonGenerator jsonGenerator) throws IOException {
            String str = topicCategorie.f39246id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = topicCategorie.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
            }
            String str3 = topicCategorie.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            String str4 = topicCategorie.type;
            if (str4 != null) {
                jsonGenerator.writeStringField("type", str4);
            }
            if (topicCategorie.topicIds != null) {
                jsonGenerator.writeFieldName("topicIds");
                JsonAdapter.serializeArray(topicCategorie.topicIds, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str5 = topicCategorie.status;
            if (str5 != null) {
                jsonGenerator.writeStringField(NotificationCompat.CATEGORY_STATUS, str5);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((TopicCategorie) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((TopicCategorie) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m60901a(String str) {
        return str;
    }

    public static TopicCategorie new_() {
        TopicCategorie topicCategorie = new TopicCategorie();
        topicCategorie.nullCheck();
        return topicCategorie;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public TopicCategorie mo223809clone() {
        TopicCategorie topicCategorie = new TopicCategorie();
        topicCategorie.f39246id = this.f39246id;
        topicCategorie.name = this.name;
        topicCategorie.icon = this.icon;
        topicCategorie.type = this.type;
        List<String> list = this.topicIds;
        if (list != null) {
            topicCategorie.topicIds = ValueObject.util_map(list, new w9j() { // from class: l.uyi0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return TopicCategorie.m60901a((String) obj);
                }
            });
        }
        topicCategorie.status = this.status;
        return topicCategorie;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TopicCategorie)) {
            return false;
        }
        TopicCategorie topicCategorie = (TopicCategorie) obj;
        return ValueObject.util_equals(this.f39246id, topicCategorie.f39246id) && ValueObject.util_equals(this.name, topicCategorie.name) && ValueObject.util_equals(this.icon, topicCategorie.icon) && ValueObject.util_equals(this.type, topicCategorie.type) && ValueObject.util_equals(this.topicIds, topicCategorie.topicIds) && ValueObject.util_equals(this.status, topicCategorie.status);
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
        String str = this.f39246id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.topicIds;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        String str5 = this.status;
        int iHashCode6 = iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39246id == null) {
            this.f39246id = "";
        }
        if (this.name == null) {
            this.name = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.topicIds == null) {
            this.topicIds = new ArrayList();
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
