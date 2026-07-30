package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.GiftInfoTag;
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
public class GiftInfoTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "giftinfotag";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> backgroundColors;

    @NonNull
    @ProtobufIndex(index = 3)
    public String privilegeName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String text;
    public static ProtobufAdapter<GiftInfoTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<GiftInfoTag>() { // from class: com.p1.mobile.putong.core.data.GiftInfoTag.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GiftInfoTag giftInfoTag) {
            List<String> list = giftInfoTag.backgroundColors;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = giftInfoTag.text;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = giftInfoTag.privilegeName;
            if (str2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str2);
            }
            giftInfoTag.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GiftInfoTag parse(nb5 nb5Var) throws IOException {
            GiftInfoTag giftInfoTag = new GiftInfoTag();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (giftInfoTag.backgroundColors == null) {
                        giftInfoTag.backgroundColors = new ArrayList();
                    }
                    if (giftInfoTag.text == null) {
                        giftInfoTag.text = "";
                    }
                    if (giftInfoTag.privilegeName != null) {
                        break;
                    }
                    giftInfoTag.privilegeName = "";
                    break;
                }
                if (iM158752u == 10) {
                    giftInfoTag.backgroundColors = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    giftInfoTag.text = nb5Var.m158750s();
                } else {
                    if (iM158752u != 26) {
                        if (giftInfoTag.backgroundColors == null) {
                            giftInfoTag.backgroundColors = new ArrayList();
                        }
                        if (giftInfoTag.text == null) {
                            giftInfoTag.text = "";
                        }
                        if (giftInfoTag.privilegeName != null) {
                            break;
                        }
                        giftInfoTag.privilegeName = "";
                        return giftInfoTag;
                    }
                    giftInfoTag.privilegeName = nb5Var.m158750s();
                }
            }
            return giftInfoTag;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GiftInfoTag giftInfoTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = giftInfoTag.backgroundColors;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = giftInfoTag.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = giftInfoTag.privilegeName;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(3, str2);
            }
        }
    };
    public static JsonAdapter<GiftInfoTag> JSON_ADAPTER = new ObjectJsonAdapter<GiftInfoTag>() { // from class: com.p1.mobile.putong.core.data.GiftInfoTag.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GiftInfoTag.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GiftInfoTag newInstance() {
            return new GiftInfoTag();
        }

        public boolean parseField(GiftInfoTag giftInfoTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "privilegeName":
                    giftInfoTag.privilegeName = jsonParser.getValueAsString();
                    return true;
                case "text":
                    giftInfoTag.text = jsonParser.getValueAsString();
                    return true;
                case "backgroundColors":
                    giftInfoTag.backgroundColors = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GiftInfoTag giftInfoTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "privilegeName":
                case "text":
                case "backgroundColors":
                    return true;
                default:
                    return super.parseFieldCheck(giftInfoTag, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GiftInfoTag giftInfoTag, JsonGenerator jsonGenerator) throws IOException {
            if (giftInfoTag.backgroundColors != null) {
                jsonGenerator.writeFieldName("backgroundColors");
                JsonAdapter.serializeArray(giftInfoTag.backgroundColors, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = giftInfoTag.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = giftInfoTag.privilegeName;
            if (str2 != null) {
                jsonGenerator.writeStringField("privilegeName", str2);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GiftInfoTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GiftInfoTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35554a(String str) {
        return str;
    }

    public static GiftInfoTag new_() {
        GiftInfoTag giftInfoTag = new GiftInfoTag();
        giftInfoTag.nullCheck();
        return giftInfoTag;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GiftInfoTag mo223809clone() {
        GiftInfoTag giftInfoTag = new GiftInfoTag();
        List<String> list = this.backgroundColors;
        if (list != null) {
            giftInfoTag.backgroundColors = ValueObject.util_map(list, new w9j() { // from class: l.lqj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return GiftInfoTag.m35554a((String) obj);
                }
            });
        }
        giftInfoTag.text = this.text;
        giftInfoTag.privilegeName = this.privilegeName;
        return giftInfoTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GiftInfoTag)) {
            return false;
        }
        GiftInfoTag giftInfoTag = (GiftInfoTag) obj;
        return ValueObject.util_equals(this.backgroundColors, giftInfoTag.backgroundColors) && ValueObject.util_equals(this.text, giftInfoTag.text) && ValueObject.util_equals(this.privilegeName, giftInfoTag.privilegeName);
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
        List<String> list = this.backgroundColors;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.privilegeName;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.backgroundColors == null) {
            this.backgroundColors = new ArrayList();
        }
        if (this.text == null) {
            this.text = "";
        }
        if (this.privilegeName == null) {
            this.privilegeName = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
