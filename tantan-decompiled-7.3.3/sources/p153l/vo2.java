package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class vo2 {

    /* JADX INFO: renamed from: a */
    private static final ArrayList<uo2> f184989a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    private static Object[] m202055a() {
        Object[] array;
        ArrayList<uo2> arrayList = f184989a;
        synchronized (arrayList) {
            try {
                array = arrayList.size() > 0 ? arrayList.toArray() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return array;
    }

    /* JADX INFO: renamed from: b */
    public static void m202056b(Fragment fragment, Bundle bundle) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196959b(fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m202057c(Fragment fragment, Activity activity) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196960c(fragment, activity);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m202058d(Fragment fragment, Bundle bundle) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196964g(fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m202059e(Fragment fragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196962e(fragment, layoutInflater, viewGroup, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m202060f(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196965h(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m202061g(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196958a(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m202062h(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196971n(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m202063i(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196968k(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m202064j(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196969l(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m202065k(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196961d(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m202066l(Fragment fragment, Bundle bundle) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196967j(fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m202067m(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196963f(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m202068n(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196966i(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m202069o(Fragment fragment) {
        Object[] objArrM202055a = m202055a();
        if (objArrM202055a != null) {
            for (Object obj : objArrM202055a) {
                ((uo2) obj).m196970m(fragment);
            }
        }
    }
}
