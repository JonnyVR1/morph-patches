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
public class SeeInfos extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "seeinfos";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String icon;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String type;

    @NonNull
    @ProtobufIndex(index = 1)
    public String userId;
    public static ProtobufAdapter<SeeInfos> PROTOBUF_ADAPTER = new MessageNanoAdapter<SeeInfos>() { // from class: com.p1.mobile.putong.core.data.SeeInfos.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(SeeInfos seeInfos) {
            String str = seeInfos.userId;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = seeInfos.type;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            ((MessageNano) seeInfos).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public SeeInfos m15515parse(nb5 nb5Var) throws IOException {
            SeeInfos seeInfos = new SeeInfos();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (seeInfos.userId == null) {
                        seeInfos.userId = "";
                    }
                    if (seeInfos.type == null) {
                        seeInfos.type = "";
                    }
                    if (seeInfos.icon != null) {
                        break;
                    }
                    seeInfos.icon = "";
                    break;
                }
                if (iU == 10) {
                    seeInfos.userId = nb5Var.s();
                } else if (iU == 18) {
                    seeInfos.type = nb5Var.s();
                } else {
                    if (iU != 26) {
                        if (seeInfos.userId == null) {
                            seeInfos.userId = "";
                        }
                        if (seeInfos.type == null) {
                            seeInfos.type = "";
                        }
                        if (seeInfos.icon != null) {
                            break;
                        }
                        seeInfos.icon = "";
                        return seeInfos;
                    }
                    seeInfos.icon = nb5Var.s();
                }
            }
            return seeInfos;
        }

        public void serialize(SeeInfos seeInfos, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = seeInfos.userId;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = seeInfos.type;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
        }
    };
    public static JsonAdapter<SeeInfos> JSON_ADAPTER = new ObjectJsonAdapter<SeeInfos>() { // from class: com.p1.mobile.putong.core.data.SeeInfos.2
        public Class getDataClass() {
            return SeeInfos.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public SeeInfos m15516newInstance() {
            return new SeeInfos();
        }

        public boolean parseField(SeeInfos seeInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "userId":
                    seeInfos.userId = jsonParser.getValueAsString();
                    return true;
                case "icon":
                    seeInfos.icon = jsonParser.getValueAsString();
                    return true;
                case "type":
                    seeInfos.type = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(SeeInfos seeInfos, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "userId":
                case "icon":
                case "type":
                    return true;
                default:
                    return super.parseFieldCheck(seeInfos, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(SeeInfos seeInfos, JsonGenerator jsonGenerator) throws IOException {
            String str = seeInfos.userId;
            if (str != null) {
                jsonGenerator.writeStringField("userId", str);
            }
            String str2 = seeInfos.type;
            if (str2 != null) {
                jsonGenerator.writeStringField("type", str2);
            }
            String str3 = seeInfos.icon;
            if (str3 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str3);
            }
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((SeeInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((SeeInfos) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static SeeInfos new_() {
        SeeInfos seeInfos = new SeeInfos();
        seeInfos.nullCheck();
        return seeInfos;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SeeInfos m15514clone() {
        SeeInfos seeInfos = new SeeInfos();
        seeInfos.userId = this.userId;
        seeInfos.type = this.type;
        seeInfos.icon = this.icon;
        return seeInfos;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeeInfos)) {
            return false;
        }
        SeeInfos seeInfos = (SeeInfos) obj;
        return ValueObject.util_equals(this.userId, seeInfos.userId) && ValueObject.util_equals(this.type, seeInfos.type) && ValueObject.util_equals(this.icon, seeInfos.icon);
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
        String str = this.userId;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.type;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.icon;
        int iHashCode3 = iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode3;
        return iHashCode3;
    }

    public void nullCheck() {
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.type == null) {
            this.type = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
