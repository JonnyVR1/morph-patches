package p149l;

import com.p046p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Ll/ea10;", "Ll/m310;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/la10;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/la10;)V", "", "position", "getItemViewType", "(I)I", b2s.C_ZONE, "()I", "f", "I", "pageCount", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ea10 extends m310 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea10(@NotNull Act act, @NotNull la10 la10Var) {
        super(act, la10Var);
        act.getClass();
        la10Var.getClass();
        this.pageCount = 2;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C, reason: from getter */
    public int getPageCount() {
        return this.pageCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position != 0) {
            return position != 1 ? super.getItemViewType(position) : t6c0.f168419l4;
        }
        return t6c0.f168458o4;
    }
}
