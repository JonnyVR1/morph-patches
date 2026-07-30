package com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem;
import p151v.VDraweeView;
import p153l.aiv;
import p153l.bae0;
import p153l.bnl0;
import p153l.dhw;
import p153l.hne0;
import p153l.itv;
import p153l.izs;
import p153l.l51;
import p153l.mdc0;
import p153l.mvp;
import p153l.o1j0;
import p153l.qa00;
import p153l.xup;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class IntlVoiceFanBaseTaskItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53980a;

    /* JADX INFO: renamed from: b */
    public TextView f53981b;

    /* JADX INFO: renamed from: c */
    public TextView f53982c;

    /* JADX INFO: renamed from: d */
    public TextView f53983d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem$a */
    public class C13183a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xup f53984a;

        public C13183a(xup xupVar) {
            this.f53984a = xupVar;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            IntlVoiceFanBaseTaskItem.this.f53983d.setText(R$string.f47509Eg);
            IntlVoiceFanBaseTaskItem.this.f53983d.setSelected(false);
            o1j0.m165649w(R$string.f47663Lg);
            bnl0.m105509E0(IntlVoiceFanBaseTaskItem.this.f53983d, null);
            Act act = this.f53984a.act();
            final xup xupVar = this.f53984a;
            l51.m152888H(act, new Runnable() { // from class: l.pvp
                @Override // java.lang.Runnable
                public final void run() {
                    xup xupVar2 = xupVar;
                    xupVar2.m213181m4(xupVar2.m213174f4(), true);
                }
            }, 2000L);
        }
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79317a(xup xupVar, BLiveEnvelope bLiveEnvelope) {
        xupVar.m213181m4(xupVar.m213174f4(), true);
        o1j0.m165649w(R$string.f47915Xg);
    }

    /* JADX INFO: renamed from: d */
    public final void m79320d(final xup xupVar, mvp mvpVar, BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask) {
        if ("sign".equals(bLiveVoiceFanBaseTask.taskType)) {
            xupVar.duringCreated(itv.m142095S(xupVar.m213174f4())).subscribe(dhw.m115825d(new y20() { // from class: l.ovp
                @Override // p153l.y20
                public final void call(Object obj) {
                    IntlVoiceFanBaseTaskItem.m79317a(xupVar, (BLiveEnvelope) obj);
                }
            }));
            return;
        }
        if ("sendGift".equals(bLiveVoiceFanBaseTask.taskType)) {
            xupVar.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7001).m103154e(bLiveVoiceFanBaseTask.schema).m103152c());
            xupVar.m213172d4();
        } else if ("sendTicket".equals(bLiveVoiceFanBaseTask.taskType)) {
            Uri uri = Uri.parse(bLiveVoiceFanBaseTask.schema);
            String queryParameter = uri.getQueryParameter("giftId");
            String queryParameter2 = uri.getQueryParameter("toUserId");
            xupVar.m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(queryParameter, new C13183a(xupVar), 1, "fans_club", "send_ticket", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans")), queryParameter2, "source_voice_fan_base").m136079A(uri.getBooleanQueryParameter("sendConfirm", false)).m136083t());
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79321e(xup xupVar, mvp mvpVar, BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask, View view) {
        m79320d(xupVar, mvpVar, bLiveVoiceFanBaseTask);
    }

    /* JADX INFO: renamed from: f */
    public void m79322f(final xup xupVar, final mvp mvpVar, final BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask) {
        this.f53981b.setText(bLiveVoiceFanBaseTask.title);
        this.f53982c.setText(bLiveVoiceFanBaseTask.desc);
        boolean z = bLiveVoiceFanBaseTask.finish;
        TextView textView = this.f53983d;
        String str = null;
        if (z) {
            textView.setText(R$string.f47509Eg);
            this.f53983d.setSelected(false);
            bnl0.m105509E0(this.f53983d, null);
        } else {
            textView.setSelected(true);
            if ("sign".equals(bLiveVoiceFanBaseTask.taskType)) {
                this.f53983d.setText(R$string.f47894Wg);
            } else {
                boolean zEquals = "sendTicket".equals(bLiveVoiceFanBaseTask.taskType);
                TextView textView2 = this.f53983d;
                if (zEquals) {
                    textView2.setText(R$string.f47641Kg);
                } else {
                    textView2.setText(R$string.f47684Mg);
                }
            }
            bnl0.m105509E0(this.f53983d, new View.OnClickListener() { // from class: l.nvp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f143828a.m79321e(xupVar, mvpVar, bLiveVoiceFanBaseTask, view);
                }
            });
        }
        if ("sign".equals(bLiveVoiceFanBaseTask.taskType)) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkVSQzdNRTdMQzc2NU0zRjZHNkRWMkRUREU1QVRHUjE0IiwidyI6MTY4LCJoIjoxNjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDg1MTEyMDkwOTQzNDkxODU1fQ.png";
        } else if ("sendGift".equals(bLiveVoiceFanBaseTask.taskType)) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IkQ0VktIRklHT1Y1R0E2V1ZZU0M2SUNFQ1dWTUYzTDE0IiwidyI6MTY4LCJoIjoxNjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjY5NTIyMjc2OTMyNTg3Mjc5fQ.png";
        } else if ("sendTicket".equals(bLiveVoiceFanBaseTask.taskType)) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IlhGSjI1WExZV09EWDdXNDVERkc3UlMzSkkyMlRQTzE0IiwidyI6MTY4LCJoIjoxNjgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMDg1MTAzMjkzMjU2NjM2MTc1fQ.png";
        }
        izs.m142869t("context_livingAct", this.f53980a, str, qa00.f156292E);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53980a = (VDraweeView) findViewById(mdc0.f135899B6);
        this.f53981b = (TextView) findViewById(mdc0.f135935F6);
        this.f53982c = (TextView) findViewById(mdc0.f135890A6);
        this.f53983d = (TextView) findViewById(mdc0.f136360z6);
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
