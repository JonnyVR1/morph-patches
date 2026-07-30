package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class w7s extends ar2<LiveCoverAct> {

    /* JADX INFO: renamed from: a */
    public String f187781a;

    /* JADX INFO: renamed from: b */
    public Act f187782b;

    /* JADX INFO: renamed from: c */
    public String f187783c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceRoomProfile f187784d;

    /* JADX INFO: renamed from: e */
    public BLiveRoom f187785e;

    public w7s(Act act, ner nerVar) {
        super(nerVar);
        this.f187782b = act;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m205366k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m205368m0(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return C22421c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m72664i4(bLiveRoomNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m205371p0(Bundle bundle) {
        ((LiveCoverAct) this.viewModel).m76654A3(this.f187781a);
        if (TextUtils.equals(this.f187781a, "from_voice")) {
            VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(this.f187783c).subscribe(dhw.m115825d(new y20() { // from class: l.n7s
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140624a.m205377r0((BLiveExtraResponse) obj);
                }
            }));
        } else {
            duringCreated(m205376q0("", zrv.f205799a.m207651V().m61308fp())).subscribe(dhw.m115825d(new y20() { // from class: l.o7s
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145294a.m205378s0((BLiveRoom) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final void m205383z0(final String str, Picture picture) {
        if (TextUtils.equals(str, "from_voice")) {
            duringCreated(itv.m142086J(this.f187784d.roomId, picture.url)).subscribe(dhw.m115826e(new y20() { // from class: l.t7s
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f172464a.m205379t0((BLiveVoiceRoom) obj);
                }
            }, new y20() { // from class: l.u7s
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f177934a.m205380u0((Throwable) obj);
                }
            }));
            return;
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        duringCreated(LivingNormalApiProvider.m72819z6(this.f187785e.f45172id, bLiveRoomNew_)).subscribe(dhw.m115826e(new y20() { // from class: l.v7s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182798a.m205381x0(str, (BLiveRoom) obj);
            }
        }, new y20() { // from class: l.m7s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135101a.m205382y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public void m205373C0(String str, String str2) {
        this.f187783c = str;
        this.f187781a = str2;
    }

    /* JADX INFO: renamed from: D0 */
    public void m205374D0(View view) {
        this.f187782b.progress(R$string.f47661Le);
        m205375E0(this.f187781a);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m205375E0(final String str) {
        duringCreated(yb5.m214980I(jyb.m147507f0(((LiveCoverAct) this.viewModel).m76657e2()), "voice_avatar")).map(new qcj() { // from class: l.q7s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w7s.m205366k0((List) obj);
            }
        }).compose(psd0.m173592C()).subscribe(dhw.m115826e(new y20() { // from class: l.r7s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161636a.m205383z0(str, (Picture) obj);
            }
        }, new y20() { // from class: l.s7s
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165636j(xau.m209910t(R$string.f47495E2));
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.l7s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130374a.m205371p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final C22421c<BLiveRoom> m205376q0(final String str, final Picture picture) {
        return LivingNormalApiProvider.m72530T5(true, null).flatMap(new qcj() { // from class: l.p7s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return w7s.m205368m0(str, picture, (BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m205377r0(BLiveExtraResponse bLiveExtraResponse) {
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = bLiveExtraResponse.data.voiceRoomProfile;
        this.f187784d = bLiveVoiceRoomProfile;
        ((LiveCoverAct) this.viewModel).m76658l2(true, bLiveVoiceRoomProfile.coverUrl);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m205378s0(BLiveRoom bLiveRoom) {
        this.f187785e = bLiveRoom;
        LiveCoverAct liveCoverAct = (LiveCoverAct) this.viewModel;
        BLiveRoomCover bLiveRoomCover = bLiveRoom.cover;
        liveCoverAct.m76658l2(true, bLiveRoomCover != null ? bLiveRoomCover.media.url : "");
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m205379t0(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f187782b.progressDismiss();
        this.f187782b.m68056e2();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m205380u0(Throwable th) {
        this.f187782b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            yvr.m217557c(th);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m205381x0(String str, BLiveRoom bLiveRoom) {
        if ("from_message".equals(str)) {
            o1j0.m165651y(xau.m209910t(R$string.f47473D2));
        }
        this.f187782b.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("room_tag", bLiveRoom);
        this.f187782b.setResult(-1, intent);
        this.f187782b.m68056e2();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m205382y0(Throwable th) {
        this.f187782b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            yvr.m217557c(th);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
