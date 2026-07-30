package p149l;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class gzf0 extends avv<InputStream> {

    /* JADX INFO: renamed from: d */
    private static final UriMatcher f105133d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f105133d = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public gzf0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX INFO: renamed from: g */
    private InputStream m128855g(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int iMatch = f105133d.match(uri);
        if (iMatch != 1) {
            if (iMatch == 3) {
                return m128856h(contentResolver, uri);
            }
            if (iMatch != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri uriLookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uriLookupContact != null) {
            return m128856h(contentResolver, uriLookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* JADX INFO: renamed from: h */
    private InputStream m128856h(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // p149l.l4c
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo103356a() {
        return InputStream.class;
    }

    @Override // p149l.avv
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo99208b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // p149l.avv
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream mo99209c(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream inputStreamM128855g = m128855g(uri, contentResolver);
        if (inputStreamM128855g != null) {
            return inputStreamM128855g;
        }
        csg0.m108511a("InputStream is null for ", uri);
        return null;
    }
}
