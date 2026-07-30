package com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog;

import android.view.View;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.il10;
import p153l.obc0;
import p153l.x7t;
import p153l.zrv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.b */
/* JADX INFO: loaded from: classes5.dex */
public class C13064b extends x7t<il10> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m77046n(View view) {
        ((il10) this.f48554b).m140531X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m77050y(View view) {
        ((il10) this.f48554b).m140532Y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m77051z(View view) {
        mo72910j();
    }

    /* JADX INFO: renamed from: A */
    public void m77052A(List<LongLinkLiveMultiPk.MultiPkPlayer> list) {
        ArrayList arrayList = new ArrayList();
        for (LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer : list) {
            if (!multiPkPlayer.getUserId().equals(zrv.f205799a.m207631D0())) {
                arrayList.add(multiPkPlayer);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("与");
        for (int i = 0; i < arrayList.size(); i++) {
            if (((LongLinkLiveMultiPk.MultiPkPlayer) arrayList.get(i)).getUserName().length() > 4) {
                sb.append(((LongLinkLiveMultiPk.MultiPkPlayer) arrayList.get(i)).getUserName().substring(0, 4));
                sb.append("...");
            } else {
                sb.append(((LongLinkLiveMultiPk.MultiPkPlayer) arrayList.get(i)).getUserName());
            }
            if (i < arrayList.size() - 1) {
                sb.append("、");
            }
        }
        sb.append("PK中");
        this.f192748g.setText(sb);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p153l.isl
    public void init() {
        super.init();
        bnl0.m105509E0(this.f192751j, new View.OnClickListener() { // from class: l.bl10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77139a.m77046n(view);
            }
        });
        bnl0.m105509E0(this.f192750i, new View.OnClickListener() { // from class: l.cl10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82336a.m77050y(view);
            }
        });
        bnl0.m105509E0(this.f192753l, new View.OnClickListener() { // from class: l.dl10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89486a.m77051z(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146517v;
    }
}
