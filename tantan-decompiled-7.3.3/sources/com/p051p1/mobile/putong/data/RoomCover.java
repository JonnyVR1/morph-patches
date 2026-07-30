package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
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
            int iM17285l = picture != null ? CodedOutputByteBufferNano.m17285l(1, picture, Picture.PROTOBUF_ADAPTER) : 0;
            RoomCoverStatus roomCoverStatus = roomCover.status;
            if (roomCoverStatus != null) {
                iM17285l += CodedOutputByteBufferNano.m17281h(2, roomCoverStatus.ordinal());
            }
            int iM17275b = iM17285l + CodedOutputByteBufferNano.m17275b(3, roomCover.isDefaultCover);
            RoomCoverStatus roomCoverStatus2 = roomCover.status;
            if (roomCoverStatus2 != null) {
                iM17275b += CodedOutputByteBufferNano.m17285l(4, roomCoverStatus2, RoomCoverStatus.PROTOBUF_ADAPTER);
            }
            roomCover.cachedSize = iM17275b;
            return iM17275b;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public RoomCover parse(nc5 nc5Var) throws IOException {
            RoomCover roomCover = new RoomCover();
            Integer numValueOf = null;
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
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
                if (iM162497u == 10) {
                    roomCover.media = (Picture) nc5Var.m162488l(Picture.PROTOBUF_ADAPTER);
                } else if (iM162497u == 16) {
                    numValueOf = Integer.valueOf(nc5Var.m162486j());
                } else if (iM162497u == 24) {
                    roomCover.isDefaultCover = nc5Var.m162483g();
                } else {
                    if (iM162497u != 34) {
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
                    roomCover.status = (RoomCoverStatus) nc5Var.m162488l(RoomCoverStatus.PROTOBUF_ADAPTER);
                }
            }
            return roomCover;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(RoomCover roomCover, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Picture picture = roomCover.media;
            if (picture != null) {
                codedOutputByteBufferNano.m17309K(1, picture, Picture.PROTOBUF_ADAPTER);
            }
            RoomCoverStatus roomCoverStatus = roomCover.status;
            if (roomCoverStatus != null) {
                codedOutputByteBufferNano.m17305G(2, roomCoverStatus.ordinal());
            }
            codedOutputByteBufferNano.m17299A(3, roomCover.isDefaultCover);
            RoomCoverStatus roomCoverStatus2 = roomCover.status;
            if (roomCoverStatus2 != null) {
                codedOutputByteBufferNano.m17309K(4, roomCoverStatus2, RoomCoverStatus.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<RoomCover> JSON_ADAPTER = new ObjectJsonAdapter<RoomCover>() { // from class: com.p1.mobile.putong.data.RoomCover.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return RoomCover.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((RoomCover) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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
    public RoomCover mo225055clone() {
        RoomCover roomCover = new RoomCover();
        Picture picture = this.media;
        if (picture != null) {
            roomCover.media = picture.mo225055clone();
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
