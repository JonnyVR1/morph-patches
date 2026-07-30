package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class veg extends LiveMenuDialogHolder<cfg> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f183764k;

    /* JADX INFO: renamed from: l */
    public VText f183765l;

    /* JADX INFO: renamed from: m */
    public VText f183766m;

    /* JADX INFO: renamed from: n */
    public VText f183767n;

    /* JADX INFO: renamed from: l.veg$a */
    public class ViewOnClickListenerC20820a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FanbaseGroupsBean.FansbaseGroupsItem f183768a;

        public ViewOnClickListenerC20820a(FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem) {
            this.f183768a = fansbaseGroupsItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.equals(this.f183768a.getCannotJoinReason(), "applied")) {
                o1j0.m165649w(R$string.f48250n3);
            } else if (TextUtils.equals(this.f183768a.getCannotJoinReason(), "memberReachLimit")) {
                o1j0.m165649w(R$string.f48360s3);
            } else {
                ((cfg) veg.this.f48605b).m109533X3(this.f183768a.getId());
            }
        }
    }

    public veg(Act act, @NonNull @NotNull cfg cfgVar) {
        super(yec0.f198944V0, act, cfgVar, qag0.m175922c(0.0f));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((cfg) this.f48605b).act();
    }

    /* JADX INFO: renamed from: F */
    public final void m201049F(View view) {
        weg.m205993a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m201051I(FanbaseGroupsBean fanbaseGroupsBean) {
        FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem = fanbaseGroupsBean.getFanbaseGroups().get(0);
        izs.m142864o("context_livingAct", this.f183764k, fansbaseGroupsItem.getAvatar());
        this.f183765l.setText(fansbaseGroupsItem.getName());
        this.f183766m.setText(String.format("%s/%s", Integer.valueOf(fansbaseGroupsItem.getCurrentMemberCount()), Integer.valueOf(fansbaseGroupsItem.getMaxMemberCount())));
        if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "applied")) {
            this.f183767n.setText(R$string.f48228m3);
            this.f183767n.setSelected(true);
        } else if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "memberReachLimit")) {
            this.f183767n.setText(R$string.f48360s3);
            this.f183767n.setSelected(true);
        } else {
            boolean zEquals = TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "noFanRelation");
            VText vText = this.f183767n;
            if (zEquals) {
                vText.setText(R$string.f48272o3);
                this.f183767n.setSelected(false);
            } else {
                vText.setText(R$string.f48272o3);
                this.f183767n.setSelected(false);
            }
        }
        bnl0.m105509E0(this.f183767n, new ViewOnClickListenerC20820a(fansbaseGroupsItem));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m201049F(view);
        m73014A(80);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cfg cfgVar) {
    }
}
