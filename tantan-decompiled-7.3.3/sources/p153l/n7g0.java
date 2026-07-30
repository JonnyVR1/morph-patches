package p153l;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class n7g0 extends bxv<InputStream> {

    /* JADX INFO: renamed from: d */
    private static final UriMatcher f140604d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f140604d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public n7g0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: renamed from: g */
    private InputStream m161873g(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f140604d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m161874h(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m161874h(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: renamed from: h */
    private InputStream m161874h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // p153l.t5c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo106029a() {
        return InputStream.class;
    }

    @Override // p153l.bxv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo106912b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p153l.bxv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo106913c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM161873g = m161873g(uri, contentResolver);
        if (inputStreamM161873g != null) {
            return inputStreamM161873g;
        }
        k0h0.m147792a("InputStream is null for ", uri);
        return null;
    }
}
