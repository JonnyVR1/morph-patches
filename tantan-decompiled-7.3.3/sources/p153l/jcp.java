package p153l;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.core.glcore.util.DetectDelayStopHelper;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.SwitchVerticalFrameLayout;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p151v.TickerView;

/* JADX INFO: loaded from: classes11.dex */
public class jcp extends lke0 {

    /* JADX INFO: renamed from: h */
    public ahe0 f120081h;

    /* JADX INFO: renamed from: i */
    public TickerView f120082i;

    /* JADX INFO: renamed from: j */
    public long f120083j;

    public jcp(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        if (NullChecker.m82486a(businessConversationView.f26476h)) {
            ViewGroup.LayoutParams layoutParams = businessConversationView.f26476h.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0221a) {
                int iM175859d = qa00.m175859d(55.0f);
                layoutParams.height = iM175859d;
                layoutParams.width = iM175859d;
                ((ConstraintLayout.C0221a) layoutParams).setMarginStart(qa00.m175859d(12.0f));
                businessConversationView.f26476h.setLayoutParams(layoutParams);
            }
            int iM175859d2 = qa00.m175859d(6.0f);
            businessConversationView.f26476h.setPadding(iM175859d2, iM175859d2, iM175859d2, iM175859d2);
            View view = businessConversationView.f26485q;
            int i = qa00.f156318e;
            bnl0.m105539W(view, i);
            bnl0.m105540X(businessConversationView.f26485q, i);
        }
    }

    @Override // p153l.lke0
    /* JADX INFO: renamed from: L */
    public void mo144365L() {
        super.mo144365L();
        m144367O();
        m144368P();
        boolean zM31378B5 = CoreModule.f18264c.f20429u0.m31378B5();
        BusinessConversationView businessConversationView = this.f140409a;
        if (zM31378B5) {
            bnl0.m105524M(businessConversationView.f26483o, m154634C().mo142015d() > 1);
            bnl0.m105524M(this.f140409a.f26485q, false);
        } else {
            bnl0.m105524M(businessConversationView.f26485q, m154634C().mo138035c() > 0);
            bnl0.m105524M(this.f140409a.f26483o, false);
        }
        m144371S(m154634C().mo142015d(), m154634C().mo138035c());
        m144370R();
    }

    @Override // p153l.lke0
    /* JADX INFO: renamed from: M */
    public void mo144366M() {
        super.mo144366M();
        if (NullChecker.m82486a(this.f140409a.f26474f)) {
            this.f140409a.f26474f.setVisibility(8);
        }
        if (NullChecker.m82486a(this.f140409a.f26475g)) {
            this.f140409a.f26475g.setVisibility(8);
        }
        cri0.m112081k();
    }

    /* JADX INFO: renamed from: O */
    public final void m144367O() {
        if (CoreModule.f18264c.f20429u0.m31378B5() && (this.f140410b instanceof vqo)) {
            BusinessConversationView businessConversationView = this.f140409a;
            if (businessConversationView.f26475g == null) {
                businessConversationView.f26475g = (SwitchVerticalFrameLayout) businessConversationView.f26479k.inflate();
            }
            this.f140409a.f26475g.m58956d(DetectDelayStopHelper.TYPE_DETECT_PICKNOISE);
            bnl0.m105525M0(this.f140409a.f26475g, true);
            this.f140409a.f26475g.setOnNext(new z20() { // from class: l.icp
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f114424a.m144369Q((Integer) obj, (User) obj2);
                }
            });
            m144370R();
            this.f140409a.f26475g.m58964l(4);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m144368P() {
        BusinessConversationView businessConversationView = this.f140409a;
        if (businessConversationView.f26474f == null) {
            businessConversationView.f26474f = businessConversationView.f26480l.inflate();
        }
        View view = this.f140409a.f26474f;
        if (this.f120082i == null) {
            ImageView imageView = (ImageView) view.findViewById(adc0.f70200X5);
            this.f120082i = (TickerView) view.findViewById(adc0.f70224Yd);
            this.f120081h = new ahe0(this.f140409a.f26476h, imageView, (ImageView) view.findViewById(adc0.f70417k5), (ImageView) view.findViewById(adc0.f70434l5), (ImageView) view.findViewById(adc0.f70451m5), (ImageView) view.findViewById(adc0.f70468n5), this.f120082i);
            m144371S(m154634C().mo142015d(), m154634C().mo138035c());
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m144369Q(Integer num, User user) {
        cri0.m112079i(this.f140409a.f26493y, ((vqo) this.f140410b).m202442w(m161741f(), user), num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m144370R() {
        int i;
        if (NullChecker.m82486a(this.f140409a.f26475g)) {
            CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
            String str = (!NullChecker.m82486a(c4870aM31479t5) || jyb.m147479J(c4870aM31479t5.f20014d)) ? null : c4870aM31479t5.f20014d.get(0).f56859id;
            List<User> list = ((CoreLikers.C4870a) ((bkj0) this.f140410b.m194457k()).f77082b).f20018h;
            if (jyb.m147479J(list)) {
                bnl0.m105525M0(this.f140409a.f26475g, false);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (TextUtils.equals(b8d0.m102963b().m102969f(), list.get(i).f56859id)) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                i = -1;
                break;
            }
            if (i >= 0 && i != 0) {
                Collections.swap(list, 0, i);
            }
            this.f140409a.f26475g.m58961i(list);
            bnl0.m105525M0(this.f140409a.f26475g, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m144371S(int i, int i2) {
        ahe0 ahe0Var;
        if (NullChecker.m82486a(this.f120082i)) {
            if (CoreModule.f18264c.f20429u0.m31378B5() || m154634C().mo142015d() == 0) {
                this.f120082i.setVisibility(4);
                this.f120082i.m224158f();
                return;
            }
            this.f120082i.setVisibility(0);
            this.f120082i.setTextSize(TypedValue.applyDimension(2, 20.0f, m161741f().getResources().getDisplayMetrics()));
            if (this.f120083j < CoreModule.f18264c.f20429u0.f19996l0.get().longValue() && ((i2 > 0 && i >= 800 && CoreModule.f18264c.f20429u0.f19999o0.get().intValue() >= 800) || i > CoreModule.f18264c.f20429u0.f19999o0.get().intValue())) {
                this.f120083j = CoreModule.f18264c.f20429u0.f19996l0.get().longValue();
                this.f120081h.m97812E(CoreModule.f18264c.f20429u0.f19999o0.get().intValue(), i);
            } else if (i < CoreModule.f18264c.f20429u0.f19999o0.get().intValue() || (ahe0Var = this.f120081h) == null || !ahe0Var.m97821r()) {
                this.f120082i.setVisibility(0);
                this.f120082i.m224166n(q8g0.m175775G(i));
                if (NullChecker.m82486a(this.f120081h) && this.f120081h.m97821r()) {
                    this.f120081h.m97816I();
                }
            }
            CoreModule.f18264c.f20429u0.f19999o0.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m144372T() {
        if (CoreModule.f18264c.f20429u0.m31378B5() && m154634C().mo142015d() > 0) {
            this.f140409a.f26490v.setTextSize(18.0f);
            this.f140409a.f26493y.setTextSize(16.0f);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (language.equals("zh") || language.equals("ja") || language.equals("ko")) {
            this.f140409a.f26490v.setTextSize(2, 17.0f);
        } else {
            this.f140409a.f26490v.setTextSize(2, 13.0f);
            this.f140409a.f26493y.setTextSize(2, 13.0f);
        }
    }

    @Override // p153l.AbstractC18810n6
    /* JADX INFO: renamed from: g */
    public AbstractC20482u4<bkj0<User, CoreLikers.C4870a, Integer>> mo43332g() {
        return rbb0.m180744q() ? new vqo(m161741f()) : new i0p(m161741f());
    }

    @Override // p153l.lke0, p153l.AbstractC18810n6
    /* JADX INFO: renamed from: n */
    public void mo43334n() {
        super.mo43334n();
        m144372T();
        if (this.f140410b.m194458o()) {
            mo144366M();
        } else {
            mo144365L();
        }
    }
}
