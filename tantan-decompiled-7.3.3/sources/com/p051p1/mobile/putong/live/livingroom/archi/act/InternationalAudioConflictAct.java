package com.p051p1.mobile.putong.live.livingroom.archi.act;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import p153l.o1j0;
import p153l.pvn;
import p153l.x20;
import p153l.z91;

/* JADX INFO: loaded from: classes4.dex */
public class InternationalAudioConflictAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public static String f48536c = "check_type";

    /* JADX INFO: renamed from: d */
    public static String f48537d = "just_finish";

    /* JADX INFO: renamed from: e */
    public static String f48538e = "toast";

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m72823a2() {
        if (isFinishing()) {
            return;
        }
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: Z1 */
    public final boolean m72824Z1(AudienceStartData audienceStartData) {
        BLiveAbsData bLiveAbsData;
        return (audienceStartData == null || (bLiveAbsData = audienceStartData.live) == null || !bLiveAbsData.isVoiceLive()) ? false : true;
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m72825b2(AudienceStartData audienceStartData) {
        if (audienceStartData != null) {
            m72826c2(audienceStartData);
        }
        if (isFinishing()) {
            return;
        }
        lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: c2 */
    public final void m72826c2(AudienceStartData audienceStartData) {
        startActivity(z91.m219041a(this, audienceStartData));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        Bundle extras = getIntent().getExtras();
        if (f48537d.equals(extras.getString(f48536c))) {
            String string = extras.getString(f48538e);
            if (!TextUtils.isEmpty(string)) {
                o1j0.m165651y(string);
            }
            lambda$debugItems$19();
        }
        final AudienceStartData audienceStartData = (AudienceStartData) getIntent().getSerializableExtra("startData");
        pvn.m173968c(m72824Z1(audienceStartData) ? "voice" : "live", new pvn.C19456a(new x20() { // from class: l.d1n
            @Override // p153l.x20
            public final void call() {
                this.f84703a.m72823a2();
            }
        }, new x20() { // from class: l.e1n
            @Override // p153l.x20
            public final void call() {
                this.f91638a.m72825b2(audienceStartData);
            }
        }));
    }
}
