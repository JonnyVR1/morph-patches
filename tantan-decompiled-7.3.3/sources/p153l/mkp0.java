package p153l;

import android.text.TextUtils;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserProfileMiddleCardType;
import com.p051p1.mobile.putong.live.livingroom.virtual.userCard.middle.VoiceVirtualUserCardMiddleView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"Ll/mkp0;", "Ll/oo2;", "D", "Ll/atm0;", "Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;", "Ll/dum;", BaseSei.INFO, "middleView", "<init>", "(Ll/dum;Lcom/p1/mobile/putong/live/livingroom/virtual/userCard/middle/VoiceVirtualUserCardMiddleView;)V", "Ll/vak0;", "data", "", "j4", "(Ll/vak0;)V", "O3", "()V", "P3", "", "jumpScheme", "", "needDismissMyself", "m4", "(Ljava/lang/String;Z)V", "n4", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;", "type", "p4", "(Lcom/p1/mobile/putong/live/base/data/BLiveVoiceUserProfileMiddleCardType;)V", "q4", "userId", "o4", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mkp0<D extends oo2> extends atm0<VoiceVirtualUserCardMiddleView, D> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkp0(@NotNull dum<D> dumVar, @NotNull VoiceVirtualUserCardMiddleView voiceVirtualUserCardMiddleView) {
        super(dumVar);
        dumVar.getClass();
        voiceVirtualUserCardMiddleView.getClass();
        mo52715C(voiceVirtualUserCardMiddleView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l4 */
    public static void m158816l4(mkp0 mkp0Var, pf60 pf60Var) {
        VoiceVirtualUserCardMiddleView voiceVirtualUserCardMiddleView = (VoiceVirtualUserCardMiddleView) mkp0Var.viewModel;
        F f = pf60Var.f152156a;
        f.getClass();
        int iIntValue = ((Integer) f).intValue();
        S s = pf60Var.f152157b;
        s.getClass();
        voiceVirtualUserCardMiddleView.m78756d(iIntValue, ((Integer) s).intValue());
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: O3 */
    public void mo96836O3() {
        super.mo96836O3();
        ((VoiceVirtualUserCardMiddleView) this.viewModel).m78754b();
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        m214779N3((C22421c) m213811F2().GiftWallDialogEvent.updateLightedGifts().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.lkp0
            @Override // p153l.y20
            public final void call(Object obj) {
                mkp0.m158816l4(this.f132493a, (pf60) obj);
            }
        }));
    }

    @Override // p153l.atm0
    /* JADX INFO: renamed from: j4 */
    public void mo100222j4(@Nullable vak0 data) {
        super.mo100222j4(data);
        ((VoiceVirtualUserCardMiddleView) this.viewModel).m78755c(data);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m158817m4(@NotNull String jumpScheme, boolean needDismissMyself) {
        jumpScheme.getClass();
        if (TextUtils.isEmpty(jumpScheme)) {
            return;
        }
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(jumpScheme).m103152c());
        if (needDismissMyself) {
            m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m158818n4() {
        m213811F2().VoiceAuctionEvent.openAuctionRelationCardDlg().mo199273j(m100217f4().f56859id);
        m213811F2().OpenUserCardDialogEvent.dismiss().m199277p();
    }

    /* JADX INFO: renamed from: o4 */
    public final void m158819o4(@NotNull String userId) {
        userId.getClass();
        i4g0.m138520r("e_audio_contribution_entrance", "p_audio_profile");
        m213811F2().VirtualCompanionEvent.show().mo199273j(new yn5(1, userId));
    }

    /* JADX INFO: renamed from: p4 */
    public final void m158820p4(@NotNull BLiveVoiceUserProfileMiddleCardType type) {
        type.getClass();
        if (TEnum.equals(type, "giftWall")) {
            String str = m100217f4().f56859id;
            str.getClass();
            jkp0.m145871b(str);
        } else if (TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.companyBoard)) {
            String str2 = m100217f4().f56859id;
            str2.getClass();
            jkp0.m145870a(str2);
        } else if (TEnum.equals(type, "sweetCp")) {
            jkp0.m145874e();
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m158821q4(@NotNull BLiveVoiceUserProfileMiddleCardType type) {
        type.getClass();
        if (TEnum.equals(type, "giftWall")) {
            String str = m100217f4().f56859id;
            str.getClass();
            jkp0.m145879j(str);
        } else if (TEnum.equals(type, BLiveVoiceUserProfileMiddleCardType.companyBoard)) {
            String str2 = m100217f4().f56859id;
            str2.getClass();
            jkp0.m145878i(str2);
        } else if (TEnum.equals(type, "sweetCp")) {
            jkp0.m145880k();
        }
    }
}
