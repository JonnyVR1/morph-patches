package com.p000p1.mobile.putong.core.p001ui.marry.profile;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.data.DbObject;
import l.j760;
import l.vwb;
import p003l.c2x;
import p003l.e2x;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MarryProfileAct extends PutongMvpAct<c2x, e2x> {
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public c2x m446V1() {
        return new c2x(this, this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public e2x m447X1() {
        return new e2x(this);
    }

    public boolean disableAutoPV() {
        return super/*com.p1.mobile.putong.app.PutongAct*/.disableAutoPV();
    }

    public String pageId() {
        return "p_marriage_profile";
    }

    public void preCreateView(Bundle bundle) {
        setLightStatusBar(0);
        String strTn = CoreModule.P().a().tn();
        if (TextUtils.isEmpty(strTn)) {
            setStatusBarColor(Color.parseColor("#ECD3D3"));
        } else {
            setStatusBarColor(Color.parseColor(strTn));
        }
        Intent intent = act().getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("userId");
            ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("is_myself", Boolean.valueOf(TextUtils.equals(((DbObject) CoreModule.c.e0.p9()).id, stringExtra))), vwb.Y("in_marriage_home", Boolean.FALSE), vwb.Y("other_user_id", stringExtra)});
        }
    }
}
