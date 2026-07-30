package com.p046p1.mobile.putong.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
public class AdRewardExt extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adrewardext";

    @ProtobufIndex(index = 2)
    public int swipeGuideStyle;

    @ProtobufIndex(index = 3)
    public int swipeMaxTaskCount;

    @ProtobufIndex(index = 1)
    public int swipeRewardCardCount;
    public static ProtobufAdapter<AdRewardExt> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdRewardExt>() { // from class: com.p1.mobile.putong.data.AdRewardExt.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdRewardExt adRewardExt) {
            int iM17226h = CodedOutputByteBufferNano.m17226h(1, adRewardExt.swipeRewardCardCount) + CodedOutputByteBufferNano.m17226h(2, adRewardExt.swipeGuideStyle) + CodedOutputByteBufferNano.m17226h(3, adRewardExt.swipeMaxTaskCount);
            adRewardExt.cachedSize = iM17226h;
            return iM17226h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdRewardExt parse(nb5 nb5Var) throws IOException {
            AdRewardExt adRewardExt = new AdRewardExt();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 8) {
                    adRewardExt.swipeRewardCardCount = nb5Var.m158741j();
                } else if (iM158752u == 16) {
                    adRewardExt.swipeGuideStyle = nb5Var.m158741j();
                } else {
                    if (iM158752u != 24) {
                        return adRewardExt;
                    }
                    adRewardExt.swipeMaxTaskCount = nb5Var.m158741j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdRewardExt adRewardExt, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17250G(1, adRewardExt.swipeRewardCardCount);
            codedOutputByteBufferNano.m17250G(2, adRewardExt.swipeGuideStyle);
            codedOutputByteBufferNano.m17250G(3, adRewardExt.swipeMaxTaskCount);
        }
    };
    public static JsonAdapter<AdRewardExt> JSON_ADAPTER = new ObjectJsonAdapter<AdRewardExt>() { // from class: com.p1.mobile.putong.data.AdRewardExt.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdRewardExt.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdRewardExt newInstance() {
            return new AdRewardExt();
        }

        public boolean parseField(AdRewardExt adRewardExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "swipeMaxTaskCount":
                    adRewardExt.swipeMaxTaskCount = jsonParser.getValueAsInt();
                    return true;
                case "swipeGuideStyle":
                    adRewardExt.swipeGuideStyle = jsonParser.getValueAsInt();
                    return true;
                case "swipeRewardCardCount":
                    adRewardExt.swipeRewardCardCount = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(AdRewardExt adRewardExt, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "swipeMaxTaskCount":
                case "swipeGuideStyle":
                case "swipeRewardCardCount":
                    return true;
                default:
                    return super.parseFieldCheck(adRewardExt, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdRewardExt adRewardExt, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("swipeRewardCardCount", adRewardExt.swipeRewardCardCount);
            jsonGenerator.writeNumberField("swipeGuideStyle", adRewardExt.swipeGuideStyle);
            jsonGenerator.writeNumberField("swipeMaxTaskCount", adRewardExt.swipeMaxTaskCount);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdRewardExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdRewardExt) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static AdRewardExt new_() {
        AdRewardExt adRewardExt = new AdRewardExt();
        adRewardExt.nullCheck();
        return adRewardExt;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdRewardExt mo223809clone() {
        AdRewardExt adRewardExt = new AdRewardExt();
        adRewardExt.swipeRewardCardCount = this.swipeRewardCardCount;
        adRewardExt.swipeGuideStyle = this.swipeGuideStyle;
        adRewardExt.swipeMaxTaskCount = this.swipeMaxTaskCount;
        return adRewardExt;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdRewardExt)) {
            return false;
        }
        AdRewardExt adRewardExt = (AdRewardExt) obj;
        return this.swipeRewardCardCount == adRewardExt.swipeRewardCardCount && this.swipeGuideStyle == adRewardExt.swipeGuideStyle && this.swipeMaxTaskCount == adRewardExt.swipeMaxTaskCount;
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
        int i2 = (((((i * 41) + this.swipeRewardCardCount) * 41) + this.swipeGuideStyle) * 41) + this.swipeMaxTaskCount;
        this.hashCode = i2;
        return i2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
