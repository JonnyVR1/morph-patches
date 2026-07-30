package p003l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.android.app.Act;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import l.e30;
import l.mkd0;
import l.qib0;
import l.z3g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ll/s5h0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/tantan/library/svga/compose/SVGADynamicEntity;", "entity", "", "url", "key", "", "newWidth", "newHeight", "Ll/e30;", "", "imageLoadCallback", "", "f", "(Lcom/p1/mobile/android/app/Act;Lcom/tantan/library/svga/compose/SVGADynamicEntity;Ljava/lang/String;Ljava/lang/String;IILl/e30;)V", "Landroid/graphics/Bitmap;", "bm", "e", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "b_core_base"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
@SourceDebugExtension
public final class s5h0 {

    @NotNull
    public static final s5h0 INSTANCE = new s5h0();

    /* JADX INFO: renamed from: a */
    public static void m9234a(e30 e30Var, Throwable th) {
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9235b(String str, final int i, final int i2, final z3g0 z3g0Var) {
        z3g0Var.getClass();
        qib0.G.I(str, new e30() { // from class: l.r5h0
            public final void call(Object obj) {
                s5h0.m9239h(z3g0Var, i, i2, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static void m9236c(e30 e30Var, SVGADynamicEntity sVGADynamicEntity, String str, Bitmap bitmap) {
        Unit unit;
        if (bitmap != null) {
            sVGADynamicEntity.setDynamicImage(bitmap, str);
            if (e30Var != null) {
                e30Var.call(Boolean.TRUE);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9239h(z3g0 z3g0Var, int i, int i2, Bitmap bitmap) {
        z3g0Var.onNext(INSTANCE.m9240e(bitmap, i, i2));
    }

    /* JADX INFO: renamed from: e */
    public final Bitmap m9240e(Bitmap bm, int newWidth, int newHeight) {
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
    public final void m9241f(@Nullable Act act, @NotNull final SVGADynamicEntity entity, @NotNull final String url, @NotNull final String key, final int newWidth, final int newHeight, @Nullable final e30<Boolean> imageLoadCallback) {
        c cVarDuringCreated;
        c cVarCompose;
        entity.getClass();
        url.getClass();
        key.getClass();
        if (act == null || (cVarDuringCreated = act.duringCreated(c.create(new c.a() { // from class: l.o5h0
            public final void call(Object obj) {
                s5h0.m9235b(url, newWidth, newHeight, (z3g0) obj);
            }
        }))) == null || (cVarCompose = cVarDuringCreated.compose(mkd0.C())) == null) {
            return;
        }
        cVarCompose.subscribe(mkd0.H(new e30() { // from class: l.p5h0
            public final void call(Object obj) {
                s5h0.m9236c(imageLoadCallback, entity, key, (Bitmap) obj);
            }
        }, new e30() { // from class: l.q5h0
            public final void call(Object obj) {
                s5h0.m9234a(imageLoadCallback, (Throwable) obj);
            }
        }));
    }
}
