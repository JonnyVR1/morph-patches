package com.p046p1.mobile.putong.core.p053ui.marry.profile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import p149l.c2x;
import p149l.e2x;
import p149l.vwb;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileAct extends PutongMvpAct<c2x, e2x> {
    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public c2x mo28672V1() {
        return new c2x(this, this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public e2x mo28673X1() {
        return new e2x(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return super.disableAutoPV();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_marriage_profile";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setLightStatusBar(0);
        String strMo33597tn = CoreModule.m29935P().m94651a().mo33597tn();
        if (TextUtils.isEmpty(strMo33597tn)) {
            setStatusBarColor(Color.parseColor("#ECD3D3"));
        } else {
            setStatusBarColor(Color.parseColor(strMo33597tn));
        }
        Intent intent = act().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("userId");
            this.pageHelper.m109040p(vwb.m200311Y("is_myself", Boolean.valueOf(TextUtils.equals(CoreModule.f17545c.f19639e0.m169527p9().f56011id, stringExtra))), vwb.m200311Y("in_marriage_home", Boolean.FALSE), vwb.m200311Y("other_user_id", stringExtra));
        }
    }
}
