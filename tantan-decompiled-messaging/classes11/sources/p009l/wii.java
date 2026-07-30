package p009l;

import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.member.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class wii {
    /* JADX INFO: renamed from: a */
    public static List<zii> m24223a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zii("all", App.e.getString(R.string.h0), true));
        arrayList.add(new zii("intl_new", App.e.getString(R.string.j0)));
        arrayList.add(new zii("intl_nearby", App.e.getString(R.string.r1)));
        arrayList.add(new zii("intl_recent", App.e.getString(R.string.u1)));
        arrayList.add(new zii("intl_profile", App.e.getString(R.string.i0)));
        arrayList.add(new zii("intl_real", App.e.getString(R.string.k0)));
        return arrayList;
    }
}
