package p009l;

import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.messages.ConversationListFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll/qko;", "", "Lcom/p1/mobile/putong/core/newui/messages/ConversationListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/ConversationListFrag;)V", "Landroid/widget/FrameLayout;", "container", "", "a", "(Landroid/widget/FrameLayout;)V", "c", "()V", "b", "Lcom/p1/mobile/putong/core/newui/messages/ConversationListFrag;", "Ll/n1n;", "Ll/n1n;", "delegate", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qko {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ConversationListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n1n delegate;

    public qko(@NotNull ConversationListFrag conversationListFrag) {
        conversationListFrag.getClass();
        this.frag = conversationListFrag;
        this.delegate = new n1n(conversationListFrag, p1n.INSTANCE.m20084b(), false, null, 12, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m21081a(@NotNull FrameLayout container) {
        container.getClass();
        this.delegate.m18740g(container, 3.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m21082b() {
        this.delegate.m18743k();
    }

    /* JADX INFO: renamed from: c */
    public final void m21083c() {
        this.delegate.m18747o();
    }
}
