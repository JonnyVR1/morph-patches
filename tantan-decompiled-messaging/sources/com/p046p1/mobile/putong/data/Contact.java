package com.p046p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p046p1.mobile.putong.data.ContactNumber;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
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
import p149l.mrf0;
import p149l.nb5;
import p149l.orh0;
import p149l.w9j;

/* JADX INFO: loaded from: classes12.dex */
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
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(Contact contact) {
            int iM17228j = CodedOutputByteBufferNano.m17228j(1, contact._id);
            String str = contact.f56011id;
            if (str != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(2, str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(51, str2);
            }
            String str3 = contact.thumbnailUri;
            if (str3 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(52, str3);
            }
            List<ContactNumber> list = contact.phoneNumbers;
            if (list != null) {
                iM17228j += CodedOutputByteBufferNano.m17230l(53, list, ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = contact.source;
            if (str4 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(54, str4);
            }
            Boolean bool = contact.secretCrush;
            if (bool != null) {
                iM17228j += CodedOutputByteBufferNano.m17220b(55, bool.booleanValue());
            }
            String str5 = contact.match;
            if (str5 != null) {
                iM17228j += CodedOutputByteBufferNano.m17233o(56, str5);
            }
            contact.cachedSize = iM17228j;
            return iM17228j;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public Contact parse(nb5 nb5Var) throws IOException {
            Contact contact = new Contact();
            while (true) {
                int iM158752u = nb5Var.m158752u();
                if (iM158752u == 0) {
                    if (contact.phoneNumbers != null) {
                        break;
                    }
                    contact.phoneNumbers = new ArrayList();
                    break;
                }
                if (iM158752u == 8) {
                    contact._id = nb5Var.m158742k();
                } else if (iM158752u == 18) {
                    contact.f56011id = nb5Var.m158750s();
                } else if (iM158752u == 410) {
                    contact.name = nb5Var.m158750s();
                } else if (iM158752u == 418) {
                    contact.thumbnailUri = nb5Var.m158750s();
                } else if (iM158752u == 426) {
                    contact.phoneNumbers = (List) nb5Var.m158743l(ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                } else if (iM158752u == 434) {
                    contact.source = nb5Var.m158750s();
                } else if (iM158752u == 440) {
                    contact.secretCrush = Boolean.valueOf(nb5Var.m158738g());
                } else {
                    if (iM158752u != 450) {
                        if (contact.phoneNumbers != null) {
                            break;
                        }
                        contact.phoneNumbers = new ArrayList();
                        return contact;
                    }
                    contact.match = nb5Var.m158750s();
                }
            }
            return contact;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(Contact contact, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17252I(1, contact._id);
            String str = contact.f56011id;
            if (str != null) {
                codedOutputByteBufferNano.m17261R(2, str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                codedOutputByteBufferNano.m17261R(51, str2);
            }
            String str3 = contact.thumbnailUri;
            if (str3 != null) {
                codedOutputByteBufferNano.m17261R(52, str3);
            }
            List<ContactNumber> list = contact.phoneNumbers;
            if (list != null) {
                codedOutputByteBufferNano.m17254K(53, list, ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            String str4 = contact.source;
            if (str4 != null) {
                codedOutputByteBufferNano.m17261R(54, str4);
            }
            Boolean bool = contact.secretCrush;
            if (bool != null) {
                codedOutputByteBufferNano.m17244A(55, bool.booleanValue());
            }
            String str5 = contact.match;
            if (str5 != null) {
                codedOutputByteBufferNano.m17261R(56, str5);
            }
        }
    };
    public static JsonAdapter<Contact> JSON_ADAPTER = new ObjectJsonAdapter<Contact>() { // from class: com.p1.mobile.putong.data.Contact.2
        @Override // com.tantanapp.common.data.JsonAdapter
        public Class getDataClass() {
            return Contact.class;
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public Contact newInstance() {
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
                    contact.f56011id = jsonParser.getValueAsString();
                    return false;
                case "name":
                    contact.name = jsonParser.getValueAsString();
                    return true;
                case "match":
                    contact.match = Converter.USER_ID.parse(jsonParser, str2);
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

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public void serializeFields(Contact contact, JsonGenerator jsonGenerator) throws IOException {
            String str = contact.f56011id;
            if (str != null) {
                jsonGenerator.writeStringField("id", str);
            }
            String str2 = contact.name;
            if (str2 != null) {
                jsonGenerator.writeStringField(AuthenticationTokenClaims.JSON_KEY_NAME, str2);
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
                jsonGenerator.writeFieldName("match");
                Converter.USER_ID.serialize(contact.match, jsonGenerator, true);
            }
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseFieldCheck(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) {
            return parseFieldCheck((Contact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }

        @Override // com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter
        public /* bridge */ /* synthetic */ boolean parseField(ValueObject valueObject, String str, JsonParser jsonParser, String str2, ArrayList arrayList, DataChecker dataChecker) throws IOException {
            return parseField((Contact) valueObject, str, jsonParser, str2, (ArrayList<BaseData>) arrayList, dataChecker);
        }
    };
    public static final LongColumn<Contact> _ID = new LongColumn<Contact>("_id") { // from class: com.p1.mobile.putong.data.Contact.3
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(Contact contact) {
            return Long.valueOf(contact._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, Long l2) {
            contact._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<Contact> f38734ID = new StringColumn<Contact>("id_c") { // from class: com.p1.mobile.putong.data.Contact.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Contact contact) {
            return contact.f56011id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, String str) {
            contact.f56011id = str;
        }
    };
    public static final StringColumn<Contact> NAME = new StringColumn<Contact>("name_c") { // from class: com.p1.mobile.putong.data.Contact.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Contact contact) {
            return contact.name;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, String str) {
            contact.name = str;
        }
    };
    public static final StringColumn<Contact> THUMBNAILURI = new StringColumn<Contact>("thumbnailUri_c") { // from class: com.p1.mobile.putong.data.Contact.6
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Contact contact) {
            return contact.thumbnailUri;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, String str) {
            contact.thumbnailUri = str;
        }
    };
    public static final Column<Contact, List<ContactNumber>> PHONENUMBERS = new Column<Contact, List<ContactNumber>>("phoneNumbers_c") { // from class: com.p1.mobile.putong.data.Contact.7
        @Override // com.tantanapp.common.data.orm.Column
        public List<ContactNumber> get(Contact contact) {
            return contact.phoneNumbers;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, List<ContactNumber> list) {
            contact.phoneNumbers = list;
        }
    };
    public static final StringColumn<Contact> SOURCE = new StringColumn<Contact>("source_c") { // from class: com.p1.mobile.putong.data.Contact.8
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Contact contact) {
            return contact.source;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, String str) {
            contact.source = str;
        }
    };
    public static final BooleanColumn<Contact> SECRETCRUSH = new BooleanColumn<Contact>("secretCrush_c") { // from class: com.p1.mobile.putong.data.Contact.9
        @Override // com.tantanapp.common.data.orm.Column
        public Boolean get(Contact contact) {
            return contact.secretCrush;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, Boolean bool) {
            contact.secretCrush = bool;
        }
    };
    public static final StringColumn<Contact> MATCH = new StringColumn<Contact>("match_c") { // from class: com.p1.mobile.putong.data.Contact.10
        @Override // com.tantanapp.common.data.orm.Column
        public String get(Contact contact) {
            return contact.match;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(Contact contact, String str) {
            contact.match = str;
        }
    };
    public static mrf0<Contact> DB_ADAPTER = new mrf0<Contact>() { // from class: com.p1.mobile.putong.data.Contact.11
        @Override // p149l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,name_c TEXT,thumbnailUri_c TEXT,phoneNumbers_c BLOB,source_c TEXT,secretCrush_c INTEGER,match_c TEXT)";
        }

        @Override // p149l.mrf0
        public Class getDataClass() {
            return Contact.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Contact init() {
            Contact contact = new Contact();
            if (contact.phoneNumbers == null) {
                contact.phoneNumbers = new ArrayList();
            }
            return contact;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.mrf0
        public Contact read(Cursor cursor, int i) {
            Boolean boolValueOf;
            if (i == 0) {
                this.readIndex = 0;
            }
            Contact contact = new Contact();
            try {
                contact._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                contact.f56011id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                contact.name = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                contact.thumbnailUri = cursor.isNull(i4) ? null : cursor.getString(i4);
                int i5 = i + 4;
                contact.phoneNumbers = cursor.isNull(i5) ? null : ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER().parse(cursor.getBlob(i5));
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

        @Override // p149l.mrf0
        public void write(Contact contact, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", contact.f56011id);
                DbObject.cvPut(contentValues, "name_c", contact.name);
                DbObject.cvPut(contentValues, "thumbnailUri_c", contact.thumbnailUri);
                DbObject.cvPut(contentValues, "phoneNumbers_c", contact.phoneNumbers == null ? null : ContactNumber.PROTOBUF_ADAPTER.ARRAY_ADAPTER().serialize(contact.phoneNumbers));
                DbObject.cvPut(contentValues, "source_c", contact.source);
                Boolean bool = contact.secretCrush;
                DbObject.cvPut(contentValues, "secretCrush_c", bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0));
                DbObject.cvPut(contentValues, "match_c", contact.match);
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static Contact new_() {
        Contact contact = new Contact();
        contact.nullCheck();
        return contact;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public Contact mo223809clone() {
        Contact contact = new Contact();
        contact._id = this._id;
        contact.f56011id = this.f56011id;
        contact.name = this.name;
        contact.thumbnailUri = this.thumbnailUri;
        List<ContactNumber> list = this.phoneNumbers;
        if (list != null) {
            contact.phoneNumbers = ValueObject.util_map(list, new w9j() { // from class: l.xz5
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((ContactNumber) obj).mo223809clone();
                }
            });
        }
        contact.source = this.source;
        contact.secretCrush = this.secretCrush;
        contact.match = this.match;
        return contact;
    }

    @Override // com.tantanapp.common.data.DbObject
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

    @Override // com.tantanapp.common.data.ValueObject
    public String getClassParseName() {
        return TYPE;
    }

    @Override // com.tantanapp.common.data.DbObject
    public int hashCode() {
        int i = this.hashCode;
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
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList();
        }
    }

    @Override // com.tantanapp.common.data.ValueObject
    public String toJson() {
        return JSON_ADAPTER.serialize(this);
    }
}
