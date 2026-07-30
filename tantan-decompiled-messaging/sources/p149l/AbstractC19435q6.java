package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: renamed from: l.q6 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC19435q6<T> implements gnl {

    /* JADX INFO: renamed from: a */
    public final BusinessConversationView f152838a;

    /* JADX INFO: renamed from: b */
    public AbstractC20796w4<T> f152839b;

    /* JADX INFO: renamed from: c */
    public AbstractC19435q6<?> f152840c;

    /* JADX INFO: renamed from: d */
    public AbstractC19435q6<?> f152841d;

    public AbstractC19435q6(BusinessConversationView businessConversationView) {
        this.f152838a = businessConversationView;
        m173109h();
    }

    @Override // p149l.gnl
    /* JADX INFO: renamed from: b */
    public void mo42320b(@NonNull mcr mcrVar, @NonNull wp1<Conversation> wp1Var) {
        AbstractC19435q6<?> abstractC19435q6 = this.f152840c;
        if (abstractC19435q6 != null) {
            abstractC19435q6.mo42320b(mcrVar, wp1Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public Context m173108f() {
        return this.f152838a.getContext();
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC20796w4<T> mo42321g();

    /* JADX INFO: renamed from: h */
    public final void m173109h() {
        T t = NullChecker.m81303a(this.f152839b) ? this.f152839b.f184459b : null;
        AbstractC20796w4<T> abstractC20796w4Mo42321g = mo42321g();
        this.f152839b = abstractC20796w4Mo42321g;
        abstractC20796w4Mo42321g.m201444s(t);
        this.f152839b.m201436f(new e30() { // from class: l.m6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131435a.m173110j((CharSequence) obj);
            }
        });
        this.f152839b.m201437g(new e30() { // from class: l.n6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137262a.m173111k((CharSequence) obj);
            }
        });
        this.f152839b.m201435e(new f30() { // from class: l.o6
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f141964a.m173112l((Picture.ImageUri) obj, (Integer) obj2);
            }
        });
        this.f152839b.m201438h(new d30() { // from class: l.p6
            @Override // p149l.d30
            public final void call() {
                this.f147348a.mo42323n();
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public boolean mo42322i() {
        return !this.f152839b.m201441o();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m173110j(CharSequence charSequence) {
        this.f152838a.f25751y.setText(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m173111k(CharSequence charSequence) {
        this.f152838a.f25748v.setText(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m173112l(Picture.ImageUri imageUri, Integer num) {
        boolean zMo42322i = mo42322i();
        BusinessConversationView businessConversationView = this.f152838a;
        if (zMo42322i) {
            hmb.m131718w1(businessConversationView.f25734h, imageUri, num.intValue());
        } else {
            hmb.m131717v1(businessConversationView.f25734h, imageUri, num.intValue());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m173113m() {
        if (m173114o()) {
            this.f152839b.m201442q();
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo42323n();

    /* JADX INFO: renamed from: o */
    public final boolean m173114o() {
        for (AbstractC19435q6<?> abstractC19435q6 = this.f152841d; abstractC19435q6 != null; abstractC19435q6 = abstractC19435q6.f152841d) {
            if (abstractC19435q6.m173114o()) {
                return false;
            }
        }
        return this.f152839b.m201445t();
    }

    @Override // p149l.gnl
    /* JADX INFO: renamed from: a */
    public void mo42319a() {
    }
}
