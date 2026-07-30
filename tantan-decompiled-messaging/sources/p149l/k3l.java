package p149l;

import android.content.Context;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/k3l;", "", "<init>", "()V", "Landroid/content/Context;", "content", "Lcom/tantan/library/svga/SVGAnimationView;", "svgaAnimaton", "", "buttonStyleType", "", "isSlowly", "", "a", "(Landroid/content/Context;Lcom/tantan/library/svga/SVGAnimationView;Ljava/lang/String;Z)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class k3l {

    @NotNull
    public static final k3l INSTANCE = new k3l();

    /* JADX INFO: renamed from: a */
    public final void m144411a(@NotNull Context content, @NotNull SVGAnimationView svgaAnimaton, @NotNull String buttonStyleType, boolean isSlowly) {
        String str;
        content.getClass();
        svgaAnimaton.getClass();
        buttonStyleType.getClass();
        if (Intrinsics.m87488d(buttonStyleType, "oDiamond")) {
            str = isSlowly ? "https://auto.tancdn.com/v1/raw/d8ca1b08-eb07-467e-9084-f8649aeaa1d814.pdf" : "https://auto.tancdn.com/v1/raw/882ec896-df41-439c-a0af-1e10180e7d8414.pdf";
        } else {
            str = isSlowly ? "https://auto.tancdn.com/v1/raw/02f79ff2-ea08-4696-9df5-d227b6fa4f2d12.pdf" : "https://auto.tancdn.com/v1/raw/9a957b00-c134-4bf0-8dfd-1cdff0f4ec7513.pdf";
        }
        SVGALoader.with(content).from(str).autoPlay(true).repeatCount(-1).into(svgaAnimaton);
    }
}
