package com.p051p1.mobile.putong.data;

import androidx.annotation.NonNull;
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

/* JADX INFO: loaded from: classes12.dex */
public class Room extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "room";

    @Nullable
    @ProtobufIndex(index = 4)
    public RoomCover cover;

    /* JADX INFO: renamed from: id */
    @NonNull
    @ProtobufIndex(index = 1)
    public String f39658id;
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Room room) {
            String str = room.f39658id;
            int iM17288o = str != null ? CodedOutputByteBufferNano.m17288o(1, str) : 0;
            Owner owner = room.owner;
            if (owner != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = room.title;
            if (str2 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(3, str2);
            }
            RoomCover roomCover = room.cover;
            if (roomCover != null) {
                iM17288o += CodedOutputByteBufferNano.m17285l(4, roomCover, RoomCover.PROTOBUF_ADAPTER);
            }
            String str3 = room.type;
            if (str3 != null) {
                iM17288o += CodedOutputByteBufferNano.m17288o(5, str3);
            }
            room.cachedSize = iM17288o;
            return iM17288o;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Room parse(nc5 nc5Var) throws IOException {
            Room room = new Room();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (room.f39658id == null) {
                        room.f39658id = "";
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
                if (iM162497u == 10) {
                    room.f39658id = nc5Var.m162495s();
                } else if (iM162497u == 18) {
                    room.owner = (Owner) nc5Var.m162488l(Owner.PROTOBUF_ADAPTER);
                } else if (iM162497u == 26) {
                    room.title = nc5Var.m162495s();
                } else if (iM162497u == 34) {
                    room.cover = (RoomCover) nc5Var.m162488l(RoomCover.PROTOBUF_ADAPTER);
                } else {
                    if (iM162497u != 42) {
                        if (room.f39658id == null) {
                            room.f39658id = "";
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
                    room.type = nc5Var.m162495s();
                }
            }
            return room;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Room room, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            String str = room.f39658id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(1, str);
            }
            Owner owner = room.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17309K(2, owner, Owner.PROTOBUF_ADAPTER);
            }
            String str2 = room.title;
            if (str2 != null) {
                codedOutputByteBufferNano.m17316R(3, str2);
            }
            RoomCover roomCover = room.cover;
            if (roomCover != null) {
                codedOutputByteBufferNano.m17309K(4, roomCover, RoomCover.PROTOBUF_ADAPTER);
            }
            String str3 = room.type;
            if (str3 != null) {
                codedOutputByteBufferNano.m17316R(5, str3);
            }
        }
    };
    public static JsonAdapter<Room> JSON_ADAPTER = new ObjectJsonAdapter<Room>() { // from class: com.p1.mobile.putong.data.Room.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Room.class;
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Room newInstance() {
            return new Room();
        }

        public boolean parseField(Room room, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "id":
                    room.f39658id = jsonParser.getValueAsString();
                    return false;
                case "type":
                    room.type = jsonParser.getValueAsString();
                    return true;
                case "cover":
                    room.cover = RoomCover.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                    return true;
                case "owner":
                    room.owner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Room room, JsonGenerator jsonGenerator) throws IOException {
            String str = room.f39658id;
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

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Room) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Room) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static Room new_() {
        Room room = new Room();
        room.nullCheck();
        return room;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Room mo225055clone() {
        Room room = new Room();
        room.f39658id = this.f39658id;
        Owner owner = this.owner;
        if (owner != null) {
            room.owner = owner.mo225055clone();
        }
        room.title = this.title;
        RoomCover roomCover = this.cover;
        if (roomCover != null) {
            room.cover = roomCover.mo225055clone();
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
        return ValueObject.util_equals(this.f39658id, room.f39658id) && ValueObject.util_equals(this.owner, room.owner) && ValueObject.util_equals(this.title, room.title) && ValueObject.util_equals(this.cover, room.cover) && ValueObject.util_equals(this.type, room.type);
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return "room";
    }

    public String getCoverUrl() {
        return this.cover.media.url;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        String str = this.f39658id;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 41;
        Owner owner = this.owner;
        int iHashCode2 = (iHashCode + (owner != null ? owner.hashCode() : 0)) * 41;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        RoomCover roomCover = this.cover;
        int iHashCode4 = (iHashCode3 + (roomCover != null ? roomCover.hashCode() : 0)) * 41;
        String str3 = this.type;
        int iHashCode5 = iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.f39658id == null) {
            this.f39658id = "";
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

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
