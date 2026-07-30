package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DynamicLable;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MarriageGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "marriageguide";

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<DynamicLable> dynamicLables;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean momentCondition;

    @ProtobufIndex(index = 1)
    public boolean qualityCondition;
    public static ProtobufAdapter<MarriageGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<MarriageGuide>() { // from class: com.p1.mobile.putong.core.data.MarriageGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MarriageGuide marriageGuide) {
            int iB = CodedOutputByteBufferNano.b(1, marriageGuide.qualityCondition) + CodedOutputByteBufferNano.b(2, marriageGuide.momentCondition);
            List<DynamicLable> list = marriageGuide.dynamicLables;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(3, list, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) marriageGuide).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MarriageGuide m14049parse(nb5 nb5Var) throws IOException {
            MarriageGuide marriageGuide = new MarriageGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    marriageGuide.qualityCondition = nb5Var.g();
                } else if (iU == 16) {
                    marriageGuide.momentCondition = nb5Var.g();
                } else {
                    if (iU != 26) {
                        return marriageGuide;
                    }
                    marriageGuide.dynamicLables = (List) nb5Var.l(DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
        }

        public void serialize(MarriageGuide marriageGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.A(1, marriageGuide.qualityCondition);
            codedOutputByteBufferNano.A(2, marriageGuide.momentCondition);
            List<DynamicLable> list = marriageGuide.dynamicLables;
            if (list != null) {
                codedOutputByteBufferNano.K(3, list, DynamicLable.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MarriageGuide> JSON_ADAPTER = new ObjectJsonAdapter<MarriageGuide>() { // from class: com.p1.mobile.putong.core.data.MarriageGuide.2
        public Class getDataClass() {
            return MarriageGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MarriageGuide m14050newInstance() {
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

        public void serializeFields(MarriageGuide marriageGuide, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("qualityCondition", marriageGuide.qualityCondition);
            jsonGenerator.writeBooleanField("momentCondition", marriageGuide.momentCondition);
            if (marriageGuide.dynamicLables != null) {
                jsonGenerator.writeFieldName("dynamicLables");
                JsonAdapter.serializeArray(marriageGuide.dynamicLables, jsonGenerator, DynamicLable.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MarriageGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MarriageGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MarriageGuide new_() {
        MarriageGuide marriageGuide = new MarriageGuide();
        marriageGuide.nullCheck();
        return marriageGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MarriageGuide m14048clone() {
        MarriageGuide marriageGuide = new MarriageGuide();
        marriageGuide.qualityCondition = this.qualityCondition;
        marriageGuide.momentCondition = this.momentCondition;
        List<DynamicLable> list = this.dynamicLables;
        if (list != null) {
            marriageGuide.dynamicLables = ValueObject.util_map(list, new w9j() { // from class: l.zuw
                public final Object call(Object obj) {
                    return ((DynamicLable) obj).m12628clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + (this.qualityCondition ? 1231 : 1237)) * 41) + (this.momentCondition ? 1231 : 1237)) * 41;
        List<DynamicLable> list = this.dynamicLables;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
