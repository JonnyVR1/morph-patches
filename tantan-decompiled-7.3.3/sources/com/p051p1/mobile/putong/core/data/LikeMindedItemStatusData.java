package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class LikeMindedItemStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemstatusdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;
    public static ProtobufAdapter<LikeMindedItemStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemStatusData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemStatusData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(LikeMindedItemStatusData likeMindedItemStatusData) {
            String str = likeMindedItemStatusData.description;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            likeMindedItemStatusData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public LikeMindedItemStatusData parse(nc5 nc5Var) throws IOException {
            LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (likeMindedItemStatusData.description == null) {
                        likeMindedItemStatusData.description = "";
                    }
                    if (likeMindedItemStatusData.subTitle == null) {
                        likeMindedItemStatusData.subTitle = "";
                    }
                    if (likeMindedItemStatusData.title == null) {
                        likeMindedItemStatusData.title = "";
                    }
                    if (likeMindedItemStatusData.icon != null) {
                        break;
                    }
                    likeMindedItemStatusData.icon = "";
                    break;
                }
                if (iM162497u == 10) {
                    likeMindedItemStatusData.description = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    likeMindedItemStatusData.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    likeMindedItemStatusData.title = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (likeMindedItemStatusData.description == null) {
                            likeMindedItemStatusData.description = "";
                        }
                        if (likeMindedItemStatusData.subTitle == null) {
                            likeMindedItemStatusData.subTitle = "";
                        }
                        if (likeMindedItemStatusData.title == null) {
                            likeMindedItemStatusData.title = "";
                        }
                        if (likeMindedItemStatusData.icon != null) {
                            break;
                        }
                        likeMindedItemStatusData.icon = "";
                        return likeMindedItemStatusData;
                    }
                    likeMindedItemStatusData.icon = nc5Var.m162495s();
                }
            }
            return likeMindedItemStatusData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(LikeMindedItemStatusData likeMindedItemStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemStatusData.description;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemStatusData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemStatusData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemStatusData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return LikeMindedItemStatusData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public LikeMindedItemStatusData newInstance() {
            return new LikeMindedItemStatusData();
        }

        public boolean parseField(LikeMindedItemStatusData likeMindedItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    likeMindedItemStatusData.subTitle = jsonParser.getValueAsString();
                    return true;
                case "description":
                    likeMindedItemStatusData.description = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    likeMindedItemStatusData.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    likeMindedItemStatusData.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeMindedItemStatusData likeMindedItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "description":
                case "icon":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(likeMindedItemStatusData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LikeMindedItemStatusData likeMindedItemStatusData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedItemStatusData.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                jsonGenerator.writeStringField("title", str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemStatusData new_() {
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.nullCheck();
        return likeMindedItemStatusData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public LikeMindedItemStatusData mo225055clone() {
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.description = this.description;
        likeMindedItemStatusData.subTitle = this.subTitle;
        likeMindedItemStatusData.title = this.title;
        likeMindedItemStatusData.icon = this.icon;
        return likeMindedItemStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedItemStatusData)) {
            return false;
        }
        LikeMindedItemStatusData likeMindedItemStatusData = (LikeMindedItemStatusData) obj;
        return ValueObject.util_equals(this.description, likeMindedItemStatusData.description) && ValueObject.util_equals(this.subTitle, likeMindedItemStatusData.subTitle) && ValueObject.util_equals(this.title, likeMindedItemStatusData.title) && ValueObject.util_equals(this.icon, likeMindedItemStatusData.icon);
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
        String str = this.description;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
