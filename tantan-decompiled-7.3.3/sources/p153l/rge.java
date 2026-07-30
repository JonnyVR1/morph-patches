package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveTasks;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010 R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, m88121d2 = {"Ll/rge;", "Ll/oo2;", p7f.GPS_DIRECTION_TRUE, "Ll/zj2;", "Ll/dum;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "task", "", "itemType", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/base/data/BLiveTasks;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "X3", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", Constants.KEY_T, "()V", "Y3", "g4", "f4", "r", "", "triangleWidth", "Z3", "(I)I", "n", "M3", "()Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "getTask", "()Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "k", "Ljava/lang/String;", "getItemType", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f45292l, "Lv/VDraweeView;", "d4", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Lv/VText;", "m", "Lv/VText;", "c4", "()Lv/VText;", "set_count", "(Lv/VText;)V", "_count", "b4", "set_content", "_content", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "getLinearLayout", "()Landroid/widget/LinearLayout;", "setLinearLayout", "(Landroid/widget/LinearLayout;)V", "linearLayout", "Ll/uxd0;", "p", "Lkotlin/Lazy;", "a4", "()Ll/uxd0;", "savedHelper", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class rge<T extends oo2> extends zj2<T> {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final BLiveTasks task;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String itemType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VDraweeView _head;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _count;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VText _content;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public LinearLayout linearLayout;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Lazy savedHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rge(@NotNull dum<T> dumVar, @NotNull BLiveTasks bLiveTasks, @NotNull String str) {
        super(dumVar);
        dumVar.getClass();
        bLiveTasks.getClass();
        str.getClass();
        this.task = bLiveTasks;
        this.itemType = str;
        this.savedHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.oge
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return rge.m181428U3(this.f147229a);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static uxd0 m181428U3(rge rgeVar) {
        return new uxd0(rgeVar.m213815L2());
    }

    /* JADX INFO: renamed from: V3 */
    public static void m181429V3(rge rgeVar, Long l2) {
        rgeVar.m181433Y3();
    }

    /* JADX INFO: renamed from: W3 */
    public static void m181430W3(rge rgeVar, Long l2) {
        rgeVar.m110327P3();
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m181431e4(rge rgeVar, View view) {
        rgeVar.m110327P3();
    }

    @Override // p153l.ck2
    @NotNull
    /* JADX INFO: renamed from: M3, reason: from getter */
    public String getItemType() {
        return this.itemType;
    }

    @NotNull
    /* JADX INFO: renamed from: X3 */
    public final View m181432X3(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM185771b = sge.m185771b(this, inflater, parent);
        viewM185771b.getClass();
        return viewM185771b;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m181433Y3() {
        if (m181434Z3(qa00.f156324k) == 0) {
            m181440g4();
        } else {
            m181439f4();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final int m181434Z3(int triangleWidth) {
        View view = (View) m138856F3(new nmj(629).m163820e((Intrinsics.m88377d(getItemType(), "start") || Intrinsics.m88377d(getItemType(), "reward")) ? BLiveButtonType.get("settingButton") : BLiveButtonType.get("giftButton")));
        if (view != null) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            if (iArr[0] != 0) {
                return (((bnl0.m105592y0() - iArr[0]) - qa00.f156321h) - (view.getWidth() / 2)) - (triangleWidth / 2);
            }
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final uxd0 m181435a4() {
        return (uxd0) this.savedHelper.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final VText m181436b4() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final VText m181437c4() {
        VText vText = this._count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final VDraweeView m181438d4() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_head");
        return null;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m181439f4() {
        m181441r();
        m181435a4().m198421j(getItemType());
        duringCreated((C22421c<T>) m213810E2().m168521h2(5, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.nge
            @Override // p153l.y20
            public final void call(Object obj) {
                rge.m181430W3(this.f141811a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m181440g4() {
        m138858H3(m213810E2().m168556w1(1, TimeUnit.SECONDS)).subscribe(dhw.m115829h(new y20() { // from class: l.pge
            @Override // p153l.y20
            public final void call(Object obj) {
                rge.m181429V3(this.f152256a, (Long) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            m110328R3(linearLayout);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m181441r() {
        LinearLayout linearLayout = new LinearLayout(this.f196919f);
        linearLayout.setOrientation(1);
        int i = bnl0.f77545f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 85;
        layoutParams.rightMargin = qa00.f156321h;
        linearLayout.setLayoutParams(layoutParams);
        LayoutInflater layoutInflaterInflater = this.f196919f.inflater();
        layoutInflaterInflater.getClass();
        View viewM181432X3 = m181432X3(layoutInflaterInflater, null);
        int i2 = qa00.f156323j;
        viewM181432X3.setBackground(fc2.m124971a(-30697, i2, false));
        linearLayout.addView(viewM181432X3);
        FrameLayout frameLayout = new FrameLayout(this.f196919f);
        VImage vImage = new VImage(this.f196919f);
        vImage.setImageResource(obc0.f146387k1);
        vImage.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, qa00.m175859d(7.0f));
        layoutParams2.gravity = 5;
        layoutParams2.rightMargin = m181434Z3(qa00.f156324k);
        layoutParams2.topMargin = -2;
        vImage.setLayoutParams(layoutParams2);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(bnl0.f77544e, bnl0.f77545f));
        frameLayout.addView(vImage);
        linearLayout.addView(frameLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.qge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rge.m181431e4(this.f157403a, view);
            }
        });
        this.linearLayout = linearLayout;
        izs.m142868s("context_livingAct", m181438d4(), this.task.reward.giftImageUrl);
        m181437c4().setTypeface(Typeface.DEFAULT_BOLD);
        m181436b4().setText(this.task.bubbleText);
        if (this.task.reward.giftCount > 0) {
            bnl0.m105525M0(m181437c4(), true);
            m181437c4().setText(BaseSei.f14624X + this.task.reward.giftCount);
        } else {
            bnl0.m105525M0(m181437c4(), false);
        }
        m110323L3(this.linearLayout);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m181433Y3();
    }
}
