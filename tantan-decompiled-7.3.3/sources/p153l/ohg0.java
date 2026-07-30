package p153l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.InputStream;
import okio.Okio;

/* JADX INFO: loaded from: classes.dex */
public final class ohg0 extends uxg0 {

    /* JADX INFO: renamed from: b */
    public static final UriMatcher f147446b;

    /* JADX INFO: renamed from: a */
    public final Context f147447a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f147446b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public ohg0(Context context) {
        this.f147447a = context;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[PHI: r5
      0x002f: PHI (r5v4 android.net.Uri) = (r5v2 android.net.Uri), (r5v1 android.net.Uri) binds: [B:14:0x002b, B:6:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p153l.uxg0
    /* JADX INFO: renamed from: b */
    public final aig0 mo118414b(lxg0 lxg0Var, int i) throws FileNotFoundException {
        InputStream inputStreamOpenContactPhotoInputStream;
        ContentResolver contentResolver = this.f147447a.getContentResolver();
        Uri uriLookupContact = lxg0Var.f133955a;
        int iMatch = f147446b.match(uriLookupContact);
        if (iMatch != 1) {
            if (iMatch != 2) {
                if (iMatch == 3) {
                    inputStreamOpenContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uriLookupContact, true);
                } else if (iMatch != 4) {
                    xtq0.m213103a("Invalid uri: ", uriLookupContact);
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
        return new aig0(Okio.source(inputStreamOpenContactPhotoInputStream), 2);
    }

    @Override // p153l.uxg0
    /* JADX INFO: renamed from: d */
    public final boolean mo118415d(lxg0 lxg0Var) {
        Uri uri = lxg0Var.f133955a;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f147446b.match(lxg0Var.f133955a) != -1;
    }
}
