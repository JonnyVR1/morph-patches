package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallAudienceView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiCall.dialog.view.MultiCallLivingFriendView;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m88121d2 = {"Ll/ef10;", "Ll/wb10;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/pg10;", "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/pg10;)V", "", "position", "getItemViewType", "(I)I", "", "L", "()V", c4s.C_ZONE, "()I", "Landroid/view/View;", "convertView", Item.TYPE, "itemViewType", "E", "(Landroid/view/View;III)V", "J", "", "K", "()Z", "f", "Lcom/p1/mobile/android/app/Act;", "g", "Ll/pg10;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ef10 extends wb10 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final pg10 presenter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef10(@NotNull Act act, @NotNull pg10 pg10Var) {
        super(act, pg10Var);
        act.getClass();
        pg10Var.getClass();
        this.act = act;
        this.presenter = pg10Var;
    }

    /* JADX INFO: renamed from: H */
    public static Unit m120579H() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static Unit m120580I() {
        return Unit.INSTANCE;
    }

    @Override // p153l.wb10, p153l.jic0
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ void mo29822A(View view, Integer num, int i, int i2) {
        mo120581E(view, num.intValue(), i, i2);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return m120583K() ? 1 : 2;
    }

    @Override // p153l.wb10
    /* JADX INFO: renamed from: E */
    public void mo120581E(@NotNull View convertView, int item, int itemViewType, int position) {
        convertView.getClass();
        if (convertView instanceof MultiCallAudienceView) {
            MultiCallAudienceView multiCallAudienceView = (MultiCallAudienceView) convertView;
            multiCallAudienceView.mo22064i1(this.presenter);
            multiCallAudienceView.mo76876R(this.act);
        } else if (convertView instanceof MultiCallLivingFriendView) {
            MultiCallLivingFriendView multiCallLivingFriendView = (MultiCallLivingFriendView) convertView;
            multiCallLivingFriendView.mo22064i1(this.presenter);
            multiCallLivingFriendView.mo76876R(this.act);
        }
    }

    /* JADX INFO: renamed from: J */
    public final int m120582J(int position) {
        if (m120583K()) {
            return R$string.f48190k9;
        }
        if (position != 0) {
            return position != 1 ? R$string.f48190k9 : R$string.f48190k9;
        }
        return R$string.f47545G8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: K */
    public final boolean m120583K() {
        return Intrinsics.m88377d(this.presenter.m213810E2().mo183435j().liveMode, "friends");
    }

    /* JADX INFO: renamed from: L */
    public final void m120584L() {
        if (getCurItemView() instanceof MultiCallAudienceView) {
            View viewM205700F = getCurItemView();
            viewM205700F.getClass();
            ((MultiCallAudienceView) viewM205700F).m76893r0(new Function0() { // from class: l.cf10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ef10.m120579H();
                }
            }, new Function0() { // from class: l.df10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ef10.m120580I();
                }
            });
        } else if (getCurItemView() instanceof MultiCallLivingFriendView) {
            pg10.m172192g4(this.presenter, null, null, 3, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        if (m120583K()) {
            return yec0.f199021b4;
        }
        if (position != 0) {
            return position != 1 ? super.getItemViewType(position) : yec0.f199021b4;
        }
        return yec0.f199177n4;
    }
}
