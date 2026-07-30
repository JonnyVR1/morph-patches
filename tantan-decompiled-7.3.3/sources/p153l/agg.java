package p153l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.R$string;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p051p1.mobile.putong.live.base.business.fansgroup.UserAgeGenderView;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class agg extends RecyclerView.AbstractC0569e0 {

    /* JADX INFO: renamed from: a */
    public boolean f71149a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f71150b;

    /* JADX INFO: renamed from: c */
    public UserAgeGenderView f71151c;

    /* JADX INFO: renamed from: d */
    public VText f71152d;

    /* JADX INFO: renamed from: e */
    public VText f71153e;

    /* JADX INFO: renamed from: f */
    public VText f71154f;

    /* JADX INFO: renamed from: g */
    public VText f71155g;

    /* JADX INFO: renamed from: h */
    public VText f71156h;

    /* JADX INFO: renamed from: i */
    public VText f71157i;

    /* JADX INFO: renamed from: j */
    public otl f71158j;

    public agg(@NonNull @NotNull View view, boolean z) {
        super(view);
        this.f71149a = z;
        m97624c(view);
    }

    /* JADX INFO: renamed from: c */
    private void m97624c(View view) {
        this.f71150b = (VDraweeView) view.findViewById(jdc0.f120202i1);
        this.f71152d = (VText) view.findViewById(jdc0.f120208k1);
        this.f71151c = (UserAgeGenderView) view.findViewById(jdc0.f120152O);
        this.f71153e = (VText) view.findViewById(jdc0.f120185d);
        this.f71154f = (VText) view.findViewById(jdc0.f120188e);
        this.f71155g = (VText) view.findViewById(jdc0.f120176a);
        this.f71156h = (VText) view.findViewById(jdc0.f120125A0);
        this.f71157i = (VText) view.findViewById(jdc0.f120179b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m97625d(FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean, View view) {
        otl otlVar = this.f71158j;
        if (otlVar != null) {
            otlVar.mo120684b(getAdapterPosition(), fanbaseGroupAuditsItemBean.getGroupId(), fanbaseGroupAuditsItemBean.getId());
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m97626e(FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean, View view) {
        this.f71158j.mo120685e(getAdapterPosition(), fanbaseGroupAuditsItemBean.getGroupId(), fanbaseGroupAuditsItemBean.getId());
    }

    /* JADX INFO: renamed from: f */
    public void m97627f(final FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean) {
        izs.m142864o("context_livingAct", this.f71150b, fanbaseGroupAuditsItemBean.getAvatar());
        this.f71152d.setText(fanbaseGroupAuditsItemBean.getName());
        this.f71151c.m68827Q(fanbaseGroupAuditsItemBean.getGender(), fanbaseGroupAuditsItemBean.getAge());
        this.f71153e.setText(fanbaseGroupAuditsItemBean.getDesc());
        this.f71154f.setText(fanbaseGroupAuditsItemBean.getDate());
        this.f71152d.setTypeface(null, 1);
        boolean zEquals = TextUtils.equals(fanbaseGroupAuditsItemBean.getStatus(), "pending");
        VText vText = this.f71155g;
        if (zEquals) {
            vText.setVisibility(0);
            this.f71156h.setVisibility(0);
            this.f71157i.setVisibility(8);
            bnl0.m105509E0(this.f71155g, new View.OnClickListener() { // from class: l.yfg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199516a.m97625d(fanbaseGroupAuditsItemBean, view);
                }
            });
            bnl0.m105509E0(this.f71156h, new View.OnClickListener() { // from class: l.zfg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204132a.m97626e(fanbaseGroupAuditsItemBean, view);
                }
            });
            return;
        }
        vText.setVisibility(8);
        this.f71156h.setVisibility(8);
        this.f71157i.setVisibility(0);
        boolean zEquals2 = TextUtils.equals(fanbaseGroupAuditsItemBean.getStatus(), "approved");
        VText vText2 = this.f71157i;
        if (zEquals2) {
            vText2.setText(R$string.f44952E);
        } else {
            vText2.setText(R$string.f44957G);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m97628g(otl otlVar) {
        this.f71158j = otlVar;
    }
}
