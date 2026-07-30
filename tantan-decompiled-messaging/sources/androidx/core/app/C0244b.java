package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p149l.rqc0;

/* JADX INFO: renamed from: androidx.core.app.b */
/* JADX INFO: loaded from: classes.dex */
public class C0244b {

    /* JADX INFO: renamed from: a */
    public static final Object f1434a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f1435b = new Object();

    /* JADX INFO: renamed from: a */
    public static rqc0 m1255a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new rqc0(bundle.getString("resultKey"), bundle.getCharSequence(Constants.ScionAnalytics.PARAM_LABEL), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    /* JADX INFO: renamed from: b */
    public static rqc0[] m1256b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        rqc0[] rqc0VarArr = new rqc0[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            rqc0VarArr[i] = m1255a(bundleArr[i]);
        }
        return rqc0VarArr;
    }

    /* JADX INFO: renamed from: c */
    public static NotificationCompat.Action m1257c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), m1256b(m1258d(bundle, "remoteInputs")), m1256b(m1258d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    /* JADX INFO: renamed from: d */
    public static Bundle[] m1258d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m1259e(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = action.getIconCompat();
        bundle.putInt("icon", iconCompat != null ? iconCompat.m1303n() : 0);
        bundle.putCharSequence("title", action.getTitle());
        bundle.putParcelable("actionIntent", action.getActionIntent());
        Bundle bundle2 = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1261g(action.getRemoteInputs()));
        bundle.putBoolean("showsUserInterface", action.getShowsUserInterface());
        bundle.putInt("semanticAction", action.getSemanticAction());
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m1260f(rqc0 rqc0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", rqc0Var.m180421j());
        bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, rqc0Var.m180420i());
        bundle.putCharSequenceArray("choices", rqc0Var.m180417f());
        bundle.putBoolean("allowFreeFormInput", rqc0Var.m180415d());
        bundle.putBundle("extras", rqc0Var.m180419h());
        Set<String> setM180416e = rqc0Var.m180416e();
        if (setM180416e != null && !setM180416e.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM180416e.size());
            Iterator<String> it = setM180416e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle[] m1261g(rqc0[] rqc0VarArr) {
        if (rqc0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[rqc0VarArr.length];
        for (int i = 0; i < rqc0VarArr.length; i++) {
            bundleArr[i] = m1260f(rqc0VarArr[i]);
        }
        return bundleArr;
    }
}
