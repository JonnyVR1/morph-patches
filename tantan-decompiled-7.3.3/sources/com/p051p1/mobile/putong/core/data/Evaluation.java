package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.facebook.AuthenticationTokenClaims;
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
import org.spongycastle.asn1.eac.EACTags;
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class Evaluation extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "evaluation";

    @NonNull
    @ProtobufIndex(index = 12)
    public String activityType;

    @ProtobufIndex(index = 11)
    public int coinOriginalPrice;

    @ProtobufIndex(index = 6)
    public int coinPrice;

    @NonNull
    @ProtobufIndex(index = 4)
    public String description;

    @NonNull
    @ProtobufIndex(index = 10)
    public String detailUrl;

    /* JADX INFO: renamed from: id */
    @ProtobufIndex(index = 1)
    public long f21130id;

    @NonNull
    @ProtobufIndex(index = 3)
    public String name;

    @NonNull
    @ProtobufIndex(index = 5)
    public String pictureUrl;

    @ProtobufIndex(index = 9)
    public int scaleType;

    @ProtobufIndex(index = 7)
    public long soldNum;

    @ProtobufIndex(index = 8)
    public long status;

    @NonNull
    @ProtobufIndex(index = 13)
    public String topicSource;

    @ProtobufIndex(index = 2)
    public long type;
    public static ProtobufAdapter<Evaluation> PROTOBUF_ADAPTER = new MessageNanoAdapter<Evaluation>() { // from class: com.p1.mobile.putong.core.data.Evaluation.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Evaluation evaluation) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, evaluation.f21130id) + CodedOutputByteBufferNano.m17283j(2, evaluation.type);
            String str = evaluation.name;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(3, str);
            }
            String str2 = evaluation.description;
            if (str2 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(4, str2);
            }
            String str3 = evaluation.pictureUrl;
            if (str3 != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(6, evaluation.coinPrice) + CodedOutputByteBufferNano.m17283j(7, evaluation.soldNum) + CodedOutputByteBufferNano.m17283j(8, evaluation.status) + CodedOutputByteBufferNano.m17281h(9, evaluation.scaleType);
            String str4 = evaluation.detailUrl;
            if (str4 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(10, str4);
            }
            int iM17281h2 = iM17281h + CodedOutputByteBufferNano.m17281h(11, evaluation.coinOriginalPrice);
            String str5 = evaluation.activityType;
            if (str5 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(12, str5);
            }
            String str6 = evaluation.topicSource;
            if (str6 != null) {
                iM17281h2 += CodedOutputByteBufferNano.m17288o(13, str6);
            }
            evaluation.cachedSize = iM17281h2;
            return iM17281h2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Evaluation parse(nc5 nc5Var) throws IOException {
            Evaluation evaluation = new Evaluation();
            while (true) {
                switch (nc5Var.m162497u()) {
                    case 0:
                        if (evaluation.name == null) {
                            evaluation.name = "";
                        }
                        if (evaluation.description == null) {
                            evaluation.description = "";
                        }
                        if (evaluation.detailUrl == null) {
                            evaluation.detailUrl = "";
                        }
                        if (evaluation.pictureUrl == null) {
                            evaluation.pictureUrl = "";
                        }
                        if (evaluation.activityType == null) {
                            evaluation.activityType = "";
                        }
                        if (evaluation.topicSource == null) {
                            evaluation.topicSource = "";
                        }
                        break;
                    case 8:
                        evaluation.f21130id = nc5Var.m162487k();
                        continue;
                    case 16:
                        evaluation.type = nc5Var.m162487k();
                        continue;
                    case 26:
                        evaluation.name = nc5Var.m162495s();
                        continue;
                    case 34:
                        evaluation.description = nc5Var.m162495s();
                        continue;
                    case 42:
                        evaluation.pictureUrl = nc5Var.m162495s();
                        continue;
                    case 48:
                        evaluation.coinPrice = nc5Var.m162486j();
                        continue;
                    case 56:
                        evaluation.soldNum = nc5Var.m162487k();
                        continue;
                    case 64:
                        evaluation.status = nc5Var.m162487k();
                        continue;
                    case 72:
                        evaluation.scaleType = nc5Var.m162486j();
                        continue;
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        evaluation.detailUrl = nc5Var.m162495s();
                        continue;
                    case 88:
                        evaluation.coinOriginalPrice = nc5Var.m162486j();
                        continue;
                    case EACTags.FCP_TEMPLATE /* 98 */:
                        evaluation.activityType = nc5Var.m162495s();
                        continue;
                    case 106:
                        evaluation.topicSource = nc5Var.m162495s();
                        continue;
                    default:
                        if (evaluation.name == null) {
                            evaluation.name = "";
                        }
                        if (evaluation.description == null) {
                            evaluation.description = "";
                        }
                        if (evaluation.detailUrl == null) {
                            evaluation.detailUrl = "";
                        }
                        if (evaluation.pictureUrl == null) {
                            evaluation.pictureUrl = "";
                        }
                        if (evaluation.activityType == null) {
                            evaluation.activityType = "";
                        }
                        if (evaluation.topicSource == null) {
                            evaluation.topicSource = "";
                            return evaluation;
                        }
                        break;
                }
            }
            return evaluation;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Evaluation evaluation, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, evaluation.f21130id);
            codedOutputByteBufferNano.m17307I(2, evaluation.type);
            String str = evaluation.name;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(3, str);
            }
            String str2 = evaluation.description;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(4, str2);
            }
            String str3 = evaluation.pictureUrl;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
            codedOutputByteBufferNano.m17305G(6, evaluation.coinPrice);
            codedOutputByteBufferNano.m17307I(7, evaluation.soldNum);
            codedOutputByteBufferNano.m17307I(8, evaluation.status);
            codedOutputByteBufferNano.m17305G(9, evaluation.scaleType);
            String str4 = evaluation.detailUrl;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(10, str4);
            }
            codedOutputByteBufferNano.m17305G(11, evaluation.coinOriginalPrice);
            String str5 = evaluation.activityType;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(12, str5);
            }
            String str6 = evaluation.topicSource;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(13, str6);
            }
        }
    };
    public static JsonAdapter<Evaluation> JSON_ADAPTER = new ObjectJsonAdapter<Evaluation>() { // from class: com.p1.mobile.putong.core.data.Evaluation.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Evaluation.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Evaluation newInstance() {
            return new Evaluation();
        }

        public boolean parseField(Evaluation evaluation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "coinOriginalPrice":
                    evaluation.coinOriginalPrice = jsonParser.getValueAsInt();
                    return true;
                case "soldNum":
                    evaluation.soldNum = jsonParser.getValueAsLong();
                    return true;
                case "detailUrl":
                    evaluation.detailUrl = jsonParser.getValueAsString();
                    return true;
                case "scaleType":
                    evaluation.scaleType = jsonParser.getValueAsInt();
                    return true;
                case "description":
                    evaluation.description = jsonParser.getValueAsString();
                    return true;
                case "pictureUrl":
                    evaluation.pictureUrl = jsonParser.getValueAsString();
                    return true;
                case "status":
                    evaluation.status = jsonParser.getValueAsLong();
                    return true;
                case "coinPrice":
                    evaluation.coinPrice = jsonParser.getValueAsInt();
                    return true;
                case "topicSource":
                    evaluation.topicSource = jsonParser.getValueAsString();
                    return true;
                case "id":
                    evaluation.f21130id = jsonParser.getValueAsLong();
                    return false;
                case "name":
                    evaluation.name = jsonParser.getValueAsString();
                    return true;
                case "type":
                    evaluation.type = jsonParser.getValueAsLong();
                    return true;
                case "activityType":
                    evaluation.activityType = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Evaluation evaluation, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "coinOriginalPrice":
                case "soldNum":
                case "detailUrl":
                case "scaleType":
                case "description":
                case "pictureUrl":
                case "status":
                case "coinPrice":
                case "topicSource":
                    return true;
                case "id":
                    return false;
                case "name":
                case "type":
                case "activityType":
                    return true;
                default:
                    return super.parseFieldCheck(evaluation, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Evaluation evaluation, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("id", evaluation.f21130id);
            jsonGenerator.writeNumberField("type", evaluation.type);
            String str = evaluation.name;
            if (str != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str);
            }
            String str2 = evaluation.description;
            if (str2 != null) {
                jsonGenerator.writeStringField("description", str2);
            }
            String str3 = evaluation.detailUrl;
            if (str3 != null) {
                jsonGenerator.writeStringField("detailUrl", str3);
            }
            String str4 = evaluation.pictureUrl;
            if (str4 != null) {
                jsonGenerator.writeStringField("pictureUrl", str4);
            }
            jsonGenerator.writeNumberField("coinPrice", evaluation.coinPrice);
            jsonGenerator.writeNumberField("soldNum", evaluation.soldNum);
            jsonGenerator.writeNumberField(NotificationCompat.CATEGORY_STATUS, evaluation.status);
            jsonGenerator.writeNumberField("scaleType", evaluation.scaleType);
            jsonGenerator.writeNumberField("coinOriginalPrice", evaluation.coinOriginalPrice);
            String str5 = evaluation.activityType;
            if (str5 != null) {
                jsonGenerator.writeStringField("activityType", str5);
            }
            String str6 = evaluation.topicSource;
            if (str6 != null) {
                jsonGenerator.writeStringField("topicSource", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Evaluation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Evaluation) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Evaluation new_() {
        Evaluation evaluation = new Evaluation();
        evaluation.nullCheck();
        return evaluation;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Evaluation mo225055clone() {
        Evaluation evaluation = new Evaluation();
        evaluation.f21130id = this.f21130id;
        evaluation.type = this.type;
        evaluation.name = this.name;
        evaluation.description = this.description;
        evaluation.detailUrl = this.detailUrl;
        evaluation.pictureUrl = this.pictureUrl;
        evaluation.coinPrice = this.coinPrice;
        evaluation.soldNum = this.soldNum;
        evaluation.status = this.status;
        evaluation.scaleType = this.scaleType;
        evaluation.coinOriginalPrice = this.coinOriginalPrice;
        evaluation.activityType = this.activityType;
        evaluation.topicSource = this.topicSource;
        return evaluation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Evaluation)) {
            return false;
        }
        Evaluation evaluation = (Evaluation) obj;
        return this.f21130id == evaluation.f21130id && this.type == evaluation.type && ValueObject.util_equals(this.name, evaluation.name) && ValueObject.util_equals(this.description, evaluation.description) && ValueObject.util_equals(this.detailUrl, evaluation.detailUrl) && ValueObject.util_equals(this.pictureUrl, evaluation.pictureUrl) && this.coinPrice == evaluation.coinPrice && this.soldNum == evaluation.soldNum && this.status == evaluation.status && this.scaleType == evaluation.scaleType && this.coinOriginalPrice == evaluation.coinOriginalPrice && ValueObject.util_equals(this.activityType, evaluation.activityType) && ValueObject.util_equals(this.topicSource, evaluation.topicSource);
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
        long j = this.f21130id;
        int i2 = ((i * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.type;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 41;
        String str = this.name;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.detailUrl;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pictureUrl;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.coinPrice) * 41;
        long j3 = this.soldNum;
        int i4 = (iHashCode4 + ((int) (j3 ^ (j3 >>> 32)))) * 41;
        long j4 = this.status;
        int i5 = (((((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 41) + this.scaleType) * 41) + this.coinOriginalPrice) * 41;
        String str5 = this.activityType;
        int iHashCode5 = (i5 + (str5 != null ? str5.hashCode() : 0)) * 41;
        String str6 = this.topicSource;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.name == null) {
            this.name = "";
        }
        if (this.description == null) {
            this.description = "";
        }
        if (this.detailUrl == null) {
            this.detailUrl = "";
        }
        if (this.pictureUrl == null) {
            this.pictureUrl = "";
        }
        if (this.activityType == null) {
            this.activityType = "";
        }
        if (this.topicSource == null) {
            this.topicSource = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
