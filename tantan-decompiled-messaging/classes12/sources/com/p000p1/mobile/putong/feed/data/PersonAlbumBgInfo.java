package com.p000p1.mobile.putong.feed.data;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.Owner;
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(PersonAlbumBgInfo personAlbumBgInfo) {
            Owner owner = personAlbumBgInfo.owner;
            int iL = owner != null ? CodedOutputByteBufferNano.l(1, owner, Owner.PROTOBUF_ADAPTER) : 0;
            PersonAlbumBgInfoMedia personAlbumBgInfoMedia = personAlbumBgInfo.albumBackground;
            if (personAlbumBgInfoMedia != null) {
                iL += CodedOutputByteBufferNano.l(2, personAlbumBgInfoMedia, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
            }
            ((MessageNano) personAlbumBgInfo).cachedSize = iL;
            return iL;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public PersonAlbumBgInfo m19699parse(nb5 nb5Var) throws IOException {
            PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (personAlbumBgInfo.owner == null) {
                        personAlbumBgInfo.owner = Owner.new_();
                    }
                    if (personAlbumBgInfo.albumBackground != null) {
                        break;
                    }
                    personAlbumBgInfo.albumBackground = PersonAlbumBgInfoMedia.new_();
                    break;
                }
                if (iU == 10) {
                    personAlbumBgInfo.owner = (Owner) nb5Var.l(Owner.PROTOBUF_ADAPTER);
                } else {
                    if (iU != 18) {
                        if (personAlbumBgInfo.owner == null) {
                            personAlbumBgInfo.owner = Owner.new_();
                        }
                        if (personAlbumBgInfo.albumBackground != null) {
                            break;
                        }
                        personAlbumBgInfo.albumBackground = PersonAlbumBgInfoMedia.new_();
                        return personAlbumBgInfo;
                    }
                    personAlbumBgInfo.albumBackground = (PersonAlbumBgInfoMedia) nb5Var.l(PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
                }
            }
            return personAlbumBgInfo;
        }

        public void serialize(PersonAlbumBgInfo personAlbumBgInfo, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            Owner owner = personAlbumBgInfo.owner;
            if (owner != null) {
                codedOutputByteBufferNano.K(1, owner, Owner.PROTOBUF_ADAPTER);
            }
            PersonAlbumBgInfoMedia personAlbumBgInfoMedia = personAlbumBgInfo.albumBackground;
            if (personAlbumBgInfoMedia != null) {
                codedOutputByteBufferNano.K(2, personAlbumBgInfoMedia, PersonAlbumBgInfoMedia.PROTOBUF_ADAPTER);
            }
        }
    };
    public static JsonAdapter<PersonAlbumBgInfo> JSON_ADAPTER = new ObjectJsonAdapter<PersonAlbumBgInfo>() { // from class: com.p1.mobile.putong.feed.data.PersonAlbumBgInfo.2
        public Class getDataClass() {
            return PersonAlbumBgInfo.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance */
        public PersonAlbumBgInfo mo17830newInstance() {
            return new PersonAlbumBgInfo();
        }

        public boolean parseField(PersonAlbumBgInfo personAlbumBgInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            if (str.equals("albumBackground")) {
                personAlbumBgInfo.albumBackground = (PersonAlbumBgInfoMedia) PersonAlbumBgInfoMedia.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
                return true;
            }
            if (!str.equals(Owner.TYPE)) {
                return false;
            }
            personAlbumBgInfo.owner = (Owner) Owner.JSON_ADAPTER.parse(jsonParser, str2, arrayList, dataChecker);
            return true;
        }

        public boolean parseFieldCheck(PersonAlbumBgInfo personAlbumBgInfo, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            if (str.equals("albumBackground") || str.equals(Owner.TYPE)) {
                return true;
            }
            return super.parseFieldCheck(personAlbumBgInfo, str, jsonParser, str2, arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
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

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((PersonAlbumBgInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((PersonAlbumBgInfo) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };

    public static PersonAlbumBgInfo new_() {
        PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
        personAlbumBgInfo.nullCheck();
        return personAlbumBgInfo;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public PersonAlbumBgInfo m19698clone() {
        PersonAlbumBgInfo personAlbumBgInfo = new PersonAlbumBgInfo();
        Owner owner = this.owner;
        if (owner != null) {
            personAlbumBgInfo.owner = owner.m18761clone();
        }
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = this.albumBackground;
        if (personAlbumBgInfoMedia != null) {
            personAlbumBgInfo.albumBackground = personAlbumBgInfoMedia.m19701clone();
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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int i2 = i * 41;
        Owner owner = this.owner;
        int iHashCode = (i2 + (owner != null ? owner.hashCode() : 0)) * 41;
        PersonAlbumBgInfoMedia personAlbumBgInfoMedia = this.albumBackground;
        int iHashCode2 = iHashCode + (personAlbumBgInfoMedia != null ? personAlbumBgInfoMedia.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        if (this.owner == null) {
            this.owner = Owner.new_();
        }
        if (this.albumBackground == null) {
            this.albumBackground = PersonAlbumBgInfoMedia.new_();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
