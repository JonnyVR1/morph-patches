package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.Configs;
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
public class StateGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "stateguide";

    @NonNull
    @ProtobufIndex(index = 7)
    public List<Configs> configs;

    @ProtobufIndex(index = 6)
    public int defaultEmotionIndex;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @ProtobufIndex(index = 4)
    public int guideShowInterval;

    @ProtobufIndex(index = 2)
    public int swipeMomentCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 3)
    public int unClickCount;
    public static ProtobufAdapter<StateGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<StateGuide>() { // from class: com.p1.mobile.putong.feed.data.StateGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(StateGuide stateGuide) {
            String str = stateGuide.title;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, stateGuide.swipeMomentCount) + CodedOutputByteBufferNano.h(3, stateGuide.unClickCount) + CodedOutputByteBufferNano.h(4, stateGuide.guideShowInterval);
            String str2 = stateGuide.gender;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(5, str2);
            }
            int iH = iO + CodedOutputByteBufferNano.h(6, stateGuide.defaultEmotionIndex);
            List<Configs> list = stateGuide.configs;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(7, list, Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) stateGuide).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public StateGuide m19762parse(nb5 nb5Var) throws IOException {
            StateGuide stateGuide = new StateGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (stateGuide.title == null) {
                        stateGuide.title = "";
                    }
                    if (stateGuide.gender == null) {
                        stateGuide.gender = "";
                    }
                    if (stateGuide.configs != null) {
                        break;
                    }
                    stateGuide.configs = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    stateGuide.title = nb5Var.s();
                } else if (iU == 16) {
                    stateGuide.swipeMomentCount = nb5Var.j();
                } else if (iU == 24) {
                    stateGuide.unClickCount = nb5Var.j();
                } else if (iU == 32) {
                    stateGuide.guideShowInterval = nb5Var.j();
                } else if (iU == 42) {
                    stateGuide.gender = nb5Var.s();
                } else if (iU == 48) {
                    stateGuide.defaultEmotionIndex = nb5Var.j();
                } else {
                    if (iU != 58) {
                        if (stateGuide.title == null) {
                            stateGuide.title = "";
                        }
                        if (stateGuide.gender == null) {
                            stateGuide.gender = "";
                        }
                        if (stateGuide.configs != null) {
                            break;
                        }
                        stateGuide.configs = new ArrayList();
                        return stateGuide;
                    }
                    stateGuide.configs = (List) nb5Var.l(Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stateGuide;
        }

        public void serialize(StateGuide stateGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, stateGuide.swipeMomentCount);
            codedOutputByteBufferNano.G(3, stateGuide.unClickCount);
            codedOutputByteBufferNano.G(4, stateGuide.guideShowInterval);
            String str2 = stateGuide.gender;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            codedOutputByteBufferNano.G(6, stateGuide.defaultEmotionIndex);
            List<Configs> list = stateGuide.configs;
            if (list != null) {
                codedOutputByteBufferNano.K(7, list, Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StateGuide> JSON_ADAPTER = new ObjectJsonAdapter<StateGuide>() { // from class: com.p1.mobile.putong.feed.data.StateGuide.2
        public Class getDataClass() {
            return StateGuide.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public StateGuide mo17830newInstance() {
            return new StateGuide();
        }

        public boolean parseField(StateGuide stateGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideShowInterval":
                    stateGuide.guideShowInterval = jsonParser.getValueAsInt();
                    return true;
                case "gender":
                    stateGuide.gender = jsonParser.getValueAsString();
                    return true;
                case "unClickCount":
                    stateGuide.unClickCount = jsonParser.getValueAsInt();
                    return true;
                case "defaultEmotionIndex":
                    stateGuide.defaultEmotionIndex = jsonParser.getValueAsInt();
                    return true;
                case "title":
                    stateGuide.title = jsonParser.getValueAsString();
                    return true;
                case "configs":
                    stateGuide.configs = JsonAdapter.parseArray(jsonParser, Configs.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "swipeMomentCount":
                    stateGuide.swipeMomentCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(StateGuide stateGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guideShowInterval":
                case "gender":
                case "unClickCount":
                case "defaultEmotionIndex":
                case "title":
                case "configs":
                case "swipeMomentCount":
                    return true;
                default:
                    return super.parseFieldCheck(stateGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(StateGuide stateGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = stateGuide.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField("swipeMomentCount", stateGuide.swipeMomentCount);
            jsonGenerator.writeNumberField("unClickCount", stateGuide.unClickCount);
            jsonGenerator.writeNumberField("guideShowInterval", stateGuide.guideShowInterval);
            String str2 = stateGuide.gender;
            if (str2 != null) {
                jsonGenerator.writeStringField("gender", str2);
            }
            jsonGenerator.writeNumberField("defaultEmotionIndex", stateGuide.defaultEmotionIndex);
            if (stateGuide.configs != null) {
                jsonGenerator.writeFieldName(Configs.TYPE);
                JsonAdapter.serializeArray(stateGuide.configs, jsonGenerator, Configs.JSON_ADAPTER);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateGuide new_() {
        StateGuide stateGuide = new StateGuide();
        stateGuide.nullCheck();
        return stateGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public StateGuide m19761clone() {
        StateGuide stateGuide = new StateGuide();
        stateGuide.title = this.title;
        stateGuide.swipeMomentCount = this.swipeMomentCount;
        stateGuide.unClickCount = this.unClickCount;
        stateGuide.guideShowInterval = this.guideShowInterval;
        stateGuide.gender = this.gender;
        stateGuide.defaultEmotionIndex = this.defaultEmotionIndex;
        List<Configs> list = this.configs;
        if (list != null) {
            stateGuide.configs = ValueObject.util_map(list, new w9j() { // from class: l.jvf0
                public final Object call(Object obj) {
                    return ((Configs) obj).m19469clone();
                }
            });
        }
        return stateGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StateGuide)) {
            return false;
        }
        StateGuide stateGuide = (StateGuide) obj;
        return ValueObject.util_equals(this.title, stateGuide.title) && this.swipeMomentCount == stateGuide.swipeMomentCount && this.unClickCount == stateGuide.unClickCount && this.guideShowInterval == stateGuide.guideShowInterval && ValueObject.util_equals(this.gender, stateGuide.gender) && this.defaultEmotionIndex == stateGuide.defaultEmotionIndex && ValueObject.util_equals(this.configs, stateGuide.configs);
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
        String str = this.title;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.swipeMomentCount) * 41) + this.unClickCount) * 41) + this.guideShowInterval) * 41;
        String str2 = this.gender;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.defaultEmotionIndex) * 41;
        List<Configs> list = this.configs;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.title == null) {
            this.title = "";
        }
        if (this.gender == null) {
            this.gender = "";
        }
        if (this.configs == null) {
            this.configs = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
