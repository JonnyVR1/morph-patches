package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.core.data.PurposeItemData;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
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

/* JADX INFO: loaded from: classes10.dex */
public class PurposeItemData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "purposeitemdata";

    @NonNull
    @ProtobufIndex(index = 6)
    public List<String> enableRule;

    @NonNull
    @ProtobufIndex(index = 7)
    public String icon1;

    @NonNull
    @ProtobufIndex(index = 8)
    public String icon2;

    @NonNull
    @ProtobufIndex(index = 2)
    public String key;

    @NonNull
    @ProtobufIndex(index = 4)
    public String pic;

    @NonNull
    @ProtobufIndex(index = 3)
    public String picSelected;

    @NonNull
    @ProtobufIndex(index = 5)
    public String purposeReport;

    @NonNull
    @ProtobufIndex(index = 1)
    public String text;
    public static ProtobufAdapter<PurposeItemData> PROTOBUF_ADAPTER = new MessageNanoAdapter<PurposeItemData>() { // from class: com.p1.mobile.putong.core.data.PurposeItemData.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PurposeItemData purposeItemData) {
            String str = purposeItemData.text;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = purposeItemData.key;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = purposeItemData.picSelected;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = purposeItemData.pic;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = purposeItemData.purposeReport;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            List<String> list = purposeItemData.enableRule;
            if (list != null) {
                iM17233o += CodedOutputByteBufferNano.m17230l(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = purposeItemData.icon1;
            if (str6 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(7, str6);
            }
            String str7 = purposeItemData.icon2;
            if (str7 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(8, str7);
            }
            purposeItemData.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PurposeItemData parse(nb5 nb5Var) throws IOException {
            PurposeItemData purposeItemData = new PurposeItemData();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (purposeItemData.text == null) {
                        purposeItemData.text = "";
                    }
                    if (purposeItemData.key == null) {
                        purposeItemData.key = "";
                    }
                    if (purposeItemData.picSelected == null) {
                        purposeItemData.picSelected = "";
                    }
                    if (purposeItemData.pic == null) {
                        purposeItemData.pic = "";
                    }
                    if (purposeItemData.purposeReport == null) {
                        purposeItemData.purposeReport = "";
                    }
                    if (purposeItemData.enableRule == null) {
                        purposeItemData.enableRule = new ArrayList();
                    }
                    if (purposeItemData.icon1 == null) {
                        purposeItemData.icon1 = "";
                    }
                    if (purposeItemData.icon2 != null) {
                        break;
                    }
                    purposeItemData.icon2 = "";
                    break;
                }
                if (iM158752u == 10) {
                    purposeItemData.text = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    purposeItemData.key = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    purposeItemData.picSelected = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    purposeItemData.pic = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    purposeItemData.purposeReport = nb5Var.m158750s();
                } else if (iM158752u == 50) {
                    purposeItemData.enableRule = (List) nb5Var.m158743l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 58) {
                    purposeItemData.icon1 = nb5Var.m158750s();
                } else {
                    if (iM158752u != 66) {
                        if (purposeItemData.text == null) {
                            purposeItemData.text = "";
                        }
                        if (purposeItemData.key == null) {
                            purposeItemData.key = "";
                        }
                        if (purposeItemData.picSelected == null) {
                            purposeItemData.picSelected = "";
                        }
                        if (purposeItemData.pic == null) {
                            purposeItemData.pic = "";
                        }
                        if (purposeItemData.purposeReport == null) {
                            purposeItemData.purposeReport = "";
                        }
                        if (purposeItemData.enableRule == null) {
                            purposeItemData.enableRule = new ArrayList();
                        }
                        if (purposeItemData.icon1 == null) {
                            purposeItemData.icon1 = "";
                        }
                        if (purposeItemData.icon2 != null) {
                            break;
                        }
                        purposeItemData.icon2 = "";
                        return purposeItemData;
                    }
                    purposeItemData.icon2 = nb5Var.m158750s();
                }
            }
            return purposeItemData;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PurposeItemData purposeItemData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = purposeItemData.text;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = purposeItemData.key;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = purposeItemData.picSelected;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = purposeItemData.pic;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = purposeItemData.purposeReport;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            List<String> list = purposeItemData.enableRule;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(6, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str6 = purposeItemData.icon1;
            if (str6 != null) {
                codedOutputByteBufferNano.m17261R(7, str6);
            }
            String str7 = purposeItemData.icon2;
            if (str7 != null) {
                codedOutputByteBufferNano.m17261R(8, str7);
            }
        }
    };
    public static JsonAdapter<PurposeItemData> JSON_ADAPTER = new ObjectJsonAdapter<PurposeItemData>() { // from class: com.p1.mobile.putong.core.data.PurposeItemData.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PurposeItemData.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PurposeItemData newInstance() {
            return new PurposeItemData();
        }

        public boolean parseField(PurposeItemData purposeItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "picSelected":
                    purposeItemData.picSelected = jsonParser.getValueAsString();
                    return true;
                case "key":
                    purposeItemData.key = jsonParser.getValueAsString();
                    return true;
                case "pic":
                    purposeItemData.pic = jsonParser.getValueAsString();
                    return true;
                case "text":
                    purposeItemData.text = jsonParser.getValueAsString();
                    return true;
                case "icon1":
                    purposeItemData.icon1 = jsonParser.getValueAsString();
                    return true;
                case "icon2":
                    purposeItemData.icon2 = jsonParser.getValueAsString();
                    return true;
                case "purposeReport":
                    purposeItemData.purposeReport = jsonParser.getValueAsString();
                    return true;
                case "enableRule":
                    purposeItemData.enableRule = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PurposeItemData purposeItemData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "picSelected":
                case "key":
                case "pic":
                case "text":
                case "icon1":
                case "icon2":
                case "purposeReport":
                case "enableRule":
                    return true;
                default:
                    return super.parseFieldCheck(purposeItemData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PurposeItemData purposeItemData, JsonGenerator jsonGenerator) throws IOException {
            String str = purposeItemData.text;
            if (str != null) {
                jsonGenerator.writeStringField("text", str);
            }
            String str2 = purposeItemData.key;
            if (str2 != null) {
                jsonGenerator.writeStringField(Constants.KEY_KEY, str2);
            }
            String str3 = purposeItemData.picSelected;
            if (str3 != null) {
                jsonGenerator.writeStringField("picSelected", str3);
            }
            String str4 = purposeItemData.pic;
            if (str4 != null) {
                jsonGenerator.writeStringField(CreditScoreTaskType.pic, str4);
            }
            String str5 = purposeItemData.purposeReport;
            if (str5 != null) {
                jsonGenerator.writeStringField("purposeReport", str5);
            }
            if (purposeItemData.enableRule != null) {
                jsonGenerator.writeFieldName("enableRule");
                JsonAdapter.serializeArray(purposeItemData.enableRule, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str6 = purposeItemData.icon1;
            if (str6 != null) {
                jsonGenerator.writeStringField("icon1", str6);
            }
            String str7 = purposeItemData.icon2;
            if (str7 != null) {
                jsonGenerator.writeStringField("icon2", str7);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PurposeItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PurposeItemData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m35787a(String str) {
        return str;
    }

    public static PurposeItemData new_() {
        PurposeItemData purposeItemData = new PurposeItemData();
        purposeItemData.nullCheck();
        return purposeItemData;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PurposeItemData mo223809clone() {
        PurposeItemData purposeItemData = new PurposeItemData();
        purposeItemData.text = this.text;
        purposeItemData.key = this.key;
        purposeItemData.picSelected = this.picSelected;
        purposeItemData.pic = this.pic;
        purposeItemData.purposeReport = this.purposeReport;
        List<String> list = this.enableRule;
        if (list != null) {
            purposeItemData.enableRule = ValueObject.util_map(list, new w9j() { // from class: l.tcb0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PurposeItemData.m35787a((String) obj);
                }
            });
        }
        purposeItemData.icon1 = this.icon1;
        purposeItemData.icon2 = this.icon2;
        return purposeItemData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PurposeItemData)) {
            return false;
        }
        PurposeItemData purposeItemData = (PurposeItemData) obj;
        return ValueObject.util_equals(this.text, purposeItemData.text) && ValueObject.util_equals(this.key, purposeItemData.key) && ValueObject.util_equals(this.picSelected, purposeItemData.picSelected) && ValueObject.util_equals(this.pic, purposeItemData.pic) && ValueObject.util_equals(this.purposeReport, purposeItemData.purposeReport) && ValueObject.util_equals(this.enableRule, purposeItemData.enableRule) && ValueObject.util_equals(this.icon1, purposeItemData.icon1) && ValueObject.util_equals(this.icon2, purposeItemData.icon2);
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
        String str = this.text;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.picSelected;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.pic;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.purposeReport;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41;
        List<String> list = this.enableRule;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 41;
        String str6 = this.icon1;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 41;
        String str7 = this.icon2;
        int iHashCode8 = iHashCode7 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.text == null) {
            this.text = "";
        }
        if (this.key == null) {
            this.key = "";
        }
        if (this.picSelected == null) {
            this.picSelected = "";
        }
        if (this.pic == null) {
            this.pic = "";
        }
        if (this.purposeReport == null) {
            this.purposeReport = "";
        }
        if (this.enableRule == null) {
            this.enableRule = new ArrayList();
        }
        if (this.icon1 == null) {
            this.icon1 = "";
        }
        if (this.icon2 == null) {
            this.icon2 = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
