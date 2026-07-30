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
public class MomentLevelGuides extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentlevelguides";

    @NonNull
    @ProtobufIndex(index = 2)
    public String description;

    @NonNull
    @ProtobufIndex(index = 1)
    public String styleType;
    public static ProtobufAdapter<MomentLevelGuides> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentLevelGuides>() { // from class: com.p1.mobile.putong.feed.data.MomentLevelGuides.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentLevelGuides momentLevelGuides) {
            String str = momentLevelGuides.styleType;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentLevelGuides.description;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            momentLevelGuides.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentLevelGuides parse(nc5 nc5Var) throws IOException {
            MomentLevelGuides momentLevelGuides = new MomentLevelGuides();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentLevelGuides.styleType == null) {
                        momentLevelGuides.styleType = "";
                    }
                    if (momentLevelGuides.description != null) {
                        break;
                    }
                    momentLevelGuides.description = "";
                    break;
                }
                if (iM162497u == 10) {
                    momentLevelGuides.styleType = nc5Var.m162495s();
                } else {
                    if (iM162497u != 18) {
                        if (momentLevelGuides.styleType == null) {
                            momentLevelGuides.styleType = "";
                        }
                        if (momentLevelGuides.description != null) {
                            break;
                        }
                        momentLevelGuides.description = "";
                        return momentLevelGuides;
                    }
                    momentLevelGuides.description = nc5Var.m162495s();
                }
            }
            return momentLevelGuides;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentLevelGuides momentLevelGuides, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentLevelGuides.styleType;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentLevelGuides.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
        }
    };
    public static JsonAdapter<MomentLevelGuides> JSON_ADAPTER = new ObjectJsonAdapter<MomentLevelGuides>() { // from class: com.p1.mobile.putong.feed.data.MomentLevelGuides.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentLevelGuides.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentLevelGuides newInstance() {
            return new MomentLevelGuides();
        }

        public boolean parseField(MomentLevelGuides momentLevelGuides, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("description")) {
                momentLevelGuides.description = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("styleType")) {
                return false;
            }
            momentLevelGuides.styleType = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(MomentLevelGuides momentLevelGuides, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("description") || str.equals("styleType")) {
                return true;
            }
            return super.parseFieldCheck(momentLevelGuides, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentLevelGuides momentLevelGuides, JsonGenerator jsonGenerator) throws IOException {
            String str = momentLevelGuides.styleType;
            if (str != null) {
                jsonGenerator.writeStringField("styleType", str);
            }
            String str2 = momentLevelGuides.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentLevelGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentLevelGuides) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentLevelGuides new_() {
        MomentLevelGuides momentLevelGuides = new MomentLevelGuides();
        momentLevelGuides.nullCheck();
        return momentLevelGuides;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentLevelGuides mo225055clone() {
        MomentLevelGuides momentLevelGuides = new MomentLevelGuides();
        momentLevelGuides.styleType = this.styleType;
        momentLevelGuides.description = this.description;
        return momentLevelGuides;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentLevelGuides)) {
            return false;
        }
        MomentLevelGuides momentLevelGuides = (MomentLevelGuides) obj;
        return ValueObject.util_equals(this.styleType, momentLevelGuides.styleType) && ValueObject.util_equals(this.description, momentLevelGuides.description);
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
        String str = this.styleType;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.styleType == null) {
            this.styleType = "";
        }
        if (this.description == null) {
            this.description = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
