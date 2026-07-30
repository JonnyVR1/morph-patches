package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p046p1.mobile.putong.feed.data.StateQuestion;
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

/* JADX INFO: loaded from: classes12.dex */
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
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(3, str);
            }
            guideStatePostConfig.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GuideStatePostConfig parse(nb5 nb5Var) throws IOException {
            GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
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
                if (iM158752u == 10) {
                    guideStatePostConfig.guidePopStatesQuestions = (List) nb5Var.m158743l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 18) {
                    guideStatePostConfig.myTabGuideState = (List) nb5Var.m158743l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 26) {
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
                    guideStatePostConfig.momentPostStateGuideContent = nb5Var.m158750s();
                }
            }
            return guideStatePostConfig;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GuideStatePostConfig guideStatePostConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                codedOutputByteBufferNano.m17254K(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(3, str);
            }
        }
    };
    public static JsonAdapter<GuideStatePostConfig> JSON_ADAPTER = new ObjectJsonAdapter<GuideStatePostConfig>() { // from class: com.p1.mobile.putong.feed.data.GuideStatePostConfig.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GuideStatePostConfig.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuideStatePostConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public GuideStatePostConfig mo223809clone() {
        GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
        List<StateQuestion> list = this.guidePopStatesQuestions;
        if (list != null) {
            guideStatePostConfig.guidePopStatesQuestions = ValueObject.util_map(list, new w9j() { // from class: l.gtk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).mo223809clone();
                }
            });
        }
        List<StateQuestion> list2 = this.myTabGuideState;
        if (list2 != null) {
            guideStatePostConfig.myTabGuideState = ValueObject.util_map(list2, new w9j() { // from class: l.htk
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).mo223809clone();
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
