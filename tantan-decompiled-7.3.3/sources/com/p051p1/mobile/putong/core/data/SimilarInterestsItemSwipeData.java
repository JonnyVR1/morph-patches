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
public class SimilarInterestsItemSwipeData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "similarinterestsitemswipedata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String icon;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;
    public static ProtobufAdapter<SimilarInterestsItemSwipeData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SimilarInterestsItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SimilarInterestsItemSwipeData similarInterestsItemSwipeData) {
            String str = similarInterestsItemSwipeData.icon;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            similarInterestsItemSwipeData.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SimilarInterestsItemSwipeData parse(nc5 nc5Var) throws IOException {
            SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (similarInterestsItemSwipeData.icon == null) {
                        similarInterestsItemSwipeData.icon = "";
                    }
                    if (similarInterestsItemSwipeData.title != null) {
                        break;
                    }
                    similarInterestsItemSwipeData.title = "";
                    break;
                }
                if (iM162497u == 10) {
                    similarInterestsItemSwipeData.icon = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (similarInterestsItemSwipeData.icon == null) {
                            similarInterestsItemSwipeData.icon = "";
                        }
                        if (similarInterestsItemSwipeData.title != null) {
                            break;
                        }
                        similarInterestsItemSwipeData.title = "";
                        return similarInterestsItemSwipeData;
                    }
                    similarInterestsItemSwipeData.title = nc5Var.m162495s();
                }
            }
            return similarInterestsItemSwipeData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = similarInterestsItemSwipeData.icon;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<SimilarInterestsItemSwipeData> JSON_ADAPTER = new ObjectJsonAdapter<SimilarInterestsItemSwipeData>() { // from class: com.p1.mobile.putong.core.data.SimilarInterestsItemSwipeData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SimilarInterestsItemSwipeData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SimilarInterestsItemSwipeData newInstance() {
            return new SimilarInterestsItemSwipeData();
        }

        public boolean parseField(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("icon")) {
                similarInterestsItemSwipeData.icon = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("title")) {
                return false;
            }
            similarInterestsItemSwipeData.title = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("icon") || str.equals("title")) {
                return true;
            }
            return super.parseFieldCheck(similarInterestsItemSwipeData, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SimilarInterestsItemSwipeData similarInterestsItemSwipeData, JsonGenerator jsonGenerator) throws IOException {
            String str = similarInterestsItemSwipeData.icon;
            if (str != null) {
                jsonGenerator.writeStringField("icon", str);
            }
            String str2 = similarInterestsItemSwipeData.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SimilarInterestsItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SimilarInterestsItemSwipeData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SimilarInterestsItemSwipeData new_() {
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
        similarInterestsItemSwipeData.nullCheck();
        return similarInterestsItemSwipeData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SimilarInterestsItemSwipeData mo225055clone() {
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = new SimilarInterestsItemSwipeData();
        similarInterestsItemSwipeData.icon = this.icon;
        similarInterestsItemSwipeData.title = this.title;
        return similarInterestsItemSwipeData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimilarInterestsItemSwipeData)) {
            return false;
        }
        SimilarInterestsItemSwipeData similarInterestsItemSwipeData = (SimilarInterestsItemSwipeData) obj;
        return ValueObject.util_equals(this.icon, similarInterestsItemSwipeData.icon) && ValueObject.util_equals(this.title, similarInterestsItemSwipeData.title);
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
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.title == null) {
            this.title = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
