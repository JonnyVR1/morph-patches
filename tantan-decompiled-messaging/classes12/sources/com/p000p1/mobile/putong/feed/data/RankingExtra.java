package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.RankingExtra;
import com.p000p1.mobile.putong.feed.data.RankingTag;
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
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(RankingExtra rankingExtra) {
            List<RankingTag> list = rankingExtra.tags;
            int iL = (list != null ? CodedOutputByteBufferNano.l(1, list, RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER()) : 0) + CodedOutputByteBufferNano.b(2, rankingExtra.showRedpacketIcon) + CodedOutputByteBufferNano.b(3, rankingExtra.picToVideo);
            List<String> list2 = rankingExtra.presetTexts;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iL + CodedOutputByteBufferNano.h(5, rankingExtra.presetTextsIndex);
            ((MessageNano) rankingExtra).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public RankingExtra m19735parse(nb5 nb5Var) throws IOException {
            RankingExtra rankingExtra = new RankingExtra();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (rankingExtra.tags == null) {
                        rankingExtra.tags = new ArrayList();
                    }
                    if (rankingExtra.presetTexts != null) {
                        break;
                    }
                    rankingExtra.presetTexts = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    rankingExtra.tags = (List) nb5Var.l(RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 16) {
                    rankingExtra.showRedpacketIcon = nb5Var.g();
                } else if (iU == 24) {
                    rankingExtra.picToVideo = nb5Var.g();
                } else if (iU == 34) {
                    rankingExtra.presetTexts = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 40) {
                        if (rankingExtra.tags == null) {
                            rankingExtra.tags = new ArrayList();
                        }
                        if (rankingExtra.presetTexts != null) {
                            break;
                        }
                        rankingExtra.presetTexts = new ArrayList();
                        return rankingExtra;
                    }
                    rankingExtra.presetTextsIndex = nb5Var.j();
                }
            }
            return rankingExtra;
        }

        public void serialize(RankingExtra rankingExtra, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<RankingTag> list = rankingExtra.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, RankingTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.A(2, rankingExtra.showRedpacketIcon);
            codedOutputByteBufferNano.A(3, rankingExtra.picToVideo);
            List<String> list2 = rankingExtra.presetTexts;
            if (list2 != null) {
                codedOutputByteBufferNano.K(4, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(5, rankingExtra.presetTextsIndex);
        }
    };
    public static JsonAdapter<RankingExtra> JSON_ADAPTER = new ObjectJsonAdapter<RankingExtra>() { // from class: com.p1.mobile.putong.feed.data.RankingExtra.2
        public Class getDataClass() {
            return RankingExtra.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public RankingExtra mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RankingExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RankingExtra) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m1817b(String str) {
        return str;
    }

    public static RankingExtra new_() {
        RankingExtra rankingExtra = new RankingExtra();
        rankingExtra.nullCheck();
        return rankingExtra;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public RankingExtra m19734clone() {
        RankingExtra rankingExtra = new RankingExtra();
        List<RankingTag> list = this.tags;
        if (list != null) {
            rankingExtra.tags = ValueObject.util_map(list, new w9j() { // from class: l.pcc0
                public final Object call(Object obj) {
                    return ((RankingTag) obj).m19737clone();
                }
            });
        }
        rankingExtra.showRedpacketIcon = this.showRedpacketIcon;
        rankingExtra.picToVideo = this.picToVideo;
        List<String> list2 = this.presetTexts;
        if (list2 != null) {
            rankingExtra.presetTexts = ValueObject.util_map(list2, new w9j() { // from class: l.rcc0
                public final Object call(Object obj) {
                    return RankingExtra.m1817b((String) obj);
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        List<RankingTag> list = this.tags;
        int iHashCode = (((((i2 + (list != null ? list.hashCode() : 0)) * 41) + (this.showRedpacketIcon ? 1231 : 1237)) * 41) + (this.picToVideo ? 1231 : 1237)) * 41;
        List<String> list2 = this.presetTexts;
        int iHashCode2 = ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41) + this.presetTextsIndex;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.presetTexts == null) {
            this.presetTexts = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
