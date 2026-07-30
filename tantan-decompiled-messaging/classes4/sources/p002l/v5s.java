package p002l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.other.livecover.LiveCoverAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveRoom;
import com.p1.mobile.putong.live.base.data.BLiveRoomCover;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoomProfile;
import com.p1.mobile.putong.live.livingroom.virtual.api.VirtualVoiceRoomApiProvider;
import java.io.Serializable;
import java.util.List;
import l.e30;
import l.ffw;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xtr;
import l.ya5;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v5s extends jq2<LiveCoverAct> {

    /* JADX INFO: renamed from: a */
    public String f20988a;

    /* JADX INFO: renamed from: b */
    public Act f20989b;

    /* JADX INFO: renamed from: c */
    public String f20990c;

    /* JADX INFO: renamed from: d */
    public BLiveVoiceRoomProfile f20991d;

    /* JADX INFO: renamed from: e */
    public BLiveRoom f20992e;

    public v5s(Act act, mcr mcrVar) {
        super(mcrVar);
        this.f20989b = act;
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ Picture m23760k0(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ c m23762m0(String str, Picture picture, BLiveRoom bLiveRoom) {
        if (!BLiveRoom.EMPTY.equals(bLiveRoom)) {
            return c.just(bLiveRoom);
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        ((BLiveAbsRoom) bLiveRoomNew_).title = str;
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        ((BLiveAbsRoom) bLiveRoomNew_).cover = bLiveRoomCoverNew_;
        return LivingNormalApiProvider.m4847i4(bLiveRoomNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m23765p0(Bundle bundle) {
        ((LiveCoverAct) ((jq2) this).viewModel).m9104A3(this.f20988a);
        if (TextUtils.equals(this.f20988a, "from_voice")) {
            VirtualVoiceRoomApiProvider.getVirtualVoiceRoomInfo(this.f20990c).subscribe(ffw.d(new e30() { // from class: l.m5s
                public final void call(Object obj) {
                    this.f15243a.m23772r0((BLiveExtraResponse) obj);
                }
            }));
        } else {
            duringCreated(m23771q0("", ypv.a.V().fp())).subscribe(ffw.d(new e30() { // from class: l.n5s
                public final void call(Object obj) {
                    this.f15832a.m23773s0((BLiveRoom) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final void m23778z0(final String str, Picture picture) {
        if (TextUtils.equals(str, "from_voice")) {
            duringCreated(hrv.m14763J(this.f20991d.roomId, ((Media) picture).url)).subscribe(ffw.e(new e30() { // from class: l.s5s
                public final void call(Object obj) {
                    this.f18803a.m23774t0((BLiveVoiceRoom) obj);
                }
            }, new e30() { // from class: l.t5s
                public final void call(Object obj) {
                    this.f19429a.m23775u0((Throwable) obj);
                }
            }));
            return;
        }
        BLiveRoom bLiveRoomNew_ = BLiveRoom.new_();
        BLiveRoomCover bLiveRoomCoverNew_ = BLiveRoomCover.new_();
        bLiveRoomCoverNew_.media = picture;
        ((BLiveAbsRoom) bLiveRoomNew_).cover = bLiveRoomCoverNew_;
        duringCreated(LivingNormalApiProvider.m5002z6(((BLiveAbsRoom) this.f20992e).id, bLiveRoomNew_)).subscribe(ffw.e(new e30() { // from class: l.u5s
            public final void call(Object obj) {
                this.f20499a.m23776x0(str, (BLiveRoom) obj);
            }
        }, new e30() { // from class: l.l5s
            public final void call(Object obj) {
                this.f14679a.m23777y0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: C0 */
    public void m23767C0(String str, String str2) {
        this.f20990c = str;
        this.f20988a = str2;
    }

    /* JADX INFO: renamed from: D0 */
    public void m23768D0(View view) {
        this.f20989b.progress(R$string.f2855Le);
        m23769E0(this.f20988a);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m23769E0(final String str) {
        duringCreated(ya5.I(vwb.f0(new Media[]{((LiveCoverAct) ((jq2) this).viewModel).m9108d2()}), "voice_avatar")).map(new w9j() { // from class: l.p5s
            public final Object call(Object obj) {
                return v5s.m23760k0((List) obj);
            }
        }).compose(mkd0.C()).subscribe(ffw.e(new e30() { // from class: l.q5s
            public final void call(Object obj) {
                this.f17818a.m23778z0(str, (Picture) obj);
            }
        }, new e30() { // from class: l.r5s
            public final void call(Object obj) {
                lsi0.j(w8u.t(R$string.f2689E2));
            }
        }));
    }

    /* JADX INFO: renamed from: a0 */
    public void m23770a0() {
        creates(new e30() { // from class: l.k5s
            public final void call(Object obj) {
                this.f14206a.m23765p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q0 */
    public final c<BLiveRoom> m23771q0(final String str, final Picture picture) {
        return LivingNormalApiProvider.m4713T5(true, null).flatMap(new w9j() { // from class: l.o5s
            public final Object call(Object obj) {
                return v5s.m23762m0(str, picture, (BLiveRoom) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m23772r0(BLiveExtraResponse bLiveExtraResponse) {
        BLiveVoiceRoomProfile bLiveVoiceRoomProfile = bLiveExtraResponse.data.voiceRoomProfile;
        this.f20991d = bLiveVoiceRoomProfile;
        ((LiveCoverAct) ((jq2) this).viewModel).m9110k2(true, bLiveVoiceRoomProfile.coverUrl);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m23773s0(BLiveRoom bLiveRoom) {
        this.f20992e = bLiveRoom;
        LiveCoverAct liveCoverAct = (LiveCoverAct) ((jq2) this).viewModel;
        BLiveRoomCover bLiveRoomCover = ((BLiveAbsRoom) bLiveRoom).cover;
        liveCoverAct.m9110k2(true, bLiveRoomCover != null ? ((Media) bLiveRoomCover.media).url : "");
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m23774t0(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f20989b.progressDismiss();
        this.f20989b.finish();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m23775u0(Throwable th) {
        this.f20989b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            xtr.c(th);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m23776x0(String str, BLiveRoom bLiveRoom) {
        if ("from_message".equals(str)) {
            lsi0.y(w8u.t(R$string.f2667D2));
        }
        this.f20989b.progressDismiss();
        Intent intent = new Intent();
        intent.putExtra("room_tag", (Serializable) bLiveRoom);
        this.f20989b.setResult(-1, intent);
        this.f20989b.finish();
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m23777y0(Throwable th) {
        this.f20989b.progressDismiss();
        if (th instanceof TantanException.Client.CoreService) {
            xtr.c(th);
        }
    }

    public void destroy() {
    }
}
