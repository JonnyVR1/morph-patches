package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemSticker;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dgq;
import p153l.edc0;
import p153l.egq;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.o1j0;
import p153l.ovb0;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qa00;
import p153l.uqb0;
import p153l.ux6;
import p153l.uxj0;
import p153l.y20;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSticker extends FrameLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32323a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f32324b;

    /* JADX INFO: renamed from: c */
    public Message f32325c;

    /* JADX INFO: renamed from: d */
    public Sticker f32326d;

    /* JADX INFO: renamed from: e */
    public String f32327e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSticker$a */
    public class RunnableC8673a implements Runnable {
        public RunnableC8673a() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m49861b(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
                o1j0.m165649w(R$string.f21773m6);
            } else {
                o1j0.m165649w(R$string.f21719g6);
                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.kgq
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20366Z.f20885T.m159280q();
                    }
                }, 50L);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m49864e(uxj0 uxj0Var) {
            if (!jyb.m147479J(ItemSticker.this.f32326d.pictures)) {
                uqb0.f180374G.m127160x0(ItemSticker.this.f32326d.pictures.get(0).url);
                if (!jyb.m147479J(ItemSticker.this.f32326d.pictures.get(0).attachments)) {
                    uqb0.f180374G.m127160x0(ItemSticker.this.f32326d.pictures.get(0).attachments.get(0).url);
                }
            }
            o1j0.m165649w(R$string.f21728h6);
            l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.jgq
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f18264c.f20366Z.f20885T.m159280q();
                }
            }, 50L);
        }

        @Override // java.lang.Runnable
        public void run() {
            i4g0.m138520r("e_add_stickers", OMSDialogPositon.p_chat_view);
            if (!NullChecker.m82486a(CoreModule.f18264c.f20366Z.f20885T.m159277n()) || jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers) || jyb.m147479J(CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers) || CoreModule.f18264c.f20366Z.f20885T.m159277n().userStickers.get(0).favoriteStickers.size() < 300) {
                ((Act) ItemSticker.this.getContext()).duringCreated(CoreModule.f18264c.f20366Z.f20885T.m35953O(ItemSticker.this.f32326d)).subscribe(psd0.m173597H(new y20() { // from class: l.hgq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f109429a.m49864e((uxj0) obj);
                    }
                }, new y20() { // from class: l.igq
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ItemSticker.RunnableC8673a.m49861b((Throwable) obj);
                    }
                }));
            } else {
                o1j0.m165649w(R$string.f21773m6);
            }
        }
    }

    public ItemSticker(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49847b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m49848c(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.m82486a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean m49852j(View view) {
        return ItemMessageBase.m49494R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m49853k(Bitmap bitmap) {
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f2 = height / 2;
        if (width > height) {
            i4 = (width - height) / 2;
            i2 = height;
            i = i4 + height;
            f = f2;
            i3 = 0;
        } else if (height > width) {
            i3 = (height - width) / 2;
            f = width / 2;
            i = width;
            i2 = i3 + width;
            i4 = 0;
        } else {
            i = width;
            i2 = height;
            f = f2;
            i3 = 0;
            i4 = 0;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(i4, i3, i, i2);
        RectF rectF = new RectF(rect);
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        Sticker sticker;
        if (!CoreModule.m30933P().m143412i().mo180523q() || (sticker = this.f32326d) == null || (NullChecker.m82486a(sticker) && !this.f32326d.couldAdd())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147495Z(getResources().getString(R$string.f21710f6), new RunnableC8673a(), Integer.valueOf(ibc0.f114104p1), null));
        return arrayList;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, final Message message, InterfaceC8682a.a aVar) {
        this.f32325c = message;
        final Sticker stickerM35930s3 = CoreModule.f18264c.f20366Z.m35930s3(message.sticker);
        if (stickerM35930s3 == null) {
            return;
        }
        if (TEnum.equals(stickerM35930s3.source, "intimate") && !jyb.m147479J(stickerM35930s3.pictures) && !jyb.m147479J(stickerM35930s3.pictures.get(0).attachments) && stickerM35930s3.pictures.get(0).attachments.size() >= 2 && TextUtils.equals(stickerM35930s3.pictures.get(0).attachments.get(1).mediaType, "svga") && (getContext() instanceof Act)) {
            bnl0.m105524M(this.f32323a, false);
            bnl0.m105524M(this.f32324b, true);
            m49857l(message.isMe(), message.cid, (Act) getContext(), polVar, stickerM35930s3.pictures.get(0).attachments.get(1));
            return;
        }
        this.f32327e = null;
        bnl0.m105524M(this.f32323a, true);
        bnl0.m105524M(this.f32324b, false);
        this.f32326d = stickerM35930s3;
        List<Picture> list = stickerM35930s3.pictures;
        if (list == null || list.isEmpty() || m49854g(stickerM35930s3)) {
            setTag("");
            setBackgroundColor(0);
            uqb0.f180374G.m127115L0(this.f32323a, "");
            requestLayout();
            return;
        }
        Picture picture = stickerM35930s3.pictures.get(0);
        if (NullChecker.m82486a(picture.attachments) && !picture.attachments.isEmpty()) {
            picture = picture.attachments.get(0);
        }
        if ((TEnum.equals(stickerM35930s3.source, "unknown_") || TEnum.equals(stickerM35930s3.source, "internal") || TEnum.equals(stickerM35930s3.source, "favorite")) && (!CoreModule.m30933P().m143412i().mo180325G1() || (CoreModule.m30933P().m143412i().mo180325G1() && !picture.mediaType.contains("gif")))) {
            pf60<Picture.ImageUri, Point> pf60VarStickerItemInMessages = picture.stickerItemInMessages();
            getLayoutParams().width = pf60VarStickerItemInMessages.f152157b.x;
            getLayoutParams().height = pf60VarStickerItemInMessages.f152157b.y;
            if (CoreModule.m30933P().m143412i().mo180325G1()) {
                int iM175859d = qa00.m175859d(100.0f);
                getLayoutParams().width = iM175859d;
                getLayoutParams().height = iM175859d;
            }
            setTag("");
            setBackgroundColor(0);
            uqb0.f180374G.m127096B0(this.f32323a, pf60VarStickerItemInMessages.f152156a);
            requestLayout();
        } else {
            Dimension dimension = picture.size;
            int i = dimension.width;
            int i2 = dimension.height;
            int i3 = 58;
            if (i < 58) {
                i2 = (int) ((((double) i2) * 58.0d) / ((double) i));
                i = 58;
            }
            if (i2 < 58) {
                i = (int) ((58.0d * ((double) i)) / ((double) i2));
            } else {
                i3 = i2;
            }
            if (TEnum.equals(stickerM35930s3.source, "sogou")) {
                i = 95;
                i3 = 95;
            }
            int iM175859d2 = qa00.m175859d(i);
            int iM175859d3 = qa00.m175859d(i3);
            if (iM175859d2 >= bnl0.m105592y0() / 2) {
                iM175859d3 = (int) ((((((double) bnl0.m105592y0()) * 1.0d) * ((double) iM175859d3)) / 2.0d) / ((double) iM175859d2));
                iM175859d2 = bnl0.m105592y0() / 2;
            }
            getLayoutParams().width = iM175859d2;
            getLayoutParams().height = iM175859d3;
            if (CoreModule.m30933P().m143412i().mo180325G1()) {
                int iM175859d4 = qa00.m175859d(100.0f);
                getLayoutParams().width = iM175859d4;
                getLayoutParams().height = iM175859d4;
            }
            if (TEnum.equals(stickerM35930s3.source, "poke")) {
                getLayoutParams().width = qa00.m175859d(80.0f);
                getLayoutParams().height = qa00.m175859d(80.0f);
            }
            Object tag = getTag();
            if (!(tag instanceof String) || !((String) tag).equals(picture.url)) {
                setTag(picture.url);
                if (CoreModule.m30933P().m143412i().mo180325G1()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundResource(ibc0.f113786E7);
                }
                if ((this.f32323a.getWidth() > 0 && this.f32323a.getWidth() < 10) || (this.f32323a.getHeight() > 0 && this.f32323a.getHeight() < 10)) {
                    this.f32323a.setRight(getLayoutParams().width);
                    this.f32323a.setBottom(getLayoutParams().height);
                }
                uqb0.f180374G.m127115L0(this.f32323a, picture.url);
                requestLayout();
            }
        }
        if (TEnum.equals(stickerM35930s3.source, "poke")) {
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.agq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f71271a.m49856i(stickerM35930s3, message, view);
                }
            });
        } else {
            setOnClickListener(null);
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.bgq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f76678a.m49852j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final boolean m49854g(Sticker sticker) {
        if (!TEnum.equals(sticker.source, "sogou") || jyb.m147479J(sticker.pictures)) {
            return false;
        }
        Picture picture = sticker.pictures.get(0);
        return "image/gif".equals(picture.mediaType) && !picture.url.endsWith(".gif");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49855h(Picture picture, String str, boolean z, User user) {
        m49858n(picture, str, ux6.m198403a(CoreModule.f18264c.f20381e0.m116593na()).profileSmall().formatted(), ux6.m198403a(user).profileSmall().formatted(), z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49856i(Sticker sticker, Message message, View view) {
        String strM50368o = MessageWarmingUpHelper.m50368o(sticker);
        if (!TextUtils.isEmpty(strM50368o) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).m50164y2() instanceof yxz)) {
            ((yxz) ((MessagesAct) getContext()).m50164y2()).m217866b5(message, strM50368o, sticker);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m49857l(final boolean z, String str, Act act, pol polVar, final Picture picture) {
        final String str2 = picture.url;
        if (TextUtils.equals(this.f32327e, str2)) {
            return;
        }
        this.f32327e = str2;
        polVar.mo68557c(act, CoreModule.f18264c.f20381e0.m116483Ka(str)).first().subscribe(psd0.m173596G(new y20() { // from class: l.cgq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81692a.m49855h(picture, str2, z, (User) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m49858n(Picture picture, String str, String str2, String str3, boolean z) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        m49859o(sVGADynamicEntity, z ? str2 : str3, "image1");
        if (z) {
            str2 = str3;
        }
        m49859o(sVGADynamicEntity, str2, "image2");
        SVGALoader.with(getContext()).from(str).repeatCount(-1).dynamic(sVGADynamicEntity).into(this.f32324b);
        this.f32324b.startAnimation();
        int iM175859d = qa00.m175859d(picture.size.width);
        int iM175859d2 = qa00.m175859d(picture.size.height);
        if (iM175859d <= 50 || iM175859d2 <= 50) {
            iM175859d = qa00.m175859d(150.0f);
            iM175859d2 = iM175859d;
        }
        getLayoutParams().width = iM175859d;
        getLayoutParams().height = iM175859d2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public final void m49859o(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        uqb0.f180374G.m127100E(str).filter(new dgq()).map(new egq()).subscribe(psd0.m173597H(new y20() { // from class: l.fgq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemSticker.m49848c(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new y20() { // from class: l.ggq
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemSticker.m49847b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32323a = (VDraweeView) findViewById(edc0.f93357f);
        this.f32324b = (SVGAnimationView) findViewById(edc0.f93446r4);
    }

    public ItemSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
