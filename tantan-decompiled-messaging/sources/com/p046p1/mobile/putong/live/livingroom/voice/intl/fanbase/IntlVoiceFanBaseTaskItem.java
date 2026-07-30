package com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceFanBaseTask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem;
import p147v.VDraweeView;
import p149l.cfe0;
import p149l.e30;
import p149l.e51;
import p149l.ffw;
import p149l.g5c0;
import p149l.hrv;
import p149l.hxs;
import p149l.lsi0;
import p149l.mtp;
import p149l.t100;
import p149l.x1e0;
import p149l.xdl0;
import p149l.xsp;
import p149l.zfv;

/* JADX INFO: loaded from: classes5.dex */
public class IntlVoiceFanBaseTaskItem extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53132a;

    /* JADX INFO: renamed from: b */
    public TextView f53133b;

    /* JADX INFO: renamed from: c */
    public TextView f53134c;

    /* JADX INFO: renamed from: d */
    public TextView f53135d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.fanbase.IntlVoiceFanBaseTaskItem$a */
    public class C13020a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xsp f53136a;

        public C13020a(xsp xspVar) {
            this.f53136a = xspVar;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            IntlVoiceFanBaseTaskItem.this.f53135d.setText(R$string.f46661Eg);
            IntlVoiceFanBaseTaskItem.this.f53135d.setSelected(false);
            lsi0.m151593w(R$string.f46815Lg);
            xdl0.m208329E0(IntlVoiceFanBaseTaskItem.this.f53135d, null);
            Act act = this.f53136a.act();
            final xsp xspVar = this.f53136a;
            e51.m114743H(act, new Runnable() { // from class: l.ptp
                @Override // java.lang.Runnable
                public final void run() {
                    xsp xspVar2 = xspVar;
                    xspVar2.m210828m4(xspVar2.m210821f4(), true);
                }
            }, 2000L);
        }
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m78134a(xsp xspVar, BLiveEnvelope bLiveEnvelope) {
        xspVar.m210828m4(xspVar.m210821f4(), true);
        lsi0.m151593w(R$string.f47067Xg);
    }

    /* JADX INFO: renamed from: d */
    public final void m78137d(final xsp xspVar, mtp mtpVar, BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask) {
        if ("sign".equals(bLiveVoiceFanBaseTask.taskType)) {
            xspVar.duringCreated(hrv.m132736S(xspVar.m210821f4())).subscribe(ffw.m121193d(new e30() { // from class: l.otp
                @Override // p149l.e30
                public final void call(Object obj) {
                    IntlVoiceFanBaseTaskItem.m78134a(xspVar, (BLiveEnvelope) obj);
                }
            }));
            return;
        }
        if ("sendGift".equals(bLiveVoiceFanBaseTask.taskType)) {
            xspVar.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7001).m206701e(bLiveVoiceFanBaseTask.schema).m206699c());
            xspVar.m210819d4();
        } else if ("sendTicket".equals(bLiveVoiceFanBaseTask.taskType)) {
            Uri uri = Uri.parse(bLiveVoiceFanBaseTask.schema);
            String queryParameter = uri.getQueryParameter("giftId");
            String queryParameter2 = uri.getQueryParameter("toUserId");
            xspVar.m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(queryParameter, new C13020a(xspVar), 1, "fans_club", "send_ticket", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans")), queryParameter2, "source_voice_fan_base").m106525A(uri.getBooleanQueryParameter("sendConfirm", false)).m106529t());
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78138e(xsp xspVar, mtp mtpVar, BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask, View view) {
        m78137d(xspVar, mtpVar, bLiveVoiceFanBaseTask);
    }

    /* JADX INFO: renamed from: f */
    public void m78139f(final xsp xspVar, final mtp mtpVar, final BLiveVoiceFanBaseTask bLiveVoiceFanBaseTask) {
        this.f53133b.setText(bLiveVoiceFanBaseTask.title);
        this.f53134c.setText(bLiveVoiceFanBaseTask.desc);
        boolean z = bLiveVoiceFanBaseTask.finish;
        TextView textView = this.f53135d;
        String str = null;
        if (z) {
            textView.setText(R$string.f46661Eg);
            this.f53135d.setSelected(false);
            xdl0.m208329E0(this.f53135d, null);
        } else {
            textView.setSelected(true);
            if ("sign".equals(bLiveVoiceFanBaseTask.taskType)) {
                this.f53135d.setText(R$string.f47046Wg);
            } else {
                boolean zEquals = "sendTicket".equals(bLiveVoiceFanBaseTask.taskType);
                TextView textView2 = this.f53135d;
                if (zEquals) {
                    textView2.setText(R$string.f46793Kg);
                } else {
                    textView2.setText(R$string.f46836Mg);
                }
            }
            xdl0.m208329E0(this.f53135d, new View.OnClickListener() { // from class: l.ntp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f140504a.m78138e(xspVar, mtpVar, bLiveVoiceFanBaseTask, view);
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
        hxs.m133407t("context_livingAct", this.f53132a, str, t100.f167230E);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53132a = (VDraweeView) findViewById(g5c0.f100654B6);
        this.f53133b = (TextView) findViewById(g5c0.f100690F6);
        this.f53134c = (TextView) findViewById(g5c0.f100645A6);
        this.f53135d = (TextView) findViewById(g5c0.f101115z6);
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVoiceFanBaseTaskItem(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
