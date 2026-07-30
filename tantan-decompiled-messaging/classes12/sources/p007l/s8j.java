package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.DoublePair;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import l.d90;
import l.e30;
import l.mjj;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class s8j {

    /* JADX INFO: renamed from: a */
    public mjj f12832a;

    /* JADX INFO: renamed from: b */
    public DoublePair f12833b;

    /* JADX INFO: renamed from: c */
    public String f12834c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f12835d;

    public s8j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f12835d = photoAlbumFeedFrag;
        this.f12832a = mjj.c(photoAlbumFeedFrag, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14110b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m14112d() {
        m14115g();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m14113e(User user) {
        DoublePair momentRoamLatitudeAndLongitude = user.getMomentRoamLatitudeAndLongitude();
        if (momentRoamLatitudeAndLongitude != null && momentRoamLatitudeAndLongitude.first != 0.0d && momentRoamLatitudeAndLongitude.second != 0.0d) {
            DoublePair doublePair = this.f12833b;
            if (doublePair == null || !doublePair.equals(momentRoamLatitudeAndLongitude)) {
                this.f12833b = momentRoamLatitudeAndLongitude;
                m14116h(momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second);
                return;
            }
            return;
        }
        if (!NullChecker.a(user.location) || !NullChecker.a(user.location.region) || TextUtils.isEmpty(user.location.region.city) || TextUtils.equals(this.f12834c, user.location.region.city)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f12834c)) {
            this.f12835d.m5450Y4();
        }
        this.f12834c = user.location.region.city;
        ywh.m17195a().m17197b(this.f12834c);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m14114f(d90 d90Var) {
        if (d90Var == null) {
            return;
        }
        String strB = d90Var.b();
        if (TextUtils.isEmpty(strB) || TextUtils.equals(strB, this.f12834c)) {
            return;
        }
        this.f12834c = strB;
        ywh.m17195a().m17197b(this.f12834c);
        this.f12835d.m5450Y4();
    }

    /* JADX INFO: renamed from: g */
    public final void m14115g() {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f12835d;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(ijb0.m10891B()).subscribe(mkd0.G(new e30() { // from class: l.p8j
            public final void call(Object obj) {
                this.f11731a.m14113e((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final void m14116h(double d, double d2) {
        mjj mjjVar = this.f12832a;
        if (mjjVar == null) {
            return;
        }
        mjjVar.d(d, d2).subscribe(mkd0.K(new e30() { // from class: l.q8j
            public final void call(Object obj) {
                this.f12154a.m14114f((d90) obj);
            }
        }, new e30() { // from class: l.r8j
            public final void call(Object obj) {
                s8j.m14110b((Throwable) obj);
            }
        }, false));
    }
}
