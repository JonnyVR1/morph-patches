package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SwipeExtraScData swipeExtraScData) {
            int iH = CodedOutputByteBufferNano.h(1, swipeExtraScData.picUploads) + CodedOutputByteBufferNano.h(2, swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(3, str);
            }
            ((MessageNano) swipeExtraScData).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SwipeExtraScData m19070parse(nb5 nb5Var) throws IOException {
            SwipeExtraScData swipeExtraScData = new SwipeExtraScData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (swipeExtraScData.picUrl != null) {
                        break;
                    }
                    swipeExtraScData.picUrl = "";
                    break;
                }
                if (iU == 8) {
                    swipeExtraScData.picUploads = nb5Var.j();
                } else if (iU == 16) {
                    swipeExtraScData.picNum = nb5Var.j();
                } else {
                    if (iU != 26) {
                        if (swipeExtraScData.picUrl != null) {
                            break;
                        }
                        swipeExtraScData.picUrl = "";
                        return swipeExtraScData;
                    }
                    swipeExtraScData.picUrl = nb5Var.s();
                }
            }
            return swipeExtraScData;
        }

        public void serialize(SwipeExtraScData swipeExtraScData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, swipeExtraScData.picUploads);
            codedOutputByteBufferNano.G(2, swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                codedOutputByteBufferNano.R(3, str);
            }
        }
    };
    public static JsonAdapter<SwipeExtraScData> JSON_ADAPTER = new ObjectJsonAdapter<SwipeExtraScData>() { // from class: com.p1.mobile.putong.data.SwipeExtraScData.2
        public Class getDataClass() {
            return SwipeExtraScData.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public SwipeExtraScData mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SwipeExtraScData swipeExtraScData, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("picUploads", swipeExtraScData.picUploads);
            jsonGenerator.writeNumberField("picNum", swipeExtraScData.picNum);
            String str = swipeExtraScData.picUrl;
            if (str != null) {
                jsonGenerator.writeStringField("picUrl", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SwipeExtraScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SwipeExtraScData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SwipeExtraScData new_() {
        SwipeExtraScData swipeExtraScData = new SwipeExtraScData();
        swipeExtraScData.nullCheck();
        return swipeExtraScData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SwipeExtraScData m19069clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((((i * 41) + this.picUploads) * 41) + this.picNum) * 41;
        String str = this.picUrl;
        int iHashCode = i2 + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.picUrl == null) {
            this.picUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
