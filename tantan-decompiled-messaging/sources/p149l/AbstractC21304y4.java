package p149l;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: renamed from: l.y4 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eH&¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\n\u0010#\u001a\u00020\"\"\u00020\u0010¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m87232d2 = {"Ll/y4;", "", "Ll/e0h0;", "viewModel", "<init>", "(Ll/e0h0;)V", "", "f", "()V", "h", "g", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", "", MatchFrom.selected, "", "c", "(Z)I", "clickable", "a", "Lv/VDraweeView;", "maskView", "j", "(Lv/VDraweeView;)V", "Lv/VImage;", "borderView", "k", "(Lv/VImage;)V", "", Constants.INAPP_DATA_TAG, "()Ljava/lang/String;", "Landroid/widget/TextView;", "textView", "", "numbers", RXScreenCaptureService.KEY_INDEX, "(Landroid/widget/TextView;[I)V", "Ll/e0h0;", "e", "()Ll/e0h0;", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractC21304y4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final e0h0 viewModel;

    public AbstractC21304y4(@NotNull e0h0 e0h0Var) {
        e0h0Var.getClass();
        this.viewModel = e0h0Var;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo152584a(boolean clickable);

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Drawable mo152585b();

    /* JADX INFO: renamed from: c */
    public abstract int mo152586c(boolean selected);

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract String mo152587d();

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final e0h0 getViewModel() {
        return this.viewModel;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo152588f();

    /* JADX INFO: renamed from: g */
    public abstract void mo152589g();

    /* JADX INFO: renamed from: h */
    public abstract void mo152590h();

    /* JADX INFO: renamed from: i */
    public final void m212874i(@NotNull TextView textView, @NotNull int... numbers) {
        textView.getClass();
        numbers.getClass();
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().getTextSize() * textView.getText().length(), 0.0f, CollectionsKt.toIntArray(ArraysKt.asList(numbers)), (float[]) null, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo152591j(@NotNull VDraweeView maskView);

    /* JADX INFO: renamed from: k */
    public abstract void mo152592k(@NotNull VImage borderView);
}
