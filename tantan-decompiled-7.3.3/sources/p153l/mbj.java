package p153l;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.data.DoublePair;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class mbj {

    /* JADX INFO: renamed from: a */
    public fmj f135727a;

    /* JADX INFO: renamed from: b */
    public DoublePair f135728b;

    /* JADX INFO: renamed from: c */
    public String f135729c;

    /* JADX INFO: renamed from: d */
    public PhotoAlbumFeedFrag f135730d;

    public mbj(PhotoAlbumFeedFrag photoAlbumFeedFrag) {
        this.f135730d = photoAlbumFeedFrag;
        this.f135727a = fmj.m126236c(photoAlbumFeedFrag, true);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m157786b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m157788d() {
        m157791g();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m157789e(User user) {
        DoublePair momentRoamLatitudeAndLongitude = user.getMomentRoamLatitudeAndLongitude();
        if (momentRoamLatitudeAndLongitude != null && momentRoamLatitudeAndLongitude.first != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && momentRoamLatitudeAndLongitude.second != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            DoublePair doublePair = this.f135728b;
            if (doublePair == null || !doublePair.equals(momentRoamLatitudeAndLongitude)) {
                this.f135728b = momentRoamLatitudeAndLongitude;
                m157792h(momentRoamLatitudeAndLongitude.first, momentRoamLatitudeAndLongitude.second);
                return;
            }
            return;
        }
        if (!NullChecker.m82486a(user.location) || !NullChecker.m82486a(user.location.region) || TextUtils.isEmpty(user.location.region.city) || TextUtils.equals(this.f135729c, user.location.region.city)) {
            return;
        }
        if (!TextUtils.isEmpty(this.f135729c)) {
            this.f135730d.m65559Y4();
        }
        this.f135729c = user.location.region.city;
        nyh.m165324a().m165326b(this.f135729c);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m157790f(z80 z80Var) {
        if (z80Var == null) {
            return;
        }
        String strMo143670b = z80Var.mo143670b();
        if (TextUtils.isEmpty(strMo143670b) || TextUtils.equals(strMo143670b, this.f135729c)) {
            return;
        }
        this.f135729c = strMo143670b;
        nyh.m165324a().m165326b(this.f135729c);
        this.f135730d.m65559Y4();
    }

    /* JADX INFO: renamed from: g */
    public final void m157791g() {
        PhotoAlbumFeedFrag photoAlbumFeedFrag = this.f135730d;
        if (photoAlbumFeedFrag == null) {
            return;
        }
        photoAlbumFeedFrag.duringCreated(mrb0.m159624B()).subscribe(psd0.m173596G(new y20() { // from class: l.jbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119938a.m157789e((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final void m157792h(double d, double d2) {
        fmj fmjVar = this.f135727a;
        if (fmjVar == null) {
            return;
        }
        fmjVar.m126237b(d, d2).subscribe(psd0.m173600K(new y20() { // from class: l.kbj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124956a.m157790f((z80) obj);
            }
        }, new y20() { // from class: l.lbj
            @Override // p153l.y20
            public final void call(Object obj) {
                mbj.m157786b((Throwable) obj);
            }
        }, false));
    }
}
