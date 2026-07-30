package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;

/* JADX INFO: loaded from: classes4.dex */
public class s6s extends jk2<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> {
    public s6s(wbg0<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> mo95510b() {
        return LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "common.chatAreaOperationSite.remind";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer mo95993z(String str, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return chatAreaOperationSiteContainer;
    }
}
