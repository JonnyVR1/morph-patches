package com.p000p1.mobile.putong.core.p004ui.quickaudio.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.quickaudio.view.DropDownRadarView;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.UserSearchSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.r13;
import l.svq;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.e9c0;
import p006l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 82\u00020\u0001:\u0003!\u001d$B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\"R\u001a\u0010)\u001a\u00060&R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\u00060&R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010(R\u001c\u0010-\u001a\b\u0018\u00010&R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00103\u001a\u0002018\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0014\u00104\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010/R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00106¨\u00069"}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "", "pro", "width", "k", "(FI)F", "j", "(F)I", "h", "progress", "i", "(F)F", "Landroid/view/Choreographer;", "a", "Landroid/view/Choreographer;", "choreographer", "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", "circlePaint", "c", "bitmapPaint", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$a;", "d", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$a;", "circleDraw1", "e", "circleDraw2", "f", "circleDraw3", "g", "F", "interval", "", "J", "frequency", "initialRadius", "", "Z", "isNormalMode", "Companion", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropDownRadarView extends View {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final List<Integer> f5256k = CollectionsKt.listOf(new Integer[]{Integer.valueOf(x2c0.f25868Fi), Integer.valueOf(x2c0.f25931Hi), Integer.valueOf(x2c0.f25962Ii), Integer.valueOf(x2c0.f25993Ji), Integer.valueOf(x2c0.f26024Ki), Integer.valueOf(x2c0.f26055Li), Integer.valueOf(x2c0.f26086Mi), Integer.valueOf(x2c0.f26117Ni), Integer.valueOf(x2c0.f26148Oi), Integer.valueOf(x2c0.f25900Gi)});

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final List<Integer> f5257l = CollectionsKt.listOf(new Integer[]{Integer.valueOf(x2c0.f26179Pi), Integer.valueOf(x2c0.f26241Ri), Integer.valueOf(x2c0.f26272Si), Integer.valueOf(x2c0.f26303Ti), Integer.valueOf(x2c0.f26334Ui), Integer.valueOf(x2c0.f26365Vi), Integer.valueOf(x2c0.f26396Wi), Integer.valueOf(x2c0.f26427Xi), Integer.valueOf(x2c0.f26458Yi), Integer.valueOf(x2c0.f26210Qi)});

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final List<Integer> f5258m = CollectionsKt.listOf(new Integer[]{Integer.valueOf(x2c0.f26489Zi), Integer.valueOf(x2c0.f26553bj), Integer.valueOf(x2c0.f26585cj), Integer.valueOf(x2c0.f26617dj), Integer.valueOf(x2c0.f26648ej), Integer.valueOf(x2c0.f26680fj), Integer.valueOf(x2c0.f26712gj), Integer.valueOf(x2c0.f26744hj), Integer.valueOf(x2c0.f26775ij), Integer.valueOf(x2c0.f26521aj)});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public Choreographer choreographer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public Paint circlePaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public Paint bitmapPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C0250a circleDraw1;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public C0250a circleDraw2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public C0250a circleDraw3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float interval;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final long frequency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float initialRadius;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isNormalMode;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.DropDownRadarView$a */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00060\u0018R\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00060\u0018R\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010 \u001a\u00060\u0018R\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u001a\u0010\"\u001a\u00060\u0018R\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0015R$\u0010*\u001a\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R$\u00100\u001a\u0012\u0012\u0004\u0012\u00020,0+j\b\u0012\u0004\u0012\u00020,`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010\u0015¨\u00063"}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$a;", "", "Landroid/graphics/Paint;", "circlePaint", "bitmapPaint", "", "initProgress", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;Landroid/graphics/Paint;Landroid/graphics/Paint;F)V", "Landroid/graphics/Canvas;", "canvas", "", "b", "(Landroid/graphics/Canvas;)V", "a", "()V", "c", "Landroid/graphics/Paint;", "getCirclePaint", "()Landroid/graphics/Paint;", "getBitmapPaint", "F", "getInitProgress", "()F", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$c;", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;", "d", "Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$c;", "icoDraw1", "e", "icoDraw2", "f", "icoDraw3", "g", "icoDraw4", "h", "rotateSpeed", "Ljava/util/ArrayList;", "Landroid/graphics/Bitmap;", "Lkotlin/collections/ArrayList;", "i", "Ljava/util/ArrayList;", "icoList", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "j", "Ljava/util/HashSet;", "icoSet", "k", "progress", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public final class C0250a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Paint circlePaint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Paint bitmapPaint;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final float initProgress;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public C0252c icoDraw1;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public C0252c icoDraw2;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public C0252c icoDraw3;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public C0252c icoDraw4;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public float rotateSpeed;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final ArrayList<Bitmap> icoList;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final HashSet<Integer> icoSet;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public float progress;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ DropDownRadarView f5280l;

        public C0250a(@NotNull DropDownRadarView dropDownRadarView, @NotNull Paint paint, Paint paint2, float f) {
            paint.getClass();
            paint2.getClass();
            this.f5280l = dropDownRadarView;
            this.circlePaint = paint;
            this.bitmapPaint = paint2;
            this.initProgress = f;
            this.icoDraw1 = new C0252c(dropDownRadarView, paint2, 0.0f, f);
            this.icoDraw2 = new C0252c(dropDownRadarView, paint2, 90.0f, f);
            this.icoDraw3 = new C0252c(dropDownRadarView, paint2, 180.0f, f);
            this.icoDraw4 = new C0252c(dropDownRadarView, paint2, 270.0f, f);
            this.rotateSpeed = 3.0f;
            this.icoList = new ArrayList<>();
            this.icoSet = new HashSet<>();
            this.progress = f;
        }

        /* JADX INFO: renamed from: a */
        public final void m7948a() {
            this.progress += this.f5280l.frequency / this.f5280l.interval;
        }

        /* JADX INFO: renamed from: b */
        public final void m7949b(@NotNull Canvas canvas) {
            float fM7947k;
            canvas.getClass();
            if (this.progress >= 1.0f) {
                this.progress = 0.0f;
                if (this.f5280l.isNormalMode) {
                    this.rotateSpeed = ((float) Math.random()) * 3.0f;
                    m7950c();
                }
            }
            boolean z = this.f5280l.isNormalMode;
            Paint paint = this.circlePaint;
            if (z) {
                paint.setARGB(this.f5280l.m7946j(this.progress), 255, 255, 255);
                fM7947k = this.f5280l.m7947k(this.progress, canvas.getWidth());
            } else {
                paint.setARGB(this.f5280l.m7946j(this.initProgress), 255, 255, 255);
                fM7947k = this.f5280l.m7947k(this.initProgress, canvas.getWidth());
            }
            float f = fM7947k;
            canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, f, this.circlePaint);
            if (this.icoList.size() < 4) {
                m7950c();
            }
            C0252c c0252c = this.icoDraw1;
            float f2 = this.progress;
            float f3 = this.rotateSpeed;
            Bitmap bitmap = this.icoList.get(0);
            bitmap.getClass();
            c0252c.m7951a(canvas, f2, f, f3, bitmap);
            C0252c c0252c2 = this.icoDraw2;
            float f4 = this.progress;
            float f5 = this.rotateSpeed;
            Bitmap bitmap2 = this.icoList.get(1);
            bitmap2.getClass();
            c0252c2.m7951a(canvas, f4, f, f5, bitmap2);
            C0252c c0252c3 = this.icoDraw3;
            float f6 = this.progress;
            float f7 = this.rotateSpeed;
            Bitmap bitmap3 = this.icoList.get(2);
            bitmap3.getClass();
            c0252c3.m7951a(canvas, f6, f, f7, bitmap3);
            C0252c c0252c4 = this.icoDraw4;
            float f8 = this.progress;
            float f9 = this.rotateSpeed;
            Bitmap bitmap4 = this.icoList.get(3);
            bitmap4.getClass();
            c0252c4.m7951a(canvas, f8, f, f9, bitmap4);
        }

        /* JADX INFO: renamed from: c */
        public final void m7950c() {
            Bitmap bitmapA;
            SettingGroups settingGroup;
            UserSearchSettings userSearchSettings;
            this.icoSet.clear();
            this.icoList.clear();
            this.icoSet.add(Integer.valueOf((int) ((Math.random() * ((double) (DropDownRadarView.f5256k.size() - 1))) + 0.5d)));
            this.icoSet.add(Integer.valueOf((int) ((Math.random() * ((double) (DropDownRadarView.f5256k.size() - 1))) + 0.5d)));
            this.icoSet.add(Integer.valueOf((int) ((Math.random() * ((double) (DropDownRadarView.f5256k.size() - 1))) + 0.5d)));
            if (this.icoSet.size() < 3) {
                m7950c();
                return;
            }
            HashSet<Integer> hashSet = this.icoSet;
            DropDownRadarView dropDownRadarView = this.f5280l;
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(dropDownRadarView.getResources(), ((Number) DropDownRadarView.f5256k.get(((Number) it.next()).intValue())).intValue());
                this.icoList.add(r13.a(bitmapDecodeResource, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getWidth() / 2));
            }
            Settings settings = CoreModule.f1534c.f3628e0.m21483na().settings;
            LookingFor lookingFor = (settings == null || (settingGroup = settings.getSettingGroup()) == null || (userSearchSettings = settingGroup.search) == null) ? null : userSearchSettings.lookingForGender;
            ArrayList<Bitmap> arrayList = this.icoList;
            int iRandom = (int) ((Math.random() * 2.0d) + 0.5d);
            boolean zEquals = TEnum.equals(LookingFor.get("male"), lookingFor);
            DropDownRadarView dropDownRadarView2 = this.f5280l;
            if (zEquals) {
                Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(dropDownRadarView2.getResources(), ((Number) DropDownRadarView.f5258m.get((int) ((Math.random() * ((double) (DropDownRadarView.f5258m.size() - 1))) + 0.5d))).intValue());
                bitmapA = r13.a(bitmapDecodeResource2, bitmapDecodeResource2.getWidth(), bitmapDecodeResource2.getWidth() / 2);
            } else {
                Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(dropDownRadarView2.getResources(), ((Number) DropDownRadarView.f5257l.get((int) ((Math.random() * ((double) (DropDownRadarView.f5257l.size() - 1))) + 0.5d))).intValue());
                bitmapA = r13.a(bitmapDecodeResource3, bitmapDecodeResource3.getWidth(), bitmapDecodeResource3.getWidth() / 2);
            }
            arrayList.add(iRandom, bitmapA);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quickaudio.view.DropDownRadarView$c */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0017¨\u0006&"}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView$c;", "", "Landroid/graphics/Paint;", "mPaint", "", "mInitAngle", "initProgress", "<init>", "(Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownRadarView;Landroid/graphics/Paint;FF)V", "Landroid/graphics/Canvas;", "canvas", "progress", "radius", "rotateSpeed", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(Landroid/graphics/Canvas;FFFLandroid/graphics/Bitmap;)V", "Landroid/graphics/Paint;", "getMPaint", "()Landroid/graphics/Paint;", "b", "F", "getMInitAngle", "()F", "setMInitAngle", "(F)V", "c", "getInitProgress", "d", "initScale", "Landroid/graphics/RectF;", "e", "Landroid/graphics/RectF;", "rectF", "f", "mAngle", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C0252c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Paint mPaint;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public float mInitAngle;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final float initProgress;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final float initScale;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final RectF rectF;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public float mAngle;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ DropDownRadarView f5287g;

        public C0252c(@NotNull DropDownRadarView dropDownRadarView, Paint paint, float f, float f2) {
            paint.getClass();
            this.f5287g = dropDownRadarView;
            this.mPaint = paint;
            this.mInitAngle = f;
            this.initProgress = f2;
            this.initScale = (((float) Math.random()) * 0.3f) + 0.6f;
            this.rectF = new RectF();
            this.mAngle = (this.mInitAngle - 20.0f) + (40.0f * ((float) Math.random()));
        }

        /* JADX INFO: renamed from: a */
        public final void m7951a(@NotNull Canvas canvas, float progress, float radius, float rotateSpeed, @NotNull Bitmap bitmap) {
            float width;
            float f;
            canvas.getClass();
            bitmap.getClass();
            if (this.f5287g.isNormalMode) {
                if (progress == 0.0f) {
                    this.mAngle = (this.mInitAngle - 20.0f) + (40.0f * ((float) Math.random()));
                }
                this.mPaint.setARGB(this.f5287g.m7944h(progress), 255, 255, 255);
                width = (bitmap.getWidth() / 3) * this.f5287g.m7945i(progress);
                f = ((this.mAngle + (((rotateSpeed * 60.0f) + 90.0f) * progress)) * 3.1415927f) / 180.0f;
            } else {
                this.mPaint.setARGB(this.f5287g.m7944h(this.initProgress), 255, 255, 255);
                width = this.initScale * (bitmap.getWidth() / 3) * this.f5287g.m7945i(this.initProgress);
                f = ((this.mAngle + (progress * 360.0f)) * 3.1415927f) / 180.0f;
            }
            double d = f;
            this.rectF.set(((canvas.getWidth() / 2) + (((float) Math.cos(d)) * radius)) - width, ((canvas.getHeight() / 2) + (((float) Math.sin(d)) * radius)) - width, (canvas.getWidth() / 2) + (((float) Math.cos(d)) * radius) + width, (canvas.getHeight() / 2) + (radius * ((float) Math.sin(d))) + width);
            canvas.drawBitmap(bitmap, (Rect) null, this.rectF, this.mPaint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownRadarView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.interval = 3000.0f;
        this.frequency = 10L;
        this.initialRadius = svq.c(70);
        this.isNormalMode = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f10977m0);
        typedArrayObtainStyledAttributes.getClass();
        boolean z = typedArrayObtainStyledAttributes.getBoolean(e9c0.f10980n0, true);
        this.isNormalMode = z;
        if (z) {
            return;
        }
        this.interval = 2500.0f;
    }

    /* JADX INFO: renamed from: a */
    public static void m7937a(DropDownRadarView dropDownRadarView, long j) {
        C0250a c0250a = dropDownRadarView.circleDraw1;
        C0250a c0250a2 = null;
        if (c0250a == null) {
            Intrinsics.r("circleDraw1");
            c0250a = null;
        }
        c0250a.m7948a();
        C0250a c0250a3 = dropDownRadarView.circleDraw2;
        if (c0250a3 == null) {
            Intrinsics.r("circleDraw2");
        } else {
            c0250a2 = c0250a3;
        }
        c0250a2.m7948a();
        C0250a c0250a4 = dropDownRadarView.circleDraw3;
        if (c0250a4 != null) {
            c0250a4.m7948a();
        }
        dropDownRadarView.invalidate();
    }

    /* JADX INFO: renamed from: h */
    public final int m7944h(float pro) {
        float f;
        if (this.isNormalMode) {
            float f2 = this.interval;
            float f3 = 2000.0f / f2;
            float f4 = 2500.0f / f2;
            if (pro < f3) {
                f = 1.0f - ((f3 - pro) / f3);
            } else {
                f = pro < f4 ? (f4 - pro) / (f4 - f3) : 0.0f;
            }
        } else {
            f = 1.0f - pro;
        }
        return (int) (f * 255.0f);
    }

    /* JADX INFO: renamed from: i */
    public final float m7945i(float progress) {
        if (!this.isNormalMode) {
            return 1.0f;
        }
        float f = 2000.0f / this.interval;
        return ((progress < f ? 1.0f - ((f - progress) / f) : 1.0f) * 0.7f) + 0.3f;
    }

    /* JADX INFO: renamed from: j */
    public final int m7946j(float pro) {
        float f;
        double d;
        if (this.isNormalMode) {
            if (pro < 0.5d) {
                d = pro * 2.0f * 255.0f;
            } else {
                f = (1.0f - pro) * 2.0f;
            }
            return (int) (d * 0.6d);
        }
        f = 1.0f - pro;
        d = f * 255.0f;
        return (int) (d * 0.6d);
    }

    /* JADX INFO: renamed from: k */
    public final float m7947k(float pro, int width) {
        float f = this.initialRadius;
        return f + (((width / 2) - f) * pro);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        C0250a c0250a = this.circleDraw1;
        Choreographer choreographer = null;
        if (c0250a == null) {
            Intrinsics.r("circleDraw1");
            c0250a = null;
        }
        c0250a.m7949b(canvas);
        C0250a c0250a2 = this.circleDraw2;
        if (c0250a2 == null) {
            Intrinsics.r("circleDraw2");
            c0250a2 = null;
        }
        c0250a2.m7949b(canvas);
        C0250a c0250a3 = this.circleDraw3;
        if (c0250a3 != null) {
            c0250a3.m7949b(canvas);
        }
        Choreographer choreographer2 = this.choreographer;
        if (choreographer2 == null) {
            Intrinsics.r("choreographer");
        } else {
            choreographer = choreographer2;
        }
        choreographer.postFrameCallbackDelayed(new Choreographer.FrameCallback() { // from class: l.mde
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                DropDownRadarView.m7937a(this.f16927a, j);
            }
        }, this.frequency);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Choreographer choreographer = Choreographer.getInstance();
        choreographer.getClass();
        this.choreographer = choreographer;
        Paint paint = new Paint();
        this.circlePaint = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.circlePaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.r("circlePaint");
            paint2 = null;
        }
        paint2.setDither(true);
        Paint paint4 = this.circlePaint;
        if (paint4 == null) {
            Intrinsics.r("circlePaint");
            paint4 = null;
        }
        Paint.Style style = Paint.Style.STROKE;
        paint4.setStyle(style);
        Paint paint5 = this.circlePaint;
        if (paint5 == null) {
            Intrinsics.r("circlePaint");
            paint5 = null;
        }
        Paint.Cap cap = Paint.Cap.ROUND;
        paint5.setStrokeCap(cap);
        Paint paint6 = this.circlePaint;
        if (paint6 == null) {
            Intrinsics.r("circlePaint");
            paint6 = null;
        }
        paint6.setStrokeWidth(t100.d);
        Paint paint7 = new Paint();
        this.bitmapPaint = paint7;
        paint7.setAntiAlias(true);
        Paint paint8 = this.bitmapPaint;
        if (paint8 == null) {
            Intrinsics.r("bitmapPaint");
            paint8 = null;
        }
        paint8.setDither(true);
        Paint paint9 = this.bitmapPaint;
        if (paint9 == null) {
            Intrinsics.r("bitmapPaint");
            paint9 = null;
        }
        paint9.setStyle(style);
        Paint paint10 = this.bitmapPaint;
        if (paint10 == null) {
            Intrinsics.r("bitmapPaint");
            paint10 = null;
        }
        paint10.setStrokeCap(cap);
        Paint paint11 = this.circlePaint;
        if (paint11 == null) {
            Intrinsics.r("circlePaint");
            paint11 = null;
        }
        Paint paint12 = this.bitmapPaint;
        if (paint12 == null) {
            Intrinsics.r("bitmapPaint");
            paint12 = null;
        }
        this.circleDraw1 = new C0250a(this, paint11, paint12, this.isNormalMode ? 0.0f : 0.2f);
        Paint paint13 = this.circlePaint;
        if (paint13 == null) {
            Intrinsics.r("circlePaint");
            paint13 = null;
        }
        Paint paint14 = this.bitmapPaint;
        if (paint14 == null) {
            Intrinsics.r("bitmapPaint");
            paint14 = null;
        }
        this.circleDraw2 = new C0250a(this, paint13, paint14, 0.5f);
        if (this.isNormalMode) {
            return;
        }
        Paint paint15 = this.circlePaint;
        if (paint15 == null) {
            Intrinsics.r("circlePaint");
            paint15 = null;
        }
        Paint paint16 = this.bitmapPaint;
        if (paint16 == null) {
            Intrinsics.r("bitmapPaint");
        } else {
            paint3 = paint16;
        }
        this.circleDraw3 = new C0250a(this, paint15, paint3, 0.8f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownRadarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownRadarView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DropDownRadarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
