package com.p046p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.p046p1.mobile.putong.data.Owner;
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
public class PersonAlbumBgInfo extends ValueObject implements Cloneable, Serializable {
    public static final String TYPE = "personalbumbginfo";

    @NonNull
    @ProtobufIndex(index = 2)
    public PersonAlbumBgInfoMedia albumBackground;

    @NonNull
    @ProtobufIndex(index = 1)
    public Owner owner;
    public static ProtobufAdapter<PersonAlbumBgInfo> PROTOBUF_ADAPTER = new MessageNanoAdapter<PersonAlbumBgInfo>() { // from class: com.p1.mobile.putong.feed.data.PersonAlbumBgInfo.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(PersonAlbumBgInfo personAlbumBgInfo) {
            Owner owner = personAlbumBgInfo.owner;
            int iM17230l = owner != null ? CodedOutputByteBufferNano.m17230l(1, owner, Owner.PROTOBUF_ADAPTER) : 0;
            PersonAlbumBgInfoMedia personAlbumBgInfoMedia = personAlbumBgInfo.albumBackground;
            if (personAlbumBgInfoMedia != null) {
                iM17230l += CodedOutputByteBufferNano.m17230l(2, personAlbumBgInfoMedia, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
            }
            personAlbumBgInfo.cachedSize = iM17230l;
            return iM17230l;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public PersonAlbumBgInfo parse(nb5 nb5Var) throws IOException {
            PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (personAlbumBgInfo.owner == null) {
                        personAlbumBgInfo.owner = Owner.new_();
                    }
                    if (personAlbumBgInfo.albumBackground != null) {
                        break;
                    }
                    personAlbumBgInfo.albumBackground = PersonAlbumBgInfoMedia.new_();
                    break;
                }
                if (iM158752u == 10) {
                    personAlbumBgInfo.owner = (Owner) nb5Var.m158743l(Owner.PROTOBUF_ADAPTER);
                } else {
                    if (iM158752u != 18) {
                        if (personAlbumBgInfo.owner == null) {
                            personAlbumBgInfo.owner = Owner.new_();
                        }
                        if (personAlbumBgInfo.albumBackground != null) {
                            break;
                        }
                        personAlbumBgInfo.albumBackground = PersonAlbumBgInfoMedia.new_();
                        return personAlbumBgInfo;
                    }
                    personAlbumBgInfo.albumBackground = (PersonAlbumBgInfoMedia) nb5Var.m158743l(PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
                }
            }
            return personAlbumBgInfo;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(PersonAlbumBgInfo personAlbumBgInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Owner owner = personAlbumBgInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.m17254K(1, owner, Owner.PROTOBUF_ADAPTER);
            }
            PersonAlbumBgInfoMedia personAlbumBgInfoMedia = personAlbumBgInfo.albumBackground;
            if (personAlbumBgInfoMedia != null) {
                codedOutputByteBufferNano.m17254K(2, personAlbumBgInfoMedia, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PersonAlbumBgInfo> JSON_ADAPTER = new ObjectJsonAdapter<PersonAlbumBgInfo>() { // from class: com.p1.mobile.putong.feed.data.PersonAlbumBgInfo.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return PersonAlbumBgInfo.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public PersonAlbumBgInfo newInstance() {
            return new PersonAlbumBgInfo();
        }

        public boolean parseField(PersonAlbumBgInfo personAlbumBgInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("albumBackground")) {
                personAlbumBgInfo.albumBackground = PersonAlbumBgInfoMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Owner.TYPE)) {
                return false;
            }
            personAlbumBgInfo.owner = Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PersonAlbumBgInfo personAlbumBgInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("albumBackground") || str.equals(Owner.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(personAlbumBgInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(PersonAlbumBgInfo personAlbumBgInfo, JsonGenerator jsonGenerator) throws IOException {
            if (personAlbumBgInfo.owner != null) {
                jsonGenerator.writeFieldName(Owner.TYPE);
                Owner.JSON_ADAPTER.serialize(personAlbumBgInfo.owner, jsonGenerator, true);
            }
            if (personAlbumBgInfo.albumBackground != null) {
                jsonGenerator.writeFieldName("albumBackground");
                PersonAlbumBgInfoMedia.JSON_ADAPTER.serialize(personAlbumBgInfo.albumBackground, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PersonAlbumBgInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PersonAlbumBgInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PersonAlbumBgInfo new_() {
        PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
        personAlbumBgInfo.nullCheck();
        return personAlbumBgInfo;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public PersonAlbumBgInfo mo223809clone() {
        PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
        Owner owner = this.owner;
        if (owner != null) {
            personAlbumBgInfo.owner = owner.mo223809clone();
        }
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = this.albumBackground;
        if (personAlbumBgInfoMedia != null) {
            personAlbumBgInfo.albumBackground = personAlbumBgInfoMedia.mo223809clone();
        }
        return personAlbumBgInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonAlbumBgInfo)) {
            return false;
        }
        PersonAlbumBgInfo personAlbumBgInfo = (PersonAlbumBgInfo) obj;
        return ValueObject.util_equals(this.owner, personAlbumBgInfo.owner) && ValueObject.util_equals(this.albumBackground, personAlbumBgInfo.albumBackground);
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
        Owner owner = this.owner;
        int iHashCode = (i2 + (owner != null ? owner.hashCode() : 0)) * 41;
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = this.albumBackground;
        int iHashCode2 = iHashCode + (personAlbumBgInfoMedia != null ? personAlbumBgInfoMedia.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.albumBackground == null) {
            this.albumBackground = PersonAlbumBgInfoMedia.new_();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
