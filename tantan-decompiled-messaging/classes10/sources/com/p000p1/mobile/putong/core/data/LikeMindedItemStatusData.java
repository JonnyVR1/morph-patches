package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
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
import l.nb5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LikeMindedItemStatusData extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "likemindeditemstatusdata";

    @NonNull
    @ProtobufIndex(index = 1)
    public String description;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subTitle;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String title;
    public static ProtobufAdapter<LikeMindedItemStatusData> PROTOBUF_ADAPTER = new MessageNanoAdapter<LikeMindedItemStatusData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemStatusData.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(LikeMindedItemStatusData likeMindedItemStatusData) {
            String str = likeMindedItemStatusData.description;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            ((MessageNano) likeMindedItemStatusData).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemStatusData m13859parse(nb5 nb5Var) throws IOException {
            LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (likeMindedItemStatusData.description == null) {
                        likeMindedItemStatusData.description = "";
                    }
                    if (likeMindedItemStatusData.subTitle == null) {
                        likeMindedItemStatusData.subTitle = "";
                    }
                    if (likeMindedItemStatusData.title == null) {
                        likeMindedItemStatusData.title = "";
                    }
                    if (likeMindedItemStatusData.icon != null) {
                        break;
                    }
                    likeMindedItemStatusData.icon = "";
                    break;
                }
                if (iU == 10) {
                    likeMindedItemStatusData.description = nb5Var.s();
                } else if (iU == 18) {
                    likeMindedItemStatusData.subTitle = nb5Var.s();
                } else if (iU == 26) {
                    likeMindedItemStatusData.title = nb5Var.s();
                } else {
                    if (iU != 34) {
                        if (likeMindedItemStatusData.description == null) {
                            likeMindedItemStatusData.description = "";
                        }
                        if (likeMindedItemStatusData.subTitle == null) {
                            likeMindedItemStatusData.subTitle = "";
                        }
                        if (likeMindedItemStatusData.title == null) {
                            likeMindedItemStatusData.title = "";
                        }
                        if (likeMindedItemStatusData.icon != null) {
                            break;
                        }
                        likeMindedItemStatusData.icon = "";
                        return likeMindedItemStatusData;
                    }
                    likeMindedItemStatusData.icon = nb5Var.s();
                }
            }
            return likeMindedItemStatusData;
        }

        public void serialize(LikeMindedItemStatusData likeMindedItemStatusData, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = likeMindedItemStatusData.description;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
        }
    };
    public static JsonAdapter<LikeMindedItemStatusData> JSON_ADAPTER = new ObjectJsonAdapter<LikeMindedItemStatusData>() { // from class: com.p1.mobile.putong.core.data.LikeMindedItemStatusData.2
        public Class getDataClass() {
            return LikeMindedItemStatusData.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public LikeMindedItemStatusData m13860newInstance() {
            return new LikeMindedItemStatusData();
        }

        public boolean parseField(LikeMindedItemStatusData likeMindedItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "subTitle":
                    likeMindedItemStatusData.subTitle = jsonParser.getValueAsString();
                    return true;
                case "description":
                    likeMindedItemStatusData.description = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    likeMindedItemStatusData.icon = jsonParser.getValueAsString();
                    return true;
                case "title":
                    likeMindedItemStatusData.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(LikeMindedItemStatusData likeMindedItemStatusData, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "subTitle":
                case "description":
                case "icon":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(likeMindedItemStatusData, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(LikeMindedItemStatusData likeMindedItemStatusData, JsonGenerator jsonGenerator) throws IOException {
            String str = likeMindedItemStatusData.description;
            if (str != null) {
                jsonGenerator.writeStringField("description", str);
            }
            String str2 = likeMindedItemStatusData.subTitle;
            if (str2 != null) {
                jsonGenerator.writeStringField("subTitle", str2);
            }
            String str3 = likeMindedItemStatusData.title;
            if (str3 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str3);
            }
            String str4 = likeMindedItemStatusData.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str4);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((LikeMindedItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((LikeMindedItemStatusData) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static LikeMindedItemStatusData new_() {
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.nullCheck();
        return likeMindedItemStatusData;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public LikeMindedItemStatusData m13858clone() {
        LikeMindedItemStatusData likeMindedItemStatusData = new LikeMindedItemStatusData();
        likeMindedItemStatusData.description = this.description;
        likeMindedItemStatusData.subTitle = this.subTitle;
        likeMindedItemStatusData.title = this.title;
        likeMindedItemStatusData.icon = this.icon;
        return likeMindedItemStatusData;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LikeMindedItemStatusData)) {
            return false;
        }
        LikeMindedItemStatusData likeMindedItemStatusData = (LikeMindedItemStatusData) obj;
        return ValueObject.util_equals(this.description, likeMindedItemStatusData.description) && ValueObject.util_equals(this.subTitle, likeMindedItemStatusData.subTitle) && ValueObject.util_equals(this.title, likeMindedItemStatusData.title) && ValueObject.util_equals(this.icon, likeMindedItemStatusData.icon);
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
        String str = this.description;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode4;
        return iHashCode4;
    }

    public void nullCheck() {
        if (this.description == null) {
            this.description = "";
        }
        if (this.subTitle == null) {
            this.subTitle = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
