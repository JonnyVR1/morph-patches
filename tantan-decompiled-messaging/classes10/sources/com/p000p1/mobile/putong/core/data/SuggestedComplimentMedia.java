package com.p000p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
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
public class SuggestedComplimentMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedcomplimentmedia";

    @ProtobufIndex(index = 6)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f170id;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public SuggestedComplimentPicture picture;

    @Nullable
    @ProtobufIndex(index = 4)
    public String rel;

    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public long updatedTime;

    @Nullable
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String userId;
    public static ProtobufAdapter<SuggestedComplimentMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedComplimentMedia>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentMedia.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SuggestedComplimentMedia suggestedComplimentMedia) {
            String str = suggestedComplimentMedia.f170id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = suggestedComplimentMedia.userId;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            SuggestedComplimentPicture suggestedComplimentPicture = suggestedComplimentMedia.picture;
            if (suggestedComplimentPicture != null) {
                iO += CodedOutputByteBufferNano.l(3, suggestedComplimentPicture, SuggestedComplimentPicture.PROTOBUF_ADAPTER);
            }
            String str3 = suggestedComplimentMedia.rel;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(4, str3);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(5, suggestedComplimentMedia.updatedTime) + CodedOutputByteBufferNano.j(6, suggestedComplimentMedia.createdTime);
            ((MessageNano) suggestedComplimentMedia).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SuggestedComplimentMedia m15804parse(nb5 nb5Var) throws IOException {
            SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 10) {
                    suggestedComplimentMedia.f170id = nb5Var.s();
                } else if (iU == 18) {
                    suggestedComplimentMedia.userId = nb5Var.s();
                } else if (iU == 26) {
                    suggestedComplimentMedia.picture = (SuggestedComplimentPicture) nb5Var.l(SuggestedComplimentPicture.PROTOBUF_ADAPTER);
                } else if (iU == 34) {
                    suggestedComplimentMedia.rel = nb5Var.s();
                } else if (iU == 40) {
                    suggestedComplimentMedia.updatedTime = nb5Var.k();
                } else {
                    if (iU != 48) {
                        return suggestedComplimentMedia;
                    }
                    suggestedComplimentMedia.createdTime = nb5Var.k();
                }
            }
        }

        public void serialize(SuggestedComplimentMedia suggestedComplimentMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestedComplimentMedia.f170id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = suggestedComplimentMedia.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            SuggestedComplimentPicture suggestedComplimentPicture = suggestedComplimentMedia.picture;
            if (suggestedComplimentPicture != null) {
                codedOutputByteBufferNano.K(3, suggestedComplimentPicture, SuggestedComplimentPicture.PROTOBUF_ADAPTER);
            }
            String str3 = suggestedComplimentMedia.rel;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            codedOutputByteBufferNano.I(5, suggestedComplimentMedia.updatedTime);
            codedOutputByteBufferNano.I(6, suggestedComplimentMedia.createdTime);
        }
    };
    public static JsonAdapter<SuggestedComplimentMedia> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedComplimentMedia>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentMedia.2
        public Class getDataClass() {
            return SuggestedComplimentMedia.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SuggestedComplimentMedia m15805newInstance() {
            return new SuggestedComplimentMedia();
        }

        public boolean parseField(SuggestedComplimentMedia suggestedComplimentMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    suggestedComplimentMedia.userId = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    suggestedComplimentMedia.picture = (SuggestedComplimentPicture) SuggestedComplimentPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    suggestedComplimentMedia.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "createdTime":
                    suggestedComplimentMedia.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    suggestedComplimentMedia.f170id = jsonParser.getValueAsString();
                    return false;
                case "rel":
                    suggestedComplimentMedia.rel = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SuggestedComplimentMedia suggestedComplimentMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "picture":
                case "updatedTime":
                case "createdTime":
                    return true;
                case "id":
                    return false;
                case "rel":
                    return true;
                default:
                    return super.parseFieldCheck(suggestedComplimentMedia, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SuggestedComplimentMedia suggestedComplimentMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestedComplimentMedia.f170id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = suggestedComplimentMedia.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            if (suggestedComplimentMedia.picture != null) {
                jsonGenerator.writeFieldName("picture");
                SuggestedComplimentPicture.JSON_ADAPTER.serialize(suggestedComplimentMedia.picture, jsonGenerator, true);
            }
            String str3 = suggestedComplimentMedia.rel;
            if (str3 != null) {
                jsonGenerator.writeStringField("rel", str3);
            }
            jsonGenerator.writeNumberField("updatedTime", suggestedComplimentMedia.updatedTime);
            jsonGenerator.writeNumberField("createdTime", suggestedComplimentMedia.createdTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedComplimentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedComplimentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedComplimentMedia new_() {
        SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
        suggestedComplimentMedia.nullCheck();
        return suggestedComplimentMedia;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SuggestedComplimentMedia m15803clone() {
        SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
        suggestedComplimentMedia.f170id = this.f170id;
        suggestedComplimentMedia.userId = this.userId;
        SuggestedComplimentPicture suggestedComplimentPicture = this.picture;
        if (suggestedComplimentPicture != null) {
            suggestedComplimentMedia.picture = suggestedComplimentPicture.m15807clone();
        }
        suggestedComplimentMedia.rel = this.rel;
        suggestedComplimentMedia.updatedTime = this.updatedTime;
        suggestedComplimentMedia.createdTime = this.createdTime;
        return suggestedComplimentMedia;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuggestedComplimentMedia)) {
            return false;
        }
        SuggestedComplimentMedia suggestedComplimentMedia = (SuggestedComplimentMedia) obj;
        return ValueObject.util_equals(this.f170id, suggestedComplimentMedia.f170id) && ValueObject.util_equals(this.userId, suggestedComplimentMedia.userId) && ValueObject.util_equals(this.picture, suggestedComplimentMedia.picture) && ValueObject.util_equals(this.rel, suggestedComplimentMedia.rel) && this.updatedTime == suggestedComplimentMedia.updatedTime && this.createdTime == suggestedComplimentMedia.createdTime;
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
        String str = this.f170id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.userId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        SuggestedComplimentPicture suggestedComplimentPicture = this.picture;
        int iHashCode3 = (iHashCode2 + (suggestedComplimentPicture != null ? suggestedComplimentPicture.hashCode() : 0)) * 41;
        String str3 = this.rel;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        long j = this.updatedTime;
        int i3 = (((iHashCode3 + iHashCode4) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.createdTime;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
