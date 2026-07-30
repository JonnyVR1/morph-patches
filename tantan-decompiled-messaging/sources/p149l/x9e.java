package p149l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class x9e extends wg2<RelativeLayout> implements pol {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f191612d;

    /* JADX INFO: renamed from: e */
    public VText f191613e;

    /* JADX INFO: renamed from: f */
    public VText f191614f;

    /* JADX INFO: renamed from: g */
    public TextView f191615g;

    /* JADX INFO: renamed from: h */
    public o7s f191616h;

    public x9e(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m207491O() {
        m207496S(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m207492P(View view) {
        this.f191616h.m163043b(new d30() { // from class: l.w9e
            @Override // p149l.d30
            public final void call() {
                this.f185342a.m207491O();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m207493N(LiveMessage liveMessage, View view) {
        this.f191616h.m163044c(liveMessage.getDragonSchema());
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo70566u(RelativeLayout relativeLayout) {
        super.mo70566u(relativeLayout);
        this.f191612d = relativeLayout;
        this.f191613e = (VText) relativeLayout.findViewById(g5c0.f100762N6);
        this.f191614f = (VText) relativeLayout.findViewById(g5c0.f100827V);
        this.f191615g = (TextView) relativeLayout.findViewById(g5c0.f100666D0);
        if (vwb.m200296J(this.f186132a.spanList)) {
            return;
        }
        nol nolVar = this.f186133b;
        LiveMessage liveMessage = this.f186132a;
        m207495R(nolVar, liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: R */
    public void m207495R(nol nolVar, final LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f191616h = nolVar.getLiveDragonListViewHelper();
        this.f191613e.setText(liveMessage.getDragonTitle());
        boolean zM163045d = this.f191616h.m163045d();
        m207496S(zM163045d);
        xdl0.m208329E0(this.f191612d, new View.OnClickListener() { // from class: l.u9e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175254a.m207493N(liveMessage, view);
            }
        });
        VText vText = this.f191614f;
        if (zM163045d) {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.v9e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180632a.m207492P(view);
                }
            });
        } else {
            xdl0.m208329E0(vText, null);
        }
        ex4.m118574y(spannableStringBuilder, this.f191615g, nolVar, t100.f167266o);
        this.f191615g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m207496S(boolean z) {
        VText vText = this.f191614f;
        if (z) {
            vText.setText("关闭推送");
            this.f191614f.setBackgroundResource(i3c0.f110999f1);
            this.f191614f.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            vText.setText("推送已关闭");
            this.f191614f.setBackgroundResource(0);
            this.f191614f.setTextColor(Color.parseColor("#66FFFFFF"));
        }
    }

    @Override // p149l.d1q
    /* JADX INFO: renamed from: o */
    public int mo70565o() {
        return t6c0.f168163R;
    }

    @Override // p149l.pol
    /* JADX INFO: renamed from: M */
    public void mo72494M() {
    }
}
