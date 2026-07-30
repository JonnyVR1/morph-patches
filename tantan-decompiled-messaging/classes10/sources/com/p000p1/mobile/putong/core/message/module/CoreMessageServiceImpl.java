package com.p000p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p000p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import l.j760;
import l.ruy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMessageInnerService", path = "/message_service/service")
public class CoreMessageServiceImpl implements CoreMessageInnerService {
    @Override // com.p000p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: ba */
    public int mo888ba(String str) {
        return ConversationCounterTypeSp.platinumPinChatOriginLevel.get(str);
    }

    @Override // com.p000p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: d8 */
    public void mo889d8(Act act, String str) {
        act.startActivity(MessagesAct.e2(act, str, 39, new j760[0]));
    }

    public void init(Context context) {
    }

    @Override // com.p000p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: yi */
    public boolean mo890yi(User user) {
        return ruy.g().h(user);
    }

    @Override // com.p000p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: zb */
    public void mo891zb(String str, int i) {
        ConversationCounterTypeSp.platinumPinChatOriginLevel.set(str, i);
    }
}
