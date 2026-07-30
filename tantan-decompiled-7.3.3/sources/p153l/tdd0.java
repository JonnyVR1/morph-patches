package p153l;

import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/tdd0;", "Ll/z7t;", "Ll/ydd0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "<init>", "()V", "data", "", "w", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class tdd0 extends z7t<ydd0<?>, BLiveMultiCallAnnouncement> {
    /* JADX INFO: renamed from: v */
    public static Unit m190620v(tdd0 tdd0Var, View view) {
        view.getClass();
        tdd0Var.mo72910j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public void m190621w(@NotNull BLiveMultiCallAnnouncement data) {
        data.getClass();
        super.m72915q(data);
        this.f203264f.setText(data.content);
        TextView textView = this.f203265g;
        textView.getClass();
        czq.m113347c(textView, new Function1() { // from class: l.sdd0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return tdd0.m190620v(this.f167398a, (View) obj);
            }
        });
    }
}
