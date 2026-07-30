package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageNewProfileSettingViewModel;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageProfileSettingViewModel;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p153l.f400;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.iq2;

/* JADX INFO: loaded from: classes3.dex */
public class MessageProfileSettingAct extends PutongMvpAct<f400, iq2> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m50099Z1(Act act, boolean z, String str) {
        Intent intent = new Intent(act, (Class<?>) MessageProfileSettingAct.class);
        intent.putExtra("is_svip_unmatch", z);
        intent.putExtra("user_id", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public f400 mo29671X1() {
        return new f400(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public iq2 mo29672Y1() {
        boolean zMo34776W8 = gta.m132210e().m132214d().mo34776W8();
        String stringExtra = act().getIntent().getStringExtra("user_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(stringExtra);
            if (NullChecker.m82486a(userM116597oa) && ((zMo34776W8 && !userM116597oa.isTeamAccount()) || gta.m132210e().m132214d().mo34702I4())) {
                return new MessageNewProfileSettingViewModel(this);
            }
        }
        return new MessageProfileSettingViewModel(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(g9c0.f102810a0));
        setStatusBarColorResId(g9c0.f102810a0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_chat_setting";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        getSupportActionBar().mo102169B(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114082m6 : ibc0.f114073l6);
        toolbar().setTitleTextColor(getResources().getColor(g9c0.f102810a0));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }
}
