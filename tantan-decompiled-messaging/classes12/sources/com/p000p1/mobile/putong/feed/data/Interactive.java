package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.SchemeKey;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Interactive interactive) {
            String str = interactive.icon;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = interactive.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = interactive.deepLink;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = interactive.topic;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) interactive).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Interactive m19542parse(nb5 nb5Var) throws IOException {
            Interactive interactive = new Interactive();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    interactive.icon = nb5Var.s();
                } else if (iU == 18) {
                    interactive.title = nb5Var.s();
                } else if (iU == 26) {
                    interactive.deepLink = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    interactive.topic = nb5Var.s();
                }
            }
            return interactive;
        }

        public void serialize(Interactive interactive, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = interactive.icon;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = interactive.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = interactive.deepLink;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = interactive.topic;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<Interactive> JSON_ADAPTER = new ObjectJsonAdapter<Interactive>() { // from class: com.p1.mobile.putong.feed.data.Interactive.2
        public Class getDataClass() {
            return Interactive.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Interactive mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
                jsonGenerator.writeStringField(SchemeKey.topic, str4);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Interactive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Interactive) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Interactive new_() {
        Interactive interactive = new Interactive();
        interactive.nullCheck();
        return interactive;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Interactive m19541clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
