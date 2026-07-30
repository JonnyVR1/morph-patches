package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import l.hxs;
import l.lsi0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hdg extends LiveMenuDialogHolder<odg> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f11996k;

    /* JADX INFO: renamed from: l */
    public VText f11997l;

    /* JADX INFO: renamed from: m */
    public VText f11998m;

    /* JADX INFO: renamed from: n */
    public VText f11999n;

    /* JADX INFO: renamed from: l.hdg$a */
    public class ViewOnClickListenerC0602a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FanbaseGroupsBean.FansbaseGroupsItem f12000a;

        public ViewOnClickListenerC0602a(FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem) {
            this.f12000a = fansbaseGroupsItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.equals(this.f12000a.getCannotJoinReason(), "applied")) {
                lsi0.w(R$string.f3444n3);
            } else if (TextUtils.equals(this.f12000a.getCannotJoinReason(), "memberReachLimit")) {
                lsi0.w(R$string.f3554s3);
            } else {
                ((odg) hdg.this.f3799b).m19422X3(this.f12000a.getId());
            }
        }
    }

    public hdg(Act act, @NonNull @NotNull odg odgVar) {
        super(t6c0.f19708V0, act, odgVar, j2g0.m15577c(0.0f));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((odg) this.f3799b).act();
    }

    /* JADX INFO: renamed from: F */
    public final void m14339F(View view) {
        idg.m15097a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m14341I(FanbaseGroupsBean fanbaseGroupsBean) {
        FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem = (FanbaseGroupsBean.FansbaseGroupsItem) fanbaseGroupsBean.getFanbaseGroups().get(0);
        hxs.o("context_livingAct", this.f11996k, fansbaseGroupsItem.getAvatar());
        this.f11997l.setText(fansbaseGroupsItem.getName());
        this.f11998m.setText(String.format("%s/%s", Integer.valueOf(fansbaseGroupsItem.getCurrentMemberCount()), Integer.valueOf(fansbaseGroupsItem.getMaxMemberCount())));
        if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "applied")) {
            this.f11999n.setText(R$string.f3422m3);
            this.f11999n.setSelected(true);
        } else if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "memberReachLimit")) {
            this.f11999n.setText(R$string.f3554s3);
            this.f11999n.setSelected(true);
        } else {
            boolean zEquals = TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "noFanRelation");
            VText vText = this.f11999n;
            if (zEquals) {
                vText.setText(R$string.f3466o3);
                this.f11999n.setSelected(false);
            } else {
                vText.setText(R$string.f3466o3);
                this.f11999n.setSelected(false);
            }
        }
        xdl0.E0(this.f11999n, new ViewOnClickListenerC0602a(fansbaseGroupsItem));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m14339F(view);
        m5207A(80);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(odg odgVar) {
    }
}
