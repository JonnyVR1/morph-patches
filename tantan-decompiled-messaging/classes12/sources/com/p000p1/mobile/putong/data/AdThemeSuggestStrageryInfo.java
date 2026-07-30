package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.AdThemeSuggestStrageryInfo;
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
import java.util.List;
import l.nb5;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AdThemeSuggestStrageryInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "adthemesuggeststrageryinfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public String groupID;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> tags;
    public static ProtobufAdapter<AdThemeSuggestStrageryInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<AdThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.AdThemeSuggestStrageryInfo.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo) {
            List<String> list = adThemeSuggestStrageryInfo.tags;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = adThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            ((MessageNano) adThemeSuggestStrageryInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public AdThemeSuggestStrageryInfo m17659parse(nb5 nb5Var) throws IOException {
            AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (adThemeSuggestStrageryInfo.tags == null) {
                        adThemeSuggestStrageryInfo.tags = new ArrayList();
                    }
                    if (adThemeSuggestStrageryInfo.groupID != null) {
                        break;
                    }
                    adThemeSuggestStrageryInfo.groupID = "";
                    break;
                }
                if (iU == 10) {
                    adThemeSuggestStrageryInfo.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iU != 18) {
                        if (adThemeSuggestStrageryInfo.tags == null) {
                            adThemeSuggestStrageryInfo.tags = new ArrayList();
                        }
                        if (adThemeSuggestStrageryInfo.groupID != null) {
                            break;
                        }
                        adThemeSuggestStrageryInfo.groupID = "";
                        return adThemeSuggestStrageryInfo;
                    }
                    adThemeSuggestStrageryInfo.groupID = nb5Var.s();
                }
            }
            return adThemeSuggestStrageryInfo;
        }

        public void serialize(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = adThemeSuggestStrageryInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = adThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
        }
    };
    public static JsonAdapter<AdThemeSuggestStrageryInfo> JSON_ADAPTER = new ObjectJsonAdapter<AdThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.AdThemeSuggestStrageryInfo.2
        public Class getDataClass() {
            return AdThemeSuggestStrageryInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public AdThemeSuggestStrageryInfo mo17830newInstance() {
            return new AdThemeSuggestStrageryInfo();
        }

        public boolean parseField(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("tags")) {
                adThemeSuggestStrageryInfo.tags = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals("groupID")) {
                return false;
            }
            adThemeSuggestStrageryInfo.groupID = jsonParser.getValueAsString();
            return true;
        }

        public boolean parseFieldCheck(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("tags") || str.equals("groupID")) {
                return true;
            }
            return super.parseFieldCheck(adThemeSuggestStrageryInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo, JsonGenerator jsonGenerator) throws IOException {
            if (adThemeSuggestStrageryInfo.tags != null) {
                jsonGenerator.writeFieldName("tags");
                JsonAdapter.serializeArray(adThemeSuggestStrageryInfo.tags, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = adThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                jsonGenerator.writeStringField("groupID", str);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m563a(String str) {
        return str;
    }

    public static AdThemeSuggestStrageryInfo new_() {
        AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
        adThemeSuggestStrageryInfo.nullCheck();
        return adThemeSuggestStrageryInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public AdThemeSuggestStrageryInfo m17658clone() {
        AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
        List<String> list = this.tags;
        if (list != null) {
            adThemeSuggestStrageryInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.b80
                public final Object call(Object obj) {
                    return AdThemeSuggestStrageryInfo.m563a((String) obj);
                }
            });
        }
        adThemeSuggestStrageryInfo.groupID = this.groupID;
        return adThemeSuggestStrageryInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdThemeSuggestStrageryInfo)) {
            return false;
        }
        AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = (AdThemeSuggestStrageryInfo) obj;
        return ValueObject.util_equals(this.tags, adThemeSuggestStrageryInfo.tags) && ValueObject.util_equals(this.groupID, adThemeSuggestStrageryInfo.groupID);
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
        List<String> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.groupID;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.groupID == null) {
            this.groupID = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
