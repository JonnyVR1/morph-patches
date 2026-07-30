package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.model.MessageNewProfileSettingViewModel;
import com.p000p1.mobile.putong.core.p001ui.messages.model.MessageProfileSettingViewModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.ivz;
import l.ura;
import p003l.rp2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageProfileSettingAct extends PutongMvpAct<ivz, rp2> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m2006Y1(Act act, boolean z, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) MessageProfileSettingAct.class);
        intent.putExtra("is_svip_unmatch", z);
        intent.putExtra("user_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public ivz m2007V1() {
        return new ivz(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rp2 m2008X1() {
        boolean zW8 = ura.e().d().W8();
        String stringExtra = act().getIntent().getStringExtra("user_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            User userOa = CoreModule.c.e0.oa(stringExtra);
            if (NullChecker.a(userOa) && ((zW8 && !userOa.isTeamAccount()) || ura.e().d().I4())) {
                return new MessageNewProfileSettingViewModel(this);
            }
        }
        return new MessageProfileSettingViewModel(this);
    }

    public void checkGradientColors() {
        super/*com.p1.mobile.putong.app.PutongAct*/.checkGradientColors();
        toolbar().setBackgroundColor(((Act) this).act.getResources().getColor(a1c0.a0));
        setStatusBarColorResId(a1c0.a0);
    }

    public boolean needBindBillingService() {
        return true;
    }

    public String pageId() {
        return "p_chat_setting";
    }

    public void setTheme() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTheme();
        getSupportActionBar().B(ura.e().d().I4() ? c3c0.m6 : c3c0.l6);
        toolbar().setTitleTextColor(getResources().getColor(a1c0.a0));
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
