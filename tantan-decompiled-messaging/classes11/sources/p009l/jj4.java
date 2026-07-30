package p009l;

import android.view.View;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p1.mobile.putong.core.ui.home.VirtualCard;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.vwb;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jj4 {

    /* JADX INFO: renamed from: a */
    public User f15195a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f15196b;

    /* JADX INFO: renamed from: c */
    public a5m f15197c;

    /* JADX INFO: renamed from: d */
    public VirtualCard f15198d;

    /* JADX INFO: renamed from: e */
    public View f15199e;

    /* JADX INFO: renamed from: f */
    public C0976a f15200f;

    /* JADX INFO: renamed from: l.jj4$a */
    public static class C0976a {

        /* JADX INFO: renamed from: a */
        public a<Boolean> f15201a;

        /* JADX INFO: renamed from: b */
        public a<Boolean> f15202b;

        /* JADX INFO: renamed from: c */
        public List<Media> f15203c;

        /* JADX INFO: renamed from: d */
        public Media f15204d;

        /* JADX INFO: renamed from: e */
        public boolean f15205e;

        /* JADX INFO: renamed from: f */
        public List<String> f15206f = new ArrayList();

        /* JADX INFO: renamed from: a */
        public int m17137a() {
            Media media;
            if (vwb.J(this.f15203c) || (media = this.f15204d) == null) {
                return -1;
            }
            return this.f15203c.indexOf(media);
        }

        /* JADX INFO: renamed from: b */
        public void m17138b() {
            this.f15201a = null;
            this.f15202b = null;
            this.f15203c = null;
            this.f15204d = null;
            this.f15205e = false;
            this.f15206f = new ArrayList();
        }
    }

    @Deprecated
    public jj4(a5m a5mVar) {
        this.f15198d = null;
        this.f15197c = a5mVar;
        this.f15199e = a5mVar.getCardView();
    }

    /* JADX INFO: renamed from: a */
    public a5m m17127a() {
        return this.f15197c;
    }

    /* JADX INFO: renamed from: b */
    public C0976a m17128b() {
        return this.f15200f;
    }

    /* JADX INFO: renamed from: c */
    public View m17129c() {
        return this.f15199e;
    }

    /* JADX INFO: renamed from: d */
    public User m17130d() {
        CoreSuggested.UserInfo userInfo;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        if (this.f15195a == null && (userInfo = this.f15196b) != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
            this.f15195a = liveLivingCardDataWrapper.getUser();
        }
        return this.f15195a;
    }

    /* JADX INFO: renamed from: e */
    public CoreSuggested.UserInfo m17131e() {
        return this.f15196b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jj4 jj4Var = (jj4) obj;
            if (Objects.equals(this.f15195a, jj4Var.f15195a) && Objects.equals(this.f15196b, jj4Var.f15196b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public VirtualCard m17132f() {
        VirtualCard virtualCard = this.f15198d;
        if (virtualCard != null) {
            return virtualCard;
        }
        a5m a5mVar = this.f15197c;
        if (a5mVar != null) {
            return a5mVar.getVirtualCard();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m17133g() {
        return ((DbObject) m17130d()).id;
    }

    /* JADX INFO: renamed from: h */
    public void m17134h(C0976a c0976a) {
        this.f15200f = c0976a;
    }

    public int hashCode() {
        return Objects.hash(this.f15195a, this.f15196b);
    }

    /* JADX INFO: renamed from: i */
    public void m17135i(User user) {
        this.f15195a = user;
    }

    /* JADX INFO: renamed from: j */
    public void m17136j(CoreSuggested.UserInfo userInfo) {
        this.f15196b = userInfo;
    }

    public jj4() {
        this.f15198d = null;
        this.f15197c = null;
    }

    public jj4(VirtualCard virtualCard) {
        this.f15198d = virtualCard;
        this.f15199e = virtualCard;
    }
}
