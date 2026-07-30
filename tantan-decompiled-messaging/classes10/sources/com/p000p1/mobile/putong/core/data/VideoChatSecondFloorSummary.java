package com.p000p1.mobile.putong.core.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.core.data.VideoChatSecondFloorSummary;
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
public class VideoChatSecondFloorSummary extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "videochatsecondfloorsummary";

    @ProtobufIndex(index = 4)
    public long endTime;

    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PEI_LIAO)
    public long startTime;

    @NonNull
    @ProtobufIndex(index = QuickChatCardWrapper.QuickChatCardType.PASSIVE)
    public String subtitle;

    @NonNull
    @ProtobufIndex(index = 1)
    public List<String> userAvatars;
    public static ProtobufAdapter<VideoChatSecondFloorSummary> PROTOBUF_ADAPTER = new MessageNanoAdapter<VideoChatSecondFloorSummary>() { // from class: com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VideoChatSecondFloorSummary videoChatSecondFloorSummary) {
            List<String> list = videoChatSecondFloorSummary.userAvatars;
            int iL = list != null ? CodedOutputByteBufferNano.l(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER()) : 0;
            String str = videoChatSecondFloorSummary.subtitle;
            if (str != null) {
                iL += CodedOutputByteBufferNano.o(2, str);
            }
            int iJ = iL + CodedOutputByteBufferNano.j(3, videoChatSecondFloorSummary.startTime) + CodedOutputByteBufferNano.j(4, videoChatSecondFloorSummary.endTime);
            ((MessageNano) videoChatSecondFloorSummary).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VideoChatSecondFloorSummary m16228parse(nb5 nb5Var) throws IOException {
            VideoChatSecondFloorSummary videoChatSecondFloorSummary = new VideoChatSecondFloorSummary();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (videoChatSecondFloorSummary.userAvatars == null) {
                        videoChatSecondFloorSummary.userAvatars = new ArrayList();
                    }
                    if (videoChatSecondFloorSummary.subtitle != null) {
                        break;
                    }
                    videoChatSecondFloorSummary.subtitle = "";
                    break;
                }
                if (iU == 10) {
                    videoChatSecondFloorSummary.userAvatars = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 18) {
                    videoChatSecondFloorSummary.subtitle = nb5Var.s();
                } else if (iU == 24) {
                    videoChatSecondFloorSummary.startTime = nb5Var.k();
                } else {
                    if (iU != 32) {
                        if (videoChatSecondFloorSummary.userAvatars == null) {
                            videoChatSecondFloorSummary.userAvatars = new ArrayList();
                        }
                        if (videoChatSecondFloorSummary.subtitle != null) {
                            break;
                        }
                        videoChatSecondFloorSummary.subtitle = "";
                        return videoChatSecondFloorSummary;
                    }
                    videoChatSecondFloorSummary.endTime = nb5Var.k();
                }
            }
            return videoChatSecondFloorSummary;
        }

        public void serialize(VideoChatSecondFloorSummary videoChatSecondFloorSummary, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            List<String> list = videoChatSecondFloorSummary.userAvatars;
            if (list != null) {
                codedOutputByteBufferNano.K(1, list, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            String str = videoChatSecondFloorSummary.subtitle;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            codedOutputByteBufferNano.I(3, videoChatSecondFloorSummary.startTime);
            codedOutputByteBufferNano.I(4, videoChatSecondFloorSummary.endTime);
        }
    };
    public static JsonAdapter<VideoChatSecondFloorSummary> JSON_ADAPTER = new ObjectJsonAdapter<VideoChatSecondFloorSummary>() { // from class: com.p1.mobile.putong.core.data.VideoChatSecondFloorSummary.2
        public Class getDataClass() {
            return VideoChatSecondFloorSummary.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VideoChatSecondFloorSummary m16229newInstance() {
            return new VideoChatSecondFloorSummary();
        }

        public boolean parseField(VideoChatSecondFloorSummary videoChatSecondFloorSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "startTime":
                    videoChatSecondFloorSummary.startTime = jsonParser.getValueAsLong();
                    return true;
                case "subtitle":
                    videoChatSecondFloorSummary.subtitle = jsonParser.getValueAsString();
                    return true;
                case "endTime":
                    videoChatSecondFloorSummary.endTime = jsonParser.getValueAsLong();
                    return true;
                case "userAvatars":
                    videoChatSecondFloorSummary.userAvatars = JsonAdapter.parseArray(jsonParser, JsonAdapter.STRING_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VideoChatSecondFloorSummary videoChatSecondFloorSummary, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "startTime":
                case "subtitle":
                case "endTime":
                case "userAvatars":
                    return true;
                default:
                    return super.parseFieldCheck(videoChatSecondFloorSummary, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        public void serializeFields(VideoChatSecondFloorSummary videoChatSecondFloorSummary, JsonGenerator jsonGenerator) throws IOException {
            if (videoChatSecondFloorSummary.userAvatars != null) {
                jsonGenerator.writeFieldName("userAvatars");
                JsonAdapter.serializeArray(videoChatSecondFloorSummary.userAvatars, jsonGenerator, JsonAdapter.STRING_ADAPTER);
            }
            String str = videoChatSecondFloorSummary.subtitle;
            if (str != null) {
                jsonGenerator.writeStringField("subtitle", str);
            }
            jsonGenerator.writeNumberField("startTime", videoChatSecondFloorSummary.startTime);
            jsonGenerator.writeNumberField("endTime", videoChatSecondFloorSummary.endTime);
        }

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VideoChatSecondFloorSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VideoChatSecondFloorSummary) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m704a(String str) {
        return str;
    }

    public static VideoChatSecondFloorSummary new_() {
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = new VideoChatSecondFloorSummary();
        videoChatSecondFloorSummary.nullCheck();
        return videoChatSecondFloorSummary;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VideoChatSecondFloorSummary m16227clone() {
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = new VideoChatSecondFloorSummary();
        List<String> list = this.userAvatars;
        if (list != null) {
            videoChatSecondFloorSummary.userAvatars = ValueObject.util_map(list, new w9j() { // from class: l.e3l0
                public final Object call(Object obj) {
                    return VideoChatSecondFloorSummary.m704a((String) obj);
                }
            });
        }
        videoChatSecondFloorSummary.subtitle = this.subtitle;
        videoChatSecondFloorSummary.startTime = this.startTime;
        videoChatSecondFloorSummary.endTime = this.endTime;
        return videoChatSecondFloorSummary;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VideoChatSecondFloorSummary)) {
            return false;
        }
        VideoChatSecondFloorSummary videoChatSecondFloorSummary = (VideoChatSecondFloorSummary) obj;
        return ValueObject.util_equals(this.userAvatars, videoChatSecondFloorSummary.userAvatars) && ValueObject.util_equals(this.subtitle, videoChatSecondFloorSummary.subtitle) && this.startTime == videoChatSecondFloorSummary.startTime && this.endTime == videoChatSecondFloorSummary.endTime;
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
        List<String> list = this.userAvatars;
        int iHashCode = (i2 + (list != null ? list.hashCode() : 0)) * 41;
        String str = this.subtitle;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j = this.startTime;
        int i3 = (((iHashCode + iHashCode2) * 41) + ((int) (j ^ (j >>> 32)))) * 41;
        long j2 = this.endTime;
        int i4 = i3 + ((int) (j2 ^ (j2 >>> 32)));
        ((ValueObject) this).hashCode = i4;
        return i4;
    }

    public void nullCheck() {
        if (this.userAvatars == null) {
            this.userAvatars = new ArrayList();
        }
        if (this.subtitle == null) {
            this.subtitle = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
