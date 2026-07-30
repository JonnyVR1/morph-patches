package p153l;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class s0j {

    /* JADX INFO: renamed from: a */
    public static final Comparator<byte[]> f165706a = new Comparator() { // from class: l.r0j
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return s0j.m183951a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: l.s0j$a */
    public interface InterfaceC19948a {
        /* JADX INFO: renamed from: a */
        static InterfaceC19948a m183958a(Context context, Uri uri) {
            return new C19949b(context, uri);
        }

        /* JADX INFO: renamed from: b */
        Cursor mo183959b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: renamed from: l.s0j$b */
    @RequiresApi(24)
    public static class C19949b implements InterfaceC19948a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f165707a;

        public C19949b(Context context, Uri uri) {
            this.f165707a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p153l.s0j.InterfaceC19948a
        /* JADX INFO: renamed from: b */
        public Cursor mo183959b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f165707a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // p153l.s0j.InterfaceC19948a
        public void close() {
            ContentProviderClient contentProviderClient = this.f165707a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m183951a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static List<byte[]> m183952b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m183953c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static List<List<byte[]>> m183954d(t0j t0jVar, Resources resources) {
        return t0jVar.m188774b() != null ? t0jVar.m188774b() : w0j.m204183c(resources, t0jVar.m188775c());
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static x0j.C21222a m183955e(@NonNull Context context, @NonNull t0j t0jVar, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM183956f = m183956f(context.getPackageManager(), t0jVar, context.getResources());
        return providerInfoM183956f == null ? x0j.C21222a.m208858a(1, null) : x0j.C21222a.m208858a(0, m183957g(context, t0jVar, providerInfoM183956f.authority, cancellationSignal));
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static ProviderInfo m183956f(@NonNull PackageManager packageManager, @NonNull t0j t0jVar, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String strM188777e = t0jVar.m188777e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM188777e, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM188777e);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(t0jVar.m188778f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM188777e + ", but package was not " + t0jVar.m188778f());
        }
        List<byte[]> listM183952b = m183952b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM183952b, f165706a);
        List<List<byte[]>> listM183954d = m183954d(t0jVar, resources);
        for (int i = 0; i < listM183954d.size(); i++) {
            ArrayList arrayList = new ArrayList(listM183954d.get(i));
            Collections.sort(arrayList, f165706a);
            if (m183953c(listM183952b, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    @NonNull
    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static x0j.C21223b[] m183957g(Context context, t0j t0jVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        InterfaceC19948a interfaceC19948a;
        InterfaceC19948a interfaceC19948a2;
        Uri uriWithAppendedId;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC19948a interfaceC19948aM183958a = InterfaceC19948a.m183958a(context, uriBuild);
        Cursor cursorMo183959b = null;
        try {
            cursorMo183959b = interfaceC19948aM183958a.mo183959b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{t0jVar.m188779g()}, null, cancellationSignal);
            if (cursorMo183959b == null || cursorMo183959b.getCount() <= 0) {
                interfaceC19948a2 = interfaceC19948aM183958a;
            } else {
                int columnIndex = cursorMo183959b.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorMo183959b.getColumnIndex("_id");
                int columnIndex3 = cursorMo183959b.getColumnIndex("file_id");
                int columnIndex4 = cursorMo183959b.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo183959b.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo183959b.getColumnIndex("font_italic");
                while (cursorMo183959b.moveToNext()) {
                    int i = columnIndex != -1 ? cursorMo183959b.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursorMo183959b.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        interfaceC19948a = interfaceC19948aM183958a;
                        try {
                            uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorMo183959b.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursorMo183959b != null) {
                                cursorMo183959b.close();
                            }
                            interfaceC19948a.close();
                            throw th;
                        }
                    } else {
                        interfaceC19948a = interfaceC19948aM183958a;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorMo183959b.getLong(columnIndex3));
                    }
                    int i3 = columnIndex5 != -1 ? cursorMo183959b.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursorMo183959b.getInt(columnIndex6) != 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    arrayList2.add(x0j.C21223b.m208861a(uriWithAppendedId, i2, i3, z, i));
                    interfaceC19948aM183958a = interfaceC19948a;
                }
                interfaceC19948a2 = interfaceC19948aM183958a;
                arrayList = arrayList2;
            }
            if (cursorMo183959b != null) {
                cursorMo183959b.close();
            }
            interfaceC19948a2.close();
            return (x0j.C21223b[]) arrayList.toArray(new x0j.C21223b[0]);
        } catch (Throwable th2) {
            th = th2;
            interfaceC19948a = interfaceC19948aM183958a;
        }
    }
}
