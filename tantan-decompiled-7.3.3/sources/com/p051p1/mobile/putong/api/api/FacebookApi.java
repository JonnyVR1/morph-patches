package com.p051p1.mobile.putong.api.api;

import android.os.Bundle;
import com.clevertap.android.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.C1622e;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.p051p1.mobile.putong.api.api.FacebookApi;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.FBAlbum;
import com.p051p1.mobile.putong.data.FBAlbums;
import com.p051p1.mobile.putong.data.FBPicture;
import com.p051p1.mobile.putong.data.FBPictures;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.utils.CrashHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.ewi;
import p153l.jyb;
import p153l.o1j0;
import p153l.psd0;
import p153l.qcj;
import p153l.tu2;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.y20;
import p153l.z0w;

/* JADX INFO: loaded from: classes9.dex */
public class FacebookApi {

    /* JADX INFO: renamed from: d */
    public static final List<String> f17871d = jyb.m147507f0(AuthenticationTokenClaims.JSON_KEY_USER_BIRTHDAY, AuthenticationTokenClaims.JSON_KEY_USER_HOMETOWN, "user_photos", AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, "email", AuthenticationTokenClaims.JSON_KEY_USER_GENDER);

    /* JADX INFO: renamed from: e */
    public static final List<String> f17872e = jyb.m147507f0("user_photos");

    /* JADX INFO: renamed from: a */
    public Map<String, C22421c> f17873a = new HashMap();

    /* JADX INFO: renamed from: b */
    public C22507a<vg60<ewi>> f17874b = C22507a.m222758b();

    /* JADX INFO: renamed from: c */
    public C22507a<vg60<Media>> f17875c = C22507a.m222758b();

    public static class FBApiException extends Throwable {
        public static int PERMISSION_DENIED = 10;
        public static int TOKEN_EXPIRED = 190;
        FacebookRequestError error;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m30518b(JsonAdapter jsonAdapter, y20 y20Var, String str, Bundle bundle, y20 y20Var2, GraphResponse graphResponse) {
        if (graphResponse.getError() != null) {
            if (y20Var2 != null) {
                FBApiException fBApiException = new FBApiException();
                fBApiException.error = graphResponse.getError();
                y20Var2.call(fBApiException);
            }
            tu2.m192703a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.getError());
            return;
        }
        try {
            Object obj = jsonAdapter.parse(graphResponse.getRawResponse());
            if (y20Var != null) {
                y20Var.call(obj);
            }
            tu2.m192703a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + Constants.AES_SUFFIX);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            if (y20Var2 != null) {
                y20Var2.call(e);
            } else {
                m30528m(e);
            }
            tu2.m192703a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m30521e(y20 y20Var, C1622e c1622e) {
        if (y20Var != null) {
            y20Var.call(c1622e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m30524h(y20 y20Var, FBPicture fBPicture) {
        Picture picture = new Picture();
        picture.url = fBPicture.thumbnail;
        picture.mediaType = "image/*";
        picture.status = MediaLocalStatus.get("raw");
        if (y20Var != null) {
            y20Var.call(picture);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m30528m(Throwable th) {
        if (th instanceof FacebookAuthorizationException) {
            if (AccessToken.m7462d() != null) {
                z0w.m218186m().m218213u();
            }
            o1j0.m165651y(th.getMessage() + "(-1001)");
            uqb0.m197269e1("fb_api_error", "code", "-1001", "message", th.getMessage());
        } else if (th instanceof FacebookException) {
            o1j0.m165651y(th.getMessage() + "(-1002)");
            uqb0.m197269e1("fb_api_error", "code", "-1002", "message", th.getMessage());
        } else {
            o1j0.m165651y(th.getMessage() + "(-1003)");
            uqb0.m197269e1("fb_api_error", "code", "-1003", "message", th.getMessage());
        }
        if (th instanceof FBApiException) {
            FBApiException fBApiException = (FBApiException) th;
            if (fBApiException.error.getErrorCode() != FBApiException.TOKEN_EXPIRED && fBApiException.error.getErrorCode() != FBApiException.PERMISSION_DENIED) {
                o1j0.m165651y(fBApiException.error.m7550c() + "(" + fBApiException.error.getErrorCode() + ")");
            } else if (uqb0.f180397c0.signedIn_()) {
                o1j0.m165634h(R$string.f18024B);
                uqb0.m197259Z0(false, false);
            }
            uqb0.m197269e1("fb_api_error", "code", String.valueOf(fBApiException.error.getErrorCode()), "message", fBApiException.error.m7550c());
        }
    }

    /* JADX INFO: renamed from: l */
    public C22421c<vg60<ewi>> m30529l() {
        this.f17874b = null;
        C22507a<vg60<ewi>> c22507aM222758b = C22507a.m222758b();
        this.f17874b = c22507aM222758b;
        if (c22507aM222758b.m222761e() == null || this.f17874b.m222761e().f184001a.size() == 0) {
            m30538v(false).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.jvf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122800a.m30530n((Throwable) obj);
                }
            }));
        }
        return this.f17874b;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m30530n(Throwable th) {
        this.f17874b.onError(th);
        m30528m(th);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m30531o(JsonAdapter jsonAdapter, C22507a c22507a, String str, Bundle bundle, GraphResponse graphResponse) {
        if (graphResponse.getError() == null) {
            try {
                c22507a.m137019l(jsonAdapter.parse(graphResponse.getRawResponse()));
                c22507a.onCompleted();
                tu2.m192703a("[common][network]", "facebook request success : " + str + ", params = [" + bundle + Constants.AES_SUFFIX);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                c22507a.onError(e);
                tu2.m192703a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + e.getMessage());
            }
        } else {
            FBApiException fBApiException = new FBApiException();
            fBApiException.error = graphResponse.getError();
            c22507a.onError(fBApiException);
            tu2.m192703a("[common][network]", "facebook request error : " + str + ", params = [" + bundle + "], exception : " + graphResponse.getError());
        }
        this.f17873a.remove(str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m30532p(FBAlbums fBAlbums) {
        int size = fBAlbums.data.size();
        if (size == 0) {
            this.f17874b.m137019l(vg60.m201220b());
        }
        return Boolean.valueOf(size > 0);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m30533q(boolean z, FBAlbums fBAlbums) {
        if (z) {
            return;
        }
        String str = fBAlbums.data.get(0).f39597id;
        for (FBAlbum fBAlbum : fBAlbums.data) {
            if (fBAlbum.count > 0) {
                str = fBAlbum.f39597id;
                break;
            }
        }
        m30541y(str, false).subscribe(psd0.m173597H(uxj0.f181468b, new y20() { // from class: l.pvf
            @Override // p153l.y20
            public final void call(Object obj) {
                FacebookApi.m30528m((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ uxj0 m30534r(boolean z, FBAlbums fBAlbums) {
        vg60<ewi> vg60VarM222761e = z ? this.f17874b.m222761e() : vg60.m201220b();
        vg60VarM222761e.f184002b.links.next = fBAlbums.paging.next;
        ArrayList arrayList = new ArrayList();
        for (FBAlbum fBAlbum : fBAlbums.data) {
            final ewi ewiVar = new ewi();
            ewiVar.f96161a = fBAlbum.name;
            ewiVar.f96162b = fBAlbum.f39597id;
            ewiVar.f96163c = vg60.m201220b();
            int i = fBAlbum.count;
            ewiVar.f96164d = i;
            if (i > 0) {
                vg60VarM222761e.f184001a.add(ewiVar);
                arrayList.add(m30540x(fBAlbum.cover.f39601id, new y20() { // from class: l.ovf
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ewiVar.f96163c.f184001a.add((Media) obj);
                    }
                }));
            }
        }
        if (arrayList.size() > 0) {
            m30539w(arrayList, null);
        }
        this.f17874b.m137019l(vg60VarM222761e);
        return uxj0.f181467a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ uxj0 m30535s(boolean z, vg60 vg60Var, FBPictures fBPictures) {
        if (!z || vg60Var == null) {
            vg60Var = vg60.m201220b();
        }
        vg60Var.f184002b.links.next = fBPictures.paging.next;
        for (FBPicture fBPicture : fBPictures.data) {
            Picture picture = new Picture();
            picture.url = fBPicture.source;
            picture.mediaType = "image/*";
            picture.status = MediaLocalStatus.get("raw");
            vg60Var.f184001a.add((T) picture);
        }
        this.f17875c.m137019l((vg60<Media>) vg60Var);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: t */
    public C22421c<vg60<Media>> m30536t() {
        this.f17875c = null;
        C22507a<vg60<Media>> c22507aM222758b = C22507a.m222758b();
        this.f17875c = c22507aM222758b;
        return c22507aM222758b;
    }

    /* JADX INFO: renamed from: u */
    public <T> C22421c<T> m30537u(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter) {
        tu2.m192703a("[common][network]", "facebook request url = " + str + ", params = [" + bundle);
        if (this.f17873a.containsKey(str)) {
            return this.f17873a.get(str);
        }
        final C22507a c22507aM222758b = C22507a.m222758b();
        this.f17873a.put(str, c22507aM222758b);
        new GraphRequest(AccessToken.m7462d(), str, bundle, HttpMethod.GET, new GraphRequest.InterfaceC1539b() { // from class: l.kvf
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                this.f128955a.m30531o(jsonAdapter, c22507aM222758b, str, bundle, graphResponse);
            }
        }).m7580k();
        return c22507aM222758b;
    }

    /* JADX INFO: renamed from: v */
    public C22421c<uxj0> m30538v(final boolean z) {
        String str = "/" + AccessToken.m7462d().getUserId() + "/albums";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,count,cover_photo");
        bundle.putInt(Constants.KEY_LIMIT, 20);
        if (z) {
            bundle.putString(OMSSwipeMoment.after, this.f17874b.m222761e().f184002b.links.next);
        }
        return m30537u(str, bundle, FBAlbums.JSON_ADAPTER).filter(new qcj() { // from class: l.lvf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133700a.m30532p((FBAlbums) obj);
            }
        }).doOnNext(new y20() { // from class: l.mvf
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138891a.m30533q(z, (FBAlbums) obj);
            }
        }).map(new qcj() { // from class: l.nvf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143796a.m30534r(z, (FBAlbums) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public void m30539w(List<GraphRequest> list, final y20<C1622e> y20Var) {
        C1622e c1622e = new C1622e(list);
        c1622e.m8356f(new C1622e.a() { // from class: l.qvf
            @Override // com.facebook.C1622e.a
            /* JADX INFO: renamed from: a */
            public final void mo8371a(C1622e c1622e2) {
                FacebookApi.m30521e(y20Var, c1622e2);
            }
        });
        c1622e.m8360j();
    }

    /* JADX INFO: renamed from: x */
    public GraphRequest m30540x(String str, final y20<Media> y20Var) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,picture");
        return m30542z(str, bundle, FBPicture.JSON_ADAPTER, new y20() { // from class: l.rvf
            @Override // p153l.y20
            public final void call(Object obj) {
                FacebookApi.m30524h(y20Var, (FBPicture) obj);
            }
        }, null);
    }

    /* JADX INFO: renamed from: y */
    public C22421c<uxj0> m30541y(String str, final boolean z) {
        String str2 = "/" + str + "/photos";
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,source,picture");
        bundle.putInt(Constants.KEY_LIMIT, 20);
        final vg60<Media> vg60VarM222761e = this.f17875c.m222761e();
        if (z && vg60VarM222761e != null) {
            bundle.putString(OMSSwipeMoment.after, vg60VarM222761e.f184002b.links.next);
        }
        return m30537u(str2, bundle, FBPictures.JSON_ADAPTER).map(new qcj() { // from class: l.hvf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f111753a.m30535s(z, vg60VarM222761e, (FBPictures) obj);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public <T> GraphRequest m30542z(final String str, final Bundle bundle, final JsonAdapter<T> jsonAdapter, final y20<T> y20Var, final y20<Throwable> y20Var2) {
        return new GraphRequest(AccessToken.m7462d(), str, bundle, HttpMethod.GET, new GraphRequest.InterfaceC1539b() { // from class: l.ivf
            @Override // com.facebook.GraphRequest.InterfaceC1539b
            /* JADX INFO: renamed from: a */
            public final void mo7602a(GraphResponse graphResponse) {
                FacebookApi.m30518b(jsonAdapter, y20Var, str, bundle, y20Var2, graphResponse);
            }
        });
    }
}
