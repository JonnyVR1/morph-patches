package p153l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/aeh0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", "url", Constants.KEY_KEY, "", "newWidth", "newHeight", "Ll/y20;", "", "imageLoadCallback", "", "f", "(Lcom/p1/mobile/android/app/Act;Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;IILl/y20;)V", "Landroid/graphics/Bitmap;", "bm", "e", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "b_core_base"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class aeh0 {

    @NotNull
    public static final aeh0 INSTANCE = new aeh0();

    /* JADX INFO: renamed from: a */
    public static void m97241a(y20 y20Var, Throwable th) {
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m97242b(String str, final int i, final int i2, final gcg0 gcg0Var) {
        gcg0Var.getClass();
        uqb0.f180374G.m127108I(str, new y20() { // from class: l.zdh0
            @Override // p153l.y20
            public final void call(Object obj) {
                aeh0.m97246h(gcg0Var, i, i2, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m97243c(y20 y20Var, SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        Unit unit;
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
            if (y20Var != null) {
                y20Var.call(Boolean.TRUE);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m97246h(gcg0 gcg0Var, int i, int i2, Bitmap bitmap) {
        gcg0Var.m137019l(INSTANCE.m97247e(bitmap, i, i2));
    }

    /* JADX INFO: renamed from: e */
    public final Bitmap m97247e(Bitmap bm, int newWidth, int newHeight) {
        int i;
        int i2;
        if (bm == null) {
            return null;
        }
        int width = bm.getWidth();
        int height = bm.getHeight();
        if (width <= 0 || height <= 0 || newWidth <= 0 || newHeight <= 0) {
            return bm;
        }
        if (width / height > newWidth / newHeight) {
            i = (newWidth * height) / newHeight;
            i2 = height;
        } else {
            i = width;
            i2 = (newHeight * width) / newWidth;
        }
        return Bitmap.createBitmap(bm, width > i ? (width - i) / 2 : 0, height > i2 ? (height - i2) / 2 : 0, i, i2, (Matrix) null, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m97248f(@Nullable Act act, @NotNull final SVGADynamicEntity entity, @NotNull final String url, @NotNull final String key, final int newWidth, final int newHeight, @Nullable final y20<Boolean> imageLoadCallback) {
        C22421c c22421cDuringCreated;
        C22421c c22421cCompose;
        entity.getClass();
        url.getClass();
        key.getClass();
        if (act == null || (c22421cDuringCreated = act.duringCreated(C22421c.create(new C22421c.a() { // from class: l.wdh0
            @Override // p153l.y20
            public final void call(Object obj) {
                aeh0.m97242b(url, newWidth, newHeight, (gcg0) obj);
            }
        }))) == null || (c22421cCompose = c22421cDuringCreated.compose(psd0.m173592C())) == null) {
            return;
        }
        c22421cCompose.subscribe(psd0.m173597H(new y20() { // from class: l.xdh0
            @Override // p153l.y20
            public final void call(Object obj) {
                aeh0.m97243c(imageLoadCallback, entity, key, (Bitmap) obj);
            }
        }, new y20() { // from class: l.ydh0
            @Override // p153l.y20
            public final void call(Object obj) {
                aeh0.m97241a(imageLoadCallback, (Throwable) obj);
            }
        }));
    }
}
