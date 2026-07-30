package p009l;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import l.f30;
import l.n3b0;
import l.t100;
import l.u4c0;
import l.v8e0;
import l.vwb;
import l.xaj0;
import l.xdl0;
import v.TickerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jap extends gce0 {

    /* JADX INFO: renamed from: h */
    public v8e0 f15029h;

    /* JADX INFO: renamed from: i */
    public TickerView f15030i;

    /* JADX INFO: renamed from: j */
    public long f15031j;

    public jap(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        if (NullChecker.a(businessConversationView.f4512h)) {
            ViewGroup.LayoutParams layoutParams = businessConversationView.f4512h.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                int iD = t100.d(55.0f);
                layoutParams.height = iD;
                layoutParams.width = iD;
                ((ConstraintLayout.a) layoutParams).setMarginStart(t100.d(12.0f));
                businessConversationView.f4512h.setLayoutParams(layoutParams);
            }
            int iD2 = t100.d(6.0f);
            businessConversationView.f4512h.setPadding(iD2, iD2, iD2, iD2);
            View view = businessConversationView.f4521q;
            int i = t100.e;
            xdl0.W(view, i);
            xdl0.X(businessConversationView.f4521q, i);
        }
    }

    @Override // p009l.gce0
    /* JADX INFO: renamed from: L */
    public void mo14908L() {
        super.mo14908L();
        m16927O();
        m16928P();
        boolean zX5 = CoreModule.c.u0.x5();
        BusinessConversationView businessConversationView = this.f19041a;
        if (zX5) {
            xdl0.M(businessConversationView.f4519o, m14899C().mo14913d() > 1);
            xdl0.M(this.f19041a.f4521q, false);
        } else {
            xdl0.M(businessConversationView.f4521q, m14899C().mo14912c() > 0);
            xdl0.M(this.f19041a.f4519o, false);
        }
        m16931S(m14899C().mo14913d(), m14899C().mo14912c());
        m16930R();
    }

    @Override // p009l.gce0
    /* JADX INFO: renamed from: M */
    public void mo14909M() {
        super.mo14909M();
        if (NullChecker.a(this.f19041a.f4510f)) {
            this.f19041a.f4510f.setVisibility(8);
        }
        if (NullChecker.a(this.f19041a.f4511g)) {
            this.f19041a.f4511g.setVisibility(8);
        }
        cii0.m12607k();
    }

    /* JADX INFO: renamed from: O */
    public final void m16927O() {
        if (CoreModule.c.u0.x5() && (this.f19042b instanceof voo)) {
            BusinessConversationView businessConversationView = this.f19041a;
            if (businessConversationView.f4511g == null) {
                businessConversationView.f4511g = businessConversationView.f4515k.inflate();
            }
            this.f19041a.f4511g.d(750);
            xdl0.M0(this.f19041a.f4511g, true);
            this.f19041a.f4511g.setOnNext(new f30() { // from class: l.iap
                public final void call(Object obj, Object obj2) {
                    this.f14454a.m16929Q((Integer) obj, (User) obj2);
                }
            });
            m16930R();
            this.f19041a.f4511g.l(4);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m16928P() {
        BusinessConversationView businessConversationView = this.f19041a;
        if (businessConversationView.f4510f == null) {
            businessConversationView.f4510f = businessConversationView.f4516l.inflate();
        }
        View view = this.f19041a.f4510f;
        if (this.f15030i == null) {
            ImageView imageView = (ImageView) view.findViewById(u4c0.V5);
            this.f15030i = view.findViewById(u4c0.Vd);
            this.f15029h = new v8e0(this.f19041a.f4512h, imageView, (ImageView) view.findViewById(u4c0.i5), (ImageView) view.findViewById(u4c0.j5), (ImageView) view.findViewById(u4c0.k5), (ImageView) view.findViewById(u4c0.l5), this.f15030i);
            m16931S(m14899C().mo14913d(), m14899C().mo14912c());
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m16929Q(Integer num, User user) {
        cii0.m12605i(this.f19041a.f4529y, ((voo) this.f19042b).m23567w(m20812f(), user), num.intValue());
    }

    /* JADX INFO: renamed from: R */
    public final void m16930R() {
        int i;
        if (NullChecker.a(this.f19041a.f4511g)) {
            CoreLikers.a aVarR5 = CoreModule.c.u0.r5();
            String str = (!NullChecker.a(aVarR5) || vwb.J(aVarR5.d)) ? null : ((DbObject) ((User) aVarR5.d.get(0))).id;
            List list = ((CoreLikers.a) ((xaj0) this.f19042b.m23865k()).b).h;
            if (vwb.J(list)) {
                xdl0.M0(this.f19041a.f4511g, false);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (TextUtils.equals(yzc0.m25566b().m25572f(), ((DbObject) ((User) list.get(i))).id)) {
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
            this.f19041a.f4511g.i(list);
            xdl0.M0(this.f19041a.f4511g, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m16931S(int i, int i2) {
        v8e0 v8e0Var;
        if (NullChecker.a(this.f15030i)) {
            if (CoreModule.c.u0.x5() || m14899C().mo14913d() == 0) {
                this.f15030i.setVisibility(4);
                this.f15030i.f();
                return;
            }
            this.f15030i.setVisibility(0);
            this.f15030i.setTextSize(TypedValue.applyDimension(2, 20.0f, m20812f().getResources().getDisplayMetrics()));
            if (this.f15031j < ((Long) CoreModule.c.u0.k0.get()).longValue() && ((i2 > 0 && i >= 800 && ((Integer) CoreModule.c.u0.n0.get()).intValue() >= 800) || i > ((Integer) CoreModule.c.u0.n0.get()).intValue())) {
                this.f15031j = ((Long) CoreModule.c.u0.k0.get()).longValue();
                this.f15029h.E(((Integer) CoreModule.c.u0.n0.get()).intValue(), i);
            } else if (i < ((Integer) CoreModule.c.u0.n0.get()).intValue() || (v8e0Var = this.f15029h) == null || !v8e0Var.r()) {
                this.f15030i.setVisibility(0);
                this.f15030i.n(i0g0.m16108G(i));
                if (NullChecker.a(this.f15029h) && this.f15029h.r()) {
                    this.f15029h.I();
                }
            }
            CoreModule.c.u0.n0.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m16932T() {
        if (CoreModule.c.u0.x5() && m14899C().mo14913d() > 0) {
            this.f19041a.f4526v.setTextSize(18.0f);
            this.f19041a.f4529y.setTextSize(16.0f);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (language.equals("zh") || language.equals("ja") || language.equals("ko")) {
            this.f19041a.f4526v.setTextSize(2, 17.0f);
        } else {
            this.f19041a.f4526v.setTextSize(2, 13.0f);
            this.f19041a.f4529y.setTextSize(2, 13.0f);
        }
    }

    @Override // p009l.AbstractC1135q6
    /* JADX INFO: renamed from: g */
    public AbstractC1278w4<xaj0<User, CoreLikers.a, Integer>> mo6473g() {
        return n3b0.q() ? new voo(m20812f()) : new iyo(m20812f());
    }

    @Override // p009l.gce0, p009l.AbstractC1135q6
    /* JADX INFO: renamed from: n */
    public void mo6475n() {
        super.mo6475n();
        m16932T();
        if (this.f19042b.m23866o()) {
            mo14909M();
        } else {
            mo14908L();
        }
    }
}
