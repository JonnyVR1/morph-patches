package p153l;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import org.checkerframework.dataflow.qual.Pure;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class j2v0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public CharSequence f118101a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bitmap f118102b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Layout.Alignment f118103c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Layout.Alignment f118104d;

    /* JADX INFO: renamed from: e */
    public float f118105e;

    /* JADX INFO: renamed from: f */
    public int f118106f;

    /* JADX INFO: renamed from: g */
    public int f118107g;

    /* JADX INFO: renamed from: h */
    public float f118108h;

    /* JADX INFO: renamed from: i */
    public int f118109i;

    /* JADX INFO: renamed from: j */
    public int f118110j;

    /* JADX INFO: renamed from: k */
    public float f118111k;

    /* JADX INFO: renamed from: l */
    public float f118112l;

    /* JADX INFO: renamed from: m */
    public float f118113m;

    /* JADX INFO: renamed from: n */
    public int f118114n;

    /* JADX INFO: renamed from: o */
    public float f118115o;

    public /* synthetic */ j2v0(u4v0 u4v0Var, b0v0 b0v0Var) {
        this.f118101a = u4v0Var.f177531a;
        this.f118102b = u4v0Var.f177534d;
        this.f118103c = u4v0Var.f177532b;
        this.f118104d = u4v0Var.f177533c;
        this.f118105e = u4v0Var.f177535e;
        this.f118106f = u4v0Var.f177536f;
        this.f118107g = u4v0Var.f177537g;
        this.f118108h = u4v0Var.f177538h;
        this.f118109i = u4v0Var.f177539i;
        this.f118110j = u4v0Var.f177542l;
        this.f118111k = u4v0Var.f177543m;
        this.f118112l = u4v0Var.f177540j;
        this.f118113m = u4v0Var.f177541k;
        this.f118114n = u4v0Var.f177544n;
        this.f118115o = u4v0Var.f177545o;
    }

    @Pure
    /* JADX INFO: renamed from: a */
    public final int m143266a() {
        return this.f118107g;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public final int m143267b() {
        return this.f118109i;
    }

    /* JADX INFO: renamed from: c */
    public final j2v0 m143268c(Bitmap bitmap) {
        this.f118102b = bitmap;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final j2v0 m143269d(float f) {
        this.f118113m = f;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final j2v0 m143270e(float f, int i) {
        this.f118105e = f;
        this.f118106f = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final j2v0 m143271f(int i) {
        this.f118107g = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final j2v0 m143272g(@Nullable Layout.Alignment alignment) {
        this.f118104d = alignment;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final j2v0 m143273h(float f) {
        this.f118108h = f;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final j2v0 m143274i(int i) {
        this.f118109i = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final j2v0 m143275j(float f) {
        this.f118115o = f;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final j2v0 m143276k(float f) {
        this.f118112l = f;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final j2v0 m143277l(CharSequence charSequence) {
        this.f118101a = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final j2v0 m143278m(@Nullable Layout.Alignment alignment) {
        this.f118103c = alignment;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final j2v0 m143279n(float f, int i) {
        this.f118111k = f;
        this.f118110j = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final j2v0 m143280o(int i) {
        this.f118114n = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final u4v0 m143281p() {
        return new u4v0(this.f118101a, this.f118103c, this.f118104d, this.f118102b, this.f118105e, this.f118106f, this.f118107g, this.f118108h, this.f118109i, this.f118110j, this.f118111k, this.f118112l, this.f118113m, false, RoundedDrawable.DEFAULT_BORDER_COLOR, this.f118114n, this.f118115o, null);
    }

    @Nullable
    @Pure
    /* JADX INFO: renamed from: q */
    public final CharSequence m143282q() {
        return this.f118101a;
    }

    public j2v0() {
        this.f118101a = null;
        this.f118102b = null;
        this.f118103c = null;
        this.f118104d = null;
        this.f118105e = -3.4028235E38f;
        this.f118106f = Integer.MIN_VALUE;
        this.f118107g = Integer.MIN_VALUE;
        this.f118108h = -3.4028235E38f;
        this.f118109i = Integer.MIN_VALUE;
        this.f118110j = Integer.MIN_VALUE;
        this.f118111k = -3.4028235E38f;
        this.f118112l = -3.4028235E38f;
        this.f118113m = -3.4028235E38f;
        this.f118114n = Integer.MIN_VALUE;
    }
}
