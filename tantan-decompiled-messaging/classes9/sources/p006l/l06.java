package p006l;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.collect.Sets;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Contact;
import com.p1.mobile.putong.data.ContactNumber;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.MutualContactsLocalLookups;
import com.p1.mobile.putong.data.PartialIdList;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
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
import l.c4g0;
import l.du2;
import l.e30;
import l.mkd0;
import l.oh80;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.z06;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l06 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final C0158c f16122a;

    /* JADX INFO: renamed from: l.l06$a */
    public class C0955a implements oh80<Contact> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HashSet f16123a;

        public C0955a(HashSet hashSet) {
            this.f16123a = hashSet;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Contact contact) {
            for (Contact contact2 : this.f16123a) {
                if (TextUtils.equals(contact2.name, contact.name) && ValueObject.util_equals(contact2.phoneNumbers, contact.phoneNumbers) && TextUtils.equals(contact2.thumbnailUri, contact.thumbnailUri) && TextUtils.equals(contact2.source, contact.source)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: l.l06$b */
    public class C0956b {

        /* JADX INFO: renamed from: a */
        public List<Contact> f16125a;

        /* JADX INFO: renamed from: b */
        public List<Contact> f16126b;

        public C0956b() {
        }
    }

    public l06(C0158c c0158c) {
        super(CoreModule.f1533b, "contacts_new" + CoreModule.m1850H().userId(), (SQLiteDatabase.CursorFactory) null, 1);
        SQLiteDatabase.deleteDatabase(CoreModule.f1533b.getDatabasePath("contacts" + CoreModule.m1850H().userId()));
        this.f16122a = c0158c;
    }

    /* JADX INFO: renamed from: F */
    public static HashSet<Contact> m18400F() {
        HashSet<Contact> hashSet = new HashSet<>();
        ContentResolver contentResolver = CoreModule.f1533b.getContentResolver();
        HashMap map = new HashMap();
        try {
            Cursor cursorQuery = contentResolver.query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "data1", "display_name", "photo_thumb_uri"}, "in_visible_group=? AND mimetype=?", new String[]{String.valueOf(1), "vnd.android.cursor.item/phone_v2"}, null);
            while (cursorQuery != null && cursorQuery.moveToNext()) {
                String string = cursorQuery.isNull(0) ? null : cursorQuery.getString(0);
                String string2 = cursorQuery.isNull(1) ? null : cursorQuery.getString(1);
                if (string2 != null) {
                    ContactNumber contactNumber = new ContactNumber();
                    String strM18413u = m18413u(string2);
                    contactNumber.hash8 = "";
                    contactNumber.hash11 = n06.m19622b(strM18413u);
                    contactNumber.number = strM18413u;
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
            CrashHelper.c(e);
            return hashSet;
        } catch (Exception e2) {
            CrashHelper.c(e2);
            return hashSet;
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ c m18401e(final C0956b c0956b) {
        return !c0956b.f16125a.isEmpty() ? ap7.m12177d3(vwb.Q(c0956b.f16125a, new w9j() { // from class: l.a06
            public final Object call(Object obj) {
                return ((Contact) obj).clone();
            }
        })).map(new w9j() { // from class: l.b06
            public final Object call(Object obj) {
                return l06.m18409m(c0956b, (roj0) obj);
            }
        }) : c.just(c0956b);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Contact m18404h(HashMap map, String str) {
        return (Contact) map.get(str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Pair m18405i(Act.r rVar) {
        return new Pair(Boolean.valueOf(rVar != null && rVar.b.d), Boolean.valueOf(rVar != null));
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Boolean m18406j(Contact contact, ContactNumber contactNumber) {
        Iterator it = contact.phoneNumbers.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(contactNumber.hash11, ((ContactNumber) it.next()).hash11)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C0956b m18409m(C0956b c0956b, roj0 roj0Var) {
        return c0956b;
    }

    /* JADX INFO: renamed from: u */
    public static String m18413u(String str) {
        if (str.startsWith("+")) {
            str = "00".concat(str.substring(1));
        }
        return str.replaceAll("[^\\d]", "");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[PHI: r2
      0x0078: PHI (r2v3 android.database.Cursor) = (r2v1 android.database.Cursor), (r2v2 android.database.Cursor), (r2v4 android.database.Cursor) binds: [B:21:0x0076, B:27:0x0085, B:25:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: A */
    public final ArrayList<Contact> m18414A(ContactNumber contactNumber) {
        ArrayList<Contact> arrayList = new ArrayList<>();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = getReadableDatabase().query("contacts", (String[]) null, "hashes LIKE ?", new String[]{"%" + contactNumber.hash8 + "$" + contactNumber.hash11 + "%"}, (String) null, (String) null, (String) null);
                    while (cursorQuery != null && cursorQuery.moveToNext()) {
                        arrayList.add(m18421r(cursorQuery));
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        return arrayList;
                    }
                } catch (IllegalStateException e) {
                    CrashHelper.c(e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                CrashHelper.c(e2);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e3) {
                CrashHelper.c(new Exception("ContactsDatabase lookup:" + e3.getMessage(), e3));
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
    public void m18415B(Envelope envelope) {
        final HashMap map = new HashMap();
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        CommonData moduleData2 = envelope.getModuleData(CommonData.class);
        for (Contact contact : moduleData.contacts) {
            map.put(((DbObject) contact).id, contact);
        }
        for (User user : moduleData2.users) {
            Profile profile = user.profile;
            PartialIdList partialIdList = profile.api_only_mutualContacts;
            if (partialIdList != null) {
                profile.contactLookups.next = partialIdList.links.next;
                if (!partialIdList.ids.isEmpty()) {
                    int size = user.profile.api_only_mutualContacts.ids.size();
                    MutualContactsLocalLookups mutualContactsLocalLookups = user.profile.contactLookups;
                    mutualContactsLocalLookups.batchSize = Math.max(mutualContactsLocalLookups.batchSize, size);
                    ArrayList arrayList = new ArrayList();
                    for (Contact contact2 : vwb.Q(user.profile.api_only_mutualContacts.ids, new w9j() { // from class: l.yz5
                        public final Object call(Object obj) {
                            return l06.m18404h(map, (String) obj);
                        }
                    })) {
                        if (contact2 != null) {
                            for (ContactNumber contactNumber : contact2.phoneNumbers) {
                                if (!TextUtils.isEmpty(contactNumber.hash11)) {
                                    for (Contact contact3 : m18414A(contactNumber)) {
                                        if (contact3.phoneNumbers.size() != 0) {
                                            boolean zIsEmpty = user.profile.contactLookups.lookups.isEmpty();
                                            Profile profile2 = user.profile;
                                            if (zIsEmpty) {
                                                profile2.contactLookups.lookups = vwb.f0(new Contact[]{contact3});
                                            } else if (!m18416C(profile2.contactLookups.lookups, contact3)) {
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
                        du2.a("ContactsDatabase", "u.id:" + ((DbObject) user).id + " nSize:" + size + " lookups.size:" + size2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            du2.a("ContactsDatabase", "u.id:" + ((DbObject) user).id + " origin data:" + ((Contact) it.next()).phoneNumbers);
                        }
                        int iMin = Math.min(size2, 100);
                        for (int i = 0; i < iMin; i++) {
                            du2.a("ContactsDatabase", "u.id:" + ((DbObject) user).id + " lookups:" + ((Contact) user.profile.contactLookups.lookups.get(i)).phoneNumbers);
                        }
                    }
                }
            }
            user.profile.api_only_mutualContacts = null;
        }
    }

    /* JADX INFO: renamed from: C */
    public boolean m18416C(List<Contact> list, final Contact contact) {
        return vwb.n(list, new w9j() { // from class: l.c06
            public final Object call(Object obj) {
                return Boolean.valueOf(vwb.n(((Contact) obj).phoneNumbers, new w9j() { // from class: l.d06
                    public final Object call(Object obj2) {
                        return l06.m18406j(contact, (ContactNumber) obj2);
                    }
                }).size() > 0);
            }
        }).size() > 0;
    }

    /* JADX INFO: renamed from: D */
    public final String m18417D(List<ContactNumber> list) {
        StringBuilder sb = new StringBuilder();
        for (ContactNumber contactNumber : list) {
            sb.append(contactNumber.hash8);
            sb.append("$");
            sb.append(contactNumber.hash11);
            sb.append("$");
            sb.append(contactNumber.number);
            sb.append(" ");
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    /* JADX INFO: renamed from: E */
    public c4g0 m18418E() {
        return mkd0.D(new v9j() { // from class: l.e06
            public final Object call() {
                return this.f10677a.m18424v();
            }
        }, Act.foreground().map(new w9j() { // from class: l.f06
            public final Object call(Object obj) {
                return l06.m18405i((Act.r) obj);
            }
        }), true).subscribe(mkd0.G(new e30() { // from class: l.g06
            public final void call(Object obj) {
                this.f13013a.m18425w((v9j) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: G */
    public c<roj0> m18419G() {
        return this.f16122a.now("checkContacts", c.fromCallable(new Callable() { // from class: l.h06
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13619a.m18427y();
            }
        }).flatMap(new w9j() { // from class: l.i06
            public final Object call(Object obj) {
                return l06.m18401e((l06.C0956b) obj);
            }
        }).doOnNext(new e30() { // from class: l.j06
            public final void call(Object obj) {
                this.f14913a.m18426x((l06.C0956b) obj);
            }
        }).compose(mkd0.N()).first().map(new w9j() { // from class: l.k06
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).compose(mkd0.C()));
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY, display_name TEXT, thumbnail_uri TEXT, hashes TEXT)");
    }

    /* JADX INFO: renamed from: q */
    public final boolean m18420q() {
        return PermissionHelper.b(new String[]{"android.permission.READ_CONTACTS"});
    }

    /* JADX INFO: renamed from: r */
    public final Contact m18421r(Cursor cursor) {
        Contact contact = new Contact();
        ((DbObject) contact)._id = cursor.isNull(0) ? 0L : cursor.getLong(0);
        contact.name = cursor.isNull(1) ? null : cursor.getString(1);
        contact.thumbnailUri = cursor.isNull(2) ? null : cursor.getString(2);
        contact.phoneNumbers = cursor.isNull(3) ? new ArrayList<>() : m18428z(cursor.getString(3));
        contact.source = "android";
        return contact;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public c<v9j<HashSet<Contact>>> m18424v() {
        return !m18420q() ? c.empty() : z06.c(ContactsContract.Contacts.CONTENT_URI, true, new v9j() { // from class: l.zz5
            public final Object call() {
                return l06.m18400F();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final Set<Contact> m18423t(HashSet<Contact> hashSet, HashSet<Contact> hashSet2) {
        return Sets.b(hashSet, new C0955a(hashSet2));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m18425w(v9j v9jVar) {
        m18419G();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m18426x(C0956b c0956b) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransactionNonExclusive();
        try {
            Iterator<Contact> it = c0956b.f16126b.iterator();
            while (it.hasNext()) {
                writableDatabase.delete("contacts", "_id=?", new String[]{Long.toString(((DbObject) it.next())._id)});
            }
            for (Contact contact : c0956b.f16125a) {
                if (contact != null) {
                    ContentValues contentValues = new ContentValues();
                    DbObject.cvPut(contentValues, "display_name", contact.name);
                    DbObject.cvPut(contentValues, "thumbnail_uri", contact.thumbnailUri);
                    DbObject.cvPut(contentValues, "hashes", m18417D(contact.phoneNumbers));
                    writableDatabase.insertOrThrow("contacts", (String) null, contentValues);
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
    public final /* synthetic */ C0956b m18427y() throws Exception {
        HashSet<Contact> hashSetM18400F = m18400F();
        Cursor cursorQuery = getWritableDatabase().query("contacts", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        HashSet<Contact> hashSet = new HashSet<>();
        while (cursorQuery != null && cursorQuery.moveToNext()) {
            hashSet.add(m18421r(cursorQuery));
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        C0956b c0956b = new C0956b();
        c0956b.f16125a = new ArrayList(m18423t(hashSetM18400F, hashSet));
        c0956b.f16126b = new ArrayList(m18423t(hashSet, hashSetM18400F));
        return c0956b;
    }

    /* JADX INFO: renamed from: z */
    public final List<ContactNumber> m18428z(String str) {
        String[] strArrSplit = str.split(" ");
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

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
