package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Media;
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
import java.util.List;
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class GPTopicCard extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "gptopiccard";
    public int headerDesc;
    public int iconRes;

    @NonNull
    @ProtobufIndex(index = 1)
    public String name;
    public int payBtnDesc;

    @NonNull
    @ProtobufIndex(index = 2)
    public List<Media> pictures;
    public int topicName;
    public static ProtobufAdapter<GPTopicCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<GPTopicCard>() { // from class: com.p1.mobile.putong.core.data.GPTopicCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(GPTopicCard gPTopicCard) {
            String str = gPTopicCard.name;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            List<Media> list = gPTopicCard.pictures;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(2, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            gPTopicCard.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public GPTopicCard parse(nb5 nb5Var) throws IOException {
            GPTopicCard gPTopicCard = new GPTopicCard();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (gPTopicCard.name == null) {
                        gPTopicCard.name = "";
                    }
                    if (gPTopicCard.pictures != null) {
                        break;
                    }
                    gPTopicCard.pictures = new ArrayList();
                    break;
                }
                if (iM158752u == 10) {
                    gPTopicCard.name = nb5Var.m158750s();
                } else {
                    if (iM158752u != 18) {
                        if (gPTopicCard.name == null) {
                            gPTopicCard.name = "";
                        }
                        if (gPTopicCard.pictures != null) {
                            break;
                        }
                        gPTopicCard.pictures = new ArrayList();
                        return gPTopicCard;
                    }
                    gPTopicCard.pictures = (List) nb5Var.m158743l(Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return gPTopicCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(GPTopicCard gPTopicCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = gPTopicCard.name;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            List<Media> list = gPTopicCard.pictures;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(2, list, Media.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<GPTopicCard> JSON_ADAPTER = new ObjectJsonAdapter<GPTopicCard>() { // from class: com.p1.mobile.putong.core.data.GPTopicCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return GPTopicCard.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public GPTopicCard newInstance() {
            return new GPTopicCard();
        }

        public boolean parseField(GPTopicCard gPTopicCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("pictures")) {
                gPTopicCard.pictures = JsonAdapter.parseArray(jsonParser, Converter.RAW_PICTURE_TO_MEDIA, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return false;
            }
            gPTopicCard.name = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(GPTopicCard gPTopicCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("pictures") || str.equals(AuthenticationTokenClaims.JSON_KEY_NAME)) {
                return true;
            }
            return super.parseFieldCheck(gPTopicCard, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(GPTopicCard gPTopicCard, JsonGenerator jsonGenerator) throws IOException {
            String str = gPTopicCard.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            if (gPTopicCard.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(gPTopicCard.pictures, jsonGenerator, Converter.RAW_PICTURE_TO_MEDIA);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((GPTopicCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((GPTopicCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static GPTopicCard new_() {
        GPTopicCard gPTopicCard = new GPTopicCard();
        gPTopicCard.nullCheck();
        return gPTopicCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public GPTopicCard mo223809clone() {
        GPTopicCard gPTopicCard = new GPTopicCard();
        gPTopicCard.name = this.name;
        List<Media> list = this.pictures;
        if (list != null) {
            gPTopicCard.pictures = ValueObject.util_map(list, new w9j() { // from class: l.pgj
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).mo223809clone();
                }
            });
        }
        return gPTopicCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPTopicCard)) {
            return false;
        }
        GPTopicCard gPTopicCard = (GPTopicCard) obj;
        return ValueObject.util_equals(this.name, gPTopicCard.name) && ValueObject.util_equals(this.pictures, gPTopicCard.pictures);
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
        String str = this.name;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        List<Media> list = this.pictures;
        int iHashCode2 = iHashCode + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
