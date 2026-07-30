package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.IdealHighLightInfo;
import com.p1.mobile.putong.data.IdealTag;
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
public class IdealHighLightInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "idealhighlightinfo";

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> profile;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<IdealTag> tags;
    public static ProtobufAdapter<IdealHighLightInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<IdealHighLightInfo>() { // from class: com.p1.mobile.putong.core.data.IdealHighLightInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(IdealHighLightInfo idealHighLightInfo) {
            List<String> list = idealHighLightInfo.profile;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<IdealTag> list2 = idealHighLightInfo.tags;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) idealHighLightInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public IdealHighLightInfo m13413parse(nb5 nb5Var) throws IOException {
            IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (idealHighLightInfo.profile == null) {
                        idealHighLightInfo.profile = new ArrayList();
                    }
                    if (idealHighLightInfo.tags != null) {
                        break;
                    }
                    idealHighLightInfo.tags = new ArrayList();
                    break;
                }
                if (iU == 10) {
                    idealHighLightInfo.profile = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (idealHighLightInfo.profile == null) {
                            idealHighLightInfo.profile = new ArrayList();
                        }
                        if (idealHighLightInfo.tags != null) {
                            break;
                        }
                        idealHighLightInfo.tags = new ArrayList();
                        return idealHighLightInfo;
                    }
                    idealHighLightInfo.tags = (List) nb5Var.l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return idealHighLightInfo;
        }

        public void serialize(IdealHighLightInfo idealHighLightInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = idealHighLightInfo.profile;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list2 = idealHighLightInfo.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<IdealHighLightInfo> JSON_ADAPTER = new ObjectJsonAdapter<IdealHighLightInfo>() { // from class: com.p1.mobile.putong.core.data.IdealHighLightInfo.2
        public Class getDataClass() {
            return IdealHighLightInfo.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public IdealHighLightInfo m13414newInstance() {
            return new IdealHighLightInfo();
        }

        public boolean parseField(IdealHighLightInfo idealHighLightInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals(QuestionCategory.profile)) {
                idealHighLightInfo.profile = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("tags")) {
                return false;
            }
            idealHighLightInfo.tags = JsonAdapter.parseArray(jsonParser, IdealTag.JSON_ADAPTER, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(IdealHighLightInfo idealHighLightInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals(QuestionCategory.profile) || str.equals("tags")) {
                return true;
            }
            return super.parseFieldCheck(idealHighLightInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(IdealHighLightInfo idealHighLightInfo, JsonGenerator jsonGenerator) throws IOException {
            if (idealHighLightInfo.profile != null) {
                jsonGenerator.writeFieldName(QuestionCategory.profile);
                JsonAdapter.serializeArray(idealHighLightInfo.profile, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (idealHighLightInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(idealHighLightInfo.tags, jsonGenerator, IdealTag.JSON_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((IdealHighLightInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((IdealHighLightInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m398b(String str) {
        return str;
    }

    public static IdealHighLightInfo new_() {
        IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
        idealHighLightInfo.nullCheck();
        return idealHighLightInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public IdealHighLightInfo m13412clone() {
        IdealHighLightInfo idealHighLightInfo = new IdealHighLightInfo();
        List<String> list = this.profile;
        if (list != null) {
            idealHighLightInfo.profile = ValueObject.util_map(list, new w9j() { // from class: l.nbm
                public final Object call(Object obj) {
                    return IdealHighLightInfo.m398b((String) obj);
                }
            });
        }
        List<IdealTag> list2 = this.tags;
        if (list2 != null) {
            idealHighLightInfo.tags = ValueObject.util_map(list2, new w9j() { // from class: l.obm
                public final Object call(Object obj) {
                    return ((IdealTag) obj).clone();
                }
            });
        }
        return idealHighLightInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdealHighLightInfo)) {
            return false;
        }
        IdealHighLightInfo idealHighLightInfo = (IdealHighLightInfo) obj;
        return ValueObject.util_equals(this.profile, idealHighLightInfo.profile) && ValueObject.util_equals(this.tags, idealHighLightInfo.tags);
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
        List<String> list = this.profile;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<IdealTag> list2 = this.tags;
        int iHashCode2 = iHashCode + (list2 != null ? list2.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.profile == null) {
            this.profile = new ArrayList();
        }
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
