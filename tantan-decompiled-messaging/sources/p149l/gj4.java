package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CityCData;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class gj4 extends AbstractC17222h4 {
    public gj4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return this.f105774a != null;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: f */
    public boolean getShouldShowNextLabel() {
        return false;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        if (this.f105776c.m127249g0() == null) {
            return false;
        }
        CityCData cityCData = this.f105775b.cityCData;
        if (cityCData == null || TextUtils.isEmpty(cityCData.userId)) {
            xdl0.m208344M(this.f105776c.m127249g0(), false);
            return false;
        }
        xdl0.m208344M(this.f105776c.m127249g0(), true);
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
