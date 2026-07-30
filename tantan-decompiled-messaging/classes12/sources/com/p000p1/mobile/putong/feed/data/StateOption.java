package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class StateOption extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stateoption";

    @NonNull
    @ProtobufIndex(index = 3)
    public String defaultContent;

    @NonNull
    @ProtobufIndex(index = 1)
    public String option;

    @NonNull
    @ProtobufIndex(index = 2)
    public Emotion stateEmotion;
    public static ProtobufAdapter<StateOption> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateOption>() { // from class: com.p1.mobile.putong.feed.data.StateOption.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StateOption stateOption) {
            String str = stateOption.option;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Emotion emotion = stateOption.stateEmotion;
            if (emotion != null) {
                iO += CodedOutputByteBufferNano.l(2, emotion, Emotion.PROTOBUF_ADAPTER);
            }
            String str2 = stateOption.defaultContent;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            ((MessageNano) stateOption).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StateOption m19765parse(nb5 nb5Var) throws IOException {
            StateOption stateOption = new StateOption();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stateOption.option == null) {
                        stateOption.option = "";
                    }
                    if (stateOption.stateEmotion == null) {
                        stateOption.stateEmotion = Emotion.new_();
                    }
                    if (stateOption.defaultContent != null) {
                        break;
                    }
                    stateOption.defaultContent = "";
                    break;
                }
                if (iU == 10) {
                    stateOption.option = nb5Var.s();
                } else if (iU == 18) {
                    stateOption.stateEmotion = (Emotion) nb5Var.l(Emotion.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 26) {
                        if (stateOption.option == null) {
                            stateOption.option = "";
                        }
                        if (stateOption.stateEmotion == null) {
                            stateOption.stateEmotion = Emotion.new_();
                        }
                        if (stateOption.defaultContent != null) {
                            break;
                        }
                        stateOption.defaultContent = "";
                        return stateOption;
                    }
                    stateOption.defaultContent = nb5Var.s();
                }
            }
            return stateOption;
        }

        public void serialize(StateOption stateOption, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateOption.option;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Emotion emotion = stateOption.stateEmotion;
            if (emotion != null) {
                codedOutputByteBufferNano.K(2, emotion, Emotion.PROTOBUF_ADAPTER);
            }
            String str2 = stateOption.defaultContent;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
        }
    };
    public static JsonAdapter<StateOption> JSON_ADAPTER = new ObjectJsonAdapter<StateOption>() { // from class: com.p1.mobile.putong.feed.data.StateOption.2
        public Class getDataClass() {
            return StateOption.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StateOption mo17830newInstance() {
            return new StateOption();
        }

        public boolean parseField(StateOption stateOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "stateEmotion":
                    stateOption.stateEmotion = (Emotion) Emotion.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "defaultContent":
                    stateOption.defaultContent = jsonParser.getValueAsString();
                    return true;
                case "option":
                    stateOption.option = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StateOption stateOption, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "stateEmotion":
                case "defaultContent":
                case "option":
                    return true;
                default:
                    return super.parseFieldCheck(stateOption, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateOption stateOption, JsonGenerator jsonGenerator) throws IOException {
            String str = stateOption.option;
            if (str != null) {
                jsonGenerator.writeStringField("option", str);
            }
            if (stateOption.stateEmotion != null) {
                jsonGenerator.writeFieldName("stateEmotion");
                Emotion.JSON_ADAPTER.serialize(stateOption.stateEmotion, jsonGenerator, true);
            }
            String str2 = stateOption.defaultContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("defaultContent", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateOption) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateOption new_() {
        StateOption stateOption = new StateOption();
        stateOption.nullCheck();
        return stateOption;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StateOption m19764clone() {
        StateOption stateOption = new StateOption();
        stateOption.option = this.option;
        Emotion emotion = this.stateEmotion;
        if (emotion != null) {
            stateOption.stateEmotion = emotion.m18018clone();
        }
        stateOption.defaultContent = this.defaultContent;
        return stateOption;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateOption)) {
            return false;
        }
        StateOption stateOption = (StateOption) obj;
        return ValueObject.util_equals(this.option, stateOption.option) && ValueObject.util_equals(this.stateEmotion, stateOption.stateEmotion) && ValueObject.util_equals(this.defaultContent, stateOption.defaultContent);
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
        String str = this.option;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Emotion emotion = this.stateEmotion;
        int iHashCode2 = (iHashCode + (emotion != null ? emotion.hashCode() : 0)) * 41;
        String str2 = this.defaultContent;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.option == null) {
            this.option = "";
        }
        if (this.stateEmotion == null) {
            this.stateEmotion = Emotion.new_();
        }
        if (this.defaultContent == null) {
            this.defaultContent = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
