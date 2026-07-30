package p153l;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlFamilyShareInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\fJ\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, m88121d2 = {"Ll/pen;", "Lcom/p1/mobile/putong/live/livingroom/archi/module/LiveMenuDialogHolder;", "Ll/uen;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "presenterIntl", "<init>", "(Lcom/p1/mobile/android/app/Act;Ll/uen;)V", "Landroid/view/View;", "parentView", "", "J", "(Landroid/view/View;)V", "I", "()V", OMSTemplateModeType.view, "m", "Lcom/p1/mobile/putong/live/base/data/BLiveIntlFamilyShareInfo;", "familyInfo", "K", "(Lcom/p1/mobile/putong/live/base/data/BLiveIntlFamilyShareInfo;)V", "Landroid/widget/ImageView;", "k", "Landroid/widget/ImageView;", "closePanel", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f45292l, "Landroid/widget/TextView;", "familyName", "shareBtn", "n", "shareContent", "Lv/VDraweeView;", "o", "Lv/VDraweeView;", "familyCover", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class pen extends LiveMenuDialogHolder<uen> {

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
    public pen(@NotNull Act act, @NotNull uen uenVar) {
        super(yec0.f199318y2, act, uenVar);
        act.getClass();
        uenVar.getClass();
    }

    /* JADX INFO: renamed from: F */
    public static void m172049F(pen penVar, BLiveIntlFamilyShareInfo bLiveIntlFamilyShareInfo, View view) {
        uen uenVar = (uen) penVar.f48605b;
        String str = bLiveIntlFamilyShareInfo.f45237id;
        str.getClass();
        uenVar.m195793X3(str);
    }

    /* JADX INFO: renamed from: G */
    public static void m172050G(pen penVar, View view) {
        penVar.m172052I();
    }

    /* JADX INFO: renamed from: H */
    public static void m172051H(pen penVar, View view) {
        penVar.m172052I();
    }

    /* JADX INFO: renamed from: I */
    private final void m172052I() {
        mo73021p();
    }

    /* JADX INFO: renamed from: J */
    private final void m172053J(View parentView) {
        View viewFindViewById = parentView.findViewById(mdc0.f136327w0);
        viewFindViewById.getClass();
        this.closePanel = (ImageView) viewFindViewById;
        View viewFindViewById2 = parentView.findViewById(mdc0.f135912D1);
        viewFindViewById2.getClass();
        this.familyName = (TextView) viewFindViewById2;
        View viewFindViewById3 = parentView.findViewById(mdc0.f135903C1);
        viewFindViewById3.getClass();
        this.familyCover = (VDraweeView) viewFindViewById3;
        View viewFindViewById4 = parentView.findViewById(mdc0.f136052S6);
        viewFindViewById4.getClass();
        this.shareBtn = (TextView) viewFindViewById4;
        View viewFindViewById5 = parentView.findViewById(mdc0.f136015O5);
        viewFindViewById5.getClass();
        this.shareContent = (TextView) viewFindViewById5;
        TextView textView = this.shareBtn;
        ImageView imageView = null;
        if (textView == null) {
            Intrinsics.m88391r("shareBtn");
            textView = null;
        }
        qnp0.m177261d1(textView, qa00.m175859d(10.0f));
        ImageView imageView2 = this.closePanel;
        if (imageView2 == null) {
            Intrinsics.m88391r("closePanel");
        } else {
            imageView = imageView2;
        }
        bnl0.m105509E0(imageView, new View.OnClickListener() { // from class: l.nen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pen.m172050G(this.f141670a, view);
            }
        });
        bnl0.m105509E0(parentView.findViewById(mdc0.f135991M), new View.OnClickListener() { // from class: l.oen
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pen.m172051H(this.f147005a, view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m172054K(@NotNull final BLiveIntlFamilyShareInfo familyInfo) {
        familyInfo.getClass();
        m73017E();
        TextView textView = this.familyName;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.m88391r("familyName");
            textView = null;
        }
        textView.setText(familyInfo.name);
        TextView textView3 = this.shareContent;
        if (textView3 == null) {
            Intrinsics.m88391r("shareContent");
            textView3 = null;
        }
        textView3.setText(familyInfo.liveTitle);
        VDraweeView vDraweeView = this.familyCover;
        if (vDraweeView == null) {
            Intrinsics.m88391r("familyCover");
            vDraweeView = null;
        }
        izs.m142868s("context_single_room", vDraweeView, familyInfo.liveCover);
        TextView textView4 = this.shareBtn;
        if (textView4 == null) {
            Intrinsics.m88391r("shareBtn");
        } else {
            textView2 = textView4;
        }
        bnl0.m105509E0(textView2, new View.OnClickListener() { // from class: l.men
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pen.m172049F(this.f136546a, familyInfo, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(@NotNull View view) {
        view.getClass();
        super.mo73019m(view);
        m172053J(view);
    }
}
