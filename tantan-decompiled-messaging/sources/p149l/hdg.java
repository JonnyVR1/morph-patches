package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.FanbaseGroupsBean;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hdg extends LiveMenuDialogHolder<odg> {

    /* JADX INFO: renamed from: k */
    public VDraweeView f107238k;

    /* JADX INFO: renamed from: l */
    public VText f107239l;

    /* JADX INFO: renamed from: m */
    public VText f107240m;

    /* JADX INFO: renamed from: n */
    public VText f107241n;

    /* JADX INFO: renamed from: l.hdg$a */
    public class ViewOnClickListenerC17287a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FanbaseGroupsBean.FansbaseGroupsItem f107242a;

        public ViewOnClickListenerC17287a(FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem) {
            this.f107242a = fansbaseGroupsItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.equals(this.f107242a.getCannotJoinReason(), "applied")) {
                lsi0.m151593w(R$string.f47402n3);
            } else if (TextUtils.equals(this.f107242a.getCannotJoinReason(), "memberReachLimit")) {
                lsi0.m151593w(R$string.f47512s3);
            } else {
                ((odg) hdg.this.f47757b).m163661X3(this.f107242a.getId());
            }
        }
    }

    public hdg(Act act, @NonNull @NotNull odg odgVar) {
        super(t6c0.f168212V0, act, odgVar, j2g0.m139456c(0.0f));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((odg) this.f47757b).act();
    }

    /* JADX INFO: renamed from: F */
    public final void m130587F(View view) {
        idg.m135445a(this, view);
    }

    /* JADX INFO: renamed from: I */
    public void m130589I(FanbaseGroupsBean fanbaseGroupsBean) {
        FanbaseGroupsBean.FansbaseGroupsItem fansbaseGroupsItem = fanbaseGroupsBean.getFanbaseGroups().get(0);
        hxs.m133402o("context_livingAct", this.f107238k, fansbaseGroupsItem.getAvatar());
        this.f107239l.setText(fansbaseGroupsItem.getName());
        this.f107240m.setText(String.format("%s/%s", Integer.valueOf(fansbaseGroupsItem.getCurrentMemberCount()), Integer.valueOf(fansbaseGroupsItem.getMaxMemberCount())));
        if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "applied")) {
            this.f107241n.setText(R$string.f47380m3);
            this.f107241n.setSelected(true);
        } else if (TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "memberReachLimit")) {
            this.f107241n.setText(R$string.f47512s3);
            this.f107241n.setSelected(true);
        } else {
            boolean zEquals = TextUtils.equals(fansbaseGroupsItem.getCannotJoinReason(), "noFanRelation");
            VText vText = this.f107241n;
            if (zEquals) {
                vText.setText(R$string.f47424o3);
                this.f107241n.setSelected(false);
            } else {
                vText.setText(R$string.f47424o3);
                this.f107241n.setSelected(false);
            }
        }
        xdl0.m208329E0(this.f107241n, new ViewOnClickListenerC17287a(fansbaseGroupsItem));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m130587F(view);
        m71831A(80);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(odg odgVar) {
    }
}
