package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.p000p1.mobile.putong.feed.data.LiveCircleExtTag;
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
public class LiveCircleExtInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecircleextinfo";

    @NonNull
    @ProtobufIndex(index = 3)
    public String coverUrl;

    @ProtobufIndex(index = 2)
    public int grade;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f686id;

    @NonNull
    @ProtobufIndex(index = 4)
    public List<LiveCircleExtTag> tags;

    @ProtobufIndex(index = 5)
    public int views;
    public static ProtobufAdapter<LiveCircleExtInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleExtInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveCircleExtInfo liveCircleExtInfo) {
            String str = liveCircleExtInfo.f686id;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.h(2, liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            List<LiveCircleExtTag> list = liveCircleExtInfo.tags;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(4, list, LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            int iH = iO + CodedOutputByteBufferNano.h(5, liveCircleExtInfo.views);
            ((MessageNano) liveCircleExtInfo).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveCircleExtInfo m19548parse(nb5 nb5Var) throws IOException {
            LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveCircleExtInfo.f686id == null) {
                        liveCircleExtInfo.f686id = "";
                    }
                    if (liveCircleExtInfo.coverUrl == null) {
                        liveCircleExtInfo.coverUrl = "";
                    }
                    if (liveCircleExtInfo.tags != null) {
                        break;
                    }
                    liveCircleExtInfo.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    liveCircleExtInfo.f686id = nb5Var.s();
                } else if (iU == 16) {
                    liveCircleExtInfo.grade = nb5Var.j();
                } else if (iU == 26) {
                    liveCircleExtInfo.coverUrl = nb5Var.s();
                } else if (iU == 34) {
                    liveCircleExtInfo.tags = (List) nb5Var.l(LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 40) {
                        if (liveCircleExtInfo.f686id == null) {
                            liveCircleExtInfo.f686id = "";
                        }
                        if (liveCircleExtInfo.coverUrl == null) {
                            liveCircleExtInfo.coverUrl = "";
                        }
                        if (liveCircleExtInfo.tags != null) {
                            break;
                        }
                        liveCircleExtInfo.tags = new ArrayList();
                        return liveCircleExtInfo;
                    }
                    liveCircleExtInfo.views = nb5Var.j();
                }
            }
            return liveCircleExtInfo;
        }

        public void serialize(LiveCircleExtInfo liveCircleExtInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleExtInfo.f686id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.G(2, liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            List<LiveCircleExtTag> list = liveCircleExtInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(4, list, LiveCircleExtTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            codedOutputByteBufferNano.G(5, liveCircleExtInfo.views);
        }
    };
    public static JsonAdapter<LiveCircleExtInfo> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleExtInfo>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtInfo.2
        public Class getDataClass() {
            return LiveCircleExtInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveCircleExtInfo mo17830newInstance() {
            return new LiveCircleExtInfo();
        }

        public boolean parseField(LiveCircleExtInfo liveCircleExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "coverUrl":
                    liveCircleExtInfo.coverUrl = jsonParser.getValueAsString();
                    return true;
                case "id":
                    liveCircleExtInfo.f686id = jsonParser.getValueAsString();
                    return false;
                case "tags":
                    liveCircleExtInfo.tags = JsonAdapter.parseArray(jsonParser, LiveCircleExtTag.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "grade":
                    liveCircleExtInfo.grade = jsonParser.getValueAsInt();
                    return true;
                case "views":
                    liveCircleExtInfo.views = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LiveCircleExtInfo liveCircleExtInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "coverUrl":
                    return true;
                case "id":
                    return false;
                case "tags":
                case "grade":
                case "views":
                    return true;
                default:
                    return super.parseFieldCheck(liveCircleExtInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleExtInfo liveCircleExtInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleExtInfo.f686id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            jsonGenerator.writeNumberField("grade", liveCircleExtInfo.grade);
            String str2 = liveCircleExtInfo.coverUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("coverUrl", str2);
            }
            if (liveCircleExtInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(liveCircleExtInfo.tags, jsonGenerator, LiveCircleExtTag.JSON_ADAPTER);
            }
            jsonGenerator.writeNumberField("views", liveCircleExtInfo.views);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleExtInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleExtInfo new_() {
        LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
        liveCircleExtInfo.nullCheck();
        return liveCircleExtInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveCircleExtInfo m19547clone() {
        LiveCircleExtInfo liveCircleExtInfo = new LiveCircleExtInfo();
        liveCircleExtInfo.f686id = this.f686id;
        liveCircleExtInfo.grade = this.grade;
        liveCircleExtInfo.coverUrl = this.coverUrl;
        List<LiveCircleExtTag> list = this.tags;
        if (list != null) {
            liveCircleExtInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.y2s
                public final Object call(Object obj) {
                    return ((LiveCircleExtTag) obj).m19550clone();
                }
            });
        }
        liveCircleExtInfo.views = this.views;
        return liveCircleExtInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCircleExtInfo)) {
            return false;
        }
        LiveCircleExtInfo liveCircleExtInfo = (LiveCircleExtInfo) obj;
        return ValueObject.util_equals(this.f686id, liveCircleExtInfo.f686id) && this.grade == liveCircleExtInfo.grade && ValueObject.util_equals(this.coverUrl, liveCircleExtInfo.coverUrl) && ValueObject.util_equals(this.tags, liveCircleExtInfo.tags) && this.views == liveCircleExtInfo.views;
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
        String str = this.f686id;
        int iHashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 41) + this.grade) * 41;
        String str2 = this.coverUrl;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<LiveCircleExtTag> list = this.tags;
        int iHashCode3 = ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 41) + this.views;
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.f686id == null) {
            this.f686id = "";
        }
        if (this.coverUrl == null) {
            this.coverUrl = "";
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
