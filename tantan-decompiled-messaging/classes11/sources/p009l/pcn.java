package p009l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.g5c0;
import l.hxs;
import l.mep0;
import l.t100;
import l.t6c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Ll/pcn;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/ucn;", "Lcom/p1/mobile/android/app/Act;", "act", "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/ucn;)V", "Landroid/view/View;", "parentView", "", "J", "(Landroid/view/View;)V", "I", "()V", "view", "m", "Lcom/p1/mobile/putong/live/base/data/BLiveIntlFamilyShareInfo;", "familyInfo", "K", "(Lcom/p1/mobile/putong/live/base/data/BLiveIntlFamilyShareInfo;)V", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "closePanel", "Landroid/widget/TextView;", "l", "Landroid/widget/TextView;", "familyName", "shareBtn", "n", "shareContent", "Lv/VDraweeView;", "o", "Lv/VDraweeView;", "familyCover", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class pcn extends LiveMenuDialogHolder<ucn> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public ImageView closePanel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public TextView familyName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public TextView shareBtn;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public TextView shareContent;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VDraweeView familyCover;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcn(@NotNull Act act, @NotNull ucn ucnVar) {
        super(t6c0.y2, act, ucnVar);
        act.getClass();
        ucnVar.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m20139F(pcn pcnVar, BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo, View view) {
        ucn ucnVar = (ucn) ((LiveMenuDialogHolder) pcnVar).b;
        String str = bLiveIntlFamilyShareInfo.id;
        str.getClass();
        ucnVar.m22796X3(str);
    }

    /* JADX INFO: renamed from: G */
    public static void m20140G(pcn pcnVar, View view) {
        pcnVar.m20142I();
    }

    /* JADX INFO: renamed from: H */
    public static void m20141H(pcn pcnVar, View view) {
        pcnVar.m20142I();
    }

    /* JADX INFO: renamed from: I */
    private final void m20142I() {
        p();
    }

    /* JADX INFO: renamed from: J */
    private final void m20143J(View parentView) {
        View viewFindViewById = parentView.findViewById(g5c0.w0);
        viewFindViewById.getClass();
        this.closePanel = (ImageView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(g5c0.D1);
        viewFindViewById2.getClass();
        this.familyName = (TextView) viewFindViewById2;
        VDraweeView vDraweeViewFindViewById = parentView.findViewById(g5c0.C1);
        vDraweeViewFindViewById.getClass();
        this.familyCover = vDraweeViewFindViewById;
        View viewFindViewById3 = parentView.findViewById(g5c0.S6);
        viewFindViewById3.getClass();
        this.shareBtn = (TextView) viewFindViewById3;
        View viewFindViewById4 = parentView.findViewById(g5c0.O5);
        viewFindViewById4.getClass();
        this.shareContent = (TextView) viewFindViewById4;
        TextView textView = this.shareBtn;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.r("shareBtn");
            textView = null;
        }
        mep0.d1(textView, t100.d(10.0f));
        ImageView imageView2 = this.closePanel;
        if (imageView2 == null) {
            Intrinsics.r("closePanel");
        } else {
            imageView = imageView2;
        }
        xdl0.E0(imageView, new View.OnClickListener() { // from class: l.ncn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pcn.m20140G(this.f17409a, view);
            }
        });
        xdl0.E0(parentView.findViewById(g5c0.M), new View.OnClickListener() { // from class: l.ocn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pcn.m20141H(this.f17900a, view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m20144K(@NotNull final BLiveIntlFamilyShareInfo familyInfo) {
        familyInfo.getClass();
        E();
        TextView textView = this.familyName;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.r("familyName");
            textView = null;
        }
        textView.setText(familyInfo.name);
        TextView textView3 = this.shareContent;
        if (textView3 == null) {
            Intrinsics.r("shareContent");
            textView3 = null;
        }
        textView3.setText(familyInfo.liveTitle);
        SimpleDraweeView simpleDraweeView = this.familyCover;
        if (simpleDraweeView == null) {
            Intrinsics.r("familyCover");
            simpleDraweeView = null;
        }
        hxs.s("context_single_room", simpleDraweeView, familyInfo.liveCover);
        TextView textView4 = this.shareBtn;
        if (textView4 == null) {
            Intrinsics.r("shareBtn");
        } else {
            textView2 = textView4;
        }
        xdl0.E0(textView2, new View.OnClickListener() { // from class: l.mcn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pcn.m20139F(this.f16803a, familyInfo, view);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public void m20145m(@NotNull View view) {
        view.getClass();
        super.m(view);
        m20143J(view);
    }
}
