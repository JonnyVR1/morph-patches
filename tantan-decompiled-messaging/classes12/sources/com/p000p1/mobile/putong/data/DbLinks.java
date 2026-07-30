package com.p000p1.mobile.putong.data;

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
import l.nb5;
import p007l.mrf0;
import p007l.orh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
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
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(DbLinks dbLinks) {
            int iJ = CodedOutputByteBufferNano.j(1, ((DbObject) dbLinks)._id);
            String str = ((DbObject) dbLinks).id;
            if (str != null) {
                iJ += CodedOutputByteBufferNano.o(2, str);
            }
            Links links = dbLinks.links;
            if (links != null) {
                iJ += CodedOutputByteBufferNano.l(51, links, Links.PROTOBUF_ADAPTER);
            }
            int iH = iJ + CodedOutputByteBufferNano.h(52, dbLinks.total) + CodedOutputByteBufferNano.h(53, dbLinks.extra);
            ((MessageNano) dbLinks).cachedSize = iH;
            return iH;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public DbLinks m17944parse(nb5 nb5Var) throws IOException {
            DbLinks dbLinks = new DbLinks();
            while (true) {
                int iU = nb5Var.u();
                if (iU == 0) {
                    if (dbLinks.links != null) {
                        break;
                    }
                    dbLinks.links = Links.new_();
                    break;
                }
                if (iU == 8) {
                    ((DbObject) dbLinks)._id = nb5Var.k();
                } else if (iU == 18) {
                    ((DbObject) dbLinks).id = nb5Var.s();
                } else if (iU == 410) {
                    dbLinks.links = (Links) nb5Var.l(Links.PROTOBUF_ADAPTER);
                } else if (iU == 416) {
                    dbLinks.total = nb5Var.j();
                } else {
                    if (iU != 424) {
                        if (dbLinks.links != null) {
                            break;
                        }
                        dbLinks.links = Links.new_();
                        return dbLinks;
                    }
                    dbLinks.extra = nb5Var.j();
                }
            }
            return dbLinks;
        }

        public void serialize(DbLinks dbLinks, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            codedOutputByteBufferNano.I(1, ((DbObject) dbLinks)._id);
            String str = ((DbObject) dbLinks).id;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            Links links = dbLinks.links;
            if (links != null) {
                codedOutputByteBufferNano.K(51, links, Links.PROTOBUF_ADAPTER);
            }
            codedOutputByteBufferNano.G(52, dbLinks.total);
            codedOutputByteBufferNano.G(53, dbLinks.extra);
        }
    };
    public static final LongColumn<DbLinks> _ID = new LongColumn<DbLinks>("_id") { // from class: com.p1.mobile.putong.data.DbLinks.2
        public Long get(DbLinks dbLinks) {
            return Long.valueOf(((DbObject) dbLinks)._id);
        }

        public void set(DbLinks dbLinks, Long l2) {
            ((DbObject) dbLinks)._id = l2.longValue();
        }
    };

    /* JADX INFO: renamed from: ID */
    public static final StringColumn<DbLinks> f198ID = new StringColumn<DbLinks>("id_c") { // from class: com.p1.mobile.putong.data.DbLinks.3
        public String get(DbLinks dbLinks) {
            return ((DbObject) dbLinks).id;
        }

        public void set(DbLinks dbLinks, String str) {
            ((DbObject) dbLinks).id = str;
        }
    };
    public static final StringColumn<DbLinks> LINKS_PREVIOUS = new StringColumn<DbLinks>("links_previous_c") { // from class: com.p1.mobile.putong.data.DbLinks.4
        public String get(DbLinks dbLinks) {
            return dbLinks.links.previous;
        }

        public void set(DbLinks dbLinks, String str) {
            dbLinks.links.previous = str;
        }
    };
    public static final StringColumn<DbLinks> LINKS_NEXT = new StringColumn<DbLinks>("links_next_c") { // from class: com.p1.mobile.putong.data.DbLinks.5
        public String get(DbLinks dbLinks) {
            return dbLinks.links.next;
        }

        public void set(DbLinks dbLinks, String str) {
            dbLinks.links.next = str;
        }
    };
    public static final IntegerColumn<DbLinks> TOTAL = new IntegerColumn<DbLinks>("total_c") { // from class: com.p1.mobile.putong.data.DbLinks.6
        public Integer get(DbLinks dbLinks) {
            return Integer.valueOf(dbLinks.total);
        }

        public void set(DbLinks dbLinks, Integer num) {
            dbLinks.total = num.intValue();
        }
    };
    public static final IntegerColumn<DbLinks> EXTRA = new IntegerColumn<DbLinks>("extra_c") { // from class: com.p1.mobile.putong.data.DbLinks.7
        public Integer get(DbLinks dbLinks) {
            return Integer.valueOf(dbLinks.extra);
        }

        public void set(DbLinks dbLinks, Integer num) {
            dbLinks.extra = num.intValue();
        }
    };
    public static mrf0<DbLinks> DB_ADAPTER = new mrf0<DbLinks>() { // from class: com.p1.mobile.putong.data.DbLinks.8
        @Override // p007l.mrf0
        public String CREATE_TABLE(orh0 orh0Var) {
            return "CREATE TABLE IF NOT EXISTS " + orh0Var.f11572d + " (_id INTEGER PRIMARY KEY,id_c TEXT,links_previous_c TEXT,links_next_c TEXT,total_c INTEGER,extra_c INTEGER)";
        }

        @Override // p007l.mrf0
        public Class getDataClass() {
            return DbLinks.class;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public DbLinks init() {
            DbLinks dbLinks = new DbLinks();
            if (dbLinks.links == null) {
                dbLinks.links = Links.new_();
            }
            return dbLinks;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p007l.mrf0
        public DbLinks read(Cursor cursor, int i) {
            if (i == 0) {
                this.readIndex = 0;
            }
            DbLinks dbLinks = new DbLinks();
            try {
                dbLinks.links = new Links();
                ((DbObject) dbLinks)._id = cursor.getLong(i);
                int i2 = i + 1;
                String string = null;
                ((DbObject) dbLinks).id = cursor.isNull(i2) ? null : cursor.getString(i2);
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

        @Override // p007l.mrf0
        public void write(DbLinks dbLinks, ContentValues contentValues) {
            try {
                DbObject.cvPut(contentValues, "id_c", ((DbObject) dbLinks).id);
                DbObject.cvPut(contentValues, "links_previous_c", dbLinks.links.previous);
                DbObject.cvPut(contentValues, "links_next_c", dbLinks.links.next);
                DbObject.cvPut(contentValues, "total_c", Integer.valueOf(dbLinks.total));
                DbObject.cvPut(contentValues, "extra_c", Integer.valueOf(dbLinks.extra));
            } catch (Exception e) {
                MessageNano.reportError(e, (Cursor) null);
            }
        }
    };

    public static DbLinks new_() {
        DbLinks dbLinks = new DbLinks();
        dbLinks.nullCheck();
        return dbLinks;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public DbLinks m17943clone() {
        DbLinks dbLinks = new DbLinks();
        ((DbObject) dbLinks)._id = ((DbObject) this)._id;
        ((DbObject) dbLinks).id = ((DbObject) this).id;
        Links links = this.links;
        if (links != null) {
            dbLinks.links = links.m18297clone();
        }
        dbLinks.total = this.total;
        dbLinks.extra = this.extra;
        return dbLinks;
    }

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

    public String getClassParseName() {
        return TYPE;
    }

    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Links links = this.links;
        int iHashCode2 = ((((iHashCode + (links != null ? links.hashCode() : 0)) * 41) + this.total) * 41) + this.extra;
        ((ValueObject) this).hashCode = iHashCode2;
        return iHashCode2;
    }

    public void nullCheck() {
        super/*com.tantanapp.common.data.ValueObject*/.nullCheck();
        if (this.links == null) {
            this.links = Links.new_();
        }
    }
}
