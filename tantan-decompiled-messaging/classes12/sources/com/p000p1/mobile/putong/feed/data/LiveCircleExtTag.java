package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveCircleExtTag extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "livecircleexttag";

    @NonNull
    @ProtobufIndex(index = 1)
    public String tagName;

    @NonNull
    @ProtobufIndex(index = 2)
    public String tagUrl;
    public static ProtobufAdapter<LiveCircleExtTag> PROTOBUF_ADAPTER = new MessageNanoAdapter<LiveCircleExtTag>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtTag.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LiveCircleExtTag liveCircleExtTag) {
            String str = liveCircleExtTag.tagName;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            ((MessageNano) liveCircleExtTag).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LiveCircleExtTag m19551parse(nb5 nb5Var) throws IOException {
            LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (liveCircleExtTag.tagName == null) {
                        liveCircleExtTag.tagName = "";
                    }
                    if (liveCircleExtTag.tagUrl != null) {
                        break;
                    }
                    liveCircleExtTag.tagUrl = "";
                    break;
                }
                if (iU == 10) {
                    liveCircleExtTag.tagName = nb5Var.s();
                } else {
                    if (iU != 18) {
                        if (liveCircleExtTag.tagName == null) {
                            liveCircleExtTag.tagName = "";
                        }
                        if (liveCircleExtTag.tagUrl != null) {
                            break;
                        }
                        liveCircleExtTag.tagUrl = "";
                        return liveCircleExtTag;
                    }
                    liveCircleExtTag.tagUrl = nb5Var.s();
                }
            }
            return liveCircleExtTag;
        }

        public void serialize(LiveCircleExtTag liveCircleExtTag, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = liveCircleExtTag.tagName;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
        }
    };
    public static JsonAdapter<LiveCircleExtTag> JSON_ADAPTER = new ObjectJsonAdapter<LiveCircleExtTag>() { // from class: com.p1.mobile.putong.feed.data.LiveCircleExtTag.2
        public Class getDataClass() {
            return LiveCircleExtTag.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public LiveCircleExtTag mo17830newInstance() {
            return new LiveCircleExtTag();
        }

        public boolean parseField(LiveCircleExtTag liveCircleExtTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tagName")) {
                liveCircleExtTag.tagName = jsonParser.getValueAsString();
                return true;
            }
            if (!str.equals("tagUrl")) {
                return false;
            }
            liveCircleExtTag.tagUrl = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(LiveCircleExtTag liveCircleExtTag, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tagName") || str.equals("tagUrl")) {
                return true;
            }
            return super.parseFieldCheck(liveCircleExtTag, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(LiveCircleExtTag liveCircleExtTag, JsonGenerator jsonGenerator) throws IOException {
            String str = liveCircleExtTag.tagName;
            if (str != null) {
                jsonGenerator.writeStringField("tagName", str);
            }
            String str2 = liveCircleExtTag.tagUrl;
            if (str2 != null) {
                jsonGenerator.writeStringField("tagUrl", str2);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LiveCircleExtTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LiveCircleExtTag) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LiveCircleExtTag new_() {
        LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
        liveCircleExtTag.nullCheck();
        return liveCircleExtTag;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LiveCircleExtTag m19550clone() {
        LiveCircleExtTag liveCircleExtTag = new LiveCircleExtTag();
        liveCircleExtTag.tagName = this.tagName;
        liveCircleExtTag.tagUrl = this.tagUrl;
        return liveCircleExtTag;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveCircleExtTag)) {
            return false;
        }
        LiveCircleExtTag liveCircleExtTag = (LiveCircleExtTag) obj;
        return ValueObject.util_equals(this.tagName, liveCircleExtTag.tagName) && ValueObject.util_equals(this.tagUrl, liveCircleExtTag.tagUrl);
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
        String str = this.tagName;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.tagUrl;
        int iHashCode2 = iHashCode + (str2 != null ? str2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tagName == null) {
            this.tagName = "";
        }
        if (this.tagUrl == null) {
            this.tagUrl = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
