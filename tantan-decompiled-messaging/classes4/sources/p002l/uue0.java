package p002l;

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
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.eqh0;
import l.f9k0;
import l.i0g0;
import l.j760;
import l.l480;
import l.lsi0;
import l.mkd0;
import l.ngm;
import l.qib0;
import l.s7m;
import l.syj;
import l.t100;
import l.vue0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.ym2;
import l.zub;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uue0 implements s7m<iue0> {

    /* JADX INFO: renamed from: A */
    public Act f20803A;

    /* JADX INFO: renamed from: B */
    public iue0 f20804B;

    /* JADX INFO: renamed from: C */
    public Picture.ImageUri f20805C = null;

    /* JADX INFO: renamed from: D */
    public Media f20806D = null;

    /* JADX INFO: renamed from: a */
    public ScrollView f20807a;

    /* JADX INFO: renamed from: b */
    public VLinear f20808b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f20809c;

    /* JADX INFO: renamed from: d */
    public VText f20810d;

    /* JADX INFO: renamed from: e */
    public VText f20811e;

    /* JADX INFO: renamed from: f */
    public VText f20812f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f20813g;

    /* JADX INFO: renamed from: h */
    public VText f20814h;

    /* JADX INFO: renamed from: i */
    public VText f20815i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f20816j;

    /* JADX INFO: renamed from: k */
    public VText f20817k;

    /* JADX INFO: renamed from: l */
    public VText f20818l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f20819m;

    /* JADX INFO: renamed from: n */
    public VText f20820n;

    /* JADX INFO: renamed from: o */
    public VText f20821o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f20822p;

    /* JADX INFO: renamed from: q */
    public VText f20823q;

    /* JADX INFO: renamed from: r */
    public VText f20824r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f20825s;

    /* JADX INFO: renamed from: t */
    public VText f20826t;

    /* JADX INFO: renamed from: u */
    public VText f20827u;

    /* JADX INFO: renamed from: v */
    public VLinear f20828v;

    /* JADX INFO: renamed from: w */
    public VLinear f20829w;

    /* JADX INFO: renamed from: x */
    public VLinear f20830x;

    /* JADX INFO: renamed from: y */
    public View f20831y;

    /* JADX INFO: renamed from: z */
    public VText f20832z;

    /* JADX INFO: renamed from: l.uue0$a */
    public class C0856a extends ym2 {
        public C0856a() {
        }

        /* JADX INFO: renamed from: c */
        public void m23629c(String str, Throwable th) {
            super.c(str, th);
        }

        /* JADX INFO: renamed from: h */
        public void m23630h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
        }
    }

    public uue0(Act act) {
        this.f20803A = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public /* synthetic */ void m23601A(String str, View view) {
        zvf0.u("e_user_profile_share_popup_share", act().pageId(), new j760[]{vwb.Y("share_pannel", "wechat_moment")});
        if (f9k0.c(str)) {
            lsi0.y("此用户不可被分享");
        } else {
            this.f20803A.duringCreated(CoreModule.c.f0.rg(str)).subscribe(mkd0.H(new e30() { // from class: l.sue0
                public final void call(Object obj) {
                    this.f19296a.m23628z((Boolean) obj);
                }
            }, new e30() { // from class: l.tue0
                public final void call(Object obj) {
                    lsi0.y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m23602C(Boolean bool) {
        if (!bool.booleanValue()) {
            lsi0.y("该用户未开启分享功能");
        } else {
            final Bitmap bitmapM23624q = m23624q();
            syj.d(this.f20803A, new d30() { // from class: l.kue0
                public final void call() {
                    this.f14533a.m23618B(bitmapM23624q);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m23614v(View view) {
        zvf0.r("e_user_profile_share_popup_cancel", act().pageId());
        this.f20803A.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m23615w(Boolean bool) {
        if (bool.booleanValue()) {
            syj.k(m23624q(), false);
        } else {
            lsi0.y("该用户未开启分享功能");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m23616y(String str, View view) {
        zvf0.u("e_user_profile_share_popup_share", act().pageId(), new j760[]{vwb.Y("share_pannel", "wechat_friend")});
        if (f9k0.c(str)) {
            lsi0.y("此用户不可被分享");
        } else {
            this.f20803A.duringCreated(CoreModule.c.f0.rg(str)).subscribe(mkd0.H(new e30() { // from class: l.que0
                public final void call(Object obj) {
                    this.f18237a.m23615w((Boolean) obj);
                }
            }, new e30() { // from class: l.rue0
                public final void call(Object obj) {
                    lsi0.y("该用户未开启分享功能");
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m23617A3(final String str) {
        User userOa;
        if (NullChecker.a(CoreModule.c.e0.oa(str))) {
            userOa = CoreModule.c.e0.oa(str);
        } else {
            this.f20803A.finish();
            userOa = null;
        }
        this.f20812f.setTypeface(eqh0.c(3), 1);
        boolean zIsEmpty = TextUtils.isEmpty(userOa.name);
        VText vText = this.f20810d;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setTypeface(eqh0.c(3), 1);
            this.f20810d.setText(userOa.name);
        }
        boolean zA = NullChecker.a(userOa.age);
        VText vText2 = this.f20811e;
        if (zA) {
            vText2.setText(userOa.age + "");
        } else {
            vText2.setVisibility(8);
        }
        String strJ0 = i0g0.j0(userOa.profile.zodiac);
        boolean zIsEmpty2 = TextUtils.isEmpty(strJ0);
        LinearLayout linearLayout = this.f20813g;
        if (zIsEmpty2) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.f20815i.setText(strJ0);
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(userOa.profile.work.industry);
        LinearLayout linearLayout2 = this.f20816j;
        if (zIsEmpty3) {
            linearLayout2.setVisibility(8);
        } else {
            linearLayout2.setVisibility(0);
            this.f20818l.setText(userOa.profile.work.industry);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(userOa.profile.hometown);
        LinearLayout linearLayout3 = this.f20819m;
        if (zIsEmpty4) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
            this.f20821o.setText(userOa.profile.hometown);
        }
        boolean zIsEmpty5 = TextUtils.isEmpty(userOa.profile.hangouts);
        LinearLayout linearLayout4 = this.f20822p;
        if (zIsEmpty5) {
            linearLayout4.setVisibility(8);
        } else {
            linearLayout4.setVisibility(0);
            this.f20824r.setText(userOa.profile.hangouts);
        }
        boolean zIsEmpty6 = TextUtils.isEmpty(userOa.description);
        LinearLayout linearLayout5 = this.f20825s;
        if (zIsEmpty6) {
            linearLayout5.setVisibility(8);
        } else {
            linearLayout5.setVisibility(0);
            this.f20827u.setText(userOa.description);
        }
        xdl0.E0(this.f20832z, new View.OnClickListener() { // from class: l.jue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14026a.m23614v(view);
            }
        });
        xdl0.E0(this.f20828v, new View.OnClickListener() { // from class: l.lue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15069a.m23616y(str, view);
            }
        });
        xdl0.E0(this.f20829w, new View.OnClickListener() { // from class: l.mue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15638a.m23601A(str, view);
            }
        });
        xdl0.E0(this.f20830x, new View.OnClickListener() { // from class: l.nue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16201a.m23627x(str, view);
            }
        });
        this.f20809c.setAspectRatio(0.88f);
        m23620E(this.f20809c);
        Media media = CoreModule.c.e0.oa(str).media(0);
        this.f20806D = media;
        if (media instanceof Video) {
            this.f20805C = media.cover().aspectRatioBiggest();
        } else {
            this.f20805C = zub.f(media);
        }
        qib0.G.C0(this.f20809c, this.f20805C, new C0856a());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m23618B(Bitmap bitmap) {
        if (syj.i(this.f20803A, "", bitmap)) {
            lsi0.j("图片已保存到相册");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23619C0() {
        return this.f20803A;
    }

    /* JADX INFO: renamed from: E */
    public void m23620E(SimpleDraweeView simpleDraweeView) {
        RoundingParams roundingParamsP = simpleDraweeView.getHierarchy().p();
        if (roundingParamsP == null) {
            roundingParamsP = new RoundingParams();
        }
        int i = t100.o;
        roundingParamsP.r(i, i, 0.0f, 0.0f);
        simpleDraweeView.getHierarchy().H(roundingParamsP);
        simpleDraweeView.getHierarchy().z(x2c0.n2);
        simpleDraweeView.getHierarchy().E(new l480(i, 3));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23622n(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public View m23622n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vue0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void m23621i1(iue0 iue0Var) {
        this.f20804B = iue0Var;
    }

    /* JADX INFO: renamed from: q */
    public final Bitmap m23624q() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f20803A.getResources(), x2c0.ep);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(this.f20803A.getResources(), x2c0.fp);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f20808b.getWidth(), this.f20808b.getHeight(), Bitmap.Config.ARGB_4444);
        this.f20808b.draw(new Canvas(bitmapCreateBitmap));
        int height = 0;
        for (int i = 0; i < this.f20807a.getChildCount(); i++) {
            height += this.f20807a.getChildAt(i).getHeight();
        }
        int iY0 = ((int) (((double) height) + (((double) (xdl0.y0() - xdl0.w(40.0f))) / 2.22d))) + xdl0.w(72.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(xdl0.y0(), iY0, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        m23626u(canvas, bitmapDecodeResource, 0, 0, xdl0.y0(), iY0, 0, 0);
        m23625s(canvas, bitmapCreateBitmap, xdl0.w(20.0f), xdl0.w(36.0f), this.f20808b.getWidth(), this.f20808b.getHeight(), 0, 0);
        m23625s(canvas, bitmapDecodeResource2, xdl0.w(20.0f), this.f20808b.getHeight() + xdl0.w(36.0f), xdl0.y0() - xdl0.w(40.0f), (int) (((double) (xdl0.y0() - xdl0.w(40.0f))) / 2.22d), 0, 0);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: s */
    public void m23625s(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
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
    public void m23626u(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
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
    public final /* synthetic */ void m23627x(String str, View view) {
        zvf0.u("e_user_profile_share_popup_share", act().pageId(), new j760[]{vwb.Y("share_pannel", "save_picture")});
        this.f20803A.duringCreated(CoreModule.c.f0.rg(str)).subscribe(mkd0.H(new e30() { // from class: l.oue0
            public final void call(Object obj) {
                this.f16797a.m23602C((Boolean) obj);
            }
        }, new e30() { // from class: l.pue0
            public final void call(Object obj) {
                lsi0.y("该用户未开启分享功能");
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m23628z(Boolean bool) {
        if (bool.booleanValue()) {
            syj.k(m23624q(), true);
        } else {
            lsi0.y("该用户未开启分享功能");
        }
    }

    public void destroy() {
    }
}
