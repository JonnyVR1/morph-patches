package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveTasks;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u0015J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010 R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010:\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001b\u0010H\u001a\u00020C8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, m87232d2 = {"Ll/nfe;", "Ll/ho2;", j6f.GPS_DIRECTION_TRUE, "Ll/rj2;", "Ll/bsm;", BaseSei.INFO, "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "task", "", "itemType", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/base/data/BLiveTasks;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "X3", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", Constants.KEY_T, "()V", "Y3", "g4", "f4", "r", "", "triangleWidth", "Z3", "(I)I", "n", "M3", "()Ljava/lang/String;", "j", "Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "getTask", "()Lcom/p1/mobile/putong/live/base/data/BLiveTasks;", "k", "Ljava/lang/String;", "getItemType", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VDraweeView;", "d4", "()Lv/VDraweeView;", "set_head", "(Lv/VDraweeView;)V", "_head", "Lv/VText;", "m", "Lv/VText;", "c4", "()Lv/VText;", "set_count", "(Lv/VText;)V", "_count", "b4", "set_content", "_content", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "getLinearLayout", "()Landroid/widget/LinearLayout;", "setLinearLayout", "(Landroid/widget/LinearLayout;)V", "linearLayout", "Ll/spd0;", "p", "Lkotlin/Lazy;", "a4", "()Ll/spd0;", "savedHelper", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class nfe<T extends ho2> extends rj2<T> {

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
    public nfe(@NotNull bsm<T> bsmVar, @NotNull BLiveTasks bLiveTasks, @NotNull String str) {
        super(bsmVar);
        bsmVar.getClass();
        bLiveTasks.getClass();
        str.getClass();
        this.task = bLiveTasks;
        this.itemType = str;
        this.savedHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.kfe
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return nfe.m159224U3(this.f122919a);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static spd0 m159224U3(nfe nfeVar) {
        return new spd0(nfeVar.m206032L2());
    }

    /* JADX INFO: renamed from: V3 */
    public static void m159225V3(nfe nfeVar, Long l2) {
        nfeVar.m159229Y3();
    }

    /* JADX INFO: renamed from: W3 */
    public static void m159226W3(nfe nfeVar, Long l2) {
        nfeVar.m193998P3();
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m159227e4(nfe nfeVar, View view) {
        nfeVar.m193998P3();
    }

    @Override // p149l.uj2
    @NotNull
    /* JADX INFO: renamed from: M3, reason: from getter */
    public String getItemType() {
        return this.itemType;
    }

    @NotNull
    /* JADX INFO: renamed from: X3 */
    public final View m159228X3(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM164066b = ofe.m164066b(this, inflater, parent);
        viewM164066b.getClass();
        return viewM164066b;
    }

    /* JADX INFO: renamed from: Y3 */
    public final void m159229Y3() {
        if (m159230Z3(t100.f167262k) == 0) {
            m159236g4();
        } else {
            m159235f4();
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final int m159230Z3(int triangleWidth) {
        View view = (View) m129297F3(new ujj(629).m194015e((Intrinsics.m87488d(getItemType(), "start") || Intrinsics.m87488d(getItemType(), "reward")) ? BLiveButtonType.get("settingButton") : BLiveButtonType.get("giftButton")));
        if (view != null) {
            int[] iArr = {0, 0};
            view.getLocationOnScreen(iArr);
            if (iArr[0] != 0) {
                return (((xdl0.m208412y0() - iArr[0]) - t100.f167259h) - (view.getWidth() / 2)) - (triangleWidth / 2);
            }
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: a4 */
    public final spd0 m159231a4() {
        return (spd0) this.savedHelper.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: b4 */
    public final VText m159232b4() {
        VText vText = this._content;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c4 */
    public final VText m159233c4() {
        VText vText = this._count;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_count");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d4 */
    public final VDraweeView m159234d4() {
        VDraweeView vDraweeView = this._head;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_head");
        return null;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m159235f4() {
        m159237r();
        m159231a4().m185360j(getItemType());
        duringCreated((C22306c<T>) m206027E2().m132135h2(5, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.jfe
            @Override // p149l.e30
            public final void call(Object obj) {
                nfe.m159226W3(this.f117652a, (Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public final void m159236g4() {
        m129299H3(m206027E2().m132172w1(1, TimeUnit.SECONDS)).subscribe(ffw.m121197h(new e30() { // from class: l.lfe
            @Override // p149l.e30
            public final void call(Object obj) {
                nfe.m159225V3(this.f127867a, (Long) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        LinearLayout linearLayout = this.linearLayout;
        if (linearLayout != null) {
            m193999R3(linearLayout);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m159237r() {
        LinearLayout linearLayout = new LinearLayout(this.f188513f);
        linearLayout.setOrientation(1);
        int i = xdl0.f192404f;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 85;
        layoutParams.rightMargin = t100.f167259h;
        linearLayout.setLayoutParams(layoutParams);
        LayoutInflater layoutInflaterInflater = this.f188513f.inflater();
        layoutInflaterInflater.getClass();
        View viewM159228X3 = m159228X3(layoutInflaterInflater, null);
        int i2 = t100.f167261j;
        viewM159228X3.setBackground(yb2.m213876a(-30697, i2, false));
        linearLayout.addView(viewM159228X3);
        FrameLayout frameLayout = new FrameLayout(this.f188513f);
        VImage vImage = new VImage(this.f188513f);
        vImage.setImageResource(i3c0.f111059k1);
        vImage.setScaleType(ImageView.ScaleType.FIT_XY);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, t100.m186890d(7.0f));
        layoutParams2.gravity = 5;
        layoutParams2.rightMargin = m159230Z3(t100.f167262k);
        layoutParams2.topMargin = -2;
        vImage.setLayoutParams(layoutParams2);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f192403e, xdl0.f192404f));
        frameLayout.addView(vImage);
        linearLayout.addView(frameLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: l.mfe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nfe.m159227e4(this.f133587a, view);
            }
        });
        this.linearLayout = linearLayout;
        hxs.m133406s("context_livingAct", m159234d4(), this.task.reward.giftImageUrl);
        m159233c4().setTypeface(Typeface.DEFAULT_BOLD);
        m159232b4().setText(this.task.bubbleText);
        if (this.task.reward.giftCount > 0) {
            xdl0.m208345M0(m159233c4(), true);
            m159233c4().setText(BaseSei.f13930X + this.task.reward.giftCount);
        } else {
            xdl0.m208345M0(m159233c4(), false);
        }
        m193995L3(this.linearLayout);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m159229Y3();
    }
}
