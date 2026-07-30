package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageNewProfileSettingViewModel;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageProfileSettingViewModel;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p149l.a1c0;
import p149l.c3c0;
import p149l.ivz;
import p149l.rp2;
import p149l.ura;

/* JADX INFO: loaded from: classes3.dex */
public class MessageProfileSettingAct extends PutongMvpAct<ivz, rp2> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m48916Y1(Act act, boolean z, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageProfileSettingAct.class);
        intent.putExtra("is_svip_unmatch", z);
        intent.putExtra("user_id", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public ivz mo28672V1() {
        return new ivz(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public rp2 mo28673X1() {
        boolean zMo33773W8 = ura.m195053e().m195057d().mo33773W8();
        String stringExtra = act().getIntent().getStringExtra("user_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(stringExtra);
            if (NullChecker.m81303a(userM169524oa) && ((zMo33773W8 && !userM169524oa.isTeamAccount()) || ura.m195053e().m195057d().mo33699I4())) {
                return new MessageNewProfileSettingViewModel(this);
            }
        }
        return new MessageProfileSettingViewModel(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(a1c0.f67146a0));
        setStatusBarColorResId(a1c0.f67146a0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_chat_setting";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        getSupportActionBar().mo134112B(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78807m6 : c3c0.f78798l6);
        toolbar().setTitleTextColor(getResources().getColor(a1c0.f67146a0));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
