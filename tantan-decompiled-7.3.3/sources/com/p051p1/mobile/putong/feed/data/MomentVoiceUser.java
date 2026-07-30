package com.p051p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes13.dex */
public class MomentVoiceUser extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "momentvoiceuser";

    @NonNull
    @ProtobufIndex(index = 1)
    public String momentAvatar;

    @NonNull
    @ProtobufIndex(index = 4)
    public String momentContent;

    @NonNull
    @ProtobufIndex(index = 2)
    public String momentDesc;

    @NonNull
    @ProtobufIndex(index = 3)
    public String momentDescStatus;

    @ProtobufIndex(index = 6)
    public boolean momentIsAnchor;

    @NonNull
    @ProtobufIndex(index = 5)
    public String momentName;

    @NonNull
    @ProtobufIndex(index = 7)
    public String momentVoiceTemplate;
    public static ProtobufAdapter<MomentVoiceUser> PROTOBUF_ADAPTER = new MessageNanoAdapter<MomentVoiceUser>() { // from class: com.p1.mobile.putong.feed.data.MomentVoiceUser.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(MomentVoiceUser momentVoiceUser) {
            String str = momentVoiceUser.momentAvatar;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            String str2 = momentVoiceUser.momentDesc;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(2, str2);
            }
            String str3 = momentVoiceUser.momentDescStatus;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str3);
            }
            String str4 = momentVoiceUser.momentContent;
            if (str4 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(4, str4);
            }
            String str5 = momentVoiceUser.momentName;
            if (str5 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str5);
            }
            int iM17275b = iM17288o + CodedOutputByteBufferNano.m17275b(6, momentVoiceUser.momentIsAnchor);
            String str6 = momentVoiceUser.momentVoiceTemplate;
            if (str6 != null) {
                iM17275b += CodedOutputByteBufferNano.m17288o(7, str6);
            }
            momentVoiceUser.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public MomentVoiceUser parse(nc5 nc5Var) throws IOException {
            MomentVoiceUser momentVoiceUser = new MomentVoiceUser();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (momentVoiceUser.momentAvatar == null) {
                        momentVoiceUser.momentAvatar = "";
                    }
                    if (momentVoiceUser.momentDesc == null) {
                        momentVoiceUser.momentDesc = "";
                    }
                    if (momentVoiceUser.momentDescStatus == null) {
                        momentVoiceUser.momentDescStatus = "";
                    }
                    if (momentVoiceUser.momentContent == null) {
                        momentVoiceUser.momentContent = "";
                    }
                    if (momentVoiceUser.momentName == null) {
                        momentVoiceUser.momentName = "";
                    }
                    if (momentVoiceUser.momentVoiceTemplate != null) {
                        break;
                    }
                    momentVoiceUser.momentVoiceTemplate = "";
                    break;
                }
                if (iM162497u == 10) {
                    momentVoiceUser.momentAvatar = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    momentVoiceUser.momentDesc = nc5Var.m162495s();
                } else if (iM162497u == 26) {
                    momentVoiceUser.momentDescStatus = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    momentVoiceUser.momentContent = nc5Var.m162495s();
                } else if (iM162497u == 42) {
                    momentVoiceUser.momentName = nc5Var.m162495s();
                } else if (iM162497u == 48) {
                    momentVoiceUser.momentIsAnchor = nc5Var.m162483g();
                } else {
                    if (iM162497u != 58) {
                        if (momentVoiceUser.momentAvatar == null) {
                            momentVoiceUser.momentAvatar = "";
                        }
                        if (momentVoiceUser.momentDesc == null) {
                            momentVoiceUser.momentDesc = "";
                        }
                        if (momentVoiceUser.momentDescStatus == null) {
                            momentVoiceUser.momentDescStatus = "";
                        }
                        if (momentVoiceUser.momentContent == null) {
                            momentVoiceUser.momentContent = "";
                        }
                        if (momentVoiceUser.momentName == null) {
                            momentVoiceUser.momentName = "";
                        }
                        if (momentVoiceUser.momentVoiceTemplate != null) {
                            break;
                        }
                        momentVoiceUser.momentVoiceTemplate = "";
                        return momentVoiceUser;
                    }
                    momentVoiceUser.momentVoiceTemplate = nc5Var.m162495s();
                }
            }
            return momentVoiceUser;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(MomentVoiceUser momentVoiceUser, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = momentVoiceUser.momentAvatar;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            String str2 = momentVoiceUser.momentDesc;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(2, str2);
            }
            String str3 = momentVoiceUser.momentDescStatus;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(3, str3);
            }
            String str4 = momentVoiceUser.momentContent;
            if (str4 != null) {
                codedOutputByteBufferNano.m17316R(4, str4);
            }
            String str5 = momentVoiceUser.momentName;
            if (str5 != null) {
                codedOutputByteBufferNano.m17316R(5, str5);
            }
            codedOutputByteBufferNano.m17299A(6, momentVoiceUser.momentIsAnchor);
            String str6 = momentVoiceUser.momentVoiceTemplate;
            if (str6 != null) {
                codedOutputByteBufferNano.m17316R(7, str6);
            }
        }
    };
    public static JsonAdapter<MomentVoiceUser> JSON_ADAPTER = new ObjectJsonAdapter<MomentVoiceUser>() { // from class: com.p1.mobile.putong.feed.data.MomentVoiceUser.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return MomentVoiceUser.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public MomentVoiceUser newInstance() {
            return new MomentVoiceUser();
        }

        public boolean parseField(MomentVoiceUser momentVoiceUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "momentIsAnchor":
                    momentVoiceUser.momentIsAnchor = jsonParser.getValueAsBoolean();
                    return true;
                case "momentContent":
                    momentVoiceUser.momentContent = jsonParser.getValueAsString();
                    return true;
                case "momentDescStatus":
                    momentVoiceUser.momentDescStatus = jsonParser.getValueAsString();
                    return true;
                case "momentDesc":
                    momentVoiceUser.momentDesc = jsonParser.getValueAsString();
                    return true;
                case "momentName":
                    momentVoiceUser.momentName = jsonParser.getValueAsString();
                    return true;
                case "momentVoiceTemplate":
                    momentVoiceUser.momentVoiceTemplate = jsonParser.getValueAsString();
                    return true;
                case "momentAvatar":
                    momentVoiceUser.momentAvatar = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(MomentVoiceUser momentVoiceUser, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "momentIsAnchor":
                case "momentContent":
                case "momentDescStatus":
                case "momentDesc":
                case "momentName":
                case "momentVoiceTemplate":
                case "momentAvatar":
                    return true;
                default:
                    return super.parseFieldCheck(momentVoiceUser, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(MomentVoiceUser momentVoiceUser, JsonGenerator jsonGenerator) throws IOException {
            String str = momentVoiceUser.momentAvatar;
            if (str != null) {
                jsonGenerator.writeStringField("momentAvatar", str);
            }
            String str2 = momentVoiceUser.momentDesc;
            if (str2 != null) {
                jsonGenerator.writeStringField("momentDesc", str2);
            }
            String str3 = momentVoiceUser.momentDescStatus;
            if (str3 != null) {
                jsonGenerator.writeStringField("momentDescStatus", str3);
            }
            String str4 = momentVoiceUser.momentContent;
            if (str4 != null) {
                jsonGenerator.writeStringField("momentContent", str4);
            }
            String str5 = momentVoiceUser.momentName;
            if (str5 != null) {
                jsonGenerator.writeStringField("momentName", str5);
            }
            jsonGenerator.writeBooleanField("momentIsAnchor", momentVoiceUser.momentIsAnchor);
            String str6 = momentVoiceUser.momentVoiceTemplate;
            if (str6 != null) {
                jsonGenerator.writeStringField("momentVoiceTemplate", str6);
            }
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((MomentVoiceUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((MomentVoiceUser) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static MomentVoiceUser new_() {
        MomentVoiceUser momentVoiceUser = new MomentVoiceUser();
        momentVoiceUser.nullCheck();
        return momentVoiceUser;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public MomentVoiceUser mo225055clone() {
        MomentVoiceUser momentVoiceUser = new MomentVoiceUser();
        momentVoiceUser.momentAvatar = this.momentAvatar;
        momentVoiceUser.momentDesc = this.momentDesc;
        momentVoiceUser.momentDescStatus = this.momentDescStatus;
        momentVoiceUser.momentContent = this.momentContent;
        momentVoiceUser.momentName = this.momentName;
        momentVoiceUser.momentIsAnchor = this.momentIsAnchor;
        momentVoiceUser.momentVoiceTemplate = this.momentVoiceTemplate;
        return momentVoiceUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MomentVoiceUser)) {
            return false;
        }
        MomentVoiceUser momentVoiceUser = (MomentVoiceUser) obj;
        return ValueObject.util_equals(this.momentAvatar, momentVoiceUser.momentAvatar) && ValueObject.util_equals(this.momentDesc, momentVoiceUser.momentDesc) && ValueObject.util_equals(this.momentDescStatus, momentVoiceUser.momentDescStatus) && ValueObject.util_equals(this.momentContent, momentVoiceUser.momentContent) && ValueObject.util_equals(this.momentName, momentVoiceUser.momentName) && this.momentIsAnchor == momentVoiceUser.momentIsAnchor && ValueObject.util_equals(this.momentVoiceTemplate, momentVoiceUser.momentVoiceTemplate);
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
        String str = this.momentAvatar;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.momentDesc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 41;
        String str3 = this.momentDescStatus;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 41;
        String str4 = this.momentContent;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 41;
        String str5 = this.momentName;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 41) + (this.momentIsAnchor ? 1231 : 1237)) * 41;
        String str6 = this.momentVoiceTemplate;
        int iHashCode6 = iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.momentAvatar == null) {
            this.momentAvatar = "";
        }
        if (this.momentDesc == null) {
            this.momentDesc = "";
        }
        if (this.momentDescStatus == null) {
            this.momentDescStatus = "";
        }
        if (this.momentContent == null) {
            this.momentContent = "";
        }
        if (this.momentName == null) {
            this.momentName = "";
        }
        if (this.momentVoiceTemplate == null) {
            this.momentVoiceTemplate = "";
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
