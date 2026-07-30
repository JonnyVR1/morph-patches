package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class hx60 {

    /* JADX INFO: renamed from: a */
    public long f109832a = -1;

    /* JADX INFO: renamed from: b */
    public hf00 f109833b;

    /* JADX INFO: renamed from: c */
    public PhotoAlbumBaseFrag f109834c;

    public hx60(PhotoAlbumBaseFrag photoAlbumBaseFrag) {
        this.f109834c = photoAlbumBaseFrag;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo64506A();

    /* JADX INFO: renamed from: B */
    public C22306c<roj0> m133301B(Moment moment, String str) {
        return FeedModule.f38855d.m209536qd(moment.f56011id, moment.owner, str, "moment");
    }

    /* JADX INFO: renamed from: i */
    public C22306c<MomentMessage> mo133302i(String str, MomentMessage momentMessage) {
        return FeedModule.f38855d.m209327N6(str, momentMessage);
    }

    /* JADX INFO: renamed from: j */
    public List<MomentMessage> mo133303j(Moment moment) {
        return FeedModule.f38855d.m209334O6(moment);
    }

    /* JADX INFO: renamed from: k */
    public C22306c<roj0> mo133304k(Moment moment) {
        return FeedModule.f38855d.m209362S6(moment);
    }

    /* JADX INFO: renamed from: l */
    public C22306c<roj0> m133305l(String str, String str2, MomentMessage momentMessage) {
        return FeedModule.f38855d.m209425b7(str, str2, momentMessage);
    }

    /* JADX INFO: renamed from: m */
    public User mo133306m(String str) {
        return FeedModule.f38855d.m209447e8(str);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo133307n(Links links) {
        return (links == null || TextUtils.isEmpty(links.next)) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public void mo64519o() {
        mo64506A();
        this.f109834c.duringCreated(FeedModule.f38855d.f193053l0).subscribe(mkd0.m154955G(new e30() { // from class: l.fx60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99736a.m133309q((Map) obj);
            }
        }));
        this.f109834c.duringCreated(FeedModule.f38855d.f192979C0).subscribe(mkd0.m154955G(new e30() { // from class: l.gx60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104834a.m133310r((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public boolean m133308p() {
        return this.f109833b != null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m133309q(Map map) {
        this.f109834c.m64017X4(map);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m133310r(Map map) {
        this.f109834c.m64032m5(map);
    }

    /* JADX INFO: renamed from: s */
    public C22306c<Envelope> mo133311s(Moment moment) {
        return m133312t(moment, 0);
    }

    /* JADX INFO: renamed from: t */
    public C22306c<Envelope> m133312t(Moment moment, int i) {
        boolean z = true;
        if (i <= 0) {
            z = true ^ moment.haveLiked;
        } else if (moment.attitudeId > 0 || moment.haveLiked) {
            z = moment.haveLiked;
        }
        return FeedModule.f38855d.m209283Gb(moment.owner, moment.f56011id, z, moment.getMomentShowFrom(), i);
    }

    /* JADX INFO: renamed from: u */
    public C22306c<roj0> m133313u(String str, String str2, String str3, boolean z) {
        return FeedModule.f38855d.m209269Eb(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: v */
    public C22306c<roj0> m133314v(String str, String str2, String str3, boolean z) {
        return FeedModule.f38855d.m209297Ib(str, str2, str3, z);
    }

    /* JADX INFO: renamed from: w */
    public C22306c<j760<Links, List<MomentMessage>>> m133315w(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f38855d.m209332Nb(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: x */
    public C22306c<j760<Links, List<MomentMessage>>> m133316x(String str, String str2, String str3, String str4, String str5) {
        return FeedModule.f38855d.m209339Ob(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: y */
    public Moment mo133317y(String str) {
        return FeedModule.f38855d.f193047i0.get(str);
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo64520z();
}
