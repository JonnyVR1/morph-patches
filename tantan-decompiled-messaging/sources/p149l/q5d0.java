package p149l;

import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCallAnnouncement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/q5d0;", "Ll/y5t;", "Ll/v5d0;", "Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;", "<init>", "()V", "data", "", "w", "(Lcom/p1/mobile/putong/live/base/data/BLiveMultiCallAnnouncement;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q5d0 extends y5t<v5d0<?>, BLiveMultiCallAnnouncement> {
    /* JADX INFO: renamed from: v */
    public static Unit m172999v(q5d0 q5d0Var, View view) {
        view.getClass();
        q5d0Var.mo71727j();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public void m173000w(@NotNull BLiveMultiCallAnnouncement data) {
        data.getClass();
        super.m71732q(data);
        this.f196479f.setText(data.content);
        TextView textView = this.f196480g;
        textView.getClass();
        cxq.m109105c(textView, new Function1() { // from class: l.p5d0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q5d0.m172999v(this.f147287a, (View) obj);
            }
        });
    }
}
