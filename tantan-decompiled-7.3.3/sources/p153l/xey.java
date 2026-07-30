package p153l;

import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.meet.MeetEntranceModel;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/xey;", "Ll/v4;", "Ll/rpl;", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", OMSTemplateModeType.view, "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;)V", "c", "()Ll/rpl;", "", "b", "()Z", "Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "getView", "()Lcom/p1/mobile/putong/core/newui/messages/business/BusinessConversationView;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xey extends AbstractC20745v4<rpl> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final BusinessConversationView view;

    public xey(@NotNull BusinessConversationView businessConversationView) {
        businessConversationView.getClass();
        this.view = businessConversationView;
    }

    @Override // p153l.AbstractC20745v4
    /* JADX INFO: renamed from: b */
    public boolean mo160802b() {
        return false;
    }

    @Override // p153l.AbstractC20745v4
    @NotNull
    /* JADX INFO: renamed from: c */
    public rpl mo160803c() {
        return new MeetEntranceModel(this.view);
    }
}
