package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p000p1.mobile.putong.core.p001ui.messages.ItemSticker;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.data.UserSticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c3c0;
import l.e51;
import l.j760;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.roj0;
import l.rw6;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.bpz;
import p003l.dml;
import p003l.e30;
import p003l.m250;
import p003l.w9j;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemSticker extends FrameLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1366a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f1367b;

    /* JADX INFO: renamed from: c */
    public Message f1368c;

    /* JADX INFO: renamed from: d */
    public Sticker f1369d;

    /* JADX INFO: renamed from: e */
    public String f1370e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemSticker$a */
    public class RunnableC0093a implements Runnable {
        public RunnableC0093a() {
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m1762b(Throwable th) {
            if ((th instanceof TantanException.Client.TantanForbidden) && ((TantanException.Client.TantanForbidden) th).code == 40327) {
                lsi0.w(R.string.m6);
            } else {
                lsi0.w(R.string.g6);
                e51.H(CoreModule.b, new Runnable() { // from class: l.keq
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.Z.T.z();
                    }
                }, 50L);
            }
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m1765e(roj0 roj0Var) {
            if (!vwb.J(ItemSticker.this.f1369d.pictures)) {
                qib0.G.x0(((Media) ((Picture) ItemSticker.this.f1369d.pictures.get(0))).url);
                if (!vwb.J(((Picture) ItemSticker.this.f1369d.pictures.get(0)).attachments)) {
                    qib0.G.x0(((Media) ((Picture) ((Picture) ItemSticker.this.f1369d.pictures.get(0)).attachments.get(0))).url);
                }
            }
            lsi0.w(R.string.h6);
            e51.H(CoreModule.b, new Runnable() { // from class: l.jeq
                @Override // java.lang.Runnable
                public final void run() {
                    CoreModule.c.Z.T.z();
                }
            }, 50L);
        }

        @Override // java.lang.Runnable
        public void run() {
            zvf0.r("e_add_stickers", "p_chat_view");
            if (!NullChecker.a(CoreModule.c.Z.T.n()) || vwb.J(((CoreData) CoreModule.c.Z.T.n()).userStickers) || vwb.J(((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers) || ((UserSticker) ((CoreData) CoreModule.c.Z.T.n()).userStickers.get(0)).favoriteStickers.size() < 300) {
                ItemSticker.this.getContext().duringCreated(CoreModule.c.Z.T.O(ItemSticker.this.f1369d)).subscribe((m250) mkd0.H(new e30() { // from class: l.heq
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f4179a.m1765e((roj0) obj);
                    }
                }, new e30() { // from class: l.ieq
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        ItemSticker.RunnableC0093a.m1762b((Throwable) obj);
                    }
                }));
            } else {
                lsi0.w(R.string.m6);
            }
        }
    }

    public ItemSticker(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1748b(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m1749c(SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        if (NullChecker.a(bitmap)) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean m1753j(View view) {
        return ItemMessageBase.m1395R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m1754k(Bitmap bitmap) {
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

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        Sticker sticker;
        if (!CoreModule.P().i().q() || (sticker = this.f1369d) == null || (NullChecker.a(sticker) && !this.f1369d.couldAdd())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Z(getResources().getString(R.string.f6), new RunnableC0093a(), Integer.valueOf(c3c0.p1), (Object) null));
        return arrayList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, final Message message, InterfaceC0102a.a aVar) {
        this.f1368c = message;
        final Sticker stickerS3 = CoreModule.c.Z.s3(message.sticker);
        if (stickerS3 == null) {
            return;
        }
        if (TEnum.equals(stickerS3.source, "intimate") && !vwb.J(stickerS3.pictures) && !vwb.J(((Picture) stickerS3.pictures.get(0)).attachments) && ((Picture) stickerS3.pictures.get(0)).attachments.size() >= 2 && TextUtils.equals(((Media) ((Picture) ((Picture) stickerS3.pictures.get(0)).attachments.get(1))).mediaType, "svga") && (getContext() instanceof Act)) {
            xdl0.M(this.f1366a, false);
            xdl0.M(this.f1367b, true);
            m1758l(message.isMe(), message.cid, (Act) getContext(), dmlVar, (Picture) ((Picture) stickerS3.pictures.get(0)).attachments.get(1));
            return;
        }
        this.f1370e = null;
        xdl0.M(this.f1366a, true);
        xdl0.M(this.f1367b, false);
        this.f1369d = stickerS3;
        List list = stickerS3.pictures;
        if (list == null || list.isEmpty() || m1755g(stickerS3)) {
            setTag("");
            setBackgroundColor(0);
            qib0.G.L0(this.f1366a, "");
            requestLayout();
            return;
        }
        Picture picture = (Picture) stickerS3.pictures.get(0);
        if (NullChecker.a(picture.attachments) && !picture.attachments.isEmpty()) {
            picture = (Picture) picture.attachments.get(0);
        }
        if ((TEnum.equals(stickerS3.source, "unknown_") || TEnum.equals(stickerS3.source, "internal") || TEnum.equals(stickerS3.source, "favorite")) && (!CoreModule.P().i().G1() || (CoreModule.P().i().G1() && !((Media) picture).mediaType.contains("gif")))) {
            j760 j760VarStickerItemInMessages = picture.stickerItemInMessages();
            getLayoutParams().width = ((Point) j760VarStickerItemInMessages.b).x;
            getLayoutParams().height = ((Point) j760VarStickerItemInMessages.b).y;
            if (CoreModule.P().i().G1()) {
                int iD = t100.d(100.0f);
                getLayoutParams().width = iD;
                getLayoutParams().height = iD;
            }
            setTag("");
            setBackgroundColor(0);
            qib0.G.B0(this.f1366a, (Picture.ImageUri) j760VarStickerItemInMessages.a);
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
            if (TEnum.equals(stickerS3.source, "sogou")) {
                i = 95;
                i3 = 95;
            }
            int iD2 = t100.d(i);
            int iD3 = t100.d(i3);
            if (iD2 >= xdl0.y0() / 2) {
                iD3 = (int) ((((((double) xdl0.y0()) * 1.0d) * ((double) iD3)) / 2.0d) / ((double) iD2));
                iD2 = xdl0.y0() / 2;
            }
            getLayoutParams().width = iD2;
            getLayoutParams().height = iD3;
            if (CoreModule.P().i().G1()) {
                int iD4 = t100.d(100.0f);
                getLayoutParams().width = iD4;
                getLayoutParams().height = iD4;
            }
            if (TEnum.equals(stickerS3.source, "poke")) {
                getLayoutParams().width = t100.d(80.0f);
                getLayoutParams().height = t100.d(80.0f);
            }
            Object tag = getTag();
            if (!(tag instanceof String) || !((String) tag).equals(((Media) picture).url)) {
                setTag(((Media) picture).url);
                if (CoreModule.P().i().G1()) {
                    setBackgroundColor(0);
                } else {
                    setBackgroundResource(c3c0.E7);
                }
                if ((this.f1366a.getWidth() > 0 && this.f1366a.getWidth() < 10) || (this.f1366a.getHeight() > 0 && this.f1366a.getHeight() < 10)) {
                    this.f1366a.setRight(getLayoutParams().width);
                    this.f1366a.setBottom(getLayoutParams().height);
                }
                qib0.G.L0(this.f1366a, ((Media) picture).url);
                requestLayout();
            }
        }
        if (TEnum.equals(stickerS3.source, "poke")) {
            xdl0.E0(this, new View.OnClickListener() { // from class: l.aeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f2170a.m1757i(stickerS3, message, view);
                }
            });
        } else {
            setOnClickListener(null);
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.beq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f2386a.m1753j(view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1755g(Sticker sticker) {
        if (!TEnum.equals(sticker.source, "sogou") || vwb.J(sticker.pictures)) {
            return false;
        }
        Picture picture = (Picture) sticker.pictures.get(0);
        return "image/gif".equals(((Media) picture).mediaType) && !((Media) picture).url.endsWith(".gif");
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1756h(Picture picture, String str, boolean z, User user) {
        m1759n(picture, str, rw6.a(CoreModule.c.e0.na()).profileSmall().formatted(), rw6.a(user).profileSmall().formatted(), z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m1757i(Sticker sticker, Message message, View view) {
        String strM2304o = MessageWarmingUpHelper.m2304o(sticker);
        if (!TextUtils.isEmpty(strM2304o) && (getContext() instanceof MessagesAct) && (((MessagesAct) getContext()).m2072w2() instanceof bpz)) {
            ((bpz) ((MessagesAct) getContext()).m2072w2()).m3104b5(message, strM2304o, sticker);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1758l(final boolean z, String str, Act act, dml dmlVar, final Picture picture) {
        final String str2 = ((Media) picture).url;
        if (TextUtils.equals(this.f1370e, str2)) {
            return;
        }
        this.f1370e = str2;
        dmlVar.mo3522c(act, CoreModule.c.e0.Ka(str)).first().subscribe((m250) mkd0.G(new e30() { // from class: l.ceq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2633a.m1756h(picture, str2, z, (User) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m1759n(Picture picture, String str, String str2, String str3, boolean z) {
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        m1760o(sVGADynamicEntity, z ? str2 : str3, "image1");
        if (z) {
            str2 = str3;
        }
        m1760o(sVGADynamicEntity, str2, "image2");
        SVGALoader.with(getContext()).from(str).repeatCount(-1).dynamic(sVGADynamicEntity).into(this.f1367b);
        this.f1367b.startAnimation();
        int iD = t100.d(picture.size.width);
        int iD2 = t100.d(picture.size.height);
        if (iD <= 50 || iD2 <= 50) {
            iD = t100.d(150.0f);
            iD2 = iD;
        }
        getLayoutParams().width = iD;
        getLayoutParams().height = iD2;
        requestLayout();
    }

    /* JADX INFO: renamed from: o */
    public final void m1760o(final SVGADynamicEntity sVGADynamicEntity, String str, final String str2) {
        qib0.G.E(str).filter(new w9j() { // from class: l.deq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((Bitmap) obj));
            }
        }).map(new w9j() { // from class: l.eeq
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ItemSticker.m1754k((Bitmap) obj);
            }
        }).subscribe((m250) mkd0.H(new e30() { // from class: l.feq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemSticker.m1749c(sVGADynamicEntity, str2, (Bitmap) obj);
            }
        }, new e30() { // from class: l.geq
            @Override // p003l.e30
            public final void call(Object obj) {
                ItemSticker.m1748b((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1366a = (VDraweeView) findViewById(y4c0.f);
        this.f1367b = findViewById(y4c0.r4);
    }

    public ItemSticker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemSticker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
