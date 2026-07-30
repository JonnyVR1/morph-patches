package com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import java.util.ArrayList;
import java.util.Iterator;
import p151v.VText;
import p153l.bnl0;
import p153l.de10;
import p153l.km10;
import p153l.l7t;
import p153l.n9c0;
import p153l.o1j0;
import p153l.obc0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.a */
/* JADX INFO: loaded from: classes5.dex */
public class C13063a extends l7t<de10> {

    /* JADX INFO: renamed from: l */
    public km10 f52271l;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m77040A(View view) {
        ((de10) this.f48554b).m115391e4();
    }

    /* JADX INFO: renamed from: B */
    public final void m77041B() {
        SpannableString spannableString = new SpannableString("至少2名主播加入连线，才能发起多人PK");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 2, 4, 33);
        this.f130382k.setText(spannableString);
    }

    /* JADX INFO: renamed from: C */
    public void m77042C(BLiveMultiPkPanel bLiveMultiPkPanel) {
        km10 km10Var = this.f52271l;
        if (km10Var == null) {
            km10 km10Var2 = new km10(((de10) this.f48554b).act(), bLiveMultiPkPanel.users, new y20() { // from class: l.wd10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188522a.m77044y(((Integer) obj).intValue());
                }
            });
            this.f52271l = km10Var2;
            this.f130380i.setAdapter(km10Var2);
            this.f130380i.setLayoutManager(new LinearLayoutManager(((de10) this.f48554b).act(), 0, false));
        } else {
            km10Var.f127428d.clear();
            this.f52271l.f127428d.addAll(bLiveMultiPkPanel.users);
            this.f52271l.notifyDataSetChanged();
        }
        m77045z();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        bnl0.m105509E0(this.f130381j, new View.OnClickListener() { // from class: l.ud10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178485a.m77043n(view);
            }
        });
        bnl0.m105509E0(this.f130378g, new View.OnClickListener() { // from class: l.vd10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183526a.m77040A(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77043n(View view) {
        km10 km10Var = this.f52271l;
        if (km10Var == null || km10Var.f127428d.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMultiPkPanelUser bLiveMultiPkPanelUser : this.f52271l.f127428d) {
            if (bLiveMultiPkPanelUser.picked) {
                arrayList.add(bLiveMultiPkPanelUser.f45256id);
            }
        }
        ((de10) this.f48554b).m115392f4(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public final void m77044y(int i) {
        BLiveMultiPkPanelUser bLiveMultiPkPanelUser = this.f52271l.f127428d.get(i);
        if (bLiveMultiPkPanelUser.f45256id.equals(User.ID_TEAM_ACCOUNT)) {
            ((de10) this.f48554b).m115390d4();
            return;
        }
        if (!TextUtils.isEmpty(bLiveMultiPkPanelUser.toast)) {
            o1j0.m165651y(bLiveMultiPkPanelUser.toast);
            return;
        }
        if ("spectator".equals(bLiveMultiPkPanelUser.role) || bLiveMultiPkPanelUser.f45256id.equals(zrv.f205799a.m207631D0())) {
            return;
        }
        this.f52271l.f127428d.get(i).picked = !this.f52271l.f127428d.get(i).picked;
        this.f52271l.notifyItemChanged(i);
        m77045z();
    }

    /* JADX INFO: renamed from: z */
    public final void m77045z() {
        Iterator<BLiveMultiPkPanelUser> it = this.f52271l.f127428d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().picked) {
                i++;
            }
        }
        VText vText = this.f130381j;
        if (i >= 2) {
            vText.setTextColor(-1);
            this.f130382k.setText("开始PK后将直接进入PK，请与连线主播提前沟通");
        } else {
            vText.setTextColor(vText.getResources().getColor(n9c0.f140838j1));
            m77041B();
        }
        this.f130381j.setEnabled(i >= 2);
    }
}
