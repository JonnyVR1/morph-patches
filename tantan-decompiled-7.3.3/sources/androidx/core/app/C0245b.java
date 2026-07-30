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
import p153l.wyc0;

/* JADX INFO: renamed from: androidx.core.app.b */
/* JADX INFO: loaded from: classes.dex */
public class C0245b {

    /* JADX INFO: renamed from: a */
    public static final Object f1434a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f1435b = new Object();

    /* JADX INFO: renamed from: a */
    public static wyc0 m1256a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new wyc0(bundle.getString("resultKey"), bundle.getCharSequence(Constants.ScionAnalytics.PARAM_LABEL), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    /* JADX INFO: renamed from: b */
    public static wyc0[] m1257b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        wyc0[] wyc0VarArr = new wyc0[bundleArr.length];
        for (int i = 0; i < bundleArr.length; i++) {
            wyc0VarArr[i] = m1256a(bundleArr[i]);
        }
        return wyc0VarArr;
    }

    /* JADX INFO: renamed from: c */
    public static NotificationCompat.Action m1258c(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new NotificationCompat.Action(bundle.getInt("icon"), bundle.getCharSequence("title"), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), m1257b(m1259d(bundle, "remoteInputs")), m1257b(m1259d(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    /* JADX INFO: renamed from: d */
    public static Bundle[] m1259d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m1260e(NotificationCompat.Action action) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = action.getIconCompat();
        bundle.putInt("icon", iconCompat != null ? iconCompat.m1304n() : 0);
        bundle.putCharSequence("title", action.getTitle());
        bundle.putParcelable("actionIntent", action.getActionIntent());
        Bundle bundle2 = action.getExtras() != null ? new Bundle(action.getExtras()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m1262g(action.getRemoteInputs()));
        bundle.putBoolean("showsUserInterface", action.getShowsUserInterface());
        bundle.putInt("semanticAction", action.getSemanticAction());
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m1261f(wyc0 wyc0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", wyc0Var.m208593j());
        bundle.putCharSequence(Constants.ScionAnalytics.PARAM_LABEL, wyc0Var.m208592i());
        bundle.putCharSequenceArray("choices", wyc0Var.m208589f());
        bundle.putBoolean("allowFreeFormInput", wyc0Var.m208587d());
        bundle.putBundle("extras", wyc0Var.m208591h());
        Set<String> setM208588e = wyc0Var.m208588e();
        if (setM208588e != null && !setM208588e.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setM208588e.size());
            Iterator<String> it = setM208588e.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle[] m1262g(wyc0[] wyc0VarArr) {
        if (wyc0VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wyc0VarArr.length];
        for (int i = 0; i < wyc0VarArr.length; i++) {
            bundleArr[i] = m1261f(wyc0VarArr[i]);
        }
        return bundleArr;
    }
}
