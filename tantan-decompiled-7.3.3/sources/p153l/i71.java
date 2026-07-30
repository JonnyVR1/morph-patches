package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceLiveAuctionMsg;
import com.p051p1.mobile.putong.data.Meta;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class i71 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public kcg0 f113216i;

    /* JADX INFO: renamed from: j */
    public C22507a<BLiveVoiceAuction> f113217j;

    /* JADX INFO: renamed from: k */
    public b71 f113218k;

    public i71(dum dumVar, C22507a<BLiveVoiceAuction> c22507a) {
        super(dumVar);
        this.f113217j = c22507a;
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m138892O3(DialogInterface dialogInterface) {
        m138896T3();
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m138893P3(Long l2) {
        if (l2.longValue() >= 1) {
            m138896T3();
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m138894R3(Meta meta) {
        m213811F2().VoiceAuctionEvent.refreshAuction().m199277p();
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ void m138895S3(LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose voiceLiveAuctionPledgeChoose) {
        if (TextUtils.equals(voiceLiveAuctionPledgeChoose.getAuctionId(), this.f113217j.m222761e().f45330id)) {
            m138897U3(voiceLiveAuctionPledgeChoose.getPledgeAName(), voiceLiveAuctionPledgeChoose.getPledgeBName());
        }
    }

    /* JADX INFO: renamed from: T3 */
    public final void m138896T3() {
        m138899W3();
        b71 b71Var = this.f113218k;
        if (b71Var != null) {
            b71Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: U3 */
    public void m138897U3(String str, String str2) {
        if (this.f113218k == null) {
            b71 b71Var = new b71(this);
            this.f113218k = b71Var;
            b71Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.e71
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f92384a.m138892O3(dialogInterface);
                }
            });
        }
        this.f113218k.m102815u0(str, str2, new y20() { // from class: l.f71
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97476a.m138900X3((Boolean) obj);
            }
        });
        m138898V3();
    }

    /* JADX INFO: renamed from: V3 */
    public void m138898V3() {
        m138899W3();
        this.f113216i = C22421c.interval(0L, 1L, TimeUnit.MINUTES).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.h71
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108076a.m138893P3((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void m138899W3() {
        psd0.m173633z(this.f113216i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X3 */
    public final void m138900X3(Boolean bool) {
        m138896T3();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("choose", bool.booleanValue() ? "a" : "b");
        duringCreated(w61.m205031P(((rwn0) m213810E2()).m202194o(), this.f113217j.m222761e().f45330id, "choosePledge", jsonObject.toString())).subscribe(dhw.m115825d(new y20() { // from class: l.g71
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102502a.m138894R3((Meta) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).f148282z.m170284r().f71723h2).subscribe(dhw.m115829h(new y20() { // from class: l.d71
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85438a.m138895S3((LongLinkVoiceLiveAuctionMsg.VoiceLiveAuctionPledgeChoose) obj);
            }
        }));
    }
}
