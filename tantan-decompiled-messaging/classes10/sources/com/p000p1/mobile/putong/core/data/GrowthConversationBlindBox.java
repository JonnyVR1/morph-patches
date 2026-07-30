package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.GrowthConversationBlindBox;
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
public class GrowthConversationBlindBox extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "growthconversationblindbox";

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public boolean isActor;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> tags;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String tip;

    @NonNull
    @ProtobufIndex(index = 4)
    public GrowthBlindBoxInfo view;
    public static ProtobufAdapter<GrowthConversationBlindBox> PROTOBUF_ADAPTER = new MessageNanoAdapter<GrowthConversationBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthConversationBlindBox.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GrowthConversationBlindBox growthConversationBlindBox) {
            List<String> list = growthConversationBlindBox.tags;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, growthConversationBlindBox.isActor);
            String str = growthConversationBlindBox.tip;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            GrowthBlindBoxInfo growthBlindBoxInfo = growthConversationBlindBox.view;
            if (growthBlindBoxInfo != null) {
                iL += CodedOutputByteBufferNano.l(4, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) growthConversationBlindBox).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GrowthConversationBlindBox m13127parse(nb5 nb5Var) throws IOException {
            GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    growthConversationBlindBox.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    growthConversationBlindBox.isActor = nb5Var.g();
                } else if (iU == 26) {
                    growthConversationBlindBox.tip = nb5Var.s();
                } else {
                    if (iU != 34) {
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
                    growthConversationBlindBox.view = (GrowthBlindBoxInfo) nb5Var.l(GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
                }
            }
            return growthConversationBlindBox;
        }

        public void serialize(GrowthConversationBlindBox growthConversationBlindBox, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = growthConversationBlindBox.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, growthConversationBlindBox.isActor);
            String str = growthConversationBlindBox.tip;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
            GrowthBlindBoxInfo growthBlindBoxInfo = growthConversationBlindBox.view;
            if (growthBlindBoxInfo != null) {
                codedOutputByteBufferNano.K(4, growthBlindBoxInfo, GrowthBlindBoxInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<GrowthConversationBlindBox> JSON_ADAPTER = new ObjectJsonAdapter<GrowthConversationBlindBox>() { // from class: com.p1.mobile.putong.core.data.GrowthConversationBlindBox.2
        public Class getDataClass() {
            return GrowthConversationBlindBox.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public GrowthConversationBlindBox m13128newInstance() {
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
                    growthConversationBlindBox.view = (GrowthBlindBoxInfo) GrowthBlindBoxInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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
                jsonGenerator.writeFieldName("view");
                GrowthBlindBoxInfo.JSON_ADAPTER.serialize(growthConversationBlindBox.view, jsonGenerator, true);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GrowthConversationBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GrowthConversationBlindBox) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m371a(String str) {
        return str;
    }

    public static GrowthConversationBlindBox new_() {
        GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
        growthConversationBlindBox.nullCheck();
        return growthConversationBlindBox;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GrowthConversationBlindBox m13126clone() {
        GrowthConversationBlindBox growthConversationBlindBox = new GrowthConversationBlindBox();
        List<String> list = this.tags;
        if (list != null) {
            growthConversationBlindBox.tags = ValueObject.util_map(list, new w9j() { // from class: l.bok
                public final Object call(Object obj) {
                    return GrowthConversationBlindBox.m371a((String) obj);
                }
            });
        }
        growthConversationBlindBox.isActor = this.isActor;
        growthConversationBlindBox.tip = this.tip;
        GrowthBlindBoxInfo growthBlindBoxInfo = this.view;
        if (growthBlindBoxInfo != null) {
            growthConversationBlindBox.view = growthBlindBoxInfo.m13122clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
