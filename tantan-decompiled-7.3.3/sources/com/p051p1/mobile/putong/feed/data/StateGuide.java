package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.Configs;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(StateGuide stateGuide) {
            String str = stateGuide.title;
            int iM17288o = (str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0) + CodedOutputByteBufferNano.m17281h(2, stateGuide.swipeMomentCount) + CodedOutputByteBufferNano.m17281h(3, stateGuide.unClickCount) + CodedOutputByteBufferNano.m17281h(4, stateGuide.guideShowInterval);
            String str2 = stateGuide.gender;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(6, stateGuide.defaultEmotionIndex);
            List<Configs> list = stateGuide.configs;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(7, list, Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            stateGuide.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public StateGuide parse(nc5 nc5Var) throws IOException {
            StateGuide stateGuide = new StateGuide();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    stateGuide.title = nc5Var.m162495s();
                } else if (iM162497u == 16) {
                    stateGuide.swipeMomentCount = nc5Var.m162486j();
                } else if (iM162497u == 24) {
                    stateGuide.unClickCount = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    stateGuide.guideShowInterval = nc5Var.m162486j();
                } else if (iM162497u == 42) {
                    stateGuide.gender = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    stateGuide.defaultEmotionIndex = nc5Var.m162486j();
                } else {
                    if (iM162497u != 58) {
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
                    stateGuide.configs = (List) nc5Var.m162488l(Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return stateGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(StateGuide stateGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = stateGuide.title;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            codedOutputByteBufferNano.m17305G(2, stateGuide.swipeMomentCount);
            codedOutputByteBufferNano.m17305G(3, stateGuide.unClickCount);
            codedOutputByteBufferNano.m17305G(4, stateGuide.guideShowInterval);
            String str2 = stateGuide.gender;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(5, str2);
            }
            codedOutputByteBufferNano.m17305G(6, stateGuide.defaultEmotionIndex);
            List<Configs> list = stateGuide.configs;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(7, list, Configs.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<StateGuide> JSON_ADAPTER = new ObjectJsonAdapter<StateGuide>() { // from class: com.p1.mobile.putong.feed.data.StateGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return StateGuide.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public StateGuide newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((StateGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((StateGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static StateGuide new_() {
        StateGuide stateGuide = new StateGuide();
        stateGuide.nullCheck();
        return stateGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public StateGuide mo225055clone() {
        StateGuide stateGuide = new StateGuide();
        stateGuide.title = this.title;
        stateGuide.swipeMomentCount = this.swipeMomentCount;
        stateGuide.unClickCount = this.unClickCount;
        stateGuide.guideShowInterval = this.guideShowInterval;
        stateGuide.gender = this.gender;
        stateGuide.defaultEmotionIndex = this.defaultEmotionIndex;
        List<Configs> list = this.configs;
        if (list != null) {
            stateGuide.configs = ValueObject.util_map(list, new qcj() { // from class: l.s3g0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Configs) obj).mo225055clone();
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
        String str = this.title;
        int iHashCode = (((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.swipeMomentCount) * 41) + this.unClickCount) * 41) + this.guideShowInterval) * 41;
        String str2 = this.gender;
        int iHashCode2 = (((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.defaultEmotionIndex) * 41;
        List<Configs> list = this.configs;
        int iHashCode3 = iHashCode2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
