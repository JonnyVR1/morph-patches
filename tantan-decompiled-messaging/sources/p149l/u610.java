package p149l;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallAudienceView;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m87232d2 = {"Ll/u610;", "Ll/m310;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/f810;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/f810;)V", "", "position", "getItemViewType", "(I)I", "", "L", "()V", b2s.C_ZONE, "()I", "Landroid/view/View;", "convertView", Item.TYPE, "itemViewType", "E", "(Landroid/view/View;III)V", "J", "", "K", "()Z", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Ll/f810;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class u610 extends m310 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final f810 presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u610(@NotNull Act act, @NotNull f810 f810Var) {
        super(act, f810Var);
        act.getClass();
        f810Var.getClass();
        this.act = act;
        this.presenter = f810Var;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m191899H() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static Unit m191900I() {
        return Unit.INSTANCE;
    }

    @Override // p149l.m310, p149l.dac0
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo28823A(View view, Integer num, int i, int i2) {
        mo152806E(view, num.intValue(), i, i2);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return m191902K() ? 1 : 2;
    }

    @Override // p149l.m310
    /* JADX INFO: renamed from: E */
    public void mo152806E(@NotNull View convertView, int item, int itemViewType, int position) {
        convertView.getClass();
        if (convertView instanceof MultiCallAudienceView) {
            MultiCallAudienceView multiCallAudienceView = (MultiCallAudienceView) convertView;
            multiCallAudienceView.mo21065i1(this.presenter);
            multiCallAudienceView.mo75693R(this.act);
        } else if (convertView instanceof MultiCallLivingFriendView) {
            MultiCallLivingFriendView multiCallLivingFriendView = (MultiCallLivingFriendView) convertView;
            multiCallLivingFriendView.mo21065i1(this.presenter);
            multiCallLivingFriendView.mo75693R(this.act);
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m191901J(int position) {
        if (m191902K()) {
            return R$string.f47342k9;
        }
        if (position != 0) {
            return position != 1 ? R$string.f47342k9 : R$string.f47342k9;
        }
        return R$string.f46697G8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: K */
    public final boolean m191902K() {
        return Intrinsics.m87488d(this.presenter.m206027E2().mo149813j().liveMode, "friends");
    }

    /* JADX INFO: renamed from: L */
    public final void m191903L() {
        if (getCurItemView() instanceof MultiCallAudienceView) {
            View viewM152807F = getCurItemView();
            viewM152807F.getClass();
            ((MultiCallAudienceView) viewM152807F).m75710r0(new Function0() { // from class: l.s610
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u610.m191899H();
                }
            }, new Function0() { // from class: l.t610
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return u610.m191900I();
                }
            });
        } else if (getCurItemView() instanceof MultiCallLivingFriendView) {
            f810.m119860g4(this.presenter, null, null, 3, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (m191902K()) {
            return t6c0.f168289b4;
        }
        if (position != 0) {
            return position != 1 ? super.getItemViewType(position) : t6c0.f168289b4;
        }
        return t6c0.f168445n4;
    }
}
