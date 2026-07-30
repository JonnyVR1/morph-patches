package com.p046p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
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
import p149l.nb5;

/* JADX INFO: loaded from: classes10.dex */
public class PopGuide extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "popguide";

    @NonNull
    @ProtobufIndex(index = 3)
    public String guide;

    @NonNull
    @ProtobufIndex(index = 4)
    public String icon;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f20470id;

    @ProtobufIndex(index = 6)
    public long nextRequestTimestamp;

    @ProtobufIndex(index = 7)
    public int reason;

    @NonNull
    @ProtobufIndex(index = 2)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String userId;
    public static ProtobufAdapter<PopGuide> PROTOBUF_ADAPTER = new MessageNanoAdapter<PopGuide>() { // from class: com.p1.mobile.putong.core.data.PopGuide.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PopGuide popGuide) {
            String str = popGuide.f20470id;
            int iM17233o = str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0;
            String str2 = popGuide.title;
            if (str2 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(2, str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(3, str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(4, str4);
            }
            String str5 = popGuide.userId;
            if (str5 != null) {
                iM17233o += CodedOutputByteBufferNano.m17233o(5, str5);
            }
            int iM17228j = iM17233o + CodedOutputByteBufferNano.m17228j(6, popGuide.nextRequestTimestamp) + CodedOutputByteBufferNano.m17226h(7, popGuide.reason);
            popGuide.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PopGuide parse(nb5 nb5Var) throws IOException {
            PopGuide popGuide = new PopGuide();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (popGuide.f20470id == null) {
                        popGuide.f20470id = "";
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
                if (iM158752u == 10) {
                    popGuide.f20470id = nb5Var.m158750s();
                } else if (iM158752u == 18) {
                    popGuide.title = nb5Var.m158750s();
                } else if (iM158752u == 26) {
                    popGuide.guide = nb5Var.m158750s();
                } else if (iM158752u == 34) {
                    popGuide.icon = nb5Var.m158750s();
                } else if (iM158752u == 42) {
                    popGuide.userId = nb5Var.m158750s();
                } else if (iM158752u == 48) {
                    popGuide.nextRequestTimestamp = nb5Var.m158742k();
                } else {
                    if (iM158752u != 56) {
                        if (popGuide.f20470id == null) {
                            popGuide.f20470id = "";
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
                    popGuide.reason = nb5Var.m158741j();
                }
            }
            return popGuide;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PopGuide popGuide, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = popGuide.f20470id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            String str2 = popGuide.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(2, str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(3, str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(4, str4);
            }
            String str5 = popGuide.userId;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(5, str5);
            }
            codedOutputByteBufferNano.m17252I(6, popGuide.nextRequestTimestamp);
            codedOutputByteBufferNano.m17250G(7, popGuide.reason);
        }
    };
    public static JsonAdapter<PopGuide> JSON_ADAPTER = new ObjectJsonAdapter<PopGuide>() { // from class: com.p1.mobile.putong.core.data.PopGuide.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PopGuide.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PopGuide newInstance() {
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
                    popGuide.f20470id = jsonParser.getValueAsString();
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PopGuide popGuide, JsonGenerator jsonGenerator) throws IOException {
            String str = popGuide.f20470id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = popGuide.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            String str3 = popGuide.guide;
            if (str3 != null) {
                jsonGenerator.writeStringField("guide", str3);
            }
            String str4 = popGuide.icon;
            if (str4 != null) {
                jsonGenerator.writeStringField("icon", str4);
            }
            jsonGenerator.writeNumberField(Reason.TYPE, popGuide.reason);
            String str5 = popGuide.userId;
            if (str5 != null) {
                jsonGenerator.writeStringField("userId", str5);
            }
            jsonGenerator.writeNumberField("nextRequestTimestamp", popGuide.nextRequestTimestamp);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PopGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PopGuide) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PopGuide new_() {
        PopGuide popGuide = new PopGuide();
        popGuide.nullCheck();
        return popGuide;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PopGuide mo223809clone() {
        PopGuide popGuide = new PopGuide();
        popGuide.f20470id = this.f20470id;
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
        return ValueObject.util_equals(this.f20470id, popGuide.f20470id) && ValueObject.util_equals(this.title, popGuide.title) && ValueObject.util_equals(this.guide, popGuide.guide) && ValueObject.util_equals(this.icon, popGuide.icon) && this.reason == popGuide.reason && ValueObject.util_equals(this.userId, popGuide.userId) && this.nextRequestTimestamp == popGuide.nextRequestTimestamp;
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
        String str = this.f20470id;
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
        this.hashCode = i3;
        return i3;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f20470id == null) {
            this.f20470id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
