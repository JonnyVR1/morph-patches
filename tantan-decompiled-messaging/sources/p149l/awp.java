package p149l;

import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.newui.messages.compliment.WhisperListFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, m87232d2 = {"Ll/awp;", "", "Lcom/p1/mobile/putong/core/newui/messages/compliment/WhisperListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/messages/compliment/WhisperListFrag;)V", "Landroid/widget/FrameLayout;", "container", "", "a", "(Landroid/widget/FrameLayout;)V", "c", "()V", "b", "Lcom/p1/mobile/putong/core/newui/messages/compliment/WhisperListFrag;", "Ll/n1n;", "Ll/n1n;", "delegate", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class awp {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WhisperListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n1n delegate;

    public awp(@NotNull WhisperListFrag whisperListFrag) {
        whisperListFrag.getClass();
        this.frag = whisperListFrag;
        this.delegate = new n1n(whisperListFrag, p1n.INSTANCE.m167114d(), false, null, 12, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m99296a(@NotNull FrameLayout container) {
        container.getClass();
        n1n.m157439h(this.delegate, container, 8.0f, 0.0f, 4, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m99297b() {
        this.delegate.m157445k();
    }

    /* JADX INFO: renamed from: c */
    public final void m99298c() {
        this.delegate.m157449o();
    }
}
