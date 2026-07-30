package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uue0 implements s7m<iue0> {

    /* JADX INFO: renamed from: A */
    public Act f178344A;

    /* JADX INFO: renamed from: B */
    public iue0 f178345B;

    /* JADX INFO: renamed from: C */
    public Picture.ImageUri f178346C = null;

    /* JADX INFO: renamed from: D */
    public Media f178347D = null;

    /* JADX INFO: renamed from: a */
    public ScrollView f178348a;

    /* JADX INFO: renamed from: b */
    public VLinear f178349b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f178350c;

    /* JADX INFO: renamed from: d */
    public VText f178351d;

    /* JADX INFO: renamed from: e */
    public VText f178352e;

    /* JADX INFO: renamed from: f */
    public VText f178353f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f178354g;

    /* JADX INFO: renamed from: h */
    public VText f178355h;

    /* JADX INFO: renamed from: i */
    public VText f178356i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f178357j;

    /* JADX INFO: renamed from: k */
    public VText f178358k;

    /* JADX INFO: renamed from: l */
    public VText f178359l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f178360m;

    /* JADX INFO: renamed from: n */
    public VText f178361n;

    /* JADX INFO: renamed from: o */
    public VText f178362o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f178363p;

    /* JADX INFO: renamed from: q */
    public VText f178364q;

    /* JADX INFO: renamed from: r */
    public VText f178365r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f178366s;

    /* JADX INFO: renamed from: t */
    public VText f178367t;

    /* JADX INFO: renamed from: u */
    public VText f178368u;

    /* JADX INFO: renamed from: v */
    public VLinear f178369v;

    /* JADX INFO: renamed from: w */
    public VLinear f178370w;

    /* JADX INFO: renamed from: x */
    public VLinear f178371x;

    /* JADX INFO: renamed from: y */
    public View f178372y;

    /* JADX INFO: renamed from: z */
    public VText f178373z;

    /* JADX INFO: renamed from: l.uue0$a */
    public class C20515a extends ym2 {
        public C20515a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: c */
        public void mo39107c(String str, Throwable th) {
            super.mo39107c(str, th);
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
        }
    }

    public uue0(Act act) {
        this.f178344A = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m195331A(String str, View view) {
        zvf0.m220399u("e_user_profile_share_popup_share", act().pageId(), vwb.m200311Y("share_pannel", "wechat_moment"));
        if (f9k0.m120090c(str)) {
            lsi0.m151595y("此用户不可被分享");
        } else {
            this.f178344A.duringCreated(CoreModule.f17545c.f19642f0.m33105rg(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.sue0
                @Override // p149l.e30
                public final void call(Object obj) throws Throwable {
                    this.f166464a.m195356z((Boolean) obj);
                }
            }, new e30() { // from class: l.tue0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m195332C(Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.m151595y("该用户未开启分享功能");
        } else {
            final Bitmap bitmapM195352q = m195352q();
            syj.m186675d(this.f178344A, new d30() { // from class: l.kue0
                @Override // p149l.d30
                public final void call() {
                    this.f124681a.m195348B(bitmapM195352q);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m195344v(View view) {
        zvf0.m220396r("e_user_profile_share_popup_cancel", act().pageId());
        this.f178344A.m50458m2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m195345w(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            syj.m186682k(m195352q(), false);
        } else {
            lsi0.m151595y("该用户未开启分享功能");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m195346y(String str, View view) {
        zvf0.m220399u("e_user_profile_share_popup_share", act().pageId(), vwb.m200311Y("share_pannel", "wechat_friend"));
        if (f9k0.m120090c(str)) {
            lsi0.m151595y("此用户不可被分享");
        } else {
            this.f178344A.duringCreated(CoreModule.f17545c.f19642f0.m33105rg(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.que0
                @Override // p149l.e30
                public final void call(Object obj) throws Throwable {
                    this.f156479a.m195345w((Boolean) obj);
                }
            }, new e30() { // from class: l.rue0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m195347A3(final String str) {
        User userM169524oa;
        if (NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169524oa(str))) {
            userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str);
        } else {
            this.f178344A.m50458m2();
            userM169524oa = null;
        }
        this.f178353f.setTypeface(eqh0.m117752c(3), 1);
        boolean zIsEmpty = TextUtils.isEmpty(userM169524oa.name);
        VText vText = this.f178351d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setTypeface(eqh0.m117752c(3), 1);
            this.f178351d.setText(userM169524oa.name);
        }
        boolean zM81303a = NullChecker.m81303a(userM169524oa.age);
        VText vText2 = this.f178352e;
        if (zM81303a) {
            vText2.setText(userM169524oa.age + "");
        } else {
            vText2.setVisibility(8);
        }
        String strM133869j0 = i0g0.m133869j0(userM169524oa.profile.zodiac);
        boolean zIsEmpty2 = TextUtils.isEmpty(strM133869j0);
        LinearLayout linearLayout = this.f178354g;
        if (zIsEmpty2) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f178356i.setText(strM133869j0);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(userM169524oa.profile.work.industry);
        LinearLayout linearLayout2 = this.f178357j;
        if (zIsEmpty3) {
            linearLayout2.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            this.f178359l.setText(userM169524oa.profile.work.industry);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(userM169524oa.profile.hometown);
        LinearLayout linearLayout3 = this.f178360m;
        if (zIsEmpty4) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            this.f178362o.setText(userM169524oa.profile.hometown);
        }
        boolean zIsEmpty5 = TextUtils.isEmpty(userM169524oa.profile.hangouts);
        LinearLayout linearLayout4 = this.f178363p;
        if (zIsEmpty5) {
            linearLayout4.setVisibility(8);
        } else {
            linearLayout4.setVisibility(0);
            this.f178365r.setText(userM169524oa.profile.hangouts);
        }
        boolean zIsEmpty6 = TextUtils.isEmpty(userM169524oa.description);
        LinearLayout linearLayout5 = this.f178366s;
        if (zIsEmpty6) {
            linearLayout5.setVisibility(8);
        } else {
            linearLayout5.setVisibility(0);
            this.f178368u.setText(userM169524oa.description);
        }
        xdl0.m208329E0(this.f178373z, new View.OnClickListener() { // from class: l.jue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119777a.m195344v(view);
            }
        });
        xdl0.m208329E0(this.f178369v, new View.OnClickListener() { // from class: l.lue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130054a.m195346y(str, view);
            }
        });
        xdl0.m208329E0(this.f178370w, new View.OnClickListener() { // from class: l.mue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135781a.m195331A(str, view);
            }
        });
        xdl0.m208329E0(this.f178371x, new View.OnClickListener() { // from class: l.nue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140620a.m195355x(str, view);
            }
        });
        this.f178350c.setAspectRatio(0.88f);
        m195349E(this.f178350c);
        Media media = CoreModule.f17545c.f19639e0.m169524oa(str).media(0);
        this.f178347D = media;
        if (media instanceof Video) {
            this.f178346C = media.cover().aspectRatioBiggest();
        } else {
            this.f178346C = zub.m220207f(media);
        }
        qib0.f154691G.m102313C0(this.f178350c, this.f178346C, new C20515a());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m195348B(Bitmap bitmap) {
        if (syj.m186680i(this.f178344A, "", bitmap)) {
            lsi0.m151580j("图片已保存到相册");
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f178344A;
    }

    /* JADX INFO: renamed from: E */
    public void m195349E(SimpleDraweeView simpleDraweeView) {
        RoundingParams roundingParamsM112069p = simpleDraweeView.getHierarchy().m112069p();
        if (roundingParamsM112069p == null) {
            roundingParamsM112069p = new RoundingParams();
        }
        int i = t100.f167266o;
        roundingParamsM112069p.m8264r(i, i, 0.0f, 0.0f);
        simpleDraweeView.getHierarchy().m112053H(roundingParamsM112069p);
        simpleDraweeView.getHierarchy().m112079z(x2c0.f190381n2);
        simpleDraweeView.getHierarchy().m112050E(new l480(i, 3));
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m195350n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m195350n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vue0.m200069b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iue0 iue0Var) {
        this.f178345B = iue0Var;
    }

    /* JADX INFO: renamed from: q */
    public final Bitmap m195352q() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f178344A.getResources(), x2c0.f190118ep);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(this.f178344A.getResources(), x2c0.f190150fp);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f178349b.getWidth(), this.f178349b.getHeight(), Bitmap.Config.ARGB_4444);
        this.f178349b.draw(new Canvas(bitmapCreateBitmap));
        int height = 0;
        for (int i = 0; i < this.f178348a.getChildCount(); i++) {
            height += this.f178348a.getChildAt(i).getHeight();
        }
        int iM208412y0 = ((int) (((double) height) + (((double) (xdl0.m208412y0() - xdl0.m208407w(40.0f))) / 2.22d))) + xdl0.m208407w(72.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(xdl0.m208412y0(), iM208412y0, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        m195354u(canvas, bitmapDecodeResource, 0, 0, xdl0.m208412y0(), iM208412y0, 0, 0);
        m195353s(canvas, bitmapCreateBitmap, xdl0.m208407w(20.0f), xdl0.m208407w(36.0f), this.f178349b.getWidth(), this.f178349b.getHeight(), 0, 0);
        m195353s(canvas, bitmapDecodeResource2, xdl0.m208407w(20.0f), this.f178349b.getHeight() + xdl0.m208407w(36.0f), xdl0.m208412y0() - xdl0.m208407w(40.0f), (int) (((double) (xdl0.m208412y0() - xdl0.m208407w(40.0f))) / 2.22d), 0, 0);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: s */
    public void m195353s(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
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
    public void m195354u(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
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
    public final /* synthetic */ void m195355x(String str, View view) {
        zvf0.m220399u("e_user_profile_share_popup_share", act().pageId(), vwb.m200311Y("share_pannel", "save_picture"));
        this.f178344A.duringCreated(CoreModule.f17545c.f19642f0.m33105rg(str)).subscribe(mkd0.m154956H(new e30() { // from class: l.oue0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145694a.m195332C((Boolean) obj);
            }
        }, new e30() { // from class: l.pue0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("该用户未开启分享功能");
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m195356z(Boolean bool) throws Throwable {
        if (bool.booleanValue()) {
            syj.m186682k(m195352q(), true);
        } else {
            lsi0.m151595y("该用户未开启分享功能");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
