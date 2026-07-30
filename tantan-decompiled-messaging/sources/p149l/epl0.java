package p149l;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p046p1.mobile.putong.live.livingroom.virtual.endSuggest.SuggestedStopped;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0011R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010)\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 R\u0018\u0010+\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010 R\u0018\u0010-\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010 R\u0018\u0010/\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010 ¨\u00060"}, m87232d2 = {"Ll/epl0;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/npl0;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenter", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/npl0;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "H", "(Landroid/view/View;)V", "m", "Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;", "data", "K", "(Lcom/p1/mobile/putong/live/livingroom/virtual/endSuggest/SuggestedStopped;)V", "", "times", "I", "(I)V", "J", "Landroid/widget/LinearLayout;", "k", "Landroid/widget/LinearLayout;", "rootView", "Lv/VDraweeView;", BLiveStormDanmakuGiftResourceType.f44444l, "Lv/VDraweeView;", "imageView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "imageText", "Landroid/widget/ImageView;", "n", "Landroid/widget/ImageView;", "closeView", "o", "titleView", "p", "subTitleView", "q", "confirmView", "r", "countDownView", BLiveStormDanmakuGiftResourceType.f44446s, "countDownTextView", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class epl0 extends LiveMenuDialogHolder<npl0> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public LinearLayout rootView;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public VDraweeView imageView;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public TextView imageText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public ImageView closeView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public TextView titleView;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public TextView subTitleView;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public TextView confirmView;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public TextView countDownView;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public TextView countDownTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epl0(@NotNull Act act, @NotNull npl0 npl0Var) {
        super(t6c0.f168074J6, act, npl0Var);
        act.getClass();
        npl0Var.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m117651F(epl0 epl0Var, SuggestedStopped suggestedStopped, View view) {
        ((npl0) epl0Var.f47757b).m160518a4();
        suggestedStopped.getTrackData().setModuleId("e_audio_live_stopped_popup_close");
        LiveCardTracker.trackMc(suggestedStopped.getTrackData());
    }

    /* JADX INFO: renamed from: G */
    public static void m117652G(epl0 epl0Var, SuggestedStopped suggestedStopped, View view) {
        ypv.f199493a.m199378w(((npl0) epl0Var.f47757b).act(), suggestedStopped.getGoAction());
        LiveCardTracker.trackMc(suggestedStopped.getTrackData());
        ((npl0) epl0Var.f47757b).m160518a4();
    }

    /* JADX INFO: renamed from: H */
    private final void m117653H(View view) {
        this.rootView = (LinearLayout) view.findViewById(g5c0.f101105y5);
        this.imageView = (VDraweeView) view.findViewById(g5c0.f100686F2);
        this.imageText = (TextView) view.findViewById(g5c0.f100677E2);
        this.closeView = (ImageView) view.findViewById(g5c0.f101073v0);
        this.titleView = (TextView) view.findViewById(g5c0.f100798R6);
        this.subTitleView = (TextView) view.findViewById(g5c0.f100939g6);
        this.confirmView = (TextView) view.findViewById(g5c0.f100648B0);
        this.countDownView = (TextView) view.findViewById(g5c0.f100756N0);
        this.countDownTextView = (TextView) view.findViewById(g5c0.f100765O0);
    }

    /* JADX INFO: renamed from: I */
    public final void m117654I(int times) {
        TextView textView = this.countDownView;
        if (textView != null) {
            textView.setText(times + "s ");
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m117655J(final SuggestedStopped data) {
        hxs.m133407t("context_livingAct", this.imageView, data.getIamge(), t100.f167244S);
        TextView textView = this.imageText;
        if (textView != null) {
            textView.setText(data.getImageText());
        }
        TextView textView2 = this.titleView;
        if (textView2 != null) {
            textView2.setText(data.getTitle());
        }
        TextView textView3 = this.subTitleView;
        if (textView3 != null) {
            textView3.setText(data.getSubTitle());
        }
        TextView textView4 = this.confirmView;
        if (textView4 != null) {
            textView4.setText(data.getButtonText());
        }
        TextView textView5 = this.countDownTextView;
        if (textView5 != null) {
            textView5.setText(data.getTimeTpl());
        }
        LiveCardTracker.trackMv(data.getTrackData());
        TextView textView6 = this.confirmView;
        if (textView6 != null) {
            xdl0.m208329E0(textView6, new View.OnClickListener() { // from class: l.cpl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    epl0.m117652G(this.f81972a, data, view);
                }
            });
        }
        ImageView imageView = this.closeView;
        if (imageView != null) {
            xdl0.m208329E0(imageView, new View.OnClickListener() { // from class: l.dpl0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    epl0.m117651F(this.f87289a, data, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m117656K(@NotNull SuggestedStopped data) {
        data.getClass();
        m71834E();
        m117655J(data);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(@NotNull View view) {
        view.getClass();
        super.mo71836m(view);
        m117653H(view);
    }
}
