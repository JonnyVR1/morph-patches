package com.p051p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.android.injecter.facade.annotation.Route;
import p153l.o3z;
import p153l.pf60;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMessageInnerService", path = "/message_service/service")
public class CoreMessageServiceImpl implements CoreMessageInnerService {
    @Override // com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: ba */
    public int mo37024ba(String str) {
        return ConversationCounterTypeSp.platinumPinChatOriginLevel.get(str);
    }

    @Override // com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: d8 */
    public void mo37025d8(Act act, String str) {
        act.startActivity(MessagesAct.m50123g2(act, str, 39, new pf60[0]));
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: yi */
    public boolean mo37026yi(User user) {
        return o3z.m165898g().m165903h(user);
    }

    @Override // com.p051p1.mobile.putong.core.message.service.CoreMessageInnerService
    /* JADX INFO: renamed from: zb */
    public void mo37027zb(String str, int i) {
        ConversationCounterTypeSp.platinumPinChatOriginLevel.set(str, i);
    }
}
