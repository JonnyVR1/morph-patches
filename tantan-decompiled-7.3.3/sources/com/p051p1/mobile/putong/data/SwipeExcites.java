package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class SwipeExcites extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeexcites";

    @NonNull
    @ProtobufIndex(index = 3)
    public String deepLink;

    @NonNull
    @ProtobufIndex(index = 2)
    public SwipeConfig swipeConfig;

    @ProtobufIndex(index = 1)
    public boolean taskSwitch;
    public static ProtobufAdapter<SwipeExcites> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeExcites>() { // from class: com.p1.mobile.putong.data.SwipeExcites.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeExcites swipeExcites) {
            int iM17275b = CodedOutputByteBufferNano.m17275b(1, swipeExcites.taskSwitch);
            SwipeConfig swipeConfig = swipeExcites.swipeConfig;
            if (swipeConfig != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(2, swipeConfig, SwipeConfig.PROTOBUF_ADAPTER);
            }
            String str = swipeExcites.deepLink;
            if (str != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(3, str);
            }
            swipeExcites.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeExcites parse(nc5 nc5Var) throws IOException {
            SwipeExcites swipeExcites = new SwipeExcites();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (swipeExcites.swipeConfig == null) {
                        swipeExcites.swipeConfig = SwipeConfig.new_();
                    }
                    if (swipeExcites.deepLink != null) {
                        break;
                    }
                    swipeExcites.deepLink = "";
                    break;
                }
                if (iM162497u == 8) {
                    swipeExcites.taskSwitch = nc5Var.m162483g();
                } else if (iM162497u == 18) {
                    swipeExcites.swipeConfig = (SwipeConfig) nc5Var.m162488l(SwipeConfig.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 26) {
                        if (swipeExcites.swipeConfig == null) {
                            swipeExcites.swipeConfig = SwipeConfig.new_();
                        }
                        if (swipeExcites.deepLink != null) {
                            break;
                        }
                        swipeExcites.deepLink = "";
                        return swipeExcites;
                    }
                    swipeExcites.deepLink = nc5Var.m162495s();
                }
            }
            return swipeExcites;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeExcites swipeExcites, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17299A(1, swipeExcites.taskSwitch);
            SwipeConfig swipeConfig = swipeExcites.swipeConfig;
            if (swipeConfig != null) {
                codedOutputByteBufferNano.m17309K(2, swipeConfig, SwipeConfig.PROTOBUF_ADAPTER);
            }
            String str = swipeExcites.deepLink;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<SwipeExcites> JSON_ADAPTER = new ObjectJsonAdapter<SwipeExcites>() { // from class: com.p1.mobile.putong.data.SwipeExcites.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeExcites.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeExcites newInstance() {
            return new SwipeExcites();
        }

        public boolean parseField(SwipeExcites swipeExcites, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "swipeConfig":
                    swipeExcites.swipeConfig = SwipeConfig.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "deepLink":
                    swipeExcites.deepLink = jsonParser.getValueAsString();
                    return true;
                case "taskSwitch":
                    swipeExcites.taskSwitch = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeExcites swipeExcites, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "swipeConfig":
                case "deepLink":
                case "taskSwitch":
                    return true;
                default:
                    return super.parseFieldCheck(swipeExcites, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeExcites swipeExcites, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeBooleanField("taskSwitch", swipeExcites.taskSwitch);
            if (swipeExcites.swipeConfig != null) {
                jsonGenerator.writeFieldName("swipeConfig");
                SwipeConfig.JSON_ADAPTER.serialize(swipeExcites.swipeConfig, jsonGenerator, true);
            }
            String str = swipeExcites.deepLink;
            if (str != null) {
                jsonGenerator.writeStringField("deepLink", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeExcites) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeExcites) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeExcites new_() {
        SwipeExcites swipeExcites = new SwipeExcites();
        swipeExcites.nullCheck();
        return swipeExcites;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeExcites mo225055clone() {
        SwipeExcites swipeExcites = new SwipeExcites();
        swipeExcites.taskSwitch = this.taskSwitch;
        SwipeConfig swipeConfig = this.swipeConfig;
        if (swipeConfig != null) {
            swipeExcites.swipeConfig = swipeConfig.mo225055clone();
        }
        swipeExcites.deepLink = this.deepLink;
        return swipeExcites;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeExcites)) {
            return false;
        }
        SwipeExcites swipeExcites = (SwipeExcites) obj;
        return this.taskSwitch == swipeExcites.taskSwitch && ValueObject.util_equals(this.swipeConfig, swipeExcites.swipeConfig) && ValueObject.util_equals(this.deepLink, swipeExcites.deepLink);
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
        int i2 = ((i * 41) + (this.taskSwitch ? 1231 : 1237)) * 41;
        SwipeConfig swipeConfig = this.swipeConfig;
        int iHashCode = (i2 + (swipeConfig != null ? swipeConfig.hashCode() : 0)) * 41;
        String str = this.deepLink;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.swipeConfig == null) {
            this.swipeConfig = SwipeConfig.new_();
        }
        if (this.deepLink == null) {
            this.deepLink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
