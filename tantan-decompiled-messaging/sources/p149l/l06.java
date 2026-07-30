package p149l;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.common.collect.Sets;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Contact;
import com.p046p1.mobile.putong.data.ContactNumber;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
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
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class l06 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final C4732c f125466a;

    /* JADX INFO: renamed from: l.l06$a */
    public class C18124a implements oh80<Contact> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashSet f125467a;

        public C18124a(HashSet hashSet) {
            this.f125467a = hashSet;
        }

        @Override // p149l.oh80
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Contact contact) {
            for (Contact contact2 : this.f125467a) {
                if (TextUtils.equals(contact2.name, contact.name) && ValueObject.util_equals(contact2.phoneNumbers, contact.phoneNumbers) && TextUtils.equals(contact2.thumbnailUri, contact.thumbnailUri) && TextUtils.equals(contact2.source, contact.source)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.l06$b */
    public class C18125b {

        /* JADX INFO: renamed from: a */
        public List<Contact> f125469a;

        /* JADX INFO: renamed from: b */
        public List<Contact> f125470b;

        public C18125b() {
        }
    }

    public l06(C4732c c4732c) {
        super(CoreModule.f17544b, "contacts_new" + CoreModule.m29931H().userId(), null, 1);
        SQLiteDatabase.deleteDatabase(CoreModule.f17544b.getDatabasePath("contacts" + CoreModule.m29931H().userId()));
        this.f125466a = c4732c;
    }

    /* JADX INFO: renamed from: F */
    public static HashSet<Contact> m148005F() {
        HashSet<Contact> hashSet = new HashSet<>();
        ContentResolver contentResolver = CoreModule.f17544b.getContentResolver();
        HashMap map = new HashMap();
        try {
            Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "display_name", "photo_thumb_uri"}, "in_visible_group=? AND mimetype=?", new String[]{String.valueOf(1), "vnd.android.cursor.item/phone_v2"}, null);
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                String string = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                String string2 = cursorQuery.isNull(1) ? null : cursorQuery.getString(1);
                if (string2 != null) {
                    ContactNumber contactNumber = new ContactNumber();
                    String strM148018u = m148018u(string2);
                    contactNumber.hash8 = "";
                    contactNumber.hash11 = n06.m157248b(strM148018u);
                    contactNumber.number = strM148018u;
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
            CrashHelper.m81296c(e);
            return hashSet;
        } catch (Exception e2) {
            CrashHelper.m81296c(e2);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C22306c m148006e(final C18125b c18125b) {
        return !c18125b.f125469a.isEmpty() ? ap7.m98032d3(vwb.m200303Q(c18125b.f125469a, new w9j() { // from class: l.a06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((Contact) obj).mo223809clone();
            }
        })).map(new w9j() { // from class: l.b06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l06.m148014m(c18125b, (roj0) obj);
            }
        }) : C22306c.just(c18125b);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Contact m148009h(HashMap map, String str) {
        return (Contact) map.get(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m148010i(Act.C4299r c4299r) {
        return new Pair(Boolean.valueOf(c4299r != null && c4299r.f15344b.f15558d), Boolean.valueOf(c4299r != null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m148011j(Contact contact, ContactNumber contactNumber) {
        Iterator<ContactNumber> it = contact.phoneNumbers.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(contactNumber.hash11, it.next().hash11)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C18125b m148014m(C18125b c18125b, roj0 roj0Var) {
        return c18125b;
    }

    /* JADX INFO: renamed from: u */
    public static String m148018u(String str) {
        if (str.startsWith(Marker.ANY_NON_NULL_MARKER)) {
            str = "00".concat(str.substring(1));
        }
        return str.replaceAll("[^\\d]", "");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[PHI: r2
      0x0078: PHI (r2v3 android.database.Cursor) = (r2v1 android.database.Cursor), (r2v2 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:21:0x0076, B:27:0x0085, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    public final ArrayList<Contact> m148019A(ContactNumber contactNumber) {
        ArrayList<Contact> arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = getReadableDatabase().query("contacts", null, "hashes LIKE ?", new String[]{"%" + contactNumber.hash8 + "$" + contactNumber.hash11 + "%"}, null, null, null);
                    while (cursorQuery != null && cursorQuery.moveToNext()) {
                        arrayList.add(m148026r(cursorQuery));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (IllegalStateException e) {
                    CrashHelper.m81296c(e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                CrashHelper.m81296c(e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e3) {
                CrashHelper.m81296c(new Exception("ContactsDatabase lookup:" + e3.getMessage(), e3));
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
    public void m148020B(Envelope envelope) {
        final HashMap map = new HashMap();
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        for (Contact contact : coreData.contacts) {
            map.put(contact.f56011id, contact);
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
                    for (Contact contact2 : vwb.m200303Q(user.profile.api_only_mutualContacts.ids, new w9j() { // from class: l.yz5
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return l06.m148009h(map, (String) obj);
                        }
                    })) {
                        if (contact2 != null) {
                            for (ContactNumber contactNumber : contact2.phoneNumbers) {
                                if (!TextUtils.isEmpty(contactNumber.hash11)) {
                                    for (Contact contact3 : m148019A(contactNumber)) {
                                        if (contact3.phoneNumbers.size() != 0) {
                                            boolean zIsEmpty = user.profile.contactLookups.lookups.isEmpty();
                                            Profile profile2 = user.profile;
                                            if (zIsEmpty) {
                                                profile2.contactLookups.lookups = vwb.m200324f0(contact3);
                                            } else if (!m148021C(profile2.contactLookups.lookups, contact3)) {
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
                        du2.m113670a("ContactsDatabase", "u.id:" + user.f56011id + " nSize:" + size + " lookups.size:" + size2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            du2.m113670a("ContactsDatabase", "u.id:" + user.f56011id + " origin data:" + ((Contact) it.next()).phoneNumbers);
                        }
                        int iMin = Math.min(size2, 100);
                        for (int i = 0; i < iMin; i++) {
                            du2.m113670a("ContactsDatabase", "u.id:" + user.f56011id + " lookups:" + user.profile.contactLookups.lookups.get(i).phoneNumbers);
                        }
                    }
                }
            }
            user.profile.api_only_mutualContacts = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m148021C(List<Contact> list, final Contact contact) {
        return vwb.m200339n(list, new w9j() { // from class: l.c06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.m200339n(((Contact) obj).phoneNumbers, new w9j() { // from class: l.d06
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return l06.m148011j(contact, (ContactNumber) obj2);
                    }
                }).size() > 0);
            }
        }).size() > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m148022D(List<ContactNumber> list) {
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
    public c4g0 m148023E() {
        return mkd0.m154952D(new v9j() { // from class: l.e06
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f88548a.m148029v();
            }
        }, Act.foreground().map(new w9j() { // from class: l.f06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l06.m148010i((Act.C4299r) obj);
            }
        }), true).subscribe(mkd0.m154955G(new e30() { // from class: l.g06
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f100024a.m148030w((v9j) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public C22306c<roj0> m148024G() {
        return this.f125466a.now("checkContacts", C22306c.fromCallable(new Callable() { // from class: l.h06
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f105201a.m148032y();
            }
        }).flatMap(new w9j() { // from class: l.i06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return l06.m148006e((l06.C18125b) obj);
            }
        }).doOnNext(new e30() { // from class: l.j06
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115639a.m148031x((l06.C18125b) obj);
            }
        }).compose(mkd0.m154962N()).first().map(new w9j() { // from class: l.k06
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).compose(mkd0.m154951C()));
    }

    @Override // io.requery.android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY, display_name TEXT, thumbnail_uri TEXT, hashes TEXT)");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m148025q() {
        return PermissionHelper.m79881b("android.permission.READ_CONTACTS");
    }

    /* JADX INFO: renamed from: r */
    public final Contact m148026r(Cursor cursor) {
        Contact contact = new Contact();
        contact._id = cursor.isNull(0) ? 0L : cursor.getLong(0);
        contact.name = cursor.isNull(1) ? null : cursor.getString(1);
        contact.thumbnailUri = cursor.isNull(2) ? null : cursor.getString(2);
        contact.phoneNumbers = cursor.isNull(3) ? new ArrayList<>() : m148033z(cursor.getString(3));
        contact.source = "android";
        return contact;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C22306c<v9j<HashSet<Contact>>> m148029v() {
        return !m148025q() ? C22306c.empty() : z06.m216719c(ContactsContract.Contacts.CONTENT_URI, true, new v9j() { // from class: l.zz5
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return l06.m148005F();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final Set<Contact> m148028t(HashSet<Contact> hashSet, HashSet<Contact> hashSet2) {
        return Sets.m16117b(hashSet, new C18124a(hashSet2));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m148030w(v9j v9jVar) {
        m148024G();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m148031x(C18125b c18125b) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            Iterator<Contact> it = c18125b.f125470b.iterator();
            while (it.hasNext()) {
                writableDatabase.delete("contacts", "_id=?", new String[]{Long.toString(it.next()._id)});
            }
            for (Contact contact : c18125b.f125469a) {
                if (contact != null) {
                    ContentValues contentValues = new ContentValues();
                    DbObject.cvPut(contentValues, "display_name", contact.name);
                    DbObject.cvPut(contentValues, "thumbnail_uri", contact.thumbnailUri);
                    DbObject.cvPut(contentValues, "hashes", m148022D(contact.phoneNumbers));
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
    public final /* synthetic */ C18125b m148032y() throws Exception {
        HashSet<Contact> hashSetM148005F = m148005F();
        Cursor cursorQuery = getWritableDatabase().query("contacts", null, null, null, null, null, null);
        HashSet<Contact> hashSet = new HashSet<>();
        while (cursorQuery != null && cursorQuery.moveToNext()) {
            hashSet.add(m148026r(cursorQuery));
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        C18125b c18125b = new C18125b();
        c18125b.f125469a = new ArrayList(m148028t(hashSetM148005F, hashSet));
        c18125b.f125470b = new ArrayList(m148028t(hashSet, hashSetM148005F));
        return c18125b;
    }

    /* JADX INFO: renamed from: z */
    public final List<ContactNumber> m148033z(String str) {
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
