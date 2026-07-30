package p153l;

import com.p051p1.mobile.android.app.Act;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Ll/oi10;", "Ll/wb10;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/vi10;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/vi10;)V", "", "position", "getItemViewType", "(I)I", c4s.C_ZONE, "()I", "f", "I", "pageCount", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class oi10 extends wb10 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi10(@NotNull Act act, @NotNull vi10 vi10Var) {
        super(act, vi10Var);
        act.getClass();
        vi10Var.getClass();
        this.pageCount = 2;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C, reason: from getter */
    public int getPageCount() {
        return this.pageCount;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (position != 0) {
            return position != 1 ? super.getItemViewType(position) : yec0.f199151l4;
        }
        return yec0.f199190o4;
    }
}
