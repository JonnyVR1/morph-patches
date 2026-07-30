package p149l;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.R$string;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupAuditsItemBean;
import com.p046p1.mobile.putong.live.base.business.fansgroup.UserAgeGenderView;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class meg extends RecyclerView.AbstractC0566d0 {

    /* JADX INFO: renamed from: a */
    public boolean f133405a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f133406b;

    /* JADX INFO: renamed from: c */
    public UserAgeGenderView f133407c;

    /* JADX INFO: renamed from: d */
    public VText f133408d;

    /* JADX INFO: renamed from: e */
    public VText f133409e;

    /* JADX INFO: renamed from: f */
    public VText f133410f;

    /* JADX INFO: renamed from: g */
    public VText f133411g;

    /* JADX INFO: renamed from: h */
    public VText f133412h;

    /* JADX INFO: renamed from: i */
    public VText f133413i;

    /* JADX INFO: renamed from: j */
    public brl f133414j;

    public meg(@NonNull @NotNull View view, boolean z) {
        super(view);
        this.f133405a = z;
        m154186c(view);
    }

    /* JADX INFO: renamed from: c */
    private void m154186c(View view) {
        this.f133406b = (VDraweeView) view.findViewById(d5c0.f84484i1);
        this.f133408d = (VText) view.findViewById(d5c0.f84490k1);
        this.f133407c = (UserAgeGenderView) view.findViewById(d5c0.f84434O);
        this.f133409e = (VText) view.findViewById(d5c0.f84467d);
        this.f133410f = (VText) view.findViewById(d5c0.f84470e);
        this.f133411g = (VText) view.findViewById(d5c0.f84458a);
        this.f133412h = (VText) view.findViewById(d5c0.f84407A0);
        this.f133413i = (VText) view.findViewById(d5c0.f84461b);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m154187d(FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean, View view) {
        brl brlVar = this.f133414j;
        if (brlVar != null) {
            brlVar.mo103554b(getAdapterPosition(), fanbaseGroupAuditsItemBean.getGroupId(), fanbaseGroupAuditsItemBean.getId());
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m154188e(FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean, View view) {
        this.f133414j.mo103555e(getAdapterPosition(), fanbaseGroupAuditsItemBean.getGroupId(), fanbaseGroupAuditsItemBean.getId());
    }

    /* JADX INFO: renamed from: f */
    public void m154189f(final FanbaseGroupAuditsItemBean fanbaseGroupAuditsItemBean) {
        hxs.m133402o("context_livingAct", this.f133406b, fanbaseGroupAuditsItemBean.getAvatar());
        this.f133408d.setText(fanbaseGroupAuditsItemBean.getName());
        this.f133407c.m67644Q(fanbaseGroupAuditsItemBean.getGender(), fanbaseGroupAuditsItemBean.getAge());
        this.f133409e.setText(fanbaseGroupAuditsItemBean.getDesc());
        this.f133410f.setText(fanbaseGroupAuditsItemBean.getDate());
        this.f133408d.setTypeface(null, 1);
        boolean zEquals = TextUtils.equals(fanbaseGroupAuditsItemBean.getStatus(), "pending");
        VText vText = this.f133411g;
        if (zEquals) {
            vText.setVisibility(0);
            this.f133412h.setVisibility(0);
            this.f133413i.setVisibility(8);
            xdl0.m208329E0(this.f133411g, new View.OnClickListener() { // from class: l.keg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122703a.m154187d(fanbaseGroupAuditsItemBean, view);
                }
            });
            xdl0.m208329E0(this.f133412h, new View.OnClickListener() { // from class: l.leg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f127681a.m154188e(fanbaseGroupAuditsItemBean, view);
                }
            });
            return;
        }
        vText.setVisibility(8);
        this.f133412h.setVisibility(8);
        this.f133413i.setVisibility(0);
        boolean zEquals2 = TextUtils.equals(fanbaseGroupAuditsItemBean.getStatus(), "approved");
        VText vText2 = this.f133413i;
        if (zEquals2) {
            vText2.setText(R$string.f44104E);
        } else {
            vText2.setText(R$string.f44109G);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m154190g(brl brlVar) {
        this.f133414j = brlVar;
    }
}
