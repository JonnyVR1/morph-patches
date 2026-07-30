package p003l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;
import l.vwb;
import l.wn90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vpa0 implements cxx<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f8366a;

    public vpa0(String str, int i) {
        ArrayList arrayList = new ArrayList();
        this.f8366a = arrayList;
        User userById = (TextUtils.equals(CoreModule.H().userId(), str) && i == 2) ? wn90.F().a : CoreModule.K().getUserById(str);
        if (userById == null) {
            CrashHelper.c(new IllegalStateException("get Pet Images from a None-In-Cache User"));
            return;
        }
        ArrayList arrayListQ = vwb.Q(userById.profile.extensions.wealth.petImg, new zod());
        if (vwb.J(arrayListQ)) {
            return;
        }
        arrayList.addAll(arrayListQ);
    }

    @Override // p003l.cxx
    /* JADX INFO: renamed from: a */
    public int mo2976a(final String str) {
        return vwb.G(this.f8366a, new w9j() { // from class: l.upa0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((Media) obj).url));
            }
        });
    }

    @Override // p003l.cxx
    public List<Media> source() {
        return this.f8366a;
    }
}
