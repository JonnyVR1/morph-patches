package com.p046p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p149l.j760;
import p149l.ruy;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMessageInnerService", path = "/message_service/service")
public class CoreMessageServiceImpl implements CoreMessageInnerService {
    @Override // com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: ba */
    public int mo36021ba(String str) {
        return ConversationCounterTypeSp.platinumPinChatOriginLevel.get(str);
    }

    @Override // com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: d8 */
    public void mo36022d8(Act act, String str) {
        act.startActivity(MessagesAct.m48940e2(act, str, 39, new j760[0]));
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: yi */
    public boolean mo36023yi(User user) {
        return ruy.m181215g().m181220h(user);
    }

    @Override // com.p046p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: zb */
    public void mo36024zb(String str, int i) {
        ConversationCounterTypeSp.platinumPinChatOriginLevel.set(str, i);
    }
}
