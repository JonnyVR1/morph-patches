package p149l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType;
import com.p046p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m87232d2 = {"Ll/ibp0;", "Ll/ho2;", "D", "Ll/wjm0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;", "Ll/bsm;", BaseSei.INFO, "middleView", "<init>", "(Ll/bsm;Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;)V", "Ll/p1k0;", "data", "", "j4", "(Ll/p1k0;)V", "O3", "()V", "P3", "", "jumpScheme", "", "needDismissMyself", "m4", "(Ljava/lang/String;Z)V", "n4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;", "type", "p4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;)V", "q4", "userId", "o4", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ibp0<D extends ho2> extends wjm0<VoiceVirtualUserCardMiddleView, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibp0(@NotNull bsm<D> bsmVar, @NotNull VoiceVirtualUserCardMiddleView voiceVirtualUserCardMiddleView) {
        super(bsmVar);
        bsmVar.getClass();
        voiceVirtualUserCardMiddleView.getClass();
        mo51532C(voiceVirtualUserCardMiddleView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static void m135261l4(ibp0 ibp0Var, j760 j760Var) {
        VoiceVirtualUserCardMiddleView voiceVirtualUserCardMiddleView = (VoiceVirtualUserCardMiddleView) ibp0Var.viewModel;
        F f = j760Var.f116564a;
        f.getClass();
        int iIntValue = ((Integer) f).intValue();
        S s = j760Var.f116565b;
        s.getClass();
        voiceVirtualUserCardMiddleView.m77573d(iIntValue, ((Integer) s).intValue());
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: O3 */
    public void mo94471O3() {
        super.mo94471O3();
        ((VoiceVirtualUserCardMiddleView) this.viewModel).m77571b();
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        m207199N3((C22306c) m206028F2().GiftWallDialogEvent.updateLightedGifts().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.hbp0
            @Override // p149l.e30
            public final void call(Object obj) {
                ibp0.m135261l4(this.f106954a, (j760) obj);
            }
        }));
    }

    @Override // p149l.wjm0
    /* JADX INFO: renamed from: j4 */
    public void mo123913j4(@Nullable p1k0 data) {
        super.mo123913j4(data);
        ((VoiceVirtualUserCardMiddleView) this.viewModel).m77572c(data);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m135262m4(@NotNull String jumpScheme, boolean needDismissMyself) {
        jumpScheme.getClass();
        if (TextUtils.isEmpty(jumpScheme)) {
            return;
        }
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(jumpScheme).m206699c());
        if (needDismissMyself) {
            m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m135263n4() {
        m206028F2().VoiceAuctionEvent.openAuctionRelationCardDlg().mo172463j(m203475f4().f56011id);
        m206028F2().OpenUserCardDialogEvent.dismiss().m172467p();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m135264o4(@NotNull String userId) {
        userId.getClass();
        zvf0.m220396r("e_audio_contribution_entrance", "p_audio_profile");
        m206028F2().VirtualCompanionEvent.show().mo172463j(new um5(1, userId));
    }

    /* JADX INFO: renamed from: p4 */
    public final void m135265p4(@NotNull BLiveVoiceUserProfileMiddleCardType type) {
        type.getClass();
        if (TEnum.equals(type, "giftWall")) {
            String str = m203475f4().f56011id;
            str.getClass();
            fbp0.m120386b(str);
        } else if (TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.companyBoard)) {
            String str2 = m203475f4().f56011id;
            str2.getClass();
            fbp0.m120385a(str2);
        } else if (TEnum.equals(type, "sweetCp")) {
            fbp0.m120389e();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m135266q4(@NotNull BLiveVoiceUserProfileMiddleCardType type) {
        type.getClass();
        if (TEnum.equals(type, "giftWall")) {
            String str = m203475f4().f56011id;
            str.getClass();
            fbp0.m120394j(str);
        } else if (TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.companyBoard)) {
            String str2 = m203475f4().f56011id;
            str2.getClass();
            fbp0.m120393i(str2);
        } else if (TEnum.equals(type, "sweetCp")) {
            fbp0.m120395k();
        }
    }
}
