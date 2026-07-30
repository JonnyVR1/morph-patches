package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;

/* JADX INFO: loaded from: classes4.dex */
public class r4s extends bk2<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> {
    public r4s(p3g0<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> mo94398b() {
        return LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "common.chatAreaOperationSite.remind";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer mo94461z(String str, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return chatAreaOperationSiteContainer;
    }
}
