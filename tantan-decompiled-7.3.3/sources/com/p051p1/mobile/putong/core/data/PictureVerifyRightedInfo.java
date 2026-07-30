package com.p051p1.mobile.putong.core.data;

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

/* JADX INFO: loaded from: classes10.dex */
public class PictureVerifyRightedInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pictureverifyrightedinfo";

    @ProtobufIndex(index = 1)
    public int exSwipeRight;

    @ProtobufIndex(index = 2)
    public int priorityRecommend;

    @ProtobufIndex(index = 3)
    public int seeVerifyCount;
    public static ProtobufAdapter<PictureVerifyRightedInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureVerifyRightedInfo>() { // from class: com.p1.mobile.putong.core.data.PictureVerifyRightedInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PictureVerifyRightedInfo pictureVerifyRightedInfo) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, pictureVerifyRightedInfo.exSwipeRight) + CodedOutputByteBufferNano.m17281h(2, pictureVerifyRightedInfo.priorityRecommend) + CodedOutputByteBufferNano.m17281h(3, pictureVerifyRightedInfo.seeVerifyCount);
            pictureVerifyRightedInfo.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PictureVerifyRightedInfo parse(nc5 nc5Var) throws IOException {
            PictureVerifyRightedInfo pictureVerifyRightedInfo = new PictureVerifyRightedInfo();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    pictureVerifyRightedInfo.exSwipeRight = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    pictureVerifyRightedInfo.priorityRecommend = nc5Var.m162486j();
                } else {
                    if (iM162497u != 24) {
                        return pictureVerifyRightedInfo;
                    }
                    pictureVerifyRightedInfo.seeVerifyCount = nc5Var.m162486j();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PictureVerifyRightedInfo pictureVerifyRightedInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, pictureVerifyRightedInfo.exSwipeRight);
            codedOutputByteBufferNano.m17305G(2, pictureVerifyRightedInfo.priorityRecommend);
            codedOutputByteBufferNano.m17305G(3, pictureVerifyRightedInfo.seeVerifyCount);
        }
    };
    public static JsonAdapter<PictureVerifyRightedInfo> JSON_ADAPTER = new ObjectJsonAdapter<PictureVerifyRightedInfo>() { // from class: com.p1.mobile.putong.core.data.PictureVerifyRightedInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PictureVerifyRightedInfo.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PictureVerifyRightedInfo newInstance() {
            return new PictureVerifyRightedInfo();
        }

        public boolean parseField(PictureVerifyRightedInfo pictureVerifyRightedInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "priorityRecommend":
                    pictureVerifyRightedInfo.priorityRecommend = jsonParser.getValueAsInt();
                    return true;
                case "seeVerifyCount":
                    pictureVerifyRightedInfo.seeVerifyCount = jsonParser.getValueAsInt();
                    return true;
                case "exSwipeRight":
                    pictureVerifyRightedInfo.exSwipeRight = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PictureVerifyRightedInfo pictureVerifyRightedInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "priorityRecommend":
                case "seeVerifyCount":
                case "exSwipeRight":
                    return true;
                default:
                    return super.parseFieldCheck(pictureVerifyRightedInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PictureVerifyRightedInfo pictureVerifyRightedInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exSwipeRight", pictureVerifyRightedInfo.exSwipeRight);
            jsonGenerator.writeNumberField("priorityRecommend", pictureVerifyRightedInfo.priorityRecommend);
            jsonGenerator.writeNumberField("seeVerifyCount", pictureVerifyRightedInfo.seeVerifyCount);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureVerifyRightedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureVerifyRightedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureVerifyRightedInfo new_() {
        PictureVerifyRightedInfo pictureVerifyRightedInfo = new PictureVerifyRightedInfo();
        pictureVerifyRightedInfo.nullCheck();
        return pictureVerifyRightedInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PictureVerifyRightedInfo mo225055clone() {
        PictureVerifyRightedInfo pictureVerifyRightedInfo = new PictureVerifyRightedInfo();
        pictureVerifyRightedInfo.exSwipeRight = this.exSwipeRight;
        pictureVerifyRightedInfo.priorityRecommend = this.priorityRecommend;
        pictureVerifyRightedInfo.seeVerifyCount = this.seeVerifyCount;
        return pictureVerifyRightedInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PictureVerifyRightedInfo)) {
            return false;
        }
        PictureVerifyRightedInfo pictureVerifyRightedInfo = (PictureVerifyRightedInfo) obj;
        return this.exSwipeRight == pictureVerifyRightedInfo.exSwipeRight && this.priorityRecommend == pictureVerifyRightedInfo.priorityRecommend && this.seeVerifyCount == pictureVerifyRightedInfo.seeVerifyCount;
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
        int i2 = (((((i * 41) + this.exSwipeRight) * 41) + this.priorityRecommend) * 41) + this.seeVerifyCount;
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
