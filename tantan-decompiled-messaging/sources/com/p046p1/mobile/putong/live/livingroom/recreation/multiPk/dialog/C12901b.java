package com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog;

import android.view.View;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import java.util.ArrayList;
import java.util.List;
import p149l.i3c0;
import p149l.w5t;
import p149l.xdl0;
import p149l.yc10;
import p149l.ypv;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.b */
/* JADX INFO: loaded from: classes5.dex */
public class C12901b extends w5t<yc10> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m75863n(View view) {
        ((yc10) this.f47706b).m213996X3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m75867y(View view) {
        ((yc10) this.f47706b).m213997Y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m75868z(View view) {
        mo71727j();
    }

    /* JADX INFO: renamed from: A */
    public void m75869A(List<LongLinkLiveMultiPk.MultiPkPlayer> list) {
        ArrayList arrayList = new ArrayList();
        for (LongLinkLiveMultiPk.MultiPkPlayer multiPkPlayer : list) {
            if (!multiPkPlayer.getUserId().equals(ypv.f199493a.m199309D0())) {
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
        this.f184739g.setText(sb);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        xdl0.m208329E0(this.f184742j, new View.OnClickListener() { // from class: l.rc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158704a.m75863n(view);
            }
        });
        xdl0.m208329E0(this.f184741i, new View.OnClickListener() { // from class: l.sc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163696a.m75867y(view);
            }
        });
        xdl0.m208329E0(this.f184744l, new View.OnClickListener() { // from class: l.tc10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169408a.m75868z(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }
}
