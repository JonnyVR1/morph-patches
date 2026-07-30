package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class zxa0 implements z5y<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f206450a;

    public zxa0(String str, int i) {
        ArrayList arrayList = new ArrayList();
        this.f206450a = arrayList;
        User userById = (TextUtils.equals(CoreModule.m30929H().userId(), str) && i == 2) ? aw90.m100562F().f73701a : CoreModule.m30930K().getUserById(str);
        if (userById == null) {
            CrashHelper.m82479c(new IllegalStateException("get Pet Images from a None-In-Cache User"));
            return;
        }
        ArrayList arrayListM147486Q = jyb.m147486Q(userById.profile.extensions.wealth.petImg, new eqd());
        if (jyb.m147479J(arrayListM147486Q)) {
            return;
        }
        arrayList.addAll(arrayListM147486Q);
    }

    @Override // p153l.z5y
    /* JADX INFO: renamed from: a */
    public int mo131371a(final String str) {
        return jyb.m147476G(this.f206450a, new qcj() { // from class: l.yxa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((Media) obj).url));
            }
        });
    }

    @Override // p153l.z5y
    public List<Media> source() {
        return this.f206450a;
    }
}
