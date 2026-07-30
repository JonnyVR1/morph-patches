package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p051p1.mobile.putong.feed.data.RankingExtra;
import com.p051p1.mobile.putong.feed.data.RankingTag;
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
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes13.dex */
public class RankingExtra extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "rankingextra";

    @ProtobufIndex(index = 3)
    public boolean picToVideo;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<String> presetTexts;

    @ProtobufIndex(index = 5)
    public int presetTextsIndex;

    @ProtobufIndex(index = 2)
    public boolean showRedpacketIcon;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<RankingTag> tags;
    public static ProtobufAdapter<RankingExtra> PROTOBUF_ADAPTER = new MessageNanoAdapter<RankingExtra>() { // from class: com.p1.mobile.putong.feed.data.RankingExtra.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RankingExtra rankingExtra) {
            List<RankingTag> list = rankingExtra.tags;
            int iM17285l = (list != null ? CodedOutputByteBufferNano.m17285l(1, list, RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.m17275b(2, rankingExtra.showRedpacketIcon) + CodedOutputByteBufferNano.m17275b(3, rankingExtra.picToVideo);
            List<String> list2 = rankingExtra.presetTexts;
            if (list2 != null) {
                iM17285l += CodedOutputByteBufferNano.m17285l(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iM17281h = iM17285l + CodedOutputByteBufferNano.m17281h(5, rankingExtra.presetTextsIndex);
            rankingExtra.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RankingExtra parse(nc5 nc5Var) throws IOException {
            RankingExtra rankingExtra = new RankingExtra();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (rankingExtra.tags == null) {
                        rankingExtra.tags = new ArrayList();
                    }
                    if (rankingExtra.presetTexts != null) {
                        break;
                    }
                    rankingExtra.presetTexts = new ArrayList();
                    break;
                }
                if (iM162497u == 10) {
                    rankingExtra.tags = (List) nc5Var.m162488l(RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM162497u == 16) {
                    rankingExtra.showRedpacketIcon = nc5Var.m162483g();
                } else if (iM162497u == 24) {
                    rankingExtra.picToVideo = nc5Var.m162483g();
                } else if (iM162497u == 34) {
                    rankingExtra.presetTexts = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM162497u != 40) {
                        if (rankingExtra.tags == null) {
                            rankingExtra.tags = new ArrayList();
                        }
                        if (rankingExtra.presetTexts != null) {
                            break;
                        }
                        rankingExtra.presetTexts = new ArrayList();
                        return rankingExtra;
                    }
                    rankingExtra.presetTextsIndex = nc5Var.m162486j();
                }
            }
            return rankingExtra;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RankingExtra rankingExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RankingTag> list = rankingExtra.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(1, list, RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17299A(2, rankingExtra.showRedpacketIcon);
            codedOutputByteBufferNano.m17299A(3, rankingExtra.picToVideo);
            List<String> list2 = rankingExtra.presetTexts;
            if (list2 != null) {
                codedOutputByteBufferNano.m17309K(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.m17305G(5, rankingExtra.presetTextsIndex);
        }
    };
    public static JsonAdapter<RankingExtra> JSON_ADAPTER = new ObjectJsonAdapter<RankingExtra>() { // from class: com.p1.mobile.putong.feed.data.RankingExtra.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RankingExtra.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RankingExtra newInstance() {
            return new RankingExtra();
        }

        public boolean parseField(RankingExtra rankingExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "presetTextsIndex":
                    rankingExtra.presetTextsIndex = jsonParser.getValueAsInt();
                    return true;
                case "presetTexts":
                    rankingExtra.presetTexts = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "picToVideo":
                    rankingExtra.picToVideo = jsonParser.getValueAsBoolean();
                    return true;
                case "tags":
                    rankingExtra.tags = JsonAdapter.parseArray(jsonParser, RankingTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "showRedpacketIcon":
                    rankingExtra.showRedpacketIcon = jsonParser.getValueAsBoolean();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RankingExtra rankingExtra, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "presetTextsIndex":
                case "presetTexts":
                case "picToVideo":
                case "tags":
                case "showRedpacketIcon":
                    return true;
                default:
                    return super.parseFieldCheck(rankingExtra, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RankingExtra rankingExtra, JsonGenerator jsonGenerator) throws IOException {
            if (rankingExtra.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(rankingExtra.tags, jsonGenerator, RankingTag.JSON_ADAPTER);
            }
            jsonGenerator.writeBooleanField("showRedpacketIcon", rankingExtra.showRedpacketIcon);
            jsonGenerator.writeBooleanField("picToVideo", rankingExtra.picToVideo);
            if (rankingExtra.presetTexts != null) {
                jsonGenerator.writeFieldName("presetTexts");
                JsonAdapter.serializeArray(rankingExtra.presetTexts, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            jsonGenerator.writeNumberField("presetTextsIndex", rankingExtra.presetTextsIndex);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m62075b(String str) {
        return str;
    }

    public static RankingExtra new_() {
        RankingExtra rankingExtra = new RankingExtra();
        rankingExtra.nullCheck();
        return rankingExtra;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RankingExtra mo225055clone() {
        RankingExtra rankingExtra = new RankingExtra();
        List<RankingTag> list = this.tags;
        if (list != null) {
            rankingExtra.tags = ValueObject.util_map(list, new qcj() { // from class: l.wkc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((RankingTag) obj).mo225055clone();
                }
            });
        }
        rankingExtra.showRedpacketIcon = this.showRedpacketIcon;
        rankingExtra.picToVideo = this.picToVideo;
        List<String> list2 = this.presetTexts;
        if (list2 != null) {
            rankingExtra.presetTexts = ValueObject.util_map(list2, new qcj() { // from class: l.ykc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return RankingExtra.m62075b((String) obj);
                }
            });
        }
        rankingExtra.presetTextsIndex = this.presetTextsIndex;
        return rankingExtra;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RankingExtra)) {
            return false;
        }
        RankingExtra rankingExtra = (RankingExtra) obj;
        return ValueObject.util_equals(this.tags, rankingExtra.tags) && this.showRedpacketIcon == rankingExtra.showRedpacketIcon && this.picToVideo == rankingExtra.picToVideo && ValueObject.util_equals(this.presetTexts, rankingExtra.presetTexts) && this.presetTextsIndex == rankingExtra.presetTextsIndex;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "rankingextra";
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<RankingTag> list = this.tags;
        int iHashCode = (((((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.showRedpacketIcon ? 1231 : 1237)) * 41) + (this.picToVideo ? 1231 : 1237)) * 41;
        List<String> list2 = this.presetTexts;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.presetTextsIndex;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.presetTexts == null) {
            this.presetTexts = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
