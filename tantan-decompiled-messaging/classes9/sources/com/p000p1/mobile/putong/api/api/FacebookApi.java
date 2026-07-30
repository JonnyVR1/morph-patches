package com.p000p1.mobile.putong.api.api;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.e;
import com.p000p1.mobile.putong.api.api.FacebookApi;
import com.p000p1.mobile.putong.common.R$string;
import com.p1.mobile.putong.data.FBAlbum;
import com.p1.mobile.putong.data.FBAlbums;
import com.p1.mobile.putong.data.FBPicture;
import com.p1.mobile.putong.data.FBPictures;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.bzv;
import l.du2;
import l.e30;
import l.iti;
import l.lsi0;
import l.mkd0;
import l.q860;
import l.roj0;
import l.vwb;
import l.w9j;
import p006l.qib0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FacebookApi {

    /* JADX INFO: renamed from: d */
    public static final List<String> f1141d = vwb.f0(new String[]{"user_birthday", "user_hometown", "user_photos", "user_location", "email", "user_gender"});

    /* JADX INFO: renamed from: e */
    public static final List<String> f1142e = vwb.f0(new String[]{"user_photos"});

    /* JADX INFO: renamed from: a */
    public Map<String, c> f1143a = new HashMap();

    /* JADX INFO: renamed from: b */
    public a<q860<iti>> f1144b = a.b();

    /* JADX INFO: renamed from: c */
    public a<q860<Media>> f1145c = a.b();

    public static class FBApiException extends Throwable {
        public static int PERMISSION_DENIED = 10;
        public static int TOKEN_EXPIRED = 190;
        FacebookRequestError error;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1426b(JsonAdapter jsonAdapter, e30 e30Var, String str, Bundle bundle, e30 e30Var2, GraphResponse graphResponse) {
        if (graphResponse.b() != null) {
            if (e30Var2 != null) {
                FBApiException fBApiException = new FBApiException();
                fBApiException.error = graphResponse.b();
                e30Var2.call(fBApiException);
            }
            du2.a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.b());
            return;
        }
        try {
            Object obj = jsonAdapter.parse(graphResponse.e());
            if (e30Var != null) {
                e30Var.call(obj);
            }
            du2.a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + "]");
        } catch (IOException e) {
            CrashHelper.c(e);
            if (e30Var2 != null) {
                e30Var2.call(e);
            } else {
                m1436m(e);
            }
            du2.a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m1429e(e30 e30Var, e eVar) {
        if (e30Var != null) {
            e30Var.call(eVar);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m1432h(e30 e30Var, FBPicture fBPicture) {
        Picture picture = new Picture();
        ((Media) picture).url = fBPicture.thumbnail;
        ((Media) picture).mediaType = "image/*";
        ((Media) picture).status = MediaLocalStatus.get("raw");
        if (e30Var != null) {
            e30Var.call(picture);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1436m(Throwable th) {
        if (th instanceof FacebookAuthorizationException) {
            if (AccessToken.d() != null) {
                bzv.m().u();
            }
            lsi0.y(th.getMessage() + "(-1001)");
            qib0.m22159e1("fb_api_error", "code", "-1001", "message", th.getMessage());
        } else if (th instanceof FacebookException) {
            lsi0.y(th.getMessage() + "(-1002)");
            qib0.m22159e1("fb_api_error", "code", "-1002", "message", th.getMessage());
        } else {
            lsi0.y(th.getMessage() + "(-1003)");
            qib0.m22159e1("fb_api_error", "code", "-1003", "message", th.getMessage());
        }
        if (th instanceof FBApiException) {
            FBApiException fBApiException = (FBApiException) th;
            if (fBApiException.error.b() != FBApiException.TOKEN_EXPIRED && fBApiException.error.b() != FBApiException.PERMISSION_DENIED) {
                lsi0.y(fBApiException.error.c() + "(" + fBApiException.error.b() + ")");
            } else if (qib0.f19805c0.signedIn_()) {
                lsi0.h(R$string.f1294B);
                qib0.m22149Z0(false, false);
            }
            qib0.m22159e1("fb_api_error", "code", String.valueOf(fBApiException.error.b()), "message", fBApiException.error.c());
        }
    }

    /* JADX INFO: renamed from: l */
    public c<q860<iti>> m1437l() {
        this.f1144b = null;
        a<q860<iti>> aVarB = a.b();
        this.f1144b = aVarB;
        if (aVarB.e() == null || ((q860) this.f1144b.e()).a.size() == 0) {
            m1446v(false).subscribe(mkd0.H(roj0.b, new e30() { // from class: l.vtf
                public final void call(Object obj) {
                    this.f24459a.m1438n((Throwable) obj);
                }
            }));
        }
        return this.f1144b;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1438n(Throwable th) {
        this.f1144b.onError(th);
        m1436m(th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m1439o(JsonAdapter jsonAdapter, a aVar, String str, Bundle bundle, GraphResponse graphResponse) {
        if (graphResponse.b() == null) {
            try {
                aVar.onNext(jsonAdapter.parse(graphResponse.e()));
                aVar.onCompleted();
                du2.a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + "]");
            } catch (IOException e) {
                CrashHelper.c(e);
                aVar.onError(e);
                du2.a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
            }
        } else {
            FBApiException fBApiException = new FBApiException();
            fBApiException.error = graphResponse.b();
            aVar.onError(fBApiException);
            du2.a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.b());
        }
        this.f1143a.remove(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m1440p(FBAlbums fBAlbums) {
        int size = fBAlbums.data.size();
        if (size == 0) {
            this.f1144b.onNext(q860.b());
        }
        return Boolean.valueOf(size > 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1441q(boolean z, FBAlbums fBAlbums) {
        if (z) {
            return;
        }
        String str = ((FBAlbum) fBAlbums.data.get(0)).id;
        for (FBAlbum fBAlbum : fBAlbums.data) {
            if (fBAlbum.count > 0) {
                str = fBAlbum.id;
                break;
            }
        }
        m1449y(str, false).subscribe(mkd0.H(roj0.b, new e30() { // from class: l.buf
            public final void call(Object obj) {
                FacebookApi.m1436m((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ roj0 m1442r(boolean z, FBAlbums fBAlbums) {
        q860 q860VarB = z ? (q860) this.f1144b.e() : q860.b();
        q860VarB.b.links.next = fBAlbums.paging.next;
        ArrayList arrayList = new ArrayList();
        for (FBAlbum fBAlbum : fBAlbums.data) {
            final iti itiVar = new iti();
            itiVar.a = fBAlbum.name;
            itiVar.b = fBAlbum.id;
            itiVar.c = q860.b();
            int i = fBAlbum.count;
            itiVar.d = i;
            if (i > 0) {
                q860VarB.a.add(itiVar);
                arrayList.add(m1448x(fBAlbum.cover.id, new e30() { // from class: l.auf
                    public final void call(Object obj) {
                        itiVar.c.a.add((Media) obj);
                    }
                }));
            }
        }
        if (arrayList.size() > 0) {
            m1447w(arrayList, null);
        }
        this.f1144b.onNext(q860VarB);
        return roj0.a;
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ roj0 m1443s(boolean z, q860 q860Var, FBPictures fBPictures) {
        if (!z || q860Var == null) {
            q860Var = q860.b();
        }
        q860Var.b.links.next = fBPictures.paging.next;
        for (FBPicture fBPicture : fBPictures.data) {
            Picture picture = new Picture();
            ((Media) picture).url = fBPicture.source;
            ((Media) picture).mediaType = "image/*";
            ((Media) picture).status = MediaLocalStatus.get("raw");
            q860Var.a.add(picture);
        }
        this.f1145c.onNext(q860Var);
        return roj0.a;
    }

    /* JADX INFO: renamed from: t */
    public c<q860<Media>> m1444t() {
        this.f1145c = null;
        a<q860<Media>> aVarB = a.b();
        this.f1145c = aVarB;
        return aVarB;
    }

    /* JADX INFO: renamed from: u */
    public <T> c<T> m1445u(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter) {
        du2.a("[common][network]", "facebook request url = " + str + ", params = [" + bundle);
        if (this.f1143a.containsKey(str)) {
            return this.f1143a.get(str);
        }
        final c cVarB = a.b();
        this.f1143a.put(str, cVarB);
        new GraphRequest(AccessToken.d(), str, bundle, HttpMethod.GET, new GraphRequest.b() { // from class: l.wtf
            /* JADX INFO: renamed from: a */
            public final void m26766a(GraphResponse graphResponse) {
                this.f25401a.m1439o(jsonAdapter, cVarB, str, bundle, graphResponse);
            }
        }).k();
        return cVarB;
    }

    /* JADX INFO: renamed from: v */
    public c<roj0> m1446v(final boolean z) {
        String str = "/" + AccessToken.d().o() + "/albums";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,count,cover_photo");
        bundle.putInt("limit", 20);
        if (z) {
            bundle.putString("after", ((q860) this.f1144b.e()).b.links.next);
        }
        return m1445u(str, bundle, FBAlbums.JSON_ADAPTER).filter(new w9j() { // from class: l.xtf
            public final Object call(Object obj) {
                return this.f27720a.m1440p((FBAlbums) obj);
            }
        }).doOnNext(new e30() { // from class: l.ytf
            public final void call(Object obj) {
                this.f28386a.m1441q(z, (FBAlbums) obj);
            }
        }).map(new w9j() { // from class: l.ztf
            public final Object call(Object obj) {
                return this.f28975a.m1442r(z, (FBAlbums) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m1447w(List<GraphRequest> list, final e30<e> e30Var) {
        e eVar = new e(list);
        eVar.f(new e.a() { // from class: l.cuf
            /* JADX INFO: renamed from: a */
            public final void m13645a(e eVar2) {
                FacebookApi.m1429e(e30Var, eVar2);
            }
        });
        eVar.j();
    }

    /* JADX INFO: renamed from: x */
    public GraphRequest m1448x(String str, final e30<Media> e30Var) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,picture");
        return m1450z(str, bundle, FBPicture.JSON_ADAPTER, new e30() { // from class: l.duf
            public final void call(Object obj) {
                FacebookApi.m1432h(e30Var, (FBPicture) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: y */
    public c<roj0> m1449y(String str, final boolean z) {
        String str2 = "/" + str + "/photos";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,source,picture");
        bundle.putInt("limit", 20);
        final q860 q860Var = (q860) this.f1145c.e();
        if (z && q860Var != null) {
            bundle.putString("after", q860Var.b.links.next);
        }
        return m1445u(str2, bundle, FBPictures.JSON_ADAPTER).map(new w9j() { // from class: l.ttf
            public final Object call(Object obj) {
                return this.f22270a.m1443s(z, q860Var, (FBPictures) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public <T> GraphRequest m1450z(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter, final e30<T> e30Var, final e30<Throwable> e30Var2) {
        return new GraphRequest(AccessToken.d(), str, bundle, HttpMethod.GET, new GraphRequest.b() { // from class: l.utf
            /* JADX INFO: renamed from: a */
            public final void m25562a(GraphResponse graphResponse) {
                FacebookApi.m1426b(jsonAdapter, e30Var, str, bundle, e30Var2, graphResponse);
            }
        });
    }
}
