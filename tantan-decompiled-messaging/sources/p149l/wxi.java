package p149l;

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
public class wxi {

    /* JADX INFO: renamed from: a */
    public static final Comparator<byte[]> f188484a = new Comparator() { // from class: l.vxi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return wxi.m206002a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: renamed from: l.wxi$a */
    public interface InterfaceC20990a {
        /* JADX INFO: renamed from: a */
        static InterfaceC20990a m206009a(Context context, Uri uri) {
            return new C20991b(context, uri);
        }

        /* JADX INFO: renamed from: b */
        Cursor mo206010b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: renamed from: l.wxi$b */
    @RequiresApi(24)
    public static class C20991b implements InterfaceC20990a {

        /* JADX INFO: renamed from: a */
        public final ContentProviderClient f188485a;

        public C20991b(Context context, Uri uri) {
            this.f188485a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // p149l.wxi.InterfaceC20990a
        /* JADX INFO: renamed from: b */
        public Cursor mo206010b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f188485a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // p149l.wxi.InterfaceC20990a
        public void close() {
            ContentProviderClient contentProviderClient = this.f188485a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m206002a(byte[] bArr, byte[] bArr2) {
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
    public static List<byte[]> m206003b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m206004c(List<byte[]> list, List<byte[]> list2) {
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
    public static List<List<byte[]>> m206005d(xxi xxiVar, Resources resources) {
        return xxiVar.m211491b() != null ? xxiVar.m211491b() : ayi.m99547c(resources, xxiVar.m211492c());
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static byi.C16013a m206006e(@NonNull Context context, @NonNull xxi xxiVar, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoM206007f = m206007f(context.getPackageManager(), xxiVar, context.getResources());
        return providerInfoM206007f == null ? byi.C16013a.m104461a(1, null) : byi.C16013a.m104461a(0, m206008g(context, xxiVar, providerInfoM206007f.authority, cancellationSignal));
    }

    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public static ProviderInfo m206007f(@NonNull PackageManager packageManager, @NonNull xxi xxiVar, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String strM211494e = xxiVar.m211494e();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strM211494e, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strM211494e);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(xxiVar.m211495f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strM211494e + ", but package was not " + xxiVar.m211495f());
        }
        List<byte[]> listM206003b = m206003b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listM206003b, f188484a);
        List<List<byte[]>> listM206005d = m206005d(xxiVar, resources);
        for (int i = 0; i < listM206005d.size(); i++) {
            ArrayList arrayList = new ArrayList(listM206005d.get(i));
            Collections.sort(arrayList, f188484a);
            if (m206004c(listM206003b, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    @NonNull
    @VisibleForTesting
    /* JADX INFO: renamed from: g */
    public static byi.C16014b[] m206008g(Context context, xxi xxiVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        InterfaceC20990a interfaceC20990a;
        InterfaceC20990a interfaceC20990a2;
        Uri uriWithAppendedId;
        boolean z;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        InterfaceC20990a interfaceC20990aM206009a = InterfaceC20990a.m206009a(context, uriBuild);
        Cursor cursorMo206010b = null;
        try {
            cursorMo206010b = interfaceC20990aM206009a.mo206010b(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{xxiVar.m211496g()}, null, cancellationSignal);
            if (cursorMo206010b == null || cursorMo206010b.getCount() <= 0) {
                interfaceC20990a2 = interfaceC20990aM206009a;
            } else {
                int columnIndex = cursorMo206010b.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorMo206010b.getColumnIndex("_id");
                int columnIndex3 = cursorMo206010b.getColumnIndex("file_id");
                int columnIndex4 = cursorMo206010b.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorMo206010b.getColumnIndex("font_weight");
                int columnIndex6 = cursorMo206010b.getColumnIndex("font_italic");
                while (cursorMo206010b.moveToNext()) {
                    int i = columnIndex != -1 ? cursorMo206010b.getInt(columnIndex) : 0;
                    int i2 = columnIndex4 != -1 ? cursorMo206010b.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        interfaceC20990a = interfaceC20990aM206009a;
                        try {
                            uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorMo206010b.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursorMo206010b != null) {
                                cursorMo206010b.close();
                            }
                            interfaceC20990a.close();
                            throw th;
                        }
                    } else {
                        interfaceC20990a = interfaceC20990aM206009a;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorMo206010b.getLong(columnIndex3));
                    }
                    int i3 = columnIndex5 != -1 ? cursorMo206010b.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z = true;
                        if (cursorMo206010b.getInt(columnIndex6) != 1) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    arrayList2.add(byi.C16014b.m104464a(uriWithAppendedId, i2, i3, z, i));
                    interfaceC20990aM206009a = interfaceC20990a;
                }
                interfaceC20990a2 = interfaceC20990aM206009a;
                arrayList = arrayList2;
            }
            if (cursorMo206010b != null) {
                cursorMo206010b.close();
            }
            interfaceC20990a2.close();
            return (byi.C16014b[]) arrayList.toArray(new byi.C16014b[0]);
        } catch (Throwable th2) {
            th = th2;
            interfaceC20990a = interfaceC20990aM206009a;
        }
    }
}
