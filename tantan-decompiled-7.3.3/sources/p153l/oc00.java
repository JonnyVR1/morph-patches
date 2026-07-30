package p153l;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.feed.data.Frame;
import com.p051p1.mobile.putong.live.base.vap.mix.C12631a;
import com.p051p1.mobile.putong.live.base.vap.mix.C12633c;
import com.p051p1.mobile.putong.live.base.vap.mix.C12634d;
import com.p051p1.mobile.putong.live.base.vap.mix.Src;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/oc00;", "", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "mixAnimPlugin", "<init>", "(Lcom/p1/mobile/putong/live/base/vap/mix/a;)V", "Landroid/view/MotionEvent;", "ev", "Lcom/p1/mobile/putong/live/base/vap/mix/c;", "b", "(Landroid/view/MotionEvent;)Lcom/p1/mobile/putong/live/base/vap/mix/c;", "", BaseSei.f14624X, BaseSei.f14625Y, "Ll/mi80;", Frame.TYPE, "", "a", "(IILl/mi80;)Z", "Lcom/p1/mobile/putong/live/base/vap/mix/a;", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class oc00 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C12631a mixAnimPlugin;

    public oc00(@NotNull C12631a c12631a) {
        c12631a.getClass();
        this.mixAnimPlugin = c12631a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m167070a(int x, int y, mi80 frame) {
        return x >= frame.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() && x <= frame.getCom.immomo.momomediaext.sei.BaseSei.X java.lang.String() + frame.getW() && y >= frame.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() && y <= frame.getCom.immomo.momomediaext.sei.BaseSei.Y java.lang.String() + frame.getH();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final C12633c m167071b(@NotNull MotionEvent ev) {
        HashMap<String, Src> mapM69886a;
        Src src;
        SparseArray<v7j> sparseArrayM138824a;
        v7j v7jVar;
        ev.getClass();
        Pair<Integer, Integer> realSize = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getAnimView().getRealSize();
        int iIntValue = realSize.component1().intValue();
        int iIntValue2 = realSize.component2().intValue();
        jo0 jo0Var = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        if (jo0Var != null) {
            int width = jo0Var.getWidth();
            jo0 jo0Var2 = this.mixAnimPlugin.getCom.p1.mobile.putong.core.data.GameIdentity.player java.lang.String().getConfigManager().getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
            if (jo0Var2 != null) {
                int height = jo0Var2.getHeight();
                if (iIntValue != 0 && iIntValue2 != 0 && ev.getAction() == 1) {
                    float x = (ev.getX() * width) / iIntValue;
                    float y = (ev.getY() * height) / iIntValue2;
                    i6j frameAll = this.mixAnimPlugin.getFrameAll();
                    ArrayList<e6j> arrayListM200213b = (frameAll == null || (sparseArrayM138824a = frameAll.m138824a()) == null || (v7jVar = sparseArrayM138824a.get(this.mixAnimPlugin.getCurFrameIndex())) == null) ? null : v7jVar.m200213b();
                    if (arrayListM200213b != null) {
                        for (e6j e6jVar : arrayListM200213b) {
                            C12634d srcMap = this.mixAnimPlugin.getSrcMap();
                            if (srcMap != null && (mapM69886a = srcMap.m69886a()) != null && (src = mapM69886a.get(e6jVar.getSrcId())) != null && m167070a((int) x, (int) y, e6jVar.getFrame())) {
                                C12633c c12633c = new C12633c(src);
                                c12633c.m69885b(e6jVar.getFrame());
                                return c12633c;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
