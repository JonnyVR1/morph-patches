package com.p051p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.core.data.ExtraInfos;
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
import java.util.List;
import p153l.nc5;
import p153l.qcj;

/* JADX INFO: loaded from: classes10.dex */
public class ExtraInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "extrainfos";

    @NonNull
    @ProtobufIndex(index = 2)
    public List<String> trialLikedAvatars;

    @ProtobufIndex(index = 1)
    public int trialLikedCount;
    public static ProtobufAdapter<ExtraInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExtraInfos>() { // from class: com.p1.mobile.putong.core.data.ExtraInfos.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExtraInfos extraInfos) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, extraInfos.trialLikedCount);
            List<String> list = extraInfos.trialLikedAvatars;
            if (list != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            extraInfos.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExtraInfos parse(nc5 nc5Var) throws IOException {
            ExtraInfos extraInfos = new ExtraInfos();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (extraInfos.trialLikedAvatars != null) {
                        break;
                    }
                    extraInfos.trialLikedAvatars = new ArrayList();
                    break;
                }
                if (iM162497u == 8) {
                    extraInfos.trialLikedCount = nc5Var.m162486j();
                } else {
                    if (iM162497u != 18) {
                        if (extraInfos.trialLikedAvatars != null) {
                            break;
                        }
                        extraInfos.trialLikedAvatars = new ArrayList();
                        return extraInfos;
                    }
                    extraInfos.trialLikedAvatars = (List) nc5Var.m162488l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                }
            }
            return extraInfos;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExtraInfos extraInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, extraInfos.trialLikedCount);
            List<String> list = extraInfos.trialLikedAvatars;
            if (list != null) {
                codedOutputByteBufferNano.m17309K(2, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
        }
    };
    public static JsonAdapter<ExtraInfos> JSON_ADAPTER = new ObjectJsonAdapter<ExtraInfos>() { // from class: com.p1.mobile.putong.core.data.ExtraInfos.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExtraInfos.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExtraInfos newInstance() {
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExtraInfos extraInfos, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("trialLikedCount", extraInfos.trialLikedCount);
            if (extraInfos.trialLikedAvatars != null) {
                jsonGenerator.writeFieldName("trialLikedAvatars");
                JsonAdapter.serializeArray(extraInfos.trialLikedAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExtraInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExtraInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m36521a(String str) {
        return str;
    }

    public static ExtraInfos new_() {
        ExtraInfos extraInfos = new ExtraInfos();
        extraInfos.nullCheck();
        return extraInfos;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExtraInfos mo225055clone() {
        ExtraInfos extraInfos = new ExtraInfos();
        extraInfos.trialLikedCount = this.trialLikedCount;
        List<String> list = this.trialLikedAvatars;
        if (list != null) {
            extraInfos.trialLikedAvatars = ValueObject.util_map(list, new qcj() { // from class: l.wrf
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ExtraInfos.m36521a((String) obj);
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = ((i * 41) + this.trialLikedCount) * 41;
        List<String> list = this.trialLikedAvatars;
        int iHashCode = i2 + (list != null ? list.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.trialLikedAvatars == null) {
            this.trialLikedAvatars = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
