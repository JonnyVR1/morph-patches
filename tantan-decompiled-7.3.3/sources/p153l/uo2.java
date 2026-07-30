package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.StickerBundle;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH&¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001b\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u001f\u0010\u0016J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b \u0010\u0016¨\u0006!"}, m88121d2 = {"Ll/uo2;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/app/Activity;", "activity", "", "c", "(Landroidx/fragment/app/Fragment;Landroid/app/Activity;)V", "Landroid/os/Bundle;", StickerBundle.TYPE, "g", "(Landroidx/fragment/app/Fragment;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "e", "(Landroidx/fragment/app/Fragment;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V", "b", "f", "(Landroidx/fragment/app/Fragment;)V", Constants.INAPP_DATA_TAG, BLiveStormDanmakuGiftResourceType.f45292l, RXScreenCaptureService.KEY_INDEX, "a", "h", "n", "outState", "j", "k", "m", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface uo2 {
    /* JADX INFO: renamed from: a */
    void m196958a(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: b */
    void m196959b(@NotNull Fragment fragment, @NotNull Bundle savedInstanceState);

    /* JADX INFO: renamed from: c */
    void m196960c(@NotNull Fragment fragment, @NotNull Activity activity);

    /* JADX INFO: renamed from: d */
    void m196961d(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: e */
    void m196962e(@NotNull Fragment fragment, @NotNull LayoutInflater inflater, @NotNull ViewGroup container, @NotNull Bundle savedInstanceState);

    /* JADX INFO: renamed from: f */
    void m196963f(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: g */
    void m196964g(@NotNull Fragment fragment, @NotNull Bundle bundle);

    /* JADX INFO: renamed from: h */
    void m196965h(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: i */
    void m196966i(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: j */
    void m196967j(@NotNull Fragment fragment, @NotNull Bundle outState);

    /* JADX INFO: renamed from: k */
    void m196968k(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: l */
    void m196969l(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: m */
    void m196970m(@NotNull Fragment fragment);

    /* JADX INFO: renamed from: n */
    void m196971n(@NotNull Fragment fragment);
}
