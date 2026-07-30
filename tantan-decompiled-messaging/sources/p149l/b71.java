package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p046p1.mobile.putong.data.Meta;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class b71 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public c4g0 f73895i;

    /* JADX INFO: renamed from: j */
    public C22392a<BLiveVoiceAuction> f73896j;

    /* JADX INFO: renamed from: k */
    public u61 f73897k;

    public b71(bsm bsmVar, C22392a<BLiveVoiceAuction> c22392a) {
        super(bsmVar);
        this.f73896j = c22392a;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m100487O3(DialogInterface dialogInterface) {
        m100491T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m100488P3(Long l2) {
        if (l2.longValue() >= 1) {
            m100491T3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m100489R3(Meta meta) {
        m206028F2().VoiceAuctionEvent.refreshAuction().m172467p();
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m100490S3(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
        if (TextUtils.equals(voiceLiveAuctionPledgeChoose.getAuctionId(), this.f73896j.m221515e().f44482id)) {
            m100492U3(voiceLiveAuctionPledgeChoose.getPledgeAName(), voiceLiveAuctionPledgeChoose.getPledgeBName());
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m100491T3() {
        m100494W3();
        u61 u61Var = this.f73897k;
        if (u61Var != null) {
            u61Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m100492U3(String str, String str2) {
        if (this.f73897k == null) {
            u61 u61Var = new u61(this);
            this.f73897k = u61Var;
            u61Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x61
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f191209a.m100487O3(dialogInterface);
                }
            });
        }
        this.f73897k.m191898u0(str, str2, new e30() { // from class: l.y61
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196504a.m100495X3((Boolean) obj);
            }
        });
        m100493V3();
    }

    /* JADX INFO: renamed from: V3 */
    public void m100493V3() {
        m100494W3();
        this.f73895i = C22306c.interval(0L, 1L, TimeUnit.MINUTES).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.a71
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67832a.m100488P3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void m100494W3() {
        mkd0.m154992z(this.f73895i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m100495X3(Boolean bool) {
        m100491T3();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("choose", bool.booleanValue() ? "a" : "b");
        duringCreated(p61.m167532P(((nnn0) m206027E2()).m149818o(), this.f73896j.m221515e().f44482id, "choosePledge", jsonObject.toString())).subscribe(ffw.m121193d(new e30() { // from class: l.z61
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201882a.m100489R3((Meta) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).f108769z.m181789r().f170456h2).subscribe(ffw.m121197h(new e30() { // from class: l.w61
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184803a.m100490S3((LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose) obj);
            }
        }));
    }
}
