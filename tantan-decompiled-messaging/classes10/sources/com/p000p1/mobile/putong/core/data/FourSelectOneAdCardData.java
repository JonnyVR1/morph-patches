package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.FourSelectOneAdCardData;
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
public class FourSelectOneAdCardData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "fourselectoneadcarddata";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String adContent;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String adTitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> avatarList;

    @NonNull
    @ProtobufIndex(index = 4)
    public String firstIds;
    public static ProtobufAdapter<FourSelectOneAdCardData> PROTOBUF_ADAPTER = new MessageNanoAdapter<FourSelectOneAdCardData>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(FourSelectOneAdCardData fourSelectOneAdCardData) {
            List<String> list = fourSelectOneAdCardData.avatarList;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(4, str3);
            }
            ((MessageNano) fourSelectOneAdCardData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public FourSelectOneAdCardData m12817parse(nb5 nb5Var) throws IOException {
            FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (fourSelectOneAdCardData.avatarList == null) {
                        fourSelectOneAdCardData.avatarList = new ArrayList();
                    }
                    if (fourSelectOneAdCardData.adTitle == null) {
                        fourSelectOneAdCardData.adTitle = "";
                    }
                    if (fourSelectOneAdCardData.adContent == null) {
                        fourSelectOneAdCardData.adContent = "";
                    }
                    if (fourSelectOneAdCardData.firstIds != null) {
                        break;
                    }
                    fourSelectOneAdCardData.firstIds = "";
                    break;
                }
                if (iU == 10) {
                    fourSelectOneAdCardData.avatarList = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    fourSelectOneAdCardData.adTitle = nb5Var.s();
                } else if (iU == 26) {
                    fourSelectOneAdCardData.adContent = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (fourSelectOneAdCardData.avatarList == null) {
                            fourSelectOneAdCardData.avatarList = new ArrayList();
                        }
                        if (fourSelectOneAdCardData.adTitle == null) {
                            fourSelectOneAdCardData.adTitle = "";
                        }
                        if (fourSelectOneAdCardData.adContent == null) {
                            fourSelectOneAdCardData.adContent = "";
                        }
                        if (fourSelectOneAdCardData.firstIds != null) {
                            break;
                        }
                        fourSelectOneAdCardData.firstIds = "";
                        return fourSelectOneAdCardData;
                    }
                    fourSelectOneAdCardData.firstIds = nb5Var.s();
                }
            }
            return fourSelectOneAdCardData;
        }

        public void serialize(FourSelectOneAdCardData fourSelectOneAdCardData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = fourSelectOneAdCardData.avatarList;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
        }
    };
    public static JsonAdapter<FourSelectOneAdCardData> JSON_ADAPTER = new ObjectJsonAdapter<FourSelectOneAdCardData>() { // from class: com.p1.mobile.putong.core.data.FourSelectOneAdCardData.2
        public Class getDataClass() {
            return FourSelectOneAdCardData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public FourSelectOneAdCardData m12818newInstance() {
            return new FourSelectOneAdCardData();
        }

        public boolean parseField(FourSelectOneAdCardData fourSelectOneAdCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "adTitle":
                    fourSelectOneAdCardData.adTitle = jsonParser.getValueAsString();
                    return true;
                case "firstIds":
                    fourSelectOneAdCardData.firstIds = jsonParser.getValueAsString();
                    return true;
                case "avatarList":
                    fourSelectOneAdCardData.avatarList = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "adContent":
                    fourSelectOneAdCardData.adContent = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(FourSelectOneAdCardData fourSelectOneAdCardData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "adTitle":
                case "firstIds":
                case "avatarList":
                case "adContent":
                    return true;
                default:
                    return super.parseFieldCheck(fourSelectOneAdCardData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(FourSelectOneAdCardData fourSelectOneAdCardData, JsonGenerator jsonGenerator) throws IOException {
            if (fourSelectOneAdCardData.avatarList != null) {
                jsonGenerator.writeFieldName("avatarList");
                JsonAdapter.serializeArray(fourSelectOneAdCardData.avatarList, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = fourSelectOneAdCardData.adTitle;
            if (str != null) {
                jsonGenerator.writeStringField("adTitle", str);
            }
            String str2 = fourSelectOneAdCardData.adContent;
            if (str2 != null) {
                jsonGenerator.writeStringField("adContent", str2);
            }
            String str3 = fourSelectOneAdCardData.firstIds;
            if (str3 != null) {
                jsonGenerator.writeStringField("firstIds", str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((FourSelectOneAdCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((FourSelectOneAdCardData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m335a(String str) {
        return str;
    }

    public static FourSelectOneAdCardData new_() {
        FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
        fourSelectOneAdCardData.nullCheck();
        return fourSelectOneAdCardData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FourSelectOneAdCardData m12816clone() {
        FourSelectOneAdCardData fourSelectOneAdCardData = new FourSelectOneAdCardData();
        List<String> list = this.avatarList;
        if (list != null) {
            fourSelectOneAdCardData.avatarList = ValueObject.util_map(list, new w9j() { // from class: l.i1j
                public final Object call(Object obj) {
                    return FourSelectOneAdCardData.m335a((String) obj);
                }
            });
        }
        fourSelectOneAdCardData.adTitle = this.adTitle;
        fourSelectOneAdCardData.adContent = this.adContent;
        fourSelectOneAdCardData.firstIds = this.firstIds;
        return fourSelectOneAdCardData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FourSelectOneAdCardData)) {
            return false;
        }
        FourSelectOneAdCardData fourSelectOneAdCardData = (FourSelectOneAdCardData) obj;
        return ValueObject.util_equals(this.avatarList, fourSelectOneAdCardData.avatarList) && ValueObject.util_equals(this.adTitle, fourSelectOneAdCardData.adTitle) && ValueObject.util_equals(this.adContent, fourSelectOneAdCardData.adContent) && ValueObject.util_equals(this.firstIds, fourSelectOneAdCardData.firstIds);
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
        List<String> list = this.avatarList;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.adTitle;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.adContent;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.firstIds;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.avatarList == null) {
            this.avatarList = new ArrayList();
        }
        if (this.adTitle == null) {
            this.adTitle = "";
        }
        if (this.adContent == null) {
            this.adContent = "";
        }
        if (this.firstIds == null) {
            this.firstIds = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
