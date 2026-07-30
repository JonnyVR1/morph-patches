package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes12.dex */
public class Configs extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "configs";

    @ProtobufIndex(index = 6)
    public int defaultEmotionIndex;

    @NonNull
    @ProtobufIndex(index = 5)
    public String gender;

    @ProtobufIndex(index = 4)
    public int guideShowInterval;

    @NonNull
    @ProtobufIndex(index = 7)
    public String page;

    @ProtobufIndex(index = 2)
    public int swipeMomentCount;

    @NonNull
    @ProtobufIndex(index = 1)
    public String title;

    @ProtobufIndex(index = 3)
    public int unClickCount;
    public static ProtobufAdapter<Configs> PROTOBUF_ADAPTER = new MessageNanoAdapter<Configs>() { // from class: com.p1.mobile.putong.feed.data.Configs.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Configs configs) {
            String str = configs.title;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17226h(2, configs.swipeMomentCount) + CodedOutputByteBufferNano.m17226h(3, configs.unClickCount) + CodedOutputByteBufferNano.m17226h(4, configs.guideShowInterval);
            String str2 = configs.gender;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str2);
            }
            int iM17226h = iM17233o + CodedOutputByteBufferNano.m17226h(6, configs.defaultEmotionIndex);
            String str3 = configs.page;
            if (str3 != null) {
                iM17226h += CodedOutputByteBufferNano.m17233o(7, str3);
            }
            configs.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Configs parse(nb5 nb5Var) throws IOException {
            Configs configs = new Configs();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (configs.title == null) {
                        configs.title = "";
                    }
                    if (configs.gender == null) {
                        configs.gender = "";
                    }
                    if (configs.page != null) {
                        break;
                    }
                    configs.page = "";
                    break;
                }
                if (iM158752u == 10) {
                    configs.title = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    configs.swipeMomentCount = nb5Var.m158741j();
                } else if (iM158752u == 24) {
                    configs.unClickCount = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    configs.guideShowInterval = nb5Var.m158741j();
                } else if (iM158752u == 42) {
                    configs.gender = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    configs.defaultEmotionIndex = nb5Var.m158741j();
                } else {
                    if (iM158752u != 58) {
                        if (configs.title == null) {
                            configs.title = "";
                        }
                        if (configs.gender == null) {
                            configs.gender = "";
                        }
                        if (configs.page != null) {
                            break;
                        }
                        configs.page = "";
                        return configs;
                    }
                    configs.page = nb5Var.m158750s();
                }
            }
            return configs;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Configs configs, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = configs.title;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17250G(2, configs.swipeMomentCount);
            codedOutputByteBufferNano.m17250G(3, configs.unClickCount);
            codedOutputByteBufferNano.m17250G(4, configs.guideShowInterval);
            String str2 = configs.gender;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(5, str2);
            }
            codedOutputByteBufferNano.m17250G(6, configs.defaultEmotionIndex);
            String str3 = configs.page;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(7, str3);
            }
        }
    };
    public static JsonAdapter<Configs> JSON_ADAPTER = new ObjectJsonAdapter<Configs>() { // from class: com.p1.mobile.putong.feed.data.Configs.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Configs.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Configs newInstance() {
            return new Configs();
        }

        public boolean parseField(Configs configs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "guideShowInterval":
                    configs.guideShowInterval = jsonParser.getValueAsInt();
                    return true;
                case "gender":
                    configs.gender = jsonParser.getValueAsString();
                    return true;
                case "unClickCount":
                    configs.unClickCount = jsonParser.getValueAsInt();
                    return true;
                case "defaultEmotionIndex":
                    configs.defaultEmotionIndex = jsonParser.getValueAsInt();
                    return true;
                case "page":
                    configs.page = jsonParser.getValueAsString();
                    return true;
                case "title":
                    configs.title = jsonParser.getValueAsString();
                    return true;
                case "swipeMomentCount":
                    configs.swipeMomentCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Configs configs, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "guideShowInterval":
                case "gender":
                case "unClickCount":
                case "defaultEmotionIndex":
                case "page":
                case "title":
                case "swipeMomentCount":
                    return true;
                default:
                    return super.parseFieldCheck(configs, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Configs configs, JsonGenerator jsonGenerator) throws IOException {
            String str = configs.title;
            if (str != null) {
                jsonGenerator.writeStringField("title", str);
            }
            jsonGenerator.writeNumberField("swipeMomentCount", configs.swipeMomentCount);
            jsonGenerator.writeNumberField("unClickCount", configs.unClickCount);
            jsonGenerator.writeNumberField("guideShowInterval", configs.guideShowInterval);
            String str2 = configs.gender;
            if (str2 != null) {
                jsonGenerator.writeStringField("gender", str2);
            }
            jsonGenerator.writeNumberField("defaultEmotionIndex", configs.defaultEmotionIndex);
            String str3 = configs.page;
            if (str3 != null) {
                jsonGenerator.writeStringField(OMSTemplateModeType.page, str3);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Configs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Configs) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Configs new_() {
        Configs configs = new Configs();
        configs.nullCheck();
        return configs;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Configs mo223809clone() {
        Configs configs = new Configs();
        configs.title = this.title;
        configs.swipeMomentCount = this.swipeMomentCount;
        configs.unClickCount = this.unClickCount;
        configs.guideShowInterval = this.guideShowInterval;
        configs.gender = this.gender;
        configs.defaultEmotionIndex = this.defaultEmotionIndex;
        configs.page = this.page;
        return configs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Configs)) {
            return false;
        }
        Configs configs = (Configs) obj;
        return ValueObject.util_equals(this.title, configs.title) && this.swipeMomentCount == configs.swipeMomentCount && this.unClickCount == configs.unClickCount && this.guideShowInterval == configs.guideShowInterval && ValueObject.util_equals(this.gender, configs.gender) && this.defaultEmotionIndex == configs.defaultEmotionIndex && ValueObject.util_equals(this.page, configs.page);
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
        String str3 = this.page;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
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
        if (this.page == null) {
            this.page = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
