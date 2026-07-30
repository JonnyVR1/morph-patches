package p149l;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.core.glcore.util.DetectDelayStopHelper;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.SwitchVerticalFrameLayout;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p147v.TickerView;

/* JADX INFO: loaded from: classes11.dex */
public class jap extends gce0 {

    /* JADX INFO: renamed from: h */
    public v8e0 f117107h;

    /* JADX INFO: renamed from: i */
    public TickerView f117108i;

    /* JADX INFO: renamed from: j */
    public long f117109j;

    public jap(BusinessConversationView businessConversationView) {
        super(businessConversationView);
        if (NullChecker.m81303a(businessConversationView.f25734h)) {
            ViewGroup.LayoutParams layoutParams = businessConversationView.f25734h.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0220a) {
                int iM186890d = t100.m186890d(55.0f);
                layoutParams.height = iM186890d;
                layoutParams.width = iM186890d;
                ((ConstraintLayout.C0220a) layoutParams).setMarginStart(t100.m186890d(12.0f));
                businessConversationView.f25734h.setLayoutParams(layoutParams);
            }
            int iM186890d2 = t100.m186890d(6.0f);
            businessConversationView.f25734h.setPadding(iM186890d2, iM186890d2, iM186890d2, iM186890d2);
            View view = businessConversationView.f25743q;
            int i = t100.f167256e;
            xdl0.m208359W(view, i);
            xdl0.m208360X(businessConversationView.f25743q, i);
        }
    }

    @Override // p149l.gce0
    /* JADX INFO: renamed from: L */
    public void mo125492L() {
        super.mo125492L();
        m140699O();
        m140700P();
        boolean zM30489x5 = CoreModule.f17545c.f19687u0.m30489x5();
        BusinessConversationView businessConversationView = this.f152838a;
        if (zM30489x5) {
            xdl0.m208344M(businessConversationView.f25741o, m125483C().mo125497d() > 1);
            xdl0.m208344M(this.f152838a.f25743q, false);
        } else {
            xdl0.m208344M(businessConversationView.f25743q, m125483C().mo125496c() > 0);
            xdl0.m208344M(this.f152838a.f25741o, false);
        }
        m140703S(m125483C().mo125497d(), m125483C().mo125496c());
        m140702R();
    }

    @Override // p149l.gce0
    /* JADX INFO: renamed from: M */
    public void mo125493M() {
        super.mo125493M();
        if (NullChecker.m81303a(this.f152838a.f25732f)) {
            this.f152838a.f25732f.setVisibility(8);
        }
        if (NullChecker.m81303a(this.f152838a.f25733g)) {
            this.f152838a.f25733g.setVisibility(8);
        }
        cii0.m107081k();
    }

    /* JADX INFO: renamed from: O */
    public final void m140699O() {
        if (CoreModule.f17545c.f19687u0.m30489x5() && (this.f152839b instanceof voo)) {
            BusinessConversationView businessConversationView = this.f152838a;
            if (businessConversationView.f25733g == null) {
                businessConversationView.f25733g = (SwitchVerticalFrameLayout) businessConversationView.f25737k.inflate();
            }
            this.f152838a.f25733g.m57773d(DetectDelayStopHelper.TYPE_DETECT_PICKNOISE);
            xdl0.m208345M0(this.f152838a.f25733g, true);
            this.f152838a.f25733g.setOnNext(new f30() { // from class: l.iap
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f112317a.m140701Q((Integer) obj, (User) obj2);
                }
            });
            m140702R();
            this.f152838a.f25733g.m57781l(4);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m140700P() {
        BusinessConversationView businessConversationView = this.f152838a;
        if (businessConversationView.f25732f == null) {
            businessConversationView.f25732f = businessConversationView.f25738l.inflate();
        }
        View view = this.f152838a.f25732f;
        if (this.f117108i == null) {
            ImageView imageView = (ImageView) view.findViewById(u4c0.f174077V5);
            this.f117108i = (TickerView) view.findViewById(u4c0.f174085Vd);
            this.f117107h = new v8e0(this.f152838a.f25734h, imageView, (ImageView) view.findViewById(u4c0.f174293i5), (ImageView) view.findViewById(u4c0.f174309j5), (ImageView) view.findViewById(u4c0.f174326k5), (ImageView) view.findViewById(u4c0.f174343l5), this.f117108i);
            m140703S(m125483C().mo125497d(), m125483C().mo125496c());
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m140701Q(Integer num, User user) {
        cii0.m107079i(this.f152838a.f25751y, ((voo) this.f152839b).m199191w(m173108f(), user), num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final void m140702R() {
        int i;
        if (NullChecker.m81303a(this.f152838a.f25733g)) {
            CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
            String str = (!NullChecker.m81303a(c4719aM30471r5) || vwb.m200296J(c4719aM30471r5.f19272d)) ? null : c4719aM30471r5.f19272d.get(0).f56011id;
            List<User> list = ((CoreLikers.C4719a) ((xaj0) this.f152839b.m201440k()).f191752b).f19276h;
            if (vwb.m200296J(list)) {
                xdl0.m208345M0(this.f152838a.f25733g, false);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (TextUtils.equals(yzc0.m216634b().m216640f(), list.get(i).f56011id)) {
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
            this.f152838a.f25733g.m57778i(list);
            xdl0.m208345M0(this.f152838a.f25733g, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m140703S(int i, int i2) {
        v8e0 v8e0Var;
        if (NullChecker.m81303a(this.f117108i)) {
            if (CoreModule.f17545c.f19687u0.m30489x5() || m125483C().mo125497d() == 0) {
                this.f117108i.setVisibility(4);
                this.f117108i.m222912f();
                return;
            }
            this.f117108i.setVisibility(0);
            this.f117108i.setTextSize(TypedValue.applyDimension(2, 20.0f, m173108f().getResources().getDisplayMetrics()));
            if (this.f117109j < CoreModule.f17545c.f19687u0.f19254k0.get().longValue() && ((i2 > 0 && i >= 800 && CoreModule.f17545c.f19687u0.f19257n0.get().intValue() >= 800) || i > CoreModule.f17545c.f19687u0.f19257n0.get().intValue())) {
                this.f117109j = CoreModule.f17545c.f19687u0.f19254k0.get().longValue();
                this.f117107h.m197422E(CoreModule.f17545c.f19687u0.f19257n0.get().intValue(), i);
            } else if (i < CoreModule.f17545c.f19687u0.f19257n0.get().intValue() || (v8e0Var = this.f117107h) == null || !v8e0Var.m197431r()) {
                this.f117108i.setVisibility(0);
                this.f117108i.m222920n(i0g0.m133840G(i));
                if (NullChecker.m81303a(this.f117107h) && this.f117107h.m197431r()) {
                    this.f117107h.m197426I();
                }
            }
            CoreModule.f17545c.f19687u0.f19257n0.put(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m140704T() {
        if (CoreModule.f17545c.f19687u0.m30489x5() && m125483C().mo125497d() > 0) {
            this.f152838a.f25748v.setTextSize(18.0f);
            this.f152838a.f25751y.setTextSize(16.0f);
            return;
        }
        String language = Locale.getDefault().getLanguage();
        if (language.equals("zh") || language.equals("ja") || language.equals("ko")) {
            this.f152838a.f25748v.setTextSize(2, 17.0f);
        } else {
            this.f152838a.f25748v.setTextSize(2, 13.0f);
            this.f152838a.f25751y.setTextSize(2, 13.0f);
        }
    }

    @Override // p149l.AbstractC19435q6
    /* JADX INFO: renamed from: g */
    public AbstractC20796w4<xaj0<User, CoreLikers.C4719a, Integer>> mo42321g() {
        return n3b0.m157742q() ? new voo(m173108f()) : new iyo(m173108f());
    }

    @Override // p149l.gce0, p149l.AbstractC19435q6
    /* JADX INFO: renamed from: n */
    public void mo42323n() {
        super.mo42323n();
        m140704T();
        if (this.f152839b.m201441o()) {
            mo125493M();
        } else {
            mo125492L();
        }
    }
}
