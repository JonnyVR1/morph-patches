package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemSticker;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p149l.bpz;
import p149l.c3c0;
import p149l.deq;
import p149l.dml;
import p149l.e30;
import p149l.e51;
import p149l.eeq;
import p149l.j760;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.roj0;
import p149l.rw6;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemSticker extends FrameLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31475a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f31476b;

    /* JADX INFO: renamed from: c */
    public Message f31477c;

    /* JADX INFO: renamed from: d */
    public Sticker f31478d;

    /* JADX INFO: renamed from: e */
    public String f31479e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSticker$a */
    public class RunnableC8510a implements Runnable {
        public RunnableC8510a() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m48678b(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
                lsi0.m151593w(R$string.f21031m6);
            } else {
                lsi0.m151593w(R$string.f20977g6);
                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.keq
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19624Z.f20143T.m121236q();
                    }
                }, 50L);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m48681e(roj0 roj0Var) {
            if (!vwb.m200296J(ItemSticker.this.f31478d.pictures)) {
                qib0.f154691G.m102377x0(ItemSticker.this.f31478d.pictures.get(0).url);
                if (!vwb.m200296J(ItemSticker.this.f31478d.pictures.get(0).attachments)) {
                    qib0.f154691G.m102377x0(ItemSticker.this.f31478d.pictures.get(0).attachments.get(0).url);
                }
            }
            lsi0.m151593w(R$string.f20986h6);
            e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.jeq
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.f17545c.f19624Z.f20143T.m121236q();
                }
            }, 50L);
        }

        @Override // java.lang.Runnable
        public void run() {
            zvf0.m220396r("e_add_stickers", OMSDialogPositon.p_chat_view);
            if (!NullChecker.m81303a(CoreModule.f17545c.f19624Z.f20143T.m121233n()) || vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers) || vwb.m200296J(CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers) || CoreModule.f17545c.f19624Z.f20143T.m121233n().userStickers.get(0).favoriteStickers.size() < 300) {
                ((Act) ItemSticker.this.getContext()).duringCreated(CoreModule.f17545c.f19624Z.f20143T.m34950O(ItemSticker.this.f31478d)).subscribe(mkd0.m154956H(new e30() { // from class: l.heq
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f107390a.m48681e((roj0) obj);
                    }
                }, new e30() { // from class: l.ieq
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ItemSticker.RunnableC8510a.m48678b((Throwable) obj);
                    }
                }));
            } else {
                lsi0.m151593w(R$string.f21031m6);
            }
        }
    }

    public ItemSticker(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48664b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m48665c(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.m81303a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean m48669j(View view) {
        return ItemMessageBase.m48311R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m48670k(Bitmap bitmap) {
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

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        Sticker sticker;
        if (!CoreModule.m29935P().m94658i().mo158431q() || (sticker = this.f31478d) == null || (NullChecker.m81303a(sticker) && !this.f31478d.couldAdd())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200312Z(getResources().getString(R$string.f20968f6), new RunnableC8510a(), Integer.valueOf(c3c0.f78829p1), null));
        return arrayList;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, final Message message, InterfaceC8519a.a aVar) {
        this.f31477c = message;
        final Sticker stickerM34927s3 = CoreModule.f17545c.f19624Z.m34927s3(message.sticker);
        if (stickerM34927s3 == null) {
            return;
        }
        if (TEnum.equals(stickerM34927s3.source, "intimate") && !vwb.m200296J(stickerM34927s3.pictures) && !vwb.m200296J(stickerM34927s3.pictures.get(0).attachments) && stickerM34927s3.pictures.get(0).attachments.size() >= 2 && TextUtils.equals(stickerM34927s3.pictures.get(0).attachments.get(1).mediaType, "svga") && (getContext() instanceof Act)) {
            xdl0.m208344M(this.f31475a, false);
            xdl0.m208344M(this.f31476b, true);
            m48674l(message.isMe(), message.cid, (Act) getContext(), dmlVar, stickerM34927s3.pictures.get(0).attachments.get(1));
            return;
        }
        this.f31479e = null;
        xdl0.m208344M(this.f31475a, true);
        xdl0.m208344M(this.f31476b, false);
        this.f31478d = stickerM34927s3;
        List<Picture> list = stickerM34927s3.pictures;
        if (list == null || list.isEmpty() || m48671g(stickerM34927s3)) {
            setTag("");
            setBackgroundColor(0);
            qib0.f154691G.m102331L0(this.f31475a, "");
            requestLayout();
            return;
        }
        Picture picture = stickerM34927s3.pictures.get(0);
        if (NullChecker.m81303a(picture.attachments) && !picture.attachments.isEmpty()) {
            picture = picture.attachments.get(0);
        }
        if ((TEnum.equals(stickerM34927s3.source, "unknown_") || TEnum.equals(stickerM34927s3.source, "internal") || TEnum.equals(stickerM34927s3.source, "favorite")) && (!CoreModule.m29935P().m94658i().mo158233G1() || (CoreModule.m29935P().m94658i().mo158233G1() && !picture.mediaType.contains("gif")))) {
            j760<Picture.ImageUri, Point> j760VarStickerItemInMessages = picture.stickerItemInMessages();
            getLayoutParams().width = j760VarStickerItemInMessages.f116565b.x;
            getLayoutParams().height = j760VarStickerItemInMessages.f116565b.y;
            if (CoreModule.m29935P().m94658i().mo158233G1()) {
                int iM186890d = t100.m186890d(100.0f);
                getLayoutParams().width = iM186890d;
                getLayoutParams().height = iM186890d;
            }
            setTag("");
            setBackgroundColor(0);
            qib0.f154691G.m102312B0(this.f31475a, j760VarStickerItemInMessages.f116564a);
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
            if (TEnum.equals(stickerM34927s3.source, "sogou")) {
                i = 95;
                i3 = 95;
            }
            int iM186890d2 = t100.m186890d(i);
            int iM186890d3 = t100.m186890d(i3);
            if (iM186890d2 >= xdl0.m208412y0() / 2) {
                iM186890d3 = (int) ((((((double) xdl0.m208412y0()) * 1.0d) * ((double) iM186890d3)) / 2.0d) / ((double) iM186890d2));
                iM186890d2 = xdl0.m208412y0() / 2;
            }
            getLayoutParams().width = iM186890d2;
            getLayoutParams().height = iM186890d3;
            if (CoreModule.m29935P().m94658i().mo158233G1()) {
                int iM186890d4 = t100.m186890d(100.0f);
                getLayoutParams().width = iM186890d4;
                getLayoutParams().height = iM186890d4;
            }
            if (TEnum.equals(stickerM34927s3.source, "poke")) {
                getLayoutParams().width = t100.m186890d(80.0f);
                getLayoutParams().height = t100.m186890d(80.0f);
            }
            Object tag = getTag();
            if (!(tag instanceof String) || !((String) tag).equals(picture.url)) {
                setTag(picture.url);
                if (CoreModule.m29935P().m94658i().mo158233G1()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundResource(c3c0.f78511E7);
                }
                if ((this.f31475a.getWidth() > 0 && this.f31475a.getWidth() < 10) || (this.f31475a.getHeight() > 0 && this.f31475a.getHeight() < 10)) {
                    this.f31475a.setRight(getLayoutParams().width);
                    this.f31475a.setBottom(getLayoutParams().height);
                }
                qib0.f154691G.m102331L0(this.f31475a, picture.url);
                requestLayout();
            }
        }
        if (TEnum.equals(stickerM34927s3.source, "poke")) {
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.aeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f69073a.m48673i(stickerM34927s3, message, view);
                }
            });
        } else {
            setOnClickListener(null);
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.beq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f75190a.m48669j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final boolean m48671g(Sticker sticker) {
        if (!TEnum.equals(sticker.source, "sogou") || vwb.m200296J(sticker.pictures)) {
            return false;
        }
        Picture picture = sticker.pictures.get(0);
        return "image/gif".equals(picture.mediaType) && !picture.url.endsWith(".gif");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48672h(Picture picture, String str, boolean z, User user) {
        m48675n(picture, str, rw6.m181385a(CoreModule.f17545c.f19639e0.m169520na()).profileSmall().formatted(), rw6.m181385a(user).profileSmall().formatted(), z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48673i(Sticker sticker, Message message, View view) {
        String strM49185o = MessageWarmingUpHelper.m49185o(sticker);
        if (!TextUtils.isEmpty(strM49185o) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).m48980w2() instanceof bpz)) {
            ((bpz) ((MessagesAct) getContext()).m48980w2()).m103224b5(message, strM49185o, sticker);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m48674l(final boolean z, String str, Act act, dml dmlVar, final Picture picture) {
        final String str2 = picture.url;
        if (TextUtils.equals(this.f31479e, str2)) {
            return;
        }
        this.f31479e = str2;
        dmlVar.mo67374c(act, CoreModule.f17545c.f19639e0.m169410Ka(str)).first().subscribe(mkd0.m154955G(new e30() { // from class: l.ceq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80481a.m48672h(picture, str2, z, (User) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m48675n(Picture picture, String str, String str2, String str3, boolean z) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        m48676o(sVGADynamicEntity, z ? str2 : str3, "image1");
        if (z) {
            str2 = str3;
        }
        m48676o(sVGADynamicEntity, str2, "image2");
        SVGALoader.with(getContext()).from(str).repeatCount(-1).dynamic(sVGADynamicEntity).into(this.f31476b);
        this.f31476b.startAnimation();
        int iM186890d = t100.m186890d(picture.size.width);
        int iM186890d2 = t100.m186890d(picture.size.height);
        if (iM186890d <= 50 || iM186890d2 <= 50) {
            iM186890d = t100.m186890d(150.0f);
            iM186890d2 = iM186890d;
        }
        getLayoutParams().width = iM186890d;
        getLayoutParams().height = iM186890d2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public final void m48676o(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        qib0.f154691G.m102316E(str).filter(new deq()).map(new eeq()).subscribe(mkd0.m154956H(new e30() { // from class: l.feq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemSticker.m48665c(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new e30() { // from class: l.geq
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemSticker.m48664b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31475a = (VDraweeView) findViewById(y4c0.f196122f);
        this.f31476b = (SVGAnimationView) findViewById(y4c0.f196211r4);
    }

    public ItemSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
