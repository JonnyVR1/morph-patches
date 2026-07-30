package p002l;

import com.p1.mobile.longlink.msg.liveroom.LiveChatAreaOperationMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r4s extends bk2<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> {
    public r4s(p3g0<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer> mo9244b() {
        return LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "common.chatAreaOperationSite.remind";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer mo9251z(String str, LiveChatAreaOperationMessage.ChatAreaOperationSiteContainer chatAreaOperationSiteContainer) {
        return chatAreaOperationSiteContainer;
    }
}
