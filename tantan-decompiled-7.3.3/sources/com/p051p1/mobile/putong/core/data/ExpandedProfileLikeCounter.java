package com.p051p1.mobile.putong.core.data;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p153l.nc5;

/* JADX INFO: loaded from: classes10.dex */
public class ExpandedProfileLikeCounter extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "expandedprofilelikecounter";

    @ProtobufIndex(index = 2)
    public boolean canLike;

    @Nullable
    @ProtobufIndex(index = 3)
    public ProfileLikeComment profileLikeComment;

    @ProtobufIndex(index = 1)
    public int receive;
    public static ProtobufAdapter<ExpandedProfileLikeCounter> PROTOBUF_ADAPTER = new MessageNanoAdapter<ExpandedProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(ExpandedProfileLikeCounter expandedProfileLikeCounter) {
            int iM17281h = CodedOutputByteBufferNano.m17281h(1, expandedProfileLikeCounter.receive) + CodedOutputByteBufferNano.m17275b(2, expandedProfileLikeCounter.canLike);
            ProfileLikeComment profileLikeComment = expandedProfileLikeCounter.profileLikeComment;
            if (profileLikeComment != null) {
                iM17281h += CodedOutputByteBufferNano.m17285l(3, profileLikeComment, ProfileLikeComment.PROTOBUF_ADAPTER);
            }
            expandedProfileLikeCounter.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public ExpandedProfileLikeCounter parse(nc5 nc5Var) throws IOException {
            ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 8) {
                    expandedProfileLikeCounter.receive = nc5Var.m162486j();
                } else if (iM162497u == 16) {
                    expandedProfileLikeCounter.canLike = nc5Var.m162483g();
                } else {
                    if (iM162497u != 26) {
                        return expandedProfileLikeCounter;
                    }
                    expandedProfileLikeCounter.profileLikeComment = (ProfileLikeComment) nc5Var.m162488l(ProfileLikeComment.PROTOBUF_ADAPTER);
                }
            }
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(ExpandedProfileLikeCounter expandedProfileLikeCounter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17305G(1, expandedProfileLikeCounter.receive);
            codedOutputByteBufferNano.m17299A(2, expandedProfileLikeCounter.canLike);
            ProfileLikeComment profileLikeComment = expandedProfileLikeCounter.profileLikeComment;
            if (profileLikeComment != null) {
                codedOutputByteBufferNano.m17309K(3, profileLikeComment, ProfileLikeComment.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<ExpandedProfileLikeCounter> JSON_ADAPTER = new ObjectJsonAdapter<ExpandedProfileLikeCounter>() { // from class: com.p1.mobile.putong.core.data.ExpandedProfileLikeCounter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return ExpandedProfileLikeCounter.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public ExpandedProfileLikeCounter newInstance() {
            return new ExpandedProfileLikeCounter();
        }

        public boolean parseField(ExpandedProfileLikeCounter expandedProfileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "profileLikeComment":
                    expandedProfileLikeCounter.profileLikeComment = ProfileLikeComment.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "canLike":
                    expandedProfileLikeCounter.canLike = jsonParser.getValueAsBoolean();
                    return true;
                case "receive":
                    expandedProfileLikeCounter.receive = jsonParser.getValueAsInt();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(ExpandedProfileLikeCounter expandedProfileLikeCounter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "profileLikeComment":
                case "canLike":
                case "receive":
                    return true;
                default:
                    return super.parseFieldCheck(expandedProfileLikeCounter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(ExpandedProfileLikeCounter expandedProfileLikeCounter, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeNumberField("receive", expandedProfileLikeCounter.receive);
            jsonGenerator.writeBooleanField("canLike", expandedProfileLikeCounter.canLike);
            if (expandedProfileLikeCounter.profileLikeComment != null) {
                jsonGenerator.writeFieldName("profileLikeComment");
                ProfileLikeComment.JSON_ADAPTER.serialize(expandedProfileLikeCounter.profileLikeComment, jsonGenerator, true);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((ExpandedProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((ExpandedProfileLikeCounter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static ExpandedProfileLikeCounter new_() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
        expandedProfileLikeCounter.nullCheck();
        return expandedProfileLikeCounter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public ExpandedProfileLikeCounter mo225055clone() {
        ExpandedProfileLikeCounter expandedProfileLikeCounter = new ExpandedProfileLikeCounter();
        expandedProfileLikeCounter.receive = this.receive;
        expandedProfileLikeCounter.canLike = this.canLike;
        ProfileLikeComment profileLikeComment = this.profileLikeComment;
        if (profileLikeComment != null) {
            expandedProfileLikeCounter.profileLikeComment = profileLikeComment.mo225055clone();
        }
        return expandedProfileLikeCounter;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExpandedProfileLikeCounter)) {
            return false;
        }
        ExpandedProfileLikeCounter expandedProfileLikeCounter = (ExpandedProfileLikeCounter) obj;
        return this.receive == expandedProfileLikeCounter.receive && this.canLike == expandedProfileLikeCounter.canLike && ValueObject.util_equals(this.profileLikeComment, expandedProfileLikeCounter.profileLikeComment);
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
        int i2 = ((((i * 41) + this.receive) * 41) + (this.canLike ? 1231 : 1237)) * 41;
        ProfileLikeComment profileLikeComment = this.profileLikeComment;
        int iHashCode = i2 + (profileLikeComment != null ? profileLikeComment.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
