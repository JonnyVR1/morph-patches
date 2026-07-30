package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(MomentExpose momentExpose) {
            String str = momentExpose.exposeStatus;
            int iO = (str != null ? CodedOutputByteBufferNano.o(1, str) : 0) + CodedOutputByteBufferNano.b(2, momentExpose.shouldShowButton) + CodedOutputByteBufferNano.h(3, momentExpose.comments) + CodedOutputByteBufferNano.h(4, momentExpose.likeMes) + CodedOutputByteBufferNano.h(5, momentExpose.likes) + CodedOutputByteBufferNano.h(6, momentExpose.views);
            ((MessageNano) momentExpose).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public MomentExpose m19605parse(nb5 nb5Var) throws IOException {
            MomentExpose momentExpose = new MomentExpose();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (momentExpose.exposeStatus != null) {
                        break;
                    }
                    momentExpose.exposeStatus = "";
                    break;
                }
                if (iU == 10) {
                    momentExpose.exposeStatus = nb5Var.s();
                } else if (iU == 16) {
                    momentExpose.shouldShowButton = nb5Var.g();
                } else if (iU == 24) {
                    momentExpose.comments = nb5Var.j();
                } else if (iU == 32) {
                    momentExpose.likeMes = nb5Var.j();
                } else if (iU == 40) {
                    momentExpose.likes = nb5Var.j();
                } else {
                    if (iU != 48) {
                        if (momentExpose.exposeStatus != null) {
                            break;
                        }
                        momentExpose.exposeStatus = "";
                        return momentExpose;
                    }
                    momentExpose.views = nb5Var.j();
                }
            }
            return momentExpose;
        }

        public void serialize(MomentExpose momentExpose, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentExpose.exposeStatus;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            codedOutputByteBufferNano.A(2, momentExpose.shouldShowButton);
            codedOutputByteBufferNano.G(3, momentExpose.comments);
            codedOutputByteBufferNano.G(4, momentExpose.likeMes);
            codedOutputByteBufferNano.G(5, momentExpose.likes);
            codedOutputByteBufferNano.G(6, momentExpose.views);
        }
    };
    public static JsonAdapter<MomentExpose> JSON_ADAPTER = new ObjectJsonAdapter<MomentExpose>() { // from class: com.p1.mobile.putong.feed.data.MomentExpose.2
        public Class getDataClass() {
            return MomentExpose.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public MomentExpose mo17830newInstance() {
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentExpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentExpose) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentExpose new_() {
        MomentExpose momentExpose = new MomentExpose();
        momentExpose.nullCheck();
        return momentExpose;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public MomentExpose m19604clone() {
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.exposeStatus;
        int iHashCode = ((((((((((i2 + (str != null ? str.hashCode() : 0)) * 41) + (this.shouldShowButton ? 1231 : 1237)) * 41) + this.comments) * 41) + this.likeMes) * 41) + this.likes) * 41) + this.views;
        ((ValueObject) this).hashCode = iHashCode;
        return iHashCode;
    }

    public boolean isExposing() {
        return STATUS_EXPOSING.equals(this.exposeStatus);
    }

    public void nullCheck() {
        if (this.exposeStatus == null) {
            this.exposeStatus = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
