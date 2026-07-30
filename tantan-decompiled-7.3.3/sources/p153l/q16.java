package p153l;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.collect.Sets;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Contact;
import com.p051p1.mobile.putong.data.ContactNumber;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;
import io.requery.android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.slf4j.Marker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class q16 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final C4883c f155149a;

    /* JADX INFO: renamed from: l.q16$a */
    public class C19487a implements tp80<Contact> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashSet f155150a;

        public C19487a(HashSet hashSet) {
            this.f155150a = hashSet;
        }

        @Override // p153l.tp80
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Contact contact) {
            for (Contact contact2 : this.f155150a) {
                if (TextUtils.equals(contact2.name, contact.name) && ValueObject.util_equals(contact2.phoneNumbers, contact.phoneNumbers) && TextUtils.equals(contact2.thumbnailUri, contact.thumbnailUri) && TextUtils.equals(contact2.source, contact.source)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.q16$b */
    public class C19488b {

        /* JADX INFO: renamed from: a */
        public List<Contact> f155152a;

        /* JADX INFO: renamed from: b */
        public List<Contact> f155153b;

        public C19488b() {
        }
    }

    public q16(C4883c c4883c) {
        super(CoreModule.f18263b, "contacts_new" + CoreModule.m30929H().userId(), null, 1);
        SQLiteDatabase.deleteDatabase(CoreModule.f18263b.getDatabasePath("contacts" + CoreModule.m30929H().userId()));
        this.f155149a = c4883c;
    }

    /* JADX INFO: renamed from: F */
    public static HashSet<Contact> m174813F() {
        HashSet<Contact> hashSet = new HashSet<>();
        ContentResolver contentResolver = CoreModule.f18263b.getContentResolver();
        HashMap map = new HashMap();
        try {
            Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "display_name", "photo_thumb_uri"}, "in_visible_group=? AND mimetype=?", new String[]{String.valueOf(1), "vnd.android.cursor.item/phone_v2"}, null);
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                String string = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                String string2 = cursorQuery.isNull(1) ? null : cursorQuery.getString(1);
                if (string2 != null) {
                    ContactNumber contactNumber = new ContactNumber();
                    String strM174826u = m174826u(string2);
                    contactNumber.hash8 = "";
                    contactNumber.hash11 = s16.m184018b(strM174826u);
                    contactNumber.number = strM174826u;
                    if (map.get(string) == null) {
                        Contact contact = new Contact();
                        contact.phoneNumbers = new ArrayList();
                        contact.source = "android";
                        contact.name = cursorQuery.isNull(2) ? null : cursorQuery.getString(2);
                        contact.thumbnailUri = cursorQuery.isNull(2) ? null : cursorQuery.getString(3);
                        map.put(string, contact);
                    }
                    ((Contact) map.get(string)).phoneNumbers.add(contactNumber);
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                Collections.sort(((Contact) it.next()).phoneNumbers, ContactNumber.ORDER_BY_HASH11);
            }
            return new HashSet<>(map.values());
        } catch (SecurityException e) {
            CrashHelper.m82479c(e);
            return hashSet;
        } catch (Exception e2) {
            CrashHelper.m82479c(e2);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22421c m174814e(final C19488b c19488b) {
        return !c19488b.f155152a.isEmpty() ? eq7.m121901d3(jyb.m147486Q(c19488b.f155152a, new qcj() { // from class: l.f16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((Contact) obj).mo225055clone();
            }
        })).map(new qcj() { // from class: l.g16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q16.m174822m(c19488b, (uxj0) obj);
            }
        }) : C22421c.just(c19488b);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Contact m174817h(HashMap map, String str) {
        return (Contact) map.get(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m174818i(Act.C4450r c4450r) {
        return new Pair(Boolean.valueOf(c4450r != null && c4450r.f16063b.f16277d), Boolean.valueOf(c4450r != null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m174819j(Contact contact, ContactNumber contactNumber) {
        Iterator<ContactNumber> it = contact.phoneNumbers.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(contactNumber.hash11, it.next().hash11)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C19488b m174822m(C19488b c19488b, uxj0 uxj0Var) {
        return c19488b;
    }

    /* JADX INFO: renamed from: u */
    public static String m174826u(String str) {
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER)) {
            str = "00".concat(str.substring(1));
        }
        return str.replaceAll("[^\\d]", "");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[PHI: r2
      0x0078: PHI (r2v3 android.database.Cursor) = (r2v1 android.database.Cursor), (r2v2 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:21:0x0076, B:27:0x0085, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    public final ArrayList<Contact> m174827A(ContactNumber contactNumber) {
        ArrayList<Contact> arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = getReadableDatabase().query("contacts", null, "hashes LIKE ?", new String[]{"%" + contactNumber.hash8 + "$" + contactNumber.hash11 + "%"}, null, null, null);
                    while (cursorQuery != null && cursorQuery.moveToNext()) {
                        arrayList.add(m174834r(cursorQuery));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (IllegalStateException e) {
                    CrashHelper.m82479c(e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                CrashHelper.m82479c(e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e3) {
                CrashHelper.m82479c(new Exception("ContactsDatabase lookup:" + e3.getMessage(), e3));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m174828B(Envelope envelope) {
        final HashMap map = new HashMap();
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        for (Contact contact : coreData.contacts) {
            map.put(contact.f56859id, contact);
        }
        for (User user : commonData.users) {
            Profile profile = user.profile;
            PartialIdList partialIdList = profile.api_only_mutualContacts;
            if (partialIdList != null) {
                profile.contactLookups.next = partialIdList.links.next;
                if (!partialIdList.ids.isEmpty()) {
                    int size = user.profile.api_only_mutualContacts.ids.size();
                    MutualContactsLocalLookups mutualContactsLocalLookups = user.profile.contactLookups;
                    mutualContactsLocalLookups.batchSize = Math.max(mutualContactsLocalLookups.batchSize, size);
                    ArrayList arrayList = new ArrayList();
                    for (Contact contact2 : jyb.m147486Q(user.profile.api_only_mutualContacts.ids, new qcj() { // from class: l.d16
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return q16.m174817h(map, (String) obj);
                        }
                    })) {
                        if (contact2 != null) {
                            for (ContactNumber contactNumber : contact2.phoneNumbers) {
                                if (!TextUtils.isEmpty(contactNumber.hash11)) {
                                    for (Contact contact3 : m174827A(contactNumber)) {
                                        if (contact3.phoneNumbers.size() != 0) {
                                            boolean zIsEmpty = user.profile.contactLookups.lookups.isEmpty();
                                            Profile profile2 = user.profile;
                                            if (zIsEmpty) {
                                                profile2.contactLookups.lookups = jyb.m147507f0(contact3);
                                            } else if (!m174829C(profile2.contactLookups.lookups, contact3)) {
                                                user.profile.contactLookups.lookups.add(contact3);
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList.add(contact2);
                        }
                    }
                    int size2 = user.profile.contactLookups.lookups.size();
                    if (size2 >= 50) {
                        tu2.m192703a("ContactsDatabase", "u.id:" + user.f56859id + " nSize:" + size + " lookups.size:" + size2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            tu2.m192703a("ContactsDatabase", "u.id:" + user.f56859id + " origin data:" + ((Contact) it.next()).phoneNumbers);
                        }
                        int iMin = Math.min(size2, 100);
                        for (int i = 0; i < iMin; i++) {
                            tu2.m192703a("ContactsDatabase", "u.id:" + user.f56859id + " lookups:" + user.profile.contactLookups.lookups.get(i).phoneNumbers);
                        }
                    }
                }
            }
            user.profile.api_only_mutualContacts = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m174829C(List<Contact> list, final Contact contact) {
        return jyb.m147522n(list, new qcj() { // from class: l.h16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(jyb.m147522n(((Contact) obj).phoneNumbers, new qcj() { // from class: l.i16
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return q16.m174819j(contact, (ContactNumber) obj2);
                    }
                }).size() > 0);
            }
        }).size() > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m174830D(List<ContactNumber> list) {
        StringBuilder sb = new StringBuilder();
        for (ContactNumber contactNumber : list) {
            sb.append(contactNumber.hash8);
            sb.append("$");
            sb.append(contactNumber.hash11);
            sb.append("$");
            sb.append(contactNumber.number);
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public kcg0 m174831E() {
        return psd0.m173593D(new pcj() { // from class: l.j16
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f117933a.m174837v();
            }
        }, Act.foreground().map(new qcj() { // from class: l.k16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q16.m174818i((Act.C4450r) obj);
            }
        }), true).subscribe(psd0.m173596G(new y20() { // from class: l.l16
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129652a.m174838w((pcj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public C22421c<uxj0> m174832G() {
        return this.f155149a.now("checkContacts", C22421c.fromCallable(new Callable() { // from class: l.m16
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f134388a.m174840y();
            }
        }).flatMap(new qcj() { // from class: l.n16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return q16.m174814e((q16.C19488b) obj);
            }
        }).doOnNext(new y20() { // from class: l.o16
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144624a.m174839x((q16.C19488b) obj);
            }
        }).compose(psd0.m173603N()).first().map(new qcj() { // from class: l.p16
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }).compose(psd0.m173592C()));
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY, display_name TEXT, thumbnail_uri TEXT, hashes TEXT)");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m174833q() {
        return PermissionHelper.m81064b("android.permission.READ_CONTACTS");
    }

    /* JADX INFO: renamed from: r */
    public final Contact m174834r(Cursor cursor) {
        Contact contact = new Contact();
        contact._id = cursor.isNull(0) ? 0L : cursor.getLong(0);
        contact.name = cursor.isNull(1) ? null : cursor.getString(1);
        contact.thumbnailUri = cursor.isNull(2) ? null : cursor.getString(2);
        contact.phoneNumbers = cursor.isNull(3) ? new ArrayList<>() : m174841z(cursor.getString(3));
        contact.source = "android";
        return contact;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C22421c<pcj<HashSet<Contact>>> m174837v() {
        return !m174833q() ? C22421c.empty() : e26.m119047c(ContactsContract.Contacts.CONTENT_URI, true, new pcj() { // from class: l.e16
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return q16.m174813F();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final Set<Contact> m174836t(HashSet<Contact> hashSet, HashSet<Contact> hashSet2) {
        return Sets.m16171b(hashSet, new C19487a(hashSet2));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m174838w(pcj pcjVar) {
        m174832G();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m174839x(C19488b c19488b) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            Iterator<Contact> it = c19488b.f155153b.iterator();
            while (it.hasNext()) {
                writableDatabase.delete("contacts", "_id=?", new String[]{Long.toString(it.next()._id)});
            }
            for (Contact contact : c19488b.f155152a) {
                if (contact != null) {
                    ContentValues contentValues = new ContentValues();
                    DbObject.cvPut(contentValues, "display_name", contact.name);
                    DbObject.cvPut(contentValues, "thumbnail_uri", contact.thumbnailUri);
                    DbObject.cvPut(contentValues, "hashes", m174830D(contact.phoneNumbers));
                    writableDatabase.insertOrThrow("contacts", null, contentValues);
                    contact.name = null;
                    contact.thumbnailUri = null;
                }
            }
            writableDatabase.setTransactionSuccessful();
        } finally {
            writableDatabase.endTransaction();
        }
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C19488b m174840y() throws Exception {
        HashSet<Contact> hashSetM174813F = m174813F();
        Cursor cursorQuery = getWritableDatabase().query("contacts", null, null, null, null, null, null);
        HashSet<Contact> hashSet = new HashSet<>();
        while (cursorQuery != null && cursorQuery.moveToNext()) {
            hashSet.add(m174834r(cursorQuery));
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        C19488b c19488b = new C19488b();
        c19488b.f155152a = new ArrayList(m174836t(hashSetM174813F, hashSet));
        c19488b.f155153b = new ArrayList(m174836t(hashSet, hashSetM174813F));
        return c19488b;
    }

    /* JADX INFO: renamed from: z */
    public final List<ContactNumber> m174841z(String str) {
        String[] strArrSplit = str.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            ContactNumber contactNumber = new ContactNumber();
            String[] strArrSplit2 = str2.split("\\$");
            if (strArrSplit2.length == 3) {
                contactNumber.hash8 = strArrSplit2[0];
                contactNumber.hash11 = strArrSplit2[1];
                contactNumber.number = strArrSplit2[2];
                arrayList.add(contactNumber);
            }
        }
        return arrayList;
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
