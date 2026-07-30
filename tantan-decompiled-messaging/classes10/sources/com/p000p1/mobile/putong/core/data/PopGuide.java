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
public class PopGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "popguide";

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public String guide;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f132id;

    @ProtobufIndex(index = 6)
    public long nextRequestTimestamp;

    @ProtobufIndex(index = 7)
    public int reason;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String title;

    @NonNull
    @ProtobufIndex(index = CoreStaticData.OldControllerType.UGLY_ALERT_FOR_BIG_FACE)
    public String userId;
    public static ProtobufAdapter<PopGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PopGuide>() { // from class: com.p1.mobile.putong.core.data.PopGuide.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PopGuide popGuide) {
            String str = popGuide.f132id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            String str2 = popGuide.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(2, str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(3, str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                iO += CodedOutputByteBufferNano.o(4, str4);
            }
            String str5 = popGuide.userId;
            if (str5 != null) {
                iO += CodedOutputByteBufferNano.o(5, str5);
            }
            int iJ = iO + CodedOutputByteBufferNano.j(6, popGuide.nextRequestTimestamp) + CodedOutputByteBufferNano.h(7, popGuide.reason);
            ((MessageNano) popGuide).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PopGuide m14825parse(nb5 nb5Var) throws IOException {
            PopGuide popGuide = new PopGuide();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (popGuide.f132id == null) {
                        popGuide.f132id = "";
                    }
                    if (popGuide.title == null) {
                        popGuide.title = "";
                    }
                    if (popGuide.guide == null) {
                        popGuide.guide = "";
                    }
                    if (popGuide.icon == null) {
                        popGuide.icon = "";
                    }
                    if (popGuide.userId != null) {
                        break;
                    }
                    popGuide.userId = "";
                    break;
                }
                if (iU == 10) {
                    popGuide.f132id = nb5Var.s();
                } else if (iU == 18) {
                    popGuide.title = nb5Var.s();
                } else if (iU == 26) {
                    popGuide.guide = nb5Var.s();
                } else if (iU == 34) {
                    popGuide.icon = nb5Var.s();
                } else if (iU == 42) {
                    popGuide.userId = nb5Var.s();
                } else if (iU == 48) {
                    popGuide.nextRequestTimestamp = nb5Var.k();
                } else {
                    if (iU != 56) {
                        if (popGuide.f132id == null) {
                            popGuide.f132id = "";
                        }
                        if (popGuide.title == null) {
                            popGuide.title = "";
                        }
                        if (popGuide.guide == null) {
                            popGuide.guide = "";
                        }
                        if (popGuide.icon == null) {
                            popGuide.icon = "";
                        }
                        if (popGuide.userId != null) {
                            break;
                        }
                        popGuide.userId = "";
                        return popGuide;
                    }
                    popGuide.reason = nb5Var.j();
                }
            }
            return popGuide;
        }

        public void serialize(PopGuide popGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = popGuide.f132id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            String str2 = popGuide.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(2, str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                codedOutputByteBufferNano.R(3, str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.R(4, str4);
            }
            String str5 = popGuide.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.R(5, str5);
            }
            codedOutputByteBufferNano.I(6, popGuide.nextRequestTimestamp);
            codedOutputByteBufferNano.G(7, popGuide.reason);
        }
    };
    public static JsonAdapter<PopGuide> JSON_ADAPTER = new ObjectJsonAdapter<PopGuide>() { // from class: com.p1.mobile.putong.core.data.PopGuide.2
        public Class getDataClass() {
            return PopGuide.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public PopGuide m14826newInstance() {
            return new PopGuide();
        }

        public boolean parseField(PopGuide popGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "reason":
                    popGuide.reason = jsonParser.getValueAsInt();
                    return true;
                case "userId":
                    popGuide.userId = jsonParser.getValueAsString();
                    return true;
                case "nextRequestTimestamp":
                    popGuide.nextRequestTimestamp = jsonParser.getValueAsLong();
                    return true;
                case "id":
                    popGuide.f132id = jsonParser.getValueAsString();
                    return false;
                case "icon":
                    popGuide.icon = jsonParser.getValueAsString();
                    return true;
                case "guide":
                    popGuide.guide = jsonParser.getValueAsString();
                    return true;
                case "title":
                    popGuide.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(PopGuide popGuide, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "reason":
                case "userId":
                case "nextRequestTimestamp":
                    return true;
                case "id":
                    return false;
                case "icon":
                case "guide":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(popGuide, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(PopGuide popGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = popGuide.f132id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = popGuide.title;
            if (str2 != null) {
                jsonGenerator.writeStringField(KnowMyselfShareParams.PARAMS_TITLE, str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                jsonGenerator.writeStringField("guide", str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField(HomeTabModuleTopicShowType.icon, str4);
            }
            jsonGenerator.writeNumberField(Reason.TYPE, popGuide.reason);
            String str5 = popGuide.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            jsonGenerator.writeNumberField("nextRequestTimestamp", popGuide.nextRequestTimestamp);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PopGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PopGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PopGuide new_() {
        PopGuide popGuide = new PopGuide();
        popGuide.nullCheck();
        return popGuide;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PopGuide m14824clone() {
        PopGuide popGuide = new PopGuide();
        popGuide.f132id = this.f132id;
        popGuide.title = this.title;
        popGuide.guide = this.guide;
        popGuide.icon = this.icon;
        popGuide.reason = this.reason;
        popGuide.userId = this.userId;
        popGuide.nextRequestTimestamp = this.nextRequestTimestamp;
        return popGuide;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PopGuide)) {
            return false;
        }
        PopGuide popGuide = (PopGuide) obj;
        return ValueObject.util_equals(this.f132id, popGuide.f132id) && ValueObject.util_equals(this.title, popGuide.title) && ValueObject.util_equals(this.guide, popGuide.guide) && ValueObject.util_equals(this.icon, popGuide.icon) && this.reason == popGuide.reason && ValueObject.util_equals(this.userId, popGuide.userId) && this.nextRequestTimestamp == popGuide.nextRequestTimestamp;
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
        String str = this.f132id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.guide;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.icon;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41) + this.reason) * 41;
        String str5 = this.userId;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        long j = this.nextRequestTimestamp;
        int i3 = ((iHashCode4 + iHashCode5) * 41) + ((int) (j ^ (j >>> 32)));
        ((ValueObject) this).hashCode = i3;
        return i3;
    }

    public void nullCheck() {
        if (this.f132id == null) {
            this.f132id = "";
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.guide == null) {
            this.guide = "";
        }
        if (this.icon == null) {
            this.icon = "";
        }
        if (this.userId == null) {
            this.userId = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
