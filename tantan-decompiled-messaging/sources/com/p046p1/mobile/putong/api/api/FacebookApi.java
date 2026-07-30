package com.p046p1.mobile.putong.api.api;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1599e;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.p046p1.mobile.putong.api.api.FacebookApi;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.FBAlbum;
import com.p046p1.mobile.putong.data.FBAlbums;
import com.p046p1.mobile.putong.data.FBPicture;
import com.p046p1.mobile.putong.data.FBPictures;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.bzv;
import p149l.du2;
import p149l.e30;
import p149l.iti;
import p149l.lsi0;
import p149l.mkd0;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes9.dex */
public class FacebookApi {

    /* JADX INFO: renamed from: d */
    public static final List<String> f17152d = vwb.m200324f0(AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY, AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN, "user_photos", AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, "email", AuthenticationTokenClaims.JSON_KEY_USER_GENDER);

    /* JADX INFO: renamed from: e */
    public static final List<String> f17153e = vwb.m200324f0("user_photos");

    /* JADX INFO: renamed from: a */
    public Map<String, C22306c> f17154a = new HashMap();

    /* JADX INFO: renamed from: b */
    public C22392a<q860<iti>> f17155b = C22392a.m221512b();

    /* JADX INFO: renamed from: c */
    public C22392a<q860<Media>> f17156c = C22392a.m221512b();

    public static class FBApiException extends Throwable {
        public static int PERMISSION_DENIED = 10;
        public static int TOKEN_EXPIRED = 190;
        FacebookRequestError error;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m29520b(JsonAdapter jsonAdapter, e30 e30Var, String str, Bundle bundle, e30 e30Var2, GraphResponse graphResponse) {
        if (graphResponse.getError() != null) {
            if (e30Var2 != null) {
                FBApiException fBApiException = new FBApiException();
                fBApiException.error = graphResponse.getError();
                e30Var2.call(fBApiException);
            }
            du2.m113670a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.getError());
            return;
        }
        try {
            Object obj = jsonAdapter.parse(graphResponse.getRawResponse());
            if (e30Var != null) {
                e30Var.call(obj);
            }
            du2.m113670a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + Constants.AES_SUFFIX);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            if (e30Var2 != null) {
                e30Var2.call(e);
            } else {
                m29530m(e);
            }
            du2.m113670a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m29523e(e30 e30Var, C1599e c1599e) {
        if (e30Var != null) {
            e30Var.call(c1599e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m29526h(e30 e30Var, FBPicture fBPicture) {
        Picture picture = new Picture();
        picture.url = fBPicture.thumbnail;
        picture.mediaType = "image/*";
        picture.status = MediaLocalStatus.get("raw");
        if (e30Var != null) {
            e30Var.call(picture);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m29530m(Throwable th) {
        if (th instanceof FacebookAuthorizationException) {
            if (AccessToken.m7408d() != null) {
                bzv.m104655m().m104682u();
            }
            lsi0.m151595y(th.getMessage() + "(-1001)");
            qib0.m174815e1("fb_api_error", "code", "-1001", "message", th.getMessage());
        } else if (th instanceof FacebookException) {
            lsi0.m151595y(th.getMessage() + "(-1002)");
            qib0.m174815e1("fb_api_error", "code", "-1002", "message", th.getMessage());
        } else {
            lsi0.m151595y(th.getMessage() + "(-1003)");
            qib0.m174815e1("fb_api_error", "code", "-1003", "message", th.getMessage());
        }
        if (th instanceof FBApiException) {
            FBApiException fBApiException = (FBApiException) th;
            if (fBApiException.error.getErrorCode() != FBApiException.TOKEN_EXPIRED && fBApiException.error.getErrorCode() != FBApiException.PERMISSION_DENIED) {
                lsi0.m151595y(fBApiException.error.m7496c() + "(" + fBApiException.error.getErrorCode() + ")");
            } else if (qib0.f154714c0.signedIn_()) {
                lsi0.m151578h(R$string.f17305B);
                qib0.m174805Z0(false, false);
            }
            qib0.m174815e1("fb_api_error", "code", String.valueOf(fBApiException.error.getErrorCode()), "message", fBApiException.error.m7496c());
        }
    }

    /* JADX INFO: renamed from: l */
    public C22306c<q860<iti>> m29531l() {
        this.f17155b = null;
        C22392a<q860<iti>> c22392aM221512b = C22392a.m221512b();
        this.f17155b = c22392aM221512b;
        if (c22392aM221512b.m221515e() == null || this.f17155b.m221515e().f153135a.size() == 0) {
            m29540v(false).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.vtf
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182939a.m29532n((Throwable) obj);
                }
            }));
        }
        return this.f17155b;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m29532n(Throwable th) {
        this.f17155b.onError(th);
        m29530m(th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m29533o(JsonAdapter jsonAdapter, C22392a c22392a, String str, Bundle bundle, GraphResponse graphResponse) {
        if (graphResponse.getError() == null) {
            try {
                c22392a.m132487l(jsonAdapter.parse(graphResponse.getRawResponse()));
                c22392a.onCompleted();
                du2.m113670a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + Constants.AES_SUFFIX);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                c22392a.onError(e);
                du2.m113670a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
            }
        } else {
            FBApiException fBApiException = new FBApiException();
            fBApiException.error = graphResponse.getError();
            c22392a.onError(fBApiException);
            du2.m113670a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.getError());
        }
        this.f17154a.remove(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m29534p(FBAlbums fBAlbums) {
        int size = fBAlbums.data.size();
        if (size == 0) {
            this.f17155b.m132487l(q860.m173342b());
        }
        return Boolean.valueOf(size > 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m29535q(boolean z, FBAlbums fBAlbums) {
        if (z) {
            return;
        }
        String str = fBAlbums.data.get(0).f38749id;
        for (FBAlbum fBAlbum : fBAlbums.data) {
            if (fBAlbum.count > 0) {
                str = fBAlbum.f38749id;
                break;
            }
        }
        m29543y(str, false).subscribe(mkd0.m154956H(roj0.f160389b, new e30() { // from class: l.buf
            @Override // p149l.e30
            public final void call(Object obj) {
                FacebookApi.m29530m((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ roj0 m29536r(boolean z, FBAlbums fBAlbums) {
        q860<iti> q860VarM221515e = z ? this.f17155b.m221515e() : q860.m173342b();
        q860VarM221515e.f153136b.links.next = fBAlbums.paging.next;
        ArrayList arrayList = new ArrayList();
        for (FBAlbum fBAlbum : fBAlbums.data) {
            final iti itiVar = new iti();
            itiVar.f114884a = fBAlbum.name;
            itiVar.f114885b = fBAlbum.f38749id;
            itiVar.f114886c = q860.m173342b();
            int i = fBAlbum.count;
            itiVar.f114887d = i;
            if (i > 0) {
                q860VarM221515e.f153135a.add(itiVar);
                arrayList.add(m29542x(fBAlbum.cover.f38753id, new e30() { // from class: l.auf
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        itiVar.f114886c.f153135a.add((Media) obj);
                    }
                }));
            }
        }
        if (arrayList.size() > 0) {
            m29541w(arrayList, null);
        }
        this.f17155b.m132487l(q860VarM221515e);
        return roj0.f160388a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ roj0 m29537s(boolean z, q860 q860Var, FBPictures fBPictures) {
        if (!z || q860Var == null) {
            q860Var = q860.m173342b();
        }
        q860Var.f153136b.links.next = fBPictures.paging.next;
        for (FBPicture fBPicture : fBPictures.data) {
            Picture picture = new Picture();
            picture.url = fBPicture.source;
            picture.mediaType = "image/*";
            picture.status = MediaLocalStatus.get("raw");
            q860Var.f153135a.add((T) picture);
        }
        this.f17156c.m132487l((q860<Media>) q860Var);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: t */
    public C22306c<q860<Media>> m29538t() {
        this.f17156c = null;
        C22392a<q860<Media>> c22392aM221512b = C22392a.m221512b();
        this.f17156c = c22392aM221512b;
        return c22392aM221512b;
    }

    /* JADX INFO: renamed from: u */
    public <T> C22306c<T> m29539u(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter) {
        du2.m113670a("[common][network]", "facebook request url = " + str + ", params = [" + bundle);
        if (this.f17154a.containsKey(str)) {
            return this.f17154a.get(str);
        }
        final C22392a c22392aM221512b = C22392a.m221512b();
        this.f17154a.put(str, c22392aM221512b);
        new GraphRequest(AccessToken.m7408d(), str, bundle, HttpMethod.GET, new GraphRequest.InterfaceC1516b() { // from class: l.wtf
            @Override // com.facebook.GraphRequest.InterfaceC1516b
            /* JADX INFO: renamed from: a */
            public final void mo7548a(GraphResponse graphResponse) {
                this.f188011a.m29533o(jsonAdapter, c22392aM221512b, str, bundle, graphResponse);
            }
        }).m7526k();
        return c22392aM221512b;
    }

    /* JADX INFO: renamed from: v */
    public C22306c<roj0> m29540v(final boolean z) {
        String str = "/" + AccessToken.m7408d().getUserId() + "/albums";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,count,cover_photo");
        bundle.putInt(Constants.KEY_LIMIT, 20);
        if (z) {
            bundle.putString(OMSSwipeMoment.after, this.f17155b.m221515e().f153136b.links.next);
        }
        return m29539u(str, bundle, FBAlbums.JSON_ADAPTER).filter(new w9j() { // from class: l.xtf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f194382a.m29534p((FBAlbums) obj);
            }
        }).doOnNext(new e30() { // from class: l.ytf
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199914a.m29535q(z, (FBAlbums) obj);
            }
        }).map(new w9j() { // from class: l.ztf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f204721a.m29536r(z, (FBAlbums) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m29541w(List<GraphRequest> list, final e30<C1599e> e30Var) {
        C1599e c1599e = new C1599e(list);
        c1599e.m8302f(new C1599e.a() { // from class: l.cuf
            @Override // com.facebook.C1599e.a
            /* JADX INFO: renamed from: a */
            public final void mo8317a(C1599e c1599e2) {
                FacebookApi.m29523e(e30Var, c1599e2);
            }
        });
        c1599e.m8306j();
    }

    /* JADX INFO: renamed from: x */
    public GraphRequest m29542x(String str, final e30<Media> e30Var) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,picture");
        return m29544z(str, bundle, FBPicture.JSON_ADAPTER, new e30() { // from class: l.duf
            @Override // p149l.e30
            public final void call(Object obj) {
                FacebookApi.m29526h(e30Var, (FBPicture) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: y */
    public C22306c<roj0> m29543y(String str, final boolean z) {
        String str2 = "/" + str + "/photos";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,source,picture");
        bundle.putInt(Constants.KEY_LIMIT, 20);
        final q860<Media> q860VarM221515e = this.f17156c.m221515e();
        if (z && q860VarM221515e != null) {
            bundle.putString(OMSSwipeMoment.after, q860VarM221515e.f153136b.links.next);
        }
        return m29539u(str2, bundle, FBPictures.JSON_ADAPTER).map(new w9j() { // from class: l.ttf
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f172022a.m29537s(z, q860VarM221515e, (FBPictures) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public <T> GraphRequest m29544z(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter, final e30<T> e30Var, final e30<Throwable> e30Var2) {
        return new GraphRequest(AccessToken.m7408d(), str, bundle, HttpMethod.GET, new GraphRequest.InterfaceC1516b() { // from class: l.utf
            @Override // com.facebook.GraphRequest.InterfaceC1516b
            /* JADX INFO: renamed from: a */
            public final void mo7548a(GraphResponse graphResponse) {
                FacebookApi.m29520b(jsonAdapter, e30Var, str, bundle, e30Var2, graphResponse);
            }
        });
    }
}
