package com.p000p1.mobile.putong.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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
public class Room extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "room";

    @Nullable
    @ProtobufIndex(index = 4)
    public RoomCover cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f271id;
    public String mTempTitle;

    @NonNull
    @ProtobufIndex(index = 2)
    public Owner owner;

    @NonNull
    @ProtobufIndex(index = 3)
    public String title;

    @NonNull
    @ProtobufIndex(index = 5)
    public String type;
    public static final Room EMPTY = new_();
    public static ProtobufAdapter<Room> PROTOBUF_ADAPTER = new MessageNanoAdapter<Room>() { // from class: com.p1.mobile.putong.data.Room.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Room room) {
            String str = room.f271id;
            int iO = str != null ? CodedOutputByteBufferNano.o(1, str) : 0;
            Owner owner = room.owner;
            if (owner != null) {
                iO += CodedOutputByteBufferNano.l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = room.title;
            if (str2 != null) {
                iO += CodedOutputByteBufferNano.o(3, str2);
            }
            RoomCover roomCover = room.cover;
            if (roomCover != null) {
                iO += CodedOutputByteBufferNano.l(4, roomCover, RoomCover.PROTOBUF_ADAPTER);
            }
            String str3 = room.type;
            if (str3 != null) {
                iO += CodedOutputByteBufferNano.o(5, str3);
            }
            ((MessageNano) room).cachedSize = iO;
            return iO;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Room m18917parse(nb5 nb5Var) throws IOException {
            Room room = new Room();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (room.f271id == null) {
                        room.f271id = "";
                    }
                    if (room.owner == null) {
                        room.owner = Owner.new_();
                    }
                    if (room.title == null) {
                        room.title = "";
                    }
                    if (room.type != null) {
                        break;
                    }
                    room.type = "";
                    break;
                }
                if (iU == 10) {
                    room.f271id = nb5Var.s();
                } else if (iU == 18) {
                    room.owner = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                } else if (iU == 26) {
                    room.title = nb5Var.s();
                } else if (iU == 34) {
                    room.cover = (RoomCover) nb5Var.l(RoomCover.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 42) {
                        if (room.f271id == null) {
                            room.f271id = "";
                        }
                        if (room.owner == null) {
                            room.owner = Owner.new_();
                        }
                        if (room.title == null) {
                            room.title = "";
                        }
                        if (room.type != null) {
                            break;
                        }
                        room.type = "";
                        return room;
                    }
                    room.type = nb5Var.s();
                }
            }
            return room;
        }

        public void serialize(Room room, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = room.f271id;
            if (str != null) {
                codedOutputByteBufferNano.R(1, str);
            }
            Owner owner = room.owner;
            if (owner != null) {
                codedOutputByteBufferNano.K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = room.title;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            RoomCover roomCover = room.cover;
            if (roomCover != null) {
                codedOutputByteBufferNano.K(4, roomCover, RoomCover.PROTOBUF_ADAPTER);
            }
            String str3 = room.type;
            if (str3 != null) {
                codedOutputByteBufferNano.R(5, str3);
            }
        }
    };
    public static JsonAdapter<Room> JSON_ADAPTER = new ObjectJsonAdapter<Room>() { // from class: com.p1.mobile.putong.data.Room.2
        public Class getDataClass() {
            return Room.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public Room mo17830newInstance() {
            return new Room();
        }

        public boolean parseField(Room room, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    room.f271id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    room.type = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    room.cover = (RoomCover) RoomCover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    room.owner = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "title":
                    room.title = jsonParser.getValueAsString();
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Room room, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "id":
                    return false;
                case "type":
                case "cover":
                case "owner":
                case "title":
                    return true;
                default:
                    return super.parseFieldCheck(room, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Room room, JsonGenerator jsonGenerator) throws IOException {
            String str = room.f271id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            if (room.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Owner.JSON_ADAPTER.serialize(room.owner, jsonGenerator, true);
            }
            String str2 = room.title;
            if (str2 != null) {
                jsonGenerator.writeStringField("title", str2);
            }
            if (room.cover != null) {
                jsonGenerator.writeFieldName("cover");
                RoomCover.JSON_ADAPTER.serialize(room.cover, jsonGenerator, true);
            }
            String str3 = room.type;
            if (str3 != null) {
                jsonGenerator.writeStringField("type", str3);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Room) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Room) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Room new_() {
        Room room = new Room();
        room.nullCheck();
        return room;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Room m18916clone() {
        Room room = new Room();
        room.f271id = this.f271id;
        Owner owner = this.owner;
        if (owner != null) {
            room.owner = owner.m18761clone();
        }
        room.title = this.title;
        RoomCover roomCover = this.cover;
        if (roomCover != null) {
            room.cover = roomCover.m18919clone();
        }
        room.type = this.type;
        return room;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Room)) {
            return false;
        }
        Room room = (Room) obj;
        return ValueObject.util_equals(this.f271id, room.f271id) && ValueObject.util_equals(this.owner, room.owner) && ValueObject.util_equals(this.title, room.title) && ValueObject.util_equals(this.cover, room.cover) && ValueObject.util_equals(this.type, room.type);
    }

    public String getClassParseName() {
        return TYPE;
    }

    public String getCoverUrl() {
        return this.cover.media.url;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f271id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.owner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        RoomCover roomCover = this.cover;
        int iHashCode4 = (iHashCode3 + (roomCover != null ? roomCover.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode5;
        return iHashCode5;
    }

    public void nullCheck() {
        if (this.f271id == null) {
            this.f271id = "";
        }
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.title == null) {
            this.title = "";
        }
        if (this.type == null) {
            this.type = "";
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
