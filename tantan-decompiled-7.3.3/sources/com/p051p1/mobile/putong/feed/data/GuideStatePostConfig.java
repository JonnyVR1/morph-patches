package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.StateQuestion;
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

/* JADX INFO: loaded from: classes13.dex */
public class GuideStatePostConfig extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "guidestatepostconfig";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<StateQuestion> guidePopStatesQuestions;

    @NonNull
    @ProtobufIndex(index = 3)
    public String momentPostStateGuideContent;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<StateQuestion> myTabGuideState;
    public static ProtobufAdapter<GuideStatePostConfig> PROTOBUF_ADAPTER = new MessageNanoAdapter<GuideStatePostConfig>() { // from class: com.p1.mobile.putong.feed.data.GuideStatePostConfig.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GuideStatePostConfig guideStatePostConfig) {
            List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
            int iM17285l = list != null ? CodedOutputByteBufferNano.m17285l(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                iM17285l += CodedOutputByteBufferNano.m17288o(3, str);
            }
            guideStatePostConfig.cachedSize = iM17285l;
            return iM17285l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuideStatePostConfig parse(nc5 nc5Var) throws IOException {
            GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (guideStatePostConfig.guidePopStatesQuestions == null) {
                        guideStatePostConfig.guidePopStatesQuestions = new ArrayList();
                    }
                    if (guideStatePostConfig.myTabGuideState == null) {
                        guideStatePostConfig.myTabGuideState = new ArrayList();
                    }
                    if (guideStatePostConfig.momentPostStateGuideContent != null) {
                        break;
                    }
                    guideStatePostConfig.momentPostStateGuideContent = "";
                    break;
                }
                if (iM162497u == 10) {
                    guideStatePostConfig.guidePopStatesQuestions = (List) nc5Var.m162488l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 18) {
                    guideStatePostConfig.myTabGuideState = (List) nc5Var.m162488l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 26) {
                        if (guideStatePostConfig.guidePopStatesQuestions == null) {
                            guideStatePostConfig.guidePopStatesQuestions = new ArrayList();
                        }
                        if (guideStatePostConfig.myTabGuideState == null) {
                            guideStatePostConfig.myTabGuideState = new ArrayList();
                        }
                        if (guideStatePostConfig.momentPostStateGuideContent != null) {
                            break;
                        }
                        guideStatePostConfig.momentPostStateGuideContent = "";
                        return guideStatePostConfig;
                    }
                    guideStatePostConfig.momentPostStateGuideContent = nc5Var.m162495s();
                }
            }
            return guideStatePostConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuideStatePostConfig guideStatePostConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<GuideStatePostConfig> JSON_ADAPTER = new ObjectJsonAdapter<GuideStatePostConfig>() { // from class: com.p1.mobile.putong.feed.data.GuideStatePostConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuideStatePostConfig.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GuideStatePostConfig newInstance() {
            return new GuideStatePostConfig();
        }

        public boolean parseField(GuideStatePostConfig guideStatePostConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "myTabGuideState":
                    guideStatePostConfig.myTabGuideState = JsonAdapter.parseArray(jsonParser, StateQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "guidePopStatesQuestions":
                    guideStatePostConfig.guidePopStatesQuestions = JsonAdapter.parseArray(jsonParser, StateQuestion.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "momentPostStateGuideContent":
                    guideStatePostConfig.momentPostStateGuideContent = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(GuideStatePostConfig guideStatePostConfig, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "myTabGuideState":
                case "guidePopStatesQuestions":
                case "momentPostStateGuideContent":
                    return true;
                default:
                    return super.parseFieldCheck(guideStatePostConfig, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GuideStatePostConfig guideStatePostConfig, JsonGenerator jsonGenerator) throws IOException {
            if (guideStatePostConfig.guidePopStatesQuestions != null) {
                jsonGenerator.writeFieldName("guidePopStatesQuestions");
                JsonAdapter.serializeArray(guideStatePostConfig.guidePopStatesQuestions, jsonGenerator, StateQuestion.JSON_ADAPTER);
            }
            if (guideStatePostConfig.myTabGuideState != null) {
                jsonGenerator.writeFieldName("myTabGuideState");
                JsonAdapter.serializeArray(guideStatePostConfig.myTabGuideState, jsonGenerator, StateQuestion.JSON_ADAPTER);
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                jsonGenerator.writeStringField("momentPostStateGuideContent", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuideStatePostConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuideStatePostConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuideStatePostConfig new_() {
        GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
        guideStatePostConfig.nullCheck();
        return guideStatePostConfig;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GuideStatePostConfig mo225055clone() {
        GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
        List<StateQuestion> list = this.guidePopStatesQuestions;
        if (list != null) {
            guideStatePostConfig.guidePopStatesQuestions = ValueObject.util_map(list, new qcj() { // from class: l.wvk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).mo225055clone();
                }
            });
        }
        List<StateQuestion> list2 = this.myTabGuideState;
        if (list2 != null) {
            guideStatePostConfig.myTabGuideState = ValueObject.util_map(list2, new qcj() { // from class: l.xvk
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).mo225055clone();
                }
            });
        }
        guideStatePostConfig.momentPostStateGuideContent = this.momentPostStateGuideContent;
        return guideStatePostConfig;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GuideStatePostConfig)) {
            return false;
        }
        GuideStatePostConfig guideStatePostConfig = (GuideStatePostConfig) obj;
        return ValueObject.util_equals(this.guidePopStatesQuestions, guideStatePostConfig.guidePopStatesQuestions) && ValueObject.util_equals(this.myTabGuideState, guideStatePostConfig.myTabGuideState) && ValueObject.util_equals(this.momentPostStateGuideContent, guideStatePostConfig.momentPostStateGuideContent);
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
        List<StateQuestion> list = this.guidePopStatesQuestions;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<StateQuestion> list2 = this.myTabGuideState;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        String str = this.momentPostStateGuideContent;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.guidePopStatesQuestions == null) {
            this.guidePopStatesQuestions = new ArrayList();
        }
        if (this.myTabGuideState == null) {
            this.myTabGuideState = new ArrayList();
        }
        if (this.momentPostStateGuideContent == null) {
            this.momentPostStateGuideContent = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
