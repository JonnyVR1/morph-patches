package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class om90 implements cxx<Media> {

    /* JADX INFO: renamed from: a */
    public final List<Media> f144590a;

    public om90(String str, int i) {
        ArrayList arrayList = new ArrayList();
        this.f144590a = arrayList;
        User userById = (TextUtils.equals(CoreModule.m29931H().userId(), str) && i == 3) ? wn90.m204602F().f187269a : CoreModule.m29932K().getUserById(str);
        if (userById == null) {
            CrashHelper.m81296c(new IllegalStateException("get Game Images from a None-In-Cache User"));
            return;
        }
        ArrayList arrayListM200303Q = vwb.m200303Q(userById.profile.extensions.game.screenshot, new zod());
        if (vwb.m200296J(arrayListM200303Q)) {
            return;
        }
        arrayList.addAll(arrayListM200303Q);
    }

    @Override // p149l.cxx
    /* JADX INFO: renamed from: a */
    public int mo103052a(final String str) {
        return vwb.m200293G(this.f144590a, new w9j() { // from class: l.nm90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((Media) obj).url));
            }
        });
    }

    @Override // p149l.cxx
    public List<Media> source() {
        return this.f144590a;
    }
}
