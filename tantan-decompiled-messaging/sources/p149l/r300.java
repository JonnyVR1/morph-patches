package p149l;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.feed.data.Frame;
import com.p046p1.mobile.putong.live.base.vap.mix.C12468a;
import com.p046p1.mobile.putong.live.base.vap.mix.C12470c;
import com.p046p1.mobile.putong.live.base.vap.mix.C12471d;
import com.p046p1.mobile.putong.live.base.vap.mix.Src;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m87232d2 = {"Ll/r300;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "<init>", "(Lcom/p1/mobile/putong/live/base/vap/mix/a;)V", "Landroid/view/MotionEvent;", "ev", "Lcom/p1/mobile/putong/live/base/vap/mix/c;", "b", "(Landroid/view/MotionEvent;)Lcom/p1/mobile/putong/live/base/vap/mix/c;", "", BaseSei.f13930X, BaseSei.f13931Y, "Ll/ga80;", Frame.TYPE, "", "a", "(IILl/ga80;)Z", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class r300 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12468a mixAnimPlugin;

    public r300(@NotNull C12468a c12468a) {
        c12468a.getClass();
        this.mixAnimPlugin = c12468a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m177634a(int x, int y, ga80 frame) {
        return x >= frame.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() && x <= frame.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + frame.getW() && y >= frame.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() && y <= frame.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + frame.getH();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C12470c m177635b(@NotNull MotionEvent ev) {
        HashMap<String, Src> mapM68703a;
        Src src;
        SparseArray<a5j> sparseArrayM157759a;
        a5j a5jVar;
        ev.getClass();
        Pair<Integer, Integer> realSize = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getAnimView().getRealSize();
        int iIntValue = realSize.component1().intValue();
        int iIntValue2 = realSize.component2().intValue();
        no0 no0Var = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (no0Var != null) {
            int width = no0Var.getWidth();
            no0 no0Var2 = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
            if (no0Var2 != null) {
                int height = no0Var2.getHeight();
                if (iIntValue != 0 && iIntValue2 != 0 && ev.getAction() == 1) {
                    float x = (ev.getX() * width) / iIntValue;
                    float y = (ev.getY() * height) / iIntValue2;
                    n3j frameAll = this.mixAnimPlugin.getFrameAll();
                    ArrayList<j3j> arrayListM95044b = (frameAll == null || (sparseArrayM157759a = frameAll.m157759a()) == null || (a5jVar = sparseArrayM157759a.get(this.mixAnimPlugin.getCurFrameIndex())) == null) ? null : a5jVar.m95044b();
                    if (arrayListM95044b != null) {
                        for (j3j j3jVar : arrayListM95044b) {
                            C12471d srcMap = this.mixAnimPlugin.getSrcMap();
                            if (srcMap != null && (mapM68703a = srcMap.m68703a()) != null && (src = mapM68703a.get(j3jVar.getSrcId())) != null && m177634a((int) x, (int) y, j3jVar.getFrame())) {
                                C12470c c12470c = new C12470c(src);
                                c12470c.m68702b(j3jVar.getFrame());
                                return c12470c;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
