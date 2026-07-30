package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class aoh0 {

    /* JADX INFO: renamed from: a */
    public final int f72454a;

    /* JADX INFO: renamed from: b */
    public final List<Media> f72455b;

    /* JADX INFO: renamed from: c */
    public List<Media> f72456c;

    public aoh0(CoreSuggested.UserInfo userInfo, User user) {
        if (!gra.m131606N3() || !userInfo.isMomentInfoCard()) {
            this.f72454a = 0;
            this.f72455b = user.pictures;
            return;
        }
        if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "text")) {
            this.f72456c = jyb.m147507f0(user.media(0));
        } else if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "noHuman")) {
            this.f72456c = new ArrayList(jyb.m147486Q(userInfo.coreMomentInfo.media, new qcj() { // from class: l.znh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            }));
        } else {
            this.f72456c = jyb.m147486Q(userInfo.coreMomentInfo.media, new qcj() { // from class: l.znh0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            });
        }
        this.f72454a = 0;
        this.f72455b = user.pictures;
    }

    /* JADX INFO: renamed from: a */
    public List<Media> m99080a() {
        return this.f72455b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<Media> m99081b() {
        return this.f72456c;
    }

    /* JADX INFO: renamed from: c */
    public int m99082c() {
        return this.f72454a;
    }
}
