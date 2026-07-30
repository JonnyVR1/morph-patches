package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.MbtiInfo;
import com.p000p1.mobile.putong.core.data.MbtiMatchScore;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MbtiInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "mbtiinfo";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String character;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String desc;

    @NonNull
    @ProtobufIndex(index = 1)
    public String key;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public List<String> labels;

    @NonNull
    @ProtobufIndex(index = 6)
    public List<MbtiMatchScore> matchScores;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pic;
    public static ProtobufAdapter<MbtiInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<MbtiInfo>() { // from class: com.p1.mobile.putong.core.data.MbtiInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MbtiInfo mbtiInfo) {
            String str = mbtiInfo.key;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = mbtiInfo.character;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = mbtiInfo.desc;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = mbtiInfo.pic;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            List<String> list = mbtiInfo.labels;
            if (list != null) {
                iO += CodedOutputByteBufferNano.l(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MbtiMatchScore> list2 = mbtiInfo.matchScores;
            if (list2 != null) {
                iO += CodedOutputByteBufferNano.l(6, list2, MbtiMatchScore.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) mbtiInfo).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MbtiInfo m14097parse(nb5 nb5Var) throws IOException {
            MbtiInfo mbtiInfo = new MbtiInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (mbtiInfo.key == null) {
                        mbtiInfo.key = "";
                    }
                    if (mbtiInfo.character == null) {
                        mbtiInfo.character = "";
                    }
                    if (mbtiInfo.desc == null) {
                        mbtiInfo.desc = "";
                    }
                    if (mbtiInfo.pic == null) {
                        mbtiInfo.pic = "";
                    }
                    if (mbtiInfo.labels == null) {
                        mbtiInfo.labels = new ArrayList();
                    }
                    if (mbtiInfo.matchScores != null) {
                        break;
                    }
                    mbtiInfo.matchScores = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    mbtiInfo.key = nb5Var.s();
                } else if (iU == 18) {
                    mbtiInfo.character = nb5Var.s();
                } else if (iU == 26) {
                    mbtiInfo.desc = nb5Var.s();
                } else if (iU == 34) {
                    mbtiInfo.pic = nb5Var.s();
                } else if (iU == 42) {
                    mbtiInfo.labels = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 50) {
                        if (mbtiInfo.key == null) {
                            mbtiInfo.key = "";
                        }
                        if (mbtiInfo.character == null) {
                            mbtiInfo.character = "";
                        }
                        if (mbtiInfo.desc == null) {
                            mbtiInfo.desc = "";
                        }
                        if (mbtiInfo.pic == null) {
                            mbtiInfo.pic = "";
                        }
                        if (mbtiInfo.labels == null) {
                            mbtiInfo.labels = new ArrayList();
                        }
                        if (mbtiInfo.matchScores != null) {
                            break;
                        }
                        mbtiInfo.matchScores = new ArrayList();
                        return mbtiInfo;
                    }
                    mbtiInfo.matchScores = (List) nb5Var.l(MbtiMatchScore.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return mbtiInfo;
        }

        public void serialize(MbtiInfo mbtiInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = mbtiInfo.key;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = mbtiInfo.character;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = mbtiInfo.desc;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = mbtiInfo.pic;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            List<String> list = mbtiInfo.labels;
            if (list != null) {
                codedOutputByteBufferNano.K(5, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<MbtiMatchScore> list2 = mbtiInfo.matchScores;
            if (list2 != null) {
                codedOutputByteBufferNano.K(6, list2, MbtiMatchScore.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<MbtiInfo> JSON_ADAPTER = new ObjectJsonAdapter<MbtiInfo>() { // from class: com.p1.mobile.putong.core.data.MbtiInfo.2
        public Class getDataClass() {
            return MbtiInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public MbtiInfo m14098newInstance() {
            return new MbtiInfo();
        }

        public boolean parseField(MbtiInfo mbtiInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "labels":
                    mbtiInfo.labels = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "key":
                    mbtiInfo.key = jsonParser.getValueAsString();
                    return true;
                case "pic":
                    mbtiInfo.pic = jsonParser.getValueAsString();
                    return true;
                case "desc":
                    mbtiInfo.desc = jsonParser.getValueAsString();
                    return true;
                case "character":
                    mbtiInfo.character = jsonParser.getValueAsString();
                    return true;
                case "matchScores":
                    mbtiInfo.matchScores = JsonAdapter.parseArray(jsonParser, MbtiMatchScore.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MbtiInfo mbtiInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "labels":
                case "key":
                case "pic":
                case "desc":
                case "character":
                case "matchScores":
                    return true;
                default:
                    return super.parseFieldCheck(mbtiInfo, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(MbtiInfo mbtiInfo, JsonGenerator jsonGenerator) throws IOException {
            String str = mbtiInfo.key;
            if (str != null) {
                jsonGenerator.writeStringField("key", str);
            }
            String str2 = mbtiInfo.character;
            if (str2 != null) {
                jsonGenerator.writeStringField("character", str2);
            }
            String str3 = mbtiInfo.desc;
            if (str3 != null) {
                jsonGenerator.writeStringField("desc", str3);
            }
            String str4 = mbtiInfo.pic;
            if (str4 != null) {
                jsonGenerator.writeStringField("pic", str4);
            }
            if (mbtiInfo.labels != null) {
                jsonGenerator.writeFieldName("labels");
                JsonAdapter.serializeArray(mbtiInfo.labels, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (mbtiInfo.matchScores != null) {
                jsonGenerator.writeFieldName("matchScores");
                JsonAdapter.serializeArray(mbtiInfo.matchScores, jsonGenerator, MbtiMatchScore.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MbtiInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MbtiInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m464a(String str) {
        return str;
    }

    public static MbtiInfo new_() {
        MbtiInfo mbtiInfo = new MbtiInfo();
        mbtiInfo.nullCheck();
        return mbtiInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MbtiInfo m14096clone() {
        MbtiInfo mbtiInfo = new MbtiInfo();
        mbtiInfo.key = this.key;
        mbtiInfo.character = this.character;
        mbtiInfo.desc = this.desc;
        mbtiInfo.pic = this.pic;
        List<String> list = this.labels;
        if (list != null) {
            mbtiInfo.labels = ValueObject.util_map(list, new w9j() { // from class: l.wex
                public final Object call(Object obj) {
                    return MbtiInfo.m464a((String) obj);
                }
            });
        }
        List<MbtiMatchScore> list2 = this.matchScores;
        if (list2 != null) {
            mbtiInfo.matchScores = ValueObject.util_map(list2, new w9j() { // from class: l.xex
                public final Object call(Object obj) {
                    return ((MbtiMatchScore) obj).m14100clone();
                }
            });
        }
        return mbtiInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MbtiInfo)) {
            return false;
        }
        MbtiInfo mbtiInfo = (MbtiInfo) obj;
        return ValueObject.util_equals(this.key, mbtiInfo.key) && ValueObject.util_equals(this.character, mbtiInfo.character) && ValueObject.util_equals(this.desc, mbtiInfo.desc) && ValueObject.util_equals(this.pic, mbtiInfo.pic) && ValueObject.util_equals(this.labels, mbtiInfo.labels) && ValueObject.util_equals(this.matchScores, mbtiInfo.matchScores);
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
        String str = this.key;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.character;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pic;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        List<String> list = this.labels;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 41;
        List<MbtiMatchScore> list2 = this.matchScores;
        int iHashCode6 = iHashCode5 + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public void nullCheck() {
        if (this.key == null) {
            this.key = "";
        }
        if (this.character == null) {
            this.character = "";
        }
        if (this.desc == null) {
            this.desc = "";
        }
        if (this.pic == null) {
            this.pic = "";
        }
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.matchScores == null) {
            this.matchScores = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
