package p149l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.DoublePair;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class s8j {

    /* JADX INFO: renamed from: a */
    public mjj f163073a;

    /* JADX INFO: renamed from: b */
    public DoublePair f163074b;

    /* JADX INFO: renamed from: c */
    public String f163075c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f163076d;

    public s8j(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f163076d = photoAlbumFeedFrag;
        this.f163073a = mjj.m154842c(photoAlbumFeedFrag, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m182650b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m182652d() {
        m182655g();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m182653e(User user) {
        DoublePair momentRoamLatitudeAndLongitude = user.getMomentRoamLatitudeAndLongitude();
        if (momentRoamLatitudeAndLongitude != null && momentRoamLatitudeAndLongitude.first != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && momentRoamLatitudeAndLongitude.second != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            DoublePair doublePair = this.f163074b;
            if (doublePair == null || !doublePair.equals(momentRoamLatitudeAndLongitude)) {
                this.f163074b = momentRoamLatitudeAndLongitude;
                m182656h(momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second);
                return;
            }
            return;
        }
        if (!NullChecker.m81303a(user.location) || !NullChecker.m81303a(user.location.region) || TextUtils.isEmpty(user.location.region.city) || TextUtils.equals(this.f163075c, user.location.region.city)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f163075c)) {
            this.f163076d.m64376Y4();
        }
        this.f163075c = user.location.region.city;
        ywh.m216393a().m216395b(this.f163075c);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m182654f(d90 d90Var) {
        if (d90Var == null) {
            return;
        }
        String strMo110405b = d90Var.mo110405b();
        if (TextUtils.isEmpty(strMo110405b) || TextUtils.equals(strMo110405b, this.f163075c)) {
            return;
        }
        this.f163075c = strMo110405b;
        ywh.m216393a().m216395b(this.f163075c);
        this.f163076d.m64376Y4();
    }

    /* JADX INFO: renamed from: g */
    public final void m182655g() {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f163076d;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(ijb0.m136538B()).subscribe(mkd0.m154955G(new e30() { // from class: l.p8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147609a.m182653e((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final void m182656h(double d, double d2) {
        mjj mjjVar = this.f163073a;
        if (mjjVar == null) {
            return;
        }
        mjjVar.m154843b(d, d2).subscribe(mkd0.m154959K(new e30() { // from class: l.q8j
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153195a.m182654f((d90) obj);
            }
        }, new e30() { // from class: l.r8j
            @Override // p149l.e30
            public final void call(Object obj) {
                s8j.m182650b((Throwable) obj);
            }
        }, false));
    }
}
