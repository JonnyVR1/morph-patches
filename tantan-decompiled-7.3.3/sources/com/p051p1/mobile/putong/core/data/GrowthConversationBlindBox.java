package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.GrowthConversationBlindBox;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
public class GrowthConversationBlindBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthconversationblindbox";

    @ProtobufIndex(index = 2)
    public boolean isActor;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = 3)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 4)
    public GrowthBlindBoxInfo view;
    public static ProtobufAdapter<GrowthConversationBlindBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthConversationBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthConversationBlindBox.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GrowthConversationBlindBox growthConversationBlindBox) {
            List<String> list = growthConversationBlindBox.tags;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17275b(2, growthConversationBlindBox.isActor);
            String str = growthConversationBlindBox.tip;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str);
            }
            GrowthBlindBoxInfo growthBlindBoxInfo = growthConversationBlindBox.view;
            if (growthBlindBoxInfo != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
            growthConversationBlindBox.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GrowthConversationBlindBox parse(nc5 nc5Var) throws IOException {
            GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (growthConversationBlindBox.tags == null) {
                        growthConversationBlindBox.tags = new ArrayList();
                    }
                    if (growthConversationBlindBox.tip == null) {
                        growthConversationBlindBox.tip = "";
                    }
                    if (growthConversationBlindBox.view != null) {
                        break;
                    }
                    growthConversationBlindBox.view = GrowthBlindBoxInfo.new_();
                    break;
                }
                if (iM162497u == 10) {
                    growthConversationBlindBox.tags = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    growthConversationBlindBox.isActor = nc5Var.m162483g();
                } else if (iM162497u == 26) {
                    growthConversationBlindBox.tip = nc5Var.m162495s();
                } else {
                    if (iM162497u != 34) {
                        if (growthConversationBlindBox.tags == null) {
                            growthConversationBlindBox.tags = new ArrayList();
                        }
                        if (growthConversationBlindBox.tip == null) {
                            growthConversationBlindBox.tip = "";
                        }
                        if (growthConversationBlindBox.view != null) {
                            break;
                        }
                        growthConversationBlindBox.view = GrowthBlindBoxInfo.new_();
                        return growthConversationBlindBox;
                    }
                    growthConversationBlindBox.view = (GrowthBlindBoxInfo) nc5Var.m162488l(GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
                }
            }
            return growthConversationBlindBox;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GrowthConversationBlindBox growthConversationBlindBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = growthConversationBlindBox.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(2, growthConversationBlindBox.isActor);
            String str = growthConversationBlindBox.tip;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            GrowthBlindBoxInfo growthBlindBoxInfo = growthConversationBlindBox.view;
            if (growthBlindBoxInfo != null) {
                codedOutputByteBufferNano.m17309K(4, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthConversationBlindBox> JSON_ADAPTER = new ObjectJsonAdapter<GrowthConversationBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthConversationBlindBox.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GrowthConversationBlindBox.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GrowthConversationBlindBox newInstance() {
            return new GrowthConversationBlindBox();
        }

        public boolean parseField(GrowthConversationBlindBox growthConversationBlindBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "tip":
                    growthConversationBlindBox.tip = jsonParser.getValueAsString();
                    return true;
                case "tags":
                    growthConversationBlindBox.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "view":
                    growthConversationBlindBox.view = GrowthBlindBoxInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "isActor":
                    growthConversationBlindBox.isActor = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GrowthConversationBlindBox growthConversationBlindBox, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "tip":
                case "tags":
                case "view":
                case "isActor":
                    return true;
                default:
                    return super.parseFieldCheck(growthConversationBlindBox, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GrowthConversationBlindBox growthConversationBlindBox, JsonGenerator jsonGenerator) throws IOException {
            if (growthConversationBlindBox.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(growthConversationBlindBox.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeBooleanField("isActor", growthConversationBlindBox.isActor);
            String str = growthConversationBlindBox.tip;
            if (str != null) {
                jsonGenerator.writeStringField("tip", str);
            }
            if (growthConversationBlindBox.view != null) {
                jsonGenerator.writeFieldName(OMSTemplateModeType.view);
                GrowthBlindBoxInfo.JSON_ADAPTER.serialize(growthConversationBlindBox.view, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthConversationBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthConversationBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36572a(String str) {
        return str;
    }

    public static GrowthConversationBlindBox new_() {
        GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
        growthConversationBlindBox.nullCheck();
        return growthConversationBlindBox;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GrowthConversationBlindBox mo225055clone() {
        GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
        List<String> list = this.tags;
        if (list != null) {
            growthConversationBlindBox.tags = ValueObject.util_map(list, new qcj() { // from class: l.rqk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return GrowthConversationBlindBox.m36572a((String) obj);
                }
            });
        }
        growthConversationBlindBox.isActor = this.isActor;
        growthConversationBlindBox.tip = this.tip;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        if (growthBlindBoxInfo != null) {
            growthConversationBlindBox.view = growthBlindBoxInfo.mo225055clone();
        }
        return growthConversationBlindBox;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GrowthConversationBlindBox)) {
            return false;
        }
        GrowthConversationBlindBox growthConversationBlindBox = (GrowthConversationBlindBox) obj;
        return ValueObject.util_equals(this.tags, growthConversationBlindBox.tags) && this.isActor == growthConversationBlindBox.isActor && ValueObject.util_equals(this.tip, growthConversationBlindBox.tip) && ValueObject.util_equals(this.view, growthConversationBlindBox.view);
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
        List<String> list = this.tags;
        int iHashCode = (((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.isActor ? 1231 : 1237)) * 41;
        String str = this.tip;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        int iHashCode3 = iHashCode2 + (growthBlindBoxInfo != null ? growthBlindBoxInfo.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.tip == null) {
            this.tip = "";
        }
        if (this.view == null) {
            this.view = GrowthBlindBoxInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
