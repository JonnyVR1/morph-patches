package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.n6 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC18810n6<T> implements rpl {

    /* JADX INFO: renamed from: a */
    public final BusinessConversationView f140409a;

    /* JADX INFO: renamed from: b */
    public AbstractC20482u4<T> f140410b;

    /* JADX INFO: renamed from: c */
    public AbstractC18810n6<?> f140411c;

    /* JADX INFO: renamed from: d */
    public AbstractC18810n6<?> f140412d;

    public AbstractC18810n6(BusinessConversationView businessConversationView) {
        this.f140409a = businessConversationView;
        m161742h();
    }

    @Override // p153l.rpl
    /* JADX INFO: renamed from: b */
    public void mo43331b(@NonNull ner nerVar, @NonNull dq1<Conversation> dq1Var) {
        AbstractC18810n6<?> abstractC18810n6 = this.f140411c;
        if (abstractC18810n6 != null) {
            abstractC18810n6.mo43331b(nerVar, dq1Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public Context m161741f() {
        return this.f140409a.getContext();
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC20482u4<T> mo43332g();

    /* JADX INFO: renamed from: h */
    public final void m161742h() {
        T t = NullChecker.m82486a(this.f140410b) ? this.f140410b.f177418b : null;
        AbstractC20482u4<T> abstractC20482u4Mo43332g = mo43332g();
        this.f140410b = abstractC20482u4Mo43332g;
        abstractC20482u4Mo43332g.m194461s(t);
        this.f140410b.m194453f(new y20() { // from class: l.j6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118511a.m161743j((CharSequence) obj);
            }
        });
        this.f140410b.m194454g(new y20() { // from class: l.k6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124147a.m161744k((CharSequence) obj);
            }
        });
        this.f140410b.m194452e(new z20() { // from class: l.l6
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f130218a.m161745l((Picture.ImageUri) obj, (Integer) obj2);
            }
        });
        this.f140410b.m194455h(new x20() { // from class: l.m6
            @Override // p153l.x20
            public final void call() {
                this.f134956a.mo43334n();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public boolean mo43333i() {
        return !this.f140410b.m194458o();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m161743j(CharSequence charSequence) {
        this.f140409a.f26493y.setText(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m161744k(CharSequence charSequence) {
        this.f140409a.f26490v.setText(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m161745l(Picture.ImageUri imageUri, Integer num) {
        boolean zMo43333i = mo43333i();
        BusinessConversationView businessConversationView = this.f140409a;
        if (zMo43333i) {
            vnb.m201963w1(businessConversationView.f26476h, imageUri, num.intValue());
        } else {
            vnb.m201962v1(businessConversationView.f26476h, imageUri, num.intValue());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m161746m() {
        if (m161747o()) {
            this.f140410b.m194459q();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo43334n();

    /* JADX INFO: renamed from: o */
    public final boolean m161747o() {
        for (AbstractC18810n6<?> abstractC18810n6 = this.f140412d; abstractC18810n6 != null; abstractC18810n6 = abstractC18810n6.f140412d) {
            if (abstractC18810n6.m161747o()) {
                return false;
            }
        }
        return this.f140410b.m194462t();
    }

    @Override // p153l.rpl
    /* JADX INFO: renamed from: a */
    public void mo43330a() {
    }
}
