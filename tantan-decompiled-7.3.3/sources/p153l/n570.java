package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class n570 {

    /* JADX INFO: renamed from: a */
    public long f140314a = -1;

    /* JADX INFO: renamed from: b */
    public qn00 f140315b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f140316c;

    public n570(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f140316c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo65689A();

    /* JADX INFO: renamed from: B */
    public C22421c<uxj0> m161685B(Moment moment, String str) {
        return FeedModule.f39703d.m145777qd(moment.f56859id, moment.owner, str, "moment");
    }

    /* JADX INFO: renamed from: i */
    public C22421c<MomentMessage> mo137267i(String str, MomentMessage momentMessage) {
        return FeedModule.f39703d.m145568N6(str, momentMessage);
    }

    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo137268j(Moment moment) {
        return FeedModule.f39703d.m145575O6(moment);
    }

    /* JADX INFO: renamed from: k */
    public C22421c<uxj0> mo137269k(Moment moment) {
        return FeedModule.f39703d.m145603S6(moment);
    }

    /* JADX INFO: renamed from: l */
    public C22421c<uxj0> m161686l(String str, String str2, MomentMessage momentMessage) {
        return FeedModule.f39703d.m145666b7(str, str2, momentMessage);
    }

    /* JADX INFO: renamed from: m */
    public User mo137270m(String str) {
        return FeedModule.f39703d.m145688e8(str);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo149058n(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public void mo65702o() {
        mo65689A();
        this.f140316c.duringCreated(FeedModule.f39703d.f121363l0).subscribe(psd0.m173596G(new y20() { // from class: l.l570
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130083a.m161688q((Map) obj);
            }
        }));
        this.f140316c.duringCreated(FeedModule.f39703d.f121289C0).subscribe(psd0.m173596G(new y20() { // from class: l.m570
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134877a.m161689r((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public boolean m161687p() {
        return this.f140315b != null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m161688q(Map map) {
        this.f140316c.m65200X4(map);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m161689r(Map map) {
        this.f140316c.m65215m5(map);
    }

    /* JADX INFO: renamed from: s */
    public C22421c<Envelope> mo137271s(Moment moment) {
        return m161690t(moment, 0);
    }

    /* JADX INFO: renamed from: t */
    public C22421c<Envelope> m161690t(Moment moment, int i) {
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        return FeedModule.f39703d.m145524Gb(moment.owner, moment.f56859id, z, moment.getMomentShowFrom(), i);
    }

    /* JADX INFO: renamed from: u */
    public C22421c<uxj0> m161691u(String str, String str2, String str3, boolean z) {
        return FeedModule.f39703d.m145510Eb(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: v */
    public C22421c<uxj0> m161692v(String str, String str2, String str3, boolean z) {
        return FeedModule.f39703d.m145538Ib(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: w */
    public C22421c<pf60<Links, List<MomentMessage>>> m161693w(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f39703d.m145573Nb(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: x */
    public C22421c<pf60<Links, List<MomentMessage>>> m161694x(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f39703d.m145580Ob(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: y */
    public Moment mo137272y(String str) {
        return FeedModule.f39703d.f121357i0.get(str);
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo65703z();
}
