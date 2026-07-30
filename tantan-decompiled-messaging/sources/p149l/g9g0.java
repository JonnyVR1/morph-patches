package p149l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class g9g0 extends mpg0 {

    /* JADX INFO: renamed from: b */
    public static final UriMatcher f101562b;

    /* JADX INFO: renamed from: a */
    public final Context f101563a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f101562b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public g9g0(Context context) {
        this.f101563a = context;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r5
      0x002f: PHI (r5v4 android.net.Uri) = (r5v2 android.net.Uri), (r5v1 android.net.Uri) binds: [B:14:0x002b, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p149l.mpg0
    /* JADX INFO: renamed from: b */
    public final s9g0 mo113471b(dpg0 dpg0Var, int i) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f101563a.getContentResolver();
        Uri uriLookupContact = dpg0Var.f87271a;
        int iMatch = f101562b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch == 3) {
                    inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
                } else if (iMatch != 4) {
                    rkq0.m179764a("Invalid uri: ", uriLookupContact);
                    return null;
                }
            }
            inputStreamOpenContactPhotoInputStream = contentResolver.openInputStream(uriLookupContact);
        } else {
            uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uriLookupContact);
            if (uriLookupContact == null) {
                inputStreamOpenContactPhotoInputStream = null;
            } else {
                inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
            }
        }
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        return new s9g0(Okio.source(inputStreamOpenContactPhotoInputStream), 2);
    }

    @Override // p149l.mpg0
    /* JADX INFO: renamed from: d */
    public final boolean mo113472d(dpg0 dpg0Var) {
        Uri uri = dpg0Var.f87271a;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f101562b.match(dpg0Var.f87271a) != -1;
    }
}
