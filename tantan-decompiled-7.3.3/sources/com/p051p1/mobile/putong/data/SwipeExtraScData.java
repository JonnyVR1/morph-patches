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
public class SwipeExtraScData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "swipeextrascdata";
    public boolean matePlanMode = false;

    @ProtobufIndex(index = 2)
    public int picNum;

    @ProtobufIndex(index = 1)
    public int picUploads;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picUrl;
    public static ProtobufAdapter<SwipeExtraScData> PROTOBUF_ADAPTER = new MessageNanoAdapter<SwipeExtraScData>() { // from class: com.p1.mobile.putong.data.SwipeExtraScData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SwipeExtraScData swipeExtraScData) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, swipeExtraScData.picUploads) + CodedOutputByteBufferNano.m17281h(2, swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(3, str);
            }
            swipeExtraScData.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SwipeExtraScData parse(nc5 nc5Var) throws IOException {
            SwipeExtraScData swipeExtraScData = new SwipeExtraScData();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (swipeExtraScData.picUrl != null) {
                        break;
                    }
                    swipeExtraScData.picUrl = "";
                    break;
                }
                if (iM162497u == 8) {
                    swipeExtraScData.picUploads = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    swipeExtraScData.picNum = nc5Var.m162486j();
                } else {
                    if (iM162497u != 26) {
                        if (swipeExtraScData.picUrl != null) {
                            break;
                        }
                        swipeExtraScData.picUrl = "";
                        return swipeExtraScData;
                    }
                    swipeExtraScData.picUrl = nc5Var.m162495s();
                }
            }
            return swipeExtraScData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SwipeExtraScData swipeExtraScData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, swipeExtraScData.picUploads);
            codedOutputByteBufferNano.m17305G(2, swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
        }
    };
    public static JsonAdapter<SwipeExtraScData> JSON_ADAPTER = new ObjectJsonAdapter<SwipeExtraScData>() { // from class: com.p1.mobile.putong.data.SwipeExtraScData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SwipeExtraScData.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SwipeExtraScData newInstance() {
            return new SwipeExtraScData();
        }

        public boolean parseField(SwipeExtraScData swipeExtraScData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picNum":
                    swipeExtraScData.picNum = jsonParser.getValueAsInt();
                    return true;
                case "picUrl":
                    swipeExtraScData.picUrl = jsonParser.getValueAsString();
                    return true;
                case "picUploads":
                    swipeExtraScData.picUploads = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SwipeExtraScData swipeExtraScData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picNum":
                case "picUrl":
                case "picUploads":
                    return true;
                default:
                    return super.parseFieldCheck(swipeExtraScData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeExtraScData swipeExtraScData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("picUploads", swipeExtraScData.picUploads);
            jsonGenerator.writeNumberField("picNum", swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                jsonGenerator.writeStringField("picUrl", str);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeExtraScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeExtraScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeExtraScData new_() {
        SwipeExtraScData swipeExtraScData = new SwipeExtraScData();
        swipeExtraScData.nullCheck();
        return swipeExtraScData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SwipeExtraScData mo225055clone() {
        SwipeExtraScData swipeExtraScData = new SwipeExtraScData();
        swipeExtraScData.picUploads = this.picUploads;
        swipeExtraScData.picNum = this.picNum;
        swipeExtraScData.picUrl = this.picUrl;
        return swipeExtraScData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SwipeExtraScData)) {
            return false;
        }
        SwipeExtraScData swipeExtraScData = (SwipeExtraScData) obj;
        return this.picUploads == swipeExtraScData.picUploads && this.picNum == swipeExtraScData.picNum && ValueObject.util_equals(this.picUrl, swipeExtraScData.picUrl);
    }

    public SwipeExtraScData fillDefaultData(User user) {
        if (user == null) {
            return this;
        }
        this.picUrl = user.pictures.get(0).url;
        this.picUploads = user.pictures.size();
        this.picNum = 0;
        return this;
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
        int i2 = ((((i * 41) + this.picUploads) * 41) + this.picNum) * 41;
        String str = this.picUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.picUrl == null) {
            this.picUrl = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
