package com.p046p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
public class RoomCover extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "roomcover";

    @ProtobufIndex(index = 3)
    public boolean isDefaultCover;

    @NonNull
    @ProtobufIndex(index = 1)
    public Picture media;

    @NonNull
    @ProtobufIndex(index = 2)
    public RoomCoverStatus status;
    public static ProtobufAdapter<RoomCover> PROTOBUF_ADAPTER = new MessageNanoAdapter<RoomCover>() { // from class: com.p1.mobile.putong.data.RoomCover.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(RoomCover roomCover) {
            Picture picture = roomCover.media;
            int iM17230l = picture != null ? CodedOutputByteBufferNano.m17230l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            RoomCoverStatus roomCoverStatus = roomCover.status;
            if (roomCoverStatus != null) {
                iM17230l += CodedOutputByteBufferNano.m17226h(2, roomCoverStatus.ordinal());
            }
            int iM17220b = iM17230l + CodedOutputByteBufferNano.m17220b(3, roomCover.isDefaultCover);
            RoomCoverStatus roomCoverStatus2 = roomCover.status;
            if (roomCoverStatus2 != null) {
                iM17220b += CodedOutputByteBufferNano.m17230l(4, roomCoverStatus2, RoomCoverStatus.PROTOBUF_ADAPTER);
            }
            roomCover.cachedSize = iM17220b;
            return iM17220b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RoomCover parse(nb5 nb5Var) throws IOException {
            RoomCover roomCover = new RoomCover();
            Integer numValueOf = null;
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (roomCover.status == null && numValueOf != null) {
                        roomCover.status = (RoomCoverStatus) RoomCoverStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                    }
                    if (roomCover.media == null) {
                        roomCover.media = Picture.new_();
                    }
                    if (roomCover.status != null) {
                        break;
                    }
                    roomCover.status = (RoomCoverStatus) RoomCoverStatus.JSON_ADAPTER.defaultEnum();
                    break;
                }
                if (iM158752u == 10) {
                    roomCover.media = (Picture) nb5Var.m158743l(Picture.PROTOBUF_ADAPTER);
                } else if (iM158752u == 16) {
                    numValueOf = Integer.valueOf(nb5Var.m158741j());
                } else if (iM158752u == 24) {
                    roomCover.isDefaultCover = nb5Var.m158738g();
                } else {
                    if (iM158752u != 34) {
                        if (roomCover.status == null && numValueOf != null) {
                            roomCover.status = (RoomCoverStatus) RoomCoverStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (roomCover.media == null) {
                            roomCover.media = Picture.new_();
                        }
                        if (roomCover.status != null) {
                            break;
                        }
                        roomCover.status = (RoomCoverStatus) RoomCoverStatus.JSON_ADAPTER.defaultEnum();
                        return roomCover;
                    }
                    roomCover.status = (RoomCoverStatus) nb5Var.m158743l(RoomCoverStatus.PROTOBUF_ADAPTER);
                }
            }
            return roomCover;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RoomCover roomCover, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = roomCover.media;
            if (picture != null) {
                codedOutputByteBufferNano.m17254K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            RoomCoverStatus roomCoverStatus = roomCover.status;
            if (roomCoverStatus != null) {
                codedOutputByteBufferNano.m17250G(2, roomCoverStatus.ordinal());
            }
            codedOutputByteBufferNano.m17244A(3, roomCover.isDefaultCover);
            RoomCoverStatus roomCoverStatus2 = roomCover.status;
            if (roomCoverStatus2 != null) {
                codedOutputByteBufferNano.m17254K(4, roomCoverStatus2, RoomCoverStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RoomCover> JSON_ADAPTER = new ObjectJsonAdapter<RoomCover>() { // from class: com.p1.mobile.putong.data.RoomCover.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RoomCover.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public RoomCover newInstance() {
            return new RoomCover();
        }

        public boolean parseField(RoomCover roomCover, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "isDefaultCover":
                    roomCover.isDefaultCover = jsonParser.getValueAsBoolean();
                    return true;
                case "status":
                    roomCover.status = RoomCoverStatus.JSON_ADAPTER.parse(jsonParser, str2);
                    return true;
                case "media":
                    roomCover.media = Converter.RAW_PICTURE_TO_PICTURE.parse(jsonParser, str2);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(RoomCover roomCover, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "isDefaultCover":
                case "status":
                case "media":
                    return true;
                default:
                    return super.parseFieldCheck(roomCover, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(RoomCover roomCover, JsonGenerator jsonGenerator) throws IOException {
            if (roomCover.media != null) {
                jsonGenerator.writeFieldName("media");
                Converter.RAW_PICTURE_TO_PICTURE.serialize(roomCover.media, jsonGenerator, true);
            }
            if (roomCover.status != null) {
                jsonGenerator.writeFieldName(NotificationCompat.CATEGORY_STATUS);
                RoomCoverStatus.JSON_ADAPTER.serialize(roomCover.status, jsonGenerator, true);
            }
            jsonGenerator.writeBooleanField("isDefaultCover", roomCover.isDefaultCover);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RoomCover) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((RoomCover) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static RoomCover new_() {
        RoomCover roomCover = new RoomCover();
        roomCover.nullCheck();
        return roomCover;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public RoomCover mo223809clone() {
        RoomCover roomCover = new RoomCover();
        Picture picture = this.media;
        if (picture != null) {
            roomCover.media = picture.mo223809clone();
        }
        roomCover.status = this.status;
        roomCover.isDefaultCover = this.isDefaultCover;
        return roomCover;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RoomCover)) {
            return false;
        }
        RoomCover roomCover = (RoomCover) obj;
        return ValueObject.util_equals(this.media, roomCover.media) && ValueObject.util_equals(this.status, roomCover.status) && this.isDefaultCover == roomCover.isDefaultCover;
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
        Picture picture = this.media;
        int iHashCode = (i2 + (picture != null ? picture.hashCode() : 0)) * 41;
        RoomCoverStatus roomCoverStatus = this.status;
        int iHashCode2 = ((iHashCode + (roomCoverStatus != null ? roomCoverStatus.hashCode() : 0)) * 41) + (this.isDefaultCover ? 1231 : 1237);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.media == null) {
            this.media = Picture.new_();
        }
        if (this.status == null) {
            this.status = (RoomCoverStatus) RoomCoverStatus.JSON_ADAPTER.defaultEnum();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
