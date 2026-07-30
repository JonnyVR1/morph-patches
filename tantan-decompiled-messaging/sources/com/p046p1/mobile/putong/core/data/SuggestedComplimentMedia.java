package com.p046p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.LocationInvisibleField;
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

/* JADX INFO: loaded from: classes10.dex */
public class SuggestedComplimentMedia extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "suggestedcomplimentmedia";

    @ProtobufIndex(index = 6)
    public long createdTime;

    /* JADX INFO: renamed from: id */
    @Nullable
    @ProtobufIndex(index = 1)
    public String f20508id;

    @Nullable
    @ProtobufIndex(index = 3)
    public SuggestedComplimentPicture picture;

    @Nullable
    @ProtobufIndex(index = 4)
    public String rel;

    @ProtobufIndex(index = 5)
    public long updatedTime;

    @Nullable
    @ProtobufIndex(index = 2)
    public String userId;
    public static ProtobufAdapter<SuggestedComplimentMedia> PROTOBUF_ADAPTER = new MessageNanoAdapter<SuggestedComplimentMedia>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentMedia.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(SuggestedComplimentMedia suggestedComplimentMedia) {
            String str = suggestedComplimentMedia.f20508id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = suggestedComplimentMedia.userId;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            SuggestedComplimentPicture suggestedComplimentPicture = suggestedComplimentMedia.picture;
            if (suggestedComplimentPicture != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(3, suggestedComplimentPicture, SuggestedComplimentPicture.PROTOBUF_ADAPTER);
            }
            String str3 = suggestedComplimentMedia.rel;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str3);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(5, suggestedComplimentMedia.updatedTime) + CodedOutputByteBufferNano.m17228j(6, suggestedComplimentMedia.createdTime);
            suggestedComplimentMedia.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public SuggestedComplimentMedia parse(nb5 nb5Var) throws IOException {
            SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 10) {
                    suggestedComplimentMedia.f20508id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    suggestedComplimentMedia.userId = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    suggestedComplimentMedia.picture = (SuggestedComplimentPicture) nb5Var.m158743l(SuggestedComplimentPicture.PROTOBUF_ADAPTER);
                } else if (iM158752u == 34) {
                    suggestedComplimentMedia.rel = nb5Var.m158750s();
                } else if (iM158752u == 40) {
                    suggestedComplimentMedia.updatedTime = nb5Var.m158742k();
                } else {
                    if (iM158752u != 48) {
                        return suggestedComplimentMedia;
                    }
                    suggestedComplimentMedia.createdTime = nb5Var.m158742k();
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(SuggestedComplimentMedia suggestedComplimentMedia, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = suggestedComplimentMedia.f20508id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = suggestedComplimentMedia.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            SuggestedComplimentPicture suggestedComplimentPicture = suggestedComplimentMedia.picture;
            if (suggestedComplimentPicture != null) {
                codedOutputByteBufferNano.m17254K(3, suggestedComplimentPicture, SuggestedComplimentPicture.PROTOBUF_ADAPTER);
            }
            String str3 = suggestedComplimentMedia.rel;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(4, str3);
            }
            codedOutputByteBufferNano.m17252I(5, suggestedComplimentMedia.updatedTime);
            codedOutputByteBufferNano.m17252I(6, suggestedComplimentMedia.createdTime);
        }
    };
    public static JsonAdapter<SuggestedComplimentMedia> JSON_ADAPTER = new ObjectJsonAdapter<SuggestedComplimentMedia>() { // from class: com.p1.mobile.putong.core.data.SuggestedComplimentMedia.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return SuggestedComplimentMedia.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public SuggestedComplimentMedia newInstance() {
            return new SuggestedComplimentMedia();
        }

        public boolean parseField(SuggestedComplimentMedia suggestedComplimentMedia, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    suggestedComplimentMedia.userId = jsonParser.getValueAsString();
                    return true;
                case "picture":
                    suggestedComplimentMedia.picture = SuggestedComplimentPicture.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "updatedTime":
                    suggestedComplimentMedia.updatedTime = jsonParser.getValueAsLong();
                    return true;
                case "createdTime":
                    suggestedComplimentMedia.createdTime = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    suggestedComplimentMedia.f20508id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(SuggestedComplimentMedia suggestedComplimentMedia, JsonGenerator jsonGenerator) throws IOException {
            String str = suggestedComplimentMedia.f20508id;
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
            jsonGenerator.writeNumberField(LocationInvisibleField.updatedTime, suggestedComplimentMedia.updatedTime);
            jsonGenerator.writeNumberField("createdTime", suggestedComplimentMedia.createdTime);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SuggestedComplimentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SuggestedComplimentMedia) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SuggestedComplimentMedia new_() {
        SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
        suggestedComplimentMedia.nullCheck();
        return suggestedComplimentMedia;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public SuggestedComplimentMedia mo223809clone() {
        SuggestedComplimentMedia suggestedComplimentMedia = new SuggestedComplimentMedia();
        suggestedComplimentMedia.f20508id = this.f20508id;
        suggestedComplimentMedia.userId = this.userId;
        SuggestedComplimentPicture suggestedComplimentPicture = this.picture;
        if (suggestedComplimentPicture != null) {
            suggestedComplimentMedia.picture = suggestedComplimentPicture.mo223809clone();
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
        return ValueObject.util_equals(this.f20508id, suggestedComplimentMedia.f20508id) && ValueObject.util_equals(this.userId, suggestedComplimentMedia.userId) && ValueObject.util_equals(this.picture, suggestedComplimentMedia.picture) && ValueObject.util_equals(this.rel, suggestedComplimentMedia.rel) && this.updatedTime == suggestedComplimentMedia.updatedTime && this.createdTime == suggestedComplimentMedia.createdTime;
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
        String str = this.f20508id;
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
        this.hashCode = i4;
        return i4;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
