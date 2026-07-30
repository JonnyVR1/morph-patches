package p009l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import l.upa;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sfh0 {

    /* JADX INFO: renamed from: a */
    public final int f20220a;

    /* JADX INFO: renamed from: b */
    public final List<Media> f20221b;

    /* JADX INFO: renamed from: c */
    public List<Media> f20222c;

    public sfh0(CoreSuggested.UserInfo userInfo, User user) {
        if (!upa.N3() || !userInfo.isMomentInfoCard()) {
            this.f20220a = 0;
            this.f20221b = user.pictures;
            return;
        }
        if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "text")) {
            this.f20222c = vwb.f0(new Media[]{user.media(0)});
        } else if (TextUtils.equals(userInfo.coreMomentInfo.sourceType, "noHuman")) {
            this.f20222c = new ArrayList(vwb.Q(userInfo.coreMomentInfo.media, new w9j() { // from class: l.rfh0
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            }));
        } else {
            this.f20222c = vwb.Q(userInfo.coreMomentInfo.media, new w9j() { // from class: l.rfh0
                public final Object call(Object obj) {
                    return ((Media) obj).cover();
                }
            });
        }
        this.f20220a = 0;
        this.f20221b = user.pictures;
    }

    /* JADX INFO: renamed from: a */
    public List<Media> m22132a() {
        return this.f20221b;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public List<Media> m22133b() {
        return this.f20222c;
    }

    /* JADX INFO: renamed from: c */
    public int m22134c() {
        return this.f20220a;
    }
}
