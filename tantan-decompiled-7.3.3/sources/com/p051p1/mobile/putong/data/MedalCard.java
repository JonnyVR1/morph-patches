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
import java.util.HashSet;
import p153l.nc5;

/* JADX INFO: loaded from: classes12.dex */
public class MedalCard extends ValueObject<MedalCard> implements Cloneable, Serializable {
    public static final String TYPE = "medalcard";

    @NonNull
    @ProtobufIndex(index = 5)
    public String deeplink;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39628id;
    private HashSet<String> parseFieldSet = new HashSet<>();

    @ProtobufIndex(index = 3)
    public int picHeight;

    @NonNull
    @ProtobufIndex(index = 2)
    public String picURL;

    @ProtobufIndex(index = 4)
    public int picWidth;
    private String requestUrl;
    public static ProtobufAdapter<MedalCard> PROTOBUF_ADAPTER = new MessageNanoAdapter<MedalCard>() { // from class: com.p1.mobile.putong.data.MedalCard.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MedalCard medalCard) {
            String str = medalCard.f39628id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = medalCard.picURL;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            int iM17281h = iM17288o + CodedOutputByteBufferNano.m17281h(3, medalCard.picHeight) + CodedOutputByteBufferNano.m17281h(4, medalCard.picWidth);
            String str3 = medalCard.deeplink;
            if (str3 != null) {
                iM17281h += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            medalCard.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MedalCard parse(nc5 nc5Var) throws IOException {
            MedalCard medalCard = new MedalCard();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (medalCard.f39628id == null) {
                        medalCard.f39628id = "";
                    }
                    if (medalCard.picURL == null) {
                        medalCard.picURL = "";
                    }
                    if (medalCard.deeplink != null) {
                        break;
                    }
                    medalCard.deeplink = "";
                    break;
                }
                if (iM162497u == 10) {
                    medalCard.f39628id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    medalCard.picURL = nc5Var.m162495s();
                } else if (iM162497u == 24) {
                    medalCard.picHeight = nc5Var.m162486j();
                } else if (iM162497u == 32) {
                    medalCard.picWidth = nc5Var.m162486j();
                } else {
                    if (iM162497u != 42) {
                        if (medalCard.f39628id == null) {
                            medalCard.f39628id = "";
                        }
                        if (medalCard.picURL == null) {
                            medalCard.picURL = "";
                        }
                        if (medalCard.deeplink != null) {
                            break;
                        }
                        medalCard.deeplink = "";
                        return medalCard;
                    }
                    medalCard.deeplink = nc5Var.m162495s();
                }
            }
            return medalCard;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MedalCard medalCard, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = medalCard.f39628id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = medalCard.picURL;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            codedOutputByteBufferNano.m17305G(3, medalCard.picHeight);
            codedOutputByteBufferNano.m17305G(4, medalCard.picWidth);
            String str3 = medalCard.deeplink;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<MedalCard> JSON_ADAPTER = new ObjectJsonAdapter<MedalCard>() { // from class: com.p1.mobile.putong.data.MedalCard.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MedalCard.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MedalCard newInstance() {
            return new MedalCard();
        }

        public boolean parseField(MedalCard medalCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picURL":
                    medalCard.picURL = jsonParser.getValueAsString();
                    return true;
                case "picWidth":
                    medalCard.picWidth = jsonParser.getValueAsInt();
                    return true;
                case "id":
                    medalCard.f39628id = jsonParser.getValueAsString();
                    return false;
                case "deeplink":
                    medalCard.deeplink = jsonParser.getValueAsString();
                    return true;
                case "picHeight":
                    medalCard.picHeight = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MedalCard medalCard, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picURL":
                case "picWidth":
                    return true;
                case "id":
                    return false;
                case "deeplink":
                case "picHeight":
                    return true;
                default:
                    return super.parseFieldCheck(medalCard, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MedalCard medalCard, JsonGenerator jsonGenerator) throws IOException {
            String str = medalCard.f39628id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = medalCard.picURL;
            if (str2 != null) {
                jsonGenerator.writeStringField("picURL", str2);
            }
            jsonGenerator.writeNumberField("picHeight", medalCard.picHeight);
            jsonGenerator.writeNumberField("picWidth", medalCard.picWidth);
            String str3 = medalCard.deeplink;
            if (str3 != null) {
                jsonGenerator.writeStringField(LinkAction.deeplink, str3);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MedalCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MedalCard) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MedalCard new_() {
        MedalCard medalCard = new MedalCard();
        medalCard.nullCheck();
        return medalCard;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MedalCard mo225055clone() {
        MedalCard medalCard = new MedalCard();
        medalCard.f39628id = this.f39628id;
        medalCard.picURL = this.picURL;
        medalCard.picHeight = this.picHeight;
        medalCard.picWidth = this.picWidth;
        medalCard.deeplink = this.deeplink;
        return medalCard;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MedalCard)) {
            return false;
        }
        MedalCard medalCard = (MedalCard) obj;
        return ValueObject.util_equals(this.f39628id, medalCard.f39628id) && ValueObject.util_equals(this.picURL, medalCard.picURL) && this.picHeight == medalCard.picHeight && this.picWidth == medalCard.picWidth && ValueObject.util_equals(this.deeplink, medalCard.deeplink);
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
        String str = this.f39628id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.picURL;
        int iHashCode2 = (((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41) + this.picHeight) * 41) + this.picWidth) * 41;
        String str3 = this.deeplink;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public boolean isFieldParsed(String str) {
        return this.parseFieldSet.contains(str);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void mergeData(MedalCard medalCard) {
        if (!shouldMergeData() || equals(medalCard)) {
            return;
        }
        if (!isFieldParsed("id")) {
            this.f39628id = medalCard.f39628id;
        }
        if (!isFieldParsed("picURL")) {
            this.picURL = medalCard.picURL;
        }
        if (!isFieldParsed("picHeight")) {
            this.picHeight = medalCard.picHeight;
        }
        if (!isFieldParsed("picWidth")) {
            this.picWidth = medalCard.picWidth;
        }
        if (!isFieldParsed(LinkAction.deeplink)) {
            this.deeplink = medalCard.deeplink;
        }
        this.parseFieldSet.clear();
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39628id == null) {
            this.f39628id = "";
        }
        if (this.picURL == null) {
            this.picURL = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void setParsedApiRequest(String str) {
        this.requestUrl = str;
    }

    public MedalCard subtract(MedalCard medalCard) {
        MedalCard medalCard2 = new MedalCard();
        if (!ValueObject.util_equals(this.f39628id, medalCard.f39628id)) {
            medalCard2.f39628id = this.f39628id;
        }
        if (!ValueObject.util_equals(this.picURL, medalCard.picURL)) {
            medalCard2.picURL = this.picURL;
        }
        if (!ValueObject.util_equals(this.deeplink, medalCard.deeplink)) {
            medalCard2.deeplink = this.deeplink;
        }
        if (medalCard2.equals(new MedalCard())) {
            return null;
        }
        return medalCard2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
