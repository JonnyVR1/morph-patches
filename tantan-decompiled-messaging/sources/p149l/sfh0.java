package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class sfh0 {

    /* JADX INFO: renamed from: a */
    public final int f164292a;

    /* JADX INFO: renamed from: b */
    public final List<Media> f164293b;

    /* JADX INFO: renamed from: c */
    public List<Media> f164294c;

    public sfh0(CoreSuggested.UserInfo userInfo, User user) {
        if (!upa.m194675N3() || !userInfo.isMomentInfoCard()) {
            this.f164292a = 0;
            this.f164293b = user.pictures;
            return;
        }
        if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "text")) {
            this.f164294c = vwb.m200324f0(user.media(0));
        } else if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "noHuman")) {
            this.f164294c = new ArrayList(vwb.m200303Q(userInfo.coreMomentInfo.media, new w9j() { // from class: l.rfh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            }));
        } else {
            this.f164294c = vwb.m200303Q(userInfo.coreMomentInfo.media, new w9j() { // from class: l.rfh0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            });
        }
        this.f164292a = 0;
        this.f164293b = user.pictures;
    }

    /* JADX INFO: renamed from: a */
    public List<Media> m183924a() {
        return this.f164293b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<Media> m183925b() {
        return this.f164294c;
    }

    /* JADX INFO: renamed from: c */
    public int m183926c() {
        return this.f164292a;
    }
}
