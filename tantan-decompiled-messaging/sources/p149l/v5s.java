package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class v5s extends jq2<LiveCoverAct> {

    /* JADX INFO: renamed from: a */
    public String f180107a;

    /* JADX INFO: renamed from: b */
    public Act f180108b;

    /* JADX INFO: renamed from: c */
    public String f180109c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceRoomProfile f180110d;

    /* JADX INFO: renamed from: e */
    public BLiveRoom f180111e;

    public v5s(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f180108b = act;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m197160k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m197162m0(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return C22306c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        bLiveRoomNew_.title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m71481i4(bLiveRoomNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m197165p0(Bundle bundle) {
        ((LiveCoverAct) this.viewModel).m75471A3(this.f180107a);
        if (TextUtils.equals(this.f180107a, "from_voice")) {
            VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(this.f180109c).subscribe(ffw.m121193d(new e30() { // from class: l.m5s
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f131415a.m197171r0((BLiveExtraResponse) obj);
                }
            }));
        } else {
            duringCreated(m197170q0("", ypv.f199493a.m199329V().m60124fp())).subscribe(ffw.m121193d(new e30() { // from class: l.n5s
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137231a.m197172s0((BLiveRoom) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final void m197177z0(final String str, Picture picture) {
        if (TextUtils.equals(str, "from_voice")) {
            duringCreated(hrv.m132727J(this.f180110d.roomId, picture.url)).subscribe(ffw.m121194e(new e30() { // from class: l.s5s
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f162582a.m197173t0((BLiveVoiceRoom) obj);
                }
            }, new e30() { // from class: l.t5s
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f167847a.m197174u0((Throwable) obj);
                }
            }));
            return;
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        bLiveRoomNew_.cover = bLiveRoomCoverNew_;
        duringCreated(LivingNormalApiProvider.m71636z6(this.f180111e.f44324id, bLiveRoomNew_)).subscribe(ffw.m121194e(new e30() { // from class: l.u5s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174752a.m197175x0(str, (BLiveRoom) obj);
            }
        }, new e30() { // from class: l.l5s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126197a.m197176y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public void m197167C0(String str, String str2) {
        this.f180109c = str;
        this.f180107a = str2;
    }

    /* JADX INFO: renamed from: D0 */
    public void m197168D0(View view) {
        this.f180108b.progress(R$string.f46813Le);
        m197169E0(this.f180107a);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m197169E0(final String str) {
        duringCreated(ya5.m213793I(vwb.m200324f0(((LiveCoverAct) this.viewModel).m75474d2()), "voice_avatar")).map(new w9j() { // from class: l.p5s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v5s.m197160k0((List) obj);
            }
        }).compose(mkd0.m154951C()).subscribe(ffw.m121194e(new e30() { // from class: l.q5s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152820a.m197177z0(str, (Picture) obj);
            }
        }, new e30() { // from class: l.r5s
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151580j(w8u.m202217t(R$string.f46647E2));
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.k5s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121222a.m197165p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final C22306c<BLiveRoom> m197170q0(final String str, final Picture picture) {
        return LivingNormalApiProvider.m71347T5(true, null).flatMap(new w9j() { // from class: l.o5s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v5s.m197162m0(str, picture, (BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m197171r0(BLiveExtraResponse bLiveExtraResponse) {
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = bLiveExtraResponse.data.voiceRoomProfile;
        this.f180110d = bLiveVoiceRoomProfile;
        ((LiveCoverAct) this.viewModel).m75475k2(true, bLiveVoiceRoomProfile.coverUrl);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m197172s0(BLiveRoom bLiveRoom) {
        this.f180111e = bLiveRoom;
        LiveCoverAct liveCoverAct = (LiveCoverAct) this.viewModel;
        BLiveRoomCover bLiveRoomCover = bLiveRoom.cover;
        liveCoverAct.m75475k2(true, bLiveRoomCover != null ? bLiveRoomCover.media.url : "");
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m197173t0(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f180108b.progressDismiss();
        this.f180108b.m66873d2();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m197174u0(Throwable th) {
        this.f180108b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            xtr.m211023c(th);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m197175x0(String str, BLiveRoom bLiveRoom) {
        if ("from_message".equals(str)) {
            lsi0.m151595y(w8u.m202217t(R$string.f46625D2));
        }
        this.f180108b.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("room_tag", bLiveRoom);
        this.f180108b.setResult(-1, intent);
        this.f180108b.m66873d2();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m197176y0(Throwable th) {
        this.f180108b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            xtr.m211023c(th);
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
