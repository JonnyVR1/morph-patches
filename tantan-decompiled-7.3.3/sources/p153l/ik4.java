package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.LiveLivingCardDataWrapper;
import com.p051p1.mobile.putong.core.p058ui.home.VirtualCard;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class ik4 {

    /* JADX INFO: renamed from: a */
    public User f115323a;

    /* JADX INFO: renamed from: b */
    public CoreSuggested.UserInfo f115324b;

    /* JADX INFO: renamed from: c */
    public q7m f115325c;

    /* JADX INFO: renamed from: d */
    public VirtualCard f115326d;

    /* JADX INFO: renamed from: e */
    public View f115327e;

    /* JADX INFO: renamed from: f */
    public C17729a f115328f;

    /* JADX INFO: renamed from: l.ik4$a */
    public static class C17729a {

        /* JADX INFO: renamed from: a */
        public C22507a<Boolean> f115329a;

        /* JADX INFO: renamed from: b */
        public C22507a<Boolean> f115330b;

        /* JADX INFO: renamed from: c */
        public List<Media> f115331c;

        /* JADX INFO: renamed from: d */
        public Media f115332d;

        /* JADX INFO: renamed from: e */
        public boolean f115333e;

        /* JADX INFO: renamed from: f */
        public List<String> f115334f = new ArrayList();

        /* JADX INFO: renamed from: a */
        public int m140266a() {
            Media media;
            if (jyb.m147479J(this.f115331c) || (media = this.f115332d) == null) {
                return -1;
            }
            return this.f115331c.indexOf(media);
        }

        /* JADX INFO: renamed from: b */
        public void m140267b() {
            this.f115329a = null;
            this.f115330b = null;
            this.f115331c = null;
            this.f115332d = null;
            this.f115333e = false;
            this.f115334f = new ArrayList();
        }
    }

    @Deprecated
    public ik4(q7m q7mVar) {
        this.f115326d = null;
        this.f115325c = q7mVar;
        this.f115327e = q7mVar.getCardView();
    }

    /* JADX INFO: renamed from: a */
    public q7m m140256a() {
        return this.f115325c;
    }

    /* JADX INFO: renamed from: b */
    public C17729a m140257b() {
        return this.f115328f;
    }

    /* JADX INFO: renamed from: c */
    public View m140258c() {
        return this.f115327e;
    }

    /* JADX INFO: renamed from: d */
    public User m140259d() {
        CoreSuggested.UserInfo userInfo;
        LiveLivingCardDataWrapper liveLivingCardDataWrapper;
        if (this.f115323a == null && (userInfo = this.f115324b) != null && (liveLivingCardDataWrapper = userInfo.liveLivingCardDataWrapper) != null) {
            this.f115323a = liveLivingCardDataWrapper.getUser();
        }
        return this.f115323a;
    }

    /* JADX INFO: renamed from: e */
    public CoreSuggested.UserInfo m140260e() {
        return this.f115324b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ik4 ik4Var = (ik4) obj;
            if (Objects.equals(this.f115323a, ik4Var.f115323a) && Objects.equals(this.f115324b, ik4Var.f115324b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public VirtualCard m140261f() {
        VirtualCard virtualCard = this.f115326d;
        if (virtualCard != null) {
            return virtualCard;
        }
        q7m q7mVar = this.f115325c;
        if (q7mVar != null) {
            return q7mVar.getVirtualCard();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m140262g() {
        return m140259d().f56859id;
    }

    /* JADX INFO: renamed from: h */
    public void m140263h(C17729a c17729a) {
        this.f115328f = c17729a;
    }

    public int hashCode() {
        return Objects.hash(this.f115323a, this.f115324b);
    }

    /* JADX INFO: renamed from: i */
    public void m140264i(User user) {
        this.f115323a = user;
    }

    /* JADX INFO: renamed from: j */
    public void m140265j(CoreSuggested.UserInfo userInfo) {
        this.f115324b = userInfo;
    }

    public ik4() {
        this.f115326d = null;
        this.f115325c = null;
    }

    public ik4(VirtualCard virtualCard) {
        this.f115326d = virtualCard;
        this.f115327e = virtualCard;
    }
}
