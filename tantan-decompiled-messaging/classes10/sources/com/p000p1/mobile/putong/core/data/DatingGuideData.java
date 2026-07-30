package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.DatingGuideData;
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
public class DatingGuideData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "datingguidedata";

    @NonNull
    @ProtobufIndex(index = 4)
    public String button;

    @NonNull
    @ProtobufIndex(index = 7)
    public String buttonId;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String deeplink;

    @NonNull
    @ProtobufIndex(index = 6)
    public String pageId;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> pictures;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public List<String> subTitles;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public List<String> titles;
    public static ProtobufAdapter<DatingGuideData> PROTOBUF_ADAPTER = new MessageNanoAdapter<DatingGuideData>() { // from class: com.p1.mobile.putong.core.data.DatingGuideData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DatingGuideData datingGuideData) {
            List<String> list = datingGuideData.pictures;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            List<String> list2 = datingGuideData.titles;
            if (list2 != null) {
                iL += CodedOutputByteBufferNano.l(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = datingGuideData.subTitles;
            if (list3 != null) {
                iL += CodedOutputByteBufferNano.l(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = datingGuideData.button;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(4, str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                iL += CodedOutputByteBufferNano.o(5, str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                iL += CodedOutputByteBufferNano.o(6, str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                iL += CodedOutputByteBufferNano.o(7, str4);
            }
            ((MessageNano) datingGuideData).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DatingGuideData m12579parse(nb5 nb5Var) throws IOException {
            DatingGuideData datingGuideData = new DatingGuideData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (datingGuideData.pictures == null) {
                        datingGuideData.pictures = new ArrayList();
                    }
                    if (datingGuideData.titles == null) {
                        datingGuideData.titles = new ArrayList();
                    }
                    if (datingGuideData.subTitles == null) {
                        datingGuideData.subTitles = new ArrayList();
                    }
                    if (datingGuideData.button == null) {
                        datingGuideData.button = "";
                    }
                    if (datingGuideData.deeplink == null) {
                        datingGuideData.deeplink = "";
                    }
                    if (datingGuideData.pageId == null) {
                        datingGuideData.pageId = "";
                    }
                    if (datingGuideData.buttonId != null) {
                        break;
                    }
                    datingGuideData.buttonId = "";
                    break;
                }
                if (iU == 10) {
                    datingGuideData.pictures = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    datingGuideData.titles = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 26) {
                    datingGuideData.subTitles = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 34) {
                    datingGuideData.button = nb5Var.s();
                } else if (iU == 42) {
                    datingGuideData.deeplink = nb5Var.s();
                } else if (iU == 50) {
                    datingGuideData.pageId = nb5Var.s();
                } else {
                    if (iU != 58) {
                        if (datingGuideData.pictures == null) {
                            datingGuideData.pictures = new ArrayList();
                        }
                        if (datingGuideData.titles == null) {
                            datingGuideData.titles = new ArrayList();
                        }
                        if (datingGuideData.subTitles == null) {
                            datingGuideData.subTitles = new ArrayList();
                        }
                        if (datingGuideData.button == null) {
                            datingGuideData.button = "";
                        }
                        if (datingGuideData.deeplink == null) {
                            datingGuideData.deeplink = "";
                        }
                        if (datingGuideData.pageId == null) {
                            datingGuideData.pageId = "";
                        }
                        if (datingGuideData.buttonId != null) {
                            break;
                        }
                        datingGuideData.buttonId = "";
                        return datingGuideData;
                    }
                    datingGuideData.buttonId = nb5Var.s();
                }
            }
            return datingGuideData;
        }

        public void serialize(DatingGuideData datingGuideData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = datingGuideData.pictures;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = datingGuideData.titles;
            if (list2 != null) {
                codedOutputByteBufferNano.K(2, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list3 = datingGuideData.subTitles;
            if (list3 != null) {
                codedOutputByteBufferNano.K(3, list3, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = datingGuideData.button;
            if (str != null) {
                codedOutputByteBufferNano.R(4, str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                codedOutputByteBufferNano.R(5, str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                codedOutputByteBufferNano.R(6, str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                codedOutputByteBufferNano.R(7, str4);
            }
        }
    };
    public static JsonAdapter<DatingGuideData> JSON_ADAPTER = new ObjectJsonAdapter<DatingGuideData>() { // from class: com.p1.mobile.putong.core.data.DatingGuideData.2
        public Class getDataClass() {
            return DatingGuideData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public DatingGuideData m12580newInstance() {
            return new DatingGuideData();
        }

        public boolean parseField(DatingGuideData datingGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "button":
                    datingGuideData.button = jsonParser.getValueAsString();
                    return true;
                case "buttonId":
                    datingGuideData.buttonId = jsonParser.getValueAsString();
                    return true;
                case "pageId":
                    datingGuideData.pageId = jsonParser.getValueAsString();
                    return true;
                case "titles":
                    datingGuideData.titles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "pictures":
                    datingGuideData.pictures = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "subTitles":
                    datingGuideData.subTitles = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                case "deeplink":
                    datingGuideData.deeplink = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(DatingGuideData datingGuideData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "button":
                case "buttonId":
                case "pageId":
                case "titles":
                case "pictures":
                case "subTitles":
                case "deeplink":
                    return true;
                default:
                    return super.parseFieldCheck(datingGuideData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(DatingGuideData datingGuideData, JsonGenerator jsonGenerator) throws IOException {
            if (datingGuideData.pictures != null) {
                jsonGenerator.writeFieldName("pictures");
                JsonAdapter.serializeArray(datingGuideData.pictures, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (datingGuideData.titles != null) {
                jsonGenerator.writeFieldName("titles");
                JsonAdapter.serializeArray(datingGuideData.titles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            if (datingGuideData.subTitles != null) {
                jsonGenerator.writeFieldName("subTitles");
                JsonAdapter.serializeArray(datingGuideData.subTitles, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = datingGuideData.button;
            if (str != null) {
                jsonGenerator.writeStringField(Button.TYPE, str);
            }
            String str2 = datingGuideData.deeplink;
            if (str2 != null) {
                jsonGenerator.writeStringField("deeplink", str2);
            }
            String str3 = datingGuideData.pageId;
            if (str3 != null) {
                jsonGenerator.writeStringField("pageId", str3);
            }
            String str4 = datingGuideData.buttonId;
            if (str4 != null) {
                jsonGenerator.writeStringField("buttonId", str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((DatingGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((DatingGuideData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m301a(String str) {
        return str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m302b(String str) {
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m303c(String str) {
        return str;
    }

    public static DatingGuideData new_() {
        DatingGuideData datingGuideData = new DatingGuideData();
        datingGuideData.nullCheck();
        return datingGuideData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DatingGuideData m12578clone() {
        DatingGuideData datingGuideData = new DatingGuideData();
        List<String> list = this.pictures;
        if (list != null) {
            datingGuideData.pictures = ValueObject.util_map(list, new w9j() { // from class: l.p7c
                public final Object call(Object obj) {
                    return DatingGuideData.m301a((String) obj);
                }
            });
        }
        List<String> list2 = this.titles;
        if (list2 != null) {
            datingGuideData.titles = ValueObject.util_map(list2, new w9j() { // from class: l.q7c
                public final Object call(Object obj) {
                    return DatingGuideData.m302b((String) obj);
                }
            });
        }
        List<String> list3 = this.subTitles;
        if (list3 != null) {
            datingGuideData.subTitles = ValueObject.util_map(list3, new w9j() { // from class: l.r7c
                public final Object call(Object obj) {
                    return DatingGuideData.m303c((String) obj);
                }
            });
        }
        datingGuideData.button = this.button;
        datingGuideData.deeplink = this.deeplink;
        datingGuideData.pageId = this.pageId;
        datingGuideData.buttonId = this.buttonId;
        return datingGuideData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DatingGuideData)) {
            return false;
        }
        DatingGuideData datingGuideData = (DatingGuideData) obj;
        return ValueObject.util_equals(this.pictures, datingGuideData.pictures) && ValueObject.util_equals(this.titles, datingGuideData.titles) && ValueObject.util_equals(this.subTitles, datingGuideData.subTitles) && ValueObject.util_equals(this.button, datingGuideData.button) && ValueObject.util_equals(this.deeplink, datingGuideData.deeplink) && ValueObject.util_equals(this.pageId, datingGuideData.pageId) && ValueObject.util_equals(this.buttonId, datingGuideData.buttonId);
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
        List<String> list = this.pictures;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        List<String> list2 = this.titles;
        int iHashCode2 = (iHashCode + (list2 != null ? list2.hashCode() : 0)) * 41;
        List<String> list3 = this.subTitles;
        int iHashCode3 = (iHashCode2 + (list3 != null ? list3.hashCode() : 0)) * 41;
        String str = this.button;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.deeplink;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.pageId;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.buttonId;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        if (this.pictures == null) {
            this.pictures = new ArrayList();
        }
        if (this.titles == null) {
            this.titles = new ArrayList();
        }
        if (this.subTitles == null) {
            this.subTitles = new ArrayList();
        }
        if (this.button == null) {
            this.button = "";
        }
        if (this.deeplink == null) {
            this.deeplink = "";
        }
        if (this.pageId == null) {
            this.pageId = "";
        }
        if (this.buttonId == null) {
            this.buttonId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
