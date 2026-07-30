package com.p000p1.mobile.putong.core.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnumColumn;
import com.p1.mobile.putong.data.tenum.TEnumJsonAdapter;
import com.p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import l.mrf0;
import l.nb5;
import l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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
    @ProtobufIndex(index = Conversation.TAG_LEVEL_TOP)
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(VerificationCenter verificationCenter) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) verificationCenter)._id);
            String str = ((DbObject) verificationCenter).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = verificationCenter.userId;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = verificationCenter.verificationType;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            PicVerificationInfo picVerificationInfo = verificationCenter.picVerificationInfo;
            if (picVerificationInfo != null) {
                iJ += CodedOutputByteBufferNano.l(53, picVerificationInfo, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            IdCardVerificationInfo idCardVerificationInfo = verificationCenter.idCard;
            if (idCardVerificationInfo != null) {
                iJ += CodedOutputByteBufferNano.l(54, idCardVerificationInfo, IdCardVerificationInfo.PROTOBUF_ADAPTER);
            }
            AgeVerificationInfo ageVerificationInfo = verificationCenter.ageVerificationInfo;
            if (ageVerificationInfo != null) {
                iJ += CodedOutputByteBufferNano.l(55, ageVerificationInfo, AgeVerificationInfo.PROTOBUF_ADAPTER);
            }
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = verificationCenter.voiceAnchor;
            if (voiceAnchorVerifyResult != null) {
                iJ += CodedOutputByteBufferNano.l(56, voiceAnchorVerifyResult, VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
            }
            PicVerificationInfo picVerificationInfo2 = verificationCenter.ctdidVerificationInfo;
            if (picVerificationInfo2 != null) {
                iJ += CodedOutputByteBufferNano.l(57, picVerificationInfo2, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            ((MessageNano) verificationCenter).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public VerificationCenter m16204parse(nb5 nb5Var) throws IOException {
            VerificationCenter verificationCenter = new VerificationCenter();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
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
                if (iU == 8) {
                    ((DbObject) verificationCenter)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) verificationCenter).id = nb5Var.s();
                } else if (iU == 410) {
                    verificationCenter.userId = nb5Var.s();
                } else if (iU == 418) {
                    verificationCenter.verificationType = nb5Var.s();
                } else if (iU == 426) {
                    verificationCenter.picVerificationInfo = (PicVerificationInfo) nb5Var.l(PicVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iU == 434) {
                    verificationCenter.idCard = (IdCardVerificationInfo) nb5Var.l(IdCardVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iU == 442) {
                    verificationCenter.ageVerificationInfo = (AgeVerificationInfo) nb5Var.l(AgeVerificationInfo.PROTOBUF_ADAPTER);
                } else if (iU == 450) {
                    verificationCenter.voiceAnchor = (VoiceAnchorVerifyResult) nb5Var.l(VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 458) {
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
                    verificationCenter.ctdidVerificationInfo = (PicVerificationInfo) nb5Var.l(PicVerificationInfo.PROTOBUF_ADAPTER);
                }
            }
            return verificationCenter;
        }

        public void serialize(VerificationCenter verificationCenter, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) verificationCenter)._id);
            String str = ((DbObject) verificationCenter).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = verificationCenter.userId;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = verificationCenter.verificationType;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            PicVerificationInfo picVerificationInfo = verificationCenter.picVerificationInfo;
            if (picVerificationInfo != null) {
                codedOutputByteBufferNano.K(53, picVerificationInfo, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
            IdCardVerificationInfo idCardVerificationInfo = verificationCenter.idCard;
            if (idCardVerificationInfo != null) {
                codedOutputByteBufferNano.K(54, idCardVerificationInfo, IdCardVerificationInfo.PROTOBUF_ADAPTER);
            }
            AgeVerificationInfo ageVerificationInfo = verificationCenter.ageVerificationInfo;
            if (ageVerificationInfo != null) {
                codedOutputByteBufferNano.K(55, ageVerificationInfo, AgeVerificationInfo.PROTOBUF_ADAPTER);
            }
            VoiceAnchorVerifyResult voiceAnchorVerifyResult = verificationCenter.voiceAnchor;
            if (voiceAnchorVerifyResult != null) {
                codedOutputByteBufferNano.K(56, voiceAnchorVerifyResult, VoiceAnchorVerifyResult.PROTOBUF_ADAPTER);
            }
            PicVerificationInfo picVerificationInfo2 = verificationCenter.ctdidVerificationInfo;
            if (picVerificationInfo2 != null) {
                codedOutputByteBufferNano.K(57, picVerificationInfo2, PicVerificationInfo.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<VerificationCenter> JSON_ADAPTER = new ObjectJsonAdapter<VerificationCenter>() { // from class: com.p1.mobile.putong.core.data.VerificationCenter.2
        public Class getDataClass() {
            return VerificationCenter.class;
        }

        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public VerificationCenter m16207newInstance() {
            return new VerificationCenter();
        }

        public boolean parseField(VerificationCenter verificationCenter, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "anchor":
                    verificationCenter.anchor = (LiveAnchor) LiveAnchor.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "idCard":
                    verificationCenter.idCard = (IdCardVerificationInfo) IdCardVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "userId":
                    verificationCenter.userId = jsonParser.getValueAsString();
                    return true;
                case "voiceAnchor":
                    verificationCenter.voiceAnchor = (VoiceAnchorVerifyResult) VoiceAnchorVerifyResult.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "picture":
                    verificationCenter.picVerificationInfo = (PicVerificationInfo) PicVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "identity":
                    verificationCenter.identity = (Identity) Identity.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "id":
                    ((DbObject) verificationCenter).id = jsonParser.getValueAsString();
                    return false;
                case "age":
                    verificationCenter.ageVerificationInfo = (AgeVerificationInfo) AgeVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "type":
                    verificationCenter.verificationType = jsonParser.getValueAsString();
                    return true;
                case "ctdid":
                    verificationCenter.ctdidVerificationInfo = (PicVerificationInfo) PicVerificationInfo.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        public void serializeFields(VerificationCenter verificationCenter, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) verificationCenter).id;
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
                jsonGenerator.writeFieldName(Identity.TYPE);
                Identity.JSON_ADAPTER.serialize(verificationCenter.identity, jsonGenerator, true);
            }
            if (verificationCenter.idCard != null) {
                jsonGenerator.writeFieldName(CertificateType.idCard);
                IdCardVerificationInfo.JSON_ADAPTER.serialize(verificationCenter.idCard, jsonGenerator, true);
            }
            if (verificationCenter.ageVerificationInfo != null) {
                jsonGenerator.writeFieldName("age");
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

        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((VerificationCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((VerificationCenter) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<VerificationCenter> _ID = new LongColumn<VerificationCenter>("_id") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.3
        public Long get(VerificationCenter verificationCenter) {
            return Long.valueOf(((DbObject) verificationCenter)._id);
        }

        public void set(VerificationCenter verificationCenter, Long l2) {
            ((DbObject) verificationCenter)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<VerificationCenter> f190ID = new StringColumn<VerificationCenter>("id_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.4
        public String get(VerificationCenter verificationCenter) {
            return ((DbObject) verificationCenter).id;
        }

        public void set(VerificationCenter verificationCenter, String str) {
            ((DbObject) verificationCenter).id = str;
        }
    };
    public static final StringColumn<VerificationCenter> USERID = new StringColumn<VerificationCenter>("userId_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.5
        public String get(VerificationCenter verificationCenter) {
            return verificationCenter.userId;
        }

        public void set(VerificationCenter verificationCenter, String str) {
            verificationCenter.userId = str;
        }
    };
    public static final StringColumn<VerificationCenter> VERIFICATIONTYPE = new StringColumn<VerificationCenter>("verificationType_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.6
        public String get(VerificationCenter verificationCenter) {
            return verificationCenter.verificationType;
        }

        public void set(VerificationCenter verificationCenter, String str) {
            verificationCenter.verificationType = str;
        }
    };
    public static final Column<VerificationCenter, Picture> PICVERIFICATIONINFO_MEDIA = new Column<VerificationCenter, Picture>("picVerificationInfo_media_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.7
        public Picture get(VerificationCenter verificationCenter) {
            return verificationCenter.picVerificationInfo.media;
        }

        public void set(VerificationCenter verificationCenter, Picture picture) {
            verificationCenter.picVerificationInfo.media = picture;
        }
    };

    static {
        TEnumJsonAdapter tEnumJsonAdapter = StudentVerificationStatus.JSON_ADAPTER;
        PICVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_picVerificationInfo_status_c", "picVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.8
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.picVerificationInfo.status;
            }

            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.picVerificationInfo.status = studentVerificationStatus;
            }
        };
        IDCARD = new Column<VerificationCenter, IdCardVerificationInfo>("idCard_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.9
            public IdCardVerificationInfo get(VerificationCenter verificationCenter) {
                return verificationCenter.idCard;
            }

            public void set(VerificationCenter verificationCenter, IdCardVerificationInfo idCardVerificationInfo) {
                verificationCenter.idCard = idCardVerificationInfo;
            }
        };
        AGEVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_ageVerificationInfo_status_c", "ageVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.10
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.ageVerificationInfo.status;
            }

            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.ageVerificationInfo.status = studentVerificationStatus;
            }
        };
        VOICEANCHOR_STATUS = new StringColumn<VerificationCenter>("voiceAnchor_status_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.11
            public String get(VerificationCenter verificationCenter) {
                return verificationCenter.voiceAnchor.status;
            }

            public void set(VerificationCenter verificationCenter, String str) {
                verificationCenter.voiceAnchor.status = str;
            }
        };
        CTDIDVERIFICATIONINFO_MEDIA = new Column<VerificationCenter, Picture>("ctdidVerificationInfo_media_c") { // from class: com.p1.mobile.putong.core.data.VerificationCenter.12
            public Picture get(VerificationCenter verificationCenter) {
                return verificationCenter.ctdidVerificationInfo.media;
            }

            public void set(VerificationCenter verificationCenter, Picture picture) {
                verificationCenter.ctdidVerificationInfo.media = picture;
            }
        };
        CTDIDVERIFICATIONINFO_STATUS = new TEnumColumn<VerificationCenter, StudentVerificationStatus>("str_ctdidVerificationInfo_status_c", "ctdidVerificationInfo_status_c", tEnumJsonAdapter) { // from class: com.p1.mobile.putong.core.data.VerificationCenter.13
            public StudentVerificationStatus get(VerificationCenter verificationCenter) {
                return verificationCenter.ctdidVerificationInfo.status;
            }

            public void setTEnum(VerificationCenter verificationCenter, StudentVerificationStatus studentVerificationStatus) {
                verificationCenter.ctdidVerificationInfo.status = studentVerificationStatus;
            }
        };
        DB_ADAPTER = new mrf0<VerificationCenter>() { // from class: com.p1.mobile.putong.core.data.VerificationCenter.14
            public String CREATE_TABLE(orh0 orh0Var) {
                return "CREATE TABLE IF NOT EXISTS " + orh0Var.d + " (_id INTEGER PRIMARY KEY,id_c TEXT,userId_c TEXT,verificationType_c TEXT,picVerificationInfo_media_c BLOB,picVerificationInfo_status_c INTEGER,idCard_c BLOB,ageVerificationInfo_status_c INTEGER,voiceAnchor_status_c TEXT,str_picVerificationInfo_status_c TEXT,str_ageVerificationInfo_status_c TEXT,str_ctdidVerificationInfo_status_c TEXT,ctdidVerificationInfo_media_c BLOB,ctdidVerificationInfo_status_c INTEGER)";
            }

            public Class getDataClass() {
                return VerificationCenter.class;
            }

            /* JADX INFO: renamed from: init, reason: merged with bridge method [inline-methods] */
            public VerificationCenter m16205init() {
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

            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public VerificationCenter m16206read(Cursor cursor, int i) {
                String str;
                String string;
                int i2;
                int i3;
                int i4;
                String string2;
                String string3 = "unknown_";
                if (i == 0) {
                    ((mrf0) this).readIndex = 0;
                }
                VerificationCenter verificationCenter = new VerificationCenter();
                int i5 = -1;
                try {
                    verificationCenter.picVerificationInfo = new PicVerificationInfo();
                    verificationCenter.ageVerificationInfo = new AgeVerificationInfo();
                    verificationCenter.voiceAnchor = new VoiceAnchorVerifyResult();
                    verificationCenter.ctdidVerificationInfo = new PicVerificationInfo();
                    ((DbObject) verificationCenter)._id = cursor.getLong(i);
                    int i6 = i + 1;
                    Picture picture = null;
                    ((DbObject) verificationCenter).id = cursor.isNull(i6) ? null : cursor.getString(i6);
                    int i7 = i + 2;
                    verificationCenter.userId = cursor.isNull(i7) ? null : cursor.getString(i7);
                    int i8 = i + 3;
                    verificationCenter.verificationType = cursor.isNull(i8) ? null : cursor.getString(i8);
                    int i9 = i + 4;
                    verificationCenter.picVerificationInfo.media = cursor.isNull(i9) ? null : (Picture) Picture.PROTOBUF_ADAPTER.parse(cursor.getBlob(i9));
                    int i10 = i + 5;
                    i4 = cursor.isNull(i10) ? -1 : cursor.getInt(i10);
                    int i11 = i + 6;
                    try {
                        verificationCenter.idCard = cursor.isNull(i11) ? null : (IdCardVerificationInfo) IdCardVerificationInfo.PROTOBUF_ADAPTER.parse(cursor.getBlob(i11));
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
                                        picture = (Picture) Picture.PROTOBUF_ADAPTER.parse(cursor.getBlob(i17));
                                    }
                                    picVerificationInfo.media = picture;
                                    int i18 = i + 13;
                                    if (!cursor.isNull(i18)) {
                                        i5 = cursor.getInt(i18);
                                    }
                                    ((mrf0) this).readIndex = i + 14;
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
                TEnumJsonAdapter tEnumJsonAdapter2 = StudentVerificationStatus.JSON_ADAPTER;
                picVerificationInfo2.status = tEnumJsonAdapter2.newTEnum(string2, i4);
                verificationCenter.ageVerificationInfo.status = tEnumJsonAdapter2.newTEnum(string, i3);
                verificationCenter.ctdidVerificationInfo.status = tEnumJsonAdapter2.newTEnum(string3, i5);
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

            public void write(VerificationCenter verificationCenter, ContentValues contentValues) {
                try {
                    DbObject.cvPut(contentValues, "id_c", ((DbObject) verificationCenter).id);
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
                    MessageNano.reportError(e, (Cursor) null);
                }
            }
        };
    }

    public static VerificationCenter new_() {
        VerificationCenter verificationCenter = new VerificationCenter();
        verificationCenter.nullCheck();
        return verificationCenter;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public VerificationCenter m16203clone() {
        VerificationCenter verificationCenter = new VerificationCenter();
        ((DbObject) verificationCenter)._id = ((DbObject) this)._id;
        ((DbObject) verificationCenter).id = ((DbObject) this).id;
        verificationCenter.userId = this.userId;
        verificationCenter.verificationType = this.verificationType;
        PicVerificationInfo picVerificationInfo = this.picVerificationInfo;
        if (picVerificationInfo != null) {
            verificationCenter.picVerificationInfo = picVerificationInfo.m14766clone();
        }
        LiveAnchor liveAnchor = this.anchor;
        if (liveAnchor != null) {
            verificationCenter.anchor = liveAnchor.m13922clone();
        }
        Identity identity = this.identity;
        if (identity != null) {
            verificationCenter.identity = identity.m13436clone();
        }
        IdCardVerificationInfo idCardVerificationInfo = this.idCard;
        if (idCardVerificationInfo != null) {
            verificationCenter.idCard = idCardVerificationInfo.m13408clone();
        }
        AgeVerificationInfo ageVerificationInfo = this.ageVerificationInfo;
        if (ageVerificationInfo != null) {
            verificationCenter.ageVerificationInfo = ageVerificationInfo.m11552clone();
        }
        VoiceAnchorVerifyResult voiceAnchorVerifyResult = this.voiceAnchor;
        if (voiceAnchorVerifyResult != null) {
            verificationCenter.voiceAnchor = voiceAnchorVerifyResult.m16262clone();
        }
        PicVerificationInfo picVerificationInfo2 = this.ctdidVerificationInfo;
        if (picVerificationInfo2 != null) {
            verificationCenter.ctdidVerificationInfo = picVerificationInfo2.m14766clone();
        }
        return verificationCenter;
    }

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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
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
        ((ValueObject) this).hashCode = iHashCode10;
        return iHashCode10;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
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

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
