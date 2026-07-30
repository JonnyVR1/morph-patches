package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b3f0 implements iam<p2f0> {

    /* JADX INFO: renamed from: A */
    public Act f74735A;

    /* JADX INFO: renamed from: B */
    public p2f0 f74736B;

    /* JADX INFO: renamed from: C */
    public Picture.ImageUri f74737C = null;

    /* JADX INFO: renamed from: D */
    public Media f74738D = null;

    /* JADX INFO: renamed from: a */
    public ScrollView f74739a;

    /* JADX INFO: renamed from: b */
    public VLinear f74740b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f74741c;

    /* JADX INFO: renamed from: d */
    public VText f74742d;

    /* JADX INFO: renamed from: e */
    public VText f74743e;

    /* JADX INFO: renamed from: f */
    public VText f74744f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f74745g;

    /* JADX INFO: renamed from: h */
    public VText f74746h;

    /* JADX INFO: renamed from: i */
    public VText f74747i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f74748j;

    /* JADX INFO: renamed from: k */
    public VText f74749k;

    /* JADX INFO: renamed from: l */
    public VText f74750l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f74751m;

    /* JADX INFO: renamed from: n */
    public VText f74752n;

    /* JADX INFO: renamed from: o */
    public VText f74753o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f74754p;

    /* JADX INFO: renamed from: q */
    public VText f74755q;

    /* JADX INFO: renamed from: r */
    public VText f74756r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f74757s;

    /* JADX INFO: renamed from: t */
    public VText f74758t;

    /* JADX INFO: renamed from: u */
    public VText f74759u;

    /* JADX INFO: renamed from: v */
    public VLinear f74760v;

    /* JADX INFO: renamed from: w */
    public VLinear f74761w;

    /* JADX INFO: renamed from: x */
    public VLinear f74762x;

    /* JADX INFO: renamed from: y */
    public View f74763y;

    /* JADX INFO: renamed from: z */
    public VText f74764z;

    /* JADX INFO: renamed from: l.b3f0$a */
    public class C15912a extends fn2 {
        public C15912a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: c */
        public void mo40110c(String str, Throwable th) {
            super.mo40110c(str, th);
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
        }
    }

    public b3f0(Act act) {
        this.f74735A = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m102290A(String str, View view) {
        i4g0.m138523u("e_user_profile_share_popup_share", act().pageId(), jyb.m147494Y("share_pannel", "wechat_moment"));
        if (lik0.m154377c(str)) {
            o1j0.m165651y("此用户不可被分享");
        } else {
            this.f74735A.duringCreated(CoreModule.f18264c.f20384f0.m34108rg(str)).subscribe(psd0.m173597H(new y20() { // from class: l.z2f0
                @Override // p153l.y20
                public final void call(Object obj) throws Throwable {
                    this.f202680a.m102315z((Boolean) obj);
                }
            }, new y20() { // from class: l.a3f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m102291C(Boolean bool) {
        if (!bool.booleanValue()) {
            o1j0.m165651y("该用户未开启分享功能");
        } else {
            final Bitmap bitmapM102311q = m102311q();
            i1k.m138107d(this.f74735A, new x20() { // from class: l.r2f0
                @Override // p153l.x20
                public final void call() {
                    this.f160936a.m102307B(bitmapM102311q);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m102303v(View view) {
        i4g0.m138520r("e_user_profile_share_popup_cancel", act().pageId());
        this.f74735A.m51642n2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m102304w(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            i1k.m138114k(m102311q(), false);
        } else {
            o1j0.m165651y("该用户未开启分享功能");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m102305y(String str, View view) {
        i4g0.m138523u("e_user_profile_share_popup_share", act().pageId(), jyb.m147494Y("share_pannel", "wechat_friend"));
        if (lik0.m154377c(str)) {
            o1j0.m165651y("此用户不可被分享");
        } else {
            this.f74735A.duringCreated(CoreModule.f18264c.f20384f0.m34108rg(str)).subscribe(psd0.m173597H(new y20() { // from class: l.x2f0
                @Override // p153l.y20
                public final void call(Object obj) throws Throwable {
                    this.f192146a.m102304w((Boolean) obj);
                }
            }, new y20() { // from class: l.y2f0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m102306A3(final String str) {
        User userM116597oa;
        if (NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116597oa(str))) {
            userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str);
        } else {
            this.f74735A.m51642n2();
            userM116597oa = null;
        }
        this.f74744f.setTypeface(lyh0.m156283c(3), 1);
        boolean zIsEmpty = TextUtils.isEmpty(userM116597oa.name);
        VText vText = this.f74742d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setTypeface(lyh0.m156283c(3), 1);
            this.f74742d.setText(userM116597oa.name);
        }
        boolean zM82486a = NullChecker.m82486a(userM116597oa.age);
        VText vText2 = this.f74743e;
        if (zM82486a) {
            vText2.setText(userM116597oa.age + "");
        } else {
            vText2.setVisibility(8);
        }
        String strM175804j0 = q8g0.m175804j0(userM116597oa.profile.zodiac);
        boolean zIsEmpty2 = TextUtils.isEmpty(strM175804j0);
        LinearLayout linearLayout = this.f74745g;
        if (zIsEmpty2) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f74747i.setText(strM175804j0);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(userM116597oa.profile.work.industry);
        LinearLayout linearLayout2 = this.f74748j;
        if (zIsEmpty3) {
            linearLayout2.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            this.f74750l.setText(userM116597oa.profile.work.industry);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(userM116597oa.profile.hometown);
        LinearLayout linearLayout3 = this.f74751m;
        if (zIsEmpty4) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            this.f74753o.setText(userM116597oa.profile.hometown);
        }
        boolean zIsEmpty5 = TextUtils.isEmpty(userM116597oa.profile.hangouts);
        LinearLayout linearLayout4 = this.f74754p;
        if (zIsEmpty5) {
            linearLayout4.setVisibility(8);
        } else {
            linearLayout4.setVisibility(0);
            this.f74756r.setText(userM116597oa.profile.hangouts);
        }
        boolean zIsEmpty6 = TextUtils.isEmpty(userM116597oa.description);
        LinearLayout linearLayout5 = this.f74757s;
        if (zIsEmpty6) {
            linearLayout5.setVisibility(8);
        } else {
            linearLayout5.setVisibility(0);
            this.f74759u.setText(userM116597oa.description);
        }
        bnl0.m105509E0(this.f74764z, new View.OnClickListener() { // from class: l.q2f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155331a.m102303v(view);
            }
        });
        bnl0.m105509E0(this.f74760v, new View.OnClickListener() { // from class: l.s2f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165885a.m102305y(str, view);
            }
        });
        bnl0.m105509E0(this.f74761w, new View.OnClickListener() { // from class: l.t2f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171753a.m102290A(str, view);
            }
        });
        bnl0.m105509E0(this.f74762x, new View.OnClickListener() { // from class: l.u2f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177210a.m102314x(str, view);
            }
        });
        this.f74741c.setAspectRatio(0.88f);
        m102308E(this.f74741c);
        Media media = CoreModule.f18264c.f20381e0.m116597oa(str).media(0);
        this.f74738D = media;
        if (media instanceof Video) {
            this.f74737C = media.cover().aspectRatioBiggest();
        } else {
            this.f74737C = nwb.m164968f(media);
        }
        uqb0.f180374G.m127097C0(this.f74741c, this.f74737C, new C15912a());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m102307B(Bitmap bitmap) {
        if (i1k.m138112i(this.f74735A, "", bitmap)) {
            o1j0.m165636j("图片已保存到相册");
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f74735A;
    }

    /* JADX INFO: renamed from: E */
    public void m102308E(SimpleDraweeView simpleDraweeView) {
        RoundingParams roundingParamsM207055p = simpleDraweeView.getHierarchy().m207055p();
        if (roundingParamsM207055p == null) {
            roundingParamsM207055p = new RoundingParams();
        }
        int i = qa00.f156328o;
        roundingParamsM207055p.m8318r(i, i, 0.0f, 0.0f);
        simpleDraweeView.getHierarchy().m207045H(roundingParamsM207055p);
        simpleDraweeView.getHierarchy().m207065z(dbc0.f87270o2);
        simpleDraweeView.getHierarchy().m207042E(new rc80(i, 3));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102309n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m102309n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return c3f0.m107789b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p2f0 p2f0Var) {
        this.f74736B = p2f0Var;
    }

    /* JADX INFO: renamed from: q */
    public final Bitmap m102311q() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f74735A.getResources(), dbc0.f86578Sp);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(this.f74735A.getResources(), dbc0.f86610Tp);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f74740b.getWidth(), this.f74740b.getHeight(), Bitmap.Config.ARGB_4444);
        this.f74740b.draw(new Canvas(bitmapCreateBitmap));
        int height = 0;
        for (int i = 0; i < this.f74739a.getChildCount(); i++) {
            height += this.f74739a.getChildAt(i).getHeight();
        }
        int iM105592y0 = ((int) (((double) height) + (((double) (bnl0.m105592y0() - bnl0.m105587w(40.0f))) / 2.22d))) + bnl0.m105587w(72.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bnl0.m105592y0(), iM105592y0, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        m102313u(canvas, bitmapDecodeResource, 0, 0, bnl0.m105592y0(), iM105592y0, 0, 0);
        m102312s(canvas, bitmapCreateBitmap, bnl0.m105587w(20.0f), bnl0.m105587w(36.0f), this.f74740b.getWidth(), this.f74740b.getHeight(), 0, 0);
        m102312s(canvas, bitmapDecodeResource2, bnl0.m105587w(20.0f), this.f74740b.getHeight() + bnl0.m105587w(36.0f), bnl0.m105592y0() - bnl0.m105587w(40.0f), (int) (((double) (bnl0.m105592y0() - bnl0.m105587w(40.0f))) / 2.22d), 0, 0);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: s */
    public void m102312s(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect.left = i5;
        rect.top = i6;
        rect.right = i5 + i3;
        rect.bottom = i6 + i4;
        rect2.left = i;
        rect2.top = i2;
        rect2.right = i + i3;
        rect2.bottom = i2 + i4;
        canvas.drawBitmap(bitmap, (Rect) null, rect2, (Paint) null);
    }

    /* JADX INFO: renamed from: u */
    public void m102313u(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect.left = i5;
        rect.top = i6;
        rect.right = i5 + i3;
        rect.bottom = i6 + i4;
        rect2.left = i;
        rect2.top = i2;
        rect2.right = i + i3;
        rect2.bottom = i2 + i4;
        new NinePatch(bitmap, bitmap.getNinePatchChunk(), null).draw(canvas, rect2);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m102314x(String str, View view) {
        i4g0.m138523u("e_user_profile_share_popup_share", act().pageId(), jyb.m147494Y("share_pannel", "save_picture"));
        this.f74735A.duringCreated(CoreModule.f18264c.f20384f0.m34108rg(str)).subscribe(psd0.m173597H(new y20() { // from class: l.v2f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182089a.m102291C((Boolean) obj);
            }
        }, new y20() { // from class: l.w2f0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("该用户未开启分享功能");
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m102315z(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            i1k.m138114k(m102311q(), true);
        } else {
            o1j0.m165651y("该用户未开启分享功能");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
