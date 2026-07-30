package p149l;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.annotation.Nullable;
import org.checkerframework.dataflow.qual.Pure;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes6.dex */
public final class dtu0 {

    /* JADX INFO: renamed from: a */
    @Nullable
    public CharSequence f87881a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public Bitmap f87882b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Layout.Alignment f87883c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Layout.Alignment f87884d;

    /* JADX INFO: renamed from: e */
    public float f87885e;

    /* JADX INFO: renamed from: f */
    public int f87886f;

    /* JADX INFO: renamed from: g */
    public int f87887g;

    /* JADX INFO: renamed from: h */
    public float f87888h;

    /* JADX INFO: renamed from: i */
    public int f87889i;

    /* JADX INFO: renamed from: j */
    public int f87890j;

    /* JADX INFO: renamed from: k */
    public float f87891k;

    /* JADX INFO: renamed from: l */
    public float f87892l;

    /* JADX INFO: renamed from: m */
    public float f87893m;

    /* JADX INFO: renamed from: n */
    public int f87894n;

    /* JADX INFO: renamed from: o */
    public float f87895o;

    public /* synthetic */ dtu0(ovu0 ovu0Var, vqu0 vqu0Var) {
        this.f87881a = ovu0Var.f145874a;
        this.f87882b = ovu0Var.f145877d;
        this.f87883c = ovu0Var.f145875b;
        this.f87884d = ovu0Var.f145876c;
        this.f87885e = ovu0Var.f145878e;
        this.f87886f = ovu0Var.f145879f;
        this.f87887g = ovu0Var.f145880g;
        this.f87888h = ovu0Var.f145881h;
        this.f87889i = ovu0Var.f145882i;
        this.f87890j = ovu0Var.f145885l;
        this.f87891k = ovu0Var.f145886m;
        this.f87892l = ovu0Var.f145883j;
        this.f87893m = ovu0Var.f145884k;
        this.f87894n = ovu0Var.f145887n;
        this.f87895o = ovu0Var.f145888o;
    }

    @Pure
    /* JADX INFO: renamed from: a */
    public final int m113583a() {
        return this.f87887g;
    }

    @Pure
    /* JADX INFO: renamed from: b */
    public final int m113584b() {
        return this.f87889i;
    }

    /* JADX INFO: renamed from: c */
    public final dtu0 m113585c(Bitmap bitmap) {
        this.f87882b = bitmap;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final dtu0 m113586d(float f) {
        this.f87893m = f;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final dtu0 m113587e(float f, int i) {
        this.f87885e = f;
        this.f87886f = i;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final dtu0 m113588f(int i) {
        this.f87887g = i;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final dtu0 m113589g(@Nullable Layout.Alignment alignment) {
        this.f87884d = alignment;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final dtu0 m113590h(float f) {
        this.f87888h = f;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final dtu0 m113591i(int i) {
        this.f87889i = i;
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final dtu0 m113592j(float f) {
        this.f87895o = f;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final dtu0 m113593k(float f) {
        this.f87892l = f;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final dtu0 m113594l(CharSequence charSequence) {
        this.f87881a = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public final dtu0 m113595m(@Nullable Layout.Alignment alignment) {
        this.f87883c = alignment;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final dtu0 m113596n(float f, int i) {
        this.f87891k = f;
        this.f87890j = i;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final dtu0 m113597o(int i) {
        this.f87894n = i;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final ovu0 m113598p() {
        return new ovu0(this.f87881a, this.f87883c, this.f87884d, this.f87882b, this.f87885e, this.f87886f, this.f87887g, this.f87888h, this.f87889i, this.f87890j, this.f87891k, this.f87892l, this.f87893m, false, RoundedDrawable.DEFAULT_BORDER_COLOR, this.f87894n, this.f87895o, null);
    }

    @Nullable
    @Pure
    /* JADX INFO: renamed from: q */
    public final CharSequence m113599q() {
        return this.f87881a;
    }

    public dtu0() {
        this.f87881a = null;
        this.f87882b = null;
        this.f87883c = null;
        this.f87884d = null;
        this.f87885e = -3.4028235E38f;
        this.f87886f = Integer.MIN_VALUE;
        this.f87887g = Integer.MIN_VALUE;
        this.f87888h = -3.4028235E38f;
        this.f87889i = Integer.MIN_VALUE;
        this.f87890j = Integer.MIN_VALUE;
        this.f87891k = -3.4028235E38f;
        this.f87892l = -3.4028235E38f;
        this.f87893m = -3.4028235E38f;
        this.f87894n = Integer.MIN_VALUE;
    }
}
