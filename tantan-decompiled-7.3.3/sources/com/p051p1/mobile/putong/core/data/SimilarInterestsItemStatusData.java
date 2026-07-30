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
public class SimilarInterestsItemStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemstatusdata";

    @NonNull
    @ProtobufIndex(index = 3)
    public String icon;

    @ProtobufIndex(index = 4)
    public boolean isSelected;

    @NonNull
    @ProtobufIndex(index = 1)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<SimilarInterestsItemStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemStatusData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsItemStatusData similarInterestsItemStatusData) {
            String str = similarInterestsItemStatusData.subTitle;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(4, similarInterestsItemStatusData.isSelected);
            similarInterestsItemStatusData.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsItemStatusData parse(nc5 nc5Var) throws IOException {
            SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (similarInterestsItemStatusData.subTitle == null) {
                        similarInterestsItemStatusData.subTitle = "";
                    }
                    if (similarInterestsItemStatusData.title == null) {
                        similarInterestsItemStatusData.title = "";
                    }
                    if (similarInterestsItemStatusData.icon != null) {
                        break;
                    }
                    similarInterestsItemStatusData.icon = "";
                    break;
                }
                if (iM162497u == 10) {
                    similarInterestsItemStatusData.subTitle = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    similarInterestsItemStatusData.title = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    similarInterestsItemStatusData.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 32) {
                        if (similarInterestsItemStatusData.subTitle == null) {
                            similarInterestsItemStatusData.subTitle = "";
                        }
                        if (similarInterestsItemStatusData.title == null) {
                            similarInterestsItemStatusData.title = "";
                        }
                        if (similarInterestsItemStatusData.icon != null) {
                            break;
                        }
                        similarInterestsItemStatusData.icon = "";
                        return similarInterestsItemStatusData;
                    }
                    similarInterestsItemStatusData.isSelected = nc5Var.m162483g();
                }
            }
            return similarInterestsItemStatusData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsItemStatusData similarInterestsItemStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemStatusData.subTitle;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            codedOutputByteBufferNano.m17299A(4, similarInterestsItemStatusData.isSelected);
        }
    };
    public static JsonAdapter<SimilarInterestsItemStatusData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemStatusData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemStatusData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsItemStatusData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsItemStatusData newInstance() {
            return new SimilarInterestsItemStatusData();
        }

        public boolean parseField(SimilarInterestsItemStatusData similarInterestsItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    similarInterestsItemStatusData.subTitle = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    similarInterestsItemStatusData.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    similarInterestsItemStatusData.title = jsonParser.getValueAsString();
                    return true;
                case "isSelected":
                    similarInterestsItemStatusData.isSelected = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SimilarInterestsItemStatusData similarInterestsItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "icon":
                case "title":
                case "isSelected":
                    return true;
                default:
                    return super.parseFieldCheck(similarInterestsItemStatusData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsItemStatusData similarInterestsItemStatusData, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemStatusData.subTitle;
            if (str != null) {
                jsonGenerator.writeStringField("subTitle", str);
            }
            String str2 = similarInterestsItemStatusData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = similarInterestsItemStatusData.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField("icon", str3);
            }
            jsonGenerator.writeBooleanField("isSelected", similarInterestsItemStatusData.isSelected);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemStatusData new_() {
        SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
        similarInterestsItemStatusData.nullCheck();
        return similarInterestsItemStatusData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsItemStatusData mo225055clone() {
        SimilarInterestsItemStatusData similarInterestsItemStatusData = new SimilarInterestsItemStatusData();
        similarInterestsItemStatusData.subTitle = this.subTitle;
        similarInterestsItemStatusData.title = this.title;
        similarInterestsItemStatusData.icon = this.icon;
        similarInterestsItemStatusData.isSelected = this.isSelected;
        return similarInterestsItemStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemStatusData)) {
            return false;
        }
        SimilarInterestsItemStatusData similarInterestsItemStatusData = (SimilarInterestsItemStatusData) obj;
        return ValueObject.util_equals(this.subTitle, similarInterestsItemStatusData.subTitle) && ValueObject.util_equals(this.title, similarInterestsItemStatusData.title) && ValueObject.util_equals(this.icon, similarInterestsItemStatusData.icon) && this.isSelected == similarInterestsItemStatusData.isSelected;
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
        String str = this.subTitle;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41) + (this.isSelected ? 1231 : 1237);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
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
