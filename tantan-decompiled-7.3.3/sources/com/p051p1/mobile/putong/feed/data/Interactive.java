package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes13.dex */
public class Interactive extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "interactive";

    @NonNull
    @ProtobufIndex(index = 3)
    public String deepLink;

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 4)
    public String topic;
    public static ProtobufAdapter<Interactive> PROTOBUF_ADAPTER = new MessageNanoAdapter<Interactive>() { // from class: com.p1.mobile.putong.feed.data.Interactive.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Interactive interactive) {
            String str = interactive.icon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = interactive.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = interactive.deepLink;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = interactive.topic;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            interactive.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Interactive parse(nc5 nc5Var) throws IOException {
            Interactive interactive = new Interactive();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (interactive.icon == null) {
                        interactive.icon = "";
                    }
                    if (interactive.title == null) {
                        interactive.title = "";
                    }
                    if (interactive.deepLink == null) {
                        interactive.deepLink = "";
                    }
                    if (interactive.topic != null) {
                        break;
                    }
                    interactive.topic = "";
                    break;
                }
                if (iM162497u == 10) {
                    interactive.icon = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    interactive.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    interactive.deepLink = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (interactive.icon == null) {
                            interactive.icon = "";
                        }
                        if (interactive.title == null) {
                            interactive.title = "";
                        }
                        if (interactive.deepLink == null) {
                            interactive.deepLink = "";
                        }
                        if (interactive.topic != null) {
                            break;
                        }
                        interactive.topic = "";
                        return interactive;
                    }
                    interactive.topic = nc5Var.m162495s();
                }
            }
            return interactive;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Interactive interactive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = interactive.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = interactive.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = interactive.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = interactive.topic;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<Interactive> JSON_ADAPTER = new ObjectJsonAdapter<Interactive>() { // from class: com.p1.mobile.putong.feed.data.Interactive.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Interactive.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Interactive newInstance() {
            return new Interactive();
        }

        public boolean parseField(Interactive interactive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "icon":
                    interactive.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    interactive.title = jsonParser.getValueAsString();
                    return true;
                case "topic":
                    interactive.topic = jsonParser.getValueAsString();
                    return true;
                case "deepLink":
                    interactive.deepLink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Interactive interactive, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "icon":
                case "title":
                case "topic":
                case "deepLink":
                    return true;
                default:
                    return super.parseFieldCheck(interactive, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Interactive interactive, JsonGenerator jsonGenerator) throws IOException {
            String str = interactive.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = interactive.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = interactive.deepLink;
            if (str3 != null) {
                jsonGenerator.writeStringField("deepLink", str3);
            }
            String str4 = interactive.topic;
            if (str4 != null) {
                jsonGenerator.writeStringField("topic", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Interactive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Interactive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Interactive new_() {
        Interactive interactive = new Interactive();
        interactive.nullCheck();
        return interactive;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Interactive mo225055clone() {
        Interactive interactive = new Interactive();
        interactive.icon = this.icon;
        interactive.title = this.title;
        interactive.deepLink = this.deepLink;
        interactive.topic = this.topic;
        return interactive;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Interactive)) {
            return false;
        }
        Interactive interactive = (Interactive) obj;
        return ValueObject.util_equals(this.icon, interactive.icon) && ValueObject.util_equals(this.title, interactive.title) && ValueObject.util_equals(this.deepLink, interactive.deepLink) && ValueObject.util_equals(this.topic, interactive.topic);
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
        String str = this.icon;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.deepLink;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.topic;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
        if (this.topic == null) {
            this.topic = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
