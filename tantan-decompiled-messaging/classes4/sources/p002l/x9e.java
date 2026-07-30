package p002l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import l.d30;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x9e extends wg2<RelativeLayout> implements pol {

    /* JADX INFO: renamed from: d */
    public RelativeLayout f22175d;

    /* JADX INFO: renamed from: e */
    public VText f22176e;

    /* JADX INFO: renamed from: f */
    public VText f22177f;

    /* JADX INFO: renamed from: g */
    public TextView f22178g;

    /* JADX INFO: renamed from: h */
    public o7s f22179h;

    public x9e(LiveMessage liveMessage, nol nolVar) {
        super(liveMessage, nolVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m25785O() {
        m25790S(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public /* synthetic */ void m25786P(View view) {
        this.f22179h.m19272b(new d30() { // from class: l.w9e
            public final void call() {
                this.f21572a.m25785O();
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m25787N(LiveMessage liveMessage, View view) {
        this.f22179h.m19273c(liveMessage.getDragonSchema());
    }

    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void m25792u(RelativeLayout relativeLayout) {
        super.u(relativeLayout);
        this.f22175d = relativeLayout;
        this.f22176e = relativeLayout.findViewById(g5c0.f10912N6);
        this.f22177f = relativeLayout.findViewById(g5c0.f10977V);
        this.f22178g = (TextView) relativeLayout.findViewById(g5c0.f10816D0);
        if (vwb.J(this.f21724a.spanList)) {
            return;
        }
        nol nolVar = this.f21725b;
        LiveMessage liveMessage = this.f21724a;
        m25789R(nolVar, liveMessage, liveMessage.spanList.get(0));
    }

    /* JADX INFO: renamed from: R */
    public void m25789R(nol nolVar, final LiveMessage liveMessage, SpannableStringBuilder spannableStringBuilder) {
        if (liveMessage == null) {
            return;
        }
        this.f22179h = nolVar.getLiveDragonListViewHelper();
        this.f22176e.setText(liveMessage.getDragonTitle());
        boolean zM19274d = this.f22179h.m19274d();
        m25790S(zM19274d);
        xdl0.E0(this.f22175d, new View.OnClickListener() { // from class: l.u9e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20550a.m25787N(liveMessage, view);
            }
        });
        VText vText = this.f22177f;
        if (zM19274d) {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.v9e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21042a.m25786P(view);
                }
            });
        } else {
            xdl0.E0(vText, (View.OnClickListener) null);
        }
        ex4.m12831y(spannableStringBuilder, this.f22178g, nolVar, t100.o);
        this.f22178g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: S */
    public final void m25790S(boolean z) {
        VText vText = this.f22177f;
        if (z) {
            vText.setText("关闭推送");
            this.f22177f.setBackgroundResource(i3c0.f12784f1);
            this.f22177f.setTextColor(Color.parseColor("#FFFFFF"));
        } else {
            vText.setText("推送已关闭");
            this.f22177f.setBackgroundResource(0);
            this.f22177f.setTextColor(Color.parseColor("#66FFFFFF"));
        }
    }

    /* JADX INFO: renamed from: o */
    public int m25791o() {
        return t6c0.f19659R;
    }

    @Override // p002l.pol
    /* JADX INFO: renamed from: M */
    public void mo5986M() {
    }
}
