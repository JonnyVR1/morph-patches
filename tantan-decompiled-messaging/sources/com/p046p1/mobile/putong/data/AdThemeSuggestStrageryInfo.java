package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.AdThemeSuggestStrageryInfo;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.nb5;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo) {
            List<String> list = adThemeSuggestStrageryInfo.tags;
            int iM17230l = list != null ? CodedOutputByteBufferNano.m17230l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = adThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                iM17230l += CodedOutputByteBufferNano.m17233o(2, str);
            }
            adThemeSuggestStrageryInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public AdThemeSuggestStrageryInfo parse(nb5 nb5Var) throws IOException {
            AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (adThemeSuggestStrageryInfo.tags == null) {
                        adThemeSuggestStrageryInfo.tags = new ArrayList();
                    }
                    if (adThemeSuggestStrageryInfo.groupID != null) {
                        break;
                    }
                    adThemeSuggestStrageryInfo.groupID = "";
                    break;
                }
                if (iM158752u == 10) {
                    adThemeSuggestStrageryInfo.tags = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else {
                    if (iM158752u != 18) {
                        if (adThemeSuggestStrageryInfo.tags == null) {
                            adThemeSuggestStrageryInfo.tags = new ArrayList();
                        }
                        if (adThemeSuggestStrageryInfo.groupID != null) {
                            break;
                        }
                        adThemeSuggestStrageryInfo.groupID = "";
                        return adThemeSuggestStrageryInfo;
                    }
                    adThemeSuggestStrageryInfo.groupID = nb5Var.m158750s();
                }
            }
            return adThemeSuggestStrageryInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = adThemeSuggestStrageryInfo.tags;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = adThemeSuggestStrageryInfo.groupID;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
        }
    };
    public static JsonAdapter<AdThemeSuggestStrageryInfo> JSON_ADAPTER = new ObjectJsonAdapter<AdThemeSuggestStrageryInfo>() { // from class: com.p1.mobile.putong.data.AdThemeSuggestStrageryInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return AdThemeSuggestStrageryInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public AdThemeSuggestStrageryInfo newInstance() {
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((AdThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((AdThemeSuggestStrageryInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m59661a(String str) {
        return str;
    }

    public static AdThemeSuggestStrageryInfo new_() {
        AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
        adThemeSuggestStrageryInfo.nullCheck();
        return adThemeSuggestStrageryInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public AdThemeSuggestStrageryInfo mo223809clone() {
        AdThemeSuggestStrageryInfo adThemeSuggestStrageryInfo = new AdThemeSuggestStrageryInfo();
        List<String> list = this.tags;
        if (list != null) {
            adThemeSuggestStrageryInfo.tags = ValueObject.util_map(list, new w9j() { // from class: l.b80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return AdThemeSuggestStrageryInfo.m59661a((String) obj);
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
        List<String> list = this.tags;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.groupID;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.tags == null) {
            this.tags = new ArrayList();
        }
        if (this.groupID == null) {
            this.groupID = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
