package p009l;

import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.profile.ProfileFrag;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll/zbo;", "", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)V", "Landroid/widget/LinearLayout;", "parent", "Landroid/view/View;", "insertBefore", "", "a", "(Landroid/widget/LinearLayout;Landroid/view/View;)V", "c", "()V", "d", "b", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "Ll/n1n;", "Ll/n1n;", "delegate", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zbo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ProfileFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n1n delegate;

    public zbo(@NotNull ProfileFrag profileFrag) {
        profileFrag.getClass();
        this.frag = profileFrag;
        this.delegate = new n1n(profileFrag, p1n.INSTANCE.m20085c(), false, null, 8, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m25648a(@NotNull LinearLayout parent, @NotNull View insertBefore) {
        parent.getClass();
        insertBefore.getClass();
        this.delegate.m18741i(parent, insertBefore);
    }

    /* JADX INFO: renamed from: b */
    public final void m25649b() {
        this.delegate.m18743k();
    }

    /* JADX INFO: renamed from: c */
    public final void m25650c() {
        this.delegate.m18747o();
    }

    /* JADX INFO: renamed from: d */
    public final void m25651d() {
        this.delegate.m18749q();
    }
}
