package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import java.util.Map;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public abstract class hx60 {

    /* JADX INFO: renamed from: a */
    public long f8834a = -1;

    /* JADX INFO: renamed from: b */
    public hf00 f8835b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f8836c;

    public hx60(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f8836c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo5597A();

    /* JADX INFO: renamed from: B */
    public c<roj0> m10736B(Moment moment, String str) {
        return FeedModule.f316d.m16717qd(((DbObject) moment).id, moment.owner, str, "moment");
    }

    /* JADX INFO: renamed from: i */
    public c<MomentMessage> mo10737i(String str, MomentMessage momentMessage) {
        return FeedModule.f316d.m16508N6(str, momentMessage);
    }

    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo10738j(Moment moment) {
        return FeedModule.f316d.m16515O6(moment);
    }

    /* JADX INFO: renamed from: k */
    public c<roj0> mo10739k(Moment moment) {
        return FeedModule.f316d.m16543S6(moment);
    }

    /* JADX INFO: renamed from: l */
    public c<roj0> m10740l(String str, String str2, MomentMessage momentMessage) {
        return FeedModule.f316d.m16606b7(str, str2, momentMessage);
    }

    /* JADX INFO: renamed from: m */
    public User mo10741m(String str) {
        return FeedModule.f316d.m16628e8(str);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo10742n(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public void mo5610o() {
        mo5597A();
        this.f8836c.duringCreated(FeedModule.f316d.f14988l0).subscribe(mkd0.G(new e30() { // from class: l.fx60
            public final void call(Object obj) {
                this.f8268a.m10744q((Map) obj);
            }
        }));
        this.f8836c.duringCreated(FeedModule.f316d.f14914C0).subscribe(mkd0.G(new e30() { // from class: l.gx60
            public final void call(Object obj) {
                this.f8533a.m10745r((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public boolean m10743p() {
        return this.f8835b != null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10744q(Map map) {
        this.f8836c.m5060X4(map);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10745r(Map map) {
        this.f8836c.m5077m5(map);
    }

    /* JADX INFO: renamed from: s */
    public c<Envelope> mo10746s(Moment moment) {
        return m10747t(moment, 0);
    }

    /* JADX INFO: renamed from: t */
    public c<Envelope> m10747t(Moment moment, int i) {
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        return FeedModule.f316d.m16464Gb(moment.owner, ((DbObject) moment).id, z, moment.getMomentShowFrom(), i);
    }

    /* JADX INFO: renamed from: u */
    public c<roj0> m10748u(String str, String str2, String str3, boolean z) {
        return FeedModule.f316d.m16450Eb(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: v */
    public c<roj0> m10749v(String str, String str2, String str3, boolean z) {
        return FeedModule.f316d.m16478Ib(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: w */
    public c<j760<Links, List<MomentMessage>>> m10750w(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f316d.m16513Nb(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: x */
    public c<j760<Links, List<MomentMessage>>> m10751x(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f316d.m16520Ob(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: y */
    public Moment mo10752y(String str) {
        return FeedModule.f316d.f14982i0.get(str);
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo5611z();
}
