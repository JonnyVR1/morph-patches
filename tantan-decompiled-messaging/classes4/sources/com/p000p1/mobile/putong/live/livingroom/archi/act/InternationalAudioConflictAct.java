package com.p000p1.mobile.putong.live.livingroom.archi.act;

import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import l.d30;
import l.lsi0;
import l.ptn;
import p002l.s91;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class InternationalAudioConflictAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public static String f3730c = "check_type";

    /* JADX INFO: renamed from: d */
    public static String f3731d = "just_finish";

    /* JADX INFO: renamed from: e */
    public static String f3732e = "toast";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public /* synthetic */ void m5006Z1() {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: Y1 */
    public final boolean m5007Y1(AudienceStartData audienceStartData) {
        BLiveAbsData bLiveAbsData;
        return (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || !bLiveAbsData.isVoiceLive()) ? false : true;
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m5008a2(AudienceStartData audienceStartData) {
        if (audienceStartData != null) {
            m5009b2(audienceStartData);
        }
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final void m5009b2(AudienceStartData audienceStartData) {
        startActivity(s91.m22252a(this, audienceStartData));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Bundle extras = getIntent().getExtras();
        if (f3731d.equals(extras.getString(f3730c))) {
            String string = extras.getString(f3732e);
            if (!TextUtils.isEmpty(string)) {
                lsi0.y(string);
            }
            finish();
        }
        final AudienceStartData serializableExtra = getIntent().getSerializableExtra("startData");
        ptn.c(m5007Y1(serializableExtra) ? "voice" : "live", new ptn.a(new d30() { // from class: l.dzm
            public final void call() {
                this.f9495a.m5006Z1();
            }
        }, new d30() { // from class: l.ezm
            public final void call() {
                this.f10055a.m5008a2(serializableExtra);
            }
        }));
    }
}
