package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.ExtraInfos;
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
public class ExtraInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extrainfos";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> trialLikedAvatars;

    @ProtobufIndex(index = 1)
    public int trialLikedCount;
    public static ProtobufAdapter<ExtraInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtraInfos>() { // from class: com.p1.mobile.putong.core.data.ExtraInfos.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(ExtraInfos extraInfos) {
            int iH = CodedOutputByteBufferNano.h(1, extraInfos.trialLikedCount);
            List<String> list = extraInfos.trialLikedAvatars;
            if (list != null) {
                iH += CodedOutputByteBufferNano.l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            ((MessageNano) extraInfos).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public ExtraInfos m12685parse(nb5 nb5Var) throws IOException {
            ExtraInfos extraInfos = new ExtraInfos();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (extraInfos.trialLikedAvatars != null) {
                        break;
                    }
                    extraInfos.trialLikedAvatars = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    extraInfos.trialLikedCount = nb5Var.j();
                } else {
                    if (iU != 18) {
                        if (extraInfos.trialLikedAvatars != null) {
                            break;
                        }
                        extraInfos.trialLikedAvatars = new ArrayList();
                        return extraInfos;
                    }
                    extraInfos.trialLikedAvatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return extraInfos;
        }

        public void serialize(ExtraInfos extraInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.G(1, extraInfos.trialLikedCount);
            List<String> list = extraInfos.trialLikedAvatars;
            if (list != null) {
                codedOutputByteBufferNano.K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ExtraInfos> JSON_ADAPTER = new ObjectJsonAdapter<ExtraInfos>() { // from class: com.p1.mobile.putong.core.data.ExtraInfos.2
        public Class getDataClass() {
            return ExtraInfos.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public ExtraInfos m12686newInstance() {
            return new ExtraInfos();
        }

        public boolean parseField(ExtraInfos extraInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("trialLikedAvatars")) {
                extraInfos.trialLikedAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("trialLikedCount")) {
                return false;
            }
            extraInfos.trialLikedCount = jsonParser.getValueAsInt();
            return true;
        }

        public boolean parseFieldCheck(ExtraInfos extraInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("trialLikedAvatars") || str.equals("trialLikedCount")) {
                return true;
            }
            return super.parseFieldCheck(extraInfos, str, jsonParser, str2, arrayList, dataChecker);
        }

        public void serializeFields(ExtraInfos extraInfos, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trialLikedCount", extraInfos.trialLikedCount);
            if (extraInfos.trialLikedAvatars != null) {
                jsonGenerator.writeFieldName("trialLikedAvatars");
                JsonAdapter.serializeArray(extraInfos.trialLikedAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtraInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtraInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m320a(String str) {
        return str;
    }

    public static ExtraInfos new_() {
        ExtraInfos extraInfos = new ExtraInfos();
        extraInfos.nullCheck();
        return extraInfos;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ExtraInfos m12684clone() {
        ExtraInfos extraInfos = new ExtraInfos();
        extraInfos.trialLikedCount = this.trialLikedCount;
        List<String> list = this.trialLikedAvatars;
        if (list != null) {
            extraInfos.trialLikedAvatars = ValueObject.util_map(list, new w9j() { // from class: l.pqf
                public final Object call(Object obj) {
                    return ExtraInfos.m320a((String) obj);
                }
            });
        }
        return extraInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExtraInfos)) {
            return false;
        }
        ExtraInfos extraInfos = (ExtraInfos) obj;
        return this.trialLikedCount == extraInfos.trialLikedCount && ValueObject.util_equals(this.trialLikedAvatars, extraInfos.trialLikedAvatars);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.trialLikedCount) * 41;
        List<String> list = this.trialLikedAvatars;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public void nullCheck() {
        if (this.trialLikedAvatars == null) {
            this.trialLikedAvatars = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
