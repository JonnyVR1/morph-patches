package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.StateQuestion;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(GuideStatePostConfig guideStatePostConfig) {
            List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) guideStatePostConfig).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public GuideStatePostConfig m19530parse(nb5 nb5Var) throws IOException {
            GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 10) {
                    guideStatePostConfig.guidePopStatesQuestions = (List) nb5Var.l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    guideStatePostConfig.myTabGuideState = (List) nb5Var.l(StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 26) {
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
                    guideStatePostConfig.momentPostStateGuideContent = nb5Var.s();
                }
            }
            return guideStatePostConfig;
        }

        public void serialize(GuideStatePostConfig guideStatePostConfig, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<StateQuestion> list = guideStatePostConfig.guidePopStatesQuestions;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<StateQuestion> list2 = guideStatePostConfig.myTabGuideState;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, StateQuestion.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str = guideStatePostConfig.momentPostStateGuideContent;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<GuideStatePostConfig> JSON_ADAPTER = new ObjectJsonAdapter<GuideStatePostConfig>() { // from class: com.p1.mobile.putong.feed.data.GuideStatePostConfig.2
        public Class getDataClass() {
            return GuideStatePostConfig.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public GuideStatePostConfig mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GuideStatePostConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GuideStatePostConfig) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GuideStatePostConfig new_() {
        GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
        guideStatePostConfig.nullCheck();
        return guideStatePostConfig;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public GuideStatePostConfig m19529clone() {
        GuideStatePostConfig guideStatePostConfig = new GuideStatePostConfig();
        List<StateQuestion> list = this.guidePopStatesQuestions;
        if (list != null) {
            guideStatePostConfig.guidePopStatesQuestions = ValueObject.util_map(list, new w9j() { // from class: l.gtk
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).m19767clone();
                }
            });
        }
        List<StateQuestion> list2 = this.myTabGuideState;
        if (list2 != null) {
            guideStatePostConfig.myTabGuideState = ValueObject.util_map(list2, new w9j() { // from class: l.htk
                public final Object call(Object obj) {
                    return ((StateQuestion) obj).m19767clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
