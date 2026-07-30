package com.p046p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SeeTextDynamicParam;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnumColumn;
import com.p046p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;

/* JADX INFO: loaded from: classes10.dex */
public class VerificationCenter extends DbObject implements Cloneable, Serializable {
    public static final TEnumColumn<VerificationCenter, StudentVerificationStatus> AGEVERIFICATIONINFO_STATUS;
    public static final Column<VerificationCenter, Picture> CTDIDVERIFICATIONINFO_MEDIA;
    public static final TEnumColumn<VerificationCenter, StudentVerificationStatus> CTDIDVERIFICATIONINFO_STATUS;
    public static mrf0<VerificationCenter> DB_ADAPTER = null;
    public static final Column<VerificationCenter, IdCardVerificationInfo> IDCARD;
    public static final TEnumColumn<VerificationCenter, StudentVerificationStatus> PICVERIFICATIONINFO_STATUS;
    public static final String TYPE = "verificationcenter";
    public static final StringColumn<VerificationCenter> VOICEANCHOR_STATUS;

    @NonNull
    @ProtobufIndex(index = 55)
    public AgeVerificationInfo ageVerificationInfo;

    @Nullable
    public LiveAnchor anchor;

    @NonNull
    @ProtobufIndex(index = 57)
    public PicVerificationInfo ctdidVerificationInfo;

    @Nullable
    @ProtobufIndex(index = 54)
    public IdCardVerificationInfo idCard;

    @Nullable
    public Identity identity;

    @NonNull
    @ProtobufIndex(index = 53)
    public PicVerificationInfo picVerificationInfo;

    @NonNull
    @ProtobufIndex(index = 51)
    public String userId;

    @NonNull
    @ProtobufIndex(index = 52)
    public String verificationType;

    @NonNull
    @ProtobufIndex(index = 56)
    public VoiceAnchorVerifyResult voiceAnchor;
    public static ProtobufAdapter<VerificationCenter> PROTOBUF_ADAPTER = new MessageNanoAdapter<VerificationCenter>() { // from class: com.p1.mobile.putong.core.data.VerificationCenter.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(VerificationCenter verificationCenter) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, verificationCenter._id);
            String str = verificationCenter.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = verificationCenter.userId;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = verificationCenter.verificationType;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            PicVerificationInfo picVerificationInfo = verificationCenter.picVerificationInfo;
            if (picVerificationInfo != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(53, picVerificationInfo, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            IdCardVerificationInfo idCardVerificationInfo = verificationCenter.idCard;
            if (idCardVerificationInfo != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(54, idCardVerificationInfo, IdCardVerificationInfo.PROTOBUF_ADAPTER);
            }
            AgeVerificationInfo ageVerificationInfo = verificationCenter.ageVerificationInfo;
            if (ageVerificationInfo != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(55, ageVerificationInfo, AgeVerificationInfo.PROTOBUF_ADAPTER);
            }
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = verificationCenter.voiceAnchor;
            if (voiceAnchorVerifyResult != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(56, voiceAnchorVerifyResult, VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
            }
            PicVerificationInfo picVerificationInfo2 = verificationCenter.ctdidVerificationInfo;
            if (picVerificationInfo2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(57, picVerificationInfo2, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            verificationCenter.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public VerificationCenter parse(nb5 nb5Var) throws IOException {
            VerificationCenter verificationCenter = new VerificationCenter();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (verificationCenter.userId == null) {
                        verificationCenter.userId = "";
                    }
                    if (verificationCenter.verificationType == null) {
                        verificationCenter.verificationType = "";
                    }
                    if (verificationCenter.picVerificationInfo == null) {
                        verificationCenter.picVerificationInfo = PicVerificationInfo.new_();
                    }
                    if (verificationCenter.ageVerificationInfo == null) {
                        verificationCenter.ageVerificationInfo = AgeVerificationInfo.new_();
                    }
                    if (verificationCenter.voiceAnchor == null) {
                        verificationCenter.voiceAnchor = VoiceAnchorVerifyResult.new_();
                    }
                    if (verificationCenter.ctdidVerificationInfo != null) {
                        break;
                    }
                    verificationCenter.ctdidVerificationInfo = PicVerificationInfo.new_();
                    break;
                }
                if (iM158752u == 8) {
                    verificationCenter._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    verificationCenter.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    verificationCenter.userId = nb5Var.m158750s();
                } else if (iM158752u == 418) {
                    verificationCenter.verificationType = nb5Var.m158750s();
                } else if (iM158752u == 426) {
                    verificationCenter.picVerificationInfo = (PicVerificationInfo) nb5Var.m158743l(PicVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 434) {
                    verificationCenter.idCard = (IdCardVerificationInfo) nb5Var.m158743l(IdCardVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 442) {
                    verificationCenter.ageVerificationInfo = (AgeVerificationInfo) nb5Var.m158743l(AgeVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iM158752u == 450) {
                    verificationCenter.voiceAnchor = (VoiceAnchorVerifyResult) nb5Var.m158743l(VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 458) {
                        if (verificationCenter.userId == null) {
                            verificationCenter.userId = "";
                        }
                        if (verificationCenter.verificationType == null) {
                            verificationCenter.verificationType = "";
                        }
                        if (verificationCenter.picVerificationInfo == null) {
                            verificationCenter.picVerificationInfo = PicVerificationInfo.new_();
                        }
                        if (verificationCenter.ageVerificationInfo == null) {
                            verificationCenter.ageVerificationInfo = AgeVerificationInfo.new_();
                        }
                        if (verificationCenter.voiceAnchor == null) {
                            verificationCenter.voiceAnchor = VoiceAnchorVerifyResult.new_();
                        }
                        if (verificationCenter.ctdidVerificationInfo != null) {
                            break;
                        }
                        verificationCenter.ctdidVerificationInfo = PicVerificationInfo.new_();
                        return verificationCenter;
                    }
                    verificationCenter.ctdidVerificationInfo = (PicVerificationInfo) nb5Var.m158743l(PicVerificationInfo.PROTOBUF_ADAPTER);
                }
            }
            return verificationCenter;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(VerificationCenter verificationCenter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, verificationCenter._id);
            String str = verificationCenter.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = verificationCenter.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = verificationCenter.verificationType;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            PicVerificationInfo picVerificationInfo = verificationCenter.picVerificationInfo;
            if (picVerificationInfo != null) {
                codedOutputByteBufferNano.m17254K(53, picVerificationInfo, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            IdCardVerificationInfo idCardVerificationInfo = verificationCenter.idCard;
            if (idCardVerificationInfo != null) {
                codedOutputByteBufferNano.m17254K(54, idCardVerificationInfo, IdCardVerificationInfo.PROTOBUF_ADAPTER);
            }
            AgeVerificationInfo ageVerificationInfo = verificationCenter.ageVerificationInfo;
            if (ageVerificationInfo != null) {
                codedOutputByteBufferNano.m17254K(55, ageVerificationInfo, AgeVerificationInfo.PROTOBUF_ADAPTER);
            }
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = verificationCenter.voiceAnchor;
            if (voiceAnchorVerifyResult != null) {
                codedOutputByteBufferNano.m17254K(56, voiceAnchorVerifyResult, VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
            }
            PicVerificationInfo picVerificationInfo2 = verificationCenter.ctdidVerificationInfo;
            if (picVerificationInfo2 != null) {
                codedOutputByteBufferNano.m17254K(57, picVerificationInfo2, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationCenter> JSON_ADAPTER = new ObjectJsonAdapter<VerificationCenter>() { // from class: com.p1.mobile.putong.core.data.VerificationCenter.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return VerificationCenter.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public VerificationCenter newInstance() {
            return new VerificationCenter();
        }

        public boolean parseField(VerificationCenter verificationCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    verificationCenter.anchor = LiveAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "idCard":
                    verificationCenter.idCard = IdCardVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    verificationCenter.userId = jsonParser.getValueAsString();
                    return true;
                case "voiceAnchor":
                    verificationCenter.voiceAnchor = VoiceAnchorVerifyResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picture":
                    verificationCenter.picVerificationInfo = PicVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "identity":
                    verificationCenter.identity = Identity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    verificationCenter.f56011id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    verificationCenter.ageVerificationInfo = AgeVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    verificationCenter.verificationType = jsonParser.getValueAsString();
                    return true;
                case "ctdid":
                    verificationCenter.ctdidVerificationInfo = PicVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(VerificationCenter verificationCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "anchor":
                case "idCard":
                case "userId":
                case "voiceAnchor":
                case "picture":
                case "identity":
                    return true;
                case "id":
                    return false;
                case "age":
                case "type":
                case "ctdid":
                    return true;
                default:
                    return super.parseFieldCheck(verificationCenter, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(VerificationCenter verificationCenter, JsonGenerator jsonGenerator) throws IOException {
            String str = verificationCenter.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = verificationCenter.userId;
            if (str2 != null) {
                jsonGenerator.writeStringField("userId", str2);
            }
            String str3 = verificationCenter.verificationType;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
            if (verificationCenter.picVerificationInfo != null) {
                jsonGenerator.writeFieldName("picture");
                PicVerificationInfo.JSON_ADAPTER.serialize(verificationCenter.picVerificationInfo, jsonGenerator, true);
            }
            if (verificationCenter.anchor != null) {
                jsonGenerator.writeFieldName("anchor");
                LiveAnchor.JSON_ADAPTER.serialize(verificationCenter.anchor, jsonGenerator, true);
            }
            if (verificationCenter.identity != null) {
                jsonGenerator.writeFieldName("identity");
                Identity.JSON_ADAPTER.serialize(verificationCenter.identity, jsonGenerator, true);
            }
            if (verificationCenter.idCard != null) {
                jsonGenerator.writeFieldName("idCard");
                IdCardVerificationInfo.JSON_ADAPTER.serialize(verificationCenter.idCard, jsonGenerator, true);
            }
            if (verificationCenter.ageVerificationInfo != null) {
                jsonGenerator.writeFieldName(SeeTextDynamicParam.age);
                AgeVerificationInfo.JSON_ADAPTER.serialize(verificationCenter.ageVerificationInfo, jsonGenerator, true);
            }
            if (verificationCenter.voiceAnchor != null) {
                jsonGenerator.writeFieldName("voiceAnchor");
                VoiceAnchorVerifyResult.JSON_ADAPTER.serialize(verificationCenter.voiceAnchor, jsonGenerator, true);
            }
            if (verificationCenter.ctdidVerificationInfo != null) {
                jsonGenerator.writeFieldName("ctdid");
                PicVerificationInfo.JSON_ADAPTER.serialize(verificationCenter.ctdidVerificationInfo, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<VerificationCenter> _ID = new LongColumn<VerificationCenter>("_id") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(VerificationCenter verificationCenter) {
            return Long.valueOf(verificationCenter._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(VerificationCenter verificationCenter, Long l2) {
            verificationCenter._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<VerificationCenter> f20528ID = new StringColumn<VerificationCenter>("id_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(VerificationCenter verificationCenter) {
            return verificationCenter.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(VerificationCenter verificationCenter, String str) {
            verificationCenter.f56011id = str;
        }
    };
    public static final StringColumn<VerificationCenter> USERID = new StringColumn<VerificationCenter>("userId_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(VerificationCenter verificationCenter) {
            return verificationCenter.userId;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(VerificationCenter verificationCenter, String str) {
            verificationCenter.userId = str;
        }
    };
    public static final StringColumn<VerificationCenter> VERIFICATIONTYPE = new StringColumn<VerificationCenter>("verificationType_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(VerificationCenter verificationCenter) {
            return verificationCenter.verificationType;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(VerificationCenter verificationCenter, String str) {
            verificationCenter.verificationType = str;
        }
    };
    public static final Column<VerificationCenter, Picture> PICVERIFICATIONINFO_MEDIA = new Column<VerificationCenter, Picture>("picVerificationInfo_media_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.7
        @Override // com.tantanapp.common.data.orm.Column
        public Picture get(VerificationCenter verificationCenter) {
            return verificationCenter.picVerificationInfo.media;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(VerificationCenter verificationCenter, Picture picture) {
            verificationCenter.picVerificationInfo.media = picture;
        }
    };

    static {
        TEnumJsonAdapter<StudentVerificationStatus> tEnumJsonAdapter = StudentVerificationStatus.JSON_ADAPTER;
        PICVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_picVerificationInfo_status_c", "picVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.8
            @Override // com.tantanapp.common.data.orm.Column
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.picVerificationInfo.status;
            }

            @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.picVerificationInfo.status = studentVerificationStatus;
            }
        };
        IDCARD = new Column<VerificationCenter, IdCardVerificationInfo>("idCard_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.9
            @Override // com.tantanapp.common.data.orm.Column
            public IdCardVerificationInfo get(VerificationCenter verificationCenter) {
                return verificationCenter.idCard;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(VerificationCenter verificationCenter, IdCardVerificationInfo idCardVerificationInfo) {
                verificationCenter.idCard = idCardVerificationInfo;
            }
        };
        AGEVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_ageVerificationInfo_status_c", "ageVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.10
            @Override // com.tantanapp.common.data.orm.Column
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.ageVerificationInfo.status;
            }

            @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.ageVerificationInfo.status = studentVerificationStatus;
            }
        };
        VOICEANCHOR_STATUS = new StringColumn<VerificationCenter>("voiceAnchor_status_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.11
            @Override // com.tantanapp.common.data.orm.Column
            public String get(VerificationCenter verificationCenter) {
                return verificationCenter.voiceAnchor.status;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(VerificationCenter verificationCenter, String str) {
                verificationCenter.voiceAnchor.status = str;
            }
        };
        CTDIDVERIFICATIONINFO_MEDIA = new Column<VerificationCenter, Picture>("ctdidVerificationInfo_media_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.12
            @Override // com.tantanapp.common.data.orm.Column
            public Picture get(VerificationCenter verificationCenter) {
                return verificationCenter.ctdidVerificationInfo.media;
            }

            @Override // com.tantanapp.common.data.orm.Column
            public void set(VerificationCenter verificationCenter, Picture picture) {
                verificationCenter.ctdidVerificationInfo.media = picture;
            }
        };
        CTDIDVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_ctdidVerificationInfo_status_c", "ctdidVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.13
            @Override // com.tantanapp.common.data.orm.Column
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.ctdidVerificationInfo.status;
            }

            @Override // com.p046p1.mobile.putong.data.tenum.TEnumColumn
            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.ctdidVerificationInfo.status = studentVerificationStatus;
            }
        };
        DB_ADAPTER = new mrf0<VerificationCenter>() { // from class: com.p1.mobile.putong.core.data.VerificationCenter.14
            @Override // p149l.mrf0
            public String CREATE_TABLE(orh0 orh0Var) {
                return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,userId_c TEXT,verificationType_c TEXT,picVerificationInfo_media_c BLOB,picVerificationInfo_status_c INTEGER,idCard_c BLOB,ageVerificationInfo_status_c INTEGER,voiceAnchor_status_c TEXT,str_picVerificationInfo_status_c TEXT,str_ageVerificationInfo_status_c TEXT,str_ctdidVerificationInfo_status_c TEXT,ctdidVerificationInfo_media_c BLOB,ctdidVerificationInfo_status_c INTEGER)";
            }

            @Override // p149l.mrf0
            public Class getDataClass() {
                return VerificationCenter.class;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p149l.mrf0
            public VerificationCenter init() {
                VerificationCenter verificationCenter = new VerificationCenter();
                if (verificationCenter.userId == null) {
                    verificationCenter.userId = "";
                }
                if (verificationCenter.verificationType == null) {
                    verificationCenter.verificationType = "";
                }
                if (verificationCenter.picVerificationInfo == null) {
                    verificationCenter.picVerificationInfo = PicVerificationInfo.new_();
                }
                if (verificationCenter.ageVerificationInfo == null) {
                    verificationCenter.ageVerificationInfo = AgeVerificationInfo.new_();
                }
                if (verificationCenter.voiceAnchor == null) {
                    verificationCenter.voiceAnchor = VoiceAnchorVerifyResult.new_();
                }
                if (verificationCenter.ctdidVerificationInfo == null) {
                    verificationCenter.ctdidVerificationInfo = PicVerificationInfo.new_();
                }
                return verificationCenter;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p149l.mrf0
            public VerificationCenter read(Cursor cursor, int i) {
                String str;
                String string;
                int i2;
                int i3;
                int i4;
                String string2;
                String string3 = "unknown_";
                if (i == 0) {
                    this.readIndex = 0;
                }
                VerificationCenter verificationCenter = new VerificationCenter();
                int i5 = -1;
                try {
                    verificationCenter.picVerificationInfo = new PicVerificationInfo();
                    verificationCenter.ageVerificationInfo = new AgeVerificationInfo();
                    verificationCenter.voiceAnchor = new VoiceAnchorVerifyResult();
                    verificationCenter.ctdidVerificationInfo = new PicVerificationInfo();
                    verificationCenter._id = cursor.getLong(i);
                    int i6 = i + 1;
                    Picture picture = null;
                    verificationCenter.f56011id = cursor.isNull(i6) ? null : cursor.getString(i6);
                    int i7 = i + 2;
                    verificationCenter.userId = cursor.isNull(i7) ? null : cursor.getString(i7);
                    int i8 = i + 3;
                    verificationCenter.verificationType = cursor.isNull(i8) ? null : cursor.getString(i8);
                    int i9 = i + 4;
                    verificationCenter.picVerificationInfo.media = cursor.isNull(i9) ? null : Picture.PROTOBUF_ADAPTER.parse(cursor.getBlob(i9));
                    int i10 = i + 5;
                    i4 = cursor.isNull(i10) ? -1 : cursor.getInt(i10);
                    int i11 = i + 6;
                    try {
                        verificationCenter.idCard = cursor.isNull(i11) ? null : IdCardVerificationInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i11));
                        int i12 = i + 7;
                        i3 = cursor.isNull(i12) ? -1 : cursor.getInt(i12);
                        int i13 = i + 8;
                        try {
                            verificationCenter.voiceAnchor.status = cursor.isNull(i13) ? null : cursor.getString(i13);
                            int i14 = i + 9;
                            string2 = cursor.isNull(i14) ? null : cursor.getString(i14);
                            int i15 = i + 10;
                            try {
                                string = cursor.isNull(i15) ? null : cursor.getString(i15);
                                int i16 = i + 11;
                                try {
                                    string3 = cursor.isNull(i16) ? null : cursor.getString(i16);
                                    int i17 = i + 12;
                                    PicVerificationInfo picVerificationInfo = verificationCenter.ctdidVerificationInfo;
                                    if (!cursor.isNull(i17)) {
                                        picture = Picture.PROTOBUF_ADAPTER.parse(cursor.getBlob(i17));
                                    }
                                    picVerificationInfo.media = picture;
                                    int i18 = i + 13;
                                    if (!cursor.isNull(i18)) {
                                        i5 = cursor.getInt(i18);
                                    }
                                    this.readIndex = i + 14;
                                } catch (Exception e) {
                                    e = e;
                                    int i19 = i4;
                                    i2 = i5;
                                    i5 = i19;
                                    str = string3;
                                    string3 = string2;
                                    MessageNano.reportError(e, cursor);
                                    int i20 = i2;
                                    i4 = i5;
                                    i5 = i20;
                                    string2 = string3;
                                    string3 = str;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                int i21 = i4;
                                i2 = -1;
                                i5 = i21;
                                str = "unknown_";
                                string = str;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            int i22 = i4;
                            i2 = -1;
                            i5 = i22;
                            str = "unknown_";
                            string = str;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        str = "unknown_";
                        string = str;
                        i3 = -1;
                        i5 = i4;
                        i2 = -1;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = "unknown_";
                    string = str;
                    i2 = -1;
                    i3 = -1;
                }
                PicVerificationInfo picVerificationInfo2 = verificationCenter.picVerificationInfo;
                TEnumJsonAdapter<StudentVerificationStatus> tEnumJsonAdapter2 = StudentVerificationStatus.JSON_ADAPTER;
                picVerificationInfo2.status = (StudentVerificationStatus) tEnumJsonAdapter2.newTEnum(string2, i4);
                verificationCenter.ageVerificationInfo.status = (StudentVerificationStatus) tEnumJsonAdapter2.newTEnum(string, i3);
                verificationCenter.ctdidVerificationInfo.status = (StudentVerificationStatus) tEnumJsonAdapter2.newTEnum(string3, i5);
                if (verificationCenter.userId == null) {
                    verificationCenter.userId = "";
                }
                if (verificationCenter.verificationType == null) {
                    verificationCenter.verificationType = "";
                }
                if (verificationCenter.picVerificationInfo == null) {
                    verificationCenter.picVerificationInfo = PicVerificationInfo.new_();
                }
                if (verificationCenter.ageVerificationInfo == null) {
                    verificationCenter.ageVerificationInfo = AgeVerificationInfo.new_();
                }
                if (verificationCenter.voiceAnchor == null) {
                    verificationCenter.voiceAnchor = VoiceAnchorVerifyResult.new_();
                }
                if (verificationCenter.ctdidVerificationInfo == null) {
                    verificationCenter.ctdidVerificationInfo = PicVerificationInfo.new_();
                }
                return verificationCenter;
            }

            @Override // p149l.mrf0
            public void write(VerificationCenter verificationCenter, ContentValues contentValues) {
                try {
                    DbObject.cvPut(contentValues, "id_c", verificationCenter.f56011id);
                    DbObject.cvPut(contentValues, "userId_c", verificationCenter.userId);
                    DbObject.cvPut(contentValues, "verificationType_c", verificationCenter.verificationType);
                    Picture picture = verificationCenter.picVerificationInfo.media;
                    DbObject.cvPut(contentValues, "picVerificationInfo_media_c", picture == null ? null : Picture.PROTOBUF_ADAPTER.serialize(picture));
                    StudentVerificationStatus studentVerificationStatus = verificationCenter.picVerificationInfo.status;
                    DbObject.cvPut(contentValues, "str_picVerificationInfo_status_c", studentVerificationStatus == null ? null : studentVerificationStatus.toString());
                    StudentVerificationStatus studentVerificationStatus2 = verificationCenter.picVerificationInfo.status;
                    DbObject.cvPut(contentValues, "picVerificationInfo_status_c", studentVerificationStatus2 == null ? null : Integer.valueOf(studentVerificationStatus2.ordinal()));
                    IdCardVerificationInfo idCardVerificationInfo = verificationCenter.idCard;
                    DbObject.cvPut(contentValues, "idCard_c", idCardVerificationInfo == null ? null : IdCardVerificationInfo.PROTOBUF_ADAPTER.serialize(idCardVerificationInfo));
                    StudentVerificationStatus studentVerificationStatus3 = verificationCenter.ageVerificationInfo.status;
                    DbObject.cvPut(contentValues, "str_ageVerificationInfo_status_c", studentVerificationStatus3 == null ? null : studentVerificationStatus3.toString());
                    StudentVerificationStatus studentVerificationStatus4 = verificationCenter.ageVerificationInfo.status;
                    DbObject.cvPut(contentValues, "ageVerificationInfo_status_c", studentVerificationStatus4 == null ? null : Integer.valueOf(studentVerificationStatus4.ordinal()));
                    DbObject.cvPut(contentValues, "voiceAnchor_status_c", verificationCenter.voiceAnchor.status);
                    Picture picture2 = verificationCenter.ctdidVerificationInfo.media;
                    DbObject.cvPut(contentValues, "ctdidVerificationInfo_media_c", picture2 == null ? null : Picture.PROTOBUF_ADAPTER.serialize(picture2));
                    StudentVerificationStatus studentVerificationStatus5 = verificationCenter.ctdidVerificationInfo.status;
                    DbObject.cvPut(contentValues, "str_ctdidVerificationInfo_status_c", studentVerificationStatus5 == null ? null : studentVerificationStatus5.toString());
                    StudentVerificationStatus studentVerificationStatus6 = verificationCenter.ctdidVerificationInfo.status;
                    DbObject.cvPut(contentValues, "ctdidVerificationInfo_status_c", studentVerificationStatus6 == null ? null : Integer.valueOf(studentVerificationStatus6.ordinal()));
                } catch (Exception e) {
                    MessageNano.reportError(e, null);
                }
            }
        };
    }

    public static VerificationCenter new_() {
        VerificationCenter verificationCenter = new VerificationCenter();
        verificationCenter.nullCheck();
        return verificationCenter;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public VerificationCenter mo223809clone() {
        VerificationCenter verificationCenter = new VerificationCenter();
        verificationCenter._id = this._id;
        verificationCenter.f56011id = this.f56011id;
        verificationCenter.userId = this.userId;
        verificationCenter.verificationType = this.verificationType;
        PicVerificationInfo picVerificationInfo = this.picVerificationInfo;
        if (picVerificationInfo != null) {
            verificationCenter.picVerificationInfo = picVerificationInfo.mo223809clone();
        }
        LiveAnchor liveAnchor = this.anchor;
        if (liveAnchor != null) {
            verificationCenter.anchor = liveAnchor.mo223809clone();
        }
        Identity identity = this.identity;
        if (identity != null) {
            verificationCenter.identity = identity.mo223809clone();
        }
        IdCardVerificationInfo idCardVerificationInfo = this.idCard;
        if (idCardVerificationInfo != null) {
            verificationCenter.idCard = idCardVerificationInfo.mo223809clone();
        }
        AgeVerificationInfo ageVerificationInfo = this.ageVerificationInfo;
        if (ageVerificationInfo != null) {
            verificationCenter.ageVerificationInfo = ageVerificationInfo.mo223809clone();
        }
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = this.voiceAnchor;
        if (voiceAnchorVerifyResult != null) {
            verificationCenter.voiceAnchor = voiceAnchorVerifyResult.mo223809clone();
        }
        PicVerificationInfo picVerificationInfo2 = this.ctdidVerificationInfo;
        if (picVerificationInfo2 != null) {
            verificationCenter.ctdidVerificationInfo = picVerificationInfo2.mo223809clone();
        }
        return verificationCenter;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VerificationCenter)) {
            return false;
        }
        VerificationCenter verificationCenter = (VerificationCenter) obj;
        return super.equals(obj) && ValueObject.util_equals(this.userId, verificationCenter.userId) && ValueObject.util_equals(this.verificationType, verificationCenter.verificationType) && ValueObject.util_equals(this.picVerificationInfo, verificationCenter.picVerificationInfo) && ValueObject.util_equals(this.anchor, verificationCenter.anchor) && ValueObject.util_equals(this.identity, verificationCenter.identity) && ValueObject.util_equals(this.idCard, verificationCenter.idCard) && ValueObject.util_equals(this.ageVerificationInfo, verificationCenter.ageVerificationInfo) && ValueObject.util_equals(this.voiceAnchor, verificationCenter.voiceAnchor) && ValueObject.util_equals(this.ctdidVerificationInfo, verificationCenter.ctdidVerificationInfo);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "verificationcenter";
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        String str = this.userId;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.verificationType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        PicVerificationInfo picVerificationInfo = this.picVerificationInfo;
        int iHashCode4 = (iHashCode3 + (picVerificationInfo != null ? picVerificationInfo.hashCode() : 0)) * 41;
        LiveAnchor liveAnchor = this.anchor;
        int iHashCode5 = (iHashCode4 + (liveAnchor != null ? liveAnchor.hashCode() : 0)) * 41;
        Identity identity = this.identity;
        int iHashCode6 = (iHashCode5 + (identity != null ? identity.hashCode() : 0)) * 41;
        IdCardVerificationInfo idCardVerificationInfo = this.idCard;
        int iHashCode7 = (iHashCode6 + (idCardVerificationInfo != null ? idCardVerificationInfo.hashCode() : 0)) * 41;
        AgeVerificationInfo ageVerificationInfo = this.ageVerificationInfo;
        int iHashCode8 = (iHashCode7 + (ageVerificationInfo != null ? ageVerificationInfo.hashCode() : 0)) * 41;
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = this.voiceAnchor;
        int iHashCode9 = (iHashCode8 + (voiceAnchorVerifyResult != null ? voiceAnchorVerifyResult.hashCode() : 0)) * 41;
        PicVerificationInfo picVerificationInfo2 = this.ctdidVerificationInfo;
        int iHashCode10 = iHashCode9 + (picVerificationInfo2 != null ? picVerificationInfo2.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.userId == null) {
            this.userId = "";
        }
        if (this.verificationType == null) {
            this.verificationType = "";
        }
        if (this.picVerificationInfo == null) {
            this.picVerificationInfo = PicVerificationInfo.new_();
        }
        if (this.ageVerificationInfo == null) {
            this.ageVerificationInfo = AgeVerificationInfo.new_();
        }
        if (this.voiceAnchor == null) {
            this.voiceAnchor = VoiceAnchorVerifyResult.new_();
        }
        if (this.ctdidVerificationInfo == null) {
            this.ctdidVerificationInfo = PicVerificationInfo.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
