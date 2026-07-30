package com.p000p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.ContactNumber;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.BooleanColumn;
import com.tantanapp.common.data.orm.Column;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.nb5;
import l.w9j;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Contact extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "contact";

    @Nullable
    @ProtobufIndex(index = 56)
    public String match;

    @Nullable
    @ProtobufIndex(index = 51)
    public String name;

    @NonNull
    @ProtobufIndex(index = 53)
    public List<ContactNumber> phoneNumbers;

    @Nullable
    @ProtobufIndex(index = 55)
    public Boolean secretCrush;

    @Nullable
    @ProtobufIndex(index = 54)
    public String source;

    @Nullable
    @ProtobufIndex(index = 52)
    public String thumbnailUri;
    public static ProtobufAdapter<Contact> PROTOBUF_ADAPTER = new MessageNanoAdapter<Contact>() { // from class: com.p1.mobile.putong.data.Contact.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Contact contact) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) contact)._id);
            String str = ((DbObject) contact).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                iJ += CodedOutputByteBufferNano.o(51, str2);
            }
            String str3 = contact.thumbnailUri;
            if (str3 != null) {
                iJ += CodedOutputByteBufferNano.o(52, str3);
            }
            List<ContactNumber> list = contact.phoneNumbers;
            if (list != null) {
                iJ += CodedOutputByteBufferNano.l(53, list, ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = contact.source;
            if (str4 != null) {
                iJ += CodedOutputByteBufferNano.o(54, str4);
            }
            Boolean bool = contact.secretCrush;
            if (bool != null) {
                iJ += CodedOutputByteBufferNano.b(55, bool.booleanValue());
            }
            String str5 = contact.match;
            if (str5 != null) {
                iJ += CodedOutputByteBufferNano.o(56, str5);
            }
            ((MessageNano) contact).cachedSize = iJ;
            return iJ;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Contact m17848parse(nb5 nb5Var) throws IOException {
            Contact contact = new Contact();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (contact.phoneNumbers != null) {
                        break;
                    }
                    contact.phoneNumbers = new ArrayList();
                    break;
                }
                if (iU == 8) {
                    ((DbObject) contact)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) contact).id = nb5Var.s();
                } else if (iU == 410) {
                    contact.name = nb5Var.s();
                } else if (iU == 418) {
                    contact.thumbnailUri = nb5Var.s();
                } else if (iU == 426) {
                    contact.phoneNumbers = (List) nb5Var.l(ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iU == 434) {
                    contact.source = nb5Var.s();
                } else if (iU == 440) {
                    contact.secretCrush = Boolean.valueOf(nb5Var.g());
                } else {
                    if (iU != 450) {
                        if (contact.phoneNumbers != null) {
                            break;
                        }
                        contact.phoneNumbers = new ArrayList();
                        return contact;
                    }
                    contact.match = nb5Var.s();
                }
            }
            return contact;
        }

        public void serialize(Contact contact, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) contact)._id);
            String str = ((DbObject) contact).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                codedOutputByteBufferNano.R(51, str2);
            }
            String str3 = contact.thumbnailUri;
            if (str3 != null) {
                codedOutputByteBufferNano.R(52, str3);
            }
            List<ContactNumber> list = contact.phoneNumbers;
            if (list != null) {
                codedOutputByteBufferNano.K(53, list, ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = contact.source;
            if (str4 != null) {
                codedOutputByteBufferNano.R(54, str4);
            }
            Boolean bool = contact.secretCrush;
            if (bool != null) {
                codedOutputByteBufferNano.A(55, bool.booleanValue());
            }
            String str5 = contact.match;
            if (str5 != null) {
                codedOutputByteBufferNano.R(56, str5);
            }
        }
    };
    public static JsonAdapter<Contact> JSON_ADAPTER = new ObjectJsonAdapter<Contact>() { // from class: com.p1.mobile.putong.data.Contact.2
        public Class getDataClass() {
            return Contact.class;
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        /* JADX INFO: renamed from: newInstance, reason: merged with bridge method [inline-methods] */
        public Contact mo17830newInstance() {
            return new Contact();
        }

        public boolean parseField(Contact contact, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) throws IOException {
            str.getClass();
            switch (str) {
                case "secretCrush":
                    contact.secretCrush = jsonParser.getCurrentToken() == JsonToken.VALUE_NULL ? null : Boolean.valueOf(jsonParser.getValueAsBoolean());
                    return true;
                case "source":
                    contact.source = jsonParser.getValueAsString();
                    return true;
                case "id":
                    ((DbObject) contact).id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    contact.name = jsonParser.getValueAsString();
                    return true;
                case "match":
                    contact.match = (String) Converter.USER_ID.parse(jsonParser, str2);
                    return true;
                case "phoneNumbers":
                    contact.phoneNumbers = JsonAdapter.parseArray(jsonParser, ContactNumber.JSON_ADAPTER, str2, arrayList, dataChecker);
                    return true;
                default:
                    return false;
            }
        }

        public boolean parseFieldCheck(Contact contact, String str, JsonParser jsonParser, String str2, ArrayList<BaseData> arrayList, DataChecker dataChecker) {
            str.getClass();
            switch (str) {
                case "secretCrush":
                case "source":
                    return true;
                case "id":
                    return false;
                case "name":
                case "match":
                case "phoneNumbers":
                    return true;
                default:
                    return super.parseFieldCheck(contact, str, jsonParser, str2, arrayList, dataChecker);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Contact contact, JsonGenerator jsonGenerator) throws IOException {
            String str = ((DbObject) contact).id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                jsonGenerator.writeStringField("name", str2);
            }
            if (contact.phoneNumbers != null) {
                jsonGenerator.writeFieldName("phoneNumbers");
                JsonAdapter.serializeArray(contact.phoneNumbers, jsonGenerator, ContactNumber.JSON_ADAPTER);
            }
            String str3 = contact.source;
            if (str3 != null) {
                jsonGenerator.writeStringField("source", str3);
            }
            Boolean bool = contact.secretCrush;
            if (bool != null) {
                jsonGenerator.writeBooleanField("secretCrush", bool.booleanValue());
            }
            if (contact.match != null) {
                jsonGenerator.writeFieldName(MomentNotifyBlockType.match);
                Converter.USER_ID.serialize(contact.match, jsonGenerator, true);
            }
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Contact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Contact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Contact> _ID = new LongColumn<Contact>("_id") { // from class: com.p1.mobile.putong.data.Contact.3
        public Long get(Contact contact) {
            return Long.valueOf(((DbObject) contact)._id);
        }

        public void set(Contact contact, Long l2) {
            ((DbObject) contact)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Contact> f195ID = new StringColumn<Contact>("id_c") { // from class: com.p1.mobile.putong.data.Contact.4
        public String get(Contact contact) {
            return ((DbObject) contact).id;
        }

        public void set(Contact contact, String str) {
            ((DbObject) contact).id = str;
        }
    };
    public static final StringColumn<Contact> NAME = new StringColumn<Contact>("name_c") { // from class: com.p1.mobile.putong.data.Contact.5
        public String get(Contact contact) {
            return contact.name;
        }

        public void set(Contact contact, String str) {
            contact.name = str;
        }
    };
    public static final StringColumn<Contact> THUMBNAILURI = new StringColumn<Contact>("thumbnailUri_c") { // from class: com.p1.mobile.putong.data.Contact.6
        public String get(Contact contact) {
            return contact.thumbnailUri;
        }

        public void set(Contact contact, String str) {
            contact.thumbnailUri = str;
        }
    };
    public static final Column<Contact, List<ContactNumber>> PHONENUMBERS = new Column<Contact, List<ContactNumber>>("phoneNumbers_c") { // from class: com.p1.mobile.putong.data.Contact.7
        public List<ContactNumber> get(Contact contact) {
            return contact.phoneNumbers;
        }

        public void set(Contact contact, List<ContactNumber> list) {
            contact.phoneNumbers = list;
        }
    };
    public static final StringColumn<Contact> SOURCE = new StringColumn<Contact>("source_c") { // from class: com.p1.mobile.putong.data.Contact.8
        public String get(Contact contact) {
            return contact.source;
        }

        public void set(Contact contact, String str) {
            contact.source = str;
        }
    };
    public static final BooleanColumn<Contact> SECRETCRUSH = new BooleanColumn<Contact>("secretCrush_c") { // from class: com.p1.mobile.putong.data.Contact.9
        public Boolean get(Contact contact) {
            return contact.secretCrush;
        }

        public void set(Contact contact, Boolean bool) {
            contact.secretCrush = bool;
        }
    };
    public static final StringColumn<Contact> MATCH = new StringColumn<Contact>("match_c") { // from class: com.p1.mobile.putong.data.Contact.10
        public String get(Contact contact) {
            return contact.match;
        }

        public void set(Contact contact, String str) {
            contact.match = str;
        }
    };
    public static mrf0<Contact> DB_ADAPTER = new mrf0<Contact>() { // from class: com.p1.mobile.putong.data.Contact.11
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,thumbnailUri_c TEXT,phoneNumbers_c BLOB,source_c TEXT,secretCrush_c INTEGER,match_c TEXT)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return Contact.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public Contact init() {
            Contact contact = new Contact();
            if (contact.phoneNumbers == null) {
                contact.phoneNumbers = new ArrayList();
            }
            return contact;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public Contact read(Cursor cursor, int i) {
            Boolean boolValueOf;
            if (i == 0) {
                this.readIndex = 0;
            }
            Contact contact = new Contact();
            try {
                ((DbObject) contact)._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                ((DbObject) contact).id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                contact.name = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                contact.thumbnailUri = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 4;
                contact.phoneNumbers = cursor.isNull(i5) ? null : (List) ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i5));
                int i6 = i + 5;
                contact.source = cursor.isNull(i6) ? null : cursor.getString(i6);
                int i7 = i + 6;
                if (cursor.isNull(i7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursor.getInt(i7) == 1);
                }
                contact.secretCrush = boolValueOf;
                int i8 = i + 7;
                if (!cursor.isNull(i8)) {
                    string = cursor.getString(i8);
                }
                contact.match = string;
                this.readIndex = i + 8;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (contact.phoneNumbers == null) {
                contact.phoneNumbers = new ArrayList();
            }
            return contact;
        }

        @Override // p007l.mrf0
        public void write(Contact contact, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) contact).id);
                DbObject.cvPut(contentValues, "name_c", contact.name);
                DbObject.cvPut(contentValues, "thumbnailUri_c", contact.thumbnailUri);
                DbObject.cvPut(contentValues, "phoneNumbers_c", contact.phoneNumbers == null ? null : ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(contact.phoneNumbers));
                DbObject.cvPut(contentValues, "source_c", contact.source);
                Boolean bool = contact.secretCrush;
                DbObject.cvPut(contentValues, "secretCrush_c", bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0));
                DbObject.cvPut(contentValues, "match_c", contact.match);
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static Contact new_() {
        Contact contact = new Contact();
        contact.nullCheck();
        return contact;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Contact m17847clone() {
        Contact contact = new Contact();
        ((DbObject) contact)._id = ((DbObject) this)._id;
        ((DbObject) contact).id = ((DbObject) this).id;
        contact.name = this.name;
        contact.thumbnailUri = this.thumbnailUri;
        List<ContactNumber> list = this.phoneNumbers;
        if (list != null) {
            contact.phoneNumbers = ValueObject.util_map(list, new w9j() { // from class: l.xz5
                public final Object call(Object obj) {
                    return ((ContactNumber) obj).m17850clone();
                }
            });
        }
        contact.source = this.source;
        contact.secretCrush = this.secretCrush;
        contact.match = this.match;
        return contact;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return super.equals(obj) && ValueObject.util_equals(this.name, contact.name) && ValueObject.util_equals(this.thumbnailUri, contact.thumbnailUri) && ValueObject.util_equals(this.phoneNumbers, contact.phoneNumbers) && ValueObject.util_equals(this.source, contact.source) && ValueObject.util_equals(this.secretCrush, contact.secretCrush) && ValueObject.util_equals(this.match, contact.match);
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
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 41;
        String str2 = this.thumbnailUri;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 41;
        List<ContactNumber> list = this.phoneNumbers;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        String str3 = this.source;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 41;
        Boolean bool = this.secretCrush;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 41;
        String str4 = this.match;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode7;
        return iHashCode7;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList();
        }
    }

    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
