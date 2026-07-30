package p009l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.f30;
import l.hmb;
import l.mcr;
import l.wp1;

/* JADX INFO: renamed from: l.q6 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class AbstractC1135q6<T> implements gnl {

    /* JADX INFO: renamed from: a */
    public final BusinessConversationView f19041a;

    /* JADX INFO: renamed from: b */
    public AbstractC1278w4<T> f19042b;

    /* JADX INFO: renamed from: c */
    public AbstractC1135q6<?> f19043c;

    /* JADX INFO: renamed from: d */
    public AbstractC1135q6<?> f19044d;

    public AbstractC1135q6(BusinessConversationView businessConversationView) {
        this.f19041a = businessConversationView;
        m20813h();
    }

    @Override // p009l.gnl
    /* JADX INFO: renamed from: b */
    public void mo6472b(@NonNull mcr mcrVar, @NonNull wp1<Conversation> wp1Var) {
        AbstractC1135q6<?> abstractC1135q6 = this.f19043c;
        if (abstractC1135q6 != null) {
            abstractC1135q6.mo6472b(mcrVar, wp1Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public Context m20812f() {
        return this.f19041a.getContext();
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC1278w4<T> mo6473g();

    /* JADX INFO: renamed from: h */
    public final void m20813h() {
        T t = NullChecker.a(this.f19042b) ? this.f19042b.f21884b : null;
        AbstractC1278w4<T> abstractC1278w4Mo6473g = mo6473g();
        this.f19042b = abstractC1278w4Mo6473g;
        abstractC1278w4Mo6473g.m23869s(t);
        this.f19042b.m23861f(new e30() { // from class: l.m6
            public final void call(Object obj) {
                this.f16509a.m20814j((CharSequence) obj);
            }
        });
        this.f19042b.m23862g(new e30() { // from class: l.n6
            public final void call(Object obj) {
                this.f17227a.m20815k((CharSequence) obj);
            }
        });
        this.f19042b.m23860e(new f30() { // from class: l.o6
            public final void call(Object obj, Object obj2) {
                this.f17846a.m20816l((Picture.ImageUri) obj, (Integer) obj2);
            }
        });
        this.f19042b.m23863h(new d30() { // from class: l.p6
            public final void call() {
                this.f18403a.mo6475n();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public boolean mo6474i() {
        return !this.f19042b.m23866o();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m20814j(CharSequence charSequence) {
        this.f19041a.f4529y.setText(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m20815k(CharSequence charSequence) {
        this.f19041a.f4526v.setText(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m20816l(Picture.ImageUri imageUri, Integer num) {
        boolean zMo6474i = mo6474i();
        BusinessConversationView businessConversationView = this.f19041a;
        if (zMo6474i) {
            hmb.w1(businessConversationView.f4512h, imageUri, num.intValue());
        } else {
            hmb.v1(businessConversationView.f4512h, imageUri, num.intValue());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m20817m() {
        if (m20818o()) {
            this.f19042b.m23867q();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo6475n();

    /* JADX INFO: renamed from: o */
    public final boolean m20818o() {
        for (AbstractC1135q6<?> abstractC1135q6 = this.f19044d; abstractC1135q6 != null; abstractC1135q6 = abstractC1135q6.f19044d) {
            if (abstractC1135q6.m20818o()) {
                return false;
            }
        }
        return this.f19042b.m23870t();
    }

    @Override // p009l.gnl
    /* JADX INFO: renamed from: a */
    public void mo6471a() {
    }
}
