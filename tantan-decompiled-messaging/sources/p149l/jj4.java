package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p046p1.mobile.putong.core.p053ui.home.VirtualCard;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class jj4 {

    /* JADX INFO: renamed from: a */
    public User f118227a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f118228b;

    /* JADX INFO: renamed from: c */
    public a5m f118229c;

    /* JADX INFO: renamed from: d */
    public VirtualCard f118230d;

    /* JADX INFO: renamed from: e */
    public View f118231e;

    /* JADX INFO: renamed from: f */
    public C17798a f118232f;

    /* JADX INFO: renamed from: l.jj4$a */
    public static class C17798a {

        /* JADX INFO: renamed from: a */
        public C22392a<Boolean> f118233a;

        /* JADX INFO: renamed from: b */
        public C22392a<Boolean> f118234b;

        /* JADX INFO: renamed from: c */
        public List<Media> f118235c;

        /* JADX INFO: renamed from: d */
        public Media f118236d;

        /* JADX INFO: renamed from: e */
        public boolean f118237e;

        /* JADX INFO: renamed from: f */
        public List<String> f118238f = new ArrayList();

        /* JADX INFO: renamed from: a */
        public int m141752a() {
            Media media;
            if (vwb.m200296J(this.f118235c) || (media = this.f118236d) == null) {
                return -1;
            }
            return this.f118235c.indexOf(media);
        }

        /* JADX INFO: renamed from: b */
        public void m141753b() {
            this.f118233a = null;
            this.f118234b = null;
            this.f118235c = null;
            this.f118236d = null;
            this.f118237e = false;
            this.f118238f = new ArrayList();
        }
    }

    @Deprecated
    public jj4(a5m a5mVar) {
        this.f118230d = null;
        this.f118229c = a5mVar;
        this.f118231e = a5mVar.getCardView();
    }

    /* JADX INFO: renamed from: a */
    public a5m m141742a() {
        return this.f118229c;
    }

    /* JADX INFO: renamed from: b */
    public C17798a m141743b() {
        return this.f118232f;
    }

    /* JADX INFO: renamed from: c */
    public View m141744c() {
        return this.f118231e;
    }

    /* JADX INFO: renamed from: d */
    public User m141745d() {
        CoreSuggested.UserInfo userInfo;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        if (this.f118227a == null && (userInfo = this.f118228b) != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
            this.f118227a = liveLivingCardDataWrapper.getUser();
        }
        return this.f118227a;
    }

    /* JADX INFO: renamed from: e */
    public CoreSuggested.UserInfo m141746e() {
        return this.f118228b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            jj4 jj4Var = (jj4) obj;
            if (Objects.equals(this.f118227a, jj4Var.f118227a) && Objects.equals(this.f118228b, jj4Var.f118228b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public VirtualCard m141747f() {
        VirtualCard virtualCard = this.f118230d;
        if (virtualCard != null) {
            return virtualCard;
        }
        a5m a5mVar = this.f118229c;
        if (a5mVar != null) {
            return a5mVar.getVirtualCard();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m141748g() {
        return m141745d().f56011id;
    }

    /* JADX INFO: renamed from: h */
    public void m141749h(C17798a c17798a) {
        this.f118232f = c17798a;
    }

    public int hashCode() {
        return Objects.hash(this.f118227a, this.f118228b);
    }

    /* JADX INFO: renamed from: i */
    public void m141750i(User user) {
        this.f118227a = user;
    }

    /* JADX INFO: renamed from: j */
    public void m141751j(CoreSuggested.UserInfo userInfo) {
        this.f118228b = userInfo;
    }

    public jj4() {
        this.f118230d = null;
        this.f118229c = null;
    }

    public jj4(VirtualCard virtualCard) {
        this.f118230d = virtualCard;
        this.f118231e = virtualCard;
    }
}
