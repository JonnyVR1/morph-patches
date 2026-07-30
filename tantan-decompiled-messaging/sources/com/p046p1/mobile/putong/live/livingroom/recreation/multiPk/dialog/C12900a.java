package com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanel;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import java.util.ArrayList;
import java.util.Iterator;
import p147v.VText;
import p149l.ae10;
import p149l.e30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.k5t;
import p149l.lsi0;
import p149l.t510;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.a */
/* JADX INFO: loaded from: classes5.dex */
public class C12900a extends k5t<t510> {

    /* JADX INFO: renamed from: l */
    public ae10 f51423l;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m75857A(View view) {
        ((t510) this.f47706b).m187269e4();
    }

    /* JADX INFO: renamed from: B */
    public final void m75858B() {
        SpannableString spannableString = new SpannableString("至少2名主播加入连线，才能发起多人PK");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 2, 4, 33);
        this.f121229k.setText(spannableString);
    }

    /* JADX INFO: renamed from: C */
    public void m75859C(BLiveMultiPkPanel bLiveMultiPkPanel) {
        ae10 ae10Var = this.f51423l;
        if (ae10Var == null) {
            ae10 ae10Var2 = new ae10(((t510) this.f47706b).act(), bLiveMultiPkPanel.users, new e30() { // from class: l.m510
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131358a.m75861y(((Integer) obj).intValue());
                }
            });
            this.f51423l = ae10Var2;
            this.f121227i.setAdapter(ae10Var2);
            this.f121227i.setLayoutManager(new LinearLayoutManager(((t510) this.f47706b).act(), 0, false));
        } else {
            ae10Var.f68984d.clear();
            this.f51423l.f68984d.addAll(bLiveMultiPkPanel.users);
            this.f51423l.notifyDataSetChanged();
        }
        m75862z();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        xdl0.m208329E0(this.f121228j, new View.OnClickListener() { // from class: l.k510
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121138a.m75860n(view);
            }
        });
        xdl0.m208329E0(this.f121225g, new View.OnClickListener() { // from class: l.l510
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126077a.m75857A(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75860n(View view) {
        ae10 ae10Var = this.f51423l;
        if (ae10Var == null || ae10Var.f68984d.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMultiPkPanelUser bLiveMultiPkPanelUser : this.f51423l.f68984d) {
            if (bLiveMultiPkPanelUser.picked) {
                arrayList.add(bLiveMultiPkPanelUser.f44408id);
            }
        }
        ((t510) this.f47706b).m187270f4(arrayList);
    }

    /* JADX INFO: renamed from: y */
    public final void m75861y(int i) {
        BLiveMultiPkPanelUser bLiveMultiPkPanelUser = this.f51423l.f68984d.get(i);
        if (bLiveMultiPkPanelUser.f44408id.equals(User.ID_TEAM_ACCOUNT)) {
            ((t510) this.f47706b).m187268d4();
            return;
        }
        if (!TextUtils.isEmpty(bLiveMultiPkPanelUser.toast)) {
            lsi0.m151595y(bLiveMultiPkPanelUser.toast);
            return;
        }
        if ("spectator".equals(bLiveMultiPkPanelUser.role) || bLiveMultiPkPanelUser.f44408id.equals(ypv.f199493a.m199309D0())) {
            return;
        }
        this.f51423l.f68984d.get(i).picked = !this.f51423l.f68984d.get(i).picked;
        this.f51423l.notifyItemChanged(i);
        m75862z();
    }

    /* JADX INFO: renamed from: z */
    public final void m75862z() {
        Iterator<BLiveMultiPkPanelUser> it = this.f51423l.f68984d.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().picked) {
                i++;
            }
        }
        VText vText = this.f121228j;
        if (i >= 2) {
            vText.setTextColor(-1);
            this.f121229k.setText("开始PK后将直接进入PK，请与连线主播提前沟通");
        } else {
            vText.setTextColor(vText.getResources().getColor(h1c0.f105377j1));
            m75858B();
        }
        this.f121228j.setEnabled(i >= 2);
    }
}
