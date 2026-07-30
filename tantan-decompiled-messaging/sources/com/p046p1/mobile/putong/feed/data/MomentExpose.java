package com.p046p1.mobile.putong.feed.data;

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

/* JADX INFO: loaded from: classes12.dex */
public class MomentExpose extends ValueObject implements Cloneable, Serializable {
    public static String STATUS_EXPOSED = "exposed";
    public static String STATUS_EXPOSING = "exposing";
    public static String STATUS_TOEXPOSE = "toexpose";
    public static final String TYPE = "momentexpose";

    @ProtobufIndex(index = 3)
    public int comments;

    @NonNull
    @ProtobufIndex(index = 1)
    public String exposeStatus;

    @ProtobufIndex(index = 4)
    public int likeMes;

    @ProtobufIndex(index = 5)
    public int likes;

    @ProtobufIndex(index = 2)
    public boolean shouldShowButton;

    @ProtobufIndex(index = 6)
    public int views;
    public static ProtobufAdapter<MomentExpose> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentExpose>() { // from class: com.p1.mobile.putong.feed.data.MomentExpose.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentExpose momentExpose) {
            String str = momentExpose.exposeStatus;
            int iM17233o = (str != null ? CodedOutputByteBufferNano.m17233o(1, str) : 0) + CodedOutputByteBufferNano.m17220b(2, momentExpose.shouldShowButton) + CodedOutputByteBufferNano.m17226h(3, momentExpose.comments) + CodedOutputByteBufferNano.m17226h(4, momentExpose.likeMes) + CodedOutputByteBufferNano.m17226h(5, momentExpose.likes) + CodedOutputByteBufferNano.m17226h(6, momentExpose.views);
            momentExpose.cachedSize = iM17233o;
            return iM17233o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentExpose parse(nb5 nb5Var) throws IOException {
            MomentExpose momentExpose = new MomentExpose();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (momentExpose.exposeStatus != null) {
                        break;
                    }
                    momentExpose.exposeStatus = "";
                    break;
                }
                if (iM158752u == 10) {
                    momentExpose.exposeStatus = nb5Var.m158750s();
                } else if (iM158752u == 16) {
                    momentExpose.shouldShowButton = nb5Var.m158738g();
                } else if (iM158752u == 24) {
                    momentExpose.comments = nb5Var.m158741j();
                } else if (iM158752u == 32) {
                    momentExpose.likeMes = nb5Var.m158741j();
                } else if (iM158752u == 40) {
                    momentExpose.likes = nb5Var.m158741j();
                } else {
                    if (iM158752u != 48) {
                        if (momentExpose.exposeStatus != null) {
                            break;
                        }
                        momentExpose.exposeStatus = "";
                        return momentExpose;
                    }
                    momentExpose.views = nb5Var.m158741j();
                }
            }
            return momentExpose;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentExpose momentExpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentExpose.exposeStatus;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(1, str);
            }
            codedOutputByteBufferNano.m17244A(2, momentExpose.shouldShowButton);
            codedOutputByteBufferNano.m17250G(3, momentExpose.comments);
            codedOutputByteBufferNano.m17250G(4, momentExpose.likeMes);
            codedOutputByteBufferNano.m17250G(5, momentExpose.likes);
            codedOutputByteBufferNano.m17250G(6, momentExpose.views);
        }
    };
    public static JsonAdapter<MomentExpose> JSON_ADAPTER = new ObjectJsonAdapter<MomentExpose>() { // from class: com.p1.mobile.putong.feed.data.MomentExpose.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentExpose.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentExpose newInstance() {
            return new MomentExpose();
        }

        public boolean parseField(MomentExpose momentExpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "shouldShowButton":
                    momentExpose.shouldShowButton = jsonParser.getValueAsBoolean();
                    return true;
                case "comments":
                    momentExpose.comments = jsonParser.getValueAsInt();
                    return true;
                case "likes":
                    momentExpose.likes = jsonParser.getValueAsInt();
                    return true;
                case "views":
                    momentExpose.views = jsonParser.getValueAsInt();
                    return true;
                case "likeMes":
                    momentExpose.likeMes = jsonParser.getValueAsInt();
                    return true;
                case "exposeStatus":
                    momentExpose.exposeStatus = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentExpose momentExpose, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "shouldShowButton":
                case "comments":
                case "likes":
                case "views":
                case "likeMes":
                case "exposeStatus":
                    return true;
                default:
                    return super.parseFieldCheck(momentExpose, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentExpose momentExpose, JsonGenerator jsonGenerator) throws IOException {
            String str = momentExpose.exposeStatus;
            if (str != null) {
                jsonGenerator.writeStringField("exposeStatus", str);
            }
            jsonGenerator.writeBooleanField("shouldShowButton", momentExpose.shouldShowButton);
            jsonGenerator.writeNumberField("comments", momentExpose.comments);
            jsonGenerator.writeNumberField("likeMes", momentExpose.likeMes);
            jsonGenerator.writeNumberField("likes", momentExpose.likes);
            jsonGenerator.writeNumberField("views", momentExpose.views);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExpose new_() {
        MomentExpose momentExpose = new MomentExpose();
        momentExpose.nullCheck();
        return momentExpose;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentExpose mo223809clone() {
        MomentExpose momentExpose = new MomentExpose();
        momentExpose.exposeStatus = this.exposeStatus;
        momentExpose.shouldShowButton = this.shouldShowButton;
        momentExpose.comments = this.comments;
        momentExpose.likeMes = this.likeMes;
        momentExpose.likes = this.likes;
        momentExpose.views = this.views;
        return momentExpose;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentExpose)) {
            return false;
        }
        MomentExpose momentExpose = (MomentExpose) obj;
        return ValueObject.util_equals(this.exposeStatus, momentExpose.exposeStatus) && this.shouldShowButton == momentExpose.shouldShowButton && this.comments == momentExpose.comments && this.likeMes == momentExpose.likeMes && this.likes == momentExpose.likes && this.views == momentExpose.views;
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
        String str = this.exposeStatus;
        int iHashCode = ((((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.shouldShowButton ? 1231 : 1237)) * 41) + this.comments) * 41) + this.likeMes) * 41) + this.likes) * 41) + this.views;
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isExposing() {
        return STATUS_EXPOSING.equals(this.exposeStatus);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.exposeStatus == null) {
            this.exposeStatus = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
