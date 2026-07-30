package com.p051p1.mobile.putong.core.p058ui.marry.profile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import p153l.b5x;
import p153l.d5x;
import p153l.jyb;

/* JADX INFO: loaded from: classes3.dex */
public class MarryProfileAct extends PutongMvpAct<b5x, d5x> {
    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public b5x mo29671X1() {
        return new b5x(this, this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public d5x mo29672Y1() {
        return new d5x(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return super.disableAutoPV();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_marriage_profile";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setLightStatusBar(0);
        String strMo34600tn = CoreModule.m30933P().m143405a().mo34600tn();
        if (TextUtils.isEmpty(strMo34600tn)) {
            setStatusBarColor(Color.parseColor("#ECD3D3"));
        } else {
            setStatusBarColor(Color.parseColor(strMo34600tn));
        }
        Intent intent = act().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("userId");
            this.pageHelper.m152781p(jyb.m147494Y("is_myself", Boolean.valueOf(TextUtils.equals(CoreModule.f18264c.f20381e0.m116600p9().f56859id, stringExtra))), jyb.m147494Y("in_marriage_home", Boolean.FALSE), jyb.m147494Y("other_user_id", stringExtra));
        }
    }
}
