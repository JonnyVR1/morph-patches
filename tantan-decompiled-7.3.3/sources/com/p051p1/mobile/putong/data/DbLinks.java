package com.p051p1.mobile.putong.data;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.data.orm.IntegerColumn;
import com.tantanapp.common.data.orm.LongColumn;
import com.tantanapp.common.data.orm.StringColumn;
import java.io.IOException;
import java.io.Serializable;
import p153l.nc5;
import p153l.vzf0;
import p153l.wzh0;

/* JADX INFO: loaded from: classes12.dex */
public class DbLinks extends DbObject implements Cloneable, Serializable {
    public static final String TYPE = "dblinks";

    @ProtobufIndex(index = 53)
    @Deprecated
    public int extra;

    @NonNull
    @ProtobufIndex(index = 51)
    public Links links;

    @ProtobufIndex(index = 52)
    public int total;
    public static ProtobufAdapter<DbLinks> PROTOBUF_ADAPTER = new MessageNanoAdapter<DbLinks>() { // from class: com.p1.mobile.putong.data.DbLinks.1
        {
            this.wireFormat = 2;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public int computeAndCacheSize(DbLinks dbLinks) {
            int iM17283j = CodedOutputByteBufferNano.m17283j(1, dbLinks._id);
            String str = dbLinks.f56859id;
            if (str != null) {
                iM17283j += CodedOutputByteBufferNano.m17288o(2, str);
            }
            Links links = dbLinks.links;
            if (links != null) {
                iM17283j += CodedOutputByteBufferNano.m17285l(51, links, Links.PROTOBUF_ADAPTER);
            }
            int iM17281h = iM17283j + CodedOutputByteBufferNano.m17281h(52, dbLinks.total) + CodedOutputByteBufferNano.m17281h(53, dbLinks.extra);
            dbLinks.cachedSize = iM17281h;
            return iM17281h;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public DbLinks parse(nc5 nc5Var) throws IOException {
            DbLinks dbLinks = new DbLinks();
            while (true) {
                int iM162497u = nc5Var.m162497u();
                if (iM162497u == 0) {
                    if (dbLinks.links != null) {
                        break;
                    }
                    dbLinks.links = Links.new_();
                    break;
                }
                if (iM162497u == 8) {
                    dbLinks._id = nc5Var.m162487k();
                } else if (iM162497u == 18) {
                    dbLinks.f56859id = nc5Var.m162495s();
                } else if (iM162497u == 410) {
                    dbLinks.links = (Links) nc5Var.m162488l(Links.PROTOBUF_ADAPTER);
                } else if (iM162497u == 416) {
                    dbLinks.total = nc5Var.m162486j();
                } else {
                    if (iM162497u != 424) {
                        if (dbLinks.links != null) {
                            break;
                        }
                        dbLinks.links = Links.new_();
                        return dbLinks;
                    }
                    dbLinks.extra = nc5Var.m162486j();
                }
            }
            return dbLinks;
        }

        @Override // com.tantanapp.common.data.ProtobufAdapter
        public void serialize(DbLinks dbLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.m17307I(1, dbLinks._id);
            String str = dbLinks.f56859id;
            if (str != null) {
                codedOutputByteBufferNano.m17316R(2, str);
            }
            Links links = dbLinks.links;
            if (links != null) {
                codedOutputByteBufferNano.m17309K(51, links, Links.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.m17305G(52, dbLinks.total);
            codedOutputByteBufferNano.m17305G(53, dbLinks.extra);
        }
    };
    public static final LongColumn<DbLinks> _ID = new LongColumn<DbLinks>("_id") { // from class: com.p1.mobile.putong.data.DbLinks.2
        @Override // com.tantanapp.common.data.orm.Column
        public Long get(DbLinks dbLinks) {
            return Long.valueOf(dbLinks._id);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, Long l2) {
            dbLinks._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<DbLinks> f39585ID = new StringColumn<DbLinks>("id_c") { // from class: com.p1.mobile.putong.data.DbLinks.3
        @Override // com.tantanapp.common.data.orm.Column
        public String get(DbLinks dbLinks) {
            return dbLinks.f56859id;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, String str) {
            dbLinks.f56859id = str;
        }
    };
    public static final StringColumn<DbLinks> LINKS_PREVIOUS = new StringColumn<DbLinks>("links_previous_c") { // from class: com.p1.mobile.putong.data.DbLinks.4
        @Override // com.tantanapp.common.data.orm.Column
        public String get(DbLinks dbLinks) {
            return dbLinks.links.previous;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, String str) {
            dbLinks.links.previous = str;
        }
    };
    public static final StringColumn<DbLinks> LINKS_NEXT = new StringColumn<DbLinks>("links_next_c") { // from class: com.p1.mobile.putong.data.DbLinks.5
        @Override // com.tantanapp.common.data.orm.Column
        public String get(DbLinks dbLinks) {
            return dbLinks.links.next;
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, String str) {
            dbLinks.links.next = str;
        }
    };
    public static final IntegerColumn<DbLinks> TOTAL = new IntegerColumn<DbLinks>("total_c") { // from class: com.p1.mobile.putong.data.DbLinks.6
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(DbLinks dbLinks) {
            return Integer.valueOf(dbLinks.total);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, Integer num) {
            dbLinks.total = num.intValue();
        }
    };
    public static final IntegerColumn<DbLinks> EXTRA = new IntegerColumn<DbLinks>("extra_c") { // from class: com.p1.mobile.putong.data.DbLinks.7
        @Override // com.tantanapp.common.data.orm.Column
        public Integer get(DbLinks dbLinks) {
            return Integer.valueOf(dbLinks.extra);
        }

        @Override // com.tantanapp.common.data.orm.Column
        public void set(DbLinks dbLinks, Integer num) {
            dbLinks.extra = num.intValue();
        }
    };
    public static vzf0<DbLinks> DB_ADAPTER = new vzf0<DbLinks>() { // from class: com.p1.mobile.putong.data.DbLinks.8
        @Override // p153l.vzf0
        public String CREATE_TABLE(wzh0 wzh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + wzh0Var.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,links_previous_c TEXT,links_next_c TEXT,total_c INTEGER,extra_c INTEGER)";
        }

        @Override // p153l.vzf0
        public Class getDataClass() {
            return DbLinks.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public DbLinks init() {
            DbLinks dbLinks = new DbLinks();
            if (dbLinks.links == null) {
                dbLinks.links = Links.new_();
            }
            return dbLinks;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.vzf0
        public DbLinks read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            DbLinks dbLinks = new DbLinks();
            try {
                dbLinks.links = new Links();
                dbLinks._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                dbLinks.f56859id = cursor.isNull(i2) ? null : cursor.getString(i2);
                int i3 = i + 2;
                dbLinks.links.previous = cursor.isNull(i3) ? null : cursor.getString(i3);
                int i4 = i + 3;
                Links links = dbLinks.links;
                if (!cursor.isNull(i4)) {
                    string = cursor.getString(i4);
                }
                links.next = string;
                dbLinks.total = cursor.getInt(i + 4);
                dbLinks.extra = cursor.getInt(i + 5);
                this.readIndex = i + 6;
            } catch (Exception e) {
                MessageNano.reportError(e, cursor);
            }
            if (dbLinks.links == null) {
                dbLinks.links = Links.new_();
            }
            return dbLinks;
        }

        @Override // p153l.vzf0
        public void write(DbLinks dbLinks, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", dbLinks.f56859id);
                DbObject.cvPut(contentValues, "links_previous_c", dbLinks.links.previous);
                DbObject.cvPut(contentValues, "links_next_c", dbLinks.links.next);
                DbObject.cvPut(contentValues, "total_c", Integer.valueOf(dbLinks.total));
                DbObject.cvPut(contentValues, "extra_c", Integer.valueOf(dbLinks.extra));
            } catch (Exception e) {
                MessageNano.reportError(e, null);
            }
        }
    };

    public static DbLinks new_() {
        DbLinks dbLinks = new DbLinks();
        dbLinks.nullCheck();
        return dbLinks;
    }

    @Override // com.tantanapp.common.data.ValueObject, com.google.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: clone */
    public DbLinks mo225055clone() {
        DbLinks dbLinks = new DbLinks();
        dbLinks._id = this._id;
        dbLinks.f56859id = this.f56859id;
        Links links = this.links;
        if (links != null) {
            dbLinks.links = links.mo225055clone();
        }
        dbLinks.total = this.total;
        dbLinks.extra = this.extra;
        return dbLinks;
    }

    @Override // com.tantanapp.common.data.DbObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DbLinks)) {
            return false;
        }
        DbLinks dbLinks = (DbLinks) obj;
        return super.equals(obj) && ValueObject.util_equals(this.links, dbLinks.links) && this.total == dbLinks.total && this.extra == dbLinks.extra;
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
        Links links = this.links;
        int iHashCode2 = ((((iHashCode + (links != null ? links.hashCode() : 0)) * 41) + this.total) * 41) + this.extra;
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.tantanapp.common.data.ValueObject
    public void nullCheck() {
        super.nullCheck();
        if (this.links == null) {
            this.links = Links.new_();
        }
    }
}
