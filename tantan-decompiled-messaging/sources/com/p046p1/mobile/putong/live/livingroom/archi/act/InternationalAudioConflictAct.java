package com.p046p1.mobile.putong.live.livingroom.archi.act;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import p149l.d30;
import p149l.lsi0;
import p149l.ptn;
import p149l.s91;

/* JADX INFO: loaded from: classes4.dex */
public class InternationalAudioConflictAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public static String f47688c = "check_type";

    /* JADX INFO: renamed from: d */
    public static String f47689d = "just_finish";

    /* JADX INFO: renamed from: e */
    public static String f47690e = "toast";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m71640Z1() {
        if (isFinishing()) {
            return;
        }
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Y1 */
    public final boolean m71641Y1(AudienceStartData audienceStartData) {
        BLiveAbsData bLiveAbsData;
        return (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || !bLiveAbsData.isVoiceLive()) ? false : true;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m71642a2(AudienceStartData audienceStartData) {
        if (audienceStartData != null) {
            m71643b2(audienceStartData);
        }
        if (isFinishing()) {
            return;
        }
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: b2 */
    public final void m71643b2(AudienceStartData audienceStartData) {
        startActivity(s91.m182688a(this, audienceStartData));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Bundle extras = getIntent().getExtras();
        if (f47689d.equals(extras.getString(f47688c))) {
            String string = extras.getString(f47690e);
            if (!TextUtils.isEmpty(string)) {
                lsi0.m151595y(string);
            }
            lambda$debugItems$19();
        }
        final AudienceStartData audienceStartData = (AudienceStartData) getIntent().getSerializableExtra("startData");
        ptn.m171363c(m71641Y1(audienceStartData) ? "voice" : "live", new ptn.C19336a(new d30() { // from class: l.dzm
            @Override // p149l.d30
            public final void call() {
                this.f88492a.m71640Z1();
            }
        }, new d30() { // from class: l.ezm
            @Override // p149l.d30
            public final void call() {
                this.f93913a.m71642a2(audienceStartData);
            }
        }));
    }
}
