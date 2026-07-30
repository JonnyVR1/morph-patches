package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.DynamicLable;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class MarriageGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marriageguide";

    @Nullable
    @ProtobufIndex(index = 3)
    public List<DynamicLable> dynamicLables;

    @ProtobufIndex(index = 2)
    public boolean momentCondition;

    @ProtobufIndex(index = 1)
    public boolean qualityCondition;
    public static ProtobufAdapter<MarriageGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarriageGuide>() { // from class: com.p1.mobile.putong.core.data.MarriageGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MarriageGuide marriageGuide) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, marriageGuide.qualityCondition) + CodedOutputByteBufferNano.m17275b(2, marriageGuide.momentCondition);
            List<DynamicLable> list = marriageGuide.dynamicLables;
            if (list != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(3, list, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            marriageGuide.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MarriageGuide parse(nc5 nc5Var) throws IOException {
            MarriageGuide marriageGuide = new MarriageGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    marriageGuide.qualityCondition = nc5Var.m162483g();
                } else if (iM162497u == 16) {
                    marriageGuide.momentCondition = nc5Var.m162483g();
                } else {
                    if (iM162497u != 26) {
                        return marriageGuide;
                    }
                    marriageGuide.dynamicLables = (List) nc5Var.m162488l(DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MarriageGuide marriageGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, marriageGuide.qualityCondition);
            codedOutputByteBufferNano.m17299A(2, marriageGuide.momentCondition);
            List<DynamicLable> list = marriageGuide.dynamicLables;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(3, list, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MarriageGuide> JSON_ADAPTER = new ObjectJsonAdapter<MarriageGuide>() { // from class: com.p1.mobile.putong.core.data.MarriageGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MarriageGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MarriageGuide newInstance() {
            return new MarriageGuide();
        }

        public boolean parseField(MarriageGuide marriageGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentCondition":
                    marriageGuide.momentCondition = jsonParser.getValueAsBoolean();
                    return true;
                case "dynamicLables":
                    marriageGuide.dynamicLables = JsonAdapter.parseArray(jsonParser, DynamicLable.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "qualityCondition":
                    marriageGuide.qualityCondition = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MarriageGuide marriageGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentCondition":
                case "dynamicLables":
                case "qualityCondition":
                    return true;
                default:
                    return super.parseFieldCheck(marriageGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MarriageGuide marriageGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("qualityCondition", marriageGuide.qualityCondition);
            jsonGenerator.writeBooleanField("momentCondition", marriageGuide.momentCondition);
            if (marriageGuide.dynamicLables != null) {
                jsonGenerator.writeFieldName("dynamicLables");
                JsonAdapter.serializeArray(marriageGuide.dynamicLables, jsonGenerator, DynamicLable.JSON_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarriageGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarriageGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarriageGuide new_() {
        MarriageGuide marriageGuide = new MarriageGuide();
        marriageGuide.nullCheck();
        return marriageGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MarriageGuide mo225055clone() {
        MarriageGuide marriageGuide = new MarriageGuide();
        marriageGuide.qualityCondition = this.qualityCondition;
        marriageGuide.momentCondition = this.momentCondition;
        List<DynamicLable> list = this.dynamicLables;
        if (list != null) {
            marriageGuide.dynamicLables = ValueObject.util_map(list, new qcj() { // from class: l.yxw
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((DynamicLable) obj).mo225055clone();
                }
            });
        }
        return marriageGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarriageGuide)) {
            return false;
        }
        MarriageGuide marriageGuide = (MarriageGuide) obj;
        return this.qualityCondition == marriageGuide.qualityCondition && this.momentCondition == marriageGuide.momentCondition && ValueObject.util_equals(this.dynamicLables, marriageGuide.dynamicLables);
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
        int i2 = ((((i * 41) + (this.qualityCondition ? 1231 : 1237)) * 41) + (this.momentCondition ? 1231 : 1237)) * 41;
        List<DynamicLable> list = this.dynamicLables;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
