package com.p000p1.mobile.putong.core.data;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class PictureVerifyRightedInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "pictureverifyrightedinfo";

    @ProtobufIndex(index = 1)
    public int exSwipeRight;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public int priorityRecommend;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public int seeVerifyCount;
    public static ProtobufAdapter<PictureVerifyRightedInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PictureVerifyRightedInfo>() { // from class: com.p1.mobile.putong.core.data.PictureVerifyRightedInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PictureVerifyRightedInfo pictureVerifyRightedInfo) {
            int iH = CodedOutputByteBufferNano.h(1, pictureVerifyRightedInfo.exSwipeRight) + CodedOutputByteBufferNano.h(2, pictureVerifyRightedInfo.priorityRecommend) + CodedOutputByteBufferNano.h(3, pictureVerifyRightedInfo.seeVerifyCount);
            ((MessageNano) pictureVerifyRightedInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PictureVerifyRightedInfo m14805parse(nb5 nb5Var) throws IOException {
            PictureVerifyRightedInfo pictureVerifyRightedInfo = new PictureVerifyRightedInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 8) {
                    pictureVerifyRightedInfo.exSwipeRight = nb5Var.j();
                } else if (iU == 16) {
                    pictureVerifyRightedInfo.priorityRecommend = nb5Var.j();
                } else {
                    if (iU != 24) {
                        return pictureVerifyRightedInfo;
                    }
                    pictureVerifyRightedInfo.seeVerifyCount = nb5Var.j();
                }
            }
        }

        public void serialize(PictureVerifyRightedInfo pictureVerifyRightedInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, pictureVerifyRightedInfo.exSwipeRight);
            codedOutputByteBufferNano.G(2, pictureVerifyRightedInfo.priorityRecommend);
            codedOutputByteBufferNano.G(3, pictureVerifyRightedInfo.seeVerifyCount);
        }
    };
    public static JsonAdapter<PictureVerifyRightedInfo> JSON_ADAPTER = new ObjectJsonAdapter<PictureVerifyRightedInfo>() { // from class: com.p1.mobile.putong.core.data.PictureVerifyRightedInfo.2
        public Class getDataClass() {
            return PictureVerifyRightedInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PictureVerifyRightedInfo m14806newInstance() {
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

        public void serializeFields(PictureVerifyRightedInfo pictureVerifyRightedInfo, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("exSwipeRight", pictureVerifyRightedInfo.exSwipeRight);
            jsonGenerator.writeNumberField("priorityRecommend", pictureVerifyRightedInfo.priorityRecommend);
            jsonGenerator.writeNumberField("seeVerifyCount", pictureVerifyRightedInfo.seeVerifyCount);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PictureVerifyRightedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PictureVerifyRightedInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PictureVerifyRightedInfo new_() {
        PictureVerifyRightedInfo pictureVerifyRightedInfo = new PictureVerifyRightedInfo();
        pictureVerifyRightedInfo.nullCheck();
        return pictureVerifyRightedInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PictureVerifyRightedInfo m14804clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = (((((i * 41) + this.exSwipeRight) * 41) + this.priorityRecommend) * 41) + this.seeVerifyCount;
        ((ValueObject) this).hashCode = i2;
        return i2;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
